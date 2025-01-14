# Build Alaya in a stock Go builder container
FROM golang:1.15-alpine as builder

RUN apk add --no-cache make gcc musl-dev linux-headers g++ llvm bash cmake git gmp-dev openssl-dev

RUN git clone https://github.com/dfinity/bn.git
RUN cd bn && make && make install

ADD . /Alaya-Go
RUN cd /Alaya-Go && make clean && make alaya

# Pull Alaya into a second stage deploy alpine container
FROM alpine:latest

RUN apk add --no-cache ca-certificates libstdc++ bash tzdata gmp-dev
COPY --from=builder /Alaya-Go/build/bin/alaya /usr/local/bin/
COPY --from=builder /Alaya-Go/entrypoint.sh /usr/local/bin/
COPY --from=builder /usr/local/lib/libbls384.so /usr/local/lib/
COPY --from=builder /usr/local/lib/libmcl.so /usr/local/lib/
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

ENV ENABLE_DEBUG=false
ENV ENABLE_PPROF=false
ENV ENABLE_WS=false
ENV WSAPI=
ENV ENABLE_RPC=false
ENV RPCAPI=
ENV BOOTNODES=
ENV NEW_ACCOUNT=false
ENV INIT=false
ENV VERBOSITY=3
ENV ENBALE_DISCOVER=false
ENV ENABLE_V5DISC=false
ENV ENABLE_CBFT_TRACING=false
ENV P2PPORT=16789
ENV WSPORT=6080
ENV RPCPORT=6789
ENV PPROFPORT=6060
ENV MAXPEERS=43
ENV MAXCONSENSUSPEERS=100
ENV ENABLE_LIGHT_SRV=false
ENV SYNCMODE=full

VOLUME /data/alaya
EXPOSE 6060 6080 6789 16789 16789/udp
ENTRYPOINT ["alaya"]
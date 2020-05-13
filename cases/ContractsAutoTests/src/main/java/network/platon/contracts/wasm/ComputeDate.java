package network.platon.contracts.wasm;

import com.platon.rlp.datatypes.Int32;
import java.math.BigInteger;
import java.util.Arrays;
import org.web3j.abi.WasmFunctionEncoder;
import org.web3j.abi.datatypes.WasmFunction;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.WasmContract;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://github.com/PlatONnetwork/client-sdk-java/releases">platon-web3j command line tools</a>,
 * or the org.web3j.codegen.WasmFunctionWrapperGenerator in the 
 * <a href="https://github.com/PlatONnetwork/client-sdk-java/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with platon-web3j version 0.9.1.2-SNAPSHOT.
 */
public class ComputeDate extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000013a0b60017f0060017f017f60027f7f0060000060037f7f7f0060047f7f7f7f0060027f7f017f60037f7f7f017f60027f7e006000017f60017f017e025d0403656e760c706c61746f6e5f70616e6963000303656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000903656e7610706c61746f6e5f6765745f696e707574000003656e760d706c61746f6e5f72657475726e0002032a290301000006050a030202020007010403010106040500010300030007010101000506020401020202080405017001030305030100020608017f0141d08a040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300040f5f5f66756e63735f6f6e5f65786974001b06696e766f6b65000b0908010041010b02071e0ace3329100041980810051a4101101c1013101d0b190020004200370200200041086a41003602002000100620000b2201017f03402001410c470440200020016a4100360200200141046a21010c010b0b0b070041980810190bab0101047f230041106b220224002002200041004104100920022802082002410172220320022d00004101711b101a210420021019200220004105410210092002280208200320022d00004101711b101a210020021019200220014100410410092002280208200320022d00004101711b101a210520021019200220014105410210092002280208200320022d00004101711b101a20021019200241106a2400200520046b410c6c20006b6a0b0c00200020012002200310180b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010bd80402087f037e23004180016b220024001004100122011014220210022000200136026c2000200236026820002000290368370308200041e8006a200041106a200041086a411c101f220341001027200041e8006a102302400240200041e8006a1028450d00200028026c450d0020002802682d000041c001490d010b10000b200041306a200041e8006a100c2000280234220141094f044010000b200028023021020340200104402001417f6a210120023100002008420886842108200241016a21020c010b0b024002402008500d00418008100a2008510d01418508100a2008520d00200041306a100521042000413c6a100521054101210220004101360258200020033602682000200041d8006a36026c200041e8006a2004100d200041e8006a2005100d200041d8006a200410162203200041c8006a200510162206100841002101200041003602704200210820004200370368200041e8006a4100100e200041fc006a410036020020004200370274ac22094201862009423f8785220a4280015a0440200a2109034020082009845045044020084238862009420888842109200141016a2101200842088821080c010b0b024020014138490d002001210203402002450d01200141016a2101200241087621020c000b000b200141016a21020b20002802702002490440200041e8006a2002100e0b200041e8006a200a102c2000280274200028027847044010000b2000280268200028026c1003200028027422010440200020013602780b200041e8006a100f200610192003101920051019200410190c010b10000b101b20004180016a24000bd60101047f200110222204200128020422024b04401000200128020421020b20012802002105027f027f41002002450d001a410020052c00002203417f4a0d011a200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a0b21012000027f02402005450440410021030c010b410021032002200149200120046a20024b720d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000baf0301067f230041306b2202240020022000280200200028020428020010270240024002402002280204044020022802002d000041c001490d010b200241186a10051a0c010b200241286a2002100c2002102221030240024002400240200228022822050440200228022c220420034f0d010b41002105200241206a410036020020024200370318410021030c010b200241206a410036020020024200370318200420032003417f461b220341704f0d04200320056a21062003410a4b0d010b200220034101743a0018200241186a41017221040c010b200341106a4170712207101521042002200336021c20022007410172360218200220043602200b034020052006470440200420052d00003a0000200441016a2104200541016a21050c010b0b200441003a00000b024020012d0000410171450440200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d0020012802081a200141003602000b20012002290318370200200141086a200241206a280200360200200241186a1006200241186a101920002802042200200028020041016a360200200241306a24000f0b000b3401017f200028020820014904402001101422022000280200200028020410101a2000100f20002001360208200020023602000b0b080020002802001a0bf80801067f0340200020046a2105200120046a220341037145200220044672450440200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220845044003402006411049450440200020046a2202200120046a2203290200370200200241086a200341086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2202200120046a2201290200370200200141086a2103200241086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002008417f6a220841024b0d00024002400240024002400240200841016b0e020102000b2005200120046a220628020022033a0000200541016a200641016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2202200120046a220541046a2802002207410874200341187672360200200241046a200541086a2802002203410874200741187672360200200241086a2005410c6a28020022074108742003411876723602002002410c6a200541106a2802002203410874200741187672360200200441106a2104200641706a21060c000b000b2005200120046a220628020022033a0000200541016a200641016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2202200120046a220541046a2802002207411074200341107672360200200241046a200541086a2802002203411074200741107672360200200241086a2005410c6a28020022074110742003411076723602002002410c6a200541106a2802002203411074200741107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022033a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2202200120046a220541046a2802002207411874200341087672360200200241046a200541086a2802002203411874200741087672360200200241086a2005410c6a28020022074118742003410876723602002002410c6a200541106a2802002203411874200741087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000bc90201037f200041003a000020004184026a2201417f6a41003a0000200041003a0002200041003a00012001417d6a41003a00002001417e6a41003a0000200041003a00032001417c6a41003a00002000410020006b41037122026a22014100360200200141840220026b417c7122036a2202417c6a4100360200024020034109490d002001410036020820014100360204200241786a4100360200200241746a410036020020034119490d002001410036021820014100360214200141003602102001410036020c200241706a41003602002002416c6a4100360200200241686a4100360200200241646a41003602002003200141047141187222036b2102200120036a2101034020024120490d0120014200370300200141186a4200370300200141106a4200370300200141086a4200370300200141206a2101200241606a21020c000b000b20000b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210101a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2104200020036a2205410371450440200220036b210241002103034020024104490d04200320056a200320046a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200520042d00003a0000200341016a21030c000b000b024020030d002001417f6a21030340200020026a22044103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042004417f6a200220036a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320046a2101200320056a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b3501017f230041106b220041d08a0436020c41c00a200028020c41076a417871220036020041c40a200036020041c80a3f003602000b970101047f230041106b220124002001200036020c2000047f41c80a200041086a2202411076220041c80a2802006a220336020041c40a200241c40a28020022026a41076a417871220436020002400240200341107420044d044041c80a200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20022001410c6a4104101041086a0541000b200141106a24000b0b002000410120001b10140b4d01017f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b200020012802082001280204101720000b6101027f027f02402002410b4f0440200241106a4170712204101521032000200236020420002004410172360200200020033602080c010b200020024101743a0000200041016a22032002450d011a0b20032001200210100b20026a41003a00000b4d01017f20004200370200200041086a410036020020002001280208200141016a20012d0000220041017122041b20026a2001280204200041017620041b20026b2200200320002003491b10170b130020002d0000410171044020002802081a0b0b8f0101037f034020002c0000220241776a200041016a2201210020024120460d00200121004105490d000b41002103024002400240200241556a220041024b0d00200041016b0e020001020b2001417f6a21010c010b410121030b41002100034020012c000041506a220241094b450440200141016a21012000410a6c20026b21000c010b0b2000410020006b20031b0b880101037f41a408410136020041a8082802002100034020000440034041ac0841ac082802002201417f6a2202360200200141014845044041a4084100360200200020024102746a22004184016a280200200041046a28020011000041a408410136020041a80828020021000c010b0b41ac08412036020041a808200028020022003602000c010b0b0b940101027f41a408410136020041a808280200220145044041a80841b00836020041b00821010b024041ac082802002202412046044041840210142201450d0120011011220141a80828020036020041a808200136020041ac084100360200410021020b41ac08200241016a360200200120024102746a22014184016a4100360200200141046a20003602000b41a40841003602000b3801017f41b40a420037020041bc0a410036020041742100034020000440200041c00a6a4100360200200041046a21000c010b0b4102101c0b070041b40a10190b750020004200370210200042ffffffff0f3702082000200129020037020002402002410871450d002000102020012802044f0d002002410471044010000c010b200042003702000b02402002411071450d002000102020012802044d0d0020024104710440100020000f0b200042003702000b20000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f20001021200010226a0541010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0bff0201037f200028020445044041000f0b2000102341012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b5a01027f2000027f0240200128020022054504400c010b200220036a200128020422014b2001200249720d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b3c01017f230041306b22022400200220013602142002200036021020022002290310370308200241186a200241086a4114101f1020200241306a24000b2101017f20011022220220012802044b044010000b2000200120011021200210240bd60202077f017e230041206b220324002001280208220420024b0440200341186a2001102620012003280218200328021c102536020c200341106a20011026410021042001027f410020032802102206450d001a410020032802142208200128020c2207490d001a200820072007417f461b210520060b360210200141146a2005360200200141003602080b200141106a210903400240200420024f0d002001280214450d00200341106a2001102641002104027f410020032802102207450d001a410020032802142208200128020c2206490d001a200820066b2104200620076a0b21052001200436021420012005360210200341106a20094100200520041025102420012003290310220a3702102001200128020c200a422088a76a36020c2001200128020841016a22043602080c010b0b20032009290200220a3703082003200a370300200020034114101f1a200341206a24000b980101037f200028020445044041000f0b20001023200028020022022c0000220141004e044020014100470f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200028020441014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a2000280204200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0b0f0020002001102a200020013602040b2f01017f2000280208200149044020011014200028020020002802041010210220002001360208200020023602000b0b3f01027f2000280204220241016a220320002802084b047f20002003102a20002802040520020b20002802006a20013a00002000200028020441016a3602040bbd0402067f037e024020015004402000418001102b0c010b20014280015a044020012108034020082009845045044020094238862008420888842108200241016a2102200942088821090c010b0b0240200241384f04402002210303402003044020034108762103200441016a21040c010b0b200441c9004f044010000b2000200441b77f6a41ff0171102b2000200028020420046a1029200028020420002802006a417f6a21042002210303402003450d02200420033a0000200341087621032004417f6a21040c000b000b200020024180017341ff0171102b0b2000200028020420026a1029200028020420002802006a417f6a210203402001200a84500d02200220013c0000200a42388620014208888421012002417f6a2102200a420888210a0c000b000b20002001a741ff0171102b0b0340024020002802102202200028020c460d00200241786a2802004504401000200028021021020b200241786a22052005280200417f6a220336020020030d002000200536021041002103200028020422072002417c6a28020022066b2204210203402002044020024108762102200341016a21030c010b0b200020074101200341016a20044138491b22056a10292005200028020020066a22026a200220041012200441374d0440200028020020066a200441406a3a00000c020b200341084d0440200028020020066a200341776a3a0000200028020020066a20036a210203402004450d03200220043a0000200441087621042002417f6a21020c000b000510000c020b000b0b0b0b1e01004180080b17696e6974004d6f6e7468734265747765656e3244617465";

    public static String BINARY = BINARY_0;

    public static final String FUNC_MONTHSBETWEEN2DATE = "MonthsBetween2Date";

    protected ComputeDate(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected ComputeDate(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Int32> MonthsBetween2Date(String date1, String date2) {
        final WasmFunction function = new WasmFunction(FUNC_MONTHSBETWEEN2DATE, Arrays.asList(date1,date2), Int32.class);
        return executeRemoteCall(function, Int32.class);
    }

    public static RemoteCall<ComputeDate> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ComputeDate.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ComputeDate> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ComputeDate.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<ComputeDate> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ComputeDate.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<ComputeDate> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(ComputeDate.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static ComputeDate load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new ComputeDate(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static ComputeDate load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new ComputeDate(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}

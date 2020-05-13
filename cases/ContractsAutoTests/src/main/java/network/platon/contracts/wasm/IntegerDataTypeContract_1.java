package network.platon.contracts.wasm;

import com.platon.rlp.datatypes.Int16;
import com.platon.rlp.datatypes.Int32;
import com.platon.rlp.datatypes.Int64;
import com.platon.rlp.datatypes.Uint32;
import com.platon.rlp.datatypes.Uint64;
import com.platon.rlp.datatypes.Uint8;
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
public class IntegerDataTypeContract_1 extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001460d60027f7f0060017f0060017f017f60000060037f7f7f0060027f7e0060037f7e7e0060037f7f7e0060027f7f017f60037f7f7f017f60017f017e60047f7f7f7f006000017f025d0403656e760c706c61746f6e5f70616e6963000303656e760d706c61746f6e5f72657475726e000003656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000c03656e7610706c61746f6e5f6765745f696e707574000103383703050201070a00000202010001030a050000010209020403020208040101000606060301030109020202010b08000402010000000000050405017001050505030100020608017f0141808b040b073904066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300040f5f5f66756e63735f6f6e5f65786974002606696e766f6b650011090a010041010b04080807290a9f4637100041c00810061a41031027101b10280bda0102057f037e230041206b220324002000100622001021200341186a21020340200341106a2001200710242003200329031022082002290300220910252000200329030020017ca74180086a2c000010222001420956200742005220075020082101200921071b0d000b0240200028020420002d00002202410176200241017122021b2204450d0020042000280208200041016a20021b22006a417f6a21020340200020024f0d0120002d00002104200020022d00003a0000200220043a00002002417f6a2102200041016a21000c000b000b200341206a24000b3601017f20004200370200200041086a410036020003402001410c46450440200020016a4100360200200141046a21010c010b0b20000b070041c00810200b08002000200210050b3901027e42a5c688a1c89ca7f94b210103402000300000220250450440200041016a2100200142b383808080207e20028521010c010b0b20010b860301047f230041f0006b220224002001280200210320012802042101200242003703102000200241106a100b41012100200241186a200241086a20014101756a20022903102003110700200241286a100c2101200241e8006a4100360200200241e0006a4200370300200241d8006a420037030020024200370350024002400240200241406b200241186a101e220428020420022d00402203410176200341017122051b220341014d0440200341016b0d032004280208200441016a20051b2c0000417f4c0d010c030b200341374b0d010b200341016a21000c010b2003100d20036a41016a21000b2002200036025020041020200241d0006a410472100e20012000100f2002200241d0006a200241186a101e2200280208200041016a20022d0050220341017122041b36024020022000280204200341017620041b3602442002200229034037030020012002103920001020200128020c200141106a28020047044010000b20012802002001280204100120011010200241186a1020200241f0006a24000b2b01017f230041206b22022400200241086a2000410110322001200241086a1012370300200241206a24000b29002000410036020820004200370200200041001015200041146a41003602002000420037020c20000b1e01017f03402000044020004108762100200141016a21010c010b0b20010bc40201067f200028020422012000280210220341087641fcffff07716a2102027f200120002802082205460440200041146a210441000c010b2001200028021420036a220441087641fcffff07716a280200200441ff07714102746a2106200041146a21042002280200200341ff07714102746a0b21030340024020032006460440200441003602000340200520016b41027522024103490d0220012802001a2000200028020441046a2201360204200028020821050c000b000b200341046a220320022802006b418020470d0120022802042103200241046a21020c010b0b2002417f6a220241014d04402000418004418008200241016b1b3602100b03402001200547044020012802001a200141046a21010c010b0b200028020821012000280204210203402001200247044020002001417c6a22013602080c010b0b20002802001a0b1300200028020820014904402000200110150b0b1c01017f200028020c22010440200041106a20013602000b200010160bb00902047f017e230041f0006b22002400100410022201101c22021003200020013602542000200236025020002000290350370310200041d0006a200041186a200041106a411c102a22014100103202400240200041d0006a10122204500d00418b0810092004510d0141900810092004510440200041386a100c2101200041e8006a4100360200200041e0006a4200370300200041d8006a420037030020004200370350200041d0006a4206101320002802502102200041d0006a410472100e20012002100f20014206103a200128020c200141106a28020047044010000b200128020020012802041001200110100c020b41950810092004510440200041386a100c2101200041e8006a4100360200200041e0006a4200370300200041d8006a420037030020004200370350200041d0006a429003101320002802502102200041d0006a410472100e20012002100f2001429003103a200128020c200141106a28020047044010000b200128020020012802041001200110100c020b419b0810092004510440200041d0006a200141011032200041d0006a102e02400240200041d0006a1033450d002000280254450d0020002802502d000041c001490d010b10000b200041386a200041d0006a1014200028023c220141024f044010000b20002802382102420021040340200104402001417f6a210120022d0000410174ad42fe01832104200241016a21020c010b0b200041386a100c2101200041e8006a4100360200200041e0006a4200370300200041d8006a420037030020004200370350200041d0006a2004101320002802502102200041d0006a410472100e20012002100f20012004103a200128020c200141106a28020047044010000b200128020020012802041001200110100c020b41a20810092004510440200041d0006a200141011032200041d0006a102e02400240200041d0006a1033450d002000280254450d0020002802502d000041c001490d010b10000b200041386a200041d0006a1014200028023c220141054f044010000b200028023821020340200104402001417f6a210120022d00002003410874722103200241016a21020c010b0b200041386a100c2101200041e8006a4100360200200041e0006a4200370300200041d8006a420037030020004200370350200041d0006a2003410174ad2204101320002802502102200041d0006a410472100e20012002100f20012004103a200128020c200141106a28020047044010000b200128020020012802041001200110100c020b41aa0810092004510440200042003703302001200041306a100b20002903302104200041386a100c2101200041e8006a4100360200200041e0006a4200370300200041d8006a420037030020004200370350200041d0006a20044201862204101320002802502102200041d0006a410472100e20012002100f20012004103a200128020c200141106a28020047044010000b200128020020012802041001200110100c020b41b2081009200451044020004100360254200041013602502000200029035037030020012000100a0c020b41b80810092004520d002000410036025420004102360250200020002903503703082001200041086a100a0c010b10000b1026200041f0006a24000b850102027f017e230041106b220124002000102e0240024020001033450d002000280204450d0020002802002d000041c001490d010b10000b200141086a20001014200128020c220041094f044010000b200128020821020340200004402000417f6a210020023100002003420886842103200241016a21020c010b0b200141106a240020030b7502027f017e4101210320014280015a0440034020012004845045044020044238862001420888842101200241016a2102200442088821040c010b0b200241384f047f2002100d20026a0520020b41016a21030b200041186a2802000440200041046a101721000b2000200028020020036a3602000bd60101047f2001102d2204200128020422024b04401000200128020421020b20012802002105027f027f41002002450d001a410020052c00002203417f4a0d011a200341ff0171220141bf014d04404100200341ff017141b801490d011a200141c97e6a0c010b4100200341ff017141f801490d001a200141897e6a0b41016a0b21012000027f02402005450440410021030c010b410021032002200149200120046a20024b720d00410020022004490d011a200120056a2103200220016b20042004417f461b0c010b41000b360204200020033602000b3401017f200028020820014904402001101c22022000280200200028020410181a2000101620002001360208200020023602000b0b080020002802001a0b2e002000280204200028021420002802106a417f6a220041087641fcffff07716a280200200041ff07714102746a0bf80801067f0340200020046a2105200120046a220341037145200220044672450440200520032d00003a0000200441016a21040c010b0b200220046b210602402005410371220845044003402006411049450440200020046a2202200120046a2203290200370200200241086a200341086a290200370200200441106a2104200641706a21060c010b0b027f2006410871450440200120046a2103200020046a0c010b200020046a2202200120046a2201290200370200200141086a2103200241086a0b21042006410471044020042003280200360200200341046a2103200441046a21040b20064102710440200420032f00003b0000200341026a2103200441026a21040b2006410171450d01200420032d00003a000020000f0b024020064120490d002008417f6a220841024b0d00024002400240024002400240200841016b0e020102000b2005200120046a220628020022033a0000200541016a200641016a2f00003b0000200041036a2108200220046b417d6a2106034020064111490d03200420086a2202200120046a220541046a2802002207410874200341187672360200200241046a200541086a2802002203410874200741187672360200200241086a2005410c6a28020022074108742003411876723602002002410c6a200541106a2802002203410874200741187672360200200441106a2104200641706a21060c000b000b2005200120046a220628020022033a0000200541016a200641016a2d00003a0000200041026a2108200220046b417e6a2106034020064112490d03200420086a2202200120046a220541046a2802002207411074200341107672360200200241046a200541086a2802002203411074200741107672360200200241086a2005410c6a28020022074110742003411076723602002002410c6a200541106a2802002203411074200741107672360200200441106a2104200641706a21060c000b000b2005200120046a28020022033a0000200041016a21082004417f7320026a2106034020064113490d03200420086a2202200120046a220541046a2802002207411874200341087672360200200241046a200541086a2802002203411874200741087672360200200241086a2005410c6a28020022074118742003410876723602002002410c6a200541106a2802002203411874200741087672360200200441106a2104200641706a21060c000b000b200120046a41036a2103200020046a41036a21050c020b200120046a41026a2103200020046a41026a21050c010b200120046a41016a2103200020046a41016a21050b20064110710440200520032d00003a00002005200328000136000120052003290005370005200520032f000d3b000d200520032d000f3a000f200541106a2105200341106a21030b2006410871044020052003290000370000200541086a2105200341086a21030b2006410471044020052003280000360000200541046a2105200341046a21030b20064102710440200520032f00003b0000200541026a2105200341026a21030b2006410171450d00200520032d00003a00000b20000bc90201037f200041003a000020004184026a2201417f6a41003a0000200041003a0002200041003a00012001417d6a41003a00002001417e6a41003a0000200041003a00032001417c6a41003a00002000410020006b41037122026a22014100360200200141840220026b417c7122036a2202417c6a4100360200024020034109490d002001410036020820014100360204200241786a4100360200200241746a410036020020034119490d002001410036021820014100360214200141003602102001410036020c200241706a41003602002002416c6a4100360200200241686a4100360200200241646a41003602002003200141047141187222036b2102200120036a2101034020024120490d0120014200370300200141186a4200370300200141106a4200370300200141086a4200370300200141206a2101200241606a21020c000b000b20000b8d0301037f024020002001460d00200120006b20026b410020024101746b4d044020002001200210181a0c010b20002001734103712103027f024020002001490440200020030d021a410021030340200120036a2104200020036a2205410371450440200220036b210241002103034020024104490d04200320056a200320046a280200360200200341046a21032002417c6a21020c000b000b20022003460d04200520042d00003a0000200341016a21030c000b000b024020030d002001417f6a21030340200020026a22044103714504402001417c6a21032000417c6a2104034020024104490d03200220046a200220036a2802003602002002417c6a21020c000b000b2002450d042004417f6a200220036a2d00003a00002002417f6a21020c000b000b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b000b200320046a2101200320056a0b210303402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b000b0b3501017f230041106b220041808b0436020c41e80a200028020c41076a417871220036020041ec0a200036020041f00a3f003602000b970101047f230041106b220124002001200036020c2000047f41f00a200041086a2202411076220041f00a2802006a220336020041ec0a200241ec0a28020022026a41076a417871220436020002400240200341107420044d044041f00a200341016a360200200041016a21000c010b2000450d010b200040000d0010000b20022001410c6a4104101841086a0541000b200141106a24000b0b002000410120001b101c0ba10101037f20004200370200200041086a2202410036020020012d0000410171450440200020012902003702002002200141086a28020036020020000f0b20012802082103024020012802042201410a4d0440200020014101743a0000200041016a21020c010b200141106a4170712204101d21022000200136020420002004410172360200200020023602080b200220032001101f200120026a41003a000020000b10002002044020002001200210181a0b0b130020002d0000410171044020002802081a0b0bf80101067f0240027f20002d0000220241017104402000280204210320002802002202417e71417f6a0c010b20024101762103410a0b220420034128200341284b1b220141106a417071417f6a410a2001410a4b1b2201460d00027f2001410a460440200041016a210420002802080c010b4100200120044d200141016a101d22041b0d0120002d0000220241017104404101210520002802080c010b41012105200041016a0b210620042006027f2002410171044020002802040c010b200241fe01714101760b41016a101f2005044020002004360208200020033602042000200141016a4101723602000f0b200020034101743a00000b0bf40101057f024002400240027f20002d00002202410171220345044020024101762104410a0c010b2000280204210420002802002202417e71417f6a0b22052004460440027f2002410171044020002802080c010b200041016a0b2106416f2103200541e6ffffff074d0440410b20054101742202200541016a220320032002491b220241106a4170712002410b491b21030b2003101d220220062005101f20002002360208200020034101723602000c010b2003450d01200028020821020b2000200441016a3602040c010b2000200441017441026a3a0000200041016a21020b200220046a220041003a0001200020013a00000bbe0202027f047e2000027e2002500440420021022001420a800c010b0240027e200141fd00200279a76b220341c000460d001a2003413f4d0440200241c00020036bad22078620012003ad2206888421052002200688210820012007862107420021060c020b200241800120036bad2206862001200341406aad22058884210720022005882105200120068621060c010b21072002210541c00021030b03402003044020084201862005423f8884220220054201862007423f88842201427f852205420a7c200554ad2002427f8542007c7c423f8722024200837d20012002420a83220554ad7d2108200120057d210520074201862006423f888421072003417f6a21032004ad20064201868421062002a741017121040c010b0b20074201862006423f888421022004ad2006420186427e83840b370300200020023703080b3701017f230041106b220324002003200120021023200329030021012000200341086a29030037030820002001370300200341106a24000b7701017e20002001427f7e200242767e7c2001422088220242ffffffff0f7e7c200242f6ffffff0f7e200142ffffffff0f83220142f6ffffff0f7e22024220887c22034220887c200142ffffffff0f7e200342ffffffff0f837c22014220887c3703082000200242ffffffff0f832001422086843703000b880101037f41cc08410136020041d0082802002100034020000440034041d40841d4082802002201417f6a2202360200200141014845044041cc084100360200200020024102746a22004184016a280200200041046a28020011010041cc08410136020041d00828020021000c010b0b41d408412036020041d008200028020022003602000c010b0b0b940101027f41cc08410136020041d008280200220145044041d00841d80836020041d80821010b024041d40828020022024120460440418402101c2201450d0120011019220141d00828020036020041d008200136020041d4084100360200410021020b41d408200241016a360200200120024102746a22014184016a4100360200200141046a20003602000b41cc0841003602000b3801017f41dc0a420037020041e40a410036020041742100034020000440200041e80a6a4100360200200041046a21000c010b0b410410270b070041dc0a10200b750020004200370210200042ffffffff0f3702082000200129020037020002402002410871450d002000102b20012802044f0d002002410471044010000c010b200042003702000b02402002411071450d002000102b20012802044d0d0020024104710440100020000f0b200042003702000b20000b2e01017f200028020445044041000f0b4101210120002802002c0000417f4c047f2000102c2000102d6a0541010b0b5b00027f027f41002000280204450d001a410020002802002c0000417f4a0d011a20002802002d0000220041bf014d04404100200041b801490d011a200041c97e6a0c010b4100200041f801490d001a200041897e6a0b41016a0b0bff0201037f200028020445044041000f0b2000102e41012102024020002802002c00002201417f4a0d00200141ff0171220341b7014d0440200341807f6a0f0b02400240200141ff0171220141bf014d0440024020002802042201200341c97e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241b7012101034020012003460440200241384f0d030c0405200028020020016a41ca7e6a2d00002002410874722102200141016a21010c010b000b000b200141f7014d0440200341c07e6a0f0b024020002802042201200341897e6a22024d047f100020002802040520010b4102490d0020002802002d00010d0010000b200241054f044010000b20002802002d000145044010000b4100210241f701210103402001200346044020024138490d0305200028020020016a418a7e6a2d00002002410874722102200141016a21010c010b0b0b200241ff7d490d010b10000b20020b4101017f200028020445044010000b0240200028020022012d0000418101470d00200028020441014d047f100020002802000520010b2c00014100480d0010000b0b5a01027f2000027f0240200128020022054504400c010b200220036a200128020422014b2001200249720d00410020012003490d011a200220056a2104200120026b20032003417f461b0c010b41000b360204200020043602000b3c01017f230041306b22022400200220013602142002200036021020022002290310370308200241186a200241086a4114102a102b200241306a24000b2101017f2001102d220220012802044b044010000b200020012001102c2002102f0bd60202077f017e230041206b220324002001280208220420024b0440200341186a2001103120012003280218200328021c103036020c200341106a20011031410021042001027f410020032802102206450d001a410020032802142208200128020c2207490d001a200820072007417f461b210520060b360210200141146a2005360200200141003602080b200141106a210903400240200420024f0d002001280214450d00200341106a2001103141002104027f410020032802102207450d001a410020032802142208200128020c2206490d001a200820066b2104200620076a0b21052001200436021420012005360210200341106a20094100200520041030102f20012003290310220a3702102001200128020c200a422088a76a36020c2001200128020841016a22043602080c010b0b20032009290200220a3703082003200a370300200020034114102a1a200341206a24000b980101037f200028020445044041000f0b2000102e200028020022022c0000220141004e044020014100470f0b027f4101200141807f460d001a200141ff0171220341b7014d0440200028020441014d047f100020002802000520020b2d00014100470f0b4100200341bf014b0d001a2000280204200141ff017141ca7e6a22014d047f100020002802000520020b20016a2d00004100470b0bf80101057f0340024020002802102201200028020c460d00200141786a28020041014904401000200028021021010b200141786a2202200228020041016b220436020020040d002000200236021020004101200028020422032001417c6a28020022026b2201100d220441016a20014138491b220520036a1035200220002802006a220320056a20032001101a0240200141374d0440200028020020026a200141406a3a00000c010b200441f7016a220341ff014d0440200028020020026a20033a00002000280200200220046a6a210203402001450d02200220013a0000200141087621012002417f6a21020c000b000b10000b0c010b0b0b0f00200020011036200020013602040b2f01017f200028020820014904402001101c200028020020002802041018210220002001360208200020023602000b0b1b00200028020420016a220120002802084b04402000200110360b0b2500200041011037200028020020002802046a20013a00002000200028020441016a3602040be70101037f2001280200210441012102024002400240024020012802042201410146044020042c000022014100480d012000200141ff017110380c040b200141374b0d01200121020b200020024180017341ff017110380c010b2001100d220241b7016a22034180024e044010000b2000200341ff017110382000200028020420026a1035200028020420002802006a417f6a210320012102037f2002047f200320023a0000200241087621022003417f6a21030c010520010b0b21020b200020021037200028020020002802046a2004200210181a2000200028020420026a3602040b200010340bb80202037f037e02402001500440200041800110380c010b20014280015a044020012105034020052006845045044020064238862005420888842105200241016a2102200642088821060c010b0b0240200241384f04402002210303402003044020034108762103200441016a21040c010b0b200441c9004f044010000b2000200441b77f6a41ff017110382000200028020420046a1035200028020420002802006a417f6a21042002210303402003450d02200420033a0000200341087621032004417f6a21040c000b000b200020024180017341ff017110380b2000200028020420026a1035200028020420002802006a417f6a210203402001200784500d02200220013c0000200742388620014208888421012002417f6a2102200742088821070c000b000b20002001a741ff017110380b200010340b0b4401004180080b3d3031323334353637383900696e697400696e743800696e7436340075696e7438740075696e743332740075696e74363474007531323874007532353674";

    public static String BINARY = BINARY_0;

    public static final String FUNC_U128T = "u128t";

    public static final String FUNC_INT32 = "int32";

    public static final String FUNC_INT8 = "int8";

    public static final String FUNC_INT64 = "int64";

    public static final String FUNC_UINT8T = "uint8t";

    public static final String FUNC_UINT32T = "uint32t";

    public static final String FUNC_UINT64T = "uint64t";

    public static final String FUNC_U256T = "u256t";

    protected IntegerDataTypeContract_1(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected IntegerDataTypeContract_1(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<String> u128t(Uint64 input) {
        final WasmFunction function = new WasmFunction(FUNC_U128T, Arrays.asList(input), String.class);
        return executeRemoteCall(function, String.class);
    }

    public RemoteCall<Int32> int32() {
        final WasmFunction function = new WasmFunction(FUNC_INT32, Arrays.asList(), Int32.class);
        return executeRemoteCall(function, Int32.class);
    }

    public RemoteCall<Int16> int8() {
        final WasmFunction function = new WasmFunction(FUNC_INT8, Arrays.asList(), Int16.class);
        return executeRemoteCall(function, Int16.class);
    }

    public static RemoteCall<IntegerDataTypeContract_1> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(IntegerDataTypeContract_1.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<IntegerDataTypeContract_1> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(IntegerDataTypeContract_1.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<IntegerDataTypeContract_1> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(IntegerDataTypeContract_1.class, web3j, credentials, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public static RemoteCall<IntegerDataTypeContract_1> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider, BigInteger initialVonValue) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(IntegerDataTypeContract_1.class, web3j, transactionManager, contractGasProvider, encodedConstructor, initialVonValue);
    }

    public RemoteCall<Int64> int64() {
        final WasmFunction function = new WasmFunction(FUNC_INT64, Arrays.asList(), Int64.class);
        return executeRemoteCall(function, Int64.class);
    }

    public RemoteCall<Uint8> uint8t(Uint8 input) {
        final WasmFunction function = new WasmFunction(FUNC_UINT8T, Arrays.asList(input), Uint8.class);
        return executeRemoteCall(function, Uint8.class);
    }

    public RemoteCall<Uint32> uint32t(Uint32 input) {
        final WasmFunction function = new WasmFunction(FUNC_UINT32T, Arrays.asList(input), Uint32.class);
        return executeRemoteCall(function, Uint32.class);
    }

    public RemoteCall<Uint64> uint64t(Uint64 input) {
        final WasmFunction function = new WasmFunction(FUNC_UINT64T, Arrays.asList(input), Uint64.class);
        return executeRemoteCall(function, Uint64.class);
    }

    public RemoteCall<String> u256t(Uint64 input) {
        final WasmFunction function = new WasmFunction(FUNC_U256T, Arrays.asList(input), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static IntegerDataTypeContract_1 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new IntegerDataTypeContract_1(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IntegerDataTypeContract_1 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new IntegerDataTypeContract_1(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}

package network.platon.contracts.wasm;

import com.platon.rlp.datatypes.Int32;
import com.platon.rlp.datatypes.Int64;
import com.platon.rlp.datatypes.Int8;
import com.platon.rlp.datatypes.Uint32;
import com.platon.rlp.datatypes.Uint64;
import com.platon.rlp.datatypes.Uint8;
import java.util.Arrays;
import org.web3j.abi.WasmFunctionEncoder;
import org.web3j.abi.datatypes.WasmFunction;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.WasmContract;
import org.web3j.tx.gas.GasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 0.9.1.0-SNAPSHOT.
 */
public class IntegerDataTypeContract_2 extends WasmContract {
    private static String BINARY_0 = "0x0061736d01000000015c1060000060017f006000017f60027f7f0060027f7f017f60047f7f7f7f017f60047f7f7f7f0060037f7f7f017f60017f017f60037f7f7f0060037f7e7e017f60027e7e017f60047f7e7e7f0060017f017e60027f7e0060037f7e7e0002a9010703656e760c706c61746f6e5f70616e6963000003656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000203656e7610706c61746f6e5f6765745f696e707574000103656e760d706c61746f6e5f72657475726e000303656e7617706c61746f6e5f6765745f73746174655f6c656e677468000403656e7610706c61746f6e5f6765745f7374617465000503656e7610706c61746f6e5f7365745f737461746500060351500000070708080704010008010701010801080100070107080808080603090801080303080303030a0b08090c0100010300070d0d08080808030808030d0e080308030e08030301080e080308030f0e000405017001030305030100020615037f0141b08b040b7f0041b08b040b7f0041af0b0b075406066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300070b5f5f686561705f6261736503010a5f5f646174615f656e6403020f5f5f66756e63735f6f6e5f65786974001a06696e766f6b6500370908010041010b021c350aea695008001010103410560b02000bc60a010b7f2002410f6a210341002104410020026b21052002410e6a2106410120026b21072002410d6a2108410220026b210902400340200020046a210b200120046a210a20022004460d01200a410371450d01200b200a2d00003a00002003417f6a2103200541016a21052006417f6a2106200741016a21072008417f6a2108200941016a2109200441016a21040c000b0b200220046b210c02400240024002400240200b410371220d450d00200c4120490d03200d4101460d01200d4102460d02200d4103470d03200b200120046a28020022063a0000200041016a210c200220046b417f6a21092004210b0240034020094113490d01200c200b6a220a2001200b6a220741046a2802002208411874200641087672360200200a41046a200741086a2802002206411874200841087672360200200a41086a2007410c6a2802002208411874200641087672360200200a410c6a200741106a2802002206411874200841087672360200200b41106a210b200941706a21090c000b0b2002417f6a2005416d2005416d4b1b20036a4170716b20046b210c2001200b6a41016a210a2000200b6a41016a210b0c030b200c210a02400340200a4110490d01200020046a220b200120046a2207290200370200200b41086a200741086a290200370200200441106a2104200a41706a210a0c000b0b02400240200c4108710d00200120046a210a200020046a21040c010b200020046a220b200120046a2204290200370200200441086a210a200b41086a21040b0240200c410471450d002004200a280200360200200a41046a210a200441046a21040b0240200c410271450d002004200a2f00003b0000200441026a2104200a41026a210a0b200c410171450d032004200a2d00003a000020000f0b200b200120046a220a28020022063a0000200b41016a200a41016a2f00003b0000200041036a210c200220046b417d6a21052004210b0240034020054111490d01200c200b6a220a2001200b6a220741046a2802002203410874200641187672360200200a41046a200741086a2802002206410874200341187672360200200a41086a2007410c6a2802002203410874200641187672360200200a410c6a200741106a2802002206410874200341187672360200200b41106a210b200541706a21050c000b0b2002417d6a2009416f2009416f4b1b20086a4170716b20046b210c2001200b6a41036a210a2000200b6a41036a210b0c010b200b200120046a220a28020022083a0000200b41016a200a41016a2d00003a0000200041026a210c200220046b417e6a21052004210b0240034020054112490d01200c200b6a220a2001200b6a220941046a2802002203411074200841107672360200200a41046a200941086a2802002208411074200341107672360200200a41086a2009410c6a2802002203411074200841107672360200200a410c6a200941106a2802002208411074200341107672360200200b41106a210b200541706a21050c000b0b2002417e6a2007416e2007416e4b1b20066a4170716b20046b210c2001200b6a41026a210a2000200b6a41026a210b0b0240200c411071450d00200b200a2d00003a0000200b200a280001360001200b200a290005370005200b200a2f000d3b000d200b200a2d000f3a000f200b41106a210b200a41106a210a0b0240200c410871450d00200b200a290000370000200b41086a210b200a41086a210a0b0240200c410471450d00200b200a280000360000200b41046a210b200a41046a210a0b0240200c410271450d00200b200a2f00003b0000200b41026a210b200a41026a210a0b200c410171450d00200b200a2d00003a00000b20000bfb0202027f017e02402002450d00200020013a0000200020026a2203417f6a20013a000020024103490d00200020013a0002200020013a00012003417d6a20013a00002003417e6a20013a000020024107490d00200020013a00032003417c6a20013a000020024109490d002000410020006b41037122046a2203200141ff017141818284086c22013602002003200220046b417c7122046a2202417c6a200136020020044109490d002003200136020820032001360204200241786a2001360200200241746a200136020020044119490d002003200136021820032001360214200320013602102003200136020c200241706a20013602002002416c6a2001360200200241686a2001360200200241646a20013602002001ad220542208620058421052004200341047141187222016b2102200320016a2101034020024120490d0120012005370300200141186a2005370300200141106a2005370300200141086a2005370300200141206a2101200241606a21020c000b0b20000b3a01017f23808080800041106b220141b08b84800036020c2000200128020c41076a41787122013602042000200136020020003f0036020c20000b120041808880800020004108108d808080000bc10101067f23808080800041106b22032480808080002003200136020c024002402001450d002000200028020c200241036a410020026b220471220520016a220641107622076a220836020c200020022000280204220120066a6a417f6a20047122023602040240200841107420024b0d002000410c6a200841016a360200200741016a21070b0240200740000d001080808080000b20012003410c6a41041089808080001a200120056a21000c010b410021000b200341106a24808080800020000b2e000240418088808000200120006c22004108108d808080002201450d00200141002000108a808080001a0b20010b02000b0f00418088808000108b808080001a0b3a01027f2000410120001b2101024003402001108c8080800022020d014100280290888080002200450d012000118080808000000c000b0b20020b0a002000108f808080000bce0301067f024020002001460d000240024002400240200120006b20026b410020024101746b4d0d0020012000734103712103200020014f0d012003450d02200021030c030b2000200120021089808080000f0b024020030d002001417f6a210402400340200020026a2203410371450d012002450d052003417f6a200420026a2d00003a00002002417f6a21020c000b0b2000417c6a21032001417c6a2104034020024104490d01200320026a200420026a2802003602002002417c6a21020c000b0b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b0b200241046a21052002417f7321064100210402400340200120046a2107200020046a2208410371450d0120022004460d03200820072d00003a00002005417f6a2105200641016a2106200441016a21040c000b0b200220046b2101410021030240034020014104490d01200820036a200720036a280200360200200341046a21032001417c6a21010c000b0b200720036a2101200820036a210320022006417c2006417c4b1b20056a417c716b20046b21020b03402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b0b20000b0900200041013602000b0900200041003602000b1d00024020002d0000410171450d0020002802081092808080000b20000b2801017f41002101024003402001410c460d01200020016a4100360200200141046a21010c000b0b0b1d0020004200370200200041086a4100360200200010978080800020000b0900108880808000000bb60101037f4194888080001094808080004100280298888080002100024003402000450d01024003404100410028029c888080002202417f6a220136029c8880800020024101480d01200020014102746a22004184016a2802002102200041046a2802002100419488808000109580808000200220001181808080000041948880800010948080800041002802988880800021000c000b0b4100412036029c88808000410020002802002200360298888080000c000b0b0bcd0101027f419488808000109480808000024041002802988880800022030d0041a0888080002103410041a088808000360298888080000b02400240410028029c8880800022044120470d004184024101108e808080002203450d0141002104200341002802988880800036020041002003360298888080004100410036029c888080000b4100200441016a36029c88808000200320044102746a22034184016a2001360200200341046a200036020041948880800010958080800041000f0b419488808000109580808000417f0b0f0041a48a8080001096808080001a0b89010020004200370210200042ffffffff0f3702082000200129020037020002402002410871450d002000109e8080800020012802044f0d00024020024104710d00200042003702000c010b1080808080000b024002402002411071450d002000109e8080800020012802044d0d0020024104710d01200042003702000b20000f0b10808080800020000b3400024002402000280204450d0020002802002c0000417f4c0d0141010f0b41000f0b2000109f80808000200010a0808080006a0b280002402000280204450d0020002802002c0000417f4c0d0041000f0b200010a58080800041016a0bc90301047f0240024002402000280204450d00200010a6808080004101210120002802002c00002202417f4c0d010c020b41000f0b0240200241ff0171220141b7014b0d00200141807f6a0f0b024002400240200241ff0171220241bf014b0d000240200041046a22032802002202200141c97e6a22044b0d00108080808000200328020021020b024020024102490d0020002802002d00010d001080808080000b024020044105490d001080808080000b024020002802002d00010d001080808080000b41002101410021020240034020042002460d012001410874200028020020026a41016a2d0000722101200241016a21020c000b0b200141384f0d010c020b0240200241f7014b0d00200141c07e6a0f0b0240200041046a22032802002202200141897e6a22044b0d00108080808000200328020021020b024020024102490d0020002802002d00010d001080808080000b024020044105490d001080808080000b024020002802002d00010d001080808080000b41002101410021020240034020042002460d012001410874200028020020026a41016a2d0000722101200241016a21020c000b0b20014138490d010b200141ff7d490d010b10808080800020010f0b20010b5102017f017e23808080800041306b220124808080800020012000290200220237031020012002370308200141186a200141086a4114109d80808000109e808080002100200141306a24808080800020000b6a01037f02400240024020012802002204450d0041002105200320026a200128020422064b0d0120062002490d014100210120062003490d02200620026b20032003417f461b2101200420026a21050c020b410021050b410021010b20002001360204200020053602000b3301017f0240200110a080808000220220012802044d0d001080808080000b200020012001109f80808000200210a2808080000bd003020a7f017e23808080800041c0006b220324808080800002402001280208220420024d0d00200341386a200110a380808000200320032903383703182001200341186a10a18080800036020c200341306a200110a380808000410021044100210541002106024020032802302207450d00410021054100210620032802342208200128020c2209490d00200820092009417f461b2105200721060b20012006360210200141146a2005360200200141086a41003602000b200141106a2106200141146a21092001410c6a2107200141086a210802400340200420024f0d012009280200450d01200341306a200110a38080800041002104024002402003280230220a450d00410021052003280234220b2007280200220c490d01200a200c6a2105200b200c6b21040c010b410021050b20092004360200200620053602002003200436022c2003200536022820032003290328370310200341306a20064100200341106a10a18080800010a28080800020062003290330220d37020020072007280200200d422088a76a3602002008200828020041016a22043602000c000b0b20032006290200220d3703202003200d3703082000200341086a4114109d808080001a200341c0006a2480808080000b4701017f4100210102402000280204450d00024020002802002d0000220041bf014b0d00200041b801490d01200041c97e6a0f0b200041f801490d00200041897e6a21010b20010b5401017f024020002802040d001080808080000b0240200028020022012d0000418101470d000240200041046a28020041014b0d00108080808000200028020021010b20012c00014100480d001080808080000b0bbc0101047f024002402000280204450d00200010a680808000200028020022012c000022024100480d0120024100470f0b41000f0b410121030240200241807f460d000240200241ff0171220441b7014b0d000240200041046a28020041014b0d00108080808000200028020021010b20012d00014100470f0b41002103200441bf014b0d000240200041046a280200200241ff017141ca7e6a22024b0d00108080808000200028020021010b200120026a2d000041004721030b20030bb60201087f02402001450d002000410c6a2102200041106a2103200041046a21040340200328020022052002280200460d010240200541786a28020020014f0d00108080808000200328020021050b200541786a2206200628020020016b220136020020010d01200320063602002000410120042802002005417c6a28020022016b220510aa80808000220741016a20054138491b2206200428020022086a10ab80808000200120002802006a220920066a2009200820016b1093808080001a02400240200541374b0d00200028020020016a200541406a3a00000c010b0240200741f7016a220641ff014b0d00200028020020016a20063a00002000280200200720016a6a210103402005450d02200120053a0000200541087621052001417f6a21010c000b0b1080808080000b410121010c000b0b0b21000240200028020420016a220120002802084d0d002000200110ac808080000b0b2501017f41002101024003402000450d0120004108762100200141016a21010c000b0b20010b13002000200110ac80808000200020013602040b4501017f0240200028020820014f0d002001108c808080002202200028020020002802041089808080001a200010b380808000200041086a2001360200200020023602000b0b29002000410110a980808000200028020020002802046a20013a00002000200028020441016a3602040bc40101037f02400240024020012002844200510d00200142ff005620024200522002501b0d0120002001a741ff017110ad808080000c020b200041800110ad808080000c010b024002402001200210af80808000220341374b0d00200020034180017341ff017110ad808080000c010b0240200310b080808000220441b7016a2205418002490d001080808080000b2000200541ff017110ad8080800020002003200410b1808080000b200020012002200310b2808080000b2000410110a88080800020000b3501017f41002102024003402000200184500d0120004208882001423886842100200241016a2102200142088821010c000b0b20020b2501017f41002101024003402000450d0120004108762100200141016a21010c000b0b20010b44002000200028020420026a10ab80808000200028020020002802046a417f6a2100024003402001450d01200020013a0000200141087621012000417f6a21000c000b0b0b54002000200028020420036a10ab80808000200028020020002802046a417f6a2100024003402001200284500d01200020013c0000200142088820024238868421012000417f6a2100200242088821020c000b0b0b1700024020002802002200450d002000108f808080000b0b240041a48a8080001098808080001a4181808080004100418088808000109b808080001a0b0f0041b08a8080001096808080001a0bb30201067f02400240024002400240024020002802042202200028020022036b220420014f0d002000280208220520026b200120046b22064f0d012001417f4c0d0441ffffffff0721070240200520036b220241feffffff034b0d0020012002410174220220022001491b2207450d040b200710918080800021020c050b200420014d0d01200041046a200320016a3602000f0b200420016b2101200041046a21000340200241003a00002000200028020041016a2202360200200141016a22010d000b0b0f0b41002107410021020c010b2000109980808000000b200220046a41002006108a808080001a200220016a2101200220076a2107024020044101480d002002200320041089808080001a0b20002002360200200041086a2007360200200041046a200136020020031092808080000bea0a03037f017e017f23808080800041c0016b22002480808080001087808080001081808080002201108c808080002202108280808000200041186a20002002200110b8808080002201410010a48080800002400240200041186a10b98080800022034200510d000240200341bc8a80800010ba80808000520d00200041186a10bb8080800010bc808080001a0c020b0240200341c18a80800010ba80808000520d00200041186a2001410110a480808000200041186a10bd808080002101200041186a10bb80808000220220013a0010200210bc808080001a0c020b0240200341c98a80800010ba80808000520d00200041186a10bb8080800022022c00102104200041a8016a10be808080002201200410bf808080000240200128020c200141106a280200460d001080808080000b20012802002001280204108380808000200110c0808080001a200210bc808080001a0c020b0240200341d18a80800010ba80808000520d00200041186a2001410110a480808000200041186a10c1808080002101200041186a10bb80808000220241286a2001360200200210bc808080001a0c020b0240200341da8a80800010ba80808000520d00200041186a10bb80808000220241286a2802002104200041a8016a10be808080002201200410c2808080000240200128020c200141106a280200460d001080808080000b20012802002001280204108380808000200110c0808080001a200210bc808080001a0c020b0240200341e38a80800010ba80808000520d00200041186a2001410110a480808000200041186a10c3808080002103200041186a10bb80808000220141c0006a2003370300200110bc808080001a0c020b0240200341ec8a80800010ba80808000520d00200041186a10bb80808000220241c0006a2903002103200041a8016a10be808080002201200310c4808080000240200128020c200141106a280200460d001080808080000b20012802002001280204108380808000200110c0808080001a200210bc808080001a0c020b0240200341f58a80800010ba80808000520d00200041186a2001410110a480808000200041186a10c5808080002101200041186a10bb80808000220241d8006a20013a0000200210bc808080001a0c020b0240200341fe8a80800010ba80808000520d00200041186a10bb80808000220241d8006a2d00002104200041a8016a10be808080002201200410c6808080000240200128020c200141106a280200460d001080808080000b20012802002001280204108380808000200110c0808080001a200210bc808080001a0c020b0240200341878b80800010ba80808000520d00200041186a2001410110a480808000200041186a10c7808080002101200041186a10bb80808000220241f0006a2001360200200210bc808080001a0c020b0240200341918b80800010ba80808000520d00200041186a10bb80808000220241f0006a2802002104200041a8016a10be808080002201200410c8808080000240200128020c200141106a280200460d001080808080000b20012802002001280204108380808000200110c0808080001a200210bc808080001a0c020b02402003419b8b80800010ba80808000520d00200041186a2001410110a480808000200041186a10b9808080002103200041186a10bb8080800022014188016a2003370300200110bc808080001a0c020b200341a58b80800010ba80808000520d00200041186a10bb8080800022024188016a2903002103200041a8016a10be808080002201200310c9808080000240200128020c200141106a280200460d001080808080000b20012802002001280204108380808000200110c0808080001a200210bc808080001a0c010b1080808080000b200041c0016a2480808080000b4801017f23808080800041106b22032480808080002003200236020c200320013602082003200329030837030020002003411c109d808080002100200341106a24808080800020000bb00103017f017e017f23808080800041106b2201248080808000200010a68080800002400240200010a780808000450d002000280204450d0020002802002d000041c001490d010b1080808080000b200141086a200010cb808080000240200128020c22004109490d001080808080000b4200210220012802082103024003402000450d012000417f6a210020024208862003310000842102200341016a21030c000b0b200141106a24808080800020020b3a01027e42a5c688a1c89ca7f94b21010240034020003000002202500d01200041016a2100200142b383808080207e20028521010c000b0b20010bd30b01057f23808080800041c0006b220124808080800020004289d0beac9ad8f9ee41370308200141286a10be808080002202200029030810c9808080000240200228020c200241106a280200460d001080808080000b0240024020022802002203200228020422041084808080002205450d002001410036022020014200370318200141186a200510b6808080002003200420012802182205200128021c20056b1085808080001a200041106a20012001280218220341016a200128021c2003417f736a10b88080800010bd808080003a0000200141186a10ca808080001a200210c0808080001a0c010b200210c0808080001a200041106a20002d00003a00000b200041206a220342b8cdbeac9ab8f9ee41370300200141286a10be808080002202200329030010c9808080000240200228020c200241106a280200460d001080808080000b0240024020022802002203200228020422041084808080002205450d002001410036022020014200370318200141186a200510b6808080002003200420012802182205200128021c20056b1085808080001a200041286a20012001280218220341016a200128021c2003417f736a10b88080800010c180808000360200200141186a10ca808080001a200210c0808080001a0c010b200210c0808080001a200041286a20002802183602000b200041386a220342bfbcbeac9a98f8ee41370300200141286a10be808080002202200329030010c9808080000240200228020c200241106a280200460d001080808080000b0240024020022802002203200228020422041084808080002205450d002001410036022020014200370318200141186a200510b6808080002003200420012802182205200128021c20056b1085808080001a200041c0006a20012001280218220341016a200128021c2003417f736a10b88080800010c380808000370300200141186a10ca808080001a200210c0808080001a0c010b200210c0808080001a200041c0006a20002903303703000b200041d0006a220342e4e9dbd7f9a5b1f1e000370300200141286a10be808080002202200329030010c9808080000240200228020c200241106a280200460d001080808080000b0240024020022802002203200228020422041084808080002205450d002001410036022020014200370318200141186a200510b6808080002003200420012802182205200128021c20056b1085808080001a200041d8006a20012001280218220341016a200128021c2003417f736a10b88080800010c5808080003a0000200141186a10ca808080001a200210c0808080001a0c010b200210c0808080001a200041d8006a20002d00483a00000b200041e8006a220342df9cedb3ebfeb2e4e700370300200141286a10be808080002202200329030010c9808080000240200228020c200241106a280200460d001080808080000b0240024020022802002203200228020422041084808080002205450d002001410036022020014200370318200141186a200510b6808080002003200420012802182205200128021c20056b1085808080001a200041f0006a20012001280218220341016a200128021c2003417f736a10b88080800010c780808000360200200141186a10ca808080001a200210c0808080001a0c010b200210c0808080001a200041f0006a20002802603602000b20004180016a220342bc85edb3eb9eb1e4e700370300200141286a10be808080002202200329030010c9808080000240200228020c200241106a280200460d001080808080000b0240024020022802002203200228020422041084808080002205450d002001410036022020014200370318200141186a200510b6808080002003200420012802182205200128021c20056b1085808080001a20004188016a20012001280218220341016a200128021c2003417f736a10b88080800010b980808000370300200141186a10ca808080001a200210c0808080001a0c010b200210c0808080001a20004188016a20002903783703000b200141c0006a24808080800020000ba11001087f23808080800041d0006b2201248080808000200141306a10be80808000220220004180016a220310ce8080800010d1808080002002200329030010c98080800020004188016a21040240200228020c200241106a280200460d001080808080000b2002280204210520022802002106200141186a10be808080002103200410ce8080800021072003200110d280808000220810d3808080002003200720082802046a20082802006b10d1808080002003200429030010c98080800002400240200328020c200341106a280200460d00108080808000200328020021042003410c6a280200200341106a280200460d011080808080000c010b200328020021040b200620052004200341046a280200108680808000200810ca808080001a200310c0808080001a200210c0808080001a200141186a10be808080002202200041e8006a220310ce8080800010d1808080002002200329030010c9808080000240200228020c200241106a280200460d001080808080000b2002280204210420022802002105200110be808080002103200141c8006a4100360200200141306a41106a4200370300200141386a420037030020014200370330200141306a200041f0006a2206350200420010d48080800020012802302107200141306a41047210d0808080001a2003200141306a10d280808000220810d3808080002003200720082802046a20082802006b10d1808080002003200628020010c88080800002400240200328020c200341106a280200460d00108080808000200328020021062003410c6a280200200341106a280200460d011080808080000c010b200328020021060b200520042006200341046a280200108680808000200810ca808080001a200310c0808080001a200210c0808080001a200141186a10be808080002202200041d0006a220310ce8080800010d1808080002002200329030010c9808080000240200228020c200241106a280200460d001080808080000b2002280204210420022802002105200110be808080002103200141c8006a4100360200200141306a41106a4200370300200141386a420037030020014200370330200141306a200041d8006a2206310000420010d48080800020012802302107200141306a41047210d0808080001a2003200141306a10d280808000220810d3808080002003200720082802046a20082802006b10d180808000200320062d000010c68080800002400240200328020c200341106a280200460d00108080808000200328020021062003410c6a280200200341106a280200460d011080808080000c010b200328020021060b200520042006200341046a280200108680808000200810ca808080001a200310c0808080001a200210c0808080001a200141186a10be808080002202200041386a220310ce8080800010d1808080002002200329030010c9808080000240200228020c200241106a280200460d001080808080000b2002280204210420022802002105200110be808080002103200141c8006a4100360200200141306a41106a4200370300200141386a420037030020014200370330200141306a200041c0006a220629030010d58080800020012802302107200141306a41047210d0808080001a2003200141306a10d280808000220810d3808080002003200720082802046a20082802006b10d1808080002003200629030010c48080800002400240200328020c200341106a280200460d00108080808000200328020021062003410c6a280200200341106a280200460d011080808080000c010b200328020021060b200520042006200341046a280200108680808000200810ca808080001a200310c0808080001a200210c0808080001a200141186a10be808080002202200041206a220310ce8080800010d1808080002002200329030010c9808080000240200228020c200241106a280200460d001080808080000b2002280204210420022802002105200110be808080002103200141c8006a4100360200200141306a41106a4200370300200141386a420037030020014200370330200141306a200041286a220634020010d58080800020012802302107200141306a41047210d0808080001a2003200141306a10d280808000220810d3808080002003200720082802046a20082802006b10d1808080002003200628020010c28080800002400240200328020c200341106a280200460d00108080808000200328020021062003410c6a280200200341106a280200460d011080808080000c010b200328020021060b200520042006200341046a280200108680808000200810ca808080001a200310c0808080001a200210c0808080001a200141186a10be808080002202200041086a10ce8080800010d1808080002002200029030810c9808080000240200228020c200241106a280200460d001080808080000b2002280204210420022802002105200110be808080002103200141c8006a4100360200200141306a41106a4200370300200141306a41086a420037030020014200370330200141306a200041106a220630000010d58080800020012802302107200141306a41047210d0808080001a2003200141306a10d280808000220810d3808080002003200720082802046a20082802006b10d180808000200320062c000010bf8080800002400240200328020c200341106a280200460d00108080808000200328020021062003410c6a280200200341106a280200460d011080808080000c010b200328020021060b200520042006200341046a280200108680808000200810ca808080001a200310c0808080001a200210c0808080001a200141d0006a24808080800020000b2101017e200010b9808080002201420188420020014201837d85a74118744118750b2d0020004100360208200042003702002000410010cc80808000200041146a41003602002000420037020c20000b0d0020002001ac10c4808080000b2d01017f0240200028020c2201450d00200041106a200136020020011092808080000b200010cd8080800020000b1b01017e200010b9808080002201420188420020014201837d85a70b0d0020002001ac10c4808080000b1a01017e200010b9808080002201420188420020014201837d850b1500200020014201862001423f878510c9808080000baa0101037f23808080800041106b2201248080808000200010a68080800002400240200010a780808000450d002000280204450d0020002802002d000041c001490d010b1080808080000b200141086a200010cb808080000240200128020c22004102490d001080808080000b4100210220012802082103024003402000450d012000417f6a210020032d00002102200341016a21030c000b0b200141106a248080808000200241ff01710b100020002001ad420010ae808080001a0bac0101037f23808080800041106b2201248080808000200010a68080800002400240200010a780808000450d002000280204450d0020002802002d000041c001490d010b1080808080000b200141086a200010cb808080000240200128020c22004105490d001080808080000b4100210220012802082103024003402000450d012000417f6a2100200241087420032d0000722102200341016a21030c000b0b200141106a24808080800020020b100020002001ad420010ae808080001a0b0f0020002001420010ae808080001a0b2201017f024020002802002201450d002000200136020420011092808080000b20000b870201057f0240200110a0808080002202200128020422034d0d00108080808000200141046a28020021030b2001280200210402400240024002400240024002402003450d004100210120042c00002205417f4c0d012004450d030c040b410021010c010b0240200541ff0171220641bf014b0d0041002101200541ff017141b801490d01200641c97e6a21010c010b41002101200541ff017141f801490d00200641897e6a21010b200141016a210120040d010b410021050c010b41002105200120026a20034b0d0020032001490d004100210620032002490d01200320016b20022002417f461b2106200420016a21050c010b410021060b20002006360204200020053602000b4401017f0240200028020820014f0d002001108c80808000200028020020002802041089808080002102200010cd80808000200041086a2001360200200020023602000b0b0d002000280200108f808080000b6701017f23808080800041206b2201248080808000200141186a4100360200200141106a4200370300200141086a4200370300200142003703002001200029030010cf8080800020012802002100200141047210d0808080001a200141206a24808080800020000b0e0020002001420010d4808080000b850301067f200028020422012000280210220241087641fcffff07716a210302400240200028020822042001460d002001200028021420026a220541087641fcffff07716a280200200541ff07714102746a2105200041146a21062003280200200241ff07714102746a21020c010b200041146a210641002102410021050b0240034020052002460d01200241046a220220032802006b418020470d0020032802042102200341046a21030c000b0b20064100360200200041086a210302400340200420016b41027522024103490d012001280200109280808000200041046a2201200128020041046a2201360200200328020021040c000b0b02400240024020024101460d0020024102470d0241800821020c010b41800421020b200041106a20023602000b0240034020042001460d012001280200109280808000200141046a21010c000b0b200041086a22022802002101200041046a28020021040240034020042001460d0120022001417c6a22013602000c000b0b200028020010928080800020000b19000240200028020820014f0d002000200110cc808080000b0b3001017f200041011091808080002201360200200141fe013a00002000200141016a22013602082000200136020420000b7a01037f0240200028020c200041106a280200460d001080808080000b0240200028020422022001280204200128020022036b22016a220420002802084d0d002000200410cc80808000200041046a28020021020b200028020020026a200320011089808080001a200041046a2200200028020020016a3602000bc30101027f4100210341012104024020014280015441002002501b0d00024003402001200284500d0120014208882002423886842101200341016a2103200242088821020c000b0b024020034138490d002003210403402004450d01200341016a2103200441087621040c000b0b200341016a21040b0240200041186a2802002203450d00200041086a2802002003200041146a2802006a417f6a220341087641fcffff07716a280200200341ff07714102746a21000b2000200028020020046a3602000b1500200020014201862001423f878510cf808080000b5501017f410042003702b08a808000410041003602b88a80800041742100024003402000450d01200041bc8a8080006a4100360200200041046a21000c000b0b4182808080004100418088808000109b808080001a0b0bbd0302004180080bbc02000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000041bc0a0b73696e697400736574496e743800676574496e743800736574496e74333200676574496e74333200736574496e74363400676574496e7436340073657455696e74380067657455696e74380073657455696e7433320067657455696e7433320073657455696e7436340067657455696e74363400";

    public static String BINARY = BINARY_0;

    public static final String FUNC_GETINT32 = "getInt32";

    public static final String FUNC_SETINT64 = "setInt64";

    public static final String FUNC_GETINT64 = "getInt64";

    public static final String FUNC_SETINT8 = "setInt8";

    public static final String FUNC_GETINT8 = "getInt8";

    public static final String FUNC_SETINT32 = "setInt32";

    public static final String FUNC_SETUINT8 = "setUint8";

    public static final String FUNC_GETUINT8 = "getUint8";

    public static final String FUNC_SETUINT32 = "setUint32";

    public static final String FUNC_GETUINT32 = "getUint32";

    public static final String FUNC_SETUINT64 = "setUint64";

    public static final String FUNC_GETUINT64 = "getUint64";

    protected IntegerDataTypeContract_2(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected IntegerDataTypeContract_2(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public RemoteCall<Int32> getInt32() {
        final WasmFunction function = new WasmFunction(FUNC_GETINT32, Arrays.asList(), Int32.class);
        return executeRemoteCall(function, Int32.class);
    }

    public RemoteCall<TransactionReceipt> setInt64(Int64 input) {
        final WasmFunction function = new WasmFunction(FUNC_SETINT64, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Int64> getInt64() {
        final WasmFunction function = new WasmFunction(FUNC_GETINT64, Arrays.asList(), Int64.class);
        return executeRemoteCall(function, Int64.class);
    }

    public static RemoteCall<IntegerDataTypeContract_2> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(IntegerDataTypeContract_2.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<IntegerDataTypeContract_2> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(IntegerDataTypeContract_2.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public RemoteCall<TransactionReceipt> setInt8(Int8 input) {
        final WasmFunction function = new WasmFunction(FUNC_SETINT8, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Int8> getInt8() {
        final WasmFunction function = new WasmFunction(FUNC_GETINT8, Arrays.asList(), Int8.class);
        return executeRemoteCall(function, Int8.class);
    }

    public RemoteCall<TransactionReceipt> setInt32(Int32 input) {
        final WasmFunction function = new WasmFunction(FUNC_SETINT32, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> setUint8(Uint8 input) {
        final WasmFunction function = new WasmFunction(FUNC_SETUINT8, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Uint8> getUint8() {
        final WasmFunction function = new WasmFunction(FUNC_GETUINT8, Arrays.asList(), Uint8.class);
        return executeRemoteCall(function, Uint8.class);
    }

    public RemoteCall<TransactionReceipt> setUint32(Uint32 input) {
        final WasmFunction function = new WasmFunction(FUNC_SETUINT32, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Uint32> getUint32() {
        final WasmFunction function = new WasmFunction(FUNC_GETUINT32, Arrays.asList(), Uint32.class);
        return executeRemoteCall(function, Uint32.class);
    }

    public RemoteCall<TransactionReceipt> setUint64(Uint64 input) {
        final WasmFunction function = new WasmFunction(FUNC_SETUINT64, Arrays.asList(input), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<Uint64> getUint64() {
        final WasmFunction function = new WasmFunction(FUNC_GETUINT64, Arrays.asList(), Uint64.class);
        return executeRemoteCall(function, Uint64.class);
    }

    public static IntegerDataTypeContract_2 load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new IntegerDataTypeContract_2(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static IntegerDataTypeContract_2 load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new IntegerDataTypeContract_2(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}

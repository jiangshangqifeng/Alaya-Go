package network.platon.contracts.wasm;

import com.platon.rlp.datatypes.Uint64;
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
public class Contract_timeout_termination extends WasmContract {
    private static String BINARY_0 = "0x0061736d0100000001671160000060017f006000017f60027f7f0060027f7f017f60047f7f7f7f017f60047f7f7f7f0060037f7f7f017f60017f017f60037f7f7f0060087f7f7f7f7f7f7f7f0060037f7e7e017f60027e7e017f60047f7e7e7f0060037f7f7e0060017f017e60027f7e0002a9010703656e760c706c61746f6e5f70616e6963000003656e7617706c61746f6e5f6765745f696e7075745f6c656e677468000203656e7610706c61746f6e5f6765745f696e707574000103656e760d706c61746f6e5f72657475726e000303656e7617706c61746f6e5f6765745f73746174655f6c656e677468000403656e7610706c61746f6e5f6765745f7374617465000503656e7610706c61746f6e5f7365745f73746174650006035352000007070808070401000801070101010409070804070a07010801000701070808080806030908010807090303080303030909070b0c08090d01000801010e00070f0f0808030803080803030110030808000405017001030305030100020615037f0141e08a040b7f0041e08a040b7f0041e00a0b075406066d656d6f72790200115f5f7761736d5f63616c6c5f63746f727300070b5f5f686561705f6261736503010a5f5f646174615f656e6403020f5f5f66756e63735f6f6e5f65786974002206696e766f6b6500460908010041010b0224440aa1555208001010104110580b02000bc60a010b7f2002410f6a210341002104410020026b21052002410e6a2106410120026b21072002410d6a2108410220026b210902400340200020046a210b200120046a210a20022004460d01200a410371450d01200b200a2d00003a00002003417f6a2103200541016a21052006417f6a2106200741016a21072008417f6a2108200941016a2109200441016a21040c000b0b200220046b210c02400240024002400240200b410371220d450d00200c4120490d03200d4101460d01200d4102460d02200d4103470d03200b200120046a28020022063a0000200041016a210c200220046b417f6a21092004210b0240034020094113490d01200c200b6a220a2001200b6a220741046a2802002208411874200641087672360200200a41046a200741086a2802002206411874200841087672360200200a41086a2007410c6a2802002208411874200641087672360200200a410c6a200741106a2802002206411874200841087672360200200b41106a210b200941706a21090c000b0b2002417f6a2005416d2005416d4b1b20036a4170716b20046b210c2001200b6a41016a210a2000200b6a41016a210b0c030b200c210a02400340200a4110490d01200020046a220b200120046a2207290200370200200b41086a200741086a290200370200200441106a2104200a41706a210a0c000b0b02400240200c4108710d00200120046a210a200020046a21040c010b200020046a220b200120046a2204290200370200200441086a210a200b41086a21040b0240200c410471450d002004200a280200360200200a41046a210a200441046a21040b0240200c410271450d002004200a2f00003b0000200441026a2104200a41026a210a0b200c410171450d032004200a2d00003a000020000f0b200b200120046a220a28020022063a0000200b41016a200a41016a2f00003b0000200041036a210c200220046b417d6a21052004210b0240034020054111490d01200c200b6a220a2001200b6a220741046a2802002203410874200641187672360200200a41046a200741086a2802002206410874200341187672360200200a41086a2007410c6a2802002203410874200641187672360200200a410c6a200741106a2802002206410874200341187672360200200b41106a210b200541706a21050c000b0b2002417d6a2009416f2009416f4b1b20086a4170716b20046b210c2001200b6a41036a210a2000200b6a41036a210b0c010b200b200120046a220a28020022083a0000200b41016a200a41016a2d00003a0000200041026a210c200220046b417e6a21052004210b0240034020054112490d01200c200b6a220a2001200b6a220941046a2802002203411074200841107672360200200a41046a200941086a2802002208411074200341107672360200200a41086a2009410c6a2802002203411074200841107672360200200a410c6a200941106a2802002208411074200341107672360200200b41106a210b200541706a21050c000b0b2002417e6a2007416e2007416e4b1b20066a4170716b20046b210c2001200b6a41026a210a2000200b6a41026a210b0b0240200c411071450d00200b200a2d00003a0000200b200a280001360001200b200a290005370005200b200a2f000d3b000d200b200a2d000f3a000f200b41106a210b200a41106a210a0b0240200c410871450d00200b200a290000370000200b41086a210b200a41086a210a0b0240200c410471450d00200b200a280000360000200b41046a210b200a41046a210a0b0240200c410271450d00200b200a2f00003b0000200b41026a210b200a41026a210a0b200c410171450d00200b200a2d00003a00000b20000bfb0202027f017e02402002450d00200020013a0000200020026a2203417f6a20013a000020024103490d00200020013a0002200020013a00012003417d6a20013a00002003417e6a20013a000020024107490d00200020013a00032003417c6a20013a000020024109490d002000410020006b41037122046a2203200141ff017141818284086c22013602002003200220046b417c7122046a2202417c6a200136020020044109490d002003200136020820032001360204200241786a2001360200200241746a200136020020044119490d002003200136021820032001360214200320013602102003200136020c200241706a20013602002002416c6a2001360200200241686a2001360200200241646a20013602002001ad220542208620058421052004200341047141187222016b2102200320016a2101034020024120490d0120012005370300200141186a2005370300200141106a2005370300200141086a2005370300200141206a2101200241606a21020c000b0b20000b3a01017f23808080800041106b220141e08a84800036020c2000200128020c41076a41787122013602042000200136020020003f0036020c20000b120041808880800020004108108d808080000bc10101067f23808080800041106b22032480808080002003200136020c024002402001450d002000200028020c200241036a410020026b220471220520016a220641107622076a220836020c200020022000280204220120066a6a417f6a20047122023602040240200841107420024b0d002000410c6a200841016a360200200741016a21070b0240200740000d001080808080000b20012003410c6a41041089808080001a200120056a21000c010b410021000b200341106a24808080800020000b2e000240418088808000200120006c22004108108d808080002201450d00200141002000108a808080001a0b20010b02000b0f00418088808000108b808080001a0b3a01027f2000410120001b2101024003402001108c8080800022020d014100280290888080002200450d012000118080808000000c000b0b20020b0a002000108f808080000bce0301067f024020002001460d000240024002400240200120006b20026b410020024101746b4d0d0020012000734103712103200020014f0d012003450d02200021030c030b2000200120021089808080000f0b024020030d002001417f6a210402400340200020026a2203410371450d012002450d052003417f6a200420026a2d00003a00002002417f6a21020c000b0b2000417c6a21032001417c6a2104034020024104490d01200320026a200420026a2802003602002002417c6a21020c000b0b2001417f6a210103402002450d03200020026a417f6a200120026a2d00003a00002002417f6a21020c000b0b200241046a21052002417f7321064100210402400340200120046a2107200020046a2208410371450d0120022004460d03200820072d00003a00002005417f6a2105200641016a2106200441016a21040c000b0b200220046b2101410021030240034020014104490d01200820036a200720036a280200360200200341046a21032001417c6a21010c000b0b200720036a2101200820036a210320022006417c2006417c4b1b20056a417c716b20046b21020b03402002450d01200320012d00003a00002002417f6a2102200341016a2103200141016a21010c000b0b20000b0900200041013602000b0900200041003602000b0900108880808000000b5201017f20004200370200200041086a22024100360200024020012d00004101710d00200020012902003702002002200141086a28020036020020000f0b20002001280208200128020410988080800020000b7701027f0240200241704f0d00024002402002410a4b0d00200020024101743a0000200041016a21030c010b200241106a417071220410918080800021032000200236020420002004410172360200200020033602080b2003200120021099808080001a200320026a41003a00000f0b108880808000000b1a0002402002450d0020002001200210898080800021000b20000b1d00024020002d0000410171450d0020002802081092808080000b20000b3d01027f024020002001460d0020002001280208200141016a20012d0000220241017122031b2001280204200241017620031b109c808080001a0b20000bbb0101037f410a2103024020002d000022044101712205450d002000280200417e71417f6a21030b02400240024002400240200320024f0d0020050d01200441017621050c020b20050d02200041016a21030c030b200028020421050b20002003200220036b20054100200520022001109d8080800020000f0b200028020821030b200320012002109e808080001a200320026a41003a0000024020002d00004101710d00200020024101743a000020000f0b2000200236020420000b8f0201037f0240416e20016b2002490d000240024020002d00004101710d00200041016a21080c010b200028020821080b416f21090240200141e6ffffff074b0d00410b21092001410174220a200220016a22022002200a491b2202410b490d00200241106a41707121090b2009109180808000210202402004450d002002200820041099808080001a0b02402006450d00200220046a200720061099808080001a0b0240200320056b220320046b2207450d00200220046a20066a200820046a20056a20071099808080001a0b02402001410a460d0020081092808080000b200020023602082000200320066a220436020420002009410172360200200220046a41003a00000f0b108880808000000b1a0002402002450d0020002001200210938080800021000b20000b2801017f41002101024003402001410c460d01200020016a4100360200200141046a21010c000b0b0b1d0020004200370200200041086a41003602002000109f8080800020000b0900108880808000000bb60101037f4194888080001094808080004100280298888080002100024003402000450d01024003404100410028029c888080002202417f6a220136029c8880800020024101480d01200020014102746a22004184016a2802002102200041046a2802002100419488808000109580808000200220001181808080000041948880800010948080800041002802988880800021000c000b0b4100412036029c88808000410020002802002200360298888080000c000b0b0bcd0101027f419488808000109480808000024041002802988880800022030d0041a0888080002103410041a088808000360298888080000b02400240410028029c8880800022044120470d004184024101108e808080002203450d0141002104200341002802988880800036020041002003360298888080004100410036029c888080000b4100200441016a36029c88808000200320044102746a22034184016a2001360200200341046a200036020041948880800010958080800041000f0b419488808000109580808000417f0b0f0041a48a808000109a808080001a0b89010020004200370210200042ffffffff0f3702082000200129020037020002402002410871450d00200010a68080800020012802044f0d00024020024104710d00200042003702000c010b1080808080000b024002402002411071450d00200010a68080800020012802044d0d0020024104710d01200042003702000b20000f0b10808080800020000b3400024002402000280204450d0020002802002c0000417f4c0d0141010f0b41000f0b200010a780808000200010a8808080006a0b280002402000280204450d0020002802002c0000417f4c0d0041000f0b200010ad8080800041016a0bc90301047f0240024002402000280204450d00200010ae808080004101210120002802002c00002202417f4c0d010c020b41000f0b0240200241ff0171220141b7014b0d00200141807f6a0f0b024002400240200241ff0171220241bf014b0d000240200041046a22032802002202200141c97e6a22044b0d00108080808000200328020021020b024020024102490d0020002802002d00010d001080808080000b024020044105490d001080808080000b024020002802002d00010d001080808080000b41002101410021020240034020042002460d012001410874200028020020026a41016a2d0000722101200241016a21020c000b0b200141384f0d010c020b0240200241f7014b0d00200141c07e6a0f0b0240200041046a22032802002202200141897e6a22044b0d00108080808000200328020021020b024020024102490d0020002802002d00010d001080808080000b024020044105490d001080808080000b024020002802002d00010d001080808080000b41002101410021020240034020042002460d012001410874200028020020026a41016a2d0000722101200241016a21020c000b0b20014138490d010b200141ff7d490d010b10808080800020010f0b20010b5102017f017e23808080800041306b220124808080800020012000290200220237031020012002370308200141186a200141086a411410a58080800010a6808080002100200141306a24808080800020000b6a01037f02400240024020012802002204450d0041002105200320026a200128020422064b0d0120062002490d014100210120062003490d02200620026b20032003417f461b2101200420026a21050c020b410021050b410021010b20002001360204200020053602000b3301017f0240200110a880808000220220012802044d0d001080808080000b20002001200110a780808000200210aa808080000bd003020a7f017e23808080800041c0006b220324808080800002402001280208220420024d0d00200341386a200110ab80808000200320032903383703182001200341186a10a98080800036020c200341306a200110ab80808000410021044100210541002106024020032802302207450d00410021054100210620032802342208200128020c2209490d00200820092009417f461b2105200721060b20012006360210200141146a2005360200200141086a41003602000b200141106a2106200141146a21092001410c6a2107200141086a210802400340200420024f0d012009280200450d01200341306a200110ab8080800041002104024002402003280230220a450d00410021052003280234220b2007280200220c490d01200a200c6a2105200b200c6b21040c010b410021050b20092004360200200620053602002003200436022c2003200536022820032003290328370310200341306a20064100200341106a10a98080800010aa8080800020062003290330220d37020020072007280200200d422088a76a3602002008200828020041016a22043602000c000b0b20032006290200220d3703202003200d3703082000200341086a411410a5808080001a200341c0006a2480808080000b4701017f4100210102402000280204450d00024020002802002d0000220041bf014b0d00200041b801490d01200041c97e6a0f0b200041f801490d00200041897e6a21010b20010b5401017f024020002802040d001080808080000b0240200028020022012d0000418101470d000240200041046a28020041014b0d00108080808000200028020021010b20012c00014100480d001080808080000b0bbc0101047f024002402000280204450d00200010ae80808000200028020022012c000022024100480d0120024100470f0b41000f0b410121030240200241807f460d000240200241ff0171220441b7014b0d000240200041046a28020041014b0d00108080808000200028020021010b20012d00014100470f0b41002103200441bf014b0d000240200041046a280200200241ff017141ca7e6a22024b0d00108080808000200028020021010b200120026a2d000041004721030b20030b2701017f200020012802002203200320012802046a10b1808080002000200210b28080800020000b34002000200220016b220210b380808000200028020020002802046a200120021089808080001a2000200028020420026a3602040bb60201087f02402001450d002000410c6a2102200041106a2103200041046a21040340200328020022052002280200460d010240200541786a28020020014f0d00108080808000200328020021050b200541786a2206200628020020016b220136020020010d01200320063602002000410120042802002005417c6a28020022016b220510b480808000220741016a20054138491b2206200428020022086a10b580808000200120002802006a220920066a2009200820016b1093808080001a02400240200541374b0d00200028020020016a200541406a3a00000c010b0240200741f7016a220641ff014b0d00200028020020016a20063a00002000280200200720016a6a210103402005450d02200120053a0000200541087621052001417f6a21010c000b0b1080808080000b410121010c000b0b0b21000240200028020420016a220120002802084d0d002000200110b6808080000b0b2501017f41002101024003402000450d0120004108762100200141016a21010c000b0b20010b13002000200110b680808000200020013602040b4501017f0240200028020820014f0d002001108c808080002202200028020020002802041089808080001a200010c080808000200041086a2001360200200020023602000b0b29002000410110b380808000200028020020002802046a20013a00002000200028020441016a3602040b3c01017f0240200110b480808000220320026a2202418002480d001080808080000b2000200241ff017110b78080800020002001200310b9808080000b44002000200028020420026a10b580808000200028020020002802046a417f6a2100024003402001450d01200020013a0000200141087621012000417f6a21000c000b0b0bf90101037f23808080800041106b22032480808080002001280200210420012802042105024002402002450d004100210102400340200420016a2102200120054f0d0120022d00000d01200141016a21010c000b0b200520016b21050c010b200421020b0240024002400240024020054101470d0020022c000022014100480d012000200141ff017110b7808080000c040b200541374b0d010b200020054180017341ff017110b7808080000c010b2000200541b70110b8808080000b2003200536020c200320023602082003200329030837030020002003410010b0808080001a0b2000410110b280808000200341106a24808080800020000bc40101037f02400240024020012002844200510d00200142ff005620024200522002501b0d0120002001a741ff017110b7808080000c020b200041800110b7808080000c010b024002402001200210bc80808000220341374b0d00200020034180017341ff017110b7808080000c010b0240200310bd80808000220441b7016a2205418002490d001080808080000b2000200541ff017110b78080800020002003200410be808080000b200020012002200310bf808080000b2000410110b28080800020000b3501017f41002102024003402000200184500d0120004208882001423886842100200241016a2102200142088821010c000b0b20020b2501017f41002101024003402000450d0120004108762100200141016a21010c000b0b20010b44002000200028020420026a10b580808000200028020020002802046a417f6a2100024003402001450d01200020013a0000200141087621012000417f6a21000c000b0b0b54002000200028020420036a10b580808000200028020020002802046a417f6a2100024003402001200284500d01200020013c0000200142088820024238868421012000417f6a2100200242088821020c000b0b0b1700024020002802002200450d002000108f808080000b0b240041a48a80800010a0808080001a418180808000410041808880800010a3808080001a0b1d0020004200370200200041086a4100360200200010c38080800020000b2801017f41002101024003402001410c460d01200020016a4100360200200141046a21010c000b0b0b0f0041b08a808000109a808080001a0b27002002427f7c21020340200242017c220242e400560d000b200041186a2001109b808080001a0b950403037f017e027f2380808080004180016b22002480808080001087808080001081808080002201108c808080002202108280808000200041206a200041086a2002200110c7808080002201410010ac8080800002400240200041206a10c88080800022034200510d000240200341bc8a80800010c980808000520d00200041206a10ca8080800010cb808080001a0c020b0240200341c18a80800010c980808000520d00200041e8006a10c280808000210220004200370378200041206a2001410110ac80808000200041206a200210cc80808000200041206a2001410210ac808080002000200041206a10c880808000370378200041206a10ca808080002104200041c8006a2002109780808000210120002903782103200041206a200041d8006a20011097808080002205200310c5808080002005109a808080001a2001109a808080001a200410cb808080001a2002109a808080001a0c020b200341cd8a80800010c980808000520d00200041206a10ca808080002104200041c8006a200041386a1097808080002102200041e8006a10cd808080002201200041d8006a2002109780808000220510ce808080002005109a808080001a0240200128020c200141106a280200460d001080808080000b20012802002001280204108380808000200110cf808080001a2002109a808080001a200410cb808080001a0c010b1080808080000b20004180016a2480808080000b4801017f23808080800041106b22032480808080002003200236020c200320013602082003200329030837030020002003411c10a5808080002100200341106a24808080800020000bb00103017f017e017f23808080800041106b2201248080808000200010ae8080800002400240200010af80808000450d002000280204450d0020002802002d000041c001490d010b1080808080000b200141086a200010d1808080000240200128020c22004109490d001080808080000b4200210220012802082103024003402000450d012000417f6a210020024208862003310000842102200341016a21030c000b0b200141106a24808080800020020b3a01027e42a5c688a1c89ca7f94b21010240034020003000002202500d01200041016a2100200142b383808080207e20028521010c000b0b20010bce0201087f23808080800041c0006b2201248080808000200010c2808080002102200042afb59bdd9e8485b9f800370310200041186a10c2808080002103200141286a10cd808080002204200029031010d4808080000240200428020c200441106a280200460d001080808080000b02400240024020042802002205200428020422061084808080002207450d0020014100360220200142003703182007417f4c0d02200141206a200710918080800041002007108a80808000220220076a22083602002001200836021c2001200236021820052006200220071085808080001a20012001280218220741016a200128021c2007417f736a10c780808000200310cc80808000200141186a10d0808080001a200410cf808080001a0c010b200410cf808080001a20032002109b808080001a0b200141c0006a24808080800020000f0b200141186a10a180808000000be20605037f017e017f017e077f23808080800041e0006b2201248080808000200141186a10cd80808000210241002103200141c0006a41186a410036020042002104200141c0006a41106a4200370300200141c8006a42003703002001420037034041012105024020002903102206428001540d00024003402006200484500d0120064208882004423886842106200341016a2103200442088821040c000b0b024020034138490d00200310d68080800020036a21030b200341016a21050b200041186a210720012005360240200141c0006a41047210d7808080001a2002200510d5808080002002200041106a29030010d4808080000240200228020c200241106a280200460d001080808080000b2002280204210820022802002109200110cd808080002103200141d8006a4100360200200141c0006a41106a4200370300200141c8006a4200370300200142003703404101210a0240200141306a2007109780808000220528020420012d0030220b410176200b410171220c1b220b450d004101210a024002400240200b4101470d002005280208200541016a200c1b2c0000417f4a0d030c010b200b41374b0d010b200b41016a210a0c010b200b200b10d6808080006a41016a210a0b2001200a3602402005109a808080001a200141c0006a41047210d7808080001a4101109180808000220541fe013a0000200120053602402001200541016a220b3602482001200b3602440240200328020c200341106a280200460d001080808080002001280244210b200128024021050b0240200b20056b220b2003280204220c6a220d20032802084d0d002003200d10d280808000200341046a280200210c0b2003280200200c6a2005200b1089808080001a200341046a22052005280200200b6a36020020032001280244200a6a20012802406b10d5808080002003200141306a2007109780808000220510ce808080002005109a808080001a024002402003410c6a220a280200200341106a220b280200460d0010808080800020032802002105200a280200200b280200460d011080808080000c010b200328020021050b200920082005200341046a280200108680808000200141c0006a10d0808080001a200310cf808080001a200210cf808080001a2007109a808080001a2000109a808080001a200141e0006a24808080800020000bcd0301057f23808080800041206b2202248080808000024002400240024002402000280204450d0020002802002d000041c0014f0d00200241186a200010d180808000200010a8808080002103024020022802182200450d00200228021c220420034f0d020b41002100200241106a41003602002002420037030841002105410021040c020b200241086a10c2808080001a0c030b200241106a4100360200200242003703080240200420032003417f461b220541704f0d00200020056a21042005410a4d0d01200541106a417071220610918080800021032002200536020c20022006410172360208200220033602100c020b200241086a109680808000000b200220054101743a0008200241086a41017221030b0240034020042000460d01200320002d00003a0000200341016a2103200041016a21000c000b0b200341003a00000b0240024020012d00004101710d00200141003b01000c010b200128020841003a00002001410036020420012d0000410171450d00200141086a280200109280808000200141003602000b20012002290308370200200141086a200241086a41086a280200360200200241086a10c380808000200241086a109a808080001a200241206a2480808080000b2d0020004100360208200042003702002000410010d280808000200041146a41003602002000420037020c20000b6501037f23808080800041106b220224808080800020022001280208200141016a20012d0000220341017122041b36020820022001280204200341017620041b36020c2002200229030837030020002002410010ba808080001a200241106a2480808080000b2d01017f0240200028020c2201450d00200041106a200136020020011092808080000b200010d38080800020000b2201017f024020002802002201450d002000200136020420011092808080000b20000b870201057f0240200110a8808080002202200128020422034d0d00108080808000200141046a28020021030b2001280200210402400240024002400240024002402003450d004100210120042c00002205417f4c0d012004450d030c040b410021010c010b0240200541ff0171220641bf014b0d0041002101200541ff017141b801490d01200641c97e6a21010c010b41002101200541ff017141f801490d00200641897e6a21010b200141016a210120040d010b410021050c010b41002105200120026a20034b0d0020032001490d004100210620032002490d01200320016b20022002417f461b2106200420016a21050c010b410021060b20002006360204200020053602000b4401017f0240200028020820014f0d002001108c80808000200028020020002802041089808080002102200010d380808000200041086a2001360200200020023602000b0b0d002000280200108f808080000b0f0020002001420010bb808080001a0b19000240200028020820014f0d002000200110d2808080000b0b2501017f41002101024003402000450d0120004108762100200141016a21010c000b0b20010b850301067f200028020422012000280210220241087641fcffff07716a210302400240200028020822042001460d002001200028021420026a220541087641fcffff07716a280200200541ff07714102746a2105200041146a21062003280200200241ff07714102746a21020c010b200041146a210641002102410021050b0240034020052002460d01200241046a220220032802006b418020470d0020032802042102200341046a21030c000b0b20064100360200200041086a210302400340200420016b41027522024103490d012001280200109280808000200041046a2201200128020041046a2201360200200328020021040c000b0b02400240024020024101460d0020024102470d0241800821020c010b41800421020b200041106a20023602000b0240034020042001460d012001280200109280808000200141046a21010c000b0b200041086a22022802002101200041046a28020021040240034020042001460d0120022001417c6a22013602000c000b0b200028020010928080800020000b240041b08a80800010c2808080001a418280808000410041808880800010a3808080001a0b0bee0202004180080bbc02000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000041bc0a0b24696e697400666f7266756e6374696f6e006765745f737472696e675f73746f7261676500";

    public static String BINARY = BINARY_0;

    public static final String FUNC_FORFUNCTION = "forfunction";

    public static final String FUNC_GET_STRING_STORAGE = "get_string_storage";

    protected Contract_timeout_termination(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    protected Contract_timeout_termination(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<Contract_timeout_termination> deploy(Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Contract_timeout_termination.class, web3j, credentials, contractGasProvider, encodedConstructor);
    }

    public static RemoteCall<Contract_timeout_termination> deploy(Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        String encodedConstructor = WasmFunctionEncoder.encodeConstructor(BINARY, Arrays.asList());
        return deployRemoteCall(Contract_timeout_termination.class, web3j, transactionManager, contractGasProvider, encodedConstructor);
    }

    public RemoteCall<TransactionReceipt> forfunction(String name, Uint64 value) {
        final WasmFunction function = new WasmFunction(FUNC_FORFUNCTION, Arrays.asList(name,value), Void.class);
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> get_string_storage() {
        final WasmFunction function = new WasmFunction(FUNC_GET_STRING_STORAGE, Arrays.asList(), String.class);
        return executeRemoteCall(function, String.class);
    }

    public static Contract_timeout_termination load(String contractAddress, Web3j web3j, Credentials credentials, GasProvider contractGasProvider) {
        return new Contract_timeout_termination(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static Contract_timeout_termination load(String contractAddress, Web3j web3j, TransactionManager transactionManager, GasProvider contractGasProvider) {
        return new Contract_timeout_termination(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}

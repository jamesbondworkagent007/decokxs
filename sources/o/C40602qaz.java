package o;

import com.okinc.business.market.bean.CoinQuote;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27964kJw;

/* JADX INFO: renamed from: o.qaz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40602qaz extends AbstractC40578qab {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40602qaz() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r2v0 kotlin.jvm.functions.Function2))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
  (wrap:o.kJw$StateListAnimator:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.kJw$StateListAnimator) : (r4v0 o.kJw$StateListAnimator))
 A[MD:(kotlin.jvm.functions.Function2<? super com.okinc.business.market.bean.CoinQuote, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, o.kJw$StateListAnimator):void (m)] (LINE:16) call: o.qaz.<init>(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, o.kJw$StateListAnimator):void type: THIS */
    public /* synthetic */ C40602qaz(Function2 function2, Function0 function0, AbstractC27964kJw.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : stateListAnimator);
    }

    public C40602qaz(Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2, final Function0<Unit> function0, AbstractC27964kJw.StateListAnimator stateListAnimator) {
        register(C27622jyf.class, new kJB(new Function1() { // from class: o.qay
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40602qaz.KWHzl(function0, (android.view.View) obj);
            }
        }));
        InterfaceC59537zis interfaceC59537zisRegister = register(CoinQuote.class);
        kJF kjf = new kJF(stateListAnimator, false, 2, null);
        kjf.copydefault("Explore_Market_Card");
        kjf.OLrzqt("futures");
        kjf.EZpvd(function2);
        kjf.EZpvd("explore");
        Unit unit = Unit.INSTANCE;
        kJA kja = new kJA(stateListAnimator);
        kja.copydefault("Explore_Market_Card");
        kja.OLrzqt("futures");
        kja.EZpvd(function2);
        kja.EZpvd("explore");
        interfaceC59537zisRegister.copydefault(kjf, kja).AEQbTJ(new InterfaceC59531zim() { // from class: o.qaA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59531zim
            public final int OLrzqt(int i, java.lang.Object obj) {
                return C40602qaz.KWHzl(i, (CoinQuote) obj);
            }
        });
    }

    public static final Unit KWHzl(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final int KWHzl(int i, CoinQuote coinQuote) {
        Intrinsics.checkNotNullParameter(coinQuote, "");
        java.lang.String instType = coinQuote.getInstType();
        if (Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "FUTURES")) {
            return 1;
        }
        Intrinsics.EZpvd((java.lang.Object) instType, (java.lang.Object) "SWAP");
        return 0;
    }
}

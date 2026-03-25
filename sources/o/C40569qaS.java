package o;

import com.okinc.business.market.bean.CoinQuote;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC27964kJw;

/* JADX INFO: renamed from: o.qaS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40569qaS extends AbstractC40578qab {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C40569qaS() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:kotlin.jvm.functions.Function2:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function2) : (r2v0 kotlin.jvm.functions.Function2))
  (wrap:kotlin.jvm.functions.Function0:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.jvm.functions.Function0) : (r3v0 kotlin.jvm.functions.Function0))
  (wrap:o.kJw$StateListAnimator:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null o.kJw$StateListAnimator) : (r4v0 o.kJw$StateListAnimator))
 A[MD:(kotlin.jvm.functions.Function2<? super com.okinc.business.market.bean.CoinQuote, ? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function0<kotlin.Unit>, o.kJw$StateListAnimator):void (m)] (LINE:13) call: o.qaS.<init>(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, o.kJw$StateListAnimator):void type: THIS */
    public /* synthetic */ C40569qaS(Function2 function2, Function0 function0, AbstractC27964kJw.StateListAnimator stateListAnimator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : function2, (i & 2) != 0 ? null : function0, (i & 4) != 0 ? null : stateListAnimator);
    }

    public C40569qaS(Function2<? super CoinQuote, ? super java.lang.Integer, Unit> function2, final Function0<Unit> function0, AbstractC27964kJw.StateListAnimator stateListAnimator) {
        register(C27622jyf.class, new kJB(new Function1() { // from class: o.qaV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C40569qaS.copydefault(function0, (android.view.View) obj);
            }
        }));
        kJE kje = new kJE(null, stateListAnimator, 1, 0 == true ? 1 : 0);
        kje.copydefault("Explore_Market_Card");
        kje.OLrzqt("spot");
        kje.EZpvd(function2);
        kje.EZpvd("explore");
        Unit unit = Unit.INSTANCE;
        register(CoinQuote.class, kje);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault(Function0 function0, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}

package o;

import com.okinc.market.ticker.CupTickerRepo$refresh$2;
import com.okinc.market.ticker.CupTickerRepo$refreshTickers$2;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qTI extends qTF {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = C56131xwy.AEQbTJ;
    public static final TickersData valueOf = new TickersData((java.lang.String) null, (java.lang.String) null, "1", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "1", "1", "1", "1", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, "USD", (java.lang.String) null, 94459, (DefaultConstructorMarker) null);
    public final C56131xwy AYXKKw;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qTF
    public java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qTF
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        return KWHzl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56131xwy valueOf() {
        return this.AYXKKw;
    }

    public qTI() {
        super("cup-tickers-3s");
        this.AYXKKw = new C56131xwy();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qTI.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final TickersData KWHzl() {
            return qTI.valueOf;
        }
    }

    public static /* synthetic */ java.lang.Object KWHzl(qTI qti, Continuation<? super Unit> continuation) {
        pUU.KWHzl("TickerRepo", "refresh() called");
        Job jobKWHzl = qti.KWHzl();
        if (jobKWHzl != null && jobKWHzl.isActive()) {
            return Unit.INSTANCE;
        }
        qti.copydefault(BuildersKt__Builders_commonKt.launch$default(qti.EZpvd(), C40440qVy.Companion.AEQbTJ(), null, new CupTickerRepo$refresh$2(qti, null), 2, null));
        qti.gEmmrt();
        Job jobKWHzl2 = qti.KWHzl();
        if (jobKWHzl2 == null) {
            return Unit.INSTANCE;
        }
        java.lang.Object objJoin = jobKWHzl2.join(continuation);
        return objJoin == C56442yFn.copydefault() ? objJoin : Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object copydefault(qTI qti, java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) {
        pUU.KWHzl("TickerRepo", "refreshTickers() called with: ccy = " + list);
        java.lang.Object objJoin = BuildersKt__Builders_commonKt.launch$default(qti.EZpvd(), C40440qVy.Companion.AEQbTJ(), null, new CupTickerRepo$refreshTickers$2(qti, list, null), 2, null).join(continuation);
        return objJoin == C56442yFn.copydefault() ? objJoin : Unit.INSTANCE;
    }

    @Override // o.qTF
    public java.lang.String copydefault(@NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        return tickersData.getCcy();
    }

    @Override // o.qTF
    public TickersData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        TickersData tickersDataCopydefault = super.copydefault(str);
        return (tickersDataCopydefault == null && Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "USD")) ? valueOf : tickersDataCopydefault;
    }
}

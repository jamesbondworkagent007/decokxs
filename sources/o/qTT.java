package o;

import com.okinc.market.ticker.TickerRepo$refresh$1;
import com.okinc.market.ticker.TickerRepo$refresh$2;
import com.okinc.market.ticker.TickerRepo$refreshTickers$1;
import com.okinc.market.ticker.TickerRepo$refreshTickers$2;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public class qTT extends qTF {
    public static final int AYXKKw = C56131xwy.AEQbTJ;
    public final java.lang.String DbNXlk;
    public final java.lang.String gEmmrt;
    public final C56131xwy isConnected;
    public final java.lang.String valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qTF
    public java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation) {
        return copydefault(this, list, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.qTF
    public java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation) {
        return OLrzqt(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56131xwy valueOf() {
        return this.isConnected;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("unknown") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:17) call: o.qTT.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ qTT(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "unknown" : str3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qTT(@NotNull java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
        super("tickers-3s");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.valueOf = str;
        this.DbNXlk = str2;
        this.gEmmrt = str3;
        this.isConnected = new C56131xwy();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object OLrzqt(qTT qtt, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TickerRepo$refresh$1 tickerRepo$refresh$1;
        if (continuation instanceof TickerRepo$refresh$1) {
            tickerRepo$refresh$1 = (TickerRepo$refresh$1) continuation;
            int i = tickerRepo$refresh$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickerRepo$refresh$1.label = i - Integer.MIN_VALUE;
            } else {
                tickerRepo$refresh$1 = new TickerRepo$refresh$1(qtt, continuation);
            }
        }
        java.lang.Object obj = tickerRepo$refresh$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickerRepo$refresh$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("TickerRepo", "refresh() called");
            Job jobKWHzl = qtt.KWHzl();
            if (jobKWHzl != null && jobKWHzl.isActive()) {
                return Unit.INSTANCE;
            }
            pUU.KWHzl("NavOptPhase1", qtt.gEmmrt + " -> TickerRepo invoke refresh start...");
            qtt.copydefault(BuildersKt__Builders_commonKt.launch$default(qtt.EZpvd(), C40440qVy.Companion.AEQbTJ(), null, new TickerRepo$refresh$2(qtt, null), 2, null));
            qtt.gEmmrt();
            Job jobKWHzl2 = qtt.KWHzl();
            if (jobKWHzl2 != null) {
                tickerRepo$refresh$1.L$0 = qtt;
                tickerRepo$refresh$1.label = 1;
                if (jobKWHzl2.join(tickerRepo$refresh$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qtt = (qTT) tickerRepo$refresh$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("NavOptPhase1", qtt.gEmmrt + " -> TickerRepo all jobs done 2");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object copydefault(qTT qtt, java.util.List<java.lang.String> list, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        TickerRepo$refreshTickers$1 tickerRepo$refreshTickers$1;
        if (continuation instanceof TickerRepo$refreshTickers$1) {
            tickerRepo$refreshTickers$1 = (TickerRepo$refreshTickers$1) continuation;
            int i = tickerRepo$refreshTickers$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tickerRepo$refreshTickers$1.label = i - Integer.MIN_VALUE;
            } else {
                tickerRepo$refreshTickers$1 = new TickerRepo$refreshTickers$1(qtt, continuation);
            }
        }
        java.lang.Object obj = tickerRepo$refreshTickers$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = tickerRepo$refreshTickers$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.EZpvd("TickerRepo", "refreshTickers() called " + list);
            pUU.KWHzl("NavOptPhase1", qtt.gEmmrt + " -> TickerRepo invoke refreshTickers start...");
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(qtt.EZpvd(), C40440qVy.Companion.AEQbTJ(), null, new TickerRepo$refreshTickers$2(qtt, list, null), 2, null);
            tickerRepo$refreshTickers$1.L$0 = qtt;
            tickerRepo$refreshTickers$1.label = 1;
            if (jobLaunch$default.join(tickerRepo$refreshTickers$1) == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qtt = (qTT) tickerRepo$refreshTickers$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        pUU.KWHzl("NavOptPhase1", qtt.gEmmrt + " -> TickerRepo invoke refreshTickers done");
        return Unit.INSTANCE;
    }

    @Override // o.qTF
    public java.lang.String copydefault(@NotNull TickersData tickersData) {
        Intrinsics.checkNotNullParameter(tickersData, "");
        return tickersData.getInstId();
    }
}

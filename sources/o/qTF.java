package o;

import com.okinc.market.ticker.AbstractTickerRepo$initData$1;
import com.okinc.market.ticker.AbstractTickerRepo$refreshAllTickerData$1;
import com.okinc.market.ticker.AbstractTickerRepo$refreshAllTickerData$3;
import com.okinc.market.ticker.AbstractTickerRepo$subscribeTickerUpdate$1;
import com.okinc.market.ticker.AbstractTickerRepo$subscribeTickerUpdate$2;
import com.okinc.market.ticker.AbstractTickerRepo$subscribeTickerUpdate$3;
import com.okinc.market.ticker.AbstractTickerRepo$subscribeTickerUpdate$4;
import com.okinc.market.ticker.AbstractTickerRepo$subscribeTickerUpdate$5;
import com.okinc.market.ticker.AbstractTickerRepo$subscribeTickerUpdate$6;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public abstract class qTF implements java.io.Closeable {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final ConcurrentHashMap<java.lang.String, Job> AEQbTJ;
    public final CoroutineScope AhwBna;
    public volatile Job EZpvd;
    public final java.lang.String KWHzl;
    public long copydefault;
    public ConcurrentHashMap<java.lang.String, TickersData> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoroutineScope EZpvd() {
        return this.AhwBna;
    }

    public abstract java.lang.Object KWHzl(@NotNull java.util.List<java.lang.String> list, @NotNull Continuation<? super Unit> continuation);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Job KWHzl() {
        return this.EZpvd;
    }

    public abstract java.lang.Object OLrzqt(@NotNull Continuation<? super Unit> continuation);

    public abstract java.lang.String copydefault(@NotNull TickersData tickersData);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConcurrentHashMap<java.lang.String, TickersData> copydefault() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Job job) {
        this.EZpvd = job;
    }

    public qTF(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.djBIcL = new ConcurrentHashMap<>();
        this.AEQbTJ = new ConcurrentHashMap<>();
        this.AhwBna = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (java.lang.Object) null)).plus(new StateListAnimator(CoroutineExceptionHandler.Key)));
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qTF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public StateListAnimator(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            pUU.AEQbTJ("TickerRepo", "TickerRepo scope Error: ", th);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        pUU.EZpvd("TickerRepo", "close() called");
        CoroutineScopeKt.cancel$default(this.AhwBna, null, 1, null);
    }

    public boolean OLrzqt() {
        pUU.EZpvd("TickerRepo", "isInit() called");
        return this.copydefault != 0 && (this.djBIcL.isEmpty() ^ true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(@NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AbstractTickerRepo$initData$1 abstractTickerRepo$initData$1;
        long jCurrentTimeMillis;
        qTF qtf;
        long j;
        if (continuation instanceof AbstractTickerRepo$initData$1) {
            abstractTickerRepo$initData$1 = (AbstractTickerRepo$initData$1) continuation;
            int i = abstractTickerRepo$initData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                abstractTickerRepo$initData$1.label = i - Integer.MIN_VALUE;
            } else {
                abstractTickerRepo$initData$1 = new AbstractTickerRepo$initData$1(this, continuation);
            }
        }
        java.lang.Object obj = abstractTickerRepo$initData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = abstractTickerRepo$initData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            pUU.EZpvd("TickerRepo", "initData() called");
            if (android.os.SystemClock.elapsedRealtime() - this.copydefault > 60000) {
                abstractTickerRepo$initData$1.L$0 = this;
                abstractTickerRepo$initData$1.J$0 = jCurrentTimeMillis;
                abstractTickerRepo$initData$1.label = 1;
                if (OLrzqt(abstractTickerRepo$initData$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            qtf = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = abstractTickerRepo$initData$1.J$0;
                C56391yDq.AEQbTJ(obj);
                jCurrentTimeMillis = j;
                pUU.EZpvd("TickerRepo", "initData() Finished coast: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                return Unit.INSTANCE;
            }
            jCurrentTimeMillis = abstractTickerRepo$initData$1.J$0;
            qtf = (qTF) abstractTickerRepo$initData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Job job = qtf.EZpvd;
        if (job != null) {
            abstractTickerRepo$initData$1.L$0 = null;
            abstractTickerRepo$initData$1.J$0 = jCurrentTimeMillis;
            abstractTickerRepo$initData$1.label = 2;
            if (job.join(abstractTickerRepo$initData$1) == objCopydefault) {
                return objCopydefault;
            }
            j = jCurrentTimeMillis;
            jCurrentTimeMillis = j;
        }
        pUU.EZpvd("TickerRepo", "initData() Finished coast: " + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return Unit.INSTANCE;
    }

    public TickersData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.djBIcL.get(str);
    }

    public final Flow<java.lang.Long> copydefault(@NotNull java.lang.String str, @NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.callbackFlow(new AbstractTickerRepo$subscribeTickerUpdate$1(this, list, str, null)), new AbstractTickerRepo$subscribeTickerUpdate$2(null)), Dispatchers.getDefault());
    }

    public final Flow<java.lang.Long> OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.callbackFlow(new AbstractTickerRepo$subscribeTickerUpdate$3(this, str2, str, null)), new AbstractTickerRepo$subscribeTickerUpdate$4(str2, null)), Dispatchers.getDefault());
    }

    public final Flow<java.lang.Long> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return FlowKt.flowOn(FlowKt.m7441catch(FlowKt.callbackFlow(new AbstractTickerRepo$subscribeTickerUpdate$5(this, str2, str3, str, null)), new AbstractTickerRepo$subscribeTickerUpdate$6(str2, null)), Dispatchers.getDefault());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(@NotNull java.lang.String str, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        AbstractTickerRepo$refreshAllTickerData$1 abstractTickerRepo$refreshAllTickerData$1;
        qTF qtf;
        if (continuation instanceof AbstractTickerRepo$refreshAllTickerData$1) {
            abstractTickerRepo$refreshAllTickerData$1 = (AbstractTickerRepo$refreshAllTickerData$1) continuation;
            int i = abstractTickerRepo$refreshAllTickerData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                abstractTickerRepo$refreshAllTickerData$1.label = i - Integer.MIN_VALUE;
            } else {
                abstractTickerRepo$refreshAllTickerData$1 = new AbstractTickerRepo$refreshAllTickerData$1(this, continuation);
            }
        }
        java.lang.Object obj = abstractTickerRepo$refreshAllTickerData$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = abstractTickerRepo$refreshAllTickerData$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            pUU.KWHzl("TickerRepo", "refreshAllTickerData() called");
            Job job = this.EZpvd;
            if (job != null) {
                abstractTickerRepo$refreshAllTickerData$1.L$0 = this;
                abstractTickerRepo$refreshAllTickerData$1.L$1 = str;
                abstractTickerRepo$refreshAllTickerData$1.label = 1;
                if (job.join(abstractTickerRepo$refreshAllTickerData$1) == objCopydefault) {
                    return objCopydefault;
                }
            }
            qtf = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                pUU.KWHzl("TickerRepo", "refreshAllTickerData() finished");
                return Unit.INSTANCE;
            }
            str = (java.lang.String) abstractTickerRepo$refreshAllTickerData$1.L$1;
            qtf = (qTF) abstractTickerRepo$refreshAllTickerData$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        Job job2 = qtf.AEQbTJ.get(str);
        if (job2 == null || !job2.isActive()) {
            Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(qtf.AhwBna, null, null, new AbstractTickerRepo$refreshAllTickerData$3(qtf, null), 3, null);
            qtf.AEQbTJ.put(str, jobLaunch$default);
            abstractTickerRepo$refreshAllTickerData$1.L$0 = jobLaunch$default;
            abstractTickerRepo$refreshAllTickerData$1.L$1 = null;
            abstractTickerRepo$refreshAllTickerData$1.label = 3;
            if (jobLaunch$default.join(abstractTickerRepo$refreshAllTickerData$1) == objCopydefault) {
                return objCopydefault;
            }
            pUU.KWHzl("TickerRepo", "refreshAllTickerData() finished");
            return Unit.INSTANCE;
        }
        abstractTickerRepo$refreshAllTickerData$1.L$0 = null;
        abstractTickerRepo$refreshAllTickerData$1.L$1 = null;
        abstractTickerRepo$refreshAllTickerData$1.label = 2;
        if (job2.join(abstractTickerRepo$refreshAllTickerData$1) == objCopydefault) {
            return objCopydefault;
        }
        return Unit.INSTANCE;
    }

    public final void EZpvd(java.lang.String str) {
        pUU.EZpvd("TickerRepo", "cancelJob() called with: key = " + str);
        Job job = this.AEQbTJ.get(str);
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public final void gEmmrt() {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        this.copydefault = jElapsedRealtime;
        pUU.EZpvd("TickerRepo", "updateDataStamp = " + jElapsedRealtime);
    }
}

package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.source.task.FutureDataTaskByRepo$2;
import com.okinc.unify_trade.trade.source.task.FutureDataTaskByRepo$bindAllTickers$1;
import com.okinc.unify_trade.trade.source.task.FutureDataTaskByRepo$bindAllTickers$2;
import com.okinc.unify_trade.trade.source.task.FutureDataTaskByRepo$startCheckResultLoop$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xSU implements InterfaceC54726xTa {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final qTI AEQbTJ;
    public final CoroutineScope AYXKKw;
    public Job AhwBna;
    public final CoroutineScope AkhnZx;
    public Job AuCTel;
    public final java.lang.String DbNXlk;
    public final java.lang.String EZpvd;
    public final MutableStateFlow<java.lang.Long> OLrzqt;
    public Job copydefault;
    public volatile long djBIcL;
    public final qTT ejfBZ;
    public Job fARcdN;
    public final java.lang.String fJNWhG;
    public final Function2<java.lang.Boolean, java.lang.Exception, Unit> fetchVPNInfo;
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> gEmmrt;
    public final java.util.List<BizInstrument> isConnected;
    public final boolean valueOf;
    public Job values;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.unify_trade.biz.BizInstrument> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public xSU(@NotNull java.lang.String str, @NotNull java.util.List<? extends BizInstrument> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, @NotNull MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, boolean z, @NotNull CoroutineScope coroutineScope, @NotNull qTI qti, @NotNull qTT qtt, java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(qti, "");
        Intrinsics.checkNotNullParameter(qtt, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.DbNXlk = str;
        this.isConnected = list;
        this.fetchVPNInfo = function2;
        this.gEmmrt = mutableLiveData;
        this.valueOf = z;
        this.AkhnZx = coroutineScope;
        this.AEQbTJ = qti;
        this.ejfBZ = qtt;
        this.fJNWhG = str2;
        this.EZpvd = str3;
        this.OLrzqt = StateFlowKt.MutableStateFlow(0L);
        this.AYXKKw = coroutineScope;
        OLrzqt();
        if (qtt instanceof qTX) {
            ((qTX) qtt).copydefault(new Function0() { // from class: o.xSS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return xSU.EZpvd(this.AEQbTJ);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new FutureDataTaskByRepo$2(this, null), 3, null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xSU.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public static final Unit EZpvd(xSU xsu) {
        xsu.OLrzqt.setValue(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC54726xTa
    public void KWHzl() {
        AEQbTJ();
        Job job = this.fARcdN;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job2 = this.AhwBna;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job3 = this.values;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    private final void OLrzqt() {
        this.fARcdN = BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, null, null, new FutureDataTaskByRepo$startCheckResultLoop$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(long j) {
        try {
            Result.Application application = Result.Companion;
            if (!this.gEmmrt.hasActiveObservers()) {
                KWHzl();
            } else if (this.djBIcL != j || this.djBIcL == 0) {
                if (j != 0) {
                    this.fetchVPNInfo.invoke(java.lang.Boolean.TRUE, null);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    @Override // o.InterfaceC54726xTa
    public TickersData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.ejfBZ.copydefault(str);
    }

    @Override // o.InterfaceC54726xTa
    public TickersData EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.copydefault(str);
    }

    @Override // o.InterfaceC54726xTa
    public boolean copydefault() {
        return this.ejfBZ.OLrzqt();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd() {
        pUU.KWHzl("NavOptPhase1", this.EZpvd + " -> SpotDataTaskByRepo bindAllTickers invoked");
        if (this.valueOf) {
            Job job = this.copydefault;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            Job job2 = this.AuCTel;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.copydefault = BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, Dispatchers.getDefault(), null, new FutureDataTaskByRepo$bindAllTickers$1(this, null), 2, null);
            this.AuCTel = BuildersKt__Builders_commonKt.launch$default(this.AYXKKw, Dispatchers.getDefault(), null, new FutureDataTaskByRepo$bindAllTickers$2(this, null), 2, null);
        }
    }

    public void AEQbTJ() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job2 = this.AuCTel;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }
}

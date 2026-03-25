package o;

import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.source.task.SpotDataTaskByRepo$2;
import com.okinc.unify_trade.trade.source.task.SpotDataTaskByRepo$bindAllTickers$1;
import com.okinc.unify_trade.trade.source.task.SpotDataTaskByRepo$bindAllTickers$2;
import com.okinc.unify_trade.trade.source.task.SpotDataTaskByRepo$bindAreaTickers$1;
import com.okinc.unify_trade.trade.source.task.SpotDataTaskByRepo$bindAreaTickers$2;
import com.okinc.unify_trade.trade.source.task.SpotDataTaskByRepo$refreshAllTickers$1;
import com.okinc.unify_trade.trade.source.task.SpotDataTaskByRepo$startCheckResultLoop$1;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
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

/* JADX INFO: renamed from: o.xTv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C54747xTv implements xSY {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final qTI AEQbTJ;
    public final MutableLiveData<SourceResp<AbstractC54646xQb>> AYXKKw;
    public final boolean AhwBna;
    public final boolean AkhnZx;
    public Job AuCTel;
    public Job DbNXlk;
    public final MutableStateFlow<java.lang.Long> EZpvd;
    public final java.lang.String OLrzqt;
    public Job copydefault;
    public Job djBIcL;
    public Job fARcdN;
    public final qTT fJNWhG;
    public final CoroutineScope fetchVPNInfo;
    public volatile long gEmmrt;
    public final java.util.List<BizInstrument> isConnected;
    public final MutableLiveData<SourceResp<java.lang.Object>> valueOf;
    public final Function2<java.lang.Boolean, java.lang.Exception, Unit> values;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.unify_trade.biz.BizInstrument> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public C54747xTv(@NotNull java.util.List<? extends BizInstrument> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData, MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData2, boolean z, boolean z2, @NotNull CoroutineScope coroutineScope, @NotNull qTI qti, @NotNull qTT qtt, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(qti, "");
        Intrinsics.checkNotNullParameter(qtt, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.isConnected = list;
        this.values = function2;
        this.AYXKKw = mutableLiveData;
        this.valueOf = mutableLiveData2;
        this.AhwBna = z;
        this.AkhnZx = z2;
        this.fetchVPNInfo = coroutineScope;
        this.AEQbTJ = qti;
        this.fJNWhG = qtt;
        this.OLrzqt = str;
        this.EZpvd = StateFlowKt.MutableStateFlow(0L);
        valueOf();
        if (qtt instanceof qTX) {
            ((qTX) qtt).copydefault(new Function0() { // from class: o.xTw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C54747xTv.AEQbTJ(this.EZpvd);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SpotDataTaskByRepo$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.xTv$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xTv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final Unit AEQbTJ(C54747xTv c54747xTv) {
        c54747xTv.EZpvd.setValue(java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        return Unit.INSTANCE;
    }

    @Override // o.xSY
    public void AEQbTJ() {
        KWHzl();
        Job job = this.fARcdN;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job2 = this.djBIcL;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job3 = this.DbNXlk;
        if (job3 != null) {
            Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    private final boolean AYXKKw() {
        MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData;
        MutableLiveData<SourceResp<AbstractC54646xQb>> mutableLiveData2 = this.AYXKKw;
        return mutableLiveData2 == null ? (mutableLiveData = this.valueOf) == null || !mutableLiveData.hasActiveObservers() : !mutableLiveData2.hasActiveObservers();
    }

    private final void valueOf() {
        pUU.KWHzl("NavOptPhase1", this.OLrzqt + " -> SpotDataTaskByRepo startCheckResultLoop invoke");
        this.fARcdN = BuildersKt__Builders_commonKt.launch$default(this.fetchVPNInfo, null, null, new SpotDataTaskByRepo$startCheckResultLoop$1(this, null), 3, null);
    }

    public final void AEQbTJ(long j) {
        try {
            Result.Application application = Result.Companion;
            if (AYXKKw()) {
                AEQbTJ();
                return;
            }
            if (this.gEmmrt != j || this.gEmmrt == 0) {
                this.gEmmrt = j;
                if (j != 0) {
                    this.values.invoke(java.lang.Boolean.TRUE, null);
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            }
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
    }

    @Override // o.xSY
    public TickersData copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fJNWhG.copydefault(str);
    }

    @Override // o.xSY
    public TickersData KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.AEQbTJ.copydefault(str);
    }

    @Override // o.xSY
    public boolean copydefault() {
        return this.fJNWhG.OLrzqt();
    }

    public void KWHzl() {
        Job job = this.copydefault;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job2 = this.AuCTel;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    @Override // o.xSY
    public void EZpvd() {
        pUU.KWHzl("NavOptPhase1", this.OLrzqt + " -> SpotDataTaskByRepo refreshAllTickers invoke");
        BuildersKt__Builders_commonKt.launch$default(this.fetchVPNInfo, Dispatchers.getDefault(), null, new SpotDataTaskByRepo$refreshAllTickers$1(this, null), 2, null);
    }

    public final java.lang.Object KWHzl(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objCopydefault = this.fJNWhG.copydefault("SpotDataTaskByRepo", continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    public final java.lang.Object OLrzqt(Continuation<? super Unit> continuation) throws java.lang.Throwable {
        java.lang.Object objCopydefault = this.AEQbTJ.copydefault("SpotDataTaskByRepo", continuation);
        return objCopydefault == C56442yFn.copydefault() ? objCopydefault : Unit.INSTANCE;
    }

    @Override // o.xSY
    public void AEQbTJ(@NotNull java.util.List<? extends BizInstrument> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        pUU.KWHzl("NavOptPhase1", this.OLrzqt + " -> SpotDataTaskByRepo bindAreaTickers invoked " + i + " - " + i2);
        if (this.AhwBna) {
            java.util.List listQfsBiF = CollectionsKt___CollectionsKt.QfsBiF(list);
            Job job = this.copydefault;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            Job job2 = this.AuCTel;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.copydefault = BuildersKt__Builders_commonKt.launch$default(this.fetchVPNInfo, Dispatchers.getDefault(), null, new SpotDataTaskByRepo$bindAreaTickers$1(this, listQfsBiF, null), 2, null);
            this.AuCTel = BuildersKt__Builders_commonKt.launch$default(this.fetchVPNInfo, Dispatchers.getDefault(), null, new SpotDataTaskByRepo$bindAreaTickers$2(this, listQfsBiF, null), 2, null);
        }
    }

    @Override // o.xSY
    public void OLrzqt() {
        pUU.KWHzl("NavOptPhase1", this.OLrzqt + " -> SpotDataTaskByRepo bindAllTickers invoked");
        if (this.AhwBna) {
            Job job = this.copydefault;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            Job job2 = this.AuCTel;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.copydefault = BuildersKt__Builders_commonKt.launch$default(this.fetchVPNInfo, Dispatchers.getDefault(), null, new SpotDataTaskByRepo$bindAllTickers$1(this, null), 2, null);
            this.AuCTel = BuildersKt__Builders_commonKt.launch$default(this.fetchVPNInfo, Dispatchers.getDefault(), null, new SpotDataTaskByRepo$bindAllTickers$2(this, null), 2, null);
        }
    }
}

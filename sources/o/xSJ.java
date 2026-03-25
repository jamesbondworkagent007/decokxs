package o;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.MutableLiveData;
import com.okinc.tradeapi.bean.SourceResp;
import com.okinc.unify_trade.biz.subscribe.TickersData;
import com.okinc.unify_trade.trade.source.task.CoinMarketTaskByRepo$1;
import com.okinc.unify_trade.trade.source.task.CoinMarketTaskByRepo$bindAreaTickers$1;
import com.okinc.unify_trade.trade.source.task.CoinMarketTaskByRepo$refreshAllCupTickers$1;
import com.okinc.unify_trade.trade.source.task.CoinMarketTaskByRepo$startCheckResultLoop$1;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class xSJ implements xSZ {
    public final boolean AYXKKw;
    public final Function2<java.lang.Boolean, java.lang.Exception, Unit> AhwBna;
    public final qTI EZpvd;
    public Job KWHzl;
    public final MutableStateFlow<java.lang.Long> OLrzqt;
    public final java.util.List<java.lang.String> copydefault;
    public final LifecycleCoroutineScope djBIcL;
    public Job fetchVPNInfo;
    public final boolean gEmmrt;
    public final MutableLiveData<SourceResp<java.lang.Object>> valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<java.lang.Long> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.Boolean, ? super java.lang.Exception, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public xSJ(@NotNull LifecycleCoroutineScope lifecycleCoroutineScope, @NotNull qTI qti, @NotNull java.util.List<java.lang.String> list, @NotNull Function2<? super java.lang.Boolean, ? super java.lang.Exception, Unit> function2, @NotNull MutableLiveData<SourceResp<java.lang.Object>> mutableLiveData, boolean z) {
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "");
        Intrinsics.checkNotNullParameter(qti, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.djBIcL = lifecycleCoroutineScope;
        this.EZpvd = qti;
        this.copydefault = list;
        this.AhwBna = function2;
        this.valueOf = mutableLiveData;
        this.gEmmrt = z;
        this.AYXKKw = list.size() > 30;
        this.OLrzqt = StateFlowKt.MutableStateFlow(0L);
        AEQbTJ();
        BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, null, null, new CoinMarketTaskByRepo$1(this, null), 3, null);
        if (z) {
            AEQbTJ(list);
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.xSJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    private final void AEQbTJ() {
        this.fetchVPNInfo = this.djBIcL.launchWhenResumed(new CoinMarketTaskByRepo$startCheckResultLoop$1(this, null));
    }

    @Override // o.xSZ
    public boolean values() {
        return this.EZpvd.OLrzqt();
    }

    @Override // o.xSZ
    public TickersData EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.EZpvd.copydefault(str);
    }

    @Override // o.xSZ
    public void KWHzl() {
        Job job = this.fetchVPNInfo;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job2 = this.KWHzl;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    @Override // o.xSZ
    public void AuCTel() {
        Job job = this.KWHzl;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, C40440qVy.Companion.AEQbTJ(), null, new CoinMarketTaskByRepo$refreshAllCupTickers$1(this, null), 2, null);
    }

    @Override // o.xSZ
    public void AEQbTJ(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (this.gEmmrt) {
            Job job = this.KWHzl;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.KWHzl = BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new CoinMarketTaskByRepo$bindAreaTickers$1(this, list, null), 3, null);
        }
    }
}

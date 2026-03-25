package o;

import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_setting.data.CurveResetInfo;
import com.okinc.planet.biz_setting.reset.SocialDataResetViewModel$fetchPnlRatioCurveData$2;
import com.okinc.planet.biz_setting.reset.SocialDataResetViewModel$fetchResetDataInfo$1;
import com.okinc.planet.biz_setting.reset.SocialDataResetViewModel$resetData$1;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC46197tLk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class tIH extends AbstractC33073mpa {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public final MutableSharedFlow<AbstractC46197tLk<Unit>> AEQbTJ;
    public final StateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> AYXKKw;
    public final SharedFlow<AbstractC46197tLk<Unit>> AhwBna;
    public final MutableStateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> EZpvd;
    public final MutableStateFlow<AbstractC46197tLk<CurveResetInfo>> KWHzl;
    public final tQP copydefault;
    public final CoroutineDispatcher djBIcL;
    public final StateFlow<AbstractC46197tLk<CurveResetInfo>> gEmmrt;
    public final tBH valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public tIH() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC46197tLk<Unit>> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> OLrzqt() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<CurveResetInfo>> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (wrap:o.tQP:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tQP:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:26) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.aJFbMH():o.tQP A[MD:():o.tQP (m), WRAPPED] (LINE:26)) : (r1v0 o.tQP))
  (wrap:o.tBH:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBH:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:27) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DGOPHZ():o.tBH A[MD:():o.tBH (m), WRAPPED] (LINE:27)) : (r2v0 o.tBH))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0014: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0018: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getIO():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:28)) : (r3v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(o.tQP, o.tBH, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:25) call: o.tIH.<init>(o.tQP, o.tBH, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ tIH(tQP tqp, tBH tbh, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? tPF.copydefault.aJFbMH() : tqp, (i & 2) != 0 ? tPF.copydefault.DGOPHZ() : tbh, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public tIH(@NotNull tQP tqp, @NotNull tBH tbh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(tqp, "");
        Intrinsics.checkNotNullParameter(tbh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.copydefault = tqp;
        this.valueOf = tbh;
        this.djBIcL = coroutineDispatcher;
        MutableSharedFlow<AbstractC46197tLk<Unit>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 1, null, 5, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.AhwBna = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        AbstractC46197tLk.TaskDescription taskDescription = AbstractC46197tLk.Companion;
        MutableStateFlow<AbstractC46197tLk<CurveResetInfo>> MutableStateFlow = StateFlowKt.MutableStateFlow(taskDescription.OLrzqt(true));
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(taskDescription.OLrzqt(true));
        this.EZpvd = MutableStateFlow2;
        this.AYXKKw = FlowKt.asStateFlow(MutableStateFlow2);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tIH.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static final class ActionBar extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ tIH EZpvd;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(CoroutineExceptionHandler.Key key, tIH tih) {
            super(key);
            this.EZpvd = tih;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            this.EZpvd.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt(th));
        }
    }

    public final void copydefault(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), new ActionBar(CoroutineExceptionHandler.Key, this), null, new SocialDataResetViewModel$fetchPnlRatioCurveData$2(this, str, i, null), 2, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new SocialDataResetViewModel$fetchResetDataInfo$1(this, null), 2, null);
    }

    public final void copydefault(long j) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.djBIcL, null, new SocialDataResetViewModel$resetData$1(this, j, null), 2, null);
    }
}

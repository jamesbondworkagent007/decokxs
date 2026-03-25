package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.planet.biz_performance.chart.ProfileChartViewModel$fetchChart$2;
import com.okinc.planet.biz_performance.chart.ProfileChartViewModel$fetchData$2;
import com.okinc.planet.biz_performance.data.ChartProfileDataResp;
import com.okinc.planet.biz_performance.data.ProfileChartTypeDto;
import com.okinc.planet.biz_userprofile.data.PlanetAuthorId;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.tBK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tBA extends tLY<Unit> {
    public final InterfaceC56387yDm AEQbTJ;
    public final tBH AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final MutableStateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> EZpvd;
    public final MutableStateFlow<tBK.Activity> KWHzl;
    public java.lang.Integer OLrzqt;
    public final StateFlow<tBK.Activity> copydefault;
    public final tBK djBIcL;
    public final StateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> gEmmrt;
    public final SavedStateHandle valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> AEQbTJ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<tBK.Activity> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001c: CONSTRUCTOR 
  (r1v0 androidx.lifecycle.SavedStateHandle)
  (wrap:o.tBK:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBK:0x0006: INVOKE (wrap:o.tPF:0x0004: SGET  A[WRAPPED] (LINE:23) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DCUTEIddSDPG():o.tBK A[MD:():o.tBK (m), WRAPPED] (LINE:23)) : (r2v0 o.tBK))
  (wrap:o.tBH:?: TERNARY null = ((wrap:int:0x000a: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:o.tBH:0x0010: INVOKE (wrap:o.tPF:0x000e: SGET  A[WRAPPED] (LINE:24) o.tPF.copydefault o.tPF) VIRTUAL call: o.tPF.DGOPHZ():o.tBH A[MD:():o.tBH (m), WRAPPED] (LINE:24)) : (r3v0 o.tBH))
  (wrap:kotlinx.coroutines.CoroutineDispatcher:?: TERNARY null = ((wrap:int:0x0014: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlinx.coroutines.CoroutineDispatcher:0x0018: INVOKE  STATIC call: kotlinx.coroutines.Dispatchers.getDefault():kotlinx.coroutines.CoroutineDispatcher A[MD:():kotlinx.coroutines.CoroutineDispatcher (m), WRAPPED] (LINE:25)) : (r4v0 kotlinx.coroutines.CoroutineDispatcher))
 A[MD:(androidx.lifecycle.SavedStateHandle, o.tBK, o.tBH, kotlinx.coroutines.CoroutineDispatcher):void (m)] (LINE:21) call: o.tBA.<init>(androidx.lifecycle.SavedStateHandle, o.tBK, o.tBH, kotlinx.coroutines.CoroutineDispatcher):void type: THIS */
    public /* synthetic */ tBA(SavedStateHandle savedStateHandle, tBK tbk, tBH tbh, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateHandle, (i & 2) != 0 ? tPF.copydefault.DCUTEIddSDPG() : tbk, (i & 4) != 0 ? tPF.copydefault.DGOPHZ() : tbh, (i & 8) != 0 ? Dispatchers.getDefault() : coroutineDispatcher);
    }

    public static final class ActionBar implements Function0<PlanetAuthorId> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ PlanetAuthorId invoke() {
            java.lang.String strOLrzqt = OLrzqt();
            if (strOLrzqt != null) {
                return PlanetAuthorId.OLrzqt(strOLrzqt);
            }
            return null;
        }

        public final java.lang.String OLrzqt() {
            PlanetAuthorId planetAuthorId = (PlanetAuthorId) tBA.this.valueOf.get(PlanetAuthorId.Key);
            if (planetAuthorId != null) {
                return planetAuthorId.copydefault();
            }
            return null;
        }
    }

    public tBA(@NotNull SavedStateHandle savedStateHandle, @NotNull tBK tbk, @NotNull tBH tbh, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(tbk, "");
        Intrinsics.checkNotNullParameter(tbh, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.valueOf = savedStateHandle;
        this.djBIcL = tbk;
        this.AYXKKw = tbh;
        this.AhwBna = coroutineDispatcher;
        this.AEQbTJ = C56392yDr.copydefault(new ActionBar());
        MutableStateFlow<AbstractC46197tLk<java.util.List<ChartProfileDataResp>>> MutableStateFlow = StateFlowKt.MutableStateFlow(AbstractC46197tLk.Companion.OLrzqt(true));
        this.EZpvd = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<tBK.Activity> MutableStateFlow2 = StateFlowKt.MutableStateFlow(tBK.Activity.Companion.copydefault());
        this.KWHzl = MutableStateFlow2;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow2);
        this.OLrzqt = -1;
    }

    public final java.lang.String KWHzl() {
        PlanetAuthorId planetAuthorId = (PlanetAuthorId) this.AEQbTJ.getValue();
        if (planetAuthorId != null) {
            return planetAuthorId.copydefault();
        }
        return null;
    }

    public final void OLrzqt() {
        java.lang.String strKWHzl = KWHzl();
        if (strKWHzl == null) {
            return;
        }
        C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AhwBna.plus(new StateListAnimator(CoroutineExceptionHandler.Key)), null, new ProfileChartViewModel$fetchData$2(this, strKWHzl, null), 2, null);
    }

    public static final class Application extends AbstractC56429yFa implements CoroutineExceptionHandler {
        public final /* synthetic */ tBA AEQbTJ;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(CoroutineExceptionHandler.Key key, tBA tba) {
            super(key);
            this.AEQbTJ = tba;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
            this.AEQbTJ.EZpvd.setValue(AbstractC46197tLk.Companion.OLrzqt(th));
        }
    }

    public static final class StateListAnimator extends AbstractC56429yFa implements CoroutineExceptionHandler {
        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, java.lang.Throwable th) {
        }

        public StateListAnimator(CoroutineExceptionHandler.Key key) {
            super(key);
        }
    }

    public final void KWHzl(java.lang.Integer num, @NotNull ProfileChartTypeDto profileChartTypeDto, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(profileChartTypeDto, "");
        if (!Intrinsics.EZpvd(this.OLrzqt, num) || z2) {
            this.OLrzqt = num;
            C46374tRz.safeLaunch$default(ViewModelKt.getViewModelScope(this), this.AhwBna.plus(new Application(CoroutineExceptionHandler.Key, this)), null, new ProfileChartViewModel$fetchChart$2(this, profileChartTypeDto, num, z, null), 2, null);
        }
    }
}

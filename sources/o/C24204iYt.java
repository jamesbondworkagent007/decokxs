package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.data.bean.TokenInvestDetailResponse;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestNotify;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$2;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$3;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$getRecommendTokenDetail$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$loadDashboard$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$loadProtocolDetails$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$switchMode$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.DashboardViewModel$triggerRefreshPlatformList$1;
import com.okinc.business.invest_biz.ui.screens.defi_dashboard.model.DashboardListMode;
import kotlin.Result;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC24202iYr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iYt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24204iYt extends ViewModel {
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public final MutableStateFlow<java.lang.Boolean> AEQbTJ;
    public final InterfaceC23916iOb AYXKKw;
    public final InterfaceC26363jas AhwBna;
    public final iDL AkhnZx;
    public final StateFlow<C24207iYw> DbNXlk;
    public final MutableStateFlow<C24207iYw> EZpvd;
    public final MutableStateFlow<DashboardListMode> KWHzl;
    public final MutableStateFlow<java.lang.Boolean> copydefault;
    public long djBIcL;
    public final C23597iCg ejfBZ;
    public final iGF fARcdN;
    public final StateFlow<InterfaceC24202iYr> fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final StateFlow<java.lang.Boolean> fetchVPNInfo;
    public final MutableStateFlow<InterfaceC24202iYr> gEmmrt;
    public final InterfaceC26359jao isConnected;
    public final StateFlow<DashboardListMode> valueOf;
    public final StateFlow<java.lang.Boolean> values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<DashboardListMode> AEQbTJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> EZpvd() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C24207iYw> KWHzl() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24202iYr> OLrzqt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.Boolean> copydefault() {
        return this.fetchVPNInfo;
    }

    @yCM
    public C24204iYt(@NotNull InterfaceC26363jas interfaceC26363jas, @NotNull iDL idl, @NotNull C23597iCg c23597iCg, @NotNull InterfaceC23916iOb interfaceC23916iOb, @NotNull iGF igf, @NotNull InterfaceC26359jao interfaceC26359jao) {
        Intrinsics.checkNotNullParameter(interfaceC26363jas, "");
        Intrinsics.checkNotNullParameter(idl, "");
        Intrinsics.checkNotNullParameter(c23597iCg, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        Intrinsics.checkNotNullParameter(igf, "");
        Intrinsics.checkNotNullParameter(interfaceC26359jao, "");
        this.AhwBna = interfaceC26363jas;
        this.AkhnZx = idl;
        this.ejfBZ = c23597iCg;
        this.AYXKKw = interfaceC23916iOb;
        this.fARcdN = igf;
        this.isConnected = interfaceC26359jao;
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.iYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C24204iYt.fetchVPNInfo(this.KWHzl);
            }
        });
        this.djBIcL = -1L;
        MutableStateFlow<InterfaceC24202iYr> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC24202iYr.StateListAnimator.copydefault);
        this.gEmmrt = MutableStateFlow;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<C24207iYw> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow2;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow3;
        this.fetchVPNInfo = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<DashboardListMode> MutableStateFlow4 = StateFlowKt.MutableStateFlow(DashboardListMode.TOKEN);
        this.KWHzl = MutableStateFlow4;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow4);
        MutableStateFlow<java.lang.Boolean> MutableStateFlow5 = StateFlowKt.MutableStateFlow(java.lang.Boolean.FALSE);
        this.copydefault = MutableStateFlow5;
        this.values = FlowKt.asStateFlow(MutableStateFlow5);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DashboardViewModel$1(this, null), 3, null);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DashboardViewModel$2(this, null), 3, null);
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DashboardViewModel$3(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.iYt$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iYt.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final SharedFlow<InvestNotify> valueOf() {
        return (SharedFlow) this.fJNWhG.getValue();
    }

    public static final SharedFlow fetchVPNInfo(C24204iYt c24204iYt) {
        return c24204iYt.ejfBZ.copydefault();
    }

    public final void OLrzqt(long j) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DashboardViewModel$triggerRefreshPlatformList$1(this, j, null), 3, null);
    }

    public final void AEQbTJ(long j) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DashboardViewModel$loadDashboard$1(this, j, null), 3, null);
    }

    public final void OLrzqt(int i, @NotNull C27369jtr c27369jtr) {
        Intrinsics.checkNotNullParameter(c27369jtr, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DashboardViewModel$loadProtocolDetails$1(c27369jtr, this, i, null), 3, null);
    }

    public final void KWHzl(@NotNull DashboardListMode dashboardListMode) {
        Intrinsics.checkNotNullParameter(dashboardListMode, "");
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new DashboardViewModel$switchMode$1(this, dashboardListMode, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object AEQbTJ(long j, @NotNull Continuation<? super Result<TokenInvestDetail>> continuation) throws java.lang.Throwable {
        DashboardViewModel$getRecommendTokenDetail$1 dashboardViewModel$getRecommendTokenDetail$1;
        java.lang.Object objKWHzl;
        if (continuation instanceof DashboardViewModel$getRecommendTokenDetail$1) {
            dashboardViewModel$getRecommendTokenDetail$1 = (DashboardViewModel$getRecommendTokenDetail$1) continuation;
            int i = dashboardViewModel$getRecommendTokenDetail$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dashboardViewModel$getRecommendTokenDetail$1.label = i - Integer.MIN_VALUE;
            } else {
                dashboardViewModel$getRecommendTokenDetail$1 = new DashboardViewModel$getRecommendTokenDetail$1(this, continuation);
            }
        }
        java.lang.Object obj = dashboardViewModel$getRecommendTokenDetail$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dashboardViewModel$getRecommendTokenDetail$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            iGF igf = this.fARcdN;
            java.util.List<java.lang.String> listEZpvd = C56402yEa.EZpvd(C33129mqd.gEmmrt(C56443yFo.KWHzl(j)));
            dashboardViewModel$getRecommendTokenDetail$1.label = 1;
            objKWHzl = igf.KWHzl(listEZpvd, dashboardViewModel$getRecommendTokenDetail$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objKWHzl)) {
            try {
                Result.Application application = Result.Companion;
                TokenInvestDetail tokenInvestDetail = (TokenInvestDetail) CollectionsKt___CollectionsKt.firstOrNull(((TokenInvestDetailResponse) objKWHzl).OLrzqt());
                if (tokenInvestDetail != null) {
                    return Result.m7377constructorimpl(tokenInvestDetail);
                }
                throw new java.lang.IllegalStateException("Token detail not found");
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objKWHzl = C56391yDq.EZpvd(th);
            }
        }
        return Result.m7377constructorimpl(objKWHzl);
    }
}

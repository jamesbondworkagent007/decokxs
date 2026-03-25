package o;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.wallet.eip7702.ui.model.EIP7702UIState;
import com.okinc.business.defi.wallet.eip7702.ui.viewmodel.EIP7702OnboardingViewModel$initPage$1;
import com.okinc.business.defi.wallet.eip7702.ui.viewmodel.EIP7702OnboardingViewModel$refreshNetworkList$1;
import com.okinc.business.defi.wallet.eip7702.ui.viewmodel.EIP7702OnboardingViewModel$refreshStatus$1;
import com.okinc.business.defi.wallet.eip7702.ui.viewmodel.EIP7702OnboardingViewModel$refreshStatus$2;
import com.okinc.business.defi.wallet.eip7702.ui.viewmodel.EIP7702OnboardingViewModel$switchWallet$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class eCD extends ViewModel {
    public final MutableStateFlow<java.util.List<EIP7702UIState>> AEQbTJ;
    public final SharedFlow<java.lang.Boolean> AYXKKw;
    public final CoroutineDispatcher AhwBna;
    public final C12827cuN AkhnZx;
    public final C15272eCe EZpvd;
    public final MutableSharedFlow<java.lang.Boolean> KWHzl;
    public final MutableSharedFlow<InterfaceC9738bbJ> OLrzqt;
    public final C10948byA copydefault;
    public final SharedFlow<InterfaceC9738bbJ> djBIcL;
    public AbstractC12782ctV gEmmrt;
    public final StateFlow<java.util.List<EIP7702UIState>> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<java.lang.Boolean> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.util.List<EIP7702UIState>> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InterfaceC9738bbJ> copydefault() {
        return this.djBIcL;
    }

    public eCD(@NotNull C12827cuN c12827cuN, @NotNull C10948byA c10948byA, @NotNull CoroutineDispatcher coroutineDispatcher, @NotNull C15272eCe c15272eCe) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(c10948byA, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        Intrinsics.checkNotNullParameter(c15272eCe, "");
        this.AkhnZx = c12827cuN;
        this.copydefault = c10948byA;
        this.AhwBna = coroutineDispatcher;
        this.EZpvd = c15272eCe;
        MutableSharedFlow<InterfaceC9738bbJ> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.djBIcL = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<java.lang.Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default2;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableStateFlow<java.util.List<EIP7702UIState>> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.AEQbTJ = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
    }

    public final Job KWHzl() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EIP7702OnboardingViewModel$initPage$1(this, null), 3, null);
    }

    public final Job valueOf() {
        return OLrzqt(new EIP7702OnboardingViewModel$refreshStatus$1(this, null), new EIP7702OnboardingViewModel$refreshStatus$2(this, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: o.eCD */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job refreshNetworkList$default(eCD ecd, Function2 function2, Function2 function22, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        if ((i & 2) != 0) {
            function22 = null;
        }
        return ecd.OLrzqt(function2, function22);
    }

    public final Job OLrzqt(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function2, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends java.lang.Object> function22) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EIP7702OnboardingViewModel$refreshNetworkList$1(function2, function22, this, null), 3, null);
    }

    public final Job copydefault(@NotNull InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new EIP7702OnboardingViewModel$switchWallet$1(this, interfaceC9738bbJ, null), 3, null);
    }

    public final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC12782ctV abstractC12782ctV = this.gEmmrt;
        return abstractC12782ctV != null && abstractC12782ctV.DbNXlk(str);
    }

    public final java.lang.String EZpvd(long j) {
        AbstractC12782ctV abstractC12782ctV = this.gEmmrt;
        java.lang.String strEZpvd = abstractC12782ctV != null ? abstractC12782ctV.EZpvd(j) : null;
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final java.lang.String AEQbTJ() {
        AbstractC12782ctV abstractC12782ctV = this.gEmmrt;
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        return strDbNXlk == null ? "" : strDbNXlk;
    }
}

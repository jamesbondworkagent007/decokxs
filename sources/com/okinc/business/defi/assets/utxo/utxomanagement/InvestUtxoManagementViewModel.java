package com.okinc.business.defi.assets.utxo.utxomanagement;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.CurrencyDisplayStyle;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.C10231bkZ;
import o.C12827cuN;
import o.C13934dbu;
import o.C33129mqd;
import o.C54880xYt;
import o.InterfaceC10317bmF;
import o.InterfaceC10354bmq;
import o.xWM;
import o.yCM;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class InvestUtxoManagementViewModel extends ViewModel {
    public final CoroutineDispatcher AYXKKw;
    public xWM AhwBna;
    public final C13934dbu AkhnZx;
    public final MutableStateFlow<InterfaceC10317bmF> KWHzl;
    public final MutableSharedFlow<InterfaceC10354bmq> OLrzqt;
    public final MutableSharedFlow<Unit> copydefault;
    public final CoroutineScope djBIcL;
    public final C12827cuN fetchVPNInfo;
    public final StateFlow<InterfaceC10317bmF> gEmmrt;
    public final SharedFlow<InterfaceC10354bmq> isConnected;
    public final SharedFlow<Unit> valueOf;
    public final C10231bkZ values;
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public static final Set<Integer> AEQbTJ = yEE.AhwBna(0, 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<InterfaceC10354bmq> AEQbTJ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> OLrzqt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC10317bmF> copydefault() {
        return this.gEmmrt;
    }

    @yCM
    public InvestUtxoManagementViewModel(@NotNull C13934dbu c13934dbu, @NotNull C10231bkZ c10231bkZ, @NotNull C12827cuN c12827cuN, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(c10231bkZ, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.AkhnZx = c13934dbu;
        this.values = c10231bkZ;
        this.fetchVPNInfo = c12827cuN;
        this.AYXKKw = coroutineDispatcher;
        this.djBIcL = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(coroutineDispatcher));
        MutableStateFlow<InterfaceC10317bmF> MutableStateFlow = StateFlowKt.MutableStateFlow(InterfaceC10317bmF.ActionBar.KWHzl);
        this.KWHzl = MutableStateFlow;
        this.gEmmrt = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<InterfaceC10354bmq> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default2;
        this.valueOf = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        CoroutineScopeKt.cancel$default(this.djBIcL, null, 1, null);
        super.onCleared();
    }

    public final void AEQbTJ(long j) {
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new InvestUtxoManagementViewModel$loadAmountConverter$1(this, j, null), 3, null);
    }

    public final void OLrzqt(long j) {
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new InvestUtxoManagementViewModel$checkExplanation$1(this, j, null), 3, null);
    }

    public final void copydefault(long j) {
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new InvestUtxoManagementViewModel$markExplanationDialogViewed$1(this, j, null), 3, null);
    }

    public final void AEQbTJ(@NotNull UtxoWalletInfo utxoWalletInfo) {
        Intrinsics.checkNotNullParameter(utxoWalletInfo, "");
        BuildersKt__Builders_commonKt.launch$default(this.djBIcL, null, null, new InvestUtxoManagementViewModel$loadUtxoList$1(this, utxoWalletInfo, null), 3, null);
    }

    public final void copydefault(@NotNull UtxoWalletInfo utxoWalletInfo, @NotNull InvestUtxoAction investUtxoAction) {
        Intrinsics.checkNotNullParameter(utxoWalletInfo, "");
        Intrinsics.checkNotNullParameter(investUtxoAction, "");
        Integer numCopydefault = investUtxoAction.copydefault();
        if (numCopydefault != null) {
            numCopydefault.intValue();
            AEQbTJ(utxoWalletInfo, investUtxoAction.EZpvd().size(), investUtxoAction.OLrzqt(), investUtxoAction.copydefault().intValue(), investUtxoAction.EZpvd());
        }
    }

    public final String EZpvd(@NotNull String str) {
        String strKWHzl;
        BigDecimal bigDecimalEZpvd;
        Intrinsics.checkNotNullParameter(str, "");
        xWM xwm = this.AhwBna;
        String valuation$default = (xwm == null || (strKWHzl = xwm.KWHzl(str)) == null || (bigDecimalEZpvd = C33129mqd.EZpvd(strKWHzl)) == null) ? null : C54880xYt.formatValuation$default(bigDecimalEZpvd, 0, 0, null, CurrencyDisplayStyle.CURRENCY_SYMBOL_PREFIX, null, null, false, 119, null);
        return valuation$default == null ? "" : valuation$default;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoManagementViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateUtxoStatus$default(InvestUtxoManagementViewModel investUtxoManagementViewModel, UtxoWalletInfo utxoWalletInfo, int i, long j, int i2, List list, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            list = null;
        }
        investUtxoManagementViewModel.AEQbTJ(utxoWalletInfo, i, j, i2, list);
    }

    public final void AEQbTJ(UtxoWalletInfo utxoWalletInfo, int i, long j, int i2, List<UtxoItemIdentity> list) {
        this.KWHzl.setValue(InterfaceC10317bmF.ActionBar.KWHzl);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUtxoManagementViewModel$updateUtxoStatus$1(this, utxoWalletInfo, list, i2, i, j, null), 3, null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.assets.utxo.utxomanagement.InvestUtxoManagementViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

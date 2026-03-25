package o;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.wallet.common.okxconnect.model.OKXConnectException;
import com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel.DAppConnectionViewModel$1;
import com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel.DAppConnectionViewModel$onConnect$2;
import com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel.DAppConnectionViewModel$onConnectAndSign$1;
import com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel.DAppConnectionViewModel$onDisconnect$1;
import com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel.DAppConnectionViewModel$switchWallet$1;
import com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel.DAppConnectionViewModel$verifyDAppDomain$1;
import com.okinc.business.defi.wallet.common.tonconnect.ui.viewmodel.DAppConnectionViewModel$verifyDAppDomainUrl$1;
import com.reown.android.internal.common.di.CoreNetworkModuleKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ecH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16029ecH extends ViewModel {
    public final C15935eaT AEQbTJ;
    public final C13934dbu AYXKKw;
    public final java.lang.String EZpvd;
    public final int KWHzl;
    public final C16058eck OLrzqt;
    public final MutableStateFlow<C16026ecE> copydefault;
    public final InterfaceC18445fiY djBIcL;
    public final C12827cuN gEmmrt;
    public final StateFlow<C16026ecE> valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<C16026ecE> KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.KWHzl;
    }

    public C16029ecH(@NotNull C12827cuN c12827cuN, @NotNull InterfaceC18445fiY interfaceC18445fiY, @NotNull C16058eck c16058eck, @NotNull C15935eaT c15935eaT, @NotNull C13934dbu c13934dbu, @NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC18445fiY, "");
        Intrinsics.checkNotNullParameter(c16058eck, "");
        Intrinsics.checkNotNullParameter(c15935eaT, "");
        Intrinsics.checkNotNullParameter(c13934dbu, "");
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.gEmmrt = c12827cuN;
        this.djBIcL = interfaceC18445fiY;
        this.OLrzqt = c16058eck;
        this.AEQbTJ = c15935eaT;
        this.AYXKKw = c13934dbu;
        MutableStateFlow<C16026ecE> MutableStateFlow = StateFlowKt.MutableStateFlow(new C16026ecE(null, null, null, null, null, false, null, null, false, null, 1023, null));
        this.copydefault = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        java.lang.Integer num = (java.lang.Integer) savedStateHandle.get("connectType");
        this.KWHzl = num != null ? num.intValue() : 2;
        java.lang.String str = (java.lang.String) savedStateHandle.get(CoreNetworkModuleKt.KEY_CLIENT_ID);
        this.EZpvd = str != null ? str : "";
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DAppConnectionViewModel$1(this, null), 3, null);
    }

    public final boolean OLrzqt(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        if (this.KWHzl == 3) {
            return this.AEQbTJ.EZpvd(abstractC12782ctV);
        }
        return this.OLrzqt.copydefault(abstractC12782ctV);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object copydefault(java.lang.String str, java.lang.String str2, Continuation<? super VerifyDAppDomainResponse> continuation) throws java.lang.Throwable {
        DAppConnectionViewModel$verifyDAppDomain$1 dAppConnectionViewModel$verifyDAppDomain$1;
        if (continuation instanceof DAppConnectionViewModel$verifyDAppDomain$1) {
            dAppConnectionViewModel$verifyDAppDomain$1 = (DAppConnectionViewModel$verifyDAppDomain$1) continuation;
            int i = dAppConnectionViewModel$verifyDAppDomain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppConnectionViewModel$verifyDAppDomain$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppConnectionViewModel$verifyDAppDomain$1 = new DAppConnectionViewModel$verifyDAppDomain$1(this, continuation);
            }
        }
        java.lang.Object objCopydefault = dAppConnectionViewModel$verifyDAppDomain$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = dAppConnectionViewModel$verifyDAppDomain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C13934dbu c13934dbu = this.AYXKKw;
            dAppConnectionViewModel$verifyDAppDomain$1.L$0 = str;
            dAppConnectionViewModel$verifyDAppDomain$1.L$1 = str2;
            dAppConnectionViewModel$verifyDAppDomain$1.label = 1;
            objCopydefault = c13934dbu.copydefault(str, str2, dAppConnectionViewModel$verifyDAppDomain$1);
            if (objCopydefault == objCopydefault2) {
                return objCopydefault2;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) dAppConnectionViewModel$verifyDAppDomain$1.L$1;
            str = (java.lang.String) dAppConnectionViewModel$verifyDAppDomain$1.L$0;
            C56391yDq.AEQbTJ(objCopydefault);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objCopydefault;
        pUU.EZpvd("DAppConnectionViewModel", "verifyDAppDomain: " + abstractC43419rot + ", clientId: " + str + ", manifestJson: " + str2);
        return abstractC43419rot.copydefault();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object OLrzqt(java.lang.String str, Continuation<? super VerifyDAppDomainUrlResponse> continuation) throws java.lang.Throwable {
        DAppConnectionViewModel$verifyDAppDomainUrl$1 dAppConnectionViewModel$verifyDAppDomainUrl$1;
        if (continuation instanceof DAppConnectionViewModel$verifyDAppDomainUrl$1) {
            dAppConnectionViewModel$verifyDAppDomainUrl$1 = (DAppConnectionViewModel$verifyDAppDomainUrl$1) continuation;
            int i = dAppConnectionViewModel$verifyDAppDomainUrl$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dAppConnectionViewModel$verifyDAppDomainUrl$1.label = i - Integer.MIN_VALUE;
            } else {
                dAppConnectionViewModel$verifyDAppDomainUrl$1 = new DAppConnectionViewModel$verifyDAppDomainUrl$1(this, continuation);
            }
        }
        java.lang.Object objFARcdN = dAppConnectionViewModel$verifyDAppDomainUrl$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = dAppConnectionViewModel$verifyDAppDomainUrl$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objFARcdN);
            C13934dbu c13934dbu = this.AYXKKw;
            dAppConnectionViewModel$verifyDAppDomainUrl$1.L$0 = str;
            dAppConnectionViewModel$verifyDAppDomainUrl$1.label = 1;
            objFARcdN = c13934dbu.fARcdN(str, dAppConnectionViewModel$verifyDAppDomainUrl$1);
            if (objFARcdN == objCopydefault) {
                return objCopydefault;
            }
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) dAppConnectionViewModel$verifyDAppDomainUrl$1.L$0;
            C56391yDq.AEQbTJ(objFARcdN);
        }
        AbstractC43419rot abstractC43419rot = (AbstractC43419rot) objFARcdN;
        pUU.EZpvd("DAppConnectionViewModel", "verifyDAppDomain: " + abstractC43419rot + ", domain: " + str);
        return abstractC43419rot.copydefault();
    }

    public final void KWHzl(@NotNull AbstractC12782ctV abstractC12782ctV) {
        Intrinsics.checkNotNullParameter(abstractC12782ctV, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DAppConnectionViewModel$switchWallet$1(this, abstractC12782ctV, null), 3, null);
    }

    public final void copydefault() {
        C16026ecE value;
        C16026ecE c16026ecE;
        AbstractC12782ctV abstractC12782ctVIsConnected = this.valueOf.getValue().isConnected();
        if (abstractC12782ctVIsConnected == null) {
            return;
        }
        MutableStateFlow<C16026ecE> mutableStateFlow = this.copydefault;
        do {
            value = mutableStateFlow.getValue();
            c16026ecE = value;
        } while (!mutableStateFlow.compareAndSet(value, c16026ecE.copydefault((1022 & 1) != 0 ? c16026ecE.KWHzl : 1, (1022 & 2) != 0 ? c16026ecE.gEmmrt : null, (1022 & 4) != 0 ? c16026ecE.djBIcL : null, (1022 & 8) != 0 ? c16026ecE.AYXKKw : null, (1022 & 16) != 0 ? c16026ecE.AhwBna : null, (1022 & 32) != 0 ? c16026ecE.EZpvd : false, (1022 & 64) != 0 ? c16026ecE.AEQbTJ : null, (1022 & 128) != 0 ? c16026ecE.valueOf : null, (1022 & 256) != 0 ? c16026ecE.OLrzqt : false, (1022 & 512) != 0 ? c16026ecE.copydefault : null)));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DAppConnectionViewModel$onConnect$2(this, abstractC12782ctVIsConnected, null), 3, null);
    }

    public final void EZpvd() {
        C15937eaV c15937eaVKWHzl;
        AbstractC12782ctV abstractC12782ctVIsConnected = this.valueOf.getValue().isConnected();
        if (abstractC12782ctVIsConnected == null || (c15937eaVKWHzl = this.valueOf.getValue().KWHzl()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DAppConnectionViewModel$onConnectAndSign$1(this, c15937eaVKWHzl, abstractC12782ctVIsConnected, null), 3, null);
    }

    public final void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = this.KWHzl;
        if (i == 2) {
            InterfaceC18445fiY interfaceC18445fiY = this.djBIcL;
            java.lang.String strValueOf = this.valueOf.getValue().valueOf();
            java.lang.String strAhwBna = this.valueOf.getValue().AhwBna();
            AbstractC12782ctV abstractC12782ctVIsConnected = this.valueOf.getValue().isConnected();
            WalletType walletTypeQwvEab = abstractC12782ctVIsConnected != null ? abstractC12782ctVIsConnected.QwvEab() : null;
            AbstractC12782ctV abstractC12782ctVIsConnected2 = this.valueOf.getValue().isConnected();
            interfaceC18445fiY.copydefault(str, strValueOf, strAhwBna, walletTypeQwvEab, abstractC12782ctVIsConnected2 != null ? abstractC12782ctVIsConnected2.DbNXlk() : null);
            return;
        }
        if (i == 3) {
            InterfaceC18445fiY interfaceC18445fiY2 = this.djBIcL;
            java.lang.String strValueOf2 = this.valueOf.getValue().valueOf();
            java.lang.String strAhwBna2 = this.valueOf.getValue().AhwBna();
            AbstractC12782ctV abstractC12782ctVIsConnected3 = this.valueOf.getValue().isConnected();
            WalletType walletTypeQwvEab2 = abstractC12782ctVIsConnected3 != null ? abstractC12782ctVIsConnected3.QwvEab() : null;
            AbstractC12782ctV abstractC12782ctVIsConnected4 = this.valueOf.getValue().isConnected();
            interfaceC18445fiY2.EZpvd(str, strValueOf2, strAhwBna2, walletTypeQwvEab2, abstractC12782ctVIsConnected4 != null ? abstractC12782ctVIsConnected4.DbNXlk() : null);
        }
    }

    public final Job gEmmrt() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new DAppConnectionViewModel$onDisconnect$1(this, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        java.lang.Integer numOLrzqt = this.valueOf.getValue().OLrzqt();
        if ((numOLrzqt == null || numOLrzqt.intValue() != 0) && (numOLrzqt == null || numOLrzqt.intValue() != 1)) {
            if (numOLrzqt != null && numOLrzqt.intValue() == 5 && this.KWHzl == 3) {
                C15935eaT.cancelConnecting$default(this.AEQbTJ, null, 1, null);
                this.AEQbTJ.copydefault(this.valueOf.getValue().AkhnZx());
                return;
            }
            return;
        }
        int i = this.KWHzl;
        if (i == 2) {
            this.OLrzqt.copydefault();
        } else if (i == 3) {
            this.AEQbTJ.KWHzl(this.valueOf.getValue().EZpvd() ? OKXConnectException.ErrorType.RISKY_CONNECTION : OKXConnectException.ErrorType.USER_REJECTED);
            this.AEQbTJ.copydefault(this.valueOf.getValue().AkhnZx());
        }
    }
}

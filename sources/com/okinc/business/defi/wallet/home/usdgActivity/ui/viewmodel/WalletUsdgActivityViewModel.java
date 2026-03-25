package com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.model.ChainAddress;
import com.okinc.business.defi.wallet.home.usdgActivity.data.repository.RegisterAddressStatus;
import com.okinc.business.defi.wallet.home.usdgActivity.ui.model.SupportChainAddressBean;
import com.okinc.okuser.data.User;
import com.okinc.wallet.api.bean.AddressType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC12782ctV;
import o.AbstractC18226feR;
import o.AbstractC33073mpa;
import o.C10854bwM;
import o.C10954byG;
import o.C12827cuN;
import o.C14728dqt;
import o.C18180fdY;
import o.C18181fdZ;
import o.C18235fea;
import o.C19331fzK;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.InterfaceC47278tmy;
import o.InterfaceC9738bbJ;
import o.pUU;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletUsdgActivityViewModel extends AbstractC33073mpa {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final MutableSharedFlow<AbstractC18226feR> AEQbTJ;
    public final MutableSharedFlow<AbstractC18226feR.Fragment> AYXKKw;
    public final MutableStateFlow<List<SupportChainAddressBean>> AhwBna;
    public final C18180fdY AkhnZx;
    public final C18235fea AuCTel;
    public final C12827cuN AuCTelauCTel;
    public final SharedFlow<AbstractC18226feR> DbNXlk;
    public final MutableSharedFlow<AbstractC18226feR.StateListAnimator> EZpvd;
    public final MutableSharedFlow<AbstractC18226feR> OLrzqt;
    public final MutableSharedFlow<AbstractC18226feR> copydefault;
    public final Long djBIcL;
    public final SharedFlow<AbstractC18226feR> ejfBZ;
    public final SharedFlow<AbstractC18226feR.ActionBar> fARcdN;
    public final C18181fdZ fIwbmz;
    public AbstractC12782ctV fJNWhG;
    public final SharedFlow<AbstractC18226feR.StateListAnimator> fetchVPNInfo;
    public final MutableSharedFlow<AbstractC18226feR> gEmmrt;
    public String getFieldNames;
    public final SharedFlow<AbstractC18226feR.Fragment> getNewProxyInstance;
    public final SavedStateHandle hDKMBd;
    public final SharedFlow<AbstractC18226feR> isConnected;
    public final StateFlow<List<SupportChainAddressBean>> iwGUEr;
    public final ArrayList<Long> uzCIH;
    public final MutableSharedFlow<AbstractC18226feR.ActionBar> valueOf;
    public final SharedFlow<AbstractC18226feR> values;
    public final C19331fzK wlaJM;
    public final InterfaceC47278tmy zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long AYXKKw() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<List<SupportChainAddressBean>> AhwBna() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<Long> AkhnZx() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC18226feR> AuCTel() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(AbstractC12782ctV abstractC12782ctV) {
        this.fJNWhG = abstractC12782ctV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC18226feR> djBIcL() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC18226feR> ejfBZ() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC18226feR.ActionBar> fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC18226feR> fJNWhG() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC18226feR.StateListAnimator> fetchVPNInfo() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC12782ctV valueOf() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<AbstractC18226feR.Fragment> values() {
        return this.getNewProxyInstance;
    }

    @yCM
    public WalletUsdgActivityViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull C12827cuN c12827cuN, @NotNull InterfaceC47278tmy interfaceC47278tmy, @NotNull C18235fea c18235fea, @NotNull C18181fdZ c18181fdZ, @NotNull C19331fzK c19331fzK, @NotNull C18180fdY c18180fdY) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(c12827cuN, "");
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        Intrinsics.checkNotNullParameter(c18235fea, "");
        Intrinsics.checkNotNullParameter(c18181fdZ, "");
        Intrinsics.checkNotNullParameter(c19331fzK, "");
        Intrinsics.checkNotNullParameter(c18180fdY, "");
        this.hDKMBd = savedStateHandle;
        this.AuCTelauCTel = c12827cuN;
        this.zLjUOn = interfaceC47278tmy;
        this.AuCTel = c18235fea;
        this.fIwbmz = c18181fdZ;
        this.wlaJM = c19331fzK;
        this.AkhnZx = c18180fdY;
        this.uzCIH = (ArrayList) savedStateHandle.get("coin_id_list");
        this.djBIcL = (Long) savedStateHandle.get("banner_id");
        this.getFieldNames = "";
        MutableStateFlow<List<SupportChainAddressBean>> MutableStateFlow = StateFlowKt.MutableStateFlow(yDY.AhwBna());
        this.AhwBna = MutableStateFlow;
        this.iwGUEr = MutableStateFlow;
        MutableSharedFlow<AbstractC18226feR.Fragment> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AYXKKw = mutableSharedFlowMutableSharedFlow$default;
        this.getNewProxyInstance = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<AbstractC18226feR> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default2;
        this.DbNXlk = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableSharedFlow<AbstractC18226feR.StateListAnimator> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default3;
        this.fetchVPNInfo = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        MutableSharedFlow<AbstractC18226feR.ActionBar> mutableSharedFlowMutableSharedFlow$default4 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.valueOf = mutableSharedFlowMutableSharedFlow$default4;
        this.fARcdN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default4);
        MutableSharedFlow<AbstractC18226feR> mutableSharedFlowMutableSharedFlow$default5 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default5;
        this.isConnected = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default5);
        MutableSharedFlow<AbstractC18226feR> mutableSharedFlowMutableSharedFlow$default6 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.gEmmrt = mutableSharedFlowMutableSharedFlow$default6;
        this.ejfBZ = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default6);
        MutableSharedFlow<AbstractC18226feR> mutableSharedFlowMutableSharedFlow$default7 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default7;
        this.values = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default7);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.wallet.home.usdgActivity.ui.viewmodel.WalletUsdgActivityViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public final void AEQbTJ() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletUsdgActivityViewModel$checkWalletAndSpecificChains$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletUsdgActivityViewModel$checkWalletAddressIsRegistered$1(this, null), 3, null);
    }

    public final void KWHzl() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletUsdgActivityViewModel$checkAddressBalance$1(this, null), 3, null);
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletUsdgActivityViewModel$checkCefiAccountLoggedIn$1(this, null), 3, null);
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletUsdgActivityViewModel$checkWalletBindedToCefiAccount$1(this, null), 3, null);
    }

    public final void OLrzqt(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletUsdgActivityViewModel$checkIndependentWalletBindedToCefiAccount$1(this, z, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(Continuation<? super Boolean> continuation) throws Throwable {
        WalletUsdgActivityViewModel$checkCountryLimitAndEmit$1 walletUsdgActivityViewModel$checkCountryLimitAndEmit$1;
        Object objKWHzl;
        WalletUsdgActivityViewModel walletUsdgActivityViewModel;
        if (continuation instanceof WalletUsdgActivityViewModel$checkCountryLimitAndEmit$1) {
            walletUsdgActivityViewModel$checkCountryLimitAndEmit$1 = (WalletUsdgActivityViewModel$checkCountryLimitAndEmit$1) continuation;
            int i = walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.label = i - Integer.MIN_VALUE;
            } else {
                walletUsdgActivityViewModel$checkCountryLimitAndEmit$1 = new WalletUsdgActivityViewModel$checkCountryLimitAndEmit$1(this, continuation);
            }
        }
        Object obj = walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            C18180fdY c18180fdY = this.AkhnZx;
            String strIsConnected = isConnected();
            walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.L$0 = this;
            walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.label = 1;
            objKWHzl = c18180fdY.KWHzl(strIsConnected, walletUsdgActivityViewModel$checkCountryLimitAndEmit$1);
            if (objKWHzl == objCopydefault) {
                return objCopydefault;
            }
            walletUsdgActivityViewModel = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    C56391yDq.AEQbTJ(obj);
                    return C56443yFo.KWHzl(false);
                }
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return C56443yFo.KWHzl(false);
            }
            walletUsdgActivityViewModel = (WalletUsdgActivityViewModel) walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objKWHzl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7383isFailureimpl(objKWHzl)) {
            Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objKWHzl);
            pUU.AEQbTJ("WalletUsdgActivityViewModel", "activateAddresses_checkCountryLimit_fail", thM7380exceptionOrNullimpl);
            MutableSharedFlow<AbstractC18226feR> mutableSharedFlow = walletUsdgActivityViewModel.gEmmrt;
            AbstractC18226feR.Activity activity = new AbstractC18226feR.Activity(thM7380exceptionOrNullimpl != null ? thM7380exceptionOrNullimpl.getMessage() : null);
            walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.L$0 = null;
            walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.label = 2;
            if (mutableSharedFlow.emit(activity, walletUsdgActivityViewModel$checkCountryLimitAndEmit$1) == objCopydefault) {
                return objCopydefault;
            }
            return C56443yFo.KWHzl(false);
        }
        C56391yDq.AEQbTJ(objKWHzl);
        if (!((Boolean) objKWHzl).booleanValue()) {
            MutableSharedFlow<AbstractC18226feR> mutableSharedFlow2 = walletUsdgActivityViewModel.gEmmrt;
            AbstractC18226feR.TaskDescription taskDescription = new AbstractC18226feR.TaskDescription(RegisterAddressStatus.STATUS_REGISTERED_REGION_NOT_SUPPORTED, false);
            walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.L$0 = null;
            walletUsdgActivityViewModel$checkCountryLimitAndEmit$1.label = 3;
            if (mutableSharedFlow2.emit(taskDescription, walletUsdgActivityViewModel$checkCountryLimitAndEmit$1) == objCopydefault) {
                return objCopydefault;
            }
            return C56443yFo.KWHzl(false);
        }
        return C56443yFo.KWHzl(true);
    }

    public final void EZpvd() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new WalletUsdgActivityViewModel$activateAddresses$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<SupportChainAddressBean> copydefault(AbstractC12782ctV abstractC12782ctV, List<Long> list) {
        String address;
        List<Long> listAhwBna = list == null ? yDY.AhwBna() : list;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            long jLongValue = ((Number) it.next()).longValue();
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(Long.valueOf(jLongValue));
            SupportChainAddressBean supportChainAddressBean = null;
            Long lValueOf = c10854bwMKWHzl != null ? Long.valueOf(c10854bwMKWHzl.fetchVPNInfo()) : null;
            if (lValueOf != null) {
                if (Intrinsics.EZpvd(abstractC12782ctV != null ? Boolean.valueOf(abstractC12782ctV.AkhnZx(lValueOf.longValue())) : null, Boolean.TRUE) && lValueOf != null) {
                    AbstractC12782ctV abstractC12782ctV2 = this.fJNWhG;
                    ChainAddress chainAddress = abstractC12782ctV2 != null ? (ChainAddress) InterfaceC9738bbJ.StateListAnimator.addressFromRealChainId$default(abstractC12782ctV2, lValueOf.longValue(), null, 2, null) : null;
                    if (chainAddress == null || (address = chainAddress.getAddress()) == null) {
                        address = "";
                    }
                    supportChainAddressBean = new SupportChainAddressBean(address, lValueOf.longValue(), c10854bwMKWHzl.OLrzqt(), jLongValue, chainAddress != null ? chainAddress.getAddressType() : AddressType.Legacy.getValue());
                }
            }
            if (supportChainAddressBean != null) {
                arrayList.add(supportChainAddressBean);
            }
        }
        return arrayList;
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        pUU.copydefault("WalletUsdgActivityViewModel", "updateUidFromIndependentApp: " + str);
        this.getFieldNames = str;
    }

    public final String isConnected() {
        String uid;
        if (C14728dqt.KWHzl.KWHzl()) {
            return this.getFieldNames;
        }
        User userOLrzqt = this.zLjUOn.OLrzqt();
        return (userOLrzqt == null || (uid = userOLrzqt.getUid()) == null) ? "" : uid;
    }
}

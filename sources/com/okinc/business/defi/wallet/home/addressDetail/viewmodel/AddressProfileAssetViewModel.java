package com.okinc.business.defi.wallet.home.addressDetail.viewmodel;

import androidx.lifecycle.ViewModelKt;
import com.okinc.business.defi.biz.net.bean.AddressAllAssetResponse;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.biz.net.bean.ChainAssetBean;
import com.okinc.business.defi.biz.net.bean.ProfileNetworkValuation;
import com.okinc.business.defi.biz.net.bean.ProfileNftAll;
import com.okinc.business.defi.biz.net.bean.ProfilePortfolio;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.C10854bwM;
import o.C10948byA;
import o.C10954byG;
import o.C13847daM;
import o.C13912dbY;
import o.C14455dll;
import o.C18914frR;
import o.C33129mqd;
import o.C54862xYb;
import o.C54864xYd;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.eWB;
import o.eWS;
import o.eWT;
import o.eWW;
import o.xWV;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class AddressProfileAssetViewModel extends AbstractC33073mpa {
    public final MutableStateFlow<eWS> AEQbTJ;
    public final SharedFlow<List<Long>> AYXKKw;
    public final HashMap<Long, String> AhwBna;
    public final C10948byA AkhnZx;
    public final eWB AuCTel;
    public final MutableSharedFlow<List<AddressTokenAsset>> AuCTelauCTel;
    public final MutableSharedFlow<Boolean> AubY;
    public final C14455dll AwvSrB;
    public final C13912dbY AxsJAY;
    public int DbNXlk;
    public final MutableSharedFlow<Boolean> EZpvd;
    public final MutableSharedFlow<List<Long>> KWHzl;
    public final MutableStateFlow<Boolean> OLrzqt;
    public final MutableSharedFlow<List<ProfileAssetChooseNetworkDialogFragment.NetworkData>> copydefault;
    public final eWW djBIcL;
    public final MutableSharedFlow<Boolean> ejfBZ;
    public final String fARcdN;
    public final StateFlow<eWS> fIwbmz;
    public final int fJNWhG;
    public final StateFlow<Boolean> fetchVPNInfo;
    public final C13847daM.StateListAnimator gEmmrt;
    public final C18914frR getFieldNames;
    public final SharedFlow<Boolean> getNewProxyInstance;
    public final SharedFlow<List<ProfileAssetChooseNetworkDialogFragment.NetworkData>> hDKMBd;
    public List<Long> isConnected;
    public ArrayList<ProfileAssetChooseNetworkDialogFragment.NetworkData> iwGUEr;
    public final C54864xYd sSMYrx;
    public final StateFlow<Boolean> uzCIH;
    public String valueOf;
    public final MutableStateFlow<Long> values;
    public int wlaJM;
    public final MutableSharedFlow<eWT> zLjUOn;
    public final MutableSharedFlow<List<AddressTokenAsset>> zsXlph;
    public final xWV zuBGHE;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HashMap<Long, String> AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(List<Long> list) {
        this.isConnected = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AYXKKw() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Boolean> AhwBna() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> AkhnZx() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<ProfileAssetChooseNetworkDialogFragment.NetworkData>> DbNXlk() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<List<Long>> EZpvd() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Boolean> KWHzl() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> OLrzqt() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Long> copydefault() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(int i) {
        this.DbNXlk = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Boolean> djBIcL() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<eWT> ejfBZ() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<List<AddressTokenAsset>> fetchVPNInfo() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<eWS> gEmmrt() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<List<AddressTokenAsset>> isConnected() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<ProfileAssetChooseNetworkDialogFragment.NetworkData> valueOf() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<Boolean> values() {
        return this.AubY;
    }

    @yCM
    public AddressProfileAssetViewModel(@NotNull eWW eww, @NotNull C18914frR c18914frR, @NotNull C13912dbY c13912dbY, @NotNull C13847daM.StateListAnimator stateListAnimator, @NotNull xWV xwv, @NotNull C14455dll c14455dll, @NotNull C54864xYd c54864xYd) {
        Intrinsics.checkNotNullParameter(eww, "");
        Intrinsics.checkNotNullParameter(c18914frR, "");
        Intrinsics.checkNotNullParameter(c13912dbY, "");
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        Intrinsics.checkNotNullParameter(xwv, "");
        Intrinsics.checkNotNullParameter(c14455dll, "");
        Intrinsics.checkNotNullParameter(c54864xYd, "");
        this.djBIcL = eww;
        this.getFieldNames = c18914frR;
        this.AxsJAY = c13912dbY;
        this.gEmmrt = stateListAnimator;
        this.zuBGHE = xwv;
        this.AwvSrB = c14455dll;
        this.sSMYrx = c54864xYd;
        this.fJNWhG = 30;
        this.fARcdN = "--";
        this.ejfBZ = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.zLjUOn = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AuCTelauCTel = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.zsXlph = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AubY = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        MutableSharedFlow<List<ProfileAssetChooseNetworkDialogFragment.NetworkData>> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.hDKMBd = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<eWS> MutableStateFlow = StateFlowKt.MutableStateFlow(new eWS("", null));
        this.AEQbTJ = MutableStateFlow;
        this.fIwbmz = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<Boolean> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default2;
        this.getNewProxyInstance = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        MutableStateFlow<Boolean> MutableStateFlow2 = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.OLrzqt = MutableStateFlow2;
        this.uzCIH = FlowKt.asStateFlow(MutableStateFlow2);
        this.AkhnZx = C10954byG.EZpvd.valueOf();
        this.iwGUEr = new ArrayList<>();
        this.AhwBna = new HashMap<>();
        this.values = StateFlowKt.MutableStateFlow(Long.MIN_VALUE);
        this.valueOf = "";
        MutableSharedFlow<List<Long>> mutableSharedFlowMutableSharedFlow$default3 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default3;
        this.AYXKKw = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default3);
        this.DbNXlk = 1;
        this.wlaJM = 1;
        eWB instance$default = eWB.ActionBar.getInstance$default(eWB.Companion, null, 1, null);
        this.AuCTel = instance$default;
        this.fetchVPNInfo = FlowKt.stateIn(instance$default.EZpvd(), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 5000L, 0L, 2, null), Boolean.valueOf(instance$default.KWHzl()));
    }

    public final boolean fJNWhG() {
        return this.AuCTel.KWHzl();
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new AddressProfileAssetViewModel$loadSupportChainInformation$1(this, str, null), 2, null);
    }

    public final void copydefault(@NotNull List<ProfileAssetChooseNetworkDialogFragment.NetworkData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.iwGUEr.clear();
        this.iwGUEr.addAll(list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadMoreAssetInformation$default(AddressProfileAssetViewModel addressProfileAssetViewModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        addressProfileAssetViewModel.EZpvd((List<Long>) list);
    }

    public final void EZpvd(List<Long> list) {
        Ref.IntRef intRef = new Ref.IntRef();
        int i = this.DbNXlk + 1;
        intRef.element = i;
        int i2 = this.wlaJM;
        if (i >= i2) {
            i = i2;
        }
        intRef.element = i;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetViewModel$loadMoreAssetInformation$1(this, list, intRef, null), 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void loadAddressAssetInformation$default(AddressProfileAssetViewModel addressProfileAssetViewModel, String str, List list, boolean z, int i, boolean z2, boolean z3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            list = null;
        }
        addressProfileAssetViewModel.KWHzl(str, list, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? 1 : i, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3);
    }

    public final void KWHzl(@NotNull String str, List<Long> list, boolean z, int i, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valueOf = str;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetViewModel$loadAddressAssetInformation$1(this, str, list, z, i, z && !z2, z2, z3, null), 2, null);
    }

    public final void KWHzl(long j, String str) {
        String orDefault = this.AhwBna.getOrDefault(Long.valueOf(j), "0");
        Intrinsics.checkNotNullExpressionValue(orDefault, "");
        this.AhwBna.put(Long.valueOf(j), C54862xYb.convertToString$default(C54862xYb.KWHzl(new BigDecimal(orDefault), str), false, null, null, 7, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BigDecimal calculateNftAssets$default(AddressProfileAssetViewModel addressProfileAssetViewModel, AddressAllAssetResponse addressAllAssetResponse, boolean z, List list, int i, Object obj) {
        if ((i & 4) != 0) {
            list = null;
        }
        return addressProfileAssetViewModel.OLrzqt(addressAllAssetResponse, z, (List<Long>) list);
    }

    public final BigDecimal OLrzqt(AddressAllAssetResponse addressAllAssetResponse, boolean z, List<Long> list) {
        ArrayList<ProfileNetworkValuation> networkValuations;
        BigDecimal bigDecimal = new BigDecimal("0");
        List<ProfileNftAll> nfts = addressAllAssetResponse.getNfts();
        if (nfts != null) {
            for (ProfileNftAll profileNftAll : nfts) {
                if (C33129mqd.KWHzl((Collection) list)) {
                    ArrayList<ProfileNetworkValuation> networkValuations2 = profileNftAll.getNetworkValuations();
                    if (networkValuations2 != null) {
                        for (ProfileNetworkValuation profileNetworkValuation : networkValuations2) {
                            if (list != null && list.contains(Long.valueOf(profileNetworkValuation.getGeneralChainId()))) {
                                bigDecimal = C54862xYb.KWHzl(bigDecimal, profileNetworkValuation.getValuation());
                            }
                        }
                    }
                } else {
                    if (C33129mqd.OLrzqt((CharSequence) profileNftAll.getValuation())) {
                        bigDecimal = C54862xYb.KWHzl(bigDecimal, profileNftAll.getValuation());
                    }
                    if (z && (networkValuations = profileNftAll.getNetworkValuations()) != null) {
                        for (ProfileNetworkValuation profileNetworkValuation2 : networkValuations) {
                            KWHzl(profileNetworkValuation2.getGeneralChainId(), profileNetworkValuation2.getValuation());
                        }
                    }
                }
            }
        }
        return bigDecimal;
    }

    public final BigDecimal AEQbTJ(AddressAllAssetResponse addressAllAssetResponse, boolean z) {
        BigDecimal bigDecimal = new BigDecimal("0");
        List<ProfilePortfolio> defis = addressAllAssetResponse.getDefis();
        if (defis != null) {
            for (ProfilePortfolio profilePortfolio : defis) {
                bigDecimal = C54862xYb.KWHzl(bigDecimal, profilePortfolio.getBalance());
                if (z && profilePortfolio.getChainId() != null && profilePortfolio.getBalance() != null) {
                    Long chainId = profilePortfolio.getChainId();
                    long jLongValue = chainId != null ? chainId.longValue() : 0L;
                    String balance = profilePortfolio.getBalance();
                    if (balance == null) {
                        balance = "0";
                    }
                    KWHzl(jLongValue, balance);
                }
            }
        }
        return bigDecimal;
    }

    public final void EZpvd(@NotNull String str, ArrayList<Long> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetViewModel$loadChainIndexListInformation$1(arrayList, this, str, null), 2, null);
    }

    public final void fARcdN() {
        this.AuCTel.OLrzqt(!this.AuCTel.KWHzl());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object copydefault(long j, @NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AddressProfileAssetViewModel$updateChain$1 addressProfileAssetViewModel$updateChain$1;
        AddressProfileAssetViewModel addressProfileAssetViewModel;
        if (continuation instanceof AddressProfileAssetViewModel$updateChain$1) {
            addressProfileAssetViewModel$updateChain$1 = (AddressProfileAssetViewModel$updateChain$1) continuation;
            int i = addressProfileAssetViewModel$updateChain$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addressProfileAssetViewModel$updateChain$1.label = i - Integer.MIN_VALUE;
            } else {
                addressProfileAssetViewModel$updateChain$1 = new AddressProfileAssetViewModel$updateChain$1(this, continuation);
            }
        }
        Object obj = addressProfileAssetViewModel$updateChain$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = addressProfileAssetViewModel$updateChain$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            MutableStateFlow<Long> mutableStateFlow = this.values;
            Long lKWHzl = C56443yFo.KWHzl(j);
            addressProfileAssetViewModel$updateChain$1.L$0 = this;
            addressProfileAssetViewModel$updateChain$1.L$1 = str;
            addressProfileAssetViewModel$updateChain$1.label = 1;
            if (mutableStateFlow.emit(lKWHzl, addressProfileAssetViewModel$updateChain$1) == objCopydefault) {
                return objCopydefault;
            }
            addressProfileAssetViewModel = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) addressProfileAssetViewModel$updateChain$1.L$1;
            addressProfileAssetViewModel = (AddressProfileAssetViewModel) addressProfileAssetViewModel$updateChain$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        addressProfileAssetViewModel.copydefault(str);
        return Unit.INSTANCE;
    }

    public final void copydefault(String str) {
        this.AEQbTJ.setValue(new eWS(str, (C10854bwM) CollectionsKt___CollectionsKt.firstOrNull(this.AkhnZx.OLrzqt(str))));
    }

    public final eWS AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((Object) str, (Object) this.AEQbTJ.getValue().EZpvd())) {
            return this.AEQbTJ.getValue();
        }
        return null;
    }

    public final void EZpvd(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AddressProfileAssetViewModel$updateFilterRiskyTokenStatus$1(this, z, null), 2, null);
    }

    public final void AEQbTJ(boolean z) {
        this.OLrzqt.setValue(Boolean.valueOf(z));
    }

    public final void KWHzl(List<ChainAssetBean> list) {
        for (ChainAssetBean chainAssetBean : list) {
            long chainIndex = chainAssetBean.getChainIndex();
            String currencyAmount = chainAssetBean.getCurrencyAmount();
            if (currencyAmount == null) {
                currencyAmount = "0";
            }
            KWHzl(chainIndex, currencyAmount);
        }
    }
}

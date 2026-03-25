package com.okinc.business.invest_biz.ui.screens.univ3;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3RedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.bean.response.TransactionStepTokenInfo;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.InvestUniv3RedeemReceiveInfoHandle;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel;
import com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel;
import com.okinc.network.okg.response.ResponseFailedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.C23953iPl;
import o.C23955iPn;
import o.C23957iPp;
import o.C23958iPq;
import o.C23959iPr;
import o.C23960iPs;
import o.C27164jpy;
import o.C27492jwH;
import o.C27493jwI;
import o.C27505jwU;
import o.C33129mqd;
import o.C56402yEa;
import o.C56403yEb;
import o.C59449zhJ;
import o.InterfaceC24173iXp;
import o.InterfaceC27092jof;
import o.InterfaceC27093jog;
import o.InterfaceC27096joj;
import o.InterfaceC58227yxM;
import o.iAL;
import o.iCP;
import o.iXD;
import o.iXH;
import o.iXN;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3FarmRedeemViewModel extends AbstractC33073mpa implements InterfaceC27096joj, InterfaceC27093jog, InterfaceC27092jof {
    public final MutableSharedFlow<iXD> AEQbTJ;
    public InvestUniv3RedeemReceiveInfo AYXKKw;
    public long AhwBna;
    public final MutableLiveData<Boolean> AkhnZx;
    public MutableLiveData<Boolean> AuCTel;
    public final MutableLiveData<C23959iPr> AuCTelauCTel;
    public MutableLiveData<InvestRedeemViewModel.RedeemResult> AubY;
    public final MutableLiveData<C23955iPn> AwvSrB;
    public String AxsJAY;
    public final MutableLiveData<Boolean> DbNXlk;
    public MutableLiveData<InvestConsumeData<Boolean>> EZpvd;
    public Bundle KWHzl;
    public MutableStateFlow<InterfaceC24173iXp> OLrzqt;
    public final StateFlow<InterfaceC24173iXp> copydefault;

    @yCM
    public iXH ctaButtonUseCase;
    public MutableLiveData<InvestGasPriceConfig> djBIcL;
    public long ejfBZ;
    public C27164jpy fARcdN;
    public boolean fIwbmz;
    public InvestUniv3RedeemReceiveInfoHandle fJNWhG;
    public final MutableLiveData<C23958iPq> fetchVPNInfo;
    public ResponseState gEmmrt;
    public MutableLiveData<C23953iPl> gHZMYf;
    public final SavedStateHandle getFieldNames;
    public boolean getNewProxyInstance;
    public MutableLiveData<ResponseState> hDKMBd;
    public MutableLiveData<InvestRedeemViewModel.ActionBar> isConnected;
    public final MutableLiveData<InvestRedeemReceiveInfoUIBean> iwGUEr;
    public final MutableLiveData<C23960iPs> sSMYrx;

    @yCM
    public iXN settleTransactionUseCase;
    public final MutableLiveData<Boolean> uzCIH;
    public InvestUniv3RedeemInitialInfo valueOf;
    public InvestInputData values;
    public final MutableLiveData<C23957iPp> wlaJM;
    public String zLjUOn;
    public final SharedFlow<iXD> zsXlph;
    public String zuBGHE;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ResponseStateType.values().length];
            try {
                iArr[ResponseStateType.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResponseStateType.NET_ERRO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ResponseStateType.SERVER_ERRRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24173iXp> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RedeemInitialInfo AYXKKw() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AhwBna() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23955iPn> AuCTel() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27093jog
    public MutableLiveData<InvestRedeemReceiveInfoUIBean> DbNXlk() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(Bundle bundle) {
        this.KWHzl = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str, @NotNull String str2, long j, long j2, @NotNull String str3, boolean z, InvestInputData investInputData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AxsJAY = str;
        this.zuBGHE = str2;
        this.ejfBZ = j;
        this.zLjUOn = str3;
        this.fIwbmz = z;
        this.AhwBna = j2;
        this.values = investInputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestGasPriceConfig> OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestConsumeData<Boolean>> copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<iXD> ejfBZ() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23959iPr> fJNWhG() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3RedeemReceiveInfo gEmmrt() {
        return this.AYXKKw;
    }

    public final void getFieldNames() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27092jof
    public MutableLiveData<C23960iPs> getNewProxyInstance() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23953iPl> iwGUEr() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> uzCIH() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23958iPq> valueOf() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ResponseState> values() {
        return this.hDKMBd;
    }

    @yCM
    public InvestUniv3FarmRedeemViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.getFieldNames = savedStateHandle;
        this.djBIcL = new MutableLiveData<>();
        this.EZpvd = new MutableLiveData<>();
        this.AxsJAY = "";
        this.zuBGHE = "";
        this.zLjUOn = "";
        this.fARcdN = new C27164jpy();
        this.AuCTelauCTel = new MutableLiveData<>();
        this.sSMYrx = new MutableLiveData<>();
        this.AwvSrB = new MutableLiveData<>();
        this.wlaJM = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.gHZMYf = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.hDKMBd = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.AubY = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.fJNWhG = new InvestUniv3RedeemReceiveInfoHandle();
        MutableStateFlow<InterfaceC24173iXp> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<iXD> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.AEQbTJ = mutableSharedFlowMutableSharedFlow$default;
        this.zsXlph = mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionConfig wlaJM() {
        return (TransactionConfig) this.getFieldNames.get("key.trx_config");
    }

    public final InvestTradeManager.TransactionResultExtraData fIwbmz() {
        return AkhnZx().copydefault();
    }

    public final iXH EZpvd() {
        iXH ixh = this.ctaButtonUseCase;
        if (ixh != null) {
            return ixh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final iXN AkhnZx() {
        iXN ixn = this.settleTransactionUseCase;
        if (ixn != null) {
            return ixn;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final void copydefault(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC58185ywX<InvestUniv3RedeemInitialInfo> abstractC58185ywXOLrzqt = iAL.EZpvd.OLrzqt(str, j, str2, str4, z, str3);
        final Function1 function1 = new Function1() { // from class: o.jjM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3FarmRedeemViewModel.AEQbTJ(this.AEQbTJ, (InvestUniv3RedeemInitialInfo) obj);
            }
        };
        InterfaceC58227yxM<? super InvestUniv3RedeemInitialInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jjK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestUniv3FarmRedeemViewModel.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jjP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3FarmRedeemViewModel.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jjQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestUniv3FarmRedeemViewModel.copydefault(function12, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo) {
        if (investUniv3RedeemInitialInfo == null) {
            investUniv3FarmRedeemViewModel.fetchVPNInfo.setValue(new C23958iPq(false, false));
        } else {
            investUniv3FarmRedeemViewModel.valueOf = investUniv3RedeemInitialInfo;
            investUniv3FarmRedeemViewModel.AwvSrB();
            investUniv3FarmRedeemViewModel.copydefault(investUniv3FarmRedeemViewModel.new Activity());
        }
        return Unit.INSTANCE;
    }

    public static final class Activity implements yHO<Boolean, Boolean, Boolean, Unit> {
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            KWHzl(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            return Unit.INSTANCE;
        }

        public void KWHzl(boolean z, boolean z2, boolean z3) {
            InvestUniv3FarmRedeemViewModel.this.valueOf().setValue(new C23958iPq(z, z2));
        }
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, Throwable th) {
        if ((th instanceof ResponseFailedException) || (th instanceof IllegalArgumentException)) {
            investUniv3FarmRedeemViewModel.fetchVPNInfo.setValue(new C23958iPq(false, false));
        } else {
            investUniv3FarmRedeemViewModel.fetchVPNInfo.setValue(new C23958iPq(false, true));
        }
        return Unit.INSTANCE;
    }

    private final void AwvSrB() {
        this.DbNXlk.setValue(Boolean.FALSE);
    }

    private final void KWHzl(int i) {
        AEQbTJ(i);
        OLrzqt(i);
        EZpvd(i);
        copydefault(i);
    }

    public final void AEQbTJ(int i) {
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo;
        if (i != 2 || (investUniv3RedeemReceiveInfo = this.AYXKKw) == null) {
            return;
        }
        this.AuCTel.setValue(Boolean.valueOf(investUniv3RedeemReceiveInfo.isActive()));
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo = this.valueOf;
        if (investUniv3RedeemInitialInfo != null) {
            copydefault(investUniv3RedeemInitialInfo, investUniv3RedeemReceiveInfo);
        }
    }

    public final void copydefault(InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo, InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo) {
        if (investUniv3RedeemInitialInfo.getUnderlyingTokenList().size() > 1) {
            this.AuCTelauCTel.setValue(new C23959iPr(investUniv3RedeemInitialInfo.getInvestmentName(), investUniv3RedeemInitialInfo.getFeeRate(), investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(0).getTokenSymbol(), investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(1).getTokenSymbol(), C33129mqd.divS$default(1, investUniv3RedeemReceiveInfo.getUpperPrice(), null, null, null, 14, null), C33129mqd.divS$default(1, investUniv3RedeemReceiveInfo.getLowerPrice(), null, null, null, 14, null), false, false, 128, null));
        }
    }

    public final void copydefault(InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo, String str, boolean z, boolean z2) {
        if (investUniv3RedeemInitialInfo.getUnderlyingTokenList().size() > 1) {
            String tokenSymbol = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(0).getTokenSymbol();
            String tokenSymbol2 = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(1).getTokenSymbol();
            this.AwvSrB.setValue(new C23955iPn(C33129mqd.divS$default(1, str, null, null, null, 14, null), tokenSymbol, tokenSymbol2, z, z2, 0, 32, null));
        }
    }

    public final void OLrzqt(int i) {
        List listAhwBna;
        String currentPrice;
        List<InvestTokenWithAmount> receiveTokenList;
        String str = "";
        if (i != 1) {
            if (i == 2) {
                InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
                if (investUniv3RedeemReceiveInfo != null) {
                    List<InvestTokenWithAmount> receiveTokenList2 = investUniv3RedeemReceiveInfo.getReceiveTokenList();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : receiveTokenList2) {
                        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
                        if (!Intrinsics.EZpvd((Object) investTokenWithAmount.getTokenId(), (Object) "") || !Intrinsics.EZpvd((Object) investTokenWithAmount.getCoinAmount(), (Object) "0")) {
                            arrayList.add(obj);
                        }
                    }
                    String currentPrice2 = investUniv3RedeemReceiveInfo.getCurrentPrice();
                    Iterator<T> it = investUniv3RedeemReceiveInfo.getAssetsList().iterator();
                    String strAddS$default = "0";
                    while (it.hasNext()) {
                        strAddS$default = C33129mqd.addS$default(strAddS$default, ((InvestTokenWithAmount) it.next()).getCurrencyAmount(), null, null, null, 14, null);
                    }
                    Iterator<T> it2 = investUniv3RedeemReceiveInfo.getFeeEarning().iterator();
                    String strAddS$default2 = strAddS$default;
                    while (it2.hasNext()) {
                        strAddS$default2 = C33129mqd.addS$default(strAddS$default2, ((InvestTokenWithAmount) it2.next()).getCurrencyAmount(), null, null, null, 14, null);
                    }
                    MutableLiveData<C23960iPs> newProxyInstance = getNewProxyInstance();
                    List<InvestTokenWithAmount> assetsList = investUniv3RedeemReceiveInfo.getAssetsList();
                    List<InvestTokenWithAmount> feeEarning = investUniv3RedeemReceiveInfo.getFeeEarning();
                    List<InvestTokenWithAmount> rewardList = investUniv3RedeemReceiveInfo.getRewardList();
                    List<InvestTokenWithAmount> receiveTokenList3 = investUniv3RedeemReceiveInfo.getReceiveTokenList();
                    PromptInformation promptInformation = investUniv3RedeemReceiveInfo.getPromptInformation();
                    newProxyInstance.setValue(new C23960iPs(assetsList, feeEarning, rewardList, receiveTokenList3, null, promptInformation != null ? promptInformation.getPendingFeeTip() : null, this.zLjUOn, strAddS$default2, false, false, null, 1536, null));
                    InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo = this.valueOf;
                    if (investUniv3RedeemInitialInfo != null) {
                        DbNXlk().setValue(new InvestRedeemReceiveInfoUIBean(false, investUniv3RedeemInitialInfo.getPlatformLogo(), investUniv3RedeemInitialInfo.getPlatformName(), yDY.AhwBna(), (List) arrayList, false, (Integer) null, (InvestTipsBean) null, (InvestExchangeRateBean) null, (InvestTokenWithAmount) null, (InvestTipInfoVo) null, 2016, (DefaultConstructorMarker) null));
                        copydefault(investUniv3RedeemInitialInfo, currentPrice2, false, false);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != 5) {
                return;
            }
        }
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo2 = this.valueOf;
        if (investUniv3RedeemInitialInfo2 != null) {
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo2 = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo2 == null || (receiveTokenList = investUniv3RedeemReceiveInfo2.getReceiveTokenList()) == null) {
                listAhwBna = null;
            } else {
                listAhwBna = new ArrayList();
                for (Object obj2 : receiveTokenList) {
                    InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) obj2;
                    if (!Intrinsics.EZpvd((Object) investTokenWithAmount2.getTokenId(), (Object) "") || !Intrinsics.EZpvd((Object) investTokenWithAmount2.getCoinAmount(), (Object) "0")) {
                        listAhwBna.add(obj2);
                    }
                }
            }
            MutableLiveData<C23960iPs> newProxyInstance2 = getNewProxyInstance();
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo3 = this.AYXKKw;
            List<InvestTokenWithAmount> assetsList2 = investUniv3RedeemReceiveInfo3 != null ? investUniv3RedeemReceiveInfo3.getAssetsList() : null;
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo4 = this.AYXKKw;
            List<InvestTokenWithAmount> feeEarning2 = investUniv3RedeemReceiveInfo4 != null ? investUniv3RedeemReceiveInfo4.getFeeEarning() : null;
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo5 = this.AYXKKw;
            List<InvestTokenWithAmount> rewardList2 = investUniv3RedeemReceiveInfo5 != null ? investUniv3RedeemReceiveInfo5.getRewardList() : null;
            PromptInformation promptInformation2 = investUniv3RedeemInitialInfo2.getPromptInformation();
            newProxyInstance2.setValue(new C23960iPs(assetsList2, feeEarning2, rewardList2, null, null, promptInformation2 != null ? promptInformation2.getPendingFeeTip() : null, this.zLjUOn, "", false, true, null, 1024, null));
            MutableLiveData<InvestRedeemReceiveInfoUIBean> mutableLiveDataDbNXlk = DbNXlk();
            String platformLogo = investUniv3RedeemInitialInfo2.getPlatformLogo();
            String platformName = investUniv3RedeemInitialInfo2.getPlatformName();
            List listAhwBna2 = yDY.AhwBna();
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            mutableLiveDataDbNXlk.setValue(new InvestRedeemReceiveInfoUIBean(false, platformLogo, platformName, listAhwBna2, listAhwBna, true, (Integer) null, (InvestTipsBean) null, (InvestExchangeRateBean) null, (InvestTokenWithAmount) null, (InvestTipInfoVo) null, 1984, (DefaultConstructorMarker) null));
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo6 = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo6 != null && (currentPrice = investUniv3RedeemReceiveInfo6.getCurrentPrice()) != null) {
                str = currentPrice;
            }
            copydefault(investUniv3RedeemInitialInfo2, str, false, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void EZpvd(int i) {
        int i2;
        boolean z;
        InvestGasPriceConfig value;
        InvestSlippageConfig investSlippage;
        int i3 = 0;
        this.getNewProxyInstance = false;
        if (i != 2 || (value = OLrzqt().getValue()) == null || (investSlippage = value.getInvestSlippage()) == null) {
            i2 = 0;
            z = false;
        } else {
            String first = copydefault(OLrzqt().getValue()).getFirst();
            boolean z2 = true;
            if (investSlippage.getType() == 2) {
                if (C33129mqd.AEQbTJ(investSlippage.getAutomaticValue(), investSlippage.getCustomMax())) {
                    this.getNewProxyInstance = true;
                } else if (!C33129mqd.OLrzqt(investSlippage.getAutomaticValue(), investSlippage.getCustomMax())) {
                    if (C33129mqd.AEQbTJ(first, investSlippage.getCustomSafe())) {
                        i3 = 1;
                    } else {
                        z2 = false;
                    }
                }
                i3 = 2;
            } else if ((!C33129mqd.AEQbTJ(first, investSlippage.getAutomaticValue()) || !C33129mqd.copydefault(first, investSlippage.getCustomSafe()) || !C33129mqd.valueOf(first, investSlippage.getCustomMax())) && (!C33129mqd.copydefault(first, investSlippage.getCustomSafe()) || !C33129mqd.gEmmrt(first, investSlippage.getAutomaticValue()))) {
            }
            i2 = i3;
            z = z2;
        }
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo = this.valueOf;
        if (investUniv3RedeemInitialInfo != null) {
            MutableLiveData<C23953iPl> mutableLiveData = this.gHZMYf;
            String network = investUniv3RedeemInitialInfo.getNetwork();
            String networkLogo = investUniv3RedeemInitialInfo.getNetworkLogo();
            String strFetchVPNInfo = OLrzqt().getValue() != null ? fetchVPNInfo() : "";
            InvestGasPriceConfig value2 = OLrzqt().getValue();
            String strIsConnected = (value2 != null ? value2.getInvestSlippage() : null) != null ? isConnected() : "";
            InvestGasPriceConfig value3 = OLrzqt().getValue();
            mutableLiveData.setValue(new C23953iPl(i, true, network, networkLogo, strFetchVPNInfo, strIsConnected, value3 != null ? Boolean.valueOf(C27505jwU.OLrzqt(value3)) : null, i2, "", z));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(int i) {
        String tokenAddress;
        if (i == 0) {
            this.wlaJM.setValue(new C23957iPp(true, false, 0, null, null, 24, null));
        } else if (i == 1) {
            this.wlaJM.setValue(new C23957iPp(false, true, 0, null, null, 24, null));
        } else if (i == 2) {
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo != null) {
                MutableLiveData<C23957iPp> mutableLiveData = this.wlaJM;
                List<InvestTokenWithApprove> approveStatusList = investUniv3RedeemReceiveInfo.getApproveStatusList();
                InvestInputData investInputData = this.values;
                String approvedTokenAddress = investInputData != null ? investInputData.getApprovedTokenAddress() : null;
                InvestInputData investInputData2 = this.values;
                if (investInputData2 == null || (tokenAddress = investInputData2.getTokenAddress()) == null) {
                    tokenAddress = "";
                }
                if (approvedTokenAddress == null || approvedTokenAddress.length() == 0 || StringsKt__StringsKt.fARcdN((CharSequence) approvedTokenAddress)) {
                    approvedTokenAddress = tokenAddress;
                }
                mutableLiveData.setValue(new C23957iPp(false, false, 0, approveStatusList, KWHzl(approvedTokenAddress)));
            }
        } else if (i != 4) {
            if (i == 5) {
            }
        }
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo2 = this.AYXKKw;
        if (investUniv3RedeemReceiveInfo2 != null) {
            EZpvd(investUniv3RedeemReceiveInfo2.getTransactionStepList());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmRedeemViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getReceiveInfoAndCheckState$default(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, yHO yho, int i, Object obj) {
        if ((i & 1) != 0) {
            yho = null;
        }
        investUniv3FarmRedeemViewModel.copydefault((yHO<? super Boolean, ? super Boolean, ? super Boolean, Unit>) yho);
    }

    public final void copydefault(final yHO<? super Boolean, ? super Boolean, ? super Boolean, Unit> yho) {
        final Ref.IntRef intRef = new Ref.IntRef();
        this.fJNWhG.getReceiveInfo(this.AxsJAY, this.zuBGHE, this.ejfBZ, "", this.zLjUOn, this.fIwbmz, null, new Function1() { // from class: o.jjS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3FarmRedeemViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
            }
        }, new Function2() { // from class: o.jjR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestUniv3FarmRedeemViewModel.AEQbTJ(this.OLrzqt, intRef, yho, (ResponseState) obj, (kotlin.Pair) obj2);
            }
        });
    }

    public static final String EZpvd(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        return investUniv3FarmRedeemViewModel.copydefault(investGasPriceConfig).getFirst();
    }

    public static final Unit AEQbTJ(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, Ref.IntRef intRef, yHO yho, ResponseState responseState, Pair pair) {
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo;
        InvestGasPriceConfig investGasPriceConfig;
        Intrinsics.checkNotNullParameter(responseState, "");
        MutableLiveData<Boolean> mutableLiveData = investUniv3FarmRedeemViewModel.AkhnZx;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        investUniv3FarmRedeemViewModel.uzCIH.setValue(bool);
        investUniv3FarmRedeemViewModel.AYXKKw = pair != null ? (InvestUniv3RedeemReceiveInfo) pair.getSecond() : null;
        if (pair != null && (investGasPriceConfig = (InvestGasPriceConfig) pair.getFirst()) != null) {
            investGasPriceConfig.setEstimateGasFee(((InvestUniv3RedeemReceiveInfo) pair.getSecond()).getEstimateGasFee());
        }
        investUniv3FarmRedeemViewModel.OLrzqt().setValue(pair != null ? (InvestGasPriceConfig) pair.getFirst() : null);
        investUniv3FarmRedeemViewModel.gEmmrt = responseState;
        int i = StateListAnimator.AEQbTJ[responseState.getErrorType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                investUniv3FarmRedeemViewModel.hDKMBd.setValue(responseState);
                intRef.element = 1;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (responseState.getErrorCode() == 10002) {
                    intRef.element = 5;
                } else {
                    investUniv3FarmRedeemViewModel.hDKMBd.setValue(responseState);
                    intRef.element = 1;
                }
            }
        } else if (pair != null) {
            intRef.element = 2;
        } else {
            investUniv3FarmRedeemViewModel.hDKMBd.setValue(responseState);
            intRef.element = 1;
        }
        investUniv3FarmRedeemViewModel.KWHzl(intRef.element);
        if (yho != null) {
            yho.invoke(Boolean.valueOf(responseState.getErrorType() == ResponseStateType.NORMAL && pair != null), Boolean.valueOf(responseState.getErrorType() == ResponseStateType.NET_ERRO), Boolean.valueOf((pair == null || (investUniv3RedeemReceiveInfo = (InvestUniv3RedeemReceiveInfo) pair.getSecond()) == null || !investUniv3RedeemReceiveInfo.isActive()) ? false : true));
        }
        return Unit.INSTANCE;
    }

    public final String isConnected() {
        String first = copydefault(OLrzqt().getValue()).getFirst();
        return first.length() > 0 ? C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, first, false, 2, null) : "--";
    }

    public final String fetchVPNInfo() {
        String strEZpvd = this.fARcdN.EZpvd(String.valueOf(this.AhwBna));
        InvestGasPriceConfig value = OLrzqt().getValue();
        String strCopydefault = value != null ? C27505jwU.copydefault(value, strEZpvd) : null;
        return (strCopydefault == null || strCopydefault.length() == 0) ? "--" : C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, strCopydefault, null, null, null, 14, null);
    }

    @Override // o.InterfaceC27096joj
    public void copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fARcdN.AEQbTJ(str, z);
    }

    @Override // o.InterfaceC27096joj
    public void fARcdN() {
        InvestSlippageConfig investSlippage;
        C27164jpy c27164jpy = this.fARcdN;
        long j = this.AhwBna;
        InvestGasPriceConfig value = OLrzqt().getValue();
        c27164jpy.AEQbTJ(String.valueOf(j), (value == null || (investSlippage = value.getInvestSlippage()) == null) ? null : Integer.valueOf(investSlippage.getType()));
    }

    @Override // o.InterfaceC27096joj
    public Pair<String, Boolean> djBIcL() {
        return copydefault(OLrzqt().getValue());
    }

    public final Pair<String, Boolean> copydefault(InvestGasPriceConfig investGasPriceConfig) {
        InvestSlippageConfig investSlippage;
        InvestSlippageConfig investSlippage2;
        InvestSlippageConfig investSlippage3;
        C27164jpy c27164jpy = this.fARcdN;
        long j = this.AhwBna;
        Integer numValueOf = null;
        String automaticValue = (investGasPriceConfig == null || (investSlippage3 = investGasPriceConfig.getInvestSlippage()) == null) ? null : investSlippage3.getAutomaticValue();
        String customMax = (investGasPriceConfig == null || (investSlippage2 = investGasPriceConfig.getInvestSlippage()) == null) ? null : investSlippage2.getCustomMax();
        if (investGasPriceConfig != null && (investSlippage = investGasPriceConfig.getInvestSlippage()) != null) {
            numValueOf = Integer.valueOf(investSlippage.getType());
        }
        return c27164jpy.AEQbTJ(String.valueOf(j), automaticValue, customMax, numValueOf);
    }

    public static /* synthetic */ void submitTransaction$default(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, Context context, boolean z, InvestTokenWithApprove investTokenWithApprove, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            investTokenWithApprove = null;
        }
        investUniv3FarmRedeemViewModel.OLrzqt(context, z, investTokenWithApprove);
    }

    public final void OLrzqt(@NotNull Context context, boolean z, final InvestTokenWithApprove investTokenWithApprove) {
        Integer orderType;
        Integer orderType2;
        Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            InvestTradeManager.submitTransaction$default(InvestTradeManager.OLrzqt, context, copydefault((investTokenWithApprove == null || (orderType2 = investTokenWithApprove.getOrderType()) == null) ? InvestAction.RedeemApprove.getValue() : orderType2.intValue(), true, investTokenWithApprove), null, new yHO() { // from class: o.jjL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InvestUniv3FarmRedeemViewModel.OLrzqt(this.KWHzl, investTokenWithApprove, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
                }
            }, 4, null);
        } else {
            InvestTradeManager.submitTransaction$default(InvestTradeManager.OLrzqt, context, genInvestTxModel$default(this, (investTokenWithApprove == null || (orderType = investTokenWithApprove.getOrderType()) == null) ? InvestAction.Redeem.getValue() : orderType.intValue(), false, null, 4, null), null, new yHO() { // from class: o.jjN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InvestUniv3FarmRedeemViewModel.KWHzl(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
                }
            }, 4, null);
        }
    }

    public static final Unit OLrzqt(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        investUniv3FarmRedeemViewModel.isConnected.setValue(new InvestRedeemViewModel.ActionBar(investTokenWithApprove, i, bundle));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        investUniv3FarmRedeemViewModel.AubY.setValue(new InvestRedeemViewModel.RedeemResult(i, bundle, transactionResultExtraData));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ InvestTxModel genInvestTxModel$default(InvestUniv3FarmRedeemViewModel investUniv3FarmRedeemViewModel, int i, boolean z, InvestTokenWithApprove investTokenWithApprove, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            investTokenWithApprove = null;
        }
        return investUniv3FarmRedeemViewModel.copydefault(i, z, investTokenWithApprove);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTxModel copydefault(int i, boolean z, InvestTokenWithApprove investTokenWithApprove) {
        long j;
        InvestTokenWithAmount investTokenWithAmount;
        List listEZpvd;
        List<InvestTokenWithAmount> swapFromTokenList;
        InvestTokenWithAmount investTokenWithAmount2;
        Object next;
        List list;
        String estimateGasFee;
        List<InvestTokenWithAmount> rewardList;
        List arrayList;
        List<InvestTokenWithApprove> approveStatusList;
        String str = this.AxsJAY;
        String str2 = this.zuBGHE;
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(this.ejfBZ));
        long j2 = this.AhwBna;
        if (z) {
            if (InvestAction.Companion.copydefault(i) == InvestAction.RedeemApprove) {
                InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
                if (investUniv3RedeemReceiveInfo == null || (approveStatusList = investUniv3RedeemReceiveInfo.getApproveStatusList()) == null) {
                    arrayList = yDY.AhwBna();
                } else {
                    arrayList = new ArrayList(C56403yEb.AYXKKw(approveStatusList, 10));
                    for (InvestTokenWithApprove investTokenWithApprove2 : approveStatusList) {
                        arrayList.add(new InvestTokenWithAmount(investTokenWithApprove2.getChainId(), "0", (String) null, false, false, (String) null, investTokenWithApprove2.getTokenAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435388, (DefaultConstructorMarker) null));
                    }
                }
            } else {
                InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo2 = this.AYXKKw;
                if (investUniv3RedeemReceiveInfo2 == null || (rewardList = investUniv3RedeemReceiveInfo2.getRewardList()) == null) {
                    j = j2;
                    listEZpvd = yDY.AhwBna();
                } else {
                    arrayList = new ArrayList(C56403yEb.AYXKKw(rewardList, 10));
                    Iterator it = rewardList.iterator();
                    while (it.hasNext()) {
                        InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) it.next();
                        arrayList.add(new InvestTokenWithAmount(investTokenWithAmount3.getChainId(), C33129mqd.mulS$default(investTokenWithAmount3.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount3.getTokenPrecision()))), null, null, null, 14, null), investTokenWithAmount3.getCurrencyAmount(), false, false, (String) null, investTokenWithAmount3.getTokenAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, investTokenWithAmount3.getTokenAddress(), (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268402616, (DefaultConstructorMarker) null));
                        it = it;
                        j2 = j2;
                    }
                }
            }
            j = j2;
            list = arrayList;
            String strEZpvd = this.fARcdN.EZpvd(String.valueOf(this.AhwBna));
            String strZLjUOn = zLjUOn();
            InvestGasPriceConfig value = OLrzqt().getValue();
            String str3 = (value != null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
            String strAubY = AubY();
            String first = copydefault(OLrzqt().getValue()).getFirst();
            String json = new Gson().toJson(copydefault(investTokenWithApprove));
            Intrinsics.checkNotNullExpressionValue(json, "");
            return new InvestTxModel(i, str, str2, listEZpvd2, (Long) null, j, "0", (List) null, (List) null, (List) null, list, strEZpvd, strZLjUOn, str3, strAubY, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, this.zLjUOn, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134347888, 65535, (DefaultConstructorMarker) null);
        }
        j = j2;
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo3 = this.AYXKKw;
        if (investUniv3RedeemReceiveInfo3 == null || (swapFromTokenList = investUniv3RedeemReceiveInfo3.getSwapFromTokenList()) == null || (investTokenWithAmount2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(swapFromTokenList)) == null || (investTokenWithAmount = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null)) == null) {
            investTokenWithAmount = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
        } else {
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo4 = this.AYXKKw;
            Intrinsics.copydefault(investUniv3RedeemReceiveInfo4);
            Iterator<T> it2 = investUniv3RedeemReceiveInfo4.getTokenInfoList().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (C59449zhJ.gEmmrt(((ExpectTokenInfo) next).getTokenAddress(), investTokenWithAmount.getTokenAddress(), true)) {
                    break;
                }
            }
            ExpectTokenInfo expectTokenInfo = (ExpectTokenInfo) next;
            investTokenWithAmount.setExpectTokenAddress(expectTokenInfo != null ? expectTokenInfo.getExpectTokenAddress() : null);
            investTokenWithAmount.setChainId(investTokenWithAmount.getChainId() != 0 ? investTokenWithAmount.getChainId() : this.AhwBna);
            String coinAmount = investTokenWithAmount.getCoinAmount();
            if (coinAmount.length() == 0) {
                coinAmount = "1";
            }
            investTokenWithAmount.setCoinAmount(coinAmount);
            Unit unit = Unit.INSTANCE;
        }
        listEZpvd = C56402yEa.EZpvd(investTokenWithAmount);
        list = listEZpvd;
        String strEZpvd2 = this.fARcdN.EZpvd(String.valueOf(this.AhwBna));
        String strZLjUOn2 = zLjUOn();
        InvestGasPriceConfig value2 = OLrzqt().getValue();
        if (value2 != null) {
        }
        String strAubY2 = AubY();
        String first2 = copydefault(OLrzqt().getValue()).getFirst();
        String json2 = new Gson().toJson(copydefault(investTokenWithApprove));
        Intrinsics.checkNotNullExpressionValue(json2, "");
        return new InvestTxModel(i, str, str2, listEZpvd2, (Long) null, j, "0", (List) null, (List) null, (List) null, list, strEZpvd2, strZLjUOn2, str3, strAubY2, first2, json2, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, this.zLjUOn, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134347888, 65535, (DefaultConstructorMarker) null);
    }

    private final InvestTransactionParam copydefault(InvestTokenWithApprove investTokenWithApprove) {
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(this.ejfBZ));
        List listEZpvd2 = C56402yEa.EZpvd(new InvestInputData("0", investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, false, false, 24, (DefaultConstructorMarker) null));
        long j = this.AhwBna;
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo = this.valueOf;
        Long analysisPlatformId = investUniv3RedeemInitialInfo != null ? investUniv3RedeemInitialInfo.getAnalysisPlatformId() : null;
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo2 = this.valueOf;
        return new InvestTransactionParam(listEZpvd2, this.fIwbmz, false, j, investUniv3RedeemInitialInfo2 != null ? Integer.valueOf(investUniv3RedeemInitialInfo2.getInvestType()) : null, analysisPlatformId, (String) null, listEZpvd, (Long) null, (Integer) null, this.zLjUOn, (Integer) 2, (Integer) null, (InvestPoolV3) null, (Integer) null, (Boolean) null, 62276, (DefaultConstructorMarker) null);
    }

    private final String AubY() {
        String strKWHzl;
        String strEZpvd = this.fARcdN.EZpvd(String.valueOf(this.AhwBna));
        InvestGasPriceConfig value = OLrzqt().getValue();
        return (value == null || (strKWHzl = C27505jwU.KWHzl(value, strEZpvd)) == null) ? "" : strKWHzl;
    }

    private final String zLjUOn() {
        String strOLrzqt;
        String strEZpvd = this.fARcdN.EZpvd(String.valueOf(this.AhwBna));
        InvestGasPriceConfig value = OLrzqt().getValue();
        return (value == null || (strOLrzqt = C27505jwU.OLrzqt(value, strEZpvd)) == null) ? "" : strOLrzqt;
    }

    public final InvestTokenWithAmount KWHzl(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435391, (DefaultConstructorMarker) null);
    }

    public final void AuCTelauCTel() {
        if (Intrinsics.EZpvd(this.DbNXlk.getValue(), Boolean.FALSE)) {
            getReceiveInfoAndCheckState$default(this, null, 1, null);
        }
    }

    public final void hDKMBd() {
        this.fJNWhG.dispose();
    }

    private final void EZpvd(List<TransactionStep> list) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3FarmRedeemViewModel$reloadCTAButton$1(this, list, null), 3, null);
    }

    public final void OLrzqt(Function0<Unit> function0) {
        getReceiveInfoAndCheckState$default(this, null, 1, null);
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
        if (investUniv3RedeemReceiveInfo == null || !investUniv3RedeemReceiveInfo.isAllowRedeem() || function0 == null) {
            return;
        }
        function0.invoke();
    }

    public final void zsXlph() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3FarmRedeemViewModel$settleTransaction$1(this, null), 3, null);
    }

    public final InvestTxModel copydefault(TransactionConfig transactionConfig, InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo, String str, TransactionStep transactionStep) {
        long j;
        InvestTokenWithAmount investTokenWithAmount;
        List listEZpvd;
        Object next;
        String estimateGasFee;
        int iValueOf = transactionStep.valueOf();
        String str2 = this.AxsJAY;
        String str3 = this.zuBGHE;
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
            if (InvestAction.Companion.copydefault(transactionStep.valueOf()) == InvestAction.RedeemApprove) {
                List<TransactionStep> transactionStepList = investUniv3RedeemReceiveInfo.getTransactionStepList();
                ArrayList<TransactionStep> arrayList = new ArrayList();
                for (Object obj : transactionStepList) {
                    if (InvestTradeManager.OLrzqt.AEQbTJ(((TransactionStep) obj).valueOf())) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
                for (TransactionStep transactionStep2 : arrayList) {
                    TransactionStepTokenInfo transactionStepTokenInfo = (TransactionStepTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(transactionStep2.AkhnZx());
                    arrayList2.add(new InvestTokenWithAmount(transactionStepTokenInfo != null ? transactionStepTokenInfo.copydefault() : transactionConfig.copydefault(), "0", (String) null, false, false, (String) null, transactionStep2.gEmmrt(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435388, (DefaultConstructorMarker) null));
                }
                listEZpvd = arrayList2;
                j = jCopydefault;
            } else {
                List<InvestTokenWithAmount> rewardList = investUniv3RedeemReceiveInfo.getRewardList();
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(rewardList, 10));
                for (InvestTokenWithAmount investTokenWithAmount2 : rewardList) {
                    ArrayList arrayList4 = arrayList3;
                    arrayList4.add(new InvestTokenWithAmount(investTokenWithAmount2.getChainId(), C33129mqd.mulS$default(investTokenWithAmount2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount2.getTokenPrecision()))), null, null, null, 14, null), investTokenWithAmount2.getCurrencyAmount(), false, false, (String) null, investTokenWithAmount2.getTokenAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, investTokenWithAmount2.getTokenAddress(), (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268402616, (DefaultConstructorMarker) null));
                    arrayList3 = arrayList4;
                    jCopydefault = jCopydefault;
                }
                j = jCopydefault;
                listEZpvd = arrayList3;
            }
        } else {
            j = jCopydefault;
            InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investUniv3RedeemReceiveInfo.getSwapFromTokenList());
            if (investTokenWithAmount3 == null || (investTokenWithAmount = investTokenWithAmount3.copy((268435455 & 1) != 0 ? investTokenWithAmount3.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount3.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount3.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount3.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount3.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount3.network : null, (268435455 & 64) != 0 ? investTokenWithAmount3.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount3.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount3.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount3.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount3.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount3.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount3.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount3.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount3.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount3.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount3.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount3.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount3.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount3.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount3.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount3.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount3.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount3.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount3.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount3.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount3.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount3.tokenPrice : null)) == null) {
                investTokenWithAmount = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
            } else {
                Iterator<T> it = investUniv3RedeemReceiveInfo.getTokenInfoList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (C59449zhJ.gEmmrt(((ExpectTokenInfo) next).getTokenAddress(), investTokenWithAmount.getTokenAddress(), true)) {
                        break;
                    }
                }
                ExpectTokenInfo expectTokenInfo = (ExpectTokenInfo) next;
                investTokenWithAmount.setExpectTokenAddress(expectTokenInfo != null ? expectTokenInfo.getExpectTokenAddress() : null);
                investTokenWithAmount.setChainId(investTokenWithAmount.getChainId() != 0 ? investTokenWithAmount.getChainId() : transactionConfig.copydefault());
                String coinAmount = investTokenWithAmount.getCoinAmount();
                if (coinAmount.length() == 0) {
                    coinAmount = "1";
                }
                investTokenWithAmount.setCoinAmount(coinAmount);
                Unit unit = Unit.INSTANCE;
            }
            listEZpvd = C56402yEa.EZpvd(investTokenWithAmount);
        }
        String strEZpvd = this.fARcdN.EZpvd(String.valueOf(this.AhwBna));
        String strZLjUOn = zLjUOn();
        InvestGasPriceConfig value = OLrzqt().getValue();
        String str4 = (value == null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
        String strAubY = AubY();
        String first = copydefault(OLrzqt().getValue()).getFirst();
        String json = new Gson().toJson(InvestTransactionParam.Companion.instanceForUniV3Redeem$default(InvestTransactionParam.Companion, transactionConfig, str, 0, 4, null));
        Intrinsics.checkNotNullExpressionValue(json, "");
        String strOLrzqt = transactionStep.OLrzqt();
        return new InvestTxModel(iValueOf, str2, str3, listEZpvd2, (Long) null, j, "0", (List) null, (List) null, (List) null, listEZpvd, strEZpvd, strZLjUOn, str4, strAubY, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, str, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, strOLrzqt.length() == 0 ? null : strOLrzqt, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134347888, 65531, (DefaultConstructorMarker) null);
    }
}

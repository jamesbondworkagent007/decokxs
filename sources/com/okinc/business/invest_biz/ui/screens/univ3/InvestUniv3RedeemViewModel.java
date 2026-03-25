package com.okinc.business.invest_biz.ui.screens.univ3;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
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
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3RedeemViewModel;
import com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel;
import com.okinc.network.okg.response.ResponseFailedException;
import java.util.ArrayList;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC27165jpz;
import o.AbstractC58185ywX;
import o.Bitmap;
import o.C23953iPl;
import o.C23955iPn;
import o.C23957iPp;
import o.C23959iPr;
import o.C23961iPt;
import o.C23962iPu;
import o.C23963iPv;
import o.C23965iPx;
import o.C27493jwI;
import o.C27505jwU;
import o.C33129mqd;
import o.C56402yEa;
import o.C56403yEb;
import o.C59449zhJ;
import o.InterfaceC24173iXp;
import o.InterfaceC27093jog;
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
public final class InvestUniv3RedeemViewModel extends AbstractC27165jpz implements InterfaceC27093jog {
    public Bundle AEQbTJ;
    public InvestUniv3RedeemReceiveInfo AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public MutableLiveData<Boolean> AkhnZx;
    public boolean AuCTel;
    public final SharedFlow<iXD> AuCTelauCTel;
    public String AubY;
    public String AwvSrB;
    public final MutableLiveData<C23965iPx> AxsJAY;
    public final StateFlow<InvestUniv3RedeemReceiveInfo> DbNXlk;
    public MutableStateFlow<InvestUniv3RedeemReceiveInfo> EZpvd;
    public final MutableSharedFlow<iXD> KWHzl;
    public MutableStateFlow<InterfaceC24173iXp> OLrzqt;
    public final StateFlow<InterfaceC24173iXp> copydefault;

    @yCM
    public iXH ctaButtonUseCase;
    public MutableLiveData<InvestRedeemViewModel.ActionBar> djBIcL;
    public MutableLiveData<Boolean> ejfBZ;
    public MutableLiveData<C23961iPt> fARcdN;
    public boolean fIwbmz;
    public InvestUniv3RedeemReceiveInfoHandle fJNWhG;
    public long fetchVPNInfo;
    public long gEmmrt;
    public final MutableLiveData<C23955iPn> gHZMYf;
    public final MutableLiveData<Bitmap<InvestUniv3RedeemInitialInfo>> getFieldNames;
    public final SavedStateHandle getNewProxyInstance;
    public MutableLiveData<InvestRedeemViewModel.RedeemResult> hDKMBd;
    public InvestInputData isConnected;
    public final MutableLiveData<Boolean> iwGUEr;

    @yCM
    public iXN settleTransactionUseCase;
    public MutableLiveData<InvestRedeemReceiveInfoUIBean> uzCIH;
    public ResponseState valueOf;
    public String values;
    public final MutableLiveData<C23962iPu> wlaJM;
    public final MutableLiveData<C23957iPp> zLjUOn;
    public final MutableLiveData<C23959iPr> zsXlph;
    public String zuBGHE;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

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
            KWHzl = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24173iXp> AYXKKw() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle AhwBna() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23955iPn> AuCTelauCTel() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23965iPx> AubY() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27093jog
    public MutableLiveData<InvestRedeemReceiveInfoUIBean> DbNXlk() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27165jpz
    public long EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str, @NotNull String str2, long j, long j2, @NotNull String str3, boolean z, InvestInputData investInputData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AwvSrB = str;
        this.zuBGHE = str2;
        this.fetchVPNInfo = j;
        this.AubY = str3;
        this.AuCTel = z;
        this.gEmmrt = j2;
        this.isConnected = investInputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Bundle bundle) {
        this.AEQbTJ = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<InvestRedeemViewModel.RedeemResult> ejfBZ() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> fJNWhG() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23961iPt> fetchVPNInfo() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InvestUniv3RedeemReceiveInfo> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23959iPr> getNewProxyInstance() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<iXD> iwGUEr() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Bitmap<InvestUniv3RedeemInitialInfo>> values() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> wlaJM() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23962iPu> zLjUOn() {
        return this.wlaJM;
    }

    @yCM
    public InvestUniv3RedeemViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.getNewProxyInstance = savedStateHandle;
        this.AwvSrB = "";
        this.zuBGHE = "";
        this.AubY = "";
        this.values = "0";
        this.fIwbmz = true;
        this.zsXlph = new MutableLiveData<>();
        this.AxsJAY = new MutableLiveData<>();
        this.gHZMYf = new MutableLiveData<>();
        this.wlaJM = new MutableLiveData<>();
        this.zLjUOn = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.getFieldNames = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.ejfBZ = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.djBIcL = new MutableLiveData<>();
        this.hDKMBd = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.fJNWhG = new InvestUniv3RedeemReceiveInfoHandle();
        MutableStateFlow<InterfaceC24173iXp> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        this.OLrzqt = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InvestUniv3RedeemReceiveInfo> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new InvestUniv3RedeemReceiveInfo((List) null, (String) null, (String) null, (List) null, (List) null, (List) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (PromptInformation) null, (List) null, (List) null, (List) null, (List) null, (List) null, (String) null, (String) null, (List) null, (InvestTransactionLossInfo) null, (String) null, false, 33554431, (DefaultConstructorMarker) null));
        this.EZpvd = MutableStateFlow2;
        this.DbNXlk = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<iXD> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.KWHzl = mutableSharedFlowMutableSharedFlow$default;
        this.AuCTelauCTel = mutableSharedFlowMutableSharedFlow$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TransactionConfig aKErDB() {
        return (TransactionConfig) this.getNewProxyInstance.get("key.trx_config");
    }

    public final InvestTradeManager.TransactionResultExtraData fIwbmz() {
        return isConnected().copydefault();
    }

    public final iXH valueOf() {
        iXH ixh = this.ctaButtonUseCase;
        if (ixh != null) {
            return ixh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final iXN isConnected() {
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
        final Function1 function1 = new Function1() { // from class: o.jlf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3RedeemViewModel.KWHzl(this.KWHzl, (InvestUniv3RedeemInitialInfo) obj);
            }
        };
        InterfaceC58227yxM<? super InvestUniv3RedeemInitialInfo> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jlj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestUniv3RedeemViewModel.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jli
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3RedeemViewModel.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jlk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestUniv3RedeemViewModel.AEQbTJ(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo) {
        if (investUniv3RedeemInitialInfo == null) {
            investUniv3RedeemViewModel.getFieldNames.setValue(new Bitmap.ActionBar("false", null, 2, null));
        } else {
            investUniv3RedeemViewModel.getFieldNames.setValue(new Bitmap.StateListAnimator(investUniv3RedeemInitialInfo));
            investUniv3RedeemViewModel.dNCPSb();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, Throwable th) {
        if ((th instanceof ResponseFailedException) || (th instanceof IllegalArgumentException)) {
            investUniv3RedeemViewModel.getFieldNames.setValue(new Bitmap.ActionBar("false", null, 2, null));
        } else {
            investUniv3RedeemViewModel.getFieldNames.setValue(new Bitmap.ActionBar("true", null, 2, null));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC27165jpz
    public void AuCTel() {
        ORxRYg().setValue(new C23963iPv(true, false));
    }

    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        this.AkhnZx.setValue(Boolean.TRUE);
        if (KWHzl(this.values)) {
            return;
        }
        gEmmrt(0);
    }

    public final void OLrzqt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.values = str;
        if (KWHzl(str)) {
            getReceiveInfoAndCheckState$default(this, null, 1, null);
        } else {
            this.AkhnZx.setValue(Boolean.FALSE);
        }
    }

    public final boolean KWHzl(String str) {
        return C33129mqd.AEQbTJ(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void dNCPSb() {
        String amount;
        InvestInputData investInputData = this.isConnected;
        if (investInputData == null || investInputData.getAmount() == null) {
            amount = null;
        } else {
            String amount2 = investInputData.getAmount();
            Intrinsics.copydefault((Object) amount2);
            if (amount2.length() > 0) {
                amount = investInputData.getAmount();
                Intrinsics.copydefault((Object) amount);
            }
        }
        gEmmrt(4);
        this.AhwBna.setValue(Boolean.FALSE);
        if (amount != null) {
            gHZMYf().setValue(Boolean.TRUE);
            this.fARcdN.setValue(new C23961iPt(C33129mqd.AhwBna(amount)));
            ORxRYg().setValue(new C23963iPv(false, false));
        }
    }

    public final void KWHzl() {
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoOLrzqt;
        String currentPrice;
        this.fIwbmz = !this.fIwbmz;
        Bitmap<InvestUniv3RedeemInitialInfo> value = this.getFieldNames.getValue();
        if (value == null || (investUniv3RedeemInitialInfoOLrzqt = value.OLrzqt()) == null) {
            return;
        }
        OLrzqt(investUniv3RedeemInitialInfoOLrzqt);
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
        if (investUniv3RedeemReceiveInfo == null || (currentPrice = investUniv3RedeemReceiveInfo.getCurrentPrice()) == null) {
            currentPrice = "";
        }
        ResponseState responseState = this.valueOf;
        copydefault(investUniv3RedeemInitialInfoOLrzqt, currentPrice, false, (responseState != null ? responseState.getErrorType() : null) != ResponseStateType.NORMAL);
    }

    public final void OLrzqt(InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo) {
        String str;
        String str2;
        String str3;
        String strDivS$default;
        if (investUniv3RedeemInitialInfo.getUnderlyingTokenList().size() > 1) {
            String tokenSymbol = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(1).getTokenSymbol();
            String tokenSymbol2 = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(0).getTokenSymbol();
            String lowerPrice = investUniv3RedeemInitialInfo.getLowerPrice();
            String upperPrice = investUniv3RedeemInitialInfo.getUpperPrice();
            if (this.fIwbmz) {
                String tokenSymbol3 = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(0).getTokenSymbol();
                String tokenSymbol4 = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(1).getTokenSymbol();
                String strDivS$default2 = C33129mqd.divS$default(1, investUniv3RedeemInitialInfo.getUpperPrice(), null, null, null, 14, null);
                str = tokenSymbol3;
                str2 = tokenSymbol4;
                strDivS$default = C33129mqd.divS$default(1, investUniv3RedeemInitialInfo.getLowerPrice(), null, null, null, 14, null);
                str3 = strDivS$default2;
            } else {
                str = tokenSymbol;
                str2 = tokenSymbol2;
                str3 = lowerPrice;
                strDivS$default = upperPrice;
            }
            this.zsXlph.setValue(new C23959iPr(investUniv3RedeemInitialInfo.getInvestmentName(), investUniv3RedeemInitialInfo.getFeeRate(), str, str2, str3, strDivS$default, true, false, 128, null));
        }
    }

    private final void gEmmrt(int i) {
        AhwBna(i);
        AEQbTJ(i);
        KWHzl(i);
        EZpvd(i);
        OLrzqt(i);
        copydefault(i);
    }

    private final void AhwBna(int i) {
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoOLrzqt;
        if (i != 0) {
            if (i == 2) {
                InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
                if (investUniv3RedeemReceiveInfo != null) {
                    this.ejfBZ.setValue(Boolean.valueOf(investUniv3RedeemReceiveInfo.isActive()));
                    return;
                }
                return;
            }
            if (i != 4) {
                return;
            }
        }
        Bitmap<InvestUniv3RedeemInitialInfo> value = this.getFieldNames.getValue();
        if (value == null || (investUniv3RedeemInitialInfoOLrzqt = value.OLrzqt()) == null) {
            return;
        }
        OLrzqt(investUniv3RedeemInitialInfoOLrzqt);
        this.ejfBZ.setValue(Boolean.valueOf(investUniv3RedeemInitialInfoOLrzqt.isActive()));
    }

    public final void AEQbTJ(int i) {
        if (i == 4) {
            this.fARcdN.setValue(new C23961iPt(0));
        }
    }

    private final void copydefault(InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfo, String str, boolean z, boolean z2) {
        String strDivS$default;
        String str2;
        if (investUniv3RedeemInitialInfo.getUnderlyingTokenList().size() > 1) {
            String tokenSymbol = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(1).getTokenSymbol();
            String tokenSymbol2 = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(0).getTokenSymbol();
            if (this.fIwbmz) {
                String tokenSymbol3 = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(0).getTokenSymbol();
                tokenSymbol2 = investUniv3RedeemInitialInfo.getUnderlyingTokenList().get(1).getTokenSymbol();
                str2 = tokenSymbol3;
                strDivS$default = C33129mqd.divS$default(1, str, null, null, null, 14, null);
            } else {
                strDivS$default = str;
                str2 = tokenSymbol;
            }
            this.gHZMYf.setValue(new C23955iPn(strDivS$default, str2, tokenSymbol2, z, z2, 0, 32, null));
        }
    }

    private final void KWHzl(int i) {
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoOLrzqt;
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoOLrzqt2;
        List<InvestTokenWithAmount> receiveTokenList;
        List<InvestTokenWithAmount> receiveTokenList2;
        List<InvestTokenWithAmount> receiveTokenList3;
        String currentPrice;
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoOLrzqt3;
        this.AkhnZx.setValue(Boolean.FALSE);
        String str = "";
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
                    if (investUniv3RedeemReceiveInfo != null) {
                        List<InvestTokenWithAmount> receiveTokenList4 = investUniv3RedeemReceiveInfo.getReceiveTokenList();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : receiveTokenList4) {
                            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
                            if (!Intrinsics.EZpvd((Object) investTokenWithAmount.getTokenId(), (Object) "") || !Intrinsics.EZpvd((Object) investTokenWithAmount.getCoinAmount(), (Object) "0")) {
                                arrayList.add(obj);
                            }
                        }
                        String currentPrice2 = investUniv3RedeemReceiveInfo.getCurrentPrice();
                        MutableLiveData<C23965iPx> mutableLiveData = this.AxsJAY;
                        List<InvestTokenWithAmount> assetsList = investUniv3RedeemReceiveInfo.getAssetsList();
                        List<InvestTokenWithAmount> feeEarning = investUniv3RedeemReceiveInfo.getFeeEarning();
                        List<InvestTokenWithAmount> rewardList = investUniv3RedeemReceiveInfo.getRewardList();
                        PromptInformation promptInformation = investUniv3RedeemReceiveInfo.getPromptInformation();
                        mutableLiveData.setValue(new C23965iPx(assetsList, feeEarning, rewardList, arrayList, promptInformation != null ? promptInformation.getPendingFeeTip() : null, false, false, 64, null));
                        Bitmap<InvestUniv3RedeemInitialInfo> value = this.getFieldNames.getValue();
                        if (value == null || (investUniv3RedeemInitialInfoOLrzqt3 = value.OLrzqt()) == null) {
                            return;
                        }
                        DbNXlk().setValue(new InvestRedeemReceiveInfoUIBean(false, investUniv3RedeemInitialInfoOLrzqt3.getPlatformLogo(), investUniv3RedeemInitialInfoOLrzqt3.getPlatformName(), yDY.AhwBna(), (List) arrayList, false, (Integer) null, (InvestTipsBean) null, (InvestExchangeRateBean) null, (InvestTokenWithAmount) null, (InvestTipInfoVo) null, 2016, (DefaultConstructorMarker) null));
                        copydefault(investUniv3RedeemInitialInfoOLrzqt3, currentPrice2, false, false);
                        return;
                    }
                    return;
                }
                if (i != 4) {
                    if (i != 5) {
                        return;
                    }
                }
            }
            Bitmap<InvestUniv3RedeemInitialInfo> value2 = this.getFieldNames.getValue();
            if (value2 == null || (investUniv3RedeemInitialInfoOLrzqt2 = value2.OLrzqt()) == null) {
                return;
            }
            MutableLiveData<C23965iPx> mutableLiveData2 = this.AxsJAY;
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo2 = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo2 == null || (receiveTokenList = investUniv3RedeemReceiveInfo2.getAssetsList()) == null) {
                receiveTokenList = investUniv3RedeemInitialInfoOLrzqt2.getReceiveTokenList();
            }
            List<InvestTokenWithAmount> list = receiveTokenList;
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo3 = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo3 == null || (receiveTokenList2 = investUniv3RedeemReceiveInfo3.getFeeEarning()) == null) {
                receiveTokenList2 = investUniv3RedeemInitialInfoOLrzqt2.getReceiveTokenList();
            }
            List<InvestTokenWithAmount> list2 = receiveTokenList2;
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo4 = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo4 == null || (receiveTokenList3 = investUniv3RedeemReceiveInfo4.getReceiveTokenList()) == null) {
                receiveTokenList3 = investUniv3RedeemInitialInfoOLrzqt2.getReceiveTokenList();
            }
            List<InvestTokenWithAmount> list3 = receiveTokenList3;
            PromptInformation promptInformation2 = investUniv3RedeemInitialInfoOLrzqt2.getPromptInformation();
            mutableLiveData2.setValue(new C23965iPx(list, list2, null, list3, promptInformation2 != null ? promptInformation2.getPendingFeeTip() : null, false, true));
            DbNXlk().setValue(new InvestRedeemReceiveInfoUIBean(false, investUniv3RedeemInitialInfoOLrzqt2.getPlatformLogo(), investUniv3RedeemInitialInfoOLrzqt2.getPlatformName(), yDY.AhwBna(), (List) investUniv3RedeemInitialInfoOLrzqt2.getReceiveTokenList(), true, (Integer) null, (InvestTipsBean) null, (InvestExchangeRateBean) null, (InvestTokenWithAmount) null, (InvestTipInfoVo) null, 1984, (DefaultConstructorMarker) null));
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo5 = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo5 != null && (currentPrice = investUniv3RedeemReceiveInfo5.getCurrentPrice()) != null) {
                str = currentPrice;
            }
            copydefault(investUniv3RedeemInitialInfoOLrzqt2, str, false, false);
            return;
        }
        Bitmap<InvestUniv3RedeemInitialInfo> value3 = this.getFieldNames.getValue();
        if (value3 == null || (investUniv3RedeemInitialInfoOLrzqt = value3.OLrzqt()) == null) {
            return;
        }
        MutableLiveData<C23965iPx> mutableLiveData3 = this.AxsJAY;
        List<InvestTokenWithAmount> receiveTokenList5 = investUniv3RedeemInitialInfoOLrzqt.getReceiveTokenList();
        List<InvestTokenWithAmount> receiveTokenList6 = investUniv3RedeemInitialInfoOLrzqt.getReceiveTokenList();
        List<InvestTokenWithAmount> receiveTokenList7 = investUniv3RedeemInitialInfoOLrzqt.getReceiveTokenList();
        PromptInformation promptInformation3 = investUniv3RedeemInitialInfoOLrzqt.getPromptInformation();
        mutableLiveData3.setValue(new C23965iPx(receiveTokenList5, receiveTokenList6, null, receiveTokenList7, promptInformation3 != null ? promptInformation3.getPendingFeeTip() : null, false, false, 96, null));
        DbNXlk().setValue(new InvestRedeemReceiveInfoUIBean(true, investUniv3RedeemInitialInfoOLrzqt.getPlatformLogo(), investUniv3RedeemInitialInfoOLrzqt.getPlatformName(), yDY.AhwBna(), (List) investUniv3RedeemInitialInfoOLrzqt.getReceiveTokenList(), false, (Integer) null, (InvestTipsBean) null, (InvestExchangeRateBean) null, (InvestTokenWithAmount) null, (InvestTipInfoVo) null, 2016, (DefaultConstructorMarker) null));
        copydefault(investUniv3RedeemInitialInfoOLrzqt, "", true, false);
    }

    @Override // o.AbstractC27165jpz
    public void EZpvd(int i) {
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoOLrzqt;
        super.EZpvd(i);
        Bitmap<InvestUniv3RedeemInitialInfo> value = this.getFieldNames.getValue();
        if (value == null || (investUniv3RedeemInitialInfoOLrzqt = value.OLrzqt()) == null) {
            return;
        }
        MutableLiveData<C23953iPl> mutableLiveDataAwvSrB = AwvSrB();
        String network = investUniv3RedeemInitialInfoOLrzqt.getNetwork();
        String networkLogo = investUniv3RedeemInitialInfoOLrzqt.getNetworkLogo();
        String strDTwDnp = OLrzqt().getValue() != null ? DTwDnp() : "";
        InvestGasPriceConfig value2 = OLrzqt().getValue();
        String strQKVWgx = (value2 != null ? value2.getInvestSlippage() : null) != null ? QKVWgx() : "";
        InvestGasPriceConfig value3 = OLrzqt().getValue();
        mutableLiveDataAwvSrB.setValue(new C23953iPl(i, true, network, networkLogo, strDTwDnp, strQKVWgx, value3 != null ? Boolean.valueOf(C27505jwU.OLrzqt(value3)) : null, QbewEr(), QUSxYX(), RJOkX()));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void OLrzqt(int i) {
        if (i == 0) {
            this.zLjUOn.setValue(new C23957iPp(true, false, 0, null, null, 24, null));
        } else if (i == 1) {
            this.zLjUOn.setValue(new C23957iPp(false, true, 0, null, null, 24, null));
        } else if (i == 2) {
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo != null) {
                MutableLiveData<C23957iPp> mutableLiveData = this.zLjUOn;
                List<InvestTokenWithApprove> approveStatusList = investUniv3RedeemReceiveInfo.getApproveStatusList();
                InvestInputData investInputData = this.isConnected;
                mutableLiveData.setValue(new C23957iPp(false, false, 0, approveStatusList, copydefault(investInputData != null ? investInputData.getApprovedTokenAddress() : null)));
            }
        } else if (i != 4) {
            if (i == 5) {
            }
        }
        zsXlph();
    }

    public final void zsXlph() {
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
        if (investUniv3RedeemReceiveInfo != null) {
            EZpvd(investUniv3RedeemReceiveInfo.getTransactionStepList());
        }
    }

    private final void copydefault(int i) {
        if (i != 0 && i != 1) {
            if (i == 2) {
                InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
                if (investUniv3RedeemReceiveInfo != null) {
                    Intrinsics.copydefault(investUniv3RedeemReceiveInfo);
                    if (!investUniv3RedeemReceiveInfo.isAllowRedeem()) {
                        this.wlaJM.setValue(new C23962iPu(false, null, 2, null));
                        return;
                    }
                }
                this.wlaJM.setValue(new C23962iPu(true, null, 2, null));
                return;
            }
            if (i != 4 && i != 5) {
                return;
            }
        }
        this.wlaJM.setValue(new C23962iPu(false, null, 2, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3RedeemViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getReceiveInfoAndCheckState$default(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = null;
        }
        investUniv3RedeemViewModel.OLrzqt((Function2<? super Boolean, ? super Boolean, Unit>) function2);
    }

    public final void OLrzqt(final Function2<? super Boolean, ? super Boolean, Unit> function2) {
        boolean zKWHzl = KWHzl(this.values);
        final Ref.IntRef intRef = new Ref.IntRef();
        if (!zKWHzl) {
            intRef.element = 0;
            gEmmrt(0);
            if (function2 != null) {
                Boolean bool = Boolean.FALSE;
                function2.invoke(bool, bool);
                return;
            }
            return;
        }
        this.fJNWhG.getReceiveInfo(this.AwvSrB, this.zuBGHE, this.fetchVPNInfo, this.values, this.AubY, this.AuCTel, null, new Function1() { // from class: o.jlg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3RedeemViewModel.AEQbTJ(this.KWHzl, (InvestGasPriceConfig) obj);
            }
        }, new Function2() { // from class: o.jld
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestUniv3RedeemViewModel.copydefault(this.AEQbTJ, intRef, function2, (ResponseState) obj, (kotlin.Pair) obj2);
            }
        });
    }

    public static final String AEQbTJ(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        return investUniv3RedeemViewModel.OLrzqt(investGasPriceConfig).getFirst();
    }

    public static final Unit copydefault(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, Ref.IntRef intRef, Function2 function2, ResponseState responseState, Pair pair) {
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo;
        InvestGasPriceConfig investGasPriceConfig;
        Intrinsics.checkNotNullParameter(responseState, "");
        investUniv3RedeemViewModel.gHZMYf().setValue(Boolean.FALSE);
        if (responseState.getLastInputValue().equals(investUniv3RedeemViewModel.values)) {
            investUniv3RedeemViewModel.AYXKKw = pair != null ? (InvestUniv3RedeemReceiveInfo) pair.getSecond() : null;
            if (pair != null && (investGasPriceConfig = (InvestGasPriceConfig) pair.getFirst()) != null) {
                investGasPriceConfig.setEstimateGasFee(((InvestUniv3RedeemReceiveInfo) pair.getSecond()).getEstimateGasFee());
            }
            investUniv3RedeemViewModel.OLrzqt().setValue(pair != null ? (InvestGasPriceConfig) pair.getFirst() : null);
            investUniv3RedeemViewModel.valueOf = responseState;
            if (pair != null) {
                investUniv3RedeemViewModel.EZpvd.setValue((InvestUniv3RedeemReceiveInfo) pair.getSecond());
            }
            int i = StateListAnimator.KWHzl[responseState.getErrorType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    investUniv3RedeemViewModel.QOLQEE().setValue(responseState);
                    intRef.element = 1;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (responseState.getErrorCode() == 10002) {
                        intRef.element = 5;
                    } else {
                        investUniv3RedeemViewModel.QOLQEE().setValue(responseState);
                        intRef.element = 1;
                    }
                }
            } else if (pair != null) {
                intRef.element = 2;
            } else {
                investUniv3RedeemViewModel.QOLQEE().setValue(responseState);
                intRef.element = 1;
            }
            investUniv3RedeemViewModel.gEmmrt(intRef.element);
        }
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(responseState.getErrorType() == ResponseStateType.NORMAL && pair != null), Boolean.valueOf((pair == null || (investUniv3RedeemReceiveInfo = (InvestUniv3RedeemReceiveInfo) pair.getSecond()) == null || !investUniv3RedeemReceiveInfo.isActive()) ? false : true));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void submitTransaction$default(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, Context context, boolean z, InvestTokenWithApprove investTokenWithApprove, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            investTokenWithApprove = null;
        }
        investUniv3RedeemViewModel.KWHzl(context, z, investTokenWithApprove);
    }

    public final void KWHzl(@NotNull Context context, boolean z, final InvestTokenWithApprove investTokenWithApprove) {
        Integer orderType;
        Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            InvestTradeManager.submitTransaction$default(InvestTradeManager.OLrzqt, context, copydefault((investTokenWithApprove == null || (orderType = investTokenWithApprove.getOrderType()) == null) ? InvestAction.RedeemApprove.getValue() : orderType.intValue(), true, investTokenWithApprove), null, new yHO() { // from class: o.jll
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InvestUniv3RedeemViewModel.KWHzl(this.AEQbTJ, investTokenWithApprove, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
                }
            }, 4, null);
        } else {
            OLrzqt(new Activity(this.ejfBZ.getValue(), this, context, investTokenWithApprove));
        }
    }

    public static final Unit KWHzl(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        investUniv3RedeemViewModel.djBIcL.setValue(new InvestRedeemViewModel.ActionBar(investTokenWithApprove, i, bundle));
        return Unit.INSTANCE;
    }

    public static final class Activity implements Function2<Boolean, Boolean, Unit> {
        public final /* synthetic */ InvestTokenWithApprove AEQbTJ;
        public final /* synthetic */ Context EZpvd;
        public final /* synthetic */ Boolean KWHzl;
        public final /* synthetic */ InvestUniv3RedeemViewModel OLrzqt;

        public Activity(Boolean bool, InvestUniv3RedeemViewModel investUniv3RedeemViewModel, Context context, InvestTokenWithApprove investTokenWithApprove) {
            this.KWHzl = bool;
            this.OLrzqt = investUniv3RedeemViewModel;
            this.EZpvd = context;
            this.AEQbTJ = investTokenWithApprove;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(Boolean bool, Boolean bool2) {
            EZpvd(bool.booleanValue(), bool2.booleanValue());
            return Unit.INSTANCE;
        }

        public void EZpvd(boolean z, boolean z2) {
            Integer orderType;
            if (z) {
                if (Intrinsics.EZpvd(this.KWHzl, this.OLrzqt.wlaJM().getValue())) {
                    InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
                    Context context = this.EZpvd;
                    InvestUniv3RedeemViewModel investUniv3RedeemViewModel = this.OLrzqt;
                    InvestTokenWithApprove investTokenWithApprove = this.AEQbTJ;
                    InvestTxModel investTxModelGenInvestTxModel$default = InvestUniv3RedeemViewModel.genInvestTxModel$default(investUniv3RedeemViewModel, (investTokenWithApprove == null || (orderType = investTokenWithApprove.getOrderType()) == null) ? InvestAction.Redeem.getValue() : orderType.intValue(), false, null, 4, null);
                    final InvestUniv3RedeemViewModel investUniv3RedeemViewModel2 = this.OLrzqt;
                    InvestTradeManager.submitTransaction$default(investTradeManager, context, investTxModelGenInvestTxModel$default, null, new yHO() { // from class: o.jlm
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // o.yHO
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                            return InvestUniv3RedeemViewModel.Activity.KWHzl(investUniv3RedeemViewModel2, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
                        }
                    }, 4, null);
                    return;
                }
                this.OLrzqt.ejfBZ().setValue(new InvestRedeemViewModel.RedeemResult(4, null, new InvestTradeManager.TransactionResultExtraData(null, null, null, 7, null)));
                this.OLrzqt.fJNWhG().setValue(Boolean.TRUE);
            }
        }

        public static final Unit KWHzl(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
            Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
            investUniv3RedeemViewModel.ejfBZ().setValue(new InvestRedeemViewModel.RedeemResult(i, bundle, transactionResultExtraData));
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ InvestTxModel genInvestTxModel$default(InvestUniv3RedeemViewModel investUniv3RedeemViewModel, int i, boolean z, InvestTokenWithApprove investTokenWithApprove, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            investTokenWithApprove = null;
        }
        return investUniv3RedeemViewModel.copydefault(i, z, investTokenWithApprove);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0235  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InvestTxModel copydefault(int i, boolean z, InvestTokenWithApprove investTokenWithApprove) {
        List listAhwBna;
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo;
        List<InvestTokenWithAmount> assetsList;
        List list;
        String liquidity;
        List listEZpvd;
        List list2;
        String estimateGasFee;
        List<InvestTokenWithApprove> approveStatusList;
        List<InvestTokenWithAmount> receiveTokenList;
        String str = this.AwvSrB;
        String str2 = this.zuBGHE;
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(this.fetchVPNInfo));
        long j = this.gEmmrt;
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo2 = this.AYXKKw;
        if (investUniv3RedeemReceiveInfo2 == null || (receiveTokenList = investUniv3RedeemReceiveInfo2.getReceiveTokenList()) == null) {
            listAhwBna = yDY.AhwBna();
        } else {
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(receiveTokenList, 10));
            for (InvestTokenWithAmount investTokenWithAmount : receiveTokenList) {
                InvestTokenWithAmount investTokenWithAmountCopy = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
                investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
                arrayList.add(investTokenWithAmountCopy);
            }
            listAhwBna = arrayList;
        }
        if (z || (investUniv3RedeemReceiveInfo = this.AYXKKw) == null || (assetsList = investUniv3RedeemReceiveInfo.getAssetsList()) == null) {
            List listAhwBna2 = yDY.AhwBna();
            list = listAhwBna2;
            if (z) {
            }
            list2 = listEZpvd;
            String strEZpvd = OcIXYQ().EZpvd(String.valueOf(this.gEmmrt));
            String strAxsJAY = AxsJAY();
            InvestGasPriceConfig value = OLrzqt().getValue();
            if (value == null) {
            }
            String strSSMYrx = sSMYrx();
            String first = OLrzqt(OLrzqt().getValue()).getFirst();
            String json = new Gson().toJson(AEQbTJ(investTokenWithApprove));
            Intrinsics.checkNotNullExpressionValue(json, "");
            return new InvestTxModel(i, str, str2, listEZpvd2, (Long) null, j, "0", listAhwBna, (List) null, list, list2, strEZpvd, strAxsJAY, str, strSSMYrx, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, this.AubY, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134348528, 65535, (DefaultConstructorMarker) null);
        }
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(assetsList, 10));
        for (InvestTokenWithAmount investTokenWithAmount2 : assetsList) {
            InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
            investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
            arrayList2.add(investTokenWithAmountCopy2);
        }
        list = arrayList2;
        if (z) {
            long j2 = this.gEmmrt;
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo3 = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo3 == null || (liquidity = investUniv3RedeemReceiveInfo3.getLiquidity()) == null) {
                liquidity = "0";
            }
            listEZpvd = C56402yEa.EZpvd(new InvestTokenWithAmount(j2, liquidity, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, "--", (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268402684, (DefaultConstructorMarker) null));
        } else {
            InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo4 = this.AYXKKw;
            if (investUniv3RedeemReceiveInfo4 == null || (approveStatusList = investUniv3RedeemReceiveInfo4.getApproveStatusList()) == null) {
                listEZpvd = yDY.AhwBna();
            } else {
                ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(approveStatusList, 10));
                for (InvestTokenWithApprove investTokenWithApprove2 : approveStatusList) {
                    arrayList3.add(new InvestTokenWithAmount(investTokenWithApprove2.getChainId(), (String) null, (String) null, false, false, (String) null, investTokenWithApprove2.getTokenAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435390, (DefaultConstructorMarker) null));
                }
                list2 = arrayList3;
                String strEZpvd2 = OcIXYQ().EZpvd(String.valueOf(this.gEmmrt));
                String strAxsJAY2 = AxsJAY();
                InvestGasPriceConfig value2 = OLrzqt().getValue();
                String str3 = (value2 == null || (estimateGasFee = value2.getEstimateGasFee()) == null) ? "" : estimateGasFee;
                String strSSMYrx2 = sSMYrx();
                String first2 = OLrzqt(OLrzqt().getValue()).getFirst();
                String json2 = new Gson().toJson(AEQbTJ(investTokenWithApprove));
                Intrinsics.checkNotNullExpressionValue(json2, "");
                return new InvestTxModel(i, str, str2, listEZpvd2, (Long) null, j, "0", listAhwBna, (List) null, list, list2, strEZpvd2, strAxsJAY2, str3, strSSMYrx2, first2, json2, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, this.AubY, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134348528, 65535, (DefaultConstructorMarker) null);
            }
        }
        list2 = listEZpvd;
        String strEZpvd22 = OcIXYQ().EZpvd(String.valueOf(this.gEmmrt));
        String strAxsJAY22 = AxsJAY();
        InvestGasPriceConfig value22 = OLrzqt().getValue();
        if (value22 == null) {
        }
        String strSSMYrx22 = sSMYrx();
        String first22 = OLrzqt(OLrzqt().getValue()).getFirst();
        String json22 = new Gson().toJson(AEQbTJ(investTokenWithApprove));
        Intrinsics.checkNotNullExpressionValue(json22, "");
        return new InvestTxModel(i, str, str2, listEZpvd2, (Long) null, j, "0", listAhwBna, (List) null, list, list2, strEZpvd22, strAxsJAY22, str3, strSSMYrx22, first22, json22, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, this.AubY, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134348528, 65535, (DefaultConstructorMarker) null);
    }

    private final InvestTransactionParam AEQbTJ(InvestTokenWithApprove investTokenWithApprove) {
        Bitmap<InvestUniv3RedeemInitialInfo> value = this.getFieldNames.getValue();
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoOLrzqt = value != null ? value.OLrzqt() : null;
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(this.fetchVPNInfo));
        List listEZpvd2 = C56402yEa.EZpvd(new InvestInputData(this.values, (String) null, (String) null, false, false, 30, (DefaultConstructorMarker) null));
        long j = this.gEmmrt;
        Long analysisPlatformId = investUniv3RedeemInitialInfoOLrzqt != null ? investUniv3RedeemInitialInfoOLrzqt.getAnalysisPlatformId() : null;
        return new InvestTransactionParam(listEZpvd2, this.AuCTel, false, j, investUniv3RedeemInitialInfoOLrzqt != null ? Integer.valueOf(investUniv3RedeemInitialInfoOLrzqt.getInvestType()) : null, analysisPlatformId, (String) null, listEZpvd, (Long) null, (Integer) null, this.AubY, (Integer) 2, (Integer) null, (InvestPoolV3) null, (Integer) null, (Boolean) null, 62276, (DefaultConstructorMarker) null);
    }

    public final InvestTokenWithAmount copydefault(String str) {
        InvestTokenWithAmount lpTokenInfo;
        Bitmap<InvestUniv3RedeemInitialInfo> value = this.getFieldNames.getValue();
        InvestUniv3RedeemInitialInfo investUniv3RedeemInitialInfoOLrzqt = value != null ? value.OLrzqt() : null;
        if (!C59449zhJ.gEmmrt((investUniv3RedeemInitialInfoOLrzqt == null || (lpTokenInfo = investUniv3RedeemInitialInfoOLrzqt.getLpTokenInfo()) == null) ? null : lpTokenInfo.getTokenAddress(), str, true) || investUniv3RedeemInitialInfoOLrzqt == null) {
            return null;
        }
        return investUniv3RedeemInitialInfoOLrzqt.getLpTokenInfo();
    }

    @Override // o.AbstractC27165jpz
    public void uzCIH() {
        if (Intrinsics.EZpvd(this.AhwBna.getValue(), Boolean.FALSE)) {
            getReceiveInfoAndCheckState$default(this, null, 1, null);
        }
    }

    @Override // o.AbstractC27165jpz
    public void getFieldNames() {
        this.fJNWhG.dispose();
    }

    @Override // o.AbstractC27165jpz
    public void hDKMBd() {
        getReceiveInfoAndCheckState$default(this, null, 1, null);
    }

    public final InvestTxModel copydefault(TransactionConfig transactionConfig, InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo, String str, TransactionStep transactionStep, String str2) {
        List listAhwBna;
        List listEZpvd;
        String estimateGasFee;
        boolean zAEQbTJ = InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf());
        int iValueOf = transactionStep.valueOf();
        String str3 = this.AwvSrB;
        String str4 = this.zuBGHE;
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        List<InvestTokenWithAmount> receiveTokenList = investUniv3RedeemReceiveInfo.getReceiveTokenList();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(receiveTokenList, 10));
        for (InvestTokenWithAmount investTokenWithAmount : receiveTokenList) {
            InvestTokenWithAmount investTokenWithAmountCopy = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
            investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
            arrayList.add(investTokenWithAmountCopy);
            jCopydefault = jCopydefault;
        }
        long j = jCopydefault;
        if (zAEQbTJ) {
            listAhwBna = yDY.AhwBna();
        } else {
            List<InvestTokenWithAmount> assetsList = investUniv3RedeemReceiveInfo.getAssetsList();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(assetsList, 10));
            for (InvestTokenWithAmount investTokenWithAmount2 : assetsList) {
                InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
                arrayList2.add(investTokenWithAmountCopy2);
            }
            listAhwBna = arrayList2;
        }
        if (zAEQbTJ) {
            List<TransactionStep> transactionStepList = investUniv3RedeemReceiveInfo.getTransactionStepList();
            ArrayList<TransactionStep> arrayList3 = new ArrayList();
            for (Object obj : transactionStepList) {
                if (InvestTradeManager.OLrzqt.AEQbTJ(((TransactionStep) obj).valueOf())) {
                    arrayList3.add(obj);
                }
            }
            listEZpvd = new ArrayList(C56403yEb.AYXKKw(arrayList3, 10));
            for (TransactionStep transactionStep2 : arrayList3) {
                TransactionStepTokenInfo transactionStepTokenInfo = (TransactionStepTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(transactionStep2.AkhnZx());
                listEZpvd.add(new InvestTokenWithAmount(transactionStepTokenInfo != null ? transactionStepTokenInfo.copydefault() : transactionConfig.copydefault(), (String) null, (String) null, false, false, (String) null, transactionStep2.gEmmrt(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435390, (DefaultConstructorMarker) null));
            }
        } else {
            listEZpvd = C56402yEa.EZpvd(new InvestTokenWithAmount(transactionConfig.copydefault(), investUniv3RedeemReceiveInfo.getLiquidity(), (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, "--", (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268402684, (DefaultConstructorMarker) null));
        }
        List list = listEZpvd;
        String strEZpvd = OcIXYQ().EZpvd(String.valueOf(this.gEmmrt));
        String strAxsJAY = AxsJAY();
        InvestGasPriceConfig value = OLrzqt().getValue();
        String str5 = (value == null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
        String strSSMYrx = sSMYrx();
        String first = OLrzqt(OLrzqt().getValue()).getFirst();
        String json = new Gson().toJson(InvestTransactionParam.Companion.instanceForUniV3Redeem$default(InvestTransactionParam.Companion, transactionConfig.AEQbTJ((33554427 & 1) != 0 ? transactionConfig.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfig.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfig.values : 0L, (33554427 & 8) != 0 ? transactionConfig.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfig.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfig.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfig.AuCTel : null, (33554427 & 128) != 0 ? transactionConfig.fARcdN : null, (33554427 & 256) != 0 ? transactionConfig.valueOf : yDY.copydefault(new InvestInputData(str2, (String) null, (String) null, false, false, 30, (DefaultConstructorMarker) null)), (33554427 & 512) != 0 ? transactionConfig.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfig.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfig.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfig.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfig.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfig.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfig.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfig.copydefault : null, (33554427 & 131072) != 0 ? transactionConfig.isConnected : null, (33554427 & 262144) != 0 ? transactionConfig.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfig.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfig.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfig.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfig.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfig.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfig.ejfBZ : null), str, 0, 4, null));
        Intrinsics.checkNotNullExpressionValue(json, "");
        String strOLrzqt = transactionStep.OLrzqt();
        if (strOLrzqt.length() == 0) {
            strOLrzqt = null;
        }
        return new InvestTxModel(iValueOf, str3, str4, listEZpvd2, (Long) null, j, "0", (List) arrayList, (List) null, listAhwBna, list, strEZpvd, strAxsJAY, str5, strSSMYrx, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, str, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, strOLrzqt, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, transactionConfig.fARcdN(), -134348528, 32763, (DefaultConstructorMarker) null);
    }

    private final void EZpvd(List<TransactionStep> list) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3RedeemViewModel$reloadCTAButton$1(this, list, null), 3, null);
    }

    public final void AEQbTJ() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3RedeemViewModel$executeTransaction$1(this, null), 3, null);
    }

    public final void copydefault(Function0<Unit> function0) {
        getReceiveInfoAndCheckState$default(this, null, 1, null);
        InvestUniv3RedeemReceiveInfo investUniv3RedeemReceiveInfo = this.AYXKKw;
        if (investUniv3RedeemReceiveInfo == null || !investUniv3RedeemReceiveInfo.isAllowRedeem()) {
            ORxRYg().setValue(new C23963iPv(true, false));
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    public final void zuBGHE() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3RedeemViewModel$settleTransaction$1(this, null), 3, null);
    }
}

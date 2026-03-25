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
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.bean.response.TransactionStepTokenInfo;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.InvestUniv3SubscribeReceiveInfoHandle;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import com.okinc.network.okg.response.ResponseFailedException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import o.C23566iBc;
import o.C23953iPl;
import o.C23955iPn;
import o.C23956iPo;
import o.C23957iPp;
import o.C23958iPq;
import o.C23959iPr;
import o.C23960iPs;
import o.C25493ixk;
import o.C27492jwH;
import o.C27493jwI;
import o.C27505jwU;
import o.C33129mqd;
import o.C56402yEa;
import o.C56403yEb;
import o.C59449zhJ;
import o.InterfaceC24173iXp;
import o.InterfaceC27092jof;
import o.InterfaceC27095joi;
import o.InterfaceC58227yxM;
import o.iCH;
import o.iCP;
import o.iXD;
import o.iXH;
import o.iXN;
import o.yCM;
import o.yDY;
import o.yHO;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3FarmSubscribeViewModel extends AbstractC27165jpz implements InterfaceC27095joi, InterfaceC27092jof {
    public Bundle AEQbTJ;
    public ResponseState AYXKKw;
    public final MutableLiveData<Boolean> AhwBna;
    public MutableLiveData<Boolean> AkhnZx;
    public MutableLiveData<InvestSubscriptionNewViewModel.SubscriptionResult> AuCTel;
    public String AuCTelauCTel;
    public final MutableLiveData<C23960iPs> AubY;
    public final MutableLiveData<C23958iPq> DbNXlk;
    public final MutableSharedFlow<iXD> EZpvd;
    public MutableStateFlow<InterfaceC24173iXp> KWHzl;
    public long OLrzqt;
    public final StateFlow<InterfaceC24173iXp> copydefault;

    @yCM
    public iXH ctaButtonUseCase;
    public InvestUniv3SubscribeReceiveInfo djBIcL;
    public MutableLiveData<InvestUniv3SubscribePromptInformation> ejfBZ;
    public final SavedStateHandle fARcdN;
    public InvestUniv3SubscribeReceiveInfoHandle fIwbmz;
    public boolean fJNWhG;
    public long fetchVPNInfo;
    public MutableLiveData<InvestSubscriptionNewViewModel.Activity> gEmmrt;
    public String getFieldNames;
    public final MutableLiveData<C23957iPp> getNewProxyInstance;
    public final SharedFlow<iXD> hDKMBd;
    public InvestInputData isConnected;
    public final MutableLiveData<C23956iPo> iwGUEr;

    @yCM
    public iXN settleTransactionUseCase;
    public final MutableLiveData<C23959iPr> uzCIH;
    public InvestUniv3SubscribeInfo valueOf;
    public final MutableLiveData<InvestSubscriptionReceiveInfoUIBean> values;
    public String wlaJM;
    public final MutableLiveData<C23955iPn> zLjUOn;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

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
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24173iXp> AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Bundle bundle) {
        this.AEQbTJ = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27095joi
    public MutableLiveData<InvestSubscriptionReceiveInfoUIBean> AkhnZx() {
        return this.values;
    }

    @Override // o.AbstractC27165jpz
    public void AuCTel() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<InvestUniv3SubscribePromptInformation> DbNXlk() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC27165jpz
    public long EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str, @NotNull String str2, long j, long j2, @NotNull String str3, boolean z, InvestInputData investInputData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.AuCTelauCTel = str;
        this.wlaJM = str2;
        this.fetchVPNInfo = j;
        this.getFieldNames = str3;
        this.fJNWhG = z;
        this.OLrzqt = j2;
        this.isConnected = investInputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> ejfBZ() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23955iPn> fIwbmz() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23959iPr> fJNWhG() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23958iPq> gEmmrt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27092jof
    public MutableLiveData<C23960iPs> getNewProxyInstance() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<iXD> values() {
        return this.hDKMBd;
    }

    @yCM
    public InvestUniv3FarmSubscribeViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.fARcdN = savedStateHandle;
        this.AuCTelauCTel = "";
        this.wlaJM = "";
        this.getFieldNames = "";
        this.uzCIH = new MutableLiveData<>();
        this.AubY = new MutableLiveData<>();
        this.zLjUOn = new MutableLiveData<>();
        this.getNewProxyInstance = new MutableLiveData<>();
        this.values = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.ejfBZ = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.fIwbmz = new InvestUniv3SubscribeReceiveInfoHandle();
        MutableStateFlow<InterfaceC24173iXp> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        this.KWHzl = MutableStateFlow;
        this.copydefault = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<iXD> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.EZpvd = mutableSharedFlowMutableSharedFlow$default;
        this.hDKMBd = mutableSharedFlowMutableSharedFlow$default;
    }

    public final TransactionConfig valueOf() {
        return (TransactionConfig) this.fARcdN.get("key.trx_config");
    }

    public final iXH AYXKKw() {
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

    public final InvestTradeManager.TransactionResultExtraData fetchVPNInfo() {
        return isConnected().copydefault();
    }

    public final void EZpvd(@NotNull String str, long j, @NotNull String str2, @NotNull String str3, @NotNull String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC58185ywX abstractC58185ywXAEQbTJ = C23566iBc.EZpvd.AEQbTJ(j, str, (64 & 4) != 0 ? "" : str3, (64 & 8) != 0 ? false : z, (64 & 16) != 0 ? "" : str2, (64 & 32) != 0 ? "" : str4, (64 & 64) != 0 ? false : false);
        final Function1 function1 = new Function1() { // from class: o.jkt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3FarmSubscribeViewModel.copydefault(this.EZpvd, (InvestUniv3SubscribeInfo) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.jkB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestUniv3FarmSubscribeViewModel.AEQbTJ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.jkC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3FarmSubscribeViewModel.EZpvd(this.AEQbTJ, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jkA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestUniv3FarmSubscribeViewModel.KWHzl(function12, obj);
            }
        });
    }

    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, InvestUniv3SubscribeInfo investUniv3SubscribeInfo) {
        if (investUniv3SubscribeInfo == null) {
            investUniv3FarmSubscribeViewModel.DbNXlk.setValue(new C23958iPq(false, false));
        } else {
            investUniv3FarmSubscribeViewModel.valueOf = investUniv3SubscribeInfo;
            investUniv3FarmSubscribeViewModel.AubY();
            investUniv3FarmSubscribeViewModel.EZpvd(investUniv3FarmSubscribeViewModel.new Application());
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements yHO<Boolean, Boolean, Boolean, Unit> {
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(Boolean bool, Boolean bool2, Boolean bool3) {
            OLrzqt(bool.booleanValue(), bool2.booleanValue(), bool3.booleanValue());
            return Unit.INSTANCE;
        }

        public void OLrzqt(boolean z, boolean z2, boolean z3) {
            InvestUniv3FarmSubscribeViewModel.this.gEmmrt().setValue(new C23958iPq(z, z2));
        }
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, Throwable th) {
        if ((th instanceof ResponseFailedException) || (th instanceof IllegalArgumentException)) {
            investUniv3FarmSubscribeViewModel.DbNXlk.setValue(new C23958iPq(false, false));
        } else {
            investUniv3FarmSubscribeViewModel.DbNXlk.setValue(new C23958iPq(false, true));
        }
        return Unit.INSTANCE;
    }

    private final void AubY() {
        this.AhwBna.setValue(Boolean.FALSE);
    }

    private final void KWHzl(int i) {
        copydefault(i);
        OLrzqt(i);
        EZpvd(i);
        AEQbTJ(i);
    }

    public final void copydefault(int i) {
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo;
        if (i != 2 || (investUniv3SubscribeReceiveInfo = this.djBIcL) == null) {
            return;
        }
        this.AkhnZx.setValue(Boolean.valueOf(investUniv3SubscribeReceiveInfo.isActive()));
        this.ejfBZ.setValue(investUniv3SubscribeReceiveInfo.getPromptInformation());
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        if (investUniv3SubscribeInfo != null) {
            AEQbTJ(investUniv3SubscribeInfo, investUniv3SubscribeReceiveInfo);
        }
    }

    public final void AEQbTJ(InvestUniv3SubscribeInfo investUniv3SubscribeInfo, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo) {
        if (investUniv3SubscribeInfo.getUnderlyingTokenList().size() > 1) {
            this.uzCIH.setValue(new C23959iPr(investUniv3SubscribeInfo.getInvestmentName(), investUniv3SubscribeInfo.getFeeRate(), investUniv3SubscribeInfo.getUnderlyingTokenList().get(0).getTokenSymbol(), investUniv3SubscribeInfo.getUnderlyingTokenList().get(1).getTokenSymbol(), C33129mqd.divS$default(1, investUniv3SubscribeReceiveInfo.getUpperPrice(), null, null, null, 14, null), C33129mqd.divS$default(1, investUniv3SubscribeReceiveInfo.getLowerPrice(), null, null, null, 14, null), false, false, 128, null));
        }
    }

    public final void OLrzqt(InvestUniv3SubscribeInfo investUniv3SubscribeInfo, String str, boolean z, boolean z2) {
        if (investUniv3SubscribeInfo.getUnderlyingTokenList().size() > 1) {
            String tokenSymbol = investUniv3SubscribeInfo.getUnderlyingTokenList().get(0).getTokenSymbol();
            String tokenSymbol2 = investUniv3SubscribeInfo.getUnderlyingTokenList().get(1).getTokenSymbol();
            this.zLjUOn.setValue(new C23955iPn(C33129mqd.divS$default(1, str, null, null, null, 14, null), tokenSymbol, tokenSymbol2, z, z2, 0, 32, null));
        }
    }

    /* JADX DEBUG: Type inference failed for r2v8. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r8v4. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r8v6. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r8v8. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.lang.String] */
    private final void OLrzqt(int i) {
        ArrayList arrayList;
        List<InvestTokenWithAmount> listAhwBna;
        String currentPrice;
        List<InvestTokenWithAmount> investWithTokenList;
        String str = "";
        if (i != 1) {
            if (i == 2) {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.djBIcL;
                if (investUniv3SubscribeReceiveInfo != null) {
                    String currentPrice2 = investUniv3SubscribeReceiveInfo.getCurrentPrice();
                    Iterator it = investUniv3SubscribeReceiveInfo.getAssetsList().iterator();
                    String strAddS$default = "0";
                    while (it.hasNext()) {
                        strAddS$default = C33129mqd.addS$default(strAddS$default, ((InvestTokenWithAmount) it.next()).getCurrencyAmount(), null, null, null, 14, null);
                    }
                    Iterator it2 = investUniv3SubscribeReceiveInfo.getFeeEarning().iterator();
                    String strAddS$default2 = strAddS$default;
                    while (it2.hasNext()) {
                        strAddS$default2 = C33129mqd.addS$default(strAddS$default2, ((InvestTokenWithAmount) it2.next()).getCurrencyAmount(), null, null, null, 14, null);
                    }
                    List<InvestTokenWithAmount> investWithTokenList2 = investUniv3SubscribeReceiveInfo.getInvestWithTokenList();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : investWithTokenList2) {
                        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
                        if (!Intrinsics.EZpvd((Object) investTokenWithAmount.getTokenId(), (Object) "") || !Intrinsics.EZpvd((Object) investTokenWithAmount.getCoinAmount(), (Object) "0")) {
                            arrayList2.add(obj);
                        }
                    }
                    getNewProxyInstance().setValue(new C23960iPs(investUniv3SubscribeReceiveInfo.getAssetsList(), investUniv3SubscribeReceiveInfo.getFeeEarning(), null, null, investUniv3SubscribeReceiveInfo.getGainsTokenList(), null, this.getFieldNames, strAddS$default2, false, false, investUniv3SubscribeReceiveInfo.getInvestWithTokenList(), 512, null));
                    InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
                    if (investUniv3SubscribeInfo != null) {
                        AkhnZx().setValue(new InvestSubscriptionReceiveInfoUIBean(false, investUniv3SubscribeInfo.getPlatformLogo(), investUniv3SubscribeInfo.getPlatformName(), (List) arrayList2, (List) investUniv3SubscribeReceiveInfo.getSwapToTokenList(), (InvestTokenWithAmount) null, false, (InvestTipsBean) null, (InvestExchangeRateBean) null, (String) null, (String) null, (Integer) null, 4064, (DefaultConstructorMarker) null));
                        OLrzqt(investUniv3SubscribeInfo, currentPrice2, false, false);
                        this.iwGUEr.setValue(new C23956iPo(null, investUniv3SubscribeReceiveInfo.getApr() != null ? C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, investUniv3SubscribeReceiveInfo.getApr(), false, 2, null) : null, C25493ixk.FragmentManager.geLlBI, false, false, 1, null));
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
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo2 = this.valueOf;
        if (investUniv3SubscribeInfo2 != null) {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.djBIcL;
            if (investUniv3SubscribeReceiveInfo2 == null || (investWithTokenList = investUniv3SubscribeReceiveInfo2.getInvestWithTokenList()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : investWithTokenList) {
                    InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) obj2;
                    if (!Intrinsics.EZpvd((Object) investTokenWithAmount2.getTokenId(), (Object) "") || !Intrinsics.EZpvd((Object) investTokenWithAmount2.getCoinAmount(), (Object) "0")) {
                        arrayList3.add(obj2);
                    }
                }
                arrayList = arrayList3;
            }
            MutableLiveData<C23960iPs> newProxyInstance = getNewProxyInstance();
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo3 = this.djBIcL;
            List<InvestTokenWithAmount> assetsList = investUniv3SubscribeReceiveInfo3 != null ? investUniv3SubscribeReceiveInfo3.getAssetsList() : null;
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo4 = this.djBIcL;
            List<InvestTokenWithAmount> feeEarning = investUniv3SubscribeReceiveInfo4 != null ? investUniv3SubscribeReceiveInfo4.getFeeEarning() : null;
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo5 = this.djBIcL;
            if (investUniv3SubscribeReceiveInfo5 == null || (listAhwBna = investUniv3SubscribeReceiveInfo5.getGainsTokenList()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            newProxyInstance.setValue(new C23960iPs(assetsList, feeEarning, null, null, listAhwBna, null, this.getFieldNames, "", false, true, null, 1024, null));
            MutableLiveData<InvestSubscriptionReceiveInfoUIBean> mutableLiveDataAkhnZx = AkhnZx();
            String platformLogo = investUniv3SubscribeInfo2.getPlatformLogo();
            String platformName = investUniv3SubscribeInfo2.getPlatformName();
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo6 = this.djBIcL;
            mutableLiveDataAkhnZx.setValue(new InvestSubscriptionReceiveInfoUIBean(false, platformLogo, platformName, (List) arrayList, (List) (investUniv3SubscribeReceiveInfo6 != null ? investUniv3SubscribeReceiveInfo6.getSwapToTokenList() : null), (InvestTokenWithAmount) null, true, (InvestTipsBean) null, (InvestExchangeRateBean) null, (String) null, (String) null, (Integer) null, Utf8.MASK_2BYTES, (DefaultConstructorMarker) null));
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo7 = this.djBIcL;
            if (investUniv3SubscribeReceiveInfo7 != null && (currentPrice = investUniv3SubscribeReceiveInfo7.getCurrentPrice()) != null) {
                str = currentPrice;
            }
            OLrzqt(investUniv3SubscribeInfo2, str, false, false);
            this.iwGUEr.setValue(new C23956iPo(null, "--", C25493ixk.FragmentManager.geLlBI, false, true, 1, null));
        }
    }

    @Override // o.AbstractC27165jpz
    public void EZpvd(int i) {
        super.EZpvd(i);
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        if (investUniv3SubscribeInfo != null) {
            MutableLiveData<C23953iPl> mutableLiveDataAwvSrB = AwvSrB();
            String network = investUniv3SubscribeInfo.getNetwork();
            String networkLogo = investUniv3SubscribeInfo.getNetworkLogo();
            String strDTwDnp = OLrzqt().getValue() != null ? DTwDnp() : "";
            InvestGasPriceConfig value = OLrzqt().getValue();
            String strQKVWgx = (value != null ? value.getInvestSlippage() : null) != null ? QKVWgx() : "";
            InvestGasPriceConfig value2 = OLrzqt().getValue();
            mutableLiveDataAwvSrB.setValue(new C23953iPl(i, true, network, networkLogo, strDTwDnp, strQKVWgx, value2 != null ? Boolean.valueOf(C27505jwU.OLrzqt(value2)) : null, QbewEr(), QUSxYX(), RJOkX()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AEQbTJ(int i) {
        if (i == 0) {
            this.getNewProxyInstance.setValue(new C23957iPp(true, false, 0, null, null, 24, null));
        } else if (i == 1) {
            this.getNewProxyInstance.setValue(new C23957iPp(false, true, 0, null, null, 24, null));
        } else if (i == 2) {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.djBIcL;
            if (investUniv3SubscribeReceiveInfo != null) {
                MutableLiveData<C23957iPp> mutableLiveData = this.getNewProxyInstance;
                List<InvestTokenWithApprove> approveStatusList = investUniv3SubscribeReceiveInfo.getApproveStatusList();
                InvestInputData investInputData = this.isConnected;
                mutableLiveData.setValue(new C23957iPp(false, false, 0, approveStatusList, KWHzl(investInputData != null ? investInputData.getApprovedTokenAddress() : null)));
            }
        } else if (i != 4) {
            if (i == 5) {
            }
        }
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.djBIcL;
        if (investUniv3SubscribeReceiveInfo2 != null) {
            KWHzl(investUniv3SubscribeReceiveInfo2.getTransactionStepList());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3FarmSubscribeViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getReceiveInfoAndCheckState$default(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, yHO yho, int i, Object obj) {
        if ((i & 1) != 0) {
            yho = null;
        }
        investUniv3FarmSubscribeViewModel.EZpvd((yHO<? super Boolean, ? super Boolean, ? super Boolean, Unit>) yho);
    }

    public final void EZpvd(final yHO<? super Boolean, ? super Boolean, ? super Boolean, Unit> yho) {
        final Ref.IntRef intRef = new Ref.IntRef();
        this.fIwbmz.getReceiveInfo(this.AuCTelauCTel, this.wlaJM, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null), "", this.fetchVPNInfo, this.fJNWhG, 0, 0, this.getFieldNames, new Function1() { // from class: o.jkz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3FarmSubscribeViewModel.KWHzl(this.EZpvd, (InvestGasPriceConfig) obj);
            }
        }, new Function2() { // from class: o.jky
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestUniv3FarmSubscribeViewModel.OLrzqt(this.AEQbTJ, intRef, yho, (ResponseState) obj, (kotlin.Pair) obj2);
            }
        });
    }

    public static final String KWHzl(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        return investUniv3FarmSubscribeViewModel.OLrzqt(investGasPriceConfig).getFirst();
    }

    public static final Unit OLrzqt(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, Ref.IntRef intRef, yHO yho, ResponseState responseState, Pair pair) {
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo;
        InvestGasPriceConfig investGasPriceConfig;
        Intrinsics.checkNotNullParameter(responseState, "");
        MutableLiveData<Boolean> mutableLiveDataGHZMYf = investUniv3FarmSubscribeViewModel.gHZMYf();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataGHZMYf.setValue(bool);
        investUniv3FarmSubscribeViewModel.QfsBiF().setValue(bool);
        investUniv3FarmSubscribeViewModel.djBIcL = pair != null ? (InvestUniv3SubscribeReceiveInfo) pair.getSecond() : null;
        if (pair != null && (investGasPriceConfig = (InvestGasPriceConfig) pair.getFirst()) != null) {
            investGasPriceConfig.setEstimateGasFee(((InvestUniv3SubscribeReceiveInfo) pair.getSecond()).getEstimateGasFee());
        }
        investUniv3FarmSubscribeViewModel.OLrzqt().setValue(pair != null ? (InvestGasPriceConfig) pair.getFirst() : null);
        investUniv3FarmSubscribeViewModel.AYXKKw = responseState;
        int i = ActionBar.EZpvd[responseState.getErrorType().ordinal()];
        if (i != 1) {
            if (i == 2) {
                investUniv3FarmSubscribeViewModel.QOLQEE().setValue(responseState);
                intRef.element = 1;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (responseState.getErrorCode() == 10002) {
                    intRef.element = 5;
                } else {
                    investUniv3FarmSubscribeViewModel.QOLQEE().setValue(responseState);
                    intRef.element = 1;
                }
            }
        } else if (pair != null) {
            intRef.element = 2;
        } else {
            investUniv3FarmSubscribeViewModel.QOLQEE().setValue(responseState);
            intRef.element = 1;
        }
        investUniv3FarmSubscribeViewModel.KWHzl(intRef.element);
        if (yho != null) {
            yho.invoke(Boolean.valueOf(responseState.getErrorType() == ResponseStateType.NORMAL && pair != null), Boolean.valueOf(responseState.getErrorType() == ResponseStateType.NET_ERRO), Boolean.valueOf((pair == null || (investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) pair.getSecond()) == null || !investUniv3SubscribeReceiveInfo.isActive()) ? false : true));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void submitTransaction$default(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, Context context, boolean z, InvestTokenWithApprove investTokenWithApprove, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            investTokenWithApprove = null;
        }
        investUniv3FarmSubscribeViewModel.copydefault(context, z, investTokenWithApprove);
    }

    public final void copydefault(@NotNull Context context, boolean z, final InvestTokenWithApprove investTokenWithApprove) {
        Integer orderType;
        Integer orderType2;
        Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            InvestTradeManager.submitTransaction$default(InvestTradeManager.OLrzqt, context, AEQbTJ((investTokenWithApprove == null || (orderType2 = investTokenWithApprove.getOrderType()) == null) ? InvestAction.SubscriptionApprove.getValue() : orderType2.intValue(), true, investTokenWithApprove), null, new yHO() { // from class: o.jku
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InvestUniv3FarmSubscribeViewModel.OLrzqt(this.copydefault, investTokenWithApprove, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
                }
            }, 4, null);
        } else {
            InvestTradeManager.submitTransaction$default(InvestTradeManager.OLrzqt, context, genInvestTxModel$default(this, (investTokenWithApprove == null || (orderType = investTokenWithApprove.getOrderType()) == null) ? InvestAction.Subscription.getValue() : orderType.intValue(), false, null, 4, null), null, new yHO() { // from class: o.jkw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InvestUniv3FarmSubscribeViewModel.OLrzqt(this.OLrzqt, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
                }
            }, 4, null);
        }
    }

    public static final Unit OLrzqt(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        investUniv3FarmSubscribeViewModel.gEmmrt.setValue(new InvestSubscriptionNewViewModel.Activity(investTokenWithApprove, i, bundle));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        investUniv3FarmSubscribeViewModel.AuCTel.setValue(new InvestSubscriptionNewViewModel.SubscriptionResult(i, bundle, transactionResultExtraData));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ InvestTxModel genInvestTxModel$default(InvestUniv3FarmSubscribeViewModel investUniv3FarmSubscribeViewModel, int i, boolean z, InvestTokenWithApprove investTokenWithApprove, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            investTokenWithApprove = null;
        }
        return investUniv3FarmSubscribeViewModel.AEQbTJ(i, z, investTokenWithApprove);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x01b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InvestTxModel AEQbTJ(int i, boolean z, InvestTokenWithApprove investTokenWithApprove) {
        InvestTokenWithAmount investTokenWithAmount;
        List listEZpvd;
        List<InvestTokenWithAmount> investWithTokenList;
        InvestTokenWithAmount investTokenWithAmount2;
        Object next;
        List list;
        String estimateGasFee;
        List<InvestTokenWithApprove> approveStatusList;
        String str = this.AuCTelauCTel;
        String str2 = this.wlaJM;
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(this.fetchVPNInfo));
        long j = this.OLrzqt;
        if (z && InvestAction.Companion.copydefault(i) == InvestAction.SubscriptionApprove) {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.djBIcL;
            if (investUniv3SubscribeReceiveInfo == null || (approveStatusList = investUniv3SubscribeReceiveInfo.getApproveStatusList()) == null) {
                listEZpvd = yDY.AhwBna();
            } else {
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(approveStatusList, 10));
                for (InvestTokenWithApprove investTokenWithApprove2 : approveStatusList) {
                    arrayList.add(new InvestTokenWithAmount(investTokenWithApprove2.getChainId(), "0", (String) null, false, false, (String) null, investTokenWithApprove2.getTokenAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435388, (DefaultConstructorMarker) null));
                }
                list = arrayList;
                String strEZpvd = OcIXYQ().EZpvd(String.valueOf(this.OLrzqt));
                String strAxsJAY = AxsJAY();
                InvestGasPriceConfig value = OLrzqt().getValue();
                String str3 = (value != null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
                String strSSMYrx = sSMYrx();
                String first = OLrzqt(OLrzqt().getValue()).getFirst();
                String json = new Gson().toJson(OLrzqt(investTokenWithApprove));
                Intrinsics.checkNotNullExpressionValue(json, "");
                return new InvestTxModel(i, str, str2, listEZpvd2, (Long) null, j, "0", (List) null, (List) null, (List) null, list, strEZpvd, strAxsJAY, str3, strSSMYrx, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, this.getFieldNames, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134347888, 65535, (DefaultConstructorMarker) null);
            }
        } else {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.djBIcL;
            if (investUniv3SubscribeReceiveInfo2 == null || (investWithTokenList = investUniv3SubscribeReceiveInfo2.getInvestWithTokenList()) == null || (investTokenWithAmount2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investWithTokenList)) == null || (investTokenWithAmount = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null)) == null) {
                investTokenWithAmount = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
            } else {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo3 = this.djBIcL;
                Intrinsics.copydefault(investUniv3SubscribeReceiveInfo3);
                Iterator<T> it = investUniv3SubscribeReceiveInfo3.getTokenInfoList().iterator();
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
                investTokenWithAmount.setChainId(investTokenWithAmount.getChainId() != 0 ? investTokenWithAmount.getChainId() : this.OLrzqt);
                String coinAmount = investTokenWithAmount.getCoinAmount();
                if (coinAmount.length() == 0) {
                    coinAmount = "1";
                }
                investTokenWithAmount.setCoinAmount(coinAmount);
                Unit unit = Unit.INSTANCE;
            }
            listEZpvd = C56402yEa.EZpvd(investTokenWithAmount);
        }
        list = listEZpvd;
        String strEZpvd2 = OcIXYQ().EZpvd(String.valueOf(this.OLrzqt));
        String strAxsJAY2 = AxsJAY();
        InvestGasPriceConfig value2 = OLrzqt().getValue();
        if (value2 != null) {
        }
        String strSSMYrx2 = sSMYrx();
        String first2 = OLrzqt(OLrzqt().getValue()).getFirst();
        String json2 = new Gson().toJson(OLrzqt(investTokenWithApprove));
        Intrinsics.checkNotNullExpressionValue(json2, "");
        return new InvestTxModel(i, str, str2, listEZpvd2, (Long) null, j, "0", (List) null, (List) null, (List) null, list, strEZpvd2, strAxsJAY2, str3, strSSMYrx2, first2, json2, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, this.getFieldNames, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134347888, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InvestTransactionParam OLrzqt(InvestTokenWithApprove investTokenWithApprove) {
        Integer orderType;
        List<InvestTokenWithApprove> approveStatusList;
        Integer numValueOf;
        List<InvestTokenWithApprove> approveStatusList2;
        InvestTokenWithApprove investTokenWithApprove2;
        List<InvestTokenWithApprove> approveStatusList3;
        List<InvestTokenWithApprove> approveStatusList4;
        List<InvestTokenWithApprove> approveStatusList5;
        Integer numValueOf2 = null;
        if (investTokenWithApprove == null) {
            orderType = null;
        } else {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.djBIcL;
            if ((investUniv3SubscribeReceiveInfo != null ? investUniv3SubscribeReceiveInfo.getApproveStatusList() : null) != null) {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.djBIcL;
                if (investUniv3SubscribeReceiveInfo2 == null || (approveStatusList5 = investUniv3SubscribeReceiveInfo2.getApproveStatusList()) == null) {
                    numValueOf = null;
                } else {
                    Iterator<InvestTokenWithApprove> it = approveStatusList5.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (Intrinsics.EZpvd((Object) it.next().getTokenAddress(), (Object) investTokenWithApprove.getTokenAddress())) {
                            break;
                        }
                        i++;
                    }
                    numValueOf = Integer.valueOf(i);
                }
                if (numValueOf != null && numValueOf.intValue() > 0) {
                    InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo3 = this.djBIcL;
                    if (((investUniv3SubscribeReceiveInfo3 == null || (approveStatusList4 = investUniv3SubscribeReceiveInfo3.getApproveStatusList()) == null) ? null : Integer.valueOf(approveStatusList4.size())) != null) {
                        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo4 = this.djBIcL;
                        Integer numValueOf3 = (investUniv3SubscribeReceiveInfo4 == null || (approveStatusList3 = investUniv3SubscribeReceiveInfo4.getApproveStatusList()) == null) ? null : Integer.valueOf(approveStatusList3.size());
                        Intrinsics.copydefault(numValueOf3);
                        if (numValueOf3.intValue() > numValueOf.intValue() + 1) {
                            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo5 = this.djBIcL;
                            orderType = (investUniv3SubscribeReceiveInfo5 == null || (approveStatusList2 = investUniv3SubscribeReceiveInfo5.getApproveStatusList()) == null || (investTokenWithApprove2 = approveStatusList2.get(numValueOf.intValue() + 1)) == null) ? null : investTokenWithApprove2.getOrderType();
                        }
                    }
                }
            }
        }
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(this.fetchVPNInfo));
        List listEZpvd2 = C56402yEa.EZpvd(new InvestInputData("0", investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, false, false, 24, (DefaultConstructorMarker) null));
        long j = this.OLrzqt;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        Long analysisPlatformId = investUniv3SubscribeInfo != null ? investUniv3SubscribeInfo.getAnalysisPlatformId() : null;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo2 = this.valueOf;
        Integer numValueOf4 = investUniv3SubscribeInfo2 != null ? Integer.valueOf(investUniv3SubscribeInfo2.getInvestType()) : null;
        boolean z = this.fJNWhG;
        String str = this.getFieldNames;
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo6 = this.djBIcL;
        if (investUniv3SubscribeReceiveInfo6 != null && (approveStatusList = investUniv3SubscribeReceiveInfo6.getApproveStatusList()) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : approveStatusList) {
                if (((InvestTokenWithApprove) obj).isNeedApprove()) {
                    arrayList.add(obj);
                }
            }
            numValueOf2 = Integer.valueOf(arrayList.size());
        }
        return new InvestTransactionParam(listEZpvd2, z, C33129mqd.AEQbTJ(numValueOf2, 1), j, numValueOf4, analysisPlatformId, (String) null, listEZpvd, (Long) null, (Integer) null, str, (Integer) 2, orderType, (InvestPoolV3) null, (Integer) null, (Boolean) null, 58176, (DefaultConstructorMarker) null);
    }

    public final InvestTokenWithAmount KWHzl(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435391, (DefaultConstructorMarker) null);
    }

    @Override // o.AbstractC27165jpz
    public void uzCIH() {
        if (Intrinsics.EZpvd(this.AhwBna.getValue(), Boolean.FALSE)) {
            getReceiveInfoAndCheckState$default(this, null, 1, null);
        }
    }

    @Override // o.AbstractC27165jpz
    public void getFieldNames() {
        this.fIwbmz.dispose();
    }

    @Override // o.AbstractC27165jpz
    public void hDKMBd() {
        getReceiveInfoAndCheckState$default(this, null, 1, null);
    }

    private final void KWHzl(List<TransactionStep> list) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3FarmSubscribeViewModel$reloadCTAButton$1(this, list, null), 3, null);
    }

    public final void iwGUEr() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3FarmSubscribeViewModel$settleTransaction$1(this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvestTxModel EZpvd(TransactionConfig transactionConfig, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, TransactionStep transactionStep) {
        InvestTokenWithAmount investTokenWithAmount;
        List listEZpvd;
        Object next;
        Long analysisPlatformId;
        String estimateGasFee;
        int iValueOf = transactionStep.valueOf();
        String str = this.AuCTelauCTel;
        String str2 = this.wlaJM;
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        long jLongValue = 0;
        if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
            List<TransactionStep> transactionStepList = investUniv3SubscribeReceiveInfo.getTransactionStepList();
            ArrayList<TransactionStep> arrayList = new ArrayList();
            for (Object obj : transactionStepList) {
                if (InvestTradeManager.OLrzqt.AEQbTJ(((TransactionStep) obj).valueOf())) {
                    arrayList.add(obj);
                }
            }
            listEZpvd = new ArrayList(C56403yEb.AYXKKw(arrayList, 10));
            for (TransactionStep transactionStep2 : arrayList) {
                TransactionStepTokenInfo transactionStepTokenInfo = (TransactionStepTokenInfo) CollectionsKt___CollectionsKt.firstOrNull(transactionStep2.AkhnZx());
                listEZpvd.add(new InvestTokenWithAmount(transactionStepTokenInfo != null ? transactionStepTokenInfo.copydefault() : transactionConfig.copydefault(), "0", (String) null, false, false, (String) null, transactionStep2.gEmmrt(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435388, (DefaultConstructorMarker) null));
            }
        } else {
            InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investUniv3SubscribeReceiveInfo.getInvestWithTokenList());
            if (investTokenWithAmount2 == null || (investTokenWithAmount = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null)) == null) {
                investTokenWithAmount = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
            } else {
                Iterator<T> it = investUniv3SubscribeReceiveInfo.getTokenInfoList().iterator();
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
                investTokenWithAmount.setChainId(investTokenWithAmount.getChainId() != 0 ? investTokenWithAmount.getChainId() : this.OLrzqt);
                String coinAmount = investTokenWithAmount.getCoinAmount();
                if (coinAmount.length() == 0) {
                    coinAmount = "1";
                }
                investTokenWithAmount.setCoinAmount(coinAmount);
                Unit unit = Unit.INSTANCE;
            }
            listEZpvd = C56402yEa.EZpvd(investTokenWithAmount);
        }
        List list = listEZpvd;
        String strEZpvd = OcIXYQ().EZpvd(String.valueOf(this.OLrzqt));
        String strAxsJAY = AxsJAY();
        InvestGasPriceConfig value = OLrzqt().getValue();
        String str3 = (value == null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
        String strSSMYrx = sSMYrx();
        String first = OLrzqt(OLrzqt().getValue()).getFirst();
        Gson gson = new Gson();
        InvestTransactionParam.Companion companion = InvestTransactionParam.Companion;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        if (investUniv3SubscribeInfo != null && (analysisPlatformId = investUniv3SubscribeInfo.getAnalysisPlatformId()) != null) {
            jLongValue = analysisPlatformId.longValue();
        }
        long j = jLongValue;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo2 = this.valueOf;
        TransactionConfig transactionConfigAEQbTJ = transactionConfig.AEQbTJ((33554427 & 1) != 0 ? transactionConfig.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfig.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfig.values : 0L, (33554427 & 8) != 0 ? transactionConfig.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfig.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfig.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfig.AuCTel : null, (33554427 & 128) != 0 ? transactionConfig.fARcdN : null, (33554427 & 256) != 0 ? transactionConfig.valueOf : null, (33554427 & 512) != 0 ? transactionConfig.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfig.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfig.OLrzqt : j, (33554427 & 4096) != 0 ? transactionConfig.AhwBna : investUniv3SubscribeInfo2 != null ? investUniv3SubscribeInfo2.getInvestType() : 0, (33554427 & 8192) != 0 ? transactionConfig.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfig.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfig.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfig.copydefault : null, (33554427 & 131072) != 0 ? transactionConfig.isConnected : null, (33554427 & 262144) != 0 ? transactionConfig.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfig.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfig.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfig.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfig.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfig.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfig.ejfBZ : null);
        String str4 = this.getFieldNames;
        List<TransactionStep> transactionStepList2 = investUniv3SubscribeReceiveInfo.getTransactionStepList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = transactionStepList2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            TransactionStep transactionStep3 = (TransactionStep) next2;
            Iterator it3 = it2;
            String str5 = strAxsJAY;
            if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep3.valueOf()) && transactionStep3.fetchVPNInfo()) {
                arrayList2.add(next2);
            }
            it2 = it3;
            strAxsJAY = str5;
        }
        String str6 = strAxsJAY;
        String json = gson.toJson(companion.EZpvd(transactionConfigAEQbTJ, str4, 2, C33129mqd.AEQbTJ(Integer.valueOf(arrayList2.size()), 1), copydefault(transactionStep.gEmmrt())));
        Intrinsics.checkNotNullExpressionValue(json, "");
        String str7 = this.getFieldNames;
        String strOLrzqt = transactionStep.OLrzqt();
        return new InvestTxModel(iValueOf, str, str2, listEZpvd2, (Long) null, jCopydefault, "0", (List) null, (List) null, (List) null, list, strEZpvd, str6, str3, strSSMYrx, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, str7, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, strOLrzqt.length() == 0 ? null : strOLrzqt, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -134347888, 65531, (DefaultConstructorMarker) null);
    }

    public final Integer copydefault(String str) {
        List<TransactionStep> transactionStepList;
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.djBIcL;
        if (investUniv3SubscribeReceiveInfo == null || (transactionStepList = investUniv3SubscribeReceiveInfo.getTransactionStepList()) == null) {
            return null;
        }
        return iCH.OLrzqt(transactionStepList, str, new Function1() { // from class: o.jkx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3FarmSubscribeViewModel.AEQbTJ((TransactionStep) obj);
            }
        }, new Function1() { // from class: o.jkv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(InvestUniv3FarmSubscribeViewModel.copydefault((TransactionStep) obj));
            }
        });
    }

    public static final String AEQbTJ(TransactionStep transactionStep) {
        Intrinsics.checkNotNullParameter(transactionStep, "");
        return transactionStep.gEmmrt();
    }

    public static final int copydefault(TransactionStep transactionStep) {
        Intrinsics.checkNotNullParameter(transactionStep, "");
        return transactionStep.valueOf();
    }
}

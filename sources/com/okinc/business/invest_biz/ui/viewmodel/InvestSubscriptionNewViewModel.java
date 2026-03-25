package com.okinc.business.invest_biz.ui.viewmodel;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.ReserveBean;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestAdvancePanelUIBean;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.bean.InvestTransactionLossInfo;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.PointsInfo;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestReceiveInfoHandle;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestType;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Triple;
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
import o.AbstractC58185ywX;
import o.Bitmap;
import o.C23539iAc;
import o.C23948iPg;
import o.C25471ixO;
import o.C25479ixW;
import o.C25480ixX;
import o.C25481ixY;
import o.C25482ixZ;
import o.C25493ixk;
import o.C25536iya;
import o.C25537iyb;
import o.C25544iyi;
import o.C25595izg;
import o.C27164jpy;
import o.C27491jwG;
import o.C27492jwH;
import o.C27493jwI;
import o.C27505jwU;
import o.C27577jxn;
import o.C27581jxr;
import o.C32979mnm;
import o.C33050mpD;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C56390yDp;
import o.C56402yEa;
import o.C56403yEb;
import o.C56424yEw;
import o.C59449zhJ;
import o.C9917bed;
import o.InterfaceC24173iXp;
import o.InterfaceC27095joi;
import o.InterfaceC27096joj;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.iCP;
import o.iXD;
import o.iXH;
import o.iXN;
import o.pTB;
import o.yCM;
import o.yDY;
import o.yEE;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestSubscriptionNewViewModel extends ViewModel implements InterfaceC27096joj, InterfaceC27095joi {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final Set<Integer> AEQbTJ;
    public Bundle AYXKKw;
    public MutableLiveData<C25481ixY> AhwBna;
    public MutableLiveData<C25482ixZ> AkhnZx;
    public Object AuCTel;
    public boolean AuCTelauCTel;
    public boolean AubY;
    public MutableLiveData<C25479ixW> AwvSrB;
    public boolean AxsJAY;
    public final MutableLiveData<InvestTransactionLossInfo> AxsJAYaxsJAY;
    public InvestTokenWithAmount DTwDnp;
    public MutableLiveData<Triple<Integer, InvestSubscriptionReceiveInfo, Integer>> DbNXlk;
    public MutableStateFlow<InterfaceC24173iXp> EZpvd;
    public MutableLiveData<InvestConsumeData<Boolean>> KWHzl;
    public MutableLiveData<C23948iPg> ORxRYg;
    public String OcIXYQ;
    public boolean QKVWgx;
    public boolean QOLQEE;
    public MutableLiveData<C23948iPg> QUSxYX;
    public boolean QVAiDq;
    public final MutableLiveData<Object> QbewEr;
    public final MutableLiveData<C25480ixX> QfsBiF;
    public String RJOkX;
    public MutableLiveData<ResponseState> RcXXUw;
    public StateListAnimator UeEOUB;
    public boolean aKErDB;
    public String accept;
    public final MutableSharedFlow<iXD> copydefault;
    public InvestTokenWithAmount dNCPSb;
    public final StateFlow<InterfaceC24173iXp> djBIcL;
    public InvestReceiveInfoHandle djSkpj;
    public final MutableLiveData<Boolean> dvKsVJ;
    public final StateFlow<String> dxcTrN;
    public final MutableLiveData<Boolean> ejfBZ;
    public MutableLiveData<C25537iyb> fARcdN;
    public final MutableStateFlow<String> fFgQHt;
    public final MutableLiveData<Boolean> fIwbmz;
    public final MutableLiveData<Boolean> fJNWhG;
    public final SavedStateHandle fZBcTu;
    public MutableLiveData<InvestGasPriceConfig> fetchVPNInfo;
    public String finit;
    public boolean flVtFt;
    public boolean fvQaOB;
    public MutableLiveData<InvestAdvancePanelUIBean> gEmmrt;
    public String gGvvIC;
    public final MutableLiveData<C25480ixX> gHZMYf;
    public boolean gasjUx;

    @yCM
    public iXH getCTAButtonUseCase;
    public InvestInputData getFieldNames;
    public boolean getNewProxyInstance;
    public InvestTokenWithAmount giSNqX;
    public final SharedFlow<iXD> gkJEwt;
    public final MutableLiveData<Boolean> hDKMBd;
    public MutableLiveData<SubscriptionResult> hUfVAv;
    public final MutableLiveData<Boolean> iRxXKY;
    public InvestTipsBean iZzfmt;
    public TransactionStage isConnected;
    public MutableLiveData<Boolean> iwGUEr;
    public MutableLiveData<C23948iPg> sSMYrx;

    @yCM
    public iXN settleTransactionUseCase;
    public C27164jpy uzCIH;
    public MutableLiveData<Activity> valueOf;
    public InvestSubscriptionReceiveInfo values;
    public MutableLiveData<InvestSubscriptionReceiveInfoUIBean> wlaJM;
    public MutableLiveData<C25536iya> zLjUOn;
    public final MutableLiveData<Boolean> zsXlph;
    public final Function1<C9917bed, Unit> zuBGHE;

    public interface StateListAnimator {
        void KWHzl(boolean z, ResponseState responseState);
    }

    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] OLrzqt;

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
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Bundle bundle) {
        this.AYXKKw = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27095joi
    public MutableLiveData<InvestSubscriptionReceiveInfoUIBean> AkhnZx() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C25536iya> AuCTelauCTel() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23948iPg> AwvSrB() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C25479ixW> AxsJAY() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23948iPg> DTwDnp() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24173iXp> DbNXlk() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.AuCTelauCTel = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestGasPriceConfig> OLrzqt() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C25480ixX> ORxRYg() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<String> QUSxYX() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ResponseState> QVAiDq() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> QfsBiF() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<InvestTransactionLossInfo> UeEOUB() {
        return this.AxsJAYaxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<SubscriptionResult> aKErDB() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestConsumeData<Boolean>> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> dNCPSb() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.RJOkX = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean dxcTrN() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C25537iyb> fIwbmz() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<iXD> finit() {
        return this.gkJEwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> flVtFt() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C25481ixY> gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OcIXYQ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C25480ixX> gHZMYf() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gasjUx() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> getNewProxyInstance() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> hDKMBd() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void iZzfmt() {
        this.AxsJAY = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C25482ixZ> isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> iwGUEr() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Object> sSMYrx() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<InvestAdvancePanelUIBean> valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23948iPg> zuBGHE() {
        return this.ORxRYg;
    }

    @yCM
    public InvestSubscriptionNewViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.fZBcTu = savedStateHandle;
        this.zsXlph = new MutableLiveData<>();
        this.fIwbmz = new MutableLiveData<>();
        this.wlaJM = new MutableLiveData<>();
        this.iRxXKY = new MutableLiveData<>(Boolean.FALSE);
        this.AxsJAYaxsJAY = new MutableLiveData<>(null);
        this.RcXXUw = new MutableLiveData<>();
        this.valueOf = new MutableLiveData<>();
        this.hUfVAv = new MutableLiveData<>();
        this.DbNXlk = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AwvSrB = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.zLjUOn = new MutableLiveData<>();
        this.sSMYrx = new MutableLiveData<>();
        this.ORxRYg = new MutableLiveData<>();
        this.QUSxYX = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.hDKMBd = new MutableLiveData<>();
        this.dvKsVJ = new MutableLiveData<>();
        this.fJNWhG = new MutableLiveData<>();
        this.ejfBZ = new MutableLiveData<>();
        this.gHZMYf = new MutableLiveData<>();
        this.QfsBiF = new MutableLiveData<>();
        this.QbewEr = new MutableLiveData<>();
        this.fetchVPNInfo = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.AuCTelauCTel = true;
        this.AubY = true;
        this.giSNqX = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
        this.DTwDnp = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
        this.dNCPSb = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
        this.finit = "";
        this.OcIXYQ = "";
        this.RJOkX = "";
        this.gGvvIC = "";
        this.djSkpj = new InvestReceiveInfoHandle();
        this.AuCTel = new Object();
        this.uzCIH = new C27164jpy();
        this.accept = toString();
        MutableStateFlow<String> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.fFgQHt = MutableStateFlow;
        this.dxcTrN = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<InterfaceC24173iXp> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        this.EZpvd = MutableStateFlow2;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<iXD> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.gkJEwt = mutableSharedFlowMutableSharedFlow$default;
        this.isConnected = TransactionStage.INPUT;
        this.AEQbTJ = yEE.AhwBna(5, 1);
        this.zuBGHE = new Function1() { // from class: o.jpa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.AEQbTJ(this.OLrzqt, (C9917bed) obj);
            }
        };
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Activity {
        public final int AEQbTJ;
        public final Bundle EZpvd;
        public final InvestTokenWithApprove KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                investTokenWithApprove = activity.KWHzl;
            }
            if ((i2 & 2) != 0) {
                i = activity.AEQbTJ;
            }
            if ((i2 & 4) != 0) {
                bundle = activity.EZpvd;
            }
            return activity.EZpvd(investTokenWithApprove, i, bundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle) {
            return new Activity(investTokenWithApprove, i, bundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.KWHzl, activity.KWHzl) && this.AEQbTJ == activity.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            InvestTokenWithApprove investTokenWithApprove = this.KWHzl;
            int iHashCode = investTokenWithApprove == null ? 0 : investTokenWithApprove.hashCode();
            int iHashCode2 = Integer.hashCode(this.AEQbTJ);
            Bundle bundle = this.EZpvd;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bundle != null ? bundle.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApproveResult(info=" + this.KWHzl + ", result=" + this.AEQbTJ + ", bundle=" + this.EZpvd + ")";
        }

        public Activity(InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle) {
            this.KWHzl = investTokenWithApprove;
            this.AEQbTJ = i;
            this.EZpvd = bundle;
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class SubscriptionResult implements Parcelable {
        public static final Parcelable.Creator<SubscriptionResult> CREATOR = new Creator();
        public final int KWHzl;
        public final Bundle OLrzqt;
        public final InvestTradeManager.TransactionResultExtraData copydefault;

        /* JADX INFO: loaded from: classes18.dex */
        public static final class Creator implements Parcelable.Creator<SubscriptionResult> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubscriptionResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new SubscriptionResult(parcel.readInt(), parcel.readBundle(SubscriptionResult.class.getClassLoader()), InvestTradeManager.TransactionResultExtraData.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SubscriptionResult[] newArray(int i) {
                return new SubscriptionResult[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SubscriptionResult copy$default(SubscriptionResult subscriptionResult, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = subscriptionResult.KWHzl;
            }
            if ((i2 & 2) != 0) {
                bundle = subscriptionResult.OLrzqt;
            }
            if ((i2 & 4) != 0) {
                transactionResultExtraData = subscriptionResult.copydefault;
            }
            return subscriptionResult.OLrzqt(i, bundle, transactionResultExtraData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InvestTradeManager.TransactionResultExtraData KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Bundle OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SubscriptionResult OLrzqt(int i, Bundle bundle, @NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
            Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
            return new SubscriptionResult(i, bundle, transactionResultExtraData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int copydefault() {
            return this.KWHzl;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubscriptionResult)) {
                return false;
            }
            SubscriptionResult subscriptionResult = (SubscriptionResult) obj;
            return this.KWHzl == subscriptionResult.KWHzl && Intrinsics.EZpvd(this.OLrzqt, subscriptionResult.OLrzqt) && Intrinsics.EZpvd(this.copydefault, subscriptionResult.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.KWHzl);
            Bundle bundle = this.OLrzqt;
            return (((iHashCode * 31) + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SubscriptionResult(result=" + this.KWHzl + ", bundle=" + this.OLrzqt + ", extraData=" + this.copydefault + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.KWHzl);
            parcel.writeBundle(this.OLrzqt);
            this.copydefault.writeToParcel(parcel, i);
        }

        public SubscriptionResult(int i, Bundle bundle, @NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
            Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
            this.KWHzl = i;
            this.OLrzqt = bundle;
            this.copydefault = transactionResultExtraData;
        }
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    private final String DarRvM() {
        String str = (String) this.fZBcTu.get("walletid");
        return str == null ? "" : str;
    }

    private final void valueOf(String str) {
        this.fZBcTu.set("walletid", str);
    }

    private final String OqFWZa() {
        String str = (String) this.fZBcTu.get("wallet_address");
        return str == null ? "" : str;
    }

    public final void AYXKKw(String str) {
        this.fZBcTu.set("wallet_address", str);
    }

    private final long DXXBbs() {
        Long l = (Long) this.fZBcTu.get("investmentId");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    private final void AEQbTJ(long j) {
        this.fZBcTu.set("investmentId", Long.valueOf(j));
    }

    public final int wlaJM() {
        Integer num = (Integer) this.fZBcTu.get("investType");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void djBIcL(int i) {
        this.fZBcTu.set("investType", Integer.valueOf(i));
    }

    public final int AubY() {
        Integer num = (Integer) this.fZBcTu.get("investmentCategory");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void valueOf(int i) {
        this.fZBcTu.set("investmentCategory", Integer.valueOf(i));
    }

    public final String QKVWgx() {
        return (String) this.fZBcTu.get("poolId");
    }

    public final void OLrzqt(String str) {
        this.fZBcTu.set("poolId", str);
    }

    public final long RJOkX() {
        Long l = (Long) this.fZBcTu.get("relatedInvestmentId");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void copydefault(long j) {
        this.fZBcTu.set("relatedInvestmentId", Long.valueOf(j));
    }

    public final InvestSubscriptionInfo zLjUOn() {
        InvestSubscriptionInfo investSubscriptionInfo = (InvestSubscriptionInfo) this.fZBcTu.get("subs_info");
        return investSubscriptionInfo == null ? new InvestSubscriptionInfo(0L, (List) null, (InvestType) null, (List) null, 0L, (String) null, (Long) null, false, (String) null, (String) null, (String) null, (String) null, (InvestTokenWithAmount) null, (String) null, 0L, false, (List) null, (TransactionMethod) null, false, false, (String) null, (PromptInformation) null, (Integer) null, false, (String) null, (Integer) null, (List) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (CollateralRatioInfo) null, (BTCMode) null, false, (PointsInfo) null, (String) null, (String) null, -1, 255, (DefaultConstructorMarker) null) : investSubscriptionInfo;
    }

    public final void OLrzqt(InvestSubscriptionInfo investSubscriptionInfo) {
        this.fZBcTu.set("subs_info", investSubscriptionInfo);
    }

    public final iXH getFieldNames() {
        iXH ixh = this.getCTAButtonUseCase;
        if (ixh != null) {
            return ixh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final iXN QbewEr() {
        iXN ixn = this.settleTransactionUseCase;
        if (ixn != null) {
            return ixn;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InvestTradeManager.TransactionResultExtraData djSkpj() {
        return QbewEr().copydefault();
    }

    public final TransactionConfig RcXXUw() {
        return (TransactionConfig) this.fZBcTu.get("key.trx_config");
    }

    public final String fFgQHt() {
        String string;
        Bundle bundle = this.AYXKKw;
        return (bundle == null || (string = bundle.getString("tx_hash")) == null) ? "" : string;
    }

    public final void EZpvd(@NotNull String str, @NotNull String str2, long j, int i, int i2, boolean z, @NotNull InvestSubscriptionInfo investSubscriptionInfo, InvestInputData investInputData, long j2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(investSubscriptionInfo, "");
        valueOf(str);
        AYXKKw(str2);
        AEQbTJ(j);
        djBIcL(i);
        valueOf(i2);
        copydefault(j2);
        OLrzqt(investSubscriptionInfo);
        OLrzqt(str3);
        if (z) {
            if (zLjUOn().getInvestWithTokenList().size() > 1) {
                this.DTwDnp = zLjUOn().getInvestWithTokenList().get(0);
                this.dNCPSb = zLjUOn().getInvestWithTokenList().get(1);
            }
        } else if (C33129mqd.KWHzl((Collection) zLjUOn().getInvestWithTokenList())) {
            this.giSNqX = zLjUOn().getInvestWithTokenList().get(0);
        }
        this.zsXlph.setValue(Boolean.valueOf(z));
        this.getFieldNames = investInputData;
        if (gGvvIC() && investInputData != null && C33129mqd.OLrzqt((CharSequence) investInputData.getTokenAddress()) && C33129mqd.AEQbTJ(investInputData.getAmount(), 0)) {
            int i3 = 0;
            for (Object obj : zLjUOn().getInvestWithTokenList()) {
                if (i3 < 0) {
                    yDY.AYXKKw();
                }
                if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) obj).getTokenAddress(), investInputData.getTokenAddress(), true)) {
                    this.AubY = i3 == 0;
                }
                i3++;
            }
        }
        this.fIwbmz.setValue(Boolean.TRUE);
    }

    public final void isConnected(@NotNull InvestTokenWithAmount investTokenWithAmount) {
        Object next;
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        if (investTokenWithAmount.getTokenAddress().length() <= 0 || Intrinsics.EZpvd((Object) investTokenWithAmount.getTokenAddress(), (Object) this.giSNqX.getTokenAddress())) {
            return;
        }
        this.giSNqX = investTokenWithAmount;
        gEmmrt(4);
        this.sSMYrx.setValue(new C23948iPg(true, "", true, false, false, 24, null));
        Iterator<T> it = zLjUOn().getSwapToTokenList().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next).getTokenAddress(), investTokenWithAmount.getTokenAddress(), true)) {
                    break;
                }
            }
        }
        if (((InvestTokenWithAmount) next) == null) {
            this.dvKsVJ.setValue(Boolean.TRUE);
        }
    }

    public final void dvKsVJ() {
        gEmmrt(4);
        this.fIwbmz.setValue(Boolean.FALSE);
        fZBcTu();
    }

    public final void fZBcTu() {
        Object next;
        InvestInputData investInputData = this.getFieldNames;
        if (investInputData != null) {
            String tokenAddress = investInputData != null ? investInputData.getTokenAddress() : null;
            if (tokenAddress == null || tokenAddress.length() == 0) {
                return;
            }
            InvestInputData investInputData2 = this.getFieldNames;
            if (C33129mqd.valueOf(investInputData2 != null ? investInputData2.getAmount() : null, 0)) {
                return;
            }
            Iterator<T> it = zLjUOn().getInvestWithTokenList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String tokenAddress2 = ((InvestTokenWithAmount) next).getTokenAddress();
                InvestInputData investInputData3 = this.getFieldNames;
                Intrinsics.copydefault(investInputData3);
                if (C59449zhJ.gEmmrt(tokenAddress2, investInputData3.getTokenAddress(), true)) {
                    break;
                }
            }
            InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) next;
            if (investTokenWithAmount != null) {
                this.getNewProxyInstance = true;
                this.AuCTelauCTel = false;
                this.fJNWhG.setValue(Boolean.TRUE);
                MutableLiveData<C23948iPg> mutableLiveData = this.sSMYrx;
                InvestInputData investInputData4 = this.getFieldNames;
                Intrinsics.copydefault(investInputData4);
                String amount = investInputData4.getAmount();
                Intrinsics.copydefault((Object) amount);
                mutableLiveData.setValue(new C23948iPg(false, amount, false, true, false, 20, null));
                Integer numOcIXYQ = OcIXYQ();
                int iAhwBna = C33129mqd.copydefault((Object) investTokenWithAmount.getTokenPrecision(), (Object) 10) ? 10 : C33129mqd.AhwBna(investTokenWithAmount.getTokenPrecision());
                InvestInputData investInputData5 = this.getFieldNames;
                Intrinsics.copydefault(investInputData5);
                String amount2 = investInputData5.getAmount();
                Intrinsics.copydefault((Object) amount2);
                BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(amount2);
                if (numOcIXYQ != null) {
                    iAhwBna = Math.min(numOcIXYQ.intValue(), iAhwBna);
                }
                if (C33129mqd.OLrzqt((Object) pTB.formatUpToMax$default(bigDecimalEZpvd, iAhwBna, null, 2, null), (Object) 0)) {
                    InvestInputData investInputData6 = this.getFieldNames;
                    Intrinsics.copydefault(investInputData6);
                    String amount3 = investInputData6.getAmount();
                    Intrinsics.copydefault((Object) amount3);
                    this.gGvvIC = amount3;
                }
            }
        }
    }

    public static /* synthetic */ void setCoinMessage$default(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, String str, int i, InvestTipInfoVo investTipInfoVo, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            investTipInfoVo = null;
        }
        investSubscriptionNewViewModel.EZpvd(str, i, investTipInfoVo);
    }

    public final void EZpvd(@NotNull String str, int i, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AwvSrB.setValue(new C25479ixW(str, i, investTipInfoVo));
    }

    public final void KWHzl(@NotNull String str) {
        String strAhwBna;
        String strAxsJAYsNCnLh = "";
        Intrinsics.checkNotNullParameter(str, "");
        String strUpdateCurInputAmount$default = updateCurInputAmount$default(this, str, false, 2, null);
        if (!gGvvIC() || this.AuCTelauCTel || this.getNewProxyInstance) {
            MutableLiveData<Boolean> mutableLiveData = this.iwGUEr;
            Boolean bool = Boolean.TRUE;
            mutableLiveData.setValue(bool);
            if (!gGvvIC()) {
                KWHzl();
            }
            if (!AEQbTJ(strUpdateCurInputAmount$default)) {
                gEmmrt(0);
            }
            if (AhwBna() != null) {
                strAhwBna = AhwBna();
                Intrinsics.copydefault((Object) strAhwBna);
            } else {
                strAhwBna = "--";
            }
            String str2 = strAhwBna;
            if (AxsJAYsNCnLh() != null) {
                strAxsJAYsNCnLh = AxsJAYsNCnLh();
                Intrinsics.copydefault((Object) strAxsJAYsNCnLh);
            }
            KWHzl(new C25481ixY(str2, strAxsJAYsNCnLh, false, AEQbTJ(), Intrinsics.EZpvd(AYXKKw(), bool), zLjUOn().isSupportSwap(), zLjUOn().isLp(), fetchVPNInfo(AuCTel()), null, AubY(), null, 1280, null));
        }
    }

    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String strEZpvd = EZpvd(str, true);
        if (this.gGvvIC.length() > 0) {
            this.gGvvIC = "";
        }
        if (!gGvvIC() || this.AuCTelauCTel || this.getNewProxyInstance) {
            this.getNewProxyInstance = false;
            if (AEQbTJ(strEZpvd)) {
                getReceiveInfoAndCheckState$default(this, false, 1, null);
            } else {
                this.iwGUEr.setValue(Boolean.FALSE);
            }
        }
    }

    public static /* synthetic */ String updateCurInputAmount$default(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return investSubscriptionNewViewModel.EZpvd(str, z);
    }

    public final String EZpvd(String str, boolean z) {
        String strAhwBna = str;
        String strSubS$default = "";
        if (!gGvvIC()) {
            if (z) {
                if (fvQaOB()) {
                    if (this.flVtFt) {
                        String strAhwBna2 = AhwBna();
                        strAhwBna = C33129mqd.subS$default(strAhwBna2 == null ? "" : strAhwBna2, values(), Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                    }
                } else if (this.flVtFt && (strAhwBna = AhwBna()) == null) {
                    strAhwBna = "";
                }
                this.finit = strAhwBna;
                if (OcIXYQ() != null && this.flVtFt) {
                    BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(this.finit);
                    Integer numOcIXYQ = OcIXYQ();
                    Intrinsics.copydefault(numOcIXYQ);
                    this.finit = pTB.formatUpToMax$default(bigDecimalEZpvd, Math.min(numOcIXYQ.intValue(), C33129mqd.AhwBna(AuCTel().getTokenPrecision())), null, 2, null);
                }
            } else {
                if (this.flVtFt && this.fvQaOB) {
                    if (fvQaOB()) {
                        String strAhwBna3 = AhwBna();
                        strSubS$default = C33129mqd.subS$default(strAhwBna3 == null ? "" : strAhwBna3, values(), Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                    } else {
                        String strAhwBna4 = AhwBna();
                        if (strAhwBna4 != null) {
                            strSubS$default = strAhwBna4;
                        }
                    }
                    this.finit = strSubS$default;
                    if (OcIXYQ() != null) {
                        BigDecimal bigDecimalEZpvd2 = C33129mqd.EZpvd(this.finit);
                        Integer numOcIXYQ2 = OcIXYQ();
                        Intrinsics.copydefault(numOcIXYQ2);
                        this.finit = pTB.formatUpToMax$default(bigDecimalEZpvd2, Math.min(numOcIXYQ2.intValue(), C33129mqd.AhwBna(AuCTel().getTokenPrecision())), null, 2, null);
                    }
                    this.flVtFt = true;
                } else {
                    this.finit = strAhwBna;
                    this.flVtFt = false;
                }
                this.fvQaOB = false;
            }
            if (this.gGvvIC.length() > 0) {
                this.finit = this.gGvvIC;
                if (OcIXYQ() != null) {
                    BigDecimal bigDecimalEZpvd3 = C33129mqd.EZpvd(this.finit);
                    Integer numOcIXYQ3 = OcIXYQ();
                    Intrinsics.copydefault(numOcIXYQ3);
                    this.finit = pTB.formatUpToMax$default(bigDecimalEZpvd3, Math.min(numOcIXYQ3.intValue(), C33129mqd.AhwBna(AuCTel().getTokenPrecision())), null, 2, null);
                }
            }
            return this.finit;
        }
        if (z) {
            if (this.AubY) {
                if (this.gGvvIC.length() > 0) {
                    strAhwBna = this.gGvvIC;
                } else if (this.QOLQEE && (strAhwBna = AhwBna()) == null) {
                    strAhwBna = "";
                }
                this.OcIXYQ = strAhwBna;
                if (this.QOLQEE && fvQaOB()) {
                    this.OcIXYQ = C33129mqd.subS$default(this.OcIXYQ, values(), Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                }
                if (OcIXYQ() != null && this.gGvvIC.length() > 0 && this.QOLQEE) {
                    BigDecimal bigDecimalEZpvd4 = C33129mqd.EZpvd(this.OcIXYQ);
                    Integer numOcIXYQ4 = OcIXYQ();
                    Intrinsics.copydefault(numOcIXYQ4);
                    this.OcIXYQ = pTB.formatUpToMax$default(bigDecimalEZpvd4, Math.min(numOcIXYQ4.intValue(), C33129mqd.AhwBna(AuCTel().getTokenPrecision())), null, 2, null);
                }
                return this.OcIXYQ;
            }
            if (this.gGvvIC.length() > 0) {
                strAhwBna = this.gGvvIC;
            } else if (this.QVAiDq && (strAhwBna = AhwBna()) == null) {
                strAhwBna = "";
            }
            this.RJOkX = strAhwBna;
            if (this.QVAiDq && fvQaOB()) {
                this.RJOkX = C33129mqd.subS$default(this.RJOkX, values(), Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            }
            if (OcIXYQ() != null && this.gGvvIC.length() > 0 && this.QVAiDq) {
                BigDecimal bigDecimalEZpvd5 = C33129mqd.EZpvd(this.RJOkX);
                Integer numOcIXYQ5 = OcIXYQ();
                Intrinsics.copydefault(numOcIXYQ5);
                this.RJOkX = pTB.formatUpToMax$default(bigDecimalEZpvd5, Math.min(numOcIXYQ5.intValue(), C33129mqd.AhwBna(AuCTel().getTokenPrecision())), null, 2, null);
            }
            return this.RJOkX;
        }
        if (this.AubY) {
            if (this.QOLQEE && this.QKVWgx) {
                if (this.gGvvIC.length() > 0) {
                    strSubS$default = this.gGvvIC;
                } else {
                    String strAhwBna5 = AhwBna();
                    if (strAhwBna5 != null) {
                        strSubS$default = strAhwBna5;
                    }
                }
                this.OcIXYQ = strSubS$default;
                if (fvQaOB()) {
                    this.OcIXYQ = C33129mqd.subS$default(this.OcIXYQ, values(), Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
                }
                if (OcIXYQ() != null && this.gGvvIC.length() > 0) {
                    BigDecimal bigDecimalEZpvd6 = C33129mqd.EZpvd(this.OcIXYQ);
                    Integer numOcIXYQ6 = OcIXYQ();
                    Intrinsics.copydefault(numOcIXYQ6);
                    this.OcIXYQ = pTB.formatUpToMax$default(bigDecimalEZpvd6, Math.min(numOcIXYQ6.intValue(), C33129mqd.AhwBna(AuCTel().getTokenPrecision())), null, 2, null);
                }
                strAhwBna = this.OcIXYQ;
                this.QOLQEE = true;
            } else {
                this.OcIXYQ = strAhwBna;
                this.QOLQEE = false;
            }
            this.QKVWgx = false;
            return strAhwBna;
        }
        if (this.QVAiDq && this.aKErDB) {
            if (this.gGvvIC.length() > 0) {
                strSubS$default = this.gGvvIC;
            } else {
                String strAhwBna6 = AhwBna();
                if (strAhwBna6 != null) {
                    strSubS$default = strAhwBna6;
                }
            }
            this.RJOkX = strSubS$default;
            if (fvQaOB()) {
                this.RJOkX = C33129mqd.subS$default(this.RJOkX, values(), Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
            }
            if (OcIXYQ() != null && this.gGvvIC.length() > 0) {
                BigDecimal bigDecimalEZpvd7 = C33129mqd.EZpvd(this.RJOkX);
                Integer numOcIXYQ7 = OcIXYQ();
                Intrinsics.copydefault(numOcIXYQ7);
                this.RJOkX = pTB.formatUpToMax$default(bigDecimalEZpvd7, Math.min(numOcIXYQ7.intValue(), C33129mqd.AhwBna(AuCTel().getTokenPrecision())), null, 2, null);
            }
            strAhwBna = this.RJOkX;
            this.QVAiDq = true;
        } else {
            this.RJOkX = strAhwBna;
            this.QVAiDq = false;
        }
        this.aKErDB = false;
        return strAhwBna;
    }

    public final String fetchVPNInfo() {
        return gGvvIC() ? this.AubY ? this.OcIXYQ : this.RJOkX : this.finit;
    }

    public final void accept() {
        KWHzl(new C25481ixY(AuCTel().getCoinAmount(), AuCTel().getTokenSymbol(), false, AEQbTJ(), AuCTel().getDepositTips(), zLjUOn().isSupportSwap(), zLjUOn().isLp(), fetchVPNInfo(AuCTel()), null, AubY(), null, 1280, null));
    }

    public final void EZpvd(boolean z) {
        this.AubY = z;
        accept();
    }

    public final void hUfVAv() {
        if (!gGvvIC()) {
            this.flVtFt = true;
            this.fvQaOB = true;
        } else if (this.AubY) {
            this.QOLQEE = true;
            this.QKVWgx = true;
        } else {
            this.QVAiDq = true;
            this.aKErDB = true;
        }
    }

    public final void RlQdEF() {
        String strCopydefault;
        String strCopydefault2;
        if (!gGvvIC()) {
            setCoinMessage$default(this, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DrNnAm), 0, null, 6, null);
            return;
        }
        if (this.AubY) {
            MutableLiveData<C25480ixX> mutableLiveData = this.gHZMYf;
            String tokenSymbol = this.DTwDnp.getTokenSymbol();
            String tokenLogo = this.DTwDnp.getTokenLogo();
            C25480ixX value = this.gHZMYf.getValue();
            String str = (value == null || (strCopydefault2 = value.copydefault()) == null) ? "0" : strCopydefault2;
            C25480ixX value2 = this.gHZMYf.getValue();
            mutableLiveData.setValue(new C25480ixX("0", tokenSymbol, tokenLogo, str, value2 != null ? value2.gEmmrt() : false, true, false, false, false, null, 0, null, false, 8128, null));
            return;
        }
        MutableLiveData<C25480ixX> mutableLiveData2 = this.QfsBiF;
        String tokenSymbol2 = this.dNCPSb.getTokenSymbol();
        String tokenLogo2 = this.dNCPSb.getTokenLogo();
        C25480ixX value3 = this.QfsBiF.getValue();
        String str2 = (value3 == null || (strCopydefault = value3.copydefault()) == null) ? "0" : strCopydefault;
        C25480ixX value4 = this.QfsBiF.getValue();
        mutableLiveData2.setValue(new C25480ixX("0", tokenSymbol2, tokenLogo2, str2, value4 != null ? value4.gEmmrt() : false, true, false, false, false, null, 0, null, false, 8128, null));
    }

    public final boolean gGvvIC() {
        return Intrinsics.EZpvd(this.zsXlph.getValue(), Boolean.TRUE);
    }

    public final Integer OcIXYQ() {
        return zLjUOn().getInputPrecision();
    }

    public final InvestTokenWithAmount AuCTel() {
        return gGvvIC() ? this.AubY ? this.DTwDnp : this.dNCPSb : this.giSNqX;
    }

    public final List<InvestTokenWithAmount> zsXlph() {
        ArrayList arrayList = new ArrayList();
        if (gGvvIC()) {
            arrayList.add(this.DTwDnp);
            arrayList.add(this.dNCPSb);
        } else {
            arrayList.add(this.giSNqX);
        }
        return arrayList;
    }

    public final void KWHzl(C25481ixY c25481ixY) {
        this.AhwBna.setValue(c25481ixY);
    }

    public final String AhwBna() {
        C25481ixY value = this.AhwBna.getValue();
        if (value != null) {
            return value.OLrzqt();
        }
        return null;
    }

    private final String AxsJAYsNCnLh() {
        C25481ixY value = this.AhwBna.getValue();
        if (value != null) {
            return value.KWHzl();
        }
        return null;
    }

    public final Boolean AYXKKw() {
        C25481ixY value = this.AhwBna.getValue();
        if (value != null) {
            return Boolean.valueOf(value.AhwBna());
        }
        return null;
    }

    public final void AEQbTJ(C25482ixZ c25482ixZ) {
        this.AkhnZx.setValue(c25482ixZ);
    }

    public final void copydefault(InvestTokenWithAmount investTokenWithAmount, boolean z, boolean z2) {
        Integer numOcIXYQ = OcIXYQ();
        int iAhwBna = C33129mqd.copydefault((Object) investTokenWithAmount.getTokenPrecision(), (Object) 10) ? 10 : C33129mqd.AhwBna(investTokenWithAmount.getTokenPrecision());
        MutableLiveData<C25536iya> mutableLiveData = this.zLjUOn;
        if (numOcIXYQ != null) {
            iAhwBna = Math.min(numOcIXYQ.intValue(), iAhwBna);
        }
        mutableLiveData.setValue(new C25536iya(investTokenWithAmount, iAhwBna, z, z2, 0, 16, null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestInitialData$default(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = null;
        }
        investSubscriptionNewViewModel.AEQbTJ(z, (Function1<? super Bitmap<Throwable>, Unit>) function1);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.iAc.getSubscriptionInitialData$default(o.iAc, long, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.Integer, java.lang.Integer, int, java.lang.Object):o.ywX */
    public final void AEQbTJ(final boolean z, final Function1<? super Bitmap<Throwable>, Unit> function1) {
        AbstractC58185ywX abstractC58185ywXAEQbTJ = C23539iAc.EZpvd.AEQbTJ(DXXBbs(), DarRvM(), (96 & 4) != 0 ? "" : "", (96 & 8) != 0 ? false : z, (96 & 16) != 0 ? "" : OqFWZa(), (96 & 32) != 0 ? 0 : null, (96 & 64) != 0 ? null : null);
        final Function1 function12 = new Function1() { // from class: o.joX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.EZpvd(this.copydefault, z, function1, (InvestSubscriptionInfo) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.joY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestSubscriptionNewViewModel.EZpvd(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.jph
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.OLrzqt(function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.jpk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestSubscriptionNewViewModel.djBIcL(function13, obj);
            }
        });
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, boolean z, Function1 function1, InvestSubscriptionInfo investSubscriptionInfo) {
        investSubscriptionNewViewModel.OLrzqt(investSubscriptionInfo);
        String strDarRvM = investSubscriptionNewViewModel.DarRvM();
        String strOqFWZa = investSubscriptionNewViewModel.OqFWZa();
        long jDXXBbs = investSubscriptionNewViewModel.DXXBbs();
        int iWlaJM = investSubscriptionNewViewModel.wlaJM();
        int iAubY = investSubscriptionNewViewModel.AubY();
        Intrinsics.copydefault(investSubscriptionInfo);
        investSubscriptionNewViewModel.EZpvd(strDarRvM, strOqFWZa, jDXXBbs, iWlaJM, iAubY, !z, investSubscriptionInfo, null, investSubscriptionNewViewModel.RJOkX(), investSubscriptionNewViewModel.QKVWgx());
        if (function1 != null) {
            function1.invoke(new Bitmap.StateListAnimator(null));
        }
        investSubscriptionNewViewModel.dvKsVJ();
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Function1 function1, Throwable th) {
        if (function1 != null) {
            function1.invoke(new Bitmap.ActionBar(null, th, 1, null));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getReceiveInfoAndCheckState$default(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investSubscriptionNewViewModel.copydefault(z);
    }

    public final void copydefault(boolean z) {
        boolean z2 = !(gGvvIC() || AEQbTJ(this.finit)) || (gGvvIC() && this.AubY && !AEQbTJ(this.OcIXYQ)) || !(!gGvvIC() || this.AubY || AEQbTJ(this.RJOkX));
        final Ref.IntRef intRef = new Ref.IntRef();
        if (z2) {
            intRef.element = 0;
            gEmmrt(0);
            StateListAnimator stateListAnimator = this.UeEOUB;
            if (stateListAnimator != null) {
                stateListAnimator.KWHzl(true, null);
                return;
            }
            return;
        }
        this.djSkpj.getReceiveInfo(DarRvM(), OqFWZa(), AuCTel(), fetchVPNInfo(), DXXBbs(), AubY(), !gGvvIC(), null, new Function1() { // from class: o.jpj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.OLrzqt(this.copydefault, (InvestGasPriceConfig) obj);
            }
        }, new Function2() { // from class: o.jpl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestSubscriptionNewViewModel.AEQbTJ(this.copydefault, intRef, (ResponseState) obj, (kotlin.Pair) obj2);
            }
        });
    }

    public static final String OLrzqt(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, InvestGasPriceConfig investGasPriceConfig) {
        return investSubscriptionNewViewModel.EZpvd(investGasPriceConfig).getFirst();
    }

    public static final Unit AEQbTJ(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, Ref.IntRef intRef, ResponseState responseState, Pair pair) {
        InvestGasPriceConfig investGasPriceConfig;
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo;
        InvestTransactionLossInfo transactionLossInfo;
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2;
        Intrinsics.checkNotNullParameter(responseState, "");
        investSubscriptionNewViewModel.fJNWhG.setValue(Boolean.FALSE);
        if (C59449zhJ.gEmmrt(responseState.getLastTokenAddress(), investSubscriptionNewViewModel.AuCTel().getTokenAddress(), true) && responseState.getLastInputValue().equals(investSubscriptionNewViewModel.fetchVPNInfo())) {
            investSubscriptionNewViewModel.values = pair != null ? (InvestSubscriptionReceiveInfo) pair.getSecond() : null;
            investSubscriptionNewViewModel.AxsJAYaxsJAY.setValue((pair == null || (investSubscriptionReceiveInfo2 = (InvestSubscriptionReceiveInfo) pair.getSecond()) == null) ? null : investSubscriptionReceiveInfo2.getTransactionLossInfo());
            investSubscriptionNewViewModel.iRxXKY.setValue(Boolean.valueOf(C33129mqd.AhwBna((pair == null || (investSubscriptionReceiveInfo = (InvestSubscriptionReceiveInfo) pair.getSecond()) == null || (transactionLossInfo = investSubscriptionReceiveInfo.getTransactionLossInfo()) == null) ? null : Integer.valueOf(transactionLossInfo.getNumDays())) > 0));
            if (pair != null && (investGasPriceConfig = (InvestGasPriceConfig) pair.getFirst()) != null) {
                investGasPriceConfig.setEstimateGasFee(((InvestSubscriptionReceiveInfo) pair.getSecond()).getEstimateGasFee());
            }
            investSubscriptionNewViewModel.OLrzqt().setValue(pair != null ? (InvestGasPriceConfig) pair.getFirst() : null);
            int i = TaskDescription.OLrzqt[responseState.getErrorType().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    investSubscriptionNewViewModel.RcXXUw.setValue(responseState);
                    intRef.element = 1;
                } else {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (responseState.getErrorCode() == 10002) {
                        intRef.element = 5;
                    } else {
                        investSubscriptionNewViewModel.RcXXUw.setValue(responseState);
                        intRef.element = 1;
                    }
                }
            } else if (pair != null) {
                intRef.element = 2;
            } else {
                investSubscriptionNewViewModel.RcXXUw.setValue(responseState);
                intRef.element = 1;
            }
            investSubscriptionNewViewModel.gEmmrt(intRef.element);
        }
        StateListAnimator stateListAnimator = investSubscriptionNewViewModel.UeEOUB;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl(false, responseState);
        }
        return Unit.INSTANCE;
    }

    public final boolean EZpvd() {
        if (!gGvvIC() && C33129mqd.AEQbTJ(this.finit, this.giSNqX.getCoinAmount())) {
            this.DbNXlk.setValue(new Triple<>(0, null, 3));
            this.hDKMBd.setValue(Boolean.FALSE);
        } else {
            if (!gGvvIC()) {
                return false;
            }
            if (!C33129mqd.AEQbTJ(this.OcIXYQ, this.DTwDnp.getCoinAmount()) && !C33129mqd.AEQbTJ(this.RJOkX, this.dNCPSb.getCoinAmount())) {
                return false;
            }
            this.DbNXlk.setValue(new Triple<>(0, null, 3));
            this.hDKMBd.setValue(Boolean.FALSE);
        }
        return true;
    }

    public final boolean AEQbTJ() {
        if (!C33129mqd.AEQbTJ(fetchVPNInfo(), AuCTel().getCoinAmount())) {
            return false;
        }
        this.hDKMBd.setValue(Boolean.FALSE);
        return true;
    }

    public static final Unit AEQbTJ(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, C9917bed c9917bed) {
        Intrinsics.checkNotNullParameter(c9917bed, "");
        if (investSubscriptionNewViewModel.AEQbTJ(investSubscriptionNewViewModel.giSNqX, c9917bed)) {
            InvestTokenWithAmount investTokenWithAmount = investSubscriptionNewViewModel.giSNqX;
            String strKWHzl = c9917bed.KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "0";
            }
            investTokenWithAmount.setCoinAmount(strKWHzl);
            InvestTokenWithAmount investTokenWithAmount2 = investSubscriptionNewViewModel.giSNqX;
            String strAEQbTJ = c9917bed.AEQbTJ();
            investTokenWithAmount2.setCurrencyAmount(strAEQbTJ != null ? strAEQbTJ : "0");
            investSubscriptionNewViewModel.accept();
            investSubscriptionNewViewModel.EZpvd();
            getReceiveInfoAndCheckState$default(investSubscriptionNewViewModel, false, 1, null);
        } else if (investSubscriptionNewViewModel.AEQbTJ(investSubscriptionNewViewModel.DTwDnp, c9917bed)) {
            InvestTokenWithAmount investTokenWithAmount3 = investSubscriptionNewViewModel.DTwDnp;
            String strKWHzl2 = c9917bed.KWHzl();
            if (strKWHzl2 == null) {
                strKWHzl2 = "0";
            }
            investTokenWithAmount3.setCoinAmount(strKWHzl2);
            InvestTokenWithAmount investTokenWithAmount4 = investSubscriptionNewViewModel.DTwDnp;
            String strAEQbTJ2 = c9917bed.AEQbTJ();
            investTokenWithAmount4.setCurrencyAmount(strAEQbTJ2 != null ? strAEQbTJ2 : "0");
            investSubscriptionNewViewModel.accept();
            investSubscriptionNewViewModel.EZpvd();
            getReceiveInfoAndCheckState$default(investSubscriptionNewViewModel, false, 1, null);
        } else if (investSubscriptionNewViewModel.AEQbTJ(investSubscriptionNewViewModel.dNCPSb, c9917bed)) {
            InvestTokenWithAmount investTokenWithAmount5 = investSubscriptionNewViewModel.dNCPSb;
            String strKWHzl3 = c9917bed.KWHzl();
            if (strKWHzl3 == null) {
                strKWHzl3 = "0";
            }
            investTokenWithAmount5.setCoinAmount(strKWHzl3);
            InvestTokenWithAmount investTokenWithAmount6 = investSubscriptionNewViewModel.dNCPSb;
            String strAEQbTJ3 = c9917bed.AEQbTJ();
            investTokenWithAmount6.setCurrencyAmount(strAEQbTJ3 != null ? strAEQbTJ3 : "0");
            investSubscriptionNewViewModel.accept();
            investSubscriptionNewViewModel.EZpvd();
            getReceiveInfoAndCheckState$default(investSubscriptionNewViewModel, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public final boolean AEQbTJ(InvestTokenWithAmount investTokenWithAmount, C9917bed c9917bed) {
        long chainId = investTokenWithAmount.getChainId();
        Long lEZpvd = c9917bed.EZpvd();
        if (lEZpvd == null || chainId != lEZpvd.longValue()) {
            return false;
        }
        if (!C59449zhJ.gEmmrt(investTokenWithAmount.getTokenAddress(), c9917bed.djBIcL(), true)) {
            if (!investTokenWithAmount.isBaseToken()) {
                return false;
            }
            String strDjBIcL = c9917bed.djBIcL();
            if (strDjBIcL != null && strDjBIcL.length() != 0) {
                return false;
            }
        }
        return !C59449zhJ.equals$default(c9917bed.KWHzl(), investTokenWithAmount.getCoinAmount(), false, 2, null);
    }

    public final void gEmmrt(int i) {
        if (i == 4) {
            C25595izg c25595izg = C25595izg.AEQbTJ;
            c25595izg.AEQbTJ("invest_global").OLrzqt().removeIncrementListener(this.accept);
            c25595izg.AEQbTJ("invest_global").OLrzqt().addIncrementListener(this.accept, this.zuBGHE);
        }
        if (gGvvIC()) {
            OLrzqt(i);
        } else {
            AhwBna(i);
        }
        EZpvd(i);
        copydefault(i);
        AYXKKw(i);
        KWHzl(i);
        AEQbTJ(i);
        iZzfmt();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AhwBna(int i) {
        String currencyAmount;
        if (i == 0) {
            KWHzl();
            AEQbTJ(new C25482ixZ(true, C27492jwH.formatZeroCurrencyDataWithSymbol$default(C27492jwH.OLrzqt, false, 1, null), false, 4, null));
            return;
        }
        if (i == 1) {
            setCoinMessage$default(this, "", 0, null, 6, null);
            AEQbTJ(new C25482ixZ(false, "--", true));
            return;
        }
        if (i != 2) {
            if (i != 4) {
                if (i != 5) {
                    return;
                }
                setCoinMessage$default(this, C33070mpX.AYXKKw(C25493ixk.FragmentManager.frkDMe), 0, null, 6, null);
                AEQbTJ(new C25482ixZ(false, "--", true));
                return;
            }
            copydefault(this.giSNqX, zLjUOn().isSupportSwap(), zLjUOn().isLp());
            KWHzl(new C25481ixY(this.giSNqX.getCoinAmount(), this.giSNqX.getTokenSymbol(), false, false, this.giSNqX.getDepositTips(), zLjUOn().isSupportSwap(), zLjUOn().isLp(), fetchVPNInfo(AuCTel()), null, AubY(), null, 1292, null));
            KWHzl();
            AEQbTJ(new C25482ixZ(true, C27492jwH.formatZeroCurrencyDataWithSymbol$default(C27492jwH.OLrzqt, false, 1, null), false, 4, null));
            this.sSMYrx.setValue(new C23948iPg(true, null, false, false, false, 30, null));
            return;
        }
        setCoinMessage$default(this, "", 0, null, 6, null);
        if (this.values != null) {
            if (fJNWhG() != null) {
                InvestTokenWithAmount investTokenWithAmountFJNWhG = fJNWhG();
                Intrinsics.copydefault(investTokenWithAmountFJNWhG);
                String currencyAmount2 = investTokenWithAmountFJNWhG.getCurrencyAmount();
                if (currencyAmount2 == null || currencyAmount2.length() == 0) {
                    AEQbTJ(new C25482ixZ(false, "--", true));
                } else {
                    C27492jwH c27492jwH = C27492jwH.OLrzqt;
                    InvestTokenWithAmount investTokenWithAmountFJNWhG2 = fJNWhG();
                    if (investTokenWithAmountFJNWhG2 == null || (currencyAmount = investTokenWithAmountFJNWhG2.getCurrencyAmount()) == null) {
                        currencyAmount = "0";
                    }
                    AEQbTJ(new C25482ixZ(false, c27492jwH.OLrzqt(currencyAmount), false, 4, null));
                }
            }
            Intrinsics.copydefault(this.values);
            if ((!r0.getInvestWithTokenList().isEmpty()) && this.giSNqX.getDepositTips() && this.giSNqX.getTransferableBalance().length() > 0) {
                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
                Intrinsics.copydefault(investSubscriptionReceiveInfo);
                if (C33129mqd.AEQbTJ(investSubscriptionReceiveInfo.getInvestWithTokenList().get(0).getCoinAmount(), this.giSNqX.getTransferableBalance())) {
                    this.AxsJAY = true;
                    setCoinMessage$default(this, C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C25493ixk.FragmentManager.RSDDiY, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, this.giSNqX.getTransferableBalance(), 6, 2, false, false, 24, null)), C56390yDp.OLrzqt("token", this.giSNqX.getTokenSymbol()))), 4, null, 4, null);
                    return;
                }
            }
            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = this.values;
            Intrinsics.copydefault(investSubscriptionReceiveInfo2);
            if (investSubscriptionReceiveInfo2.getPromptInformation() != null) {
                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo3 = this.values;
                Intrinsics.copydefault(investSubscriptionReceiveInfo3);
                PromptInformation promptInformation = investSubscriptionReceiveInfo3.getPromptInformation();
                Intrinsics.copydefault(promptInformation);
                if (promptInformation.getExceptionTip() != null) {
                    InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo4 = this.values;
                    Intrinsics.copydefault(investSubscriptionReceiveInfo4);
                    PromptInformation promptInformation2 = investSubscriptionReceiveInfo4.getPromptInformation();
                    Intrinsics.copydefault(promptInformation2);
                    EZpvd("", 6, promptInformation2.getExceptionTip());
                    return;
                }
            }
            if (zLjUOn().getPromptInformation() != null) {
                PromptInformation promptInformation3 = zLjUOn().getPromptInformation();
                Intrinsics.copydefault(promptInformation3);
                if (promptInformation3.getInvestmentInfoTip() != null) {
                    KWHzl();
                }
            }
        }
    }

    public final void OLrzqt(int i) {
        String strKWHzl;
        String strKWHzl2;
        if (i == 0) {
            MutableLiveData<C25480ixX> mutableLiveData = this.gHZMYf;
            String tokenSymbol = this.DTwDnp.getTokenSymbol();
            String tokenLogo = this.DTwDnp.getTokenLogo();
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            mutableLiveData.setValue(new C25480ixX("0", tokenSymbol, tokenLogo, C27492jwH.formatZeroCurrencyDataWithSymbol$default(c27492jwH, false, 1, null), false, false, false, true, false, null, 0, null, false, 8048, null));
            this.QfsBiF.setValue(new C25480ixX("0", this.dNCPSb.getTokenSymbol(), this.dNCPSb.getTokenLogo(), C27492jwH.formatZeroCurrencyDataWithSymbol$default(c27492jwH, false, 1, null), false, false, false, true, false, null, 0, null, false, 8048, null));
            return;
        }
        if (i != 1) {
            if (i == 2) {
                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
                List<InvestTokenWithAmount> investWithTokenList = investSubscriptionReceiveInfo != null ? investSubscriptionReceiveInfo.getInvestWithTokenList() : null;
                if (investWithTokenList != null && C33129mqd.AEQbTJ(Integer.valueOf(investWithTokenList.size()), 1)) {
                    boolean zGEmmrt = C33129mqd.gEmmrt(this.DTwDnp.getCoinAmount(), investWithTokenList.get(0).getCoinAmount());
                    boolean z = this.DTwDnp.isBaseToken() && C33129mqd.copydefault(this.DTwDnp.getCoinAmount(), investWithTokenList.get(0).getCoinAmount()) && C33129mqd.gEmmrt(this.DTwDnp.getCoinAmount(), C33129mqd.addS$default(investWithTokenList.get(0).getCoinAmount(), zLjUOn().getReserveFee(), null, null, null, 14, null));
                    boolean zGEmmrt2 = C33129mqd.gEmmrt(this.dNCPSb.getCoinAmount(), investWithTokenList.get(1).getCoinAmount());
                    boolean z2 = this.dNCPSb.isBaseToken() && C33129mqd.copydefault(this.dNCPSb.getCoinAmount(), investWithTokenList.get(1).getCoinAmount()) && C33129mqd.gEmmrt(this.dNCPSb.getCoinAmount(), C33129mqd.addS$default(investWithTokenList.get(1).getCoinAmount(), zLjUOn().getReserveFee(), null, null, null, 14, null));
                    if (zGEmmrt || z || !this.DTwDnp.getDepositTips() || this.DTwDnp.getTransferableBalance().length() <= 0 || !C33129mqd.AEQbTJ(investWithTokenList.get(0).getCoinAmount(), this.DTwDnp.getTransferableBalance())) {
                        strKWHzl = "";
                    } else {
                        this.AxsJAY = true;
                        strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C25493ixk.FragmentManager.RSDDiY, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, this.DTwDnp.getTransferableBalance(), 6, 2, false, false, 24, null)), C56390yDp.OLrzqt("token", this.DTwDnp.getTokenSymbol())));
                    }
                    if (zGEmmrt2 || z2 || !this.dNCPSb.getDepositTips() || this.dNCPSb.getTransferableBalance().length() <= 0 || !C33129mqd.AEQbTJ(investWithTokenList.get(1).getCoinAmount(), this.dNCPSb.getTransferableBalance())) {
                        strKWHzl2 = "";
                    } else {
                        this.AxsJAY = true;
                        strKWHzl2 = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C25493ixk.FragmentManager.RSDDiY, (Map<String, ? extends Object>) C56424yEw.gEmmrt(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, C27492jwH.limitFmtNoZeroWithKMB$default(C27492jwH.OLrzqt, this.dNCPSb.getTransferableBalance(), 6, 2, false, false, 24, null)), C56390yDp.OLrzqt("token", this.dNCPSb.getTokenSymbol())));
                    }
                    MutableLiveData<C25480ixX> mutableLiveData2 = this.gHZMYf;
                    String coinAmount = investWithTokenList.get(0).getCoinAmount();
                    String tokenSymbol2 = this.DTwDnp.getTokenSymbol();
                    String tokenLogo2 = this.DTwDnp.getTokenLogo();
                    C27492jwH c27492jwH2 = C27492jwH.OLrzqt;
                    mutableLiveData2.setValue(new C25480ixX(coinAmount, tokenSymbol2, tokenLogo2, c27492jwH2.KWHzl(investWithTokenList.get(0).getCurrencyAmount()), zGEmmrt, z, false, false, this.AuCTelauCTel, strKWHzl, 0, null, false, 7360, null));
                    this.QfsBiF.setValue(new C25480ixX(investWithTokenList.get(1).getCoinAmount(), this.dNCPSb.getTokenSymbol(), this.dNCPSb.getTokenLogo(), c27492jwH2.KWHzl(investWithTokenList.get(1).getCurrencyAmount()), zGEmmrt2, z2, false, false, this.AuCTelauCTel, strKWHzl2, 0, null, false, 7360, null));
                    return;
                }
                OLrzqt(1);
                return;
            }
            if (i == 4) {
                this.QbewEr.setValue(new Object());
                Integer numOcIXYQ = OcIXYQ();
                int iAhwBna = C33129mqd.copydefault((Object) this.DTwDnp.getTokenPrecision(), (Object) 10) ? 10 : C33129mqd.AhwBna(this.DTwDnp.getTokenPrecision());
                MutableLiveData<C25480ixX> mutableLiveData3 = this.gHZMYf;
                String tokenSymbol3 = this.DTwDnp.getTokenSymbol();
                String tokenLogo3 = this.DTwDnp.getTokenLogo();
                C27492jwH c27492jwH3 = C27492jwH.OLrzqt;
                String zeroCurrencyDataWithSymbol$default = C27492jwH.formatZeroCurrencyDataWithSymbol$default(c27492jwH3, false, 1, null);
                if (numOcIXYQ != null) {
                    iAhwBna = Math.min(numOcIXYQ.intValue(), iAhwBna);
                }
                mutableLiveData3.setValue(new C25480ixX("0", tokenSymbol3, tokenLogo3, zeroCurrencyDataWithSymbol$default, false, false, false, true, false, null, iAhwBna, null, false, 7024, null));
                int iAhwBna2 = C33129mqd.copydefault((Object) this.dNCPSb.getTokenPrecision(), (Object) 10) ? 10 : C33129mqd.AhwBna(this.dNCPSb.getTokenPrecision());
                MutableLiveData<C25480ixX> mutableLiveData4 = this.QfsBiF;
                String tokenSymbol4 = this.dNCPSb.getTokenSymbol();
                String tokenLogo4 = this.dNCPSb.getTokenLogo();
                String zeroCurrencyDataWithSymbol$default2 = C27492jwH.formatZeroCurrencyDataWithSymbol$default(c27492jwH3, false, 1, null);
                if (numOcIXYQ != null) {
                    iAhwBna2 = Math.min(numOcIXYQ.intValue(), iAhwBna2);
                }
                mutableLiveData4.setValue(new C25480ixX("0", tokenSymbol4, tokenLogo4, zeroCurrencyDataWithSymbol$default2, false, false, false, true, false, null, iAhwBna2, null, false, 7024, null));
                KWHzl(new C25481ixY(AuCTel().getCoinAmount(), AuCTel().getTokenSymbol(), false, AEQbTJ(), AuCTel().getDepositTips(), false, false, fetchVPNInfo(AuCTel()), null, AubY(), null, 1376, null));
                return;
            }
            if (i != 5) {
                return;
            }
        }
        this.gHZMYf.setValue(new C25480ixX("0", this.DTwDnp.getTokenSymbol(), this.DTwDnp.getTokenLogo(), "--", false, false, true, false, false, null, 0, null, false, 8112, null));
        this.QfsBiF.setValue(new C25480ixX("0", this.dNCPSb.getTokenSymbol(), this.dNCPSb.getTokenLogo(), "--", false, false, true, false, false, null, 0, null, false, 8112, null));
    }

    public final void EZpvd(int i) {
        this.iwGUEr.setValue(Boolean.FALSE);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
                    if (investSubscriptionReceiveInfo != null) {
                        MutableLiveData<C25537iyb> mutableLiveData = this.fARcdN;
                        Intrinsics.copydefault(investSubscriptionReceiveInfo);
                        mutableLiveData.setValue(new C25537iyb(false, investSubscriptionReceiveInfo.getGainsTokenList(), false, 4, null));
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
            this.fARcdN.setValue(new C25537iyb(false, zLjUOn().getGainsTokenList(), true));
            return;
        }
        this.fARcdN.setValue(new C25537iyb(true, zLjUOn().getGainsTokenList(), false, 4, null));
    }

    /* JADX DEBUG: Type inference failed for r1v11. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r1v14. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r1v3. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r1v7. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x024b  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(int i) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        boolean z;
        String strEZpvd;
        int i2;
        String tokenSymbol;
        int i3;
        String tokenSymbol2;
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo;
        List<InvestTokenWithAmount> swapToTokenList;
        InvestTipsBean investTipsBean;
        InvestTokenWithAmount investTokenWithAmount;
        String tokenSymbol3;
        InvestTokenWithAmount receiveTokenInfo;
        String tokenSymbol4;
        int i4;
        String tokenSymbol5;
        int i5;
        String tokenSymbol6;
        if (i != 0) {
            if (i != 1) {
                int i6 = 4;
                if (i == 2) {
                    InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = this.values;
                    if (investSubscriptionReceiveInfo2 != null) {
                        Intrinsics.copydefault(investSubscriptionReceiveInfo2);
                        Iterator it = investSubscriptionReceiveInfo2.getSwapToTokenList().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next3 = null;
                                break;
                            } else {
                                next3 = it.next();
                                if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next3).getTokenAddress(), AuCTel().getTokenAddress(), true)) {
                                    break;
                                }
                            }
                        }
                        InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) next3;
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo3 = this.values;
                        Intrinsics.copydefault(investSubscriptionReceiveInfo3);
                        Iterator it2 = investSubscriptionReceiveInfo3.getInvestWithTokenList().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next4 = null;
                                break;
                            } else {
                                next4 = it2.next();
                                if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next4).getTokenAddress(), AuCTel().getTokenAddress(), true)) {
                                    break;
                                }
                            }
                        }
                        InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) next4;
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo4 = this.values;
                        Intrinsics.copydefault(investSubscriptionReceiveInfo4);
                        String valueDeviationPercentage = investSubscriptionReceiveInfo4.getValueDeviationPercentage();
                        C27577jxn c27577jxn = C27577jxn.copydefault;
                        int iWlaJM = wlaJM();
                        int i7 = 0;
                        boolean z2 = investTokenWithAmount2 != null;
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo5 = this.values;
                        Intrinsics.copydefault(investSubscriptionReceiveInfo5);
                        boolean zAEQbTJ = c27577jxn.AEQbTJ(iWlaJM, z2, investSubscriptionReceiveInfo5.getSwapToTokenList().size());
                        String str = "";
                        if (zAEQbTJ) {
                            if (valueDeviationPercentage.length() > 0) {
                                if (investTokenWithAmount3 == null || (tokenSymbol5 = investTokenWithAmount3.getTokenSymbol()) == null) {
                                    tokenSymbol5 = "";
                                }
                                i4 = 1;
                            } else {
                                i4 = 0;
                                tokenSymbol5 = "";
                            }
                            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo6 = this.values;
                            Intrinsics.copydefault(investSubscriptionReceiveInfo6);
                            if (C33129mqd.OLrzqt((Object) investSubscriptionReceiveInfo6.getSwapToTokenList().get(0).getCurrencyAmount(), (Object) 0)) {
                                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo7 = this.values;
                                Intrinsics.copydefault(investSubscriptionReceiveInfo7);
                                strEZpvd = investSubscriptionReceiveInfo7.getSwapToTokenList().get(0).getTokenSymbol();
                                i5 = 3;
                                tokenSymbol6 = "";
                            } else {
                                i5 = i4;
                                tokenSymbol6 = tokenSymbol5;
                                strEZpvd = "";
                            }
                            if (investTokenWithAmount3 == null || !C33129mqd.OLrzqt((Object) investTokenWithAmount3.getCurrencyAmount(), (Object) 0)) {
                                i6 = i5;
                            } else if (i5 == 3) {
                                tokenSymbol6 = investTokenWithAmount3.getTokenSymbol();
                                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo8 = this.values;
                                Intrinsics.copydefault(investSubscriptionReceiveInfo8);
                                strEZpvd = investSubscriptionReceiveInfo8.getSwapToTokenList().get(0).getTokenSymbol();
                            } else {
                                tokenSymbol6 = investTokenWithAmount3.getTokenSymbol();
                                i6 = 2;
                                strEZpvd = "";
                            }
                            this.iZzfmt = i6 != 0 ? new InvestTipsBean(i6, valueDeviationPercentage, tokenSymbol6, strEZpvd) : null;
                        } else {
                            int iWlaJM2 = wlaJM();
                            boolean zGGvvIC = gGvvIC();
                            boolean z3 = investTokenWithAmount2 != null;
                            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo9 = this.values;
                            Intrinsics.copydefault(investSubscriptionReceiveInfo9);
                            if (c27577jxn.AEQbTJ(iWlaJM2, !zGGvvIC, z3, investSubscriptionReceiveInfo9.getSwapToTokenList().size())) {
                                if (valueDeviationPercentage.length() > 0) {
                                    if (investTokenWithAmount3 == null || (tokenSymbol = investTokenWithAmount3.getTokenSymbol()) == null) {
                                        tokenSymbol = "";
                                    }
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                    tokenSymbol = "";
                                }
                                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo10 = this.values;
                                Intrinsics.copydefault(investSubscriptionReceiveInfo10);
                                Pair<Boolean, List<InvestTokenWithAmount>> pairEZpvd = c27577jxn.EZpvd(investSubscriptionReceiveInfo10.getSwapToTokenList());
                                if (pairEZpvd.getFirst().booleanValue()) {
                                    strEZpvd = CollectionsKt___CollectionsKt.joinToString$default(pairEZpvd.getSecond(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.jpn
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return InvestSubscriptionNewViewModel.valueOf((InvestTokenWithAmount) obj);
                                        }
                                    }, 30, null);
                                    i3 = 3;
                                    tokenSymbol2 = "";
                                } else {
                                    i3 = i2;
                                    tokenSymbol2 = tokenSymbol;
                                    strEZpvd = "";
                                }
                                if (investTokenWithAmount3 == null || !C33129mqd.OLrzqt((Object) investTokenWithAmount3.getCurrencyAmount(), (Object) 0)) {
                                    i6 = i3;
                                } else if (i3 == 3) {
                                    tokenSymbol2 = investTokenWithAmount3.getTokenSymbol();
                                    strEZpvd = C27581jxr.EZpvd(pairEZpvd.getSecond(), C56402yEa.EZpvd(investTokenWithAmount3));
                                } else {
                                    tokenSymbol2 = investTokenWithAmount3.getTokenSymbol();
                                    i6 = 2;
                                    strEZpvd = "";
                                }
                                this.iZzfmt = i6 != 0 ? new InvestTipsBean(i6, valueDeviationPercentage, tokenSymbol2, strEZpvd) : null;
                            } else {
                                z = false;
                                strEZpvd = "";
                                investSubscriptionReceiveInfo = this.values;
                                Intrinsics.copydefault(investSubscriptionReceiveInfo);
                                if ((true ^ investSubscriptionReceiveInfo.getSafeMoonTokenList().isEmpty()) && i7 == 0) {
                                    InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo11 = this.values;
                                    Intrinsics.copydefault(investSubscriptionReceiveInfo11);
                                    this.iZzfmt = new InvestTipsBean(5, valueDeviationPercentage, CollectionsKt___CollectionsKt.joinToString$default(investSubscriptionReceiveInfo11.getSafeMoonTokenList(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.jps
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return InvestSubscriptionNewViewModel.djBIcL((InvestTokenWithAmount) obj);
                                        }
                                    }, 30, null), strEZpvd);
                                }
                                MutableLiveData<InvestSubscriptionReceiveInfoUIBean> mutableLiveDataAkhnZx = AkhnZx();
                                String platformLogo = zLjUOn().getPlatformLogo();
                                String platformName = zLjUOn().getPlatformName();
                                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo12 = this.values;
                                List<InvestTokenWithAmount> investWithTokenList = investSubscriptionReceiveInfo12 == null ? investSubscriptionReceiveInfo12.getInvestWithTokenList() : null;
                                if (z) {
                                    swapToTokenList = null;
                                } else {
                                    InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo13 = this.values;
                                    Intrinsics.copydefault(investSubscriptionReceiveInfo13);
                                    swapToTokenList = investSubscriptionReceiveInfo13.getSwapToTokenList();
                                }
                                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo14 = this.values;
                                Intrinsics.copydefault(investSubscriptionReceiveInfo14);
                                InvestTokenWithAmount receiveTokenInfo2 = investSubscriptionReceiveInfo14.getReceiveTokenInfo();
                                investTipsBean = this.iZzfmt;
                                if (investTipsBean == null) {
                                    investTipsBean = new InvestTipsBean(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                                }
                                InvestTipsBean investTipsBean2 = investTipsBean;
                                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo15 = this.values;
                                Intrinsics.copydefault(investSubscriptionReceiveInfo15);
                                String exchangeRate = investSubscriptionReceiveInfo15.getExchangeRate();
                                investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(zLjUOn().getSwapToTokenList());
                                if (investTokenWithAmount != null || (tokenSymbol3 = investTokenWithAmount.getTokenSymbol()) == null) {
                                    tokenSymbol3 = "";
                                }
                                receiveTokenInfo = zLjUOn().getReceiveTokenInfo();
                                if (receiveTokenInfo != null && (tokenSymbol4 = receiveTokenInfo.getTokenSymbol()) != null) {
                                    str = tokenSymbol4;
                                }
                                InvestExchangeRateBean investExchangeRateBean = new InvestExchangeRateBean(exchangeRate, tokenSymbol3, str);
                                int iAubY = AubY();
                                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo16 = this.values;
                                String maturityTime = investSubscriptionReceiveInfo16 == null ? investSubscriptionReceiveInfo16.getMaturityTime() : null;
                                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo17 = this.values;
                                mutableLiveDataAkhnZx.setValue(new InvestSubscriptionReceiveInfoUIBean(false, platformLogo, platformName, (List) investWithTokenList, (List) swapToTokenList, receiveTokenInfo2, false, investTipsBean2, investExchangeRateBean, (String) (investSubscriptionReceiveInfo17 != null ? investSubscriptionReceiveInfo17.getFixedApy() : null), maturityTime, Integer.valueOf(iAubY), 64, (DefaultConstructorMarker) null));
                                return;
                            }
                        }
                        i7 = i6;
                        z = true;
                        investSubscriptionReceiveInfo = this.values;
                        Intrinsics.copydefault(investSubscriptionReceiveInfo);
                        if (true ^ investSubscriptionReceiveInfo.getSafeMoonTokenList().isEmpty()) {
                            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo112 = this.values;
                            Intrinsics.copydefault(investSubscriptionReceiveInfo112);
                            this.iZzfmt = new InvestTipsBean(5, valueDeviationPercentage, CollectionsKt___CollectionsKt.joinToString$default(investSubscriptionReceiveInfo112.getSafeMoonTokenList(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.jps
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return InvestSubscriptionNewViewModel.djBIcL((InvestTokenWithAmount) obj);
                                }
                            }, 30, null), strEZpvd);
                        }
                        MutableLiveData<InvestSubscriptionReceiveInfoUIBean> mutableLiveDataAkhnZx2 = AkhnZx();
                        String platformLogo2 = zLjUOn().getPlatformLogo();
                        String platformName2 = zLjUOn().getPlatformName();
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo122 = this.values;
                        if (investSubscriptionReceiveInfo122 == null) {
                        }
                        if (z) {
                        }
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo142 = this.values;
                        Intrinsics.copydefault(investSubscriptionReceiveInfo142);
                        InvestTokenWithAmount receiveTokenInfo22 = investSubscriptionReceiveInfo142.getReceiveTokenInfo();
                        investTipsBean = this.iZzfmt;
                        if (investTipsBean == null) {
                        }
                        InvestTipsBean investTipsBean22 = investTipsBean;
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo152 = this.values;
                        Intrinsics.copydefault(investSubscriptionReceiveInfo152);
                        String exchangeRate2 = investSubscriptionReceiveInfo152.getExchangeRate();
                        investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(zLjUOn().getSwapToTokenList());
                        if (investTokenWithAmount != null) {
                            tokenSymbol3 = "";
                        }
                        receiveTokenInfo = zLjUOn().getReceiveTokenInfo();
                        if (receiveTokenInfo != null) {
                            str = tokenSymbol4;
                        }
                        InvestExchangeRateBean investExchangeRateBean2 = new InvestExchangeRateBean(exchangeRate2, tokenSymbol3, str);
                        int iAubY2 = AubY();
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo162 = this.values;
                        if (investSubscriptionReceiveInfo162 == null) {
                        }
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo172 = this.values;
                        mutableLiveDataAkhnZx2.setValue(new InvestSubscriptionReceiveInfoUIBean(false, platformLogo2, platformName2, (List) investWithTokenList, (List) swapToTokenList, receiveTokenInfo22, false, investTipsBean22, investExchangeRateBean2, (String) (investSubscriptionReceiveInfo172 != null ? investSubscriptionReceiveInfo172.getFixedApy() : null), maturityTime, Integer.valueOf(iAubY2), 64, (DefaultConstructorMarker) null));
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
            this.iZzfmt = null;
            Iterator it3 = zLjUOn().getSwapToTokenList().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                } else {
                    next2 = it3.next();
                    if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next2).getTokenAddress(), AuCTel().getTokenAddress(), true)) {
                        break;
                    }
                }
            }
            InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) next2;
            MutableLiveData<InvestSubscriptionReceiveInfoUIBean> mutableLiveDataAkhnZx3 = AkhnZx();
            String platformLogo3 = zLjUOn().getPlatformLogo();
            String platformName3 = zLjUOn().getPlatformName();
            List<InvestTokenWithAmount> listZsXlph = zsXlph();
            if (investTokenWithAmount4 == null && (true ^ zLjUOn().getSwapToTokenList().isEmpty())) {
                swapToTokenList = zLjUOn().getSwapToTokenList();
            }
            mutableLiveDataAkhnZx3.setValue(new InvestSubscriptionReceiveInfoUIBean(false, platformLogo3, platformName3, (List) listZsXlph, (List) swapToTokenList, zLjUOn().getReceiveTokenInfo(), true, (InvestTipsBean) null, (InvestExchangeRateBean) null, (String) null, (String) null, Integer.valueOf(AubY()), 1920, (DefaultConstructorMarker) null));
            return;
        }
        this.iZzfmt = null;
        Iterator it4 = zLjUOn().getSwapToTokenList().iterator();
        while (true) {
            if (!it4.hasNext()) {
                next = null;
                break;
            } else {
                next = it4.next();
                if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next).getTokenAddress(), AuCTel().getTokenAddress(), true)) {
                    break;
                }
            }
        }
        InvestTokenWithAmount investTokenWithAmount5 = (InvestTokenWithAmount) next;
        MutableLiveData<InvestSubscriptionReceiveInfoUIBean> mutableLiveDataAkhnZx4 = AkhnZx();
        String platformLogo4 = zLjUOn().getPlatformLogo();
        String platformName4 = zLjUOn().getPlatformName();
        List<InvestTokenWithAmount> listZsXlph2 = zsXlph();
        if (investTokenWithAmount5 == null && (true ^ zLjUOn().getSwapToTokenList().isEmpty())) {
            swapToTokenList = zLjUOn().getSwapToTokenList();
        }
        mutableLiveDataAkhnZx4.setValue(new InvestSubscriptionReceiveInfoUIBean(true, platformLogo4, platformName4, (List) listZsXlph2, (List) swapToTokenList, zLjUOn().getReceiveTokenInfo(), false, (InvestTipsBean) null, (InvestExchangeRateBean) null, (String) null, (String) null, Integer.valueOf(AubY()), 1984, (DefaultConstructorMarker) null));
    }

    public static final CharSequence valueOf(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    public static final CharSequence djBIcL(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AYXKKw(int i) {
        int i2;
        boolean z;
        String str;
        InvestGasPriceConfig value;
        InvestSlippageConfig investSlippage;
        int i3;
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo;
        int i4 = 0;
        this.gasjUx = false;
        String strOLrzqt = "";
        if (i != 2 || (value = OLrzqt().getValue()) == null || (investSlippage = value.getInvestSlippage()) == null) {
            i2 = 0;
            z = 0;
            str = "";
        } else {
            String first = EZpvd(OLrzqt().getValue()).getFirst();
            if (investSlippage.getType() == 2) {
                if (C33129mqd.AEQbTJ(investSlippage.getAutomaticValue(), investSlippage.getCustomMax())) {
                    this.gasjUx = true;
                } else if (!C33129mqd.OLrzqt(investSlippage.getAutomaticValue(), investSlippage.getCustomMax())) {
                    if (C33129mqd.AEQbTJ(first, investSlippage.getCustomSafe())) {
                        i4 = 1;
                    }
                    i3 = i4;
                    investSubscriptionReceiveInfo = this.values;
                    if (investSubscriptionReceiveInfo != null) {
                        Intrinsics.copydefault(investSubscriptionReceiveInfo);
                        if ((!investSubscriptionReceiveInfo.getSafeMoonTokenList().isEmpty()) && EZpvd(OLrzqt().getValue()).getSecond().booleanValue()) {
                            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = this.values;
                            Intrinsics.copydefault(investSubscriptionReceiveInfo2);
                            strOLrzqt = C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.RLmrWm), C56424yEw.gEmmrt(C56390yDp.OLrzqt("tokenSymbol", CollectionsKt___CollectionsKt.joinToString$default(investSubscriptionReceiveInfo2.getSafeMoonTokenList(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.jpc
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return InvestSubscriptionNewViewModel.gEmmrt((InvestTokenWithAmount) obj);
                                }
                            }, 30, null)), C56390yDp.OLrzqt("slippageTolerance", C27492jwH.OLrzqt.gEmmrt(first))));
                        }
                    }
                    i2 = i4;
                    str = strOLrzqt;
                    z = i3;
                }
                i4 = 2;
                i3 = 1;
                investSubscriptionReceiveInfo = this.values;
                if (investSubscriptionReceiveInfo != null) {
                }
                i2 = i4;
                str = strOLrzqt;
                z = i3;
            } else {
                if ((C33129mqd.AEQbTJ(first, investSlippage.getAutomaticValue()) && C33129mqd.copydefault(first, investSlippage.getCustomSafe()) && C33129mqd.valueOf(first, investSlippage.getCustomMax())) || (C33129mqd.copydefault(first, investSlippage.getCustomSafe()) && C33129mqd.gEmmrt(first, investSlippage.getAutomaticValue()))) {
                }
                i3 = i4;
                investSubscriptionReceiveInfo = this.values;
                if (investSubscriptionReceiveInfo != null) {
                }
                i2 = i4;
                str = strOLrzqt;
                z = i3;
            }
        }
        this.gEmmrt.setValue(new InvestAdvancePanelUIBean(i, this.values, i2, str, z));
    }

    public static final CharSequence gEmmrt(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(int i) {
        if (i != 0 && i != 1) {
            if (i == 2) {
                if (EZpvd()) {
                    return;
                }
                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
                if (investSubscriptionReceiveInfo != null) {
                    Intrinsics.copydefault(investSubscriptionReceiveInfo);
                    if (investSubscriptionReceiveInfo.isAllowSubscribe()) {
                        if (!this.AxsJAY) {
                            this.hDKMBd.setValue(Boolean.TRUE);
                            return;
                        }
                    }
                }
                this.hDKMBd.setValue(Boolean.FALSE);
                return;
            }
            if (i != 4 && i != 5) {
                return;
            }
        }
        this.hDKMBd.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void KWHzl(int i) {
        List<TransactionStep> transactionStepList;
        String value;
        if (i == 0) {
            this.DbNXlk.setValue(new Triple<>(2, this.values, 0));
        } else if (i == 1) {
            this.DbNXlk.setValue(new Triple<>(1, this.values, 0));
        } else if (i != 2) {
            if (i == 4 || i == 5) {
            }
        } else if (!EZpvd()) {
            if (this.AxsJAY) {
                this.DbNXlk.setValue(new Triple<>(0, this.values, 4));
            } else {
                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
                if ((investSubscriptionReceiveInfo != null && !investSubscriptionReceiveInfo.isAllowSubscribe()) || this.gasjUx) {
                    this.DbNXlk.setValue(new Triple<>(1, this.values, 0));
                } else if (C25544iyi.KWHzl(zLjUOn()) && ((value = this.fFgQHt.getValue()) == null || value.length() == 0)) {
                    this.DbNXlk.setValue(new Triple<>(1, this.values, 0));
                } else {
                    this.DbNXlk.setValue(new Triple<>(0, this.values, 0));
                }
            }
        }
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = this.values;
        if (investSubscriptionReceiveInfo2 == null || (transactionStepList = investSubscriptionReceiveInfo2.getTransactionStepList()) == null) {
            return;
        }
        OLrzqt(transactionStepList);
    }

    public final boolean AEQbTJ(String str) {
        return C33129mqd.AEQbTJ(str, 0);
    }

    @Override // o.InterfaceC27096joj
    public Pair<String, Boolean> djBIcL() {
        return EZpvd(OLrzqt().getValue());
    }

    @Override // o.InterfaceC27096joj
    public void copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.uzCIH.AEQbTJ(str, z);
    }

    @Override // o.InterfaceC27096joj
    public void fARcdN() {
        InvestSlippageConfig investSlippage;
        C27164jpy c27164jpy = this.uzCIH;
        long chainId = zLjUOn().getChainId();
        InvestGasPriceConfig value = OLrzqt().getValue();
        c27164jpy.AEQbTJ(String.valueOf(chainId), (value == null || (investSlippage = value.getInvestSlippage()) == null) ? null : Integer.valueOf(investSlippage.getType()));
    }

    public final Pair<String, Boolean> EZpvd(InvestGasPriceConfig investGasPriceConfig) {
        InvestSlippageConfig investSlippage;
        InvestSlippageConfig investSlippage2;
        InvestSlippageConfig investSlippage3;
        C27164jpy c27164jpy = this.uzCIH;
        long chainId = zLjUOn().getChainId();
        Integer numValueOf = null;
        String automaticValue = (investGasPriceConfig == null || (investSlippage3 = investGasPriceConfig.getInvestSlippage()) == null) ? null : investSlippage3.getAutomaticValue();
        String customMax = (investGasPriceConfig == null || (investSlippage2 = investGasPriceConfig.getInvestSlippage()) == null) ? null : investSlippage2.getCustomMax();
        if (investGasPriceConfig != null && (investSlippage = investGasPriceConfig.getInvestSlippage()) != null) {
            numValueOf = Integer.valueOf(investSlippage.getType());
        }
        return c27164jpy.AEQbTJ(String.valueOf(chainId), automaticValue, customMax, numValueOf);
    }

    public final String QOLQEE() {
        String first = EZpvd(OLrzqt().getValue()).getFirst();
        return first.length() > 0 ? C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, first, false, 2, null) : "--";
    }

    private final String QKudOq() {
        String strKWHzl;
        String strEZpvd = this.uzCIH.EZpvd(String.valueOf(zLjUOn().getChainId()));
        InvestGasPriceConfig value = OLrzqt().getValue();
        return (value == null || (strKWHzl = C27505jwU.KWHzl(value, strEZpvd)) == null) ? "" : strKWHzl;
    }

    private final String DAIeex() {
        String strOLrzqt;
        String strEZpvd = this.uzCIH.EZpvd(String.valueOf(zLjUOn().getChainId()));
        InvestGasPriceConfig value = OLrzqt().getValue();
        return (value == null || (strOLrzqt = C27505jwU.OLrzqt(value, strEZpvd)) == null) ? "" : strOLrzqt;
    }

    public final boolean fvQaOB() {
        return AuCTel().isBaseToken();
    }

    public final String values() {
        return zLjUOn().getReserveFee().length() == 0 ? "0.01" : zLjUOn().getReserveFee();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C33050mpD.OLrzqt(this.AuCTel);
    }

    public final void KWHzl() {
        InvestTipInfoVo investmentInfoTip;
        PromptInformation promptInformation = zLjUOn().getPromptInformation();
        InvestTipInfoVo investTipInfoVoCopy = null;
        if ((promptInformation != null ? promptInformation.getInvestmentInfoTip() : null) != null) {
            PromptInformation promptInformation2 = zLjUOn().getPromptInformation();
            if (promptInformation2 != null && (investmentInfoTip = promptInformation2.getInvestmentInfoTip()) != null) {
                investTipInfoVoCopy = investmentInfoTip.copy((1022 & 1) != 0 ? investmentInfoTip.clickAction : InvestClickActionType.NO_ACTION, (1022 & 2) != 0 ? investmentInfoTip.customRedirectData : null, (1022 & 4) != 0 ? investmentInfoTip.hoverOnData : null, (1022 & 8) != 0 ? investmentInfoTip.popUpData : null, (1022 & 16) != 0 ? investmentInfoTip.redirectData : null, (1022 & 32) != 0 ? investmentInfoTip.tipContent : null, (1022 & 64) != 0 ? investmentInfoTip.type : null, (1022 & 128) != 0 ? investmentInfoTip.disappearAfterInput : false, (1022 & 256) != 0 ? investmentInfoTip.title : null, (1022 & 512) != 0 ? investmentInfoTip.contentType : null);
            }
            EZpvd("", 7, investTipInfoVoCopy);
            return;
        }
        setCoinMessage$default(this, "", 0, null, 6, null);
    }

    public final void gkJEwt() {
        if (Intrinsics.EZpvd(this.fIwbmz.getValue(), Boolean.TRUE)) {
            dvKsVJ();
        } else {
            getReceiveInfoAndCheckState$default(this, false, 1, null);
            iRxXKY();
        }
    }

    public final void iRxXKY() {
        ArrayList arrayList = new ArrayList();
        if (C27577jxn.copydefault.OLrzqt(Integer.valueOf(wlaJM())) || !gGvvIC()) {
            if (this.giSNqX.getTokenAddress().length() > 0) {
                arrayList.add(this.giSNqX.getTokenAddress());
            }
        } else {
            if (this.DTwDnp.getTokenAddress().length() > 0) {
                arrayList.add(this.DTwDnp.getTokenAddress());
            }
            if (this.dNCPSb.getTokenAddress().length() > 0) {
                arrayList.add(this.dNCPSb.getTokenAddress());
            }
        }
        C25595izg.AEQbTJ.AEQbTJ("invest_global").OLrzqt().getBanlanceFromServer(OqFWZa(), zLjUOn().getChainId(), DarRvM(), arrayList);
    }

    public final InvestTokenWithAmount fJNWhG() {
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
        if (investSubscriptionReceiveInfo != null) {
            Intrinsics.copydefault(investSubscriptionReceiveInfo);
            if (!investSubscriptionReceiveInfo.getInvestWithTokenList().isEmpty()) {
                InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = this.values;
                Intrinsics.copydefault(investSubscriptionReceiveInfo2);
                return investSubscriptionReceiveInfo2.getInvestWithTokenList().get(0);
            }
        }
        return null;
    }

    public final void AxsJAYaxsJAY() {
        C25595izg.AEQbTJ.AEQbTJ("invest_global").OLrzqt().removeIncrementListener(this.accept);
    }

    public final void giSNqX() {
        this.djSkpj.dispose();
    }

    public static /* synthetic */ void submitTransaction$default(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, Context context, InvestTokenWithApprove investTokenWithApprove, int i, Object obj) {
        if ((i & 2) != 0) {
            investTokenWithApprove = null;
        }
        investSubscriptionNewViewModel.copydefault(context, investTokenWithApprove);
    }

    public final void copydefault(@NotNull Context context, final InvestTokenWithApprove investTokenWithApprove) {
        Intrinsics.checkNotNullParameter(context, "");
        InvestTradeManager.submitTransaction$default(InvestTradeManager.OLrzqt, context, KWHzl(investTokenWithApprove), new yHO() { // from class: o.jpe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return InvestSubscriptionNewViewModel.OLrzqt(investTokenWithApprove, this, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
            }
        }, new Function1() { // from class: o.jpf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.copydefault(this.EZpvd, (NewCallbackBean) obj);
            }
        }, null, 16, null);
    }

    public static final Unit OLrzqt(InvestTokenWithApprove investTokenWithApprove, InvestSubscriptionNewViewModel investSubscriptionNewViewModel, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        if (investTokenWithApprove != null) {
            Integer approveType = investTokenWithApprove.getApproveType();
            if (approveType != null && approveType.intValue() == 1) {
                getReceiveInfoAndCheckState$default(investSubscriptionNewViewModel, false, 1, null);
            }
            investSubscriptionNewViewModel.valueOf.setValue(new Activity(investTokenWithApprove, i, bundle));
        } else {
            investSubscriptionNewViewModel.hUfVAv.setValue(new SubscriptionResult(i, bundle, transactionResultExtraData));
        }
        return Unit.INSTANCE;
    }

    public static final AbstractC58185ywX copydefault(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        return investSubscriptionNewViewModel.AEQbTJ(newCallbackBean);
    }

    private final AbstractC58185ywX<ResponseData<String>> AEQbTJ(final NewCallbackBean newCallbackBean) {
        AbstractC58185ywX abstractC58185ywXCopydefault = C25471ixO.copydefault(new InterfaceC58187ywZ() { // from class: o.jpd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                InvestSubscriptionNewViewModel.EZpvd(newCallbackBean, this, interfaceC58184ywW);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.jpg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.EZpvd(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<String>> abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.jpi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(NewCallbackBean newCallbackBean, final InvestSubscriptionNewViewModel investSubscriptionNewViewModel, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        if (newCallbackBean.getReserved() != null) {
            ReserveBean reserved = newCallbackBean.getReserved();
            Intrinsics.copydefault(reserved);
            if (reserved.getReservedAmount().length() > 0) {
                ReserveBean reserved2 = newCallbackBean.getReserved();
                Intrinsics.copydefault(reserved2);
                if (reserved2.getPrecision() >= 0) {
                    ReserveBean reserved3 = newCallbackBean.getReserved();
                    Intrinsics.copydefault(reserved3);
                    if (reserved3.isNativeToken()) {
                        ReserveBean reserved4 = newCallbackBean.getReserved();
                        Intrinsics.copydefault(reserved4);
                        if (reserved4.getTokenContractAddress().length() != 0) {
                            ReserveBean reserved5 = newCallbackBean.getReserved();
                            Intrinsics.copydefault(reserved5);
                            if (!reserved5.isNativeToken()) {
                                ReserveBean reserved6 = newCallbackBean.getReserved();
                                Intrinsics.copydefault(reserved6);
                                if (reserved6.getTokenContractAddress().length() > 0) {
                                }
                            }
                            interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
                            interfaceC58184ywW.onComplete();
                        }
                        C27492jwH c27492jwH = C27492jwH.OLrzqt;
                        ReserveBean reserved7 = newCallbackBean.getReserved();
                        Intrinsics.copydefault(reserved7);
                        String reservedAmount = reserved7.getReservedAmount();
                        ReserveBean reserved8 = newCallbackBean.getReserved();
                        Intrinsics.copydefault(reserved8);
                        String strOLrzqt = c27492jwH.OLrzqt(reservedAmount, reserved8.getPrecision());
                        if (investSubscriptionNewViewModel.gGvvIC()) {
                            ReserveBean reserved9 = newCallbackBean.getReserved();
                            Intrinsics.copydefault(reserved9);
                            if (!reserved9.isNativeToken()) {
                                ReserveBean reserved10 = newCallbackBean.getReserved();
                                Intrinsics.copydefault(reserved10);
                                if (!C59449zhJ.gEmmrt(reserved10.getTokenContractAddress(), investSubscriptionNewViewModel.DTwDnp.getTokenAddress(), true)) {
                                    ReserveBean reserved11 = newCallbackBean.getReserved();
                                    Intrinsics.copydefault(reserved11);
                                    if (reserved11.isNativeToken() && investSubscriptionNewViewModel.DTwDnp.isBaseToken()) {
                                        investSubscriptionNewViewModel.getNewProxyInstance = true;
                                        investSubscriptionNewViewModel.ORxRYg.setValue(new C23948iPg(false, strOLrzqt, false, false, false, 28, null));
                                    } else {
                                        ReserveBean reserved12 = newCallbackBean.getReserved();
                                        Intrinsics.copydefault(reserved12);
                                        if (!reserved12.isNativeToken()) {
                                            ReserveBean reserved13 = newCallbackBean.getReserved();
                                            Intrinsics.copydefault(reserved13);
                                            if (!C59449zhJ.gEmmrt(reserved13.getTokenContractAddress(), investSubscriptionNewViewModel.dNCPSb.getTokenAddress(), true)) {
                                                ReserveBean reserved14 = newCallbackBean.getReserved();
                                                Intrinsics.copydefault(reserved14);
                                                if (reserved14.isNativeToken() && investSubscriptionNewViewModel.dNCPSb.isBaseToken()) {
                                                    investSubscriptionNewViewModel.getNewProxyInstance = true;
                                                    investSubscriptionNewViewModel.QUSxYX.setValue(new C23948iPg(false, strOLrzqt, false, false, false, 28, null));
                                                } else {
                                                    interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
                                                    interfaceC58184ywW.onComplete();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            investSubscriptionNewViewModel.sSMYrx.setValue(new C23948iPg(false, strOLrzqt, false, false, false, 28, null));
                        }
                        investSubscriptionNewViewModel.djSkpj.getReceiveInfo(investSubscriptionNewViewModel.DarRvM(), investSubscriptionNewViewModel.OqFWZa(), investSubscriptionNewViewModel.AuCTel(), strOLrzqt, investSubscriptionNewViewModel.DXXBbs(), investSubscriptionNewViewModel.AubY(), !investSubscriptionNewViewModel.gGvvIC(), null, new Function1() { // from class: o.jpr
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return InvestSubscriptionNewViewModel.AEQbTJ(this.OLrzqt, (InvestGasPriceConfig) obj);
                            }
                        }, new Function2() { // from class: o.joU
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return InvestSubscriptionNewViewModel.copydefault(this.copydefault, interfaceC58184ywW, (ResponseState) obj, (kotlin.Pair) obj2);
                            }
                        });
                    }
                } else {
                    interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
                    interfaceC58184ywW.onComplete();
                }
            }
        }
        investSubscriptionNewViewModel.UeEOUB = new ActionBar(interfaceC58184ywW, investSubscriptionNewViewModel);
    }

    public static final String AEQbTJ(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, InvestGasPriceConfig investGasPriceConfig) {
        return investSubscriptionNewViewModel.EZpvd(investGasPriceConfig).getFirst();
    }

    public static final Unit copydefault(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, InterfaceC58184ywW interfaceC58184ywW, ResponseState responseState, Pair pair) {
        Intrinsics.checkNotNullParameter(responseState, "");
        if (responseState.getErrorType() == ResponseStateType.NORMAL) {
            investSubscriptionNewViewModel.values = pair != null ? (InvestSubscriptionReceiveInfo) pair.getSecond() : null;
            interfaceC58184ywW.onNext(ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), 0, null, null, null, null, null, 62, null));
        } else {
            interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements StateListAnimator {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<String>> KWHzl;
        public final /* synthetic */ InvestSubscriptionNewViewModel OLrzqt;

        public ActionBar(InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW, InvestSubscriptionNewViewModel investSubscriptionNewViewModel) {
            this.KWHzl = interfaceC58184ywW;
            this.OLrzqt = investSubscriptionNewViewModel;
        }

        @Override // com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel.StateListAnimator
        public void KWHzl(boolean z, ResponseState responseState) {
            InvestTipInfoVo exceptionTip;
            String strAYXKKw;
            if (!z) {
                String tipContent = null;
                this.OLrzqt.UeEOUB = null;
                InvestAdvancePanelUIBean value = this.OLrzqt.valueOf().getValue();
                if (value != null && value.getState() == 5) {
                    InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW = this.KWHzl;
                    C25479ixW value2 = this.OLrzqt.AxsJAY().getValue();
                    if (value2 == null || (strAYXKKw = value2.KWHzl()) == null) {
                        strAYXKKw = C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV);
                    }
                    interfaceC58184ywW.onError(new Exception(strAYXKKw));
                    this.KWHzl.onComplete();
                    return;
                }
                if ((responseState != null ? responseState.getErrorType() : null) == ResponseStateType.NET_ERRO) {
                    this.KWHzl.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zSsVtY)));
                    this.KWHzl.onComplete();
                    return;
                }
                if ((responseState != null ? responseState.getErrorType() : null) != ResponseStateType.SERVER_ERRRO) {
                    if (this.OLrzqt.values != null) {
                        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.OLrzqt.values;
                        Intrinsics.copydefault(investSubscriptionReceiveInfo);
                        if (!investSubscriptionReceiveInfo.isAllowSubscribe()) {
                            InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW2 = this.KWHzl;
                            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = this.OLrzqt.values;
                            Intrinsics.copydefault(investSubscriptionReceiveInfo2);
                            PromptInformation promptInformation = investSubscriptionReceiveInfo2.getPromptInformation();
                            if (promptInformation != null && (exceptionTip = promptInformation.getExceptionTip()) != null) {
                                tipContent = exceptionTip.getTipContent();
                            }
                            String strAYXKKw2 = C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex);
                            if (tipContent == null || tipContent.length() == 0) {
                                tipContent = strAYXKKw2;
                            }
                            interfaceC58184ywW2.onError(new Exception(tipContent));
                            this.KWHzl.onComplete();
                            return;
                        }
                    }
                    if (!this.OLrzqt.AxsJAY) {
                        if (this.OLrzqt.gasjUx) {
                            this.KWHzl.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.QKudOq)));
                            this.KWHzl.onComplete();
                            return;
                        } else {
                            this.KWHzl.onNext(ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), 0, null, null, null, null, null, 62, null));
                            this.KWHzl.onComplete();
                            return;
                        }
                    }
                    this.KWHzl.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.accept)));
                    this.KWHzl.onComplete();
                    return;
                }
                String errorMsg = responseState.getErrorMsg();
                if (errorMsg == null || errorMsg.length() == 0) {
                    this.KWHzl.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV)));
                } else {
                    this.KWHzl.onError(new Exception(responseState.getErrorMsg()));
                }
                this.KWHzl.onComplete();
                return;
            }
            this.KWHzl.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV)));
            this.KWHzl.onComplete();
        }
    }

    public static final InterfaceC60096zvd AEQbTJ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        final InvestTxModel investTxModelKWHzl = investSubscriptionNewViewModel.KWHzl((InvestTokenWithApprove) null);
        return C25471ixO.copydefault(new InterfaceC58187ywZ() { // from class: o.jpm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                InvestSubscriptionNewViewModel.AEQbTJ(investTxModelKWHzl, interfaceC58184ywW);
            }
        });
    }

    public static final void AEQbTJ(InvestTxModel investTxModel, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        InvestTradeManager.OLrzqt.copydefault(investTxModel, new Function1() { // from class: o.jpb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.OLrzqt(interfaceC58184ywW, (java.lang.String) obj);
            }
        });
    }

    public static final Unit OLrzqt(InterfaceC58184ywW interfaceC58184ywW, String str) {
        if (str == null || str.length() == 0) {
            interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV)));
        } else {
            interfaceC58184ywW.onNext(ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), 0, null, null, null, str, null, 46, null));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ InvestTxModel genInvestTxModel$default(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, InvestTokenWithApprove investTokenWithApprove, int i, Object obj) {
        if ((i & 1) != 0) {
            investTokenWithApprove = null;
        }
        return investSubscriptionNewViewModel.KWHzl(investTokenWithApprove);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTxModel KWHzl(InvestTokenWithApprove investTokenWithApprove) {
        String strAEQbTJ;
        List listAhwBna;
        long j;
        ArrayList arrayList;
        List arrayList2;
        List<InvestTokenWithAmount> investWithTokenList;
        List arrayList3;
        String expectTokenAddress;
        List<ExpectTokenInfo> tokenInfoList;
        Object next;
        List<FromToken> listKWHzl;
        List<InvestTokenWithAmount> listAhwBna2;
        String estimateGasFee;
        String needApproveAmount;
        List<InvestTokenWithAmount> swapToTokenList;
        InvestTokenWithAmount receiveTokenInfo;
        List<InvestTokenWithAmount> investWithTokenList2;
        Integer orderType;
        int value = (investTokenWithApprove == null || (orderType = investTokenWithApprove.getOrderType()) == null) ? (investTokenWithApprove != null ? InvestAction.SubscriptionApprove : InvestAction.Subscription).getValue() : orderType.intValue();
        String strDarRvM = DarRvM();
        String strOqFWZa = OqFWZa();
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(DXXBbs()));
        long chainId = zLjUOn().getChainId();
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
        if (investSubscriptionReceiveInfo == null || (investWithTokenList2 = investSubscriptionReceiveInfo.getInvestWithTokenList()) == null || (strAEQbTJ = C27491jwG.AEQbTJ(investWithTokenList2, new Function1() { // from class: o.jpq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.AhwBna((InvestTokenWithAmount) obj);
            }
        })) == null) {
            strAEQbTJ = "0.0";
        }
        String str = strAEQbTJ;
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = this.values;
        double d = 10.0d;
        if (investSubscriptionReceiveInfo2 != null && (receiveTokenInfo = investSubscriptionReceiveInfo2.getReceiveTokenInfo()) != null) {
            InvestTokenWithAmount investTokenWithAmountCopy = receiveTokenInfo.copy((268435455 & 1) != 0 ? receiveTokenInfo.chainId : 0L, (268435455 & 2) != 0 ? receiveTokenInfo.coinAmount : null, (268435455 & 4) != 0 ? receiveTokenInfo.currencyAmount : null, (268435455 & 8) != 0 ? receiveTokenInfo.depositTips : false, (268435455 & 16) != 0 ? receiveTokenInfo.isBaseToken : false, (268435455 & 32) != 0 ? receiveTokenInfo.network : null, (268435455 & 64) != 0 ? receiveTokenInfo.tokenAddress : null, (268435455 & 128) != 0 ? receiveTokenInfo.tokenLogo : null, (268435455 & 256) != 0 ? receiveTokenInfo.tokenName : null, (268435455 & 512) != 0 ? receiveTokenInfo.tokenSymbol : null, (268435455 & 1024) != 0 ? receiveTokenInfo.tokenPrecision : null, (268435455 & 2048) != 0 ? receiveTokenInfo.browserUrl : null, (268435455 & 4096) != 0 ? receiveTokenInfo.tokenId : null, (268435455 & 8192) != 0 ? receiveTokenInfo.isCanClaim : null, (268435455 & 16384) != 0 ? receiveTokenInfo.buttonType : null, (268435455 & 32768) != 0 ? receiveTokenInfo.expectTokenAddress : null, (268435455 & 65536) != 0 ? receiveTokenInfo.transferableBalance : null, (268435455 & 131072) != 0 ? receiveTokenInfo.dataType : null, (268435455 & 262144) != 0 ? receiveTokenInfo.availableClaimTime : null, (268435455 & 524288) != 0 ? receiveTokenInfo.collectionDeadLine : null, (268435455 & 1048576) != 0 ? receiveTokenInfo.availableClaimType : 0, (268435455 & 2097152) != 0 ? receiveTokenInfo.minInvestAmount : null, (268435455 & 4194304) != 0 ? receiveTokenInfo.originalInvestmentId : null, (268435455 & 8388608) != 0 ? receiveTokenInfo.originalProductType : null, (268435455 & 16777216) != 0 ? receiveTokenInfo.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? receiveTokenInfo.safeMinAmount : null, (268435455 & 67108864) != 0 ? receiveTokenInfo.safeMaxAmount : null, (268435455 & 134217728) != 0 ? receiveTokenInfo.tokenPrice : null);
            investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
            listAhwBna = C56402yEa.EZpvd(investTokenWithAmountCopy);
            if (listAhwBna == null) {
            }
        } else {
            listAhwBna = yDY.AhwBna();
        }
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo3 = this.values;
        if (investSubscriptionReceiveInfo3 == null || (swapToTokenList = investSubscriptionReceiveInfo3.getSwapToTokenList()) == null) {
            j = chainId;
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(swapToTokenList, 10));
            for (InvestTokenWithAmount investTokenWithAmount : swapToTokenList) {
                InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
                investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
                arrayList4.add(investTokenWithAmountCopy2);
                chainId = chainId;
            }
            j = chainId;
            arrayList = arrayList4;
        }
        if (investTokenWithApprove != null) {
            String tokenAddress = investTokenWithApprove.getTokenAddress();
            long chainId2 = investTokenWithApprove.getChainId();
            Integer approveType = investTokenWithApprove.getApproveType();
            arrayList2 = C56402yEa.EZpvd(new InvestTokenWithAmount(chainId2, (approveType == null || approveType.intValue() != 1 || (needApproveAmount = investTokenWithApprove.getNeedApproveAmount()) == null) ? "" : needApproveAmount, (String) null, false, false, (String) null, tokenAddress, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435388, (DefaultConstructorMarker) null));
        } else {
            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo4 = this.values;
            if (investSubscriptionReceiveInfo4 == null || (investWithTokenList = investSubscriptionReceiveInfo4.getInvestWithTokenList()) == null) {
                arrayList2 = new ArrayList();
            } else {
                arrayList3 = new ArrayList(C56403yEb.AYXKKw(investWithTokenList, 10));
                Iterator it = investWithTokenList.iterator();
                while (it.hasNext()) {
                    InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) it.next();
                    InvestTokenWithAmount investTokenWithAmountCopy3 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                    Iterator it2 = it;
                    investTokenWithAmountCopy3.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy3.getCoinAmount(), Double.valueOf(Math.pow(d, C33129mqd.AEQbTJ(investTokenWithAmountCopy3.getTokenPrecision()))), null, null, null, 14, null));
                    InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo5 = this.values;
                    if (investSubscriptionReceiveInfo5 == null || (tokenInfoList = investSubscriptionReceiveInfo5.getTokenInfoList()) == null) {
                        expectTokenAddress = null;
                    } else {
                        Iterator<T> it3 = tokenInfoList.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it3.next();
                            if (C59449zhJ.gEmmrt(((ExpectTokenInfo) next).getTokenAddress(), investTokenWithAmountCopy3.getTokenAddress(), true)) {
                                break;
                            }
                        }
                        ExpectTokenInfo expectTokenInfo = (ExpectTokenInfo) next;
                        if (expectTokenInfo != null) {
                            expectTokenAddress = expectTokenInfo.getExpectTokenAddress();
                        }
                    }
                    investTokenWithAmountCopy3.setExpectTokenAddress(expectTokenAddress);
                    arrayList3.add(investTokenWithAmountCopy3);
                    it = it2;
                    d = 10.0d;
                }
                String strEZpvd = this.uzCIH.EZpvd(String.valueOf(zLjUOn().getChainId()));
                String strDAIeex = DAIeex();
                InvestGasPriceConfig value2 = OLrzqt().getValue();
                String str2 = (value2 != null || (estimateGasFee = value2.getEstimateGasFee()) == null) ? "" : estimateGasFee;
                String strQKudOq = QKudOq();
                String first = EZpvd(OLrzqt().getValue()).getFirst();
                String json = new Gson().toJson(AEQbTJ(investTokenWithApprove));
                Intrinsics.checkNotNullExpressionValue(json, "");
                String value3 = this.fFgQHt.getValue();
                if (investTokenWithApprove != null) {
                    C27492jwH c27492jwH = C27492jwH.OLrzqt;
                    InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo6 = this.values;
                    if (investSubscriptionReceiveInfo6 == null || (listAhwBna2 = investSubscriptionReceiveInfo6.getInvestWithTokenList()) == null) {
                        listAhwBna2 = yDY.AhwBna();
                    }
                    listKWHzl = c27492jwH.KWHzl(listAhwBna2);
                } else {
                    listKWHzl = null;
                }
                return new InvestTxModel(value, strDarRvM, strOqFWZa, listEZpvd, (Long) null, j, str, listAhwBna, (List) arrayList, (List) null, arrayList3, strEZpvd, strDAIeex, str2, strQKudOq, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, value3, (String) null, (String) null, (Integer) null, (Integer) null, (List) listKWHzl, investTokenWithApprove == null ? investTokenWithApprove.getApproveType() : null, investTokenWithApprove == null ? investTokenWithApprove.getNeedApproveAmount() : null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, 2080244240, 65532, (DefaultConstructorMarker) null);
            }
        }
        arrayList3 = arrayList2;
        String strEZpvd2 = this.uzCIH.EZpvd(String.valueOf(zLjUOn().getChainId()));
        String strDAIeex2 = DAIeex();
        InvestGasPriceConfig value22 = OLrzqt().getValue();
        if (value22 != null) {
        }
        String strQKudOq2 = QKudOq();
        String first2 = EZpvd(OLrzqt().getValue()).getFirst();
        String json2 = new Gson().toJson(AEQbTJ(investTokenWithApprove));
        Intrinsics.checkNotNullExpressionValue(json2, "");
        String value32 = this.fFgQHt.getValue();
        if (investTokenWithApprove != null) {
        }
        return new InvestTxModel(value, strDarRvM, strOqFWZa, listEZpvd, (Long) null, j, str, listAhwBna, (List) arrayList, (List) null, arrayList3, strEZpvd2, strDAIeex2, str2, strQKudOq2, first2, json2, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, value32, (String) null, (String) null, (Integer) null, (Integer) null, (List) listKWHzl, investTokenWithApprove == null ? investTokenWithApprove.getApproveType() : null, investTokenWithApprove == null ? investTokenWithApprove.getNeedApproveAmount() : null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, 2080244240, 65532, (DefaultConstructorMarker) null);
    }

    public static final String AhwBna(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getCurrencyAmount();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTransactionParam AEQbTJ(InvestTokenWithApprove investTokenWithApprove) {
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo;
        List<InvestTokenWithAmount> investWithTokenList;
        ArrayList arrayList;
        List<InvestTokenWithApprove> approveStatusList;
        List<InvestTokenWithAmount> investWithTokenList2;
        List<InvestTokenWithAmount> investWithTokenList3;
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(DXXBbs()));
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo2 = this.values;
        Integer numValueOf = null;
        Integer numValueOf2 = (investSubscriptionReceiveInfo2 == null || (investWithTokenList3 = investSubscriptionReceiveInfo2.getInvestWithTokenList()) == null) ? null : Integer.valueOf(investWithTokenList3.size());
        if (numValueOf2 != null && numValueOf2.intValue() == 2) {
            InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo3 = this.values;
            if (investSubscriptionReceiveInfo3 == null || (investWithTokenList2 = investSubscriptionReceiveInfo3.getInvestWithTokenList()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(investWithTokenList2, 10));
                for (InvestTokenWithAmount investTokenWithAmount : investWithTokenList2) {
                    arrayList2.add(new InvestInputData(investTokenWithAmount.getCoinAmount(), investTokenWithAmount.getTokenAddress(), investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, false, false, 24, (DefaultConstructorMarker) null));
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (C59449zhJ.gEmmrt(((InvestInputData) obj).getTokenAddress(), investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, true)) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = arrayList3;
            }
        } else if (numValueOf2 != null && numValueOf2.intValue() == 1 && (investSubscriptionReceiveInfo = this.values) != null && (investWithTokenList = investSubscriptionReceiveInfo.getInvestWithTokenList()) != null) {
            ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(investWithTokenList, 10));
            for (InvestTokenWithAmount investTokenWithAmount2 : investWithTokenList) {
                arrayList4.add(new InvestInputData(investTokenWithAmount2.getCoinAmount(), investTokenWithAmount2.getTokenAddress(), investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, false, false, 24, (DefaultConstructorMarker) null));
            }
            arrayList = arrayList4;
        }
        Long analysisPlatformId = zLjUOn().getAnalysisPlatformId();
        int value = zLjUOn().getInvestType().getValue();
        long chainId = zLjUOn().getChainId();
        boolean zGGvvIC = gGvvIC();
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo4 = this.values;
        if (investSubscriptionReceiveInfo4 != null && (approveStatusList = investSubscriptionReceiveInfo4.getApproveStatusList()) != null) {
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : approveStatusList) {
                if (((InvestTokenWithApprove) obj2).isNeedApprove()) {
                    arrayList5.add(obj2);
                }
            }
            numValueOf = Integer.valueOf(arrayList5.size());
        }
        return new InvestTransactionParam(arrayList, true ^ zGGvvIC, C33129mqd.AEQbTJ(numValueOf, 1), chainId, Integer.valueOf(value), analysisPlatformId, (String) null, listEZpvd, Long.valueOf(RJOkX()), (Integer) null, (String) null, (Integer) null, (Integer) null, (InvestPoolV3) null, (Integer) null, (Boolean) null, 65088, (DefaultConstructorMarker) null);
    }

    public final boolean fetchVPNInfo(@NotNull InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.isBaseToken() && C33129mqd.gEmmrt(investTokenWithAmount.getCoinAmount(), zLjUOn().getReserveFee());
    }

    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fFgQHt.setValue(str);
        KWHzl(2);
    }

    public final void AEQbTJ(@NotNull TransactionStage transactionStage) {
        List<TransactionStep> transactionStepList;
        Intrinsics.checkNotNullParameter(transactionStage, "");
        this.isConnected = transactionStage;
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
        if (investSubscriptionReceiveInfo == null || (transactionStepList = investSubscriptionReceiveInfo.getTransactionStepList()) == null) {
            return;
        }
        OLrzqt(transactionStepList);
    }

    public final void OLrzqt(List<TransactionStep> list) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSubscriptionNewViewModel$reloadCTAButton$1(this, list, null), 3, null);
    }

    public static /* synthetic */ void settleTransaction$default(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investSubscriptionNewViewModel.AEQbTJ(z);
    }

    public final void AEQbTJ(boolean z) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestSubscriptionNewViewModel$settleTransaction$1(this, z, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTxModel OLrzqt(TransactionConfig transactionConfig, InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, TransactionStep transactionStep) {
        List listAhwBna;
        List listEZpvd;
        Iterator it;
        Object next;
        List<FromToken> listKWHzl;
        String estimateGasFee;
        int iValueOf = transactionStep.valueOf();
        String strDarRvM = DarRvM();
        String strOqFWZa = OqFWZa();
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        String strAEQbTJ = C27491jwG.AEQbTJ(investSubscriptionReceiveInfo.getInvestWithTokenList(), new Function1() { // from class: o.joZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestSubscriptionNewViewModel.AYXKKw((InvestTokenWithAmount) obj);
            }
        });
        InvestTokenWithAmount receiveTokenInfo = investSubscriptionReceiveInfo.getReceiveTokenInfo();
        if (receiveTokenInfo != null) {
            InvestTokenWithAmount investTokenWithAmountCopy = receiveTokenInfo.copy((268435455 & 1) != 0 ? receiveTokenInfo.chainId : 0L, (268435455 & 2) != 0 ? receiveTokenInfo.coinAmount : null, (268435455 & 4) != 0 ? receiveTokenInfo.currencyAmount : null, (268435455 & 8) != 0 ? receiveTokenInfo.depositTips : false, (268435455 & 16) != 0 ? receiveTokenInfo.isBaseToken : false, (268435455 & 32) != 0 ? receiveTokenInfo.network : null, (268435455 & 64) != 0 ? receiveTokenInfo.tokenAddress : null, (268435455 & 128) != 0 ? receiveTokenInfo.tokenLogo : null, (268435455 & 256) != 0 ? receiveTokenInfo.tokenName : null, (268435455 & 512) != 0 ? receiveTokenInfo.tokenSymbol : null, (268435455 & 1024) != 0 ? receiveTokenInfo.tokenPrecision : null, (268435455 & 2048) != 0 ? receiveTokenInfo.browserUrl : null, (268435455 & 4096) != 0 ? receiveTokenInfo.tokenId : null, (268435455 & 8192) != 0 ? receiveTokenInfo.isCanClaim : null, (268435455 & 16384) != 0 ? receiveTokenInfo.buttonType : null, (268435455 & 32768) != 0 ? receiveTokenInfo.expectTokenAddress : null, (268435455 & 65536) != 0 ? receiveTokenInfo.transferableBalance : null, (268435455 & 131072) != 0 ? receiveTokenInfo.dataType : null, (268435455 & 262144) != 0 ? receiveTokenInfo.availableClaimTime : null, (268435455 & 524288) != 0 ? receiveTokenInfo.collectionDeadLine : null, (268435455 & 1048576) != 0 ? receiveTokenInfo.availableClaimType : 0, (268435455 & 2097152) != 0 ? receiveTokenInfo.minInvestAmount : null, (268435455 & 4194304) != 0 ? receiveTokenInfo.originalInvestmentId : null, (268435455 & 8388608) != 0 ? receiveTokenInfo.originalProductType : null, (268435455 & 16777216) != 0 ? receiveTokenInfo.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? receiveTokenInfo.safeMinAmount : null, (268435455 & 67108864) != 0 ? receiveTokenInfo.safeMaxAmount : null, (268435455 & 134217728) != 0 ? receiveTokenInfo.tokenPrice : null);
            investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
            listAhwBna = C56402yEa.EZpvd(investTokenWithAmountCopy);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
        }
        List list = listAhwBna;
        List<InvestTokenWithAmount> swapToTokenList = investSubscriptionReceiveInfo.getSwapToTokenList();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(swapToTokenList, 10));
        for (InvestTokenWithAmount investTokenWithAmount : swapToTokenList) {
            InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
            investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
            arrayList.add(investTokenWithAmountCopy2);
            jCopydefault = jCopydefault;
        }
        long j = jCopydefault;
        double d = 10.0d;
        InvestTradeManager investTradeManager = InvestTradeManager.OLrzqt;
        if (investTradeManager.AEQbTJ(transactionStep.valueOf())) {
            listEZpvd = C56402yEa.EZpvd(new InvestTokenWithAmount(transactionStep.KWHzl(), investTradeManager.KWHzl(transactionStep.AEQbTJ()) ? transactionStep.copydefault() : "", (String) null, false, false, (String) null, transactionStep.gEmmrt(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435388, (DefaultConstructorMarker) null));
        } else {
            List<InvestTokenWithAmount> investWithTokenList = investSubscriptionReceiveInfo.getInvestWithTokenList();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(investWithTokenList, 10));
            Iterator it2 = investWithTokenList.iterator();
            while (it2.hasNext()) {
                InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) it2.next();
                InvestTokenWithAmount investTokenWithAmountCopy3 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                investTokenWithAmountCopy3.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy3.getCoinAmount(), Double.valueOf(Math.pow(d, C33129mqd.AEQbTJ(investTokenWithAmountCopy3.getTokenPrecision()))), null, null, null, 14, null));
                Iterator<T> it3 = investSubscriptionReceiveInfo.getTokenInfoList().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        it = it2;
                        next = null;
                        break;
                    }
                    next = it3.next();
                    it = it2;
                    if (C59449zhJ.gEmmrt(((ExpectTokenInfo) next).getTokenAddress(), investTokenWithAmountCopy3.getTokenAddress(), true)) {
                        break;
                    }
                    it2 = it;
                }
                ExpectTokenInfo expectTokenInfo = (ExpectTokenInfo) next;
                investTokenWithAmountCopy3.setExpectTokenAddress(expectTokenInfo != null ? expectTokenInfo.getExpectTokenAddress() : null);
                arrayList2.add(investTokenWithAmountCopy3);
                it2 = it;
                d = 10.0d;
            }
            listEZpvd = arrayList2;
        }
        String strEZpvd = this.uzCIH.EZpvd(String.valueOf(transactionConfig.copydefault()));
        String strDAIeex = DAIeex();
        InvestGasPriceConfig value = OLrzqt().getValue();
        String str = (value == null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
        String strQKudOq = QKudOq();
        String first = EZpvd(OLrzqt().getValue()).getFirst();
        String json = new Gson().toJson(EZpvd(transactionConfig, investSubscriptionReceiveInfo, transactionStep));
        Intrinsics.checkNotNullExpressionValue(json, "");
        String value2 = this.fFgQHt.getValue();
        if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            List<InvestTokenWithAmount> investWithTokenList2 = investSubscriptionReceiveInfo.getInvestWithTokenList();
            if (investWithTokenList2 == null) {
                investWithTokenList2 = yDY.AhwBna();
            }
            listKWHzl = c27492jwH.KWHzl(investWithTokenList2);
        } else {
            listKWHzl = null;
        }
        int iAEQbTJ = transactionStep.AEQbTJ();
        String strCopydefault = transactionStep.copydefault();
        String strOLrzqt = transactionStep.OLrzqt();
        return new InvestTxModel(iValueOf, strDarRvM, strOqFWZa, listEZpvd2, (Long) null, j, strAEQbTJ, list, (List) arrayList, (List) null, listEZpvd, strEZpvd, strDAIeex, str, strQKudOq, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, value2, (String) null, (String) null, (Integer) null, (Integer) null, (List) listKWHzl, Integer.valueOf(iAEQbTJ), strCopydefault, strOLrzqt.length() == 0 ? null : strOLrzqt, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, transactionConfig.fARcdN(), 2080244240, 32760, (DefaultConstructorMarker) null);
    }

    public static final String AYXKKw(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getCurrencyAmount();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: com.okinc.business.invest_biz.data.bean.InvestTransactionParam$Companion */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final InvestTransactionParam EZpvd(TransactionConfig transactionConfig, InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo, TransactionStep transactionStep) {
        List listAhwBna;
        int size = investSubscriptionReceiveInfo.getInvestWithTokenList().size();
        Integer numValueOf = null;
        if (size == 1) {
            List<InvestTokenWithAmount> investWithTokenList = investSubscriptionReceiveInfo.getInvestWithTokenList();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(investWithTokenList, 10));
            for (InvestTokenWithAmount investTokenWithAmount : investWithTokenList) {
                arrayList.add(new InvestInputData(investTokenWithAmount.getCoinAmount(), investTokenWithAmount.getTokenAddress(), transactionStep.gEmmrt(), false, false, 24, (DefaultConstructorMarker) null));
            }
            listAhwBna = arrayList;
        } else if (size != 2) {
            listAhwBna = null;
        } else {
            List<InvestTokenWithAmount> investWithTokenList2 = investSubscriptionReceiveInfo.getInvestWithTokenList();
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(investWithTokenList2, 10));
            for (InvestTokenWithAmount investTokenWithAmount2 : investWithTokenList2) {
                arrayList2.add(new InvestInputData(investTokenWithAmount2.getCoinAmount(), investTokenWithAmount2.getTokenAddress(), transactionStep.gEmmrt(), false, false, 24, (DefaultConstructorMarker) null));
            }
            listAhwBna = new ArrayList();
            for (Object obj : arrayList2) {
                if (C59449zhJ.gEmmrt(((InvestInputData) obj).getTokenAddress(), transactionStep.gEmmrt(), true)) {
                    listAhwBna.add(obj);
                }
            }
        }
        InvestTransactionParam.Companion companion = InvestTransactionParam.Companion;
        if (listAhwBna == null) {
            listAhwBna = yDY.AhwBna();
        }
        List list = listAhwBna;
        long jRJOkX = RJOkX();
        List<TransactionStep> transactionStepList = investSubscriptionReceiveInfo.getTransactionStepList();
        if (transactionStepList != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : transactionStepList) {
                TransactionStep transactionStep2 = (TransactionStep) obj2;
                if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep2.valueOf()) && transactionStep2.fetchVPNInfo()) {
                    arrayList3.add(obj2);
                }
            }
            numValueOf = Integer.valueOf(arrayList3.size());
        }
        return companion.OLrzqt(transactionConfig, list, jRJOkX, C33129mqd.AEQbTJ(numValueOf, 1));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshDataFirst$default(InvestSubscriptionNewViewModel investSubscriptionNewViewModel, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function02 = null;
        }
        investSubscriptionNewViewModel.copydefault((Function0<Unit>) function0, (Function0<Unit>) function02);
    }

    public final void copydefault(Function0<Unit> function0, Function0<Unit> function02) {
        getReceiveInfoAndCheckState$default(this, false, 1, null);
        InvestSubscriptionReceiveInfo investSubscriptionReceiveInfo = this.values;
        if (investSubscriptionReceiveInfo == null || !investSubscriptionReceiveInfo.isAllowSubscribe()) {
            if (function02 != null) {
                function02.invoke();
            }
        } else if (function0 != null) {
            function0.invoke();
        }
    }
}

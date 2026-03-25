package com.okinc.business.invest_biz.ui.viewmodel;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.activity.result.ActivityResultLauncher;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import com.okinc.business.invest_biz.data.bean.BorrowedInfo;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.CollateralRatioInfo;
import com.okinc.business.invest_biz.data.bean.ExpectTokenInfo;
import com.okinc.business.invest_biz.data.bean.InvestClickActionType;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestOrder;
import com.okinc.business.invest_biz.data.bean.InvestRedeemInitialInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfo;
import com.okinc.business.invest_biz.data.bean.InvestRedeemReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.PromptInformation;
import com.okinc.business.invest_biz.data.bean.TransactionMethod;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.bean.response.TransactionStepTokenInfo;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestRedeemReceiveInfoHandle;
import com.okinc.business.invest_biz.data.logic.InvestSupplyHandle;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.MySupplyResponseState;
import com.okinc.business.invest_biz.data.logic.MySupplyResponseStateType;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.data.models.InvestType;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
import o.C23580iBq;
import o.C23948iPg;
import o.C23950iPi;
import o.C23953iPl;
import o.C25479ixW;
import o.C25481ixY;
import o.C25482ixZ;
import o.C25493ixk;
import o.C25538iyc;
import o.C25539iyd;
import o.C25544iyi;
import o.C25582izT;
import o.C25592izd;
import o.C27492jwH;
import o.C27493jwI;
import o.C27505jwU;
import o.C27577jxn;
import o.C27581jxr;
import o.C33050mpD;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C55328xhq;
import o.C56390yDp;
import o.C56402yEa;
import o.C56403yEb;
import o.C56424yEw;
import o.C59449zhJ;
import o.InterfaceC23693iFv;
import o.InterfaceC24173iXp;
import o.InterfaceC27093jog;
import o.InterfaceC58227yxM;
import o.InterfaceC9738bbJ;
import o.iCP;
import o.iXD;
import o.iXH;
import o.iXN;
import o.pTB;
import o.yBI;
import o.yBK;
import o.yCM;
import o.yDY;
import o.yHO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestRedeemViewModel extends AbstractC27165jpz implements InterfaceC27093jog {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public MutableLiveData<C25481ixY> AEQbTJ;
    public final SparseArray<List<InvestTokenWithAmount>> AYXKKw;
    public MutableLiveData<Triple<Integer, InvestRedeemReceiveInfo, Integer>> AhwBna;
    public final MutableLiveData<Boolean> AkhnZx;
    public final MutableLiveData<C23950iPi> AuCTel;
    public MutableLiveData<C25479ixW> AuCTelauCTel;
    public InvestTokenWithAmount AubY;
    public InvestSupplyHandle AwvSrB;
    public final MutableLiveData<TransactionMethod> AxsJAY;
    public InvestTipsBean DTwDnp;
    public ResponseState DbNXlk;
    public MutableLiveData<ActionBar> KWHzl;
    public MutableStateFlow<InterfaceC24173iXp> OLrzqt;
    public ArrayList<InvestTokenWithAmount> ORxRYg;
    public String OcIXYQ;
    public final SavedStateHandle QKVWgx;
    public final MutableLiveData<Boolean> QOLQEE;
    public MutableLiveData<RedeemResult> QUSxYX;
    public MutableLiveData<MySupplyResponseState> QbewEr;
    public final SharedFlow<iXD> QfsBiF;

    @yCM
    public InterfaceC23693iFv checkRedeemAllowedUseCase;
    public final MutableSharedFlow<iXD> copydefault;

    @yCM
    public iXH ctaButtonUseCase;
    public final HashMap<Boolean, InvestRedeemInitialInfo> djBIcL;
    public InvestInputData ejfBZ;
    public String fARcdN;
    public MutableLiveData<Boolean> fIwbmz;
    public Object fJNWhG;
    public InvestRedeemReceiveInfo fetchVPNInfo;
    public MutableLiveData<C25482ixZ> gEmmrt;
    public MutableLiveData<C25539iyd> gHZMYf;
    public boolean getFieldNames;
    public InvestTokenWithAmount getNewProxyInstance;
    public boolean hDKMBd;
    public final MutableLiveData<Boolean> isConnected;
    public boolean iwGUEr;
    public InvestRedeemReceiveInfoHandle sSMYrx;

    @yCM
    public iXN settleTransactionUseCase;
    public MutableLiveData<C25538iyc> uzCIH;
    public final StateFlow<InterfaceC24173iXp> valueOf;
    public TransactionStage values;
    public MutableLiveData<C23948iPg> wlaJM;
    public final Function2<MySupplyResponseState, InvestTokenWithAmount, Unit> zLjUOn;
    public InvestTokenWithAmount zsXlph;
    public final MutableLiveData<InvestRedeemReceiveInfoUIBean> zuBGHE;

    public final /* synthetic */ class Application {
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
    public final TransactionStage AhwBna() {
        return this.values;
    }

    @Override // o.AbstractC27165jpz
    public void AuCTel() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27093jog
    public MutableLiveData<InvestRedeemReceiveInfoUIBean> DbNXlk() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24173iXp> gEmmrt() {
        return this.valueOf;
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class ActionBar {
        public final Bundle KWHzl;
        public final InvestTokenWithApprove OLrzqt;
        public final int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                investTokenWithApprove = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                i = actionBar.copydefault;
            }
            if ((i2 & 4) != 0) {
                bundle = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(investTokenWithApprove, i, bundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle) {
            return new ActionBar(investTokenWithApprove, i, bundle);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return Intrinsics.EZpvd(this.OLrzqt, actionBar.OLrzqt) && this.copydefault == actionBar.copydefault && Intrinsics.EZpvd(this.KWHzl, actionBar.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            InvestTokenWithApprove investTokenWithApprove = this.OLrzqt;
            int iHashCode = investTokenWithApprove == null ? 0 : investTokenWithApprove.hashCode();
            int iHashCode2 = Integer.hashCode(this.copydefault);
            Bundle bundle = this.KWHzl;
            return (((iHashCode * 31) + iHashCode2) * 31) + (bundle != null ? bundle.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "ApproveResult(info=" + this.OLrzqt + ", result=" + this.copydefault + ", bundle=" + this.KWHzl + ")";
        }

        public ActionBar(InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle) {
            this.OLrzqt = investTokenWithApprove;
            this.copydefault = i;
            this.KWHzl = bundle;
        }
    }

    @yCM
    public InvestRedeemViewModel(@NotNull SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        this.QKVWgx = savedStateHandle;
        this.AxsJAY = new MutableLiveData<>();
        this.AkhnZx = new MutableLiveData<>();
        this.zuBGHE = new MutableLiveData<>();
        this.QbewEr = new MutableLiveData<>();
        this.KWHzl = new MutableLiveData<>();
        this.QUSxYX = new MutableLiveData<>();
        this.AhwBna = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.AuCTelauCTel = new MutableLiveData<>();
        this.gEmmrt = new MutableLiveData<>();
        this.uzCIH = new MutableLiveData<>();
        this.wlaJM = new MutableLiveData<>();
        this.fIwbmz = new MutableLiveData<>();
        this.gHZMYf = new MutableLiveData<>();
        this.AuCTel = new MutableLiveData<>();
        this.QOLQEE = new MutableLiveData<>();
        this.isConnected = new MutableLiveData<>();
        this.djBIcL = new HashMap<>();
        this.ORxRYg = new ArrayList<>();
        this.AYXKKw = new SparseArray<>();
        this.sSMYrx = new InvestRedeemReceiveInfoHandle();
        this.AwvSrB = new InvestSupplyHandle();
        this.fJNWhG = new Object();
        this.fARcdN = "";
        this.OcIXYQ = "";
        this.values = TransactionStage.INPUT;
        MutableStateFlow<InterfaceC24173iXp> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        this.OLrzqt = MutableStateFlow;
        this.valueOf = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<iXD> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.copydefault = mutableSharedFlowMutableSharedFlow$default;
        this.QfsBiF = mutableSharedFlowMutableSharedFlow$default;
        this.zLjUOn = new Function2() { // from class: o.jor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestRedeemViewModel.copydefault(this.AEQbTJ, (MySupplyResponseState) obj, (InvestTokenWithAmount) obj2);
            }
        };
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class RedeemResult implements Parcelable {
        public static final Parcelable.Creator<RedeemResult> CREATOR = new Creator();
        public final Bundle EZpvd;
        public final InvestTradeManager.TransactionResultExtraData KWHzl;
        public final int OLrzqt;

        /* JADX INFO: loaded from: classes23.dex */
        public static final class Creator implements Parcelable.Creator<RedeemResult> {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RedeemResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "");
                return new RedeemResult(parcel.readInt(), parcel.readBundle(RedeemResult.class.getClassLoader()), InvestTradeManager.TransactionResultExtraData.CREATOR.createFromParcel(parcel));
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final RedeemResult[] newArray(int i) {
                return new RedeemResult[i];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RedeemResult copy$default(RedeemResult redeemResult, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = redeemResult.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                bundle = redeemResult.EZpvd;
            }
            if ((i2 & 4) != 0) {
                transactionResultExtraData = redeemResult.KWHzl;
            }
            return redeemResult.copydefault(i, bundle, transactionResultExtraData);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RedeemResult copydefault(int i, Bundle bundle, @NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
            Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
            return new RedeemResult(i, bundle, transactionResultExtraData);
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
            if (!(obj instanceof RedeemResult)) {
                return false;
            }
            RedeemResult redeemResult = (RedeemResult) obj;
            return this.OLrzqt == redeemResult.OLrzqt && Intrinsics.EZpvd(this.EZpvd, redeemResult.EZpvd) && Intrinsics.EZpvd(this.KWHzl, redeemResult.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = Integer.hashCode(this.OLrzqt);
            Bundle bundle = this.EZpvd;
            return (((iHashCode * 31) + (bundle == null ? 0 : bundle.hashCode())) * 31) + this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "RedeemResult(result=" + this.OLrzqt + ", bundle=" + this.EZpvd + ", extraData=" + this.KWHzl + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(this.OLrzqt);
            parcel.writeBundle(this.EZpvd);
            this.KWHzl.writeToParcel(parcel, i);
        }

        public RedeemResult(int i, Bundle bundle, @NotNull InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
            Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
            this.OLrzqt = i;
            this.EZpvd = bundle;
            this.KWHzl = transactionResultExtraData;
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final String zuBGHE() {
        String str = (String) this.QKVWgx.get("walletid");
        return str == null ? "" : str;
    }

    private final String wlaJM() {
        String str = (String) this.QKVWgx.get("wallet_address");
        return str == null ? "" : str;
    }

    private final long AubY() {
        Long l = (Long) this.QKVWgx.get("investmentId");
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    private final int zsXlph() {
        Integer num = (Integer) this.QKVWgx.get("investmentCategory");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int AuCTelauCTel() {
        Integer num = (Integer) this.QKVWgx.get("investType");
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final boolean UeEOUB() {
        Boolean bool = (Boolean) this.QKVWgx.get("isSingle");
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    private final void copydefault(boolean z) {
        this.QKVWgx.set("isSingle", Boolean.valueOf(z));
    }

    public final InvestOrder AkhnZx() {
        return (InvestOrder) this.QKVWgx.get("selectedInvestOrder");
    }

    public final InvestRedeemInitialInfo values() {
        InvestRedeemInitialInfo investRedeemInitialInfo = (InvestRedeemInitialInfo) this.QKVWgx.get("redeem_info");
        return investRedeemInitialInfo == null ? new InvestRedeemInitialInfo(0L, (InvestType) null, 0L, (String) null, false, new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null), (String) null, (String) null, (String) null, (String) null, (List) null, (TransactionMethod) null, (List) null, (InvestTokenWithAmount) null, (Long) null, false, (String) null, (PromptInformation) null, (Integer) null, false, (String) null, (List) null, (Integer) null, (Boolean) null, (InvestTokenWithAmount) null, (CollateralRatioInfo) null, (Integer) null, (BTCMode) null, (BorrowedInfo) null, (String) null, (String) null, 2147483615, (DefaultConstructorMarker) null) : investRedeemInitialInfo;
    }

    public final void KWHzl(InvestRedeemInitialInfo investRedeemInitialInfo) {
        this.QKVWgx.set("redeem_info", investRedeemInitialInfo);
    }

    public final TransactionConfig fJNWhG() {
        return (TransactionConfig) this.QKVWgx.get("key.trx_config");
    }

    public final iXH valueOf() {
        iXH ixh = this.ctaButtonUseCase;
        if (ixh != null) {
            return ixh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final iXN ejfBZ() {
        iXN ixn = this.settleTransactionUseCase;
        if (ixn != null) {
            return ixn;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InterfaceC23693iFv AYXKKw() {
        InterfaceC23693iFv interfaceC23693iFv = this.checkRedeemAllowedUseCase;
        if (interfaceC23693iFv != null) {
            return interfaceC23693iFv;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestInitialData$default(InvestRedeemViewModel investRedeemViewModel, InvestInputData investInputData, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        investRedeemViewModel.AEQbTJ(investInputData, z, (Function1<? super Bitmap<Throwable>, Unit>) function1);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.izT.getRedeemInitialData$default(o.izT, java.lang.String, long, java.lang.String, boolean, java.lang.String, int, java.lang.String, int, java.lang.Object):o.ywX */
    public final void AEQbTJ(InvestInputData investInputData, final boolean z, final Function1<? super Bitmap<Throwable>, Unit> function1) {
        String tokenAddress;
        this.ejfBZ = investInputData;
        copydefault(z);
        InvestRedeemInitialInfo investRedeemInitialInfo = this.djBIcL.get(Boolean.valueOf(z));
        if (investRedeemInitialInfo != null) {
            KWHzl(investRedeemInitialInfo);
            if (function1 != null) {
                function1.invoke(new Bitmap.StateListAnimator(null));
            }
            RcXXUw();
            return;
        }
        C25582izT c25582izT = C25582izT.OLrzqt;
        String strZuBGHE = zuBGHE();
        long jAubY = AubY();
        String strWlaJM = wlaJM();
        if (investInputData == null || (tokenAddress = investInputData.getTokenAddress()) == null) {
            tokenAddress = "";
        }
        AbstractC58185ywX abstractC58185ywXCopydefault = c25582izT.copydefault(strZuBGHE, jAubY, strWlaJM, (64 & 8) != 0 ? true : z, (64 & 16) != 0 ? "" : tokenAddress, zsXlph(), (64 & 64) != 0 ? null : null);
        final Function1 function12 = new Function1() { // from class: o.joB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestRedeemViewModel.OLrzqt(this.OLrzqt, z, function1, (InvestRedeemInitialInfo) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.joI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestRedeemViewModel.KWHzl(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.joH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestRedeemViewModel.OLrzqt(this.OLrzqt, function1, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXCopydefault.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.joF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                InvestRedeemViewModel.copydefault(function13, obj);
            }
        });
    }

    public static final void KWHzl(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(InvestRedeemViewModel investRedeemViewModel, boolean z, Function1 function1, InvestRedeemInitialInfo investRedeemInitialInfo) {
        investRedeemViewModel.KWHzl(investRedeemInitialInfo);
        investRedeemViewModel.djBIcL.put(Boolean.valueOf(z), investRedeemInitialInfo);
        if (function1 != null) {
            function1.invoke(new Bitmap.StateListAnimator(null));
        }
        investRedeemViewModel.RcXXUw();
        return Unit.INSTANCE;
    }

    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(InvestRedeemViewModel investRedeemViewModel, Function1 function1, Throwable th) {
        investRedeemViewModel.AkhnZx.setValue(Boolean.TRUE);
        if (function1 != null) {
            function1.invoke(new Bitmap.ActionBar(null, th, 1, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void RcXXUw() {
        String amount;
        this.AxsJAY.setValue(values().getRedeemMethod());
        this.getNewProxyInstance = values().getMySupply();
        this.AwvSrB.initData(zuBGHE(), wlaJM(), AubY(), zsXlph(), this.zLjUOn);
        this.ORxRYg.clear();
        if ((values().getInvestType() == InvestType.Pool && !UeEOUB()) || this.AYXKKw.size() == 0) {
            this.ORxRYg.addAll(values().getReceiveTokenList());
        } else {
            ArrayList<InvestTokenWithAmount> arrayList = this.ORxRYg;
            List<InvestTokenWithAmount> listAhwBna = this.AYXKKw.get(0);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            arrayList.addAll(listAhwBna);
        }
        InvestInputData investInputData = this.ejfBZ;
        if (investInputData == null) {
            amount = null;
        } else if (C33129mqd.OLrzqt((CharSequence) investInputData.getTokenAddress()) && (!this.ORxRYg.isEmpty()) && C59449zhJ.gEmmrt(this.ORxRYg.get(0).getTokenAddress(), investInputData.getTokenAddress(), true)) {
            amount = investInputData.getAmount();
            Intrinsics.copydefault((Object) amount);
        } else if (investInputData.isPoolSwitch() && C33129mqd.OLrzqt((CharSequence) investInputData.getAmount())) {
            amount = investInputData.getAmount();
            Intrinsics.copydefault((Object) amount);
        }
        gEmmrt(4);
        this.AkhnZx.setValue(Boolean.FALSE);
        if (amount != null) {
            InvestInputData investInputData2 = this.ejfBZ;
            if (investInputData2 != null && !investInputData2.isPoolSwitch()) {
                gHZMYf().setValue(Boolean.TRUE);
            }
            InvestInputData investInputData3 = this.ejfBZ;
            if (investInputData3 != null && investInputData3.getRedeemAll()) {
                this.hDKMBd = true;
                this.getFieldNames = true;
            }
            this.wlaJM.setValue(new C23948iPg(false, amount, false, true, false, 20, null));
            Integer numIsConnected = isConnected();
            InvestTokenWithAmount investTokenWithAmount = this.getNewProxyInstance;
            if (investTokenWithAmount == null) {
                Intrinsics.gEmmrt("");
                investTokenWithAmount = null;
            }
            int iMin = 10;
            if (!C33129mqd.copydefault((Object) investTokenWithAmount.getTokenPrecision(), (Object) 10)) {
                InvestTokenWithAmount investTokenWithAmount2 = this.getNewProxyInstance;
                if (investTokenWithAmount2 == null) {
                    Intrinsics.gEmmrt("");
                    investTokenWithAmount2 = null;
                }
                iMin = C33129mqd.AhwBna(investTokenWithAmount2.getTokenPrecision());
            }
            BigDecimal bigDecimalEZpvd = C33129mqd.EZpvd(amount);
            if (numIsConnected != null) {
                iMin = Math.min(numIsConnected.intValue(), iMin);
            }
            if (C33129mqd.OLrzqt((Object) pTB.formatUpToMax$default(bigDecimalEZpvd, iMin, null, 2, null), (Object) 0)) {
                this.OcIXYQ = amount;
            }
        }
    }

    public static /* synthetic */ void setCoinMessage$default(InvestRedeemViewModel investRedeemViewModel, String str, int i, InvestTipInfoVo investTipInfoVo, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = -1;
        }
        if ((i2 & 4) != 0) {
            investTipInfoVo = null;
        }
        investRedeemViewModel.AEQbTJ(str, i, investTipInfoVo);
    }

    public final void AEQbTJ(@NotNull String str, int i, InvestTipInfoVo investTipInfoVo) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AuCTelauCTel.setValue(new C25479ixW(str, i, investTipInfoVo));
    }

    private final void copydefault(C25481ixY c25481ixY) {
        this.AEQbTJ.setValue(c25481ixY);
    }

    private final String zLjUOn() {
        InvestTokenWithAmount investTokenWithAmount = this.AubY;
        if (investTokenWithAmount != null) {
            return investTokenWithAmount.getCoinAmount();
        }
        return null;
    }

    public final String KWHzl() {
        InvestTokenWithAmount investTokenWithAmount = this.getNewProxyInstance;
        if (investTokenWithAmount == null) {
            Intrinsics.gEmmrt("");
            investTokenWithAmount = null;
        }
        return investTokenWithAmount.getTokenSymbol();
    }

    private final void OLrzqt(C25482ixZ c25482ixZ) {
        this.gEmmrt.setValue(c25482ixZ);
    }

    public final void AkhnZx(InvestTokenWithAmount investTokenWithAmount) {
        Integer numIsConnected = isConnected();
        int iAhwBna = C33129mqd.copydefault((Object) values().getMySupply().getTokenPrecision(), (Object) 10) ? 10 : C33129mqd.AhwBna(values().getMySupply().getTokenPrecision());
        MutableLiveData<C25538iyc> mutableLiveData = this.uzCIH;
        if (numIsConnected != null) {
            iAhwBna = Math.min(numIsConnected.intValue(), iAhwBna);
        }
        boolean zIsSupportSwap = values().isSupportSwap();
        PromptInformation promptInformation = values().getPromptInformation();
        mutableLiveData.setValue(new C25538iyc(investTokenWithAmount, iAhwBna, zIsSupportSwap, promptInformation != null ? promptInformation.getRedeemAllTip() : null));
    }

    public static /* synthetic */ void getReceiveInfoAndCheckState$default(InvestRedeemViewModel investRedeemViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investRedeemViewModel.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        InvestTokenWithAmount investTokenWithAmount;
        boolean zCopydefault = copydefault(this.fARcdN);
        boolean z2 = AEQbTJ() && AEQbTJ(this.fARcdN);
        if (!zCopydefault) {
            gEmmrt(0);
            this.AwvSrB.startLoop(z);
            return;
        }
        if (z2) {
            gEmmrt(3);
            this.AwvSrB.startLoop(z);
            return;
        }
        if (this.iwGUEr) {
            gEmmrt(6);
            this.AwvSrB.startLoop(z);
            return;
        }
        this.AwvSrB.releaseLoop();
        InvestTokenWithAmount investTokenWithAmount2 = null;
        if (AkhnZx() != null) {
            InvestOrder investOrderAkhnZx = AkhnZx();
            this.fARcdN = String.valueOf(investOrderAkhnZx != null ? investOrderAkhnZx.getStakedAmount() : null);
        }
        InvestRedeemReceiveInfoHandle investRedeemReceiveInfoHandle = this.sSMYrx;
        String strZuBGHE = zuBGHE();
        String strWlaJM = wlaJM();
        InvestTokenWithAmount investTokenWithAmount3 = this.getNewProxyInstance;
        if (investTokenWithAmount3 == null) {
            Intrinsics.gEmmrt("");
            investTokenWithAmount3 = null;
        }
        String str = this.fARcdN;
        long jAubY = AubY();
        int iZsXlph = zsXlph();
        InvestOrder investOrderAkhnZx2 = AkhnZx();
        String redeemId = investOrderAkhnZx2 != null ? investOrderAkhnZx2.getRedeemId() : null;
        if (redeemId == null) {
            redeemId = "";
        }
        if (C25544iyi.OLrzqt(values()) || C25544iyi.EZpvd(values())) {
            investTokenWithAmount = this.getNewProxyInstance;
            if (investTokenWithAmount == null) {
                Intrinsics.gEmmrt("");
            }
            investRedeemReceiveInfoHandle.getReceiveInfo(strZuBGHE, strWlaJM, investTokenWithAmount3, str, jAubY, iZsXlph, redeemId, investTokenWithAmount, UeEOUB(), new Function1() { // from class: o.joA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestRedeemViewModel.OLrzqt(this.OLrzqt, (InvestGasPriceConfig) obj);
                }
            }, new Function2() { // from class: o.joE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return InvestRedeemViewModel.AEQbTJ(this.KWHzl, (ResponseState) obj, (kotlin.Pair) obj2);
                }
            });
        }
        if (UeEOUB()) {
            investTokenWithAmount2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(this.ORxRYg);
        }
        investTokenWithAmount = investTokenWithAmount2;
        investRedeemReceiveInfoHandle.getReceiveInfo(strZuBGHE, strWlaJM, investTokenWithAmount3, str, jAubY, iZsXlph, redeemId, investTokenWithAmount, UeEOUB(), new Function1() { // from class: o.joA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestRedeemViewModel.OLrzqt(this.OLrzqt, (InvestGasPriceConfig) obj);
            }
        }, new Function2() { // from class: o.joE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return InvestRedeemViewModel.AEQbTJ(this.KWHzl, (ResponseState) obj, (kotlin.Pair) obj2);
            }
        });
    }

    public static final String OLrzqt(InvestRedeemViewModel investRedeemViewModel, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        return investRedeemViewModel.OLrzqt(investGasPriceConfig).getFirst();
    }

    public static final Unit AEQbTJ(InvestRedeemViewModel investRedeemViewModel, ResponseState responseState, Pair pair) {
        InvestGasPriceConfig investGasPriceConfig;
        Intrinsics.checkNotNullParameter(responseState, "");
        investRedeemViewModel.gHZMYf().setValue(Boolean.FALSE);
        if (responseState.getLastInputValue().equals(investRedeemViewModel.fARcdN)) {
            investRedeemViewModel.fetchVPNInfo = pair != null ? (InvestRedeemReceiveInfo) pair.getSecond() : null;
            if (pair != null && (investGasPriceConfig = (InvestGasPriceConfig) pair.getFirst()) != null) {
                investGasPriceConfig.setEstimateGasFee(((InvestRedeemReceiveInfo) pair.getSecond()).getEstimateGasFee());
            }
            investRedeemViewModel.OLrzqt().setValue(pair != null ? (InvestGasPriceConfig) pair.getFirst() : null);
            investRedeemViewModel.DbNXlk = responseState;
            InvestTokenWithAmount investTokenWithAmount = investRedeemViewModel.zsXlph;
            if (investTokenWithAmount != null) {
                investRedeemViewModel.KWHzl(investTokenWithAmount, responseState.getErrorType() != ResponseStateType.NORMAL, responseState.getErrorType() == ResponseStateType.SERVER_ERRRO && responseState.getErrorCode() == 10002);
            } else {
                InvestRedeemReceiveInfo investRedeemReceiveInfo = investRedeemViewModel.fetchVPNInfo;
                investRedeemViewModel.KWHzl(investRedeemReceiveInfo != null ? investRedeemReceiveInfo.getMySupply() : null, responseState.getErrorType() != ResponseStateType.NORMAL, responseState.getErrorType() == ResponseStateType.SERVER_ERRRO && responseState.getErrorCode() == 10002);
            }
            investRedeemViewModel.zsXlph = null;
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(ResponseState responseState, InvestRedeemReceiveInfo investRedeemReceiveInfo) {
        int i = 1;
        if (responseState != null) {
            int i2 = Application.AEQbTJ[responseState.getErrorType().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    QOLQEE().setValue(responseState);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (responseState.getErrorCode() == 10002) {
                        i = 5;
                    } else {
                        QOLQEE().setValue(responseState);
                    }
                }
            } else if (investRedeemReceiveInfo != null) {
                i = 2;
            } else {
                QOLQEE().setValue(responseState);
            }
            gEmmrt(i);
            return;
        }
        getReceiveInfoAndCheckState$default(this, false, 1, null);
    }

    public static final Unit copydefault(InvestRedeemViewModel investRedeemViewModel, MySupplyResponseState mySupplyResponseState, InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(mySupplyResponseState, "");
        MySupplyResponseStateType errorType = mySupplyResponseState.getErrorType();
        MySupplyResponseStateType mySupplyResponseStateType = MySupplyResponseStateType.NORMAL;
        investRedeemViewModel.KWHzl(investTokenWithAmount, errorType != mySupplyResponseStateType, mySupplyResponseState.getErrorType() == MySupplyResponseStateType.SERVER_ERRRO && mySupplyResponseState.getErrorCode() == 10002);
        if (mySupplyResponseState.getErrorType() != mySupplyResponseStateType) {
            investRedeemViewModel.QbewEr.setValue(mySupplyResponseState);
        }
        return Unit.INSTANCE;
    }

    private final void gEmmrt(int i) {
        String coinAmount;
        if (i == 4) {
            if (this.AubY == null) {
                this.AubY = values().getMySupply();
            }
            InvestTokenWithAmount investTokenWithAmount = this.AubY;
            if (investTokenWithAmount != null) {
                Intrinsics.copydefault(investTokenWithAmount);
                coinAmount = investTokenWithAmount.getCoinAmount();
            } else {
                coinAmount = "--";
            }
            String str = coinAmount;
            InvestTokenWithAmount investTokenWithAmount2 = this.getNewProxyInstance;
            if (investTokenWithAmount2 == null) {
                Intrinsics.gEmmrt("");
                investTokenWithAmount2 = null;
            }
            String tokenSymbol = investTokenWithAmount2.getTokenSymbol();
            boolean z = this.AubY == null;
            PromptInformation promptInformation = values().getPromptInformation();
            copydefault(new C25481ixY(str, tokenSymbol, z, false, false, false, false, false, promptInformation != null ? promptInformation.getAssetsTip() : null, zsXlph(), null, 1272, null));
        }
        copydefault(i);
        KWHzl(i);
        AYXKKw(i);
        EZpvd(i);
        OLrzqt(i);
        AEQbTJ(i);
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.invest_biz.data.logic.InvestSupplyHandle.startLoop$default(com.okinc.business.invest_biz.data.logic.InvestSupplyHandle, boolean, int, java.lang.Object):void */
    public final void KWHzl(InvestTokenWithAmount investTokenWithAmount, boolean z, boolean z2) {
        String coinAmount;
        if (!z2) {
            if (z) {
                this.AubY = null;
            } else {
                this.AubY = investTokenWithAmount;
            }
        }
        boolean z3 = AEQbTJ() && AEQbTJ(this.fARcdN);
        InvestTokenWithAmount investTokenWithAmount2 = this.AubY;
        if (investTokenWithAmount2 != null) {
            Intrinsics.copydefault(investTokenWithAmount2);
            coinAmount = investTokenWithAmount2.getCoinAmount();
        } else {
            coinAmount = "--";
        }
        String str = coinAmount;
        String strKWHzl = KWHzl();
        boolean zAEQbTJ = AEQbTJ();
        PromptInformation promptInformation = values().getPromptInformation();
        copydefault(new C25481ixY(str, strKWHzl, !zAEQbTJ, z3, false, false, false, false, promptInformation != null ? promptInformation.getAssetsTip() : null, zsXlph(), null, 1264, null));
        if (!copydefault(this.fARcdN)) {
            gEmmrt(0);
            InvestSupplyHandle.startLoop$default(this.AwvSrB, false, 1, null);
        } else if (z3) {
            gEmmrt(3);
            InvestSupplyHandle.startLoop$default(this.AwvSrB, false, 1, null);
        } else if (this.iwGUEr) {
            gEmmrt(6);
            InvestSupplyHandle.startLoop$default(this.AwvSrB, false, 1, null);
        } else {
            KWHzl(this.DbNXlk, this.fetchVPNInfo);
            this.AwvSrB.releaseLoop();
        }
    }

    private final void copydefault(int i) {
        switch (i) {
            case 0:
                iwGUEr();
                OLrzqt(new C25482ixZ(true, C27492jwH.formatZeroCurrencyDataWithSymbol$default(C27492jwH.OLrzqt, false, 1, null), false, 4, null));
                break;
            case 1:
            case 3:
                setCoinMessage$default(this, "", 0, null, 6, null);
                OLrzqt(new C25482ixZ(false, "--", true));
                break;
            case 2:
                setCoinMessage$default(this, "", 0, null, 6, null);
                InvestRedeemReceiveInfo investRedeemReceiveInfo = this.fetchVPNInfo;
                if (investRedeemReceiveInfo != null) {
                    Intrinsics.copydefault(investRedeemReceiveInfo);
                    if (investRedeemReceiveInfo.getInputCurrencyAmount().length() == 0) {
                        OLrzqt(new C25482ixZ(false, "--", true));
                    } else {
                        C27492jwH c27492jwH = C27492jwH.OLrzqt;
                        InvestRedeemReceiveInfo investRedeemReceiveInfo2 = this.fetchVPNInfo;
                        Intrinsics.copydefault(investRedeemReceiveInfo2);
                        OLrzqt(new C25482ixZ(false, c27492jwH.KWHzl(investRedeemReceiveInfo2.getInputCurrencyAmount()), false, 4, null));
                    }
                    InvestRedeemReceiveInfo investRedeemReceiveInfo3 = this.fetchVPNInfo;
                    Intrinsics.copydefault(investRedeemReceiveInfo3);
                    if (investRedeemReceiveInfo3.getPromptInformation() != null) {
                        InvestRedeemReceiveInfo investRedeemReceiveInfo4 = this.fetchVPNInfo;
                        Intrinsics.copydefault(investRedeemReceiveInfo4);
                        PromptInformation promptInformation = investRedeemReceiveInfo4.getPromptInformation();
                        Intrinsics.copydefault(promptInformation);
                        if (promptInformation.getExceptionTip() != null) {
                            InvestRedeemReceiveInfo investRedeemReceiveInfo5 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo5);
                            PromptInformation promptInformation2 = investRedeemReceiveInfo5.getPromptInformation();
                            Intrinsics.copydefault(promptInformation2);
                            AEQbTJ("", 6, promptInformation2.getExceptionTip());
                        }
                    }
                    if (values().getPromptInformation() != null) {
                        PromptInformation promptInformation3 = values().getPromptInformation();
                        Intrinsics.copydefault(promptInformation3);
                        if (promptInformation3.getInvestmentInfoTip() != null) {
                            iwGUEr();
                        }
                    }
                }
                break;
            case 4:
                InvestTokenWithAmount investTokenWithAmount = this.getNewProxyInstance;
                if (investTokenWithAmount == null) {
                    Intrinsics.gEmmrt("");
                    investTokenWithAmount = null;
                }
                AkhnZx(investTokenWithAmount);
                iwGUEr();
                OLrzqt(new C25482ixZ(true, C27492jwH.formatZeroCurrencyDataWithSymbol$default(C27492jwH.OLrzqt, false, 1, null), false, 4, null));
                this.wlaJM.setValue(new C23948iPg(true, null, false, false, false, 30, null));
                break;
            case 5:
                setCoinMessage$default(this, C33070mpX.AYXKKw(C25493ixk.FragmentManager.hgxRZI), 0, null, 6, null);
                OLrzqt(new C25482ixZ(false, "--", true));
                break;
            case 6:
                setCoinMessage$default(this, C33070mpX.AYXKKw(C25493ixk.FragmentManager.OStAOF), 1, null, 4, null);
                OLrzqt(new C25482ixZ(false, "--", true));
                break;
        }
    }

    public final void KWHzl(int i) {
        this.fIwbmz.setValue(Boolean.FALSE);
        switch (i) {
            case 0:
            case 4:
                this.gHZMYf.setValue(new C25539iyd(true, this.ORxRYg, false, values().isSupportSwap(), true, 0, null, 100, null));
                break;
            case 1:
            case 3:
            case 5:
            case 6:
                this.gHZMYf.setValue(new C25539iyd(false, this.ORxRYg, true, values().isSupportSwap(), true, 0, null, 96, null));
                break;
            case 2:
                InvestRedeemReceiveInfo investRedeemReceiveInfo = this.fetchVPNInfo;
                if (investRedeemReceiveInfo != null) {
                    MutableLiveData<C25539iyd> mutableLiveData = this.gHZMYf;
                    Intrinsics.copydefault(investRedeemReceiveInfo);
                    mutableLiveData.setValue(new C25539iyd(false, investRedeemReceiveInfo.getReceiveTokenList(), false, values().isSupportSwap(), true, 0, null, 100, null));
                }
                break;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r24v0, resolved type: com.okinc.business.invest_biz.data.bean.InvestTipInfoVo */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0311  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AYXKKw(int i) {
        Object next;
        List<InvestTokenWithAmount> listAhwBna;
        Object next2;
        boolean z;
        String strEZpvd;
        int i2;
        String strJoinToString$default;
        int i3;
        String strJoinToString$default2;
        InvestRedeemReceiveInfo investRedeemReceiveInfo;
        List<InvestTokenWithAmount> listAhwBna2;
        InvestTipsBean investTipsBean;
        InvestTokenWithAmount lpTokenInfo;
        String tokenSymbol;
        InvestTokenWithAmount investTokenWithAmount;
        InvestRedeemReceiveInfo investRedeemReceiveInfo2;
        PromptInformation promptInformation;
        String tokenSymbol2;
        int i4;
        String tokenSymbol3;
        int i5;
        String tokenSymbol4;
        int i6 = 0;
        Object payWithTokenTip = null;
        switch (i) {
            case 0:
            case 4:
                this.DTwDnp = null;
                Iterator<T> it = values().getUnderlyingTokenList().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next3 = it.next();
                        InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) next3;
                        if (C33129mqd.KWHzl((Collection) this.ORxRYg) && C59449zhJ.gEmmrt(investTokenWithAmount2.getTokenAddress(), this.ORxRYg.get(0).getTokenAddress(), true)) {
                            payWithTokenTip = next3;
                        }
                    }
                }
                DbNXlk().setValue(new InvestRedeemReceiveInfoUIBean(true, values().getPlatformLogo(), values().getPlatformName(), (List) (((InvestTokenWithAmount) payWithTokenTip) == null ? values().getUnderlyingTokenList() : yDY.AhwBna()), C33129mqd.KWHzl((Collection) this.ORxRYg) ? this.ORxRYg : yDY.AhwBna(), false, Integer.valueOf(zsXlph()), (InvestTipsBean) null, (InvestExchangeRateBean) null, (InvestTokenWithAmount) null, (InvestTipInfoVo) null, 1952, (DefaultConstructorMarker) null));
                break;
            case 1:
            case 3:
            case 5:
            case 6:
                Iterator<T> it2 = values().getUnderlyingTokenList().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) next;
                        if (!C33129mqd.KWHzl((Collection) this.ORxRYg) || !C59449zhJ.gEmmrt(investTokenWithAmount3.getTokenAddress(), this.ORxRYg.get(0).getTokenAddress(), true)) {
                        }
                    } else {
                        next = null;
                    }
                }
                InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) next;
                this.DTwDnp = null;
                MutableLiveData<InvestRedeemReceiveInfoUIBean> mutableLiveDataDbNXlk = DbNXlk();
                String platformLogo = values().getPlatformLogo();
                String platformName = values().getPlatformName();
                if (investTokenWithAmount4 == null) {
                    listAhwBna = values().getUnderlyingTokenList();
                } else {
                    listAhwBna = yDY.AhwBna();
                }
                mutableLiveDataDbNXlk.setValue(new InvestRedeemReceiveInfoUIBean(false, platformLogo, platformName, (List) listAhwBna, C33129mqd.KWHzl((Collection) this.ORxRYg) ? this.ORxRYg : yDY.AhwBna(), true, Integer.valueOf(zsXlph()), (InvestTipsBean) null, (InvestExchangeRateBean) null, (InvestTokenWithAmount) null, (InvestTipInfoVo) null, 1920, (DefaultConstructorMarker) null));
                break;
            case 2:
                InvestRedeemReceiveInfo investRedeemReceiveInfo3 = this.fetchVPNInfo;
                if (investRedeemReceiveInfo3 != null) {
                    Intrinsics.copydefault(investRedeemReceiveInfo3);
                    Iterator<T> it3 = investRedeemReceiveInfo3.getSwapFromTokenList().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            InvestTokenWithAmount investTokenWithAmount5 = (InvestTokenWithAmount) next2;
                            if (!C33129mqd.KWHzl((Collection) this.ORxRYg) || !C59449zhJ.gEmmrt(investTokenWithAmount5.getTokenAddress(), this.ORxRYg.get(0).getTokenAddress(), true)) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    InvestTokenWithAmount investTokenWithAmount6 = (InvestTokenWithAmount) next2;
                    InvestRedeemReceiveInfo investRedeemReceiveInfo4 = this.fetchVPNInfo;
                    Intrinsics.copydefault(investRedeemReceiveInfo4);
                    String valueDeviationPercentage = investRedeemReceiveInfo4.getValueDeviationPercentage();
                    C27577jxn c27577jxn = C27577jxn.copydefault;
                    int iAuCTelauCTel = AuCTelauCTel();
                    boolean z2 = investTokenWithAmount6 != null;
                    InvestRedeemReceiveInfo investRedeemReceiveInfo5 = this.fetchVPNInfo;
                    Intrinsics.copydefault(investRedeemReceiveInfo5);
                    boolean zAEQbTJ = c27577jxn.AEQbTJ(iAuCTelauCTel, z2, investRedeemReceiveInfo5.getSwapFromTokenList().size());
                    int i7 = 4;
                    String str = "";
                    if (zAEQbTJ) {
                        if (valueDeviationPercentage.length() > 0) {
                            InvestRedeemReceiveInfo investRedeemReceiveInfo6 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo6);
                            tokenSymbol3 = investRedeemReceiveInfo6.getReceiveTokenList().get(0).getTokenSymbol();
                            i4 = 1;
                        } else {
                            i4 = 0;
                            tokenSymbol3 = "";
                        }
                        InvestRedeemReceiveInfo investRedeemReceiveInfo7 = this.fetchVPNInfo;
                        Intrinsics.copydefault(investRedeemReceiveInfo7);
                        if (C33129mqd.OLrzqt((Object) investRedeemReceiveInfo7.getSwapFromTokenList().get(0).getCurrencyAmount(), (Object) 0)) {
                            InvestRedeemReceiveInfo investRedeemReceiveInfo8 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo8);
                            strEZpvd = investRedeemReceiveInfo8.getSwapFromTokenList().get(0).getTokenSymbol();
                            i5 = 3;
                            tokenSymbol4 = "";
                        } else {
                            i5 = i4;
                            tokenSymbol4 = tokenSymbol3;
                            strEZpvd = "";
                        }
                        Intrinsics.copydefault(this.fetchVPNInfo);
                        if (!r13.getReceiveTokenList().isEmpty()) {
                            InvestRedeemReceiveInfo investRedeemReceiveInfo9 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo9);
                            if (!C33129mqd.OLrzqt((Object) investRedeemReceiveInfo9.getReceiveTokenList().get(0).getCurrencyAmount(), (Object) 0)) {
                                i7 = i5;
                            } else if (i5 == 3) {
                                InvestRedeemReceiveInfo investRedeemReceiveInfo10 = this.fetchVPNInfo;
                                Intrinsics.copydefault(investRedeemReceiveInfo10);
                                tokenSymbol4 = investRedeemReceiveInfo10.getReceiveTokenList().get(0).getTokenSymbol();
                                InvestRedeemReceiveInfo investRedeemReceiveInfo11 = this.fetchVPNInfo;
                                Intrinsics.copydefault(investRedeemReceiveInfo11);
                                strEZpvd = investRedeemReceiveInfo11.getSwapFromTokenList().get(0).getTokenSymbol();
                            } else {
                                InvestRedeemReceiveInfo investRedeemReceiveInfo12 = this.fetchVPNInfo;
                                Intrinsics.copydefault(investRedeemReceiveInfo12);
                                tokenSymbol4 = investRedeemReceiveInfo12.getReceiveTokenList().get(0).getTokenSymbol();
                                i7 = 2;
                                strEZpvd = "";
                            }
                            this.DTwDnp = i7 != 0 ? new InvestTipsBean(i7, valueDeviationPercentage, tokenSymbol4, strEZpvd) : null;
                        }
                        investRedeemReceiveInfo = this.fetchVPNInfo;
                        Intrinsics.copydefault(investRedeemReceiveInfo);
                        if ((true ^ investRedeemReceiveInfo.getSafeMoonTokenList().isEmpty()) && i6 == 0) {
                            InvestRedeemReceiveInfo investRedeemReceiveInfo13 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo13);
                            this.DTwDnp = new InvestTipsBean(5, valueDeviationPercentage, CollectionsKt___CollectionsKt.joinToString$default(investRedeemReceiveInfo13.getSafeMoonTokenList(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.joD
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return InvestRedeemViewModel.valueOf((InvestTokenWithAmount) obj);
                                }
                            }, 30, null), strEZpvd);
                        }
                        MutableLiveData<InvestRedeemReceiveInfoUIBean> mutableLiveDataDbNXlk2 = DbNXlk();
                        String platformLogo2 = values().getPlatformLogo();
                        String platformName2 = values().getPlatformName();
                        if (z) {
                            InvestRedeemReceiveInfo investRedeemReceiveInfo14 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo14);
                            listAhwBna2 = investRedeemReceiveInfo14.getSwapFromTokenList();
                        } else {
                            listAhwBna2 = yDY.AhwBna();
                        }
                        List<InvestTokenWithAmount> list = listAhwBna2;
                        InvestRedeemReceiveInfo investRedeemReceiveInfo15 = this.fetchVPNInfo;
                        Intrinsics.copydefault(investRedeemReceiveInfo15);
                        List<InvestTokenWithAmount> receiveTokenList = investRedeemReceiveInfo15.getReceiveTokenList();
                        investTipsBean = this.DTwDnp;
                        if (investTipsBean == null) {
                            investTipsBean = new InvestTipsBean(0, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
                        }
                        InvestTipsBean investTipsBean2 = investTipsBean;
                        InvestRedeemReceiveInfo investRedeemReceiveInfo16 = this.fetchVPNInfo;
                        Intrinsics.copydefault(investRedeemReceiveInfo16);
                        String exchangeRate = investRedeemReceiveInfo16.getExchangeRate();
                        lpTokenInfo = values().getLpTokenInfo();
                        if (lpTokenInfo == null || (tokenSymbol = lpTokenInfo.getTokenSymbol()) == null) {
                            tokenSymbol = "";
                        }
                        investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(values().getUnderlyingTokenList());
                        if (investTokenWithAmount != null && (tokenSymbol2 = investTokenWithAmount.getTokenSymbol()) != null) {
                            str = tokenSymbol2;
                        }
                        InvestExchangeRateBean investExchangeRateBean = new InvestExchangeRateBean(exchangeRate, tokenSymbol, str);
                        InvestRedeemReceiveInfo investRedeemReceiveInfo17 = this.fetchVPNInfo;
                        InvestTokenWithAmount payWithToken = investRedeemReceiveInfo17 != null ? investRedeemReceiveInfo17.getPayWithToken() : null;
                        investRedeemReceiveInfo2 = this.fetchVPNInfo;
                        if (investRedeemReceiveInfo2 != null && (promptInformation = investRedeemReceiveInfo2.getPromptInformation()) != null) {
                            payWithTokenTip = promptInformation.getPayWithTokenTip();
                        }
                        mutableLiveDataDbNXlk2.setValue(new InvestRedeemReceiveInfoUIBean(false, platformLogo2, platformName2, (List) list, (List) receiveTokenList, false, Integer.valueOf(zsXlph()), investTipsBean2, investExchangeRateBean, payWithToken, (InvestTipInfoVo) payWithTokenTip, 32, (DefaultConstructorMarker) null));
                    } else {
                        int iAuCTelauCTel2 = AuCTelauCTel();
                        boolean zUeEOUB = UeEOUB();
                        boolean z3 = investTokenWithAmount6 != null;
                        InvestRedeemReceiveInfo investRedeemReceiveInfo18 = this.fetchVPNInfo;
                        Intrinsics.copydefault(investRedeemReceiveInfo18);
                        if (c27577jxn.AEQbTJ(iAuCTelauCTel2, zUeEOUB, z3, investRedeemReceiveInfo18.getSwapFromTokenList().size())) {
                            if (valueDeviationPercentage.length() > 0) {
                                InvestRedeemReceiveInfo investRedeemReceiveInfo19 = this.fetchVPNInfo;
                                Intrinsics.copydefault(investRedeemReceiveInfo19);
                                strJoinToString$default = c27577jxn.KWHzl(investRedeemReceiveInfo19.getReceiveTokenList());
                                i2 = 1;
                            } else {
                                i2 = 0;
                                strJoinToString$default = "";
                            }
                            InvestRedeemReceiveInfo investRedeemReceiveInfo20 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo20);
                            Pair<Boolean, List<InvestTokenWithAmount>> pairEZpvd = c27577jxn.EZpvd(investRedeemReceiveInfo20.getSwapFromTokenList());
                            if (pairEZpvd.getFirst().booleanValue()) {
                                strJoinToString$default2 = CollectionsKt___CollectionsKt.joinToString$default(pairEZpvd.getSecond(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.joy
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return InvestRedeemViewModel.gEmmrt((InvestTokenWithAmount) obj);
                                    }
                                }, 30, null);
                                i3 = 3;
                                strJoinToString$default = "";
                            } else {
                                i3 = i2;
                                strJoinToString$default2 = "";
                            }
                            InvestRedeemReceiveInfo investRedeemReceiveInfo21 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo21);
                            Pair<Boolean, List<InvestTokenWithAmount>> pairEZpvd2 = c27577jxn.EZpvd(investRedeemReceiveInfo21.getReceiveTokenList());
                            Intrinsics.copydefault(this.fetchVPNInfo);
                            if (!(!r13.getReceiveTokenList().isEmpty()) || !pairEZpvd2.getFirst().booleanValue()) {
                                strEZpvd = strJoinToString$default2;
                                i7 = i3;
                            } else if (i3 == 3) {
                                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(pairEZpvd2.getSecond(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.jov
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return InvestRedeemViewModel.AYXKKw((InvestTokenWithAmount) obj);
                                    }
                                }, 30, null);
                                strEZpvd = C27581jxr.EZpvd(pairEZpvd.getSecond(), pairEZpvd2.getSecond());
                            } else {
                                strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(pairEZpvd2.getSecond(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.jow
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return InvestRedeemViewModel.djBIcL((InvestTokenWithAmount) obj);
                                    }
                                }, 30, null);
                                i7 = 2;
                                strEZpvd = "";
                            }
                            this.DTwDnp = i7 != 0 ? new InvestTipsBean(i7, valueDeviationPercentage, strJoinToString$default, strEZpvd) : null;
                        } else {
                            z = false;
                            strEZpvd = "";
                            investRedeemReceiveInfo = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo);
                            if (true ^ investRedeemReceiveInfo.getSafeMoonTokenList().isEmpty()) {
                                InvestRedeemReceiveInfo investRedeemReceiveInfo132 = this.fetchVPNInfo;
                                Intrinsics.copydefault(investRedeemReceiveInfo132);
                                this.DTwDnp = new InvestTipsBean(5, valueDeviationPercentage, CollectionsKt___CollectionsKt.joinToString$default(investRedeemReceiveInfo132.getSafeMoonTokenList(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.joD
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return InvestRedeemViewModel.valueOf((InvestTokenWithAmount) obj);
                                    }
                                }, 30, null), strEZpvd);
                            }
                            MutableLiveData<InvestRedeemReceiveInfoUIBean> mutableLiveDataDbNXlk22 = DbNXlk();
                            String platformLogo22 = values().getPlatformLogo();
                            String platformName22 = values().getPlatformName();
                            if (z) {
                            }
                            List<InvestTokenWithAmount> list2 = listAhwBna2;
                            InvestRedeemReceiveInfo investRedeemReceiveInfo152 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo152);
                            List<InvestTokenWithAmount> receiveTokenList2 = investRedeemReceiveInfo152.getReceiveTokenList();
                            investTipsBean = this.DTwDnp;
                            if (investTipsBean == null) {
                            }
                            InvestTipsBean investTipsBean22 = investTipsBean;
                            InvestRedeemReceiveInfo investRedeemReceiveInfo162 = this.fetchVPNInfo;
                            Intrinsics.copydefault(investRedeemReceiveInfo162);
                            String exchangeRate2 = investRedeemReceiveInfo162.getExchangeRate();
                            lpTokenInfo = values().getLpTokenInfo();
                            if (lpTokenInfo == null) {
                                tokenSymbol = "";
                            }
                            investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(values().getUnderlyingTokenList());
                            if (investTokenWithAmount != null) {
                                str = tokenSymbol2;
                            }
                            InvestExchangeRateBean investExchangeRateBean2 = new InvestExchangeRateBean(exchangeRate2, tokenSymbol, str);
                            InvestRedeemReceiveInfo investRedeemReceiveInfo172 = this.fetchVPNInfo;
                            if (investRedeemReceiveInfo172 != null) {
                            }
                            investRedeemReceiveInfo2 = this.fetchVPNInfo;
                            if (investRedeemReceiveInfo2 != null) {
                                payWithTokenTip = promptInformation.getPayWithTokenTip();
                            }
                            mutableLiveDataDbNXlk22.setValue(new InvestRedeemReceiveInfoUIBean(false, platformLogo22, platformName22, (List) list2, (List) receiveTokenList2, false, Integer.valueOf(zsXlph()), investTipsBean22, investExchangeRateBean2, payWithToken, (InvestTipInfoVo) payWithTokenTip, 32, (DefaultConstructorMarker) null));
                        }
                    }
                    i6 = i7;
                    z = true;
                    investRedeemReceiveInfo = this.fetchVPNInfo;
                    Intrinsics.copydefault(investRedeemReceiveInfo);
                    if (true ^ investRedeemReceiveInfo.getSafeMoonTokenList().isEmpty()) {
                    }
                    MutableLiveData<InvestRedeemReceiveInfoUIBean> mutableLiveDataDbNXlk222 = DbNXlk();
                    String platformLogo222 = values().getPlatformLogo();
                    String platformName222 = values().getPlatformName();
                    if (z) {
                    }
                    List<InvestTokenWithAmount> list22 = listAhwBna2;
                    InvestRedeemReceiveInfo investRedeemReceiveInfo1522 = this.fetchVPNInfo;
                    Intrinsics.copydefault(investRedeemReceiveInfo1522);
                    List<InvestTokenWithAmount> receiveTokenList22 = investRedeemReceiveInfo1522.getReceiveTokenList();
                    investTipsBean = this.DTwDnp;
                    if (investTipsBean == null) {
                    }
                    InvestTipsBean investTipsBean222 = investTipsBean;
                    InvestRedeemReceiveInfo investRedeemReceiveInfo1622 = this.fetchVPNInfo;
                    Intrinsics.copydefault(investRedeemReceiveInfo1622);
                    String exchangeRate22 = investRedeemReceiveInfo1622.getExchangeRate();
                    lpTokenInfo = values().getLpTokenInfo();
                    if (lpTokenInfo == null) {
                    }
                    investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(values().getUnderlyingTokenList());
                    if (investTokenWithAmount != null) {
                    }
                    InvestExchangeRateBean investExchangeRateBean22 = new InvestExchangeRateBean(exchangeRate22, tokenSymbol, str);
                    InvestRedeemReceiveInfo investRedeemReceiveInfo1722 = this.fetchVPNInfo;
                    if (investRedeemReceiveInfo1722 != null) {
                    }
                    investRedeemReceiveInfo2 = this.fetchVPNInfo;
                    if (investRedeemReceiveInfo2 != null) {
                    }
                    mutableLiveDataDbNXlk222.setValue(new InvestRedeemReceiveInfoUIBean(false, platformLogo222, platformName222, (List) list22, (List) receiveTokenList22, false, Integer.valueOf(zsXlph()), investTipsBean222, investExchangeRateBean22, payWithToken, (InvestTipInfoVo) payWithTokenTip, 32, (DefaultConstructorMarker) null));
                }
                break;
        }
    }

    public static final CharSequence gEmmrt(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    public static final CharSequence AYXKKw(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    public static final CharSequence djBIcL(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    public static final CharSequence valueOf(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    @Override // o.AbstractC27165jpz
    public void EZpvd(int i) {
        InvestGasPriceConfig value;
        List<InvestTokenWithAmount> safeMoonTokenList;
        super.EZpvd(i);
        KWHzl(false);
        if (i == 2 && (value = OLrzqt().getValue()) != null && value.getInvestSlippage() != null) {
            String first = OLrzqt(OLrzqt().getValue()).getFirst();
            InvestRedeemReceiveInfo investRedeemReceiveInfo = this.fetchVPNInfo;
            if (investRedeemReceiveInfo != null && (safeMoonTokenList = investRedeemReceiveInfo.getSafeMoonTokenList()) != null && C33129mqd.KWHzl((Collection) safeMoonTokenList) && OLrzqt(OLrzqt().getValue()).getSecond().booleanValue()) {
                InvestRedeemReceiveInfo investRedeemReceiveInfo2 = this.fetchVPNInfo;
                Intrinsics.copydefault(investRedeemReceiveInfo2);
                EZpvd(C33069mpW.OLrzqt(C33070mpX.AYXKKw(C25493ixk.FragmentManager.RLmrWm), C56424yEw.gEmmrt(C56390yDp.OLrzqt("tokenSymbol", CollectionsKt___CollectionsKt.joinToString$default(investRedeemReceiveInfo2.getSafeMoonTokenList(), C33070mpX.AYXKKw(C25493ixk.FragmentManager.DcqEDu), null, null, 0, null, new Function1() { // from class: o.joC
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return InvestRedeemViewModel.AhwBna((InvestTokenWithAmount) obj);
                    }
                }, 30, null)), C56390yDp.OLrzqt("slippageTolerance", C27492jwH.OLrzqt.gEmmrt(first)))));
            }
        }
        InvestRedeemInitialInfo investRedeemInitialInfoValues = values();
        MutableLiveData<C23953iPl> mutableLiveDataAwvSrB = AwvSrB();
        String network = investRedeemInitialInfoValues.getNetwork();
        String networkLogo = investRedeemInitialInfoValues.getNetworkLogo();
        String strDTwDnp = OLrzqt().getValue() != null ? DTwDnp() : "";
        InvestGasPriceConfig value2 = OLrzqt().getValue();
        String strQKVWgx = (value2 != null ? value2.getInvestSlippage() : null) != null ? QKVWgx() : "";
        InvestGasPriceConfig value3 = OLrzqt().getValue();
        mutableLiveDataAwvSrB.setValue(new C23953iPl(i, true, network, networkLogo, strDTwDnp, strQKVWgx, value3 != null ? Boolean.valueOf(C27505jwU.OLrzqt(value3)) : null, QbewEr(), QUSxYX(), RJOkX()));
    }

    public static final CharSequence AhwBna(InvestTokenWithAmount investTokenWithAmount) {
        Intrinsics.checkNotNullParameter(investTokenWithAmount, "");
        return investTokenWithAmount.getTokenSymbol();
    }

    @Override // o.AbstractC27165jpz
    public long EZpvd() {
        return values().getChainId();
    }

    private final void AEQbTJ(int i) {
        switch (i) {
            case 0:
            case 1:
            case 4:
            case 5:
                this.AuCTel.setValue(new C23950iPi(false, false, 2, null));
                break;
            case 2:
                InvestRedeemReceiveInfo investRedeemReceiveInfo = this.fetchVPNInfo;
                if (investRedeemReceiveInfo != null) {
                    Intrinsics.copydefault(investRedeemReceiveInfo);
                    if (!investRedeemReceiveInfo.isAllowRedeem()) {
                        this.AuCTel.setValue(new C23950iPi(false, false, 2, null));
                    }
                }
                this.AuCTel.setValue(new C23950iPi(true, false, 2, null));
                break;
            case 3:
                this.AuCTel.setValue(new C23950iPi(false, true));
                break;
            case 6:
                this.AuCTel.setValue(new C23950iPi(false, false, 2, null));
                break;
        }
    }

    private final void OLrzqt(int i) {
        List<TransactionStep> transactionStepList;
        switch (i) {
            case 0:
                this.AhwBna.setValue(new Triple<>(2, this.fetchVPNInfo, 0));
                break;
            case 1:
            case 4:
            case 5:
                this.AhwBna.setValue(new Triple<>(1, this.fetchVPNInfo, 0));
                break;
            case 2:
                InvestRedeemReceiveInfo investRedeemReceiveInfo = this.fetchVPNInfo;
                if (investRedeemReceiveInfo != null) {
                    Intrinsics.copydefault(investRedeemReceiveInfo);
                    if (!investRedeemReceiveInfo.isAllowRedeem()) {
                        this.AhwBna.setValue(new Triple<>(0, this.fetchVPNInfo, 2));
                    } else if (QVAiDq()) {
                        this.AhwBna.setValue(new Triple<>(1, this.fetchVPNInfo, 0));
                    } else {
                        this.AhwBna.setValue(new Triple<>(0, this.fetchVPNInfo, 0));
                    }
                }
                break;
            case 3:
                this.AhwBna.setValue(new Triple<>(0, null, 3));
                break;
            case 6:
                this.AhwBna.setValue(new Triple<>(0, null, 2));
                break;
        }
        InvestRedeemReceiveInfo investRedeemReceiveInfo2 = this.fetchVPNInfo;
        if (investRedeemReceiveInfo2 == null || (transactionStepList = investRedeemReceiveInfo2.getTransactionStepList()) == null) {
            return;
        }
        OLrzqt(transactionStepList);
    }

    private final boolean copydefault(String str) {
        return C33129mqd.AEQbTJ(str, 0);
    }

    public final boolean AEQbTJ() {
        return zLjUOn() != null;
    }

    public final boolean AEQbTJ(String str) {
        return zLjUOn() != null && C33129mqd.AEQbTJ(str, zLjUOn());
    }

    private final void iwGUEr() {
        InvestTipInfoVo investmentInfoTip;
        PromptInformation promptInformation = values().getPromptInformation();
        InvestTipInfoVo investTipInfoVoCopy = null;
        if ((promptInformation != null ? promptInformation.getInvestmentInfoTip() : null) != null) {
            PromptInformation promptInformation2 = values().getPromptInformation();
            if (promptInformation2 != null && (investmentInfoTip = promptInformation2.getInvestmentInfoTip()) != null) {
                investTipInfoVoCopy = investmentInfoTip.copy((1022 & 1) != 0 ? investmentInfoTip.clickAction : InvestClickActionType.NO_ACTION, (1022 & 2) != 0 ? investmentInfoTip.customRedirectData : null, (1022 & 4) != 0 ? investmentInfoTip.hoverOnData : null, (1022 & 8) != 0 ? investmentInfoTip.popUpData : null, (1022 & 16) != 0 ? investmentInfoTip.redirectData : null, (1022 & 32) != 0 ? investmentInfoTip.tipContent : null, (1022 & 64) != 0 ? investmentInfoTip.type : null, (1022 & 128) != 0 ? investmentInfoTip.disappearAfterInput : false, (1022 & 256) != 0 ? investmentInfoTip.title : null, (1022 & 512) != 0 ? investmentInfoTip.contentType : null);
            }
            AEQbTJ("", 7, investTipInfoVoCopy);
            return;
        }
        setCoinMessage$default(this, "", 0, null, 6, null);
    }

    public final Integer isConnected() {
        return values().getInputPrecision();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C33050mpD.OLrzqt(this.fJNWhG);
        if (call().isDisposed() || call().KWHzl() <= 0) {
            return;
        }
        call().dispose();
    }

    @Override // o.AbstractC27165jpz
    public void uzCIH() {
        if (Intrinsics.EZpvd(this.AkhnZx.getValue(), Boolean.TRUE)) {
            RcXXUw();
        } else {
            OLrzqt(true);
        }
    }

    @Override // o.AbstractC27165jpz
    public void getFieldNames() {
        fIwbmz();
    }

    @Override // o.AbstractC27165jpz
    public void hDKMBd() {
        getReceiveInfoAndCheckState$default(this, false, 1, null);
    }

    public final void fIwbmz() {
        this.sSMYrx.dispose();
        this.AwvSrB.dispose();
        this.AwvSrB.releaseLoop();
    }

    public static /* synthetic */ void submitTransaction$default(InvestRedeemViewModel investRedeemViewModel, Context context, ActivityResultLauncher activityResultLauncher, boolean z, InvestTokenWithApprove investTokenWithApprove, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            investTokenWithApprove = null;
        }
        investRedeemViewModel.OLrzqt(context, (ActivityResultLauncher<Intent>) activityResultLauncher, z, investTokenWithApprove);
    }

    public final void OLrzqt(@NotNull final Context context, ActivityResultLauncher<Intent> activityResultLauncher, boolean z, final InvestTokenWithApprove investTokenWithApprove) {
        Integer orderType;
        Intrinsics.checkNotNullParameter(context, "");
        if (z) {
            InvestTradeManager.submitTransaction$default(InvestTradeManager.OLrzqt, context, EZpvd((investTokenWithApprove == null || (orderType = investTokenWithApprove.getOrderType()) == null) ? InvestAction.RedeemApprove.getValue() : orderType.intValue(), true, investTokenWithApprove), null, new yHO() { // from class: o.joG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InvestRedeemViewModel.AEQbTJ(this.copydefault, investTokenWithApprove, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
                }
            }, 4, null);
        } else {
            yBK.EZpvd(yBI.subscribeBy$default(C25592izd.OLrzqt.AEQbTJ(AubY(), wlaJM(), this.fARcdN), new Function1() { // from class: o.jox
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestRedeemViewModel.OLrzqt(this.AEQbTJ, (java.lang.Throwable) obj);
                }
            }, (Function0) null, new Function1() { // from class: o.joz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return InvestRedeemViewModel.copydefault(context, this, investTokenWithApprove, (ResponseData) obj);
                }
            }, 2, (Object) null), call());
        }
    }

    public static final Unit AEQbTJ(InvestRedeemViewModel investRedeemViewModel, InvestTokenWithApprove investTokenWithApprove, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        investRedeemViewModel.KWHzl.setValue(new ActionBar(investTokenWithApprove, i, bundle));
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(InvestRedeemViewModel investRedeemViewModel, Throwable th) {
        JsonPrimitive asJsonPrimitive;
        Intrinsics.checkNotNullParameter(th, "");
        String asString = null;
        if (th instanceof OKServerException) {
            OKServerException oKServerException = (OKServerException) th;
            int code = oKServerException.getCode();
            JsonObject response = oKServerException.getResponse();
            if (response != null && (asJsonPrimitive = response.getAsJsonPrimitive(EopTrackEvent.KEY_ERROR_MESSAGE)) != null) {
                asString = asJsonPrimitive.getAsString();
            }
            investRedeemViewModel.EZpvd(code, asString);
        } else {
            investRedeemViewModel.KWHzl((String) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(InvestRedeemViewModel investRedeemViewModel, int i, Bundle bundle, InvestTradeManager.TransactionResultExtraData transactionResultExtraData) {
        Intrinsics.checkNotNullParameter(transactionResultExtraData, "");
        investRedeemViewModel.QUSxYX.setValue(new RedeemResult(i, bundle, transactionResultExtraData));
        return Unit.INSTANCE;
    }

    public final void EZpvd(int i, String str) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestRedeemViewModel$handleCheckRedeemAllowError$1(i, this, str, null), 3, null);
    }

    public final void KWHzl(String str) {
        if (str == null || str.length() == 0) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        } else {
            C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
        }
    }

    public static /* synthetic */ InvestTxModel genInvestTxModel$default(InvestRedeemViewModel investRedeemViewModel, int i, boolean z, InvestTokenWithApprove investTokenWithApprove, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            investTokenWithApprove = null;
        }
        return investRedeemViewModel.EZpvd(i, z, investTokenWithApprove);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InvestTxModel EZpvd(int i, boolean z, InvestTokenWithApprove investTokenWithApprove) {
        long j;
        List listAhwBna;
        String str;
        ArrayList arrayList;
        InvestTokenWithAmount investTokenWithAmount;
        List listEZpvd;
        InvestTokenWithAmount mySupply;
        Object next;
        List list;
        String estimateGasFee;
        List<InvestTokenWithApprove> approveStatusList;
        List<InvestTokenWithAmount> receiveTokenList;
        List<InvestTokenWithAmount> receiveTokenList2;
        String inputCurrencyAmount;
        String strZuBGHE = zuBGHE();
        String strWlaJM = wlaJM();
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(AubY()));
        long chainId = values().getChainId();
        InvestRedeemReceiveInfo investRedeemReceiveInfo = this.fetchVPNInfo;
        String str2 = (investRedeemReceiveInfo == null || (inputCurrencyAmount = investRedeemReceiveInfo.getInputCurrencyAmount()) == null) ? "" : inputCurrencyAmount;
        InvestRedeemReceiveInfo investRedeemReceiveInfo2 = this.fetchVPNInfo;
        if (investRedeemReceiveInfo2 == null || (receiveTokenList2 = investRedeemReceiveInfo2.getReceiveTokenList()) == null) {
            j = chainId;
            listAhwBna = yDY.AhwBna();
        } else {
            ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(receiveTokenList2, 10));
            for (InvestTokenWithAmount investTokenWithAmount2 : receiveTokenList2) {
                InvestTokenWithAmount investTokenWithAmountCopy = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
                arrayList2.add(investTokenWithAmountCopy);
                chainId = chainId;
            }
            j = chainId;
            listAhwBna = arrayList2;
        }
        InvestRedeemReceiveInfo investRedeemReceiveInfo3 = this.fetchVPNInfo;
        if (investRedeemReceiveInfo3 == null || (receiveTokenList = investRedeemReceiveInfo3.getReceiveTokenList()) == null) {
            str = str2;
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(receiveTokenList, 10));
            for (InvestTokenWithAmount investTokenWithAmount3 : receiveTokenList) {
                InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount3.copy((268435455 & 1) != 0 ? investTokenWithAmount3.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount3.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount3.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount3.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount3.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount3.network : null, (268435455 & 64) != 0 ? investTokenWithAmount3.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount3.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount3.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount3.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount3.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount3.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount3.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount3.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount3.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount3.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount3.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount3.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount3.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount3.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount3.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount3.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount3.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount3.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount3.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount3.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount3.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount3.tokenPrice : null);
                investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
                arrayList3.add(investTokenWithAmountCopy2);
                str2 = str2;
            }
            str = str2;
            arrayList = arrayList3;
        }
        if (z) {
            InvestRedeemReceiveInfo investRedeemReceiveInfo4 = this.fetchVPNInfo;
            if (investRedeemReceiveInfo4 == null || (approveStatusList = investRedeemReceiveInfo4.getApproveStatusList()) == null) {
                listEZpvd = yDY.AhwBna();
            } else {
                ArrayList arrayList4 = new ArrayList(C56403yEb.AYXKKw(approveStatusList, 10));
                for (InvestTokenWithApprove investTokenWithApprove2 : approveStatusList) {
                    arrayList4.add(new InvestTokenWithAmount(investTokenWithApprove2.getChainId(), (String) null, (String) null, false, false, (String) null, investTokenWithApprove2.getTokenAddress(), (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435390, (DefaultConstructorMarker) null));
                }
                list = arrayList4;
                String strEZpvd = OcIXYQ().EZpvd(String.valueOf(values().getChainId()));
                String strAxsJAY = AxsJAY();
                InvestGasPriceConfig value = OLrzqt().getValue();
                String str3 = (value != null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
                String strSSMYrx = sSMYrx();
                String first = OLrzqt(OLrzqt().getValue()).getFirst();
                String json = new Gson().toJson(copydefault(investTokenWithApprove));
                Intrinsics.checkNotNullExpressionValue(json, "");
                boolean z2 = this.hDKMBd;
                InvestOrder investOrderAkhnZx = AkhnZx();
                Map<String, String> redeemExtra = investOrderAkhnZx == null ? investOrderAkhnZx.getRedeemExtra() : null;
                InterfaceC9738bbJ interfaceC9738bbJOLrzqt = C23580iBq.AEQbTJ.OLrzqt();
                return new InvestTxModel(i, strZuBGHE, strWlaJM, listEZpvd2, (Long) null, j, str, listAhwBna, (List) arrayList, (List) null, list, strEZpvd, strAxsJAY, str3, strSSMYrx, first, json, z2 ? 1 : 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) redeemExtra, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, interfaceC9738bbJOLrzqt != null ? interfaceC9738bbJOLrzqt.EZpvd(wlaJM()) : null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -33816048, 65519, (DefaultConstructorMarker) null);
            }
        } else {
            InvestRedeemReceiveInfo investRedeemReceiveInfo5 = this.fetchVPNInfo;
            if (investRedeemReceiveInfo5 == null || (mySupply = investRedeemReceiveInfo5.getMySupply()) == null || (investTokenWithAmount = mySupply.copy((268435455 & 1) != 0 ? mySupply.chainId : 0L, (268435455 & 2) != 0 ? mySupply.coinAmount : null, (268435455 & 4) != 0 ? mySupply.currencyAmount : null, (268435455 & 8) != 0 ? mySupply.depositTips : false, (268435455 & 16) != 0 ? mySupply.isBaseToken : false, (268435455 & 32) != 0 ? mySupply.network : null, (268435455 & 64) != 0 ? mySupply.tokenAddress : null, (268435455 & 128) != 0 ? mySupply.tokenLogo : null, (268435455 & 256) != 0 ? mySupply.tokenName : null, (268435455 & 512) != 0 ? mySupply.tokenSymbol : null, (268435455 & 1024) != 0 ? mySupply.tokenPrecision : null, (268435455 & 2048) != 0 ? mySupply.browserUrl : null, (268435455 & 4096) != 0 ? mySupply.tokenId : null, (268435455 & 8192) != 0 ? mySupply.isCanClaim : null, (268435455 & 16384) != 0 ? mySupply.buttonType : null, (268435455 & 32768) != 0 ? mySupply.expectTokenAddress : null, (268435455 & 65536) != 0 ? mySupply.transferableBalance : null, (268435455 & 131072) != 0 ? mySupply.dataType : null, (268435455 & 262144) != 0 ? mySupply.availableClaimTime : null, (268435455 & 524288) != 0 ? mySupply.collectionDeadLine : null, (268435455 & 1048576) != 0 ? mySupply.availableClaimType : 0, (268435455 & 2097152) != 0 ? mySupply.minInvestAmount : null, (268435455 & 4194304) != 0 ? mySupply.originalInvestmentId : null, (268435455 & 8388608) != 0 ? mySupply.originalProductType : null, (268435455 & 16777216) != 0 ? mySupply.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? mySupply.safeMinAmount : null, (268435455 & 67108864) != 0 ? mySupply.safeMaxAmount : null, (268435455 & 134217728) != 0 ? mySupply.tokenPrice : null)) == null) {
                investTokenWithAmount = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
            } else {
                investTokenWithAmount.setCoinAmount(C33129mqd.mulS$default(this.fARcdN, Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount.getTokenPrecision()))), null, null, null, 14, null));
                InvestRedeemReceiveInfo investRedeemReceiveInfo6 = this.fetchVPNInfo;
                Intrinsics.copydefault(investRedeemReceiveInfo6);
                investTokenWithAmount.setCurrencyAmount(investRedeemReceiveInfo6.getInputCurrencyAmount());
                InvestRedeemReceiveInfo investRedeemReceiveInfo7 = this.fetchVPNInfo;
                Intrinsics.copydefault(investRedeemReceiveInfo7);
                Iterator<T> it = investRedeemReceiveInfo7.getTokenInfoList().iterator();
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
                Unit unit = Unit.INSTANCE;
            }
            listEZpvd = C56402yEa.EZpvd(investTokenWithAmount);
        }
        list = listEZpvd;
        String strEZpvd2 = OcIXYQ().EZpvd(String.valueOf(values().getChainId()));
        String strAxsJAY2 = AxsJAY();
        InvestGasPriceConfig value2 = OLrzqt().getValue();
        if (value2 != null) {
        }
        String strSSMYrx2 = sSMYrx();
        String first2 = OLrzqt(OLrzqt().getValue()).getFirst();
        String json2 = new Gson().toJson(copydefault(investTokenWithApprove));
        Intrinsics.checkNotNullExpressionValue(json2, "");
        boolean z22 = this.hDKMBd;
        InvestOrder investOrderAkhnZx2 = AkhnZx();
        if (investOrderAkhnZx2 == null) {
        }
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt2 = C23580iBq.AEQbTJ.OLrzqt();
        return new InvestTxModel(i, strZuBGHE, strWlaJM, listEZpvd2, (Long) null, j, str, listAhwBna, (List) arrayList, (List) null, list, strEZpvd2, strAxsJAY2, str3, strSSMYrx2, first2, json2, z22 ? 1 : 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) redeemExtra, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, (String) null, (String) null, interfaceC9738bbJOLrzqt2 != null ? interfaceC9738bbJOLrzqt2.EZpvd(wlaJM()) : null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, -33816048, 65519, (DefaultConstructorMarker) null);
    }

    private final InvestTransactionParam copydefault(InvestTokenWithApprove investTokenWithApprove) {
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(AubY()));
        String str = this.fARcdN;
        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(this.ORxRYg);
        return new InvestTransactionParam(C56402yEa.EZpvd(new InvestInputData(str, investTokenWithAmount != null ? investTokenWithAmount.getTokenAddress() : null, investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, false, this.hDKMBd, 8, (DefaultConstructorMarker) null)), UeEOUB(), false, values().getChainId(), Integer.valueOf(values().getInvestType().getValue()), values().getAnalysisPlatformId(), (String) null, listEZpvd, (Long) null, (Integer) null, (String) null, (Integer) null, (Integer) null, (InvestPoolV3) null, (Integer) null, (Boolean) null, 65348, (DefaultConstructorMarker) null);
    }

    private final void OLrzqt(List<TransactionStep> list) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestRedeemViewModel$reloadCTAButton$1(this, list, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.invest_biz.ui.viewmodel.InvestRedeemViewModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refreshDataFirst$default(InvestRedeemViewModel investRedeemViewModel, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 2) != 0) {
            function02 = null;
        }
        investRedeemViewModel.OLrzqt((Function0<Unit>) function0, (Function0<Unit>) function02);
    }

    public final void OLrzqt(Function0<Unit> function0, Function0<Unit> function02) {
        getReceiveInfoAndCheckState$default(this, false, 1, null);
        InvestRedeemReceiveInfo investRedeemReceiveInfo = this.fetchVPNInfo;
        if (investRedeemReceiveInfo == null || !investRedeemReceiveInfo.isAllowRedeem()) {
            if (function02 != null) {
                function02.invoke();
            }
        } else if (function0 != null) {
            function0.invoke();
        }
    }

    public final void getNewProxyInstance() {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestRedeemViewModel$settleTransaction$1(this, null), 3, null);
    }

    public final InvestTxModel copydefault(TransactionConfig transactionConfig, InvestRedeemReceiveInfo investRedeemReceiveInfo, TransactionStep transactionStep, String str) {
        Object next;
        List listEZpvd;
        String estimateGasFee;
        int iValueOf = transactionStep.valueOf();
        String strZuBGHE = zuBGHE();
        String strWlaJM = wlaJM();
        List listEZpvd2 = C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        String inputCurrencyAmount = investRedeemReceiveInfo.getInputCurrencyAmount();
        List<InvestTokenWithAmount> receiveTokenList = investRedeemReceiveInfo.getReceiveTokenList();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(receiveTokenList, 10));
        for (InvestTokenWithAmount investTokenWithAmount : receiveTokenList) {
            InvestTokenWithAmount investTokenWithAmountCopy = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
            investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
            arrayList.add(investTokenWithAmountCopy);
            jCopydefault = jCopydefault;
        }
        long j = jCopydefault;
        List<InvestTokenWithAmount> receiveTokenList2 = investRedeemReceiveInfo.getReceiveTokenList();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(receiveTokenList2, 10));
        for (InvestTokenWithAmount investTokenWithAmount2 : receiveTokenList2) {
            InvestTokenWithAmount investTokenWithAmountCopy2 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
            investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
            arrayList2.add(investTokenWithAmountCopy2);
            inputCurrencyAmount = inputCurrencyAmount;
        }
        String str2 = inputCurrencyAmount;
        if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
            List<TransactionStep> transactionStepList = investRedeemReceiveInfo.getTransactionStepList();
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
            InvestTokenWithAmount mySupply = investRedeemReceiveInfo.getMySupply();
            InvestTokenWithAmount investTokenWithAmountCopy3 = mySupply.copy((268435455 & 1) != 0 ? mySupply.chainId : 0L, (268435455 & 2) != 0 ? mySupply.coinAmount : null, (268435455 & 4) != 0 ? mySupply.currencyAmount : null, (268435455 & 8) != 0 ? mySupply.depositTips : false, (268435455 & 16) != 0 ? mySupply.isBaseToken : false, (268435455 & 32) != 0 ? mySupply.network : null, (268435455 & 64) != 0 ? mySupply.tokenAddress : null, (268435455 & 128) != 0 ? mySupply.tokenLogo : null, (268435455 & 256) != 0 ? mySupply.tokenName : null, (268435455 & 512) != 0 ? mySupply.tokenSymbol : null, (268435455 & 1024) != 0 ? mySupply.tokenPrecision : null, (268435455 & 2048) != 0 ? mySupply.browserUrl : null, (268435455 & 4096) != 0 ? mySupply.tokenId : null, (268435455 & 8192) != 0 ? mySupply.isCanClaim : null, (268435455 & 16384) != 0 ? mySupply.buttonType : null, (268435455 & 32768) != 0 ? mySupply.expectTokenAddress : null, (268435455 & 65536) != 0 ? mySupply.transferableBalance : null, (268435455 & 131072) != 0 ? mySupply.dataType : null, (268435455 & 262144) != 0 ? mySupply.availableClaimTime : null, (268435455 & 524288) != 0 ? mySupply.collectionDeadLine : null, (268435455 & 1048576) != 0 ? mySupply.availableClaimType : 0, (268435455 & 2097152) != 0 ? mySupply.minInvestAmount : null, (268435455 & 4194304) != 0 ? mySupply.originalInvestmentId : null, (268435455 & 8388608) != 0 ? mySupply.originalProductType : null, (268435455 & 16777216) != 0 ? mySupply.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? mySupply.safeMinAmount : null, (268435455 & 67108864) != 0 ? mySupply.safeMaxAmount : null, (268435455 & 134217728) != 0 ? mySupply.tokenPrice : null);
            investTokenWithAmountCopy3.setCoinAmount(C33129mqd.mulS$default(str, Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy3.getTokenPrecision()))), null, null, null, 14, null));
            investTokenWithAmountCopy3.setCurrencyAmount(investRedeemReceiveInfo.getInputCurrencyAmount());
            Iterator<T> it = investRedeemReceiveInfo.getTokenInfoList().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C59449zhJ.gEmmrt(((ExpectTokenInfo) next).getTokenAddress(), investTokenWithAmountCopy3.getTokenAddress(), true)) {
                    break;
                }
            }
            ExpectTokenInfo expectTokenInfo = (ExpectTokenInfo) next;
            investTokenWithAmountCopy3.setExpectTokenAddress(expectTokenInfo != null ? expectTokenInfo.getExpectTokenAddress() : null);
            Unit unit = Unit.INSTANCE;
            listEZpvd = C56402yEa.EZpvd(investTokenWithAmountCopy3);
        }
        List list = listEZpvd;
        String strEZpvd = OcIXYQ().EZpvd(String.valueOf(transactionConfig.copydefault()));
        String strAxsJAY = AxsJAY();
        InvestGasPriceConfig value = OLrzqt().getValue();
        String str3 = (value == null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
        String strSSMYrx = sSMYrx();
        String first = OLrzqt(OLrzqt().getValue()).getFirst();
        Gson gson = new Gson();
        InvestTransactionParam.Companion companion = InvestTransactionParam.Companion;
        InvestInputData[] investInputDataArr = new InvestInputData[1];
        InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(this.ORxRYg);
        investInputDataArr[0] = new InvestInputData(str, investTokenWithAmount3 != null ? investTokenWithAmount3.getTokenAddress() : null, transactionStep.gEmmrt(), false, this.hDKMBd, 8, (DefaultConstructorMarker) null);
        String json = gson.toJson(companion.OLrzqt(transactionConfig.AEQbTJ((33554427 & 1) != 0 ? transactionConfig.gEmmrt : 0, (33554427 & 2) != 0 ? transactionConfig.iwGUEr : 0, (33554427 & 4) != 0 ? transactionConfig.values : 0L, (33554427 & 8) != 0 ? transactionConfig.AkhnZx : false, (33554427 & 16) != 0 ? transactionConfig.fIwbmz : 0L, (33554427 & 32) != 0 ? transactionConfig.AEQbTJ : 0L, (33554427 & 64) != 0 ? transactionConfig.AuCTel : null, (33554427 & 128) != 0 ? transactionConfig.fARcdN : null, (33554427 & 256) != 0 ? transactionConfig.valueOf : yDY.copydefault(investInputDataArr), (33554427 & 512) != 0 ? transactionConfig.DbNXlk : 0, (33554427 & 1024) != 0 ? transactionConfig.hDKMBd : null, (33554427 & 2048) != 0 ? transactionConfig.OLrzqt : 0L, (33554427 & 4096) != 0 ? transactionConfig.AhwBna : 0, (33554427 & 8192) != 0 ? transactionConfig.uzCIH : null, (33554427 & 16384) != 0 ? transactionConfig.djBIcL : null, (33554427 & 32768) != 0 ? transactionConfig.getNewProxyInstance : null, (33554427 & 65536) != 0 ? transactionConfig.copydefault : null, (33554427 & 131072) != 0 ? transactionConfig.isConnected : null, (33554427 & 262144) != 0 ? transactionConfig.fJNWhG : false, (33554427 & 524288) != 0 ? transactionConfig.AYXKKw : false, (33554427 & 1048576) != 0 ? transactionConfig.EZpvd : null, (33554427 & 2097152) != 0 ? transactionConfig.KWHzl : null, (33554427 & 4194304) != 0 ? transactionConfig.fetchVPNInfo : false, (33554427 & 8388608) != 0 ? transactionConfig.getFieldNames : false, (33554427 & 16777216) != 0 ? transactionConfig.ejfBZ : null)));
        Intrinsics.checkNotNullExpressionValue(json, "");
        boolean z = this.hDKMBd;
        InvestOrder investOrderAkhnZx = AkhnZx();
        Map<String, String> redeemExtra = investOrderAkhnZx != null ? investOrderAkhnZx.getRedeemExtra() : null;
        String strOLrzqt = transactionStep.OLrzqt();
        String str4 = strOLrzqt.length() == 0 ? null : strOLrzqt;
        InterfaceC9738bbJ interfaceC9738bbJOLrzqt = C23580iBq.AEQbTJ.OLrzqt();
        return new InvestTxModel(iValueOf, strZuBGHE, strWlaJM, listEZpvd2, (Long) null, j, str2, (List) arrayList, (List) arrayList2, (List) null, list, strEZpvd, strAxsJAY, str3, strSSMYrx, first, json, z ? 1 : 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) redeemExtra, (String) null, (String) null, (String) null, (Integer) null, (Integer) null, (List) null, (Integer) null, (String) null, str4, (String) null, interfaceC9738bbJOLrzqt != null ? interfaceC9738bbJOLrzqt.EZpvd(wlaJM()) : null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, transactionConfig.fARcdN(), -33816048, 32747, (DefaultConstructorMarker) null);
    }

    public static final Unit copydefault(Context context, final InvestRedeemViewModel investRedeemViewModel, InvestTokenWithApprove investTokenWithApprove, ResponseData responseData) {
        Integer orderType;
        Intrinsics.checkNotNullParameter(responseData, "");
        if (responseData.getCode() == 0) {
            InvestTradeManager.submitTransaction$default(InvestTradeManager.OLrzqt, context, genInvestTxModel$default(investRedeemViewModel, (investTokenWithApprove == null || (orderType = investTokenWithApprove.getOrderType()) == null) ? InvestAction.Redeem.getValue() : orderType.intValue(), false, null, 4, null), null, new yHO() { // from class: o.jou
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHO
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return InvestRedeemViewModel.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (android.os.Bundle) obj2, (InvestTradeManager.TransactionResultExtraData) obj3);
                }
            }, 4, null);
        } else {
            investRedeemViewModel.EZpvd(responseData.getCode(), responseData.getErrorMsg());
        }
        return Unit.INSTANCE;
    }
}

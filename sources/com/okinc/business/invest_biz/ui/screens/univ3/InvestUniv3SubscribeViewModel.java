package com.okinc.business.invest_biz.ui.screens.univ3;

import android.os.Bundle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.gson.Gson;
import com.immomo.mls.fun.lt.SILoading;
import com.okinc.business.defi.api.bean.FromToken;
import com.okinc.business.defi.api.bean.NewCallbackBean;
import com.okinc.business.defi.api.bean.ReserveBean;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.invest_biz.data.bean.ButtonType;
import com.okinc.business.invest_biz.data.bean.InvestExchangeRateBean;
import com.okinc.business.invest_biz.data.bean.InvestGasPriceConfig;
import com.okinc.business.invest_biz.data.bean.InvestSlippageConfig;
import com.okinc.business.invest_biz.data.bean.InvestSubscriptionReceiveInfoUIBean;
import com.okinc.business.invest_biz.data.bean.InvestTipInfoVo;
import com.okinc.business.invest_biz.data.bean.InvestTipsBean;
import com.okinc.business.invest_biz.data.bean.InvestTokenType;
import com.okinc.business.invest_biz.data.bean.InvestTokenWithApprove;
import com.okinc.business.invest_biz.data.bean.InvestTransactionParam;
import com.okinc.business.invest_biz.data.bean.InvestTxModel;
import com.okinc.business.invest_biz.data.bean.InvestUniv3ChartData;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribePromptInformation;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeReceiveInfo;
import com.okinc.business.invest_biz.data.bean.response.TransactionStep;
import com.okinc.business.invest_biz.data.contants.BTCMode;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.logic.InvestTradeManager;
import com.okinc.business.invest_biz.data.logic.InvestUniv3SubscribeReceiveInfoHandle;
import com.okinc.business.invest_biz.data.logic.ResponseState;
import com.okinc.business.invest_biz.data.logic.ResponseStateType;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestInputData;
import com.okinc.business.invest_biz.data.logic.ws.bean.InvestPoolV3;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.bean.InvestConsumeData;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionStage;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.SwapSlippageActivity;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.YieldState;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapMode;
import com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel;
import com.okinc.network.okg.response.ResponseData;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC33073mpa;
import o.AbstractC58185ywX;
import o.C23948iPg;
import o.C23953iPl;
import o.C23954iPm;
import o.C23956iPo;
import o.C23957iPp;
import o.C23958iPq;
import o.C23962iPu;
import o.C23965iPx;
import o.C25471ixO;
import o.C25480ixX;
import o.C25493ixk;
import o.C25595izg;
import o.C27019jnL;
import o.C27024jnQ;
import o.C27042jni;
import o.C27164jpy;
import o.C27315jsq;
import o.C27492jwH;
import o.C27493jwI;
import o.C27505jwU;
import o.C33070mpX;
import o.C33129mqd;
import o.C56390yDp;
import o.C56391yDq;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56444yFp;
import o.C59449zhJ;
import o.C9917bed;
import o.InterfaceC23916iOb;
import o.InterfaceC24173iXp;
import o.InterfaceC27095joi;
import o.InterfaceC27096joj;
import o.InterfaceC27531jwu;
import o.InterfaceC56445yFq;
import o.InterfaceC58184ywW;
import o.InterfaceC58187ywZ;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.iCH;
import o.iCP;
import o.iXD;
import o.iXH;
import o.iXN;
import o.pUU;
import o.yCM;
import o.yDY;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class InvestUniv3SubscribeViewModel extends AbstractC33073mpa implements InterfaceC27096joj, InterfaceC27095joi, C27042jni.TaskDescription, InterfaceC27531jwu {
    public String AEQbTJ;
    public InvestUniv3SubscribeReceiveInfo AYXKKw;
    public long AhwBna;
    public Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> AkhnZx;
    public ResponseState AuCTel;
    public final MutableLiveData<Boolean> AuCTelauCTel;
    public InvestTokenWithAmount AubY;
    public final MutableLiveData<InvestSubscriptionReceiveInfoUIBean> AwvSrB;
    public C27164jpy AxsJAY;
    public MutableLiveData<ResponseState> AxsJAYaxsJAY;
    public boolean AxsJAYsNCnLh;
    public String DAIeex;
    public MutableLiveData<Pair<String, String>> DCJXGO;
    public MutableLiveData<C23953iPl> DCUTEI;
    public String DLWbHP;
    public boolean DTwDnp;
    public SwapSlippageActivity.SlippageMode DXXBbs;
    public InvestTokenWithAmount DarRvM;
    public InvestUniv3SubscribeReceiveInfo DbNXlk;
    public MutableStateFlow<InterfaceC24173iXp> EZpvd;
    public MutableLiveData<InvestConsumeData<Boolean>> KWHzl;
    public final MutableStateFlow<C23957iPp> OBJEWx;
    public int ODWQjV;
    public MutableLiveData<C27019jnL> ODXsMY;
    public InvestTokenWithAmount OFhtUX;
    public InvestTokenWithAmount OHqIaq;
    public final MutableSharedFlow<iXD> OLrzqt;
    public boolean ORxRYg;
    public boolean OcIXYQ;
    public String OqFWZa;
    public final SharedFlow<iXD> OuxcSI;
    public MutableLiveData<C27019jnL> OxVOHk;
    public InvestTokenWithAmount QCjLjM;
    public MutableLiveData<C23954iPm> QHmsKR;
    public boolean QKVWgx;
    public MutableLiveData<Boolean> QKudOq;
    public boolean QOLQEE;
    public final MutableLiveData<C23965iPx> QSBOWP;
    public final MutableStateFlow<Boolean> QUSxYX;
    public final MutableSharedFlow<C27315jsq> QVAiDq;
    public C27315jsq QbewEr;
    public MutableLiveData<C23948iPg> QfsBiF;
    public final MutableStateFlow<C23956iPo> QkdxfA;
    public final Function1<C9917bed, Unit> RJOkX;
    public final MutableStateFlow<C23962iPu> RKDWNf;
    public final MutableStateFlow<C25480ixX> RcXXUw;
    public String RdAHlO;
    public boolean RlQdEF;
    public int UeEOUB;
    public final MutableStateFlow<C25480ixX> aKErDB;
    public MutableLiveData<InvestSubscriptionNewViewModel.SubscriptionResult> accept;
    public Bundle copydefault;

    @yCM
    public iXH ctaButtonUseCase;
    public final MutableSharedFlow<C27315jsq> dHguZz;
    public final C25480ixX dNCPSb;
    public final StateFlow<InterfaceC24173iXp> djBIcL;
    public int djSkpj;
    public C27315jsq dmfpNf;
    public MutableLiveData<Boolean> dvKsVJ;
    public MutableLiveData<String> dxcTrN;
    public int ejfBZ;
    public MutableLiveData<InvestGasPriceConfig> fARcdN;
    public MutableLiveData<Boolean> fFgQHt;
    public final MutableStateFlow<BigDecimal> fIwbmz;
    public TransactionStage fJNWhG;
    public MutableLiveData<C27024jnQ> fZBcTu;
    public ResponseState fetchVPNInfo;
    public InvestTokenWithAmount ffGIBT;
    public InvestUniv3SubscribeInfo finit;
    public List<InvestUniv3ChartData> flVtFt;
    public boolean fvQaOB;
    public ResponseState gEmmrt;
    public InvestPoolV3 gGvvIC;
    public long gHZMYf;
    public MutableLiveData<InvestUniv3SubscribePromptInformation> gasjUx;
    public List<InvestUniv3ChartData> getFieldNames;
    public final MutableStateFlow<ChartLoadingStatus> getNewProxyInstance;
    public String getPostValueLengthLimit;
    public final MutableStateFlow<ChartLoadingStatus> giSNqX;
    public InvestTokenWithAmount gkJEwt;
    public String gwTjWJ;
    public String hBpjJd;
    public final MutableStateFlow<BigDecimal> hDKMBd;
    public InvestSubscriptionNewViewModel.StateListAnimator hUfVAv;
    public String hrNTAI;
    public InvestUniv3SubscribeReceiveInfoHandle iRxXKY;
    public final SavedStateHandle iZzfmt;
    public Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> isConnected;
    public final InterfaceC23916iOb iwGUEr;
    public boolean sSMYrx;

    @yCM
    public iXN settleTransactionUseCase;
    public boolean uzCIH;
    public InvestUniv3SubscribeInfo valueOf;
    public InvestUniv3SubscribeReceiveInfo values;
    public final MutableLiveData<C23958iPq> wlaJM;
    public InvestInputData zLjUOn;
    public MutableLiveData<InvestSubscriptionNewViewModel.Activity> zsXlph;
    public MutableLiveData<Boolean> zuBGHE;
    public String zuWLRA;

    public final /* synthetic */ class Activity {
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

    @Override // o.InterfaceC27531jwu
    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Bundle bundle) {
        this.copydefault = bundle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(ResponseState responseState) {
        this.fetchVPNInfo = responseState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(InvestTokenWithAmount investTokenWithAmount) {
        this.ffGIBT = investTokenWithAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str, @NotNull String str2, long j, long j2, @NotNull String str3, boolean z, InvestInputData investInputData, InvestPoolV3 investPoolV3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.gwTjWJ = str;
        this.hBpjJd = str2;
        this.gHZMYf = j;
        this.zuWLRA = str3;
        this.DTwDnp = z;
        this.AhwBna = j2;
        this.zLjUOn = investInputData;
        this.gGvvIC = investPoolV3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull List<InvestUniv3ChartData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.flVtFt = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> pair) {
        this.isConnected = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull C27315jsq c27315jsq) {
        Intrinsics.checkNotNullParameter(c27315jsq, "");
        this.dmfpNf = c27315jsq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.fvQaOB = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.RdAHlO = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(boolean z) {
        this.RlQdEF = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(int i) {
        this.ODWQjV = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(InvestTokenWithAmount investTokenWithAmount) {
        this.OFhtUX = investTokenWithAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.ORxRYg = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27095joi
    public MutableLiveData<InvestSubscriptionReceiveInfoUIBean> AkhnZx() {
        return this.AwvSrB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseState AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<Boolean> AuCTelauCTel() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23958iPq> AubY() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<C25480ixX> AwvSrB() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27315jsq AxsJAY() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C27315jsq AxsJAYaxsJAY() {
        return this.dmfpNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AxsJAYsNCnLh() {
        return this.DLWbHP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount DAIeex() {
        return this.OFhtUX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C27019jnL> DCJXGO() {
        return this.ODXsMY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> DTwDnp() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C27019jnL> DXXBbs() {
        return this.OxVOHk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DarRvM() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> DbNXlk() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Bundle EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount EZpvd(boolean z) {
        return (!this.ORxRYg ? z : !z) ? this.DarRvM : this.ffGIBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo) {
        this.values = investUniv3SubscribeReceiveInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(InvestTokenWithAmount investTokenWithAmount) {
        this.OHqIaq = investTokenWithAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DAIeex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<InterfaceC24173iXp> KWHzl() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo) {
        this.DbNXlk = investUniv3SubscribeReceiveInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(InvestTokenWithAmount investTokenWithAmount) {
        this.gkJEwt = investTokenWithAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull SwapSlippageActivity.SlippageMode slippageMode) {
        Intrinsics.checkNotNullParameter(slippageMode, "");
        this.DXXBbs = slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C27315jsq c27315jsq) {
        Intrinsics.checkNotNullParameter(c27315jsq, "");
        this.QbewEr = c27315jsq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.sSMYrx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OBJEWx() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ODWQjV() {
        return this.hrNTAI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestGasPriceConfig> OLrzqt() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InvestUniv3SubscribeInfo investUniv3SubscribeInfo) {
        this.finit = investUniv3SubscribeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo) {
        this.AYXKKw = investUniv3SubscribeReceiveInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ResponseState responseState) {
        this.AuCTel = responseState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(InvestTokenWithAmount investTokenWithAmount) {
        this.AubY = investTokenWithAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(String str) {
        this.OqFWZa = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull List<InvestUniv3ChartData> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.getFieldNames = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.QOLQEE = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> ORxRYg() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OcIXYQ() {
        return this.fvQaOB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount OqFWZa() {
        return this.QCjLjM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OuxcSI() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C27024jnQ> QKVWgx() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount QKudOq() {
        return this.OHqIaq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeInfo QOLQEE() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUniv3ChartData> QVAiDq() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<InvestUniv3SubscribePromptInformation> QbewEr() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<ChartLoadingStatus> RJOkX() {
        return this.giSNqX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount RcXXUw() {
        return this.gkJEwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String RlQdEF() {
        return this.RdAHlO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String UeEOUB() {
        return this.DAIeex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> aKErDB() {
        return this.QKudOq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String accept() {
        return this.gwTjWJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27096joj
    public MutableLiveData<InvestConsumeData<Boolean>> copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InvestUniv3SubscribeInfo investUniv3SubscribeInfo) {
        this.valueOf = investUniv3SubscribeInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(InvestTokenWithAmount investTokenWithAmount) {
        this.DarRvM = investTokenWithAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> pair) {
        this.AkhnZx = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27531jwu
    public void copydefault(boolean z) {
        if (z) {
            return;
        }
        this.AuCTel = null;
        this.isConnected = null;
        this.DbNXlk = null;
        this.fetchVPNInfo = null;
        this.AkhnZx = null;
        this.values = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<InvestSubscriptionNewViewModel.SubscriptionResult> dNCPSb() {
        return this.accept;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hrNTAI = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String dvKsVJ() {
        return this.OqFWZa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Pair<String, String>> dxcTrN() {
        return this.DCJXGO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<BigDecimal> ejfBZ() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fFgQHt() {
        return this.ODWQjV;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int fIwbmz() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionStage fJNWhG() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fZBcTu() {
        return this.RlQdEF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ffGIBT() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapSlippageActivity.SlippageMode finit() {
        return this.DXXBbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount flVtFt() {
        return this.ffGIBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23953iPl> fvQaOB() {
        return this.DCUTEI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeInfo gEmmrt() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(int i) {
        this.ejfBZ = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(InvestTokenWithAmount investTokenWithAmount) {
        this.QCjLjM = investTokenWithAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        this.OcIXYQ = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<String> gHZMYf() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount gasjUx() {
        return this.DarRvM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithAmount getFieldNames() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<BigDecimal> getNewProxyInstance() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getPostValueLengthLimit() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<iXD> giSNqX() {
        return this.OuxcSI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<C23956iPo> gkJEwt() {
        return this.QkdxfA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<ChartLoadingStatus> hDKMBd() {
        return this.getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23954iPm> hUfVAv() {
        return this.QHmsKR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<C27315jsq> iRxXKY() {
        return this.dHguZz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<C23962iPu> iZzfmt() {
        return this.RKDWNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeReceiveInfo isConnected() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestUniv3ChartData> iwGUEr() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableSharedFlow<C27315jsq> sSMYrx() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DLWbHP = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(boolean z) {
        this.QKVWgx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResponseState values() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<C23948iPg> wlaJM() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> zsXlph() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableStateFlow<C25480ixX> zuBGHE() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Boolean> zuWLRA() {
        return this.zuBGHE;
    }

    @yCM
    public InvestUniv3SubscribeViewModel(@NotNull SavedStateHandle savedStateHandle, @NotNull InterfaceC23916iOb interfaceC23916iOb) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "");
        Intrinsics.checkNotNullParameter(interfaceC23916iOb, "");
        this.iZzfmt = savedStateHandle;
        this.iwGUEr = interfaceC23916iOb;
        C25480ixX c25480ixX = new C25480ixX("", "", "", "", false, false, false, false, false, "", 0, "", false, 5616, null);
        this.dNCPSb = c25480ixX;
        this.RKDWNf = StateFlowKt.MutableStateFlow(new C23962iPu(false, null));
        this.OBJEWx = StateFlowKt.MutableStateFlow(new C23957iPp(true, false, 0, null, null, 24, null));
        this.DCUTEI = new MutableLiveData<>();
        this.QHmsKR = new MutableLiveData<>();
        this.QkdxfA = StateFlowKt.MutableStateFlow(new C23956iPo(null, null, 0, true, false, 7, null));
        this.zsXlph = new MutableLiveData<>();
        this.accept = new MutableLiveData<>();
        this.dxcTrN = new MutableLiveData<>();
        this.fZBcTu = new MutableLiveData<>();
        this.fFgQHt = new MutableLiveData<>();
        this.dvKsVJ = new MutableLiveData<>();
        this.DCJXGO = new MutableLiveData<>();
        this.QKudOq = new MutableLiveData<>();
        this.DXXBbs = SwapSlippageActivity.SlippageMode.DYNAMIC;
        this.DAIeex = SlippageConfigVo.MAX_SLIP;
        this.RcXXUw = StateFlowKt.MutableStateFlow(c25480ixX);
        this.aKErDB = StateFlowKt.MutableStateFlow(c25480ixX);
        this.QUSxYX = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.getFieldNames = yDY.AhwBna();
        this.flVtFt = yDY.AhwBna();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        this.hDKMBd = StateFlowKt.MutableStateFlow(bigDecimal);
        this.fIwbmz = StateFlowKt.MutableStateFlow(bigDecimal);
        this.QVAiDq = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.dHguZz = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.QbewEr = new C27315jsq(null, 0, 3, null);
        this.dmfpNf = new C27315jsq(null, 0, 3, null);
        this.wlaJM = new MutableLiveData<>();
        this.ODWQjV = 1;
        this.gwTjWJ = "";
        this.hBpjJd = "";
        this.zuWLRA = "";
        this.UeEOUB = -887272;
        this.djSkpj = 887272;
        this.AEQbTJ = "1.0001";
        this.AxsJAY = new C27164jpy();
        this.hrNTAI = "";
        this.OxVOHk = new MutableLiveData<>();
        this.RdAHlO = "";
        this.DLWbHP = "";
        this.ODXsMY = new MutableLiveData<>();
        this.AwvSrB = new MutableLiveData<>();
        this.QSBOWP = new MutableLiveData<>();
        this.iRxXKY = new InvestUniv3SubscribeReceiveInfoHandle();
        this.AxsJAYaxsJAY = new MutableLiveData<>();
        this.zuBGHE = new MutableLiveData<>();
        this.gasjUx = new MutableLiveData<>();
        this.QfsBiF = new MutableLiveData<>();
        this.AuCTelauCTel = new MutableLiveData<>();
        ChartLoadingStatus chartLoadingStatus = ChartLoadingStatus.OK;
        this.getNewProxyInstance = StateFlowKt.MutableStateFlow(chartLoadingStatus);
        this.giSNqX = StateFlowKt.MutableStateFlow(chartLoadingStatus);
        this.uzCIH = true;
        MutableStateFlow<InterfaceC24173iXp> MutableStateFlow = StateFlowKt.MutableStateFlow(new InterfaceC24173iXp.ActionBar(iCP.KWHzl()));
        this.EZpvd = MutableStateFlow;
        this.djBIcL = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<iXD> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.OLrzqt = mutableSharedFlowMutableSharedFlow$default;
        this.OuxcSI = mutableSharedFlowMutableSharedFlow$default;
        this.fJNWhG = TransactionStage.CONFIRMATION;
        this.KWHzl = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.getPostValueLengthLimit = toString();
        this.RJOkX = new Function1() { // from class: o.jmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeViewModel.AEQbTJ(this.copydefault, (C9917bed) obj);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ChartLoadingStatus {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ ChartLoadingStatus[] $VALUES;
        public static final ChartLoadingStatus OK = new ChartLoadingStatus("OK", 0);
        public static final ChartLoadingStatus Loading = new ChartLoadingStatus(SILoading.LUA_CLASS_NAME, 1);
        public static final ChartLoadingStatus Error = new ChartLoadingStatus("Error", 2);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ ChartLoadingStatus[] $values() {
            return new ChartLoadingStatus[]{OK, Loading, Error};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<ChartLoadingStatus> getEntries() {
            return $ENTRIES;
        }

        static {
            ChartLoadingStatus[] chartLoadingStatusArr$values = $values();
            $VALUES = chartLoadingStatusArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(chartLoadingStatusArr$values);
        }

        private ChartLoadingStatus(String str, int i) {
        }

        public static ChartLoadingStatus valueOf(String str) {
            return (ChartLoadingStatus) Enum.valueOf(ChartLoadingStatus.class, str);
        }

        public static ChartLoadingStatus[] values() {
            return (ChartLoadingStatus[]) $VALUES.clone();
        }
    }

    public final void KWHzl(InvestUniv3SubscribeInfo investUniv3SubscribeInfo) {
        Object next;
        this.valueOf = investUniv3SubscribeInfo;
        if (investUniv3SubscribeInfo != null) {
            this.AubY = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getUnderlyingTokenList(), 0);
            this.DarRvM = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getUnderlyingTokenList(), 0);
            this.gkJEwt = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getUnderlyingTokenList(), 1);
            this.ffGIBT = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.AkhnZx(investUniv3SubscribeInfo.getUnderlyingTokenList(), 1);
            InvestTokenWithAmount investTokenWithAmount = this.DarRvM;
            Object obj = null;
            if (investTokenWithAmount != null) {
                Iterator<T> it = investUniv3SubscribeInfo.getInvestWithTokenList().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next).getTokenAddress(), (Object) investTokenWithAmount.getTokenAddress())) {
                            break;
                        }
                    }
                }
                InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) next;
                if (investTokenWithAmount2 != null) {
                    investTokenWithAmount.setCoinAmount(investTokenWithAmount2.getCoinAmount());
                }
            }
            InvestTokenWithAmount investTokenWithAmount3 = this.ffGIBT;
            if (investTokenWithAmount3 != null) {
                Iterator<T> it2 = investUniv3SubscribeInfo.getInvestWithTokenList().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next2 = it2.next();
                    if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next2).getTokenAddress(), (Object) investTokenWithAmount3.getTokenAddress())) {
                        obj = next2;
                        break;
                    }
                }
                InvestTokenWithAmount investTokenWithAmount4 = (InvestTokenWithAmount) obj;
                if (investTokenWithAmount4 != null) {
                    investTokenWithAmount3.setCoinAmount(investTokenWithAmount4.getCoinAmount());
                }
            }
        }
    }

    public final TransactionConfig valueOf() {
        return (TransactionConfig) this.iZzfmt.get("key.trx_config");
    }

    public final InvestTradeManager.TransactionResultExtraData gGvvIC() {
        return djSkpj().copydefault();
    }

    public final iXH AhwBna() {
        iXH ixh = this.ctaButtonUseCase;
        if (ixh != null) {
            return ixh;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final iXN djSkpj() {
        iXN ixn = this.settleTransactionUseCase;
        if (ixn != null) {
            return ixn;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final Object AEQbTJ(@NotNull Continuation<? super InvestUniv3SubscribeInfo> continuation) {
        return BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$getUniv3SubscribeInitialInfo$2(this, null), 3, null).await(continuation);
    }

    public static /* synthetic */ Object getReceiveInfoAndCheckState$default(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, String str, InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return investUniv3SubscribeViewModel.EZpvd(str, amountInputIndex, z, (Continuation<? super InvestUniv3SubscribeReceiveInfo>) continuation);
    }

    public final Object EZpvd(@NotNull String str, @NotNull InvestUniv3SubscribeActivity.AmountInputIndex amountInputIndex, boolean z, @NotNull Continuation<? super InvestUniv3SubscribeReceiveInfo> continuation) {
        return BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$getReceiveInfoAndCheckState$2(str, this, amountInputIndex, z, null), 3, null).await(continuation);
    }

    public final Object copydefault(@NotNull Continuation<? super List<InvestUniv3ChartData>> continuation) {
        return BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$getUniv3DepthData$2(this, null), 3, null).await(continuation);
    }

    public final Object OLrzqt(int i, @NotNull Continuation<? super List<InvestUniv3ChartData>> continuation) {
        return BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$getUniv3PriceData$2(this, i, null), 3, null).await(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, Boolean> OLrzqt(InvestGasPriceConfig investGasPriceConfig) {
        InvestSlippageConfig investSlippage;
        InvestSlippageConfig investSlippage2;
        InvestSlippageConfig investSlippage3;
        C27164jpy c27164jpy = this.AxsJAY;
        long j = this.AhwBna;
        Integer numValueOf = null;
        String automaticValue = (investGasPriceConfig == null || (investSlippage3 = investGasPriceConfig.getInvestSlippage()) == null) ? null : investSlippage3.getAutomaticValue();
        String customMax = (investGasPriceConfig == null || (investSlippage2 = investGasPriceConfig.getInvestSlippage()) == null) ? null : investSlippage2.getCustomMax();
        if (investGasPriceConfig != null && (investSlippage = investGasPriceConfig.getInvestSlippage()) != null) {
            numValueOf = Integer.valueOf(investSlippage.getType());
        }
        return c27164jpy.AEQbTJ(String.valueOf(j), automaticValue, customMax, numValueOf);
    }

    public final int OLrzqt(ResponseState responseState, Pair<InvestGasPriceConfig, InvestUniv3SubscribeReceiveInfo> pair, Continuation<? super Unit> continuation) {
        InvestGasPriceConfig first;
        this.AuCTelauCTel.setValue(Boolean.FALSE);
        this.gEmmrt = responseState;
        if (pair != null && (first = pair.getFirst()) != null) {
            first.setEstimateGasFee(pair.getSecond().getEstimateGasFee());
            OLrzqt().setValue(first);
        }
        int i = Activity.OLrzqt[responseState.getErrorType().ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i == 2) {
                this.AxsJAYaxsJAY.setValue(responseState);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (responseState.getErrorCode() == 10002) {
                    i2 = 5;
                } else {
                    this.AxsJAYaxsJAY.setValue(responseState);
                }
            }
        } else if (pair != null) {
            i2 = 2;
        } else {
            this.AxsJAYaxsJAY.setValue(responseState);
        }
        valueOf(i2);
        InvestSubscriptionNewViewModel.StateListAnimator stateListAnimator = this.hUfVAv;
        if (stateListAnimator != null) {
            stateListAnimator.KWHzl(false, responseState);
        }
        Result.Application application = Result.Companion;
        continuation.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
        return i2;
    }

    public final void valueOf(int i) {
        if (i == 4) {
            C25595izg c25595izg = C25595izg.AEQbTJ;
            c25595izg.AEQbTJ("invest_global").OLrzqt().removeIncrementListener(this.getPostValueLengthLimit);
            c25595izg.AEQbTJ("invest_global").OLrzqt().addIncrementListener(this.getPostValueLengthLimit, this.RJOkX);
        }
        AEQbTJ(i);
        djBIcL(i);
        EZpvd(i);
        copydefault(i);
        KWHzl(i);
    }

    public final void AEQbTJ(int i) {
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo;
        if (i != 2 || (investUniv3SubscribeReceiveInfo = this.AYXKKw) == null) {
            return;
        }
        this.zuBGHE.setValue(Boolean.valueOf(investUniv3SubscribeReceiveInfo.isActive()));
        this.gasjUx.setValue(investUniv3SubscribeReceiveInfo.getPromptInformation());
    }

    /* JADX DEBUG: Type inference failed for r7v5. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r7v7. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.util.List] */
    public final void djBIcL(int i) {
        List listValueOf;
        List list;
        List listValueOf2;
        Pair<String, String> pair;
        String ratePercent$default;
        String strKWHzl;
        InvestTipInfoVo estDailyYieldTip;
        String tipContent;
        String currencyAmount;
        if (i != 1) {
            if (i == 2) {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.AYXKKw;
                if (investUniv3SubscribeReceiveInfo != null) {
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
                    if (!this.ORxRYg) {
                        listValueOf2 = yDY.valueOf(this.AubY, this.gkJEwt);
                    } else {
                        listValueOf2 = yDY.valueOf(this.gkJEwt, this.AubY);
                    }
                    List arrayList = new ArrayList();
                    for (Object obj : listValueOf2) {
                        InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) obj;
                        if (!Intrinsics.EZpvd((Object) investTokenWithAmount.getTokenId(), (Object) "") || !Intrinsics.EZpvd((Object) investTokenWithAmount.getCoinAmount(), (Object) "0")) {
                            arrayList.add(obj);
                        }
                    }
                    this.QSBOWP.setValue(new C23965iPx(investUniv3SubscribeReceiveInfo.getAssetsList(), investUniv3SubscribeReceiveInfo.getFeeEarning(), null, null, null, true, false));
                    MutableLiveData<C23954iPm> mutableLiveData = this.QHmsKR;
                    InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investUniv3SubscribeReceiveInfo.getGainsTokenList());
                    String str = (investTokenWithAmount2 == null || (currencyAmount = investTokenWithAmount2.getCurrencyAmount()) == null) ? "" : currencyAmount;
                    InvestUniv3SubscribePromptInformation promptInformation = investUniv3SubscribeReceiveInfo.getPromptInformation();
                    mutableLiveData.setValue(new C23954iPm(str, (promptInformation == null || (estDailyYieldTip = promptInformation.getEstDailyYieldTip()) == null || (tipContent = estDailyYieldTip.getTipContent()) == null) ? "" : tipContent, false, !investUniv3SubscribeReceiveInfo.isActive(), investUniv3SubscribeReceiveInfo.getGainsTokenList()));
                    this.QkdxfA.setValue(new C23956iPo(null, investUniv3SubscribeReceiveInfo.getApr() != null ? C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, investUniv3SubscribeReceiveInfo.getApr(), false, 2, null) : null, C25493ixk.FragmentManager.geLlBI, false, false, 1, null));
                    InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
                    if (investUniv3SubscribeInfo != null) {
                        MutableLiveData<InvestSubscriptionReceiveInfoUIBean> mutableLiveDataAkhnZx = AkhnZx();
                        String platformLogo = investUniv3SubscribeInfo.getPlatformLogo();
                        String platformName = investUniv3SubscribeInfo.getPlatformName();
                        if (this.fvQaOB) {
                            arrayList = investUniv3SubscribeReceiveInfo.getInvestWithTokenList();
                        }
                        mutableLiveDataAkhnZx.setValue(new InvestSubscriptionReceiveInfoUIBean(false, platformLogo, platformName, arrayList, (List) investUniv3SubscribeReceiveInfo.getSwapToTokenList(), (InvestTokenWithAmount) null, false, (InvestTipsBean) null, (InvestExchangeRateBean) null, (String) null, (String) null, (Integer) null, 4064, (DefaultConstructorMarker) null));
                    }
                    MutableLiveData<Pair<String, String>> mutableLiveData2 = this.DCJXGO;
                    if (C33129mqd.OLrzqt((CharSequence) investUniv3SubscribeReceiveInfo.getSwapSlippage())) {
                        if (this.QKVWgx) {
                            int i2 = C25493ixk.FragmentManager.zblBkD;
                            C27492jwH c27492jwH = C27492jwH.OLrzqt;
                            String str2 = this.OqFWZa;
                            strKWHzl = KWHzl(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C27492jwH.formatRatePercent$default(c27492jwH, C33129mqd.divS$default(str2 == null ? "" : str2, "100", null, null, null, 14, null), false, 2, null))));
                        } else if (this.OcIXYQ) {
                            strKWHzl = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, C33129mqd.divS$default(this.DAIeex, "100", null, null, null, 14, null), false, 2, null);
                        } else {
                            strKWHzl = KWHzl(C25493ixk.FragmentManager.zblBkD, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, investUniv3SubscribeReceiveInfo.getSwapSlippage(), false, 2, null))));
                        }
                        pair = new Pair<>(strKWHzl, copydefault(investUniv3SubscribeReceiveInfo.getSwapSlippage()));
                    } else {
                        pair = null;
                    }
                    mutableLiveData2.setValue(pair);
                    this.fZBcTu.setValue(new C27024jnQ(investUniv3SubscribeReceiveInfo, YieldState.FILLED));
                    MutableLiveData<String> mutableLiveData3 = this.dxcTrN;
                    String apr = investUniv3SubscribeReceiveInfo.getApr();
                    if (apr == null || (ratePercent$default = C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, apr, false, 2, null)) == null) {
                        ratePercent$default = "--";
                    }
                    mutableLiveData3.setValue(ratePercent$default);
                    if (C33129mqd.AEQbTJ(investUniv3SubscribeReceiveInfo.getValueDeviationPercentage(), 0)) {
                        LiveData liveDataAkhnZx = AkhnZx();
                        InvestSubscriptionReceiveInfoUIBean value = AkhnZx().getValue();
                        if (value != null) {
                            objCopy = value.copy((4087 & 1) != 0 ? value.isInit : false, (4087 & 2) != 0 ? value.platformLogo : null, (4087 & 4) != 0 ? value.platformName : null, (4087 & 8) != 0 ? value.investWithToken : null, (4087 & 16) != 0 ? value.swapToToken : null, (4087 & 32) != 0 ? value.receiveTokenInfo : null, (4087 & 64) != 0 ? value.isDataErro : false, (4087 & 128) != 0 ? value.tipsBean : new InvestTipsBean(1, investUniv3SubscribeReceiveInfo.getValueDeviationPercentage(), (String) null, (String) null, 12, (DefaultConstructorMarker) null), (4087 & 256) != 0 ? value.exchangeBean : null, (4087 & 512) != 0 ? value.fixedApy : null, (4087 & 1024) != 0 ? value.maturityTime : null, (4087 & 2048) != 0 ? value.investmentCategory : null);
                        }
                        liveDataAkhnZx.setValue(objCopy);
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
            if (!this.ORxRYg) {
                listValueOf = yDY.valueOf(this.AubY, this.gkJEwt);
            } else {
                listValueOf = yDY.valueOf(this.gkJEwt, this.AubY);
            }
            List arrayList2 = new ArrayList();
            for (Object obj2 : listValueOf) {
                InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) obj2;
                if (!Intrinsics.EZpvd((Object) investTokenWithAmount3.getTokenId(), (Object) "") || !Intrinsics.EZpvd((Object) investTokenWithAmount3.getCoinAmount(), (Object) "0")) {
                    arrayList2.add(obj2);
                }
            }
            MutableLiveData<C23965iPx> mutableLiveData4 = this.QSBOWP;
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.AYXKKw;
            List<InvestTokenWithAmount> assetsList = investUniv3SubscribeReceiveInfo2 != null ? investUniv3SubscribeReceiveInfo2.getAssetsList() : null;
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo3 = this.AYXKKw;
            mutableLiveData4.setValue(new C23965iPx(assetsList, investUniv3SubscribeReceiveInfo3 != null ? investUniv3SubscribeReceiveInfo3.getFeeEarning() : null, null, null, null, false, true));
            MutableLiveData<InvestSubscriptionReceiveInfoUIBean> mutableLiveDataAkhnZx2 = AkhnZx();
            String platformLogo2 = investUniv3SubscribeInfo2.getPlatformLogo();
            String platformName2 = investUniv3SubscribeInfo2.getPlatformName();
            if (this.fvQaOB) {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo4 = this.AYXKKw;
                if (investUniv3SubscribeReceiveInfo4 != null) {
                    arrayList2 = investUniv3SubscribeReceiveInfo4.getInvestWithTokenList();
                    list = arrayList2;
                } else {
                    list = null;
                }
            } else {
                list = arrayList2;
            }
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo5 = this.AYXKKw;
            mutableLiveDataAkhnZx2.setValue(new InvestSubscriptionReceiveInfoUIBean(false, platformLogo2, platformName2, list, (List) (investUniv3SubscribeReceiveInfo5 != null ? investUniv3SubscribeReceiveInfo5.getSwapToTokenList() : null), (InvestTokenWithAmount) null, true, (InvestTipsBean) null, (InvestExchangeRateBean) null, (String) null, (String) null, (Integer) null, Utf8.MASK_2BYTES, (DefaultConstructorMarker) null));
        }
    }

    public final void QkdxfA() {
        List<InvestTokenWithAmount> listValueOf;
        if (this.AYXKKw == null) {
            return;
        }
        if (this.ORxRYg) {
            listValueOf = yDY.valueOf(this.AubY, this.gkJEwt);
        } else {
            listValueOf = yDY.valueOf(this.gkJEwt, this.AubY);
        }
        MutableLiveData<InvestSubscriptionReceiveInfoUIBean> mutableLiveDataAkhnZx = AkhnZx();
        InvestSubscriptionReceiveInfoUIBean value = AkhnZx().getValue();
        if (value != null) {
            if (this.fvQaOB) {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.AYXKKw;
                listValueOf = investUniv3SubscribeReceiveInfo != null ? investUniv3SubscribeReceiveInfo.getInvestWithTokenList() : null;
            }
            InvestSubscriptionReceiveInfoUIBean investSubscriptionReceiveInfoUIBeanCopy = value.copy((4087 & 1) != 0 ? value.isInit : false, (4087 & 2) != 0 ? value.platformLogo : null, (4087 & 4) != 0 ? value.platformName : null, (4087 & 8) != 0 ? value.investWithToken : listValueOf, (4087 & 16) != 0 ? value.swapToToken : null, (4087 & 32) != 0 ? value.receiveTokenInfo : null, (4087 & 64) != 0 ? value.isDataErro : false, (4087 & 128) != 0 ? value.tipsBean : null, (4087 & 256) != 0 ? value.exchangeBean : null, (4087 & 512) != 0 ? value.fixedApy : null, (4087 & 1024) != 0 ? value.maturityTime : null, (4087 & 2048) != 0 ? value.investmentCategory : null);
            if (investSubscriptionReceiveInfoUIBeanCopy == null) {
                return;
            }
            mutableLiveDataAkhnZx.setValue(investSubscriptionReceiveInfoUIBeanCopy);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(int i) {
        List<TransactionStep> transactionStepList;
        if (i == 0) {
            this.OBJEWx.setValue(new C23957iPp(true, false, 0, null, null, 24, null));
        } else if (i == 1) {
            this.OBJEWx.setValue(new C23957iPp(false, true, 0, null, null, 24, null));
        } else if (i == 2) {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.AYXKKw;
            if (investUniv3SubscribeReceiveInfo != null) {
                MutableStateFlow<C23957iPp> mutableStateFlow = this.OBJEWx;
                List<InvestTokenWithApprove> approveStatusList = investUniv3SubscribeReceiveInfo.getApproveStatusList();
                InvestInputData investInputData = this.zLjUOn;
                mutableStateFlow.setValue(new C23957iPp(false, false, 0, approveStatusList, AEQbTJ(investInputData != null ? investInputData.getApprovedTokenAddress() : null)));
            }
        } else if (i != 4) {
            if (i == 5) {
            }
        }
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.AYXKKw;
        if (investUniv3SubscribeReceiveInfo2 == null || (transactionStepList = investUniv3SubscribeReceiveInfo2.getTransactionStepList()) == null) {
            return;
        }
        copydefault(transactionStepList);
    }

    public final void KWHzl(int i) {
        String coinAmount;
        String coinAmount2;
        String coinAmount3;
        String tokenSymbol;
        if (i != 0 && i != 1) {
            if (i == 2) {
                boolean z = this.fvQaOB;
                if (z && this.QOLQEE) {
                    InvestTokenWithAmount investTokenWithAmount = this.QCjLjM;
                    if (investTokenWithAmount == null || (coinAmount3 = investTokenWithAmount.getCoinAmount()) == null) {
                        coinAmount3 = "0";
                    }
                    String str = this.hrNTAI;
                    if (investTokenWithAmount != null && C33129mqd.AEQbTJ(coinAmount3, "0") && (StringsKt__StringsKt.fARcdN((CharSequence) str) || Intrinsics.EZpvd((Object) str, (Object) "0") || C33129mqd.copydefault(coinAmount3, str))) {
                        this.RKDWNf.setValue(new C23962iPu(true, null, 2, null));
                        return;
                    }
                    MutableStateFlow<C23962iPu> mutableStateFlow = this.RKDWNf;
                    int i2 = C25493ixk.FragmentManager.hvKCwS;
                    if (investTokenWithAmount == null || (tokenSymbol = investTokenWithAmount.getTokenSymbol()) == null) {
                        tokenSymbol = "";
                    }
                    mutableStateFlow.setValue(new C23962iPu(false, KWHzl(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", tokenSymbol)))));
                    return;
                }
                if (z && !this.QOLQEE) {
                    InvestTokenWithAmount investTokenWithAmount2 = this.OHqIaq;
                    InvestTokenWithAmount investTokenWithAmount3 = this.OFhtUX;
                    ArrayList<String> arrayList = new ArrayList<>();
                    if (investTokenWithAmount2 == null || (coinAmount = investTokenWithAmount2.getCoinAmount()) == null) {
                        coinAmount = "0";
                    }
                    String str2 = this.RdAHlO;
                    if (investTokenWithAmount2 == null || !C33129mqd.AEQbTJ(coinAmount, "0") || ((!StringsKt__StringsKt.fARcdN((CharSequence) str2)) && !Intrinsics.EZpvd((Object) str2, (Object) "0") && C33129mqd.gEmmrt(coinAmount, str2))) {
                        InvestTokenWithAmount investTokenWithAmount4 = this.OHqIaq;
                        arrayList.add(investTokenWithAmount4 != null ? investTokenWithAmount4.getTokenSymbol() : null);
                    }
                    if (investTokenWithAmount3 == null || (coinAmount2 = investTokenWithAmount3.getCoinAmount()) == null) {
                        coinAmount2 = "0";
                    }
                    String str3 = this.DLWbHP;
                    if (investTokenWithAmount3 == null || !C33129mqd.AEQbTJ(coinAmount2, "0") || ((!StringsKt__StringsKt.fARcdN((CharSequence) str3)) && !Intrinsics.EZpvd((Object) str3, (Object) "0") && C33129mqd.gEmmrt(coinAmount2, str3))) {
                        InvestTokenWithAmount investTokenWithAmount5 = this.OFhtUX;
                        arrayList.add(investTokenWithAmount5 != null ? investTokenWithAmount5.getTokenSymbol() : null);
                    }
                    this.RKDWNf.setValue(AEQbTJ(arrayList));
                    return;
                }
                ArrayList<String> arrayList2 = new ArrayList<>();
                InvestTokenWithAmount investTokenWithAmount6 = this.AubY;
                if (investTokenWithAmount6 != null && !KWHzl(this.DarRvM, investTokenWithAmount6)) {
                    arrayList2.add(investTokenWithAmount6.getTokenSymbol());
                }
                InvestTokenWithAmount investTokenWithAmount7 = this.gkJEwt;
                if (investTokenWithAmount7 != null && !KWHzl(this.ffGIBT, investTokenWithAmount7)) {
                    arrayList2.add(investTokenWithAmount7.getTokenSymbol());
                }
                this.RKDWNf.setValue(AEQbTJ(arrayList2));
                return;
            }
            if (i != 4 && i != 5) {
                return;
            }
        }
        this.RKDWNf.setValue(new C23962iPu(false, null, 2, null));
    }

    public final void dHguZz() {
        this.RKDWNf.setValue(new C23962iPu(false, null, 2, null));
    }

    public final boolean KWHzl(InvestTokenWithAmount investTokenWithAmount, InvestTokenWithAmount investTokenWithAmount2) {
        return C33129mqd.copydefault(investTokenWithAmount != null ? investTokenWithAmount.getCoinAmount() : null, investTokenWithAmount2 != null ? investTokenWithAmount2.getCoinAmount() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(int i) {
        int i2;
        boolean z;
        InvestGasPriceConfig value;
        InvestSlippageConfig investSlippage;
        int i3 = 0;
        this.AxsJAYsNCnLh = false;
        if (i != 2 || (value = OLrzqt().getValue()) == null || (investSlippage = value.getInvestSlippage()) == null) {
            i2 = 0;
            z = false;
        } else {
            String first = OLrzqt(OLrzqt().getValue()).getFirst();
            boolean z2 = true;
            if (investSlippage.getType() == 2) {
                if (C33129mqd.AEQbTJ(investSlippage.getAutomaticValue(), investSlippage.getCustomMax())) {
                    this.AxsJAYsNCnLh = true;
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
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        if (investUniv3SubscribeInfo != null) {
            MutableLiveData<C23953iPl> mutableLiveData = this.DCUTEI;
            String network = investUniv3SubscribeInfo.getNetwork();
            String networkLogo = investUniv3SubscribeInfo.getNetworkLogo();
            String strQfsBiF = OLrzqt().getValue() != null ? QfsBiF() : "";
            InvestGasPriceConfig value2 = OLrzqt().getValue();
            String strQUSxYX = (value2 != null ? value2.getInvestSlippage() : null) != null ? QUSxYX() : "";
            InvestGasPriceConfig value3 = OLrzqt().getValue();
            mutableLiveData.setValue(new C23953iPl(i, true, network, networkLogo, strQfsBiF, strQUSxYX, value3 != null ? Boolean.valueOf(C27505jwU.OLrzqt(value3)) : null, i2, "", z));
        }
    }

    @Override // o.InterfaceC27096joj
    public void copydefault(@NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AxsJAY.AEQbTJ(str, z);
    }

    @Override // o.InterfaceC27096joj
    public void fARcdN() {
        InvestSlippageConfig investSlippage;
        C27164jpy c27164jpy = this.AxsJAY;
        long j = this.AhwBna;
        InvestGasPriceConfig value = OLrzqt().getValue();
        c27164jpy.AEQbTJ(String.valueOf(j), (value == null || (investSlippage = value.getInvestSlippage()) == null) ? null : Integer.valueOf(investSlippage.getType()));
    }

    @Override // o.InterfaceC27096joj
    public Pair<String, Boolean> djBIcL() {
        return OLrzqt(OLrzqt().getValue());
    }

    public final String QUSxYX() {
        String first = OLrzqt(OLrzqt().getValue()).getFirst();
        return first.length() > 0 ? C27492jwH.formatRatePercent$default(C27492jwH.OLrzqt, first, false, 2, null) : "--";
    }

    public final String QfsBiF() {
        String strEZpvd = this.AxsJAY.EZpvd(String.valueOf(this.AhwBna));
        InvestGasPriceConfig value = OLrzqt().getValue();
        String strCopydefault = value != null ? C27505jwU.copydefault(value, strEZpvd) : null;
        return (strCopydefault == null || strCopydefault.length() == 0) ? "--" : C27492jwH.formatCurrencyData$default(C27492jwH.OLrzqt, strCopydefault, null, null, null, 14, null);
    }

    public final AbstractC58185ywX<ResponseData<String>> copydefault(@NotNull final NewCallbackBean newCallbackBean) {
        Intrinsics.checkNotNullParameter(newCallbackBean, "");
        AbstractC58185ywX abstractC58185ywXCopydefault = C25471ixO.copydefault(new InterfaceC58187ywZ() { // from class: o.jmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                InvestUniv3SubscribeViewModel.EZpvd(newCallbackBean, this, interfaceC58184ywW);
            }
        });
        final Function1 function1 = new Function1() { // from class: o.jmI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeViewModel.KWHzl(this.KWHzl, (ResponseData) obj);
            }
        };
        AbstractC58185ywX<ResponseData<String>> abstractC58185ywXKWHzl = abstractC58185ywXCopydefault.KWHzl(new InterfaceC58229yxO() { // from class: o.jmE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return InvestUniv3SubscribeViewModel.AEQbTJ(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        return abstractC58185ywXKWHzl;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x029d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EZpvd(NewCallbackBean newCallbackBean, final InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, final InterfaceC58184ywW interfaceC58184ywW) {
        InvestTokenWithAmount investTokenWithAmount;
        String coinAmount;
        InvestTokenWithAmount investTokenWithAmount2;
        String coinAmount2;
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
                        InvestTokenWithAmount investTokenWithAmount3 = new InvestTokenWithAmount(0L, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435455, (DefaultConstructorMarker) null);
                        if (investUniv3SubscribeViewModel.AubY != null) {
                            ReserveBean reserved9 = newCallbackBean.getReserved();
                            Intrinsics.copydefault(reserved9);
                            if (!reserved9.isNativeToken()) {
                                ReserveBean reserved10 = newCallbackBean.getReserved();
                                Intrinsics.copydefault(reserved10);
                                String tokenContractAddress = reserved10.getTokenContractAddress();
                                InvestTokenWithAmount investTokenWithAmount4 = investUniv3SubscribeViewModel.AubY;
                                Intrinsics.copydefault(investTokenWithAmount4);
                                if (!C59449zhJ.gEmmrt(tokenContractAddress, investTokenWithAmount4.getTokenAddress(), true)) {
                                    ReserveBean reserved11 = newCallbackBean.getReserved();
                                    Intrinsics.copydefault(reserved11);
                                    if (reserved11.isNativeToken()) {
                                        InvestTokenWithAmount investTokenWithAmount5 = investUniv3SubscribeViewModel.AubY;
                                        Intrinsics.copydefault(investTokenWithAmount5);
                                        if (investTokenWithAmount5.isBaseToken()) {
                                        }
                                        investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel.gwTjWJ, investUniv3SubscribeViewModel.hBpjJd, investTokenWithAmount2, strOLrzqt, investUniv3SubscribeViewModel.gHZMYf, investUniv3SubscribeViewModel.DTwDnp, (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.QbewEr : investUniv3SubscribeViewModel.dmfpNf).KWHzl(), (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.dmfpNf : investUniv3SubscribeViewModel.QbewEr).KWHzl(), investUniv3SubscribeViewModel.zuWLRA, new Function1() { // from class: o.jmz
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return InvestUniv3SubscribeViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
                                            }
                                        }, new Function2() { // from class: o.jmC
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                return InvestUniv3SubscribeViewModel.copydefault(interfaceC58184ywW, investUniv3SubscribeViewModel, (ResponseState) obj, (kotlin.Pair) obj2);
                                            }
                                        });
                                    }
                                    if (investUniv3SubscribeViewModel.gkJEwt == null) {
                                        ReserveBean reserved12 = newCallbackBean.getReserved();
                                        Intrinsics.copydefault(reserved12);
                                        if (!reserved12.isNativeToken()) {
                                            ReserveBean reserved13 = newCallbackBean.getReserved();
                                            Intrinsics.copydefault(reserved13);
                                            String tokenContractAddress2 = reserved13.getTokenContractAddress();
                                            InvestTokenWithAmount investTokenWithAmount6 = investUniv3SubscribeViewModel.gkJEwt;
                                            Intrinsics.copydefault(investTokenWithAmount6);
                                            if (!C59449zhJ.gEmmrt(tokenContractAddress2, investTokenWithAmount6.getTokenAddress(), true)) {
                                                ReserveBean reserved14 = newCallbackBean.getReserved();
                                                Intrinsics.copydefault(reserved14);
                                                if (reserved14.isNativeToken()) {
                                                    InvestTokenWithAmount investTokenWithAmount7 = investUniv3SubscribeViewModel.gkJEwt;
                                                    Intrinsics.copydefault(investTokenWithAmount7);
                                                    if (investTokenWithAmount7.isBaseToken()) {
                                                    }
                                                    investTokenWithAmount2 = investTokenWithAmount3;
                                                    investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel.gwTjWJ, investUniv3SubscribeViewModel.hBpjJd, investTokenWithAmount2, strOLrzqt, investUniv3SubscribeViewModel.gHZMYf, investUniv3SubscribeViewModel.DTwDnp, (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.QbewEr : investUniv3SubscribeViewModel.dmfpNf).KWHzl(), (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.dmfpNf : investUniv3SubscribeViewModel.QbewEr).KWHzl(), investUniv3SubscribeViewModel.zuWLRA, new Function1() { // from class: o.jmz
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                                            return InvestUniv3SubscribeViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
                                                        }
                                                    }, new Function2() { // from class: o.jmC
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                        @Override // kotlin.jvm.functions.Function2
                                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                            return InvestUniv3SubscribeViewModel.copydefault(interfaceC58184ywW, investUniv3SubscribeViewModel, (ResponseState) obj, (kotlin.Pair) obj2);
                                                        }
                                                    });
                                                }
                                                interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
                                                interfaceC58184ywW.onComplete();
                                                investTokenWithAmount2 = investTokenWithAmount3;
                                                investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel.gwTjWJ, investUniv3SubscribeViewModel.hBpjJd, investTokenWithAmount2, strOLrzqt, investUniv3SubscribeViewModel.gHZMYf, investUniv3SubscribeViewModel.DTwDnp, (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.QbewEr : investUniv3SubscribeViewModel.dmfpNf).KWHzl(), (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.dmfpNf : investUniv3SubscribeViewModel.QbewEr).KWHzl(), investUniv3SubscribeViewModel.zuWLRA, new Function1() { // from class: o.jmz
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                                        return InvestUniv3SubscribeViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
                                                    }
                                                }, new Function2() { // from class: o.jmC
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                        return InvestUniv3SubscribeViewModel.copydefault(interfaceC58184ywW, investUniv3SubscribeViewModel, (ResponseState) obj, (kotlin.Pair) obj2);
                                                    }
                                                });
                                            }
                                            investTokenWithAmount = investUniv3SubscribeViewModel.gkJEwt;
                                            if (investTokenWithAmount != null) {
                                                MutableStateFlow<C25480ixX> mutableStateFlow = investUniv3SubscribeViewModel.aKErDB;
                                                String tokenSymbol = investTokenWithAmount.getTokenSymbol();
                                                String currencyAmount = investTokenWithAmount.getCurrencyAmount();
                                                String tokenLogo = investTokenWithAmount.getTokenLogo();
                                                InvestTokenWithAmount investTokenWithAmount8 = investUniv3SubscribeViewModel.ffGIBT;
                                                String str = (investTokenWithAmount8 == null || (coinAmount = investTokenWithAmount8.getCoinAmount()) == null) ? "0" : coinAmount;
                                                boolean zIsBaseToken = investTokenWithAmount.isBaseToken();
                                                InvestTokenWithAmount investTokenWithAmount9 = investUniv3SubscribeViewModel.ffGIBT;
                                                boolean zKWHzl = investUniv3SubscribeViewModel.KWHzl(zIsBaseToken, C33129mqd.subS$default(investTokenWithAmount9 != null ? investTokenWithAmount9.getCoinAmount() : null, investTokenWithAmount.getCoinAmount(), null, null, null, 14, null));
                                                InvestTokenWithAmount investTokenWithAmount10 = investUniv3SubscribeViewModel.ffGIBT;
                                                mutableStateFlow.setValue(new C25480ixX(strOLrzqt, tokenSymbol, tokenLogo, currencyAmount, C33129mqd.gEmmrt(investTokenWithAmount10 != null ? investTokenWithAmount10.getCoinAmount() : null, investTokenWithAmount.getCoinAmount()), zKWHzl, false, false, false, null, C33129mqd.AhwBna(investTokenWithAmount.getTokenPrecision()), str, true, 960, null));
                                                investTokenWithAmount2 = investTokenWithAmount;
                                                investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel.gwTjWJ, investUniv3SubscribeViewModel.hBpjJd, investTokenWithAmount2, strOLrzqt, investUniv3SubscribeViewModel.gHZMYf, investUniv3SubscribeViewModel.DTwDnp, (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.QbewEr : investUniv3SubscribeViewModel.dmfpNf).KWHzl(), (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.dmfpNf : investUniv3SubscribeViewModel.QbewEr).KWHzl(), investUniv3SubscribeViewModel.zuWLRA, new Function1() { // from class: o.jmz
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                                        return InvestUniv3SubscribeViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
                                                    }
                                                }, new Function2() { // from class: o.jmC
                                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                        return InvestUniv3SubscribeViewModel.copydefault(interfaceC58184ywW, investUniv3SubscribeViewModel, (ResponseState) obj, (kotlin.Pair) obj2);
                                                    }
                                                });
                                            }
                                            investTokenWithAmount2 = investTokenWithAmount3;
                                            investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel.gwTjWJ, investUniv3SubscribeViewModel.hBpjJd, investTokenWithAmount2, strOLrzqt, investUniv3SubscribeViewModel.gHZMYf, investUniv3SubscribeViewModel.DTwDnp, (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.QbewEr : investUniv3SubscribeViewModel.dmfpNf).KWHzl(), (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.dmfpNf : investUniv3SubscribeViewModel.QbewEr).KWHzl(), investUniv3SubscribeViewModel.zuWLRA, new Function1() { // from class: o.jmz
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function1
                                                public final java.lang.Object invoke(java.lang.Object obj) {
                                                    return InvestUniv3SubscribeViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
                                                }
                                            }, new Function2() { // from class: o.jmC
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                                @Override // kotlin.jvm.functions.Function2
                                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                    return InvestUniv3SubscribeViewModel.copydefault(interfaceC58184ywW, investUniv3SubscribeViewModel, (ResponseState) obj, (kotlin.Pair) obj2);
                                                }
                                            });
                                        }
                                    } else {
                                        interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
                                        interfaceC58184ywW.onComplete();
                                        investTokenWithAmount2 = investTokenWithAmount3;
                                        investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel.gwTjWJ, investUniv3SubscribeViewModel.hBpjJd, investTokenWithAmount2, strOLrzqt, investUniv3SubscribeViewModel.gHZMYf, investUniv3SubscribeViewModel.DTwDnp, (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.QbewEr : investUniv3SubscribeViewModel.dmfpNf).KWHzl(), (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.dmfpNf : investUniv3SubscribeViewModel.QbewEr).KWHzl(), investUniv3SubscribeViewModel.zuWLRA, new Function1() { // from class: o.jmz
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function1
                                            public final java.lang.Object invoke(java.lang.Object obj) {
                                                return InvestUniv3SubscribeViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
                                            }
                                        }, new Function2() { // from class: o.jmC
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                            @Override // kotlin.jvm.functions.Function2
                                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                                return InvestUniv3SubscribeViewModel.copydefault(interfaceC58184ywW, investUniv3SubscribeViewModel, (ResponseState) obj, (kotlin.Pair) obj2);
                                            }
                                        });
                                    }
                                }
                                investTokenWithAmount = investUniv3SubscribeViewModel.AubY;
                                if (investTokenWithAmount != null) {
                                    MutableStateFlow<C25480ixX> mutableStateFlow2 = investUniv3SubscribeViewModel.RcXXUw;
                                    String tokenSymbol2 = investTokenWithAmount.getTokenSymbol();
                                    String currencyAmount2 = investTokenWithAmount.getCurrencyAmount();
                                    String tokenLogo2 = investTokenWithAmount.getTokenLogo();
                                    InvestTokenWithAmount investTokenWithAmount11 = investUniv3SubscribeViewModel.DarRvM;
                                    String str2 = (investTokenWithAmount11 == null || (coinAmount2 = investTokenWithAmount11.getCoinAmount()) == null) ? "0" : coinAmount2;
                                    boolean zIsBaseToken2 = investTokenWithAmount.isBaseToken();
                                    InvestTokenWithAmount investTokenWithAmount12 = investUniv3SubscribeViewModel.DarRvM;
                                    boolean zKWHzl2 = investUniv3SubscribeViewModel.KWHzl(zIsBaseToken2, C33129mqd.subS$default(investTokenWithAmount12 != null ? investTokenWithAmount12.getCoinAmount() : null, investTokenWithAmount.getCoinAmount(), null, null, null, 14, null));
                                    InvestTokenWithAmount investTokenWithAmount13 = investUniv3SubscribeViewModel.DarRvM;
                                    mutableStateFlow2.setValue(new C25480ixX(strOLrzqt, tokenSymbol2, tokenLogo2, currencyAmount2, C33129mqd.gEmmrt(investTokenWithAmount13 != null ? investTokenWithAmount13.getCoinAmount() : null, investTokenWithAmount.getCoinAmount()), zKWHzl2, false, false, false, null, C33129mqd.AhwBna(investTokenWithAmount.getTokenPrecision()), str2, true, 960, null));
                                    investTokenWithAmount2 = investTokenWithAmount;
                                    investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel.gwTjWJ, investUniv3SubscribeViewModel.hBpjJd, investTokenWithAmount2, strOLrzqt, investUniv3SubscribeViewModel.gHZMYf, investUniv3SubscribeViewModel.DTwDnp, (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.QbewEr : investUniv3SubscribeViewModel.dmfpNf).KWHzl(), (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.dmfpNf : investUniv3SubscribeViewModel.QbewEr).KWHzl(), investUniv3SubscribeViewModel.zuWLRA, new Function1() { // from class: o.jmz
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return InvestUniv3SubscribeViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
                                        }
                                    }, new Function2() { // from class: o.jmC
                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                        @Override // kotlin.jvm.functions.Function2
                                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                            return InvestUniv3SubscribeViewModel.copydefault(interfaceC58184ywW, investUniv3SubscribeViewModel, (ResponseState) obj, (kotlin.Pair) obj2);
                                        }
                                    });
                                }
                                investTokenWithAmount2 = investTokenWithAmount3;
                                investUniv3SubscribeViewModel.iRxXKY.getReceiveInfo(investUniv3SubscribeViewModel.gwTjWJ, investUniv3SubscribeViewModel.hBpjJd, investTokenWithAmount2, strOLrzqt, investUniv3SubscribeViewModel.gHZMYf, investUniv3SubscribeViewModel.DTwDnp, (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.QbewEr : investUniv3SubscribeViewModel.dmfpNf).KWHzl(), (!investUniv3SubscribeViewModel.ORxRYg ? investUniv3SubscribeViewModel.dmfpNf : investUniv3SubscribeViewModel.QbewEr).KWHzl(), investUniv3SubscribeViewModel.zuWLRA, new Function1() { // from class: o.jmz
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function1
                                    public final java.lang.Object invoke(java.lang.Object obj) {
                                        return InvestUniv3SubscribeViewModel.EZpvd(this.copydefault, (InvestGasPriceConfig) obj);
                                    }
                                }, new Function2() { // from class: o.jmC
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return InvestUniv3SubscribeViewModel.copydefault(interfaceC58184ywW, investUniv3SubscribeViewModel, (ResponseState) obj, (kotlin.Pair) obj2);
                                    }
                                });
                            }
                        } else if (investUniv3SubscribeViewModel.gkJEwt == null) {
                        }
                    }
                } else {
                    interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
                    interfaceC58184ywW.onComplete();
                }
            }
        }
        investUniv3SubscribeViewModel.hUfVAv = investUniv3SubscribeViewModel.new ActionBar(interfaceC58184ywW);
    }

    public static final String EZpvd(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, InvestGasPriceConfig investGasPriceConfig) {
        Intrinsics.checkNotNullParameter(investGasPriceConfig, "");
        return investUniv3SubscribeViewModel.OLrzqt(investGasPriceConfig).getFirst();
    }

    public static final Unit copydefault(InterfaceC58184ywW interfaceC58184ywW, InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, ResponseState responseState, Pair pair) {
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo;
        Intrinsics.checkNotNullParameter(responseState, "");
        if (responseState.getErrorType() == ResponseStateType.NORMAL) {
            if (pair != null && (investUniv3SubscribeReceiveInfo = (InvestUniv3SubscribeReceiveInfo) pair.getSecond()) != null) {
                investUniv3SubscribeViewModel.AYXKKw = investUniv3SubscribeReceiveInfo;
            }
            interfaceC58184ywW.onNext(ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), 0, null, null, null, null, null, 62, null));
        } else {
            interfaceC58184ywW.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DAIeex)));
        }
        interfaceC58184ywW.onComplete();
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements InvestSubscriptionNewViewModel.StateListAnimator {
        public final /* synthetic */ InterfaceC58184ywW<ResponseData<String>> AEQbTJ;

        public ActionBar(InterfaceC58184ywW<ResponseData<String>> interfaceC58184ywW) {
            this.AEQbTJ = interfaceC58184ywW;
        }

        @Override // com.okinc.business.invest_biz.ui.viewmodel.InvestSubscriptionNewViewModel.StateListAnimator
        public void KWHzl(boolean z, ResponseState responseState) {
            InvestUniv3SubscribeViewModel.this.hUfVAv = null;
            if (z) {
                this.AEQbTJ.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV)));
                this.AEQbTJ.onComplete();
                return;
            }
            InvestUniv3SubscribeViewModel.this.wlaJM().setValue(new C23948iPg(false, "", false, true, false, 20, null));
            C23953iPl value = InvestUniv3SubscribeViewModel.this.fvQaOB().getValue();
            if (value != null && value.AYXKKw() == 5) {
                this.AEQbTJ.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV)));
                this.AEQbTJ.onComplete();
                return;
            }
            if ((responseState != null ? responseState.getErrorType() : null) == ResponseStateType.NET_ERRO) {
                this.AEQbTJ.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zSsVtY)));
                this.AEQbTJ.onComplete();
                return;
            }
            if ((responseState != null ? responseState.getErrorType() : null) != ResponseStateType.SERVER_ERRRO) {
                if (InvestUniv3SubscribeViewModel.this.AxsJAYsNCnLh) {
                    this.AEQbTJ.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.QKudOq)));
                    this.AEQbTJ.onComplete();
                    return;
                } else {
                    this.AEQbTJ.onNext(ResponseData.copy$default(new ResponseData(0, null, null, null, null, null, 63, null), 0, null, null, null, null, null, 62, null));
                    this.AEQbTJ.onComplete();
                    return;
                }
            }
            String errorMsg = responseState.getErrorMsg();
            if (errorMsg == null || errorMsg.length() == 0) {
                this.AEQbTJ.onError(new Exception(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DIIpTV)));
            } else {
                this.AEQbTJ.onError(new Exception(responseState.getErrorMsg()));
            }
            this.AEQbTJ.onComplete();
        }
    }

    public static final InterfaceC60096zvd AEQbTJ(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd KWHzl(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, ResponseData responseData) {
        Intrinsics.checkNotNullParameter(responseData, "");
        final InvestTxModel investTxModelGenInvestTxModel$default = genInvestTxModel$default(investUniv3SubscribeViewModel, InvestAction.Subscription.getValue(), false, null, 4, null);
        return C25471ixO.copydefault(new InterfaceC58187ywZ() { // from class: o.jmG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58187ywZ
            public final void subscribe(InterfaceC58184ywW interfaceC58184ywW) {
                InvestUniv3SubscribeViewModel.EZpvd(investTxModelGenInvestTxModel$default, interfaceC58184ywW);
            }
        });
    }

    public static final void EZpvd(InvestTxModel investTxModel, final InterfaceC58184ywW interfaceC58184ywW) {
        Intrinsics.checkNotNullParameter(interfaceC58184ywW, "");
        InvestTradeManager.OLrzqt.copydefault(investTxModel, new Function1() { // from class: o.jmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeViewModel.OLrzqt(interfaceC58184ywW, (java.lang.String) obj);
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

    public static /* synthetic */ InvestTxModel genInvestTxModel$default(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, int i, boolean z, InvestTokenWithApprove investTokenWithApprove, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            investTokenWithApprove = null;
        }
        return investUniv3SubscribeViewModel.OLrzqt(i, z, investTokenWithApprove);
    }

    private final InvestTxModel OLrzqt(int i, boolean z, InvestTokenWithApprove investTokenWithApprove) {
        InvestTokenWithAmount receiveTokenInfo;
        List list;
        InvestTokenWithAmount investTokenWithAmountCopy;
        long j;
        InvestTokenWithAmount investTokenWithAmountCopy2;
        List listValueOf;
        List<FromToken> listKWHzl;
        List<InvestTokenWithAmount> listAhwBna;
        String estimateGasFee;
        List listAhwBna2;
        String tokenAddress;
        String str = this.gwTjWJ;
        String str2 = this.hBpjJd;
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(this.gHZMYf));
        long j2 = this.AhwBna;
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.AYXKKw;
        if (investUniv3SubscribeReceiveInfo == null || (receiveTokenInfo = investUniv3SubscribeReceiveInfo.getReceiveTokenInfo()) == null) {
            receiveTokenInfo = null;
        } else {
            receiveTokenInfo.setChainId(this.AhwBna);
            receiveTokenInfo.setCurrencyAmount("");
            Unit unit = Unit.INSTANCE;
        }
        List listOLrzqt = yDY.OLrzqt(receiveTokenInfo);
        if (z) {
            if (InvestAction.Companion.copydefault(i) == InvestAction.SubscriptionApprove) {
                listAhwBna2 = C56402yEa.EZpvd(new InvestTokenWithAmount(investTokenWithApprove != null ? investTokenWithApprove.getChainId() : -1L, (String) null, (String) null, false, false, (String) null, (investTokenWithApprove == null || (tokenAddress = investTokenWithApprove.getTokenAddress()) == null) ? "" : tokenAddress, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435390, (DefaultConstructorMarker) null));
            } else {
                listAhwBna2 = yDY.AhwBna();
            }
            listValueOf = listAhwBna2;
            j = j2;
            list = listOLrzqt;
        } else {
            InvestTokenWithAmount[] investTokenWithAmountArr = new InvestTokenWithAmount[2];
            InvestTokenWithAmount investTokenWithAmount = this.AubY;
            if (investTokenWithAmount == null || (investTokenWithAmountCopy = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null)) == null) {
                list = listOLrzqt;
                investTokenWithAmountCopy = null;
            } else {
                list = listOLrzqt;
                investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
                Unit unit2 = Unit.INSTANCE;
            }
            investTokenWithAmountArr[0] = investTokenWithAmountCopy;
            InvestTokenWithAmount investTokenWithAmount2 = this.gkJEwt;
            if (investTokenWithAmount2 == null || (investTokenWithAmountCopy2 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null)) == null) {
                j = j2;
                investTokenWithAmountCopy2 = null;
            } else {
                j = j2;
                investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
                Unit unit3 = Unit.INSTANCE;
            }
            investTokenWithAmountArr[1] = investTokenWithAmountCopy2;
            listValueOf = yDY.valueOf(investTokenWithAmountArr);
        }
        String strEZpvd = this.AxsJAY.EZpvd(String.valueOf(this.AhwBna));
        String strUzCIH = uzCIH();
        InvestGasPriceConfig value = OLrzqt().getValue();
        String str3 = (value == null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
        String strZLjUOn = zLjUOn();
        String first = OLrzqt(OLrzqt().getValue()).getFirst();
        String json = new Gson().toJson(EZpvd(investTokenWithApprove));
        Intrinsics.checkNotNullExpressionValue(json, "");
        String str4 = this.zuWLRA;
        String str5 = C33129mqd.OLrzqt((CharSequence) str4) ? str4 : null;
        int iKWHzl = (this.ORxRYg ? this.QbewEr : this.dmfpNf).KWHzl();
        int iKWHzl2 = (this.ORxRYg ? this.dmfpNf : this.QbewEr).KWHzl();
        if (investTokenWithApprove == null) {
            C27492jwH c27492jwH = C27492jwH.OLrzqt;
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.AYXKKw;
            if (investUniv3SubscribeReceiveInfo2 == null || (listAhwBna = investUniv3SubscribeReceiveInfo2.getInvestWithTokenList()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            listKWHzl = c27492jwH.KWHzl(listAhwBna);
        } else {
            listKWHzl = null;
        }
        return new InvestTxModel(i, str, str2, listEZpvd, (Long) null, j, "0", list, (List) null, (List) null, listValueOf, strEZpvd, strUzCIH, str3, strZLjUOn, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, str5, (String) null, Integer.valueOf(iKWHzl), Integer.valueOf(iKWHzl2), (List) listKWHzl, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, false, false, (String) null, (List) null, false, (Long) null, 402522896, 65535, (DefaultConstructorMarker) null);
    }

    public final String zLjUOn() {
        String strKWHzl;
        String strEZpvd = this.AxsJAY.EZpvd(String.valueOf(this.AhwBna));
        InvestGasPriceConfig value = OLrzqt().getValue();
        return (value == null || (strKWHzl = C27505jwU.KWHzl(value, strEZpvd)) == null) ? "" : strKWHzl;
    }

    public final String uzCIH() {
        String strOLrzqt;
        String strEZpvd = this.AxsJAY.EZpvd(String.valueOf(this.AhwBna));
        InvestGasPriceConfig value = OLrzqt().getValue();
        return (value == null || (strOLrzqt = C27505jwU.OLrzqt(value, strEZpvd)) == null) ? "" : strOLrzqt;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final InvestTransactionParam EZpvd(InvestTokenWithApprove investTokenWithApprove) {
        Integer orderType;
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo;
        List<InvestTokenWithAmount> investWithTokenList;
        ArrayList arrayList;
        String positionStatus;
        List<InvestTokenWithApprove> approveStatusList;
        List<InvestTokenWithAmount> investWithTokenList2;
        List<InvestTokenWithAmount> investWithTokenList3;
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
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.AYXKKw;
            if ((investUniv3SubscribeReceiveInfo2 != null ? investUniv3SubscribeReceiveInfo2.getApproveStatusList() : null) != null) {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo3 = this.AYXKKw;
                if (investUniv3SubscribeReceiveInfo3 == null || (approveStatusList5 = investUniv3SubscribeReceiveInfo3.getApproveStatusList()) == null) {
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
                    InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo4 = this.AYXKKw;
                    if (((investUniv3SubscribeReceiveInfo4 == null || (approveStatusList4 = investUniv3SubscribeReceiveInfo4.getApproveStatusList()) == null) ? null : Integer.valueOf(approveStatusList4.size())) != null) {
                        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo5 = this.AYXKKw;
                        Integer numValueOf3 = (investUniv3SubscribeReceiveInfo5 == null || (approveStatusList3 = investUniv3SubscribeReceiveInfo5.getApproveStatusList()) == null) ? null : Integer.valueOf(approveStatusList3.size());
                        Intrinsics.copydefault(numValueOf3);
                        if (numValueOf3.intValue() > numValueOf.intValue() + 1) {
                            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo6 = this.AYXKKw;
                            orderType = (investUniv3SubscribeReceiveInfo6 == null || (approveStatusList2 = investUniv3SubscribeReceiveInfo6.getApproveStatusList()) == null || (investTokenWithApprove2 = approveStatusList2.get(numValueOf.intValue() + 1)) == null) ? null : investTokenWithApprove2.getOrderType();
                        }
                    }
                }
            }
        }
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(this.gHZMYf));
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo7 = this.AYXKKw;
        Integer numValueOf4 = (investUniv3SubscribeReceiveInfo7 == null || (investWithTokenList3 = investUniv3SubscribeReceiveInfo7.getInvestWithTokenList()) == null) ? null : Integer.valueOf(investWithTokenList3.size());
        if (numValueOf4 != null && numValueOf4.intValue() == 2) {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo8 = this.AYXKKw;
            if (investUniv3SubscribeReceiveInfo8 == null || (investWithTokenList2 = investUniv3SubscribeReceiveInfo8.getInvestWithTokenList()) == null) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(investWithTokenList2, 10));
                for (InvestTokenWithAmount investTokenWithAmount : investWithTokenList2) {
                    arrayList2.add(new InvestInputData(investTokenWithAmount.getCoinAmount(), investTokenWithAmount.getTokenAddress(), investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, false, false, 24, (DefaultConstructorMarker) null));
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    if (C59449zhJ.gEmmrt(((InvestInputData) obj).getTokenAddress(), investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, true)) {
                        arrayList.add(obj);
                    }
                }
            }
        } else if (numValueOf4 != null && numValueOf4.intValue() == 1 && (investUniv3SubscribeReceiveInfo = this.AYXKKw) != null && (investWithTokenList = investUniv3SubscribeReceiveInfo.getInvestWithTokenList()) != null) {
            ArrayList arrayList3 = new ArrayList(C56403yEb.AYXKKw(investWithTokenList, 10));
            for (InvestTokenWithAmount investTokenWithAmount2 : investWithTokenList) {
                arrayList3.add(new InvestInputData(investTokenWithAmount2.getCoinAmount(), investTokenWithAmount2.getTokenAddress(), investTokenWithApprove != null ? investTokenWithApprove.getTokenAddress() : null, false, false, 24, (DefaultConstructorMarker) null));
            }
            arrayList = arrayList3;
        }
        long j = this.AhwBna;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        Long analysisPlatformId = investUniv3SubscribeInfo != null ? investUniv3SubscribeInfo.getAnalysisPlatformId() : null;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo2 = this.valueOf;
        Integer numValueOf5 = investUniv3SubscribeInfo2 != null ? Integer.valueOf(investUniv3SubscribeInfo2.getInvestType()) : null;
        boolean z = this.DTwDnp;
        String str = this.zuWLRA;
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo9 = this.AYXKKw;
        if (investUniv3SubscribeReceiveInfo9 != null && (approveStatusList = investUniv3SubscribeReceiveInfo9.getApproveStatusList()) != null) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : approveStatusList) {
                if (((InvestTokenWithApprove) obj2).isNeedApprove()) {
                    arrayList4.add(obj2);
                }
            }
            numValueOf2 = Integer.valueOf(arrayList4.size());
        }
        boolean zAEQbTJ = C33129mqd.AEQbTJ(numValueOf2, 1);
        int iKWHzl = (this.ORxRYg ? this.QbewEr : this.dmfpNf).KWHzl();
        int iKWHzl2 = (this.ORxRYg ? this.dmfpNf : this.QbewEr).KWHzl();
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo10 = this.AYXKKw;
        if (investUniv3SubscribeReceiveInfo10 == null || (positionStatus = investUniv3SubscribeReceiveInfo10.getPositionStatus()) == null) {
            positionStatus = "ACTIVE";
        }
        return new InvestTransactionParam((List) arrayList, z, zAEQbTJ, j, numValueOf5, analysisPlatformId, (String) null, listEZpvd, (Long) null, (Integer) null, str, (Integer) 2, orderType, new InvestPoolV3(Integer.valueOf(iKWHzl), Integer.valueOf(iKWHzl2), positionStatus, true ^ this.ORxRYg), (Integer) null, (Boolean) null, 49984, (DefaultConstructorMarker) null);
    }

    public final InvestTokenWithAmount AEQbTJ(String str) {
        List<InvestTokenWithAmount> investWithTokenList;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        Object obj = null;
        if (investUniv3SubscribeInfo == null || (investWithTokenList = investUniv3SubscribeInfo.getInvestWithTokenList()) == null) {
            return null;
        }
        Iterator<T> it = investWithTokenList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (C59449zhJ.gEmmrt(((InvestTokenWithAmount) next).getTokenAddress(), str, true)) {
                obj = next;
                break;
            }
        }
        return (InvestTokenWithAmount) obj;
    }

    public final boolean KWHzl(boolean z, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
            if (C33129mqd.gEmmrt(str, investUniv3SubscribeInfo != null ? investUniv3SubscribeInfo.getReserveFee() : null)) {
                return true;
            }
        }
        return false;
    }

    public final BigDecimal OLrzqt(int i) {
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        InvestTokenWithAmount investTokenWithAmount = this.AubY;
        int iAhwBna = C33129mqd.AhwBna(investTokenWithAmount != null ? investTokenWithAmount.getTokenPrecision() : null);
        InvestTokenWithAmount investTokenWithAmount2 = this.gkJEwt;
        BigDecimal bigDecimalEZpvd = c27492jwH.EZpvd(i, iAhwBna, C33129mqd.AhwBna(investTokenWithAmount2 != null ? investTokenWithAmount2.getTokenPrecision() : null), this.UeEOUB, this.djSkpj, this.AEQbTJ);
        return this.ORxRYg ? bigDecimalEZpvd : C33129mqd.EZpvd(C33129mqd.divS$default(1, bigDecimalEZpvd, null, null, null, 14, null));
    }

    public final int OLrzqt(BigDecimal bigDecimal) {
        if (C33129mqd.OLrzqt((Object) bigDecimal, (Object) 0)) {
            return this.ORxRYg ? this.UeEOUB : this.djSkpj;
        }
        BigDecimal bigDecimalEZpvd = this.ORxRYg ? bigDecimal : C33129mqd.EZpvd(C33129mqd.divS$default(1, bigDecimal, null, null, null, 14, null));
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        int i = this.ODWQjV;
        InvestTokenWithAmount investTokenWithAmount = this.AubY;
        int iAhwBna = C33129mqd.AhwBna(investTokenWithAmount != null ? investTokenWithAmount.getTokenPrecision() : null);
        InvestTokenWithAmount investTokenWithAmount2 = this.gkJEwt;
        int iCopydefault = c27492jwH.copydefault(bigDecimalEZpvd, i, iAhwBna, C33129mqd.AhwBna(investTokenWithAmount2 != null ? investTokenWithAmount2.getTokenPrecision() : null), this.UeEOUB, this.djSkpj, this.AEQbTJ);
        float fFloatValue = bigDecimal.floatValue();
        int i2 = iCopydefault;
        for (int i3 = -1; i3 < 2; i3++) {
            BigDecimal bigDecimalOLrzqt = OLrzqt((this.ODWQjV * i3) + iCopydefault);
            BigDecimal bigDecimalSubtract = bigDecimalOLrzqt.subtract(bigDecimal);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
            if (Math.abs(bigDecimalSubtract.floatValue()) < fFloatValue) {
                BigDecimal bigDecimalSubtract2 = bigDecimalOLrzqt.subtract(bigDecimal);
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "");
                fFloatValue = Math.abs(bigDecimalSubtract2.floatValue());
                i2 = (this.ODWQjV * i3) + iCopydefault;
            }
        }
        return i2;
    }

    public final int KWHzl(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        if (C33129mqd.OLrzqt((Object) bigDecimal, (Object) 0)) {
            return this.ORxRYg ? this.UeEOUB : this.djSkpj;
        }
        BigDecimal bigDecimalEZpvd = this.ORxRYg ? bigDecimal : C33129mqd.EZpvd(C33129mqd.divS$default(1, bigDecimal, null, null, null, 14, null));
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        int i = this.ODWQjV;
        InvestTokenWithAmount investTokenWithAmount = this.AubY;
        int iAhwBna = C33129mqd.AhwBna(investTokenWithAmount != null ? investTokenWithAmount.getTokenPrecision() : null);
        InvestTokenWithAmount investTokenWithAmount2 = this.gkJEwt;
        int iCopydefault = c27492jwH.copydefault(bigDecimalEZpvd, i, iAhwBna, C33129mqd.AhwBna(investTokenWithAmount2 != null ? investTokenWithAmount2.getTokenPrecision() : null), this.UeEOUB, this.djSkpj, this.AEQbTJ);
        return (!(C33129mqd.AEQbTJ(bigDecimal, this.fIwbmz.getValue()) && this.ORxRYg) && (!C33129mqd.gEmmrt(bigDecimal, this.fIwbmz.getValue()) || this.ORxRYg)) ? iCopydefault : iCopydefault + this.ODWQjV;
    }

    public final int copydefault(@NotNull BigDecimal bigDecimal, boolean z) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        if (C33129mqd.OLrzqt((Object) bigDecimal, (Object) 0)) {
            return this.ORxRYg ? this.UeEOUB : this.djSkpj;
        }
        if (!this.ORxRYg) {
            bigDecimal = C33129mqd.EZpvd(C33129mqd.divS$default(1, bigDecimal, null, null, null, 14, null));
        }
        BigDecimal bigDecimal2 = bigDecimal;
        C27492jwH c27492jwH = C27492jwH.OLrzqt;
        int i = this.ODWQjV;
        InvestTokenWithAmount investTokenWithAmount = this.AubY;
        int iAhwBna = C33129mqd.AhwBna(investTokenWithAmount != null ? investTokenWithAmount.getTokenPrecision() : null);
        InvestTokenWithAmount investTokenWithAmount2 = this.gkJEwt;
        int iCopydefault = c27492jwH.copydefault(bigDecimal2, i, iAhwBna, C33129mqd.AhwBna(investTokenWithAmount2 != null ? investTokenWithAmount2.getTokenPrecision() : null), this.UeEOUB, this.djSkpj, this.AEQbTJ);
        return (!(z && this.ORxRYg) && (z || this.ORxRYg)) ? iCopydefault : iCopydefault + this.ODWQjV;
    }

    public final C27315jsq AEQbTJ(@NotNull BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(bigDecimal, "");
        int iKWHzl = KWHzl(bigDecimal);
        return new C27315jsq(OLrzqt(iKWHzl), iKWHzl);
    }

    public final String AYXKKw() {
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        String reserveFee = investUniv3SubscribeInfo != null ? investUniv3SubscribeInfo.getReserveFee() : null;
        if (reserveFee == null || reserveFee.length() == 0) {
            return "0.01";
        }
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo2 = this.valueOf;
        Intrinsics.copydefault(investUniv3SubscribeInfo2);
        return investUniv3SubscribeInfo2.getReserveFee();
    }

    public final Object EZpvd(@NotNull MutableStateFlow<C25480ixX> mutableStateFlow, @NotNull Continuation<? super Unit> continuation) {
        C25480ixX value = mutableStateFlow.getValue();
        C25480ixX c25480ixXEZpvd = value.EZpvd((6095 & 1) != 0 ? value.OLrzqt : null, (6095 & 2) != 0 ? value.EZpvd : null, (6095 & 4) != 0 ? value.KWHzl : null, (6095 & 8) != 0 ? value.AEQbTJ : null, (6095 & 16) != 0 ? value.valueOf : false, (6095 & 32) != 0 ? value.AYXKKw : false, (6095 & 64) != 0 ? value.AhwBna : false, (6095 & 128) != 0 ? value.gEmmrt : false, (6095 & 256) != 0 ? value.djBIcL : false, (6095 & 512) != 0 ? value.values : null, (6095 & 1024) != 0 ? value.fetchVPNInfo : 0, (6095 & 2048) != 0 ? value.AkhnZx : null, (6095 & 4096) != 0 ? value.copydefault : false);
        c25480ixXEZpvd.AEQbTJ(true);
        Object objEmit = mutableStateFlow.emit(c25480ixXEZpvd, continuation);
        return objEmit == C56442yFn.copydefault() ? objEmit : Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, C9917bed c9917bed) {
        Intrinsics.checkNotNullParameter(c9917bed, "");
        if (investUniv3SubscribeViewModel.copydefault(investUniv3SubscribeViewModel.DarRvM, c9917bed)) {
            InvestTokenWithAmount investTokenWithAmount = investUniv3SubscribeViewModel.DarRvM;
            if (investTokenWithAmount != null) {
                String strKWHzl = c9917bed.KWHzl();
                if (strKWHzl == null) {
                    strKWHzl = "0";
                }
                investTokenWithAmount.setCoinAmount(strKWHzl);
            }
            InvestTokenWithAmount investTokenWithAmount2 = investUniv3SubscribeViewModel.DarRvM;
            if (investTokenWithAmount2 != null) {
                String strAEQbTJ = c9917bed.AEQbTJ();
                investTokenWithAmount2.setCurrencyAmount(strAEQbTJ != null ? strAEQbTJ : "0");
            }
        } else {
            if (investUniv3SubscribeViewModel.copydefault(investUniv3SubscribeViewModel.ffGIBT, c9917bed)) {
                InvestTokenWithAmount investTokenWithAmount3 = investUniv3SubscribeViewModel.ffGIBT;
                if (investTokenWithAmount3 != null) {
                    String strKWHzl2 = c9917bed.KWHzl();
                    if (strKWHzl2 == null) {
                        strKWHzl2 = "0";
                    }
                    investTokenWithAmount3.setCoinAmount(strKWHzl2);
                }
                InvestTokenWithAmount investTokenWithAmount4 = investUniv3SubscribeViewModel.ffGIBT;
                if (investTokenWithAmount4 != null) {
                    String strAEQbTJ2 = c9917bed.AEQbTJ();
                    investTokenWithAmount4.setCurrencyAmount(strAEQbTJ2 != null ? strAEQbTJ2 : "0");
                }
            }
            return Unit.INSTANCE;
        }
        investUniv3SubscribeViewModel.KWHzl(4);
        return Unit.INSTANCE;
    }

    private final boolean copydefault(InvestTokenWithAmount investTokenWithAmount, C9917bed c9917bed) {
        if (investTokenWithAmount == null) {
            return false;
        }
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

    public final void dmfpNf() {
        C25595izg.AEQbTJ.AEQbTJ("invest_global").OLrzqt().removeIncrementListener(this.getPostValueLengthLimit);
    }

    public final void RKDWNf() {
        if (this.uzCIH) {
            RdAHlO();
        } else {
            hBpjJd();
        }
    }

    public final void QHmsKR() {
        this.iRxXKY.dispose();
    }

    private final void hBpjJd() {
        String[] strArr = new String[2];
        InvestTokenWithAmount investTokenWithAmount = this.AubY;
        strArr[0] = investTokenWithAmount != null ? investTokenWithAmount.getTokenAddress() : null;
        InvestTokenWithAmount investTokenWithAmount2 = this.gkJEwt;
        strArr[1] = investTokenWithAmount2 != null ? investTokenWithAmount2.getTokenAddress() : null;
        C25595izg.AEQbTJ.AEQbTJ("invest_global").OLrzqt().getBanlanceFromServer(this.hBpjJd, this.AhwBna, this.gwTjWJ, CollectionsKt___CollectionsKt.QfsBiF(yDY.copydefault(strArr)));
    }

    private final void RdAHlO() {
        valueOf(4);
        this.uzCIH = false;
    }

    public final void KWHzl(@NotNull TransactionStage transactionStage) {
        List<TransactionStep> transactionStepList;
        List<TransactionStep> listAhwBna;
        Intrinsics.checkNotNullParameter(transactionStage, "");
        this.fJNWhG = transactionStage;
        if (transactionStage == TransactionStage.RECEIVE_INFO_TIME_OUT) {
            InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.AYXKKw;
            if (investUniv3SubscribeReceiveInfo == null || (listAhwBna = investUniv3SubscribeReceiveInfo.getTransactionStepList()) == null) {
                listAhwBna = yDY.AhwBna();
            }
            copydefault(listAhwBna);
            return;
        }
        InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.AYXKKw;
        if (investUniv3SubscribeReceiveInfo2 == null || (transactionStepList = investUniv3SubscribeReceiveInfo2.getTransactionStepList()) == null) {
            return;
        }
        copydefault(transactionStepList);
    }

    private final void copydefault(List<TransactionStep> list) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$reloadCTAButton$1(this, list, null), 3, null);
    }

    public static /* synthetic */ void settleTransaction$default(InvestUniv3SubscribeViewModel investUniv3SubscribeViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        investUniv3SubscribeViewModel.djBIcL(z);
    }

    public final void djBIcL(boolean z) {
        C27493jwI.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$settleTransaction$1(this, z, null), 3, null);
    }

    public final void QSBOWP() {
        Object objM7377constructorimpl;
        List<InvestTokenWithAmount> investWithTokenList;
        if (this.fvQaOB) {
            try {
                Result.Application application = Result.Companion;
                StringBuilder sb = new StringBuilder();
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.AYXKKw;
                if (investUniv3SubscribeReceiveInfo != null && (investWithTokenList = investUniv3SubscribeReceiveInfo.getInvestWithTokenList()) != null) {
                    ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(investWithTokenList, 10));
                    for (InvestTokenWithAmount investTokenWithAmount : investWithTokenList) {
                        arrayList.add(investTokenWithAmount.getTokenName() + " : " + investTokenWithAmount.getCoinAmount());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                    }
                }
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.AYXKKw;
                pUU.EZpvd("Univ3Zap", "server return openMev: " + (investUniv3SubscribeReceiveInfo2 != null ? Boolean.valueOf(investUniv3SubscribeReceiveInfo2.getOpenMev()) : null) + ", input token and amount: " + ((Object) sb));
                objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7380exceptionOrNullimpl(objM7377constructorimpl) != null) {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo3 = this.AYXKKw;
                pUU.EZpvd("Univ3Zap", "server return openMev: " + (investUniv3SubscribeReceiveInfo3 != null ? Boolean.valueOf(investUniv3SubscribeReceiveInfo3.getOpenMev()) : null) + ", get coinAmount error");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InvestTxModel EZpvd(TransactionConfig transactionConfig, InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo, TransactionStep transactionStep) {
        InvestTokenWithAmount investTokenWithAmountCopy;
        InvestTokenWithAmount investTokenWithAmountCopy2;
        List listValueOf;
        List list;
        List<FromToken> listKWHzl;
        String estimateGasFee;
        Integer numOLrzqt = iCH.OLrzqt(investUniv3SubscribeReceiveInfo.getTransactionStepList(), transactionStep.gEmmrt(), new Function1() { // from class: o.jmy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return InvestUniv3SubscribeViewModel.KWHzl((TransactionStep) obj);
            }
        }, new Function1() { // from class: o.jmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(InvestUniv3SubscribeViewModel.AEQbTJ((TransactionStep) obj));
            }
        });
        int iValueOf = transactionStep.valueOf();
        String str = this.gwTjWJ;
        String str2 = this.hBpjJd;
        List listEZpvd = C56402yEa.EZpvd(Long.valueOf(transactionConfig.isConnected()));
        long jCopydefault = transactionConfig.copydefault();
        InvestTokenWithAmount receiveTokenInfo = investUniv3SubscribeReceiveInfo.getReceiveTokenInfo();
        if (receiveTokenInfo != null) {
            receiveTokenInfo.setChainId(transactionConfig.copydefault());
            receiveTokenInfo.setCurrencyAmount("");
            Unit unit = Unit.INSTANCE;
        } else {
            receiveTokenInfo = null;
        }
        List listOLrzqt = yDY.OLrzqt(receiveTokenInfo);
        if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
            String strGEmmrt = transactionStep.gEmmrt();
            listValueOf = C56402yEa.EZpvd(new InvestTokenWithAmount(transactionStep.KWHzl(), (String) null, (String) null, false, false, (String) null, strGEmmrt == null ? "" : strGEmmrt, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Integer) null, (ButtonType) null, (String) null, (String) null, (InvestTokenType) null, (Long) null, (Long) null, 0, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 268435390, (DefaultConstructorMarker) null));
        } else {
            if (this.fvQaOB) {
                if (this.QOLQEE && (this.hrNTAI.length() == 0 || C33129mqd.OLrzqt(this.hrNTAI, "0"))) {
                    String str3 = this.hrNTAI;
                    InvestTokenWithAmount investTokenWithAmount = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investUniv3SubscribeReceiveInfo.getInvestWithTokenList());
                    pUU.EZpvd("Univ3Zap", "settle input coinAmount: " + str3 + ", server return coinAmount: " + (investTokenWithAmount != null ? investTokenWithAmount.getCoinAmount() : null));
                }
                if (!this.QOLQEE && investUniv3SubscribeReceiveInfo.getInvestWithTokenList().size() > 1 && (C33129mqd.OLrzqt(this.RdAHlO, "0") || this.RdAHlO.length() == 0 || C33129mqd.OLrzqt(this.DLWbHP, "0") || this.DLWbHP.length() == 0)) {
                    String str4 = this.RdAHlO;
                    InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.firstOrNull(investUniv3SubscribeReceiveInfo.getInvestWithTokenList());
                    String coinAmount = investTokenWithAmount2 != null ? investTokenWithAmount2.getCoinAmount() : null;
                    String str5 = this.DLWbHP;
                    InvestTokenWithAmount investTokenWithAmount3 = (InvestTokenWithAmount) CollectionsKt___CollectionsKt.wlaJM(investUniv3SubscribeReceiveInfo.getInvestWithTokenList());
                    pUU.EZpvd("Univ3Zap", "settle input 1 coinAmount: " + str4 + ",  server return 1 coinAmount: " + coinAmount + " input 2 coinAmount: " + str5 + ",  server return 2 coinAmount: " + (investTokenWithAmount3 != null ? investTokenWithAmount3.getCoinAmount() : null));
                }
                List<InvestTokenWithAmount> investWithTokenList = investUniv3SubscribeReceiveInfo.getInvestWithTokenList();
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(investWithTokenList, 10));
                for (InvestTokenWithAmount investTokenWithAmount4 : investWithTokenList) {
                    arrayList.add(investTokenWithAmount4.copy((268435455 & 1) != 0 ? investTokenWithAmount4.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount4.coinAmount : C33129mqd.mulS$default(investTokenWithAmount4.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmount4.getTokenPrecision()))), null, null, null, 14, null), (268435455 & 4) != 0 ? investTokenWithAmount4.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount4.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount4.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount4.network : null, (268435455 & 64) != 0 ? investTokenWithAmount4.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount4.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount4.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount4.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount4.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount4.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount4.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount4.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount4.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount4.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount4.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount4.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount4.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount4.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount4.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount4.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount4.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount4.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount4.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount4.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount4.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount4.tokenPrice : null));
                }
                list = arrayList;
                String strEZpvd = this.AxsJAY.EZpvd(String.valueOf(this.AhwBna));
                String strUzCIH = uzCIH();
                InvestGasPriceConfig value = OLrzqt().getValue();
                String str6 = (value != null || (estimateGasFee = value.getEstimateGasFee()) == null) ? "" : estimateGasFee;
                String strZLjUOn = zLjUOn();
                String first = OLrzqt(OLrzqt().getValue()).getFirst();
                Gson gson = new Gson();
                InvestTransactionParam.Companion companion = InvestTransactionParam.Companion;
                String str7 = this.zuWLRA;
                List<TransactionStep> transactionStepList = investUniv3SubscribeReceiveInfo.getTransactionStepList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : transactionStepList) {
                    TransactionStep transactionStep2 = (TransactionStep) obj;
                    if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep2.valueOf()) && transactionStep2.fetchVPNInfo()) {
                        arrayList2.add(obj);
                    }
                }
                String json = gson.toJson(companion.KWHzl(transactionConfig, str7, 2, C33129mqd.AEQbTJ(Integer.valueOf(arrayList2.size()), 1), numOLrzqt, new InvestPoolV3(Integer.valueOf((!this.ORxRYg ? this.QbewEr : this.dmfpNf).KWHzl()), Integer.valueOf((!this.ORxRYg ? this.dmfpNf : this.QbewEr).KWHzl()), investUniv3SubscribeReceiveInfo.getPositionStatus(), !this.ORxRYg)));
                Intrinsics.checkNotNullExpressionValue(json, "");
                String str8 = this.zuWLRA;
                String str9 = !C33129mqd.OLrzqt((CharSequence) str8) ? str8 : null;
                int iKWHzl = (!this.ORxRYg ? this.QbewEr : this.dmfpNf).KWHzl();
                int iKWHzl2 = (!this.ORxRYg ? this.dmfpNf : this.QbewEr).KWHzl();
                if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
                    C27492jwH c27492jwH = C27492jwH.OLrzqt;
                    List<InvestTokenWithAmount> investWithTokenList2 = investUniv3SubscribeReceiveInfo.getInvestWithTokenList();
                    if (investWithTokenList2 == null) {
                        investWithTokenList2 = yDY.AhwBna();
                    }
                    listKWHzl = c27492jwH.KWHzl(investWithTokenList2);
                } else {
                    listKWHzl = null;
                }
                int iAEQbTJ = transactionStep.AEQbTJ();
                String strOLrzqt = transactionStep.OLrzqt();
                return new InvestTxModel(iValueOf, str, str2, listEZpvd, (Long) null, jCopydefault, "0", listOLrzqt, (List) null, (List) null, list, strEZpvd, strUzCIH, str6, strZLjUOn, first, json, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, str9, (String) null, Integer.valueOf(iKWHzl), Integer.valueOf(iKWHzl2), (List) listKWHzl, Integer.valueOf(iAEQbTJ), (String) null, strOLrzqt.length() != 0 ? null : strOLrzqt, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, transactionConfig.values(), transactionConfig.uzCIH(), copydefault(investUniv3SubscribeReceiveInfo.getSwapSlippage()), (List) null, investUniv3SubscribeReceiveInfo.getOpenMev(), (Long) null, 402522896, 41978, (DefaultConstructorMarker) null);
            }
            InvestTokenWithAmount[] investTokenWithAmountArr = new InvestTokenWithAmount[2];
            InvestTokenWithAmount investTokenWithAmount5 = this.AubY;
            if (investTokenWithAmount5 == null || (investTokenWithAmountCopy = investTokenWithAmount5.copy((268435455 & 1) != 0 ? investTokenWithAmount5.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount5.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount5.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount5.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount5.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount5.network : null, (268435455 & 64) != 0 ? investTokenWithAmount5.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount5.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount5.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount5.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount5.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount5.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount5.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount5.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount5.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount5.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount5.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount5.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount5.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount5.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount5.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount5.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount5.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount5.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount5.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount5.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount5.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount5.tokenPrice : null)) == null) {
                investTokenWithAmountCopy = null;
            } else {
                investTokenWithAmountCopy.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy.getTokenPrecision()))), null, null, null, 14, null));
                Unit unit2 = Unit.INSTANCE;
            }
            investTokenWithAmountArr[0] = investTokenWithAmountCopy;
            InvestTokenWithAmount investTokenWithAmount6 = this.gkJEwt;
            if (investTokenWithAmount6 == null || (investTokenWithAmountCopy2 = investTokenWithAmount6.copy((268435455 & 1) != 0 ? investTokenWithAmount6.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount6.coinAmount : null, (268435455 & 4) != 0 ? investTokenWithAmount6.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount6.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount6.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount6.network : null, (268435455 & 64) != 0 ? investTokenWithAmount6.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount6.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount6.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount6.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount6.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount6.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount6.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount6.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount6.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount6.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount6.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount6.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount6.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount6.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount6.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount6.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount6.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount6.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount6.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount6.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount6.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount6.tokenPrice : null)) == null) {
                investTokenWithAmountCopy2 = null;
            } else {
                investTokenWithAmountCopy2.setCoinAmount(C33129mqd.mulS$default(investTokenWithAmountCopy2.getCoinAmount(), Double.valueOf(Math.pow(10.0d, C33129mqd.AEQbTJ(investTokenWithAmountCopy2.getTokenPrecision()))), null, null, null, 14, null));
                Unit unit3 = Unit.INSTANCE;
            }
            investTokenWithAmountArr[1] = investTokenWithAmountCopy2;
            listValueOf = yDY.valueOf(investTokenWithAmountArr);
        }
        list = listValueOf;
        String strEZpvd2 = this.AxsJAY.EZpvd(String.valueOf(this.AhwBna));
        String strUzCIH2 = uzCIH();
        InvestGasPriceConfig value2 = OLrzqt().getValue();
        if (value2 != null) {
        }
        String strZLjUOn2 = zLjUOn();
        String first2 = OLrzqt(OLrzqt().getValue()).getFirst();
        Gson gson2 = new Gson();
        InvestTransactionParam.Companion companion2 = InvestTransactionParam.Companion;
        String str72 = this.zuWLRA;
        List<TransactionStep> transactionStepList2 = investUniv3SubscribeReceiveInfo.getTransactionStepList();
        ArrayList arrayList22 = new ArrayList();
        while (r3.hasNext()) {
        }
        String json2 = gson2.toJson(companion2.KWHzl(transactionConfig, str72, 2, C33129mqd.AEQbTJ(Integer.valueOf(arrayList22.size()), 1), numOLrzqt, new InvestPoolV3(Integer.valueOf((!this.ORxRYg ? this.QbewEr : this.dmfpNf).KWHzl()), Integer.valueOf((!this.ORxRYg ? this.dmfpNf : this.QbewEr).KWHzl()), investUniv3SubscribeReceiveInfo.getPositionStatus(), !this.ORxRYg)));
        Intrinsics.checkNotNullExpressionValue(json2, "");
        String str82 = this.zuWLRA;
        if (!C33129mqd.OLrzqt((CharSequence) str82)) {
        }
        int iKWHzl3 = (!this.ORxRYg ? this.QbewEr : this.dmfpNf).KWHzl();
        int iKWHzl22 = (!this.ORxRYg ? this.dmfpNf : this.QbewEr).KWHzl();
        if (InvestTradeManager.OLrzqt.AEQbTJ(transactionStep.valueOf())) {
        }
        int iAEQbTJ2 = transactionStep.AEQbTJ();
        String strOLrzqt2 = transactionStep.OLrzqt();
        return new InvestTxModel(iValueOf, str, str2, listEZpvd, (Long) null, jCopydefault, "0", listOLrzqt, (List) null, (List) null, list, strEZpvd2, strUzCIH2, str6, strZLjUOn2, first2, json2, 0, false, (Long) null, (String) null, 0, (List) null, (Integer) null, (List) null, (Map) null, (String) null, str9, (String) null, Integer.valueOf(iKWHzl3), Integer.valueOf(iKWHzl22), (List) listKWHzl, Integer.valueOf(iAEQbTJ2), (String) null, strOLrzqt2.length() != 0 ? null : strOLrzqt2, (String) null, (String) null, (String) null, (String) null, (BTCMode) null, (String) null, (String) null, transactionConfig.values(), transactionConfig.uzCIH(), copydefault(investUniv3SubscribeReceiveInfo.getSwapSlippage()), (List) null, investUniv3SubscribeReceiveInfo.getOpenMev(), (Long) null, 402522896, 41978, (DefaultConstructorMarker) null);
    }

    public static final String KWHzl(TransactionStep transactionStep) {
        Intrinsics.checkNotNullParameter(transactionStep, "");
        return transactionStep.gEmmrt();
    }

    public static final int AEQbTJ(TransactionStep transactionStep) {
        Intrinsics.checkNotNullParameter(transactionStep, "");
        return transactionStep.valueOf();
    }

    public final String copydefault(String str) {
        if (!this.QKVWgx) {
            return this.OcIXYQ ? C33129mqd.divS$default(this.DAIeex, "100", null, null, null, 14, null) : str;
        }
        String str2 = this.OqFWZa;
        if (str2 == null) {
            str2 = "";
        }
        return C33129mqd.KWHzl(C33129mqd.divS$default(str2, "100", null, null, null, 14, null), str);
    }

    public final String KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return copydefault(str);
    }

    public final boolean DCUTEI() {
        Integer displayDepthGraph;
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo = this.valueOf;
        return !((investUniv3SubscribeInfo == null || (displayDepthGraph = investUniv3SubscribeInfo.getDisplayDepthGraph()) == null || displayDepthGraph.intValue() != 0) ? false : true);
    }

    public final Object copydefault(boolean z, @NotNull String str, @NotNull InvestTokenWithAmount investTokenWithAmount, @NotNull String str2, InvestTokenWithAmount investTokenWithAmount2, boolean z2, @NotNull Continuation<? super InvestUniv3SubscribeReceiveInfo> continuation) {
        return BuildersKt__Builders_commonKt.async$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$getZapReceiveInfoAndCheckState$2(z, str, investTokenWithAmount, str2, investTokenWithAmount2, this, z2, null), 3, null).await(continuation);
    }

    @Override // o.C27042jni.TaskDescription
    public void KWHzl(int i, @NotNull ZapMode zapMode) {
        Object next;
        InvestTokenWithAmount investTokenWithAmountCopy;
        Object next2;
        InvestTokenWithAmount investTokenWithAmountCopy2;
        InvestTokenWithAmount investTokenWithAmount;
        Object next3;
        InvestTokenWithAmount investTokenWithAmountCopy3;
        Intrinsics.checkNotNullParameter(zapMode, "");
        if (this.fvQaOB) {
            if (zapMode == ZapMode.SINGLE_CRYPTO) {
                if (this.AuCTel == null || this.isConnected == null) {
                    this.fZBcTu.setValue(new C27024jnQ(null, YieldState.DASH));
                    this.dxcTrN.setValue("--");
                    this.RKDWNf.setValue(new C23962iPu(false, null, 2, null));
                    return;
                }
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo = this.DbNXlk;
                this.AYXKKw = investUniv3SubscribeReceiveInfo;
                if (investUniv3SubscribeReceiveInfo != null && (investTokenWithAmount = this.QCjLjM) != null && (!StringsKt__StringsKt.fARcdN((CharSequence) this.hrNTAI)) && !Intrinsics.EZpvd((Object) this.hrNTAI, (Object) "0")) {
                    Iterator<T> it = investUniv3SubscribeReceiveInfo.getInvestWithTokenList().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next3 = null;
                            break;
                        } else {
                            next3 = it.next();
                            if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next3).getTokenAddress(), (Object) investTokenWithAmount.getTokenAddress())) {
                                break;
                            }
                        }
                    }
                    InvestTokenWithAmount investTokenWithAmount2 = (InvestTokenWithAmount) next3;
                    if (investTokenWithAmount2 != null) {
                        investTokenWithAmountCopy3 = investTokenWithAmount2.copy((268435455 & 1) != 0 ? investTokenWithAmount2.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount2.coinAmount : this.hrNTAI, (268435455 & 4) != 0 ? investTokenWithAmount2.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount2.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount2.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount2.network : null, (268435455 & 64) != 0 ? investTokenWithAmount2.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount2.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount2.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount2.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount2.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount2.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount2.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount2.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount2.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount2.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount2.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount2.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount2.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount2.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount2.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount2.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount2.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount2.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount2.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount2.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount2.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount2.tokenPrice : null);
                    } else {
                        investTokenWithAmountCopy3 = investTokenWithAmount.copy((268435455 & 1) != 0 ? investTokenWithAmount.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount.coinAmount : this.hrNTAI, (268435455 & 4) != 0 ? investTokenWithAmount.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount.network : null, (268435455 & 64) != 0 ? investTokenWithAmount.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount.tokenPrice : null);
                    }
                    this.AubY = investTokenWithAmountCopy3;
                    this.gkJEwt = null;
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$onPageChanged$2(this, null), 3, null);
                return;
            }
            if (this.fetchVPNInfo != null && this.AkhnZx != null) {
                InvestUniv3SubscribeReceiveInfo investUniv3SubscribeReceiveInfo2 = this.values;
                this.AYXKKw = investUniv3SubscribeReceiveInfo2;
                if (investUniv3SubscribeReceiveInfo2 != null) {
                    InvestTokenWithAmount investTokenWithAmount3 = this.OHqIaq;
                    InvestTokenWithAmount investTokenWithAmount4 = this.OFhtUX;
                    if (investTokenWithAmount3 != null && (!StringsKt__StringsKt.fARcdN((CharSequence) this.RdAHlO)) && !Intrinsics.EZpvd((Object) this.RdAHlO, (Object) "0")) {
                        Iterator<T> it2 = investUniv3SubscribeReceiveInfo2.getInvestWithTokenList().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            } else {
                                next2 = it2.next();
                                if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next2).getTokenAddress(), (Object) investTokenWithAmount3.getTokenAddress())) {
                                    break;
                                }
                            }
                        }
                        InvestTokenWithAmount investTokenWithAmount5 = (InvestTokenWithAmount) next2;
                        if (investTokenWithAmount5 != null) {
                            investTokenWithAmountCopy2 = investTokenWithAmount5.copy((268435455 & 1) != 0 ? investTokenWithAmount5.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount5.coinAmount : this.RdAHlO, (268435455 & 4) != 0 ? investTokenWithAmount5.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount5.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount5.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount5.network : null, (268435455 & 64) != 0 ? investTokenWithAmount5.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount5.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount5.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount5.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount5.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount5.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount5.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount5.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount5.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount5.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount5.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount5.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount5.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount5.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount5.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount5.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount5.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount5.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount5.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount5.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount5.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount5.tokenPrice : null);
                        } else {
                            investTokenWithAmountCopy2 = investTokenWithAmount3.copy((268435455 & 1) != 0 ? investTokenWithAmount3.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount3.coinAmount : this.RdAHlO, (268435455 & 4) != 0 ? investTokenWithAmount3.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount3.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount3.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount3.network : null, (268435455 & 64) != 0 ? investTokenWithAmount3.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount3.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount3.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount3.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount3.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount3.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount3.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount3.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount3.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount3.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount3.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount3.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount3.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount3.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount3.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount3.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount3.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount3.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount3.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount3.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount3.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount3.tokenPrice : null);
                        }
                        this.AubY = investTokenWithAmountCopy2;
                    }
                    if (investTokenWithAmount4 != null && (!StringsKt__StringsKt.fARcdN((CharSequence) this.DLWbHP)) && !Intrinsics.EZpvd((Object) this.DLWbHP, (Object) "0")) {
                        Iterator<T> it3 = investUniv3SubscribeReceiveInfo2.getInvestWithTokenList().iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it3.next();
                                if (Intrinsics.EZpvd((Object) ((InvestTokenWithAmount) next).getTokenAddress(), (Object) investTokenWithAmount4.getTokenAddress())) {
                                    break;
                                }
                            }
                        }
                        InvestTokenWithAmount investTokenWithAmount6 = (InvestTokenWithAmount) next;
                        if (investTokenWithAmount6 != null) {
                            investTokenWithAmountCopy = investTokenWithAmount6.copy((268435455 & 1) != 0 ? investTokenWithAmount6.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount6.coinAmount : this.DLWbHP, (268435455 & 4) != 0 ? investTokenWithAmount6.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount6.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount6.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount6.network : null, (268435455 & 64) != 0 ? investTokenWithAmount6.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount6.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount6.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount6.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount6.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount6.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount6.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount6.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount6.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount6.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount6.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount6.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount6.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount6.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount6.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount6.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount6.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount6.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount6.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount6.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount6.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount6.tokenPrice : null);
                        } else {
                            investTokenWithAmountCopy = investTokenWithAmount4.copy((268435455 & 1) != 0 ? investTokenWithAmount4.chainId : 0L, (268435455 & 2) != 0 ? investTokenWithAmount4.coinAmount : this.DLWbHP, (268435455 & 4) != 0 ? investTokenWithAmount4.currencyAmount : null, (268435455 & 8) != 0 ? investTokenWithAmount4.depositTips : false, (268435455 & 16) != 0 ? investTokenWithAmount4.isBaseToken : false, (268435455 & 32) != 0 ? investTokenWithAmount4.network : null, (268435455 & 64) != 0 ? investTokenWithAmount4.tokenAddress : null, (268435455 & 128) != 0 ? investTokenWithAmount4.tokenLogo : null, (268435455 & 256) != 0 ? investTokenWithAmount4.tokenName : null, (268435455 & 512) != 0 ? investTokenWithAmount4.tokenSymbol : null, (268435455 & 1024) != 0 ? investTokenWithAmount4.tokenPrecision : null, (268435455 & 2048) != 0 ? investTokenWithAmount4.browserUrl : null, (268435455 & 4096) != 0 ? investTokenWithAmount4.tokenId : null, (268435455 & 8192) != 0 ? investTokenWithAmount4.isCanClaim : null, (268435455 & 16384) != 0 ? investTokenWithAmount4.buttonType : null, (268435455 & 32768) != 0 ? investTokenWithAmount4.expectTokenAddress : null, (268435455 & 65536) != 0 ? investTokenWithAmount4.transferableBalance : null, (268435455 & 131072) != 0 ? investTokenWithAmount4.dataType : null, (268435455 & 262144) != 0 ? investTokenWithAmount4.availableClaimTime : null, (268435455 & 524288) != 0 ? investTokenWithAmount4.collectionDeadLine : null, (268435455 & 1048576) != 0 ? investTokenWithAmount4.availableClaimType : 0, (268435455 & 2097152) != 0 ? investTokenWithAmount4.minInvestAmount : null, (268435455 & 4194304) != 0 ? investTokenWithAmount4.originalInvestmentId : null, (268435455 & 8388608) != 0 ? investTokenWithAmount4.originalProductType : null, (268435455 & 16777216) != 0 ? investTokenWithAmount4.rangeMinCoinAmount : null, (268435455 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? investTokenWithAmount4.safeMinAmount : null, (268435455 & 67108864) != 0 ? investTokenWithAmount4.safeMaxAmount : null, (268435455 & 134217728) != 0 ? investTokenWithAmount4.tokenPrice : null);
                        }
                        this.gkJEwt = investTokenWithAmountCopy;
                    }
                }
                BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new InvestUniv3SubscribeViewModel$onPageChanged$4(this, null), 3, null);
                return;
            }
            this.fZBcTu.setValue(new C27024jnQ(null, YieldState.DASH));
            this.dxcTrN.setValue("--");
            this.RKDWNf.setValue(new C23962iPu(false, null, 2, null));
        }
    }

    public final C23962iPu AEQbTJ(ArrayList<String> arrayList) {
        int i;
        C23962iPu c23962iPu;
        if ((arrayList instanceof Collection) && arrayList.isEmpty()) {
            i = 0;
        } else {
            Iterator<T> it = arrayList.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((String) it.next()) != null && (i = i + 1) < 0) {
                    yDY.djBIcL();
                }
            }
        }
        Object obj = null;
        if (i == 1) {
            int i2 = C25493ixk.FragmentManager.hvKCwS;
            Iterator<T> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((String) next) != null) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            c23962iPu = new C23962iPu(false, KWHzl(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", str != null ? str : ""))));
        } else if (i == 2) {
            int i3 = C25493ixk.FragmentManager.tIwhY;
            Pair[] pairArr = new Pair[2];
            String str2 = (String) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 0);
            if (str2 == null) {
                str2 = "";
            }
            pairArr[0] = C56390yDp.OLrzqt("token1", str2);
            String str3 = (String) CollectionsKt___CollectionsKt.AkhnZx(arrayList, 1);
            pairArr[1] = C56390yDp.OLrzqt("token2", str3 != null ? str3 : "");
            c23962iPu = new C23962iPu(false, KWHzl(i3, C56424yEw.gEmmrt(pairArr)));
        } else {
            return new C23962iPu(true, null, 2, null);
        }
        return c23962iPu;
    }
}

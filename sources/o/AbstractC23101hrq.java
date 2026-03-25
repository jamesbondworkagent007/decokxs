package o;

import androidx.activity.result.ActivityResultLauncher;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.JsonObject;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dexlogic.bean.BlackListTypes;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.LiquidityListItem;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.QuoteErrorBean;
import com.okinc.business.dexlogic.bean.QuotePriceReq;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.button.helper.ApproveHandle;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssetsHandle;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.InitTradeGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.quote.InputCondition;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.QuotePriceHandle;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStatePool;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.WalletCheckHandle;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.WsHandle;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.BaseSwapTradeViewModel$fetchSwapConfig$1;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.BaseSwapTradeViewModel$getPreCheckResult$1;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.MpcWalletService;
import kotlin.Result;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.InterfaceC22387heR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hrq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23101hrq extends AndroidViewModel {
    public final MutableLiveData<java.lang.String> AEQbTJ;
    public final C23314hvr<InterfaceC9738bbJ> AYXKKw;
    public final C23314hvr<java.lang.Boolean> AhwBna;
    public ApproveHandle AkhnZx;
    public final C22643hjI AuCTel;
    public C22901hoB AuCTelauCTel;
    public C23081hrW AubY;
    public java.lang.String AwvSrB;
    public java.lang.String AxsJAY;
    public final MutableLiveData<java.lang.Boolean> AxsJAYaxsJAY;
    public final java.lang.String AxsJAYsNCnLh;
    public final StateFlow<java.lang.String> DAIeex;
    public MutableLiveData<CurrentChain> DCJXGO;
    public C22844hmy DCUTEI;
    public final MutableLiveData<kotlin.Pair<CurrentChain, java.util.List<CurrentChain>>> DLWbHP;
    public final MutableLiveData<java.lang.Boolean> DTwDnp;
    public final MutableLiveData<java.lang.Boolean> DXXBbs;
    public final MutableLiveData<DexMultiTokenInfoBean> DarRvM;
    public final android.app.Application DbNXlk;
    public final MutableStateFlow<Result<DexPresetResultVO>> EZpvd;
    public final MutableStateFlow<AbstractC23151hsn> KWHzl;
    public MutableLiveData<java.lang.String> OBJEWx;
    public final C25412iwI ODWQjV;
    public Observer<TradeState> ODXsMY;
    public final C23212htv OHqIaq;
    public final C23314hvr<PreCheckBean> OLrzqt;
    public boolean ORxRYg;
    public MutableLiveData<java.lang.Boolean> OcIXYQ;
    public final MutableLiveData<java.lang.Boolean> OqFWZa;
    public MutableLiveData<ConsumeData<TradeInputGroup>> OuxcSI;
    public final MutableLiveData<java.lang.Boolean> QHmsKR;
    public final MutableLiveData<java.lang.Boolean> QKVWgx;
    public final C25416iwM QKudOq;
    public boolean QOLQEE;
    public TradeStatePool QSBOWP;
    public boolean QUSxYX;
    public final MutableLiveData<Triple<DefiChainInfo, C22947hov, DexMultiTokenInfoBean>> QVAiDq;
    public InputCondition QbewEr;
    public InitTradeGroup QfsBiF;
    public TradeParam QkdxfA;
    public boolean RJOkX;
    public final C23314hvr<java.lang.String> RKDWNf;
    public final MutableLiveData<java.lang.Boolean> RcXXUw;
    public final MutableLiveData<QuotePriceRes> RdAHlO;
    public final InterfaceC22299hcj RlQdEF;
    public final C22805hmL UeEOUB;
    public boolean aKErDB;
    public final MutableLiveData<java.lang.Boolean> accept;
    public final MutableStateFlow<Result<PreCheckBean>> copydefault;
    public boolean dHguZz;
    public boolean dNCPSb;
    public FragmentActivity djBIcL;
    public final MutableLiveData<MpcWalletService.MpcWalletAbleStatus> djSkpj;
    public java.lang.Object dmfpNf;
    public final MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> dvKsVJ;
    public final InterfaceC19755gOc dxcTrN;
    public final kTW ejfBZ;
    public MutableLiveData<java.lang.Boolean> fARcdN;
    public MutableLiveData<ConsumeData<QuoteErrorBean>> fFgQHt;
    public final C28390kZq fIwbmz;
    public boolean fJNWhG;
    public final StateFlow<AbstractC23151hsn> fZBcTu;
    public ActivityResultLauncher<android.content.Intent> fetchVPNInfo;
    public final C23314hvr<java.lang.String> ffGIBT;
    public final StateFlow<Result<PreCheckBean>> finit;
    public QuotePriceReq flVtFt;
    public final MutableLiveData<java.lang.Boolean> fvQaOB;
    public MutableStateFlow<java.lang.String> gEmmrt;
    public final MutableLiveData<java.lang.Throwable> gGvvIC;
    public MarketTransactionFeeCacheParams gHZMYf;
    public QuotePriceHandle gasjUx;
    public TradeParam getFieldNames;
    public DefiChainInfo getNewProxyInstance;
    public java.lang.String getPostValueLengthLimit;
    public Observer<QuotePriceRes> giSNqX;
    public MutableLiveData<java.lang.Boolean> gkJEwt;
    public MutableLiveData<Triple<DefiChainInfo, C22947hov, DexMultiTokenInfoBean>> gwTjWJ;
    public WalletCheckHandle hBpjJd;
    public MutableLiveData<QuotePriceRes> hDKMBd;
    public boolean hUfVAv;
    public final kKG hrNTAI;
    public PresetRouteType iRxXKY;
    public boolean iZzfmt;
    public MutableLiveData<ConsumeData<java.lang.Boolean>> isConnected;
    public final java.lang.Runnable iwGUEr;
    public final MutableLiveData<DexMultiTokenInfoBean> sSMYrx;
    public CoinAssetsHandle uzCIH;
    public C23314hvr<java.lang.String> valueOf;
    public java.lang.Integer values;
    public C22823hmd wlaJM;
    public java.lang.Object zLjUOn;
    public boolean zsXlph;
    public final StateFlow<Result<DexPresetResultVO>> zuBGHE;
    public java.lang.String zuWLRA;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull DefiChainInfo defiChainInfo) {
        Intrinsics.checkNotNullParameter(defiChainInfo, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(C22901hoB c22901hoB) {
        this.AuCTelauCTel = c22901hoB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.fJNWhG = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityResultLauncher<android.content.Intent> AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.zuWLRA = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AYXKKw(boolean z) {
        this.QOLQEE = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.String> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.getPostValueLengthLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.RJOkX = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AkhnZx(boolean z) {
        this.iZzfmt = z;
    }

    public abstract DexMultiTokenInfoBean AuCTel();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22823hmd AuCTelauCTel() {
        return this.wlaJM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<QuotePriceRes> AubY() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketTransactionFeeCacheParams AwvSrB() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AxsJAY() {
        return this.AxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<PreCheckBean>> AxsJAYaxsJAY() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceReq DAIeex() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> DCJXGO() {
        return this.gkJEwt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25416iwM DCUTEI() {
        return this.QKudOq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DGOPHZ() {
        this.AxsJAY = "";
        this.AwvSrB = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.String> DLWbHP() {
        return this.RKDWNf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> DTwDnp() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DXXBbs() {
        return this.hUfVAv;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DbNXlk(boolean z) {
        this.aKErDB = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(FragmentActivity fragmentActivity) {
        this.djBIcL = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(TradeParam tradeParam) {
        this.QkdxfA = tradeParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull PresetRouteType presetRouteType) {
        Intrinsics.checkNotNullParameter(presetRouteType, "");
        this.iRxXKY = presetRouteType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(java.lang.Integer num) {
        this.values = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.AxsJAY = str;
        this.AwvSrB = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl() {
        this.zsXlph = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams) {
        this.gHZMYf = marketTransactionFeeCacheParams;
    }

    public abstract void KWHzl(@NotNull TradeState tradeState);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OBJEWx() {
        return this.OqFWZa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> ODWQjV() {
        return this.AxsJAYaxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<QuotePriceRes> ODXsMY() {
        return this.RdAHlO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OFhtUX() {
        return this.QHmsKR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Triple<DefiChainInfo, C22947hov, DexMultiTokenInfoBean>> OHqIaq() {
        return this.gwTjWJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<CurrentChain, java.util.List<CurrentChain>>> OJuSTm() {
        return this.DLWbHP;
    }

    public abstract AbstractC58185ywX<ResponseData<java.lang.String>> OLrzqt(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        this.fetchVPNInfo = activityResultLauncher;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.zsXlph = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> OcIXYQ() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetRouteType OqFWZa() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> OuxcSI() {
        return this.DAIeex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23212htv OxVOHk() {
        return this.OHqIaq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22299hcj QHmsKR() {
        return this.RlQdEF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<DexMultiTokenInfoBean> QKVWgx() {
        return this.sSMYrx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> QKudOq() {
        return this.fvQaOB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> QOLQEE() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CurrentChain> QSBOWP() {
        return this.DCJXGO;
    }

    public abstract C22873hna QUSxYX();

    public abstract C22812hmS QVAiDq();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletCheckHandle QVsKAR() {
        return this.hBpjJd;
    }

    public abstract C22815hmV QbewEr();

    public abstract C22814hmU QfsBiF();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> QkdxfA() {
        return this.DXXBbs;
    }

    public abstract C22816hmW RJOkX();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<DexMultiTokenInfoBean> RKDWNf() {
        return this.DarRvM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean RcXXUw() {
        return this.RJOkX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.String> RdAHlO() {
        return this.ffGIBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuotePriceHandle RlQdEF() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean UeEOUB() {
        return this.QOLQEE;
    }

    public abstract boolean UlJrfe();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitTradeGroup aKErDB() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Throwable> accept() {
        return this.gGvvIC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(QuotePriceReq quotePriceReq) {
        this.flVtFt = quotePriceReq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeStatePool dHguZz() {
        return this.QSBOWP;
    }

    public abstract AbstractC22818hmY dNCPSb();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kKG dUDNAs() {
        return this.hrNTAI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ConsumeData<java.lang.Boolean>> djBIcL() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void djBIcL(boolean z) {
        this.ORxRYg = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Triple<DefiChainInfo, C22947hov, DexMultiTokenInfoBean>> djSkpj() {
        return this.QVAiDq;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ConsumeData<TradeInputGroup>> dmfpNf() {
        return this.OuxcSI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> dvKsVJ() {
        return this.RcXXUw;
    }

    public abstract DexMultiTokenInfoBean fIwbmz();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InputCondition fZBcTu() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final kTW fetchVPNInfo() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo(boolean z) {
        this.QUSxYX = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ffGIBT() {
        return this.AxsJAYsNCnLh;
    }

    public abstract AbstractC22885hnm finit();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22805hmL flVtFt() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MpcWalletService.MpcWalletAbleStatus> fvQaOB() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void gEmmrt(boolean z) {
        this.hUfVAv = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC19755gOc gGvvIC() {
        return this.dxcTrN;
    }

    public abstract InterfaceC22598hiQ getFieldNames();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> getPostValueLengthLimit() {
        return this.accept;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean giSNqX() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> gkJEwt() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22844hmy gwTjWJ() {
        return this.DCUTEI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeParam hBpjJd() {
        return this.QkdxfA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ConsumeData<QuoteErrorBean>> hUfVAv() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> hrNTAI() {
        return this.OBJEWx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean htlTjW() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<AbstractC23151hsn> iRxXKY() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<PreCheckBean> iZzfmt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveHandle isConnected() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinAssetsHandle iwGUEr() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<DexPresetResultVO>> sSMYrx() {
        return this.zuBGHE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean spnCvw() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.Boolean> valueOf() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(boolean z) {
        this.dNCPSb = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22643hjI values() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23081hrW wlaJM() {
        return this.AubY;
    }

    public abstract InterfaceC22824hme zLjUOn();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zsXlph() {
        return this.zsXlph;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22901hoB zuBGHE() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean zuWLRA() {
        return this.iZzfmt;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (r14v0 android.app.Application)
  (r15v0 java.lang.String)
  (wrap:com.okinc.business.dex.api.bean.TradeParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.TradeParam) : (r16v0 com.okinc.business.dex.api.bean.TradeParam))
  (wrap:o.iwM:?: TERNARY null = ((wrap:int:0x0009: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0012: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:112) call: o.iwM.<init>():void type: CONSTRUCTOR) : (r17v0 o.iwM))
  (r18v0 o.iwI)
  (r19v0 o.kKG)
  (r20v0 o.kZq)
  (r21v0 o.htv)
  (r22v0 o.hcj)
  (r23v0 o.gOc)
  (r24v0 o.kTW)
 A[MD:(android.app.Application, java.lang.String, com.okinc.business.dex.api.bean.TradeParam, o.iwM, o.iwI, o.kKG, o.kZq, o.htv, o.hcj, o.gOc, o.kTW):void (m)] (LINE:108) call: o.hrq.<init>(android.app.Application, java.lang.String, com.okinc.business.dex.api.bean.TradeParam, o.iwM, o.iwI, o.kKG, o.kZq, o.htv, o.hcj, o.gOc, o.kTW):void type: THIS */
    public /* synthetic */ AbstractC23101hrq(android.app.Application application, java.lang.String str, TradeParam tradeParam, C25416iwM c25416iwM, C25412iwI c25412iwI, kKG kkg, C28390kZq c28390kZq, C23212htv c23212htv, InterfaceC22299hcj interfaceC22299hcj, InterfaceC19755gOc interfaceC19755gOc, kTW ktw, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, (i & 4) != 0 ? null : tradeParam, (i & 8) != 0 ? new C25416iwM() : c25416iwM, c25412iwI, kkg, c28390kZq, c23212htv, interfaceC22299hcj, interfaceC19755gOc, ktw);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC23101hrq(@NotNull android.app.Application application, @NotNull java.lang.String str, TradeParam tradeParam, @NotNull C25416iwM c25416iwM, @NotNull C25412iwI c25412iwI, @NotNull kKG kkg, @NotNull C28390kZq c28390kZq, @NotNull C23212htv c23212htv, @NotNull InterfaceC22299hcj interfaceC22299hcj, @NotNull InterfaceC19755gOc interfaceC19755gOc, @NotNull kTW ktw) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c25416iwM, "");
        Intrinsics.checkNotNullParameter(c25412iwI, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28390kZq, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(interfaceC22299hcj, "");
        Intrinsics.checkNotNullParameter(interfaceC19755gOc, "");
        Intrinsics.checkNotNullParameter(ktw, "");
        this.DbNXlk = application;
        this.AxsJAYsNCnLh = str;
        this.QkdxfA = tradeParam;
        this.QKudOq = c25416iwM;
        this.ODWQjV = c25412iwI;
        this.hrNTAI = kkg;
        this.fIwbmz = c28390kZq;
        this.OHqIaq = c23212htv;
        this.RlQdEF = interfaceC22299hcj;
        this.dxcTrN = interfaceC19755gOc;
        this.ejfBZ = ktw;
        this.OuxcSI = new MutableLiveData<>();
        this.DCJXGO = new MutableLiveData<>();
        this.hDKMBd = new MutableLiveData<>();
        this.QVAiDq = new MutableLiveData<>();
        this.accept = new MutableLiveData<>();
        this.gwTjWJ = new MutableLiveData<>();
        this.gGvvIC = new MutableLiveData<>();
        this.fFgQHt = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.ffGIBT = new C23314hvr<>();
        this.AhwBna = new C23314hvr<>();
        this.isConnected = new MutableLiveData<>();
        this.OcIXYQ = new MutableLiveData<>();
        this.DLWbHP = new MutableLiveData<>();
        this.fvQaOB = new MutableLiveData<>();
        this.OqFWZa = new MutableLiveData<>();
        MutableLiveData<MpcWalletService.MpcWalletAbleStatus> mutableLiveData = new MutableLiveData<>();
        this.djSkpj = mutableLiveData;
        this.valueOf = new C23314hvr<>();
        this.RcXXUw = new MutableLiveData<>();
        this.RKDWNf = new C23314hvr<>();
        this.RdAHlO = new MutableLiveData<>();
        this.sSMYrx = new MutableLiveData<>();
        this.DarRvM = new MutableLiveData<>();
        this.AEQbTJ = new MutableLiveData<>();
        this.dvKsVJ = new MutableLiveData<>();
        this.DTwDnp = new MutableLiveData<>();
        this.AxsJAYaxsJAY = new MutableLiveData<>(java.lang.Boolean.FALSE);
        this.DXXBbs = new MutableLiveData<>();
        this.QKVWgx = new MutableLiveData<>();
        this.QbewEr = new InputCondition();
        this.QfsBiF = new InitTradeGroup(null, false, 3, 0 == true ? 1 : 0);
        this.UeEOUB = new C22805hmL(str);
        this.dNCPSb = true;
        this.uzCIH = new CoinAssetsHandle();
        this.AkhnZx = new ApproveHandle(this);
        this.hBpjJd = new WalletCheckHandle(mutableLiveData, this);
        this.gasjUx = new QuotePriceHandle(str, this);
        this.DCUTEI = new C22844hmy(str, this);
        this.wlaJM = new C22823hmd(str, this);
        this.AubY = new C23081hrW(this.wlaJM, this);
        this.QSBOWP = new TradeStatePool();
        this.zLjUOn = new java.lang.Object();
        this.dmfpNf = new java.lang.Object();
        this.zuWLRA = "";
        this.getPostValueLengthLimit = "";
        this.gkJEwt = new MutableLiveData<>();
        this.OBJEWx = new MutableLiveData<>();
        this.QHmsKR = new MutableLiveData<>();
        this.AuCTel = new C22643hjI();
        this.iRxXKY = PresetRouteType.RouteTypeAuto;
        this.AxsJAY = "";
        this.AwvSrB = "";
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.gEmmrt = MutableStateFlow;
        this.DAIeex = FlowKt.asStateFlow(MutableStateFlow);
        this.AYXKKw = new C23314hvr<>();
        MutableStateFlow<Result<DexPresetResultVO>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow2;
        this.zuBGHE = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow<AbstractC23151hsn> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.KWHzl = MutableStateFlow3;
        this.fZBcTu = FlowKt.asStateFlow(MutableStateFlow3);
        MutableStateFlow<Result<PreCheckBean>> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.copydefault = MutableStateFlow4;
        this.finit = FlowKt.asStateFlow(MutableStateFlow4);
        this.OLrzqt = new C23314hvr<>();
        this.giSNqX = new Observer() { // from class: o.hrD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                AbstractC23101hrq.KWHzl(this.KWHzl, (QuotePriceRes) obj);
            }
        };
        this.ODXsMY = new Observer() { // from class: o.hrL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                AbstractC23101hrq.KWHzl(this.AEQbTJ, (TradeState) obj);
            }
        };
        this.iwGUEr = new java.lang.Runnable() { // from class: o.hrH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC23101hrq.AhwBna(this.AEQbTJ);
            }
        };
    }

    public final java.lang.String DarRvM() {
        java.lang.String str = this.AxsJAY;
        if (str.length() != 0) {
            return str;
        }
        QuotePriceRes quotePrice = this.gasjUx.getQuotePrice();
        java.lang.String firstDefiPlatformInfo = quotePrice != null ? quotePrice.getFirstDefiPlatformInfo() : null;
        return firstDefiPlatformInfo == null ? "" : firstDefiPlatformInfo;
    }

    public final java.lang.String uzCIH() {
        if (Dmq()) {
            return DarRvM();
        }
        return ejfBZ();
    }

    public final java.lang.String ejfBZ() {
        QuotePriceRes quotePrice = this.gasjUx.getQuotePrice();
        java.lang.String sefiPlatformId = quotePrice != null ? quotePrice.getSefiPlatformId() : null;
        return sefiPlatformId == null ? "" : sefiPlatformId;
    }

    public final java.lang.String OLrzqt(QuotePriceRes quotePriceRes) {
        if (quotePriceRes == null || quotePriceRes.getDefiPlatformInfoList().isEmpty()) {
            return "";
        }
        if (this.AxsJAY.length() > 0 && quotePriceRes.findFixedDeFiPlatformId(this.AxsJAY)) {
            this.gEmmrt.setValue(this.AwvSrB);
        }
        if (this.AxsJAY.length() == 0 || quotePriceRes.deFiPlatformNotAvailableAnymore(this.AxsJAY)) {
            DeFiPlatformForSwap deFiPlatformForSwap = (DeFiPlatformForSwap) CollectionsKt___CollectionsKt.AuCTelauCTel(quotePriceRes.getDefiPlatformInfoList());
            java.lang.String defiPlatformId = deFiPlatformForSwap.getDefiPlatformId();
            if (defiPlatformId == null) {
                defiPlatformId = "";
            }
            this.AxsJAY = defiPlatformId;
            java.lang.String name = deFiPlatformForSwap.getName();
            this.AwvSrB = name != null ? name : "";
            this.QSBOWP.refreshStatePool(new TradeStep(CheckStep.APPROVE, false, SwapState.SWAP_INPUT, true, true));
        }
        return this.AxsJAY;
    }

    public final void DCUTEIdCUTEI() {
        this.gEmmrt.setValue("");
    }

    public final DefiChainInfo getNewProxyInstance() {
        return C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).EZpvd(Dmq()).KWHzl(QUSxYX().AEQbTJ());
    }

    public static final void KWHzl(AbstractC23101hrq abstractC23101hrq, QuotePriceRes quotePriceRes) {
        Intrinsics.checkNotNullParameter(quotePriceRes, "");
        if (quotePriceRes.getSuccess()) {
            abstractC23101hrq.AubY.AEQbTJ(quotePriceRes);
        }
        C22901hoB c22901hoB = abstractC23101hrq.AuCTelauCTel;
        if (c22901hoB != null) {
            c22901hoB.copydefault(quotePriceRes, abstractC23101hrq.AxsJAYsNCnLh);
        }
    }

    public static final void KWHzl(AbstractC23101hrq abstractC23101hrq, TradeState tradeState) {
        Intrinsics.checkNotNullParameter(tradeState, "");
        abstractC23101hrq.KWHzl(tradeState);
    }

    public final java.lang.String gEmmrt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.ODWQjV.EZpvd(C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).fARcdN().valueOf(), str, this.values);
    }

    public final void USBtdM() {
        WsHandle wsHandleAYXKKw;
        MutableLiveData<TradeState> innerTradeState;
        dNCPSb().AEQbTJ();
        this.hDKMBd.observeForever(this.giSNqX);
        UrRBLY();
        C23263hut c23263hutDjBIcL = C22380heK.OLrzqt.djBIcL();
        if (c23263hutDjBIcL == null || (wsHandleAYXKKw = c23263hutDjBIcL.AYXKKw()) == null || (innerTradeState = wsHandleAYXKKw.getInnerTradeState()) == null) {
            return;
        }
        innerTradeState.observeForever(this.ODXsMY);
    }

    private final void UrRBLY() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.hrM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.EZpvd(this.AEQbTJ, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hrV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.ejfBZ(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hrT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.copydefault((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hrR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.DbNXlk(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.zLjUOn);
    }

    public static final void ejfBZ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(final AbstractC23101hrq abstractC23101hrq, xXO xxo) {
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(abstractC23101hrq.AxsJAYsNCnLh).fARcdN().OLrzqt().OLrzqt(C58266yxz.OLrzqt());
        final Function1 function1 = new Function1() { // from class: o.hrF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.OLrzqt(this.OLrzqt, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hrG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.values(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hrC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.OLrzqt(this.OLrzqt, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hrE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.fARcdN(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, abstractC23101hrq.zLjUOn);
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractC23101hrq abstractC23101hrq, InterfaceC9738bbJ interfaceC9738bbJ) {
        abstractC23101hrq.DGOPHZ();
        abstractC23101hrq.finit().DbNXlk();
        abstractC23101hrq.gasjUx.resetQuotePrice();
        abstractC23101hrq.QSBOWP.initCheckStep();
        abstractC23101hrq.AYXKKw.setValue(interfaceC9738bbJ);
        abstractC23101hrq.copydefault(abstractC23101hrq.hDKMBd(), abstractC23101hrq.QCjLjM());
        return Unit.INSTANCE;
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractC23101hrq abstractC23101hrq, java.lang.Throwable th) {
        abstractC23101hrq.DGOPHZ();
        abstractC23101hrq.finit().DbNXlk();
        abstractC23101hrq.gasjUx.resetQuotePrice();
        C22380heK.OLrzqt.copydefault(abstractC23101hrq.AxsJAYsNCnLh).DbNXlk().OLrzqt();
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCoinAssets$default(AbstractC23101hrq abstractC23101hrq, CoinAssets coinAssets, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCoinAssets");
        }
        if ((i & 1) != 0) {
            coinAssets = CoinAssets.BOTH;
        }
        abstractC23101hrq.OLrzqt(coinAssets);
    }

    public final void OLrzqt(@NotNull CoinAssets coinAssets) {
        Intrinsics.checkNotNullParameter(coinAssets, "");
        this.uzCIH.getCoinAssets(coinAssets, this.OuxcSI, this);
    }

    public final void AEQbTJ() {
        if (this.dHguZz) {
            getQuotePrice$default(this, false, false, null, 7, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hrq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getQuotePrice$default(AbstractC23101hrq abstractC23101hrq, boolean z, boolean z2, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getQuotePrice");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        abstractC23101hrq.KWHzl(z, z2, function1);
    }

    public final void KWHzl(final boolean z, boolean z2, final Function1<? super java.lang.Boolean, Unit> function1) {
        if (!djBIcL(hDKMBd())) {
            PreCheckBean preCheckBeanKWHzl = KWHzl(hDKMBd());
            if (preCheckBeanKWHzl != null) {
                this.OLrzqt.setValue(preCheckBeanKWHzl);
                return;
            }
            return;
        }
        boolean zUlJrfe = UlJrfe();
        if (z2 && zUlJrfe) {
            this.fvQaOB.postValue(java.lang.Boolean.TRUE);
        }
        this.gasjUx.getQuotePrice(this.QbewEr, RJOkX().copydefault(), new Function1() { // from class: o.hrp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.copydefault(z, this, ((java.lang.Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: o.hru
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.copydefault(function1, ((java.lang.Boolean) obj).booleanValue());
            }
        });
    }

    public static final Unit copydefault(boolean z, AbstractC23101hrq abstractC23101hrq, boolean z2) {
        if (z) {
            abstractC23101hrq.fvQaOB.postValue(java.lang.Boolean.valueOf(z2));
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function1 function1, boolean z) {
        if (function1 != null) {
            function1.invoke(java.lang.Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    public final java.lang.String AkhnZx() {
        C22901hoB c22901hoB = this.AuCTelauCTel;
        java.lang.String strEZpvd = c22901hoB != null ? c22901hoB.EZpvd() : null;
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C23313hvq.OLrzqt(str);
        this.uzCIH.setFromContent(this.OuxcSI, str, str2);
    }

    public static /* synthetic */ void refreshData$default(AbstractC23101hrq abstractC23101hrq, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshData");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractC23101hrq.copydefault(z);
    }

    public final void copydefault(boolean z) {
        if (z) {
            C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).DbNXlk().OLrzqt();
            this.QSBOWP.initCheckStep();
        }
        getCoinAssets$default(this, null, 1, null);
    }

    public final void copydefault() {
        FragmentActivity fragmentActivity = this.djBIcL;
        if (fragmentActivity != null) {
            this.hBpjJd.checkWallet(this.QSBOWP, this.AxsJAYsNCnLh, fragmentActivity);
        }
    }

    public static /* synthetic */ void onVisible$default(AbstractC23101hrq abstractC23101hrq, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onVisible");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractC23101hrq.KWHzl(z);
    }

    public void KWHzl(boolean z) {
        this.dHguZz = true;
        copydefault(z);
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("ev_network_change");
        final Function1 function1 = new Function1() { // from class: o.hro
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.hrn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.getNewProxyInstance(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.dmfpNf);
        this.uzCIH.addAssetsListener(this.OuxcSI, this.fIwbmz);
    }

    public static final void getNewProxyInstance(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(AbstractC23101hrq abstractC23101hrq, java.lang.String str) {
        refreshData$default(abstractC23101hrq, false, 1, null);
        return Unit.INSTANCE;
    }

    public final void ixgjPv() {
        this.dHguZz = false;
        fHqPtx();
        this.uzCIH.disposeAssetsListener();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        C33050mpD.OLrzqt(this.zLjUOn);
        C33050mpD.OLrzqt(this.dmfpNf);
        this.AubY.djBIcL();
        fHqPtx();
    }

    public final void call() {
        WsHandle wsHandleAYXKKw;
        MutableLiveData<TradeState> innerTradeState;
        C33050mpD.OLrzqt(this.zLjUOn);
        dNCPSb().djBIcL();
        this.hDKMBd.removeObserver(this.giSNqX);
        this.QfsBiF.releaseData();
        this.DCUTEI.copydefault();
        QfsBiF().AYXKKw();
        C23263hut c23263hutDjBIcL = C22380heK.OLrzqt.djBIcL();
        if (c23263hutDjBIcL != null && (wsHandleAYXKKw = c23263hutDjBIcL.AYXKKw()) != null && (innerTradeState = wsHandleAYXKKw.getInnerTradeState()) != null) {
            innerTradeState.removeObserver(this.ODXsMY);
        }
        this.djBIcL = null;
    }

    public final void OLrzqt() {
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value != null) {
            InputCondition inputCondition = this.QbewEr;
            TradeInputGroup data = value.getData();
            C22901hoB c22901hoB = this.AuCTelauCTel;
            inputCondition.setCondition(data, c22901hoB != null ? c22901hoB.valueOf() : false);
        }
    }

    public final void EZpvd() {
        if (this.dHguZz) {
            getQuotePrice$default(this, false, false, null, 7, null);
        }
    }

    public final java.lang.String hDKMBd() {
        return QUSxYX().AEQbTJ();
    }

    public final boolean QwvEab() {
        return (QUSxYX().copydefault() != null) & (QUSxYX().valueOf() != null);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull Function1<? super ApproveSwapData, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AkhnZx.getTokenApprovalData(str, function1);
    }

    public static /* synthetic */ void clearInput$default(AbstractC23101hrq abstractC23101hrq, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearInput");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        abstractC23101hrq.EZpvd(z);
    }

    public final void EZpvd(boolean z) {
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value != null) {
            this.OuxcSI.setValue(C22332hdP.EZpvd(value.getData().setClearFromInput(z)));
        }
    }

    private final void fHqPtx() {
        C33050mpD.OLrzqt(this.dmfpNf);
        this.AubY.djBIcL();
        finit().djBIcL();
        this.hBpjJd.disposeCheck();
        this.uzCIH.disposeAssets();
        this.AkhnZx.disposeApprove();
        this.gasjUx.disposeQuote();
    }

    public final QuotePriceRes AxsJAYsNCnLh() {
        return this.gasjUx.getQuotePrice();
    }

    public final MutableLiveData<java.util.List<PathSelectionRouterItem>> gasjUx() {
        return this.gasjUx.getPathSelectionRouterListLiveData();
    }

    public final void isConnected(boolean z) {
        this.AxsJAYaxsJAY.setValue(java.lang.Boolean.FALSE);
    }

    public final java.lang.String QCjLjM() {
        return C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).fARcdN().KWHzl(QUSxYX().AEQbTJ());
    }

    public final InterfaceC9738bbJ QSLkRj() {
        return C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).fARcdN().valueOf();
    }

    public final void DCUTEIddSDPG() {
        finit().AYXKKw();
    }

    public final void AEQbTJ(C22947hov c22947hov) {
        AbstractC22885hnm.setHeterogeneousChainInfo$default(finit(), c22947hov, false, 2, null);
        this.QHmsKR.setValue(java.lang.Boolean.TRUE);
        this.QSBOWP.refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
    }

    public final void zblBkD() {
        this.QSBOWP.refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SWAP_INPUT_SUCCESS, false, true));
    }

    public final void OLrzqt(@NotNull final TradeParam tradeParam, boolean z) {
        AbstractC58185ywX supportChainList$default;
        Intrinsics.checkNotNullParameter(tradeParam, "");
        if (z) {
            supportChainList$default = InterfaceC22387heR.Application.getSupportSingleChainList$default(C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).AkhnZx(), "3", false, 2, null);
        } else {
            supportChainList$default = InterfaceC22387heR.Application.getSupportChainList$default(C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).AkhnZx(), "3", false, 2, null);
        }
        final Function1 function1 = new Function1() { // from class: o.hrv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.AEQbTJ(tradeParam, this, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hrt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.iwGUEr(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hrw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.AYXKKw((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = supportChainList$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hrs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.zsXlph(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.zLjUOn);
    }

    public static final void iwGUEr(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(TradeParam tradeParam, AbstractC23101hrq abstractC23101hrq, java.util.List list) {
        java.lang.Object next;
        java.lang.String chainId = (C33129mqd.OLrzqt((java.lang.CharSequence) tradeParam.getFromCoinInfo().getChainId()) ? tradeParam.getFromCoinInfo() : tradeParam.getToCoinInfo()).getChainId();
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) chainId, (java.lang.Object) ((DefiChainInfo) next).getChainId())) {
                break;
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        if (defiChainInfo != null) {
            abstractC23101hrq.getFieldNames = tradeParam;
            abstractC23101hrq.getNewProxyInstance = defiChainInfo;
            abstractC23101hrq.WS();
        }
        return Unit.INSTANCE;
    }

    public static final void zsXlph(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AYXKKw(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void WS() {
        this.iwGUEr.run();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hnm.tokenCheck$default(o.hnm, com.okinc.business.dex.api.bean.TradeParam, com.okinc.business.dexlogic.bean.DefiChainInfo, boolean, boolean, int, java.lang.Object):void */
    public static final void AhwBna(AbstractC23101hrq abstractC23101hrq) {
        TradeParam tradeParam = abstractC23101hrq.getFieldNames;
        if (tradeParam == null || abstractC23101hrq.getNewProxyInstance == null) {
            return;
        }
        if (tradeParam != null && tradeParam.isOldTradingDialog()) {
            AbstractC22885hnm abstractC22885hnmFinit = abstractC23101hrq.finit();
            TradeParam tradeParam2 = abstractC23101hrq.getFieldNames;
            DefiChainInfo defiChainInfo = abstractC23101hrq.getNewProxyInstance;
            Intrinsics.copydefault(defiChainInfo);
            AbstractC22885hnm.tokenCheck$default(abstractC22885hnmFinit, tradeParam2, defiChainInfo, false, true, 4, null);
        } else {
            AbstractC22885hnm abstractC22885hnmFinit2 = abstractC23101hrq.finit();
            TradeParam tradeParam3 = abstractC23101hrq.getFieldNames;
            DefiChainInfo defiChainInfo2 = abstractC23101hrq.getNewProxyInstance;
            Intrinsics.copydefault(defiChainInfo2);
            abstractC22885hnmFinit2.KWHzl(tradeParam3, defiChainInfo2);
        }
        abstractC23101hrq.getNewProxyInstance = null;
    }

    public final java.lang.String ORxRYg() {
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null) {
            return null;
        }
        return value.getData().getFromData().getData().getEditData().getContent();
    }

    public final boolean EZpvd(java.lang.String str) {
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh == null) {
            return true;
        }
        if (QUSxYX().fetchVPNInfo()) {
            return quotePriceResAxsJAYsNCnLh.isCheckReverseAmountError(str);
        }
        return quotePriceResAxsJAYsNCnLh.isCheckForwardAmountError(str);
    }

    public final boolean aUsmxb() {
        return C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).OLrzqt(UlJrfe()).AYXKKw();
    }

    public final boolean fdOvFl() {
        DefiChainInfo newProxyInstance = getNewProxyInstance();
        return Intrinsics.EZpvd((java.lang.Object) (newProxyInstance != null ? newProxyInstance.isNeedDealFeeCallData() : null), (java.lang.Object) "1");
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void copydefault(@NotNull final Function1<? super InterfaceC9738bbJ, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(this.AxsJAYsNCnLh).fARcdN().OLrzqt();
        final Function1 function12 = new Function1() { // from class: o.hrK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.OLrzqt(function1, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hrJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.AuCTel(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.hrI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.EZpvd(function1, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hrN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.uzCIH(function13, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.zLjUOn);
    }

    public static final Unit OLrzqt(Function1 function1, InterfaceC9738bbJ interfaceC9738bbJ) {
        function1.invoke(interfaceC9738bbJ);
        return Unit.INSTANCE;
    }

    public static final void uzCIH(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Function1 function1, java.lang.Throwable th) {
        function1.invoke(null);
        return Unit.INSTANCE;
    }

    public final boolean fjfviF() {
        DexQuoteBridgeVO dexQuoteBridgeVOBridge;
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        return quotePriceResAxsJAYsNCnLh != null && (dexQuoteBridgeVOBridge = quotePriceResAxsJAYsNCnLh.bridge()) != null && dexQuoteBridgeVOBridge.isSwftBtc() && quotePriceResAxsJAYsNCnLh.minimumReceived().length() == 0;
    }

    public final java.lang.String gHZMYf() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        FromToBalance balance;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        java.lang.String data3 = (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (balance = data2.getBalance()) == null) ? null : balance.getData();
        return data3 == null ? "" : data3;
    }

    public final java.lang.String DbNXlk() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        FromToBalance balance;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (balance = data2.getBalance()) == null) {
            return "";
        }
        java.lang.String availableAmountNum = balance.getAvailableAmountNum();
        return availableAmountNum.length() == 0 ? balance.getData() : availableAmountNum;
    }

    public final boolean run() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = QUSxYX().copydefault();
        return Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null), (java.lang.Object) "0") && C23313hvq.OLrzqt(AkhnZx(), DbNXlk());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hrq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInputContent$default(AbstractC23101hrq abstractC23101hrq, java.lang.String str, Function1 function1, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setInputContent");
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        abstractC23101hrq.AEQbTJ(str, (Function1<? super java.lang.String, Unit>) function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull java.lang.String str, Function1<? super java.lang.String, Unit> function1) {
        java.lang.String strMulCheckS$default;
        TradeInputGroup data;
        ConsumeData<TradeInputData> toData;
        TradeInputData data2;
        FromToBalance balance;
        java.lang.String data3;
        java.lang.String decimals;
        java.lang.String str2;
        TradeInputGroup data4;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data5;
        FromToBalance balance2;
        java.lang.String data6;
        TradeInputGroup data7;
        ConsumeData<TradeInputData> fromData2;
        TradeInputData data8;
        FromToBalance balance3;
        Intrinsics.checkNotNullParameter(str, "");
        isConnected(false);
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value != null && (data7 = value.getData()) != null && (fromData2 = data7.getFromData()) != null && (data8 = fromData2.getData()) != null && (balance3 = data8.getBalance()) != null) {
            balance3.setBalanceBracket(str);
        }
        if (this.QOLQEE) {
            ConsumeData<TradeInputGroup> value2 = this.OuxcSI.getValue();
            strMulCheckS$default = (value2 == null || (data4 = value2.getData()) == null || (fromData = data4.getFromData()) == null || (data5 = fromData.getData()) == null || (balance2 = data5.getBalance()) == null || (data6 = balance2.getData()) == null) ? null : C23313hvq.mulCheckS$default(data6, str, null, null, null, 14, null);
            if (strMulCheckS$default == null) {
                strMulCheckS$default = "";
            }
        } else {
            ConsumeData<TradeInputGroup> value3 = this.OuxcSI.getValue();
            strMulCheckS$default = (value3 == null || (data = value3.getData()) == null || (toData = data.getToData()) == null || (data2 = toData.getData()) == null || (balance = data2.getBalance()) == null || (data3 = balance.getData()) == null) ? null : C23313hvq.mulCheckS$default(data3, str, null, null, null, 14, null);
            if (strMulCheckS$default == null) {
            }
        }
        if (this.QOLQEE) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanFIwbmz = fIwbmz();
            decimals = dexMultiTokenInfoBeanFIwbmz != null ? dexMultiTokenInfoBeanFIwbmz.getDecimals() : null;
            str2 = decimals != null ? decimals : "";
            java.lang.String str3 = C23313hvq.OLrzqt(str2, "12") ? "12" : str2;
            java.lang.String strOLrzqt = C23311hvo.OLrzqt(strMulCheckS$default, str2);
            OLrzqt(C23311hvo.OLrzqt(strMulCheckS$default, str3), strOLrzqt);
            if (function1 != null) {
                function1.invoke(strOLrzqt);
                return;
            }
            return;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAuCTel = AuCTel();
        decimals = dexMultiTokenInfoBeanAuCTel != null ? dexMultiTokenInfoBeanAuCTel.getDecimals() : null;
        str2 = decimals != null ? decimals : "";
        this.uzCIH.setToContent(this.OuxcSI, C23311hvo.OLrzqt(strMulCheckS$default, C23313hvq.OLrzqt(str2, "12") ? "12" : str2), C23311hvo.OLrzqt(strMulCheckS$default, str2));
    }

    public final boolean DcqEDu() {
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null) {
            return false;
        }
        TradeInputGroup data = value.getData();
        if (this.QOLQEE) {
            return C23313hvq.OLrzqt(data.getFromData().getData().getBalance().getData(), "0");
        }
        return C23313hvq.OLrzqt(data.getToData().getData().getBalance().getData(), "0");
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        getFieldNames().gEmmrt().AEQbTJ();
        AbstractC58185ywX<java.util.List<LiquidityListItem>> abstractC58185ywXEZpvd = getFieldNames().EZpvd(str);
        final Function1 function1 = new Function1() { // from class: o.hrB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.EZpvd(this.copydefault, (java.util.List) obj);
            }
        };
        InterfaceC58227yxM<? super java.util.List<LiquidityListItem>> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hrA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.fJNWhG(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hrz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.copydefault(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hry
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.fIwbmz(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.zLjUOn);
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractC23101hrq abstractC23101hrq, java.util.List list) {
        InterfaceC22646hjL interfaceC22646hjLGEmmrt = abstractC23101hrq.getFieldNames().gEmmrt();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = abstractC23101hrq.QUSxYX().copydefault();
        java.lang.String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = abstractC23101hrq.QUSxYX().valueOf();
        java.lang.String strCopydefault = C24695iig.copydefault(chainId, dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null);
        Intrinsics.copydefault(list);
        interfaceC22646hjLGEmmrt.EZpvd(strCopydefault, (java.util.List<LiquidityListItem>) list);
        abstractC23101hrq.getFieldNames().gEmmrt().copydefault(false);
        return Unit.INSTANCE;
    }

    public static final void fIwbmz(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(AbstractC23101hrq abstractC23101hrq, java.lang.Throwable th) {
        abstractC23101hrq.getFieldNames().gEmmrt().AEQbTJ();
        abstractC23101hrq.getFieldNames().gEmmrt().copydefault(true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(@NotNull final java.lang.String str, final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58185ywX<BlackListTypes> abstractC58185ywXOLrzqt = getFieldNames().OLrzqt(str, str2);
        final Function1 function1 = new Function1() { // from class: o.hrx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.EZpvd(this.EZpvd, str, str2, (BlackListTypes) obj);
            }
        };
        InterfaceC58227yxM<? super BlackListTypes> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hrO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.hDKMBd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hrQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC23101hrq.KWHzl((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hrP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AbstractC23101hrq.getFieldNames(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.zLjUOn);
    }

    public static final void hDKMBd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AbstractC23101hrq abstractC23101hrq, java.lang.String str, java.lang.String str2, BlackListTypes blackListTypes) {
        C22643hjI c22643hjI = abstractC23101hrq.AuCTel;
        c22643hjI.OLrzqt(c22643hjI.copydefault(str, str2), blackListTypes.getBlackListTypes());
        return Unit.INSTANCE;
    }

    public static final void getFieldNames(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final java.lang.String fARcdN() {
        java.util.List<PathSelectionRouterItem> pathSelectionRouterList;
        PathSelectionRouterItem pathSelectionRouterItem;
        if (QUSxYX().AkhnZx()) {
            return "";
        }
        QuotePriceRes quotePriceResAxsJAYsNCnLh = AxsJAYsNCnLh();
        return (quotePriceResAxsJAYsNCnLh == null || (pathSelectionRouterList = quotePriceResAxsJAYsNCnLh.getPathSelectionRouterList()) == null || (pathSelectionRouterItem = (PathSelectionRouterItem) CollectionsKt___CollectionsKt.firstOrNull(pathSelectionRouterList)) == null || !pathSelectionRouterItem.getLocalSelected()) ? "custom" : "overall best";
    }

    public final java.lang.String fFgQHt() {
        return QbewEr().AEQbTJ();
    }

    public final boolean Dmq() {
        return QUSxYX().AkhnZx();
    }

    public final boolean igXuih() {
        return QfsBiF().OLrzqt();
    }

    public final boolean fERRXa() {
        return QfsBiF().EZpvd();
    }

    public final java.lang.String dxcTrN() {
        return QfsBiF().AEQbTJ();
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseSwapTradeViewModel$fetchSwapConfig$1(this, str, null), 3, null);
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BaseSwapTradeViewModel$getPreCheckResult$1(this, str, str2, null), 3, null);
    }

    public final PreCheckBean KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.dxcTrN.KWHzl(str);
    }

    public final boolean djBIcL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        PreCheckBean preCheckBeanKWHzl = KWHzl(str);
        if (preCheckBeanKWHzl == null) {
            return true;
        }
        return preCheckBeanKWHzl.isSupportQuote();
    }

    public final Result<DexPresetResultVO> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.RlQdEF.copydefault(str);
    }
}

package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.JsonObject;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.tee.domain.model.CreateOrderReq;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeConfig;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateOrderInfo;
import com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexDefaultFromToTokenShowVO;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.track.EventConditionEnterBy;
import com.okinc.business.dexlogic.bean.track.ReferralSwapMode;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.LimitQuoteHandle;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeLimitStatePool;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.limmitorder.bean.ChangeType;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitSuggestCoinBean;
import com.okinc.business.dexlogic.main.limmitorder.viewmodel.LimitOrderContentViewModel$chainIdForSwapConfig$2;
import com.okinc.business.dexlogic.main.limmitorder.viewmodel.LimitOrderContentViewModel$fetchSwapConfig$1;
import com.okinc.business.dexlogic.main.limmitorder.viewmodel.LimitOrderContentViewModel$getMarketPrice$1;
import com.okinc.business.dexlogic.main.limmitorder.viewmodel.LimitOrderContentViewModel$getPreCheckResult$1;
import com.okinc.business.dexlogic.main.limmitorder.viewmodel.LimitOrderContentViewModel$special$$inlined$map$1$2$1;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveSwapData;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.ExchangeRateData;
import com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance;
import com.okinc.business.dexlogic.main.swap.trade.bean.ImageTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.CoinAssets;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.InitTradeGroup;
import com.okinc.business.dexui.main.limitorder.LimitInputCondition;
import com.okinc.business.dexui.main.limitorder.manager.LimitCoinAssetsHandle;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitApproveHandle;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitErrorViewHandle;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitWalletCheckHandle;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.ui.advanced.limit.widget.LimitOrderRateView;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.network.okg.response.ResponseData;
import com.okinc.rxutils.RxBus;
import com.okinc.wallet.api.MpcWalletService;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC22413her;
import o.C23274hvD;
import o.InterfaceC22502hga;
import o.gLQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hgT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22495hgT extends AndroidViewModel {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final C23314hvr<DexMultiTokenInfoBean> AEQbTJ;
    public final MutableStateFlow<ReminderListConfig> AYXKKw;
    public final MutableStateFlow<java.lang.Throwable> AhwBna;
    public FragmentActivity AkhnZx;
    public final StateFlow<java.lang.String> AuCTel;
    public ChangeType AuCTelauCTel;
    public DefiChainInfo AubY;
    public final C19700gMb AwvSrB;
    public final C58216yxB AxsJAY;
    public final InterfaceC19755gOc AxsJAYaxsJAY;
    public hLB AxsJAYsNCnLh;
    public hLJ DAIeex;
    public java.lang.String DCJXGO;
    public MutableLiveData<java.lang.String> DCUTEI;
    public final StateFlow<Result<DexPresetResultVO>> DTwDnp;
    public final C23314hvr<java.lang.String> DXXBbs;
    public final C23314hvr<java.lang.Boolean> DarRvM;
    public final MutableStateFlow<gLQ> DbNXlk;
    public final MutableStateFlow<Result<DexPresetResultVO>> EZpvd;
    public final MutableLiveData<ExpireTimeData> OBJEWx;
    public Observer<TradeStep> ODWQjV;
    public final MutableStateFlow<LimitPairRateResponse> OLrzqt;
    public java.lang.String ORxRYg;
    public final MutableLiveData<java.lang.Boolean> OcIXYQ;
    public MutableLiveData<CurrentChain> OqFWZa;
    public MutableLiveData<ConsumeData<TradeInputGroup>> OuxcSI;
    public final StateFlow<gLQ> QHmsKR;
    public boolean QKVWgx;
    public final InterfaceC56387yDm QKudOq;
    public boolean QOLQEE;
    public MutableLiveData<Unit> QSBOWP;
    public InitTradeGroup QUSxYX;
    public LimitInputCondition QVAiDq;
    public boolean QbewEr;
    public C22430hfH QfsBiF;
    public LimitWalletCheckHandle QkdxfA;
    public Observer<java.lang.Boolean> RJOkX;
    public boolean RKDWNf;
    public boolean RcXXUw;
    public final java.lang.String RlQdEF;
    public final MutableLiveData<java.lang.Boolean> UeEOUB;
    public MutableLiveData<java.lang.Boolean> aKErDB;
    public final InterfaceC22299hcj accept;
    public MutableLiveData<C19738gNm> copydefault;
    public final C23212htv dHguZz;
    public MutableLiveData<java.lang.Boolean> dNCPSb;
    public final MutableStateFlow<TokenPairRateQuote> djBIcL;
    public final kUO djSkpj;
    public C21759hLg dvKsVJ;
    public LimitParam dxcTrN;
    public LimitApproveHandle ejfBZ;
    public MutableLiveData<java.lang.Boolean> fARcdN;
    public hLI fFgQHt;
    public final C28390kZq fIwbmz;
    public final C19703gMe fJNWhG;
    public final StateFlow<LimitPairRateResponse> fZBcTu;
    public C23314hvr<java.lang.Boolean> fetchVPNInfo;
    public final MutableLiveData<LimitMarketPrice.QuoteState> ffGIBT;
    public final InterfaceC22433hfK finit;
    public java.lang.Object flVtFt;
    public LimitQuoteHandle fvQaOB;
    public final MutableStateFlow<Result<PreCheckBean>> gEmmrt;
    public final StateFlow<ReminderListConfig> gGvvIC;
    public java.util.List<DefiChainInfo> gHZMYf;
    public final C25415iwL gasjUx;
    public LimitCoinAssetsHandle getFieldNames;
    public Observer<kotlin.Pair<java.lang.Boolean, LimitCalResult>> getNewProxyInstance;
    public final gYX getPostValueLengthLimit;
    public C21775hLw giSNqX;
    public Job gkJEwt;
    public final MutableLiveData<kotlin.Pair<CurrentChain, java.util.List<CurrentChain>>> gwTjWJ;
    public java.lang.String hDKMBd;
    public final StateFlow<Result<PreCheckBean>> hUfVAv;
    public final MutableLiveData<MpcWalletService.MpcWalletAbleStatus> iRxXKY;
    public boolean iZzfmt;
    public C23314hvr<java.lang.String> isConnected;
    public MutableLiveData<kotlin.Pair<java.lang.Boolean, LimitCalResult>> iwGUEr;
    public boolean sSMYrx;
    public DefiChainInfo uzCIH;
    public final C23314hvr<PreCheckBean> valueOf;
    public final android.app.Application values;
    public LimitParam wlaJM;
    public LimitOrderRateView.ShowType zLjUOn;
    public final java.lang.Runnable zsXlph;
    public java.lang.Object zuBGHE;
    public TradeLimitStatePool zuWLRA;

    /* JADX INFO: renamed from: o.hgT$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChangeType.values().length];
            try {
                iArr[ChangeType.FromChange.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ChangeType.ToChange.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[ChangeType.RateChange.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[ChangeType.FromToChange.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
            int[] iArr2 = new int[CheckStep.values().length];
            try {
                iArr2[CheckStep.INIT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[CheckStep.WALLET.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[CheckStep.INPUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr2[CheckStep.QUOTE_LIMIT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[CheckStep.BALANCE.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr2[CheckStep.APPROVE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr2[CheckStep.SWAP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            OLrzqt = iArr2;
            int[] iArr3 = new int[SlippageMode.values().length];
            try {
                iArr3[SlippageMode.Dynamic.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr3[SlippageMode.Fixed.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            EZpvd = iArr3;
            int[] iArr4 = new int[TradeReminderType.values().length];
            try {
                iArr4[TradeReminderType.LimitMiniTradeAmount.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            AEQbTJ = iArr4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull ChangeType changeType) {
        Intrinsics.checkNotNullParameter(changeType, "");
        this.AuCTelauCTel = changeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull LimitOrderRateView.ShowType showType) {
        Intrinsics.checkNotNullParameter(showType, "");
        this.zLjUOn = showType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.DCJXGO = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(boolean z) {
        this.iZzfmt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> AuCTel() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitOrderRateView.ShowType AuCTelauCTel() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChangeType AubY() {
        return this.AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> AwvSrB() {
        return this.OcIXYQ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<Result<DexPresetResultVO>> AxsJAY() {
        return this.DTwDnp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AxsJAYaxsJAY() {
        return this.RlQdEF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<CurrentChain> AxsJAYsNCnLh() {
        return this.OqFWZa;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.Boolean> DarRvM() {
        return this.DarRvM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(LimitParam limitParam) {
        this.dxcTrN = limitParam;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(boolean z) {
        this.QOLQEE = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.hDKMBd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(boolean z) {
        this.RcXXUw = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<Unit> OBJEWx() {
        return this.QSBOWP;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String ODWQjV() {
        return this.DCJXGO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OHqIaq() {
        return this.RcXXUw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(java.util.List<DefiChainInfo> list) {
        this.gHZMYf = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(hLI hli) {
        this.fFgQHt = hli;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ORxRYg() {
        return this.QOLQEE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<gLQ> QHmsKR() {
        return this.QHmsKR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QKVWgx() {
        return this.QKVWgx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean QOLQEE() {
        return this.QbewEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ExpireTimeData> QSBOWP() {
        return this.OBJEWx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final hLI QUSxYX() {
        return this.fFgQHt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21759hLg QVAiDq() {
        return this.dvKsVJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22430hfH QbewEr() {
        return this.QfsBiF;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitTradeGroup QfsBiF() {
        return this.QUSxYX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<LimitMarketPrice.QuoteState> QkdxfA() {
        return this.ffGIBT;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<C19738gNm> RJOkX() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.String> RKDWNf() {
        return this.DCUTEI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25415iwL RcXXUw() {
        return this.gasjUx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitWalletCheckHandle RdAHlO() {
        return this.QkdxfA;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23314hvr<java.lang.String> RlQdEF() {
        return this.DXXBbs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC22433hfK UeEOUB() {
        return this.finit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> UlJrfe() {
        return this.aKErDB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<ReminderListConfig> aKErDB() {
        return this.gGvvIC;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> aUsmxb() {
        return this.UeEOUB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(FragmentActivity fragmentActivity) {
        this.AkhnZx = fragmentActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(DefiChainInfo defiChainInfo) {
        this.uzCIH = defiChainInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.QKVWgx = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<CurrentChain, java.util.List<CurrentChain>>> dHguZz() {
        return this.gwTjWJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitParam dNCPSb() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<LimitPairRateResponse> djSkpj() {
        return this.fZBcTu;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<PreCheckBean> dvKsVJ() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitApproveHandle ejfBZ() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> fJNWhG() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MpcWalletService.MpcWalletAbleStatus> fZBcTu() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void fetchVPNInfo() {
        this.sSMYrx = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C21775hLw finit() {
        return this.giSNqX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gHZMYf() {
        return this.ORxRYg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.String> gasjUx() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DefiChainInfo getNewProxyInstance() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<ConsumeData<TradeInputGroup>> getPostValueLengthLimit() {
        return this.OuxcSI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> giSNqX() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> hrNTAI() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final hLB iRxXKY() {
        return this.AxsJAYsNCnLh;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.Boolean, LimitCalResult>> uzCIH() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(java.lang.String str) {
        this.ORxRYg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void valueOf(boolean z) {
        this.QbewEr = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<DefiChainInfo> zLjUOn() {
        return this.gHZMYf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<DexMultiTokenInfoBean> zuBGHE() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeLimitStatePool zuWLRA() {
        return this.zuWLRA;
    }

    /* JADX INFO: renamed from: o.hgT$Activity */
    public static final class Activity implements Flow<java.lang.String> {
        public final /* synthetic */ Flow EZpvd;

        /* JADX INFO: renamed from: o.hgT$Activity$1, reason: invalid class name */
        public static final class AnonymousClass1<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass1(FlowCollector flowCollector) {
                this.EZpvd = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                LimitOrderContentViewModel$special$$inlined$map$1$2$1 limitOrderContentViewModel$special$$inlined$map$1$2$1;
                DexMultiTokenInfoBean data;
                if (continuation instanceof LimitOrderContentViewModel$special$$inlined$map$1$2$1) {
                    limitOrderContentViewModel$special$$inlined$map$1$2$1 = (LimitOrderContentViewModel$special$$inlined$map$1$2$1) continuation;
                    int i = limitOrderContentViewModel$special$$inlined$map$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        limitOrderContentViewModel$special$$inlined$map$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        limitOrderContentViewModel$special$$inlined$map$1$2$1 = new LimitOrderContentViewModel$special$$inlined$map$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = limitOrderContentViewModel$special$$inlined$map$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = limitOrderContentViewModel$special$$inlined$map$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.EZpvd;
                    ConsumeData consumeData = (ConsumeData) obj;
                    java.lang.String chainId = (consumeData == null || (data = ((TradeInputGroup) consumeData.getData()).getFromData().getData().getCoinData().getData()) == null) ? null : data.getChainId();
                    limitOrderContentViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(chainId, limitOrderContentViewModel$special$$inlined$map$1$2$1) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public Activity(Flow flow) {
            this.EZpvd = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.String> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.EZpvd.collect(new AnonymousClass1(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (r16v0 android.app.Application)
  (r17v0 java.lang.String)
  (wrap:com.okinc.business.dex.api.bean.LimitParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.LimitParam) : (r18v0 com.okinc.business.dex.api.bean.LimitParam))
  (wrap:o.hfK:?: TERNARY null = ((wrap:int:0x0009: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.hfK) : (r19v0 o.hfK))
  (r20v0 o.gMe)
  (r21v0 o.kZq)
  (r22v0 o.htv)
  (r23v0 o.kUO)
  (r24v0 o.hcj)
  (r25v0 o.gYX)
  (r26v0 o.gOc)
  (r27v0 o.gMb)
 A[MD:(android.app.Application, java.lang.String, com.okinc.business.dex.api.bean.LimitParam, o.hfK, o.gMe, o.kZq, o.htv, o.kUO, o.hcj, o.gYX, o.gOc, o.gMb):void (m)] (LINE:141) call: o.hgT.<init>(android.app.Application, java.lang.String, com.okinc.business.dex.api.bean.LimitParam, o.hfK, o.gMe, o.kZq, o.htv, o.kUO, o.hcj, o.gYX, o.gOc, o.gMb):void type: THIS */
    public /* synthetic */ C22495hgT(android.app.Application application, java.lang.String str, LimitParam limitParam, InterfaceC22433hfK interfaceC22433hfK, C19703gMe c19703gMe, C28390kZq c28390kZq, C23212htv c23212htv, kUO kuo, InterfaceC22299hcj interfaceC22299hcj, gYX gyx, InterfaceC19755gOc interfaceC19755gOc, C19700gMb c19700gMb, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, (i & 4) != 0 ? null : limitParam, (i & 8) != 0 ? null : interfaceC22433hfK, c19703gMe, c28390kZq, c23212htv, kuo, interfaceC22299hcj, gyx, interfaceC19755gOc, c19700gMb);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22495hgT(@NotNull android.app.Application application, @NotNull java.lang.String str, LimitParam limitParam, InterfaceC22433hfK interfaceC22433hfK, @NotNull C19703gMe c19703gMe, @NotNull C28390kZq c28390kZq, @NotNull C23212htv c23212htv, @NotNull kUO kuo, @NotNull InterfaceC22299hcj interfaceC22299hcj, @NotNull gYX gyx, @NotNull InterfaceC19755gOc interfaceC19755gOc, @NotNull C19700gMb c19700gMb) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c19703gMe, "");
        Intrinsics.checkNotNullParameter(c28390kZq, "");
        Intrinsics.checkNotNullParameter(c23212htv, "");
        Intrinsics.checkNotNullParameter(kuo, "");
        Intrinsics.checkNotNullParameter(interfaceC22299hcj, "");
        Intrinsics.checkNotNullParameter(gyx, "");
        Intrinsics.checkNotNullParameter(interfaceC19755gOc, "");
        Intrinsics.checkNotNullParameter(c19700gMb, "");
        this.values = application;
        this.RlQdEF = str;
        this.dxcTrN = limitParam;
        this.finit = interfaceC22433hfK;
        this.fJNWhG = c19703gMe;
        this.fIwbmz = c28390kZq;
        this.dHguZz = c23212htv;
        this.djSkpj = kuo;
        this.accept = interfaceC22299hcj;
        this.getPostValueLengthLimit = gyx;
        this.AxsJAYaxsJAY = interfaceC19755gOc;
        this.AwvSrB = c19700gMb;
        this.zuBGHE = new java.lang.Object();
        this.flVtFt = new java.lang.Object();
        this.iZzfmt = true;
        this.dNCPSb = new MutableLiveData<>();
        this.aKErDB = new MutableLiveData<>();
        this.QSBOWP = new MutableLiveData<>();
        this.OqFWZa = new MutableLiveData<>();
        this.AxsJAY = new C58216yxB();
        this.RcXXUw = true;
        this.OuxcSI = new MutableLiveData<>();
        this.gwTjWJ = new MutableLiveData<>();
        this.iwGUEr = new MutableLiveData<>();
        this.DXXBbs = new C23314hvr<>();
        this.UeEOUB = new MutableLiveData<>();
        this.ffGIBT = new MutableLiveData<>();
        this.OcIXYQ = new MutableLiveData<>();
        this.DarRvM = new C23314hvr<>();
        this.OBJEWx = new MutableLiveData<>();
        MutableLiveData<MpcWalletService.MpcWalletAbleStatus> mutableLiveData = new MutableLiveData<>();
        this.iRxXKY = mutableLiveData;
        this.DCJXGO = "0";
        this.hDKMBd = EventConditionEnterBy.Quick_button.getType();
        this.giSNqX = new C21775hLw(this);
        this.getFieldNames = new LimitCoinAssetsHandle();
        this.dvKsVJ = new C21759hLg(this);
        this.QUSxYX = new InitTradeGroup("", true);
        this.QVAiDq = new LimitInputCondition();
        this.QkdxfA = new LimitWalletCheckHandle(mutableLiveData, interfaceC22433hfK);
        this.QfsBiF = new C22430hfH(this, interfaceC22433hfK);
        this.zuWLRA = new TradeLimitStatePool();
        this.ejfBZ = new LimitApproveHandle(this);
        this.DAIeex = new hLJ(this);
        this.AxsJAYsNCnLh = new hLB(str, this);
        this.fvQaOB = new LimitQuoteHandle(this);
        this.gasjUx = new C25415iwL();
        this.AuCTelauCTel = ChangeType.UNKnown;
        this.zLjUOn = LimitOrderRateView.ShowType.SELL;
        this.DCUTEI = new MutableLiveData<>();
        this.fARcdN = new MutableLiveData<>();
        this.copydefault = new MutableLiveData<>();
        this.fetchVPNInfo = new C23314hvr<>();
        this.isConnected = new C23314hvr<>();
        MutableStateFlow<LimitPairRateResponse> MutableStateFlow = StateFlowKt.MutableStateFlow(new LimitPairRateResponse((java.lang.String) null, false, (LimitOrderInfo) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (LimitFeeData) null, (ServiceFeeInfo) null, (DexAutoSlippageInfoParam) null, 0, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, false, (java.lang.String) null, (java.lang.String) null, 524287, (DefaultConstructorMarker) null));
        this.OLrzqt = MutableStateFlow;
        this.fZBcTu = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Result<PreCheckBean>> MutableStateFlow2 = StateFlowKt.MutableStateFlow(null);
        this.gEmmrt = MutableStateFlow2;
        this.hUfVAv = FlowKt.asStateFlow(MutableStateFlow2);
        this.valueOf = new C23314hvr<>();
        MutableStateFlow<gLQ> MutableStateFlow3 = StateFlowKt.MutableStateFlow(gLQ.TaskDescription.copydefault);
        this.DbNXlk = MutableStateFlow3;
        this.QHmsKR = FlowKt.asStateFlow(MutableStateFlow3);
        this.djBIcL = StateFlowKt.MutableStateFlow(null);
        this.AhwBna = StateFlowKt.MutableStateFlow(null);
        MutableStateFlow<ReminderListConfig> MutableStateFlow4 = StateFlowKt.MutableStateFlow(null);
        this.AYXKKw = MutableStateFlow4;
        this.gGvvIC = FlowKt.asStateFlow(MutableStateFlow4);
        this.AEQbTJ = new C23314hvr<>();
        this.AuCTel = FlowKt.stateIn(FlowKt.onEach(FlowKt.distinctUntilChanged(new Activity(FlowLiveDataConversions.asFlow(this.OuxcSI))), new LimitOrderContentViewModel$chainIdForSwapConfig$2(this, null)), ViewModelKt.getViewModelScope(this), SharingStarted.Companion.getEagerly(), null);
        MutableStateFlow<Result<DexPresetResultVO>> MutableStateFlow5 = StateFlowKt.MutableStateFlow(null);
        this.EZpvd = MutableStateFlow5;
        this.DTwDnp = FlowKt.asStateFlow(MutableStateFlow5);
        this.RJOkX = new Observer() { // from class: o.hhl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C22495hgT.KWHzl(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        };
        this.getNewProxyInstance = new Observer() { // from class: o.hhn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C22495hgT.OLrzqt(this.KWHzl, (kotlin.Pair) obj);
            }
        };
        this.ODWQjV = new Observer() { // from class: o.hhp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C22495hgT.copydefault(this.EZpvd, (TradeStep) obj);
            }
        };
        this.QVAiDq.getInputFinish().observeForever(this.RJOkX);
        this.iwGUEr.observeForever(this.getNewProxyInstance);
        this.zuWLRA.getCurrentStep().observeForever(this.ODWQjV);
        KWHzl();
        this.zsXlph = new java.lang.Runnable() { // from class: o.hho
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C22495hgT.fIwbmz(this.AEQbTJ);
            }
        };
        this.QKudOq = C56392yDr.copydefault(new Function0() { // from class: o.hhr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22495hgT.ejfBZ(this.OLrzqt);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 android.app.Application)
  (r3v0 java.lang.String)
  (wrap:com.okinc.business.dex.api.bean.LimitParam:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dex.api.bean.LimitParam) : (r4v0 com.okinc.business.dex.api.bean.LimitParam))
  (wrap:o.hfK:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null o.hfK) : (r5v0 o.hfK))
 A[MD:(android.app.Application, java.lang.String, com.okinc.business.dex.api.bean.LimitParam, o.hfK):void (m)] (LINE:154) call: o.hgT.<init>(android.app.Application, java.lang.String, com.okinc.business.dex.api.bean.LimitParam, o.hfK):void type: THIS */
    public /* synthetic */ C22495hgT(android.app.Application application, java.lang.String str, LimitParam limitParam, InterfaceC22433hfK interfaceC22433hfK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(application, str, (i & 4) != 0 ? null : limitParam, (i & 8) != 0 ? null : interfaceC22433hfK);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22495hgT(@NotNull android.app.Application application, @NotNull java.lang.String str, LimitParam limitParam, InterfaceC22433hfK interfaceC22433hfK) {
        this(application, str, limitParam, interfaceC22433hfK, ((InterfaceC22496hgU) C58114yvF.OLrzqt(application, InterfaceC22496hgU.class)).AuCTel(), ((InterfaceC22496hgU) C58114yvF.OLrzqt(application, InterfaceC22496hgU.class)).fIwbmz(), ((InterfaceC22496hgU) C58114yvF.OLrzqt(application, InterfaceC22496hgU.class)).hDKMBd(), ((InterfaceC22496hgU) C58114yvF.OLrzqt(application, InterfaceC22496hgU.class)).ejfBZ(), ((InterfaceC22496hgU) C58114yvF.OLrzqt(application, InterfaceC22496hgU.class)).iwGUEr(), ((InterfaceC22496hgU) C58114yvF.OLrzqt(application, InterfaceC22496hgU.class)).uzCIH(), ((InterfaceC22496hgU) C58114yvF.OLrzqt(application, InterfaceC22496hgU.class)).fJNWhG(), ((InterfaceC22496hgU) C58114yvF.OLrzqt(application, InterfaceC22496hgU.class)).fARcdN());
        Intrinsics.checkNotNullParameter(application, "");
        Intrinsics.checkNotNullParameter(str, "");
        C58114yvF c58114yvF = C58114yvF.EZpvd;
    }

    public final void isConnected() {
        this.gasjUx.OLrzqt();
    }

    public final void KWHzl(@NotNull CurrentChain currentChain) {
        Intrinsics.checkNotNullParameter(currentChain, "");
        gEmmrt();
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(this.RlQdEF).fARcdN().OLrzqt(this.RlQdEF);
        InterfaceC22425hfC interfaceC22425hfCAYXKKw = c22380heK.copydefault(this.RlQdEF).AYXKKw();
        if (interfaceC22425hfCAYXKKw.EZpvd() == null || interfaceC22425hfCAYXKKw.copydefault() == null || !this.iZzfmt) {
            LimitParam limitParam = this.dxcTrN;
            if ((limitParam != null ? limitParam.getEditOrderData() : null) == null) {
                this.dvKsVJ.OLrzqt(currentChain.getData());
                return;
            }
        }
        this.iZzfmt = false;
        this.dvKsVJ.EZpvd(currentChain.getData());
    }

    public static final void KWHzl(C22495hgT c22495hgT, boolean z) {
        if (z) {
            TradeLimitStatePool tradeLimitStatePool = c22495hgT.zuWLRA;
            CheckStep checkStep = CheckStep.INPUT;
            tradeLimitStatePool.refreshStatePool(new TradeStep(checkStep, true, SwapState.SWITCH_COIN, true, false));
            c22495hgT.zuWLRA.refreshStatePool(new TradeStep(checkStep, true, SwapState.SWAP_INPUT_SUCCESS, false, true));
            return;
        }
        c22495hgT.zuWLRA.refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.SWAP_INPUT, true, false));
    }

    public static final void OLrzqt(C22495hgT c22495hgT, kotlin.Pair pair) {
        hLI hli;
        Intrinsics.checkNotNullParameter(pair, "");
        if (((java.lang.Boolean) pair.getFirst()).booleanValue()) {
            if (c22495hgT.OxVOHk()) {
                c22495hgT.OcIXYQ.setValue(java.lang.Boolean.TRUE);
                return;
            }
            c22495hgT.giSNqX.OLrzqt((LimitCalResult) pair.getSecond());
            int i = TaskDescription.KWHzl[c22495hgT.AuCTelauCTel.ordinal()];
            if (i == 1) {
                hLI hli2 = c22495hgT.fFgQHt;
                if (hli2 != null) {
                    hli2.EZpvd((LimitCalResult) pair.getSecond());
                }
            } else if (i == 2) {
                java.lang.Boolean value = c22495hgT.giSNqX().getValue();
                java.lang.String exchangeRate = ((LimitCalResult) pair.getSecond()).getExchangeRate();
                if (Intrinsics.EZpvd(value, java.lang.Boolean.FALSE) && !Intrinsics.EZpvd((java.lang.Object) exchangeRate, (java.lang.Object) c22495hgT.gasjUx().getValue())) {
                    c22495hgT.isConnected.setValue(exchangeRate);
                }
                hLI hli3 = c22495hgT.fFgQHt;
                if (hli3 != null) {
                    hli3.EZpvd((LimitCalResult) pair.getSecond());
                }
            } else if (i == 3) {
                c22495hgT.DAIeex.AEQbTJ((LimitCalResult) pair.getSecond());
            } else if (i == 4 && (hli = c22495hgT.fFgQHt) != null) {
                hli.EZpvd((LimitCalResult) pair.getSecond());
            }
            InterfaceC22433hfK interfaceC22433hfK = c22495hgT.finit;
            if (interfaceC22433hfK != null) {
                interfaceC22433hfK.OLrzqt((LimitCalResult) pair.getSecond());
            }
        }
    }

    public static final void copydefault(C22495hgT c22495hgT, TradeStep tradeStep) {
        Intrinsics.checkNotNullParameter(tradeStep, "");
        switch (TaskDescription.OLrzqt[tradeStep.getStep().ordinal()]) {
            case 1:
                c22495hgT.zuWLRA.refreshStatePool(new TradeStep(CheckStep.INIT, true, SwapState.INIT_SUCCESS, false, true));
                return;
            case 2:
                c22495hgT.valueOf();
                return;
            case 3:
                c22495hgT.spnCvw();
                return;
            case 4:
                PreCheckBean value = c22495hgT.dvKsVJ().getValue();
                if (value == null || !value.isSupportQuote()) {
                    return;
                }
                c22495hgT.fvQaOB.checkCount();
                return;
            case 5:
                c22495hgT.djBIcL();
                return;
            case 6:
                c22495hgT.AhwBna();
                return;
            case 7:
                Result<DexPresetResultVO> resultOLrzqt = c22495hgT.OLrzqt(c22495hgT.fARcdN());
                if (resultOLrzqt == null || !Result.m7384isSuccessimpl(resultOLrzqt.m7386unboximpl())) {
                    return;
                }
                c22495hgT.zuWLRA.refreshStatePool(new TradeStep(CheckStep.SWAP, true, SwapState.SWAP, true, false));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void gEmmrt() {
        this.giSNqX.KWHzl();
        Dmq();
    }

    public static final void AkhnZx(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public final void KWHzl() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.hhy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22495hgT.OLrzqt(this.EZpvd, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hhz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22495hgT.AkhnZx(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hhx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22495hgT.EZpvd((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hhB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22495hgT.AYXKKw(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.zuBGHE);
    }

    public static final Unit OLrzqt(final C22495hgT c22495hgT, xXO xxo) {
        AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(c22495hgT.RlQdEF).fARcdN().OLrzqt();
        final Function1 function1 = new Function1() { // from class: o.hhq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22495hgT.AEQbTJ(this.OLrzqt, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hhu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22495hgT.DbNXlk(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hhw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22495hgT.OLrzqt((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hhv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22495hgT.isConnected(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, c22495hgT.zuBGHE);
        return Unit.INSTANCE;
    }

    public static final void DbNXlk(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C22495hgT c22495hgT, InterfaceC9738bbJ interfaceC9738bbJ) {
        c22495hgT.QbewEr = false;
        c22495hgT.dvKsVJ.OLrzqt(c22495hgT.sSMYrx);
        c22495hgT.sSMYrx = false;
        C22380heK.OLrzqt.copydefault(c22495hgT.RlQdEF).AYXKKw().EZpvd(null);
        c22495hgT.copydefault(c22495hgT.fARcdN(), c22495hgT.gwTjWJ());
        c22495hgT.OLrzqt(true);
        return Unit.INSTANCE;
    }

    public static final void isConnected(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LimitOrderContentViewModel$getPreCheckResult$1(this, str, str2, null), 3, null);
    }

    public final void htlTjW() {
        this.RKDWNf = true;
        fERRXa();
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("ev_network_change");
        final Function1 function1 = new Function1() { // from class: o.hhb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22495hgT.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(new InterfaceC58227yxM() { // from class: o.hgY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22495hgT.AuCTel(function1, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.zuBGHE);
        this.getFieldNames.addAssetsListener(this.OuxcSI, this.fIwbmz);
    }

    public static final void AuCTel(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C22495hgT c22495hgT, java.lang.String str) {
        c22495hgT.fERRXa();
        return Unit.INSTANCE;
    }

    public final void fjfviF() {
        this.RKDWNf = false;
        Dmq();
        this.getFieldNames.disposeAssetsListener();
    }

    public final void fERRXa() {
        C22380heK.OLrzqt.copydefault(this.RlQdEF).gEmmrt().copydefault();
        this.zuWLRA.initCheckStep();
        getMarketPrice$default(this, null, 1, null);
        getCoinAssets$default(this, null, 1, null);
    }

    public final void igXuih() {
        C22380heK.OLrzqt.copydefault(this.RlQdEF).gEmmrt().copydefault();
        AhwBna();
    }

    public static /* synthetic */ void getExpireConfig$default(C22495hgT c22495hgT, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c22495hgT.OLrzqt(z);
    }

    public final void OLrzqt(boolean z) {
        if (this.OBJEWx.getValue() == null || z) {
            C22380heK c22380heK = C22380heK.OLrzqt;
            java.util.List<ExpireTimeConfig> expireTimeList$default = InterfaceC22502hga.ActionBar.getExpireTimeList$default(c22380heK.copydefault(this.RlQdEF).AhwBna(), null, 1, null);
            if (!C33129mqd.KWHzl((java.util.Collection) expireTimeList$default) || z) {
                AbstractC58185ywX expireTimeConfig$default = InterfaceC22502hga.ActionBar.getExpireTimeConfig$default(c22380heK.copydefault(this.RlQdEF).AhwBna(), null, 1, null);
                final Function1 function1 = new Function1() { // from class: o.hhh
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C22495hgT.OLrzqt(this.AEQbTJ, (java.util.List) obj);
                    }
                };
                InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hhk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C22495hgT.fARcdN(function1, obj);
                    }
                };
                final Function1 function12 = new Function1() { // from class: o.hhj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C22495hgT.KWHzl(this.EZpvd, (java.lang.Throwable) obj);
                    }
                };
                InterfaceC58217yxC interfaceC58217yxCAEQbTJ = expireTimeConfig$default.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hhi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC58227yxM
                    public final void accept(java.lang.Object obj) {
                        C22495hgT.fJNWhG(function12, obj);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
                C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this.zuBGHE);
                return;
            }
            for (ExpireTimeConfig expireTimeConfig : expireTimeList$default) {
                if (expireTimeConfig.getDefaultShow()) {
                    this.OBJEWx.setValue(new ExpireTimeData(expireTimeConfig.getId(), null, expireTimeConfig.getText(), 2, null));
                    return;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    public static final void fARcdN(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(C22495hgT c22495hgT, java.util.List list) {
        if (C33129mqd.KWHzl((java.util.Collection) list) && C23313hvq.OLrzqt(java.lang.Integer.valueOf(list.size()), 0)) {
            Intrinsics.copydefault(list);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ExpireTimeConfig expireTimeConfig = (ExpireTimeConfig) it.next();
                if (expireTimeConfig.getDefaultShow()) {
                    c22495hgT.OBJEWx.setValue(new ExpireTimeData(expireTimeConfig.getId(), null, expireTimeConfig.getText(), 2, null));
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        c22495hgT.OBJEWx.setValue(new ExpireTimeData(null, null, null, 7, null));
        return Unit.INSTANCE;
    }

    public static final void fJNWhG(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(C22495hgT c22495hgT, java.lang.Throwable th) {
        c22495hgT.OBJEWx.setValue(new ExpireTimeData(null, null, null, 7, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hgT */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getMarketPrice$default(C22495hgT c22495hgT, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c22495hgT.AEQbTJ((Function0<Unit>) function0);
    }

    public final void AEQbTJ(Function0<Unit> function0) {
        if (this.RKDWNf) {
            C33050mpD.OLrzqt(this.flVtFt);
            if (this.RcXXUw) {
                this.zuWLRA.initCheckStep();
                this.ffGIBT.setValue(LimitMarketPrice.QuoteState.Quoting);
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = QKudOq();
            if (dexMultiTokenInfoBeanOcIXYQ == null || dexMultiTokenInfoBeanQKudOq == null) {
                return;
            }
            C22380heK c22380heK = C22380heK.OLrzqt;
            java.lang.String strKWHzl = c22380heK.copydefault(this.RlQdEF).fARcdN().KWHzl(dexMultiTokenInfoBeanOcIXYQ.getChainId());
            java.util.List<java.lang.String> value = c22380heK.copydefault(this.RlQdEF).djBIcL().gEmmrt().OLrzqt().getValue();
            java.lang.String strOLrzqt = this.dHguZz.OLrzqt(dexMultiTokenInfoBeanOcIXYQ.getChainId());
            Job job = this.gkJEwt;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
            }
            this.gkJEwt = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LimitOrderContentViewModel$getMarketPrice$1(this, dexMultiTokenInfoBeanOcIXYQ, dexMultiTokenInfoBeanQKudOq, strKWHzl, value, strOLrzqt, function0, null), 3, null);
        }
    }

    public final LimitPairRateResponse copydefault(TokenPairRateQuote tokenPairRateQuote) {
        LimitOrderInfo limitOrderInfo;
        java.lang.String changeRate = tokenPairRateQuote.getChangeRate();
        boolean enableJito = tokenPairRateQuote.getEnableJito();
        TokenPairRateOrderInfo orderInfo = tokenPairRateQuote.getOrderInfo();
        if (orderInfo != null) {
            DexMultiTokenInfoBean fromToken = orderInfo.getFromToken();
            DexMultiTokenInfoBean toToken = orderInfo.getToToken();
            java.lang.String fromTokenAmount = orderInfo.getFromTokenAmount();
            java.lang.String toTokenAmount = orderInfo.getToTokenAmount();
            java.lang.String fromTokenPrice = tokenPairRateQuote.getFromTokenPrice();
            boolean zIsEnableMev = orderInfo.isEnableMev();
            java.lang.String minimumReceived = orderInfo.getMinimumReceived();
            java.lang.String nativeTokenUnitPriceUsd = orderInfo.getNativeTokenUnitPriceUsd();
            java.lang.String estReserveNativeAmt = orderInfo.getEstReserveNativeAmt();
            java.lang.String minSellAmount = orderInfo.getMinSellAmount();
            java.lang.String str = minSellAmount == null ? "" : minSellAmount;
            java.lang.String code = orderInfo.getCode();
            java.lang.String str2 = code == null ? "" : code;
            java.lang.String strIsHoneypot = orderInfo.isHoneypot();
            java.lang.String str3 = strIsHoneypot == null ? "" : strIsHoneypot;
            java.lang.String strIsSafeMoonToken = orderInfo.isSafeMoonToken();
            if (strIsSafeMoonToken == null) {
                strIsSafeMoonToken = "";
            }
            limitOrderInfo = new LimitOrderInfo(fromToken, toToken, fromTokenAmount, toTokenAmount, fromTokenPrice, zIsEnableMev, minimumReceived, nativeTokenUnitPriceUsd, estReserveNativeAmt, str, str2, str3, strIsSafeMoonToken);
        } else {
            limitOrderInfo = null;
        }
        return new LimitPairRateResponse(changeRate, enableJito, limitOrderInfo, tokenPairRateQuote.getEstimateGasFee(), (java.lang.String) null, (java.lang.String) null, tokenPairRateQuote.getFromTokenPrice(), tokenPairRateQuote.getToTokenPrice(), tokenPairRateQuote.getReceiveAmount(), tokenPairRateQuote.getFeeData(), tokenPairRateQuote.getServiceFeeInfo(), tokenPairRateQuote.getSlippageInfo(), 0, tokenPairRateQuote.getValDiff(), tokenPairRateQuote.getExpirationTime(), tokenPairRateQuote.getNativeSymbol(), false, (java.lang.String) null, tokenPairRateQuote.getRemainingQuota(), 200752, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gOL.createReminderListConfigForLimit$default(o.gOL, com.okinc.business.dex.trade.common.reminder.PreCheckModel, com.okinc.business.dex.trade.common.reminder.BusinessType, com.okinc.business.dexlogic.bean.DefiChainInfo, com.okinc.business.dex.trade.core.domain.model.limit.TokenPairRateQuote, java.lang.Throwable, java.lang.Throwable, com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, int, int, int, boolean, boolean, boolean, boolean, o.gPa, o.gOT, boolean, java.lang.String, long, o.bbJ, int, java.lang.Object):com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig */
    public final void DCUTEIdCUTEI() {
        DefiChainInfo defiChainInfo = this.uzCIH;
        byte b = 0;
        byte b2 = 0;
        if (defiChainInfo == null) {
            this.AYXKKw.setValue(null);
            return;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = QKudOq();
        C19787gPh c19787gPh = new C19787gPh(this.RlQdEF, b2 == true ? 1 : 0, 2, b == true ? 1 : 0);
        gOZ goz = new gOZ(this.fJNWhG, defiChainInfo, this.DbNXlk, this.AwvSrB);
        MutableStateFlow<ReminderListConfig> mutableStateFlow = this.AYXKKw;
        gOL gol = gOL.EZpvd;
        PreCheckBean value = dvKsVJ().getValue();
        mutableStateFlow.setValue(gol.KWHzl(value != null ? gol.KWHzl(value) : null, BusinessType.SwapLimit, defiChainInfo, this.djBIcL.getValue(), this.AhwBna.getValue(), null, SlippageMode.Dynamic, hUfVAv(), this.gasjUx.KWHzl(), null, dexMultiTokenInfoBeanOcIXYQ, dexMultiTokenInfoBeanQKudOq, C24695iig.copydefault(this.RlQdEF), C24695iig.AEQbTJ(this.RlQdEF, true).AEQbTJ(), 1, Intrinsics.EZpvd(this.fARcdN.getValue(), java.lang.Boolean.TRUE), true, false, false, c19787gPh, goz, (2097152 & 2097152) != 0 ? false : false, (2097152 & 4194304) != 0 ? null : this.ORxRYg, (2097152 & 8388608) != 0 ? java.lang.System.currentTimeMillis() + 604800000 : fFgQHt(), (2097152 & 16777216) != 0 ? null : hBpjJd()));
    }

    public final long fFgQHt() {
        java.lang.Long fieldNames;
        java.lang.String strAEQbTJ = this.AxsJAYsNCnLh.AEQbTJ();
        if (strAEQbTJ != null && (fieldNames = StringsKt__StringNumberConversionsKt.getFieldNames(strAEQbTJ)) != null) {
            return fieldNames.longValue();
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strOLrzqt = this.AxsJAYsNCnLh.OLrzqt();
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        return jCurrentTimeMillis + EZpvd(strOLrzqt);
    }

    /* JADX INFO: renamed from: o.hgT$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hgT.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void valueOf() {
        FragmentActivity fragmentActivity = this.AkhnZx;
        if (fragmentActivity != null) {
            this.QkdxfA.checkWallet(this, fARcdN(), this.zuWLRA, this.RlQdEF, fragmentActivity);
        }
    }

    public final void values() {
        this.QkdxfA.checkWalletState(fARcdN(), this.RlQdEF);
    }

    private final void spnCvw() {
        TradeInputGroup data;
        java.lang.Boolean boolCopydefault;
        this.QfsBiF.OLrzqt();
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null) {
            return;
        }
        LimitInputCondition limitInputCondition = this.QVAiDq;
        hLI hli = this.fFgQHt;
        limitInputCondition.setCondition(data, (hli == null || (boolCopydefault = hli.copydefault()) == null) ? false : boolCopydefault.booleanValue(), ODXsMY());
    }

    public final void djBIcL() {
        this.getFieldNames.checkFromBalance(this.OuxcSI, this, new Function0() { // from class: o.hhg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22495hgT.copydefault();
            }
        });
    }

    public static final Unit copydefault() {
        return Unit.INSTANCE;
    }

    public final void AhwBna() {
        this.zuWLRA.refreshStatePool(new TradeStep(CheckStep.APPROVE, true, SwapState.APPROVE_SUCCESS, false, true));
        this.fARcdN.setValue(java.lang.Boolean.FALSE);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull Function1<? super ApproveSwapData, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.ejfBZ.getUnApproveData(str, function1);
    }

    public final AbstractC58185ywX<ResponseData<java.lang.String>> EZpvd(@NotNull java.util.Map<java.lang.String, java.lang.String> map, @NotNull JsonObject jsonObject, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(jsonObject, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return this.AxsJAYsNCnLh.AEQbTJ(map, jsonObject, str, str2);
    }

    public final void gEmmrt(final boolean z) {
        this.QkdxfA.getWalletState(fARcdN(), this.RlQdEF, new Function1() { // from class: o.hhc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22495hgT.KWHzl(z, this, (SwapState) obj);
            }
        });
    }

    public static final Unit KWHzl(boolean z, C22495hgT c22495hgT, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        if (!z) {
            c22495hgT.DbNXlk();
        }
        boolean z2 = swapState == SwapState.WALLET_SUCCESS && z;
        c22495hgT.copydefault.setValue(new C19738gNm(false, z2, z2, z2, z2, z2, 1, null));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setExpireTime$default(C22495hgT c22495hgT, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        c22495hgT.OLrzqt(str, str2, str3);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, @NotNull java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str3, "");
        if (str2 == null || str2.length() == 0) {
            this.AxsJAYsNCnLh.copydefault(str);
        } else {
            this.AxsJAYsNCnLh.copydefault((java.lang.String) null);
        }
        this.AxsJAYsNCnLh.OLrzqt(str2);
        this.AxsJAYsNCnLh.EZpvd(str3);
        DCUTEIdCUTEI();
    }

    public final DexMultiTokenInfoBean OcIXYQ() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        ImageTextData coinData;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (coinData = data2.getCoinData()) == null) {
            return null;
        }
        return coinData.getData();
    }

    public final DexMultiTokenInfoBean QKudOq() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> toData;
        TradeInputData data2;
        ImageTextData coinData;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null || (toData = data.getToData()) == null || (data2 = toData.getData()) == null || (coinData = data2.getCoinData()) == null) {
            return null;
        }
        return coinData.getData();
    }

    public final java.lang.String DTwDnp() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (editData = data2.getEditData()) == null) {
            return null;
        }
        return editData.getData();
    }

    public final java.lang.String accept() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> toData;
        TradeInputData data2;
        EditTextData editData;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null || (toData = data.getToData()) == null || (data2 = toData.getData()) == null || (editData = data2.getEditData()) == null) {
            return null;
        }
        return editData.getData();
    }

    public static /* synthetic */ void getCoinAssets$default(C22495hgT c22495hgT, CoinAssets coinAssets, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            coinAssets = CoinAssets.BOTH;
        }
        c22495hgT.copydefault(coinAssets);
    }

    public final void copydefault(@NotNull CoinAssets coinAssets) {
        Intrinsics.checkNotNullParameter(coinAssets, "");
        this.getFieldNames.getCoinAssets(coinAssets, this.OuxcSI, this);
    }

    public final java.lang.String hDKMBd() {
        LimitOrderInfo limitOrderInfo;
        LimitPairRateResponse limitPairRateResponseAYXKKw = this.giSNqX.AYXKKw();
        java.lang.String estReserveNativeAmt = (limitPairRateResponseAYXKKw == null || (limitOrderInfo = limitPairRateResponseAYXKKw.getLimitOrderInfo()) == null) ? null : limitOrderInfo.getEstReserveNativeAmt();
        DefiChainInfo defiChainInfo = this.uzCIH;
        java.lang.String reserveGas = defiChainInfo != null ? defiChainInfo.getReserveGas() : null;
        if (reserveGas == null) {
            reserveGas = "";
        }
        return (estReserveNativeAmt == null || estReserveNativeAmt.length() == 0) ? reserveGas : estReserveNativeAmt;
    }

    public final boolean dUDNAs() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        java.lang.String chainId = dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getChainId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = QKudOq();
        return C23313hvq.copydefault(chainId, dexMultiTokenInfoBeanQKudOq != null ? dexMultiTokenInfoBeanQKudOq.getChainId() : null);
    }

    public final boolean OJuSTm() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        return dexMultiTokenInfoBeanOcIXYQ != null && dexMultiTokenInfoBeanOcIXYQ.isMainChainCoin();
    }

    public final java.lang.String gwTjWJ() {
        return C22380heK.OLrzqt.copydefault(this.RlQdEF).fARcdN().KWHzl(iwGUEr());
    }

    public final java.lang.String iwGUEr() {
        java.lang.String chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        return (dexMultiTokenInfoBeanOcIXYQ == null || (chainId = dexMultiTokenInfoBeanOcIXYQ.getChainId()) == null) ? "1" : chainId;
    }

    public final java.lang.String getFieldNames() {
        DefiChainInfo defiChainInfo = this.uzCIH;
        java.lang.String chainName = defiChainInfo != null ? defiChainInfo.getChainName() : null;
        return chainName == null ? "" : chainName;
    }

    public final void DbNXlk() {
        TradeInputGroup data;
        TradeInputGroup clearFromInput;
        ConsumeData<TradeInputGroup> consumeDataEZpvd;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null || (clearFromInput = data.setClearFromInput(true)) == null || (consumeDataEZpvd = C22332hdP.EZpvd(clearFromInput)) == null) {
            return;
        }
        this.OuxcSI.setValue(consumeDataEZpvd);
    }

    public final void AkhnZx() {
        TradeInputGroup data;
        TradeInputGroup clearInputForLimit;
        ConsumeData<TradeInputGroup> consumeDataEZpvd;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null || (clearInputForLimit = data.setClearInputForLimit()) == null || (consumeDataEZpvd = C22332hdP.EZpvd(clearInputForLimit)) == null) {
            return;
        }
        this.OuxcSI.setValue(consumeDataEZpvd);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.getFieldNames.setFromContent(this.OuxcSI, str, str2);
    }

    public final boolean QSLkRj() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        if (dexMultiTokenInfoBeanOcIXYQ != null && dexMultiTokenInfoBeanOcIXYQ.isSafeMoonToken() == 1) {
            return true;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = QKudOq();
        return dexMultiTokenInfoBeanQKudOq != null && dexMultiTokenInfoBeanQKudOq.isSafeMoonToken() == 1;
    }

    public final boolean OFhtUX() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        if (dexMultiTokenInfoBeanOcIXYQ != null && dexMultiTokenInfoBeanOcIXYQ.isHoneypot() == 1) {
            return true;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = QKudOq();
        return dexMultiTokenInfoBeanQKudOq != null && dexMultiTokenInfoBeanQKudOq.isHoneypot() == 1;
    }

    public final boolean DLWbHP() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        if (dexMultiTokenInfoBeanOcIXYQ != null && dexMultiTokenInfoBeanOcIXYQ.isLeverage()) {
            return true;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = QKudOq();
        return dexMultiTokenInfoBeanQKudOq != null && dexMultiTokenInfoBeanQKudOq.isLeverage();
    }

    public final boolean OxVOHk() {
        return DLWbHP();
    }

    public final LimitErrorViewHandle.ErrorType DAIeex() {
        return OFhtUX() ? LimitErrorViewHandle.ErrorType.HoneyPot : DLWbHP() ? LimitErrorViewHandle.ErrorType.Leverage : QSLkRj() ? LimitErrorViewHandle.ErrorType.SafeMoon : LimitErrorViewHandle.ErrorType.NormalCoin;
    }

    public final void Dmq() {
        C33050mpD.OLrzqt(this.flVtFt);
        Job job = this.gkJEwt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.gkJEwt = null;
        this.dvKsVJ.OLrzqt();
        this.QkdxfA.disposeCheck();
        this.getFieldNames.disposeAssets();
        this.ejfBZ.disposeApprove();
    }

    public final void fdOvFl() {
        Dmq();
        C33050mpD.OLrzqt(this.zuBGHE);
        this.QVAiDq.getInputFinish().removeObserver(this.RJOkX);
        this.iwGUEr.removeObserver(this.getNewProxyInstance);
        this.zuWLRA.getCurrentStep().removeObserver(this.ODWQjV);
        this.QUSxYX.releaseData();
        this.AxsJAYsNCnLh.KWHzl();
    }

    public final java.lang.String wlaJM() {
        TradeInputGroup data;
        ConsumeData<ExchangeRateData> exchangeRateData;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        ExchangeRateData data2 = (value == null || (data = value.getData()) == null || (exchangeRateData = data.getExchangeRateData()) == null) ? null : exchangeRateData.getData();
        java.lang.String customRate = data2 != null ? data2.getCustomRate() : null;
        return customRate == null ? "" : customRate;
    }

    public final java.lang.String zsXlph() {
        TradeInputGroup data;
        ConsumeData<ExchangeRateData> exchangeRateData;
        ExchangeRateData data2;
        java.lang.String customRate;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        return (value == null || (data = value.getData()) == null || (exchangeRateData = data.getExchangeRateData()) == null || (data2 = exchangeRateData.getData()) == null || (customRate = data2.getCustomRate()) == null) ? "" : customRate;
    }

    public final boolean ODXsMY() {
        java.lang.String strCopydefault;
        return Intrinsics.EZpvd((java.lang.Object) this.AxsJAYsNCnLh.copydefault(), (java.lang.Object) "--") || (strCopydefault = this.AxsJAYsNCnLh.copydefault()) == null || strCopydefault.length() == 0;
    }

    public static final void fIwbmz(C22495hgT c22495hgT) {
        DefiChainInfo defiChainInfo;
        if (c22495hgT.wlaJM == null || (defiChainInfo = c22495hgT.AubY) == null) {
            return;
        }
        C21759hLg c21759hLg = c22495hgT.dvKsVJ;
        Intrinsics.copydefault(defiChainInfo);
        LimitParam limitParam = c22495hgT.wlaJM;
        Intrinsics.copydefault(limitParam);
        c21759hLg.EZpvd(defiChainInfo, limitParam);
        c22495hgT.AubY = null;
    }

    public final void ixgjPv() {
        this.zsXlph.run();
    }

    public final DexMultiTokenInfoBean AEQbTJ(boolean z) {
        if (z) {
            return OcIXYQ();
        }
        return QKudOq();
    }

    public final java.lang.String DCUTEI() {
        return this.zLjUOn == LimitOrderRateView.ShowType.SELL ? "sell" : "buy";
    }

    public final java.lang.String ffGIBT() {
        java.lang.String strOLrzqt = this.AxsJAYsNCnLh.OLrzqt();
        return strOLrzqt == null ? "custom" : strOLrzqt;
    }

    public final java.lang.String OuxcSI() {
        java.lang.String rateDiffAmount;
        LimitPairRateResponse limitPairRateResponseAYXKKw = this.giSNqX.AYXKKw();
        if (limitPairRateResponseAYXKKw == null || (rateDiffAmount = limitPairRateResponseAYXKKw.getRateDiffAmount(wlaJM(), this.zLjUOn)) == null) {
            rateDiffAmount = "0";
        }
        return C33129mqd.formatS$default(C23313hvq.mulCheckS$default(C23311hvo.copydefault(rateDiffAmount), 100, null, null, null, 14, null), 2, null, null, 6, null) + "%";
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gEmmrt(@NotNull java.lang.String str) {
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
        Intrinsics.checkNotNullParameter(str, "");
        if (this.QOLQEE) {
            ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
            strMulCheckS$default = (value == null || (data4 = value.getData()) == null || (fromData = data4.getFromData()) == null || (data5 = fromData.getData()) == null || (balance2 = data5.getBalance()) == null || (data6 = balance2.getData()) == null) ? null : C23313hvq.mulCheckS$default(data6, str, null, null, null, 14, null);
            if (strMulCheckS$default == null) {
                strMulCheckS$default = "";
            }
        } else {
            ConsumeData<TradeInputGroup> value2 = this.OuxcSI.getValue();
            strMulCheckS$default = (value2 == null || (data = value2.getData()) == null || (toData = data.getToData()) == null || (data2 = toData.getData()) == null || (balance = data2.getBalance()) == null || (data3 = balance.getData()) == null) ? null : C23313hvq.mulCheckS$default(data3, str, null, null, null, 14, null);
            if (strMulCheckS$default == null) {
            }
        }
        if (this.QOLQEE) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
            decimals = dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getDecimals() : null;
            str2 = decimals != null ? decimals : "";
            KWHzl(C23311hvo.OLrzqt(strMulCheckS$default, C23313hvq.OLrzqt(str2, "12") ? "12" : str2), C23311hvo.OLrzqt(strMulCheckS$default, str2));
            return;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = QKudOq();
        decimals = dexMultiTokenInfoBeanQKudOq != null ? dexMultiTokenInfoBeanQKudOq.getDecimals() : null;
        str2 = decimals != null ? decimals : "";
        this.getFieldNames.setToContent(this.OuxcSI, C23311hvo.OLrzqt(strMulCheckS$default, C23313hvq.OLrzqt(str2, "12") ? "12" : str2), C23311hvo.OLrzqt(strMulCheckS$default, str2));
    }

    public final boolean zblBkD() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> toData;
        TradeInputData data2;
        FromToBalance balance;
        java.lang.String data3;
        TradeInputGroup data4;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data5;
        FromToBalance balance2;
        java.lang.String data6;
        if (this.QOLQEE) {
            ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
            if (value != null && (data4 = value.getData()) != null && (fromData = data4.getFromData()) != null && (data5 = fromData.getData()) != null && (balance2 = data5.getBalance()) != null && (data6 = balance2.getData()) != null) {
                return C23313hvq.OLrzqt(data6, "0");
            }
        } else {
            ConsumeData<TradeInputGroup> value2 = this.OuxcSI.getValue();
            if (value2 != null && (data = value2.getData()) != null && (toData = data.getToData()) != null && (data2 = toData.getData()) != null && (balance = data2.getBalance()) != null && (data3 = balance.getData()) != null) {
                return C23313hvq.OLrzqt(data3, "0");
            }
        }
        return false;
    }

    public final void AEQbTJ(@NotNull java.lang.String str) {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        FromToBalance balance;
        Intrinsics.checkNotNullParameter(str, "");
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (balance = data2.getBalance()) == null) {
            return;
        }
        balance.setBalanceBracket(str);
    }

    public final java.lang.String DCJXGO() {
        DexMultiTokenInfoBean value = C22380heK.OLrzqt.copydefault(this.RlQdEF).valueOf().KWHzl().getValue();
        java.lang.String uniqueId = value != null ? value.getUniqueId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        return Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getUniqueId() : null), (java.lang.Object) uniqueId) ? "yes" : "no";
    }

    public final java.lang.String DXXBbs() {
        DexMultiTokenInfoBean value = C22380heK.OLrzqt.copydefault(this.RlQdEF).valueOf().EZpvd().getValue();
        java.lang.String uniqueId = value != null ? value.getUniqueId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = QKudOq();
        return Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanQKudOq != null ? dexMultiTokenInfoBeanQKudOq.getUniqueId() : null), (java.lang.Object) uniqueId) ? "yes" : "no";
    }

    public final java.lang.String OqFWZa() {
        java.lang.String balanceBracket;
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        TradeInputGroup data3;
        ConsumeData<TradeInputData> fromData2;
        TradeInputData data4;
        FromToBalance balance;
        TradeInputGroup data5;
        ConsumeData<TradeInputData> fromData3;
        TradeInputData data6;
        FromToBalance balance2;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        if (value == null || (data5 = value.getData()) == null || (fromData3 = data5.getFromData()) == null || (data6 = fromData3.getData()) == null || (balance2 = data6.getBalance()) == null || (balanceBracket = balance2.getBalanceBracket()) == null) {
            balanceBracket = "custom";
        }
        ConsumeData<TradeInputGroup> value2 = this.OuxcSI.getValue();
        java.lang.String data7 = (value2 == null || (data3 = value2.getData()) == null || (fromData2 = data3.getFromData()) == null || (data4 = fromData2.getData()) == null || (balance = data4.getBalance()) == null) ? null : balance.getData();
        ConsumeData<TradeInputGroup> value3 = this.OuxcSI.getValue();
        java.lang.String data8 = (value3 == null || (data = value3.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (editData = data2.getEditData()) == null) ? null : editData.getData();
        if (Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) "max")) {
            if (!OJuSTm()) {
                strSubCheckS$default = data7;
            } else if (data7 != null) {
                strSubCheckS$default = C23313hvq.subCheckS$default(data7, hDKMBd(), null, null, null, 14, null);
            }
            if (!Intrinsics.EZpvd((java.lang.Object) strSubCheckS$default, (java.lang.Object) data8)) {
                return "custom";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) C23311hvo.formatPercent$default("0.25", false, 0, 0, null, null, 31, null))) {
            if (!Intrinsics.EZpvd((java.lang.Object) (data7 != null ? C23313hvq.mulCheckS$default(data7, java.lang.Double.valueOf(0.25d), null, null, null, 14, null) : null), (java.lang.Object) data8)) {
                return "custom";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) C23311hvo.formatPercent$default(SlippageConfigVo.MAX_SLIP, false, 0, 0, null, null, 31, null))) {
            if (!Intrinsics.EZpvd((java.lang.Object) (data7 != null ? C23313hvq.mulCheckS$default(data7, java.lang.Double.valueOf(0.5d), null, null, null, 14, null) : null), (java.lang.Object) data8)) {
                return "custom";
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) C23311hvo.formatPercent$default("0.75", false, 0, 0, null, null, 31, null))) {
            if (!Intrinsics.EZpvd((java.lang.Object) (data7 != null ? C23313hvq.mulCheckS$default(data7, java.lang.Double.valueOf(0.75d), null, null, null, 14, null) : null), (java.lang.Object) data8)) {
                return "custom";
            }
        } else if (!Intrinsics.EZpvd((java.lang.Object) balanceBracket, (java.lang.Object) C23311hvo.formatPercent$default("1", false, 0, 0, null, null, 31, null)) || !Intrinsics.EZpvd((java.lang.Object) data7, (java.lang.Object) data8)) {
            return "custom";
        }
        return balanceBracket;
    }

    public final InterfaceC9738bbJ hBpjJd() {
        return C22380heK.OLrzqt.copydefault(this.RlQdEF).fARcdN().valueOf();
    }

    public final boolean QwvEab() {
        C19738gNm value = RJOkX().getValue();
        if (value != null) {
            return value.AEQbTJ();
        }
        return true;
    }

    public final boolean QCjLjM() {
        C19738gNm value = RJOkX().getValue();
        if (value != null) {
            return value.EZpvd();
        }
        return true;
    }

    public final void AYXKKw(boolean z) {
        this.fetchVPNInfo.setValue(java.lang.Boolean.valueOf(z));
    }

    public final LimitMarketPrice.QuoteState dxcTrN() {
        LimitMarketPrice.QuoteState value = this.ffGIBT.getValue();
        return value == null ? LimitMarketPrice.QuoteState.Quoting : value;
    }

    public final java.lang.String hUfVAv() {
        DexAutoSlippageInfoParam slippageInfo;
        final LimitPairRateResponse limitPairRateResponseAYXKKw = this.giSNqX.AYXKKw();
        return C31256lqb.KWHzl(this.gasjUx.EZpvd((limitPairRateResponseAYXKKw == null || (slippageInfo = limitPairRateResponseAYXKKw.getSlippageInfo()) == null) ? null : slippageInfo.getReferenceSlippage()), (Function0<java.lang.String>) new Function0() { // from class: o.hgZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22495hgT.AEQbTJ(limitPairRateResponseAYXKKw);
            }
        });
    }

    public static final java.lang.String AEQbTJ(LimitPairRateResponse limitPairRateResponse) {
        DexAutoSlippageInfoParam slippageInfo;
        java.util.List<java.lang.String> shortcutFixSlippage;
        java.lang.String str = (limitPairRateResponse == null || (slippageInfo = limitPairRateResponse.getSlippageInfo()) == null || (shortcutFixSlippage = slippageInfo.getShortcutFixSlippage()) == null) ? null : (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(shortcutFixSlippage);
        return str == null ? "" : str;
    }

    public final java.lang.String gkJEwt() {
        int i = TaskDescription.EZpvd[this.gasjUx.EZpvd().ordinal()];
        if (i == 1) {
            return sSMYrx();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return hUfVAv();
    }

    public final java.lang.String sSMYrx() {
        DexAutoSlippageInfoParam slippageInfo;
        java.lang.String strKWHzl = this.gasjUx.KWHzl();
        if (strKWHzl != null && strKWHzl.length() != 0) {
            return strKWHzl;
        }
        LimitPairRateResponse limitPairRateResponseAYXKKw = this.giSNqX.AYXKKw();
        return (limitPairRateResponseAYXKKw == null || (slippageInfo = limitPairRateResponseAYXKKw.getSlippageInfo()) == null) ? "" : slippageInfo.getReferenceSlippage();
    }

    public final java.lang.String fARcdN() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = OcIXYQ();
        java.lang.String chainId = dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getChainId() : null;
        return chainId == null ? "" : chainId;
    }

    public final java.lang.String fIwbmz() {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        final FromToBalance balance;
        ConsumeData<TradeInputGroup> value = this.OuxcSI.getValue();
        return (value == null || (data = value.getData()) == null || (fromData = data.getFromData()) == null || (data2 = fromData.getData()) == null || (balance = data2.getBalance()) == null) ? "" : C31256lqb.KWHzl(balance.getAvailableAmountNum(), (Function0<java.lang.String>) new Function0() { // from class: o.hgX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22495hgT.copydefault(balance);
            }
        });
    }

    public static final java.lang.String copydefault(FromToBalance fromToBalance) {
        return fromToBalance.getData();
    }

    public final AbstractC22403heh KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull java.lang.String str6, @NotNull java.lang.String str7, @NotNull java.lang.String str8, @NotNull java.lang.String str9) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        java.lang.String str10 = this.RlQdEF;
        LimitPairRateResponse limitPairRateResponseAYXKKw = this.giSNqX.AYXKKw();
        if (limitPairRateResponseAYXKKw == null) {
            return null;
        }
        java.lang.String strGwTjWJ = gwTjWJ();
        java.lang.String strGkJEwt = gkJEwt();
        SlippageMode slippageModeEZpvd = this.gasjUx.EZpvd();
        ExpireTimeData value = this.OBJEWx.getValue();
        java.lang.String strOLrzqt = value != null ? value.OLrzqt() : null;
        java.lang.String str11 = strOLrzqt != null ? strOLrzqt : "";
        java.lang.String str12 = this.DCJXGO;
        java.lang.String str13 = this.hDKMBd;
        InterfaceC9738bbJ interfaceC9738bbJHBpjJd = hBpjJd();
        return C25289its.copydefault(new AbstractC22413her.Application(str, str10, limitPairRateResponseAYXKKw, strGwTjWJ, strGkJEwt, slippageModeEZpvd, str11, str2, str12, str13, interfaceC9738bbJHBpjJd != null ? interfaceC9738bbJHBpjJd.RJOkX() : false, str3, str4, str5, str6, str7, str8, str9));
    }

    public final boolean USBtdM() {
        return C23313hvq.KWHzl(this.AxsJAYsNCnLh.AEQbTJ(), java.lang.Long.valueOf(java.lang.System.currentTimeMillis())) && C33129mqd.OLrzqt((java.lang.CharSequence) this.AxsJAYsNCnLh.AEQbTJ());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hga.ActionBar.getExpireTimeList$default(o.hga, com.okinc.business.dexlogic.main.limmitorder.bean.BizMode, int, java.lang.Object):java.util.List */
    public final long EZpvd(java.lang.String str) {
        java.lang.Long timeMills;
        java.lang.Object obj = null;
        java.util.List expireTimeList$default = InterfaceC22502hga.ActionBar.getExpireTimeList$default(C22380heK.OLrzqt.copydefault(this.RlQdEF).AhwBna(), null, 1, null);
        java.util.Iterator it = expireTimeList$default.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((ExpireTimeConfig) next).getId())) {
                obj = next;
                break;
            }
        }
        ExpireTimeConfig expireTimeConfig = (ExpireTimeConfig) obj;
        if (expireTimeConfig == null) {
            expireTimeConfig = (ExpireTimeConfig) CollectionsKt___CollectionsKt.firstOrNull(expireTimeList$default);
        }
        if (expireTimeConfig == null || (timeMills = expireTimeConfig.getTimeMills()) == null) {
            return 0L;
        }
        return timeMills.longValue();
    }

    public final CreateOrderReq copydefault(@NotNull kotlin.Pair<? extends PriorityFeeType, java.lang.String> pair, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<java.lang.String> value = C22380heK.OLrzqt.copydefault(this.RlQdEF).djBIcL().gEmmrt().OLrzqt().getValue();
        int type = this.gasjUx.EZpvd().getType();
        int value2 = this.gasjUx.copydefault().getValue();
        java.lang.String strHUfVAv = this.gasjUx.EZpvd() == SlippageMode.Fixed ? hUfVAv() : "";
        java.lang.String strSSMYrx = sSMYrx();
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(java.lang.Integer.valueOf(pair.getFirst().getValue()));
        java.lang.String second = pair.getSecond();
        java.lang.String strAEQbTJ = this.AxsJAYsNCnLh.AEQbTJ();
        java.lang.String strOLrzqt = this.AxsJAYsNCnLh.OLrzqt();
        return new CreateOrderReq(java.lang.String.valueOf(type), java.lang.String.valueOf(value2), strHUfVAv, strSSMYrx, strGEmmrt, second, value, (strAEQbTJ == null || strAEQbTJ.length() == 0) ? C33129mqd.gEmmrt(java.lang.Long.valueOf(EZpvd(strOLrzqt != null ? strOLrzqt : ""))) : strAEQbTJ, C33129mqd.OLrzqt((java.lang.CharSequence) this.AxsJAYsNCnLh.AEQbTJ()), str);
    }

    public final gLQ OLrzqt(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.fJNWhG.AEQbTJ(str, z, true);
    }

    public final LiveData<java.lang.Boolean> gGvvIC() {
        return this.gasjUx.AEQbTJ();
    }

    public final void EZpvd(@NotNull SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        this.zuWLRA.refreshStatePool(new TradeStep(CheckStep.WALLET, true, swapState, true, false));
    }

    public final C22907hoH fvQaOB() {
        return (C22907hoH) this.QKudOq.getValue();
    }

    public static final C22907hoH ejfBZ(final C22495hgT c22495hgT) {
        return new C22907hoH(c22495hgT.dHguZz, new C22339hdW(new Function0() { // from class: o.hha
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22495hgT.EZpvd();
            }
        }, new Function0() { // from class: o.hhf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22495hgT.fJNWhG(this.OLrzqt);
            }
        }, new Function0() { // from class: o.hhe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22495hgT.iwGUEr(this.KWHzl);
            }
        }, new Function0() { // from class: o.hhd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C22495hgT.getNewProxyInstance(this.EZpvd);
            }
        }));
    }

    public static final java.lang.String EZpvd() {
        return ReferralSwapMode.SWAP_LIMIT.getMode();
    }

    public static final java.lang.String fJNWhG(C22495hgT c22495hgT) {
        return c22495hgT.fARcdN();
    }

    public static final java.lang.String iwGUEr(C22495hgT c22495hgT) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = c22495hgT.OcIXYQ();
        java.lang.String tokenSymbol = dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = c22495hgT.QKudOq();
        java.lang.String tokenSymbol2 = dexMultiTokenInfoBeanQKudOq != null ? dexMultiTokenInfoBeanQKudOq.getTokenSymbol() : null;
        return tokenSymbol + "-" + (tokenSymbol2 != null ? tokenSymbol2 : "");
    }

    public static final ServiceFeeInfo getNewProxyInstance(C22495hgT c22495hgT) {
        return c22495hgT.iZzfmt();
    }

    public final void copydefault(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        fvQaOB().OLrzqt(function2);
    }

    public static final boolean AuCTel(C22495hgT c22495hgT) {
        ServiceFeeInfo serviceFeeInfoIZzfmt = c22495hgT.iZzfmt();
        if (serviceFeeInfoIZzfmt != null) {
            return serviceFeeInfoIZzfmt.isCharge();
        }
        return true;
    }

    public final boolean QVsKAR() {
        return fvQaOB().OLrzqt(new Function0() { // from class: o.hgW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C22495hgT.AuCTel(this.EZpvd));
            }
        });
    }

    public final ServiceFeeInfo iZzfmt() {
        LimitPairRateResponse limitPairRateResponseAYXKKw = this.giSNqX.AYXKKw();
        if (limitPairRateResponseAYXKKw != null) {
            return limitPairRateResponseAYXKKw.getServiceFeeInfo();
        }
        return null;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hoH.showReferralCodeApplyPanel$default(o.hoH, android.content.Context, java.util.Map, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C22907hoH.showReferralCodeApplyPanel$default(fvQaOB(), context, null, null, 6, null);
    }

    public final java.util.Map<java.lang.String, java.lang.String> flVtFt() {
        return C22907hoH.getReferralParamMap$default(fvQaOB(), null, 1, null);
    }

    public final void AEQbTJ(@NotNull final java.lang.String str, @NotNull java.lang.String str2, boolean z) {
        java.lang.Object next;
        DexMultiTokenInfoBean toDexMultiTokenInfoVO;
        DexDefaultFromToTokenShowVO dexDefaultFromToTokenShowVO;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        final java.lang.String strEZpvd = C23311hvo.EZpvd(str, str2, z);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = AEQbTJ(true);
        if (Intrinsics.EZpvd((java.lang.Object) (dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getUniqueId() : null), (java.lang.Object) strEZpvd)) {
            return;
        }
        java.util.Iterator<T> it = this.djSkpj.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        DefiChainInfo defiChainInfo = (DefiChainInfo) next;
        if (defiChainInfo == null || (dexDefaultFromToTokenShowVO = defiChainInfo.getDexDefaultFromToTokenShowVO()) == null) {
            toDexMultiTokenInfoVO = null;
        } else {
            DexMultiTokenInfoBean toDexMultiTokenInfoVO2 = dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO();
            if (Intrinsics.EZpvd((java.lang.Object) (toDexMultiTokenInfoVO2 != null ? toDexMultiTokenInfoVO2.getUniqueId() : null), (java.lang.Object) strEZpvd)) {
                toDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO.getFromDexMultiTokenInfoVO();
            } else {
                toDexMultiTokenInfoVO = dexDefaultFromToTokenShowVO.getToDexMultiTokenInfoVO();
            }
        }
        AbstractC58185ywX<LimitSuggestCoinBean> abstractC58185ywXKWHzl = C22380heK.OLrzqt.copydefault(this.RlQdEF).AhwBna().KWHzl(str, str2, toDexMultiTokenInfoVO != null ? toDexMultiTokenInfoVO.getTokenContractAddress() : null);
        final Function1 function1 = new Function1() { // from class: o.hhm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22495hgT.OLrzqt(str, this, strEZpvd, (LimitSuggestCoinBean) obj);
            }
        };
        InterfaceC58227yxM<? super LimitSuggestCoinBean> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hhs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22495hgT.fetchVPNInfo(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.hht
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C22495hgT.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hhA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C22495hgT.values(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, this.AxsJAY);
    }

    public static final void fetchVPNInfo(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.String str, C22495hgT c22495hgT, java.lang.String str2, LimitSuggestCoinBean limitSuggestCoinBean) {
        DexMultiTokenInfoBean fromToken = limitSuggestCoinBean.getFromToken();
        if (!Intrinsics.EZpvd((java.lang.Object) (fromToken != null ? fromToken.getChainId() : null), (java.lang.Object) str)) {
            c22495hgT.DXXBbs.setValue(C33070mpX.AYXKKw(C23274hvD.Fragment.QSAYLr));
            return Unit.INSTANCE;
        }
        if (!Intrinsics.EZpvd((java.lang.Object) limitSuggestCoinBean.getFromToken().getUniqueId(), (java.lang.Object) str2)) {
            c22495hgT.DXXBbs.setValue(C33070mpX.AYXKKw(C23274hvD.Fragment.isElapsedRealtimeNanosAvailable));
            return Unit.INSTANCE;
        }
        c22495hgT.AEQbTJ.setValue(limitSuggestCoinBean.getFromToken());
        return Unit.INSTANCE;
    }

    public static final void values(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C22495hgT c22495hgT, java.lang.Throwable th) {
        c22495hgT.DXXBbs.setValue(th.getMessage());
        return Unit.INSTANCE;
    }

    public final boolean AYXKKw() {
        LimitCalResult second;
        kotlin.Pair<java.lang.Boolean, LimitCalResult> value = this.iwGUEr.getValue();
        if (value != null && (second = value.getSecond()) != null) {
            boolean z = !Intrinsics.EZpvd((java.lang.Object) second.getFromAmount(), (java.lang.Object) DTwDnp());
            boolean z2 = !Intrinsics.EZpvd((java.lang.Object) second.getToAmount(), (java.lang.Object) accept());
            boolean z3 = !Intrinsics.EZpvd((java.lang.Object) second.getExchangeRate(), (java.lang.Object) wlaJM());
            pUU.KWHzl("LimitOrderContentViewModel", "isFromAmountError =" + z + "  isToAmountError=" + z2 + "  isRateError=" + z3);
            if (z || z2 || z3) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        Job job = this.gkJEwt;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.gkJEwt = null;
        this.AxsJAY.dispose();
    }

    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new LimitOrderContentViewModel$fetchSwapConfig$1(this, str, null), 3, null);
    }

    public final Result<DexPresetResultVO> OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return this.accept.copydefault(str);
    }

    public final void copydefault(TradeReminderType tradeReminderType) {
        if (tradeReminderType != null && TaskDescription.AEQbTJ[tradeReminderType.ordinal()] == 1) {
            this.zuWLRA.refreshStatePool(new TradeStep(CheckStep.QUOTE_LIMIT, true, SwapState.SWAP_AMOUNT_LOW, true, false));
        }
    }

    public final void KWHzl(@NotNull LimitParam limitParam) {
        Intrinsics.checkNotNullParameter(limitParam, "");
        this.wlaJM = limitParam;
        java.util.List<DefiChainInfo> list = this.gHZMYf;
        DefiChainInfo defiChainInfo = null;
        java.lang.Object obj = null;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) next).getChainId(), (java.lang.Object) limitParam.getFromChainId())) {
                    obj = next;
                    break;
                }
            }
            defiChainInfo = (DefiChainInfo) obj;
        }
        this.AubY = defiChainInfo;
        if (this.OuxcSI.getValue() != null) {
            ixgjPv();
        }
    }

    public final boolean dmfpNf() {
        java.util.List<DefiChainInfo> list = this.gHZMYf;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd((java.lang.Object) ((DefiChainInfo) it.next()).getChainId(), (java.lang.Object) fARcdN())) {
                    return true;
                }
            }
        }
        return false;
    }
}

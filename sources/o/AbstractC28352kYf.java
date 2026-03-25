package o;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import com.okinc.business.dex.tee.domain.model.PlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.Preset;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.trade.core.domain.model.CommonDexInfo;
import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.NetworkFeeInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteAndCalldataRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteRequest;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.widget.jwt.OrderRetryHelper;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MemeModeCommonDexInfo;
import com.okinc.business.dexlogic.bean.MemeModeQuoteBean;
import com.okinc.business.dexlogic.bean.MemeModeQuoteErrorBean;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.dexlogic.bean.track.ReferralSwapMode;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexui.main.swap.trade.single.defiplatform.data.V6QuoteRequestWrapper;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6ApproveExecutionUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6DeFiPlatformUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6FeeCalculationUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6OrderSubmitUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.MemeV6QuoteExecutionUseCase;
import com.okinc.business.trade.features.home.meme.usecase.transaction.v6.MemeV6TradeStateUseCase;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$addApproveStateListener$1;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$approve$1;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$getApproveState$1;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$getMemeQuote$1;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$handleSubmitSuccess$1;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$notifyEoaOrderBroadcastSuccessIfOkxDex$1;
import com.okinc.business.trade.features.home.meme.viewmodel.v6.MemeMarketStrategyV6ViewModel$submitOrder$1;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageRange;
import com.okinc.business.trade.features.home.ui.meme.preset.MemeSelectionActivityResultContract;
import com.okinc.business.trade.features.home.ui.meme.statepool.CheckStep;
import com.okinc.business.trade.features.home.ui.meme.statepool.SwapState;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStatePool;
import com.okinc.business.trade.features.home.ui.meme.statepool.TradeStep;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import o.AbstractC30510lcX;
import o.C23274hvD;
import o.InterfaceC9740bbL;
import o.gYS;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kYf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28352kYf extends AbstractC28336kXq {
    public static final Activity Companion = new Activity(null);
    public static final int aKErDB = 8;
    public final MutableLiveData<MemeModeQuoteErrorBean> AxsJAYaxsJAY;
    public final InterfaceC56387yDm AxsJAYsNCnLh;
    public final InterfaceC56387yDm DAIeex;
    public Observer<TradeStep> DCJXGO;
    public final StateFlow<java.lang.String> DarRvM;
    public final MutableSharedFlow<Unit> RcXXUw;
    public boolean RlQdEF;
    public final MutableSharedFlow<Unit> UeEOUB;
    public Job accept;
    public MutableLiveData<java.lang.Boolean> dNCPSb;
    public final MutableLiveData<java.lang.Boolean> djSkpj;
    public java.lang.String dvKsVJ;
    public final SharedFlow<Unit> dxcTrN;
    public java.lang.String fFgQHt;
    public MutableStateFlow<java.lang.String> fZBcTu;
    public Job finit;
    public gYS flVtFt;
    public Job fvQaOB;
    public final LiveData<java.lang.Boolean> gasjUx;
    public final SharedFlow<Unit> giSNqX;
    public kWH gkJEwt;
    public final MutableLiveData<java.lang.Boolean> iRxXKY = new MutableLiveData<>();
    public final OrderRetryHelper QKudOq = new OrderRetryHelper("MemeMarketStrategyV6ViewModel");
    public AbstractC30510lcX gGvvIC = AbstractC30510lcX.TaskDescription.EZpvd;
    public final MutableLiveData<V6QuoteResponseData> ODWQjV = new MutableLiveData<>();
    public final MutableLiveData<java.lang.Boolean> iZzfmt = new MutableLiveData<>();
    public final MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> hUfVAv = new MutableLiveData<>();

    /* JADX INFO: renamed from: o.kYf$TaskDescription */
    public final /* synthetic */ class TaskDescription {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MemeV6QuoteExecutionUseCase.QuoteSwapState.values().length];
            try {
                iArr[MemeV6QuoteExecutionUseCase.QuoteSwapState.FETCHING_SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MemeV6QuoteExecutionUseCase.QuoteSwapState.FETCHING_ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MemeV6QuoteExecutionUseCase.QuoteSwapState.BLACK_ADDRESS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MemeV6QuoteExecutionUseCase.QuoteSwapState.NEW_ADDRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MemeV6QuoteExecutionUseCase.QuoteSwapState.STAND_BY_DISH.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[MemeV6QuoteExecutionUseCase.QuoteSwapState.STAND_BY_DISH_WARNING.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[MemeV6QuoteExecutionUseCase.QuoteSwapState.SWAP_UNSUPPORTED_FOR_DAPP.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[TransactionType.values().length];
            try {
                iArr2[TransactionType.Buy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr2[TransactionType.Sell.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            OLrzqt = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AhwBna(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.fFgQHt = str;
        this.dvKsVJ = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void DCUTEIddSDPG() {
        this.fFgQHt = "";
        this.dvKsVJ = "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<MemeModeQuoteErrorBean> OBJEWx() {
        return this.AxsJAYaxsJAY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> ODWQjV() {
        return this.dxcTrN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final gYS OHqIaq() {
        return this.flVtFt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StateFlow<java.lang.String> OJuSTm() {
        return this.DarRvM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull AbstractC30510lcX abstractC30510lcX) {
        Intrinsics.checkNotNullParameter(abstractC30510lcX, "");
        this.gGvvIC = abstractC30510lcX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LiveData<java.lang.Boolean> OqFWZa() {
        return this.djSkpj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<kotlin.Pair<java.lang.String, java.lang.String>> QkdxfA() {
        return this.hUfVAv;
    }

    public abstract C28163kRf RJOkX();

    public abstract C19756gOd RcXXUw();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> RdAHlO() {
        return this.iRxXKY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<V6QuoteResponseData> USBtdM() {
        return this.ODWQjV;
    }

    public abstract C28300kWh UeEOUB();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> dHguZz() {
        return this.iZzfmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiveData<java.lang.Boolean> dNCPSb() {
        return this.gasjUx;
    }

    public abstract kTW djSkpj();

    public abstract MemeV6ApproveExecutionUseCase dvKsVJ();

    public abstract MemeV6FeeCalculationUseCase dxcTrN();

    public abstract MemeV6DeFiPlatformUseCase fFgQHt();

    public abstract MemeV6QuoteExecutionUseCase fZBcTu();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutableLiveData<java.lang.Boolean> fdOvFl() {
        return this.dNCPSb;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SharedFlow<Unit> ffGIBT() {
        return this.giSNqX;
    }

    public abstract MemeV6OrderSubmitUseCase finit();

    public abstract kWE flVtFt();

    public abstract C19700gMb fvQaOB();

    public abstract MemeV6TradeStateUseCase gGvvIC();

    public void gasjUx() {
    }

    public abstract C23212htv giSNqX();

    public void hUfVAv() {
    }

    public AbstractC28352kYf() {
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.UeEOUB = mutableSharedFlowMutableSharedFlow$default;
        this.dxcTrN = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableSharedFlow<Unit> mutableSharedFlowMutableSharedFlow$default2 = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.RcXXUw = mutableSharedFlowMutableSharedFlow$default2;
        this.giSNqX = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default2);
        this.AxsJAYaxsJAY = new MutableLiveData<>();
        this.gkJEwt = new kWH();
        this.djSkpj = new MutableLiveData<>();
        this.AxsJAYsNCnLh = C56392yDr.copydefault(new Function0() { // from class: o.kYh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC28352kYf.AxsJAYaxsJAY();
            }
        });
        this.dNCPSb = new MutableLiveData<>();
        this.fFgQHt = "";
        this.dvKsVJ = "";
        MutableStateFlow<java.lang.String> MutableStateFlow = StateFlowKt.MutableStateFlow("");
        this.fZBcTu = MutableStateFlow;
        this.DarRvM = FlowKt.asStateFlow(MutableStateFlow);
        this.DAIeex = C56392yDr.copydefault(new Function0() { // from class: o.kYk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC28352kYf.fARcdN(this.KWHzl);
            }
        });
    }

    public final C28300kWh hBpjJd() {
        return (C28300kWh) this.AxsJAYsNCnLh.getValue();
    }

    public static final C28300kWh AxsJAYaxsJAY() {
        return new C28300kWh();
    }

    @Override // o.AbstractC28336kXq
    public java.lang.String gHZMYf() {
        return MemeTransactionSceneType.Market.getValue();
    }

    public final void WS() {
        DCUTEIddSDPG();
        gwTjWJ();
    }

    private final PreCheckBean isConnected(java.lang.String str) {
        return RcXXUw().copydefault(str);
    }

    public final boolean AhwBna(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        PreCheckBean preCheckBeanIsConnected = isConnected(str);
        if (preCheckBeanIsConnected == null) {
            return true;
        }
        return preCheckBeanIsConnected.isSupportQuote();
    }

    public final boolean values(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        PreCheckBean preCheckBeanIsConnected = isConnected(str);
        if (preCheckBeanIsConnected == null) {
            return false;
        }
        return preCheckBeanIsConnected.isLimitRegion();
    }

    public final java.lang.String QCjLjM() {
        java.lang.String str = this.fFgQHt;
        return str.length() == 0 ? "11" : str;
    }

    public final DefiPlatformInfo OxVOHk() {
        V6QuoteResponseData value = this.ODWQjV.getValue();
        if (value != null) {
            return value.getSelectedDeFiPlatform();
        }
        return null;
    }

    public final java.lang.String QVsKAR() {
        java.util.List<DefiPlatformInfo> defiPlatformInfoList;
        DefiPlatformInfo defiPlatformInfo;
        java.lang.String str = this.dvKsVJ;
        if (str.length() != 0) {
            return str;
        }
        V6QuoteResponseData value = this.ODWQjV.getValue();
        java.lang.String name = (value == null || (defiPlatformInfoList = value.getDefiPlatformInfoList()) == null || (defiPlatformInfo = (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList)) == null) ? null : defiPlatformInfo.getName();
        return name == null ? "" : name;
    }

    public final java.lang.String AEQbTJ(V6BaseQuoteResponse v6BaseQuoteResponse) {
        MemeV6DeFiPlatformUseCase.PlatformSelectionResult platformSelectionResultKWHzl = fFgQHt().KWHzl(v6BaseQuoteResponse, this.fFgQHt, this.dvKsVJ);
        this.fFgQHt = platformSelectionResultKWHzl.getSelectedPlatformId();
        this.dvKsVJ = platformSelectionResultKWHzl.getSelectedPlatformName();
        if (platformSelectionResultKWHzl.getShouldShowPlatformNotAvailable()) {
            this.fZBcTu.setValue(platformSelectionResultKWHzl.getUnavailablePlatformName());
        }
        return platformSelectionResultKWHzl.getSelectedPlatformId();
    }

    public final void ixgjPv() {
        this.fZBcTu.setValue("");
    }

    public final MutableLiveData<java.util.List<java.lang.String>> RKDWNf() {
        return RJOkX().copydefault(QOLQEE());
    }

    public final void KWHzl(@NotNull V6QuoteResponseData v6QuoteResponseData) {
        Intrinsics.checkNotNullParameter(v6QuoteResponseData, "");
        this.ODWQjV.setValue(v6QuoteResponseData);
        AuCTel().resetApproval();
        copydefault(AuCTel());
    }

    public final void iZzfmt() {
        Observer<TradeStep> observer = this.DCJXGO;
        if (observer != null) {
            AuCTel().getCurrentStep().removeObserver(observer);
        }
        if (this.DCJXGO == null) {
            this.DCJXGO = new Observer() { // from class: o.kYq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(java.lang.Object obj) {
                    AbstractC28352kYf.EZpvd(this.KWHzl, (TradeStep) obj);
                }
            };
        }
        Observer<TradeStep> observer2 = this.DCJXGO;
        if (observer2 != null) {
            AuCTel().getCurrentStep().observeForever(observer2);
        }
    }

    public static final void EZpvd(AbstractC28352kYf abstractC28352kYf, TradeStep tradeStep) {
        Intrinsics.checkNotNullParameter(tradeStep, "");
        abstractC28352kYf.OLrzqt(tradeStep);
    }

    public final void run() {
        Observer<TradeStep> observer = this.DCJXGO;
        if (observer != null) {
            AuCTel().getCurrentStep().removeObserver(observer);
        }
    }

    public final void OLrzqt(TradeStep tradeStep) {
        gGvvIC().KWHzl(tradeStep.getStep(), new MemeV6TradeStateUseCase.StateCheckParams(QOLQEE(), QKVWgx().getChainId(), fIwbmz(), zsXlph(), DCUTEI(), DTwDnp(), AhwBna(QKVWgx().getChainId()), this.ODWQjV.getValue(), QCjLjM(), AEQbTJ()), AuCTel(), DCJXGO());
    }

    /* JADX INFO: renamed from: o.kYf$ActionBar */
    public static final class ActionBar implements InterfaceC28330kXk {
        public ActionBar() {
        }

        @Override // o.InterfaceC28330kXk
        public void KWHzl() {
            AbstractC28352kYf.this.DCUTEIddSDPG();
        }

        @Override // o.InterfaceC28330kXk
        public void EZpvd() {
            AbstractC28352kYf.this.gwTjWJ();
        }

        @Override // o.InterfaceC28330kXk
        public void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, TradeStatePool tradeStatePool, java.lang.String str6) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            Intrinsics.checkNotNullParameter(str5, "");
            Intrinsics.checkNotNullParameter(tradeStatePool, "");
            Intrinsics.checkNotNullParameter(str6, "");
            AbstractC28352kYf.this.EZpvd(str, str2, str3, str4, str5, tradeStatePool, str6);
        }
    }

    public final InterfaceC28330kXk DCJXGO() {
        return new ActionBar();
    }

    public final MemeChainType QSBOWP() {
        return MemeChainType.Companion.EZpvd(isConnected());
    }

    public final boolean DCUTEIdCUTEI() {
        InterfaceC9738bbJ interfaceC9738bbJValueOf = QVAiDq().valueOf();
        if (interfaceC9738bbJValueOf == null) {
            return false;
        }
        if (interfaceC9738bbJValueOf.getFieldNames()) {
            return true;
        }
        return !C22380heK.OLrzqt.copydefault(QOLQEE()).fARcdN().OLrzqt(interfaceC9738bbJValueOf, QKVWgx().getChainId(), true);
    }

    public final void gwTjWJ() {
        Continuation continuation;
        java.lang.String chainId = QKVWgx().getChainId();
        if (!AhwBna(chainId)) {
            QbewEr();
            AuCTel().initCheckStep();
            return;
        }
        DexPresetResultVO dexPresetResultVOAEQbTJ = uzCIH().AEQbTJ(chainId);
        java.lang.Boolean boolValueOf = dexPresetResultVOAEQbTJ != null ? java.lang.Boolean.valueOf(dexPresetResultVOAEQbTJ.getSupportCustomGasFee()) : null;
        java.lang.Integer numAwvSrB = AwvSrB();
        java.lang.String strZuBGHE = (numAwvSrB != null && numAwvSrB.intValue() == SlippageMode.Dynamic.getType()) ? "" : zuBGHE();
        MemeV6QuoteExecutionUseCase.QuoteParams quoteParams = new MemeV6QuoteExecutionUseCase.QuoteParams(chainId, QOLQEE(), QKVWgx(), DTwDnp(), QUSxYX(), zsXlph(), QCjLjM(), DLWbHP(), strZuBGHE, AYXKKw(), AwvSrB(), AubY(), OFhtUX(), OuxcSI(), AhwBna(chainId), boolValueOf != null ? boolValueOf.booleanValue() : false, this.RlQdEF, new Function1() { // from class: o.kYs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AbstractC28352kYf.AEQbTJ(this.KWHzl, (V6BaseQuoteResponse) obj);
            }
        }, null);
        Job job = this.accept;
        if (job != null) {
            continuation = null;
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        } else {
            continuation = null;
        }
        if (C23313hvq.valueOf(zsXlph(), 0)) {
            return;
        }
        this.iRxXKY.setValue(java.lang.Boolean.TRUE);
        this.accept = BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeMarketStrategyV6ViewModel$getMemeQuote$1(this, quoteParams, continuation), 3, null);
    }

    public static final java.lang.String AEQbTJ(AbstractC28352kYf abstractC28352kYf, V6BaseQuoteResponse v6BaseQuoteResponse) {
        return abstractC28352kYf.AEQbTJ(v6BaseQuoteResponse);
    }

    public final void OLrzqt(V6QuoteResponseData v6QuoteResponseData, gYS gys) {
        this.flVtFt = gys;
        this.AxsJAYaxsJAY.setValue(MemeModeQuoteErrorBean.Companion.copydefault());
        if (v6QuoteResponseData.isHoneypotErrorCode()) {
            EZpvd(SwapState.STAND_BY_DISH_WARNING, true);
        }
        this.ODWQjV.setValue(v6QuoteResponseData);
        AuCTel().resetApproval();
        copydefault(AuCTel());
    }

    public final void EZpvd(MemeModeQuoteErrorBean memeModeQuoteErrorBean, MemeV6QuoteExecutionUseCase.QuoteSwapState quoteSwapState) {
        SwapState swapState;
        this.AxsJAYaxsJAY.setValue(memeModeQuoteErrorBean);
        switch (TaskDescription.AEQbTJ[quoteSwapState.ordinal()]) {
            case 1:
                swapState = SwapState.FETCHING_SUCCESS;
                break;
            case 2:
                swapState = SwapState.FETCHING_ERROR;
                break;
            case 3:
                swapState = SwapState.BLACK_ADDRESS;
                break;
            case 4:
                swapState = SwapState.NEW_ADDRESS;
                break;
            case 5:
                swapState = SwapState.STAND_BY_DISH;
                break;
            case 6:
                swapState = SwapState.STAND_BY_DISH_WARNING;
                break;
            case 7:
                swapState = SwapState.SWAP_UNSUPPORTED_FOR_DAPP;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        EZpvd(swapState, false);
    }

    public final void EZpvd(SwapState swapState, boolean z) {
        AuCTel().refreshStatePool(new TradeStep(CheckStep.QUOTES, true, swapState, true, z));
    }

    public final void fjfviF() {
        gEmmrt(fJNWhG().AEQbTJ(QKVWgx().getChainId(), QVAiDq().copydefault(QKVWgx().getChainId())));
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> OuxcSI() {
        java.lang.String tokenContractAddress;
        int i = TaskDescription.OLrzqt[DTwDnp().ordinal()];
        if (i == 1) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault(QKVWgx().getChainId(), QKVWgx().getTokenContractAddress());
            tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            return C56390yDp.OLrzqt(tokenContractAddress != null ? tokenContractAddress : "", QKVWgx().getTokenContractAddress());
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        java.lang.String tokenContractAddress2 = QKVWgx().getTokenContractAddress();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = copydefault(QKVWgx().getChainId(), QKVWgx().getTokenContractAddress());
        tokenContractAddress = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getTokenContractAddress() : null;
        return C56390yDp.OLrzqt(tokenContractAddress2, tokenContractAddress != null ? tokenContractAddress : "");
    }

    public static /* synthetic */ void updatePriorityValue$default(AbstractC28352kYf abstractC28352kYf, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePriorityValue");
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        abstractC28352kYf.AEQbTJ(i, str);
    }

    public final void AEQbTJ(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AYXKKw(KWHzl(i, str));
    }

    public static /* synthetic */ java.lang.String getPriorityFee$default(AbstractC28352kYf abstractC28352kYf, int i, java.lang.String str, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPriorityFee");
        }
        if ((i2 & 2) != 0) {
            str = "";
        }
        return abstractC28352kYf.KWHzl(i, str);
    }

    public final java.lang.String KWHzl(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return dxcTrN().AEQbTJ(AxsJAYsNCnLh(), QHmsKR(), i, str);
    }

    public final boolean zuWLRA() {
        return UeEOUB().KWHzl(isConnected(), wlaJM(), QHmsKR().KWHzl());
    }

    public final java.lang.String OLrzqt(int i, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return dxcTrN().copydefault(AxsJAYsNCnLh(), QHmsKR(), i, str);
    }

    public final MemeV6OrderSubmitUseCase.OrderSubmitParams RlQdEF() {
        V6QuoteResponseData value = this.ODWQjV.getValue();
        if (value == null) {
            return null;
        }
        java.lang.String strQCjLjM = QCjLjM();
        DefiPlatformInfo selectedDeFiPlatform = value.getSelectedDeFiPlatform();
        MemeChainType memeChainTypeQSBOWP = QSBOWP();
        NetworkFeeInfo networkFeeInfo = value.getNetworkFeeInfo();
        return new MemeV6OrderSubmitUseCase.OrderSubmitParams(value, selectedDeFiPlatform, strQCjLjM, Dmq(), DLWbHP(), zuBGHE(), AYXKKw(), AwvSrB(), AubY(), OFhtUX(), memeChainTypeQSBOWP, networkFeeInfo, KWHzl(AubY(), zLjUOn()), AEQbTJ(memeChainTypeQSBOWP, networkFeeInfo));
    }

    public final MemeV6FeeCalculationUseCase.FeeCalculationParams AxsJAYsNCnLh() {
        java.lang.String chainId = QKVWgx().getChainId();
        return new MemeV6FeeCalculationUseCase.FeeCalculationParams(chainId, Dmq(), OFhtUX(), OLrzqt(chainId));
    }

    public final java.lang.String OFhtUX() {
        return htlTjW() ? gEmmrt() : zLjUOn();
    }

    public final void accept() {
        if (C23313hvq.copydefault(OFhtUX(), 0) && htlTjW()) {
            C55326xho.toast$default(C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.HJWChPfvRMlC), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
    }

    public final boolean htlTjW() {
        return AubY() == PriorityFeeType.PriorityCustom.getValue();
    }

    @Override // o.AbstractC33073mpa, androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        QbewEr();
        run();
        Job job = this.finit;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        Job job2 = this.fvQaOB;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (java.lang.Object) null);
        }
    }

    public final java.lang.String AEQbTJ(MemeChainType memeChainType, NetworkFeeInfo networkFeeInfo) {
        return dxcTrN().KWHzl(AxsJAYsNCnLh(), memeChainType, networkFeeInfo);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull AbstractC32996moC abstractC32996moC, @NotNull SwapState swapState, @NotNull java.lang.String str5, @NotNull TradeStatePool tradeStatePool, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(abstractC32996moC, "");
        Intrinsics.checkNotNullParameter(swapState, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        Intrinsics.checkNotNullParameter(str6, "");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getMain(), null, new MemeMarketStrategyV6ViewModel$approve$1(this, new MemeV6ApproveExecutionUseCase.ApproveExecutionParams(str, str2, str3, str4, abstractC32996moC, swapState, str5, tradeStatePool, str6, this.gGvvIC instanceof AbstractC30510lcX.StateListAnimator), null), 2, null);
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, @NotNull TradeStatePool tradeStatePool, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(tradeStatePool, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Job job = this.finit;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.finit = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeMarketStrategyV6ViewModel$getApproveState$1(this, new MemeV6ApproveExecutionUseCase.ApproveStateCheckParams(str, str2, str3, str4, str5, tradeStatePool, str6, this.gGvvIC instanceof AbstractC30510lcX.StateListAnimator), tradeStatePool, null), 3, null);
    }

    public static /* synthetic */ void refreshQuote$default(AbstractC28352kYf abstractC28352kYf, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshQuote");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        abstractC28352kYf.copydefault(z);
    }

    public final void copydefault(boolean z) {
        QbewEr();
        java.lang.String chainId = QKVWgx().getChainId();
        if (z) {
            AuCTel().getCurrentState().setValue(SwapState.NONE);
            AuCTel().initRefreshCheckStep();
        } else if (!AhwBna(chainId)) {
            AuCTel().refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.PRE_CHECK_FAIL, true, false));
        } else if (C23313hvq.copydefault(zsXlph(), 0)) {
            AuCTel().refreshStatePool(new TradeStep(CheckStep.INPUT, true, SwapState.ZERO_FORM_AMOUNT, true, false));
        } else {
            gwTjWJ();
        }
    }

    public final void copydefault(TradeStatePool tradeStatePool) {
        AuCTel().refreshStatePool(new TradeStep(CheckStep.QUOTES, true, SwapState.FETCHING_SUCCESS, false, true));
        tradeStatePool.setQuotePriceSuccess(true);
    }

    public final kotlin.Pair<InterfaceC28268kVc, InterfaceC28268kVc> DCUTEI() {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault(QKVWgx().getChainId(), QKVWgx().getTokenContractAddress());
        if (dexMultiTokenInfoBeanCopydefault == null) {
            return null;
        }
        int i = TaskDescription.OLrzqt[DTwDnp().ordinal()];
        if (i == 1) {
            return C56390yDp.OLrzqt(new C28267kVb(dexMultiTokenInfoBeanCopydefault), new C28269kVd(QKVWgx()));
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C56390yDp.OLrzqt(new C28269kVd(QKVWgx()), new C28267kVb(dexMultiTokenInfoBeanCopydefault));
    }

    public final boolean fERRXa() {
        kotlin.Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI = DCUTEI();
        if (pairDCUTEI == null) {
            return false;
        }
        return pairDCUTEI.getFirst().KWHzl() || pairDCUTEI.getFirst().EZpvd() || pairDCUTEI.getSecond().EZpvd() || pairDCUTEI.getSecond().KWHzl();
    }

    public final boolean OLrzqt(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return fERRXa() || values(str) || z;
    }

    public final boolean igXuih() {
        return QVAiDq().AYXKKw();
    }

    public final InterfaceC9738bbJ dUDNAs() {
        return QVAiDq().valueOf();
    }

    public final java.lang.String AkhnZx(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return QVAiDq().copydefault(str);
    }

    public final boolean Dmq() {
        return hBpjJd().KWHzl(isConnected(), wlaJM(), QHmsKR().KWHzl());
    }

    public static /* synthetic */ void submitOrder$default(AbstractC28352kYf abstractC28352kYf, FragmentActivity fragmentActivity, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitOrder");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        abstractC28352kYf.AEQbTJ(fragmentActivity, str, z);
    }

    public final void AEQbTJ(@NotNull FragmentActivity fragmentActivity, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        MemeV6OrderSubmitUseCase.OrderSubmitParams orderSubmitParamsRlQdEF = RlQdEF();
        if (orderSubmitParamsRlQdEF == null) {
            return;
        }
        boolean zKWHzl = djSkpj().KWHzl(z, orderSubmitParamsRlQdEF.getQuoteResponse().isOKXPlatform(), orderSubmitParamsRlQdEF.getQuoteResponse().isAutoConfirmQuotaRemaining());
        this.iZzfmt.setValue(java.lang.Boolean.TRUE);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeMarketStrategyV6ViewModel$submitOrder$1(z, this, orderSubmitParamsRlQdEF, str, fragmentActivity, zKWHzl, null), 3, null);
    }

    /* JADX INFO: renamed from: o.kYf$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC9740bbL.TaskDescription {
        public StateListAnimator() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            AbstractC28352kYf.this.dHguZz().postValue(java.lang.Boolean.TRUE);
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
            AbstractC28352kYf.this.dHguZz().postValue(java.lang.Boolean.FALSE);
        }
    }

    public final InterfaceC9740bbL.TaskDescription DXXBbs() {
        return new StateListAnimator();
    }

    public final void OLrzqt(boolean z) {
        this.hUfVAv.setValue(C56390yDp.OLrzqt("0", ""));
        this.iZzfmt.setValue(java.lang.Boolean.FALSE);
        if (z) {
            C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeMarketStrategyV6ViewModel$handleSubmitSuccess$1(this, null), 3, null);
        }
    }

    public final void DGOPHZ() {
        C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeMarketStrategyV6ViewModel$notifyEoaOrderBroadcastSuccessIfOkxDex$1(this, null), 3, null);
    }

    public final void EZpvd(java.lang.String str, java.lang.String str2) {
        this.iZzfmt.setValue(java.lang.Boolean.FALSE);
        this.hUfVAv.setValue(C56390yDp.OLrzqt(str, str2));
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.tee.domain.model.PlaceOrderParams.copy$default(com.okinc.business.dex.tee.domain.model.PlaceOrderParams, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.dex.tee.domain.model.Preset, com.okinc.business.dexlogic.main.swap.trade.referral.data.ReferralParam, int, java.lang.Object):com.okinc.business.dex.tee.domain.model.PlaceOrderParams */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PlaceOrderParams dmfpNf() {
        java.lang.String dynamicMaxSlippageValue;
        DefiPlatformInfo selectedDeFiPlatform;
        AutoSlippageInfo autoSlippageInfo;
        MemeV6OrderSubmitUseCase.OrderSubmitParams orderSubmitParamsRlQdEF = RlQdEF();
        if (orderSubmitParamsRlQdEF == null) {
            return new PlaceOrderParams((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (Preset) null, new ReferralParam((java.lang.String) null, (java.lang.String) null, 3, (DefaultConstructorMarker) null), 2047, (DefaultConstructorMarker) null);
        }
        PlaceOrderParams placeOrderParamsAEQbTJ = finit().AEQbTJ(orderSubmitParamsRlQdEF);
        InterfaceC28303kWk interfaceC28303kWkAxsJAY = AxsJAY();
        java.lang.String chainId = QKVWgx().getChainId();
        java.lang.String fieldNames = getFieldNames();
        TransactionType transactionType = TransactionType.Sell;
        SlippageConfigPreset slippageConfigPresetEZpvd = interfaceC28303kWkAxsJAY.EZpvd(chainId, fieldNames, transactionType.getType());
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(slippageConfigPresetEZpvd != null ? java.lang.Integer.valueOf(slippageConfigPresetEZpvd.getSlippageType()) : null);
        if (C33129mqd.AhwBna(slippageConfigPresetEZpvd != null ? java.lang.Integer.valueOf(slippageConfigPresetEZpvd.getSlippageType()) : null) == SlippageMode.Dynamic.getType()) {
            java.lang.String dynamicMaxSlippageValue2 = slippageConfigPresetEZpvd != null ? slippageConfigPresetEZpvd.getDynamicMaxSlippageValue() : null;
            if (dynamicMaxSlippageValue2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) dynamicMaxSlippageValue2)) {
                dynamicMaxSlippageValue = slippageConfigPresetEZpvd.getDynamicMaxSlippageValue();
            } else {
                V6QuoteResponseData value = this.ODWQjV.getValue();
                if (value != null && (selectedDeFiPlatform = value.getSelectedDeFiPlatform()) != null && (autoSlippageInfo = selectedDeFiPlatform.getAutoSlippageInfo()) != null) {
                    slippageValue = autoSlippageInfo.getAutoSlippage();
                }
                if (slippageValue == null) {
                    slippageValue = "";
                }
                dynamicMaxSlippageValue = slippageValue;
            }
        } else {
            SlippageRange slippageRangeAEQbTJ = AxsJAY().AEQbTJ(QKVWgx().getChainId(), getFieldNames(), transactionType.getType());
            slippageValue = slippageRangeAEQbTJ != null ? slippageRangeAEQbTJ.getSlippageValue() : null;
            if (slippageValue == null) {
            }
            dynamicMaxSlippageValue = slippageValue;
        }
        return placeOrderParamsAEQbTJ.copy((3071 & 1) != 0 ? placeOrderParamsAEQbTJ.maxSlippage : null, (3071 & 2) != 0 ? placeOrderParamsAEQbTJ.priorityFeeType : null, (3071 & 4) != 0 ? placeOrderParamsAEQbTJ.priorityFee : null, (3071 & 8) != 0 ? placeOrderParamsAEQbTJ.routerModeType : null, (3071 & 16) != 0 ? placeOrderParamsAEQbTJ.gasPrice : null, (3071 & 32) != 0 ? placeOrderParamsAEQbTJ.enableJito : null, (3071 & 64) != 0 ? placeOrderParamsAEQbTJ.gasUsed : null, (3071 & 128) != 0 ? placeOrderParamsAEQbTJ.mevInfo : null, (3071 & 256) != 0 ? placeOrderParamsAEQbTJ.slippageType : null, (3071 & 512) != 0 ? placeOrderParamsAEQbTJ.slippage : null, (3071 & 1024) != 0 ? placeOrderParamsAEQbTJ.sellPresetForTPSL : new Preset(strGEmmrt, (java.lang.String) null, dynamicMaxSlippageValue, (java.lang.String) null, hDKMBd().copydefault(QKVWgx().getChainId(), getFieldNames(), transactionType.getType()), (java.lang.String) null, (java.lang.String) null, C33129mqd.gEmmrt(java.lang.Integer.valueOf(AuCTelauCTel().copydefault(QKVWgx().getChainId(), getFieldNames(), transactionType.getType(), gHZMYf()).getFeeLevel())), AuCTelauCTel().copydefault(QKVWgx().getChainId(), getFieldNames(), transactionType.getType(), gHZMYf()).getFeeValue(), (java.lang.String) null, 618, (DefaultConstructorMarker) null), (3071 & 2048) != 0 ? placeOrderParamsAEQbTJ.refParam : null);
    }

    public final void AEQbTJ(@NotNull MemeSelectionActivityResultContract.Output output) {
        Intrinsics.checkNotNullParameter(output, "");
        gEmmrt(output.getPresetType());
        C23317hvu.EZpvd(getFieldNames(), QVAiDq().copydefault(QKVWgx().getChainId()), QKVWgx().getChainId());
        EZpvd(AubY() == PriorityFeeType.PriorityCustom.getValue());
        QbewEr();
        AuCTel().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        pUU.copydefault("updateTransactionSettingBuy", "isCustom: " + AhwBna() + "\n>>>>priorityFee: " + zLjUOn() + ">>>>>>slippageType: " + sSMYrx() + ">>>>slippageValue: " + zuBGHE() + ">>>>>memeRouteType: " + wlaJM());
    }

    public final InterfaceC30984llU QHmsKR() {
        MemeModeCommonDexInfo memeModeCommonDexInfoEZpvd;
        DefiPlatformInfo selectedDeFiPlatform;
        CommonDexInfo commonDexInfo;
        java.lang.String networkFeeType;
        V6QuoteResponseData value = this.ODWQjV.getValue();
        DefiChainInfo defiChainInfoOLrzqt = OLrzqt(QKVWgx().getChainId());
        DeFiPlatformForSwap deFiPlatformForSwapOLrzqt = null;
        if (value == null || (commonDexInfo = value.getCommonDexInfo()) == null) {
            memeModeCommonDexInfoEZpvd = null;
        } else {
            boolean supportEip1559 = defiChainInfoOLrzqt != null ? defiChainInfoOLrzqt.getSupportEip1559() : true;
            if (defiChainInfoOLrzqt == null || (networkFeeType = defiChainInfoOLrzqt.getNetworkFeeType()) == null) {
                networkFeeType = "";
            }
            memeModeCommonDexInfoEZpvd = C28343kXx.EZpvd(commonDexInfo, value, supportEip1559, networkFeeType);
        }
        if (value != null && (selectedDeFiPlatform = value.getSelectedDeFiPlatform()) != null) {
            deFiPlatformForSwapOLrzqt = C28342kXw.OLrzqt(selectedDeFiPlatform);
        }
        return new C30986llW(memeModeCommonDexInfoEZpvd, deFiPlatformForSwapOLrzqt);
    }

    public final DexMultiTokenInfoBean valueOf(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return uzCIH().copydefault(str, QVAiDq().copydefault(str));
    }

    public final java.lang.String OLrzqt(@NotNull TransactionType transactionType, @NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String str3 = "";
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault(str, str2);
        if (dexMultiTokenInfoBeanCopydefault == null || !dexMultiTokenInfoBeanCopydefault.isMainChainCoin()) {
            java.lang.String tokenContractAddress = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenContractAddress() : null;
            if (tokenContractAddress != null) {
                str3 = tokenContractAddress;
            }
        }
        return transactionType == TransactionType.Buy ? str3 : str2;
    }

    public final DexMultiTokenInfoBean ODXsMY() {
        CommonDexInfo commonDexInfo;
        V6QuoteResponseData value = this.ODWQjV.getValue();
        if (value == null || (commonDexInfo = value.getCommonDexInfo()) == null) {
            return null;
        }
        return commonDexInfo.getFromToken();
    }

    public final DexMultiTokenInfoBean hrNTAI() {
        CommonDexInfo commonDexInfo;
        V6QuoteResponseData value = this.ODWQjV.getValue();
        if (value == null || (commonDexInfo = value.getCommonDexInfo()) == null) {
            return null;
        }
        return commonDexInfo.getToToken();
    }

    public final void gkJEwt() {
        Job job = this.fvQaOB;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.fvQaOB = C25389ivm.safeLaunch$default(ViewModelKt.getViewModelScope(this), null, null, new MemeMarketStrategyV6ViewModel$addApproveStateListener$1(this, null), 3, null);
    }

    public final void DarRvM() {
        dvKsVJ().AEQbTJ();
    }

    public final AbstractC22401hef OLrzqt(java.lang.String str, TransactionType transactionType, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String networkFeeType;
        V6QuoteResponseData value = this.ODWQjV.getValue();
        if (value == null) {
            return null;
        }
        DefiChainInfo defiChainInfoOLrzqt = OLrzqt(QKVWgx().getChainId());
        PresetUserConfigBean presetUserConfigBeanEZpvd = uzCIH().EZpvd(QKVWgx().getChainId(), getFieldNames());
        if (presetUserConfigBeanEZpvd == null) {
            return null;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault(QKVWgx().getChainId(), QKVWgx().getTokenContractAddress());
        java.lang.String tokenSymbol = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getTokenSymbol() : null;
        java.lang.String str4 = "";
        java.lang.String str5 = tokenSymbol == null ? "" : tokenSymbol;
        java.lang.String value2 = transactionType == TransactionType.Buy ? TrackTransactionDirection.BUY.getValue() : TrackTransactionDirection.SELL.getValue();
        boolean supportEip1559 = defiChainInfoOLrzqt != null ? defiChainInfoOLrzqt.getSupportEip1559() : false;
        if (defiChainInfoOLrzqt != null && (networkFeeType = defiChainInfoOLrzqt.getNetworkFeeType()) != null) {
            str4 = networkFeeType;
        }
        MemeModeQuoteBean memeModeQuoteBeanAEQbTJ = C28343kXx.AEQbTJ(value, supportEip1559, str4);
        kWE kweFlVtFt = flVtFt();
        java.lang.String strAkhnZx = AkhnZx(QKVWgx().getChainId());
        java.lang.String strQwvEab = QwvEab();
        java.lang.String strQwvEab2 = QwvEab();
        InterfaceC9738bbJ interfaceC9738bbJValueOf = QVAiDq().valueOf();
        return kweFlVtFt.OLrzqt(str, memeModeQuoteBeanAEQbTJ, strAkhnZx, value2, presetUserConfigBeanEZpvd, str5, strQwvEab, strQwvEab2, str2, str3, map, interfaceC9738bbJValueOf != null ? interfaceC9738bbJValueOf.RJOkX() : false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.kYf */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void trackMemeMarketSubmitEvent$default(AbstractC28352kYf abstractC28352kYf, java.lang.String str, TransactionType transactionType, java.lang.String str2, java.lang.String str3, java.util.Map map, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackMemeMarketSubmitEvent");
        }
        if ((i & 16) != 0) {
            map = C56424yEw.KWHzl();
        }
        abstractC28352kYf.AEQbTJ(str, transactionType, str2, str3, map);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull TransactionType transactionType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(map, "");
        flVtFt().copydefault(OLrzqt(str, transactionType, str2, str3, map));
    }

    public final java.lang.String QwvEab() {
        return KWHzl(AubY(), gEmmrt());
    }

    public final java.lang.String UlJrfe() {
        if (DTwDnp() == TransactionType.Buy) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = copydefault(QKVWgx().getChainId(), QKVWgx().getTokenContractAddress());
            if (dexMultiTokenInfoBeanCopydefault == null) {
                return "12";
            }
            java.lang.String decimals = dexMultiTokenInfoBeanCopydefault.getDecimals();
            if (decimals.length() <= 0 || !C23313hvq.AhwBna(decimals, 0)) {
                decimals = null;
            }
            return decimals == null ? "12" : decimals;
        }
        return (C23313hvq.AhwBna(java.lang.Integer.valueOf(QKVWgx().getDecimals()), 0) ? java.lang.Integer.valueOf(QKVWgx().getDecimals()) : "12").toString();
    }

    public final void gEmmrt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        DbNXlk().KWHzl(str, str2, QKVWgx().getTokenContractAddress());
    }

    public final void DAIeex() {
        kWH kwh = this.gkJEwt;
        java.lang.String strZsXlph = zsXlph();
        java.lang.String strAEQbTJ = AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        kwh.EZpvd(strZsXlph, strAEQbTJ, AuCTel());
    }

    public final boolean spnCvw() {
        return C23313hvq.EZpvd(AEQbTJ(), zsXlph());
    }

    private final C22907hoH aKErDB() {
        return (C22907hoH) this.DAIeex.getValue();
    }

    public static final C22907hoH fARcdN(final AbstractC28352kYf abstractC28352kYf) {
        return new C22907hoH(abstractC28352kYf.giSNqX(), new C22339hdW(new Function0() { // from class: o.kYn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC28352kYf.getNewProxyInstance(this.OLrzqt);
            }
        }, new Function0() { // from class: o.kYo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC28352kYf.ejfBZ(this.EZpvd);
            }
        }, new Function0() { // from class: o.kYm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC28352kYf.fIwbmz(this.EZpvd);
            }
        }, new Function0() { // from class: o.kYt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AbstractC28352kYf.fJNWhG(this.AEQbTJ);
            }
        }));
    }

    public static final java.lang.String getNewProxyInstance(AbstractC28352kYf abstractC28352kYf) {
        return (C31172lox.KWHzl(abstractC28352kYf.QUSxYX(), C31172lox.Companion.OLrzqt()) ? ReferralSwapMode.QUICK_MODE : ReferralSwapMode.MEME_MODE).getMode();
    }

    public static final java.lang.String ejfBZ(AbstractC28352kYf abstractC28352kYf) {
        return abstractC28352kYf.QKVWgx().getChainId();
    }

    public static final java.lang.String fIwbmz(AbstractC28352kYf abstractC28352kYf) {
        java.lang.String str;
        kotlin.Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI = abstractC28352kYf.DCUTEI();
        if (pairDCUTEI != null) {
            str = pairDCUTEI.getFirst().OLrzqt() + "-" + pairDCUTEI.getSecond().OLrzqt();
        } else {
            str = null;
        }
        return str == null ? "" : str;
    }

    public static final ServiceFeeInfo fJNWhG(AbstractC28352kYf abstractC28352kYf) {
        return abstractC28352kYf.DWgRXt();
    }

    public final void EZpvd(@NotNull Function2<? super java.lang.Boolean, ? super java.lang.String, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "");
        aKErDB().OLrzqt(function2);
    }

    public static final boolean AuCTel(AbstractC28352kYf abstractC28352kYf) {
        ServiceFeeInfo serviceFeeInfoDWgRXt = abstractC28352kYf.DWgRXt();
        if (serviceFeeInfoDWgRXt != null) {
            return serviceFeeInfoDWgRXt.isCharge();
        }
        return true;
    }

    public final boolean zblBkD() {
        return aKErDB().OLrzqt(new Function0() { // from class: o.kYl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(AbstractC28352kYf.AuCTel(this.EZpvd));
            }
        });
    }

    private final ServiceFeeInfo DWgRXt() {
        DefiPlatformInfo selectedDeFiPlatform;
        com.okinc.business.dex.trade.core.domain.model.ServiceFeeInfo serviceFeeInfo;
        V6QuoteResponseData value = this.ODWQjV.getValue();
        if (value == null || (selectedDeFiPlatform = value.getSelectedDeFiPlatform()) == null || (serviceFeeInfo = selectedDeFiPlatform.getServiceFeeInfo()) == null) {
            return null;
        }
        return C28345kXz.OLrzqt(serviceFeeInfo);
    }

    public final java.lang.String aUsmxb() {
        kotlin.Pair<InterfaceC28268kVc, InterfaceC28268kVc> pairDCUTEI = DCUTEI();
        if (pairDCUTEI == null) {
            return "";
        }
        return pairDCUTEI.getFirst().OLrzqt() + "-" + pairDCUTEI.getSecond().OLrzqt();
    }

    public final java.lang.String EZpvd(TransactionType transactionType) {
        return transactionType == TransactionType.Buy ? TrackTransactionDirection.BUY.getValue() : TrackTransactionDirection.SELL.getValue();
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        C22907hoH.showReferralCodeApplyPanel$default(aKErDB(), context, null, null, 6, null);
    }

    public final V6QuoteRequestWrapper QKudOq() {
        V6QuoteRequestWrapper v6QuoteRequestWrapper;
        gYS gysOHqIaq = OHqIaq();
        V6QuoteRequest v6QuoteRequest = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        if (gysOHqIaq == null) {
            return null;
        }
        if (gysOHqIaq instanceof gYS.Application) {
            v6QuoteRequestWrapper = new V6QuoteRequestWrapper(v6QuoteRequest, ((gYS.Application) gysOHqIaq).OLrzqt(), 1, (DefaultConstructorMarker) (b3 == true ? 1 : 0));
        } else {
            if (!(gysOHqIaq instanceof gYS.Activity)) {
                return null;
            }
            v6QuoteRequestWrapper = new V6QuoteRequestWrapper(((gYS.Activity) gysOHqIaq).OLrzqt(), (V6QuoteAndCalldataRequest) (b2 == true ? 1 : 0), 2, (DefaultConstructorMarker) (b == true ? 1 : 0));
        }
        return v6QuoteRequestWrapper;
    }

    public static /* synthetic */ void trackReferralViewPage$default(AbstractC28352kYf abstractC28352kYf, java.lang.String str, TransactionType transactionType, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackReferralViewPage");
        }
        if ((i & 2) != 0) {
            transactionType = TransactionType.Buy;
        }
        TransactionType transactionType2 = transactionType;
        if ((i & 8) != 0) {
            str3 = BusinessType.MEME.getValue();
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            str4 = TrackOrderType.SWAP.getType();
        }
        abstractC28352kYf.EZpvd(str, transactionType2, str2, str5, str4);
    }

    public static /* synthetic */ void trackReferralEventClick$default(AbstractC28352kYf abstractC28352kYf, java.lang.String str, TransactionType transactionType, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackReferralEventClick");
        }
        if ((i & 2) != 0) {
            transactionType = TransactionType.Buy;
        }
        TransactionType transactionType2 = transactionType;
        if ((i & 8) != 0) {
            str3 = BusinessType.MEME.getValue();
        }
        java.lang.String str5 = str3;
        if ((i & 16) != 0) {
            str4 = TrackOrderType.SWAP.getType();
        }
        abstractC28352kYf.KWHzl(str, transactionType2, str2, str5, str4);
    }

    public final java.lang.String getPostValueLengthLimit() {
        java.lang.String fixedRecommendMax;
        AutoSlippageInfo autoSlippageInfo;
        SlippageConfigPreset slippageConfigPresetEZpvd = AxsJAY().EZpvd(QKVWgx().getChainId(), getFieldNames(), DTwDnp().getType());
        DefiPlatformInfo defiPlatformInfoOxVOHk = OxVOHk();
        java.lang.String referenceSlippage = (defiPlatformInfoOxVOHk == null || (autoSlippageInfo = defiPlatformInfoOxVOHk.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo.getReferenceSlippage();
        if (referenceSlippage == null) {
            referenceSlippage = "";
        }
        if (referenceSlippage.length() == 0) {
            fixedRecommendMax = slippageConfigPresetEZpvd != null ? slippageConfigPresetEZpvd.getFixedMax() : null;
            return fixedRecommendMax == null ? "" : fixedRecommendMax;
        }
        fixedRecommendMax = slippageConfigPresetEZpvd != null ? slippageConfigPresetEZpvd.getFixedRecommendMax() : null;
        java.lang.String str = fixedRecommendMax != null ? fixedRecommendMax : "";
        return C23313hvq.OLrzqt(referenceSlippage, str) ? referenceSlippage : str;
    }

    /* JADX INFO: renamed from: o.kYf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kYf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    public final java.lang.String QSLkRj() {
        DefiPlatformInfo selectedDeFiPlatform;
        AutoSlippageInfo autoSlippageInfo;
        java.lang.Integer numAwvSrB = AwvSrB();
        int type = SlippageMode.Dynamic.getType();
        if (numAwvSrB != null && numAwvSrB.intValue() == type) {
            V6QuoteResponseData value = this.ODWQjV.getValue();
            java.lang.String autoSlippage = (value == null || (selectedDeFiPlatform = value.getSelectedDeFiPlatform()) == null || (autoSlippageInfo = selectedDeFiPlatform.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo.getAutoSlippage();
            return autoSlippage == null ? "" : autoSlippage;
        }
        return zuBGHE();
    }

    @Override // o.AbstractC28336kXq
    public void QbewEr() {
        Job job = this.accept;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (java.lang.Object) null);
        }
        this.accept = null;
        this.iRxXKY.setValue(java.lang.Boolean.FALSE);
    }

    public final java.lang.String DLWbHP() {
        DefiChainInfo defiChainInfoOLrzqt = OLrzqt(QKVWgx().getChainId());
        if (defiChainInfoOLrzqt == null) {
            return wlaJM();
        }
        MemeChainType memeChainTypeEZpvd = MemeChainType.Companion.EZpvd(defiChainInfoOLrzqt.getNetworkFeeType());
        if (!ORxRYg() || memeChainTypeEZpvd == MemeChainType.MemeChainTypeOther) {
            return PresetRouteType.RouteTypeAuto.getValue();
        }
        return wlaJM();
    }

    public final void EZpvd(@NotNull java.lang.String str, @NotNull TransactionType transactionType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ServiceFeeInfo serviceFeeInfoDWgRXt = DWgRXt();
        if (serviceFeeInfoDWgRXt == null) {
            return;
        }
        flVtFt().copydefault(str, str2, EZpvd(transactionType), str4, str3, "meme mode", aUsmxb(), serviceFeeInfoDWgRXt);
    }

    public final void KWHzl(@NotNull java.lang.String str, @NotNull TransactionType transactionType, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionType, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        ServiceFeeInfo serviceFeeInfoDWgRXt = DWgRXt();
        if (serviceFeeInfoDWgRXt == null) {
            return;
        }
        flVtFt().EZpvd(str, str2, EZpvd(transactionType), str4, str3, "meme mode", aUsmxb(), serviceFeeInfoDWgRXt);
    }
}

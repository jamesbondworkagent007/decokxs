package com.okinc.business.dexui.main.swap.trade.single.advanced;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.camera.video.AudioStats;
import androidx.collection.ArrayMapKt;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.tee.domain.model.PlaceOrderParams;
import com.okinc.business.dex.tee.domain.model.SignAndBroadcastRes;
import com.okinc.business.dex.tee.swap.market.ui.viewmodel.SingleSwapMarketPlaceOrderViewModel;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dex.trade.core.domain.model.V6QuoteResponseData;
import com.okinc.business.dex.trade.core.domain.model.common.AccountInfo;
import com.okinc.business.dex.trade.core.domain.model.common.TeeSaStatus;
import com.okinc.business.dex.trade.swap.market.priorityfee.domain.model.MarketTransactionFeeCacheParams;
import com.okinc.business.dex.trade.swap.priorityfee.data.model.SwapPriorityFeeInfo;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.CommonDexInfo;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DeFiPlatformForSwap;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MergeCallData;
import com.okinc.business.dexlogic.bean.MevInfoBean;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.QuoteErrorBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.bean.ServiceFeeInfo;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TransactionBean;
import com.okinc.business.dexlogic.bean.TransactionDirection;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.EventTrackSubmitType;
import com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy;
import com.okinc.business.dexlogic.bean.track.EventTrackingRouteMode;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.FromToBalance;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.IgnoreLastValueObserver;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.CheckStep;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.SwapState;
import com.okinc.business.dexlogic.main.swap.trade.status.helper.TradeStep;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.OrderIdTypeData;
import com.okinc.business.dexlogic.main.swap.trade.transaction.base.bean.TransactionType;
import com.okinc.business.dexlogic.main.swap.trade.viewmodel.util.CacheStatus;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexlogic.track.enums.DexSwapFullClick;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet;
import com.okinc.business.trade.features.home.ui.advanced.swap.slippage.AdvanceSlippageCache;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedDefaultPreset;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData;
import com.okinc.business.trade.features.home.ui.cefi.data.PriorityFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.RouteConfig;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.network.okg.response.OKServerException;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33041mov;
import o.AbstractC22407hel;
import o.AbstractC22408hem;
import o.AbstractC23101hrq;
import o.AbstractC23151hsn;
import o.AbstractC24859ill;
import o.AbstractC28108kPe;
import o.ActivityC25050ipR;
import o.C19812gQf;
import o.C22340hdX;
import o.C22370heA;
import o.C22372heC;
import o.C22380heK;
import o.C22409hen;
import o.C22416heu;
import o.C22806hmM;
import o.C22825hmf;
import o.C22830hmk;
import o.C22831hml;
import o.C22877hne;
import o.C22901hoB;
import o.C22904hoE;
import o.C23077hrS;
import o.C23081hrW;
import o.C23122hsK;
import o.C23159hsv;
import o.C23271hvA;
import o.C23274hvD;
import o.C23313hvq;
import o.C23314hvr;
import o.C23317hvu;
import o.C23328hwE;
import o.C24453ieC;
import o.C24469ieS;
import o.C24614ihE;
import o.C24631ihV;
import o.C24695iig;
import o.C24795ika;
import o.C24800ikf;
import o.C24806ikl;
import o.C24812ikr;
import o.C25035ipC;
import o.C25049ipQ;
import o.C25052ipT;
import o.C25083ipy;
import o.C25286itp;
import o.C25287itq;
import o.C25289its;
import o.C25293itw;
import o.C25330iug;
import o.C25352ivB;
import o.C25390ivn;
import o.C25416iwM;
import o.C25452iww;
import o.C25632jAp;
import o.C28109kPf;
import o.C28110kPg;
import o.C28385kZl;
import o.C30449lbP;
import o.C30457lbX;
import o.C31200lpY;
import o.C31205lpd;
import o.C31256lqb;
import o.C32113mPz;
import o.C32866mlf;
import o.C32979mnm;
import o.C33050mpD;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C43251rlk;
import o.C54978xbK;
import o.C55001xbh;
import o.C55097xdX;
import o.C55298xhM;
import o.C55326xho;
import o.C55328xhq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56423yEv;
import o.C56424yEw;
import o.C56442yFn;
import o.C56524yIo;
import o.C57656ymY;
import o.C59405zgS;
import o.C59443zhD;
import o.C59541ziw;
import o.InterfaceC22903hoD;
import o.InterfaceC23194htd;
import o.InterfaceC24361icQ;
import o.InterfaceC28107kPd;
import o.InterfaceC54855xXv;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC59496ziD;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.ViewOnClickListenerC24460ieJ;
import o.ViewOnClickListenerC54939xaY;
import o.gKR;
import o.gKW;
import o.gOP;
import o.gOQ;
import o.gOV;
import o.gYM;
import o.hBP;
import o.hGZ;
import o.kTW;
import o.pUU;
import o.rVN;
import o.xWX;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SwapSingleTradeContentFragment extends AbstractC24859ill<hBP> implements InterfaceC22903hoD {
    public final InterfaceC56387yDm AhwBna;
    public IgnoreLastValueObserver<DexMultiTokenInfoBean> AuCTelauCTel;
    public IgnoreLastValueObserver<DexMultiTokenInfoBean> AubY;
    public Observer<SwapState> AwvSrB;
    public Function1<? super Boolean, Unit> AxsJAY;
    public boolean DbNXlk;
    public final InterfaceC56387yDm OcIXYQ;

    @yCM
    public InterfaceC28107kPd activityScopeCache;

    @yCM
    public kTW autoConfirmUseCase;
    public C25286itp ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final Observer<CurrentChain> fIwbmz;
    public int fJNWhG;
    public C25083ipy fetchVPNInfo;
    public boolean gEmmrt;
    public InterfaceC24361icQ gHZMYf;
    public final InterfaceC56387yDm getFieldNames;
    public final InterfaceC56387yDm hDKMBd;

    @yCM
    public C25452iww handleSwapEventTrackUtils;
    public boolean isConnected;
    public C24812ikr iwGUEr;
    public Function1<? super Boolean, Unit> sSMYrx;
    public QuotePriceRes uzCIH;
    public final TaskStackBuilder values;
    public C22904hoE<ConsumeData<TradeInputGroup>> wlaJM;
    public C22806hmM.Activity zuBGHE;
    public static final Activity Companion = new Activity(null);
    public static final int AYXKKw = 8;
    public final Object djBIcL = new Object();
    public boolean AuCTel = true;
    public final Object QKVWgx = new Object();
    public ActivityResultLauncher<AdvancedSettingsContract.Input> valueOf = registerForActivityResult(new AdvancedSettingsContract(), new ActivityResultCallback() { // from class: o.imj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(java.lang.Object obj) {
            SwapSingleTradeContentFragment.KWHzl(this.EZpvd, (AdvancedSettingsContract.Input) obj);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.imn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return SwapSingleTradeContentFragment.RcXXUw(this.AEQbTJ);
        }
    });

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[SwapState.values().length];
            try {
                iArr[SwapState.APPROVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SwapState.APPROVED_AND_NEED_CANCEL_APPROVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[PresetRouteType.values().length];
            try {
                iArr2[PresetRouteType.RouteTypeAuto.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[PresetRouteType.RouteTypeMev.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PresetRouteType.RouteTypeFast.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PresetRouteType.RouteTypeNotSupport.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr2;
        }
    }

    public static final /* synthetic */ class PictureInPictureParams implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C22806hmM.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        this.zuBGHE = activity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC24860ilm, o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.RzdrRQ;
    }

    public static final class ActionBar implements Flow<String> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$ActionBar$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.AEQbTJ = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                SwapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1 swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1;
                if (continuation instanceof SwapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1) {
                    swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1 = (SwapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1) continuation;
                    int i = swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1 = new SwapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.AEQbTJ;
                    if (C33129mqd.OLrzqt((CharSequence) obj)) {
                        swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, swapSingleTradeContentFragment$addDataListener$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public ActionBar(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    public SwapSingleTradeContentFragment() {
        final Function0 function0 = new Function0() { // from class: o.iml
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.QUSxYX(this.EZpvd);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C22831hml.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.getFieldNames = C19812gQf.OLrzqt(this);
        this.fARcdN = C56392yDr.copydefault(new Function0() { // from class: o.imm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.djSkpj(this.KWHzl);
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.hDKMBd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SingleSwapMarketPlaceOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment$special$$inlined$viewModels$default$9
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.OcIXYQ = C56392yDr.copydefault(new Function0() { // from class: o.ims
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.flVtFt(this.copydefault);
            }
        });
        this.AwvSrB = new Observer() { // from class: o.imp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapSingleTradeContentFragment.valueOf(this.copydefault, (SwapState) obj);
            }
        };
        this.AuCTelauCTel = new IgnoreLastValueObserver<>(new Function1() { // from class: o.imo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.fetchVPNInfo(this.AEQbTJ, (DexMultiTokenInfoBean) obj);
            }
        });
        this.AubY = new IgnoreLastValueObserver<>(new Function1() { // from class: o.imr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.DbNXlk(this.copydefault, (DexMultiTokenInfoBean) obj);
            }
        });
        this.fIwbmz = new Observer() { // from class: o.imu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapSingleTradeContentFragment.EZpvd(this.AEQbTJ, (CurrentChain) obj);
            }
        };
        this.values = new TaskStackBuilder();
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ SwapSingleTradeContentFragment newInstance$default(Activity activity, String str, TradeParam tradeParam, Function1 function1, Function1 function12, int i, Object obj) {
            if ((i & 2) != 0) {
                tradeParam = null;
            }
            return activity.AEQbTJ(str, tradeParam, function1, function12);
        }

        public final SwapSingleTradeContentFragment AEQbTJ(@NotNull String str, TradeParam tradeParam, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12) {
            Intrinsics.checkNotNullParameter(str, "");
            SwapSingleTradeContentFragment swapSingleTradeContentFragment = new SwapSingleTradeContentFragment();
            swapSingleTradeContentFragment.AxsJAY = function1;
            swapSingleTradeContentFragment.sSMYrx = function12;
            Bundle bundle = new Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("trade_data", tradeParam);
            swapSingleTradeContentFragment.setArguments(bundle);
            return swapSingleTradeContentFragment;
        }
    }

    public static final void KWHzl(SwapSingleTradeContentFragment swapSingleTradeContentFragment, AdvancedSettingsContract.Input input) {
        swapSingleTradeContentFragment.AEQbTJ(input);
    }

    public final InterfaceC28107kPd gEmmrt() {
        InterfaceC28107kPd interfaceC28107kPd = this.activityScopeCache;
        if (interfaceC28107kPd != null) {
            return interfaceC28107kPd;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C25452iww AkhnZx() {
        C25452iww c25452iww = this.handleSwapEventTrackUtils;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final kTW AYXKKw() {
        kTW ktw = this.autoConfirmUseCase;
        if (ktw != null) {
            return ktw;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final void AEQbTJ(AdvancedSettingsContract.Input input) {
        if (input == null) {
            return;
        }
        KWHzl(input);
        OLrzqt(input);
        copydefault(input);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(AdvancedSettingsContract.Input input) {
        SwapPriorityFeeInfo swapPriorityFeeInfo;
        C25035ipC c25035ipC;
        C25330iug c25330iugValues;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        String priorityValue = input.getPriorityValue();
        SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModelIsConnected = isConnected();
        String strHDKMBd = values().hDKMBd();
        int priorityFeeType = input.getPriorityFeeType();
        boolean zIsOpenMev = input.isOpenMev();
        QuotePriceRes quotePriceResAxsJAYsNCnLh = values().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh == null || (swapPriorityFeeInfo = quotePriceResAxsJAYsNCnLh.getPriorityFeeInfo()) == null) {
            swapPriorityFeeInfo = new SwapPriorityFeeInfo((List) null, (NonMevPriorityFeeInfo) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
        }
        String priorityValue2 = input.getPriorityValue();
        String estimateGasFee = input.getEstimateGasFee();
        AdvancedQuoteUiData quoteData = input.getQuoteData();
        String strIwGUEr = (quoteData == null || (advancedQuoteAndCallDataKWHzl = quoteData.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.iwGUEr();
        if (strIwGUEr == null) {
            strIwGUEr = "";
        }
        String strCopydefault = singleSwapMarketPlaceOrderViewModelIsConnected.copydefault(strHDKMBd, priorityFeeType, zIsOpenMev, swapPriorityFeeInfo, priorityValue2, estimateGasFee, strIwGUEr);
        hBP hbp = (hBP) AwvSrB();
        if (hbp != null && (c25035ipC = hbp.valueOf) != null && (c25330iugValues = c25035ipC.values()) != null) {
            c25330iugValues.setPriorityFeeValue(strCopydefault);
        }
        PriorityFeeType priorityFeeTypeCopydefault = PriorityFeeType.Companion.copydefault(input.getPriorityFeeType());
        pUU.KWHzl("SwapSingleTradeContentFragment", "feeValueUsd info=" + strCopydefault + " priorityTag=" + priorityFeeTypeCopydefault + " feeValue=" + priorityValue);
        isConnected().copydefault(values().hDKMBd(), new MarketTransactionFeeCacheParams(priorityValue, strCopydefault, priorityFeeTypeCopydefault));
    }

    private final void OLrzqt(AdvancedSettingsContract.Input input) {
        values().AEQbTJ(new AdvanceSlippageCache(CacheStatus.NONE, input.getSlippageValue(), input.getSlippageMode(), SlippageFeeType.Companion.OLrzqt(input.getSlippageFeeType()), input.getMaxSlippage()));
        values().AEQbTJ();
    }

    private final void KWHzl(AdvancedSettingsContract.Input input) {
        isConnected().copydefault(values().hDKMBd(), PresetRouteType.Companion.EZpvd(input.getRouterModeType()));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (((hBP) AwvSrB()) != null) {
            values().AEQbTJ(str, new Function1() { // from class: o.ilT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeContentFragment.gEmmrt(this.KWHzl, (java.lang.String) obj);
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gEmmrt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, String str) {
        C24795ika c24795ika;
        Intrinsics.checkNotNullParameter(str, "");
        hBP hbp = (hBP) swapSingleTradeContentFragment.AwvSrB();
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            c24795ika.setFromCheckData(str);
        }
        return Unit.INSTANCE;
    }

    public static final class SharedElementCallback implements ViewModelProvider.Factory {
        public SharedElementCallback() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C23159hsv(C23328hwE.Companion.OLrzqt(), SwapSingleTradeContentFragment.this.zuBGHE(), SwapSingleTradeContentFragment.this.gHZMYf(), null, null, null, null, null, null, null, null, null, 4088, null);
        }
    }

    public final C23159hsv values() {
        return (C23159hsv) this.AkhnZx.getValue();
    }

    public static final C23159hsv RcXXUw(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        return (C23159hsv) new ViewModelProvider(swapSingleTradeContentFragment, swapSingleTradeContentFragment.new SharedElementCallback()).get(C23159hsv.class);
    }

    private final C22831hml getFieldNames() {
        return (C22831hml) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner QUSxYX(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        Object next;
        Intrinsics.copydefault(swapSingleTradeContentFragment, "");
        Iterator it = C59405zgS.EZpvd(swapSingleTradeContentFragment, (Function1<? super SwapSingleTradeContentFragment, ? extends SwapSingleTradeContentFragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.ilV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.OLrzqt((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((androidx.fragment.app.Fragment) next) instanceof SingleSwapAdvanceFragment) {
                break;
            }
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
        if (fragment != null) {
            return fragment;
        }
        FragmentActivity fragmentActivityRequireActivity = swapSingleTradeContentFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public static final androidx.fragment.app.Fragment OLrzqt(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderAndPositionEventViewModel hDKMBd() {
        return (OrderAndPositionEventViewModel) this.getFieldNames.getValue();
    }

    public static final class VoiceInteractor implements ViewModelProvider.Factory {
        public VoiceInteractor() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C23122hsK(SwapSingleTradeContentFragment.this.zuBGHE(), SwapSingleTradeContentFragment.this.gHZMYf(), null, 4, null);
        }
    }

    public final C23122hsK fetchVPNInfo() {
        return (C23122hsK) this.fARcdN.getValue();
    }

    public static final C23122hsK djSkpj(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = swapSingleTradeContentFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return (C23122hsK) new ViewModelProvider(fragmentRequireParentFragment, swapSingleTradeContentFragment.new VoiceInteractor()).get(C23122hsK.class);
    }

    public final SingleSwapMarketPlaceOrderViewModel isConnected() {
        return (SingleSwapMarketPlaceOrderViewModel) this.hDKMBd.getValue();
    }

    public final gOV fARcdN() {
        return (gOV) this.OcIXYQ.getValue();
    }

    public static final gOV flVtFt(final SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        return new gOV(swapSingleTradeContentFragment.gEmmrt().KWHzl(), new Function0() { // from class: o.ing
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.gasjUx(this.copydefault);
            }
        });
    }

    public static final MpcWalletService.MpcWalletAbleStatus gasjUx(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        return swapSingleTradeContentFragment.values().fvQaOB().getValue();
    }

    public final gOV.ActionBar AuCTel() {
        return new gOV.ActionBar();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void valueOf(SwapSingleTradeContentFragment swapSingleTradeContentFragment, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        hBP hbp = (hBP) swapSingleTradeContentFragment.AwvSrB();
        if (hbp != null) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapSingleTradeContentFragment.values().QUSxYX().valueOf();
            C24614ihE c24614ihE = hbp.AEQbTJ;
            SwapState swapStateIsButtonStateInterception = swapState.isButtonStateInterception(swapSingleTradeContentFragment.gEmmrt().OLrzqt());
            QuotePriceRes quotePrice = swapSingleTradeContentFragment.values().RlQdEF().getQuotePrice();
            c24614ihE.setTradeStateButton(swapStateIsButtonStateInterception, dexMultiTokenInfoBeanCopydefault, dexMultiTokenInfoBeanValueOf, true, (16 & 16) != 0, (16 & 32) != 0 ? null : quotePrice != null ? quotePrice.getSelectedDeFiPlatform() : null, new Function1() { // from class: o.ilP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeContentFragment.djBIcL(((java.lang.Boolean) obj).booleanValue());
                }
            });
            Function1<? super Boolean, Unit> function1 = swapSingleTradeContentFragment.sSMYrx;
            if (function1 != null) {
                C22825hmf c22825hmf = C22825hmf.OLrzqt;
                String strZuBGHE = swapSingleTradeContentFragment.zuBGHE();
                String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
                function1.invoke(Boolean.valueOf(c22825hmf.copydefault(strZuBGHE, chainId != null ? chainId : "")));
            }
            if (swapState == SwapState.NO_WALLET) {
                swapSingleTradeContentFragment.zLjUOn();
            }
        }
    }

    public static final Unit djBIcL(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit fetchVPNInfo(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C24795ika c24795ika;
        swapSingleTradeContentFragment.EZpvd(dexMultiTokenInfoBean);
        hBP hbp = (hBP) swapSingleTradeContentFragment.AwvSrB();
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            if (dexMultiTokenInfoBean != null) {
                boolean z = dexMultiTokenInfoBean.isHighRisk();
                c24795ika.setFromHighRiskVisible(z);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit DbNXlk(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        String tokenContractAddress;
        String chainId;
        C24795ika c24795ika;
        hBP hbp = (hBP) swapSingleTradeContentFragment.AwvSrB();
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            if (dexMultiTokenInfoBean != null) {
                boolean z = dexMultiTokenInfoBean.isHighRisk();
                c24795ika.setToHighRiskVisible(z);
            }
        }
        swapSingleTradeContentFragment.AEQbTJ(dexMultiTokenInfoBean);
        C22806hmM c22806hmMDGOPHZDGOPHZ = swapSingleTradeContentFragment.values().DGOPHZDGOPHZ();
        LifecycleOwner viewLifecycleOwner = swapSingleTradeContentFragment.getViewLifecycleOwner();
        String str = "";
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        if (dexMultiTokenInfoBean == null || (tokenContractAddress = dexMultiTokenInfoBean.getTokenContractAddress()) == null) {
            tokenContractAddress = "";
        }
        if (dexMultiTokenInfoBean != null && (chainId = dexMultiTokenInfoBean.getChainId()) != null) {
            str = chainId;
        }
        c22806hmMDGOPHZDGOPHZ.OLrzqt(viewLifecycleOwner, tokenContractAddress, str, swapSingleTradeContentFragment.zuBGHE);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void updateReminderView$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, V6BaseQuoteResponse v6BaseQuoteResponse, Throwable th, gOP gop, int i, Object obj) {
        if ((i & 1) != 0) {
            v6BaseQuoteResponse = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if ((i & 4) != 0) {
            gop = null;
        }
        swapSingleTradeContentFragment.AEQbTJ(v6BaseQuoteResponse, th, gop);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(V6BaseQuoteResponse v6BaseQuoteResponse, Throwable th, gOP gop) {
        PreCheckBean preCheckBeanKWHzl = values().KWHzl(values().hDKMBd());
        if (preCheckBeanKWHzl == null) {
            preCheckBeanKWHzl = new PreCheckBean(null, 0, 0, 7, null);
        }
        PreCheckBean preCheckBean = preCheckBeanKWHzl;
        DefiChainInfo newProxyInstance = values().getNewProxyInstance();
        if (newProxyInstance == null) {
            return;
        }
        int iCopydefault = C24695iig.copydefault(gEmmrt().KWHzl());
        int iAEQbTJ = C24695iig.AEQbTJ(gEmmrt().KWHzl(), true).AEQbTJ();
        final DexMultiTokenInfoBean dexMultiTokenInfoBeanFIwbmz = values().fIwbmz();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAuCTel = values().AuCTel();
        boolean zEZpvd = values().OTwTPd() ? Intrinsics.EZpvd(values().fJNWhG().getValue(), Boolean.TRUE) : false;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        hBP hbp = (hBP) AwvSrB();
        gOQ.OLrzqt(contextRequireContext, hbp != null ? hbp.EZpvd : null, preCheckBean, newProxyInstance, v6BaseQuoteResponse, th, valueOf(), values().DCUTEI().copydefault(), values().DNMMPQ(), values().DCUTEI().OLrzqt(), values().heceqZ(), dexMultiTokenInfoBeanFIwbmz, dexMultiTokenInfoBeanAuCTel, iCopydefault, iAEQbTJ, 1, zEZpvd, false, gEmmrt().OLrzqt(), fARcdN(), AuCTel(), gop == null ? new gOP(new Function0() { // from class: o.ine
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.fFgQHt(this.copydefault);
            }
        }, new Function0() { // from class: o.inc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.isConnected(this.EZpvd, dexMultiTokenInfoBeanFIwbmz);
            }
        }, null, new Function0() { // from class: o.ind
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.giSNqX(this.EZpvd);
            }
        }, new Function0() { // from class: o.inh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.fJNWhG(this.EZpvd, dexMultiTokenInfoBeanFIwbmz);
            }
        }, null, null, null, 228, null) : gop);
    }

    public static final Unit fFgQHt(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.fJNWhG();
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        FragmentActivity fragmentActivityRequireActivity = swapSingleTradeContentFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        String strKWHzl = swapSingleTradeContentFragment.gEmmrt().KWHzl();
        String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        C25352ivB.OLrzqt((Context) fragmentActivityRequireActivity, strKWHzl, chainId != null ? chainId : "", true);
        return Unit.INSTANCE;
    }

    public static final Unit giSNqX(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.sSMYrx();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C23159hsv c23159hsvValues = swapSingleTradeContentFragment.values();
        String chainId = dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        c23159hsvValues.AEQbTJ(chainId);
        return Unit.INSTANCE;
    }

    public final OKServerException valueOf() {
        AbstractC23151hsn value = values().iRxXKY().getValue();
        if (!(value instanceof AbstractC23151hsn.ActionBar)) {
            return null;
        }
        Throwable thEZpvd = ((AbstractC23151hsn.ActionBar) value).EZpvd();
        if (thEZpvd instanceof OKServerException) {
            return (OKServerException) thEZpvd;
        }
        String message = thEZpvd.getMessage();
        if (message == null) {
            message = C32979mnm.EZpvd.OLrzqt().getString(C23274hvD.Fragment.gdwsGQ);
            Intrinsics.checkNotNullExpressionValue(message, "");
        }
        return new OKServerException(0, message, null, null, 13, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        C24614ihE c24614ihE;
        hBP hbp = (hBP) AwvSrB();
        if (hbp == null || (c24614ihE = hbp.AEQbTJ) == null) {
            return;
        }
        c24614ihE.AEQbTJ(values(), this, true, new Function0() { // from class: o.ilQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.fZBcTu(this.OLrzqt);
            }
        }, new Function0() { // from class: o.ilS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.dxcTrN(this.OLrzqt);
            }
        });
    }

    public static final Unit fZBcTu(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        refresh$default(swapSingleTradeContentFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit dxcTrN(final SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.values().KWHzl(new Function0() { // from class: o.ilW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.finit(this.AEQbTJ);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit finit(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        hBP hbp;
        C24795ika c24795ika;
        swapSingleTradeContentFragment.values().dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        String strZuBGHE = swapSingleTradeContentFragment.zuBGHE();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        if (!c22825hmf.EZpvd(strZuBGHE, chainId, true)) {
            String strZuBGHE2 = swapSingleTradeContentFragment.zuBGHE();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
            String chainId2 = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getChainId() : null;
            if (!c22825hmf.EZpvd(strZuBGHE2, chainId2 != null ? chainId2 : "") && (hbp = (hBP) swapSingleTradeContentFragment.AwvSrB()) != null && (c24795ika = hbp.OLrzqt) != null) {
                c24795ika.setFromEnableEdit(true);
            }
        }
        refresh$default(swapSingleTradeContentFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    private final void sSMYrx() {
        String strHDKMBd = values().hDKMBd();
        if (!C33129mqd.OLrzqt((CharSequence) strHDKMBd)) {
            strHDKMBd = "-100000000";
        }
        final long jValueOf = C33129mqd.valueOf(strHDKMBd);
        xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, childFragmentManager, new CurrentWalletSwitchConfig(null, new CurrentWalletSwitchNetworkMode.SingleNetwork(jValueOf), C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s), null, null, 0, null, null, 249, null), new Function2() { // from class: o.ilX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(SwapSingleTradeContentFragment.OLrzqt(jValueOf, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new ClipData(), 8, null);
    }

    public static final boolean OLrzqt(long j, InterfaceC9738bbJ interfaceC9738bbJ, Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.getFieldNames() || !interfaceC9738bbJ.AkhnZx(j)) ? false : true;
    }

    public static final class ClipData implements InterfaceC54855xXv {
        public ClipData() {
        }

        @Override // o.InterfaceC54855xXv
        public void AEQbTJ(InterfaceC9738bbJ interfaceC9738bbJ) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, interfaceC9738bbJ);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault() {
            InterfaceC54855xXv.ActionBar.EZpvd(this);
        }

        @Override // o.InterfaceC54855xXv
        public void copydefault(InterfaceC9738bbJ interfaceC9738bbJ) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.copydefault(this, interfaceC9738bbJ);
            SwapSingleTradeContentFragment.this.AYXKKw(true);
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.EZpvd(this, interfaceC9738bbJ, j);
            SwapSingleTradeContentFragment.this.AYXKKw(true);
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
            SwapSingleTradeContentFragment.this.AYXKKw(true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(final DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C24795ika c24795ika;
        hBP hbp = (hBP) AwvSrB();
        if (hbp == null || (c24795ika = hbp.OLrzqt) == null) {
            return;
        }
        c24795ika.setFromInputConfig(new Function1() { // from class: o.imZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(dexMultiTokenInfoBean, (C24806ikl) obj);
            }
        });
    }

    public static final Unit KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean, C24806ikl c24806ikl) {
        String decimals;
        Intrinsics.checkNotNullParameter(c24806ikl, "");
        if (dexMultiTokenInfoBean == null || (decimals = dexMultiTokenInfoBean.getDecimals()) == null) {
            decimals = "12";
        }
        c24806ikl.setMaxDecimalValue(C22370heA.OLrzqt(decimals));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ(final DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C24795ika c24795ika;
        hBP hbp = (hBP) AwvSrB();
        if (hbp == null || (c24795ika = hbp.OLrzqt) == null) {
            return;
        }
        c24795ika.setReceiveInputConfig(new Function1() { // from class: o.inf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.OLrzqt(dexMultiTokenInfoBean, (C24806ikl) obj);
            }
        });
    }

    public static final Unit OLrzqt(DexMultiTokenInfoBean dexMultiTokenInfoBean, C24806ikl c24806ikl) {
        String decimals;
        Intrinsics.checkNotNullParameter(c24806ikl, "");
        if (dexMultiTokenInfoBean == null || (decimals = dexMultiTokenInfoBean.getDecimals()) == null) {
            decimals = "12";
        }
        c24806ikl.setMaxDecimalValue(C22370heA.OLrzqt(decimals));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(SwapSingleTradeContentFragment swapSingleTradeContentFragment, CurrentChain currentChain) {
        Intrinsics.checkNotNullParameter(currentChain, "");
        swapSingleTradeContentFragment.values().EZpvd(currentChain);
    }

    public static final class TaskStackBuilder extends FragmentManager.FragmentLifecycleCallbacks {
        public TaskStackBuilder() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, Context context) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(context, "");
            super.onFragmentAttached(fragmentManager, fragment, context);
            if (fragment instanceof DialogFragment) {
                SwapSingleTradeContentFragment.this.isConnected = true;
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDetached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDetached(fragmentManager, fragment);
            if (fragment instanceof DialogFragment) {
                SwapSingleTradeContentFragment.this.isConnected = false;
            }
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.itw.updateSimpleModeParam$default(o.itw, o.hoB, o.hmk, o.hna, int, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE
    public void onVisible() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        dismissLoading();
        hBP hbp = (hBP) AwvSrB();
        if (hbp != null) {
            C24469ieS c24469ieSAkhnZx = hbp.valueOf.AkhnZx();
            if (c24469ieSAkhnZx != null) {
                c24469ieSAkhnZx.setVisibility(8);
            }
            ViewOnClickListenerC24460ieJ viewOnClickListenerC24460ieJDjBIcL = hbp.valueOf.djBIcL();
            if (viewOnClickListenerC24460ieJDjBIcL != null) {
                viewOnClickListenerC24460ieJDjBIcL.setVisibility(8);
            }
            hbp.valueOf.OLrzqt(100L);
        }
        C22901hoB c22901hoBZuBGHE = values().zuBGHE();
        if (c22901hoBZuBGHE != null) {
            c22901hoBZuBGHE.AEQbTJ();
        }
        values().zLjUOn().KWHzl().observeForever(this.AuCTelauCTel);
        values().zLjUOn().EZpvd().observeForever(this.AubY);
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            supportFragmentManager.registerFragmentLifecycleCallbacks(this.values, true);
        }
        C22830hmk c22830hmkFJNWhG = C22380heK.OLrzqt.copydefault(zuBGHE()).fJNWhG();
        C25293itw.updateSimpleModeParam$default(c22830hmkFJNWhG.AhwBna(), values().zuBGHE(), c22830hmkFJNWhG, values().QUSxYX(), 2, null, 16, null);
        values().KWHzl(true ^ this.gEmmrt);
        if (this.gEmmrt) {
            values().RlQdEF().processQuotePriceResOnProviderSelection(this.uzCIH);
            this.gEmmrt = false;
        }
        AubY();
        C22904hoE<ConsumeData<TradeInputGroup>> c22904hoE = this.wlaJM;
        if (c22904hoE != null) {
            c22904hoE.copydefault();
        }
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC24860ilm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public hBP EZpvd(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBP hbpKWHzl = hBP.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hbpKWHzl, "");
        return hbpKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE
    public void onInvisible() {
        androidx.fragment.app.FragmentManager supportFragmentManager;
        C24795ika c24795ika;
        hBP hbp = (hBP) AwvSrB();
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            c24795ika.KWHzl();
            c24795ika.AEQbTJ();
        }
        C22901hoB c22901hoBZuBGHE = values().zuBGHE();
        if (c22901hoBZuBGHE != null) {
            c22901hoBZuBGHE.AYXKKw();
        }
        values().ixgjPv();
        values().zLjUOn().KWHzl().removeObserver(this.AuCTelauCTel);
        values().zLjUOn().EZpvd().removeObserver(this.AubY);
        FragmentActivity activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(this.values);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC24860ilm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hBP hbp, Bundle bundle) {
        Intrinsics.checkNotNullParameter(hbp, "");
        EventTrackingAmountEnterBy.Companion.AEQbTJ(EventTrackingAmountEnterBy.Application.KWHzl);
        values().EZpvd(getActivity());
        zsXlph();
        AkhnZx().OLrzqt(new AbstractC22407hel.PendingIntent(values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), null, null, 96, null));
        values().OLrzqt(registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.imX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                SwapSingleTradeContentFragment.OLrzqt(this.EZpvd, (ActivityResult) obj);
            }
        }));
        OLrzqt(hbp);
        KWHzl(hbp);
        copydefault(hbp);
        hbp.getRoot().post(new Runnable() { // from class: o.imY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SwapSingleTradeContentFragment.UeEOUB(this.AEQbTJ);
            }
        });
    }

    public static final void OLrzqt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, ActivityResult activityResult) {
        Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        if (data.getBooleanExtra("cancel_action_from_tx_page", false)) {
            swapSingleTradeContentFragment.uzCIH = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
            return;
        }
        V6BaseQuoteResponse v6BaseQuoteResponse = (V6BaseQuoteResponse) ((Parcelable) IntentCompat.getParcelableExtra(data, "quote_response_from_provider_list", V6BaseQuoteResponse.class));
        C23159hsv c23159hsvValues = swapSingleTradeContentFragment.values();
        String stringExtra = data.getStringExtra("selected_de_fi_platform_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = data.getStringExtra("selected_de_fi_platform_name");
        c23159hsvValues.EZpvd(stringExtra, stringExtra2 != null ? stringExtra2 : "");
        if (v6BaseQuoteResponse != null) {
            swapSingleTradeContentFragment.uzCIH = gYM.EZpvd.AEQbTJ(new V6QuoteResponseData(v6BaseQuoteResponse.getCommonDexInfo(), v6BaseQuoteResponse.getDefiPlatformInfoList(), v6BaseQuoteResponse.getNetworkFeeInfo(), v6BaseQuoteResponse.getSelectedDeFiPlatformId()));
        }
    }

    public static final void UeEOUB(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) swapSingleTradeContentFragment, true, (String) null, 2, (Object) null);
    }

    private final void OLrzqt(hBP hbp) {
        C24800ikf c24800ikf;
        C24806ikl c24806iklAEQbTJ;
        hbp.AYXKKw.setContentDescription("web3_dex_swap_container");
        this.ejfBZ = new C25286itp(zuBGHE());
        hbp.AYXKKw.setContentBinding(hbp);
        MutableLiveData<Boolean> mutableLiveDataQkdxfA = values().QkdxfA();
        Boolean bool = Boolean.FALSE;
        mutableLiveDataQkdxfA.setValue(bool);
        values().AEQbTJ(new C22901hoB(values(), new WeakReference(this), null, 4, null));
        Context context = getContext();
        if (context != null) {
            hbp.OLrzqt.setLeftRightMargin(C55298xhM.OLrzqt(12, context));
        }
        Context context2 = getContext();
        this.fetchVPNInfo = context2 != null ? new C25083ipy(context2, null, 0, zuBGHE(), 6, null) : null;
        values().QkdxfA().setValue(bool);
        hGZ hgzEZpvd = hbp.OLrzqt.EZpvd();
        if (hgzEZpvd == null || (c24800ikf = hgzEZpvd.copydefault) == null || (c24806iklAEQbTJ = c24800ikf.AEQbTJ()) == null) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C24812ikr c24812ikr = new C24812ikr(fragmentActivityRequireActivity);
        this.iwGUEr = c24812ikr;
        c24812ikr.setPriceCallback(new Function2() { // from class: o.img
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SwapSingleTradeContentFragment.EZpvd(this.copydefault, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
        new C54978xbK(fragmentActivityRequireActivity2, this.iwGUEr, getViewLifecycleOwner()).copydefault(yEE.gEmmrt(c24806iklAEQbTJ));
    }

    public static final Unit EZpvd(SwapSingleTradeContentFragment swapSingleTradeContentFragment, String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.fetchVPNInfo().OLrzqt(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, C22409hen.KWHzl(i)), C56390yDp.OLrzqt("button_type", ButtonType.QUICK_BUTTON.getType()))));
        swapSingleTradeContentFragment.EZpvd(str);
        EventTrackingAmountEnterBy.Companion.AEQbTJ(new EventTrackingAmountEnterBy.TaskDescription(str));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ihE.approveConfirm$default(o.ihE, java.lang.String, o.hrq, o.moC, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    private final void KWHzl(final hBP hbp) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner, values().OuxcSI(), null, new Dialog(), 2, null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C59541ziw.EZpvd(activity, this, new InterfaceC59496ziD() { // from class: o.imv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC59496ziD
                public final void OLrzqt(boolean z) {
                    SwapSingleTradeContentFragment.OLrzqt(this.OLrzqt, hbp, z);
                }
            });
        }
        hbp.OLrzqt.setActionCallBack(new Function0() { // from class: o.imD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.EZpvd(this.copydefault, hbp);
            }
        });
        hbp.OLrzqt.KWHzl(new Function0() { // from class: o.imM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.sSMYrx(this.copydefault);
            }
        });
        hbp.OLrzqt.setFromCoinSelectClick(new Function1() { // from class: o.imJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AEQbTJ(this.OLrzqt, (C24795ika) obj);
            }
        });
        hbp.OLrzqt.setChainFromSelectClick(new Function1() { // from class: o.imQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.copydefault(this.KWHzl, (C24800ikf) obj);
            }
        });
        hbp.OLrzqt.setToCoinSelectClick(new Function1() { // from class: o.imN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(this.OLrzqt, (C24795ika) obj);
            }
        });
        hbp.OLrzqt.setChainToSelectClick(new Function1() { // from class: o.imR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(this.OLrzqt, (C24800ikf) obj);
            }
        });
        hbp.OLrzqt.setFromToChangeClick(new Function1() { // from class: o.imO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.gEmmrt(this.EZpvd, (C24795ika) obj);
            }
        });
        hbp.OLrzqt.setClickValueDifferenceCallBack(new Function0() { // from class: o.imW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.AwvSrB(this.OLrzqt);
            }
        });
        hbp.OLrzqt.setInputFocusCallBack(new Function0() { // from class: o.imS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.AEQbTJ(hbp);
            }
        });
        C25330iug c25330iugValues = hbp.valueOf.values();
        if (c25330iugValues != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c25330iugValues, 0L, new Function1() { // from class: o.imt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeContentFragment.copydefault(this.copydefault, (android.view.View) obj);
                }
            }, 1, null);
        }
        C24453ieC c24453ieCCopydefault = hbp.valueOf.copydefault();
        if (c24453ieCCopydefault != null) {
            c24453ieCCopydefault.setRateSwitchListener(new Function0() { // from class: o.imx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapSingleTradeContentFragment.valueOf(this.AEQbTJ, hbp);
                }
            });
        }
        C24614ihE c24614ihE = hbp.AEQbTJ;
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            C33570myu.copydefault((android.app.Activity) activity2);
        }
        C24795ika c24795ika = hbp.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c24795ika, "");
        c24614ihE.KWHzl(c24795ika, values(), this, true, new Function0() { // from class: o.imw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.zuBGHE(this.OLrzqt);
            }
        }, new Function0() { // from class: o.imC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.AhwBna(this.OLrzqt, hbp);
            }
        }, new Function0() { // from class: o.imA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.AxsJAY(this.copydefault);
            }
        }, new Function0() { // from class: o.imB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.QOLQEE(this.EZpvd);
            }
        }, new Function0() { // from class: o.imy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.ORxRYg(this.OLrzqt);
            }
        }, new Function0() { // from class: o.imE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.DTwDnp(this.EZpvd);
            }
        }, new Function1() { // from class: o.imF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.EZpvd(this.AEQbTJ, (SwapState) obj);
            }
        });
        C24614ihE.approveConfirm$default(c24614ihE, zuBGHE(), values(), this, null, new Function1() { // from class: o.imH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(this.KWHzl, (android.os.Bundle) obj);
            }
        }, new Function1() { // from class: o.imG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AEQbTJ(this.EZpvd, (SwapState) obj);
            }
        }, 8, null);
        hbp.OLrzqt.setClickCallback(new Function0() { // from class: o.imK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.QfsBiF(this.AEQbTJ);
            }
        });
        C22380heK.OLrzqt.copydefault(zuBGHE()).EZpvd(true).gEmmrt().OLrzqt().observe(getViewLifecycleOwner(), new Observer() { // from class: o.imI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapSingleTradeContentFragment.OLrzqt(this.EZpvd, (java.util.List) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SwapSingleTradeContentFragment$addListener$17(this, null), 3, null);
        values().KDccX().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.imL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AkhnZx(this.EZpvd, (DexMultiTokenInfoBean) obj);
            }
        }));
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.copydefault(SwapSingleTradeContentFragment.this, C23274hvD.Fragment.onSetShuffleMode, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", str))), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
            }
            SwapSingleTradeContentFragment.this.values().DCUTEIdCUTEI();
            return Unit.INSTANCE;
        }
    }

    public static final void OLrzqt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, hBP hbp, boolean z) {
        if (swapSingleTradeContentFragment.values().UeEOUB()) {
            C24812ikr c24812ikr = swapSingleTradeContentFragment.iwGUEr;
            if (c24812ikr != null) {
                c24812ikr.setVisibility(swapSingleTradeContentFragment.values().DcqEDu() ? 0 : 8);
            }
            EventTrackingAmountEnterBy.Companion.AEQbTJ(EventTrackingAmountEnterBy.Application.KWHzl);
        }
        if (z) {
            return;
        }
        hbp.AYXKKw.setScrollingEnabled(true);
        hbp.OLrzqt.KWHzl();
        hbp.OLrzqt.AEQbTJ();
    }

    public static final Unit EZpvd(SwapSingleTradeContentFragment swapSingleTradeContentFragment, hBP hbp) {
        C25352ivB.startVibrator$default(0L, 1, null);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.MAX.getValue(), false, null, 12, null);
        C25286itp c25286itp = swapSingleTradeContentFragment.ejfBZ;
        if (c25286itp != null) {
            c25286itp.AEQbTJ(hbp.OLrzqt, swapSingleTradeContentFragment.values());
        }
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.MAX.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()))));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.itp.showReverseTipDialog$default(o.itp, android.app.Activity, o.hrq, boolean, int, java.lang.Object):void */
    public static final Unit sSMYrx(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        C25286itp c25286itp = swapSingleTradeContentFragment.ejfBZ;
        if (c25286itp != null) {
            C25286itp.showReverseTipDialog$default(c25286itp, swapSingleTradeContentFragment.requireActivity(), swapSingleTradeContentFragment.values(), false, 4, null);
        }
        C32866mlf.onEvent$default("app_swap_all_balance_info", (TrackChannel[]) null, new Function1() { // from class: o.imU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AEQbTJ((EventParamsList) obj);
            }
        }, 1, (Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapSingleTradeContentFragment swapSingleTradeContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        swapSingleTradeContentFragment.AhwBna(true);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.SELECT_FROM_TOKEN.getValue(), false, null, 12, null);
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.TOKEN_FROM.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()))));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SwapSingleTradeContentFragment swapSingleTradeContentFragment, C24800ikf c24800ikf) {
        Intrinsics.checkNotNullParameter(c24800ikf, "");
        swapSingleTradeContentFragment.AhwBna(true);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.SELECT_FROM_CHAIN.getValue(), false, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapSingleTradeContentFragment swapSingleTradeContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        swapSingleTradeContentFragment.AhwBna(false);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.SELECT_TO_TOKEN.getValue(), false, null, 12, null);
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.TOKEN_TO.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()))));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapSingleTradeContentFragment swapSingleTradeContentFragment, C24800ikf c24800ikf) {
        Intrinsics.checkNotNullParameter(c24800ikf, "");
        swapSingleTradeContentFragment.AhwBna(false);
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.SELECT_TO_CHAIN.getValue(), false, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        ConsumeData<TradeInputGroup> value = swapSingleTradeContentFragment.values().dmfpNf().getValue();
        if (value != null) {
            value.getData().getFromData().getData().getEditData().setMaxData(MultiTransferSignData.DEFAULT_INTERVAL);
            swapSingleTradeContentFragment.values();
            swapSingleTradeContentFragment.values().finit().AkhnZx();
            setInputHintContent$default(swapSingleTradeContentFragment, false, null, 2, null);
            if (swapSingleTradeContentFragment.values().QUSxYX().isConnected()) {
                swapSingleTradeContentFragment.fJNWhG = 0;
            }
            swapSingleTradeContentFragment.zLjUOn();
            C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.FROM_TO_REVERT.getValue(), false, null, 12, null);
            swapSingleTradeContentFragment.getFieldNames().OLrzqt().setValue(Boolean.FALSE);
        }
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.TRADE_DIRECTION_SWITCH.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()))));
        return Unit.INSTANCE;
    }

    public static final Unit AwvSrB(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        DeFiPlatformForSwap selectedDeFiPlatform;
        Context context = swapSingleTradeContentFragment.getContext();
        if (context != null) {
            if (swapSingleTradeContentFragment.values().QUSxYX().AkhnZx()) {
                View viewInflate = LayoutInflater.from(swapSingleTradeContentFragment.requireContext()).inflate(C23274hvD.Activity.sZqaRl, (ViewGroup) null, false);
                TextView textView = (TextView) viewInflate.findViewById(C23274hvD.Application.onApplyThemeResource);
                TextView textView2 = (TextView) viewInflate.findViewById(C23274hvD.Application.StandaloneActionMode);
                QuotePriceRes quotePriceResAxsJAYsNCnLh = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
                if (quotePriceResAxsJAYsNCnLh != null && (selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform()) != null && selectedDeFiPlatform.isPMM()) {
                    textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.getVolumeAttributes));
                    textView2.setVisibility(8);
                } else {
                    QuotePriceRes quotePriceResAxsJAYsNCnLh2 = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
                    if (quotePriceResAxsJAYsNCnLh2 != null && quotePriceResAxsJAYsNCnLh2.isValueDiffWarningForSingleChain()) {
                        textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.SFHvfSaKzXkR));
                        textView2.setVisibility(8);
                    } else {
                        textView2.setVisibility(0);
                        textView.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.DPHOMC));
                        textView2.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.Rtjmuc));
                    }
                }
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.SQPLEi);
                Intrinsics.copydefault(viewInflate);
                viewOnClickListenerC54939xaY.EZpvd(viewInflate);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.show();
            }
            C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.VALUE_DIFFERENCE.getValue(), false, null, 12, null);
        }
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.RATE_DIFF_EXPLAIN.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.EXPLAIN.getType()))));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(hBP hbp) {
        hbp.AYXKKw.setScrollingEnabled(false);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SwapSingleTradeContentFragment swapSingleTradeContentFragment, View view) {
        ActivityResultLauncher<AdvancedSettingsContract.Input> activityResultLauncher;
        Intrinsics.checkNotNullParameter(view, "");
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("is_tee", String.valueOf(swapSingleTradeContentFragment.isConnected().EZpvd(swapSingleTradeContentFragment.values().hDKMBd()))), C56390yDp.OLrzqt("is_tpsl", "no"), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.SETTINGS.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()))));
        AdvancedSettingsContract.Input inputUzCIH = swapSingleTradeContentFragment.uzCIH();
        if (inputUzCIH != null && (activityResultLauncher = swapSingleTradeContentFragment.valueOf) != null) {
            activityResultLauncher.launch(inputUzCIH);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(SwapSingleTradeContentFragment swapSingleTradeContentFragment, hBP hbp) {
        QuotePriceRes quotePriceResAxsJAYsNCnLh;
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.RATE.getValue(), false, null, 12, null);
        C23159hsv c23159hsvValues = swapSingleTradeContentFragment.values();
        if (c23159hsvValues.QwvEab() && (quotePriceResAxsJAYsNCnLh = c23159hsvValues.AxsJAYsNCnLh()) != null) {
            c23159hsvValues.wlaJM().OLrzqt(!c23159hsvValues.wlaJM().AEQbTJ());
            C24453ieC c24453ieCCopydefault = hbp.valueOf.copydefault();
            if (c24453ieCCopydefault != null) {
                C23081hrW c23081hrWWlaJM = swapSingleTradeContentFragment.values().wlaJM();
                ConsumeData<TradeInputGroup> value = swapSingleTradeContentFragment.values().dmfpNf().getValue();
                Intrinsics.copydefault(value);
                C23077hrS labelData$default = C23081hrW.getLabelData$default(c23081hrWWlaJM, value.getData(), quotePriceResAxsJAYsNCnLh, null, 4, null);
                Context contextRequireContext = swapSingleTradeContentFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                c24453ieCCopydefault.setRateInfo(C25287itq.copydefault(labelData$default, contextRequireContext));
            }
        }
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.RATE_SWITCH.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()))));
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        refresh$default(swapSingleTradeContentFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(final SwapSingleTradeContentFragment swapSingleTradeContentFragment, final hBP hbp) {
        swapSingleTradeContentFragment.values().KWHzl(new Function0() { // from class: o.imT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.gEmmrt(this.OLrzqt, hbp);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, hBP hbp) {
        swapSingleTradeContentFragment.values().dHguZz().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        String strZuBGHE = swapSingleTradeContentFragment.zuBGHE();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        if (!c22825hmf.EZpvd(strZuBGHE, chainId, true)) {
            String strZuBGHE2 = swapSingleTradeContentFragment.zuBGHE();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
            String chainId2 = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getChainId() : null;
            if (!c22825hmf.EZpvd(strZuBGHE2, chainId2 != null ? chainId2 : "")) {
                hbp.OLrzqt.setFromEnableEdit(true);
            }
        }
        refresh$default(swapSingleTradeContentFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit AxsJAY(final SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.values().DCUTEIddSDPG();
        C25416iwM c25416iwMDCUTEI = swapSingleTradeContentFragment.values().DCUTEI();
        QuotePriceRes quotePriceResAxsJAYsNCnLh = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
        String strOLrzqt = c25416iwMDCUTEI.OLrzqt(quotePriceResAxsJAYsNCnLh != null ? quotePriceResAxsJAYsNCnLh.autoSlippage() : null);
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        boolean zEZpvd = swapSingleTradeContentFragment.values().DCUTEI().EZpvd();
        QuotePriceRes quotePriceResAxsJAYsNCnLh2 = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh2 != null && quotePriceResAxsJAYsNCnLh2.isSlipPageFluctuationThreshold() && !zEZpvd) {
            swapSingleTradeContentFragment.values().dvKsVJ().setValue(Boolean.FALSE);
            C25352ivB.EZpvd(swapSingleTradeContentFragment.getActivity(), strOLrzqt, new Function0() { // from class: o.int
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapSingleTradeContentFragment.OcIXYQ(this.copydefault);
                }
            }, new Function0() { // from class: o.inE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapSingleTradeContentFragment.QKVWgx(this.copydefault);
                }
            });
        } else {
            swapSingleTradeContentFragment.fIwbmz();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OcIXYQ(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.values().dvKsVJ().setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    public static final Unit QKVWgx(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.fIwbmz();
        return Unit.INSTANCE;
    }

    public static final Unit QOLQEE(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault;
        swapSingleTradeContentFragment.dismissLoading();
        if (swapSingleTradeContentFragment.getActivity() != null && (dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault()) != null) {
            C23271hvA c23271hvA = C23271hvA.copydefault;
            String strSubCheckS$default = C23313hvq.subCheckS$default(swapSingleTradeContentFragment.values().gHZMYf(), swapSingleTradeContentFragment.values().DbNXlk(), null, null, null, 14, null);
            RoundingMode roundingMode = RoundingMode.DOWN;
            String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.HJWChPQdUnVm, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("unablevalue", C23271hvA.getShowData$default(c23271hvA, strSubCheckS$default, false, roundingMode, false, false, 26, null)), C56390yDp.OLrzqt("symbol", dexMultiTokenInfoBeanCopydefault.getTokenSymbol()), C56390yDp.OLrzqt("value", C23271hvA.getShowData$default(c23271hvA, swapSingleTradeContentFragment.values().DbNXlk(), false, roundingMode, false, false, 26, null)), C56390yDp.OLrzqt("symbol", dexMultiTokenInfoBeanCopydefault.getTokenSymbol())));
            FragmentActivity activity = swapSingleTradeContentFragment.getActivity();
            if (activity != null) {
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
                viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
                ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
                viewOnClickListenerC54939xaY.show();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ORxRYg(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.zLjUOn();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapSingleTradeContentFragment swapSingleTradeContentFragment, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        if (swapState == SwapState.SWAP) {
            swapSingleTradeContentFragment.valueOf(EventTrackSubmitType.SUBMIT.getType());
        } else if (swapState == SwapState.NO_WALLET) {
            swapSingleTradeContentFragment.valueOf(EventTrackSubmitType.CONNECTED_WALLET.getType());
        } else if (swapState.isDAppRedirectState()) {
            swapSingleTradeContentFragment.valueOf(EventTrackSubmitType.DAPP.getType());
        }
        return Unit.INSTANCE;
    }

    public static final Unit DTwDnp(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.ADD_FUNDS.getValue(), false, null, 12, null);
        swapSingleTradeContentFragment.AxsJAY();
        swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.DEPOSIT.getButtonName()), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()))));
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Bundle bundle) {
        swapSingleTradeContentFragment.EZpvd(bundle);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapSingleTradeContentFragment swapSingleTradeContentFragment, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        int i = Application.copydefault[swapState.ordinal()];
        if (i == 1) {
            swapSingleTradeContentFragment.valueOf(EventTrackSubmitType.APPROVE.getType());
        } else if (i == 2) {
            swapSingleTradeContentFragment.valueOf(EventTrackSubmitType.REVOKE.getType());
        }
        return Unit.INSTANCE;
    }

    public static final Unit QfsBiF(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        C22825hmf c22825hmf = C22825hmf.OLrzqt;
        if (!c22825hmf.EZpvd(swapSingleTradeContentFragment.zuBGHE(), chainId, true) && !c22825hmf.EZpvd(swapSingleTradeContentFragment.zuBGHE(), chainId) && swapSingleTradeContentFragment.getActivity() != null) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C23274hvD.Fragment.ResultReceiver1), 0, 1, (Object) null);
        }
        C22877hne.trackDexSwapFullClick$default(C22877hne.OLrzqt, swapSingleTradeContentFragment.zuBGHE(), DexSwapFullClick.MODIFY_TO_AMOUNT.getValue(), false, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        swapSingleTradeContentFragment.values().DGOPHZ();
    }

    public static final Unit AkhnZx(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        swapSingleTradeContentFragment.AuCTel = true;
        Intrinsics.copydefault(dexMultiTokenInfoBean);
        swapSingleTradeContentFragment.EZpvd(dexMultiTokenInfoBean, false);
        swapSingleTradeContentFragment.hDKMBd().values();
        return Unit.INSTANCE;
    }

    private final AdvancedSettingsContract.Input uzCIH() {
        BuySellPreset buyPreset;
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
        int value;
        Object next;
        DexAutoSlippageInfoParam autoSlippageInfo;
        DexAutoSlippageInfoParam autoSlippageInfo2;
        String strHDKMBd = values().hDKMBd();
        Result<DexPresetResultVO> resultOLrzqt = values().OLrzqt(strHDKMBd);
        if (resultOLrzqt != null) {
            Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            DexPresetResultVO dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
            if (dexPresetResultVO != null) {
                final QuotePriceRes quotePriceResAxsJAYsNCnLh = values().AxsJAYsNCnLh();
                if (quotePriceResAxsJAYsNCnLh == null) {
                    return null;
                }
                PresetUserConfigBean presetUserConfigBean = (PresetUserConfigBean) CollectionsKt___CollectionsKt.firstOrNull(dexPresetResultVO.getDexPresetResultVOList());
                if (presetUserConfigBean != null && (buyPreset = presetUserConfigBean.getBuyPreset()) != null) {
                    DeFiPlatformForSwap selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform();
                    C25416iwM c25416iwMDCUTEI = values().DCUTEI();
                    SlippageMode slippageModeCopydefault = c25416iwMDCUTEI.copydefault();
                    InterfaceC9738bbJ interfaceC9738bbJQSLkRj = values().QSLkRj();
                    boolean z = interfaceC9738bbJQSLkRj != null && interfaceC9738bbJQSLkRj.getFieldNames();
                    PresetRouteType presetRouteTypeKWHzl = KWHzl(z, strHDKMBd, quotePriceResAxsJAYsNCnLh);
                    SwapPriorityFeeInfo priorityFeeInfo = quotePriceResAxsJAYsNCnLh.getPriorityFeeInfo();
                    boolean zCopydefault = copydefault(z, dexPresetResultVO, priorityFeeInfo);
                    boolean zEZpvd = EZpvd(quotePriceResAxsJAYsNCnLh, z, strHDKMBd, zCopydefault);
                    MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsOLrzqt = isConnected().OLrzqt(strHDKMBd, zEZpvd, priorityFeeInfo == null ? new SwapPriorityFeeInfo((List) null, (NonMevPriorityFeeInfo) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : priorityFeeInfo, quotePriceResAxsJAYsNCnLh);
                    CommonDexInfo commonDexInfo = quotePriceResAxsJAYsNCnLh.getCommonDexInfo();
                    DexAutoSlippageInfoParam dexAutoSlippageInfoParamAutoSlippageInfo = quotePriceResAxsJAYsNCnLh.autoSlippageInfo();
                    String referenceSlippage = dexAutoSlippageInfoParamAutoSlippageInfo != null ? dexAutoSlippageInfoParamAutoSlippageInfo.getReferenceSlippage() : null;
                    String strKWHzl = C31256lqb.KWHzl(referenceSlippage == null ? "" : referenceSlippage, (Function0<String>) new Function0() { // from class: o.imV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return SwapSingleTradeContentFragment.AEQbTJ(quotePriceResAxsJAYsNCnLh);
                        }
                    });
                    String value2 = z ? MemeChainType.MemeChainTypeOther.getValue() : String.valueOf(dexPresetResultVO.getMemeChainType());
                    String fromNativeTokenSymbol = commonDexInfo.getFromNativeTokenSymbol();
                    DexMultiTokenInfoBean fromToken = commonDexInfo.getFromToken();
                    if (fromToken == null) {
                        fromToken = new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
                    }
                    DexMultiTokenInfoBean dexMultiTokenInfoBean = fromToken;
                    String fromTokenAmount = commonDexInfo.getFromTokenAmount();
                    String fromTokenPrice = commonDexInfo.getFromTokenPrice();
                    boolean supportEip1559 = dexPresetResultVO.getSupportEip1559();
                    String toNativeTokenSymbol = commonDexInfo.getToNativeTokenSymbol();
                    DexMultiTokenInfoBean toToken = commonDexInfo.getToToken();
                    if (toToken == null) {
                        toToken = new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
                    }
                    DexMultiTokenInfoBean dexMultiTokenInfoBean2 = toToken;
                    String strIsSupportDappTrade = quotePriceResAxsJAYsNCnLh.isSupportDappTrade();
                    List<MevInfoBean> mev = priorityFeeInfo != null ? priorityFeeInfo.getMev() : null;
                    if (mev == null) {
                        mev = yDY.AhwBna();
                    }
                    List<MevInfoBean> list = mev;
                    if (priorityFeeInfo == null || (nonMevPriorityFeeInfo = priorityFeeInfo.getNormal()) == null) {
                        nonMevPriorityFeeInfo = new NonMevPriorityFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null);
                    }
                    AdvancedCommonDexInfo advancedCommonDexInfo = new AdvancedCommonDexInfo(fromNativeTokenSymbol, dexMultiTokenInfoBean, fromTokenAmount, fromTokenPrice, (String) null, toNativeTokenSymbol, value2, dexMultiTokenInfoBean2, "", strIsSupportDappTrade, (List) list, nonMevPriorityFeeInfo, Intrinsics.EZpvd((Object) String.valueOf(dexPresetResultVO.getMemeChainType()), (Object) MemeChainType.MemeChainTypeSol.getValue()) && zEZpvd, false, commonDexInfo.isEnableMev(), quotePriceResAxsJAYsNCnLh.getCommonDexInfo().getMevUnstableShowLevel(), commonDexInfo.getNativeTokenUnitPriceUsd(), supportEip1559, commonDexInfo.getCode(), (String) null, commonDexInfo.getTeeSignMarketRelTs(), commonDexInfo.getTeeSignTpslRelTs(), "", 524304, (DefaultConstructorMarker) null);
                    List<DeFiPlatformForSwap> defiPlatformInfoList = quotePriceResAxsJAYsNCnLh.getDefiPlatformInfoList();
                    TraceData traceData = quotePriceResAxsJAYsNCnLh.getTraceData();
                    String defiPlatformId = selectedDeFiPlatform != null ? selectedDeFiPlatform.getDefiPlatformId() : null;
                    AdvancedQuoteUiData advancedQuoteUiData = new AdvancedQuoteUiData(new AdvancedQuoteAndCallData.LegacyLimit(new AdvancedQuoteResponse(advancedCommonDexInfo, traceData, false, (Integer) null, (String) null, (String) null, (List) defiPlatformInfoList, defiPlatformId == null ? "" : defiPlatformId, 56, (DefaultConstructorMarker) null), null));
                    String strZuBGHE = zuBGHE();
                    String strOLrzqt = c25416iwMDCUTEI.OLrzqt(strKWHzl);
                    String str = strOLrzqt == null ? "" : strOLrzqt;
                    if (slippageModeCopydefault == SlippageMode.Fixed) {
                        SlippageFeeType slippageFeeTypeAEQbTJ = c25416iwMDCUTEI.AEQbTJ();
                        if (slippageFeeTypeAEQbTJ == null) {
                            slippageFeeTypeAEQbTJ = SlippageFeeType.SlippageLow;
                        }
                        value = slippageFeeTypeAEQbTJ.getValue();
                    } else {
                        value = SlippageFeeType.SlippageLow.getValue();
                    }
                    int i = value;
                    String strEZpvd = marketTransactionFeeCacheParamsOLrzqt.EZpvd();
                    int value3 = marketTransactionFeeCacheParamsOLrzqt.AEQbTJ().getValue();
                    int value4 = TransactionDirection.TransactionBuy.getValue();
                    String estimateGasFee = selectedDeFiPlatform != null ? selectedDeFiPlatform.getEstimateGasFee() : null;
                    String str2 = estimateGasFee == null ? "" : estimateGasFee;
                    String nativeTokenUnitPriceUsd = commonDexInfo.getNativeTokenUnitPriceUsd();
                    String value5 = presetRouteTypeKWHzl.getValue();
                    Double dAuCTel = C59443zhD.AuCTel(dexPresetResultVO.getPriceImpactValue());
                    boolean supportEip15592 = dexPresetResultVO.getSupportEip1559();
                    String gasPriceUnitDecimal = dexPresetResultVO.getGasPriceUnitDecimal();
                    String mevPriceThreshold = dexPresetResultVO.getMevPriceThreshold();
                    DexMultiTokenInfoBean nativeTokenInfo = dexPresetResultVO.getNativeTokenInfo();
                    Iterator<T> it = C22380heK.OLrzqt.copydefault(zuBGHE()).copydefault().AEQbTJ().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((SlippageConfigVo) next).isCross()) {
                            break;
                        }
                    }
                    SlippageConfigVo slippageConfigVo = (SlippageConfigVo) next;
                    String minValue = slippageConfigVo != null ? slippageConfigVo.getMinValue() : null;
                    if (minValue == null) {
                        minValue = "";
                    }
                    return new AdvancedSettingsContract.Input(strZuBGHE, strHDKMBd, str, i, strKWHzl, strEZpvd, value3, zEZpvd, value4, "", str2, nativeTokenUnitPriceUsd, value5, new AdvancedMainConfig(strHDKMBd, dAuCTel, Boolean.valueOf(supportEip15592), gasPriceUnitDecimal, mevPriceThreshold, value2, nativeTokenInfo, new MinMaxData(quotePriceResAxsJAYsNCnLh.getSlippageFixedMin(strKWHzl, minValue), (selectedDeFiPlatform == null || (autoSlippageInfo2 = selectedDeFiPlatform.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo2.getRecommendSlippageRangeMax()), new PriorityFeeInfo(buyPreset.getFeeConfig().getMax(), buyPreset.getFeeConfig().getMin()), new AdvancedDefaultPreset(Boolean.valueOf(zEZpvd), Integer.valueOf(marketTransactionFeeCacheParamsOLrzqt.AEQbTJ().getValue()), buyPreset.getRouteConfig().getRouterModeType()), (String) null, zCopydefault, false, z ? false : dexPresetResultVO.getSupportCustomGasFee(), 5120, (DefaultConstructorMarker) null), (selectedDeFiPlatform == null || (autoSlippageInfo = selectedDeFiPlatform.getAutoSlippageInfo()) == null) ? null : autoSlippageInfo.toAutoSlippageInfo(), slippageModeCopydefault, c25416iwMDCUTEI.OLrzqt(), null, true, false, TrackOrderType.SWAP, TradeMode.SwapMarket, advancedQuoteUiData, 655360, null);
                }
            }
        }
        return null;
    }

    public static final String AEQbTJ(QuotePriceRes quotePriceRes) {
        return quotePriceRes.autoSlippage();
    }

    public static /* synthetic */ PresetRouteType getRouterModeType$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, boolean z, String str, QuotePriceRes quotePriceRes, int i, Object obj) {
        if ((i & 1) != 0) {
            InterfaceC9738bbJ interfaceC9738bbJQSLkRj = swapSingleTradeContentFragment.values().QSLkRj();
            z = interfaceC9738bbJQSLkRj != null && interfaceC9738bbJQSLkRj.getFieldNames();
        }
        if ((i & 2) != 0) {
            str = swapSingleTradeContentFragment.values().hDKMBd();
        }
        if ((i & 4) != 0) {
            quotePriceRes = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
        }
        return swapSingleTradeContentFragment.KWHzl(z, str, quotePriceRes);
    }

    public final PresetRouteType KWHzl(boolean z, String str, QuotePriceRes quotePriceRes) {
        DexPresetResultVO dexPresetResultVO;
        if (z) {
            return PresetRouteType.RouteTypeNotSupport;
        }
        Result<DexPresetResultVO> resultOLrzqt = values().OLrzqt(str);
        if (resultOLrzqt != null) {
            Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
        } else {
            dexPresetResultVO = null;
        }
        return isConnected().OLrzqt(str, copydefault(false, dexPresetResultVO, quotePriceRes != null ? quotePriceRes.getPriorityFeeInfo() : null), copydefault(str, dexPresetResultVO));
    }

    public static /* synthetic */ boolean isOpenMev$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, QuotePriceRes quotePriceRes, boolean z, String str, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            InterfaceC9738bbJ interfaceC9738bbJQSLkRj = swapSingleTradeContentFragment.values().QSLkRj();
            z = interfaceC9738bbJQSLkRj != null && interfaceC9738bbJQSLkRj.getFieldNames();
        }
        if ((i & 4) != 0) {
            str = swapSingleTradeContentFragment.values().hDKMBd();
        }
        if ((i & 8) != 0) {
            z2 = supportAutoMode$default(swapSingleTradeContentFragment, z, null, quotePriceRes.getPriorityFeeInfo(), 2, null);
        }
        return swapSingleTradeContentFragment.EZpvd(quotePriceRes, z, str, z2);
    }

    public final boolean EZpvd(QuotePriceRes quotePriceRes, boolean z, String str, boolean z2) {
        if (z) {
            return false;
        }
        return isConnected().OLrzqt(str, quotePriceRes.getCommonDexInfo().isEnableMev(), z2, getDefaultRouterModeType$default(this, str, null, 2, null));
    }

    public static /* synthetic */ String getDefaultRouterModeType$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, String str, DexPresetResultVO dexPresetResultVO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = swapSingleTradeContentFragment.values().hDKMBd();
        }
        if ((i & 2) != 0) {
            Result<DexPresetResultVO> resultOLrzqt = swapSingleTradeContentFragment.values().OLrzqt(str);
            if (resultOLrzqt != null) {
                Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
                dexPresetResultVO = (DexPresetResultVO) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
            } else {
                dexPresetResultVO = null;
            }
        }
        return swapSingleTradeContentFragment.copydefault(str, dexPresetResultVO);
    }

    private final String copydefault(String str, DexPresetResultVO dexPresetResultVO) {
        ArrayList<PresetUserConfigBean> dexPresetResultVOList;
        PresetUserConfigBean presetUserConfigBean;
        BuySellPreset buyPreset;
        RouteConfig routeConfig;
        String routerModeType;
        return (dexPresetResultVO == null || (dexPresetResultVOList = dexPresetResultVO.getDexPresetResultVOList()) == null || (presetUserConfigBean = (PresetUserConfigBean) CollectionsKt___CollectionsKt.firstOrNull(dexPresetResultVOList)) == null || (buyPreset = presetUserConfigBean.getBuyPreset()) == null || (routeConfig = buyPreset.getRouteConfig()) == null || (routerModeType = routeConfig.getRouterModeType()) == null) ? PresetRouteType.RouteTypeAuto.getValue() : routerModeType;
    }

    public static /* synthetic */ boolean supportAutoMode$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, boolean z, DexPresetResultVO dexPresetResultVO, SwapPriorityFeeInfo swapPriorityFeeInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            InterfaceC9738bbJ interfaceC9738bbJQSLkRj = swapSingleTradeContentFragment.values().QSLkRj();
            z = interfaceC9738bbJQSLkRj != null && interfaceC9738bbJQSLkRj.getFieldNames();
        }
        if ((i & 2) != 0) {
            Result<DexPresetResultVO> resultOLrzqt = swapSingleTradeContentFragment.values().OLrzqt(swapSingleTradeContentFragment.values().hDKMBd());
            if (resultOLrzqt != null) {
                Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
            } else {
                dexPresetResultVO = null;
            }
        }
        if ((i & 4) != 0) {
            QuotePriceRes quotePriceResAxsJAYsNCnLh = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
            swapPriorityFeeInfo = quotePriceResAxsJAYsNCnLh != null ? quotePriceResAxsJAYsNCnLh.getPriorityFeeInfo() : null;
        }
        return swapSingleTradeContentFragment.copydefault(z, dexPresetResultVO, swapPriorityFeeInfo);
    }

    public final boolean copydefault(boolean z, DexPresetResultVO dexPresetResultVO, SwapPriorityFeeInfo swapPriorityFeeInfo) {
        List<MevInfoBean> mev;
        if (!z) {
            if (dexPresetResultVO != null) {
                return dexPresetResultVO.getSupportAutoMode();
            }
            if (swapPriorityFeeInfo != null && (mev = swapPriorityFeeInfo.getMev()) != null && (!mev.isEmpty())) {
                return true;
            }
        }
        return false;
    }

    public final void iwGUEr() {
        C28110kPg.KWHzl.copydefault(new AbstractC28108kPe.FragmentManager(getNewProxyInstance()));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C30449lbP.copydefault(childFragmentManager, new DialogInterface.OnDismissListener() { // from class: o.imf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                SwapSingleTradeContentFragment.copydefault(this.copydefault, dialogInterface);
            }
        }, new Function0() { // from class: o.ime
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.dvKsVJ(this.KWHzl);
            }
        });
    }

    public static final void copydefault(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DialogInterface dialogInterface) {
        swapSingleTradeContentFragment.dismissLoading();
    }

    public static final Unit dvKsVJ(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.ejfBZ();
        return Unit.INSTANCE;
    }

    public final void ejfBZ() {
        DeFiPlatformForSwap selectedDeFiPlatform;
        String defiPlatformId;
        QuotePriceRes quotePriceResAxsJAYsNCnLh = values().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh == null || (selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform()) == null || (defiPlatformId = selectedDeFiPlatform.getDefiPlatformId()) == null) {
            return;
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C25352ivB.copydefault(fragmentActivityRequireActivity, defiPlatformId, (Function1<? super Boolean, Unit>) new Function1() { // from class: o.imz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.djBIcL(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }, (Function0<Unit>) new Function0() { // from class: o.imP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.RJOkX(this.KWHzl);
            }
        }, (Function0<Unit>) new Function0() { // from class: o.inb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.QbewEr(this.OLrzqt);
            }
        }, (Function0<Unit>) new Function0() { // from class: o.inj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.djBIcL();
            }
        });
        valueOf(EventTrackSubmitType.SUBMIT.getType());
    }

    public static final Unit djBIcL(SwapSingleTradeContentFragment swapSingleTradeContentFragment, boolean z) {
        swapSingleTradeContentFragment.DbNXlk = z;
        return Unit.INSTANCE;
    }

    public static final Unit RJOkX(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        C23317hvu.OLrzqt(true, swapSingleTradeContentFragment.DbNXlk);
        return Unit.INSTANCE;
    }

    public static final Unit QbewEr(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        C28110kPg.KWHzl.copydefault(new AbstractC28108kPe.ActionBar(swapSingleTradeContentFragment.getNewProxyInstance()));
        swapSingleTradeContentFragment.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL() {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void valueOf(String str) {
        String strEZpvd;
        String strEZpvd2;
        Boolean boolValueOf;
        DexPresetResultVO dexPresetResultVO;
        String str2;
        String value;
        int i;
        String str3;
        String value2;
        String strHDKMBd = values().hDKMBd();
        QuotePriceRes quotePriceResAxsJAYsNCnLh = values().AxsJAYsNCnLh();
        PresetRouteType routerModeType$default = getRouterModeType$default(this, false, strHDKMBd, quotePriceResAxsJAYsNCnLh, 1, null);
        Boolean boolValueOf2 = null;
        if (quotePriceResAxsJAYsNCnLh != null) {
            boolValueOf = Boolean.valueOf(isOpenMev$default(this, quotePriceResAxsJAYsNCnLh, false, strHDKMBd, false, 10, null));
            SwapPriorityFeeInfo priorityFeeInfo = quotePriceResAxsJAYsNCnLh.getPriorityFeeInfo();
            MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsOLrzqt = priorityFeeInfo != null ? isConnected().OLrzqt(strHDKMBd, boolValueOf.booleanValue(), priorityFeeInfo, quotePriceResAxsJAYsNCnLh) : null;
            if (marketTransactionFeeCacheParamsOLrzqt == null || (strEZpvd2 = marketTransactionFeeCacheParamsOLrzqt.EZpvd()) == null) {
                strEZpvd2 = "";
            }
            if (marketTransactionFeeCacheParamsOLrzqt == null || (strEZpvd = C25289its.EZpvd(marketTransactionFeeCacheParamsOLrzqt.AEQbTJ().getValue())) == null) {
                strEZpvd = "";
            }
        } else {
            strEZpvd = "";
            strEZpvd2 = strEZpvd;
            boolValueOf = null;
        }
        Result<DexPresetResultVO> resultOLrzqt = values().OLrzqt(strHDKMBd);
        if (resultOLrzqt != null) {
            Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
        } else {
            dexPresetResultVO = null;
        }
        if (dexPresetResultVO != null) {
            boolValueOf2 = Boolean.valueOf(dexPresetResultVO.getSupportEip1559() || Intrinsics.EZpvd((Object) String.valueOf(dexPresetResultVO.getMemeChainType()), (Object) MemeChainType.MemeChainTypeSol.getValue()));
        }
        C23159hsv c23159hsvValues = values();
        String strZuBGHE = zuBGHE();
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.EZpvd(boolValueOf, bool)) {
            value = DexTrackEventParameter.ButtonName.ON.getValue();
        } else {
            if (!Intrinsics.EZpvd(boolValueOf, Boolean.FALSE)) {
                if (boolValueOf != null) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "";
                String mode = (routerModeType$default != PresetRouteType.RouteTypeAuto ? EventTrackingRouteMode.Auto : EventTrackingRouteMode.Manual).getMode();
                i = Application.AEQbTJ[routerModeType$default.ordinal()];
                if (i == 1) {
                    str3 = "";
                } else {
                    if (i == 2) {
                        value2 = DexTrackEventParameter.EventMevType.ANTI_MEV.getValue();
                    } else if (i != 3) {
                        if (i != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str3 = "";
                    } else {
                        value2 = DexTrackEventParameter.EventMevType.FAST.getValue();
                    }
                    str3 = value2;
                }
                String str4 = !Intrinsics.EZpvd(boolValueOf2, bool) ? strEZpvd2 : "";
                Boolean bool2 = Boolean.FALSE;
                AkhnZx().OLrzqt(c23159hsvValues.KWHzl(strZuBGHE, str, str2, mode, str3, str4, !Intrinsics.EZpvd(boolValueOf2, bool2) ? strEZpvd2 : "", !Intrinsics.EZpvd(boolValueOf2, bool) ? strEZpvd : "", !Intrinsics.EZpvd(boolValueOf2, bool2) ? strEZpvd : ""));
            }
            value = DexTrackEventParameter.ButtonName.OFF.getValue();
        }
        str2 = value;
        String mode2 = (routerModeType$default != PresetRouteType.RouteTypeAuto ? EventTrackingRouteMode.Auto : EventTrackingRouteMode.Manual).getMode();
        i = Application.AEQbTJ[routerModeType$default.ordinal()];
        if (i == 1) {
        }
        if (!Intrinsics.EZpvd(boolValueOf2, bool)) {
        }
        Boolean bool22 = Boolean.FALSE;
        AkhnZx().OLrzqt(c23159hsvValues.KWHzl(strZuBGHE, str, str2, mode2, str3, str4, !Intrinsics.EZpvd(boolValueOf2, bool22) ? strEZpvd2 : "", !Intrinsics.EZpvd(boolValueOf2, bool) ? strEZpvd : "", !Intrinsics.EZpvd(boolValueOf2, bool22) ? strEZpvd : ""));
    }

    private final void AxsJAY() {
        Unit unit;
        InterfaceC9738bbJ interfaceC9738bbJQSLkRj = values().QSLkRj();
        if (interfaceC9738bbJQSLkRj != null) {
            if (interfaceC9738bbJQSLkRj.zLjUOn()) {
                wlaJM();
                unit = Unit.INSTANCE;
            } else {
                FragmentActivity activity = getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov != null) {
                    String strZuBGHE = zuBGHE();
                    androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    C31205lpd.AEQbTJ(abstractActivityC33041mov, strZuBGHE, parentFragmentManager, interfaceC9738bbJQSLkRj);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        wlaJM();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void wlaJM() {
        String originContractAddress;
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(zuBGHE()).fARcdN();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = values().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = values().QUSxYX().copydefault();
        if (dexMultiTokenInfoBeanCopydefault2 == null || !dexMultiTokenInfoBeanCopydefault2.isMainChainCoin()) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault3 = values().QUSxYX().copydefault();
            originContractAddress = dexMultiTokenInfoBeanCopydefault3 != null ? dexMultiTokenInfoBeanCopydefault3.getOriginContractAddress() : null;
            if (originContractAddress == null) {
                originContractAddress = "";
            }
        }
        InterfaceC23194htd.Application.showRechargeDialog$default(interfaceC23194htdFARcdN, abstractActivityC33041mov, chainId, originContractAddress, null, null, null, 56, null);
        valueOf(EventTrackSubmitType.DEPOSIT.getType());
    }

    public final void fIwbmz() {
        QuotePriceRes quotePriceResAxsJAYsNCnLh;
        if (isConnected().EZpvd(values().hDKMBd()) && (quotePriceResAxsJAYsNCnLh = values().AxsJAYsNCnLh()) != null && quotePriceResAxsJAYsNCnLh.isOKXPlatform() && !C22416heu.AuCTel()) {
            dismissLoading();
            EZpvd(isConnected().EZpvd(), new Function0() { // from class: o.inl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapSingleTradeContentFragment.aKErDB(this.KWHzl);
                }
            });
        } else {
            iwGUEr();
        }
    }

    public static final Unit aKErDB(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        C28110kPg.KWHzl.copydefault(new AbstractC28108kPe.TaskDescription(swapSingleTradeContentFragment.getNewProxyInstance()));
        swapSingleTradeContentFragment.iwGUEr();
        return Unit.INSTANCE;
    }

    public final C28109kPf getNewProxyInstance() {
        TraceData traceData;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = values().QUSxYX().copydefault();
        String quoteId = null;
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        String str = chainId == null ? "" : chainId;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = values().QUSxYX().copydefault();
        String chainName = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getChainName() : null;
        String str2 = chainName == null ? "" : chainName;
        QuotePriceRes quotePriceResAxsJAYsNCnLh = values().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null && (traceData = quotePriceResAxsJAYsNCnLh.getTraceData()) != null) {
            quoteId = traceData.getQuoteId();
        }
        return new C28109kPf(str, str2, "swap", "swap", quoteId == null ? "" : quoteId, isConnected().EZpvd(values().hDKMBd()));
    }

    private final void EZpvd(StateFlow<C30457lbX> stateFlow, final Function0<Unit> function0) {
        TradeConfirmOrderSheet tradeConfirmOrderSheetCopydefault = TradeConfirmOrderSheet.Companion.copydefault(stateFlow, null, new Function0() { // from class: o.imk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SwapSingleTradeContentFragment.KWHzl(function0);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        String strValueOf = C56524yIo.AEQbTJ(TradeConfirmOrderSheet.class).valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        tradeConfirmOrderSheetCopydefault.show(childFragmentManager, strValueOf);
    }

    public static final Unit KWHzl(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.tee.swap.market.ui.viewmodel.SingleSwapMarketPlaceOrderViewModel.submitPlaceOrder$default(com.okinc.business.dex.tee.swap.market.ui.viewmodel.SingleSwapMarketPlaceOrderViewModel, boolean, java.lang.String, com.okinc.business.dex.tee.domain.model.PlaceOrderParams, com.okinc.business.dexlogic.bean.QuotePriceRes, androidx.fragment.app.FragmentActivity, o.bbL$TaskDescription, boolean, int, java.lang.Object):void */
    public final void OLrzqt(QuotePriceRes quotePriceRes) {
        boolean zIsOpenMev$default = isOpenMev$default(this, quotePriceRes, false, null, false, 14, null);
        PlaceOrderParams placeOrderParamsHCLrkq = values().hCLrkq();
        PresetRouteType routerModeType$default = getRouterModeType$default(this, false, null, quotePriceRes, 3, null);
        SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModelIsConnected = isConnected();
        String value = routerModeType$default.getValue();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        singleSwapMarketPlaceOrderViewModelIsConnected.KWHzl(zIsOpenMev$default, value, placeOrderParamsHCLrkq, quotePriceRes, fragmentActivityRequireActivity, new AssistContent(), (64 & 64) != 0 ? false : false);
    }

    public static final class AssistContent implements InterfaceC9740bbL.TaskDescription {
        public AssistContent() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            SwapSingleTradeContentFragment.this.isConnected().EZpvd(true);
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
            SwapSingleTradeContentFragment.this.isConnected().EZpvd(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AuCTelauCTel() {
        boolean supportCustomGasFee;
        String data;
        boolean supportAutoMode;
        Boolean boolValueOf;
        String str;
        List<MevInfoBean> mev;
        MevInfoBean mevInfoBeanKWHzl;
        String strKWHzl;
        TradeInputGroup data2;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data3;
        FromToBalance balance;
        final QuotePriceRes quotePriceResAxsJAYsNCnLh = values().AxsJAYsNCnLh();
        if (quotePriceResAxsJAYsNCnLh != null) {
            String strHDKMBd = values().hDKMBd();
            if (isConnected().EZpvd(strHDKMBd) && quotePriceResAxsJAYsNCnLh.isOKXPlatform() && !C22416heu.AuCTel()) {
                showLoading();
                OLrzqt(quotePriceResAxsJAYsNCnLh);
                return;
            }
            InterfaceC9738bbJ interfaceC9738bbJQSLkRj = values().QSLkRj();
            if (interfaceC9738bbJQSLkRj != null && interfaceC9738bbJQSLkRj.getFieldNames()) {
                dismissLoading();
                C55328xhq.show$default(C55328xhq.OLrzqt, getString(C23274hvD.Fragment.HJWChPfrwjPh), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                return;
            }
            C25416iwM c25416iwMDCUTEI = values().DCUTEI();
            boolean zIsOpenMev$default = isOpenMev$default(this, quotePriceResAxsJAYsNCnLh, false, strHDKMBd, false, 10, null);
            Result<DexPresetResultVO> resultOLrzqt = values().OLrzqt(strHDKMBd);
            if (resultOLrzqt != null) {
                Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                    objM7386unboximpl = null;
                }
                DexPresetResultVO dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
                supportCustomGasFee = dexPresetResultVO != null ? dexPresetResultVO.getSupportCustomGasFee() : false;
            }
            SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModelIsConnected = isConnected();
            SwapPriorityFeeInfo priorityFeeInfo = quotePriceResAxsJAYsNCnLh.getPriorityFeeInfo();
            if (priorityFeeInfo == null) {
                priorityFeeInfo = new SwapPriorityFeeInfo((List) null, (NonMevPriorityFeeInfo) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            }
            MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsOLrzqt = singleSwapMarketPlaceOrderViewModelIsConnected.OLrzqt(strHDKMBd, zIsOpenMev$default, priorityFeeInfo, quotePriceResAxsJAYsNCnLh);
            InterfaceC9738bbJ interfaceC9738bbJQSLkRj2 = values().QSLkRj();
            boolean z = interfaceC9738bbJQSLkRj2 != null && interfaceC9738bbJQSLkRj2.getFieldNames();
            QuotePriceRes quotePriceResAxsJAYsNCnLh2 = values().AxsJAYsNCnLh();
            String strKWHzl2 = values().finit().KWHzl();
            String strKWHzl3 = C31256lqb.KWHzl(c25416iwMDCUTEI.OLrzqt(quotePriceResAxsJAYsNCnLh.autoSlippage()), (Function0<String>) new Function0() { // from class: o.ima
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapSingleTradeContentFragment.copydefault(quotePriceResAxsJAYsNCnLh);
                }
            });
            boolean z2 = c25416iwMDCUTEI.copydefault() == SlippageMode.Fixed;
            if (quotePriceResAxsJAYsNCnLh.fromToken().isMainChainCoin()) {
                ConsumeData<TradeInputGroup> value = values().dmfpNf().getValue();
                if (value == null || (data2 = value.getData()) == null || (fromData = data2.getFromData()) == null || (data3 = fromData.getData()) == null || (balance = data3.getBalance()) == null || (data = balance.getData()) == null) {
                    data = "";
                }
            } else {
                data = "0";
            }
            C22901hoB c22901hoBZuBGHE = values().zuBGHE();
            String str2 = (c22901hoBZuBGHE == null || (strKWHzl = c22901hoBZuBGHE.KWHzl()) == null) ? "" : strKWHzl;
            String strAhwBna = values().finit().AhwBna();
            DefiChainInfo newProxyInstance = values().getNewProxyInstance();
            String gasPriceScalar = newProxyInstance != null ? newProxyInstance.getGasPriceScalar() : null;
            String str3 = gasPriceScalar == null ? "" : gasPriceScalar;
            if (resultOLrzqt != null) {
                Object objM7386unboximpl2 = resultOLrzqt.m7386unboximpl();
                if (Result.m7383isFailureimpl(objM7386unboximpl2)) {
                    objM7386unboximpl2 = null;
                }
                DexPresetResultVO dexPresetResultVO2 = (DexPresetResultVO) objM7386unboximpl2;
                supportAutoMode = dexPresetResultVO2 != null ? dexPresetResultVO2.getSupportAutoMode() : false;
            }
            TransactionBean.SwapType swapType = TransactionBean.SwapType.ADVANCE;
            DeFiPlatformForSwap selectedDeFiPlatform = quotePriceResAxsJAYsNCnLh.getSelectedDeFiPlatform();
            ServiceFeeInfo serviceFeeInfo = selectedDeFiPlatform != null ? selectedDeFiPlatform.getServiceFeeInfo() : null;
            String strOLrzqt = c25416iwMDCUTEI.OLrzqt();
            SlippageMode slippageModeCopydefault = c25416iwMDCUTEI.copydefault();
            SlippageFeeType slippageFeeTypeAEQbTJ = c25416iwMDCUTEI.AEQbTJ();
            String strEZpvd = !supportCustomGasFee ? null : marketTransactionFeeCacheParamsOLrzqt.EZpvd();
            if (supportCustomGasFee) {
                boolValueOf = Boolean.valueOf(marketTransactionFeeCacheParamsOLrzqt.AEQbTJ() == PriorityFeeType.PriorityCustom);
            } else {
                boolValueOf = null;
            }
            String strValueOf = !supportCustomGasFee ? null : String.valueOf(marketTransactionFeeCacheParamsOLrzqt.AEQbTJ().getValue());
            if (zIsOpenMev$default) {
                SwapPriorityFeeInfo priorityFeeInfo2 = quotePriceResAxsJAYsNCnLh.getPriorityFeeInfo();
                String name = (priorityFeeInfo2 == null || (mev = priorityFeeInfo2.getMev()) == null || (mevInfoBeanKWHzl = C22340hdX.KWHzl(mev)) == null) ? null : mevInfoBeanKWHzl.getName();
                if (name != null) {
                    str = name;
                }
            } else {
                str = "";
            }
            String strAEQbTJ = !supportCustomGasFee ? null : isConnected().AEQbTJ(strHDKMBd, zIsOpenMev$default, quotePriceResAxsJAYsNCnLh.getPriorityFeeInfo());
            AccountInfo accountInfoAEQbTJ = isConnected().AEQbTJ(values().hDKMBd(), AYXKKw().copydefault());
            PresetRouteType presetRouteTypeKWHzl = KWHzl(z, strHDKMBd, quotePriceResAxsJAYsNCnLh2);
            TeeSaStatus teeSaStatusAEQbTJ = isConnected().AEQbTJ(strHDKMBd);
            kTW ktwAYXKKw = AYXKKw();
            boolean zIsOKXPlatform = quotePriceResAxsJAYsNCnLh.isOKXPlatform();
            QuotePriceRes quotePriceResAxsJAYsNCnLh3 = values().AxsJAYsNCnLh();
            TransactionBean transactionBean = new TransactionBean(strKWHzl2, strKWHzl3, z2, data, str2, quotePriceResAxsJAYsNCnLh, strAhwBna, str3, "", (TransactionType) null, (OrderIdTypeData) null, (String) null, (String) null, (Integer) null, zIsOpenMev$default, supportAutoMode, 0L, (String) null, swapType, (MergeCallData) null, serviceFeeInfo, slippageModeCopydefault, strOLrzqt, slippageFeeTypeAEQbTJ, strEZpvd, boolValueOf, strValueOf, str, strAEQbTJ, accountInfoAEQbTJ, presetRouteTypeKWHzl, teeSaStatusAEQbTJ, ktwAYXKKw.KWHzl(false, zIsOKXPlatform, quotePriceResAxsJAYsNCnLh3 != null && quotePriceResAxsJAYsNCnLh3.isAutoConfirmQuotaRemaining()), 736768, 0, (DefaultConstructorMarker) null);
            Intent intent = new Intent(getActivity(), (Class<?>) ActivityC25050ipR.class);
            C31200lpY.EZpvd(intent, zuBGHE());
            intent.putExtra("data", transactionBean);
            intent.putExtra("swap_type", true);
            ActivityResultLauncher<Intent> activityResultLauncherAYXKKw = values().AYXKKw();
            if (activityResultLauncherAYXKKw != null) {
                activityResultLauncherAYXKKw.launch(intent);
            }
        }
    }

    public static final String copydefault(QuotePriceRes quotePriceRes) {
        return quotePriceRes.autoSlippage();
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(PresetRouteType presetRouteType, Continuation<? super Unit> continuation) {
            SwapSingleTradeContentFragment.this.values().EZpvd(presetRouteType);
            return Unit.INSTANCE;
        }
    }

    private final void copydefault(final hBP hbp) {
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().AhwBna(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().copydefault(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().djBIcL(), null, new Fragment(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().AEQbTJ(), null, new FragmentManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, new ActionBar(isConnected().OLrzqt()), null, PendingIntent.KWHzl, 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().valueOf(), null, new LoaderManager(), 2, null);
        values().accept().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.ini
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.OLrzqt(this.KWHzl, (java.lang.Throwable) obj);
            }
        }));
        values().iZzfmt().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.iny
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AEQbTJ(this.EZpvd, (PreCheckBean) obj);
            }
        }));
        values().DBxZfM().observe(this, new PictureInPictureParams(new Function1() { // from class: o.inH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AYXKKw(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        fetchVPNInfo().EZpvd().observeForever(this.fIwbmz);
        C23314hvr<Boolean> c23314hvrOLrzqt = getFieldNames().OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c23314hvrOLrzqt.observe(viewLifecycleOwner, new PictureInPictureParams(new Function1() { // from class: o.inK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.gEmmrt(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        values().QKVWgx().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.djBIcL(this.EZpvd, (DexMultiTokenInfoBean) obj);
            }
        }));
        values().RKDWNf().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AhwBna(this.OLrzqt, (DexMultiTokenInfoBean) obj);
            }
        }));
        values().dvKsVJ().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.djBIcL(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        C22380heK.OLrzqt.copydefault(zuBGHE()).EZpvd(true).valueOf().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(this.copydefault, (TradeParam) obj);
            }
        }));
        C23314hvr<String> c23314hvrRdAHlO = values().RdAHlO();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c23314hvrRdAHlO.observe(viewLifecycleOwner2, new Observer() { // from class: o.inN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapSingleTradeContentFragment.OLrzqt((java.lang.String) obj);
            }
        });
        C23314hvr<Boolean> c23314hvrValueOf = values().valueOf();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c23314hvrValueOf.observe(viewLifecycleOwner3, new PictureInPictureParams(new Function1() { // from class: o.ilK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.valueOf(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        values().OBJEWx().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.ink
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(this.OLrzqt, hbp, (java.lang.Boolean) obj);
            }
        }));
        values().fJNWhG().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AhwBna(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        values().hUfVAv().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AEQbTJ(this.KWHzl, (ConsumeData) obj);
            }
        }));
        values().OJuSTm().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(this.OLrzqt, (kotlin.Pair) obj);
            }
        }));
        values().QKudOq().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.ino
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(hbp, this, (java.lang.Boolean) obj);
            }
        }));
        C23314hvr<String> c23314hvrAhwBna = values().AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c23314hvrAhwBna.observe(viewLifecycleOwner4, new PictureInPictureParams(new Function1() { // from class: o.inn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        values().dmfpNf().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.ins
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.EZpvd(this.OLrzqt, hbp, (ConsumeData) obj);
            }
        }));
        values().AubY().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.copydefault(this.AEQbTJ, hbp, (QuotePriceRes) obj);
            }
        }));
        values().djBIcL().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AEQbTJ(hbp, this, (ConsumeData) obj);
            }
        }));
        values().dHguZz().getCurrentState().observe(this, this.AwvSrB);
        values().QOLQEE().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.valueOf(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        values().getPostValueLengthLimit().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.isConnected(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        values().QkdxfA().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AEQbTJ(hbp, this, (java.lang.Boolean) obj);
            }
        }));
        values().OcIXYQ().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AYXKKw(hbp, this, (java.lang.Boolean) obj);
            }
        }));
        hbp.OLrzqt.copydefault(new View.OnFocusChangeListener() { // from class: o.inw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                SwapSingleTradeContentFragment.AEQbTJ(this.copydefault, view, z);
            }
        });
        hbp.OLrzqt.EZpvd(new View.OnFocusChangeListener() { // from class: o.inD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z) {
                SwapSingleTradeContentFragment.OLrzqt(this.OLrzqt, view, z);
            }
        });
        values().DTwDnp().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AEQbTJ(hbp, (java.lang.Boolean) obj);
            }
        }));
        values().gkJEwt().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.KWHzl(hbp, this, (kotlin.Pair) obj);
            }
        }));
        values().DCJXGO().observe(getViewLifecycleOwner(), new Observer() { // from class: o.inF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapSingleTradeContentFragment.values(this.KWHzl, (java.lang.Boolean) obj);
            }
        });
        values().hrNTAI().observe(getViewLifecycleOwner(), new Observer() { // from class: o.inG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                SwapSingleTradeContentFragment.KWHzl((java.lang.String) obj);
            }
        });
        values().zLjUOn().gEmmrt().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.AYXKKw(this.copydefault, (java.lang.String) obj);
            }
        }));
        values().zLjUOn().copydefault().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.inI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.djBIcL(this.KWHzl, (java.lang.String) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5), null, null, new SwapSingleTradeContentFragment$addDataListener$39(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner6), null, null, new SwapSingleTradeContentFragment$addDataListener$40(this, hbp, null), 3, null);
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner7), null, null, new SwapSingleTradeContentFragment$addDataListener$41(this, null), 3, null);
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(MarketTransactionFeeCacheParams marketTransactionFeeCacheParams, Continuation<? super Unit> continuation) {
            SwapSingleTradeContentFragment.this.values().KWHzl(marketTransactionFeeCacheParams);
            return Unit.INSTANCE;
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return copydefault(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            SwapSingleTradeContentFragment.this.values().DbNXlk(z);
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return OLrzqt(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                SwapSingleTradeContentFragment.this.showLoading();
            } else {
                SwapSingleTradeContentFragment.this.dismissLoading();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class PendingIntent<T> implements FlowCollector {
        public static final PendingIntent<T> KWHzl = new PendingIntent<>();

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.hrq.clearInput$default(o.hrq, boolean, int, java.lang.Object):void */
        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(SignAndBroadcastRes signAndBroadcastRes, Continuation<? super Unit> continuation) {
            AbstractC23101hrq.clearInput$default(SwapSingleTradeContentFragment.this.values(), false, 1, null);
            return Unit.INSTANCE;
        }
    }

    public static final Unit OLrzqt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Throwable th) {
        updateReminderView$default(swapSingleTradeContentFragment, null, th, null, 5, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapSingleTradeContentFragment swapSingleTradeContentFragment, PreCheckBean preCheckBean) {
        if (preCheckBean != null && !preCheckBean.isSupportQuote()) {
            updateReminderView$default(swapSingleTradeContentFragment, null, null, null, 7, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        swapSingleTradeContentFragment.isConnected().AYXKKw();
        swapSingleTradeContentFragment.isConnected().KWHzl();
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, boolean z) {
        if (z) {
            swapSingleTradeContentFragment.values().valueOf(true);
            swapSingleTradeContentFragment.fetchVPNInfo().valueOf();
        }
        updateReminderView$default(swapSingleTradeContentFragment, null, null, null, 7, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        swapSingleTradeContentFragment.EZpvd(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        swapSingleTradeContentFragment.AEQbTJ(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            swapSingleTradeContentFragment.showLoadingAtOnceCannotCancel();
        } else {
            swapSingleTradeContentFragment.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapSingleTradeContentFragment swapSingleTradeContentFragment, TradeParam tradeParam) {
        if (!Intrinsics.EZpvd(tradeParam, TradeParam.Companion.AEQbTJ())) {
            C23159hsv c23159hsvValues = swapSingleTradeContentFragment.values();
            Intrinsics.copydefault(tradeParam);
            c23159hsvValues.OLrzqt(tradeParam, true);
            swapSingleTradeContentFragment.getFieldNames().OLrzqt().setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
    }

    public static final Unit valueOf(SwapSingleTradeContentFragment swapSingleTradeContentFragment, boolean z) {
        FragmentActivity activity;
        if (z && (activity = swapSingleTradeContentFragment.getActivity()) != null) {
            C25352ivB.KWHzl((Context) activity, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapSingleTradeContentFragment swapSingleTradeContentFragment, final hBP hbp, Boolean bool) {
        if (bool.booleanValue()) {
            swapSingleTradeContentFragment.zLjUOn();
        }
        swapSingleTradeContentFragment.values().copydefault(new Function1() { // from class: o.ilL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.EZpvd(hbp, (InterfaceC9738bbJ) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(hBP hbp, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ != null && interfaceC9738bbJ.getFieldNames()) {
            hbp.OLrzqt.setReverseTipVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        updateReminderView$default(swapSingleTradeContentFragment, gYM.EZpvd.EZpvd(), null, null, 6, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SwapSingleTradeContentFragment swapSingleTradeContentFragment, ConsumeData consumeData) {
        QuoteErrorBean quoteErrorBean = (QuoteErrorBean) consumeData.consumeData();
        if (quoteErrorBean != null && quoteErrorBean.isQuoteErrorValueOutOfScope() && swapSingleTradeContentFragment.values().htlTjW()) {
            Pair pairOLrzqt = C56390yDp.OLrzqt(quoteErrorBean.getCrossMiniAmount(), quoteErrorBean.getCrossMaxAmount());
            if (C23313hvq.KWHzl(quoteErrorBean.getAmount(), pairOLrzqt.getFirst())) {
                swapSingleTradeContentFragment.values().EZpvd(true);
                swapSingleTradeContentFragment.KWHzl(true, (String) pairOLrzqt.getFirst());
                swapSingleTradeContentFragment.values().RlQdEF().disposeQuote();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Pair pair) {
        swapSingleTradeContentFragment.fetchVPNInfo().copydefault((CurrentChain) pair.getFirst());
        swapSingleTradeContentFragment.values().hrNTAI().setValue(((CurrentChain) pair.getFirst()).getData().getChainId());
        if (C22372heC.AEQbTJ(swapSingleTradeContentFragment.zuBGHE())) {
            swapSingleTradeContentFragment.values().DCJXGO().setValue(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(hBP hbp, SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            if (hbp.EZpvd.getVisibility() != 0) {
                swapSingleTradeContentFragment.zLjUOn();
                hbp.valueOf.KWHzl(true);
            }
            hbp.valueOf.OLrzqt(100L);
            SwapState swapStateValueOf = swapSingleTradeContentFragment.values().dNCPSb().valueOf();
            C24614ihE c24614ihE = hbp.AEQbTJ;
            SwapState swapStateIsButtonStateInterception = swapStateValueOf.isButtonStateInterception(swapSingleTradeContentFragment.gEmmrt().OLrzqt());
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapSingleTradeContentFragment.values().QUSxYX().valueOf();
            QuotePriceRes quotePrice = swapSingleTradeContentFragment.values().RlQdEF().getQuotePrice();
            c24614ihE.setTradeStateButton(swapStateIsButtonStateInterception, dexMultiTokenInfoBeanCopydefault, dexMultiTokenInfoBeanValueOf, true, false, quotePrice != null ? quotePrice.getSelectedDeFiPlatform() : null, new Function1() { // from class: o.imd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeContentFragment.AEQbTJ(((java.lang.Boolean) obj).booleanValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(final SwapSingleTradeContentFragment swapSingleTradeContentFragment, String str) {
        DefiChainInfo newProxyInstance = swapSingleTradeContentFragment.values().getNewProxyInstance();
        String baseToken = newProxyInstance != null ? newProxyInstance.getBaseToken() : null;
        if (baseToken == null) {
            baseToken = "";
        }
        String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.RWIpjU, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("nativeToken", baseToken)));
        FragmentActivity activity = swapSingleTradeContentFragment.getActivity();
        if (activity != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.setTitle(strKWHzl);
            viewOnClickListenerC54939xaY.EZpvd(str);
            viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.adjustVolume, new View.OnClickListener() { // from class: o.imc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    SwapSingleTradeContentFragment.copydefault(viewOnClickListenerC54939xaY, swapSingleTradeContentFragment, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.MediaBrowserCompatMediaItemFlags, new View.OnClickListener() { // from class: o.ilZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    SwapSingleTradeContentFragment.copydefault(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, SwapSingleTradeContentFragment swapSingleTradeContentFragment, View view) {
        viewOnClickListenerC54939xaY.dismiss();
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(swapSingleTradeContentFragment.zuBGHE()).fARcdN();
        FragmentActivity fragmentActivityRequireActivity = swapSingleTradeContentFragment.requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        interfaceC23194htdFARcdN.copydefault(abstractActivityC33041mov, chainId, "");
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit EZpvd(SwapSingleTradeContentFragment swapSingleTradeContentFragment, hBP hbp, ConsumeData consumeData) {
        DexMultiTokenInfoBean data;
        TradeInputGroup tradeInputGroup = (TradeInputGroup) consumeData.consumeData();
        if (tradeInputGroup != null) {
            swapSingleTradeContentFragment.AubY();
            swapSingleTradeContentFragment.hDKMBd().AEQbTJ(yDY.gEmmrt(swapSingleTradeContentFragment.values().QUSxYX().copydefault(), swapSingleTradeContentFragment.values().QUSxYX().valueOf()));
            TradeInputData tradeInputDataConsumeData = tradeInputGroup.getFromData().consumeData();
            if (tradeInputDataConsumeData != null) {
                tradeInputDataConsumeData.setFrom(true);
                hbp.OLrzqt.setFromData(swapSingleTradeContentFragment.values().finit().OLrzqt(tradeInputDataConsumeData));
            }
            TradeInputData tradeInputDataConsumeData2 = tradeInputGroup.getToData().consumeData();
            if (tradeInputDataConsumeData2 != null) {
                tradeInputDataConsumeData2.setFrom(false);
                hbp.OLrzqt.setToData(swapSingleTradeContentFragment.values().finit().OLrzqt(tradeInputDataConsumeData2));
            }
            swapSingleTradeContentFragment.values().WS();
            C25293itw c25293itwAhwBna = C22380heK.OLrzqt.copydefault(swapSingleTradeContentFragment.zuBGHE()).fJNWhG().AhwBna();
            if (c25293itwAhwBna.KWHzl(2)) {
                return Unit.INSTANCE;
            }
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
            if (dexMultiTokenInfoBeanCopydefault != null) {
                DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapSingleTradeContentFragment.values().QUSxYX().valueOf();
                if (dexMultiTokenInfoBeanValueOf == null) {
                    dexMultiTokenInfoBeanValueOf = new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
                }
                c25293itwAhwBna.EZpvd(2, dexMultiTokenInfoBeanCopydefault, dexMultiTokenInfoBeanValueOf);
            }
            if (swapSingleTradeContentFragment.values().zLjUOn().KWHzl().getValue() != null && (data = tradeInputGroup.getFromData().getData().getCoinData().getData()) != null) {
                swapSingleTradeContentFragment.values().QUSxYX().KWHzl(data, true);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final SwapSingleTradeContentFragment swapSingleTradeContentFragment, hBP hbp, QuotePriceRes quotePriceRes) {
        C25049ipQ c25049ipQ;
        SwapState swapStateValueOf = swapSingleTradeContentFragment.values().dNCPSb().valueOf();
        C24614ihE c24614ihE = hbp.AEQbTJ;
        SwapState swapStateIsButtonStateInterception = swapStateValueOf.isButtonStateInterception(swapSingleTradeContentFragment.gEmmrt().OLrzqt());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapSingleTradeContentFragment.values().QUSxYX().valueOf();
        QuotePriceRes quotePrice = swapSingleTradeContentFragment.values().RlQdEF().getQuotePrice();
        DexPresetResultVO dexPresetResultVO = null;
        c24614ihE.setTradeStateButton(swapStateIsButtonStateInterception, dexMultiTokenInfoBeanCopydefault, dexMultiTokenInfoBeanValueOf, true, (16 & 16) != 0, (16 & 32) != 0 ? null : quotePrice != null ? quotePrice.getSelectedDeFiPlatform() : null, new Function1() { // from class: o.imi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.copydefault(((java.lang.Boolean) obj).booleanValue());
            }
        });
        boolean zEZpvd = swapSingleTradeContentFragment.isConnected().EZpvd(swapSingleTradeContentFragment.values().hDKMBd());
        if (swapSingleTradeContentFragment.values().QwvEab() && quotePriceRes.getSuccess()) {
            C25049ipQ c25049ipQ2 = hbp.AYXKKw;
            String strZuBGHE = swapSingleTradeContentFragment.zuBGHE();
            Intrinsics.copydefault(quotePriceRes);
            C23159hsv c23159hsvValues = swapSingleTradeContentFragment.values();
            androidx.fragment.app.FragmentManager childFragmentManager = swapSingleTradeContentFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            FragmentActivity fragmentActivityRequireActivity = swapSingleTradeContentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c25049ipQ2.EZpvd(strZuBGHE, quotePriceRes, c23159hsvValues, zEZpvd, childFragmentManager, fragmentActivityRequireActivity, new SwapSingleTradeContentFragment$addDataListener$25$2(swapSingleTradeContentFragment), new Function1() { // from class: o.imq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SwapSingleTradeContentFragment.EZpvd(this.KWHzl, (AbstractC22408hem) obj);
                }
            });
            swapSingleTradeContentFragment.zLjUOn();
            Result<DexPresetResultVO> resultOLrzqt = swapSingleTradeContentFragment.values().OLrzqt(swapSingleTradeContentFragment.values().hDKMBd());
            if (resultOLrzqt != null) {
                Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
                dexPresetResultVO = (DexPresetResultVO) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
            }
            swapSingleTradeContentFragment.copydefault(hbp.valueOf.values(), quotePriceRes, dexPresetResultVO);
            hBP hbp2 = (hBP) swapSingleTradeContentFragment.AwvSrB();
            if (hbp2 != null && (c25049ipQ = hbp2.AYXKKw) != null) {
                C23159hsv c23159hsvValues2 = swapSingleTradeContentFragment.values();
                String strZuBGHE2 = swapSingleTradeContentFragment.zuBGHE();
                androidx.fragment.app.FragmentManager childFragmentManager2 = swapSingleTradeContentFragment.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                FragmentActivity fragmentActivityRequireActivity2 = swapSingleTradeContentFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
                C25049ipQ.checkError$default(c25049ipQ, c23159hsvValues2, strZuBGHE2, childFragmentManager2, fragmentActivityRequireActivity2, false, new SwapSingleTradeContentFragment$addDataListener$25$4(swapSingleTradeContentFragment), 16, null);
            }
            if (zEZpvd) {
                String strHDKMBd = swapSingleTradeContentFragment.values().hDKMBd();
                SingleSwapMarketPlaceOrderViewModel singleSwapMarketPlaceOrderViewModelIsConnected = swapSingleTradeContentFragment.isConnected();
                String strOLrzqt = swapSingleTradeContentFragment.values().DCUTEI().OLrzqt(quotePriceRes.autoSlippage());
                singleSwapMarketPlaceOrderViewModelIsConnected.copydefault(quotePriceRes, strOLrzqt != null ? strOLrzqt : "", strHDKMBd, isOpenMev$default(swapSingleTradeContentFragment, quotePriceRes, false, strHDKMBd, false, 10, null));
            }
            updateReminderView$default(swapSingleTradeContentFragment, gYM.EZpvd.EZpvd(), null, null, 6, null);
        } else if (quotePriceRes.isReset()) {
            C25049ipQ c25049ipQ3 = hbp.AYXKKw;
            C23159hsv c23159hsvValues3 = swapSingleTradeContentFragment.values();
            androidx.fragment.app.FragmentManager childFragmentManager3 = swapSingleTradeContentFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "");
            FragmentActivity fragmentActivityRequireActivity3 = swapSingleTradeContentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
            c25049ipQ3.copydefault(c23159hsvValues3, childFragmentManager3, fragmentActivityRequireActivity3, swapSingleTradeContentFragment.zuBGHE(), new SwapSingleTradeContentFragment$addDataListener$25$5(swapSingleTradeContentFragment));
            gYM.EZpvd.KWHzl(null);
            updateReminderView$default(swapSingleTradeContentFragment, null, null, null, 7, null);
        } else {
            hbp.AYXKKw.KWHzl();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(boolean z) {
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SwapSingleTradeContentFragment swapSingleTradeContentFragment, AbstractC22408hem abstractC22408hem) {
        Intrinsics.checkNotNullParameter(abstractC22408hem, "");
        if (abstractC22408hem instanceof AbstractC22408hem.Application) {
            if (((AbstractC22408hem.Application) abstractC22408hem).OLrzqt()) {
                swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.AssistContent(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), swapSingleTradeContentFragment.values().DGUQLI(), null, 64, null));
            } else {
                swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.Fragment(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), swapSingleTradeContentFragment.values().DGUQLI(), null, 64, null));
            }
        } else {
            if (!(abstractC22408hem instanceof AbstractC22408hem.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC22408hem.TaskDescription taskDescription = (AbstractC22408hem.TaskDescription) abstractC22408hem;
            swapSingleTradeContentFragment.AkhnZx().OLrzqt(new AbstractC22407hel.ActionBar(swapSingleTradeContentFragment.values().hDKMBd(), EventPageNameType.SWAP.getPageName(), BusinessType.SWAP.getValue(), TrackTransactionDirection.NA.getValue(), TrackOrderType.SWAP.getType(), C56424yEw.gEmmrt(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, taskDescription.AEQbTJ()), C56390yDp.OLrzqt("button_type", taskDescription.KWHzl()))));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ipQ.checkError$default(o.ipQ, o.hrq, java.lang.String, androidx.fragment.app.FragmentManager, androidx.fragment.app.FragmentActivity, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(hBP hbp, SwapSingleTradeContentFragment swapSingleTradeContentFragment, ConsumeData consumeData) {
        C25049ipQ c25049ipQ;
        Boolean bool = (Boolean) consumeData.consumeData();
        if (bool != null && bool.booleanValue()) {
            C25330iug c25330iugValues = hbp.valueOf.values();
            if (c25330iugValues != null) {
                SlippageMode slippageModeCopydefault = swapSingleTradeContentFragment.values().DCUTEI().copydefault();
                C25416iwM c25416iwMDCUTEI = swapSingleTradeContentFragment.values().DCUTEI();
                QuotePriceRes quotePriceResAxsJAYsNCnLh = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
                String strOLrzqt = c25416iwMDCUTEI.OLrzqt(quotePriceResAxsJAYsNCnLh != null ? quotePriceResAxsJAYsNCnLh.autoSlippage() : null);
                if (strOLrzqt == null) {
                    strOLrzqt = "";
                }
                c25330iugValues.setSlippageValue(slippageModeCopydefault, strOLrzqt);
            }
            QuotePriceRes quotePriceResAxsJAYsNCnLh2 = swapSingleTradeContentFragment.values().AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh2 != null) {
                hBP hbp2 = (hBP) swapSingleTradeContentFragment.AwvSrB();
                if (hbp2 != null && (c25049ipQ = hbp2.AYXKKw) != null) {
                    C23159hsv c23159hsvValues = swapSingleTradeContentFragment.values();
                    String strZuBGHE = swapSingleTradeContentFragment.zuBGHE();
                    androidx.fragment.app.FragmentManager childFragmentManager = swapSingleTradeContentFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    FragmentActivity fragmentActivityRequireActivity = swapSingleTradeContentFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    C25049ipQ.checkError$default(c25049ipQ, c23159hsvValues, strZuBGHE, childFragmentManager, fragmentActivityRequireActivity, false, new SwapSingleTradeContentFragment$addDataListener$26$1$1$1(swapSingleTradeContentFragment), 16, null);
                }
                hbp.valueOf.OLrzqt(swapSingleTradeContentFragment.zuBGHE(), swapSingleTradeContentFragment.values(), quotePriceResAxsJAYsNCnLh2);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            swapSingleTradeContentFragment.showLoading();
        } else {
            swapSingleTradeContentFragment.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        swapSingleTradeContentFragment.values().zblBkD();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(hBP hbp, SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        C24795ika c24795ika = hbp.OLrzqt;
        Intrinsics.copydefault(bool);
        c24795ika.setEnableEdit(bool.booleanValue());
        if (!bool.booleanValue()) {
            swapSingleTradeContentFragment.values().isConnected(false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(hBP hbp, SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        C24795ika c24795ika = hbp.OLrzqt;
        Intrinsics.copydefault(bool);
        c24795ika.setFromEnableEdit(bool.booleanValue());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        boolean z = !C22825hmf.OLrzqt.EZpvd(swapSingleTradeContentFragment.zuBGHE(), chainId, true);
        hbp.OLrzqt.setFromBalanceInfoPanelVisibility(z);
        hbp.OLrzqt.setToBalanceInfoPanelVisibility(z);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(SwapSingleTradeContentFragment swapSingleTradeContentFragment, View view, boolean z) {
        swapSingleTradeContentFragment.values().AYXKKw(z);
        pUU.KWHzl("SwapSingleTradeContentFragment", "addFromTextFocusChangedListener()");
    }

    public static final void OLrzqt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, View view, boolean z) {
        swapSingleTradeContentFragment.values().djBIcL(z);
    }

    public static final Unit AEQbTJ(hBP hbp, Boolean bool) {
        if (bool.booleanValue()) {
            hbp.OLrzqt.setProgressBarVisibility(0);
        } else {
            hbp.OLrzqt.setProgressBarVisibility(8);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(hBP hbp, SwapSingleTradeContentFragment swapSingleTradeContentFragment, Pair pair) {
        C25286itp c25286itp;
        C24795ika c24795ika = hbp.OLrzqt;
        Intrinsics.copydefault(c24795ika);
        if (c24795ika.getVisibility() == 0 && (c25286itp = swapSingleTradeContentFragment.ejfBZ) != null) {
            c25286itp.OLrzqt(swapSingleTradeContentFragment.requireActivity(), swapSingleTradeContentFragment.values(), c24795ika, (String) pair.getSecond());
        }
        return Unit.INSTANCE;
    }

    public static final void values(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Boolean bool) {
        String chainId;
        if (bool.booleanValue()) {
            C22380heK.OLrzqt.copydefault(swapSingleTradeContentFragment.zuBGHE()).EZpvd(true).gEmmrt().AEQbTJ();
            C23159hsv c23159hsvValues = swapSingleTradeContentFragment.values();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
            if (dexMultiTokenInfoBeanCopydefault == null || (chainId = dexMultiTokenInfoBeanCopydefault.getChainId()) == null) {
                chainId = "";
            }
            c23159hsvValues.copydefault(chainId);
            return;
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        String str = (String) CollectionsKt___CollectionsKt.RcXXUw(c22380heK.copydefault(swapSingleTradeContentFragment.zuBGHE()).EZpvd(true).gEmmrt().KWHzl().keySet());
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault2 = swapSingleTradeContentFragment.values().QUSxYX().copydefault();
        String chainId2 = dexMultiTokenInfoBeanCopydefault2 != null ? dexMultiTokenInfoBeanCopydefault2.getChainId() : null;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = swapSingleTradeContentFragment.values().QUSxYX().valueOf();
        String chainId3 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (Intrinsics.EZpvd((Object) str, (Object) C24695iig.copydefault(chainId2, chainId3))) {
            return;
        }
        c22380heK.copydefault(swapSingleTradeContentFragment.zuBGHE()).EZpvd(true).gEmmrt().AEQbTJ();
        if (Intrinsics.EZpvd((Object) chainId2, (Object) chainId3)) {
            swapSingleTradeContentFragment.values().copydefault(swapSingleTradeContentFragment.values().QUSxYX().AEQbTJ());
        }
    }

    public static final void KWHzl(String str) {
        C24631ihV c24631ihV = C24631ihV.KWHzl;
        Intrinsics.copydefault((Object) str);
        c24631ihV.OLrzqt("Web3_DEX_SWAP", str);
    }

    public static final Unit AYXKKw(SwapSingleTradeContentFragment swapSingleTradeContentFragment, String str) {
        Bundle bundleBundleOf = BundleKt.bundleOf();
        bundleBundleOf.putInt("result", -1);
        bundleBundleOf.putString("data", str);
        swapSingleTradeContentFragment.OLrzqt(bundleBundleOf);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(SwapSingleTradeContentFragment swapSingleTradeContentFragment, String str) {
        Intrinsics.copydefault((Object) str);
        showNotification$default(swapSingleTradeContentFragment, str, 0, 0L, false, null, 30, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(final C25330iug c25330iug, QuotePriceRes quotePriceRes, DexPresetResultVO dexPresetResultVO) {
        if (c25330iug == null || quotePriceRes == null) {
            return;
        }
        SwapPriorityFeeInfo priorityFeeInfo = quotePriceRes.getPriorityFeeInfo();
        SwapPriorityFeeInfo swapPriorityFeeInfo = priorityFeeInfo == null ? new SwapPriorityFeeInfo((List) null, (NonMevPriorityFeeInfo) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : priorityFeeInfo;
        final String strHDKMBd = values().hDKMBd();
        MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsAEQbTJ = AEQbTJ(strHDKMBd, isOpenMev$default(this, quotePriceRes, false, strHDKMBd, false, 10, null), swapPriorityFeeInfo, quotePriceRes);
        isConnected().copydefault(strHDKMBd, marketTransactionFeeCacheParamsAEQbTJ);
        c25330iug.setPriorityFeeValue(marketTransactionFeeCacheParamsAEQbTJ.copydefault());
        SlippageMode slippageModeCopydefault = values().DCUTEI().copydefault();
        String strOLrzqt = values().DCUTEI().OLrzqt(quotePriceRes.autoSlippage());
        if (strOLrzqt == null) {
            strOLrzqt = "";
        }
        c25330iug.setSlippageValue(slippageModeCopydefault, strOLrzqt);
        final String value = getRouterModeType$default(this, false, strHDKMBd, quotePriceRes, 1, null).getValue();
        final boolean zIsOpenMev$default = isOpenMev$default(this, quotePriceRes, false, strHDKMBd, false, 10, null);
        final String mevUnstableShowLevel = quotePriceRes.getCommonDexInfo().getMevUnstableShowLevel();
        final boolean zSupportAutoMode$default = supportAutoMode$default(this, false, dexPresetResultVO, quotePriceRes.getPriorityFeeInfo(), 1, null);
        c25330iug.post(new Runnable() { // from class: o.ilN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SwapSingleTradeContentFragment.copydefault(strHDKMBd, c25330iug, value, zIsOpenMev$default, mevUnstableShowLevel, zSupportAutoMode$default);
            }
        });
    }

    public static final void copydefault(String str, C25330iug c25330iug, String str2, boolean z, String str3, boolean z2) {
        if (Intrinsics.EZpvd((Object) str, (Object) "501")) {
            c25330iug.setMevDisplayForSol(str2, z, str3, z2);
        } else {
            c25330iug.setMevDisplayForEVM(str2, z, str3, z2);
        }
    }

    public final MarketTransactionFeeCacheParams AEQbTJ(String str, boolean z, SwapPriorityFeeInfo swapPriorityFeeInfo, QuotePriceRes quotePriceRes) {
        MarketTransactionFeeCacheParams marketTransactionFeeCacheParamsOLrzqt = isConnected().OLrzqt(str, z, swapPriorityFeeInfo, quotePriceRes);
        PriorityFeeType priorityFeeTypeAEQbTJ = marketTransactionFeeCacheParamsOLrzqt.AEQbTJ();
        return new MarketTransactionFeeCacheParams(isConnected().AEQbTJ(str, priorityFeeTypeAEQbTJ.getValue(), z, swapPriorityFeeInfo, marketTransactionFeeCacheParamsOLrzqt.EZpvd()), isConnected().copydefault(str, priorityFeeTypeAEQbTJ.getValue(), z, swapPriorityFeeInfo, marketTransactionFeeCacheParamsOLrzqt.EZpvd(), quotePriceRes.estimateGasFee(), quotePriceRes.getCommonDexInfo().getNativeTokenUnitPriceUsd()), priorityFeeTypeAEQbTJ);
    }

    private final void AhwBna(boolean z) {
        this.AuCTel = z;
        C25632jAp c25632jAp = C25632jAp.KWHzl;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        TradingBizType tradingBizType = TradingBizType.AdvancedMarket;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault = values().QUSxYX().copydefault();
        String chainId = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = values().QUSxYX().valueOf();
        String chainId2 = dexMultiTokenInfoBeanValueOf != null ? dexMultiTokenInfoBeanValueOf.getChainId() : null;
        if (chainId2 == null) {
            chainId2 = "";
        }
        c25632jAp.copydefault(childFragmentManager, new C28385kZl(tradingBizType, chainId, chainId2, z, z, null, null, null, 224, null), new Function1() { // from class: o.imh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.values(this.copydefault, (DexMultiTokenInfoBean) obj);
            }
        });
    }

    public static final Unit values(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        onSearchItemClick$default(swapSingleTradeContentFragment, dexMultiTokenInfoBean, false, 2, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.fetchVPNInfo = null;
        this.ejfBZ = null;
        this.gHZMYf = null;
        this.AxsJAY = null;
        this.sSMYrx = null;
        this.zuBGHE = null;
        this.valueOf = null;
        this.iwGUEr = null;
        values().dHguZz().getCurrentState().removeObserver(this.AwvSrB);
        C33050mpD.OLrzqt(this.djBIcL);
        C33050mpD.OLrzqt(this.QKVWgx);
        values().call();
        values().DGOPHZDGOPHZ().AEQbTJ();
        isConnected().KWHzl();
    }

    private final void EZpvd(Bundle bundle) {
        if (bundle == null || bundle.getInt("result") == -1) {
            C22380heK.OLrzqt.copydefault(zuBGHE()).DbNXlk().KWHzl(values().QUSxYX().copydefault(), values().QUSxYX().valueOf(), (bundle != null ? bundle.getBoolean("extra_universal_1", false) : false ? ApproveStatus.CANCEL_APPROVING : ApproveStatus.APPROVING).getType(), values().DarRvM());
            values().dNCPSb().KWHzl();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r8v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(Bundle bundle) {
        String string;
        C25035ipC c25035ipC;
        C25052ipT c25052ipTFetchVPNInfo;
        C25035ipC c25035ipC2;
        LinearLayout linearLayoutFIwbmz;
        if (bundle == null || (string = bundle.getString("data")) == null) {
            string = "";
        }
        if (bundle == null || bundle.getInt("result") == -1) {
            if (C33129mqd.OLrzqt((CharSequence) string)) {
                values().RlQdEF().disposeQuote();
                AbstractC23101hrq.clearInput$default(values(), false, 1, null);
                hBP hbp = (hBP) AwvSrB();
                if (hbp != null && (c25035ipC2 = hbp.valueOf) != null && (linearLayoutFIwbmz = c25035ipC2.fIwbmz()) != null) {
                    linearLayoutFIwbmz.setVisibility(8);
                }
                hBP hbp2 = (hBP) AwvSrB();
                if (hbp2 != null && (c25035ipC = hbp2.valueOf) != null && (c25052ipTFetchVPNInfo = c25035ipC.fetchVPNInfo()) != null) {
                    c25052ipTFetchVPNInfo.setVisibility(8);
                }
                if (gHZMYf() != null) {
                    C22380heK.OLrzqt.copydefault(zuBGHE()).DbNXlk().AEQbTJ(new gKW(true, new gKR(string), null, 4, null));
                    return;
                }
                return;
            }
            return;
        }
        C32866mlf.onEvent$default("app_swap_contract_interaction_reject_click", (TrackChannel[]) null, new Function1() { // from class: o.ilO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.EZpvd(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit EZpvd(SwapSingleTradeContentFragment swapSingleTradeContentFragment, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("user_address", swapSingleTradeContentFragment.values().QCjLjM(), false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onSearchItemClick$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        swapSingleTradeContentFragment.EZpvd(dexMultiTokenInfoBean, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        C25049ipQ c25049ipQ;
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        ConsumeData<TradeInputGroup> value = values().dmfpNf().getValue();
        if (value != null && (data = value.getData()) != null && (fromData = data.getFromData()) != null && (data2 = fromData.getData()) != null && (editData = data2.getEditData()) != null) {
            editData.setMaxData(MultiTransferSignData.DEFAULT_INTERVAL);
        }
        if (this.AuCTel) {
            values().finit().KWHzl(dexMultiTokenInfoBean);
        } else {
            values().finit().AEQbTJ(dexMultiTokenInfoBean);
        }
        if (!values().htlTjW()) {
            setInputHintContent$default(this, false, null, 2, null);
        }
        if (C22372heC.AEQbTJ(zuBGHE())) {
            if (z && values().QUSxYX().AkhnZx()) {
                values().DCJXGO().setValue(Boolean.TRUE);
            }
        } else {
            values().AYXKKw(dexMultiTokenInfoBean.getChainId());
        }
        if (values().QUSxYX().isConnected()) {
            this.fJNWhG = 0;
        }
        values().DGOPHZ();
        getQuotePrice$default(this, false, 1, null);
        hBP hbp = (hBP) AwvSrB();
        if (hbp != null && (c25049ipQ = hbp.AYXKKw) != null) {
            C23159hsv c23159hsvValues = values();
            String strZuBGHE = zuBGHE();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            C25049ipQ.checkError$default(c25049ipQ, c23159hsvValues, strZuBGHE, childFragmentManager, fragmentActivityRequireActivity, false, new SwapSingleTradeContentFragment$onSearchItemClick$1(this), 16, null);
        }
        getFieldNames().OLrzqt().setValue(Boolean.FALSE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.swap.trade.single.advanced.SwapSingleTradeContentFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refresh$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        swapSingleTradeContentFragment.AEQbTJ((Function1<? super Boolean, Unit>) function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(final Function1<? super Boolean, Unit> function1) {
        C25035ipC c25035ipC;
        hBP hbp = (hBP) AwvSrB();
        if (hbp != null && (c25035ipC = hbp.valueOf) != null) {
            c25035ipC.OLrzqt(100L);
        }
        values().DGOPHZ();
        C22380heK.OLrzqt.copydefault(zuBGHE()).DbNXlk().OLrzqt();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanValueOf = values().QUSxYX().valueOf();
        if (dexMultiTokenInfoBeanValueOf != null) {
            C22806hmM c22806hmMDGOPHZDGOPHZ = values().DGOPHZDGOPHZ();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            c22806hmMDGOPHZDGOPHZ.OLrzqt(viewLifecycleOwner, dexMultiTokenInfoBeanValueOf.getTokenContractAddress(), dexMultiTokenInfoBeanValueOf.getChainId(), this.zuBGHE);
        }
        AbstractC23101hrq.getCoinAssets$default(values(), null, 1, null);
        AbstractC23101hrq.getQuotePrice$default(values(), false, false, new Function1() { // from class: o.ina
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.EZpvd(function1, ((java.lang.Boolean) obj).booleanValue());
            }
        }, 3, null);
    }

    public static final Unit EZpvd(Function1 function1, boolean z) {
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showNotification$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, String str, int i, long j, boolean z, Drawable drawable, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 3;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j = 3000;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            drawable = null;
        }
        swapSingleTradeContentFragment.copydefault(str, i3, j2, z2, drawable);
    }

    private final void copydefault(String str, int i, long j, boolean z, Drawable drawable) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        C55097xdX c55097xdX = new C55097xdX(activity, null, 0, 4, null);
        c55097xdX.setTitle(str);
        c55097xdX.setState(i);
        c55097xdX.setType(1);
        c55097xdX.setCloseBtnShow(false);
        c55097xdX.setMessage(null);
        if (z && drawable != null) {
            c55097xdX.setLeadingIcon(drawable);
        }
        C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, j, 0, 0, 0, 28, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zLjUOn() {
        C25035ipC c25035ipC;
        LinearLayout linearLayoutAhwBna;
        hBP hbp = (hBP) AwvSrB();
        if (hbp == null || (c25035ipC = hbp.valueOf) == null || (linearLayoutAhwBna = c25035ipC.AhwBna()) == null) {
            return;
        }
        linearLayoutAhwBna.setVisibility(!gEmmrt().OLrzqt() ? 0 : 8);
    }

    public static /* synthetic */ void getQuotePrice$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        swapSingleTradeContentFragment.valueOf(z);
    }

    private final void valueOf(boolean z) {
        C23159hsv c23159hsvValues = values();
        c23159hsvValues.RlQdEF().disposeQuote();
        AbstractC23101hrq.getQuotePrice$default(c23159hsvValues, z, false, null, 6, null);
    }

    @Override // o.InterfaceC22903hoD
    public void AEQbTJ(final int i) {
        values().copydefault(new Function1() { // from class: o.imb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SwapSingleTradeContentFragment.EZpvd(this.AEQbTJ, i, (InterfaceC9738bbJ) obj);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(SwapSingleTradeContentFragment swapSingleTradeContentFragment, int i, InterfaceC9738bbJ interfaceC9738bbJ) {
        C24795ika c24795ika;
        hBP hbp = (hBP) swapSingleTradeContentFragment.AwvSrB();
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            if (interfaceC9738bbJ == null || interfaceC9738bbJ.getFieldNames()) {
                i = 8;
            }
            c24795ika.setReverseTipVisibility(i);
        }
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC22903hoD
    public void KWHzl() {
        setInputHintContent$default(this, false, null, 2, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC22903hoD
    public void KWHzl(@NotNull Function2<? super C55001xbh, ? super String, Unit> function2, @NotNull Function2<? super C55001xbh, ? super String, Unit> function22) {
        C24795ika c24795ika;
        C24795ika c24795ika2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        hBP hbp = (hBP) AwvSrB();
        if (hbp != null && (c24795ika2 = hbp.OLrzqt) != null) {
            c24795ika2.KWHzl(function2);
        }
        hBP hbp2 = (hBP) AwvSrB();
        if (hbp2 == null || (c24795ika = hbp2.OLrzqt) == null) {
            return;
        }
        c24795ika.AEQbTJ(function22);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC22903hoD
    public void EZpvd(@NotNull Function2<? super C55001xbh, ? super String, Unit> function2, @NotNull Function2<? super C55001xbh, ? super String, Unit> function22) {
        C24795ika c24795ika;
        C24795ika c24795ika2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        hBP hbp = (hBP) AwvSrB();
        if (hbp != null && (c24795ika2 = hbp.OLrzqt) != null) {
            c24795ika2.OLrzqt(function2);
        }
        hBP hbp2 = (hBP) AwvSrB();
        if (hbp2 == null || (c24795ika = hbp2.OLrzqt) == null) {
            return;
        }
        c24795ika.djBIcL(function22);
    }

    public static /* synthetic */ void setInputHintContent$default(SwapSingleTradeContentFragment swapSingleTradeContentFragment, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = "";
        }
        swapSingleTradeContentFragment.KWHzl(z, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl(boolean z, String str) {
        C24795ika c24795ika;
        hBP hbp = (hBP) AwvSrB();
        if (hbp == null || (c24795ika = hbp.OLrzqt) == null) {
            return;
        }
        c24795ika.setInputHintContent(z, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AYXKKw(boolean z) {
        values().KWHzl();
        AbstractC23101hrq.refreshData$default(values(), false, 1, null);
        Function1<? super Boolean, Unit> function1 = this.AxsJAY;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z));
        }
        C57656ymY c57656ymY = C57656ymY.OLrzqt;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C55097xdX c55097xdX = new C55097xdX(contextRequireContext, null, 0, 6, null);
        c55097xdX.setLeadingIcon(C33070mpX.KWHzl(C32113mPz.TaskDescription.AkhnZx));
        c55097xdX.setState(2);
        c55097xdX.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.getStateLabel));
        c55097xdX.setCloseBtnShow(false);
        C57656ymY.showNotificationViewWithToast$default(c57656ymY, c55097xdX, 3000L, 0, 0, 0, 28, null);
    }

    public final AbstractC23101hrq DbNXlk() {
        if (isAdded()) {
            return values();
        }
        return null;
    }

    private final void AubY() {
        if (isVisibled()) {
            C22831hml fieldNames = getFieldNames();
            C22901hoB c22901hoBZuBGHE = values().zuBGHE();
            fieldNames.KWHzl(C23313hvq.copydefault(c22901hoBZuBGHE != null ? c22901hoBZuBGHE.EZpvd() : null, 0));
        }
    }

    private final void zsXlph() {
        if (this.wlaJM == null) {
            Function0 function0 = new Function0() { // from class: o.ilU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapSingleTradeContentFragment.QVAiDq(this.OLrzqt);
                }
            };
            Flow flowAsFlow = FlowLiveDataConversions.asFlow(values().dmfpNf());
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            this.wlaJM = new C22904hoE<>(function0, flowAsFlow, viewLifecycleOwner, new Function0() { // from class: o.ilY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SwapSingleTradeContentFragment.dNCPSb(this.EZpvd);
                }
            });
        }
    }

    public static final String QVAiDq(SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        return swapSingleTradeContentFragment.values().hDKMBd();
    }

    public static final Unit dNCPSb(final SwapSingleTradeContentFragment swapSingleTradeContentFragment) {
        swapSingleTradeContentFragment.values().copydefault(new Function2() { // from class: o.ilR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return SwapSingleTradeContentFragment.OLrzqt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SwapSingleTradeContentFragment swapSingleTradeContentFragment, boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            swapSingleTradeContentFragment.values().dHguZz().initCheckStep();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C25035ipC c25035ipC;
        C24795ika c24795ika;
        super.onDestroyView();
        this.gHZMYf = null;
        this.wlaJM = null;
        hBP hbp = (hBP) AwvSrB();
        if (hbp != null && (c24795ika = hbp.OLrzqt) != null) {
            c24795ika.valueOf();
        }
        hBP hbp2 = (hBP) AwvSrB();
        if (hbp2 != null && (c25035ipC = hbp2.valueOf) != null) {
            c25035ipC.KWHzl();
        }
        fetchVPNInfo().EZpvd().removeObserver(this.fIwbmz);
        C22380heK.OLrzqt.copydefault(zuBGHE()).copydefault().gEmmrt().AEQbTJ();
    }
}

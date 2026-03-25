package com.okinc.business.dexui.main.limitorder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.camera.video.AudioStats;
import androidx.collection.ArrayMap;
import androidx.collection.ArrayMapKt;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
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
import com.okinc.account.api.model.security.otp.OtpEventTracker;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.tee.domain.model.CreateOrderReq;
import com.okinc.business.dex.tee.swap.limit.ui.viewmodel.SingleSwapLimitPlaceOrderViewModel;
import com.okinc.business.dex.tee.swap.limit.ui.viewmodel.SwapLimitHomeViewModel;
import com.okinc.business.dex.trade.common.expire.model.ExpireTimeData;
import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dex.trade.order.domain.model.LimitOrderDetailBean;
import com.okinc.business.dexlogic.MemeChainType;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexAutoSlippageInfoParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.MevUnstableShowLevelType;
import com.okinc.business.dexlogic.bean.NonMevPriorityFeeInfo;
import com.okinc.business.dexlogic.bean.PreCheckBean;
import com.okinc.business.dexlogic.bean.PresetRouteType;
import com.okinc.business.dexlogic.bean.PriorityFeeType;
import com.okinc.business.dexlogic.bean.SlippageFeeType;
import com.okinc.business.dexlogic.bean.TokenInfoForApp;
import com.okinc.business.dexlogic.bean.TraceData;
import com.okinc.business.dexlogic.bean.TransactionDirection;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventConditionEnterBy;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.EventTrackSubmitType;
import com.okinc.business.dexlogic.bean.track.EventTrackingAmountEnterBy;
import com.okinc.business.dexlogic.bean.track.EventTrackingRouteMode;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.main.limmitorder.CheckStep;
import com.okinc.business.dexlogic.main.limmitorder.SwapState;
import com.okinc.business.dexlogic.main.limmitorder.TradeStep;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult;
import com.okinc.business.dexlogic.main.limmitorder.bean.LimitMarketPrice;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.ApproveStatus;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.main.swap.trade.bean.EditTextData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputData;
import com.okinc.business.dexlogic.main.swap.trade.bean.TradeInputGroup;
import com.okinc.business.dexlogic.main.swap.trade.input.helper.IgnoreLastValueObserver;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment;
import com.okinc.business.dexui.main.limitorder.manager.handle.LimitErrorViewHandle;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment;
import com.okinc.business.dexui.main.swap.trade.status.widget.ErrorNoticeView;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.trade.features.home.domain.model.TradingBizType;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet;
import com.okinc.business.trade.features.home.ui.advanced.limit.slippage.AdvanceLimitSlippageCache;
import com.okinc.business.trade.features.home.ui.advanced.limit.widget.LimitOrderRateView;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedCommonDexInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedDefaultPreset;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitOrderInfo;
import com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse;
import com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData;
import com.okinc.business.trade.features.home.ui.cefi.data.MinMaxData;
import com.okinc.business.trade.features.home.ui.cefi.data.PriorityFeeInfo;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.RouteConfig;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$1;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$2;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$3;
import com.okinc.business.utils.FragmentUtils$matchViewModel$$inlined$viewModels$default$4;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.wallet.api.MpcWalletService;
import com.okinc.wallet.api.bean.CurrentWalletSwitchConfig;
import com.okinc.wallet.api.bean.CurrentWalletSwitchNetworkMode;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
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
import o.AbstractC22403heh;
import o.AbstractC22408hem;
import o.AbstractC58260yxt;
import o.C19738gNm;
import o.C19812gQf;
import o.C21759hLg;
import o.C21828hNv;
import o.C21831hNy;
import o.C22370heA;
import o.C22380heK;
import o.C22400hee;
import o.C22409hen;
import o.C22416heu;
import o.C22495hgT;
import o.C22831hml;
import o.C23263hut;
import o.C23271hvA;
import o.C23272hvB;
import o.C23274hvD;
import o.C23310hvn;
import o.C23311hvo;
import o.C23313hvq;
import o.C23314hvr;
import o.C23316hvt;
import o.C23317hvu;
import o.C23328hwE;
import o.C24631ihV;
import o.C24795ika;
import o.C24800ikf;
import o.C24805ikk;
import o.C24806ikl;
import o.C25289its;
import o.C25352ivB;
import o.C25390ivn;
import o.C25415iwL;
import o.C25447iwr;
import o.C25632jAp;
import o.C28385kZl;
import o.C30457lbX;
import o.C31197lpV;
import o.C31200lpY;
import o.C31205lpd;
import o.C32113mPz;
import o.C32866mlf;
import o.C32979mnm;
import o.C33050mpD;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C43251rlk;
import o.C52812wZg;
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
import o.C6965aZN;
import o.InterfaceC22433hfK;
import o.InterfaceC22502hga;
import o.InterfaceC23194htd;
import o.InterfaceC28107kPd;
import o.InterfaceC54855xXv;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC59496ziD;
import o.InterfaceC9738bbJ;
import o.InterfaceC9740bbL;
import o.ViewOnClickListenerC54939xaY;
import o.dTQ;
import o.gLQ;
import o.gOP;
import o.gYT;
import o.hBJ;
import o.hIA;
import o.hKV;
import o.hLE;
import o.hLI;
import o.hLS;
import o.hNI;
import o.hNK;
import o.pUU;
import o.rVN;
import o.xWX;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderContentFragment extends hIA<hBJ> implements hLS, InterfaceC22433hfK, ViewTreeObserver.OnGlobalLayoutListener {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public LimitErrorViewHandle AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public boolean AuCTel;
    public final InterfaceC56387yDm DbNXlk;

    @yCM
    public InterfaceC28107kPd activityScopeCache;

    @yCM
    public C6965aZN dexSwapTracker;

    @yCM
    public C6965aZN dexTradeLimitTracker;
    public final InterfaceC56387yDm ejfBZ;
    public C52812wZg fARcdN;
    public hNI fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public final InterfaceC56387yDm gEmmrt;
    public IgnoreLastValueObserver<DexMultiTokenInfoBean> hDKMBd;

    @yCM
    public C25447iwr handleEventTrackUtils;
    public final Observer<CurrentChain> isConnected;
    public hBJ iwGUEr;
    public IgnoreLastValueObserver<DexMultiTokenInfoBean> uzCIH;
    public final gOP valueOf;
    public boolean values;
    public ActivityResultLauncher<AdvancedSettingsContract.Input> getFieldNames = registerForActivityResult(new AdvancedSettingsContract(), new ActivityResultCallback() { // from class: o.hKg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(java.lang.Object obj) {
            LimitOrderContentFragment.copydefault(this.EZpvd, (AdvancedSettingsContract.Input) obj);
        }
    });
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.hKt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LimitOrderContentFragment.AxsJAYaxsJAY(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.hKs
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LimitOrderContentFragment.flVtFt(this.KWHzl);
        }
    });

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MpcWalletService.MpcWalletAbleStatus.values().length];
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusRefreshed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusSwitch.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MpcWalletService.MpcWalletAbleStatus.OKWMPCWalletStatusNoLogin.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[PresetRouteType.values().length];
            try {
                iArr2[PresetRouteType.RouteTypeAuto.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[PresetRouteType.RouteTypeMev.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[PresetRouteType.RouteTypeFast.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[PresetRouteType.RouteTypeNotSupport.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            EZpvd = iArr2;
            int[] iArr3 = new int[LimitErrorViewHandle.ErrorType.values().length];
            try {
                iArr3[LimitErrorViewHandle.ErrorType.BlackAddress.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.MpcWallet.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.WalletLegal.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.Leverage.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.MinAmount.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.QuoteFailed.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.NoLiquidity.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.RATE_WARNING.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.CANCEL_APPROVE.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.NoLiquidityAtTheMoment.ordinal()] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.FunctionUpgrade.ordinal()] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.SmartAccountStatusError.ordinal()] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.TeeNumLimitWarning.ordinal()] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.HoneyPotWarning.ordinal()] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.SlippageWarning.ordinal()] = 15;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.SwapConfigFetchFailed.ordinal()] = 16;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.HoneyPot.ordinal()] = 17;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[LimitErrorViewHandle.ErrorType.NormalCoin.ordinal()] = 18;
            } catch (NoSuchFieldError unused25) {
            }
            copydefault = iArr3;
        }
    }

    public static final /* synthetic */ class AssistContent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent(Function1 function1) {
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
    @Override // o.AbstractC24860ilm, o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.RbVjfb;
    }

    public static final class TaskStackBuilder implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            Object next;
            Iterator it = C59405zgS.EZpvd(this.OLrzqt, (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super Object, ? extends Object>) C31197lpV.ActionBar.AnonymousClass1.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof DexHomeFragment) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            Object objThrowIfDebug$default = C31200lpY.throwIfDebug$default(this.OLrzqt.requireActivity(), null, 2, null);
            Intrinsics.copydefault(objThrowIfDebug$default);
            return (ViewModelStoreOwner) objThrowIfDebug$default;
        }
    }

    public static final class Application implements Flow<String> {
        public final /* synthetic */ Flow OLrzqt;

        /* JADX INFO: renamed from: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$Application$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(FlowCollector flowCollector) {
                this.OLrzqt = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, Continuation continuation) throws Throwable {
                LimitOrderContentFragment$addDataListener$$inlined$filter$1$2$1 limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1;
                if (continuation instanceof LimitOrderContentFragment$addDataListener$$inlined$filter$1$2$1) {
                    limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1 = (LimitOrderContentFragment$addDataListener$$inlined$filter$1$2$1) continuation;
                    int i = limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1 = new LimitOrderContentFragment$addDataListener$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                Object obj2 = limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1.result;
                Object objCopydefault = C56442yFn.copydefault();
                int i2 = limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.OLrzqt;
                    if (C33129mqd.OLrzqt((CharSequence) obj)) {
                        limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, limitOrderContentFragment$addDataListener$$inlined$filter$1$2$1) == objCopydefault) {
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

        public Application(Flow flow) {
            this.OLrzqt = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
            Object objCollect = this.OLrzqt.collect(new AnonymousClass4(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ hBJ AubY(LimitOrderContentFragment limitOrderContentFragment) {
        return (hBJ) limitOrderContentFragment.AwvSrB();
    }

    public LimitOrderContentFragment() {
        final Function0 function0 = new Function0() { // from class: o.hKp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.gGvvIC(this.EZpvd);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$1
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C22831hml.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$4
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
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.hKv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.gasjUx(this.KWHzl);
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$6
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SingleSwapLimitPlaceOrderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment$special$$inlined$viewModels$default$9
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
        this.ejfBZ = C19812gQf.OLrzqt(this);
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtils$matchViewModel$$inlined$viewModels$default$1(new TaskStackBuilder(this)));
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new FragmentUtils$matchViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtils$matchViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtils$matchViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
        this.AuCTel = true;
        this.values = true;
        this.hDKMBd = new IgnoreLastValueObserver<>(new Function1() { // from class: o.hKy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AYXKKw(this.copydefault, (DexMultiTokenInfoBean) obj);
            }
        });
        this.uzCIH = new IgnoreLastValueObserver<>(new Function1() { // from class: o.hKw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.gEmmrt(this.AEQbTJ, (DexMultiTokenInfoBean) obj);
            }
        });
        this.isConnected = new Observer() { // from class: o.hKx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                LimitOrderContentFragment.EZpvd(this.OLrzqt, (CurrentChain) obj);
            }
        };
        this.valueOf = new gOP(new Function0() { // from class: o.hKu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.valueOf();
            }
        }, new Function0() { // from class: o.hKA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.DTwDnp(this.EZpvd);
            }
        }, new Function0() { // from class: o.hKn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.QOLQEE(this.KWHzl);
            }
        }, new Function0() { // from class: o.hKo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.QKVWgx(this.EZpvd);
            }
        }, new Function0() { // from class: o.hKk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.ORxRYg(this.EZpvd);
            }
        }, new Function0() { // from class: o.hKm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.RJOkX(this.copydefault);
            }
        }, new Function0() { // from class: o.hKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.QUSxYX(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.hKr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.QfsBiF(this.copydefault);
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ LimitOrderContentFragment newInstance$default(ActionBar actionBar, String str, LimitParam limitParam, int i, Object obj) {
            if ((i & 2) != 0) {
                limitParam = null;
            }
            return actionBar.copydefault(str, limitParam);
        }

        public final LimitOrderContentFragment copydefault(@NotNull String str, LimitParam limitParam) {
            Intrinsics.checkNotNullParameter(str, "");
            LimitOrderContentFragment limitOrderContentFragment = new LimitOrderContentFragment();
            Bundle bundle = new Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("data", limitParam);
            limitOrderContentFragment.setArguments(bundle);
            return limitOrderContentFragment;
        }
    }

    public static final void copydefault(LimitOrderContentFragment limitOrderContentFragment, AdvancedSettingsContract.Input input) {
        limitOrderContentFragment.KWHzl(input);
    }

    public final C6965aZN isConnected() {
        C6965aZN c6965aZN = this.dexSwapTracker;
        if (c6965aZN != null) {
            return c6965aZN;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LimitParam QOLQEE() {
        return (LimitParam) this.fetchVPNInfo.getValue();
    }

    public static final LimitParam AxsJAYaxsJAY(LimitOrderContentFragment limitOrderContentFragment) {
        Bundle arguments = limitOrderContentFragment.getArguments();
        LimitParam limitParam = arguments != null ? (LimitParam) ((Parcelable) BundleCompat.getParcelable(arguments, "data", LimitParam.class)) : null;
        if (limitParam instanceof LimitParam) {
            return limitParam;
        }
        return null;
    }

    public final SwapLimitHomeViewModel ejfBZ() {
        return (SwapLimitHomeViewModel) this.AkhnZx.getValue();
    }

    public static final SwapLimitHomeViewModel flVtFt(LimitOrderContentFragment limitOrderContentFragment) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = limitOrderContentFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return (SwapLimitHomeViewModel) new ViewModelProvider(fragmentRequireParentFragment).get(SwapLimitHomeViewModel.class);
    }

    private final C22831hml ORxRYg() {
        return (C22831hml) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner gGvvIC(LimitOrderContentFragment limitOrderContentFragment) {
        Object obj;
        Object next;
        Intrinsics.copydefault(limitOrderContentFragment, "");
        Iterator it = C59405zgS.EZpvd(limitOrderContentFragment, (Function1<? super LimitOrderContentFragment, ? extends LimitOrderContentFragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.hIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return LimitOrderContentFragment.EZpvd((androidx.fragment.app.Fragment) obj2);
            }
        })).iterator();
        while (true) {
            obj = null;
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
        Iterator it2 = C59405zgS.EZpvd(limitOrderContentFragment, (Function1<? super LimitOrderContentFragment, ? extends LimitOrderContentFragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.hJm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return LimitOrderContentFragment.OLrzqt((androidx.fragment.app.Fragment) obj2);
            }
        })).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((androidx.fragment.app.Fragment) next2) instanceof LimitOrderFragment) {
                obj = next2;
                break;
            }
        }
        androidx.fragment.app.Fragment fragment2 = (androidx.fragment.app.Fragment) obj;
        if (fragment2 != null) {
            return fragment2;
        }
        FragmentActivity fragmentActivityRequireActivity = limitOrderContentFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public static final androidx.fragment.app.Fragment EZpvd(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public static final androidx.fragment.app.Fragment OLrzqt(androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public static final class PendingIntent implements ViewModelProvider.Factory {
        public PendingIntent() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C22495hgT(C23328hwE.Companion.OLrzqt(), LimitOrderContentFragment.this.zuBGHE(), LimitOrderContentFragment.this.QOLQEE(), LimitOrderContentFragment.this);
        }
    }

    public final C22495hgT fARcdN() {
        return (C22495hgT) this.DbNXlk.getValue();
    }

    public static final C22495hgT gasjUx(LimitOrderContentFragment limitOrderContentFragment) {
        return (C22495hgT) new ViewModelProvider(limitOrderContentFragment, limitOrderContentFragment.new PendingIntent()).get(C22495hgT.class);
    }

    public final SingleSwapLimitPlaceOrderViewModel fJNWhG() {
        return (SingleSwapLimitPlaceOrderViewModel) this.fJNWhG.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderAndPositionEventViewModel RJOkX() {
        return (OrderAndPositionEventViewModel) this.ejfBZ.getValue();
    }

    private final DexHomeViewModel QKVWgx() {
        return (DexHomeViewModel) this.gEmmrt.getValue();
    }

    public final C6965aZN fetchVPNInfo() {
        C6965aZN c6965aZN = this.dexTradeLimitTracker;
        if (c6965aZN != null) {
            return c6965aZN;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final InterfaceC28107kPd gEmmrt() {
        InterfaceC28107kPd interfaceC28107kPd = this.activityScopeCache;
        if (interfaceC28107kPd != null) {
            return interfaceC28107kPd;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C25447iwr AkhnZx() {
        C25447iwr c25447iwr = this.handleEventTrackUtils;
        if (c25447iwr != null) {
            return c25447iwr;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AYXKKw(LimitOrderContentFragment limitOrderContentFragment, final DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        hNK hnk;
        hNK hnk2;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (hnk2 = hbj.EZpvd) != null) {
            hnk2.setFromInputConfig(new Function1() { // from class: o.hJA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.OLrzqt(dexMultiTokenInfoBean, (C24806ikl) obj);
                }
            });
        }
        hBJ hbj2 = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj2 != null && (hnk = hbj2.EZpvd) != null) {
            if (dexMultiTokenInfoBean != null) {
                boolean z = dexMultiTokenInfoBean.isHighRisk();
                hnk.setFromHighRiskVisible(z);
            }
        }
        return Unit.INSTANCE;
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit gEmmrt(LimitOrderContentFragment limitOrderContentFragment, final DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        hNK hnk;
        hNK hnk2;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (hnk2 = hbj.EZpvd) != null) {
            hnk2.setReceiveInputConfig(new Function1() { // from class: o.hIK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.copydefault(dexMultiTokenInfoBean, (C24806ikl) obj);
                }
            });
        }
        hBJ hbj2 = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj2 != null && (hnk = hbj2.EZpvd) != null) {
            if (dexMultiTokenInfoBean != null) {
                boolean z = dexMultiTokenInfoBean.isHighRisk();
                hnk.setToHighRiskVisible(z);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, C24806ikl c24806ikl) {
        String decimals;
        Intrinsics.checkNotNullParameter(c24806ikl, "");
        if (dexMultiTokenInfoBean == null || (decimals = dexMultiTokenInfoBean.getDecimals()) == null) {
            decimals = "12";
        }
        c24806ikl.setMaxDecimalValue(C22370heA.OLrzqt(decimals));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(final LimitOrderContentFragment limitOrderContentFragment, CurrentChain currentChain) {
        if (currentChain == null) {
            return;
        }
        limitOrderContentFragment.fARcdN().OLrzqt(limitOrderContentFragment.ejfBZ().AEQbTJ().getValue());
        limitOrderContentFragment.fARcdN().copydefault(currentChain.getData());
        limitOrderContentFragment.fARcdN().KWHzl(currentChain);
        View view = limitOrderContentFragment.getView();
        if (view != null) {
            view.postDelayed(new Runnable() { // from class: o.hID
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    LimitOrderContentFragment.giSNqX(this.AEQbTJ);
                }
            }, 300L);
        }
    }

    public static final void giSNqX(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.values = false;
        limitOrderContentFragment.getNewProxyInstance();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) limitOrderContentFragment, true, (String) null, 2, (Object) null);
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC24860ilm
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public hBJ EZpvd(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBJ hbjOLrzqt = hBJ.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hbjOLrzqt, "");
        return hbjOLrzqt;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        iwGUEr();
        if (C23317hvu.AhwBna()) {
            getFieldNames();
        }
        ejfBZ().valueOf();
        fARcdN().htlTjW();
        hLI hliQUSxYX = fARcdN().QUSxYX();
        if (hliQUSxYX != null) {
            hliQUSxYX.KWHzl();
        }
        hLI hliQUSxYX2 = fARcdN().QUSxYX();
        if (hliQUSxYX2 != null) {
            hliQUSxYX2.EZpvd();
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(zuBGHE()).AYXKKw().AEQbTJ().observeForever(this.hDKMBd);
        c22380heK.copydefault(zuBGHE()).AYXKKw().KWHzl().observeForever(this.uzCIH);
        fARcdN().copydefault(new Function2() { // from class: o.hJv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return LimitOrderContentFragment.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
    }

    public static final Unit copydefault(LimitOrderContentFragment limitOrderContentFragment, boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            limitOrderContentFragment.fARcdN().zuWLRA().initCheckStep();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32998moE
    public void onInvisible() {
        C21831hNy c21831hNy;
        ViewTreeObserver viewTreeObserver;
        LimitOrderRateView limitOrderRateView;
        hNK hnk;
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (hnk = hbj.EZpvd) != null) {
            hnk.KWHzl();
            hnk.AEQbTJ();
        }
        hBJ hbj2 = (hBJ) AwvSrB();
        if (hbj2 != null && (limitOrderRateView = hbj2.AEQbTJ) != null) {
            limitOrderRateView.EZpvd();
        }
        hBJ hbj3 = (hBJ) AwvSrB();
        if (hbj3 != null && (c21831hNy = hbj3.AYXKKw) != null && (viewTreeObserver = c21831hNy.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        fARcdN().fjfviF();
        hLI hliQUSxYX = fARcdN().QUSxYX();
        if (hliQUSxYX != null) {
            hliQUSxYX.AhwBna();
        }
        hLI hliQUSxYX2 = fARcdN().QUSxYX();
        if (hliQUSxYX2 != null) {
            hliQUSxYX2.AYXKKw();
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(zuBGHE()).AYXKKw().AEQbTJ().removeObserver(this.hDKMBd);
        c22380heK.copydefault(zuBGHE()).AYXKKw().KWHzl().removeObserver(this.uzCIH);
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC24860ilm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hBJ hbj, Bundle bundle) {
        Intrinsics.checkNotNullParameter(hbj, "");
        fARcdN().copydefault(getActivity());
        hNK hnk = hbj.EZpvd;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        hnk.setLeftRightMargin(C55298xhM.OLrzqt(12, contextRequireContext));
        fARcdN().OLrzqt(new hLI(fARcdN(), this));
        C22495hgT c22495hgTFARcdN = fARcdN();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        this.AYXKKw = new LimitErrorViewHandle(c22495hgTFARcdN, fragmentActivityRequireActivity, this.valueOf);
        hbj.AYXKKw.setLimitContentViewModel(fARcdN());
        hbj.AEQbTJ.setLimitContentViewModel(fARcdN());
        hbj.EZpvd.djBIcL();
        hLI hliQUSxYX = fARcdN().QUSxYX();
        if (hliQUSxYX != null && hliQUSxYX.AEQbTJ()) {
            hbj.AYXKKw.setVisibility(8);
        }
        OcIXYQ();
        DTwDnp();
        C24806ikl c24806iklOLrzqt = hbj.EZpvd.OLrzqt();
        if (c24806iklOLrzqt != null) {
            FragmentActivity fragmentActivityRequireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity2, "");
            hNI hni = new hNI(fragmentActivityRequireActivity2);
            this.fIwbmz = hni;
            hni.setPriceCallback(new Function2() { // from class: o.hJx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return LimitOrderContentFragment.EZpvd(this.KWHzl, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
            FragmentActivity fragmentActivityRequireActivity3 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity3, "");
            new C54978xbK(fragmentActivityRequireActivity3, this.fIwbmz, getViewLifecycleOwner()).copydefault(yEE.gEmmrt(c24806iklOLrzqt));
        }
        C6965aZN.trackPageView$default(fetchVPNInfo(), fARcdN().fARcdN(), EventPageNameType.LIMIT.getPageName(), null, 4, null);
    }

    public static final Unit EZpvd(LimitOrderContentFragment limitOrderContentFragment, String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        limitOrderContentFragment.AEQbTJ(str);
        hNI hni = limitOrderContentFragment.fIwbmz;
        if (hni != null) {
            hni.copydefault(C23313hvq.mulCheckS$default(str, 100, null, null, null, 14, null));
        }
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.isConnected(), limitOrderContentFragment.fIwbmz(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.QUICK_BUTTON.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, C22409hen.KWHzl(i))), null, null, 12, null);
        EventTrackingAmountEnterBy.Companion.AEQbTJ(new EventTrackingAmountEnterBy.TaskDescription(str));
        return Unit.INSTANCE;
    }

    public final String fIwbmz() {
        DexMultiTokenInfoBean value = C22380heK.OLrzqt.copydefault(zuBGHE()).AYXKKw().AEQbTJ().getValue();
        String chainId = value != null ? value.getChainId() : null;
        return chainId == null ? "" : chainId;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (((hBJ) AwvSrB()) != null) {
            fARcdN().AEQbTJ(C23311hvo.formatPercent$default(str, false, 0, 0, null, null, 31, null));
            fARcdN().gEmmrt(str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OcIXYQ() {
        final hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null) {
            ejfBZ().KWHzl().observeForever(this.isConnected);
            fARcdN().AxsJAYsNCnLh().observeForever(this.isConnected);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C59541ziw.EZpvd(activity, this, new InterfaceC59496ziD() { // from class: o.hII
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC59496ziD
                    public final void OLrzqt(boolean z) {
                        LimitOrderContentFragment.EZpvd(this.copydefault, hbj, z);
                    }
                });
            }
            hbj.AYXKKw.setShowTimeSelectCallback(new Function0() { // from class: o.hIX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.QVAiDq(this.EZpvd);
                }
            });
            hbj.AYXKKw.setOnSettingsClickListener(new Function1() { // from class: o.hJl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.AEQbTJ(this.EZpvd, (android.view.View) obj);
                }
            });
            hbj.AYXKKw.setEventTrackingCallback(new Function1() { // from class: o.hJj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.AEQbTJ(this.AEQbTJ, (AbstractC22408hem) obj);
                }
            });
            hbj.EZpvd.setActionCallBack(fARcdN(), new Function0() { // from class: o.hJi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.QbewEr(this.OLrzqt);
                }
            }, new Function0() { // from class: o.hJk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.djSkpj(this.AEQbTJ);
                }
            });
            hbj.EZpvd.setFromCoinSelectClick(new Function1() { // from class: o.hJh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.KWHzl(this.copydefault, (C24795ika) obj);
                }
            });
            hbj.EZpvd.setChainFromSelectClick(new Function1() { // from class: o.hJo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.OLrzqt(this.copydefault, (C24800ikf) obj);
                }
            });
            hbj.EZpvd.setToCoinSelectClick(new Function1() { // from class: o.hJn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.AEQbTJ(this.AEQbTJ, (C24795ika) obj);
                }
            });
            hbj.EZpvd.setChainToSelectClick(new Function1() { // from class: o.hJp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.AEQbTJ(this.KWHzl, (C24800ikf) obj);
                }
            });
            hbj.EZpvd.setFromToChangeClick(new Function1() { // from class: o.hIN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.valueOf(this.EZpvd, (C24795ika) obj);
                }
            });
            hbj.AEQbTJ.setRateLockEventCallback(new Function1() { // from class: o.hIP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.AhwBna(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            hbj.AEQbTJ.setOnFocusCallBack(new Function1() { // from class: o.hIR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.OLrzqt(this.AEQbTJ, hbj, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            hbj.EZpvd.setClickValueDifferenceCallBack(new Function0() { // from class: o.hIQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.dNCPSb(this.AEQbTJ);
                }
            });
            hbj.EZpvd.setClickCallback(new Function0() { // from class: o.hIU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.UeEOUB(this.KWHzl);
                }
            });
            hbj.EZpvd.setFromClickCallback(new Function0() { // from class: o.hIS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.aKErDB(this.OLrzqt);
                }
            });
            C21828hNv c21828hNv = hbj.OLrzqt;
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                C33570myu.copydefault((android.app.Activity) activity2);
            }
            c21828hNv.OLrzqt(zuBGHE(), this, new Function0() { // from class: o.hIT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.RcXXUw(this.KWHzl);
                }
            }, new Function0() { // from class: o.hIV
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.finit(this.EZpvd);
                }
            }, new Function0() { // from class: o.hIW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.fFgQHt(this.OLrzqt);
                }
            }, new Function0() { // from class: o.hJa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.dvKsVJ(this.copydefault);
                }
            }, new Function0() { // from class: o.hIZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.dxcTrN(this.OLrzqt);
                }
            }, new Function0() { // from class: o.hJb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.fvQaOB(this.KWHzl);
                }
            });
            c21828hNv.AEQbTJ(zuBGHE(), fARcdN(), this, new Function1() { // from class: o.hJd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.OLrzqt(this.KWHzl, (android.os.Bundle) obj);
                }
            });
            fARcdN().RKDWNf().observe(getViewLifecycleOwner(), new Observer() { // from class: o.hJc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.lifecycle.Observer
                public final void onChanged(java.lang.Object obj) {
                    LimitOrderContentFragment.KWHzl((java.lang.String) obj);
                }
            });
            hbj.AEQbTJ.setLevelEventCallback(new Function1() { // from class: o.hJe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.EZpvd(this.copydefault, (java.lang.String) obj);
                }
            });
            hbj.AEQbTJ.setEventTrackingCallback(new Function1() { // from class: o.hJg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.copydefault(this.KWHzl, (kotlin.Pair) obj);
                }
            });
        }
        C22380heK.OLrzqt.copydefault(zuBGHE()).AYXKKw().AhwBna().observe(this, new AssistContent(new Function1() { // from class: o.hJf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.gEmmrt(this.EZpvd, (java.lang.String) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new LimitOrderContentFragment$addListener$3(this, null), 3, null);
    }

    public static final void EZpvd(LimitOrderContentFragment limitOrderContentFragment, hBJ hbj, boolean z) {
        hNI hni;
        if (limitOrderContentFragment.fARcdN().ORxRYg() && (hni = limitOrderContentFragment.fIwbmz) != null) {
            hni.setVisibility(limitOrderContentFragment.fARcdN().zblBkD() ? 0 : 8);
        }
        if (z) {
            return;
        }
        hbj.EZpvd.KWHzl();
        hbj.EZpvd.AEQbTJ();
        hbj.AEQbTJ.OLrzqt();
    }

    public static final Unit QVAiDq(LimitOrderContentFragment limitOrderContentFragment) {
        String strEZpvd;
        boolean zIsEmpty = InterfaceC22502hga.ActionBar.getExpireTimeList$default(C22380heK.OLrzqt.copydefault(limitOrderContentFragment.zuBGHE()).AhwBna(), null, 1, null).isEmpty();
        hKV.Activity activity = hKV.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = limitOrderContentFragment.getChildFragmentManager();
        String str = "";
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        String strZuBGHE = limitOrderContentFragment.zuBGHE();
        ExpireTimeData value = limitOrderContentFragment.fARcdN().QSBOWP().getValue();
        if (value != null && (strEZpvd = value.EZpvd()) != null) {
            str = strEZpvd;
        }
        activity.OLrzqt(childFragmentManager, strZuBGHE, str, zIsEmpty);
        limitOrderContentFragment.gEmmrt(DexTrackEventParameter.ButtonName.TIME_EDIT.getValue());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.aZN.trackEventPageClick$default(o.aZN, java.lang.String, java.util.Map, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, View view) {
        ActivityResultLauncher<AdvancedSettingsContract.Input> activityResultLauncher;
        Intrinsics.checkNotNullParameter(view, "");
        AdvancedSettingsContract.Input inputAuCTel = limitOrderContentFragment.AuCTel();
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("is_tee", String.valueOf(limitOrderContentFragment.fJNWhG().AYXKKw())), C56390yDp.OLrzqt("is_tpsl", "no"), C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.SETTINGS.getButtonName())), null, BusinessType.SWAP.getValue(), 4, null);
        if (inputAuCTel != null && (activityResultLauncher = limitOrderContentFragment.getFieldNames) != null) {
            activityResultLauncher.launch(inputAuCTel);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, AbstractC22408hem abstractC22408hem) {
        Intrinsics.checkNotNullParameter(abstractC22408hem, "");
        if (abstractC22408hem instanceof AbstractC22408hem.Application) {
            limitOrderContentFragment.fetchVPNInfo().copydefault(limitOrderContentFragment.fARcdN().fARcdN(), EventPageNameType.LIMIT.getPageName(), limitOrderContentFragment.fARcdN().flVtFt());
        } else {
            if (!(abstractC22408hem instanceof AbstractC22408hem.TaskDescription)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC22408hem.TaskDescription taskDescription = (AbstractC22408hem.TaskDescription) abstractC22408hem;
            C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", taskDescription.KWHzl()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, taskDescription.AEQbTJ())), null, null, 12, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit QbewEr(LimitOrderContentFragment limitOrderContentFragment) {
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.MAX.getButtonName())), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit djSkpj(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.wlaJM();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(LimitOrderContentFragment limitOrderContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        limitOrderContentFragment.OLrzqt(true);
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.TOKEN_FROM.getButtonName())), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(LimitOrderContentFragment limitOrderContentFragment, C24800ikf c24800ikf) {
        Intrinsics.checkNotNullParameter(c24800ikf, "");
        limitOrderContentFragment.OLrzqt(true);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        limitOrderContentFragment.OLrzqt(false);
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.TOKEN_TO.getButtonName())), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, C24800ikf c24800ikf) {
        Intrinsics.checkNotNullParameter(c24800ikf, "");
        limitOrderContentFragment.OLrzqt(false);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(LimitOrderContentFragment limitOrderContentFragment, C24795ika c24795ika) {
        Intrinsics.checkNotNullParameter(c24795ika, "");
        limitOrderContentFragment.fARcdN().isConnected();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = limitOrderContentFragment.fARcdN().QKudOq();
        if (dexMultiTokenInfoBeanQKudOq != null && dexMultiTokenInfoBeanQKudOq.isMainChainCoin()) {
            C22495hgT c22495hgTFARcdN = limitOrderContentFragment.fARcdN();
            C21759hLg c21759hLgQVAiDq = c22495hgTFARcdN.QVAiDq();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq2 = c22495hgTFARcdN.QKudOq();
            String originContractAddress = dexMultiTokenInfoBeanQKudOq2 != null ? dexMultiTokenInfoBeanQKudOq2.getOriginContractAddress() : null;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = c22495hgTFARcdN.OcIXYQ();
            c21759hLgQVAiDq.OLrzqt(originContractAddress, dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getOriginContractAddress() : null, c22495hgTFARcdN.iwGUEr());
            limitOrderContentFragment.ORxRYg().OLrzqt().setValue(Boolean.TRUE);
            C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.TRADE_DIRECTION_SWITCH.getButtonName())), null, null, 12, null);
            return Unit.INSTANCE;
        }
        ConsumeData<TradeInputGroup> value = limitOrderContentFragment.fARcdN().getPostValueLengthLimit().getValue();
        if (value != null) {
            value.getData().getFromData().getData().getEditData().setMaxData(MultiTransferSignData.DEFAULT_INTERVAL);
            limitOrderContentFragment.fARcdN().QVAiDq().EZpvd();
        }
        MutableLiveData<Boolean> mutableLiveDataUlJrfe = limitOrderContentFragment.fARcdN().UlJrfe();
        Boolean bool = Boolean.TRUE;
        mutableLiveDataUlJrfe.setValue(bool);
        limitOrderContentFragment.ORxRYg().OLrzqt().setValue(bool);
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.TRADE_DIRECTION_SWITCH.getButtonName())), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(LimitOrderContentFragment limitOrderContentFragment, boolean z) {
        limitOrderContentFragment.fARcdN().AYXKKw(z);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(LimitOrderContentFragment limitOrderContentFragment, hBJ hbj, boolean z) {
        C24805ikk c24805ikk;
        C24805ikk c24805ikk2;
        if (z) {
            hBJ hbj2 = (hBJ) limitOrderContentFragment.AwvSrB();
            if (hbj2 != null && (c24805ikk2 = hbj2.gEmmrt) != null) {
                int top = hbj.EZpvd.getTop() + C55298xhM.dpInt$default(80.0f, (Context) null, 1, (Object) null);
                if (C23313hvq.OLrzqt(Integer.valueOf(top), 0)) {
                    c24805ikk2.scrollTo(0, top);
                } else {
                    c24805ikk2.fling(top);
                }
            }
        } else {
            hBJ hbj3 = (hBJ) limitOrderContentFragment.AwvSrB();
            if (hbj3 != null && (c24805ikk = hbj3.gEmmrt) != null) {
                c24805ikk.scrollTo(0, 0);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit dNCPSb(LimitOrderContentFragment limitOrderContentFragment) {
        String strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.getUriFromString, ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("currency", C23272hvB.KWHzl.OLrzqt().getDisplayName())));
        Context contextRequireContext = limitOrderContentFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle("");
        viewOnClickListenerC54939xaY.EZpvd(strKWHzl);
        ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.MediaBrowserCompatServiceBinderWrapper, (View.OnClickListener) null, 2, (Object) null);
        viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
        viewOnClickListenerC54939xaY.show();
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.EXPLAIN.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.RATE_DIFF_EXPLAIN.getButtonName())), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit UeEOUB(LimitOrderContentFragment limitOrderContentFragment) {
        if (limitOrderContentFragment.getActivity() != null && !limitOrderContentFragment.fARcdN().QwvEab()) {
            C55326xho.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.zCTncp));
        }
        return Unit.INSTANCE;
    }

    public static final Unit aKErDB(LimitOrderContentFragment limitOrderContentFragment) {
        if (limitOrderContentFragment.getActivity() != null && !limitOrderContentFragment.fARcdN().QwvEab()) {
            C55326xho.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.zCTncp));
        }
        return Unit.INSTANCE;
    }

    public static final Unit RcXXUw(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.AYXKKw(EventTrackSubmitType.CONNECTED_WALLET.getType());
        return Unit.INSTANCE;
    }

    public static final Unit finit(final LimitOrderContentFragment limitOrderContentFragment) {
        if (limitOrderContentFragment.fARcdN().AYXKKw()) {
            C55326xho.toast$default(C23274hvD.Fragment.MediaBrowserCompatSearchResultReceiver, (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return Unit.INSTANCE;
        }
        if (limitOrderContentFragment.fARcdN().USBtdM()) {
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C23274hvD.Fragment.HJWChP), 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
        limitOrderContentFragment.gEmmrt(new Function0() { // from class: o.hIy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.fZBcTu(this.EZpvd);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit fZBcTu(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.AYXKKw(EventTrackSubmitType.SUBMIT.getType());
        trackSubmit$default(limitOrderContentFragment, null, 1, null);
        Boolean boolCopydefault = limitOrderContentFragment.fARcdN().finit().copydefault(limitOrderContentFragment.fARcdN().wlaJM(), limitOrderContentFragment.fARcdN().AuCTelauCTel());
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.EZpvd(boolCopydefault, bool)) {
            limitOrderContentFragment.zsXlph();
        } else {
            LimitPairRateResponse limitPairRateResponseAYXKKw = limitOrderContentFragment.fARcdN().finit().AYXKKw();
            if (limitPairRateResponseAYXKKw != null && Intrinsics.EZpvd(limitPairRateResponseAYXKKw.getValDiff(), bool)) {
                limitOrderContentFragment.zLjUOn();
            } else {
                limitOrderContentFragment.showLoadingAtOnce();
                limitOrderContentFragment.AubY();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit fFgQHt(LimitOrderContentFragment limitOrderContentFragment) {
        LimitErrorViewHandle limitErrorViewHandle = limitOrderContentFragment.AYXKKw;
        if (limitErrorViewHandle != null) {
            FragmentActivity fragmentActivityRequireActivity = limitOrderContentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            limitErrorViewHandle.copydefault(fragmentActivityRequireActivity);
        }
        return Unit.INSTANCE;
    }

    public static final Unit dvKsVJ(LimitOrderContentFragment limitOrderContentFragment) {
        LimitErrorViewHandle limitErrorViewHandle = limitOrderContentFragment.AYXKKw;
        if (limitErrorViewHandle != null) {
            FragmentActivity fragmentActivityRequireActivity = limitOrderContentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            limitErrorViewHandle.AEQbTJ(fragmentActivityRequireActivity);
        }
        return Unit.INSTANCE;
    }

    public static final Unit dxcTrN(LimitOrderContentFragment limitOrderContentFragment) {
        LimitErrorViewHandle limitErrorViewHandle = limitOrderContentFragment.AYXKKw;
        if (limitErrorViewHandle != null) {
            FragmentActivity fragmentActivityRequireActivity = limitOrderContentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            limitErrorViewHandle.OLrzqt(fragmentActivityRequireActivity);
        }
        return Unit.INSTANCE;
    }

    public static final Unit fvQaOB(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.QVAiDq();
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.TRADE.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.DEPOSIT.getButtonName())), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(LimitOrderContentFragment limitOrderContentFragment, Bundle bundle) {
        limitOrderContentFragment.EZpvd(bundle);
        return Unit.INSTANCE;
    }

    public static final void KWHzl(String str) {
        C24631ihV c24631ihV = C24631ihV.KWHzl;
        Intrinsics.copydefault((Object) str);
        c24631ihV.OLrzqt("Web3_DEX_LIMIT_ORDER", str);
    }

    public static final Unit EZpvd(LimitOrderContentFragment limitOrderContentFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        limitOrderContentFragment.gEmmrt(str);
        if (Intrinsics.EZpvd((Object) str, (Object) DexTrackEventParameter.LevelValue.MARKET.getValue()) || Intrinsics.EZpvd((Object) str, (Object) DexTrackEventParameter.LevelValue.LOW.getValue()) || Intrinsics.EZpvd((Object) str, (Object) DexTrackEventParameter.LevelValue.MID.getValue())) {
            limitOrderContentFragment.fARcdN().KWHzl(EventConditionEnterBy.Quick_button.getType());
        } else if (Intrinsics.EZpvd((Object) str, (Object) DexTrackEventParameter.LevelValue.HIGH.getValue())) {
            limitOrderContentFragment.fARcdN().KWHzl(EventConditionEnterBy.Manual.getType());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(LimitOrderContentFragment limitOrderContentFragment, Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().iwGUEr(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", pair.getFirst()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, pair.getSecond())), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(LimitOrderContentFragment limitOrderContentFragment, String str) {
        Bundle bundleBundleOf = BundleKt.bundleOf();
        bundleBundleOf.putInt("result", -1);
        bundleBundleOf.putString("data", str);
        limitOrderContentFragment.copydefault(bundleBundleOf);
        return Unit.INSTANCE;
    }

    public final AdvancedSettingsContract.Input AuCTel() {
        LimitPairRateResponse limitPairRateResponseAYXKKw;
        PresetUserConfigBean presetUserConfigBean;
        BuySellPreset buyPreset;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        NonMevPriorityFeeInfo nonMevPriorityFeeInfo;
        String enableMev;
        String str;
        int value;
        MevBasedFeeData nonMevFeeData;
        MevBasedFeeData mevFeeData;
        DexMultiTokenInfoBean fromToken;
        String strFARcdN = fARcdN().fARcdN();
        Result<DexPresetResultVO> resultOLrzqt = fARcdN().OLrzqt(strFARcdN);
        if (resultOLrzqt != null) {
            Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            DexPresetResultVO dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
            if (dexPresetResultVO != null && (limitPairRateResponseAYXKKw = fARcdN().finit().AYXKKw()) != null && (presetUserConfigBean = (PresetUserConfigBean) CollectionsKt___CollectionsKt.firstOrNull(dexPresetResultVO.getDexPresetResultVOList())) != null && (buyPreset = presetUserConfigBean.getBuyPreset()) != null) {
                C25415iwL c25415iwLRcXXUw = fARcdN().RcXXUw();
                SlippageMode slippageModeEZpvd = c25415iwLRcXXUw.EZpvd();
                PresetRouteType presetRouteTypeEZpvd = EZpvd(strFARcdN, dexPresetResultVO);
                boolean zOLrzqt = OLrzqt(strFARcdN, limitPairRateResponseAYXKKw, dexPresetResultVO);
                Pair<PriorityFeeType, String> pairValues = values();
                LimitOrderInfo limitOrderInfo = limitPairRateResponseAYXKKw.getLimitOrderInfo();
                DexAutoSlippageInfoParam slippageInfo = limitPairRateResponseAYXKKw.getSlippageInfo();
                String referenceSlippage = slippageInfo != null ? slippageInfo.getReferenceSlippage() : null;
                String str2 = referenceSlippage == null ? "" : referenceSlippage;
                String nativeSymbol = limitPairRateResponseAYXKKw.getNativeSymbol();
                String str3 = nativeSymbol == null ? "" : nativeSymbol;
                DexMultiTokenInfoBean dexMultiTokenInfoBean2 = (limitOrderInfo == null || (fromToken = limitOrderInfo.getFromToken()) == null) ? new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null) : fromToken;
                String fromTokenAmount = limitOrderInfo != null ? limitOrderInfo.getFromTokenAmount() : null;
                String str4 = fromTokenAmount == null ? "" : fromTokenAmount;
                String fromTokenPrice = limitOrderInfo != null ? limitOrderInfo.getFromTokenPrice() : null;
                String str5 = fromTokenPrice == null ? "" : fromTokenPrice;
                boolean supportEip1559 = dexPresetResultVO.getSupportEip1559();
                String nativeSymbol2 = limitPairRateResponseAYXKKw.getNativeSymbol();
                String str6 = nativeSymbol2 == null ? "" : nativeSymbol2;
                int memeChainType = dexPresetResultVO.getMemeChainType();
                if (limitOrderInfo == null || (dexMultiTokenInfoBean = limitOrderInfo.getToToken()) == null) {
                    dexMultiTokenInfoBean = new DexMultiTokenInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, false, (String) null, (String) null, (String) null, false, 0, (String) null, (Integer) null, (String) null, (String) null, 0, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (TokenInfoForApp) null, -1, 134217727, (DefaultConstructorMarker) null);
                }
                DexMultiTokenInfoBean dexMultiTokenInfoBean3 = dexMultiTokenInfoBean;
                LimitFeeData feeData = limitPairRateResponseAYXKKw.getFeeData();
                List listOLrzqt = yDY.OLrzqt((feeData == null || (mevFeeData = feeData.getMevFeeData()) == null) ? null : mevFeeData.toMevInfoBean());
                LimitFeeData feeData2 = limitPairRateResponseAYXKKw.getFeeData();
                if (feeData2 == null || (nonMevFeeData = feeData2.getNonMevFeeData()) == null || (nonMevPriorityFeeInfo = nonMevFeeData.toNonMevInfoBean()) == null) {
                    nonMevPriorityFeeInfo = new NonMevPriorityFeeInfo((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 262143, (DefaultConstructorMarker) null);
                }
                NonMevPriorityFeeInfo nonMevPriorityFeeInfo2 = nonMevPriorityFeeInfo;
                boolean enableJito = limitPairRateResponseAYXKKw.getEnableJito();
                LimitOrderInfo limitOrderInfo2 = limitPairRateResponseAYXKKw.getLimitOrderInfo();
                if (limitOrderInfo2 == null || (enableMev = limitOrderInfo2.getEnableMev()) == null) {
                    enableMev = "0";
                }
                String str7 = enableMev;
                String type = MevUnstableShowLevelType.NORMAL.getType();
                String nativeTokenUnitPriceUsd = limitOrderInfo != null ? limitOrderInfo.getNativeTokenUnitPriceUsd() : null;
                String str8 = nativeTokenUnitPriceUsd == null ? "" : nativeTokenUnitPriceUsd;
                String code = limitOrderInfo != null ? limitOrderInfo.getCode() : null;
                String estReserveNativeAmt = limitOrderInfo != null ? limitOrderInfo.getEstReserveNativeAmt() : null;
                String str9 = estReserveNativeAmt == null ? "" : estReserveNativeAmt;
                String minSellAmount = limitOrderInfo != null ? limitOrderInfo.getMinSellAmount() : null;
                AdvancedQuoteUiData advancedQuoteUiData = new AdvancedQuoteUiData(new AdvancedQuoteAndCallData.LegacyLimit(new AdvancedQuoteResponse(new AdvancedCommonDexInfo(str3, dexMultiTokenInfoBean2, str4, str5, (String) null, str6, String.valueOf(memeChainType), dexMultiTokenInfoBean3, "", "", listOLrzqt, nonMevPriorityFeeInfo2, enableJito, false, str7, type, str8, supportEip1559, code, str9, "", "", minSellAmount == null ? "" : minSellAmount, 16, (DefaultConstructorMarker) null), (TraceData) null, false, (Integer) null, (String) null, limitPairRateResponseAYXKKw.getExpirationTime(), yDY.AhwBna(), (String) null, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA, (DefaultConstructorMarker) null), gYT.EZpvd(limitPairRateResponseAYXKKw)));
                String strZuBGHE = zuBGHE();
                SlippageMode slippageMode = SlippageMode.Fixed;
                if (slippageModeEZpvd == slippageMode) {
                    String strEZpvd = c25415iwLRcXXUw.EZpvd(str2);
                    str = strEZpvd == null ? "" : strEZpvd;
                } else {
                    str = str2;
                }
                if (slippageModeEZpvd == slippageMode) {
                    value = c25415iwLRcXXUw.copydefault().getValue();
                } else {
                    value = SlippageFeeType.SlippageLow.getValue();
                }
                int i = value;
                String second = pairValues.getSecond();
                int value2 = pairValues.getFirst().getValue();
                int value3 = TransactionDirection.TransactionBuy.getValue();
                String estimateGasFee = limitPairRateResponseAYXKKw.getEstimateGasFee();
                String str10 = estimateGasFee == null ? "" : estimateGasFee;
                String nativeTokenUnitPriceUsd2 = limitOrderInfo != null ? limitOrderInfo.getNativeTokenUnitPriceUsd() : null;
                String str11 = nativeTokenUnitPriceUsd2 == null ? "" : nativeTokenUnitPriceUsd2;
                String value4 = presetRouteTypeEZpvd.getValue();
                Double dAuCTel = C59443zhD.AuCTel(dexPresetResultVO.getPriceImpactValue());
                boolean supportEip15592 = dexPresetResultVO.getSupportEip1559();
                String gasPriceUnitDecimal = dexPresetResultVO.getGasPriceUnitDecimal();
                String mevPriceThreshold = dexPresetResultVO.getMevPriceThreshold();
                int memeChainType2 = dexPresetResultVO.getMemeChainType();
                DexMultiTokenInfoBean nativeTokenInfo = dexPresetResultVO.getNativeTokenInfo();
                DexAutoSlippageInfoParam slippageInfo2 = limitPairRateResponseAYXKKw.getSlippageInfo();
                String str12 = str2;
                AdvancedMainConfig advancedMainConfig = new AdvancedMainConfig(strFARcdN, dAuCTel, Boolean.valueOf(supportEip15592), gasPriceUnitDecimal, mevPriceThreshold, String.valueOf(memeChainType2), nativeTokenInfo, new MinMaxData(str2, slippageInfo2 != null ? slippageInfo2.getRecommendSlippageRangeMax() : null), new PriorityFeeInfo(buyPreset.getFeeConfig().getLimitOrderMax(), buyPreset.getFeeConfig().getLimitOrderMin()), new AdvancedDefaultPreset(Boolean.valueOf(zOLrzqt), Integer.valueOf(pairValues.getFirst().getValue()), buyPreset.getRouteConfig().getRouterModeType()), (String) null, dexPresetResultVO.getSupportAutoMode(), false, dexPresetResultVO.getSupportCustomGasFee(), 5120, (DefaultConstructorMarker) null);
                DexAutoSlippageInfoParam slippageInfo3 = limitPairRateResponseAYXKKw.getSlippageInfo();
                return new AdvancedSettingsContract.Input(strZuBGHE, strFARcdN, str, i, str12, second, value2, zOLrzqt, value3, "", str10, str11, value4, advancedMainConfig, slippageInfo3 != null ? slippageInfo3.toAutoSlippageInfo() : null, c25415iwLRcXXUw.EZpvd(), c25415iwLRcXXUw.KWHzl(), null, true, false, TrackOrderType.LIMIT, TradeMode.SwapLimit, advancedQuoteUiData, 655360, null);
            }
        }
        return null;
    }

    public final void KWHzl(AdvancedSettingsContract.Input input) {
        if (input == null) {
            return;
        }
        EZpvd(input);
        AEQbTJ(input);
        copydefault(input);
    }

    public final void copydefault(AdvancedSettingsContract.Input input) {
        LimitFeeData limitFeeData;
        C21831hNy c21831hNy;
        LimitOrderInfo limitOrderInfo;
        LimitPairRateResponse limitPairRateResponseAYXKKw = fARcdN().finit().AYXKKw();
        String strFARcdN = fARcdN().fARcdN();
        String priorityValue = input.getPriorityValue();
        PriorityFeeType priorityFeeTypeCopydefault = PriorityFeeType.Companion.copydefault(input.getPriorityFeeType());
        pUU.KWHzl("LimitOrderContentFragment", "feeValueUsd info=priorityTag=" + priorityFeeTypeCopydefault + " feeValue=" + priorityValue);
        fJNWhG().AEQbTJ(strFARcdN, priorityFeeTypeCopydefault, priorityValue);
        SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModelFJNWhG = fJNWhG();
        int priorityFeeType = input.getPriorityFeeType();
        boolean zIsOpenMev$default = isOpenMev$default(this, strFARcdN, limitPairRateResponseAYXKKw, null, 4, null);
        String nativeTokenUnitPriceUsd = null;
        if (limitPairRateResponseAYXKKw == null || (limitFeeData = limitPairRateResponseAYXKKw.getFeeData()) == null) {
            limitFeeData = new LimitFeeData((MevBasedFeeData) null, (MevBasedFeeData) null, 3, (DefaultConstructorMarker) null);
        }
        LimitFeeData limitFeeData2 = limitFeeData;
        String estimateGasFee = limitPairRateResponseAYXKKw != null ? limitPairRateResponseAYXKKw.getEstimateGasFee() : null;
        String str = estimateGasFee == null ? "" : estimateGasFee;
        DefiChainInfo defiChainInfoCopydefault = fJNWhG().copydefault(strFARcdN);
        String networkFeeDisplayDecimals = defiChainInfoCopydefault != null ? defiChainInfoCopydefault.getNetworkFeeDisplayDecimals() : null;
        String str2 = networkFeeDisplayDecimals == null ? "" : networkFeeDisplayDecimals;
        if (limitPairRateResponseAYXKKw != null && (limitOrderInfo = limitPairRateResponseAYXKKw.getLimitOrderInfo()) != null) {
            nativeTokenUnitPriceUsd = limitOrderInfo.getNativeTokenUnitPriceUsd();
        }
        if (nativeTokenUnitPriceUsd == null) {
            nativeTokenUnitPriceUsd = "";
        }
        String strAEQbTJ = singleSwapLimitPlaceOrderViewModelFJNWhG.AEQbTJ(strFARcdN, priorityFeeType, zIsOpenMev$default, limitFeeData2, priorityValue, str, str2, nativeTokenUnitPriceUsd);
        hBJ hbj = this.iwGUEr;
        if (hbj == null || (c21831hNy = hbj.AYXKKw) == null) {
            return;
        }
        c21831hNy.copydefault(strAEQbTJ);
    }

    public final void AEQbTJ(AdvancedSettingsContract.Input input) {
        C21831hNy c21831hNy;
        SlippageMode slippageMode = input.getSlippageMode();
        String maxSlippage = input.getMaxSlippage();
        C25415iwL c25415iwLRcXXUw = fARcdN().RcXXUw();
        String slippageValue = input.getSlippageValue();
        if (maxSlippage == null) {
            maxSlippage = "";
        }
        c25415iwLRcXXUw.EZpvd(new AdvanceLimitSlippageCache(slippageValue, slippageMode, maxSlippage, SlippageFeeType.Companion.OLrzqt(input.getSlippageFeeType())));
        hBJ hbj = this.iwGUEr;
        if (hbj == null || (c21831hNy = hbj.AYXKKw) == null) {
            return;
        }
        c21831hNy.AEQbTJ(fARcdN().gkJEwt());
    }

    public final void EZpvd(AdvancedSettingsContract.Input input) {
        fJNWhG().OLrzqt(fARcdN().fARcdN(), PresetRouteType.Companion.EZpvd(input.getRouterModeType()));
    }

    public final void gEmmrt(final Function0<Unit> function0) {
        if (fJNWhG().AYXKKw()) {
            dismissLoading();
            LimitPairRateResponse value = fARcdN().djSkpj().getValue();
            LimitCalResult limitCalResultCopydefault = fARcdN().finit().copydefault();
            if (C33129mqd.OLrzqt((CharSequence) value.getChangeRate()) && limitCalResultCopydefault != null) {
                SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModelFJNWhG = fJNWhG();
                LimitCalResult limitCalResultCopydefault2 = fARcdN().finit().copydefault();
                String strGkJEwt = fARcdN().gkJEwt();
                String strCopydefault = fARcdN().iRxXKY().copydefault();
                String fromAmount = limitCalResultCopydefault.getFromAmount();
                DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = fARcdN().OcIXYQ();
                String tokenSymbol = dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getTokenSymbol() : null;
                if (tokenSymbol == null) {
                    tokenSymbol = "";
                }
                singleSwapLimitPlaceOrderViewModelFJNWhG.copydefault(value, limitCalResultCopydefault2, strGkJEwt, strCopydefault, fromAmount, tokenSymbol, fARcdN().ODWQjV());
                KWHzl(fJNWhG().OLrzqt(), new Function0() { // from class: o.hJt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return LimitOrderContentFragment.copydefault(function0);
                    }
                });
                return;
            }
            C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq);
            pUU.KWHzl("LimitOrderContentFragment", "rateResponse.changeRate =" + C23316hvt.OLrzqt(value) + "  countResult=" + (limitCalResultCopydefault != null ? C23316hvt.OLrzqt(limitCalResultCopydefault) : null));
            return;
        }
        function0.invoke();
    }

    public static final Unit copydefault(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public final void KWHzl(StateFlow<C30457lbX> stateFlow, final Function0<Unit> function0) {
        TradeConfirmOrderSheet tradeConfirmOrderSheetCopydefault = TradeConfirmOrderSheet.Companion.copydefault(stateFlow, null, new Function0() { // from class: o.hJz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.EZpvd(function0);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        String strValueOf = C56524yIo.AEQbTJ(TradeConfirmOrderSheet.class).valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        tradeConfirmOrderSheetCopydefault.show(childFragmentManager, strValueOf);
    }

    public static final Unit EZpvd(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final void zLjUOn() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.setTitle(C23274hvD.Fragment.zeUJxr);
            viewOnClickListenerC54939xaY.copydefault(C23274hvD.Fragment.iTrKTi);
            viewOnClickListenerC54939xaY.AEQbTJ((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.Slwtri), new View.OnClickListener() { // from class: o.hIE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    LimitOrderContentFragment.KWHzl(this.KWHzl, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.ibrGus), new View.OnClickListener() { // from class: o.hIF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    LimitOrderContentFragment.EZpvd(viewOnClickListenerC54939xaY, this, view);
                }
            });
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void KWHzl(LimitOrderContentFragment limitOrderContentFragment, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, View view) {
        limitOrderContentFragment.showLoadingAtOnce();
        limitOrderContentFragment.AubY();
        viewOnClickListenerC54939xaY.dismiss();
        limitOrderContentFragment.EZpvd("price_effect", Web3SecurityTrackEvent.VALUE_CONFIRM);
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, LimitOrderContentFragment limitOrderContentFragment, View view) {
        viewOnClickListenerC54939xaY.dismiss();
        limitOrderContentFragment.EZpvd("price_effect", OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
    }

    public final void wlaJM() {
        String strKWHzl;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View viewInflate = LayoutInflater.from(getActivity()).inflate(C23274hvD.Activity.DcqEDu, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(C23274hvD.Application.setListNavigationCallbacks);
            CheckBox checkBox = (CheckBox) viewInflate.findViewById(C23274hvD.Application.hrjNmC);
            String showData$default = C23271hvA.getShowData$default(C23271hvA.copydefault, fARcdN().hDKMBd(), false, null, false, false, 30, null);
            DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = fARcdN().OcIXYQ();
            String tokenSymbol = dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getTokenSymbol() : null;
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            boolean zOLrzqt = C23313hvq.OLrzqt(C23313hvq.subCheckS$default(fARcdN().fIwbmz(), fARcdN().hDKMBd(), null, null, null, 14, null), 0);
            ArrayMap arrayMapArrayMapOf = ArrayMapKt.arrayMapOf(C56390yDp.OLrzqt("value", showData$default), C56390yDp.OLrzqt("tokenSymbol", tokenSymbol));
            if (zOLrzqt) {
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.requestExtraBinder, arrayMapArrayMapOf);
            } else {
                strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.IResultReceiver2Stub, arrayMapArrayMapOf);
            }
            textView.setText(strKWHzl);
            checkBox.setChecked(C23317hvu.values());
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.hKi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    LimitOrderContentFragment.KWHzl(compoundButton, z);
                }
            });
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            Intrinsics.copydefault(viewInflate);
            ViewOnClickListenerC54939xaY.addCustomView$default(viewOnClickListenerC54939xaY, viewInflate, 0, 2, null);
            ViewOnClickListenerC54939xaY.addPrimaryButton$default(viewOnClickListenerC54939xaY, C23274hvD.Fragment.buildRccMetadata, (View.OnClickListener) null, 2, (Object) null);
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void KWHzl(CompoundButton compoundButton, boolean z) {
        C23317hvu.AkhnZx(z);
    }

    public final void zsXlph() {
        String strKWHzl;
        String strAYXKKw;
        String str;
        String rateDiffAmount;
        String strCopydefault;
        String rateDiffAmount2;
        String strCopydefault2;
        LimitOrderRateView.ShowType showTypeAuCTelauCTel = fARcdN().AuCTelauCTel();
        LimitOrderRateView.ShowType showType = LimitOrderRateView.ShowType.SELL;
        if (showTypeAuCTelauCTel == showType) {
            LimitPairRateResponse limitPairRateResponseAYXKKw = fARcdN().finit().AYXKKw();
            strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.validateAndPutInMap, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23311hvo.formatPercent$default((limitPairRateResponseAYXKKw == null || (rateDiffAmount2 = limitPairRateResponseAYXKKw.getRateDiffAmount(fARcdN().zsXlph(), showType)) == null || (strCopydefault2 = C23311hvo.copydefault(rateDiffAmount2)) == null) ? "" : strCopydefault2, false, 0, 0, null, null, 31, null))));
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.UPbYzn);
            str = "below_market";
        } else {
            LimitPairRateResponse limitPairRateResponseAYXKKw2 = fARcdN().finit().AYXKKw();
            strKWHzl = C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C23274hvD.Fragment.iSpHlg, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("value", C23311hvo.formatPercent$default((limitPairRateResponseAYXKKw2 == null || (rateDiffAmount = limitPairRateResponseAYXKKw2.getRateDiffAmount(fARcdN().wlaJM(), LimitOrderRateView.ShowType.BUY)) == null || (strCopydefault = C23311hvo.copydefault(rateDiffAmount)) == null) ? "" : strCopydefault, false, 0, 0, null, null, 31, null))));
            strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.DRtzUu);
            str = "above_market";
        }
        EZpvd(strAYXKKw, strKWHzl, str, new Function0() { // from class: o.hJr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.gkJEwt(this.EZpvd);
            }
        });
    }

    public static final Unit gkJEwt(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.showLoadingAtOnce();
        limitOrderContentFragment.AubY();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf() {
        return Unit.INSTANCE;
    }

    public static final Unit DTwDnp(LimitOrderContentFragment limitOrderContentFragment) {
        FragmentActivity fragmentActivityRequireActivity = limitOrderContentFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C25352ivB.OLrzqt((Context) fragmentActivityRequireActivity, limitOrderContentFragment.gEmmrt().KWHzl(), limitOrderContentFragment.fARcdN().fARcdN(), true);
        return Unit.INSTANCE;
    }

    public static final Unit QKVWgx(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public static final Unit ORxRYg(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.fARcdN().fdOvFl();
        limitOrderContentFragment.fARcdN().fERRXa();
        return Unit.INSTANCE;
    }

    public static final Unit RJOkX(LimitOrderContentFragment limitOrderContentFragment) {
        InterfaceC9738bbJ interfaceC9738bbJHBpjJd = limitOrderContentFragment.fARcdN().hBpjJd();
        String strDbNXlk = interfaceC9738bbJHBpjJd != null ? interfaceC9738bbJHBpjJd.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
        Context contextRequireContext = limitOrderContentFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        dtq.copydefault(contextRequireContext, strDbNXlk, Boolean.TRUE, "sa_dex_limitorder");
        return Unit.INSTANCE;
    }

    public static final Unit QUSxYX(LimitOrderContentFragment limitOrderContentFragment) {
        InterfaceC9738bbJ interfaceC9738bbJHBpjJd = limitOrderContentFragment.fARcdN().hBpjJd();
        String strDbNXlk = interfaceC9738bbJHBpjJd != null ? interfaceC9738bbJHBpjJd.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
        Context contextRequireContext = limitOrderContentFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        dtq.copydefault(contextRequireContext, strDbNXlk, Boolean.TRUE, "sa_dex_limitorder");
        return Unit.INSTANCE;
    }

    public static final Unit QfsBiF(LimitOrderContentFragment limitOrderContentFragment) {
        InterfaceC9738bbJ interfaceC9738bbJHBpjJd = limitOrderContentFragment.fARcdN().hBpjJd();
        String strDbNXlk = interfaceC9738bbJHBpjJd != null ? interfaceC9738bbJHBpjJd.DbNXlk() : null;
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
        Context contextRequireContext = limitOrderContentFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        dtq.copydefault(contextRequireContext, strDbNXlk, Boolean.TRUE, "sa_dex_limitorder");
        return Unit.INSTANCE;
    }

    public static final Unit QOLQEE(LimitOrderContentFragment limitOrderContentFragment) {
        limitOrderContentFragment.uzCIH();
        return Unit.INSTANCE;
    }

    public final void uzCIH() {
        MpcWalletService.MpcWalletAbleStatus value = fARcdN().fZBcTu().getValue();
        final FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        int i = value == null ? -1 : Activity.AEQbTJ[value.ordinal()];
        if (i == 1) {
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt = C22380heK.OLrzqt.copydefault(zuBGHE()).fARcdN().OLrzqt();
            final Function1 function1 = new Function1() { // from class: o.hJI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.KWHzl(fragmentActivityRequireActivity, this, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.hJS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    LimitOrderContentFragment.EZpvd(function1, obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: o.hKb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.KWHzl((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58260yxtOLrzqt.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.hKq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    LimitOrderContentFragment.gEmmrt(function12, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ, this);
            return;
        }
        if (i == 2 || i == 3) {
            AbstractC58260yxt<InterfaceC9738bbJ> abstractC58260yxtOLrzqt2 = C22380heK.OLrzqt.copydefault(zuBGHE()).fARcdN().OLrzqt();
            final Function1 function13 = new Function1() { // from class: o.hIG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.copydefault(fragmentActivityRequireActivity, this, (InterfaceC9738bbJ) obj);
                }
            };
            InterfaceC58227yxM<? super InterfaceC9738bbJ> interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.hIH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    LimitOrderContentFragment.AhwBna(function13, obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: o.hIL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.EZpvd((java.lang.Throwable) obj);
                }
            };
            InterfaceC58217yxC interfaceC58217yxCAEQbTJ2 = abstractC58260yxtOLrzqt2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.hIM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC58227yxM
                public final void accept(java.lang.Object obj) {
                    LimitOrderContentFragment.djBIcL(function14, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ2, "");
            C33050mpD.EZpvd(interfaceC58217yxCAEQbTJ2, this);
        }
    }

    public static final void EZpvd(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(FragmentActivity fragmentActivity, final LimitOrderContentFragment limitOrderContentFragment, InterfaceC9738bbJ interfaceC9738bbJ) {
        MpcWalletService mpcWalletService = (MpcWalletService) C43251rlk.copydefault(MpcWalletService.class);
        Intrinsics.copydefault(interfaceC9738bbJ);
        mpcWalletService.EZpvd(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.hJE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.gEmmrt(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(LimitOrderContentFragment limitOrderContentFragment, boolean z) {
        if (z) {
            limitOrderContentFragment.fARcdN().valueOf();
        }
        return Unit.INSTANCE;
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AhwBna(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(FragmentActivity fragmentActivity, final LimitOrderContentFragment limitOrderContentFragment, InterfaceC9738bbJ interfaceC9738bbJ) {
        MpcWalletService mpcWalletService = (MpcWalletService) C43251rlk.copydefault(MpcWalletService.class);
        Intrinsics.copydefault(interfaceC9738bbJ);
        mpcWalletService.AEQbTJ(interfaceC9738bbJ, fragmentActivity, new Function1() { // from class: o.hJs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.djBIcL(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(LimitOrderContentFragment limitOrderContentFragment, boolean z) {
        if (z) {
            limitOrderContentFragment.fARcdN().valueOf();
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xWX.TaskDescription.showCurrentWalletSwitchScreen$default(o.xWX, androidx.fragment.app.FragmentManager, com.okinc.wallet.api.bean.CurrentWalletSwitchConfig, kotlin.jvm.functions.Function2, java.util.List, o.xXv, int, java.lang.Object):void */
    public final void AuCTelauCTel() {
        String strFARcdN = fARcdN().fARcdN();
        if (!C33129mqd.OLrzqt((CharSequence) strFARcdN)) {
            strFARcdN = "-100000000";
        }
        final long jValueOf = C33129mqd.valueOf(strFARcdN);
        xWX xwx = (xWX) C43251rlk.copydefault(xWX.class);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        xWX.TaskDescription.showCurrentWalletSwitchScreen$default(xwx, childFragmentManager, new CurrentWalletSwitchConfig(null, new CurrentWalletSwitchNetworkMode.SingleNetwork(jValueOf), C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambdatzBBo0FLedRCWSI6_icF8qhF74s), null, null, 0, null, null, 249, null), new Function2() { // from class: o.hJw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return java.lang.Boolean.valueOf(LimitOrderContentFragment.EZpvd(jValueOf, (InterfaceC9738bbJ) obj, (java.lang.Long) obj2));
            }
        }, null, new PictureInPictureParams(), 8, null);
    }

    public static final boolean EZpvd(long j, InterfaceC9738bbJ interfaceC9738bbJ, Long l) {
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        return (interfaceC9738bbJ.ORxRYg() || interfaceC9738bbJ.getFieldNames() || !interfaceC9738bbJ.AkhnZx(j)) ? false : true;
    }

    public static final class PictureInPictureParams implements InterfaceC54855xXv {
        public PictureInPictureParams() {
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
            LimitOrderContentFragment.this.sSMYrx();
        }

        @Override // o.InterfaceC54855xXv
        public void KWHzl(InterfaceC9738bbJ interfaceC9738bbJ, long j) {
            Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
            InterfaceC54855xXv.ActionBar.EZpvd(this, interfaceC9738bbJ, j);
            LimitOrderContentFragment.this.sSMYrx();
        }

        @Override // o.InterfaceC54855xXv
        public void OLrzqt(long j) {
            InterfaceC54855xXv.ActionBar.KWHzl(this, j);
            LimitOrderContentFragment.this.sSMYrx();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v32, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v34, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void DTwDnp() {
        hNK hnk;
        hNK hnk2;
        MutableLiveData<Boolean> mutableLiveDataCopydefault;
        fARcdN().dvKsVJ().observe(this, new AssistContent(new Function1() { // from class: o.hJB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.OLrzqt(this.AEQbTJ, (PreCheckBean) obj);
            }
        }));
        C25390ivn.collectOnViewLifecycle$default(this, fARcdN().QHmsKR(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fARcdN().aKErDB(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fJNWhG().AEQbTJ(), null, new FragmentManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, new Application(fJNWhG().EZpvd()), null, LoaderManager.EZpvd, 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fARcdN().djSkpj(), null, new Fragment(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fJNWhG().KWHzl(), null, new Dialog(), 2, null);
        fARcdN().gGvvIC().observe(this, new AssistContent(new Function1() { // from class: o.hJR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.values(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        fARcdN().giSNqX().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.hJV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.fIwbmz(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        fARcdN().gasjUx().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.hJX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.OLrzqt(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C23314hvr<Boolean> c23314hvrOLrzqt = ORxRYg().OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c23314hvrOLrzqt.observe(viewLifecycleOwner, new AssistContent(new Function1() { // from class: o.hKc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AYXKKw(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        QKVWgx().EZpvd().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.hKe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.KWHzl(this.AEQbTJ, (C22400hee) obj);
            }
        }));
        C23314hvr<Boolean> c23314hvrDarRvM = fARcdN().DarRvM();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c23314hvrDarRvM.observe(viewLifecycleOwner2, new AssistContent(new Function1() { // from class: o.hKd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.valueOf(this.KWHzl, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(zuBGHE()).AhwBna().OLrzqt().observe(this, new AssistContent(new Function1() { // from class: o.hKa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AEQbTJ(this.KWHzl, (LimitParam) obj);
            }
        }));
        C23263hut c23263hutDjBIcL = c22380heK.djBIcL();
        if (c23263hutDjBIcL != null && (mutableLiveDataCopydefault = c23263hutDjBIcL.copydefault()) != null) {
            mutableLiveDataCopydefault.observe(this, new AssistContent(new Function1() { // from class: o.hKf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.valueOf(this.OLrzqt, (java.lang.Boolean) obj);
                }
            }));
        }
        fARcdN().RlQdEF().observe(this, new Observer() { // from class: o.hKj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                LimitOrderContentFragment.copydefault((java.lang.String) obj);
            }
        });
        fARcdN().dHguZz().observe(this, new AssistContent(new Function1() { // from class: o.hJC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AEQbTJ(this.KWHzl, (kotlin.Pair) obj);
            }
        }));
        fARcdN().RJOkX().observe(this, new AssistContent(new Function1() { // from class: o.hJH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.copydefault(this.AEQbTJ, (C19738gNm) obj);
            }
        }));
        fARcdN().getPostValueLengthLimit().observe(this, new AssistContent(new Function1() { // from class: o.hJK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AEQbTJ(this.OLrzqt, (ConsumeData) obj);
            }
        }));
        fARcdN().AwvSrB().observe(this, new AssistContent(new Function1() { // from class: o.hJG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.gEmmrt(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        fARcdN().zuWLRA().getCurrentState().observe(this, new AssistContent(new Function1() { // from class: o.hJJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.KWHzl(this.EZpvd, (SwapState) obj);
            }
        }));
        fARcdN().aUsmxb().observe(this, new AssistContent(new Function1() { // from class: o.hJP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.DbNXlk(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        fARcdN().QkdxfA().observe(this, new AssistContent(new Function1() { // from class: o.hJO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AEQbTJ(this.copydefault, (LimitMarketPrice.QuoteState) obj);
            }
        }));
        fARcdN().QSBOWP().observe(this, new AssistContent(new Function1() { // from class: o.hJN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AEQbTJ(this.EZpvd, (ExpireTimeData) obj);
            }
        }));
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (hnk2 = hbj.EZpvd) != null) {
            hnk2.copydefault(new View.OnFocusChangeListener() { // from class: o.hJM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    LimitOrderContentFragment.AEQbTJ(this.AEQbTJ, view, z);
                }
            });
        }
        hBJ hbj2 = (hBJ) AwvSrB();
        if (hbj2 != null && (hnk = hbj2.EZpvd) != null) {
            hnk.EZpvd(new View.OnFocusChangeListener() { // from class: o.hJL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    LimitOrderContentFragment.EZpvd(this.KWHzl, view, z);
                }
            });
        }
        fARcdN().hrNTAI().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.hJT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AkhnZx(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        fARcdN().OBJEWx().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.hJU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.KWHzl(this.OLrzqt, (Unit) obj);
            }
        }));
        fARcdN().UlJrfe().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.hJQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.fetchVPNInfo(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        fARcdN().fJNWhG().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.hJY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.isConnected(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        fARcdN().zuBGHE().observe(getViewLifecycleOwner(), new AssistContent(new Function1() { // from class: o.hJW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.copydefault(this.OLrzqt, (DexMultiTokenInfoBean) obj);
            }
        }));
        c22380heK.copydefault(zuBGHE()).EZpvd(true).gEmmrt().OLrzqt().observe(getViewLifecycleOwner(), new Observer() { // from class: o.hJZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                LimitOrderContentFragment.EZpvd((java.util.List) obj);
            }
        });
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new LimitOrderContentFragment$addDataListener$34(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new LimitOrderContentFragment$addDataListener$35(this, null), 3, null);
    }

    public static final Unit OLrzqt(LimitOrderContentFragment limitOrderContentFragment, PreCheckBean preCheckBean) {
        if (preCheckBean != null && !preCheckBean.isSupportQuote()) {
            limitOrderContentFragment.fARcdN().gEmmrt(false);
        }
        return Unit.INSTANCE;
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(gLQ glq, Continuation<? super Unit> continuation) {
            hLE hleKWHzl;
            LimitErrorViewHandle limitErrorViewHandle = LimitOrderContentFragment.this.AYXKKw;
            if (limitErrorViewHandle != null && (hleKWHzl = limitErrorViewHandle.KWHzl()) != null) {
                hleKWHzl.copydefault(glq);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(ReminderListConfig reminderListConfig, Continuation<? super Unit> continuation) {
            ReminderInfoConfig reminderConfig;
            hBJ hbjAubY = LimitOrderContentFragment.AubY(LimitOrderContentFragment.this);
            if (hbjAubY != null) {
                LimitOrderContentFragment limitOrderContentFragment = LimitOrderContentFragment.this;
                TradeReminderType reminderType = (reminderListConfig == null || (reminderConfig = reminderListConfig.getReminderConfig()) == null) ? null : reminderConfig.getReminderType();
                if (reminderType != TradeReminderType.None) {
                    LimitErrorViewHandle limitErrorViewHandle = limitOrderContentFragment.AYXKKw;
                    if (limitErrorViewHandle != null) {
                        LimitErrorViewHandle.ErrorType errorType = LimitErrorViewHandle.ErrorType.NormalCoin;
                        ErrorNoticeView errorNoticeView = hbjAubY.KWHzl;
                        Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
                        limitErrorViewHandle.OLrzqt(errorType, errorNoticeView);
                    }
                    limitOrderContentFragment.fARcdN().copydefault(reminderType);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return EZpvd(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object EZpvd(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                LimitOrderContentFragment.this.showLoading();
            } else {
                LimitOrderContentFragment.this.dismissLoading();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        public static final LoaderManager<T> EZpvd = new LoaderManager<>();

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            C55326xho.toastWithFailedIcon$default(str, 0, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(LimitPairRateResponse limitPairRateResponse, Continuation<? super Unit> continuation) {
            if (C33129mqd.OLrzqt((CharSequence) limitPairRateResponse.getChangeRate())) {
                SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModelFJNWhG = LimitOrderContentFragment.this.fJNWhG();
                LimitCalResult limitCalResultCopydefault = LimitOrderContentFragment.this.fARcdN().finit().copydefault();
                String strGkJEwt = LimitOrderContentFragment.this.fARcdN().gkJEwt();
                String strCopydefault = LimitOrderContentFragment.this.fARcdN().iRxXKY().copydefault();
                String strGHZMYf = LimitOrderContentFragment.this.fARcdN().gHZMYf();
                String str = strGHZMYf == null ? "" : strGHZMYf;
                DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = LimitOrderContentFragment.this.fARcdN().OcIXYQ();
                String tokenSymbol = dexMultiTokenInfoBeanOcIXYQ != null ? dexMultiTokenInfoBeanOcIXYQ.getTokenSymbol() : null;
                singleSwapLimitPlaceOrderViewModelFJNWhG.copydefault(limitPairRateResponse, limitCalResultCopydefault, strGkJEwt, strCopydefault, str, tokenSymbol == null ? "" : tokenSymbol, LimitOrderContentFragment.this.fARcdN().ODWQjV());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(LimitOrderDetailBean limitOrderDetailBean, Continuation<? super Unit> continuation) {
            LimitOrderContentFragment.this.hDKMBd();
            return Unit.INSTANCE;
        }
    }

    public static final Unit values(LimitOrderContentFragment limitOrderContentFragment, Boolean bool) {
        limitOrderContentFragment.fJNWhG().AhwBna();
        limitOrderContentFragment.fJNWhG().copydefault();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fIwbmz(LimitOrderContentFragment limitOrderContentFragment, Boolean bool) {
        hBJ hbj;
        LimitOrderRateView limitOrderRateView;
        if (bool.booleanValue() && (hbj = (hBJ) limitOrderContentFragment.AwvSrB()) != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            limitOrderRateView.EZpvd();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(LimitOrderContentFragment limitOrderContentFragment, String str) {
        LimitOrderRateView limitOrderRateView;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            Intrinsics.copydefault((Object) str);
            limitOrderRateView.AEQbTJ(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(LimitOrderContentFragment limitOrderContentFragment, boolean z) {
        LimitOrderRateView limitOrderRateView;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            limitOrderRateView.gEmmrt();
        }
        if (!z) {
            limitOrderContentFragment.fARcdN().valueOf(false);
            limitOrderContentFragment.fARcdN().AhwBna(true);
            if (limitOrderContentFragment.isVisibled()) {
                limitOrderContentFragment.ejfBZ().EZpvd();
            } else {
                limitOrderContentFragment.ejfBZ().copydefault();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(LimitOrderContentFragment limitOrderContentFragment, C22400hee c22400hee) {
        if (Intrinsics.EZpvd((Object) limitOrderContentFragment.ORxRYg().KWHzl().getValue(), (Object) TabTitleInfo.KEY_LIMIT_ORDER)) {
            if (Intrinsics.EZpvd((Object) c22400hee.EZpvd(), (Object) "DEXTrade_Home_FullPage_Click")) {
                C6965aZN.trackEventPageClick$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().fARcdN(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", c22400hee.AEQbTJ()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, c22400hee.copydefault())), null, null, 12, null);
            } else if (Intrinsics.EZpvd((Object) c22400hee.EZpvd(), (Object) "DEXTrade_Home_FullPage_View")) {
                C6965aZN.trackPageView$default(limitOrderContentFragment.fetchVPNInfo(), limitOrderContentFragment.fARcdN().fARcdN(), c22400hee.KWHzl(), null, 4, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(LimitOrderContentFragment limitOrderContentFragment, boolean z) {
        limitOrderContentFragment.fARcdN().isConnected();
        limitOrderContentFragment.ORxRYg().OLrzqt().setValue(Boolean.valueOf(z));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, LimitParam limitParam) {
        if (!Intrinsics.EZpvd(limitParam, LimitParam.Companion.AEQbTJ())) {
            C23310hvn c23310hvn = C23310hvn.copydefault;
            String name = LimitOrderContentFragment.class.getName();
            Intrinsics.checkNotNullExpressionValue(name, "");
            C23310hvn.i$default(c23310hvn, name, "swap info = " + limitParam.getFromChainId(), null, 4, null);
            limitOrderContentFragment.ORxRYg().OLrzqt().setValue(Boolean.TRUE);
            C22495hgT c22495hgTFARcdN = limitOrderContentFragment.fARcdN();
            Intrinsics.copydefault(limitParam);
            c22495hgTFARcdN.KWHzl(limitParam);
        }
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(LimitOrderContentFragment limitOrderContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            limitOrderContentFragment.fARcdN().igXuih();
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55328xhq.show$default(C55328xhq.OLrzqt, str, (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
    }

    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, Pair pair) {
        limitOrderContentFragment.AxsJAY();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(LimitOrderContentFragment limitOrderContentFragment, C19738gNm c19738gNm) {
        LimitOrderRateView limitOrderRateView;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            Intrinsics.copydefault(c19738gNm);
            limitOrderRateView.EZpvd(c19738gNm);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, ConsumeData consumeData) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq;
        LimitErrorViewHandle limitErrorViewHandle;
        TradeInputGroup tradeInputGroup = (TradeInputGroup) consumeData.consumeData();
        if (tradeInputGroup != null) {
            limitOrderContentFragment.getNewProxyInstance();
            limitOrderContentFragment.RJOkX().AEQbTJ(yDY.gEmmrt(limitOrderContentFragment.fARcdN().OcIXYQ(), limitOrderContentFragment.fARcdN().QKudOq()));
            hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
            if (hbj != null) {
                C19738gNm value = limitOrderContentFragment.fARcdN().RJOkX().getValue();
                TradeInputData tradeInputDataConsumeData = tradeInputGroup.getFromData().consumeData();
                if (tradeInputDataConsumeData != null) {
                    tradeInputDataConsumeData.setFrom(true);
                    hbj.EZpvd.setFromData(limitOrderContentFragment.fARcdN().QVAiDq().AEQbTJ(tradeInputDataConsumeData, value));
                }
                TradeInputData tradeInputDataConsumeData2 = tradeInputGroup.getToData().consumeData();
                if (tradeInputDataConsumeData2 != null) {
                    tradeInputDataConsumeData2.setFrom(false);
                    hbj.EZpvd.setLimitToData(limitOrderContentFragment.fARcdN().QVAiDq().AEQbTJ(tradeInputDataConsumeData2, value));
                }
                limitOrderContentFragment.fARcdN().ixgjPv();
                DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = limitOrderContentFragment.fARcdN().OcIXYQ();
                if (((dexMultiTokenInfoBeanOcIXYQ != null && dexMultiTokenInfoBeanOcIXYQ.isExceptionCoin()) || ((dexMultiTokenInfoBeanQKudOq = limitOrderContentFragment.fARcdN().QKudOq()) != null && dexMultiTokenInfoBeanQKudOq.isExceptionCoin())) && (limitErrorViewHandle = limitOrderContentFragment.AYXKKw) != null && !limitErrorViewHandle.AEQbTJ()) {
                    limitOrderContentFragment.fARcdN().AwvSrB().setValue(Boolean.TRUE);
                }
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(LimitOrderContentFragment limitOrderContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = limitOrderContentFragment.fARcdN().OcIXYQ();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = limitOrderContentFragment.fARcdN().QKudOq();
            if (dexMultiTokenInfoBeanOcIXYQ != null && dexMultiTokenInfoBeanOcIXYQ.isExceptionCoin()) {
                limitOrderContentFragment.AEQbTJ(dexMultiTokenInfoBeanOcIXYQ);
            } else if (dexMultiTokenInfoBeanQKudOq != null && dexMultiTokenInfoBeanQKudOq.isExceptionCoin()) {
                limitOrderContentFragment.AEQbTJ(dexMultiTokenInfoBeanQKudOq);
            } else if (dexMultiTokenInfoBeanOcIXYQ != null) {
                limitOrderContentFragment.AEQbTJ(dexMultiTokenInfoBeanOcIXYQ);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(LimitOrderContentFragment limitOrderContentFragment, SwapState swapState) {
        C21828hNv c21828hNv;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (c21828hNv = hbj.OLrzqt) != null) {
            c21828hNv.setTradeStateButton(swapState.isButtonStateInterception(limitOrderContentFragment.gEmmrt().OLrzqt()), limitOrderContentFragment.fARcdN().OcIXYQ(), limitOrderContentFragment.fARcdN().QKudOq(), limitOrderContentFragment.zuBGHE());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit DbNXlk(LimitOrderContentFragment limitOrderContentFragment, Boolean bool) {
        LimitOrderRateView limitOrderRateView;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            limitOrderRateView.AYXKKw();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r7v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(final LimitOrderContentFragment limitOrderContentFragment, final LimitMarketPrice.QuoteState quoteState) {
        DexPresetResultVO dexPresetResultVO;
        C21831hNy c21831hNy;
        C21831hNy c21831hNy2;
        C21831hNy c21831hNy3;
        LimitOrderRateView limitOrderRateView;
        C19738gNm value = limitOrderContentFragment.fARcdN().RJOkX().getValue();
        final boolean z = true;
        boolean zCopydefault = value != null ? value.copydefault() : true;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            Intrinsics.copydefault(quoteState);
            limitOrderRateView.OLrzqt(quoteState, zCopydefault);
        }
        hBJ hbj2 = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj2 != null && (c21831hNy3 = hbj2.AYXKKw) != null) {
            FragmentActivity fragmentActivityRequireActivity = limitOrderContentFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c21831hNy3.setLiquidityVisible(fragmentActivityRequireActivity);
        }
        Result<DexPresetResultVO> resultOLrzqt = limitOrderContentFragment.fARcdN().OLrzqt(limitOrderContentFragment.fARcdN().fARcdN());
        if (resultOLrzqt != null) {
            Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
        } else {
            dexPresetResultVO = null;
        }
        hBJ hbj3 = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj3 != null && (c21831hNy2 = hbj3.AYXKKw) != null) {
            limitOrderContentFragment.KWHzl(c21831hNy2, dexPresetResultVO);
        }
        gLQ glqOLrzqt = limitOrderContentFragment.fARcdN().OLrzqt(limitOrderContentFragment.fARcdN().fARcdN(), limitOrderContentFragment.fARcdN().dmfpNf());
        if (!(glqOLrzqt instanceof gLQ.ActionBar) && !(glqOLrzqt instanceof gLQ.FragmentManager) && !(glqOLrzqt instanceof gLQ.Dialog) && !(glqOLrzqt instanceof gLQ.LoaderManager) && !(glqOLrzqt instanceof gLQ.AssistContent) && !(glqOLrzqt instanceof gLQ.Activity)) {
            z = false;
        }
        limitOrderContentFragment.fARcdN().RdAHlO().getWalletState(limitOrderContentFragment.fARcdN().fARcdN(), limitOrderContentFragment.zuBGHE(), new Function1() { // from class: o.hJu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.OLrzqt(quoteState, z, limitOrderContentFragment, (SwapState) obj);
            }
        });
        if (limitOrderContentFragment.fARcdN().QVsKAR()) {
            limitOrderContentFragment.fetchVPNInfo().OLrzqt(limitOrderContentFragment.fARcdN().fARcdN(), EventPageNameType.LIMIT.getPageName(), limitOrderContentFragment.fARcdN().flVtFt());
        }
        hBJ hbj4 = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj4 != null && (c21831hNy = hbj4.AYXKKw) != null) {
            LimitPairRateResponse limitPairRateResponseAYXKKw = limitOrderContentFragment.fARcdN().finit().AYXKKw();
            c21831hNy.setServiceFee(limitPairRateResponseAYXKKw != null ? limitPairRateResponseAYXKKw.getServiceFeeInfo() : null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(LimitMarketPrice.QuoteState quoteState, boolean z, LimitOrderContentFragment limitOrderContentFragment, SwapState swapState) {
        C21831hNy c21831hNy;
        LimitOrderRateView limitOrderRateView;
        C21831hNy c21831hNy2;
        PreCheckBean value;
        LimitOrderRateView limitOrderRateView2;
        Intrinsics.checkNotNullParameter(swapState, "");
        if (yDY.gEmmrt(LimitMarketPrice.QuoteState.QuoteFail, LimitMarketPrice.QuoteState.Quoting).contains(quoteState) || z || !C22416heu.zLjUOn() || swapState != SwapState.WALLET_SUCCESS) {
            hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
            if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
                limitOrderRateView.setVisibility(0);
            }
            hBJ hbj2 = (hBJ) limitOrderContentFragment.AwvSrB();
            if (hbj2 != null && (c21831hNy = hbj2.AYXKKw) != null) {
                c21831hNy.setVisibility(8);
            }
        } else {
            hBJ hbj3 = (hBJ) limitOrderContentFragment.AwvSrB();
            if (hbj3 != null && (limitOrderRateView2 = hbj3.AEQbTJ) != null) {
                limitOrderRateView2.setVisibility(0);
            }
            hBJ hbj4 = (hBJ) limitOrderContentFragment.AwvSrB();
            if (hbj4 != null && (c21831hNy2 = hbj4.AYXKKw) != null) {
                hLI hliQUSxYX = limitOrderContentFragment.fARcdN().QUSxYX();
                c21831hNy2.setVisibility((hliQUSxYX == null || !hliQUSxYX.AEQbTJ() || (value = limitOrderContentFragment.fARcdN().dvKsVJ().getValue()) == null || !value.isSupportQuote()) ? 8 : 0);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, ExpireTimeData expireTimeData) {
        C21831hNy c21831hNy;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (c21831hNy = hbj.AYXKKw) != null) {
            c21831hNy.OLrzqt(expireTimeData.AEQbTJ());
        }
        limitOrderContentFragment.fARcdN().OLrzqt(expireTimeData.EZpvd(), expireTimeData.OLrzqt(), expireTimeData.AEQbTJ());
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, View view, boolean z) {
        limitOrderContentFragment.fARcdN().EZpvd(z);
        pUU.KWHzl("LimitOrderContentFragment", "addFromTextFocusChangedListener()");
    }

    public static final void EZpvd(LimitOrderContentFragment limitOrderContentFragment, View view, boolean z) {
        limitOrderContentFragment.fARcdN().copydefault(z);
    }

    public static final Unit AkhnZx(LimitOrderContentFragment limitOrderContentFragment, Boolean bool) {
        if (bool.booleanValue()) {
            limitOrderContentFragment.fARcdN().fERRXa();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(LimitOrderContentFragment limitOrderContentFragment, Unit unit) {
        LimitOrderRateView limitOrderRateView;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            limitOrderRateView.setRateTitle();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit fetchVPNInfo(LimitOrderContentFragment limitOrderContentFragment, Boolean bool) {
        LimitOrderRateView limitOrderRateView;
        hBJ hbj = (hBJ) limitOrderContentFragment.AwvSrB();
        if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            limitOrderRateView.AEQbTJ(limitOrderContentFragment.fARcdN().zsXlph(), false);
        }
        return Unit.INSTANCE;
    }

    public static final Unit isConnected(LimitOrderContentFragment limitOrderContentFragment, Boolean bool) {
        InterfaceC22433hfK interfaceC22433hfKUeEOUB;
        if (bool.booleanValue()) {
            InterfaceC22433hfK interfaceC22433hfKUeEOUB2 = limitOrderContentFragment.fARcdN().UeEOUB();
            if (interfaceC22433hfKUeEOUB2 != null) {
                interfaceC22433hfKUeEOUB2.EZpvd(LimitErrorViewHandle.ErrorType.CANCEL_APPROVE);
            }
        } else {
            LimitErrorViewHandle limitErrorViewHandle = limitOrderContentFragment.AYXKKw;
            if ((limitErrorViewHandle != null ? limitErrorViewHandle.copydefault() : null) == LimitErrorViewHandle.ErrorType.CANCEL_APPROVE && (interfaceC22433hfKUeEOUB = limitOrderContentFragment.fARcdN().UeEOUB()) != null) {
                interfaceC22433hfKUeEOUB.EZpvd(LimitErrorViewHandle.ErrorType.NormalCoin);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(LimitOrderContentFragment limitOrderContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        limitOrderContentFragment.AuCTel = true;
        Intrinsics.copydefault(dexMultiTokenInfoBean);
        limitOrderContentFragment.KWHzl(dexMultiTokenInfoBean);
        limitOrderContentFragment.RJOkX().values();
        return Unit.INSTANCE;
    }

    public static final void EZpvd(List list) {
        if (list != null) {
            list.isEmpty();
        }
    }

    public final void KWHzl(C21831hNy c21831hNy, DexPresetResultVO dexPresetResultVO) {
        LimitPairRateResponse limitPairRateResponseAYXKKw = fARcdN().finit().AYXKKw();
        LimitFeeData feeData = limitPairRateResponseAYXKKw != null ? limitPairRateResponseAYXKKw.getFeeData() : null;
        c21831hNy.AEQbTJ(fARcdN().gkJEwt());
        AYXKKw();
        if (feeData != null) {
            Pair<PriorityFeeType, String> pairValues = values();
            PriorityFeeType priorityFeeTypeComponent1 = pairValues.component1();
            String strComponent2 = pairValues.component2();
            String strFARcdN = fARcdN().fARcdN();
            boolean zOLrzqt = OLrzqt(strFARcdN, limitPairRateResponseAYXKKw, dexPresetResultVO);
            String strOLrzqt = fJNWhG().OLrzqt(strFARcdN, priorityFeeTypeComponent1.getValue(), zOLrzqt, feeData, strComponent2);
            fJNWhG().AEQbTJ(strFARcdN, priorityFeeTypeComponent1, strOLrzqt);
            SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModelFJNWhG = fJNWhG();
            int value = priorityFeeTypeComponent1.getValue();
            String estimateGasFee = limitPairRateResponseAYXKKw.getEstimateGasFee();
            String str = estimateGasFee == null ? "" : estimateGasFee;
            DefiChainInfo defiChainInfoCopydefault = fJNWhG().copydefault(strFARcdN);
            String networkFeeDisplayDecimals = defiChainInfoCopydefault != null ? defiChainInfoCopydefault.getNetworkFeeDisplayDecimals() : null;
            String str2 = networkFeeDisplayDecimals == null ? "" : networkFeeDisplayDecimals;
            LimitOrderInfo limitOrderInfo = limitPairRateResponseAYXKKw.getLimitOrderInfo();
            String nativeTokenUnitPriceUsd = limitOrderInfo != null ? limitOrderInfo.getNativeTokenUnitPriceUsd() : null;
            c21831hNy.copydefault(singleSwapLimitPlaceOrderViewModelFJNWhG.AEQbTJ(strFARcdN, value, zOLrzqt, feeData, strOLrzqt, str, str2, nativeTokenUnitPriceUsd == null ? "" : nativeTokenUnitPriceUsd));
            c21831hNy.KWHzl(strFARcdN, EZpvd(strFARcdN, dexPresetResultVO).getValue(), zOLrzqt, MevUnstableShowLevelType.NORMAL.getType(), OLrzqt(strFARcdN, dexPresetResultVO, feeData));
        }
    }

    public static /* synthetic */ boolean supportAutoMode$default(LimitOrderContentFragment limitOrderContentFragment, String str, DexPresetResultVO dexPresetResultVO, LimitFeeData limitFeeData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitOrderContentFragment.fARcdN().fARcdN();
        }
        if ((i & 2) != 0) {
            Result<DexPresetResultVO> resultOLrzqt = limitOrderContentFragment.fARcdN().OLrzqt(str);
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
            LimitPairRateResponse limitPairRateResponseAYXKKw = limitOrderContentFragment.fARcdN().finit().AYXKKw();
            limitFeeData = limitPairRateResponseAYXKKw != null ? limitPairRateResponseAYXKKw.getFeeData() : null;
        }
        return limitOrderContentFragment.OLrzqt(str, dexPresetResultVO, limitFeeData);
    }

    public final boolean OLrzqt(String str, DexPresetResultVO dexPresetResultVO, LimitFeeData limitFeeData) {
        if (dexPresetResultVO != null) {
            return dexPresetResultVO.getSupportAutoMode();
        }
        return (limitFeeData != null ? limitFeeData.getMevFeeData() : null) != null;
    }

    public final void iwGUEr() {
        C22495hgT.getExpireConfig$default(fARcdN(), false, 1, null);
    }

    private final void OLrzqt(boolean z) {
        this.AuCTel = z;
        C25632jAp c25632jAp = C25632jAp.KWHzl;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c25632jAp.copydefault(childFragmentManager, new C28385kZl(TradingBizType.Limit, fARcdN().iwGUEr(), fARcdN().iwGUEr(), z, z, null, null, null, 224, null), new Function1() { // from class: o.hIB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.djBIcL(this.AEQbTJ, (DexMultiTokenInfoBean) obj);
            }
        });
    }

    public static final Unit djBIcL(LimitOrderContentFragment limitOrderContentFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        limitOrderContentFragment.KWHzl(dexMultiTokenInfoBean);
        return Unit.INSTANCE;
    }

    public final void KWHzl(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        TradeInputGroup data;
        ConsumeData<TradeInputData> fromData;
        TradeInputData data2;
        EditTextData editData;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = fARcdN().AEQbTJ(this.AuCTel);
        if (Intrinsics.EZpvd((Object) (dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getUniqueId() : null), (Object) dexMultiTokenInfoBean.getUniqueId())) {
            return;
        }
        fARcdN().isConnected();
        ConsumeData<TradeInputGroup> value = fARcdN().getPostValueLengthLimit().getValue();
        if (value != null && (data = value.getData()) != null && (fromData = data.getFromData()) != null && (data2 = fromData.getData()) != null && (editData = data2.getEditData()) != null) {
            editData.setMaxData(MultiTransferSignData.DEFAULT_INTERVAL);
        }
        if (this.AuCTel) {
            fARcdN().QVAiDq().copydefault(dexMultiTokenInfoBean);
        } else {
            fARcdN().QVAiDq().AEQbTJ(dexMultiTokenInfoBean);
        }
        AEQbTJ(dexMultiTokenInfoBean);
        fARcdN().QbewEr().OLrzqt();
        ORxRYg().OLrzqt().setValue(Boolean.TRUE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        C21831hNy c21831hNy;
        int i;
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj == null || (c21831hNy = hbj.AYXKKw) == null) {
            return;
        }
        if (dexMultiTokenInfoBean.isExceptionCoin()) {
            EZpvd(LimitErrorViewHandle.ErrorType.Leverage);
        } else {
            hLI hliQUSxYX = fARcdN().QUSxYX();
            if (hliQUSxYX != null && hliQUSxYX.AEQbTJ()) {
                i = 0;
            }
            c21831hNy.setVisibility(i);
        }
        i = 8;
        c21831hNy.setVisibility(i);
    }

    private final void QVAiDq() {
        Unit unit;
        InterfaceC9738bbJ interfaceC9738bbJHBpjJd = fARcdN().hBpjJd();
        if (interfaceC9738bbJHBpjJd != null) {
            if (interfaceC9738bbJHBpjJd.zLjUOn()) {
                QUSxYX();
                unit = Unit.INSTANCE;
            } else {
                FragmentActivity activity = getActivity();
                AbstractActivityC33041mov abstractActivityC33041mov = activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null;
                if (abstractActivityC33041mov != null) {
                    String strZuBGHE = zuBGHE();
                    androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
                    C31205lpd.AEQbTJ(abstractActivityC33041mov, strZuBGHE, parentFragmentManager, interfaceC9738bbJHBpjJd);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
            }
            if (unit != null) {
                return;
            }
        }
        QUSxYX();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void QUSxYX() {
        String originContractAddress;
        InterfaceC23194htd interfaceC23194htdFARcdN = C22380heK.OLrzqt.copydefault(zuBGHE()).fARcdN();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.copydefault(fragmentActivityRequireActivity, "");
        AbstractActivityC33041mov abstractActivityC33041mov = (AbstractActivityC33041mov) fragmentActivityRequireActivity;
        String strFARcdN = fARcdN().fARcdN();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = fARcdN().OcIXYQ();
        if (dexMultiTokenInfoBeanOcIXYQ == null || !dexMultiTokenInfoBeanOcIXYQ.isMainChainCoin()) {
            DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ2 = fARcdN().OcIXYQ();
            originContractAddress = dexMultiTokenInfoBeanOcIXYQ2 != null ? dexMultiTokenInfoBeanOcIXYQ2.getOriginContractAddress() : null;
            if (originContractAddress == null) {
                originContractAddress = "";
            }
        }
        InterfaceC23194htd.Application.showRechargeDialog$default(interfaceC23194htdFARcdN, abstractActivityC33041mov, strFARcdN, originContractAddress, null, null, null, 56, null);
        AYXKKw(EventTrackSubmitType.DEPOSIT.getType());
    }

    public final Pair<PriorityFeeType, String> values() {
        LimitFeeData limitFeeData;
        LimitPairRateResponse limitPairRateResponseAYXKKw = fARcdN().finit().AYXKKw();
        if (limitPairRateResponseAYXKKw == null || (limitFeeData = limitPairRateResponseAYXKKw.getFeeData()) == null) {
            String str = null;
            limitFeeData = new LimitFeeData(new MevBasedFeeData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str, str, 16383, (DefaultConstructorMarker) null), new MevBasedFeeData((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 16383, (DefaultConstructorMarker) null));
        }
        String strFARcdN = fARcdN().fARcdN();
        SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModelFJNWhG = fJNWhG();
        Result<DexPresetResultVO> resultOLrzqt = fARcdN().OLrzqt(strFARcdN);
        DexPresetResultVO dexPresetResultVO = null;
        if (resultOLrzqt != null) {
            Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
            dexPresetResultVO = (DexPresetResultVO) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
        }
        return singleSwapLimitPlaceOrderViewModelFJNWhG.copydefault(strFARcdN, OLrzqt(strFARcdN, limitPairRateResponseAYXKKw, dexPresetResultVO), limitFeeData);
    }

    public static /* synthetic */ boolean isOpenMev$default(LimitOrderContentFragment limitOrderContentFragment, String str, LimitPairRateResponse limitPairRateResponse, DexPresetResultVO dexPresetResultVO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitOrderContentFragment.fARcdN().fARcdN();
        }
        if ((i & 2) != 0) {
            limitPairRateResponse = limitOrderContentFragment.fARcdN().finit().AYXKKw();
        }
        if ((i & 4) != 0) {
            Result<DexPresetResultVO> resultOLrzqt = limitOrderContentFragment.fARcdN().OLrzqt(str);
            if (resultOLrzqt != null) {
                Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
                dexPresetResultVO = (DexPresetResultVO) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
            } else {
                dexPresetResultVO = null;
            }
        }
        return limitOrderContentFragment.OLrzqt(str, limitPairRateResponse, dexPresetResultVO);
    }

    public final boolean OLrzqt(String str, LimitPairRateResponse limitPairRateResponse, DexPresetResultVO dexPresetResultVO) {
        LimitOrderInfo limitOrderInfo;
        if (limitPairRateResponse == null || (limitOrderInfo = limitPairRateResponse.getLimitOrderInfo()) == null) {
            return false;
        }
        return fJNWhG().copydefault(str, limitOrderInfo.getEnableMev(), OLrzqt(str, dexPresetResultVO, limitPairRateResponse.getFeeData()), copydefault(str, dexPresetResultVO));
    }

    public static /* synthetic */ String getDefaultRouterModeType$default(LimitOrderContentFragment limitOrderContentFragment, String str, DexPresetResultVO dexPresetResultVO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitOrderContentFragment.fARcdN().fARcdN();
        }
        if ((i & 2) != 0) {
            Result<DexPresetResultVO> resultOLrzqt = limitOrderContentFragment.fARcdN().OLrzqt(str);
            if (resultOLrzqt != null) {
                Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
                dexPresetResultVO = (DexPresetResultVO) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
            } else {
                dexPresetResultVO = null;
            }
        }
        return limitOrderContentFragment.copydefault(str, dexPresetResultVO);
    }

    public final String copydefault(String str, DexPresetResultVO dexPresetResultVO) {
        ArrayList<PresetUserConfigBean> dexPresetResultVOList;
        PresetUserConfigBean presetUserConfigBean;
        BuySellPreset buyPreset;
        RouteConfig routeConfig;
        String routerModeType;
        return (dexPresetResultVO == null || (dexPresetResultVOList = dexPresetResultVO.getDexPresetResultVOList()) == null || (presetUserConfigBean = (PresetUserConfigBean) CollectionsKt___CollectionsKt.firstOrNull(dexPresetResultVOList)) == null || (buyPreset = presetUserConfigBean.getBuyPreset()) == null || (routeConfig = buyPreset.getRouteConfig()) == null || (routerModeType = routeConfig.getRouterModeType()) == null) ? PresetRouteType.RouteTypeAuto.getValue() : routerModeType;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.tee.swap.limit.ui.viewmodel.SingleSwapLimitPlaceOrderViewModel.createOrder$default(com.okinc.business.dex.tee.swap.limit.ui.viewmodel.SingleSwapLimitPlaceOrderViewModel, com.okinc.business.dexlogic.main.limmitorder.bean.LimitCalResult, com.okinc.business.dex.tee.domain.model.CreateOrderReq, com.okinc.business.trade.features.home.ui.cefi.data.LimitPairRateResponse, androidx.fragment.app.FragmentActivity, o.bbL$TaskDescription, boolean, int, java.lang.Object):void */
    public final void AubY() {
        if (fJNWhG().AYXKKw()) {
            LimitPairRateResponse value = fARcdN().djSkpj().getValue();
            Pair<Boolean, LimitCalResult> value2 = fARcdN().uzCIH().getValue();
            if (value2 == null) {
                return;
            }
            SingleSwapLimitPlaceOrderViewModel singleSwapLimitPlaceOrderViewModelFJNWhG = fJNWhG();
            LimitCalResult second = value2.getSecond();
            CreateOrderReq createOrderReqCopydefault = fARcdN().copydefault(values(), getRouterModeType$default(this, null, null, 3, null).getValue());
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            SingleSwapLimitPlaceOrderViewModel.createOrder$default(singleSwapLimitPlaceOrderViewModelFJNWhG, second, createOrderReqCopydefault, value, fragmentActivityRequireActivity, new VoiceInteractor(), false, 32, null);
            return;
        }
        C31200lpY.throwIfDebug$default(LimitOrderContentFragment.class.getName(), null, 2, null);
        pUU.KWHzl("LimitOrderContentFragment", "submitLimitOrder error");
    }

    public static final class VoiceInteractor implements InterfaceC9740bbL.TaskDescription {
        public VoiceInteractor() {
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void copydefault() {
            LimitOrderContentFragment.this.fJNWhG().EZpvd(true);
        }

        @Override // o.InterfaceC9740bbL.TaskDescription
        public void EZpvd() {
            LimitOrderContentFragment.this.fJNWhG().EZpvd(false);
        }
    }

    private final void EZpvd(Bundle bundle) {
        if ((bundle != null && bundle.getInt("result") != -1) || fARcdN().OcIXYQ() == null || fARcdN().finit().copydefault() == null) {
            return;
        }
        boolean z = bundle != null ? bundle.getBoolean("extra_universal_1", false) : false;
        C22380heK.OLrzqt.copydefault(zuBGHE()).gEmmrt().KWHzl(fARcdN().OcIXYQ(), fARcdN().QKudOq(), (z ? ApproveStatus.CANCEL_APPROVING : ApproveStatus.APPROVING).getType());
        fARcdN().AhwBna();
        AYXKKw((z ? EventTrackSubmitType.REVOKE : EventTrackSubmitType.APPROVE).getType());
    }

    public final void AYXKKw(String str) {
        DexPresetResultVO dexPresetResultVO;
        String value;
        String str2;
        String value2;
        LimitPairRateResponse limitPairRateResponseAYXKKw = fARcdN().finit().AYXKKw();
        String strFARcdN = fARcdN().fARcdN();
        Result<DexPresetResultVO> resultOLrzqt = fARcdN().OLrzqt(strFARcdN);
        Boolean boolValueOf = null;
        if (resultOLrzqt != null) {
            Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
            if (Result.m7383isFailureimpl(objM7386unboximpl)) {
                objM7386unboximpl = null;
            }
            dexPresetResultVO = (DexPresetResultVO) objM7386unboximpl;
        } else {
            dexPresetResultVO = null;
        }
        PresetRouteType routerModeType$default = getRouterModeType$default(this, strFARcdN, null, 2, null);
        boolean zOLrzqt = OLrzqt(strFARcdN, limitPairRateResponseAYXKKw, dexPresetResultVO);
        Pair<PriorityFeeType, String> pairValues = values();
        PriorityFeeType priorityFeeTypeComponent1 = pairValues.component1();
        String strComponent2 = pairValues.component2();
        if (dexPresetResultVO != null) {
            boolValueOf = Boolean.valueOf(dexPresetResultVO.getSupportEip1559() || Intrinsics.EZpvd((Object) String.valueOf(dexPresetResultVO.getMemeChainType()), (Object) MemeChainType.MemeChainTypeSol.getValue()));
        }
        C22495hgT c22495hgTFARcdN = fARcdN();
        if (zOLrzqt) {
            value = DexTrackEventParameter.ButtonName.ON.getValue();
        } else {
            if (zOLrzqt) {
                throw new NoWhenBranchMatchedException();
            }
            value = DexTrackEventParameter.ButtonName.OFF.getValue();
        }
        String str3 = value;
        String mode = (routerModeType$default == PresetRouteType.RouteTypeAuto ? EventTrackingRouteMode.Auto : EventTrackingRouteMode.Manual).getMode();
        int i = Activity.EZpvd[routerModeType$default.ordinal()];
        if (i == 1) {
            str2 = "";
        } else {
            if (i == 2) {
                value2 = DexTrackEventParameter.EventMevType.ANTI_MEV.getValue();
            } else if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                str2 = "";
            } else {
                value2 = DexTrackEventParameter.EventMevType.FAST.getValue();
            }
            str2 = value2;
        }
        Boolean bool = Boolean.TRUE;
        String str4 = Intrinsics.EZpvd(boolValueOf, bool) ? strComponent2 : "";
        Boolean bool2 = Boolean.FALSE;
        AbstractC22403heh abstractC22403hehKWHzl = c22495hgTFARcdN.KWHzl(str, strComponent2, str3, mode, str2, str4, Intrinsics.EZpvd(boolValueOf, bool2) ? strComponent2 : "", Intrinsics.EZpvd(boolValueOf, bool) ? C25289its.EZpvd(priorityFeeTypeComponent1.getValue()) : "", Intrinsics.EZpvd(boolValueOf, bool2) ? C25289its.EZpvd(priorityFeeTypeComponent1.getValue()) : "");
        if (abstractC22403hehKWHzl != null) {
            AkhnZx().AEQbTJ(abstractC22403hehKWHzl);
        }
    }

    public static /* synthetic */ PresetRouteType getRouterModeType$default(LimitOrderContentFragment limitOrderContentFragment, String str, DexPresetResultVO dexPresetResultVO, int i, Object obj) {
        if ((i & 1) != 0) {
            str = limitOrderContentFragment.fARcdN().fARcdN();
        }
        if ((i & 2) != 0) {
            Result<DexPresetResultVO> resultOLrzqt = limitOrderContentFragment.fARcdN().OLrzqt(str);
            if (resultOLrzqt != null) {
                Object objM7386unboximpl = resultOLrzqt.m7386unboximpl();
                dexPresetResultVO = (DexPresetResultVO) (Result.m7383isFailureimpl(objM7386unboximpl) ? null : objM7386unboximpl);
            } else {
                dexPresetResultVO = null;
            }
        }
        return limitOrderContentFragment.EZpvd(str, dexPresetResultVO);
    }

    public final PresetRouteType EZpvd(String str, DexPresetResultVO dexPresetResultVO) {
        return fJNWhG().OLrzqt(str, supportAutoMode$default(this, str, dexPresetResultVO, null, 4, null), copydefault(str, dexPresetResultVO));
    }

    private final void copydefault(Bundle bundle) {
        String string;
        if (bundle == null || (string = bundle.getString("data")) == null) {
            string = "";
        }
        if ((bundle == null || bundle.getInt("result") == -1) && C33129mqd.OLrzqt((CharSequence) string)) {
            hDKMBd();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void hDKMBd() {
        LimitOrderRateView limitOrderRateView;
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (limitOrderRateView = hbj.AEQbTJ) != null) {
            limitOrderRateView.gEmmrt();
        }
        fARcdN().DbNXlk();
        fARcdN().KWHzl(true);
        C22495hgT.getMarketPrice$default(fARcdN(), null, 1, null);
        fARcdN().zuWLRA().refreshStatePool(new TradeStep(CheckStep.INPUT, false, SwapState.SWAP_INPUT, true, true));
    }

    public final void EZpvd(String str, String str2, final String str3, final Function0<Unit> function0) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(activity);
            viewOnClickListenerC54939xaY.setTitle(str);
            viewOnClickListenerC54939xaY.EZpvd(str2);
            viewOnClickListenerC54939xaY.EZpvd(C23274hvD.Fragment.Slwtri, new View.OnClickListener() { // from class: o.hJD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    LimitOrderContentFragment.EZpvd(function0, viewOnClickListenerC54939xaY, this, str3, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C23274hvD.Fragment.ibrGus, new View.OnClickListener() { // from class: o.hJF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    LimitOrderContentFragment.AEQbTJ(viewOnClickListenerC54939xaY, this, str3, view);
                }
            });
            viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(false);
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void EZpvd(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, LimitOrderContentFragment limitOrderContentFragment, String str, View view) {
        function0.invoke();
        viewOnClickListenerC54939xaY.dismiss();
        limitOrderContentFragment.EZpvd(str, Web3SecurityTrackEvent.VALUE_CONFIRM);
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, LimitOrderContentFragment limitOrderContentFragment, String str, View view) {
        viewOnClickListenerC54939xaY.dismiss();
        limitOrderContentFragment.EZpvd(str, OtpEventTracker.OTP_EVENT_VALUE_CANCEL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AxsJAY() {
        final hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null) {
            C22495hgT c22495hgTFARcdN = fARcdN();
            c22495hgTFARcdN.RdAHlO().getWalletState(c22495hgTFARcdN.fARcdN(), c22495hgTFARcdN.AxsJAYaxsJAY(), new Function1() { // from class: o.hIJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderContentFragment.OLrzqt(this.EZpvd, hbj, (SwapState) obj);
                }
            });
        }
    }

    public static final Unit OLrzqt(LimitOrderContentFragment limitOrderContentFragment, hBJ hbj, SwapState swapState) {
        Intrinsics.checkNotNullParameter(swapState, "");
        if (swapState == SwapState.WALLET_LEGAL) {
            LimitErrorViewHandle limitErrorViewHandle = limitOrderContentFragment.AYXKKw;
            if (limitErrorViewHandle != null) {
                LimitErrorViewHandle.ErrorType errorType = LimitErrorViewHandle.ErrorType.WalletLegal;
                ErrorNoticeView errorNoticeView = hbj.KWHzl;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
                limitErrorViewHandle.OLrzqt(errorType, errorNoticeView);
            }
        } else {
            LimitErrorViewHandle limitErrorViewHandle2 = limitOrderContentFragment.AYXKKw;
            if (limitErrorViewHandle2 != null) {
                LimitErrorViewHandle.ErrorType errorType2 = LimitErrorViewHandle.ErrorType.NormalCoin;
                ErrorNoticeView errorNoticeView2 = hbj.KWHzl;
                Intrinsics.checkNotNullExpressionValue(errorNoticeView2, "");
                limitErrorViewHandle2.OLrzqt(errorType2, errorNoticeView2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.limitorder.LimitOrderContentFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refresh$default(LimitOrderContentFragment limitOrderContentFragment, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        limitOrderContentFragment.AYXKKw((Function0<Unit>) function0);
    }

    public final void AYXKKw(final Function0<Unit> function0) {
        C22495hgT.getCoinAssets$default(fARcdN(), null, 1, null);
        fARcdN().AEQbTJ(new Function0() { // from class: o.hJq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderContentFragment.valueOf(function0);
            }
        });
    }

    public static final Unit valueOf(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void getFieldNames() {
        C21831hNy c21831hNy;
        ViewTreeObserver viewTreeObserver;
        C21831hNy c21831hNy2;
        ViewTreeObserver viewTreeObserver2;
        if (C23317hvu.AYXKKw() || this.fARcdN != null) {
            return;
        }
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (c21831hNy2 = hbj.AYXKKw) != null && (viewTreeObserver2 = c21831hNy2.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this);
        }
        hBJ hbj2 = (hBJ) AwvSrB();
        if (hbj2 == null || (c21831hNy = hbj2.AYXKKw) == null || (viewTreeObserver = c21831hNy.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hLS
    public void KWHzl(@NotNull Function2<? super C55001xbh, ? super String, Unit> function2, @NotNull Function2<? super C55001xbh, ? super String, Unit> function22) {
        hNK hnk;
        hNK hnk2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (hnk2 = hbj.EZpvd) != null) {
            hnk2.KWHzl(function2);
        }
        hBJ hbj2 = (hBJ) AwvSrB();
        if (hbj2 == null || (hnk = hbj2.EZpvd) == null) {
            return;
        }
        hnk.AEQbTJ(function22);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hLS
    public void AEQbTJ(@NotNull Function2<? super C55001xbh, ? super String, Unit> function2, @NotNull Function2<? super C55001xbh, ? super String, Unit> function22) {
        hNK hnk;
        hNK hnk2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (hnk2 = hbj.EZpvd) != null) {
            hnk2.OLrzqt(function2);
        }
        hBJ hbj2 = (hBJ) AwvSrB();
        if (hbj2 == null || (hnk = hbj2.EZpvd) == null) {
            return;
        }
        hnk.djBIcL(function22);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hLS
    public void copydefault(@NotNull Function2<? super C55001xbh, ? super String, Unit> function2, @NotNull Function2<? super C55001xbh, ? super String, Unit> function22) {
        hNK hnk;
        hNK hnk2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (hnk2 = hbj.EZpvd) != null) {
            hnk2.EZpvd(function2);
        }
        hBJ hbj2 = (hBJ) AwvSrB();
        if (hbj2 == null || (hnk = hbj2.EZpvd) == null) {
            return;
        }
        hnk.copydefault(function22);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hLS
    public void EZpvd(@NotNull Function2<? super C55001xbh, ? super String, Unit> function2, @NotNull Function2<? super C55001xbh, ? super String, Unit> function22) {
        hNK hnk;
        hNK hnk2;
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function22, "");
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (hnk2 = hbj.EZpvd) != null) {
            hnk2.AhwBna(function2);
        }
        hBJ hbj2 = (hBJ) AwvSrB();
        if (hbj2 == null || (hnk = hbj2.EZpvd) == null) {
            return;
        }
        hnk.AYXKKw(function22);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        C52812wZg c52812wZg = this.fARcdN;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
        this.fARcdN = null;
        this.iwGUEr = null;
        ejfBZ().KWHzl().removeObserver(this.isConnected);
        fARcdN().AxsJAYsNCnLh().removeObserver(this.isConnected);
        this.AYXKKw = null;
        this.getFieldNames = null;
        fARcdN().fdOvFl();
        fJNWhG().copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC22433hfK
    public void EZpvd(@NotNull LimitErrorViewHandle.ErrorType errorType) {
        Intrinsics.checkNotNullParameter(errorType, "");
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null) {
            switch (Activity.copydefault[errorType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                    LimitErrorViewHandle limitErrorViewHandle = this.AYXKKw;
                    if (limitErrorViewHandle != null) {
                        ErrorNoticeView errorNoticeView = hbj.KWHzl;
                        Intrinsics.checkNotNullExpressionValue(errorNoticeView, "");
                        limitErrorViewHandle.OLrzqt(errorType, errorNoticeView);
                    }
                    break;
                default:
                    hbj.AYXKKw.setVisibility(0);
                    hbj.KWHzl.setVisibility(8);
                    break;
            }
            hLI hliQUSxYX = fARcdN().QUSxYX();
            if (hliQUSxYX == null || !hliQUSxYX.AEQbTJ()) {
                hbj.AYXKKw.setVisibility(8);
            }
        }
    }

    @Override // o.InterfaceC22433hfK
    public void OLrzqt(@NotNull LimitCalResult limitCalResult) {
        Intrinsics.checkNotNullParameter(limitCalResult, "");
        fARcdN().aUsmxb().setValue(Boolean.TRUE);
    }

    public final void EZpvd(final String str, final String str2) {
        C32866mlf.onEvent$default("DexSwapLimit_Pop_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.hKh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.OLrzqt(str, str2, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit OLrzqt(String str, String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "pop_type", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str2, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void trackSubmit$default(LimitOrderContentFragment limitOrderContentFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        limitOrderContentFragment.gEmmrt(str);
    }

    public final void gEmmrt(final String str) {
        C32866mlf.onEvent$default("DexSwapLimit_Button_PlaceLimitOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.hIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderContentFragment.AEQbTJ(this.copydefault, str, (EventParamsList) obj);
            }
        }, 1, (Object) null);
    }

    public static final Unit AEQbTJ(LimitOrderContentFragment limitOrderContentFragment, String str, EventParamsList eventParamsList) {
        String tokenSymbol;
        String tokenSymbol2;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOcIXYQ = limitOrderContentFragment.fARcdN().OcIXYQ();
        EventParamsList.put$default(eventParamsList, "symbol_sell", (dexMultiTokenInfoBeanOcIXYQ == null || (tokenSymbol2 = dexMultiTokenInfoBeanOcIXYQ.getTokenSymbol()) == null) ? "" : tokenSymbol2, false, 4, null);
        DexMultiTokenInfoBean dexMultiTokenInfoBeanQKudOq = limitOrderContentFragment.fARcdN().QKudOq();
        EventParamsList.put$default(eventParamsList, "symbol_buy", (dexMultiTokenInfoBeanQKudOq == null || (tokenSymbol = dexMultiTokenInfoBeanQKudOq.getTokenSymbol()) == null) ? "" : tokenSymbol, false, 4, null);
        EventParamsList.put$default(eventParamsList, "price_difference", limitOrderContentFragment.fARcdN().OuxcSI(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "expiry_in", limitOrderContentFragment.fARcdN().ffGIBT(), false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.SIDE, limitOrderContentFragment.fARcdN().DCUTEI(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "chain", limitOrderContentFragment.fARcdN().getFieldNames(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "balance_bracket", limitOrderContentFragment.fARcdN().OqFWZa(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "sell_token_compare", limitOrderContentFragment.fARcdN().DCJXGO(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "buy_token_compare", limitOrderContentFragment.fARcdN().DXXBbs(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "source", DexTrackEventParameter.AEQbTJ.OLrzqt(limitOrderContentFragment.zuBGHE()), false, 4, null);
        EventParamsList.put$default(eventParamsList, "activity_name", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, EopTrackEvent.KEY_BUTTON_NAME, str, false, 4, null);
        return Unit.INSTANCE;
    }

    public final void sSMYrx() {
        fARcdN().fetchVPNInfo();
        fARcdN().fERRXa();
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        C21831hNy c21831hNy;
        ViewTreeObserver viewTreeObserver;
        C21831hNy c21831hNy2;
        hBJ hbj = (hBJ) AwvSrB();
        if (hbj != null && (c21831hNy2 = hbj.AYXKKw) != null) {
            ArrayList arrayList = new ArrayList();
            C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(c21831hNy2);
            stateListAnimator.EZpvd(3);
            stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.aLnfMH));
            stateListAnimator.AEQbTJ(C55298xhM.dp$default(8, (Context) null, 1, (Object) null));
            stateListAnimator.copydefault(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null));
            stateListAnimator.AEQbTJ(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null));
            stateListAnimator.KWHzl(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null));
            stateListAnimator.OLrzqt(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null));
            arrayList.add(stateListAnimator);
            C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(c21831hNy2);
            stateListAnimator2.EZpvd(1);
            stateListAnimator2.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.UUsvzU));
            stateListAnimator2.AEQbTJ(C55298xhM.dp$default(8, (Context) null, 1, (Object) null));
            stateListAnimator2.copydefault(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null));
            stateListAnimator2.AEQbTJ(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null));
            stateListAnimator2.KWHzl(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null));
            stateListAnimator2.OLrzqt(C55298xhM.dpInt$default(8, (Context) null, 1, (Object) null));
            arrayList.add(stateListAnimator2);
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            C52812wZg c52812wZg = new C52812wZg(fragmentActivityRequireActivity);
            c52812wZg.EZpvd(arrayList);
            c52812wZg.OLrzqt(3);
            c52812wZg.KWHzl(new Function0() { // from class: o.hJy
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderContentFragment.AhwBna();
                }
            });
            c52812wZg.fARcdN();
            this.fARcdN = c52812wZg;
        }
        hBJ hbj2 = (hBJ) AwvSrB();
        if (hbj2 == null || (c21831hNy = hbj2.AYXKKw) == null || (viewTreeObserver = c21831hNy.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }

    public static final Unit AhwBna() {
        C23317hvu.djBIcL(true);
        return Unit.INSTANCE;
    }

    public final C22495hgT DbNXlk() {
        return fARcdN();
    }

    public final void AYXKKw() {
        hLI hliQUSxYX = fARcdN().QUSxYX();
        if ((hliQUSxYX == null || !Intrinsics.EZpvd(hliQUSxYX.copydefault(), Boolean.TRUE)) && fARcdN().DAIeex() != LimitErrorViewHandle.ErrorType.HoneyPot && fARcdN().DAIeex() != LimitErrorViewHandle.ErrorType.Leverage) {
            EZpvd(LimitErrorViewHandle.ErrorType.NormalCoin);
            return;
        }
        LimitPairRateResponse limitPairRateResponseAYXKKw = fARcdN().finit().AYXKKw();
        if (CollectionsKt___CollectionsKt.KWHzl((Iterable<? extends SwapState>) ((Iterable<? extends Object>) yDY.gEmmrt(SwapState.SWAP_AMOUNT_LOW, SwapState.QUOTE_COIN_ERROR, SwapState.FUNCTION_UPGRADE, SwapState.COUNT_ERROR, SwapState.APPROVE_ERROR, SwapState.WALLET_LEGAL, SwapState.COIN_ERROR, SwapState.MPC_WALLET_LEGAL, SwapState.SWAP_INPUT_FAIL, SwapState.LIMIT_REGION, SwapState.BLACK_ADDRESS, SwapState.SWAP_CONFIG_FETCH_FAILED)), fARcdN().zuWLRA().getCurrentState().getValue())) {
            return;
        }
        if (Intrinsics.EZpvd((Object) (limitPairRateResponseAYXKKw != null ? limitPairRateResponseAYXKKw.getTokenType() : null), (Object) "1")) {
            return;
        }
        EZpvd(LimitErrorViewHandle.ErrorType.SlippageWarning);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getNewProxyInstance() {
        boolean z;
        if (isVisibled()) {
            C22831hml c22831hmlORxRYg = ORxRYg();
            if (!this.values) {
                hLI hliQUSxYX = fARcdN().QUSxYX();
                z = true;
                if (hliQUSxYX != null && hliQUSxYX.AEQbTJ()) {
                    z = false;
                }
            }
            c22831hmlORxRYg.KWHzl(z);
        }
    }
}

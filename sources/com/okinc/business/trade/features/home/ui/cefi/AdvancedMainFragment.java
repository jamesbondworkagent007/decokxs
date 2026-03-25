package com.okinc.business.trade.features.home.ui.cefi;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.okinc.business.dex.trade.common.reminder.ReminderInfoConfig;
import com.okinc.business.dex.trade.common.reminder.ReminderShowType;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderListConfig;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dex.trade.core.domain.model.AutoSlippageInfo;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.LimitRegion;
import com.okinc.business.dexlogic.bean.TransactionDirection;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.widget.slippage.SlippageMode;
import com.okinc.business.market.features.chart.domain.ChartType;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.common.TxDirection;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedMainConfig;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment;
import com.okinc.business.trade.features.home.ui.cefi.setting.AdvancedSettingsContract;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.rxutils.RxBus;
import com.okinc.uilab.reminder.OKReminder;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC30503lcQ;
import o.AbstractC30560ldU;
import o.AbstractC30561ldV;
import o.AbstractC58185ywX;
import o.C19680gLi;
import o.C19816gQj;
import o.C19818gQl;
import o.C21667hHw;
import o.C22281hcR;
import o.C22361hds;
import o.C23274hvD;
import o.C23316hvt;
import o.C25333iuj;
import o.C25389ivm;
import o.C25390ivn;
import o.C30501lcO;
import o.C30565ldZ;
import o.C30600leH;
import o.C30607leO;
import o.C30624lef;
import o.C30626leh;
import o.C30627lei;
import o.C30631lem;
import o.C30637les;
import o.C30806liB;
import o.C30808liD;
import o.C30845lio;
import o.C31200lpY;
import o.C31216lpo;
import o.C31256lqb;
import o.C33069mpW;
import o.C33129mqd;
import o.C43251rlk;
import o.C55113xdn;
import o.C55173xeu;
import o.C55326xho;
import o.C55328xhq;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56423yEv;
import o.C56442yFn;
import o.C56524yIo;
import o.C58156yvv;
import o.C9706bae;
import o.InterfaceC19679gLh;
import o.InterfaceC19811gQe;
import o.InterfaceC28209kSy;
import o.InterfaceC28223kTl;
import o.InterfaceC30595leC;
import o.InterfaceC30601leI;
import o.InterfaceC30608leP;
import o.InterfaceC30619lea;
import o.InterfaceC30628lej;
import o.InterfaceC30639leu;
import o.InterfaceC30641lew;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.dTH;
import o.dTQ;
import o.gOP;
import o.gPQ;
import o.kRM;
import o.pUU;
import o.rVN;
import o.wXX;
import o.xXO;
import o.yCM;
import o.yHO;
import o.yHQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedMainFragment extends AbstractC30560ldU<C21667hHw> implements InterfaceC19679gLh, C30845lio.TaskDescription, C31216lpo.StateListAnimator, InterfaceC30641lew, InterfaceC30601leI, InterfaceC30628lej, InterfaceC30608leP, InterfaceC19811gQe {
    public C30600leH AYXKKw;
    public InterfaceC30628lej AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm EZpvd;
    public C25333iuj OLrzqt;
    public final ActivityResultLauncher<AdvancedSettingsContract.Input> copydefault;

    @yCM
    public C9706bae deeplinkReferralCodeHandler;
    public C30624lef djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public boolean gEmmrt;
    public InterfaceC58217yxC hDKMBd;
    public final InterfaceC56387yDm isConnected;

    @yCM
    public C30607leO trackHandler;
    public InterfaceC30641lew valueOf;
    public C30631lem values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public final InterfaceC56387yDm DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.ldG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(AdvancedMainFragment.AxsJAY(this.OLrzqt));
        }
    });
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.ldH
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AdvancedMainFragment.getFieldNames(this.KWHzl);
        }
    });

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ChartType.values().length];
            try {
                iArr[ChartType.PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChartType.MARKET_CAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
            int[] iArr2 = new int[ReminderShowType.values().length];
            try {
                iArr2[ReminderShowType.Info.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ReminderShowType.Warning.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ReminderShowType.Critical.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            KWHzl = iArr2;
            int[] iArr3 = new int[TradeReminderType.values().length];
            try {
                iArr3[TradeReminderType.WalletBusinessUnsupported.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[TradeReminderType.WalletStatusAbnormal.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TradeReminderType.NoLiquidityForOKX.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[TradeReminderType.NoLiquidityForOKXWarning.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[TradeReminderType.SANeedUpgrade.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TradeReminderType.SAExpiringSoon.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[TradeReminderType.SAOrderExceedsValidity.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            copydefault = iArr3;
            int[] iArr4 = new int[AdvancedOrderType.values().length];
            try {
                iArr4[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            AEQbTJ = iArr4;
        }
    }

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public static final String OLrzqt(String str) {
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        this.gEmmrt = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean valueOf() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21667hHw fetchVPNInfo(AdvancedMainFragment advancedMainFragment) {
        return (C21667hHw) advancedMainFragment.fARcdN();
    }

    public AdvancedMainFragment() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedMainVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$5
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
        final Function0 function03 = new Function0() { // from class: o.ldJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.AwvSrB(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$6
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$9
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedPlaceOrderVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ldN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.AuCTel(this.KWHzl);
            }
        });
        ActivityResultLauncher<AdvancedSettingsContract.Input> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new AdvancedSettingsContract(), new ActivityResultCallback() { // from class: o.ldL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AdvancedMainFragment.AEQbTJ(this.copydefault, (AdvancedSettingsContract.Input) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.copydefault = activityResultLauncherRegisterForActivityResult;
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$10
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$11
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function04.invoke();
            }
        });
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderAndPositionEventViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$12
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$13
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
                Function0 function05 = function02;
                if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$special$$inlined$viewModels$default$14
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final AdvancedMainFragment KWHzl(@NotNull String str, boolean z, @NotNull AdvancedModeParams advancedModeParams) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(advancedModeParams, "");
            AdvancedMainFragment advancedMainFragment = new AdvancedMainFragment();
            Bundle bundleBundleOf = BundleKt.bundleOf();
            C31200lpY.EZpvd(bundleBundleOf, str);
            bundleBundleOf.putParcelable("key.cefi_mode_params", advancedModeParams);
            bundleBundleOf.putBoolean("extra_transaction_dialog_style", z);
            advancedMainFragment.setArguments(bundleBundleOf);
            return advancedMainFragment;
        }
    }

    public final C30607leO uzCIH() {
        C30607leO c30607leO = this.trackHandler;
        if (c30607leO != null) {
            return c30607leO;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final C9706bae djBIcL() {
        C9706bae c9706bae = this.deeplinkReferralCodeHandler;
        if (c9706bae != null) {
            return c9706bae;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final boolean hDKMBd() {
        return ((Boolean) this.DbNXlk.getValue()).booleanValue();
    }

    public static final boolean AxsJAY(AdvancedMainFragment advancedMainFragment) {
        Bundle arguments = advancedMainFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_transaction_dialog_style");
        }
        return false;
    }

    public final AdvancedModeParams gEmmrt() {
        return (AdvancedModeParams) this.KWHzl.getValue();
    }

    public static final AdvancedModeParams getFieldNames(AdvancedMainFragment advancedMainFragment) {
        Bundle arguments = advancedMainFragment.getArguments();
        if (arguments != null) {
            return (AdvancedModeParams) ((Parcelable) BundleCompat.getParcelable(arguments, "key.cefi_mode_params", AdvancedModeParams.class));
        }
        return null;
    }

    public final AdvancedMainVM isConnected() {
        return (AdvancedMainVM) this.AkhnZx.getValue();
    }

    public static final ViewModelStoreOwner AwvSrB(AdvancedMainFragment advancedMainFragment) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = advancedMainFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    private final DexHomeViewModel AwvSrB() {
        return (DexHomeViewModel) this.fetchVPNInfo.getValue();
    }

    public final AdvancedPlaceOrderVM AkhnZx() {
        return (AdvancedPlaceOrderVM) this.AuCTel.getValue();
    }

    public static final C19680gLi AuCTel(AdvancedMainFragment advancedMainFragment) {
        return new C19680gLi(advancedMainFragment);
    }

    private final C19680gLi sSMYrx() {
        return (C19680gLi) this.EZpvd.getValue();
    }

    public static final void AEQbTJ(AdvancedMainFragment advancedMainFragment, AdvancedSettingsContract.Input input) {
        advancedMainFragment.EZpvd(input);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC19811gQe
    public ViewPager2 KWHzl() {
        C21667hHw c21667hHw = (C21667hHw) fARcdN();
        if (c21667hHw != null) {
            return c21667hHw.isConnected;
        }
        return null;
    }

    public OrderAndPositionEventViewModel values() {
        return (OrderAndPositionEventViewModel) this.isConnected.getValue();
    }

    /* JADX DEBUG: Possible override for method o.ldU.OLrzqt()V */
    @Override // o.InterfaceC19811gQe
    public C19818gQl OLrzqt() {
        return zuBGHE();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21667hHw OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21667hHw c21667hHwOLrzqt = C21667hHw.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21667hHwOLrzqt, "");
        return c21667hHwOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull C21667hHw c21667hHw, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21667hHw, "");
        C30607leO c30607leOUzCIH = uzCIH();
        Intrinsics.copydefault(c30607leOUzCIH, "");
        C30637les c30637les = new C30637les(this, c30607leOUzCIH);
        this.valueOf = c30637les;
        Intrinsics.copydefault(c30637les, "");
        this.AYXKKw = new C30600leH(this, c21667hHw, c30637les, AkhnZx().getFieldNames().getValue() == AdvancedOrderType.MARKET);
        this.AhwBna = new C30627lei(this);
        this.values = new C30631lem(this, c21667hHw);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        this.djBIcL = new C30624lef(childFragmentManager, c21667hHw);
        EZpvd(c21667hHw);
        KWHzl(c21667hHw);
        AEQbTJ(c21667hHw);
        copydefault(c21667hHw);
        c21667hHw.KWHzl.AYXKKw().setContentDescription("web3_dex_reminder_action");
        AkhnZx().KWHzl(AuCTel());
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o.ldA
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AdvancedMainFragment.wlaJM(this.OLrzqt);
                }
            });
        }
    }

    public static final void wlaJM(AdvancedMainFragment advancedMainFragment) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) advancedMainFragment, true, (String) null, 2, (Object) null);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        InterfaceC30608leP.ActionBar.trackView$default(this, "advanced", null, 2, null);
        if ((isConnected().AEQbTJ().getValue() == null && isConnected().gEmmrt().getValue() == null) || (isConnected().OLrzqt().getValue() instanceof InterfaceC28209kSy.Activity)) {
            KWHzl(false);
            return;
        }
        sSMYrx().EZpvd();
        C25333iuj c25333iuj = this.OLrzqt;
        if (c25333iuj != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c25333iuj.EZpvd(fragmentActivityRequireActivity);
        }
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        sSMYrx().OLrzqt();
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.OLrzqt = null;
        InterfaceC58217yxC interfaceC58217yxC = this.hDKMBd;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.hDKMBd = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onStop() {
        AYXKKw();
        super.onStop();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault()Landroid/view/View; */
    @Override // o.InterfaceC19679gLh
    /* JADX INFO: renamed from: AubY, reason: merged with bridge method [inline-methods] */
    public C25333iuj copydefault() {
        C25333iuj c25333iuj = this.OLrzqt;
        if (c25333iuj != null) {
            return c25333iuj;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C25333iuj c25333iuj2 = new C25333iuj(contextRequireContext, null, true, AwvSrB().fARcdN(), AwvSrB().isConnected(), 2, null);
        this.OLrzqt = c25333iuj2;
        AxsJAY();
        return c25333iuj2;
    }

    @Override // o.InterfaceC30641lew
    public void KWHzl(@NotNull InterfaceC30639leu interfaceC30639leu) {
        Intrinsics.checkNotNullParameter(interfaceC30639leu, "");
        InterfaceC30641lew interfaceC30641lew = this.valueOf;
        if (interfaceC30641lew != null) {
            interfaceC30641lew.KWHzl(interfaceC30639leu);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC30601leI
    public void KWHzl(InterfaceC30595leC interfaceC30595leC) {
        C22281hcR c22281hcR;
        if (interfaceC30595leC instanceof InterfaceC30595leC.Intent) {
            sSMYrx().OLrzqt();
        }
        C21667hHw c21667hHw = (C21667hHw) fARcdN();
        if (c21667hHw != null && (c22281hcR = c21667hHw.EZpvd) != null) {
            c22281hcR.KWHzl();
        }
        C30600leH c30600leH = this.AYXKKw;
        if (c30600leH != null) {
            c30600leH.KWHzl(interfaceC30595leC);
        }
        iwGUEr();
    }

    @Override // o.InterfaceC30628lej
    public void AYXKKw() {
        InterfaceC30628lej interfaceC30628lej = this.AhwBna;
        if (interfaceC30628lej != null) {
            interfaceC30628lej.AYXKKw();
        }
    }

    @Override // o.InterfaceC30608leP
    public void KWHzl(@NotNull InterfaceC30619lea interfaceC30619lea, @NotNull kRM krm) {
        Intrinsics.checkNotNullParameter(interfaceC30619lea, "");
        Intrinsics.checkNotNullParameter(krm, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AdvancedMainFragment$trackEvent$1(this, interfaceC30619lea, krm, null), 3, null);
    }

    @Override // o.InterfaceC30608leP
    public void copydefault(@NotNull String str, @NotNull kRM krm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(krm, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AdvancedMainFragment$trackView$1(this, str, krm, null), 3, null);
    }

    @Override // o.C30845lio.TaskDescription
    public void getNewProxyInstance() {
        AutoSlippageInfo autoSlippageInfoAEQbTJ;
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AdvancedMainFragment$onSettingsClick$1(this, null), 3, null);
        if (isConnected().isConnected().getValue().EZpvd()) {
            return;
        }
        C30808liD c30808liDCopydefault = isConnected().isConnected().getValue().copydefault();
        AdvancedQuoteUiData value = AkhnZx().AuCTelauCTel().getValue();
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl = value != null ? value.KWHzl() : null;
        final String strMulS$default = C33129mqd.mulS$default((advancedQuoteAndCallDataKWHzl == null || (autoSlippageInfoAEQbTJ = advancedQuoteAndCallDataKWHzl.AEQbTJ()) == null) ? null : autoSlippageInfoAEQbTJ.getAutoSlippage(), 100, null, null, null, 14, null);
        this.gEmmrt = true;
        ActivityResultLauncher<AdvancedSettingsContract.Input> activityResultLauncher = this.copydefault;
        String strEZpvd = c30808liDCopydefault.EZpvd();
        String strKWHzl = C31256lqb.KWHzl(c30808liDCopydefault.AkhnZx(), (Function0<String>) new Function0() { // from class: o.ldC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.OLrzqt(strMulS$default);
            }
        });
        int iDjBIcL = c30808liDCopydefault.djBIcL();
        String strValueOf = c30808liDCopydefault.valueOf();
        int iCopydefault = c30808liDCopydefault.copydefault();
        boolean zFetchVPNInfo = c30808liDCopydefault.fetchVPNInfo();
        String strAhwBna = c30808liDCopydefault.AhwBna();
        int value2 = TransactionDirection.TransactionBuy.getValue();
        String strAYXKKw = advancedQuoteAndCallDataKWHzl != null ? advancedQuoteAndCallDataKWHzl.AYXKKw() : null;
        String str = strAYXKKw == null ? "" : strAYXKKw;
        String strIwGUEr = advancedQuoteAndCallDataKWHzl != null ? advancedQuoteAndCallDataKWHzl.iwGUEr() : null;
        String str2 = strIwGUEr == null ? "" : strIwGUEr;
        AdvancedMainConfig advancedMainConfigAYXKKw = isConnected().AYXKKw();
        AutoSlippageInfo autoSlippageInfoAEQbTJ2 = advancedQuoteAndCallDataKWHzl != null ? advancedQuoteAndCallDataKWHzl.AEQbTJ() : null;
        SlippageMode slippageModeAYXKKw = c30808liDCopydefault.AYXKKw();
        if (slippageModeAYXKKw == null) {
            slippageModeAYXKKw = SlippageMode.Dynamic;
        }
        activityResultLauncher.launch(new AdvancedSettingsContract.Input(null, strEZpvd, strKWHzl, iDjBIcL, strMulS$default, strValueOf, iCopydefault, zFetchVPNInfo, value2, null, str, str2, strAhwBna, advancedMainConfigAYXKKw, autoSlippageInfoAEQbTJ2, slippageModeAYXKKw, c30808liDCopydefault.KWHzl(), null, false, false, null, TradeMode.Advanced, AkhnZx().AuCTelauCTel().getValue(), 1966593, null));
    }

    @Override // o.C31216lpo.StateListAnimator
    public void AEQbTJ() {
        AdvancedTradeType value = AkhnZx().DTwDnp().getValue();
        AdvancedTradeType advancedTradeType = AdvancedTradeType.BUY;
        InterfaceC30608leP.ActionBar.trackEvent$default(this, value == advancedTradeType ? AbstractC30561ldV.ClipData.KWHzl : AbstractC30561ldV.TaskStackBuilder.AEQbTJ, null, 2, null);
        InterfaceC30641lew interfaceC30641lew = this.valueOf;
        if (interfaceC30641lew != null) {
            DexMultiTokenInfoBean value2 = isConnected().AEQbTJ().getValue();
            String chainId = value2 != null ? value2.getChainId() : null;
            if (chainId == null) {
                chainId = "";
            }
            interfaceC30641lew.KWHzl(new InterfaceC30639leu.TaskStackBuilder(chainId, AkhnZx().DTwDnp().getValue() == advancedTradeType, new Function2() { // from class: o.ldS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return AdvancedMainFragment.copydefault(this.AEQbTJ, (DexMultiTokenInfoBean) obj, (java.lang.String) obj2);
                }
            }));
        }
    }

    public static final Unit copydefault(AdvancedMainFragment advancedMainFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean, String str) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        Intrinsics.checkNotNullParameter(str, "");
        advancedMainFragment.AuCTelauCTel();
        advancedMainFragment.isConnected().EZpvd(str);
        advancedMainFragment.AkhnZx().copydefault(advancedMainFragment.EZpvd(dexMultiTokenInfoBean), (DexMultiTokenInfoBean) null, false);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        C31216lpo c31216lpo;
        C30845lio c30845lio;
        this.valueOf = null;
        this.AYXKKw = null;
        this.AhwBna = null;
        this.values = null;
        this.djBIcL = null;
        C21667hHw c21667hHw = (C21667hHw) fARcdN();
        if (c21667hHw != null && (c30845lio = c21667hHw.DbNXlk) != null) {
            c30845lio.setCallback$OKDex_dex_impl(null);
        }
        C21667hHw c21667hHw2 = (C21667hHw) fARcdN();
        if (c21667hHw2 != null && (c31216lpo = c21667hHw2.values) != null) {
            c31216lpo.setCallback$OKDex_dex_impl(null);
        }
        AwvSrB().copydefault().removeObservers(this);
        super.onDestroy();
    }

    public final void KWHzl(boolean z) {
        isConnected().EZpvd(z);
        AkhnZx().finit();
        values().fetchVPNInfo();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTelauCTel() {
        C22281hcR c22281hcR;
        NestedScrollView nestedScrollViewAYXKKw;
        C21667hHw c21667hHw = (C21667hHw) fARcdN();
        if (c21667hHw == null || (c22281hcR = c21667hHw.EZpvd) == null || (nestedScrollViewAYXKKw = c22281hcR.AYXKKw()) == null) {
            return;
        }
        nestedScrollViewAYXKKw.smoothScrollTo(0, 0);
    }

    public final void EZpvd() {
        C30631lem c30631lem = this.values;
        if (c30631lem != null) {
            c30631lem.OLrzqt();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final NestedScrollView fetchVPNInfo() {
        C22281hcR c22281hcR;
        C21667hHw c21667hHw = (C21667hHw) fARcdN();
        if (c21667hHw == null || (c22281hcR = c21667hHw.EZpvd) == null) {
            return null;
        }
        return c22281hcR.AYXKKw();
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
            C21667hHw c21667hHwFetchVPNInfo = AdvancedMainFragment.fetchVPNInfo(AdvancedMainFragment.this);
            if (c21667hHwFetchVPNInfo != null) {
                AdvancedMainFragment.this.copydefault(c21667hHwFetchVPNInfo, dexMultiTokenInfoBean);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().AEQbTJ(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().OLrzqt(), null, new Fragment(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().isConnected(), null, new VoiceInteractor(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().AuCTelauCTel(), null, new TaskStackBuilder(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().ORxRYg(), null, new AssistContent(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().gHZMYf(), null, new PictureInPictureParams(), 2, null);
        AwvSrB().copydefault().observe(this, new Application(new Function1() { // from class: o.ldO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedMainFragment.OLrzqt(this.AEQbTJ, (Unit) obj);
            }
        }));
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(isConnected().AEQbTJ(), isConnected().gEmmrt(), AkhnZx().DTwDnp(), AkhnZx().getFieldNames(), AkhnZx().fJNWhG(), new AnonymousClass8(this)), null, new SharedElementCallback(), 2, null);
        isConnected().OLrzqt(AuCTel()).observe(this, new Application(new Function1() { // from class: o.ldy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedMainFragment.OLrzqt(this.AEQbTJ, (AdvancedModeParams) obj);
            }
        }));
        C25390ivn.AEQbTJ(this, AkhnZx().fFgQHt(), Lifecycle.State.CREATED, new Activity());
        AwvSrB().values().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.ldB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedMainFragment.copydefault(this.copydefault, (java.lang.String) obj);
            }
        }));
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.ldD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedMainFragment.AEQbTJ(this.EZpvd, (xXO) obj);
            }
        };
        this.hDKMBd = abstractC58185ywXEZpvd.AEQbTJ(new InterfaceC58227yxM() { // from class: o.ldz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AdvancedMainFragment.AEQbTJ(function1, obj);
            }
        });
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new AnonymousClass14(null), 3, null);
        C25390ivn.collectOnViewLifecycle$default(this, AkhnZx().fJNWhG(), null, new PendingIntent(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, values().EZpvd(), null, new LoaderManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().EZpvd(), null, new Dialog(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, isConnected().KWHzl(), null, new FragmentManager(), 2, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new AnonymousClass19(null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4), null, null, new AnonymousClass20(null), 3, null);
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC28209kSy interfaceC28209kSy, Continuation<? super Unit> continuation) {
            C21667hHw c21667hHwFetchVPNInfo = AdvancedMainFragment.fetchVPNInfo(AdvancedMainFragment.this);
            if (c21667hHwFetchVPNInfo != null) {
                AdvancedMainFragment.this.AEQbTJ(c21667hHwFetchVPNInfo, interfaceC28209kSy);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class VoiceInteractor<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(C30806liB c30806liB, Continuation<? super Unit> continuation) {
            C21667hHw c21667hHwFetchVPNInfo = AdvancedMainFragment.fetchVPNInfo(AdvancedMainFragment.this);
            if (c21667hHwFetchVPNInfo != null) {
                AdvancedMainFragment.this.copydefault(c21667hHwFetchVPNInfo, c30806liB);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class TaskStackBuilder<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(AdvancedQuoteUiData advancedQuoteUiData, Continuation<? super Unit> continuation) {
            if (advancedQuoteUiData != null) {
                if (AdvancedMainFragment.this.isConnected().isConnected().getValue().KWHzl()) {
                    AdvancedMainFragment.this.isConnected().KWHzl(advancedQuoteUiData);
                } else {
                    AdvancedMainFragment.this.isConnected().OLrzqt(advancedQuoteUiData);
                }
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class AssistContent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM.initSettingModel$default(com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM, boolean, int, java.lang.Object):void */
        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            if (str != null && !C30565ldZ.EZpvd(str)) {
                AdvancedMainVM.initSettingModel$default(AdvancedMainFragment.this.isConnected(), false, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class PictureInPictureParams<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            if (C33129mqd.OLrzqt((CharSequence) str)) {
                C55328xhq.show$default(C55328xhq.OLrzqt, C33069mpW.copydefault(AdvancedMainFragment.this, C23274hvD.Fragment.onSetShuffleMode, (Map<String, ? extends Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("name", str))), (Drawable) null, 0, (Integer) null, 0, 0, 62, (Object) null);
                androidx.fragment.app.Fragment fragmentFindFragmentByTag = AdvancedMainFragment.this.getChildFragmentManager().findFragmentByTag(String.valueOf(C56524yIo.AEQbTJ(TradeConfirmOrderSheet.class).valueOf()));
                wXX wxx = fragmentFindFragmentByTag instanceof wXX ? (wXX) fragmentFindFragmentByTag : null;
                if (wxx != null) {
                    wxx.dismissAllowingStateLoss();
                }
            }
            AdvancedMainFragment.this.AkhnZx().fZBcTu();
            return Unit.INSTANCE;
        }
    }

    public static final Unit OLrzqt(AdvancedMainFragment advancedMainFragment, Unit unit) {
        advancedMainFragment.AEQbTJ();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$setListener$8, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass8 extends AdaptedFunctionReference implements yHQ<DexMultiTokenInfoBean, DexMultiTokenInfoBean, AdvancedTradeType, AdvancedOrderType, AdvancedLimitBy, Continuation<? super AdvancedModeParams>, Object> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass8(Object obj) {
            super(6, obj, AdvancedMainFragment.class, "toAdvancedModeParams", "toAdvancedModeParams(Lcom/okinc/business/dexlogic/bean/DexMultiTokenInfoBean;Lcom/okinc/business/dexlogic/bean/DexMultiTokenInfoBean;Lcom/okinc/business/trade/features/home/ui/cefi/common/AdvancedTradeType;Lcom/okinc/business/trade/features/home/ui/cefi/common/AdvancedOrderType;Lcom/okinc/business/trade/features/home/ui/cefi/common/AdvancedLimitBy;)Lcom/okinc/business/trade/features/home/ui/cefi/common/AdvancedModeParams;", 4);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.yHQ
        public final Object invoke(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, AdvancedTradeType advancedTradeType, AdvancedOrderType advancedOrderType, AdvancedLimitBy advancedLimitBy, Continuation<? super AdvancedModeParams> continuation) {
            return AdvancedMainFragment.OLrzqt((AdvancedMainFragment) this.receiver, dexMultiTokenInfoBean, dexMultiTokenInfoBean2, advancedTradeType, advancedOrderType, advancedLimitBy, continuation);
        }
    }

    public static final /* synthetic */ Object OLrzqt(AdvancedMainFragment advancedMainFragment, DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, AdvancedTradeType advancedTradeType, AdvancedOrderType advancedOrderType, AdvancedLimitBy advancedLimitBy, Continuation continuation) {
        return advancedMainFragment.copydefault(dexMultiTokenInfoBean, dexMultiTokenInfoBean2, advancedTradeType, advancedOrderType, advancedLimitBy);
    }

    public static final class SharedElementCallback<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(AdvancedModeParams advancedModeParams, Continuation<? super Unit> continuation) {
            AdvancedMainFragment.this.isConnected().EZpvd(AdvancedMainFragment.this.AuCTel(), advancedModeParams);
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams.copy$default(com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.trade.features.home.ui.cefi.common.TxDirection, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy, int, java.lang.Object):com.okinc.business.trade.features.home.ui.cefi.common.AdvancedModeParams */
    public static final Unit OLrzqt(AdvancedMainFragment advancedMainFragment, AdvancedModeParams advancedModeParams) {
        advancedMainFragment.AuCTelauCTel();
        if (!Intrinsics.EZpvd(advancedModeParams, AdvancedModeParams.Companion.copydefault()) && (!advancedMainFragment.isConnected().copydefault().isEmpty())) {
            if (advancedModeParams.AEQbTJ() == null && advancedModeParams.AhwBna() == null) {
                advancedMainFragment.copydefault(AdvancedModeParams.copy$default(advancedModeParams, advancedMainFragment.AkhnZx().DbNXlk(), advancedMainFragment.AkhnZx().AkhnZx(), null, null, null, null, 60, null), false);
                return Unit.INSTANCE;
            }
            advancedMainFragment.copydefault(advancedModeParams, false);
        }
        return Unit.INSTANCE;
    }

    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(C30626leh c30626leh, Continuation<? super Unit> continuation) {
            AdvancedMainFragment.this.isConnected().values();
            return Unit.INSTANCE;
        }
    }

    public static final Unit copydefault(AdvancedMainFragment advancedMainFragment, String str) {
        advancedMainFragment.isConnected().KWHzl(C33129mqd.OLrzqt(str, LimitRegion.LIMIT.getValue()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(AdvancedMainFragment advancedMainFragment, xXO xxo) {
        advancedMainFragment.copydefault(true);
        C30624lef c30624lef = advancedMainFragment.djBIcL;
        if (c30624lef != null) {
            c30624lef.AhwBna();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$setListener$14, reason: invalid class name */
    public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass14(Continuation<? super AnonymousClass14> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedMainFragment.this.new AnonymousClass14(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$setListener$14$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedMainFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdvancedMainFragment advancedMainFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedMainFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$setListener$14$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C03801 extends SuspendLambda implements yHO<dTH, dTH, Continuation<? super dTH>, Object> {
                /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;
                final /* synthetic */ AdvancedMainFragment this$0;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C03801(AdvancedMainFragment advancedMainFragment, Continuation<? super C03801> continuation) {
                    super(3, continuation);
                    this.this$0 = advancedMainFragment;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // o.yHO
                public final Object invoke(dTH dth, dTH dth2, Continuation<? super dTH> continuation) {
                    C03801 c03801 = new C03801(this.this$0, continuation);
                    c03801.L$0 = dth;
                    c03801.L$1 = dth2;
                    return c03801.invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    C56442yFn.copydefault();
                    if (this.label == 0) {
                        C56391yDq.AEQbTJ(obj);
                        dTH dth = (dTH) this.L$0;
                        dTH dth2 = (dTH) this.L$1;
                        if ((dth == null) != (dth2 == null) || (dth instanceof dTH.FragmentManager) != (dth2 instanceof dTH.FragmentManager)) {
                            this.this$0.copydefault(false);
                            C30624lef c30624lef = this.this$0.djBIcL;
                            if (c30624lef != null) {
                                c30624lef.AhwBna();
                            }
                        }
                        return dth2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    Flow flowRunningReduce = FlowKt.runningReduce(this.this$0.isConnected().DbNXlk(), new C03801(this.this$0, null));
                    this.label = 1;
                    if (FlowKt.collect(flowRunningReduce, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LifecycleOwner viewLifecycleOwner = AdvancedMainFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdvancedMainFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(AdvancedLimitBy advancedLimitBy, Continuation<? super Unit> continuation) {
            C30624lef c30624lef = AdvancedMainFragment.this.djBIcL;
            if (c30624lef != null) {
                c30624lef.AEQbTJ(advancedLimitBy);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(C19816gQj c19816gQj, Continuation<? super Unit> continuation) {
            AdvancedMainFragment.this.isConnected().EZpvd(c19816gQj.copydefault(), c19816gQj.AEQbTJ(), c19816gQj.OLrzqt());
            return Unit.INSTANCE;
        }
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC28223kTl interfaceC28223kTl, Continuation<? super Unit> continuation) {
            AdvancedMainFragment.this.copydefault(interfaceC28223kTl);
            return Unit.INSTANCE;
        }
    }

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(ChartType chartType, Continuation<? super Unit> continuation) {
            if (chartType != null) {
                AdvancedMainFragment.this.KWHzl(chartType);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$setListener$19, reason: invalid class name */
    public static final class AnonymousClass19 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass19(Continuation<? super AnonymousClass19> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedMainFragment.this.new AnonymousClass19(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass19) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$setListener$19$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedMainFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdvancedMainFragment advancedMainFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedMainFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<ReminderListConfig> stateFlowSSMYrx = this.this$0.AkhnZx().sSMYrx();
                    final AdvancedMainFragment advancedMainFragment = this.this$0;
                    FlowCollector<? super ReminderListConfig> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment.setListener.19.1.3
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
                        public final Object emit(ReminderListConfig reminderListConfig, Continuation<? super Unit> continuation) {
                            C21667hHw c21667hHwFetchVPNInfo = AdvancedMainFragment.fetchVPNInfo(advancedMainFragment);
                            if (c21667hHwFetchVPNInfo != null) {
                                advancedMainFragment.OLrzqt(c21667hHwFetchVPNInfo, reminderListConfig);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (stateFlowSSMYrx.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LifecycleOwner viewLifecycleOwner = AdvancedMainFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdvancedMainFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$setListener$20, reason: invalid class name */
    public static final class AnonymousClass20 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass20(Continuation<? super AnonymousClass20> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AdvancedMainFragment.this.new AnonymousClass20(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass20) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment$setListener$20$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedMainFragment this$0;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdvancedMainFragment advancedMainFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedMainFragment;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objCopydefault = C56442yFn.copydefault();
                int i = this.label;
                if (i == 0) {
                    C56391yDq.AEQbTJ(obj);
                    StateFlow<AdvancedOrderType> fieldNames = this.this$0.AkhnZx().getFieldNames();
                    final AdvancedMainFragment advancedMainFragment = this.this$0;
                    FlowCollector<? super AdvancedOrderType> flowCollector = new FlowCollector() { // from class: com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment.setListener.20.1.5
                        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                        public final Object emit(AdvancedOrderType advancedOrderType, Continuation<? super Unit> continuation) {
                            C30600leH c30600leH = advancedMainFragment.AYXKKw;
                            if (c30600leH != null) {
                                c30600leH.AEQbTJ(advancedOrderType == AdvancedOrderType.MARKET);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (fieldNames.collect(flowCollector, this) == objCopydefault) {
                        return objCopydefault;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                LifecycleOwner viewLifecycleOwner = AdvancedMainFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AdvancedMainFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == objCopydefault) {
                    return objCopydefault;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(ChartType chartType) {
        AdvancedLimitBy advancedLimitBy;
        AdvancedPlaceOrderVM advancedPlaceOrderVMAkhnZx = AkhnZx();
        int i = ActionBar.EZpvd[chartType.ordinal()];
        if (i == 1) {
            advancedLimitBy = AdvancedLimitBy.Price;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            advancedLimitBy = AdvancedLimitBy.MCap;
        }
        advancedPlaceOrderVMAkhnZx.OLrzqt(advancedLimitBy);
    }

    public final void copydefault(InterfaceC28223kTl interfaceC28223kTl) {
        if ((interfaceC28223kTl instanceof InterfaceC28223kTl.ActionBar) || (interfaceC28223kTl instanceof InterfaceC28223kTl.TaskDescription)) {
            return;
        }
        if (interfaceC28223kTl instanceof InterfaceC28223kTl.Activity) {
            C55326xho.toast$default(((InterfaceC28223kTl.Activity) interfaceC28223kTl).copydefault(), (Drawable) null, 0, (Integer) null, 0, 0, 31, (Object) null);
            return;
        }
        if (!(interfaceC28223kTl instanceof InterfaceC28223kTl.StateListAnimator)) {
            throw new NoWhenBranchMatchedException();
        }
        values().values();
        AuCTelauCTel();
        InterfaceC28223kTl.StateListAnimator stateListAnimator = (InterfaceC28223kTl.StateListAnimator) interfaceC28223kTl;
        isConnected().EZpvd(stateListAnimator.OLrzqt().getChainId());
        AkhnZx().copydefault(EZpvd(stateListAnimator.OLrzqt()), (DexMultiTokenInfoBean) null, false);
    }

    public final AdvancedModeParams copydefault(DexMultiTokenInfoBean dexMultiTokenInfoBean, DexMultiTokenInfoBean dexMultiTokenInfoBean2, AdvancedTradeType advancedTradeType, AdvancedOrderType advancedOrderType, AdvancedLimitBy advancedLimitBy) {
        return new AdvancedModeParams(dexMultiTokenInfoBean2, dexMultiTokenInfoBean, TxDirection.Companion.AEQbTJ(advancedTradeType), null, advancedOrderType, advancedLimitBy, 8, null);
    }

    public final void AEQbTJ(C21667hHw c21667hHw, InterfaceC28209kSy interfaceC28209kSy) {
        if (interfaceC28209kSy instanceof InterfaceC28209kSy.Activity) {
            KWHzl(((InterfaceC28209kSy.Activity) interfaceC28209kSy).OLrzqt());
            return;
        }
        if (Intrinsics.EZpvd(interfaceC28209kSy, InterfaceC28209kSy.Application.AEQbTJ)) {
            AEQbTJ(c21667hHw, true);
            return;
        }
        if (interfaceC28209kSy instanceof InterfaceC28209kSy.TaskDescription) {
            copydefault(((InterfaceC28209kSy.TaskDescription) interfaceC28209kSy).copydefault());
            C30624lef c30624lef = this.djBIcL;
            if (c30624lef != null) {
                c30624lef.AhwBna();
            }
            C30631lem c30631lem = this.values;
            if (c30631lem != null) {
                c30631lem.AEQbTJ();
                return;
            }
            return;
        }
        if (!Intrinsics.EZpvd(interfaceC28209kSy, InterfaceC28209kSy.ActionBar.copydefault)) {
            throw new NoWhenBranchMatchedException();
        }
        AEQbTJ(c21667hHw, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault(C21667hHw c21667hHw, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        boolean z;
        AwvSrB().copydefault(dexMultiTokenInfoBean);
        c21667hHw.values.AEQbTJ(dexMultiTokenInfoBean);
        AkhnZx().AEQbTJ(isConnected().EZpvd(dexMultiTokenInfoBean));
        AkhnZx().EZpvd(isConnected().copydefault(dexMultiTokenInfoBean));
        AkhnZx().copydefault(isConnected().OLrzqt(dexMultiTokenInfoBean));
        AdvancedPlaceOrderVM advancedPlaceOrderVMAkhnZx = AkhnZx();
        DefiChainInfo defiChainInfoValueOf = isConnected().valueOf();
        if (defiChainInfoValueOf != null) {
            z = defiChainInfoValueOf.getSupportBatchBroadcast();
        }
        advancedPlaceOrderVMAkhnZx.KWHzl(z);
        if (dexMultiTokenInfoBean != null) {
            values().AEQbTJ(C56402yEa.EZpvd(dexMultiTokenInfoBean));
        }
    }

    public final void OLrzqt(C21667hHw c21667hHw, final ReminderListConfig reminderListConfig) {
        int i;
        final ReminderInfoConfig reminderConfig = reminderListConfig != null ? reminderListConfig.getReminderConfig() : null;
        String strCopydefault = "";
        if (reminderConfig == null || reminderConfig.getReminderType() == TradeReminderType.None || reminderConfig.getReminderType() == TradeReminderType.AntiMevInstability) {
            OKReminder oKReminder = c21667hHw.KWHzl;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            oKReminder.setVisibility(8);
            return;
        }
        OKReminder oKReminder2 = c21667hHw.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKReminder2, "");
        oKReminder2.setVisibility(0);
        c21667hHw.KWHzl.requestLayout();
        c21667hHw.KWHzl.setTitle((CharSequence) reminderConfig.getErrorTitle());
        OKReminder oKReminder3 = c21667hHw.KWHzl;
        String message = reminderConfig.getMessage();
        oKReminder3.setMessage((CharSequence) (message instanceof CharSequence ? message : null));
        OKReminder oKReminder4 = c21667hHw.KWHzl;
        int i2 = ActionBar.KWHzl[reminderConfig.getAlertType().ordinal()];
        if (i2 != 1) {
            i = 2;
            if (i2 != 2) {
                i = 3;
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else {
            i = 0;
        }
        oKReminder4.setStyle(i);
        c21667hHw.KWHzl.setCloseIconVisibility(false);
        if (reminderListConfig.getHasMoreReminders() && !reminderListConfig.getHasBlockingTier()) {
            strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.addObserver, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", String.valueOf(reminderListConfig.getTotalReminderCount()))));
        } else {
            String actionMessage = reminderConfig.getActionMessage();
            if (actionMessage != null) {
                strCopydefault = actionMessage;
            }
        }
        if (!StringsKt__StringsKt.fARcdN((CharSequence) strCopydefault)) {
            c21667hHw.KWHzl.AYXKKw().setVisibility(0);
            c21667hHw.KWHzl.setPrimaryAction(strCopydefault, new Function0() { // from class: o.ldR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AdvancedMainFragment.OLrzqt(reminderListConfig, this, reminderConfig);
                }
            });
        } else {
            c21667hHw.KWHzl.AYXKKw().setVisibility(8);
        }
        if (reminderConfig.getAlertType() == ReminderShowType.Critical) {
            c21667hHw.KWHzl.setContentDescription("web3_dex_reminder_critical");
        }
    }

    public static final Unit OLrzqt(ReminderListConfig reminderListConfig, AdvancedMainFragment advancedMainFragment, ReminderInfoConfig reminderInfoConfig) {
        if (reminderListConfig.getHasMoreReminders() && !reminderListConfig.getHasBlockingTier()) {
            advancedMainFragment.AEQbTJ(reminderListConfig);
        } else {
            advancedMainFragment.AEQbTJ(reminderInfoConfig.getReminderType());
        }
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(AdvancedMainFragment advancedMainFragment) {
        advancedMainFragment.OcIXYQ();
        return Unit.INSTANCE;
    }

    public final gOP AhwBna() {
        return new gOP(null, new Function0() { // from class: o.ldx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.iwGUEr(this.KWHzl);
            }
        }, null, new Function0() { // from class: o.ldv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.getNewProxyInstance(this.copydefault);
            }
        }, null, new Function0() { // from class: o.ldF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.uzCIH(this.KWHzl);
            }
        }, new Function0() { // from class: o.ldK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.hDKMBd(this.EZpvd);
            }
        }, new Function0() { // from class: o.ldM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.AubY(this.OLrzqt);
            }
        });
    }

    public static final Unit getNewProxyInstance(AdvancedMainFragment advancedMainFragment) {
        advancedMainFragment.wlaJM();
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(AdvancedMainFragment advancedMainFragment) {
        advancedMainFragment.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(AdvancedMainFragment advancedMainFragment) {
        advancedMainFragment.getFieldNames();
        return Unit.INSTANCE;
    }

    public static final Unit AubY(AdvancedMainFragment advancedMainFragment) {
        advancedMainFragment.getFieldNames();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.gPQ.show$default(o.gPQ, android.content.Context, java.util.List, o.gOP, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void AEQbTJ(ReminderListConfig reminderListConfig) {
        gPQ gpq = gPQ.OLrzqt;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        gPQ.show$default(gpq, contextRequireContext, reminderListConfig.getAllReminderConfigs(), AhwBna(), null, 8, null);
    }

    public final void AEQbTJ(TradeReminderType tradeReminderType) {
        switch (ActionBar.copydefault[tradeReminderType.ordinal()]) {
            case 1:
            case 2:
                wlaJM();
                break;
            case 3:
            case 4:
                OcIXYQ();
                break;
            case 5:
            case 6:
            case 7:
                getFieldNames();
                break;
        }
    }

    private final void OcIXYQ() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(String.valueOf(C56524yIo.AEQbTJ(AdvancedPlaceOrderFragment.class).valueOf()));
        AdvancedPlaceOrderFragment advancedPlaceOrderFragment = fragmentFindFragmentByTag instanceof AdvancedPlaceOrderFragment ? (AdvancedPlaceOrderFragment) fragmentFindFragmentByTag : null;
        if (advancedPlaceOrderFragment != null) {
            advancedPlaceOrderFragment.AkhnZx();
        }
    }

    public final void wlaJM() {
        KWHzl(new InterfaceC30639leu.ComponentCallbacks(AkhnZx().values()));
    }

    public final void getFieldNames() {
        dTQ dtq = (dTQ) C43251rlk.copydefault(dTQ.class);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        String strCopydefault = AkhnZx().copydefault();
        dtq.copydefault(contextRequireContext, strCopydefault != null ? strCopydefault : "", Boolean.TRUE, AkhnZx().RJOkX() ? "sa_dex_limitorder" : "sa_dex_marketorder_autosell");
    }

    private final void AxsJAY() {
        C25333iuj c25333iuj = this.OLrzqt;
        if (c25333iuj != null) {
            c25333iuj.setOnKlineIconClick(new Function0() { // from class: o.ldE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AdvancedMainFragment.zsXlph(this.EZpvd);
                }
            });
            c25333iuj.setOnMoreIconClick(new Function1() { // from class: o.ldI
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedMainFragment.KWHzl(this.AEQbTJ, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit zsXlph(AdvancedMainFragment advancedMainFragment) {
        InterfaceC30641lew interfaceC30641lew = advancedMainFragment.valueOf;
        if (interfaceC30641lew != null) {
            interfaceC30641lew.KWHzl(new InterfaceC30639leu.SharedElementCallback(advancedMainFragment.AuCTel(), advancedMainFragment.isConnected().AEQbTJ().getValue()));
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(AdvancedMainFragment advancedMainFragment, int i) {
        InterfaceC30641lew interfaceC30641lew = advancedMainFragment.valueOf;
        if (interfaceC30641lew != null) {
            interfaceC30641lew.KWHzl(new InterfaceC30639leu.AssistContent(advancedMainFragment.AuCTel(), i, advancedMainFragment.AkhnZx().getFieldNames().getValue()));
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(boolean z) {
        AdvancedTradeType advancedTradeTypeOLrzqt;
        TxDirection txDirectionEZpvd;
        if (z) {
            copydefault(fJNWhG(), true);
            return;
        }
        AdvancedMainVM advancedMainVMIsConnected = isConnected();
        String strAuCTel = AuCTel();
        AdvancedModeParams advancedModeParamsGEmmrt = gEmmrt();
        if (advancedModeParamsGEmmrt == null || (txDirectionEZpvd = advancedModeParamsGEmmrt.EZpvd()) == null || (advancedTradeTypeOLrzqt = TxDirection.Companion.OLrzqt(txDirectionEZpvd)) == null) {
            advancedTradeTypeOLrzqt = AdvancedTradeType.BUY;
        }
        AdvancedModeParams advancedModeParamsKWHzl = advancedMainVMIsConnected.KWHzl(strAuCTel, advancedTradeTypeOLrzqt, AwvSrB().AhwBna());
        AdvancedModeParams value = isConnected().OLrzqt(AuCTel()).getValue();
        if (value != null && !Intrinsics.EZpvd(value, AdvancedModeParams.Companion.copydefault())) {
            advancedModeParamsKWHzl = value;
        } else if (gEmmrt() != null && !Intrinsics.EZpvd(gEmmrt(), AdvancedModeParams.Companion.copydefault())) {
            advancedModeParamsKWHzl = gEmmrt();
        }
        copydefault(advancedModeParamsKWHzl, false);
        if (Intrinsics.EZpvd(value, AdvancedModeParams.Companion.copydefault())) {
            return;
        }
        isConnected().copydefault(AuCTel());
    }

    public final void copydefault(AdvancedModeParams advancedModeParams, boolean z) {
        if (advancedModeParams == null) {
            return;
        }
        TxDirection txDirectionEZpvd = advancedModeParams.EZpvd();
        TxDirection txDirection = TxDirection.BUY;
        AkhnZx().copydefault(EZpvd(txDirectionEZpvd == txDirection ? advancedModeParams.AhwBna() : advancedModeParams.AEQbTJ()), advancedModeParams.EZpvd() == txDirection ? advancedModeParams.AEQbTJ() : advancedModeParams.AhwBna(), z);
        AkhnZx().AEQbTJ(TxDirection.Companion.OLrzqt(advancedModeParams.EZpvd()));
        AkhnZx().KWHzl(advancedModeParams.AYXKKw());
        AkhnZx().OLrzqt(advancedModeParams.KWHzl());
        AkhnZx().AEQbTJ(advancedModeParams.OLrzqt());
    }

    public final AdvancedModeParams fJNWhG() {
        DexMultiTokenInfoBean value = AkhnZx().ejfBZ().getValue();
        DexMultiTokenInfoBean value2 = AkhnZx().AwvSrB().getValue();
        TxDirection txDirectionAEQbTJ = TxDirection.Companion.AEQbTJ(AkhnZx().DTwDnp().getValue());
        String value3 = AkhnZx().ORxRYg().getValue();
        if (value3 == null) {
            value3 = "";
        }
        return new AdvancedModeParams(value, value2, txDirectionAEQbTJ, value3, AkhnZx().getFieldNames().getValue(), AkhnZx().fJNWhG().getValue());
    }

    public final DexMultiTokenInfoBean EZpvd(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (isConnected().KWHzl(dexMultiTokenInfoBean)) {
            return dexMultiTokenInfoBean;
        }
        KWHzl(new InterfaceC30595leC.AssistContent(dexMultiTokenInfoBean != null ? dexMultiTokenInfoBean.getChainName() : null));
        return null;
    }

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
    public final void copydefault(C21667hHw c21667hHw, C30806liB c30806liB) {
        if (c30806liB.EZpvd()) {
            c21667hHw.DbNXlk.KWHzl();
            return;
        }
        if (c30806liB.KWHzl()) {
            C30845lio c30845lio = c21667hHw.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(c30845lio, "");
            c30845lio.setVisibility(0);
            String value = AkhnZx().ORxRYg().getValue();
            AdvancedQuoteUiData value2 = (value == null || C30565ldZ.EZpvd(value)) ? AkhnZx().AuCTelauCTel().getValue() : null;
            c21667hHw.DbNXlk.AEQbTJ();
            c21667hHw.DbNXlk.setInitUI(c30806liB.AEQbTJ(), c30806liB.copydefault(), value2);
            return;
        }
        c21667hHw.DbNXlk.AEQbTJ();
        AdvancedQuoteUiData value3 = AkhnZx().AuCTelauCTel().getValue();
        C30808liD c30808liDCopydefault = c30806liB.copydefault();
        C30845lio c30845lio2 = c21667hHw.DbNXlk;
        Intrinsics.checkNotNullExpressionValue(c30845lio2, "");
        c30845lio2.setVisibility(c30808liDCopydefault.DbNXlk() ^ true ? 0 : 8);
        if (c30808liDCopydefault.DbNXlk()) {
            return;
        }
        C30845lio c30845lio3 = c21667hHw.DbNXlk;
        AdvancedMainConfig advancedMainConfigAYXKKw = isConnected().AYXKKw();
        boolean supportAutoMode = advancedMainConfigAYXKKw != null ? advancedMainConfigAYXKKw.getSupportAutoMode() : false;
        if (advancedMainConfigAYXKKw != null && advancedMainConfigAYXKKw.isEvm()) {
            c30845lio3.setMevDisplayForEVM(c30808liDCopydefault, value3, supportAutoMode);
        } else if ((advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isSOl()) && (advancedMainConfigAYXKKw == null || !advancedMainConfigAYXKKw.isOtherChain())) {
            pUU.KWHzl("AdvancedMainFragment", "currentChainConfig= " + (advancedMainConfigAYXKKw != null ? C23316hvt.OLrzqt(advancedMainConfigAYXKKw) : null));
        } else {
            c30845lio3.setMevDisplayForSol(c30808liDCopydefault, value3, supportAutoMode);
        }
        c30845lio3.setPriorityFeeValue(c30808liDCopydefault, value3);
        c30845lio3.setSlippageValue(c30808liDCopydefault, value3);
        Intrinsics.copydefault(c30845lio3);
    }

    public final void copydefault(C21667hHw c21667hHw) {
        c21667hHw.DbNXlk.setCallback$OKDex_dex_impl(this);
    }

    public final void AEQbTJ(C21667hHw c21667hHw) {
        C55113xdn c55113xdn = c21667hHw.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_CEFI_LOADING);
    }

    public final void EZpvd(C21667hHw c21667hHw) {
        c21667hHw.EZpvd.setEnableRefresh(true);
        c21667hHw.EZpvd.setEnableLoadMore(false);
        c21667hHw.EZpvd.OLrzqt(true);
        c21667hHw.EZpvd.setOnRefreshListener(new Function0() { // from class: o.ldQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.AuCTelauCTel(this.AEQbTJ);
            }
        });
        c21667hHw.EZpvd.setRefreshListener(new Function0() { // from class: o.ldP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedMainFragment.zLjUOn(this.OLrzqt);
            }
        });
    }

    public static final Unit AuCTelauCTel(AdvancedMainFragment advancedMainFragment) {
        advancedMainFragment.KWHzl(true);
        return Unit.INSTANCE;
    }

    public static final Unit zLjUOn(AdvancedMainFragment advancedMainFragment) {
        advancedMainFragment.KWHzl(true);
        return Unit.INSTANCE;
    }

    public final void KWHzl(C21667hHw c21667hHw) {
        C31216lpo c31216lpo = c21667hHw.values;
        Intrinsics.checkNotNullExpressionValue(c31216lpo, "");
        c31216lpo.setVisibility((hDKMBd() || !AwvSrB().ejfBZ()) ? 0 : 8);
        c21667hHw.values.setCallback$OKDex_dex_impl(this);
    }

    public final void AEQbTJ(C21667hHw c21667hHw, boolean z) {
        C30631lem c30631lem;
        boolean z2 = true;
        int i = 0;
        boolean z3 = isConnected().AEQbTJ().getValue() == null && isConnected().gEmmrt().getValue() == null;
        if (!z || z3) {
            c21667hHw.EZpvd.KWHzl();
        }
        if (!c21667hHw.EZpvd.djBIcL().EZpvd().copydefault().isAnimating() && ((c30631lem = this.values) == null || !c30631lem.KWHzl())) {
            z2 = false;
        }
        if (z && !z2) {
            c21667hHw.gEmmrt.KWHzl(0L);
            sSMYrx().OLrzqt();
            C55173xeu c55173xeu = c21667hHw.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(8);
        } else {
            c21667hHw.gEmmrt.copydefault();
            sSMYrx().EZpvd();
        }
        C22281hcR c22281hcR = c21667hHw.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c22281hcR, "");
        if (z && !z2) {
            i = 8;
        }
        c22281hcR.setVisibility(i);
        if (z) {
            return;
        }
        iwGUEr();
    }

    public final void iwGUEr() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            AdvancedModeParams advancedModeParamsGEmmrt = gEmmrt();
            String str = (advancedModeParamsGEmmrt != null ? advancedModeParamsGEmmrt.EZpvd() : null) == TxDirection.SELL ? "dex/advanced/sell" : "dex/advanced/buy";
            C9706bae c9706baeDjBIcL = djBIcL();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C9706bae.handleIfNeeded$default(c9706baeDjBIcL, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), activity, str, null, 8, null);
        }
    }

    public final void EZpvd(AdvancedSettingsContract.Input input) {
        AdvancedMainVM advancedMainVMIsConnected = isConnected();
        if (input == null) {
            return;
        }
        advancedMainVMIsConnected.EZpvd(input);
        AkhnZx().EZpvd(isConnected().isConnected().getValue().copydefault());
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kRM.copy$default(o.kRM, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType, java.lang.String, java.lang.String, boolean, java.lang.String, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, int, java.lang.Object):o.kRM */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OLrzqt(kRM krm, Continuation<? super kRM> continuation) throws Throwable {
        AdvancedMainFragment$getTrackerBean$1 advancedMainFragment$getTrackerBean$1;
        DexMultiTokenInfoBean value;
        AdvancedOrderType advancedOrderType;
        AdvancedTradeType advancedTradeType;
        DexMultiTokenInfoBean dexMultiTokenInfoBean;
        kRM krm2;
        AdvancedMainFragment advancedMainFragment;
        String str;
        String str2;
        List<AdvancedAutoSellStrategy> listKWHzl;
        List<AdvancedAutoSellStrategy> listKWHzl2;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl2;
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl3;
        if (continuation instanceof AdvancedMainFragment$getTrackerBean$1) {
            advancedMainFragment$getTrackerBean$1 = (AdvancedMainFragment$getTrackerBean$1) continuation;
            int i = advancedMainFragment$getTrackerBean$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                advancedMainFragment$getTrackerBean$1.label = i - Integer.MIN_VALUE;
            } else {
                advancedMainFragment$getTrackerBean$1 = new AdvancedMainFragment$getTrackerBean$1(this, continuation);
            }
        }
        Object obj = advancedMainFragment$getTrackerBean$1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = advancedMainFragment$getTrackerBean$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            value = AkhnZx().ejfBZ().getValue();
            DexMultiTokenInfoBean value2 = AkhnZx().AwvSrB().getValue();
            AdvancedTradeType value3 = AkhnZx().DTwDnp().getValue();
            AdvancedOrderType value4 = AkhnZx().getFieldNames().getValue();
            AdvancedPlaceOrderVM advancedPlaceOrderVMAkhnZx = AkhnZx();
            advancedMainFragment$getTrackerBean$1.L$0 = this;
            advancedMainFragment$getTrackerBean$1.L$1 = krm;
            advancedMainFragment$getTrackerBean$1.L$2 = value;
            advancedMainFragment$getTrackerBean$1.L$3 = value2;
            advancedMainFragment$getTrackerBean$1.L$4 = value3;
            advancedMainFragment$getTrackerBean$1.L$5 = value4;
            advancedMainFragment$getTrackerBean$1.label = 1;
            Object objEZpvd = advancedPlaceOrderVMAkhnZx.EZpvd(advancedMainFragment$getTrackerBean$1);
            if (objEZpvd == objCopydefault) {
                return objCopydefault;
            }
            advancedOrderType = value4;
            obj = objEZpvd;
            advancedTradeType = value3;
            dexMultiTokenInfoBean = value2;
            krm2 = krm;
            advancedMainFragment = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AdvancedOrderType advancedOrderType2 = (AdvancedOrderType) advancedMainFragment$getTrackerBean$1.L$5;
            AdvancedTradeType advancedTradeType2 = (AdvancedTradeType) advancedMainFragment$getTrackerBean$1.L$4;
            DexMultiTokenInfoBean dexMultiTokenInfoBean2 = (DexMultiTokenInfoBean) advancedMainFragment$getTrackerBean$1.L$3;
            value = (DexMultiTokenInfoBean) advancedMainFragment$getTrackerBean$1.L$2;
            krm2 = (kRM) advancedMainFragment$getTrackerBean$1.L$1;
            advancedMainFragment = (AdvancedMainFragment) advancedMainFragment$getTrackerBean$1.L$0;
            C56391yDq.AEQbTJ(obj);
            advancedOrderType = advancedOrderType2;
            advancedTradeType = advancedTradeType2;
            dexMultiTokenInfoBean = dexMultiTokenInfoBean2;
        }
        DexMultiTokenInfoBean dexMultiTokenInfoBean3 = value;
        String str3 = (String) obj;
        boolean zHDKMBd = advancedMainFragment.hDKMBd();
        String strAuCTel = advancedMainFragment.AuCTel();
        String value5 = advancedMainFragment.AkhnZx().ORxRYg().getValue();
        String str4 = value5 == null ? "" : value5;
        AdvancedQuoteUiData value6 = advancedMainFragment.AkhnZx().AuCTelauCTel().getValue();
        String strValueOf = (value6 == null || (advancedQuoteAndCallDataKWHzl3 = value6.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl3.valueOf();
        String str5 = strValueOf == null ? "" : strValueOf;
        AdvancedQuoteUiData value7 = advancedMainFragment.AkhnZx().AuCTelauCTel().getValue();
        String strZLjUOn = (value7 == null || (advancedQuoteAndCallDataKWHzl2 = value7.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl2.zLjUOn();
        String str6 = strZLjUOn == null ? "" : strZLjUOn;
        AdvancedQuoteUiData value8 = advancedMainFragment.AkhnZx().AuCTelauCTel().getValue();
        String strAxsJAY = (value8 == null || (advancedQuoteAndCallDataKWHzl = value8.KWHzl()) == null) ? null : advancedQuoteAndCallDataKWHzl.AxsJAY();
        String str7 = strAxsJAY == null ? "" : strAxsJAY;
        String strValues = advancedMainFragment.isConnected().isConnected().getValue().copydefault().values();
        boolean zFetchVPNInfo = advancedMainFragment.isConnected().isConnected().getValue().copydefault().fetchVPNInfo();
        String strIsConnected = krm2.isConnected();
        if (strIsConnected == null) {
            AbstractC30503lcQ value9 = advancedMainFragment.AkhnZx().djBIcL().getValue();
            AbstractC30503lcQ.StateListAnimator stateListAnimator = value9 instanceof AbstractC30503lcQ.StateListAnimator ? (AbstractC30503lcQ.StateListAnimator) value9 : null;
            if (stateListAnimator == null || (listKWHzl2 = stateListAnimator.KWHzl()) == null) {
                str = null;
            } else {
                strIsConnected = C30501lcO.copydefault(listKWHzl2);
                str = strIsConnected;
            }
        } else {
            str = strIsConnected;
        }
        String strDjBIcL = krm2.djBIcL();
        if (strDjBIcL == null) {
            AbstractC30503lcQ value10 = advancedMainFragment.AkhnZx().djBIcL().getValue();
            AbstractC30503lcQ.StateListAnimator stateListAnimator2 = value10 instanceof AbstractC30503lcQ.StateListAnimator ? (AbstractC30503lcQ.StateListAnimator) value10 : null;
            if (stateListAnimator2 == null || (listKWHzl = stateListAnimator2.KWHzl()) == null) {
                str2 = null;
            } else {
                strDjBIcL = C30501lcO.AEQbTJ(listKWHzl);
                str2 = strDjBIcL;
            }
        } else {
            str2 = strDjBIcL;
        }
        return krm2.KWHzl((106512 & 1) != 0 ? krm2.OLrzqt : dexMultiTokenInfoBean3, (106512 & 2) != 0 ? krm2.fIwbmz : dexMultiTokenInfoBean, (106512 & 4) != 0 ? krm2.KWHzl : advancedTradeType, (106512 & 8) != 0 ? krm2.AuCTel : str3, (106512 & 16) != 0 ? krm2.copydefault : null, (106512 & 32) != 0 ? krm2.AYXKKw : zHDKMBd, (106512 & 64) != 0 ? krm2.isConnected : strAuCTel, (106512 & 128) != 0 ? krm2.values : advancedOrderType, (106512 & 256) != 0 ? krm2.EZpvd : str4, (106512 & 512) != 0 ? krm2.ejfBZ : str6, (106512 & 1024) != 0 ? krm2.AEQbTJ : str5, (106512 & 2048) != 0 ? krm2.fARcdN : str7, (106512 & 4096) != 0 ? krm2.DbNXlk : strValues, (106512 & 8192) != 0 ? krm2.AhwBna : null, (106512 & 16384) != 0 ? krm2.djBIcL : zFetchVPNInfo, (106512 & 32768) != 0 ? krm2.fetchVPNInfo : null, (106512 & 65536) != 0 ? krm2.gEmmrt : null, (106512 & 131072) != 0 ? krm2.fJNWhG : str, (106512 & 262144) != 0 ? krm2.AkhnZx : str2, (106512 & 524288) != 0 ? krm2.valueOf : advancedMainFragment.AkhnZx().djBIcL().getValue() != AbstractC30503lcQ.Activity.AEQbTJ);
    }

    private final C19818gQl zuBGHE() {
        String str = AkhnZx().DTwDnp().getValue() == AdvancedTradeType.BUY ? "buy" : "sell";
        int i = ActionBar.AEQbTJ[AkhnZx().getFieldNames().getValue().ordinal()];
        return new C19818gQl("advanced", str, i != 1 ? i != 2 ? "" : "limit" : "swap", null, 8, null);
    }
}

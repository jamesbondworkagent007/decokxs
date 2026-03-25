package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.content.IntentCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDestroyedException;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.WithLifecycleStateKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SlippageConfigVo;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.swap.operation_handler.bean.TradeState;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMainVM;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedMarketInfoVM;
import com.okinc.business.trade.features.home.advanced.viewmodel.AdvancedPlaceOrderVM;
import com.okinc.business.trade.features.home.autoconfirm.AutoConfirmEntryType;
import com.okinc.business.trade.features.home.ui.TradeConfirmOrderSheet;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.AdvancedMainFragment;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedLimitBy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteAndCallData;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData;
import com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractActivityC33041mov;
import o.AbstractC22407hel;
import o.AbstractC30503lcQ;
import o.AbstractC30561ldV;
import o.AbstractC30715lgQ;
import o.AbstractC58185ywX;
import o.ActivityC30497lcK;
import o.C21668hHx;
import o.C22310hcu;
import o.C22416heu;
import o.C22904hoE;
import o.C23272hvB;
import o.C23274hvD;
import o.C23313hvq;
import o.C23317hvu;
import o.C25352ivB;
import o.C25389ivm;
import o.C25390ivn;
import o.C25452iww;
import o.C28200kSp;
import o.C28222kTk;
import o.C30565ldZ;
import o.C30567ldb;
import o.C30620leb;
import o.C30626leh;
import o.C30662lfQ;
import o.C30753lhB;
import o.C30755lhD;
import o.C30756lhE;
import o.C30757lhF;
import o.C30760lhI;
import o.C30795lhr;
import o.C30798lhu;
import o.C30800lhw;
import o.C30806liB;
import o.C30922lkL;
import o.C31194lpS;
import o.C31200lpY;
import o.C33069mpW;
import o.C33070mpX;
import o.C33129mqd;
import o.C33570myu;
import o.C52761wXj;
import o.C54978xbK;
import o.C55001xbh;
import o.C55097xdX;
import o.C55276xgr;
import o.C55296xhK;
import o.C55298xhM;
import o.C56390yDp;
import o.C56392yDr;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56524yIo;
import o.C57656ymY;
import o.C58216yxB;
import o.C59541ziw;
import o.InterfaceC30586ldu;
import o.InterfaceC30595leC;
import o.InterfaceC30601leI;
import o.InterfaceC30608leP;
import o.InterfaceC30619lea;
import o.InterfaceC30639leu;
import o.InterfaceC30641lew;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58217yxC;
import o.InterfaceC58227yxM;
import o.InterfaceC59496ziD;
import o.dTH;
import o.hNI;
import o.kRM;
import o.kTF;
import o.kTV;
import o.rVN;
import o.wXX;
import o.yBK;
import o.yCM;
import o.yDY;
import o.yEE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedPlaceOrderFragment extends AbstractC30715lgQ<C21668hHx> implements InterfaceC30641lew, InterfaceC30608leP, C30795lhr.TaskDescription, C30800lhw.ActionBar, C30755lhD.Activity, C30756lhE.StateListAnimator, C30757lhF.ActionBar, InterfaceC30586ldu {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C58216yxB AEQbTJ;
    public boolean AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final ActivityResultLauncher<android.content.Intent> AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final ActivityResultLauncher<android.content.Intent> OLrzqt;
    public boolean djBIcL;

    @yCM
    public C25452iww eventTrackUtils;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final List<String> gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public InterfaceC58217yxC iwGUEr;

    @yCM
    public C30798lhu strategyManager;
    public final List<String> valueOf;
    public C22904hoE<DexMultiTokenInfoBean> values;

    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedTradeType.values().length];
            try {
                iArr[AdvancedTradeType.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedTradeType.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
            int[] iArr2 = new int[AdvancedLimitBy.values().length];
            try {
                iArr2[AdvancedLimitBy.Price.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdvancedLimitBy.MCap.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            copydefault = iArr2;
            int[] iArr3 = new int[AdvancedOrderType.values().length];
            try {
                iArr3[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            KWHzl = iArr3;
        }
    }

    public static final /* synthetic */ class ColorStateList implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ColorStateList(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
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
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    @Override // o.InterfaceC30586ldu
    public void KWHzl() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21668hHx DbNXlk(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        return (C21668hHx) advancedPlaceOrderFragment.fARcdN();
    }

    public AdvancedPlaceOrderFragment() {
        final Function0 function0 = null;
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedPlaceOrderVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$activityViewModels$default$3
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedMarketInfoVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$activityViewModels$default$5
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$activityViewModels$default$6
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
        final Function0 function02 = new Function0() { // from class: o.lgE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderFragment.wlaJM(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AdvancedMainVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$viewModels$default$3
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$special$$inlined$viewModels$default$4
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.lgH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderFragment.hDKMBd(this.AEQbTJ);
            }
        });
        this.valueOf = yDY.gEmmrt("-0.5", "-0.25", "-0.1", "0");
        this.gEmmrt = yDY.gEmmrt("0.25", SlippageConfigVo.MAX_SLIP, "1.0", "0");
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.lgF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderFragment.AwvSrB(this.KWHzl);
            }
        });
        this.AEQbTJ = new C58216yxB();
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.lgG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AdvancedPlaceOrderFragment.OLrzqt(this.copydefault, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.OLrzqt = activityResultLauncherRegisterForActivityResult;
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.lgK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                AdvancedPlaceOrderFragment.AEQbTJ(this.EZpvd, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult2, "");
        this.AuCTel = activityResultLauncherRegisterForActivityResult2;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final AdvancedPlaceOrderFragment OLrzqt() {
            return new AdvancedPlaceOrderFragment();
        }
    }

    public final AdvancedPlaceOrderVM AEQbTJ() {
        return (AdvancedPlaceOrderVM) this.fetchVPNInfo.getValue();
    }

    public final AdvancedMarketInfoVM djBIcL() {
        return (AdvancedMarketInfoVM) this.isConnected.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvancedMainVM AubY() {
        return (AdvancedMainVM) this.DbNXlk.getValue();
    }

    public static final ViewModelStoreOwner wlaJM(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = advancedPlaceOrderFragment.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final Function1<Float, Unit> EZpvd() {
        return (Function1) this.KWHzl.getValue();
    }

    public static final Function1 hDKMBd(final AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        return new Function1() { // from class: o.lgy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderFragment.OLrzqt(this.EZpvd, ((java.lang.Float) obj).floatValue());
            }
        };
    }

    public static final Unit OLrzqt(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, float f) {
        if (C33129mqd.AhwBna(Float.valueOf(f), 0)) {
            advancedPlaceOrderFragment.zsXlph();
        }
        InterfaceC30608leP.ActionBar.trackEvent$default(advancedPlaceOrderFragment, new AbstractC30561ldV.SharedElementCallback(C33129mqd.gEmmrt(Float.valueOf(f))), null, 2, null);
        advancedPlaceOrderFragment.AYXKKw = false;
        advancedPlaceOrderFragment.AEQbTJ().KWHzl(C33129mqd.gEmmrt(Float.valueOf(f)), advancedPlaceOrderFragment.AubY().valueOf());
        return Unit.INSTANCE;
    }

    public final C30798lhu valueOf() {
        C30798lhu c30798lhu = this.strategyManager;
        if (c30798lhu != null) {
            return c30798lhu;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.lgQ.OLrzqt()V */
    public final C25452iww OLrzqt() {
        C25452iww c25452iww = this.eventTrackUtils;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ View KWHzl;
        public final /* synthetic */ AdvancedPlaceOrderFragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(View view, long j, AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = advancedPlaceOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.KWHzl(InterfaceC30639leu.FragmentManager.copydefault);
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ View AEQbTJ;
        public final /* synthetic */ AdvancedPlaceOrderFragment KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(View view, long j, AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = advancedPlaceOrderFragment;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.KWHzl(InterfaceC30639leu.TaskDescription.EZpvd);
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ AdvancedPlaceOrderFragment AEQbTJ;
        public final /* synthetic */ View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(View view, long j, AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = advancedPlaceOrderFragment;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.leP.ActionBar.trackEvent$default(o.leP, o.lea, o.kRM, int, java.lang.Object):void */
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                AdvancedTradeType value = this.AEQbTJ.AEQbTJ().DTwDnp().getValue();
                InterfaceC30608leP.ActionBar.trackEvent$default(this.AEQbTJ, value == AdvancedTradeType.BUY ? AbstractC30561ldV.TaskStackBuilder.AEQbTJ : AbstractC30561ldV.ClipData.KWHzl, null, 2, null);
                AdvancedPlaceOrderFragment advancedPlaceOrderFragment = this.AEQbTJ;
                advancedPlaceOrderFragment.KWHzl(new InterfaceC30639leu.PictureInPictureParams(value, advancedPlaceOrderFragment.new FragmentManager()));
            }
        }
    }

    public final hNI AYXKKw() {
        return (hNI) this.AkhnZx.getValue();
    }

    public static final hNI AwvSrB(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        android.content.Context contextRequireContext = advancedPlaceOrderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new hNI(contextRequireContext);
    }

    public static final void OLrzqt(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, ActivityResult activityResult) {
        android.content.Intent data;
        if (activityResult.getResultCode() != -1 || (data = activityResult.getData()) == null) {
            return;
        }
        Parcelable parcelable = (Parcelable) IntentCompat.getParcelableExtra(data, "quote_response_from_provider_list", Parcelable.class);
        String stringExtra = data.getStringExtra("selected_de_fi_platform_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ = advancedPlaceOrderFragment.AEQbTJ();
        String stringExtra2 = data.getStringExtra("selected_de_fi_platform_name");
        advancedPlaceOrderVMAEQbTJ.EZpvd(stringExtra, stringExtra2 != null ? stringExtra2 : "");
        if (parcelable instanceof V6BaseQuoteResponse) {
            V6BaseQuoteResponse v6BaseQuoteResponse = (V6BaseQuoteResponse) parcelable;
            v6BaseQuoteResponse.setLocalSelectedDeFiPlatformId(stringExtra);
            advancedPlaceOrderFragment.AEQbTJ().KWHzl(v6BaseQuoteResponse);
        }
    }

    public static final void AEQbTJ(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, ActivityResult activityResult) {
        LifecycleOwner viewLifecycleOwner = advancedPlaceOrderFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AdvancedPlaceOrderFragment$tradeAutoSellStrategyActivityLauncher$1$1(advancedPlaceOrderFragment, null), 3, null);
    }

    @Override // o.hTH, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = new C58216yxB();
        super.onViewCreated(view, bundle);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C21668hHx OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21668hHx c21668hHxCopydefault = C21668hHx.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21668hHxCopydefault, "");
        return c21668hHxCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull C21668hHx c21668hHx, Bundle bundle) {
        String value;
        InterfaceC56387yDm<String> interfaceC56387yDmCopydefault;
        Intrinsics.checkNotNullParameter(c21668hHx, "");
        djBIcL(c21668hHx);
        valueOf(c21668hHx);
        AYXKKw(c21668hHx);
        KWHzl(c21668hHx);
        AEQbTJ(c21668hHx);
        copydefault(c21668hHx);
        gEmmrt(c21668hHx);
        EZpvd(c21668hHx);
        AhwBna(c21668hHx);
        OLrzqt(c21668hHx);
        AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ = AEQbTJ();
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (interfaceC56387yDmCopydefault = C31200lpY.copydefault(parentFragment)) == null || (value = interfaceC56387yDmCopydefault.getValue()) == null) {
            value = "default_trade";
        }
        advancedPlaceOrderVMAEQbTJ.OLrzqt(value);
        AEQbTJ().OcIXYQ();
        AEQbTJ().AhwBna();
        AEQbTJ().AuCTel();
        AhwBna();
        zLjUOn();
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o.lge
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    AdvancedPlaceOrderFragment.AubY(this.copydefault);
                }
            });
        }
    }

    public static final void AubY(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) advancedPlaceOrderFragment, true, (String) null, 2, (Object) null);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(C30922lkL.class, new String[0]);
        final Function1 function1 = new Function1() { // from class: o.lgC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderFragment.EZpvd(this.KWHzl, (C30922lkL) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.lgB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AdvancedPlaceOrderFragment.OLrzqt(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.lgA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderFragment.AEQbTJ((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.lgz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                AdvancedPlaceOrderFragment.copydefault(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, this.AEQbTJ);
    }

    public static final void OLrzqt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C30922lkL c30922lkL) {
        advancedPlaceOrderFragment.AEQbTJ(c30922lkL.KWHzl());
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(Throwable th) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void copydefault(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void AEQbTJ(DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanDbNXlk = AEQbTJ().DbNXlk();
        if (Intrinsics.EZpvd((Object) (dexMultiTokenInfoBeanDbNXlk != null ? dexMultiTokenInfoBeanDbNXlk.getChainId() : null), (Object) dexMultiTokenInfoBean.getChainId())) {
            AEQbTJ().KWHzl(new UIPricingToken(dexMultiTokenInfoBean, true), true);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        C21668hHx c21668hHx;
        C30755lhD c30755lhD;
        C30800lhw c30800lhw;
        C21668hHx c21668hHx2 = (C21668hHx) fARcdN();
        if (c21668hHx2 != null && (c30800lhw = c21668hHx2.AEQbTJ) != null) {
            c30800lhw.AEQbTJ(AEQbTJ().DTwDnp().getValue());
        }
        C21668hHx c21668hHx3 = (C21668hHx) fARcdN();
        if (c21668hHx3 != null && (c30755lhD = c21668hHx3.DbNXlk) != null) {
            c30755lhD.AuCTel();
        }
        if (AEQbTJ().OLrzqt() && AEQbTJ().RJOkX()) {
            KWHzl(InterfaceC30639leu.TaskDescription.EZpvd);
        }
        AEQbTJ().djBIcL(true);
        C22904hoE<DexMultiTokenInfoBean> c22904hoE = this.values;
        if (c22904hoE != null) {
            c22904hoE.copydefault();
        }
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        AdvancedMainFragment advancedMainFragment = parentFragment instanceof AdvancedMainFragment ? (AdvancedMainFragment) parentFragment : null;
        if (((advancedMainFragment != null && !advancedMainFragment.valueOf()) || !this.djBIcL) && (c21668hHx = (C21668hHx) fARcdN()) != null) {
            DbNXlk(c21668hHx);
        }
        androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
        AdvancedMainFragment advancedMainFragment2 = parentFragment2 instanceof AdvancedMainFragment ? (AdvancedMainFragment) parentFragment2 : null;
        if (advancedMainFragment2 != null) {
            advancedMainFragment2.AEQbTJ(false);
        }
    }

    @Override // o.InterfaceC30641lew
    public void KWHzl(@NotNull InterfaceC30639leu interfaceC30639leu) {
        Intrinsics.checkNotNullParameter(interfaceC30639leu, "");
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30641lew interfaceC30641lew = parentFragment instanceof InterfaceC30641lew ? (InterfaceC30641lew) parentFragment : null;
        if (interfaceC30641lew != null) {
            interfaceC30641lew.KWHzl(interfaceC30639leu);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void uzCIH() {
        C30757lhF c30757lhF;
        String value;
        InterfaceC56387yDm<String> interfaceC56387yDmCopydefault;
        C21668hHx c21668hHx = (C21668hHx) fARcdN();
        if (c21668hHx == null || (c30757lhF = c21668hHx.EZpvd) == null) {
            return;
        }
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (interfaceC56387yDmCopydefault = C31200lpY.copydefault(parentFragment)) == null || (value = interfaceC56387yDmCopydefault.getValue()) == null) {
            value = "default_trade";
        }
        c30757lhF.KWHzl(value, AEQbTJ().iwGUEr().getValue(), AEQbTJ().RJOkX());
    }

    @Override // o.C30755lhD.Activity
    public void isConnected() {
        KWHzl(InterfaceC30639leu.PendingIntent.copydefault);
    }

    @Override // o.C30800lhw.ActionBar
    public void fetchVPNInfo() {
        DexMultiTokenInfoBean value = AEQbTJ().ejfBZ().getValue();
        String tokenSymbol = value != null ? value.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        C30662lfQ c30662lfQEZpvd = C30662lfQ.Companion.EZpvd(tokenSymbol, AdvancedAmountValueType.VALUE, new Function1() { // from class: o.lgq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderFragment.KWHzl(this.OLrzqt, (C55276xgr) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30662lfQEZpvd.show(childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C55276xgr c55276xgr) {
        C30800lhw c30800lhw;
        C30795lhr c30795lhr;
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        C21668hHx c21668hHx = (C21668hHx) advancedPlaceOrderFragment.fARcdN();
        if (c21668hHx != null && (c30795lhr = c21668hHx.djBIcL) != null) {
            c30795lhr.setVisibility(c55276xgr.OLrzqt() == AdvancedAmountValueType.AMOUNT ? 0 : 8);
        }
        C21668hHx c21668hHx2 = (C21668hHx) advancedPlaceOrderFragment.fARcdN();
        if (c21668hHx2 != null && (c30800lhw = c21668hHx2.AEQbTJ) != null) {
            c30800lhw.setVisibility(c55276xgr.OLrzqt() != AdvancedAmountValueType.VALUE ? 8 : 0);
        }
        if (c55276xgr.OLrzqt() == AdvancedAmountValueType.AMOUNT) {
            advancedPlaceOrderFragment.AEQbTJ().AEQbTJ("");
        }
        return Unit.INSTANCE;
    }

    @Override // o.C30795lhr.TaskDescription
    public void gEmmrt() {
        DexMultiTokenInfoBean value = AEQbTJ().ejfBZ().getValue();
        String tokenSymbol = value != null ? value.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        C30662lfQ c30662lfQEZpvd = C30662lfQ.Companion.EZpvd(tokenSymbol, AdvancedAmountValueType.AMOUNT, new Function1() { // from class: o.lgc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderFragment.copydefault(this.AEQbTJ, (C55276xgr) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c30662lfQEZpvd.show(childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C55276xgr c55276xgr) {
        C30800lhw c30800lhw;
        C30795lhr c30795lhr;
        Intrinsics.checkNotNullParameter(c55276xgr, "");
        C21668hHx c21668hHx = (C21668hHx) advancedPlaceOrderFragment.fARcdN();
        if (c21668hHx != null && (c30795lhr = c21668hHx.djBIcL) != null) {
            c30795lhr.setVisibility(c55276xgr.OLrzqt() == AdvancedAmountValueType.AMOUNT ? 0 : 8);
        }
        C21668hHx c21668hHx2 = (C21668hHx) advancedPlaceOrderFragment.fARcdN();
        if (c21668hHx2 != null && (c30800lhw = c21668hHx2.AEQbTJ) != null) {
            c30800lhw.setVisibility(c55276xgr.OLrzqt() != AdvancedAmountValueType.VALUE ? 8 : 0);
        }
        if (c55276xgr.OLrzqt() == AdvancedAmountValueType.VALUE) {
            advancedPlaceOrderFragment.AEQbTJ().AEQbTJ("");
        }
        return Unit.INSTANCE;
    }

    @Override // o.C30757lhF.ActionBar
    public void fJNWhG() {
        KWHzl(InterfaceC30639leu.Fragment.AEQbTJ);
    }

    @Override // o.C30757lhF.ActionBar
    public void AkhnZx() {
        String value;
        InterfaceC56387yDm<String> interfaceC56387yDmCopydefault;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment == null || (interfaceC56387yDmCopydefault = C31200lpY.copydefault(parentFragment)) == null || (value = interfaceC56387yDmCopydefault.getValue()) == null) {
            value = "default_trade";
        }
        DexMultiTokenInfoBean value2 = AEQbTJ().ejfBZ().getValue();
        String chainId = value2 != null ? value2.getChainId() : null;
        C25352ivB.OLrzqt((android.content.Context) fragmentActivityRequireActivity, value, chainId != null ? chainId : "", true);
        InterfaceC30608leP.ActionBar.trackEvent$default(this, AbstractC30561ldV.Fragment.AEQbTJ, null, 2, null);
    }

    @Override // o.C30757lhF.ActionBar
    public void values() {
        AdvancedQuoteAndCallData advancedQuoteAndCallDataKWHzl;
        AdvancedQuoteUiData value = AEQbTJ().AuCTelauCTel().getValue();
        if (value == null || (advancedQuoteAndCallDataKWHzl = value.KWHzl()) == null) {
            return;
        }
        if (advancedQuoteAndCallDataKWHzl instanceof AdvancedQuoteAndCallData.LegacyLimit) {
        } else {
            if (!(advancedQuoteAndCallDataKWHzl instanceof AdvancedQuoteAndCallData.V6)) {
                throw new NoWhenBranchMatchedException();
            }
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AdvancedPlaceOrderFragment$onDexRouterClick$1(this, advancedQuoteAndCallDataKWHzl, null), 3, null);
        }
    }

    public final void OLrzqt(String str, android.content.Intent intent) {
        String value;
        C25452iww c25452iwwOLrzqt = OLrzqt();
        Map mapEZpvd = C56423yEv.EZpvd(C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, "provider_select_enter"));
        String type = TrackOrderType.SWAP.getType();
        if (AEQbTJ().DTwDnp().getValue() == AdvancedTradeType.BUY) {
            value = TrackTransactionDirection.BUY.getValue();
        } else {
            value = TrackTransactionDirection.SELL.getValue();
        }
        c25452iwwOLrzqt.OLrzqt(new AbstractC22407hel.FragmentManager(str, "advanced", "advanced", type, value, mapEZpvd));
        this.OLrzqt.launch(intent);
    }

    @Override // o.C30757lhF.ActionBar
    public void KWHzl(boolean z) {
        InterfaceC30608leP.ActionBar.trackEvent$default(this, AbstractC30561ldV.Activity.AEQbTJ, null, 2, null);
        AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ = AEQbTJ();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        advancedPlaceOrderVMAEQbTJ.copydefault(fragmentActivityRequireActivity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) fragmentActivityRequireActivity : null, z);
    }

    @Override // o.C30756lhE.StateListAnimator
    public void hDKMBd() {
        InterfaceC30608leP.ActionBar.trackEvent$default(this, C30565ldZ.AEQbTJ(AEQbTJ().wlaJM().getValue()), null, 2, null);
        AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ = AEQbTJ();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        advancedPlaceOrderVMAEQbTJ.AEQbTJ(fragmentActivityRequireActivity);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onInvisible() {
        AdvancedPlaceOrderVM.stopCheckingQuote$default(AEQbTJ(), false, false, 2, null);
        super.onInvisible();
    }

    @Override // o.InterfaceC30608leP
    public void KWHzl(@NotNull InterfaceC30619lea interfaceC30619lea, @NotNull kRM krm) {
        Intrinsics.checkNotNullParameter(interfaceC30619lea, "");
        Intrinsics.checkNotNullParameter(krm, "");
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP != null) {
            interfaceC30608leP.KWHzl(interfaceC30619lea, krm);
        }
    }

    @Override // o.InterfaceC30608leP
    public void copydefault(@NotNull String str, @NotNull kRM krm) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(krm, "");
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30608leP interfaceC30608leP = parentFragment instanceof InterfaceC30608leP ? (InterfaceC30608leP) parentFragment : null;
        if (interfaceC30608leP != null) {
            interfaceC30608leP.copydefault(str, krm);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v73, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zLjUOn() {
        InterfaceC58217yxC interfaceC58217yxC = this.iwGUEr;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.iwGUEr = AEQbTJ().flVtFt().DbNXlk();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, this, new InterfaceC59496ziD() { // from class: o.lgb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                AdvancedPlaceOrderFragment.EZpvd(this.OLrzqt, z);
            }
        });
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().DTwDnp(), null, new ComponentCallbacks2(), 2, null);
        StateFlow<DexMultiTokenInfoBean> stateFlowEjfBZ = AEQbTJ().ejfBZ();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C25390ivn.AEQbTJ(this, stateFlowEjfBZ, state, new Intent());
        C25390ivn.AEQbTJ(this, AEQbTJ().AwvSrB(), state, new IntentFilter());
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().AuCTelauCTel(), null, new ApplicationInfo(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().uzCIH(), null, new IntentSender(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().wlaJM(), null, new Configuration(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AubY().isConnected(), null, new PackageManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(AEQbTJ().gEmmrt(), AEQbTJ().ejfBZ(), new AdvancedPlaceOrderFragment$observeData$9(null)), null, new Dialog(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().ORxRYg(), null, new PendingIntent(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().QKVWgx(), null, new Fragment(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().fARcdN(), null, new LoaderManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(AEQbTJ().zLjUOn(), AEQbTJ().ejfBZ(), new AdvancedPlaceOrderFragment$observeData$14(null)), null, new VoiceInteractor(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().gEmmrt(), null, new PictureInPictureParams(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().djBIcL(), null, new AssistContent(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, FlowLiveDataConversions.asFlow(AEQbTJ().QOLQEE()), null, new SharedElementCallback(), 2, null);
        C25390ivn.AEQbTJ(this, AEQbTJ().fFgQHt(), state, new TaskStackBuilder());
        AEQbTJ().fetchVPNInfo().observe(this, new ColorStateList(new Function1() { // from class: o.lgn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderFragment.EZpvd(this.AEQbTJ, (InterfaceC30639leu) obj);
            }
        }));
        AEQbTJ().iwGUEr().observe(this, new ColorStateList(new Function1() { // from class: o.lgw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return AdvancedPlaceOrderFragment.KWHzl(this.OLrzqt, (java.util.List) obj);
            }
        }));
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().valueOf(), null, new ClipData(), 2, null);
        C25390ivn.AEQbTJ(this, AEQbTJ().getFieldNames(), state, new ComponentCallbacks());
        C25390ivn.collectOnViewLifecycle$default(this, valueOf().copydefault(), null, new BroadcastReceiver(), 2, null);
        C25390ivn.AEQbTJ(this, AEQbTJ().fJNWhG(), state, new ComponentName());
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(AEQbTJ().QVAiDq(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new AdvancedPlaceOrderFragment$observeData$26(this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(AEQbTJ().ejfBZ(), AEQbTJ().AwvSrB(), new AdvancedPlaceOrderFragment$observeData$27(null)), null, new Context(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(AEQbTJ().wlaJM(), AEQbTJ().AuCTelauCTel(), AEQbTJ().DTwDnp(), AEQbTJ().ejfBZ(), AEQbTJ().AwvSrB(), new AdvancedPlaceOrderFragment$observeData$29(this, null)), null, new ContextWrapper(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AubY().AhwBna(), null, new DialogInterface(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().dxcTrN(), null, new ContentResolver(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().AYXKKw(), null, new SharedPreferences(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().isConnected(), null, new ServiceConnection(), 2, null);
        if (((C21668hHx) fARcdN()) != null) {
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            AdvancedMainFragment advancedMainFragment = parentFragment instanceof AdvancedMainFragment ? (AdvancedMainFragment) parentFragment : null;
            final NestedScrollView nestedScrollViewFetchVPNInfo = advancedMainFragment != null ? advancedMainFragment.fetchVPNInfo() : null;
            FragmentActivity activity = getActivity();
            if (activity != null) {
                C59541ziw.KWHzl(activity, new InterfaceC59496ziD() { // from class: o.lgD
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // o.InterfaceC59496ziD
                    public final void OLrzqt(boolean z) {
                        AdvancedPlaceOrderFragment.OLrzqt(this.EZpvd, nestedScrollViewFetchVPNInfo, z);
                    }
                });
            }
        }
    }

    public static final void EZpvd(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, boolean z) {
        if (z) {
            return;
        }
        advancedPlaceOrderFragment.zsXlph();
    }

    public static final class ComponentCallbacks2<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks2() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(AdvancedTradeType advancedTradeType, Continuation<? super Unit> continuation) {
            C30753lhB c30753lhB;
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null && (c30753lhB = c21668hHxDbNXlk.gEmmrt) != null) {
                c30753lhB.copydefault(advancedTradeType);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Intent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Intent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null) {
                AdvancedPlaceOrderFragment.this.EZpvd(c21668hHxDbNXlk, dexMultiTokenInfoBean);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class IntentFilter<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public IntentFilter() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(DexMultiTokenInfoBean dexMultiTokenInfoBean, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null) {
                AdvancedPlaceOrderFragment.this.KWHzl(c21668hHxDbNXlk, dexMultiTokenInfoBean);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class ApplicationInfo<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ApplicationInfo() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(AdvancedQuoteUiData advancedQuoteUiData, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderFragment.this.copydefault(advancedQuoteUiData);
            return Unit.INSTANCE;
        }
    }

    public static final class IntentSender<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public IntentSender() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return copydefault(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                AdvancedPlaceOrderFragment.this.showLoadingWithLogo();
            } else {
                AdvancedPlaceOrderFragment.this.dismissLoadingWithLogo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Configuration<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Configuration() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(InterfaceC30595leC interfaceC30595leC, Continuation<? super Unit> continuation) {
            androidx.fragment.app.FragmentManager childFragmentManager;
            androidx.fragment.app.Fragment parentFragment = AdvancedPlaceOrderFragment.this.getParentFragment();
            androidx.fragment.app.Fragment fragmentFindFragmentByTag = (parentFragment == null || (childFragmentManager = parentFragment.getChildFragmentManager()) == null) ? null : childFragmentManager.findFragmentByTag(String.valueOf(C56524yIo.AEQbTJ(TradeConfirmOrderSheet.class).valueOf()));
            wXX wxx = fragmentFindFragmentByTag instanceof wXX ? (wXX) fragmentFindFragmentByTag : null;
            if (wxx != null) {
                wxx.dismissAllowingStateLoss();
            }
            AdvancedPlaceOrderFragment.this.AEQbTJ(interfaceC30595leC);
            return Unit.INSTANCE;
        }
    }

    public static final class PackageManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PackageManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(C30806liB c30806liB, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderFragment.this.AEQbTJ().OLrzqt(c30806liB);
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
        public final Object emit(Pair<String, DexMultiTokenInfoBean> pair, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null) {
                AdvancedPlaceOrderFragment.this.AEQbTJ(c21668hHxDbNXlk, pair.getFirst(), pair.getSecond());
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
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null) {
                AdvancedPlaceOrderFragment.updateFiatTotal$default(AdvancedPlaceOrderFragment.this, c21668hHxDbNXlk, str, false, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null) {
                AdvancedPlaceOrderFragment.this.copydefault(c21668hHxDbNXlk, str);
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
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk;
            C30755lhD c30755lhD;
            C55001xbh c55001xbhAhwBna;
            if ((str == null || str.length() == 0) && (c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this)) != null && (c30755lhD = c21668hHxDbNXlk.DbNXlk) != null && (c55001xbhAhwBna = c30755lhD.AhwBna()) != null) {
                c55001xbhAhwBna.setPlainNumericText("");
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
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(Pair<Boolean, DexMultiTokenInfoBean> pair, Continuation<? super Unit> continuation) {
            DexMultiTokenInfoBean second = pair.getSecond();
            boolean z = AdvancedPlaceOrderFragment.this.AEQbTJ().wlaJM().getValue() instanceof InterfaceC30595leC.Intent;
            if (second != null && !z) {
                AdvancedPlaceOrderFragment.this.djBIcL().AEQbTJ(second.getChainId(), second.getTokenContractAddress());
                return Unit.INSTANCE;
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
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(C28222kTk c28222kTk, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null) {
                AdvancedPlaceOrderFragment advancedPlaceOrderFragment = AdvancedPlaceOrderFragment.this;
                advancedPlaceOrderFragment.OLrzqt(c21668hHxDbNXlk, advancedPlaceOrderFragment.AEQbTJ().ORxRYg().getValue(), true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class AssistContent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AssistContent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(C28222kTk c28222kTk, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderFragment.this.AEQbTJ().copydefault(c28222kTk);
            return Unit.INSTANCE;
        }
    }

    public static final class SharedElementCallback<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(Boolean bool, Continuation<? super Unit> continuation) {
            AdvancedMainVM advancedMainVMAubY = AdvancedPlaceOrderFragment.this.AubY();
            Intrinsics.copydefault(bool);
            advancedMainVMAubY.AEQbTJ(bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    public static final class TaskStackBuilder<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(C30626leh c30626leh, Continuation<? super Unit> continuation) {
            if (AdvancedPlaceOrderFragment.this.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                AdvancedPlaceOrderVM.updateQuote$default(AdvancedPlaceOrderFragment.this.AEQbTJ(), c30626leh, false, 2, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit EZpvd(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, InterfaceC30639leu interfaceC30639leu) {
        Intrinsics.copydefault(interfaceC30639leu);
        advancedPlaceOrderFragment.KWHzl(interfaceC30639leu);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, List list) {
        C30757lhF c30757lhF;
        String value;
        InterfaceC56387yDm<String> interfaceC56387yDmCopydefault;
        C21668hHx c21668hHx = (C21668hHx) advancedPlaceOrderFragment.fARcdN();
        if (c21668hHx != null && (c30757lhF = c21668hHx.EZpvd) != null) {
            androidx.fragment.app.Fragment parentFragment = advancedPlaceOrderFragment.getParentFragment();
            if (parentFragment == null || (interfaceC56387yDmCopydefault = C31200lpY.copydefault(parentFragment)) == null || (value = interfaceC56387yDmCopydefault.getValue()) == null) {
                value = "default_trade";
            }
            c30757lhF.KWHzl(value, list, advancedPlaceOrderFragment.AEQbTJ().RJOkX());
        }
        return Unit.INSTANCE;
    }

    public static final class ClipData<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClipData() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(TradeState tradeState, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderFragment.this.AEQbTJ().AEQbTJ();
            return Unit.INSTANCE;
        }
    }

    public static final class ComponentCallbacks<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentCallbacks() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(AdvancedOrderType advancedOrderType, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderFragment.this.valueOf().copydefault(advancedOrderType);
            C30798lhu c30798lhuValueOf = AdvancedPlaceOrderFragment.this.valueOf();
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk == null) {
                return Unit.INSTANCE;
            }
            c30798lhuValueOf.KWHzl(c21668hHxDbNXlk);
            AdvancedPlaceOrderFragment.this.valueOf().copydefault(AdvancedPlaceOrderFragment.this.AEQbTJ().wlaJM().getValue());
            C21668hHx c21668hHxDbNXlk2 = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk2 != null) {
                AdvancedPlaceOrderFragment.this.AEQbTJ(c21668hHxDbNXlk2, advancedOrderType);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class BroadcastReceiver<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public BroadcastReceiver() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null) {
                AdvancedPlaceOrderFragment.this.DbNXlk(c21668hHxDbNXlk);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class ComponentName<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ComponentName() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(AdvancedLimitBy advancedLimitBy, Continuation<? super Unit> continuation) {
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null) {
                AdvancedPlaceOrderFragment.this.EZpvd(c21668hHxDbNXlk, advancedLimitBy);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Context<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Context() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(Pair<DexMultiTokenInfoBean, DexMultiTokenInfoBean> pair, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderFragment.this.AEQbTJ().dvKsVJ();
            return Unit.INSTANCE;
        }
    }

    public static final class ContextWrapper<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContextWrapper() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.lhI.copy$default(o.lhI, o.leC, com.okinc.business.trade.features.home.ui.cefi.data.AdvancedQuoteUiData, com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean, int, java.lang.Object):o.lhI */
        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(C30760lhI c30760lhI, Continuation<? super Unit> continuation) {
            InterfaceC30595leC interfaceC30595leCAEQbTJ;
            C30756lhE c30756lhE;
            InterfaceC30595leC interfaceC30595leCAEQbTJ2 = c30760lhI.AEQbTJ();
            if (interfaceC30595leCAEQbTJ2 instanceof InterfaceC30595leC.Dialog) {
                interfaceC30595leCAEQbTJ = InterfaceC30595leC.Dialog.copy$default((InterfaceC30595leC.Dialog) c30760lhI.AEQbTJ(), null, null, AdvancedPlaceOrderFragment.this.AEQbTJ().dNCPSb(), null, null, 27, null);
            } else if (interfaceC30595leCAEQbTJ2 instanceof InterfaceC30595leC.PictureInPictureParams) {
                InterfaceC30595leC interfaceC30595leCAEQbTJ3 = ((InterfaceC30595leC.PictureInPictureParams) c30760lhI.AEQbTJ()).AEQbTJ();
                interfaceC30595leCAEQbTJ = interfaceC30595leCAEQbTJ3 instanceof InterfaceC30595leC.Dialog ? InterfaceC30595leC.PictureInPictureParams.copy$default((InterfaceC30595leC.PictureInPictureParams) c30760lhI.AEQbTJ(), null, false, InterfaceC30595leC.Dialog.copy$default((InterfaceC30595leC.Dialog) interfaceC30595leCAEQbTJ3, null, null, AdvancedPlaceOrderFragment.this.AEQbTJ().dNCPSb(), null, null, 27, null), null, 11, null) : (InterfaceC30595leC.PictureInPictureParams) c30760lhI.AEQbTJ();
            } else {
                interfaceC30595leCAEQbTJ = c30760lhI.AEQbTJ();
            }
            InterfaceC30595leC interfaceC30595leC = interfaceC30595leCAEQbTJ;
            C21668hHx c21668hHxDbNXlk = AdvancedPlaceOrderFragment.DbNXlk(AdvancedPlaceOrderFragment.this);
            if (c21668hHxDbNXlk != null && (c30756lhE = c21668hHxDbNXlk.AhwBna) != null) {
                c30756lhE.copydefault(C30760lhI.copy$default(c30760lhI, interfaceC30595leC, null, null, null, null, 30, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class DialogInterface<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public DialogInterface() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final Object emit(C28200kSp c28200kSp, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderVM advancedPlaceOrderVMAEQbTJ = AdvancedPlaceOrderFragment.this.AEQbTJ();
            if (c28200kSp == null) {
                return Unit.INSTANCE;
            }
            advancedPlaceOrderVMAEQbTJ.KWHzl(C56443yFo.KWHzl(c28200kSp.KWHzl()));
            return Unit.INSTANCE;
        }
    }

    public static final class ContentResolver<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ContentResolver() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(dTH dth, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderFragment.this.uzCIH();
            return Unit.INSTANCE;
        }
    }

    public static final class SharedPreferences<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedPreferences() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return EZpvd(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object EZpvd(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                android.content.Context contextRequireContext = AdvancedPlaceOrderFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C55097xdX c55097xdX = new C55097xdX(contextRequireContext, null, 0, 4, null);
                c55097xdX.setState(1);
                String string = AdvancedPlaceOrderFragment.this.requireContext().getString(C23274hvD.Fragment.MediaBrowserCompatMediaBrowserImplApi26);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c55097xdX.setTitle(string);
                Drawable drawable = ContextCompat.getDrawable(AdvancedPlaceOrderFragment.this.requireContext(), C52761wXj.TaskDescription.RXzakW);
                if (drawable != null) {
                    drawable.setTint(ContextCompat.getColor(AdvancedPlaceOrderFragment.this.requireContext(), C52761wXj.Activity.fdOvFl));
                } else {
                    drawable = null;
                }
                c55097xdX.setLeadingIcon(drawable);
                C57656ymY.showNotificationViewWithToast$default(C57656ymY.OLrzqt, c55097xdX, 3000L, 0, 0, 0, 28, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class ServiceConnection<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ServiceConnection() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            AdvancedPlaceOrderFragment.this.wlaJM();
            return Unit.INSTANCE;
        }
    }

    public static final void OLrzqt(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, NestedScrollView nestedScrollView, boolean z) {
        if (C22416heu.valueOf() || !C23317hvu.getNewProxyInstance()) {
            return;
        }
        if (z && !advancedPlaceOrderFragment.AhwBna) {
            advancedPlaceOrderFragment.AhwBna = true;
            if (nestedScrollView != null) {
                nestedScrollView.smoothScrollTo(0, C55298xhM.dpInt$default(40.0f, (android.content.Context) null, 1, (Object) null));
                return;
            }
            return;
        }
        if (z || !advancedPlaceOrderFragment.AhwBna) {
            return;
        }
        advancedPlaceOrderFragment.AhwBna = false;
        if (nestedScrollView != null) {
            nestedScrollView.smoothScrollTo(0, 0);
        }
    }

    public final void AEQbTJ(C21668hHx c21668hHx, String str, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        c21668hHx.EZpvd.copydefault(str, dexMultiTokenInfoBean, AEQbTJ().dNCPSb());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(InterfaceC30595leC interfaceC30595leC) {
        InterfaceC30595leC interfaceC30595leCAEQbTJ;
        C30567ldb c30567ldb;
        DexMultiTokenInfoBean value = AEQbTJ().ejfBZ().getValue();
        if (interfaceC30595leC instanceof InterfaceC30595leC.ContentResolver) {
            interfaceC30595leC = InterfaceC30595leC.ContentResolver.copy$default((InterfaceC30595leC.ContentResolver) interfaceC30595leC, null, value != null ? value.getChainId() : null, value != null ? value.getChainName() : null, 1, null);
        } else if (interfaceC30595leC instanceof InterfaceC30595leC.Dialog) {
            interfaceC30595leC = InterfaceC30595leC.Dialog.copy$default((InterfaceC30595leC.Dialog) interfaceC30595leC, null, null, AEQbTJ().dNCPSb(), null, new Function0() { // from class: o.lgs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AdvancedPlaceOrderFragment.uzCIH(this.KWHzl);
                }
            }, 11, null);
        } else if (interfaceC30595leC instanceof InterfaceC30595leC.ComponentCallbacks2) {
            InterfaceC30595leC.ComponentCallbacks2 componentCallbacks2 = (InterfaceC30595leC.ComponentCallbacks2) interfaceC30595leC;
            if (Intrinsics.EZpvd((Object) componentCallbacks2.copydefault(), (Object) "10052")) {
                String tokenSymbol = value != null ? value.getTokenSymbol() : null;
                if (tokenSymbol == null) {
                    tokenSymbol = "";
                }
                interfaceC30595leC = new InterfaceC30595leC.Dialog(tokenSymbol, componentCallbacks2.copydefault(), AEQbTJ().dNCPSb(), componentCallbacks2.AEQbTJ(), new Function0() { // from class: o.lgp
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AdvancedPlaceOrderFragment.getNewProxyInstance(this.copydefault);
                    }
                });
            } else if (interfaceC30595leC instanceof InterfaceC30595leC.PictureInPictureParams) {
                List<String> value2 = AEQbTJ().iwGUEr().getValue();
                String strGEmmrt = C33129mqd.gEmmrt(value2 != null ? Integer.valueOf(value2.size()) : null);
                InterfaceC30595leC.PictureInPictureParams pictureInPictureParams = (InterfaceC30595leC.PictureInPictureParams) interfaceC30595leC;
                if (pictureInPictureParams.AEQbTJ() instanceof InterfaceC30595leC.Dialog) {
                    interfaceC30595leCAEQbTJ = InterfaceC30595leC.Dialog.copy$default((InterfaceC30595leC.Dialog) pictureInPictureParams.AEQbTJ(), null, null, AEQbTJ().dNCPSb(), null, new Function0() { // from class: o.lgr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return AdvancedPlaceOrderFragment.iwGUEr(this.AEQbTJ);
                        }
                    }, 11, null);
                } else {
                    interfaceC30595leCAEQbTJ = pictureInPictureParams.AEQbTJ();
                }
                interfaceC30595leC = InterfaceC30595leC.PictureInPictureParams.copy$default(pictureInPictureParams, strGEmmrt, false, interfaceC30595leCAEQbTJ, new Function0() { // from class: o.lgo
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return AdvancedPlaceOrderFragment.zsXlph(this.KWHzl);
                    }
                }, 2, null);
            }
        }
        ActivityResultCaller parentFragment = getParentFragment();
        InterfaceC30601leI interfaceC30601leI = parentFragment instanceof InterfaceC30601leI ? (InterfaceC30601leI) parentFragment : null;
        if (interfaceC30601leI != null) {
            interfaceC30601leI.KWHzl(interfaceC30595leC);
        }
        C21668hHx c21668hHx = (C21668hHx) fARcdN();
        if (c21668hHx != null && (c30567ldb = c21668hHx.OLrzqt) != null) {
            c30567ldb.setEditVisibility(AEQbTJ().KWHzl(interfaceC30595leC));
        }
        valueOf().copydefault(interfaceC30595leC);
    }

    public static final Unit uzCIH(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        advancedPlaceOrderFragment.KWHzl(false);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        advancedPlaceOrderFragment.KWHzl(true);
        return Unit.INSTANCE;
    }

    public static final Unit iwGUEr(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        advancedPlaceOrderFragment.KWHzl(false);
        return Unit.INSTANCE;
    }

    public static final Unit zsXlph(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        advancedPlaceOrderFragment.AkhnZx();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(AdvancedQuoteUiData advancedQuoteUiData) {
        boolean zRJOkX = AEQbTJ().RJOkX();
        if (AEQbTJ().QfsBiF()) {
            InterfaceC30608leP.ActionBar.trackEvent$default(this, new C30620leb("", AEQbTJ().AubY()), null, 2, null);
        }
        C21668hHx c21668hHx = (C21668hHx) fARcdN();
        if (c21668hHx != null) {
            c21668hHx.EZpvd.AEQbTJ(advancedQuoteUiData, AEQbTJ().AwvSrB().getValue(), zRJOkX);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(C21668hHx c21668hHx, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        if (AEQbTJ().DTwDnp().getValue() != AdvancedTradeType.BUY) {
            AubY().AEQbTJ(dexMultiTokenInfoBean);
            DbNXlk(c21668hHx);
        } else {
            AubY().AYXKKw(dexMultiTokenInfoBean);
            C21668hHx c21668hHx2 = (C21668hHx) fARcdN();
            if (c21668hHx2 != null) {
                fetchVPNInfo(c21668hHx2);
            }
        }
        c21668hHx.djBIcL.copydefault(AEQbTJ().DTwDnp().getValue(), dexMultiTokenInfoBean);
        c21668hHx.AEQbTJ.AEQbTJ(AEQbTJ().DTwDnp().getValue());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(C21668hHx c21668hHx, DexMultiTokenInfoBean dexMultiTokenInfoBean) {
        boolean z = AEQbTJ().DTwDnp().getValue() == AdvancedTradeType.BUY;
        boolean zRJOkX = AEQbTJ().RJOkX();
        if (z) {
            AubY().AEQbTJ(dexMultiTokenInfoBean);
            DbNXlk(c21668hHx);
        } else {
            AubY().AYXKKw(dexMultiTokenInfoBean);
            C21668hHx c21668hHx2 = (C21668hHx) fARcdN();
            if (c21668hHx2 != null) {
                fetchVPNInfo(c21668hHx2);
            }
        }
        c21668hHx.EZpvd.AEQbTJ(AEQbTJ().AuCTelauCTel().getValue(), dexMultiTokenInfoBean, zRJOkX);
    }

    public final void DbNXlk(C21668hHx c21668hHx) {
        if (!AEQbTJ().RJOkX() || c21668hHx.DbNXlk.fetchVPNInfo()) {
            return;
        }
        C55001xbh c55001xbhAhwBna = c21668hHx.DbNXlk.AhwBna();
        if (c55001xbhAhwBna == null || !c55001xbhAhwBna.isFocused()) {
            C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AdvancedPlaceOrderFragment$updateLimitByMarketData$1(this, c21668hHx, null), 3, null);
        }
    }

    public static /* synthetic */ void updateFiatTotal$default(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C21668hHx c21668hHx, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        advancedPlaceOrderFragment.OLrzqt(c21668hHx, str, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OLrzqt(C21668hHx c21668hHx, String str, boolean z) {
        boolean z2;
        String strCopydefault = djBIcL().gEmmrt().getValue().copydefault();
        if (str == null || str.length() == 0) {
            c21668hHx.valueOf.KWHzl();
            this.AYXKKw = false;
        }
        C55001xbh c55001xbhAhwBna = c21668hHx.djBIcL.AhwBna();
        if (c55001xbhAhwBna != null) {
            z2 = c55001xbhAhwBna.isFocused();
        }
        DexMultiTokenInfoBean value = AEQbTJ().ejfBZ().getValue();
        String tokenSymbol = value != null ? value.getTokenSymbol() : null;
        String strAEQbTJ = "";
        String str2 = tokenSymbol == null ? "" : tokenSymbol;
        DexMultiTokenInfoBean value2 = AEQbTJ().ejfBZ().getValue();
        int iAhwBna = C33129mqd.AhwBna(value2 != null ? value2.getDecimals() : null);
        if ((str == null || str.length() == 0 || C31194lpS.copydefault(str)) && !z2) {
            String strOLrzqt = C30565ldZ.OLrzqt(str, iAhwBna);
            C55001xbh c55001xbhAhwBna2 = c21668hHx.djBIcL.AhwBna();
            if (c55001xbhAhwBna2 != null) {
                c55001xbhAhwBna2.setPlainNumericText(strOLrzqt);
                c55001xbhAhwBna2.setSelection(0);
            }
        }
        if (this.EZpvd || this.AYXKKw) {
            return;
        }
        C23272hvB c23272hvB = C23272hvB.KWHzl;
        int precision = c23272hvB.OLrzqt().getPrecision();
        if (C33129mqd.OLrzqt((CharSequence) str) && C33129mqd.OLrzqt((CharSequence) strCopydefault) && C23313hvq.OLrzqt(strCopydefault, 0)) {
            String strMulS$default = C33129mqd.mulS$default(str, strCopydefault, Integer.valueOf(precision), null, null, 12, null);
            strAEQbTJ = c23272hvB.AEQbTJ(strMulS$default, String.valueOf(Math.min(C30565ldZ.KWHzl(strMulS$default), precision)));
        }
        String scientificCurrency$default = C23272hvB.formatScientificCurrency$default(c23272hvB, strAEQbTJ, false, null, false, false, false, false, null, true, false, 383, null);
        C55001xbh c55001xbhAhwBna3 = c21668hHx.AEQbTJ.AhwBna();
        if (c55001xbhAhwBna3 != null) {
            c55001xbhAhwBna3.setPlainNumericText(strAEQbTJ);
        }
        if (!z) {
            c21668hHx.djBIcL.AEQbTJ("≈" + scientificCurrency$default);
        }
        c21668hHx.AEQbTJ.AEQbTJ("≈" + C30565ldZ.OLrzqt(str, iAhwBna) + " " + str2);
    }

    public final void copydefault(C21668hHx c21668hHx, String str) {
        if (this.EZpvd) {
            String strCopydefault = djBIcL().gEmmrt().getValue().copydefault();
            if (C33129mqd.OLrzqt((CharSequence) str) && (strCopydefault.length() == 0 || C33129mqd.OLrzqt((Object) strCopydefault, (Object) 0))) {
                ActivityResultCaller parentFragment = getParentFragment();
                InterfaceC30601leI interfaceC30601leI = parentFragment instanceof InterfaceC30601leI ? (InterfaceC30601leI) parentFragment : null;
                if (interfaceC30601leI != null) {
                    interfaceC30601leI.KWHzl(InterfaceC30595leC.VoiceInteractor.KWHzl);
                }
            }
            DexMultiTokenInfoBean value = AEQbTJ().ejfBZ().getValue();
            String tokenSymbol = value != null ? value.getTokenSymbol() : null;
            String strOLrzqt = "";
            if (tokenSymbol == null) {
                tokenSymbol = "";
            }
            DexMultiTokenInfoBean value2 = AEQbTJ().ejfBZ().getValue();
            int iAhwBna = C33129mqd.AhwBna(value2 != null ? value2.getDecimals() : null);
            if (C33129mqd.OLrzqt((CharSequence) str) && C33129mqd.OLrzqt((CharSequence) strCopydefault) && C23313hvq.OLrzqt(strCopydefault, 0)) {
                strOLrzqt = C30565ldZ.OLrzqt(C33129mqd.divS$default(C33129mqd.divS$default(str, Double.valueOf(C23272hvB.KWHzl.OLrzqt().getUsdToThisRate()), null, null, null, 14, null), strCopydefault, null, null, null, 14, null), iAhwBna);
            }
            C55001xbh c55001xbhAhwBna = c21668hHx.djBIcL.AhwBna();
            if (c55001xbhAhwBna != null) {
                c55001xbhAhwBna.setPlainNumericText(strOLrzqt);
                c55001xbhAhwBna.setSelection(0);
            }
            c21668hHx.AEQbTJ.AEQbTJ("≈" + strOLrzqt + " " + tokenSymbol);
        }
    }

    public final void AEQbTJ(C21668hHx c21668hHx, AdvancedOrderType advancedOrderType) {
        c21668hHx.KWHzl.setText(OLrzqt(advancedOrderType));
        if (advancedOrderType == AdvancedOrderType.LIMIT && !C23317hvu.getFieldNames()) {
            KWHzl(InterfaceC30639leu.TaskDescription.EZpvd);
        }
        DbNXlk(c21668hHx);
    }

    public final void EZpvd(C21668hHx c21668hHx, AdvancedLimitBy advancedLimitBy) {
        c21668hHx.DbNXlk.OLrzqt(advancedLimitBy);
        DbNXlk(c21668hHx);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.ldZ.getFmtSymbol$default(java.lang.String, int, int, java.lang.Object):java.lang.String */
    public final void fetchVPNInfo(C21668hHx c21668hHx) {
        String strCopydefault;
        DexMultiTokenInfoBean dexMultiTokenInfoBeanDbNXlk = AEQbTJ().DbNXlk();
        String tokenSymbol = dexMultiTokenInfoBeanDbNXlk != null ? dexMultiTokenInfoBeanDbNXlk.getTokenSymbol() : null;
        if (tokenSymbol == null) {
            tokenSymbol = "";
        }
        String fmtSymbol$default = C30565ldZ.getFmtSymbol$default(tokenSymbol, 0, 1, null);
        TextView textView = c21668hHx.AYXKKw;
        if (AEQbTJ().DTwDnp().getValue() == AdvancedTradeType.BUY) {
            strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.MediaMetadataCompatRatingKey, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", fmtSymbol$default)));
        } else {
            strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.MediaMetadataCompatLongKey, C56423yEv.EZpvd(C56390yDp.OLrzqt("token", fmtSymbol$default)));
        }
        textView.setText(strCopydefault);
    }

    public final void djBIcL(C21668hHx c21668hHx) {
        AYXKKw().KWHzl();
        c21668hHx.gEmmrt.AEQbTJ(new Function0() { // from class: o.lgv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderFragment.ejfBZ(this.KWHzl);
            }
        }, new Function0() { // from class: o.lgu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return AdvancedPlaceOrderFragment.getFieldNames(this.EZpvd);
            }
        });
        c21668hHx.gEmmrt.copydefault(AEQbTJ().DTwDnp().getValue());
    }

    public static final Unit ejfBZ(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        advancedPlaceOrderFragment.zsXlph();
        advancedPlaceOrderFragment.AYXKKw().copydefault(advancedPlaceOrderFragment.valueOf);
        advancedPlaceOrderFragment.AEQbTJ().AEQbTJ(AdvancedTradeType.BUY);
        return Unit.INSTANCE;
    }

    public static final Unit getFieldNames(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        advancedPlaceOrderFragment.zsXlph();
        advancedPlaceOrderFragment.AYXKKw().copydefault(advancedPlaceOrderFragment.gEmmrt);
        advancedPlaceOrderFragment.AEQbTJ().AEQbTJ(AdvancedTradeType.SELL);
        return Unit.INSTANCE;
    }

    public final void valueOf(C21668hHx c21668hHx) {
        ConstraintLayout constraintLayout = c21668hHx.fetchVPNInfo;
        constraintLayout.setOnClickListener(new ActionBar(constraintLayout, 1000L, this));
        ImageView imageView = c21668hHx.isConnected;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
    }

    public final void AYXKKw(C21668hHx c21668hHx) {
        ConstraintLayout constraintLayout = c21668hHx.values;
        constraintLayout.setOnClickListener(new TaskDescription(constraintLayout, 1000L, this));
    }

    public static final class FragmentManager implements Function1<UIPricingToken, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(UIPricingToken uIPricingToken) {
            EZpvd(uIPricingToken);
            return Unit.INSTANCE;
        }

        public final void EZpvd(UIPricingToken uIPricingToken) {
            Intrinsics.checkNotNullParameter(uIPricingToken, "");
            AdvancedPlaceOrderVM.onQuoteTokenChange$default(AdvancedPlaceOrderFragment.this.AEQbTJ(), uIPricingToken, false, 2, null);
        }
    }

    public final void KWHzl(final C21668hHx c21668hHx) {
        final C30755lhD c30755lhD = c21668hHx.DbNXlk;
        c30755lhD.setCallback$OKDex_dex_impl(this);
        final C55001xbh c55001xbhAhwBna = c30755lhD.AhwBna();
        if (c55001xbhAhwBna != null) {
            C31194lpS.onTextChanged$default(c55001xbhAhwBna, LifecycleOwnerKt.getLifecycleScope(this), 0L, new Function1() { // from class: o.lgi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedPlaceOrderFragment.AEQbTJ(this.OLrzqt, c55001xbhAhwBna, c30755lhD, (java.lang.String) obj);
                }
            }, 2, null);
            c55001xbhAhwBna.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lgf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AdvancedPlaceOrderFragment.EZpvd(c30755lhD, this, view, z);
                }
            });
            int i = Activity.AEQbTJ[AEQbTJ().DTwDnp().getValue().ordinal()];
            if (i == 1) {
                AYXKKw().copydefault(this.valueOf);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AYXKKw().copydefault(this.gEmmrt);
            }
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            new C54978xbK(fragmentActivityRequireActivity, AYXKKw(), getViewLifecycleOwner()).copydefault(yEE.gEmmrt(c55001xbhAhwBna));
        }
        AYXKKw().setPriceCallback(new Function2() { // from class: o.lgh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AdvancedPlaceOrderFragment.AEQbTJ(c21668hHx, this, (java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
    }

    public static final Unit AEQbTJ(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C55001xbh c55001xbh, C30755lhD c30755lhD, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        advancedPlaceOrderFragment.AEQbTJ().EZpvd(str);
        advancedPlaceOrderFragment.djBIcL = c55001xbh.isFocused();
        c30755lhD.OLrzqt(c55001xbh.isFocused());
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C30755lhD c30755lhD, AdvancedPlaceOrderFragment advancedPlaceOrderFragment, View view, boolean z) {
        c30755lhD.OLrzqt(z);
        advancedPlaceOrderFragment.EZpvd = z;
        if (z) {
            return;
        }
        C33570myu.copydefault((android.app.Activity) advancedPlaceOrderFragment.requireActivity());
    }

    public static final Unit AEQbTJ(C21668hHx c21668hHx, AdvancedPlaceOrderFragment advancedPlaceOrderFragment, String str, int i) {
        String strCopydefault;
        Intrinsics.checkNotNullParameter(str, "");
        AppCompatTextView appCompatTextViewGEmmrt = c21668hHx.DbNXlk.gEmmrt();
        Object tag = appCompatTextViewGEmmrt != null ? appCompatTextViewGEmmrt.getTag() : null;
        Intrinsics.copydefault(tag, "");
        int i2 = Activity.copydefault[((AdvancedLimitBy) tag).ordinal()];
        if (i2 == 1) {
            strCopydefault = advancedPlaceOrderFragment.djBIcL().djBIcL().getValue().copydefault();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strCopydefault = advancedPlaceOrderFragment.djBIcL().djBIcL().getValue().EZpvd();
        }
        String str2 = strCopydefault;
        if (str2.length() == 0 || C33129mqd.OLrzqt(str2, "--")) {
            return Unit.INSTANCE;
        }
        String strMulS$default = C33129mqd.mulS$default(str2, C33129mqd.addS$default(1, str, null, null, null, 14, null), null, null, null, 14, null);
        C55001xbh c55001xbhAhwBna = c21668hHx.DbNXlk.AhwBna();
        if (c55001xbhAhwBna != null) {
            c55001xbhAhwBna.setPlainNumericText(C23272hvB.KWHzl.AEQbTJ(strMulS$default, String.valueOf(C30565ldZ.KWHzl(strMulS$default))));
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.hcu.setWindowSoftInput$default(androidx.fragment.app.Fragment, android.view.View, java.lang.Integer, android.view.View, int, int, java.lang.Object):void */
    public final void AEQbTJ(final C21668hHx c21668hHx) {
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        AdvancedMainFragment advancedMainFragment = parentFragment instanceof AdvancedMainFragment ? (AdvancedMainFragment) parentFragment : null;
        NestedScrollView nestedScrollViewFetchVPNInfo = advancedMainFragment != null ? advancedMainFragment.fetchVPNInfo() : null;
        final C30795lhr c30795lhr = c21668hHx.djBIcL;
        c30795lhr.setCallback$OKDex_dex_impl(this);
        final C55001xbh c55001xbhAhwBna = c30795lhr.AhwBna();
        if (c55001xbhAhwBna != null) {
            C31194lpS.EZpvd(c55001xbhAhwBna, LifecycleOwnerKt.getLifecycleScope(this), 10L, new Function1() { // from class: o.lgm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedPlaceOrderFragment.OLrzqt(this.copydefault, c55001xbhAhwBna, c21668hHx, c30795lhr, (java.lang.String) obj);
                }
            });
            c55001xbhAhwBna.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lgk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AdvancedPlaceOrderFragment.OLrzqt(c30795lhr, this, view, z);
                }
            });
            C22310hcu.setWindowSoftInput$default(this, c55001xbhAhwBna, nestedScrollViewFetchVPNInfo != null ? Integer.valueOf(nestedScrollViewFetchVPNInfo.getId()) : null, c55001xbhAhwBna, 0, 8, (Object) null);
        }
    }

    public static final Unit OLrzqt(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C55001xbh c55001xbh, C21668hHx c21668hHx, C30795lhr c30795lhr, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        advancedPlaceOrderFragment.AEQbTJ().AEQbTJ(str);
        if (c55001xbh.isFocused()) {
            c21668hHx.valueOf.copydefault();
        }
        c30795lhr.OLrzqt(c55001xbh.isFocused());
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(C30795lhr c30795lhr, AdvancedPlaceOrderFragment advancedPlaceOrderFragment, View view, boolean z) {
        c30795lhr.OLrzqt(z);
        if (z) {
            advancedPlaceOrderFragment.AYXKKw = false;
            InterfaceC30608leP.ActionBar.trackEvent$default(advancedPlaceOrderFragment, AbstractC30561ldV.Application.copydefault, null, 2, null);
        }
    }

    public final void copydefault(final C21668hHx c21668hHx) {
        final C30800lhw c30800lhw = c21668hHx.AEQbTJ;
        c30800lhw.setCallback$OKDex_dex_impl(this);
        final C55001xbh c55001xbhAhwBna = c30800lhw.AhwBna();
        if (c55001xbhAhwBna != null) {
            C31194lpS.EZpvd(c55001xbhAhwBna, LifecycleOwnerKt.getLifecycleScope(this), 10L, new Function1() { // from class: o.lgj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return AdvancedPlaceOrderFragment.OLrzqt(this.KWHzl, c55001xbhAhwBna, c21668hHx, c30800lhw, (java.lang.String) obj);
                }
            });
            c55001xbhAhwBna.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o.lgl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(android.view.View view, boolean z) {
                    AdvancedPlaceOrderFragment.copydefault(c30800lhw, this, view, z);
                }
            });
        }
    }

    public static final Unit OLrzqt(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C55001xbh c55001xbh, C21668hHx c21668hHx, C30800lhw c30800lhw, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        advancedPlaceOrderFragment.AYXKKw = c55001xbh.isFocused();
        if (c55001xbh.isFocused()) {
            c21668hHx.valueOf.copydefault();
        }
        advancedPlaceOrderFragment.AEQbTJ().AhwBna(str);
        c30800lhw.OLrzqt(c55001xbh.isFocused());
        return Unit.INSTANCE;
    }

    public static final void copydefault(C30800lhw c30800lhw, AdvancedPlaceOrderFragment advancedPlaceOrderFragment, View view, boolean z) {
        c30800lhw.OLrzqt(z);
        advancedPlaceOrderFragment.EZpvd = z;
        if (!z) {
            C33570myu.copydefault((android.app.Activity) advancedPlaceOrderFragment.requireActivity());
        }
        if (z) {
            InterfaceC30608leP.ActionBar.trackEvent$default(advancedPlaceOrderFragment, AbstractC30561ldV.Dialog.copydefault, null, 2, null);
        }
    }

    public final void gEmmrt(C21668hHx c21668hHx) {
        c21668hHx.valueOf.setOnPercentChange(EZpvd());
    }

    public final void EZpvd(C21668hHx c21668hHx) {
        C30757lhF c30757lhF = c21668hHx.EZpvd;
        c30757lhF.valueOf();
        c30757lhF.setCallback$OKDex_dex_impl(this);
    }

    public final void AhwBna(C21668hHx c21668hHx) {
        c21668hHx.AhwBna.setContentDescription("web3_dex_trade_submit_button");
        c21668hHx.AhwBna.setCallback$OKDex_dex_impl(this);
    }

    public final void OLrzqt(final C21668hHx c21668hHx) {
        c21668hHx.OLrzqt.setOnAutoSellCheckboxClickListener(new View.OnClickListener() { // from class: o.lgt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AdvancedPlaceOrderFragment.OLrzqt(this.OLrzqt, c21668hHx, view);
            }
        });
        c21668hHx.OLrzqt.setOnEditButtonClickListener(new View.OnClickListener() { // from class: o.lgx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                AdvancedPlaceOrderFragment.AEQbTJ(this.AEQbTJ, view);
            }
        });
        Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle$default(AEQbTJ().djBIcL(), getViewLifecycleOwner().getLifecycle(), null, 2, null), new AdvancedPlaceOrderFragment$buildAutoSellInputView$3(c21668hHx, this, null));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        FlowKt.launchIn(flowOnEach, LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner));
    }

    public static final void OLrzqt(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, C21668hHx c21668hHx, View view) {
        InterfaceC30608leP.ActionBar.trackEvent$default(advancedPlaceOrderFragment, AbstractC30561ldV.StateListAnimator.OLrzqt, null, 2, null);
        if (!c21668hHx.OLrzqt.copydefault()) {
            LifecycleOwner viewLifecycleOwner = advancedPlaceOrderFragment.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AdvancedPlaceOrderFragment$buildAutoSellInputView$1$1(advancedPlaceOrderFragment, null), 3, null);
            return;
        }
        AdvancedPlaceOrderVM.updateAutoSell$default(advancedPlaceOrderFragment.AEQbTJ(), AbstractC30503lcQ.Activity.AEQbTJ, false, 2, null);
    }

    public static final void AEQbTJ(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, View view) {
        InterfaceC30608leP.ActionBar.trackEvent$default(advancedPlaceOrderFragment, AbstractC30561ldV.ActionBar.copydefault, null, 2, null);
        LifecycleOwner viewLifecycleOwner = advancedPlaceOrderFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AdvancedPlaceOrderFragment$buildAutoSellInputView$2$1(advancedPlaceOrderFragment, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object openAutoSellStrategySetupActivity$default(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, List list, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            list = yDY.AhwBna();
        }
        return advancedPlaceOrderFragment.EZpvd((List<? extends AdvancedAutoSellStrategy>) list, (Continuation<? super Unit>) continuation);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void zsXlph() {
        C30755lhD c30755lhD;
        C55001xbh c55001xbhAhwBna;
        C30800lhw c30800lhw;
        C55001xbh c55001xbhAhwBna2;
        C30795lhr c30795lhr;
        C55001xbh c55001xbhAhwBna3;
        C21668hHx c21668hHx = (C21668hHx) fARcdN();
        if (c21668hHx != null && (c30795lhr = c21668hHx.djBIcL) != null && (c55001xbhAhwBna3 = c30795lhr.AhwBna()) != null) {
            c55001xbhAhwBna3.clearFocus();
        }
        C21668hHx c21668hHx2 = (C21668hHx) fARcdN();
        if (c21668hHx2 != null && (c30800lhw = c21668hHx2.AEQbTJ) != null && (c55001xbhAhwBna2 = c30800lhw.AhwBna()) != null) {
            c55001xbhAhwBna2.clearFocus();
        }
        C21668hHx c21668hHx3 = (C21668hHx) fARcdN();
        if (c21668hHx3 != null && (c30755lhD = c21668hHx3.DbNXlk) != null && (c55001xbhAhwBna = c30755lhD.AhwBna()) != null) {
            c55001xbhAhwBna.clearFocus();
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        C21668hHx c21668hHx4 = (C21668hHx) fARcdN();
        C33570myu.AEQbTJ(fragmentActivityRequireActivity, c21668hHx4 != null ? c21668hHx4.djBIcL : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wlaJM() {
        FragmentActivity activity;
        if (!C22416heu.fIwbmz() || AEQbTJ().djSkpj() || AEQbTJ().QUSxYX() || !kTV.Companion.EZpvd() || (activity = getActivity()) == null) {
            return;
        }
        activity.startActivity(kTF.Companion.KWHzl(activity, AutoConfirmEntryType.MARKET, "txn_popup"));
    }

    public final String OLrzqt(AdvancedOrderType advancedOrderType) {
        int i = Activity.KWHzl[advancedOrderType.ordinal()];
        return C33070mpX.AYXKKw((i == 1 || i != 2) ? C23274hvD.Fragment.update : C23274hvD.Fragment.MediaSessionCompatMediaSessionImplBase1);
    }

    public final void AhwBna() {
        if (this.values == null) {
            Function0 function0 = new Function0() { // from class: o.lfZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AdvancedPlaceOrderFragment.AuCTelauCTel(this.copydefault);
                }
            };
            StateFlow<DexMultiTokenInfoBean> stateFlowAEQbTJ = AubY().AEQbTJ();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            this.values = new C22904hoE<>(function0, stateFlowAEQbTJ, viewLifecycleOwner, new Function0() { // from class: o.lga
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return AdvancedPlaceOrderFragment.zLjUOn(this.AEQbTJ);
                }
            });
        }
    }

    public static final String AuCTelauCTel(AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        return advancedPlaceOrderFragment.AEQbTJ().values();
    }

    public static final Unit zLjUOn(final AdvancedPlaceOrderFragment advancedPlaceOrderFragment) {
        advancedPlaceOrderFragment.AEQbTJ().KWHzl(new Function2() { // from class: o.lgd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AdvancedPlaceOrderFragment.copydefault(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue(), (java.lang.String) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AdvancedPlaceOrderFragment advancedPlaceOrderFragment, boolean z, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            advancedPlaceOrderFragment.AEQbTJ().djBIcL(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C21668hHx c21668hHx = (C21668hHx) fARcdN();
        if (c21668hHx != null) {
            c21668hHx.djBIcL.setCallback$OKDex_dex_impl(null);
            c21668hHx.AEQbTJ.setCallback$OKDex_dex_impl(null);
            c21668hHx.AhwBna.setCallback$OKDex_dex_impl(null);
            c21668hHx.EZpvd.setCallback$OKDex_dex_impl(null);
            c21668hHx.DbNXlk.setCallback$OKDex_dex_impl(null);
            c21668hHx.OLrzqt.setOnAutoSellTextClickListener(null);
            c21668hHx.OLrzqt.setOnAutoSellCheckboxClickListener(null);
            c21668hHx.OLrzqt.setOnEditButtonClickListener(null);
            c21668hHx.valueOf.setOnPercentChange(null);
            C55001xbh c55001xbhAhwBna = c21668hHx.djBIcL.AhwBna();
            if (c55001xbhAhwBna != null) {
                c55001xbhAhwBna.setOnFocusChangeListener(null);
            }
            C55001xbh c55001xbhAhwBna2 = c21668hHx.AEQbTJ.AhwBna();
            if (c55001xbhAhwBna2 != null) {
                c55001xbhAhwBna2.setOnFocusChangeListener(null);
            }
            C55001xbh c55001xbhAhwBna3 = c21668hHx.DbNXlk.AhwBna();
            if (c55001xbhAhwBna3 != null) {
                c55001xbhAhwBna3.setOnFocusChangeListener(null);
            }
            c21668hHx.fetchVPNInfo.setOnClickListener(null);
            c21668hHx.isConnected.setOnClickListener(null);
        }
        AYXKKw().setPriceCallback(new Function2() { // from class: o.lgg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return AdvancedPlaceOrderFragment.AEQbTJ((java.lang.String) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        AEQbTJ().fetchVPNInfo().removeObservers(this);
        InterfaceC58217yxC interfaceC58217yxC = this.iwGUEr;
        if (interfaceC58217yxC != null) {
            interfaceC58217yxC.dispose();
        }
        this.iwGUEr = null;
        this.AEQbTJ.dispose();
        this.values = null;
        super.onDestroyView();
    }

    public static final Unit AEQbTJ(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object EZpvd(final List<? extends AdvancedAutoSellStrategy> list, Continuation<? super Unit> continuation) {
        Lifecycle lifecycle = getLifecycle();
        Lifecycle.State state = Lifecycle.State.STARTED;
        MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
        boolean zIsDispatchNeeded = immediate.isDispatchNeeded(continuation.getContext());
        if (!zIsDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                android.content.Intent intent = new android.content.Intent(requireActivity(), (Class<?>) ActivityC30497lcK.class);
                intent.putParcelableArrayListExtra("strategies", new ArrayList<>(list));
                intent.putExtra("business_type", "advanced");
                this.AuCTel.launch(intent);
                Unit unit = Unit.INSTANCE;
            }
        } else {
            Object objSuspendWithStateAtLeastUnchecked = WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(lifecycle, state, zIsDispatchNeeded, immediate, new Function0<Unit>() { // from class: com.okinc.business.trade.features.home.ui.cefi.placeorder.AdvancedPlaceOrderFragment$openAutoSellStrategySetupActivity$$inlined$withStarted$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    Intent intent2 = new Intent(this.this$0.requireActivity(), (Class<?>) ActivityC30497lcK.class);
                    intent2.putParcelableArrayListExtra("strategies", new ArrayList<>(list));
                    intent2.putExtra("business_type", "advanced");
                    this.this$0.AuCTel.launch(intent2);
                    return Unit.INSTANCE;
                }
            }, continuation);
            if (objSuspendWithStateAtLeastUnchecked == C56442yFn.copydefault()) {
                return objSuspendWithStateAtLeastUnchecked;
            }
        }
        return Unit.INSTANCE;
    }
}

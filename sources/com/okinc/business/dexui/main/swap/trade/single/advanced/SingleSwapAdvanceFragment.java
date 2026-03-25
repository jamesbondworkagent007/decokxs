package com.okinc.business.dexui.main.swap.trade.single.advanced;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.bean.track.TrackOrderType;
import com.okinc.business.dexlogic.bean.track.TrackTransactionDirection;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexui.main.limitorder.LimitOrderFragment;
import com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.rxutils.RxBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import o.AbstractC22407hel;
import o.AbstractC24861iln;
import o.AbstractC58185ywX;
import o.C19818gQl;
import o.C21501hBs;
import o.C22002hUg;
import o.C22281hcR;
import o.C22372heC;
import o.C22380heK;
import o.C22831hml;
import o.C23274hvD;
import o.C25295ity;
import o.C25382ivf;
import o.C25452iww;
import o.C28242kUd;
import o.C30393laM;
import o.C31200lpY;
import o.C33070mpX;
import o.C52761wXj;
import o.C55249xgQ;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56424yEw;
import o.C56442yFn;
import o.C56524yIo;
import o.C58156yvv;
import o.C59405zgS;
import o.InterfaceC19811gQe;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC58227yxM;
import o.InterfaceC58229yxO;
import o.InterfaceC60096zvd;
import o.InterfaceC9738bbJ;
import o.rVN;
import o.xXO;
import o.yCM;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SingleSwapAdvanceFragment extends AbstractC24861iln<C21501hBs> implements InterfaceC19811gQe {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public LimitParam AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;

    @yCM
    public C25452iww handleSwapEventTrackUtils;
    public final boolean valueOf;

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.hTH, o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.DPHsZd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21501hBs valueOf(SingleSwapAdvanceFragment singleSwapAdvanceFragment) {
        return (C21501hBs) singleSwapAdvanceFragment.fARcdN();
    }

    public SingleSwapAdvanceFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderAndPositionEventViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$5
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.ilx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SingleSwapAdvanceFragment.AkhnZx(this.copydefault);
            }
        });
        final Function0 function03 = new Function0() { // from class: o.ilv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SingleSwapAdvanceFragment.values(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$6
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$special$$inlined$viewModels$default$9
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
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.ilE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return SingleSwapAdvanceFragment.fJNWhG(this.copydefault);
            }
        });
        this.valueOf = true;
    }

    public final C25452iww AYXKKw() {
        C25452iww c25452iww = this.handleSwapEventTrackUtils;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public OrderAndPositionEventViewModel gEmmrt() {
        return (OrderAndPositionEventViewModel) this.DbNXlk.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Possible override for method o.iln.KWHzl()V */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.InterfaceC19811gQe
    public ViewPager2 KWHzl() {
        C21501hBs c21501hBs = (C21501hBs) fARcdN();
        if (c21501hBs != null) {
            return c21501hBs.copydefault;
        }
        return null;
    }

    @Override // o.InterfaceC19811gQe
    public C19818gQl OLrzqt() {
        return AhwBna();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ SingleSwapAdvanceFragment newInstance$default(StateListAnimator stateListAnimator, String str, TradeParam tradeParam, int i, Object obj) {
            if ((i & 2) != 0) {
                tradeParam = null;
            }
            return stateListAnimator.AEQbTJ(str, tradeParam);
        }

        public final SingleSwapAdvanceFragment AEQbTJ(@NotNull String str, TradeParam tradeParam) {
            Intrinsics.checkNotNullParameter(str, "");
            SingleSwapAdvanceFragment singleSwapAdvanceFragment = new SingleSwapAdvanceFragment();
            Bundle bundle = new Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("trade_data", tradeParam);
            singleSwapAdvanceFragment.setArguments(bundle);
            return singleSwapAdvanceFragment;
        }
    }

    public static final class ActionBar {
        public final String EZpvd;
        public final String KWHzl;
        public final String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String KWHzl() {
            return this.KWHzl;
        }

        public ActionBar(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            this.EZpvd = str;
            this.copydefault = str2;
            this.KWHzl = str3;
        }
    }

    public static final class TaskDescription implements ViewModelProvider.Factory {
        public TaskDescription() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C22831hml(SingleSwapAdvanceFragment.this.AuCTel());
        }
    }

    public final C22831hml djBIcL() {
        return (C22831hml) this.AhwBna.getValue();
    }

    public static final C22831hml AkhnZx(SingleSwapAdvanceFragment singleSwapAdvanceFragment) {
        return (C22831hml) new ViewModelProvider(singleSwapAdvanceFragment, singleSwapAdvanceFragment.new TaskDescription()).get(C22831hml.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DexHomeViewModel fJNWhG() {
        return (DexHomeViewModel) this.gEmmrt.getValue();
    }

    public static final ViewModelStoreOwner values(SingleSwapAdvanceFragment singleSwapAdvanceFragment) {
        Object next;
        Intrinsics.copydefault(singleSwapAdvanceFragment, "");
        Iterator it = C59405zgS.EZpvd(singleSwapAdvanceFragment, (Function1<? super SingleSwapAdvanceFragment, ? extends SingleSwapAdvanceFragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.ilz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.AEQbTJ((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Fragment) next) instanceof DexHomeFragment) {
                break;
            }
        }
        Fragment fragment = (Fragment) next;
        if (fragment != null) {
            return fragment;
        }
        FragmentActivity fragmentActivityRequireActivity = singleSwapAdvanceFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Fragment AEQbTJ(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    private final List<ActionBar> iwGUEr() {
        return (List) this.fetchVPNInfo.getValue();
    }

    public static final ArrayList fJNWhG(SingleSwapAdvanceFragment singleSwapAdvanceFragment) {
        ArrayList arrayListCopydefault = yDY.copydefault(new ActionBar(C33070mpX.AYXKKw(C23274hvD.Fragment.setIconUri), "swap", "web3_dex_advance_mode_segment_market"));
        if (singleSwapAdvanceFragment.djBIcL().gEmmrt()) {
            arrayListCopydefault.add(new ActionBar(C33070mpX.AYXKKw(C23274hvD.Fragment.setExtras), TabTitleInfo.KEY_LIMIT_ORDER, "web3_dex_advance_mode_segment_limit"));
        }
        return arrayListCopydefault;
    }

    @Override // o.hTH, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        djBIcL().AYXKKw();
        hDKMBd();
        view.post(new Runnable() { // from class: o.ilw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                SingleSwapAdvanceFragment.isConnected(this.AEQbTJ);
            }
        });
    }

    public static final void isConnected(SingleSwapAdvanceFragment singleSwapAdvanceFragment) {
        rVN.reportFullyDrawn$default((Fragment) singleSwapAdvanceFragment, true, (String) null, 2, (Object) null);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void hDKMBd() {
        C21501hBs c21501hBs = (C21501hBs) fARcdN();
        if (c21501hBs != null) {
            for (ActionBar actionBar : iwGUEr()) {
                C55249xgQ c55249xgQ = c21501hBs.EZpvd;
                c55249xgQ.addTab(c55249xgQ.newTab().setText(actionBar.AEQbTJ()).setContentDescription(actionBar.KWHzl()));
            }
            C55249xgQ c55249xgQ2 = c21501hBs.EZpvd;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c55249xgQ2.KWHzl(C25382ivf.KWHzl(contextRequireContext, C52761wXj.Activity.fdOvFl));
            C55249xgQ c55249xgQ3 = c21501hBs.EZpvd;
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            c55249xgQ3.KWHzl(C25382ivf.OLrzqt(contextRequireContext2, C23274hvD.StateListAnimator.RJOkX));
            C55249xgQ c55249xgQ4 = c21501hBs.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ4, "");
            c55249xgQ4.setVisibility(djBIcL().gEmmrt() ? 0 : 8);
        }
        djBIcL().OLrzqt("swap");
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21501hBs OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21501hBs c21501hBsOLrzqt = C21501hBs.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21501hBsOLrzqt, "");
        return c21501hBsOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21501hBs c21501hBs, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21501hBs, "");
        c21501hBs.getRoot().setStickyVisible(false);
        C22380heK.OLrzqt.copydefault(AuCTel()).fetchVPNInfo().KWHzl(0);
        fJNWhG().copydefault(0);
        if (bundle == null) {
            getChildFragmentManager().beginTransaction().replace(c21501hBs.OLrzqt.getId(), OrderAndPositionTabComponentFragment.Companion.EZpvd()).commitAllowingStateLoss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        C55249xgQ c55249xgQ;
        C55249xgQ c55249xgQ2;
        C22281hcR root;
        super.setListener();
        C21501hBs c21501hBs = (C21501hBs) fARcdN();
        if (c21501hBs != null && (root = c21501hBs.getRoot()) != null) {
            root.setOnRefreshListener(new Function0() { // from class: o.ilt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return SingleSwapAdvanceFragment.fetchVPNInfo(this.AEQbTJ);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass4(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass5(null), 3, null);
        C21501hBs c21501hBs2 = (C21501hBs) fARcdN();
        if (c21501hBs2 != null && (c55249xgQ2 = c21501hBs2.EZpvd) != null) {
            c55249xgQ2.clearOnTabSelectedListeners();
        }
        C21501hBs c21501hBs3 = (C21501hBs) fARcdN();
        if (c21501hBs3 != null && (c55249xgQ = c21501hBs3.EZpvd) != null) {
            c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Application());
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, this);
        final Function1 function1 = new Function1() { // from class: o.ilD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.EZpvd(this.KWHzl, (xXO) obj);
            }
        };
        AbstractC58185ywX abstractC58185ywXKWHzl2 = abstractC58185ywXEZpvd.KWHzl(new InterfaceC58229yxO() { // from class: o.ilB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58229yxO
            public final java.lang.Object apply(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.AhwBna(function1, obj);
            }
        });
        final Function1 function12 = new Function1() { // from class: o.ilI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.EZpvd(this.AEQbTJ, (InterfaceC9738bbJ) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ilF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SingleSwapAdvanceFragment.gEmmrt(function12, obj);
            }
        };
        final Function1 function13 = new Function1() { // from class: o.ilG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXKWHzl2.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ilJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SingleSwapAdvanceFragment.valueOf(function13, obj);
            }
        });
        AbstractC58185ywX abstractC58185ywXKWHzl3 = RxBus.KWHzl(C22002hUg.class, new String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl3, "");
        AbstractC58185ywX abstractC58185ywXEZpvd2 = C58156yvv.EZpvd(abstractC58185ywXKWHzl3, this);
        final Function1 function14 = new Function1() { // from class: o.ilq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.KWHzl(this.OLrzqt, (C22002hUg) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM2 = new InterfaceC58227yxM() { // from class: o.ilr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SingleSwapAdvanceFragment.AYXKKw(function14, obj);
            }
        };
        final Function1 function15 = new Function1() { // from class: o.ils
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.copydefault((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd2.AEQbTJ(interfaceC58227yxM2, new InterfaceC58227yxM() { // from class: o.ilu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                SingleSwapAdvanceFragment.djBIcL(function15, obj);
            }
        });
        C22380heK c22380heK = C22380heK.OLrzqt;
        c22380heK.copydefault(AuCTel()).EZpvd(true).valueOf().observe(this, new Activity(new Function1() { // from class: o.ilC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.KWHzl(this.EZpvd, (TradeParam) obj);
            }
        }));
        c22380heK.copydefault(AuCTel()).AhwBna().OLrzqt().observe(this, new Activity(new Function1() { // from class: o.ilA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return SingleSwapAdvanceFragment.copydefault(this.OLrzqt, (LimitParam) obj);
            }
        }));
    }

    public static final Unit fetchVPNInfo(SingleSwapAdvanceFragment singleSwapAdvanceFragment) {
        singleSwapAdvanceFragment.gEmmrt().fetchVPNInfo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$setListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingleSwapAdvanceFragment.this.new AnonymousClass2(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Unit> sharedFlowDjBIcL = SingleSwapAdvanceFragment.this.gEmmrt().djBIcL();
                final SingleSwapAdvanceFragment singleSwapAdvanceFragment = SingleSwapAdvanceFragment.this;
                FlowCollector<? super Unit> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment.setListener.2.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        C22281hcR root;
                        C21501hBs c21501hBsValueOf = SingleSwapAdvanceFragment.valueOf(singleSwapAdvanceFragment);
                        if (c21501hBsValueOf != null && (root = c21501hBsValueOf.getRoot()) != null) {
                            root.KWHzl();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowDjBIcL.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$setListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingleSwapAdvanceFragment.this.new AnonymousClass3(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Unit> sharedFlowAYXKKw = SingleSwapAdvanceFragment.this.gEmmrt().AYXKKw();
                final SingleSwapAdvanceFragment singleSwapAdvanceFragment = SingleSwapAdvanceFragment.this;
                FlowCollector<? super Unit> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment.setListener.3.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        C22281hcR root;
                        NestedScrollView nestedScrollViewAYXKKw;
                        C21501hBs c21501hBsValueOf = SingleSwapAdvanceFragment.valueOf(singleSwapAdvanceFragment);
                        if (c21501hBsValueOf != null && (root = c21501hBsValueOf.getRoot()) != null && (nestedScrollViewAYXKKw = root.AYXKKw()) != null) {
                            nestedScrollViewAYXKKw.scrollTo(0, 0);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowAYXKKw.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$setListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingleSwapAdvanceFragment.this.new AnonymousClass4(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Boolean> sharedFlowCopydefault = SingleSwapAdvanceFragment.this.djBIcL().copydefault();
                final SingleSwapAdvanceFragment singleSwapAdvanceFragment = SingleSwapAdvanceFragment.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment.setListener.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return KWHzl(((Boolean) obj2).booleanValue(), continuation);
                    }

                    public final Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
                        C22281hcR root;
                        C21501hBs c21501hBsValueOf = SingleSwapAdvanceFragment.valueOf(singleSwapAdvanceFragment);
                        if (c21501hBsValueOf != null && (root = c21501hBsValueOf.getRoot()) != null) {
                            root.setStickyVisible(z);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment$setListener$5, reason: invalid class name */
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass5(Continuation<? super AnonymousClass5> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SingleSwapAdvanceFragment.this.new AnonymousClass5(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Unit> sharedFlowAYXKKw = SingleSwapAdvanceFragment.this.gEmmrt().AYXKKw();
                final SingleSwapAdvanceFragment singleSwapAdvanceFragment = SingleSwapAdvanceFragment.this;
                FlowCollector<? super Unit> flowCollector = new FlowCollector() { // from class: com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment.setListener.5.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
                        C22281hcR root;
                        NestedScrollView nestedScrollViewAYXKKw;
                        C21501hBs c21501hBsValueOf = SingleSwapAdvanceFragment.valueOf(singleSwapAdvanceFragment);
                        if (c21501hBsValueOf != null && (root = c21501hBsValueOf.getRoot()) != null && (nestedScrollViewAYXKKw = root.AYXKKw()) != null) {
                            nestedScrollViewAYXKKw.scrollTo(0, 0);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowAYXKKw.collect(flowCollector, this) == objCopydefault) {
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

    public static final class Application implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            String value;
            String value2;
            String str;
            String buttonName;
            Intrinsics.checkNotNullParameter(tab, "");
            if (tab.getPosition() == 0) {
                SingleSwapAdvanceFragment.this.isConnected();
                value = DexTrackEventParameter.ButtonName.LIMIT.getValue();
                value2 = DexTrackEventParameter.ButtonName.TAB_SWAP.getValue();
                str = "swap";
            } else {
                SingleSwapAdvanceFragment.this.AkhnZx();
                value = DexTrackEventParameter.ButtonName.SWAP.getValue();
                value2 = DexTrackEventParameter.ButtonName.TAB_LIMIT.getValue();
                str = "limit";
            }
            SingleSwapAdvanceFragment.this.OLrzqt(value, value2, str);
            SingleSwapAdvanceFragment.this.fJNWhG().EZpvd(tab.getPosition());
            C25452iww c25452iwwAYXKKw = SingleSwapAdvanceFragment.this.AYXKKw();
            String pageName = EventPageNameType.SWAP.getPageName();
            DexMultiTokenInfoBean dexMultiTokenInfoBeanAEQbTJ = C22380heK.OLrzqt.copydefault(SingleSwapAdvanceFragment.this.AuCTel()).fJNWhG().AEQbTJ();
            String chainId = dexMultiTokenInfoBeanAEQbTJ != null ? dexMultiTokenInfoBeanAEQbTJ.getChainId() : null;
            String str2 = chainId == null ? "" : chainId;
            String value3 = BusinessType.SWAP.getValue();
            String value4 = TrackTransactionDirection.NA.getValue();
            String type = TrackOrderType.SWAP.getType();
            Pair[] pairArr = new Pair[2];
            pairArr[0] = C56390yDp.OLrzqt("button_type", ButtonType.OTHERS.getType());
            if (tab.getPosition() == 0) {
                buttonName = TrackButtonName.MARKET_TAB.getButtonName();
            } else {
                buttonName = TrackButtonName.LIMIT_TAB.getButtonName();
            }
            pairArr[1] = C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, buttonName);
            c25452iwwAYXKKw.OLrzqt(new AbstractC22407hel.ActionBar(str2, pageName, value3, value4, type, C56424yEw.gEmmrt(pairArr)));
            SingleSwapAdvanceFragment.this.djBIcL().OLrzqt(tab.getPosition() != 0 ? TabTitleInfo.KEY_LIMIT_ORDER : "swap");
        }
    }

    public static final InterfaceC60096zvd AhwBna(Function1 function1, Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return (InterfaceC60096zvd) function1.invoke(obj);
    }

    public static final InterfaceC60096zvd EZpvd(SingleSwapAdvanceFragment singleSwapAdvanceFragment, xXO xxo) {
        Intrinsics.checkNotNullParameter(xxo, "");
        return C22380heK.OLrzqt.copydefault(singleSwapAdvanceFragment.AuCTel()).fARcdN().OLrzqt().EZpvd();
    }

    public static final void gEmmrt(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(SingleSwapAdvanceFragment singleSwapAdvanceFragment, InterfaceC9738bbJ interfaceC9738bbJ) {
        if (interfaceC9738bbJ.getFieldNames()) {
            singleSwapAdvanceFragment.KWHzl("swap");
        }
        return Unit.INSTANCE;
    }

    public static final void valueOf(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final void AYXKKw(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit KWHzl(SingleSwapAdvanceFragment singleSwapAdvanceFragment, C22002hUg c22002hUg) {
        singleSwapAdvanceFragment.KWHzl(c22002hUg.copydefault());
        return Unit.INSTANCE;
    }

    public static final void djBIcL(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(Throwable th) {
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(SingleSwapAdvanceFragment singleSwapAdvanceFragment, TradeParam tradeParam) {
        if (Intrinsics.EZpvd(tradeParam, TradeParam.Companion.AEQbTJ())) {
            return Unit.INSTANCE;
        }
        singleSwapAdvanceFragment.KWHzl("swap");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(SingleSwapAdvanceFragment singleSwapAdvanceFragment, LimitParam limitParam) {
        if (Intrinsics.EZpvd(limitParam, LimitParam.Companion.AEQbTJ())) {
            return Unit.INSTANCE;
        }
        if (!limitParam.isGenericNavigation()) {
            singleSwapAdvanceFragment.AYXKKw = limitParam;
        }
        singleSwapAdvanceFragment.KWHzl(TabTitleInfo.KEY_LIMIT_ORDER);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(String str) {
        C21501hBs c21501hBs;
        C55249xgQ c55249xgQ;
        C55249xgQ c55249xgQ2;
        C55249xgQ c55249xgQ3;
        C55249xgQ c55249xgQ4;
        TabLayout.Tab tabAt = null;
        if (Intrinsics.EZpvd((Object) str, (Object) "swap")) {
            C21501hBs c21501hBs2 = (C21501hBs) fARcdN();
            if (c21501hBs2 != null && (c55249xgQ3 = c21501hBs2.EZpvd) != null) {
                C21501hBs c21501hBs3 = (C21501hBs) fARcdN();
                if (c21501hBs3 != null && (c55249xgQ4 = c21501hBs3.EZpvd) != null) {
                    tabAt = c55249xgQ4.getTabAt(0);
                }
                c55249xgQ3.selectTab(tabAt);
            }
        } else if (Intrinsics.EZpvd((Object) str, (Object) TabTitleInfo.KEY_LIMIT_ORDER) && (c21501hBs = (C21501hBs) fARcdN()) != null && (c55249xgQ = c21501hBs.EZpvd) != null) {
            C21501hBs c21501hBs4 = (C21501hBs) fARcdN();
            if (c21501hBs4 != null && (c55249xgQ2 = c21501hBs4.EZpvd) != null) {
                tabAt = c55249xgQ2.getTabAt(1);
            }
            c55249xgQ.selectTab(tabAt);
        }
        djBIcL().OLrzqt(str);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        FrameLayout frameLayoutEjfBZ = ejfBZ();
        if (frameLayoutEjfBZ != null) {
            frameLayoutEjfBZ.removeAllViews();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        FragmentContainerView fragmentContainerView;
        C28242kUd c28242kUdGEmmrt = fJNWhG().gEmmrt();
        if (c28242kUdGEmmrt != null && c28242kUdGEmmrt.copydefault()) {
            values();
            return;
        }
        Triple<Fragment, Fragment, Fragment> tripleFetchVPNInfo = fetchVPNInfo();
        Fragment fragmentComponent1 = tripleFetchVPNInfo.component1();
        Fragment fragmentComponent2 = tripleFetchVPNInfo.component2();
        Fragment fragmentComponent3 = tripleFetchVPNInfo.component3();
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (fragmentComponent3 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent3, Lifecycle.State.STARTED);
            fragmentTransactionBeginTransaction.hide(fragmentComponent3);
        }
        if (fragmentComponent2 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent2, Lifecycle.State.STARTED);
            fragmentTransactionBeginTransaction.hide(fragmentComponent2);
        }
        if (fragmentComponent1 != null) {
            fragmentTransactionBeginTransaction.show(fragmentComponent1);
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent1, Lifecycle.State.RESUMED);
        } else {
            int id = 0;
            djBIcL().KWHzl(false);
            C21501hBs c21501hBs = (C21501hBs) fARcdN();
            if (c21501hBs != null && (fragmentContainerView = c21501hBs.AEQbTJ) != null) {
                id = fragmentContainerView.getId();
            }
            fragmentTransactionBeginTransaction.add(id, SwapSingleTradeFragment.Companion.AEQbTJ(AuCTel(), fIwbmz(), new Function1() { // from class: o.ily
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return SingleSwapAdvanceFragment.EZpvd(((java.lang.Boolean) obj).booleanValue());
                }
            }), "FRAGMENT_TAG_MARKET");
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public static final Unit EZpvd(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        FragmentContainerView fragmentContainerView;
        C28242kUd c28242kUdGEmmrt = fJNWhG().gEmmrt();
        if (c28242kUdGEmmrt != null && c28242kUdGEmmrt.OLrzqt()) {
            values();
            return;
        }
        Triple<Fragment, Fragment, Fragment> tripleFetchVPNInfo = fetchVPNInfo();
        Fragment fragmentComponent1 = tripleFetchVPNInfo.component1();
        Fragment fragmentComponent2 = tripleFetchVPNInfo.component2();
        Fragment fragmentComponent3 = tripleFetchVPNInfo.component3();
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (fragmentComponent3 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent3, Lifecycle.State.STARTED);
            fragmentTransactionBeginTransaction.hide(fragmentComponent3);
        }
        if (fragmentComponent1 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent1, Lifecycle.State.STARTED);
            fragmentTransactionBeginTransaction.hide(fragmentComponent1);
        }
        if (fragmentComponent2 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent2, Lifecycle.State.RESUMED);
            fragmentTransactionBeginTransaction.show(fragmentComponent2);
        } else {
            int id = 0;
            djBIcL().KWHzl(false);
            C21501hBs c21501hBs = (C21501hBs) fARcdN();
            if (c21501hBs != null && (fragmentContainerView = c21501hBs.AEQbTJ) != null) {
                id = fragmentContainerView.getId();
            }
            fragmentTransactionBeginTransaction.add(id, LimitOrderFragment.Companion.AEQbTJ(AuCTel(), this.AYXKKw), "FRAGMENT_TAG_LIMIT");
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        FragmentContainerView fragmentContainerView;
        Triple<Fragment, Fragment, Fragment> tripleFetchVPNInfo = fetchVPNInfo();
        Fragment fragmentComponent1 = tripleFetchVPNInfo.component1();
        Fragment fragmentComponent2 = tripleFetchVPNInfo.component2();
        Fragment fragmentComponent3 = tripleFetchVPNInfo.component3();
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        if (fragmentComponent1 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent1, Lifecycle.State.STARTED);
            fragmentTransactionBeginTransaction.hide(fragmentComponent1);
        }
        if (fragmentComponent2 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent2, Lifecycle.State.STARTED);
            fragmentTransactionBeginTransaction.hide(fragmentComponent2);
        }
        if (fragmentComponent3 != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentComponent3, Lifecycle.State.RESUMED);
            fragmentTransactionBeginTransaction.show(fragmentComponent3);
        } else {
            C21501hBs c21501hBs = (C21501hBs) fARcdN();
            fragmentTransactionBeginTransaction.add((c21501hBs == null || (fragmentContainerView = c21501hBs.AEQbTJ) == null) ? 0 : fragmentContainerView.getId(), C30393laM.Companion.AEQbTJ(AuCTel()), "FRAGMENT_TAG_UPGRADE");
        }
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public final Triple<Fragment, Fragment, Fragment> fetchVPNInfo() {
        return new Triple<>(getChildFragmentManager().findFragmentByTag("FRAGMENT_TAG_MARKET"), getChildFragmentManager().findFragmentByTag("FRAGMENT_TAG_LIMIT"), getChildFragmentManager().findFragmentByTag("FRAGMENT_TAG_UPGRADE"));
    }

    public final void OLrzqt(String str, String str2, String str3) {
        C25295ity.KWHzl(str3, str, C25295ity.copydefault(C22372heC.EZpvd(AuCTel())), str2, djBIcL().AEQbTJ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final C19818gQl AhwBna() {
        C55249xgQ c55249xgQ;
        C55249xgQ c55249xgQ2;
        C21501hBs c21501hBs = (C21501hBs) fARcdN();
        String str = "swap";
        String str2 = (c21501hBs == null || (c55249xgQ2 = c21501hBs.EZpvd) == null) ? null : c55249xgQ2.getSelectedTabPosition() == 0 ? "swap" : "limit";
        String str3 = str2 == null ? "" : str2;
        C21501hBs c21501hBs2 = (C21501hBs) fARcdN();
        if (c21501hBs2 == null || (c55249xgQ = c21501hBs2.EZpvd) == null) {
            str = null;
        } else if (c55249xgQ.getSelectedTabPosition() != 0) {
            str = "limit";
        }
        return new C19818gQl(str3, "na", str == null ? "" : str, null, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55249xgQ c55249xgQ;
        C21501hBs c21501hBs = (C21501hBs) fARcdN();
        if (c21501hBs != null && (c55249xgQ = c21501hBs.EZpvd) != null) {
            c55249xgQ.clearOnTabSelectedListeners();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AYXKKw = null;
    }
}

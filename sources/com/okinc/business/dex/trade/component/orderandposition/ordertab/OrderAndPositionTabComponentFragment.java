package com.okinc.business.dex.trade.component.orderandposition.ordertab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment;
import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import com.okinc.business.dex.trade.component.orderandposition.ordertab.viewmodel.OrderAndPositionTabComponentViewModel;
import com.okinc.business.dex.trade.order.domain.model.OrderStatus;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.main.swap.coinlist.bean.NetworkSource;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
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
import o.C19808gQb;
import o.C19812gQf;
import o.C21489hBg;
import o.C21997hUb;
import o.C23274hvD;
import o.C25352ivB;
import o.C25452iww;
import o.C31176lpA;
import o.C33070mpX;
import o.C52761wXj;
import o.C55298xhM;
import o.C56391yDq;
import o.C56392yDr;
import o.C56403yEb;
import o.C56442yFn;
import o.C56524yIo;
import o.C57406yhn;
import o.C57659ymb;
import o.InterfaceC19811gQe;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.gQE;
import o.hCQ;
import o.hTL;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrderAndPositionTabComponentFragment extends gQE<C21489hBg> {
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public C25452iww eventTracker;
    public final InterfaceC56387yDm gEmmrt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AhwBna = 8;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderAndPositionTab.values().length];
            try {
                iArr[OrderAndPositionTab.Position.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderAndPositionTab.Order.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21489hBg EZpvd(OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment) {
        return (C21489hBg) orderAndPositionTabComponentFragment.fARcdN();
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final OrderAndPositionTabComponentFragment EZpvd() {
            return new OrderAndPositionTabComponentFragment();
        }
    }

    public OrderAndPositionTabComponentFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderAndPositionTabComponentViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = C19812gQf.OLrzqt(this);
    }

    public final OrderAndPositionTabComponentViewModel AhwBna() {
        return (OrderAndPositionTabComponentViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderAndPositionEventViewModel djBIcL() {
        return (OrderAndPositionEventViewModel) this.djBIcL.getValue();
    }

    /* JADX DEBUG: Possible override for method o.gQE.EZpvd()V */
    public final C25452iww EZpvd() {
        C25452iww c25452iww = this.eventTracker;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21489hBg OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21489hBg c21489hBgEZpvd = C21489hBg.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21489hBgEZpvd, "");
        return c21489hBgEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    public void OLrzqt(@NotNull final C21489hBg c21489hBg, Bundle bundle) {
        ViewPager2 viewPager2KWHzl;
        Intrinsics.checkNotNullParameter(c21489hBg, "");
        InterfaceC19811gQe interfaceC19811gQeEZpvd = C19812gQf.EZpvd(this);
        if (interfaceC19811gQeEZpvd != null && (viewPager2KWHzl = interfaceC19811gQeEZpvd.KWHzl()) != null) {
            viewPager2KWHzl.setAdapter(new C19808gQb(this));
            TabLayout tabLayout = c21489hBg.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(tabLayout, "");
            EZpvd(tabLayout, viewPager2KWHzl);
            viewPager2KWHzl.setUserInputEnabled(false);
        }
        c21489hBg.getRoot().post(new Runnable() { // from class: o.gQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                OrderAndPositionTabComponentFragment.AEQbTJ(this.OLrzqt);
            }
        });
        c21489hBg.KWHzl.setContentDescription("web3_dex_advance_positions_filter_button");
        C25352ivB.setOnDoubleCheckClickListener$default(c21489hBg.KWHzl, 0L, new Function1() { // from class: o.gQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrderAndPositionTabComponentFragment.AEQbTJ(this.OLrzqt, c21489hBg, (android.view.View) obj);
            }
        }, 1, null);
        C25352ivB.setOnDoubleCheckClickListener$default(c21489hBg.EZpvd, 0L, new Function1() { // from class: o.gQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrderAndPositionTabComponentFragment.KWHzl(this.KWHzl, c21489hBg, (android.view.View) obj);
            }
        }, 1, null);
    }

    public static final void AEQbTJ(OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment) {
        rVN.reportFullyDrawn$default((Fragment) orderAndPositionTabComponentFragment, true, (String) null, 2, (Object) null);
    }

    public static final Unit AEQbTJ(OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment, C21489hBg c21489hBg, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        orderAndPositionTabComponentFragment.djBIcL().AEQbTJ();
        orderAndPositionTabComponentFragment.AEQbTJ(Integer.valueOf(c21489hBg.AEQbTJ.getSelectedTabPosition()), "order_filter");
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment, final C21489hBg c21489hBg, View view) {
        String chainId;
        Intrinsics.checkNotNullParameter(view, "");
        hTL.ActionBar actionBar = hTL.Companion;
        FragmentManager parentFragmentManager = orderAndPositionTabComponentFragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        NetworkSource networkSource = NetworkSource.Single;
        DefiChainInfo defiChainInfoDbNXlk = orderAndPositionTabComponentFragment.djBIcL().DbNXlk();
        if (defiChainInfoDbNXlk == null || (chainId = defiChainInfoDbNXlk.getChainId()) == null) {
            chainId = "chain_id_all_network";
        }
        actionBar.OLrzqt(parentFragmentManager, new C21997hUb(networkSource, chainId, true, TradeMode.SwapMarket.getType(), true, null, false, false, 224, null), new Function1() { // from class: o.gQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrderAndPositionTabComponentFragment.OLrzqt(c21489hBg, orderAndPositionTabComponentFragment, (ChainInfoResult) obj);
            }
        });
        orderAndPositionTabComponentFragment.AEQbTJ(Integer.valueOf(c21489hBg.AEQbTJ.getSelectedTabPosition()), DexTrackEventParameter.ButtonName.SELECT_CHAIN.getValue());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C21489hBg c21489hBg, OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment, ChainInfoResult chainInfoResult) {
        Intrinsics.checkNotNullParameter(chainInfoResult, "");
        if (Intrinsics.EZpvd((Object) chainInfoResult.copydefault(), (Object) "chain_id_all_network")) {
            c21489hBg.EZpvd.setImageResource(C52761wXj.TaskDescription.createSocket);
            orderAndPositionTabComponentFragment.djBIcL().copydefault((String) null);
        } else {
            AppCompatImageView appCompatImageView = c21489hBg.EZpvd;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C57659ymb.EZpvd(appCompatImageView, chainInfoResult.OLrzqt(), C57406yhn.Activity.QKVWgx);
            orderAndPositionTabComponentFragment.djBIcL().copydefault(chainInfoResult.copydefault());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment$setListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrderAndPositionTabComponentFragment.this.new AnonymousClass1(continuation);
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
                SharedFlow<Boolean> sharedFlowAhwBna = OrderAndPositionTabComponentFragment.this.djBIcL().AhwBna();
                final OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment = OrderAndPositionTabComponentFragment.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.component.orderandposition.ordertab.OrderAndPositionTabComponentFragment.setListener.1.4
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return copydefault(((Boolean) obj2).booleanValue(), continuation);
                    }

                    public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
                        AppCompatImageView appCompatImageView;
                        C21489hBg c21489hBgEZpvd = OrderAndPositionTabComponentFragment.EZpvd(orderAndPositionTabComponentFragment);
                        if (c21489hBgEZpvd != null && (appCompatImageView = c21489hBgEZpvd.KWHzl) != null) {
                            appCompatImageView.setImageResource(z ? C52761wXj.TaskDescription.GVpNrs : C52761wXj.TaskDescription.dPnHjp);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlowAhwBna.collect(flowCollector, this) == objCopydefault) {
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

    @Override // o.AbstractC32996moC
    public void setListener() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public static final void OLrzqt(OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setCustomView(hCQ.KWHzl(orderAndPositionTabComponentFragment.getLayoutInflater()).getRoot());
        if (i == 1) {
            View customView = tab.getCustomView();
            if (customView != null) {
                customView.setPaddingRelative(C55298xhM.dpInt$default(16, (Context) null, 1, (Object) null), customView.getPaddingTop(), customView.getPaddingEnd(), customView.getPaddingBottom());
            }
            tab.setText(C33070mpX.AYXKKw(orderAndPositionTabComponentFragment.djBIcL().copydefault().getValue().getTextRes()));
            tab.setTag(OrderAndPositionTab.Order);
            tab.setContentDescription("web3_dex_pokit_orders_tab");
            return;
        }
        View customView2 = tab.getCustomView();
        if (customView2 != null) {
            customView2.setPaddingRelative(C55298xhM.dpInt$default(24, (Context) null, 1, (Object) null), customView2.getPaddingTop(), customView2.getPaddingEnd(), customView2.getPaddingBottom());
        }
        tab.setText(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultRegistryKtrememberLauncherForActivityResult11));
        tab.setTag(OrderAndPositionTab.Position);
        tab.setContentDescription("web3_dex_pokit_positions_tab");
    }

    public final void EZpvd(TabLayout tabLayout, ViewPager2 viewPager2) {
        hCQ hcqCopydefault;
        new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.gQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                OrderAndPositionTabComponentFragment.OLrzqt(this.copydefault, tab, i);
            }
        }).attach();
        int i = Application.AEQbTJ[AhwBna().copydefault().ordinal()];
        if (i == 1) {
            TabLayout.Tab tabAt = tabLayout.getTabAt(0);
            if (tabAt != null) {
                tabLayout.selectTab(tabAt);
            }
            viewPager2.setCurrentItem(0, false);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TabLayout.Tab tabAt2 = tabLayout.getTabAt(1);
            if (tabAt2 != null) {
                tabLayout.selectTab(tabAt2);
                View customView = tabAt2.getCustomView();
                if (customView != null && (hcqCopydefault = hCQ.copydefault(customView)) != null) {
                    AppCompatImageView appCompatImageView = hcqCopydefault.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                    appCompatImageView.setVisibility(0);
                }
            }
            viewPager2.setCurrentItem(1, false);
        }
        tabLayout.setSelectedTabIndicator((Drawable) null);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new TaskDescription());
    }

    public static final class TaskDescription implements TabLayout.OnTabSelectedListener {
        public TaskDescription() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            View customView;
            hCQ hcqCopydefault;
            int i = 0;
            if (tab != null && tab.getPosition() == 1 && (customView = tab.getCustomView()) != null && (hcqCopydefault = hCQ.copydefault(customView)) != null) {
                AppCompatImageView appCompatImageView = hcqCopydefault.KWHzl;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
                appCompatImageView.setVisibility(0);
            }
            Object tag = tab != null ? tab.getTag() : null;
            OrderAndPositionTab orderAndPositionTab = tag instanceof OrderAndPositionTab ? (OrderAndPositionTab) tag : null;
            if (orderAndPositionTab != null) {
                OrderAndPositionTabComponentFragment.this.AhwBna().AEQbTJ(orderAndPositionTab);
            }
            OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment = OrderAndPositionTabComponentFragment.this;
            if (tab != null && tab.getPosition() == 1) {
                i = 1;
            }
            orderAndPositionTabComponentFragment.AEQbTJ(Integer.valueOf(1 ^ i), (tab == null || tab.getPosition() != 1) ? "positions" : "open_orders");
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            View customView;
            hCQ hcqCopydefault;
            if (tab == null || tab.getPosition() != 1 || (customView = tab.getCustomView()) == null || (hcqCopydefault = hCQ.copydefault(customView)) == null) {
                return;
            }
            AppCompatImageView appCompatImageView = hcqCopydefault.KWHzl;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(8);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(final TabLayout.Tab tab) {
            hCQ hcqCopydefault;
            if (tab == null || tab.getPosition() != 1) {
                return;
            }
            OrderAndPositionTabComponentFragment.this.AEQbTJ(1, "order_type_filter");
            View customView = tab.getCustomView();
            if (customView != null && (hcqCopydefault = hCQ.copydefault(customView)) != null) {
                hcqCopydefault.KWHzl.setImageResource(C52761wXj.TaskDescription.dUDNAs);
            }
            C31176lpA.StateListAnimator stateListAnimator = C31176lpA.Companion;
            FragmentManager childFragmentManager = OrderAndPositionTabComponentFragment.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            InterfaceC56445yFq<OrderStatus> entries = OrderStatus.getEntries();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(entries, 10));
            for (OrderStatus orderStatus : entries) {
                arrayList.add(new C31176lpA.ActionBar(C33070mpX.AYXKKw(orderStatus.getTextRes()), orderStatus, null, 4, null));
            }
            C31176lpA.Activity activity = new C31176lpA.Activity(arrayList, OrderAndPositionTabComponentFragment.this.djBIcL().copydefault().getValue(), null, null, null, 0, 60, null);
            final OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment = OrderAndPositionTabComponentFragment.this;
            stateListAnimator.OLrzqt(childFragmentManager, activity, new Function1() { // from class: o.gQN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OrderAndPositionTabComponentFragment.TaskDescription.KWHzl(orderAndPositionTabComponentFragment, tab, (C31176lpA.ActionBar) obj);
                }
            }, new Function0() { // from class: o.gQO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OrderAndPositionTabComponentFragment.TaskDescription.AEQbTJ(tab);
                }
            });
        }

        public static final Unit KWHzl(OrderAndPositionTabComponentFragment orderAndPositionTabComponentFragment, TabLayout.Tab tab, C31176lpA.ActionBar actionBar) {
            Intrinsics.checkNotNullParameter(actionBar, "");
            orderAndPositionTabComponentFragment.djBIcL().OLrzqt((OrderStatus) actionBar.AEQbTJ());
            tab.setText(C33070mpX.AYXKKw(((OrderStatus) actionBar.AEQbTJ()).getTextRes()));
            return Unit.INSTANCE;
        }

        public static final Unit AEQbTJ(TabLayout.Tab tab) {
            hCQ hcqCopydefault;
            View customView = tab.getCustomView();
            if (customView != null && (hcqCopydefault = hCQ.copydefault(customView)) != null) {
                hcqCopydefault.KWHzl.setImageResource(C52761wXj.TaskDescription.QSLkRj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void AEQbTJ(Integer num, String str) {
        String chainId;
        OrderAndPositionTab orderAndPositionTab = ((num != null && num.intValue() == 1) || num == null || num.intValue() != 0) ? OrderAndPositionTab.Order : OrderAndPositionTab.Position;
        C25452iww c25452iwwEZpvd = EZpvd();
        DefiChainInfo defiChainInfoDbNXlk = djBIcL().DbNXlk();
        if (defiChainInfoDbNXlk == null || (chainId = defiChainInfoDbNXlk.getChainId()) == null) {
            chainId = "chain_id_all_network";
        }
        InterfaceC19811gQe interfaceC19811gQeEZpvd = C19812gQf.EZpvd(this);
        c25452iwwEZpvd.OLrzqt(new AbstractC22407hel.Application(chainId, orderAndPositionTab, str, interfaceC19811gQeEZpvd != null ? interfaceC19811gQeEZpvd.OLrzqt() : null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        TabLayout tabLayout;
        C21489hBg c21489hBg = (C21489hBg) fARcdN();
        if (c21489hBg != null && (tabLayout = c21489hBg.AEQbTJ) != null) {
            tabLayout.clearOnTabSelectedListeners();
        }
        super.onDestroyView();
    }
}

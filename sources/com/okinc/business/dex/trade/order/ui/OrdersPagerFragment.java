package com.okinc.business.dex.trade.order.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dex.trade.component.orderandposition.openorder.domain.model.ReminderType;
import com.okinc.business.dex.trade.order.domain.model.OrderFilterStrategyType;
import com.okinc.business.dex.trade.order.domain.model.OrderStatus;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import com.okinc.business.dex.trade.order.ui.OrdersPagerFragment;
import com.okinc.business.dex.trade.order.ui.viewmodel.OrderListViewModel;
import com.okinc.business.dex.trade.order.ui.viewmodel.OrderPagerViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexui.main.swap.coinlist.tokenlist.selectnetwork.ChainInfoResult;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.reminder.OKReminder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
import kotlinx.coroutines.flow.StateFlow;
import o.C20054gZe;
import o.C20064gZo;
import o.C20066gZq;
import o.C20073gZx;
import o.C21487hBe;
import o.C22194hak;
import o.C22202has;
import o.C22206haw;
import o.C22227hbQ;
import o.C22236hbZ;
import o.C22274hcK;
import o.C23274hvD;
import o.C25352ivB;
import o.C25389ivm;
import o.C31176lpA;
import o.C33070mpX;
import o.C33129mqd;
import o.C33546myW;
import o.C43251rlk;
import o.C54989xbV;
import o.C55113xdn;
import o.C55326xho;
import o.C56390yDp;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC20068gZs;
import o.InterfaceC20070gZu;
import o.InterfaceC54829xWw;
import o.InterfaceC54847xXn;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;
import o.InterfaceC57901yrE;
import o.InterfaceC57934yrl;
import o.gLW;
import o.gZV;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OrdersPagerFragment extends gZV implements InterfaceC54847xXn {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public C21487hBe AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values;

    @yCM
    public gLW walletModuleUiService;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ReminderType.values().length];
            try {
                iArr[ReminderType.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReminderType.NeedUpgradeSaVersion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReminderType.NeedRenewal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReminderType.Keep.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            KWHzl = iArr;
        }
    }

    public OrdersPagerFragment() {
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new OrdersPagerFragment$special$$inlined$viewModels$default$2(new Function0<Fragment>() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$special$$inlined$viewModels$default$1
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
        }));
        final Function0 function0 = null;
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderPagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$special$$inlined$viewModels$default$4
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$special$$inlined$viewModels$default$5
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$special$$inlined$activityViewModels$default$3
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
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.haJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrdersPagerFragment.AuCTel(this.KWHzl);
            }
        });
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.haP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(OrdersPagerFragment.fARcdN(this.EZpvd));
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.haM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrdersPagerFragment.fIwbmz(this.OLrzqt);
            }
        });
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ OrdersPagerFragment newInstance$default(ActionBar actionBar, boolean z, String str, boolean z2, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "";
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return actionBar.KWHzl(z, str, z2);
        }

        public final OrdersPagerFragment KWHzl(boolean z, String str, boolean z2) {
            OrdersPagerFragment ordersPagerFragment = new OrdersPagerFragment();
            ordersPagerFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("type", Boolean.valueOf(z)), C56390yDp.OLrzqt("key.from_wallet", Boolean.valueOf(z2)), C56390yDp.OLrzqt("key.chain_id", str)));
            return ordersPagerFragment;
        }
    }

    /* JADX DEBUG: Possible override for method o.gZV.AhwBna()V */
    public final gLW AhwBna() {
        gLW glw = this.walletModuleUiService;
        if (glw != null) {
            return glw;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderPagerViewModel AkhnZx() {
        return (OrderPagerViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderListViewModel isConnected() {
        return (OrderListViewModel) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C22194hak fetchVPNInfo() {
        return (C22194hak) this.AhwBna.getValue();
    }

    public static final C22194hak AuCTel(OrdersPagerFragment ordersPagerFragment) {
        LifecycleOwner viewLifecycleOwner = ordersPagerFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return new C22194hak(false, viewLifecycleOwner, 1, null);
    }

    public final boolean gEmmrt() {
        return ((Boolean) this.valueOf.getValue()).booleanValue();
    }

    public static final boolean fARcdN(OrdersPagerFragment ordersPagerFragment) {
        Bundle arguments = ordersPagerFragment.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("key.from_wallet");
        }
        return false;
    }

    private final String DbNXlk() {
        return (String) this.gEmmrt.getValue();
    }

    public static final String fIwbmz(OrdersPagerFragment ordersPagerFragment) {
        Bundle arguments = ordersPagerFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("key.chain_id");
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        OrderStatus orderStatus = (arguments == null || !arguments.getBoolean("type")) ? OrderStatus.OpenOrders : OrderStatus.History;
        OrderPagerViewModel.init$default(AkhnZx(), orderStatus, false, null, 4, null);
        isConnected().AEQbTJ(orderStatus);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public View onCreateView(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21487hBe c21487hBeAEQbTJ = C21487hBe.AEQbTJ(layoutInflater, viewGroup, false);
        this.AYXKKw = c21487hBeAEQbTJ;
        if (c21487hBeAEQbTJ != null) {
            return c21487hBeAEQbTJ.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC31214lpm
    public void OLrzqt() {
        AYXKKw();
        values();
        AuCTel();
        fARcdN();
    }

    private final void fARcdN() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3;
        C21487hBe c21487hBe = this.AYXKKw;
        if (c21487hBe != null && (recyclerView3 = c21487hBe.AhwBna) != null) {
            recyclerView3.setLayoutManager(new LinearLayoutManager(requireActivity()));
        }
        C21487hBe c21487hBe2 = this.AYXKKw;
        if (c21487hBe2 != null && (recyclerView2 = c21487hBe2.AhwBna) != null) {
            recyclerView2.addItemDecoration(new C22202has(false));
        }
        fetchVPNInfo().AEQbTJ();
        C21487hBe c21487hBe3 = this.AYXKKw;
        if (c21487hBe3 == null || (recyclerView = c21487hBe3.AhwBna) == null) {
            return;
        }
        recyclerView.setAdapter(fetchVPNInfo());
    }

    @Override // o.InterfaceC54847xXn
    public void KWHzl(long j, long j2, boolean z) {
        if (isAdded()) {
            AkhnZx().KWHzl(String.valueOf(j2));
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        C22227hbQ c22227hbQ;
        C22227hbQ c22227hbQ2;
        C33546myW c33546myW;
        C54989xbV c54989xbV;
        C54989xbV c54989xbV2;
        C54989xbV c54989xbV3;
        C21487hBe c21487hBe = this.AYXKKw;
        if (c21487hBe != null && (c54989xbV3 = c21487hBe.AkhnZx) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c54989xbV3, 0L, new Function1() { // from class: o.haU
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OrdersPagerFragment.EZpvd(this.AEQbTJ, (android.view.View) obj);
                }
            }, 1, null);
        }
        C21487hBe c21487hBe2 = this.AYXKKw;
        if (c21487hBe2 != null && (c54989xbV2 = c21487hBe2.values) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c54989xbV2, 0L, new Function1() { // from class: o.haQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OrdersPagerFragment.AhwBna(this.AEQbTJ, (android.view.View) obj);
                }
            }, 1, null);
        }
        C21487hBe c21487hBe3 = this.AYXKKw;
        if (c21487hBe3 != null && (c54989xbV = c21487hBe3.isConnected) != null) {
            C25352ivB.setOnDoubleCheckClickListener$default(c54989xbV, 0L, new Function1() { // from class: o.haT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OrdersPagerFragment.copydefault(this.KWHzl, (android.view.View) obj);
                }
            }, 1, null);
        }
        C21487hBe c21487hBe4 = this.AYXKKw;
        if (c21487hBe4 != null && (c33546myW = c21487hBe4.gEmmrt) != null) {
            c33546myW.OLrzqt((InterfaceC57901yrE) new Application());
        }
        C21487hBe c21487hBe5 = this.AYXKKw;
        if (c21487hBe5 != null && (c22227hbQ2 = c21487hBe5.EZpvd) != null) {
            c22227hbQ2.setOnCancelAllClickListener(new Function1() { // from class: o.haW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OrdersPagerFragment.KWHzl(this.EZpvd, (java.util.List) obj);
                }
            });
        }
        C21487hBe c21487hBe6 = this.AYXKKw;
        if (c21487hBe6 != null && (c22227hbQ = c21487hBe6.EZpvd) != null) {
            c22227hbQ.setOnReactiveAllClickListener(new Function1() { // from class: o.haZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OrdersPagerFragment.EZpvd(this.AEQbTJ, (java.util.List) obj);
                }
            });
        }
        fetchVPNInfo().AEQbTJ(new Function1() { // from class: o.haB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrdersPagerFragment.EZpvd(this.KWHzl, (C20066gZq) obj);
            }
        });
        fetchVPNInfo().AEQbTJ(new Function0() { // from class: o.haE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrdersPagerFragment.ejfBZ(this.EZpvd);
            }
        });
        fetchVPNInfo().OLrzqt(new Function0() { // from class: o.haI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrdersPagerFragment.getNewProxyInstance(this.copydefault);
            }
        });
        fetchVPNInfo().copydefault(new Function1() { // from class: o.haG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrdersPagerFragment.EZpvd(this.OLrzqt, (C20064gZo) obj);
            }
        });
        fetchVPNInfo().KWHzl(new Function0() { // from class: o.haK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrdersPagerFragment.uzCIH(this.KWHzl);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass12(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass13(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass14(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass15(null), 3, null);
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass16(null), 3, null);
    }

    public static final Unit EZpvd(final OrdersPagerFragment ordersPagerFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OrderPagerViewModel.trackClick$default(ordersPagerFragment.AkhnZx(), DexTrackEventParameter.ButtonName.OPEN_OR_HISTORY.getValue(), null, null, 6, null);
        C31176lpA.StateListAnimator stateListAnimator = C31176lpA.Companion;
        FragmentManager childFragmentManager = ordersPagerFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        InterfaceC56445yFq<OrderStatus> entries = OrderStatus.getEntries();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(entries, 10));
        for (OrderStatus orderStatus : entries) {
            arrayList.add(new C31176lpA.ActionBar(C33070mpX.AYXKKw(orderStatus.getTextRes()), orderStatus, null, 4, null));
        }
        stateListAnimator.AEQbTJ(childFragmentManager, new C31176lpA.Activity(arrayList, ordersPagerFragment.AkhnZx().copydefault(), null, null, null, 0, 60, null), new Function1() { // from class: o.haD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrdersPagerFragment.EZpvd(this.EZpvd, (C31176lpA.ActionBar) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OrdersPagerFragment ordersPagerFragment, C31176lpA.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        ordersPagerFragment.AkhnZx().OLrzqt((OrderStatus) actionBar.AEQbTJ());
        ordersPagerFragment.isConnected().AEQbTJ((OrderStatus) actionBar.AEQbTJ());
        ordersPagerFragment.AYXKKw();
        ordersPagerFragment.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit AhwBna(final OrdersPagerFragment ordersPagerFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OrderPagerViewModel.trackClick$default(ordersPagerFragment.AkhnZx(), DexTrackEventParameter.ButtonName.ORDER_TYPE_FILTER.getValue(), null, null, 6, null);
        ordersPagerFragment.AkhnZx().OLrzqt("order_type_filter");
        C22206haw c22206haw = C22206haw.copydefault;
        FragmentManager childFragmentManager = ordersPagerFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c22206haw.KWHzl(childFragmentManager, ordersPagerFragment.AkhnZx().EZpvd(), ordersPagerFragment.gEmmrt() ? 1 : 2, new Function1() { // from class: o.haS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrdersPagerFragment.AYXKKw(this.EZpvd, (C31176lpA.ActionBar) obj);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(OrdersPagerFragment ordersPagerFragment, C31176lpA.ActionBar actionBar) {
        String trackValue;
        Intrinsics.checkNotNullParameter(actionBar, "");
        OrderPagerViewModel orderPagerViewModelAkhnZx = ordersPagerFragment.AkhnZx();
        Object objAEQbTJ = actionBar.AEQbTJ();
        orderPagerViewModelAkhnZx.copydefault(objAEQbTJ instanceof OrderFilterStrategyType ? (OrderFilterStrategyType) objAEQbTJ : null);
        ordersPagerFragment.values();
        ordersPagerFragment.AuCTel();
        OrderPagerViewModel orderPagerViewModelAkhnZx2 = ordersPagerFragment.AkhnZx();
        String value = DexTrackEventParameter.ButtonName.ORDER_TYPE_FILTER.getValue();
        Object objAEQbTJ2 = actionBar.AEQbTJ();
        OrderFilterStrategyType orderFilterStrategyType = objAEQbTJ2 instanceof OrderFilterStrategyType ? (OrderFilterStrategyType) objAEQbTJ2 : null;
        if (orderFilterStrategyType == null || (trackValue = orderFilterStrategyType.getTrackValue()) == null) {
            trackValue = "all";
        }
        orderPagerViewModelAkhnZx2.KWHzl(value, "order_type_filter", C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.CRYPTO_ORDER_TYPE, trackValue)));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final OrdersPagerFragment ordersPagerFragment, View view) {
        Intrinsics.checkNotNullParameter(view, "");
        OrderPagerViewModel.trackClick$default(ordersPagerFragment.AkhnZx(), DexTrackEventParameter.ButtonName.ORDER_STATUS_FILTER.getValue(), null, null, 6, null);
        if (ordersPagerFragment.gEmmrt()) {
            Object obj = new Object();
            C31176lpA.StateListAnimator stateListAnimator = C31176lpA.Companion;
            FragmentManager childFragmentManager = ordersPagerFragment.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            String strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatResultReceiverWrapper1);
            List<OrderSubStatus> listDjBIcL = ordersPagerFragment.AkhnZx().djBIcL();
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listDjBIcL, 10));
            for (OrderSubStatus orderSubStatus : listDjBIcL) {
                arrayList.add(new C31176lpA.ActionBar(C33070mpX.AYXKKw(orderSubStatus.getFilterTextRes()), orderSubStatus, null, 4, null));
            }
            List listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((Collection) arrayList);
            listFJNWhG.add(0, new C31176lpA.ActionBar(C33070mpX.AYXKKw(C23274hvD.Fragment.KWHzl), obj, null, 4, null));
            Unit unit = Unit.INSTANCE;
            OrderSubStatus orderSubStatusAYXKKw = ordersPagerFragment.AkhnZx().AYXKKw();
            stateListAnimator.AEQbTJ(childFragmentManager, new C31176lpA.Activity(listFJNWhG, orderSubStatusAYXKKw == null ? obj : orderSubStatusAYXKKw, strAYXKKw, null, null, 1, 24, null), new Function1() { // from class: o.haF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return OrdersPagerFragment.OLrzqt(this.EZpvd, (C31176lpA.ActionBar) obj2);
                }
            });
            return unit;
        }
        C22236hbZ.StateListAnimator stateListAnimator2 = C22236hbZ.Companion;
        FragmentManager childFragmentManager2 = ordersPagerFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.MediaSessionCompatResultReceiverWrapper1);
        List<OrderSubStatus> listDjBIcL2 = ordersPagerFragment.AkhnZx().djBIcL();
        ArrayList arrayList2 = new ArrayList(C56403yEb.AYXKKw(listDjBIcL2, 10));
        for (OrderSubStatus orderSubStatus2 : listDjBIcL2) {
            arrayList2.add(new C20073gZx(C33070mpX.AYXKKw(orderSubStatus2.getFilterTextRes()), orderSubStatus2 == ordersPagerFragment.AkhnZx().AYXKKw(), orderSubStatus2, false, false, 24, null));
        }
        stateListAnimator2.KWHzl(childFragmentManager2, new C20054gZe(strAYXKKw2, arrayList2), new Function1() { // from class: o.haN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj2) {
                return OrdersPagerFragment.OLrzqt(this.OLrzqt, (OrderSubStatus) obj2);
            }
        }, new Function0() { // from class: o.haR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrdersPagerFragment.fJNWhG(this.copydefault);
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OrdersPagerFragment ordersPagerFragment, C31176lpA.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        Object objAEQbTJ = actionBar.AEQbTJ();
        ordersPagerFragment.KWHzl(objAEQbTJ instanceof OrderSubStatus ? (OrderSubStatus) objAEQbTJ : null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(OrdersPagerFragment ordersPagerFragment, OrderSubStatus orderSubStatus) {
        ordersPagerFragment.KWHzl(orderSubStatus);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(OrdersPagerFragment ordersPagerFragment) {
        if (ordersPagerFragment.AkhnZx().copydefault() == OrderStatus.OpenOrders) {
            ordersPagerFragment.AkhnZx().OLrzqt("orders_open_status_filter");
        } else {
            ordersPagerFragment.AkhnZx().OLrzqt("orders_history_status_filter");
        }
        return Unit.INSTANCE;
    }

    public static final class Application implements InterfaceC57901yrE {
        public Application() {
        }

        @Override // o.InterfaceC57900yrD
        public void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            OrdersPagerFragment.this.AkhnZx().fARcdN();
        }

        @Override // o.InterfaceC57903yrG
        public void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
            Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
            OrdersPagerFragment.this.AkhnZx().EZpvd(false);
        }
    }

    public static final Unit EZpvd(OrdersPagerFragment ordersPagerFragment, C20066gZq c20066gZq) {
        Intrinsics.checkNotNullParameter(c20066gZq, "");
        OrderPagerViewModel.trackClick$default(ordersPagerFragment.AkhnZx(), DexTrackEventParameter.ButtonName.ORDER_DETAIL.getValue(), null, null, 6, null);
        C22206haw c22206haw = C22206haw.copydefault;
        FragmentActivity fragmentActivityRequireActivity = ordersPagerFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c22206haw.AEQbTJ(fragmentActivityRequireActivity, c20066gZq, ordersPagerFragment.isConnected().OLrzqt(c20066gZq.AEQbTJ()));
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(OrdersPagerFragment ordersPagerFragment) {
        OrderPagerViewModel.loadOrderList$default(ordersPagerFragment.AkhnZx(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(OrdersPagerFragment ordersPagerFragment) {
        ordersPagerFragment.fIwbmz();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OrdersPagerFragment ordersPagerFragment, C20064gZo c20064gZo) {
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        OrderPagerViewModel.trackClick$default(ordersPagerFragment.AkhnZx(), DexTrackEventParameter.ButtonName.RESUME.getValue(), null, null, 6, null);
        ordersPagerFragment.KWHzl(C56402yEa.EZpvd(c20064gZo.AYXKKw()));
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(OrdersPagerFragment ordersPagerFragment) {
        OrderPagerViewModel.loadOrderList$default(ordersPagerFragment.AkhnZx(), false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$setListener$12, reason: invalid class name */
    public static final class AnonymousClass12 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass12(Continuation<? super AnonymousClass12> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrdersPagerFragment.this.new AnonymousClass12(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass12) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<InterfaceC20068gZs> stateFlowOLrzqt = OrdersPagerFragment.this.AkhnZx().OLrzqt();
                final OrdersPagerFragment ordersPagerFragment = OrdersPagerFragment.this;
                FlowCollector<? super InterfaceC20068gZs> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment.setListener.12.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC20068gZs interfaceC20068gZs, Continuation<? super Unit> continuation) {
                        C33546myW c33546myW;
                        C33546myW c33546myW2;
                        C33546myW c33546myW3;
                        C33546myW c33546myW4;
                        C22227hbQ c22227hbQ;
                        LinearLayout linearLayout;
                        C33546myW c33546myW5;
                        C21487hBe c21487hBe = ordersPagerFragment.AYXKKw;
                        if (c21487hBe != null && (c33546myW5 = c21487hBe.gEmmrt) != null) {
                            c33546myW5.AEQbTJ();
                        }
                        ordersPagerFragment.ejfBZ();
                        if (interfaceC20068gZs instanceof InterfaceC20068gZs.StateListAnimator) {
                            ordersPagerFragment.KWHzl(false);
                            C21487hBe c21487hBe2 = ordersPagerFragment.AYXKKw;
                            if (c21487hBe2 != null && (linearLayout = c21487hBe2.KWHzl) != null) {
                                linearLayout.setVisibility(((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).copydefault().EZpvd() ? 0 : 8);
                            }
                            C21487hBe c21487hBe3 = ordersPagerFragment.AYXKKw;
                            if (c21487hBe3 != null && (c22227hbQ = c21487hBe3.EZpvd) != null) {
                                c22227hbQ.copydefault(((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).copydefault(), false);
                            }
                            C21487hBe c21487hBe4 = ordersPagerFragment.AYXKKw;
                            if (c21487hBe4 != null && (c33546myW4 = c21487hBe4.gEmmrt) != null) {
                                c33546myW4.AhwBna(((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).AEQbTJ());
                            }
                            C21487hBe c21487hBe5 = ordersPagerFragment.AYXKKw;
                            if (c21487hBe5 != null && (c33546myW3 = c21487hBe5.gEmmrt) != null) {
                                c33546myW3.valueOf();
                            }
                            ordersPagerFragment.fetchVPNInfo().OLrzqt(CollectionsKt___CollectionsKt.fJNWhG((Collection) ((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).EZpvd()));
                            rVN.reportFullyDrawn$default((Fragment) ordersPagerFragment, true, (String) null, 2, (Object) null);
                        } else if (Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Activity.OLrzqt)) {
                            ordersPagerFragment.KWHzl(true);
                        } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.Application) {
                            ordersPagerFragment.valueOf();
                            ordersPagerFragment.KWHzl(false);
                            ordersPagerFragment.fetchVPNInfo().OLrzqt(((InterfaceC20068gZs.Application) interfaceC20068gZs).EZpvd());
                            rVN.reportFullyDrawn$default((Fragment) ordersPagerFragment, false, (String) null, 2, (Object) null);
                        } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.ActionBar) {
                            ordersPagerFragment.valueOf();
                            ordersPagerFragment.KWHzl(false);
                            C21487hBe c21487hBe6 = ordersPagerFragment.AYXKKw;
                            if (c21487hBe6 != null && (c33546myW2 = c21487hBe6.gEmmrt) != null) {
                                c33546myW2.AhwBna(false);
                            }
                            if (ordersPagerFragment.AkhnZx().copydefault() == OrderStatus.OpenOrders || !((InterfaceC20068gZs.ActionBar) interfaceC20068gZs).EZpvd()) {
                                C22194hak.showEmpty$default(ordersPagerFragment.fetchVPNInfo(), false, ((InterfaceC20068gZs.ActionBar) interfaceC20068gZs).EZpvd(), 1, null);
                            } else {
                                ordersPagerFragment.fetchVPNInfo().KWHzl();
                            }
                            rVN.reportFullyDrawn$default((Fragment) ordersPagerFragment, true, (String) null, 2, (Object) null);
                        } else if (Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Fragment.KWHzl)) {
                            C21487hBe c21487hBe7 = ordersPagerFragment.AYXKKw;
                            if (c21487hBe7 != null && (c33546myW = c21487hBe7.gEmmrt) != null) {
                                c33546myW.valueOf();
                            }
                        } else if (!Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.TaskDescription.OLrzqt)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowOLrzqt.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$setListener$13, reason: invalid class name */
    public static final class AnonymousClass13 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass13(Continuation<? super AnonymousClass13> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrdersPagerFragment.this.new AnonymousClass13(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass13) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$setListener$13$4, reason: invalid class name */
        public static final class AnonymousClass4<T> implements FlowCollector {
            public final /* synthetic */ OrdersPagerFragment copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass4(OrdersPagerFragment ordersPagerFragment) {
                this.copydefault = ordersPagerFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return OLrzqt((Pair<Boolean, ? extends List<String>>) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object OLrzqt(final Pair<Boolean, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
                if (pair.getFirst().booleanValue()) {
                    C22274hcK c22274hcK = C22274hcK.OLrzqt;
                    FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    final OrdersPagerFragment ordersPagerFragment = this.copydefault;
                    c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.haV
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OrdersPagerFragment.AnonymousClass13.AnonymousClass4.OLrzqt(ordersPagerFragment, pair);
                        }
                    });
                } else {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }

            public static final Unit OLrzqt(OrdersPagerFragment ordersPagerFragment, Pair pair) {
                ordersPagerFragment.AkhnZx().OLrzqt((List<String>) pair.getSecond());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Pair<Boolean, List<String>>> sharedFlowKWHzl = OrdersPagerFragment.this.AkhnZx().KWHzl();
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(OrdersPagerFragment.this);
                this.label = 1;
                if (sharedFlowKWHzl.collect(anonymousClass4, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$setListener$14, reason: invalid class name */
    public static final class AnonymousClass14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass14(Continuation<? super AnonymousClass14> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrdersPagerFragment.this.new AnonymousClass14(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$setListener$14$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ OrdersPagerFragment EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(OrdersPagerFragment ordersPagerFragment) {
                this.EZpvd = ordersPagerFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return KWHzl((Pair<Boolean, ? extends List<String>>) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object KWHzl(final Pair<Boolean, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
                if (pair.getFirst().booleanValue()) {
                    C22274hcK c22274hcK = C22274hcK.OLrzqt;
                    FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    final OrdersPagerFragment ordersPagerFragment = this.EZpvd;
                    c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.haY
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OrdersPagerFragment.AnonymousClass14.AnonymousClass5.KWHzl(ordersPagerFragment, pair);
                        }
                    });
                } else {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit KWHzl(OrdersPagerFragment ordersPagerFragment, Pair pair) {
                ordersPagerFragment.AkhnZx().copydefault((List<String>) pair.getSecond());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Pair<Boolean, List<String>>> sharedFlowValueOf = OrdersPagerFragment.this.AkhnZx().valueOf();
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(OrdersPagerFragment.this);
                this.label = 1;
                if (sharedFlowValueOf.collect(anonymousClass5, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$setListener$15, reason: invalid class name */
    public static final class AnonymousClass15 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass15(Continuation<? super AnonymousClass15> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrdersPagerFragment.this.new AnonymousClass15(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass15) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<InterfaceC20070gZu> stateFlowKWHzl = OrdersPagerFragment.this.isConnected().KWHzl();
                final OrdersPagerFragment ordersPagerFragment = OrdersPagerFragment.this;
                FlowCollector<? super InterfaceC20070gZu> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment.setListener.15.4
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC20070gZu interfaceC20070gZu, Continuation<? super Unit> continuation) {
                        if (Intrinsics.EZpvd(interfaceC20070gZu, InterfaceC20070gZu.StateListAnimator.copydefault)) {
                            ordersPagerFragment.AkhnZx().KWHzl((String) null);
                        } else {
                            if (!(interfaceC20070gZu instanceof InterfaceC20070gZu.Application)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            InterfaceC20070gZu.Application application = (InterfaceC20070gZu.Application) interfaceC20070gZu;
                            if (application.OLrzqt()) {
                                ordersPagerFragment.AkhnZx().KWHzl(application.copydefault());
                            } else {
                                ordersPagerFragment.AkhnZx().KWHzl((String) null);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowKWHzl.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment$setListener$16, reason: invalid class name */
    public static final class AnonymousClass16 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass16(Continuation<? super AnonymousClass16> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OrdersPagerFragment.this.new AnonymousClass16(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass16) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                StateFlow<Boolean> stateFlowValues = OrdersPagerFragment.this.AkhnZx().values();
                final OrdersPagerFragment ordersPagerFragment = OrdersPagerFragment.this;
                FlowCollector<? super Boolean> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.order.ui.OrdersPagerFragment.setListener.16.5
                    public final Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
                        ordersPagerFragment.copydefault(!z);
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return AEQbTJ(((Boolean) obj2).booleanValue(), continuation);
                    }
                };
                this.label = 1;
                if (stateFlowValues.collect(flowCollector, this) == objCopydefault) {
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

    private final void KWHzl(List<String> list) {
        AkhnZx().copydefault(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        OKReminder oKReminder;
        OKReminder oKReminder2;
        OKReminder oKReminder3;
        OKReminder oKReminder4;
        OKReminder oKReminder5;
        OKReminder oKReminder6;
        OKReminder oKReminder7;
        OKReminder oKReminder8;
        OKReminder oKReminder9;
        OKReminder oKReminder10;
        OKReminder oKReminder11;
        OKReminder oKReminder12;
        int i = StateListAnimator.KWHzl[AkhnZx().AhwBna().ordinal()];
        if (i == 1) {
            C21487hBe c21487hBe = this.AYXKKw;
            if (c21487hBe == null || (oKReminder = c21487hBe.valueOf) == null) {
                return;
            }
            oKReminder.setVisibility(8);
            return;
        }
        if (i == 2) {
            C21487hBe c21487hBe2 = this.AYXKKw;
            if (c21487hBe2 != null && (oKReminder6 = c21487hBe2.valueOf) != null) {
                oKReminder6.setVisibility(0);
            }
            C21487hBe c21487hBe3 = this.AYXKKw;
            if (c21487hBe3 != null && (oKReminder5 = c21487hBe3.valueOf) != null) {
                oKReminder5.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.unregister));
            }
            C21487hBe c21487hBe4 = this.AYXKKw;
            if (c21487hBe4 != null && (oKReminder4 = c21487hBe4.valueOf) != null) {
                oKReminder4.setCloseIconVisibility(false);
            }
            C21487hBe c21487hBe5 = this.AYXKKw;
            if (c21487hBe5 != null && (oKReminder3 = c21487hBe5.valueOf) != null) {
                oKReminder3.setStyle(2);
            }
            C21487hBe c21487hBe6 = this.AYXKKw;
            if (c21487hBe6 == null || (oKReminder2 = c21487hBe6.valueOf) == null) {
                return;
            }
            oKReminder2.setPrimaryAction(C33070mpX.AYXKKw(C23274hvD.Fragment.QKDJJA), new Function0() { // from class: o.haL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return OrdersPagerFragment.getFieldNames(this.OLrzqt);
                }
            });
            return;
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        C21487hBe c21487hBe7 = this.AYXKKw;
        if (c21487hBe7 != null && (oKReminder12 = c21487hBe7.valueOf) != null) {
            oKReminder12.setVisibility(0);
        }
        C21487hBe c21487hBe8 = this.AYXKKw;
        if (c21487hBe8 != null && (oKReminder11 = c21487hBe8.valueOf) != null) {
            oKReminder11.setVisibility(0);
        }
        C21487hBe c21487hBe9 = this.AYXKKw;
        if (c21487hBe9 != null && (oKReminder10 = c21487hBe9.valueOf) != null) {
            oKReminder10.setMessage(C33070mpX.AYXKKw(C23274hvD.Fragment.fTEjYi));
        }
        C21487hBe c21487hBe10 = this.AYXKKw;
        if (c21487hBe10 != null && (oKReminder9 = c21487hBe10.valueOf) != null) {
            oKReminder9.setCloseIconVisibility(false);
        }
        C21487hBe c21487hBe11 = this.AYXKKw;
        if (c21487hBe11 != null && (oKReminder8 = c21487hBe11.valueOf) != null) {
            oKReminder8.setStyle(2);
        }
        C21487hBe c21487hBe12 = this.AYXKKw;
        if (c21487hBe12 == null || (oKReminder7 = c21487hBe12.valueOf) == null) {
            return;
        }
        oKReminder7.setPrimaryAction(C33070mpX.AYXKKw(C23274hvD.Fragment.QKDJJA), new Function0() { // from class: o.haO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OrdersPagerFragment.hDKMBd(this.copydefault);
            }
        });
    }

    public static final Unit getFieldNames(OrdersPagerFragment ordersPagerFragment) {
        gLW glwAhwBna = ordersPagerFragment.AhwBna();
        FragmentActivity fragmentActivityRequireActivity = ordersPagerFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        gLW.ActionBar.navigateToRenewOrReenableSA$default(glwAhwBna, fragmentActivityRequireActivity, false, 2, null);
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(OrdersPagerFragment ordersPagerFragment) {
        gLW glwAhwBna = ordersPagerFragment.AhwBna();
        FragmentActivity fragmentActivityRequireActivity = ordersPagerFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        gLW.ActionBar.navigateToRenewOrReenableSA$default(glwAhwBna, fragmentActivityRequireActivity, false, 2, null);
        return Unit.INSTANCE;
    }

    private final void copydefault(List<String> list) {
        AkhnZx().OLrzqt(list);
    }

    @Override // o.AbstractC31214lpm
    public void bc_() {
        if (C33129mqd.OLrzqt((CharSequence) DbNXlk()) && !Intrinsics.EZpvd((Object) DbNXlk(), (Object) "-9223372036854775808")) {
            AkhnZx().KWHzl(DbNXlk());
        } else {
            OrderPagerViewModel.loadOrderList$default(AkhnZx(), false, 1, null);
        }
        AkhnZx().AuCTel();
    }

    private final void AuCTel() {
        C54989xbV c54989xbV;
        TextView textViewEZpvd;
        C21487hBe c21487hBe = this.AYXKKw;
        if (c21487hBe == null || (c54989xbV = c21487hBe.isConnected) == null || (textViewEZpvd = c54989xbV.EZpvd()) == null) {
            return;
        }
        OrderSubStatus orderSubStatusAYXKKw = AkhnZx().AYXKKw();
        String strAYXKKw = orderSubStatusAYXKKw != null ? C33070mpX.AYXKKw(orderSubStatusAYXKKw.getFilterTextRes()) : null;
        String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.zuBGHE);
        if (strAYXKKw == null || strAYXKKw.length() == 0) {
            strAYXKKw = strAYXKKw2;
        }
        textViewEZpvd.setText(strAYXKKw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(boolean z) {
        RecyclerView recyclerView;
        C55113xdn c55113xdn;
        C21487hBe c21487hBe = this.AYXKKw;
        if (c21487hBe != null && (c55113xdn = c21487hBe.AEQbTJ) != null) {
            c55113xdn.setVisibility(z ? 0 : 8);
        }
        C21487hBe c21487hBe2 = this.AYXKKw;
        if (c21487hBe2 == null || (recyclerView = c21487hBe2.AhwBna) == null) {
            return;
        }
        recyclerView.setVisibility(z ? 4 : 0);
    }

    public final void AYXKKw() {
        C33546myW c33546myW;
        C54989xbV c54989xbV;
        TextView textViewEZpvd;
        C54989xbV c54989xbV2;
        C21487hBe c21487hBe = this.AYXKKw;
        if (c21487hBe != null && (c54989xbV2 = c21487hBe.AkhnZx) != null) {
            c54989xbV2.setVisibility(gEmmrt() ^ true ? 0 : 8);
        }
        C21487hBe c21487hBe2 = this.AYXKKw;
        if (c21487hBe2 != null && (c54989xbV = c21487hBe2.AkhnZx) != null && (textViewEZpvd = c54989xbV.EZpvd()) != null) {
            textViewEZpvd.setText(C33070mpX.AYXKKw(AkhnZx().copydefault().getTextRes()));
        }
        C21487hBe c21487hBe3 = this.AYXKKw;
        if (c21487hBe3 == null || (c33546myW = c21487hBe3.gEmmrt) == null) {
            return;
        }
        c33546myW.KWHzl(false);
    }

    public final void values() {
        C54989xbV c54989xbV;
        TextView textViewEZpvd;
        C21487hBe c21487hBe = this.AYXKKw;
        if (c21487hBe == null || (c54989xbV = c21487hBe.values) == null || (textViewEZpvd = c54989xbV.EZpvd()) == null) {
            return;
        }
        OrderFilterStrategyType orderFilterStrategyTypeEZpvd = AkhnZx().EZpvd();
        String strAYXKKw = orderFilterStrategyTypeEZpvd != null ? C33070mpX.AYXKKw(orderFilterStrategyTypeEZpvd.getTextRes()) : null;
        String strAYXKKw2 = C33070mpX.AYXKKw(C23274hvD.Fragment.AEQbTJ);
        if (strAYXKKw == null || strAYXKKw.length() == 0) {
            strAYXKKw = strAYXKKw2;
        }
        textViewEZpvd.setText(strAYXKKw);
    }

    public final void copydefault(boolean z) {
        C21487hBe c21487hBe = this.AYXKKw;
        if (c21487hBe != null) {
            C54989xbV c54989xbV = c21487hBe.isConnected;
            Intrinsics.checkNotNullExpressionValue(c54989xbV, "");
            c54989xbV.setVisibility(z ? 0 : 8);
            C54989xbV c54989xbV2 = c21487hBe.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(c54989xbV2, "");
            c54989xbV2.setVisibility((!z || gEmmrt()) ? 8 : 0);
            C54989xbV c54989xbV3 = c21487hBe.values;
            Intrinsics.checkNotNullExpressionValue(c54989xbV3, "");
            c54989xbV3.setVisibility(z ? 0 : 8);
        }
    }

    public final void valueOf() {
        C22227hbQ c22227hbQ;
        LinearLayout linearLayout;
        C21487hBe c21487hBe = this.AYXKKw;
        if (c21487hBe != null && (linearLayout = c21487hBe.KWHzl) != null) {
            linearLayout.setVisibility(8);
        }
        C21487hBe c21487hBe2 = this.AYXKKw;
        if (c21487hBe2 == null || (c22227hbQ = c21487hBe2.EZpvd) == null) {
            return;
        }
        c22227hbQ.copydefault();
    }

    public final void KWHzl(OrderSubStatus orderSubStatus) {
        Pair pairOLrzqt;
        String trackValue;
        AkhnZx().OLrzqt(orderSubStatus);
        AuCTel();
        if (AkhnZx().copydefault() == OrderStatus.OpenOrders) {
            pairOLrzqt = C56390yDp.OLrzqt("orders_open_status_filter", "open_order_status_filter");
        } else {
            pairOLrzqt = C56390yDp.OLrzqt("orders_history_status_filter", "history_orders_status_filter");
        }
        String str = (String) pairOLrzqt.component1();
        String str2 = (String) pairOLrzqt.component2();
        OrderPagerViewModel orderPagerViewModelAkhnZx = AkhnZx();
        String value = DexTrackEventParameter.ButtonName.ORDER_STATUS_FILTER.getValue();
        if (orderSubStatus == null || (trackValue = orderSubStatus.getTrackValue()) == null) {
            trackValue = "all";
        }
        orderPagerViewModelAkhnZx.KWHzl(value, str, C56423yEv.EZpvd(C56390yDp.OLrzqt(str2, trackValue)));
    }

    private final void fIwbmz() {
        DefiChainInfo defiChainInfoGEmmrt = AkhnZx().gEmmrt();
        if (defiChainInfoGEmmrt != null) {
            C22206haw c22206haw = C22206haw.copydefault;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c22206haw.EZpvd(fragmentActivityRequireActivity, defiChainInfoGEmmrt.getWalletExplorePrefix(), defiChainInfoGEmmrt.getChainId());
            return;
        }
        if (gEmmrt()) {
            InterfaceC54829xWw interfaceC54829xWw = (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            interfaceC54829xWw.KWHzl(contextRequireContext, childFragmentManager);
            return;
        }
        C22206haw c22206haw2 = C22206haw.copydefault;
        FragmentManager childFragmentManager2 = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
        DefiChainInfo defiChainInfoCopydefault = isConnected().copydefault(false);
        String chainId = defiChainInfoCopydefault != null ? defiChainInfoCopydefault.getChainId() : null;
        c22206haw2.EZpvd(childFragmentManager2, false, chainId != null ? chainId : "", new Function1() { // from class: o.haH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OrdersPagerFragment.KWHzl(this.KWHzl, (ChainInfoResult) obj);
            }
        });
    }

    public static final Unit KWHzl(OrdersPagerFragment ordersPagerFragment, ChainInfoResult chainInfoResult) {
        Intrinsics.checkNotNullParameter(chainInfoResult, "");
        String strEZpvd = ordersPagerFragment.isConnected().EZpvd(chainInfoResult.copydefault());
        if (C33129mqd.OLrzqt((CharSequence) strEZpvd)) {
            C22206haw c22206haw = C22206haw.copydefault;
            FragmentActivity fragmentActivityRequireActivity = ordersPagerFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c22206haw.EZpvd(fragmentActivityRequireActivity, strEZpvd, chainInfoResult.copydefault());
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC31214lpm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AkhnZx().iwGUEr();
        fetchVPNInfo().AEQbTJ((Function1<? super C20066gZq, Unit>) null);
        fetchVPNInfo().AEQbTJ((Function0<Unit>) null);
        fetchVPNInfo().copydefault((Function1<? super C20064gZo, Unit>) null);
        fetchVPNInfo().KWHzl((Function0<Unit>) null);
        this.AYXKKw = null;
        super.onDestroyView();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC31214lpm, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        ejfBZ();
        AkhnZx().hDKMBd();
    }

    public static final Unit KWHzl(OrdersPagerFragment ordersPagerFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C20064gZo) it.next()).AYXKKw());
        }
        ordersPagerFragment.copydefault(arrayList);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(OrdersPagerFragment ordersPagerFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C20064gZo) it.next()).AYXKKw());
        }
        ordersPagerFragment.KWHzl(arrayList);
        return Unit.INSTANCE;
    }
}

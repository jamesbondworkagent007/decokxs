package com.okinc.business.dex.trade.component.orderandposition.openorder.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.CompoundButton;
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
import com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment;
import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import com.okinc.business.dex.trade.order.domain.model.OrderStatus;
import com.okinc.business.dex.trade.order.ui.viewmodel.OrderPagerViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC19817gQk;
import o.AbstractC22407hel;
import o.AbstractC43238rlX;
import o.C19812gQf;
import o.C19829gQw;
import o.C20064gZo;
import o.C20066gZq;
import o.C21488hBf;
import o.C22194hak;
import o.C22202has;
import o.C22206haw;
import o.C22227hbQ;
import o.C22274hcK;
import o.C23274hvD;
import o.C25452iww;
import o.C33070mpX;
import o.C43251rlk;
import o.C55113xdn;
import o.C55326xho;
import o.C56391yDq;
import o.C56392yDr;
import o.C56402yEa;
import o.C56403yEb;
import o.C56442yFn;
import o.C56524yIo;
import o.InterfaceC19811gQe;
import o.InterfaceC20068gZs;
import o.InterfaceC43294rma;
import o.InterfaceC56387yDm;
import o.gKZ;
import o.gLW;
import o.rVN;
import o.wYK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class OpenOrderComponentFragment extends AbstractC19817gQk<C21488hBf> {
    public boolean AYXKKw = true;
    public final InterfaceC56387yDm djBIcL;

    @yCM
    public C25452iww eventTracker;
    public final InterfaceC56387yDm gEmmrt;

    @yCM
    public gLW walletModuleUiService;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AhwBna = 8;

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21488hBf EZpvd(OpenOrderComponentFragment openOrderComponentFragment) {
        return (C21488hBf) openOrderComponentFragment.fARcdN();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final OpenOrderComponentFragment OLrzqt() {
            return new OpenOrderComponentFragment();
        }
    }

    public OpenOrderComponentFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$special$$inlined$viewModels$default$2
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OrderPagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$special$$inlined$viewModels$default$5
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.gQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OpenOrderComponentFragment.AhwBna(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.gQk.valueOf()V */
    public final C25452iww valueOf() {
        C25452iww c25452iww = this.eventTracker;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final OrderPagerViewModel AkhnZx() {
        return (OrderPagerViewModel) this.djBIcL.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C22194hak values() {
        return (C22194hak) this.gEmmrt.getValue();
    }

    public static final C22194hak AhwBna(OpenOrderComponentFragment openOrderComponentFragment) {
        LifecycleOwner viewLifecycleOwner = openOrderComponentFragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        return new C22194hak(false, viewLifecycleOwner, 1, null);
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OrderPagerViewModel orderPagerViewModelAkhnZx = AkhnZx();
        OrderStatus value = AEQbTJ().copydefault().getValue();
        InterfaceC19811gQe interfaceC19811gQeEZpvd = C19812gQf.EZpvd(this);
        orderPagerViewModelAkhnZx.copydefault(value, true, interfaceC19811gQeEZpvd != null ? interfaceC19811gQeEZpvd.OLrzqt() : null);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C21488hBf OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21488hBf c21488hBfOLrzqt = C21488hBf.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21488hBfOLrzqt, "");
        return c21488hBfOLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21488hBf c21488hBf, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21488hBf, "");
        values().AEQbTJ();
        c21488hBf.copydefault.setAdapter(values());
        c21488hBf.copydefault.setLayoutManager(new LinearLayoutManager(getContext()));
        c21488hBf.copydefault.addItemDecoration(new C22202has(true));
    }

    @Override // o.gPW, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        fetchVPNInfo();
        AkhnZx().EZpvd(this.AYXKKw);
        this.AYXKKw = false;
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$setListener$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OpenOrderComponentFragment.this.new AnonymousClass1(continuation);
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
                StateFlow<OrderStatus> stateFlowCopydefault = OpenOrderComponentFragment.this.AEQbTJ().copydefault();
                final OpenOrderComponentFragment openOrderComponentFragment = OpenOrderComponentFragment.this;
                FlowCollector<? super OrderStatus> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment.setListener.1.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
                    public final Object emit(OrderStatus orderStatus, Continuation<? super Unit> continuation) {
                        openOrderComponentFragment.AkhnZx().OLrzqt(orderStatus);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowCopydefault.collect(flowCollector, this) == objCopydefault) {
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

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        C22227hbQ c22227hbQ;
        C22227hbQ c22227hbQ2;
        wYK wyk;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass4(null), 3, null);
        C21488hBf c21488hBf = (C21488hBf) fARcdN();
        if (c21488hBf != null && (wyk = c21488hBf.OLrzqt) != null) {
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.gQp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    OpenOrderComponentFragment.OLrzqt(this.EZpvd, compoundButton, z);
                }
            });
        }
        values().AEQbTJ(new Function1() { // from class: o.gQm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OpenOrderComponentFragment.OLrzqt(this.copydefault, (C20066gZq) obj);
            }
        });
        values().copydefault(new Function1() { // from class: o.gQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OpenOrderComponentFragment.AEQbTJ(this.AEQbTJ, (C20064gZo) obj);
            }
        });
        values().AEQbTJ(new Function0() { // from class: o.gQq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OpenOrderComponentFragment.AYXKKw(this.AEQbTJ);
            }
        });
        values().OLrzqt(new Function0() { // from class: o.gQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OpenOrderComponentFragment.djBIcL(this.OLrzqt);
            }
        });
        C21488hBf c21488hBf2 = (C21488hBf) fARcdN();
        if (c21488hBf2 != null && (c22227hbQ2 = c21488hBf2.AEQbTJ) != null) {
            c22227hbQ2.setOnCancelAllClickListener(new Function1() { // from class: o.gQt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return OpenOrderComponentFragment.OLrzqt(this.copydefault, (java.util.List) obj);
                }
            });
        }
        C21488hBf c21488hBf3 = (C21488hBf) fARcdN();
        if (c21488hBf3 == null || (c22227hbQ = c21488hBf3.AEQbTJ) == null) {
            return;
        }
        c22227hbQ.setOnReactiveAllClickListener(new Function1() { // from class: o.gQs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OpenOrderComponentFragment.AEQbTJ(this.copydefault, (java.util.List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$setListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OpenOrderComponentFragment.this.new AnonymousClass2(continuation);
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
                StateFlow<InterfaceC20068gZs> stateFlowOLrzqt = OpenOrderComponentFragment.this.AkhnZx().OLrzqt();
                final OpenOrderComponentFragment openOrderComponentFragment = OpenOrderComponentFragment.this;
                FlowCollector<? super InterfaceC20068gZs> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment.setListener.2.3
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
                    public final Object emit(InterfaceC20068gZs interfaceC20068gZs, Continuation<? super Unit> continuation) {
                        C22227hbQ c22227hbQ;
                        C22227hbQ c22227hbQ2;
                        C22227hbQ c22227hbQ3;
                        C22227hbQ c22227hbQ4;
                        if (interfaceC20068gZs instanceof InterfaceC20068gZs.StateListAnimator) {
                            openOrderComponentFragment.OLrzqt(false);
                            C21488hBf c21488hBfEZpvd = OpenOrderComponentFragment.EZpvd(openOrderComponentFragment);
                            if (c21488hBfEZpvd != null && (c22227hbQ4 = c21488hBfEZpvd.AEQbTJ) != null) {
                                c22227hbQ4.copydefault(((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).copydefault(), true);
                            }
                            openOrderComponentFragment.values().OLrzqt((List<? extends Object>) ((InterfaceC20068gZs.StateListAnimator) interfaceC20068gZs).EZpvd());
                            rVN.reportFullyDrawn$default((Fragment) openOrderComponentFragment, true, (String) null, 2, (Object) null);
                        } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.ActionBar) {
                            C21488hBf c21488hBfEZpvd2 = OpenOrderComponentFragment.EZpvd(openOrderComponentFragment);
                            if (c21488hBfEZpvd2 != null && (c22227hbQ3 = c21488hBfEZpvd2.AEQbTJ) != null) {
                                c22227hbQ3.copydefault();
                            }
                            openOrderComponentFragment.OLrzqt(false);
                            C22194hak.showEmpty$default(openOrderComponentFragment.values(), false, false, 2, null);
                            rVN.reportFullyDrawn$default((Fragment) openOrderComponentFragment, true, (String) null, 2, (Object) null);
                        } else if (interfaceC20068gZs instanceof InterfaceC20068gZs.Application) {
                            C21488hBf c21488hBfEZpvd3 = OpenOrderComponentFragment.EZpvd(openOrderComponentFragment);
                            if (c21488hBfEZpvd3 != null && (c22227hbQ2 = c21488hBfEZpvd3.AEQbTJ) != null) {
                                c22227hbQ2.copydefault();
                            }
                            openOrderComponentFragment.OLrzqt(false);
                            openOrderComponentFragment.values().OLrzqt(((InterfaceC20068gZs.Application) interfaceC20068gZs).EZpvd());
                            rVN.reportFullyDrawn$default((Fragment) openOrderComponentFragment, false, (String) null, 2, (Object) null);
                        } else if (Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Activity.OLrzqt)) {
                            C21488hBf c21488hBfEZpvd4 = OpenOrderComponentFragment.EZpvd(openOrderComponentFragment);
                            if (c21488hBfEZpvd4 != null && (c22227hbQ = c21488hBfEZpvd4.AEQbTJ) != null) {
                                c22227hbQ.copydefault();
                            }
                            openOrderComponentFragment.OLrzqt(true);
                        } else if (!Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.TaskDescription.OLrzqt) && !Intrinsics.EZpvd(interfaceC20068gZs, InterfaceC20068gZs.Fragment.KWHzl)) {
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

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$setListener$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OpenOrderComponentFragment.this.new AnonymousClass3(continuation);
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
                SharedFlow<Pair<Boolean, List<String>>> sharedFlowKWHzl = OpenOrderComponentFragment.this.AkhnZx().KWHzl();
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(OpenOrderComponentFragment.this);
                this.label = 1;
                if (sharedFlowKWHzl.collect(anonymousClass5, this) == objCopydefault) {
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

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$setListener$3$5, reason: invalid class name */
        public static final class AnonymousClass5<T> implements FlowCollector {
            public final /* synthetic */ OpenOrderComponentFragment OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass5(OpenOrderComponentFragment openOrderComponentFragment) {
                this.OLrzqt = openOrderComponentFragment;
            }

            /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public final Object emit(final Pair<Boolean, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
                if (pair.getFirst().booleanValue()) {
                    C22274hcK c22274hcK = C22274hcK.OLrzqt;
                    FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    final OpenOrderComponentFragment openOrderComponentFragment = this.OLrzqt;
                    c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.gQr
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OpenOrderComponentFragment.AnonymousClass3.AnonymousClass5.copydefault(openOrderComponentFragment, pair);
                        }
                    });
                } else {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }

            public static final Unit copydefault(OpenOrderComponentFragment openOrderComponentFragment, Pair pair) {
                openOrderComponentFragment.AkhnZx().OLrzqt((List<String>) pair.getSecond());
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$setListener$4, reason: invalid class name */
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OpenOrderComponentFragment.this.new AnonymousClass4(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.openorder.ui.OpenOrderComponentFragment$setListener$4$4, reason: invalid class name and collision with other inner class name */
        public static final class C03264<T> implements FlowCollector {
            public final /* synthetic */ OpenOrderComponentFragment OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public C03264(OpenOrderComponentFragment openOrderComponentFragment) {
                this.OLrzqt = openOrderComponentFragment;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return OLrzqt((Pair<Boolean, ? extends List<String>>) obj, (Continuation<? super Unit>) continuation);
            }

            public final Object OLrzqt(final Pair<Boolean, ? extends List<String>> pair, Continuation<? super Unit> continuation) {
                if (pair.getFirst().booleanValue()) {
                    C22274hcK c22274hcK = C22274hcK.OLrzqt;
                    FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                    final OpenOrderComponentFragment openOrderComponentFragment = this.OLrzqt;
                    c22274hcK.KWHzl(fragmentActivityRequireActivity, new Function0() { // from class: o.gQy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return OpenOrderComponentFragment.AnonymousClass4.C03264.copydefault(openOrderComponentFragment, pair);
                        }
                    });
                } else {
                    C55326xho.toastWithFailedIcon$default(C23274hvD.Fragment.addPreRequisiteCollector, 0, 1, (Object) null);
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit copydefault(OpenOrderComponentFragment openOrderComponentFragment, Pair pair) {
                openOrderComponentFragment.AkhnZx().copydefault((List<String>) pair.getSecond());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objCopydefault = C56442yFn.copydefault();
            int i = this.label;
            if (i == 0) {
                C56391yDq.AEQbTJ(obj);
                SharedFlow<Pair<Boolean, List<String>>> sharedFlowValueOf = OpenOrderComponentFragment.this.AkhnZx().valueOf();
                C03264 c03264 = new C03264(OpenOrderComponentFragment.this);
                this.label = 1;
                if (sharedFlowValueOf.collect(c03264, this) == objCopydefault) {
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

    public static final void OLrzqt(OpenOrderComponentFragment openOrderComponentFragment, CompoundButton compoundButton, boolean z) {
        if (z) {
            openOrderComponentFragment.AkhnZx().EZpvd(openOrderComponentFragment.AEQbTJ().OLrzqt().getValue());
        } else {
            openOrderComponentFragment.AkhnZx().EZpvd((List<DexMultiTokenInfoBean>) null);
        }
        openOrderComponentFragment.KWHzl("current_token_only");
    }

    public static final Unit OLrzqt(OpenOrderComponentFragment openOrderComponentFragment, C20066gZq c20066gZq) {
        Intrinsics.checkNotNullParameter(c20066gZq, "");
        openOrderComponentFragment.KWHzl("order_details");
        C22206haw c22206haw = C22206haw.copydefault;
        FragmentActivity fragmentActivityRequireActivity = openOrderComponentFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        c22206haw.AEQbTJ(fragmentActivityRequireActivity, c20066gZq, openOrderComponentFragment.AkhnZx().EZpvd(c20066gZq.AEQbTJ()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(OpenOrderComponentFragment openOrderComponentFragment, C20064gZo c20064gZo) {
        Intrinsics.checkNotNullParameter(c20064gZo, "");
        openOrderComponentFragment.EZpvd(C56402yEa.EZpvd(c20064gZo.AYXKKw()));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.dex.trade.order.ui.viewmodel.OrderPagerViewModel.loadOrderList$default(com.okinc.business.dex.trade.order.ui.viewmodel.OrderPagerViewModel, boolean, int, java.lang.Object):void */
    public static final Unit AYXKKw(OpenOrderComponentFragment openOrderComponentFragment) {
        OrderPagerViewModel.loadOrderList$default(openOrderComponentFragment.AkhnZx(), false, 1, null);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(OpenOrderComponentFragment openOrderComponentFragment) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = openOrderComponentFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, gKZ.EZpvd.AEQbTJ("dex/market"), null, new Function1() { // from class: o.gQo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return OpenOrderComponentFragment.OLrzqt((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    @Override // o.gPW
    public void EZpvd() {
        OrderPagerViewModel.loadOrderList$default(AkhnZx(), false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.gPW
    public void KWHzl(@NotNull List<DexMultiTokenInfoBean> list) {
        wYK wyk;
        wYK wyk2;
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(list, "");
        C21488hBf c21488hBf = (C21488hBf) fARcdN();
        if (c21488hBf != null && (wyk2 = c21488hBf.OLrzqt) != null) {
            if (list.size() > 1) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.hlXVux);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.processStrongAuthMessage);
            }
            wyk2.setText(strAYXKKw);
        }
        C21488hBf c21488hBf2 = (C21488hBf) fARcdN();
        if (c21488hBf2 != null && (wyk = c21488hBf2.OLrzqt) != null && wyk.isChecked()) {
            AkhnZx().EZpvd(list);
        } else {
            AkhnZx().EZpvd((List<DexMultiTokenInfoBean>) null);
        }
    }

    @Override // o.gPW
    public void AEQbTJ(DefiChainInfo defiChainInfo) {
        AkhnZx().KWHzl(defiChainInfo != null ? defiChainInfo.getChainId() : null);
    }

    @Override // o.gPW
    public void OLrzqt() {
        C19829gQw c19829gQw = new C19829gQw();
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c19829gQw.show(childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(boolean z) {
        RecyclerView recyclerView;
        C55113xdn c55113xdn;
        C21488hBf c21488hBf = (C21488hBf) fARcdN();
        if (c21488hBf != null && (c55113xdn = c21488hBf.KWHzl) != null) {
            c55113xdn.setVisibility(z ? 0 : 8);
        }
        C21488hBf c21488hBf2 = (C21488hBf) fARcdN();
        if (c21488hBf2 == null || (recyclerView = c21488hBf2.copydefault) == null) {
            return;
        }
        recyclerView.setVisibility(z ? 4 : 0);
    }

    @Override // o.hTH
    public void DbNXlk() {
        super.DbNXlk();
        AkhnZx().AuCTel();
    }

    public final void EZpvd(List<String> list) {
        AkhnZx().copydefault(list);
    }

    public final void AEQbTJ(List<String> list) {
        AkhnZx().OLrzqt(list);
    }

    private final void fetchVPNInfo() {
        String chainId;
        C25452iww c25452iwwValueOf = valueOf();
        DefiChainInfo defiChainInfoDbNXlk = AEQbTJ().DbNXlk();
        if (defiChainInfoDbNXlk == null || (chainId = defiChainInfoDbNXlk.getChainId()) == null) {
            chainId = "chain_id_all_network";
        }
        OrderAndPositionTab orderAndPositionTab = OrderAndPositionTab.Order;
        InterfaceC19811gQe interfaceC19811gQeEZpvd = C19812gQf.EZpvd(this);
        c25452iwwValueOf.OLrzqt(new AbstractC22407hel.TaskDescription(chainId, orderAndPositionTab, interfaceC19811gQeEZpvd != null ? interfaceC19811gQeEZpvd.OLrzqt() : null));
    }

    public final void KWHzl(String str) {
        String chainId;
        C25452iww c25452iwwValueOf = valueOf();
        DefiChainInfo defiChainInfoDbNXlk = AEQbTJ().DbNXlk();
        if (defiChainInfoDbNXlk == null || (chainId = defiChainInfoDbNXlk.getChainId()) == null) {
            chainId = "chain_id_all_network";
        }
        OrderAndPositionTab orderAndPositionTab = OrderAndPositionTab.Order;
        InterfaceC19811gQe interfaceC19811gQeEZpvd = C19812gQf.EZpvd(this);
        c25452iwwValueOf.OLrzqt(new AbstractC22407hel.Application(chainId, orderAndPositionTab, str, interfaceC19811gQeEZpvd != null ? interfaceC19811gQeEZpvd.OLrzqt() : null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.gPW
    public void AhwBna() {
        RecyclerView recyclerView;
        C21488hBf c21488hBf = (C21488hBf) fARcdN();
        if (c21488hBf == null || (recyclerView = c21488hBf.copydefault) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }

    @Override // o.gPW
    public boolean KWHzl() {
        return AkhnZx().isConnected();
    }

    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        AkhnZx().iwGUEr();
        values().AEQbTJ((Function1<? super C20066gZq, Unit>) null);
        values().copydefault((Function1<? super C20064gZo, Unit>) null);
        values().AEQbTJ((Function0<Unit>) null);
        values().OLrzqt((Function0<Unit>) null);
        super.onDestroyView();
    }

    public static final Unit OLrzqt(OpenOrderComponentFragment openOrderComponentFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C20064gZo) it.next()).AYXKKw());
        }
        openOrderComponentFragment.AEQbTJ(arrayList);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(OpenOrderComponentFragment openOrderComponentFragment, List list) {
        Intrinsics.checkNotNullParameter(list, "");
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C20064gZo) it.next()).AYXKKw());
        }
        openOrderComponentFragment.EZpvd(arrayList);
        return Unit.INSTANCE;
    }
}

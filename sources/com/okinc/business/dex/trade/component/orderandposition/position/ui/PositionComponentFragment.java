package com.okinc.business.dex.trade.component.orderandposition.position.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
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
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.business.dex.trade.component.orderandposition.ordertab.domain.model.OrderAndPositionTab;
import com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment;
import com.okinc.business.dex.trade.component.orderandposition.position.viewmodel.PositionComponentVewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedAssetSort;
import com.okinc.business.trade.features.home.ui.cefi.data.AdvancedAssetsFilter;
import com.okinc.uilab.view.OKSortTextView;
import com.okinc.unify_trade.biz.BotWebHook;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC22407hel;
import o.AbstractC43238rlX;
import o.C19812gQf;
import o.C19846gRm;
import o.C21486hBd;
import o.C23274hvD;
import o.C25390ivn;
import o.C25392ivp;
import o.C25452iww;
import o.C28438kal;
import o.C30765lhN;
import o.C33070mpX;
import o.C33129mqd;
import o.C43251rlk;
import o.C55113xdn;
import o.C56391yDq;
import o.C56392yDr;
import o.C56442yFn;
import o.C56524yIo;
import o.C9860bdZ;
import o.InterfaceC19811gQe;
import o.InterfaceC43294rma;
import o.InterfaceC56387yDm;
import o.gKZ;
import o.gQQ;
import o.gQS;
import o.gQU;
import o.gQZ;
import o.pUU;
import o.rVN;
import o.wYK;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class PositionComponentFragment extends gQU<C21486hBd> {
    public C30765lhN AhwBna;

    @yCM
    public C25452iww eventTracker;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public static final Application Companion = new Application(null);
    public static final int AYXKKw = 8;

    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OKSortTextView.SortType.values().length];
            try {
                iArr[OKSortTextView.SortType.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OKSortTextView.SortType.UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OKSortTextView.SortType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21486hBd KWHzl(PositionComponentFragment positionComponentFragment) {
        return (C21486hBd) positionComponentFragment.fARcdN();
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final PositionComponentFragment OLrzqt() {
            return new PositionComponentFragment();
        }
    }

    public PositionComponentFragment() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionComponentVewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = true;
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.gQX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PositionComponentFragment.djBIcL(this.EZpvd);
            }
        });
    }

    public final PositionComponentVewModel isConnected() {
        return (PositionComponentVewModel) this.isConnected.getValue();
    }

    public final C25452iww values() {
        C25452iww c25452iww = this.eventTracker;
        if (c25452iww != null) {
            return c25452iww;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX DEBUG: Possible override for method o.gQU.djBIcL()V */
    public final gQQ djBIcL() {
        return (gQQ) this.gEmmrt.getValue();
    }

    public static final gQQ djBIcL(final PositionComponentFragment positionComponentFragment) {
        return new gQQ(new Function0() { // from class: o.gRe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PositionComponentFragment.valueOf(this.KWHzl);
            }
        });
    }

    public static final Unit valueOf(PositionComponentFragment positionComponentFragment) {
        positionComponentFragment.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    @Override // o.gPW
    public void EZpvd() {
        iwGUEr();
        fJNWhG();
    }

    @Override // o.gPW
    public void AEQbTJ(DefiChainInfo defiChainInfo) {
        isConnected().EZpvd(defiChainInfo);
    }

    @Override // o.gPW
    public void OLrzqt() {
        gQZ.Companion.EZpvd().show(getChildFragmentManager(), gQZ.class.getSimpleName());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.gPW
    public void KWHzl(@NotNull List<DexMultiTokenInfoBean> list) {
        wYK wyk;
        String strAYXKKw;
        Intrinsics.checkNotNullParameter(list, "");
        C21486hBd c21486hBd = (C21486hBd) fARcdN();
        if (c21486hBd != null && (wyk = c21486hBd.AEQbTJ) != null) {
            if (list.size() > 1) {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.hlXVux);
            } else {
                strAYXKKw = C33070mpX.AYXKKw(C23274hvD.Fragment.processStrongAuthMessage);
            }
            wyk.setText(strAYXKKw);
        }
        iwGUEr();
        isConnected().KWHzl(list);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21486hBd OLrzqt(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21486hBd c21486hBdCopydefault = C21486hBd.copydefault(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21486hBdCopydefault, "");
        return c21486hBdCopydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21486hBd c21486hBd, Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21486hBd, "");
        c21486hBd.gEmmrt.setAdapter(djBIcL());
        c21486hBd.gEmmrt.setLayoutManager(new LinearLayoutManager(getContext()));
        c21486hBd.gEmmrt.setContentDescription("web3_dex_advance_positions_container");
        c21486hBd.AEQbTJ.setContentDescription("web3_dex_advance_positions_checkbox");
        djBIcL().EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC
    public void setListener() {
        wYK wyk;
        getParentFragmentManager().setFragmentResultListener("position_header_request", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.gRb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                PositionComponentFragment.EZpvd(this.EZpvd, str, bundle);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner, isConnected().OLrzqt(), null, new TaskDescription(), 2, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner2, isConnected().KWHzl(), null, new StateListAnimator(), 2, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner3, isConnected().valueOf(), null, new Fragment(), 2, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner4, isConnected().AhwBna(), null, new FragmentManager(), 2, null);
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        C25390ivn.collectOnLifecycle$default(viewLifecycleOwner5, isConnected().copydefault(), null, new PendingIntent(), 2, null);
        C21486hBd c21486hBd = (C21486hBd) fARcdN();
        if (c21486hBd != null && (wyk = c21486hBd.AEQbTJ) != null) {
            wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.gRc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                    PositionComponentFragment.KWHzl(this.copydefault, compoundButton, z);
                }
            });
        }
        djBIcL().KWHzl(new Function1() { // from class: o.gRj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PositionComponentFragment.OLrzqt(this.KWHzl, (C30765lhN) obj);
            }
        });
        djBIcL().EZpvd(new Function1() { // from class: o.gRg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PositionComponentFragment.AEQbTJ(this.KWHzl, (C30765lhN) obj);
            }
        });
        djBIcL().EZpvd(new Function0() { // from class: o.gRf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PositionComponentFragment.DbNXlk(this.AEQbTJ);
            }
        });
        djBIcL().KWHzl(new Function0() { // from class: o.gRi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PositionComponentFragment.AYXKKw(this.EZpvd);
            }
        });
        AkhnZx();
    }

    public static final void EZpvd(PositionComponentFragment positionComponentFragment, String str, Bundle bundle) {
        C30765lhN c30765lhN;
        C30765lhN c30765lhN2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        String string = bundle.getString(BotWebHook.KEY_ACTION);
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode == 109400031) {
                if (string.equals("share") && (c30765lhN = positionComponentFragment.AhwBna) != null) {
                    positionComponentFragment.copydefault(c30765lhN);
                    return;
                }
                return;
            }
            if (iHashCode == 110621028 && string.equals(ExtJson.BRC20TYPE_TRADE) && (c30765lhN2 = positionComponentFragment.AhwBna) != null) {
                positionComponentFragment.AEQbTJ().OLrzqt(c30765lhN2);
            }
        }
    }

    /* JADX INFO: renamed from: com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment$setListener$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PositionComponentFragment.this.new AnonymousClass2(continuation);
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
                StateFlow<gQS> stateFlowAEQbTJ = PositionComponentFragment.this.isConnected().AEQbTJ();
                final PositionComponentFragment positionComponentFragment = PositionComponentFragment.this;
                FlowCollector<? super gQS> flowCollector = new FlowCollector() { // from class: com.okinc.business.dex.trade.component.orderandposition.position.ui.PositionComponentFragment.setListener.2.2
                    /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
                    public final Object emit(gQS gqs, Continuation<? super Unit> continuation) {
                        LinearLayoutCompat linearLayoutCompat;
                        LinearLayoutCompat linearLayoutCompat2;
                        if (gqs instanceof gQS.ActionBar) {
                            positionComponentFragment.copydefault(true);
                        } else if (gqs instanceof gQS.TaskDescription) {
                            positionComponentFragment.copydefault(false);
                            positionComponentFragment.djBIcL().KWHzl();
                            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) positionComponentFragment, false, (String) null, 2, (Object) null);
                        } else if (gqs instanceof gQS.Application) {
                            positionComponentFragment.copydefault(false);
                            gQS.Application application = (gQS.Application) gqs;
                            if (C33129mqd.KWHzl((Collection) application.EZpvd())) {
                                C21486hBd c21486hBdKWHzl = PositionComponentFragment.KWHzl(positionComponentFragment);
                                if (c21486hBdKWHzl != null && (linearLayoutCompat2 = c21486hBdKWHzl.copydefault) != null) {
                                    linearLayoutCompat2.setVisibility(0);
                                }
                                positionComponentFragment.djBIcL().AEQbTJ(application.EZpvd());
                            } else {
                                C21486hBd c21486hBdKWHzl2 = PositionComponentFragment.KWHzl(positionComponentFragment);
                                if (c21486hBdKWHzl2 != null && (linearLayoutCompat = c21486hBdKWHzl2.copydefault) != null) {
                                    linearLayoutCompat.setVisibility(8);
                                }
                                positionComponentFragment.djBIcL().AEQbTJ();
                            }
                            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) positionComponentFragment, true, (String) null, 2, (Object) null);
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (stateFlowAEQbTJ.collect(flowCollector, this) == objCopydefault) {
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

    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final Object emit(C9860bdZ c9860bdZ, Continuation<? super Unit> continuation) {
            String string;
            String strAEQbTJ;
            String strEZpvd;
            Long lOLrzqt = c9860bdZ.OLrzqt();
            if (lOLrzqt == null || (string = lOLrzqt.toString()) == null) {
                return Unit.INSTANCE;
            }
            String strAhwBna = c9860bdZ.AhwBna();
            if (strAhwBna != null && (strAEQbTJ = c9860bdZ.AEQbTJ()) != null && (strEZpvd = c9860bdZ.EZpvd()) != null) {
                gQQ gqqDjBIcL = PositionComponentFragment.this.djBIcL();
                final PositionComponentFragment positionComponentFragment = PositionComponentFragment.this;
                gqqDjBIcL.EZpvd(string, strAhwBna, strAEQbTJ, strEZpvd, new Function0() { // from class: o.gRk
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return PositionComponentFragment.FragmentManager.KWHzl(positionComponentFragment);
                    }
                });
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(PositionComponentFragment positionComponentFragment) {
            positionComponentFragment.isConnected().KWHzl(false);
            return Unit.INSTANCE;
        }
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return OLrzqt(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            OKSortTextView oKSortTextView;
            OKSortTextView oKSortTextView2;
            OKSortTextView oKSortTextView3;
            C21486hBd c21486hBdKWHzl = PositionComponentFragment.KWHzl(PositionComponentFragment.this);
            if (c21486hBdKWHzl != null && (oKSortTextView3 = c21486hBdKWHzl.KWHzl) != null) {
                oKSortTextView3.setEnabled(z);
            }
            C21486hBd c21486hBdKWHzl2 = PositionComponentFragment.KWHzl(PositionComponentFragment.this);
            if (c21486hBdKWHzl2 != null && (oKSortTextView2 = c21486hBdKWHzl2.KWHzl) != null) {
                oKSortTextView2.setAlpha(z ? 1.0f : 0.5f);
            }
            if (!z && PositionComponentFragment.this.isConnected().EZpvd().getSortBy() == AdvancedAssetSort.PNL) {
                C21486hBd c21486hBdKWHzl3 = PositionComponentFragment.KWHzl(PositionComponentFragment.this);
                if (c21486hBdKWHzl3 != null && (oKSortTextView = c21486hBdKWHzl3.KWHzl) != null) {
                    OKSortTextView.setSortType$default(oKSortTextView, OKSortTextView.SortType.NONE, false, 2, null);
                }
                PositionComponentFragment.this.isConnected().djBIcL();
                PositionComponentFragment.this.isConnected().KWHzl(false);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void KWHzl(PositionComponentFragment positionComponentFragment, CompoundButton compoundButton, boolean z) {
        positionComponentFragment.isConnected().EZpvd(z);
        positionComponentFragment.AEQbTJ("current_token_only");
    }

    public static final Unit OLrzqt(PositionComponentFragment positionComponentFragment, C30765lhN c30765lhN) {
        Intrinsics.checkNotNullParameter(c30765lhN, "");
        positionComponentFragment.AEQbTJ().OLrzqt(c30765lhN);
        positionComponentFragment.AEQbTJ("token_detail");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(PositionComponentFragment positionComponentFragment, C30765lhN c30765lhN) {
        Intrinsics.checkNotNullParameter(c30765lhN, "");
        positionComponentFragment.OLrzqt(c30765lhN);
        positionComponentFragment.AEQbTJ("my_positions_detail_popup");
        return Unit.INSTANCE;
    }

    public static final Unit DbNXlk(PositionComponentFragment positionComponentFragment) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = positionComponentFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, gKZ.EZpvd.AEQbTJ("dex/market"), null, new Function1() { // from class: o.gRh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return PositionComponentFragment.copydefault((AbstractC43238rlX) obj);
            }
        }, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(PositionComponentFragment positionComponentFragment) {
        positionComponentFragment.fJNWhG();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AkhnZx() {
        final C21486hBd c21486hBd = (C21486hBd) fARcdN();
        if (c21486hBd != null) {
            final OKSortTextView oKSortTextView = c21486hBd.OLrzqt;
            oKSortTextView.setOnClickListener(new View.OnClickListener() { // from class: o.gRd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    PositionComponentFragment.EZpvd(this.copydefault, oKSortTextView, c21486hBd, view);
                }
            });
            final OKSortTextView oKSortTextView2 = c21486hBd.KWHzl;
            oKSortTextView2.setOnClickListener(new View.OnClickListener() { // from class: o.gRa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    PositionComponentFragment.AEQbTJ(this.AEQbTJ, oKSortTextView2, c21486hBd, view);
                }
            });
        }
    }

    public static final void EZpvd(PositionComponentFragment positionComponentFragment, OKSortTextView oKSortTextView, C21486hBd c21486hBd, View view) {
        Intrinsics.copydefault(oKSortTextView);
        OKSortTextView oKSortTextView2 = c21486hBd.KWHzl;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
        positionComponentFragment.copydefault(oKSortTextView, oKSortTextView2, AdvancedAssetSort.VALUE);
        positionComponentFragment.AEQbTJ("value_sort");
    }

    public static final void AEQbTJ(PositionComponentFragment positionComponentFragment, OKSortTextView oKSortTextView, C21486hBd c21486hBd, View view) {
        Intrinsics.copydefault(oKSortTextView);
        OKSortTextView oKSortTextView2 = c21486hBd.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(oKSortTextView2, "");
        positionComponentFragment.copydefault(oKSortTextView, oKSortTextView2, AdvancedAssetSort.PNL);
        positionComponentFragment.AEQbTJ("pnl_sort");
    }

    public final void copydefault(OKSortTextView oKSortTextView, OKSortTextView oKSortTextView2, AdvancedAssetSort advancedAssetSort) {
        OKSortTextView.SortType sortType;
        if (advancedAssetSort != AdvancedAssetSort.PNL || isConnected().copydefault().getValue().booleanValue()) {
            int i = ActionBar.EZpvd[oKSortTextView.AEQbTJ().ordinal()];
            if (i == 1) {
                sortType = OKSortTextView.SortType.UP;
            } else if (i == 2) {
                sortType = OKSortTextView.SortType.NONE;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                sortType = OKSortTextView.SortType.DOWN;
            }
            OKSortTextView.setSortType$default(oKSortTextView, sortType, false, 2, null);
            OKSortTextView.SortType sortType2 = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView2, sortType2, false, 2, null);
            AdvancedAssetsFilter advancedAssetsFilterEZpvd = isConnected().EZpvd();
            if (sortType == sortType2) {
                advancedAssetSort = AdvancedAssetSort.DEFAULT;
            }
            isConnected().OLrzqt(AdvancedAssetsFilter.copy$default(advancedAssetsFilterEZpvd, false, advancedAssetSort, sortType != OKSortTextView.SortType.UP, 1, null), false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void iwGUEr() {
        C21486hBd c21486hBd = (C21486hBd) fARcdN();
        if (c21486hBd != null) {
            OKSortTextView oKSortTextView = c21486hBd.OLrzqt;
            OKSortTextView.SortType sortType = OKSortTextView.SortType.NONE;
            OKSortTextView.setSortType$default(oKSortTextView, sortType, false, 2, null);
            OKSortTextView.setSortType$default(c21486hBd.KWHzl, sortType, false, 2, null);
        }
        isConnected().djBIcL();
    }

    public final void OLrzqt(C30765lhN c30765lhN) {
        PositionDetailsParam positionDetailsParam = new PositionDetailsParam(c30765lhN.gEmmrt(), c30765lhN.AEQbTJ(), c30765lhN.fetchVPNInfo(), c30765lhN.AhwBna(), "", false, c30765lhN.valueOf(), true);
        this.AhwBna = c30765lhN;
        C19846gRm.StateListAnimator stateListAnimator = C19846gRm.Companion;
        androidx.fragment.app.FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        stateListAnimator.KWHzl(parentFragmentManager, positionDetailsParam);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(C30765lhN c30765lhN) {
        RecyclerView recyclerView;
        C25392ivp.AEQbTJ(this, c30765lhN.AEQbTJ(), c30765lhN.gEmmrt(), "DEX_Trade_CEFI", c30765lhN.DbNXlk());
        AEQbTJ(DexTrackEventParameter.ButtonName.SHARE.getValue());
        C21486hBd c21486hBd = (C21486hBd) fARcdN();
        if (c21486hBd == null || (recyclerView = c21486hBd.gEmmrt) == null) {
            return;
        }
        recyclerView.addOnScrollListener(new Activity());
    }

    public static final class Activity extends RecyclerView.OnScrollListener {
        public Activity() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                PositionComponentFragment.this.fetchVPNInfo();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        RecyclerView recyclerView;
        C21486hBd c21486hBd = (C21486hBd) fARcdN();
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) ((c21486hBd == null || (recyclerView = c21486hBd.gEmmrt) == null) ? null : recyclerView.getLayoutManager());
        if (linearLayoutManager != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            pUU.KWHzl(getTAG(), "Position Visible: from " + iFindFirstVisibleItemPosition + " to " + iFindLastVisibleItemPosition);
            Set<C28438kal> setOLrzqt = djBIcL().OLrzqt(iFindFirstVisibleItemPosition, iFindLastVisibleItemPosition);
            pUU.KWHzl(getTAG(), "Visible tokens updated: " + setOLrzqt);
            isConnected().EZpvd(setOLrzqt);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z) {
        RecyclerView recyclerView;
        C55113xdn c55113xdn;
        C21486hBd c21486hBd = (C21486hBd) fARcdN();
        if (c21486hBd != null && (c55113xdn = c21486hBd.EZpvd) != null) {
            c55113xdn.setVisibility(z ? 0 : 8);
        }
        C21486hBd c21486hBd2 = (C21486hBd) fARcdN();
        if (c21486hBd2 == null || (recyclerView = c21486hBd2.gEmmrt) == null) {
            return;
        }
        recyclerView.setVisibility(z ? 4 : 0);
    }

    private final void fJNWhG() {
        isConnected().KWHzl(false);
    }

    @Override // o.gPW, o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        getFieldNames();
        isConnected().gEmmrt();
        if (this.valueOf) {
            this.valueOf = false;
        } else {
            fJNWhG();
        }
    }

    @Override // o.hTH, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        isConnected().isConnected();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.hTH, androidx.fragment.app.Fragment
    public void onDestroyView() {
        C55113xdn c55113xdn;
        djBIcL().KWHzl((Function1<? super C30765lhN, Unit>) null);
        djBIcL().EZpvd((Function1<? super C30765lhN, Unit>) null);
        this.AhwBna = null;
        C21486hBd c21486hBd = (C21486hBd) fARcdN();
        if (c21486hBd != null && (c55113xdn = c21486hBd.EZpvd) != null) {
            c55113xdn.copydefault();
        }
        super.onDestroyView();
    }

    private final void getFieldNames() {
        String chainId;
        C25452iww c25452iwwValues = values();
        DefiChainInfo defiChainInfoDbNXlk = AEQbTJ().DbNXlk();
        if (defiChainInfoDbNXlk == null || (chainId = defiChainInfoDbNXlk.getChainId()) == null) {
            chainId = "chain_id_all_network";
        }
        OrderAndPositionTab orderAndPositionTab = OrderAndPositionTab.Position;
        InterfaceC19811gQe interfaceC19811gQeEZpvd = C19812gQf.EZpvd(this);
        c25452iwwValues.OLrzqt(new AbstractC22407hel.TaskDescription(chainId, orderAndPositionTab, interfaceC19811gQeEZpvd != null ? interfaceC19811gQeEZpvd.OLrzqt() : null));
    }

    private final void AEQbTJ(String str) {
        String chainId;
        C25452iww c25452iwwValues = values();
        DefiChainInfo defiChainInfoDbNXlk = AEQbTJ().DbNXlk();
        if (defiChainInfoDbNXlk == null || (chainId = defiChainInfoDbNXlk.getChainId()) == null) {
            chainId = "chain_id_all_network";
        }
        OrderAndPositionTab orderAndPositionTab = OrderAndPositionTab.Position;
        InterfaceC19811gQe interfaceC19811gQeEZpvd = C19812gQf.EZpvd(this);
        c25452iwwValues.OLrzqt(new AbstractC22407hel.Application(chainId, orderAndPositionTab, str, interfaceC19811gQeEZpvd != null ? interfaceC19811gQeEZpvd.OLrzqt() : null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.gPW
    public void AhwBna() {
        RecyclerView recyclerView;
        C21486hBd c21486hBd = (C21486hBd) fARcdN();
        if (c21486hBd == null || (recyclerView = c21486hBd.gEmmrt) == null) {
            return;
        }
        recyclerView.smoothScrollToPosition(0);
    }

    @Override // o.gPW
    public boolean KWHzl() {
        return !isConnected().EZpvd().isDefaultFilter();
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map<C28438kal, PositionComponentVewModel.TaskDescription> map, Continuation<? super Unit> continuation) {
            PositionComponentFragment positionComponentFragment = PositionComponentFragment.this;
            for (Map.Entry<C28438kal, PositionComponentVewModel.TaskDescription> entry : map.entrySet()) {
                C28438kal key = entry.getKey();
                PositionComponentVewModel.TaskDescription value = entry.getValue();
                positionComponentFragment.djBIcL().KWHzl(key.copydefault(), key.OLrzqt(), value.copydefault(), value.KWHzl(), value.OLrzqt(), value.EZpvd());
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
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map<C28438kal, PositionComponentVewModel.TaskDescription> map, Continuation<? super Unit> continuation) {
            PositionComponentFragment positionComponentFragment = PositionComponentFragment.this;
            for (Map.Entry<C28438kal, PositionComponentVewModel.TaskDescription> entry : map.entrySet()) {
                C28438kal key = entry.getKey();
                PositionComponentVewModel.TaskDescription value = entry.getValue();
                positionComponentFragment.djBIcL().KWHzl(key.copydefault(), key.OLrzqt(), value.copydefault(), value.KWHzl(), value.OLrzqt(), value.EZpvd());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final Object emit(Map<C28438kal, PositionComponentVewModel.TaskDescription> map, Continuation<? super Unit> continuation) {
            PositionComponentFragment positionComponentFragment = PositionComponentFragment.this;
            for (Map.Entry<C28438kal, PositionComponentVewModel.TaskDescription> entry : map.entrySet()) {
                C28438kal key = entry.getKey();
                PositionComponentVewModel.TaskDescription value = entry.getValue();
                positionComponentFragment.djBIcL().KWHzl(key.copydefault(), key.OLrzqt(), value.copydefault(), value.KWHzl(), value.OLrzqt(), value.EZpvd());
            }
            return Unit.INSTANCE;
        }
    }
}

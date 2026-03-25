package com.okinc.business.dexui.main.limitorder;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.api.bean.LimitParam;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.tee.swap.limit.ui.viewmodel.SwapLimitHomeViewModel;
import com.okinc.business.dex.trade.component.orderandposition.event.OrderAndPositionEventViewModel;
import com.okinc.business.dexlogic.bean.DefiChainInfo;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.dexlogic.bean.SwapBottomParamsBean;
import com.okinc.business.dexlogic.bean.track.ButtonType;
import com.okinc.business.dexlogic.bean.track.EventPageNameType;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import com.okinc.business.dexlogic.main.limmitorder.bean.TabTitleInfo;
import com.okinc.business.dexlogic.main.swap.trade.bean.CurrentChain;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.dexlogic.track.enums.BusinessType;
import com.okinc.business.dexui.main.limitorder.LimitOrderFragment;
import com.okinc.business.dexui.main.swap.trade.TriggeredFrom;
import com.okinc.business.dexui.main.swap.trade.single.advanced.SingleSwapAdvanceFragment;
import com.okinc.business.trade.features.home.ui.DexHomeFragment;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.liveness.lca.EopTrackEvent;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C19680gLi;
import o.C19812gQf;
import o.C21847hOn;
import o.C22372heC;
import o.C22380heK;
import o.C22495hgT;
import o.C22831hml;
import o.C22877hne;
import o.C23274hvD;
import o.C23304hvh;
import o.C23317hvu;
import o.C24473ieW;
import o.C25295ity;
import o.C25333iuj;
import o.C25352ivB;
import o.C25390ivn;
import o.C31200lpY;
import o.C33050mpD;
import o.C33070mpX;
import o.C33129mqd;
import o.C52761wXj;
import o.C55173xeu;
import o.C56390yDp;
import o.C56392yDr;
import o.C56424yEw;
import o.C56524yIo;
import o.C57600ylV;
import o.C59405zgS;
import o.C6965aZN;
import o.InterfaceC19679gLh;
import o.InterfaceC56387yDm;
import o.InterfaceC56388yDn;
import o.InterfaceC56514yIe;
import o.InterfaceC9738bbJ;
import o.hAE;
import o.hIC;
import o.hNV;
import o.pUU;
import o.rVN;
import o.yCM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LimitOrderFragment extends hIC<hAE> implements InterfaceC19679gLh {
    public final Object AYXKKw;
    public Function0<Unit> DbNXlk;

    @yCM
    public C6965aZN dexSwapTracker;
    public final InterfaceC56387yDm fARcdN;
    public C25333iuj fIwbmz;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public String valueOf;
    public hNV values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AhwBna = 8;
    public final InterfaceC56387yDm isConnected = C19812gQf.OLrzqt(this);
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.hKD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LimitOrderFragment.DbNXlk(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.hKB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return LimitOrderFragment.djBIcL(this.KWHzl);
        }
    });

    public static final /* synthetic */ class FragmentManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC24860ilm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hAE hae, Bundle bundle) {
        Intrinsics.checkNotNullParameter(hae, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC24860ilm, o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.zAEkPU;
    }

    public LimitOrderFragment() {
        final Function0 function0 = new Function0() { // from class: o.hKF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderFragment.fetchVPNInfo(this.KWHzl);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$1
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$4
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
        final Function0<Fragment> function03 = new Function0<Fragment>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$6
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SwapLimitHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.limitorder.LimitOrderFragment$special$$inlined$viewModels$default$9
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
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.hKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return LimitOrderFragment.AhwBna(this.copydefault);
            }
        });
        this.valueOf = "";
        this.AYXKKw = new Object();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexui.main.limitorder.LimitOrderFragment.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ LimitOrderFragment newInstance$default(TaskDescription taskDescription, String str, LimitParam limitParam, int i, Object obj) {
            if ((i & 2) != 0) {
                limitParam = null;
            }
            return taskDescription.AEQbTJ(str, limitParam);
        }

        public final LimitOrderFragment AEQbTJ(@NotNull String str, LimitParam limitParam) {
            Intrinsics.checkNotNullParameter(str, "");
            LimitOrderFragment limitOrderFragment = new LimitOrderFragment();
            Bundle bundle = new Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putParcelable("data", limitParam);
            limitOrderFragment.setArguments(bundle);
            return limitOrderFragment;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OrderAndPositionEventViewModel isConnected() {
        return (OrderAndPositionEventViewModel) this.isConnected.getValue();
    }

    private final LimitParam DbNXlk() {
        return (LimitParam) this.AkhnZx.getValue();
    }

    public static final LimitParam DbNXlk(LimitOrderFragment limitOrderFragment) {
        Bundle arguments = limitOrderFragment.getArguments();
        LimitParam limitParam = arguments != null ? (LimitParam) ((Parcelable) BundleCompat.getParcelable(arguments, "data", LimitParam.class)) : null;
        if (limitParam instanceof LimitParam) {
            return limitParam;
        }
        return null;
    }

    private final C22831hml values() {
        return (C22831hml) this.djBIcL.getValue();
    }

    public static final Fragment copydefault(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public static final C22831hml djBIcL(LimitOrderFragment limitOrderFragment) {
        Object next;
        C22831hml c22831hml;
        Intrinsics.copydefault(limitOrderFragment, "");
        Iterator it = C59405zgS.EZpvd(limitOrderFragment, (Function1<? super LimitOrderFragment, ? extends LimitOrderFragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.hKG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderFragment.copydefault((androidx.fragment.app.Fragment) obj);
            }
        })).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((Fragment) next) instanceof SingleSwapAdvanceFragment) {
                break;
            }
        }
        return (((Fragment) next) == null || (c22831hml = (C22831hml) new ViewModelProvider(limitOrderFragment, limitOrderFragment.new Activity()).get(C22831hml.class)) == null) ? (C22831hml) new ViewModelProvider(limitOrderFragment, limitOrderFragment.new StateListAnimator()).get(C22831hml.class) : c22831hml;
    }

    public static final class Activity implements ViewModelProvider.Factory {
        public Activity() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C22831hml(LimitOrderFragment.this.zuBGHE());
        }
    }

    public static final class StateListAnimator implements ViewModelProvider.Factory {
        public StateListAnimator() {
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Intrinsics.checkNotNullParameter(cls, "");
            return new C22831hml(LimitOrderFragment.this.zuBGHE());
        }
    }

    private final DexHomeViewModel fetchVPNInfo() {
        return (DexHomeViewModel) this.fetchVPNInfo.getValue();
    }

    public static final Fragment KWHzl(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getParentFragment();
    }

    public static final ViewModelStoreOwner fetchVPNInfo(LimitOrderFragment limitOrderFragment) {
        Object next;
        Iterator it = C59405zgS.EZpvd(limitOrderFragment.getParentFragment(), (Function1<? super Fragment, ? extends Fragment>) ((Function1<? super Object, ? extends Object>) new Function1() { // from class: o.hKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderFragment.KWHzl((androidx.fragment.app.Fragment) obj);
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
        FragmentActivity fragmentActivityRequireActivity = limitOrderFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    public final SwapLimitHomeViewModel AhwBna() {
        return (SwapLimitHomeViewModel) this.fARcdN.getValue();
    }

    public static final C19680gLi AhwBna(LimitOrderFragment limitOrderFragment) {
        return new C19680gLi(limitOrderFragment);
    }

    private final C19680gLi AkhnZx() {
        return (C19680gLi) this.gEmmrt.getValue();
    }

    /* JADX DEBUG: Possible override for method o.hIC.KWHzl()V */
    public final C6965aZN KWHzl() {
        C6965aZN c6965aZN = this.dexSwapTracker;
        if (c6965aZN != null) {
            return c6965aZN;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    @Override // o.AbstractC24860ilm, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        values().AYXKKw();
    }

    /* JADX DEBUG: Method merged with bridge method: EZpvd(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC24860ilm
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public hAE EZpvd(@NotNull LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hAE haeKWHzl = hAE.KWHzl(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(haeKWHzl, "");
        return haeKWHzl;
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        C23317hvu.valueOf(TabTitleInfo.KEY_LIMIT_ORDER);
        C25295ity.AEQbTJ("swap", "limit", C25295ity.copydefault(C22372heC.EZpvd(zuBGHE())), DexTrackEventParameter.AEQbTJ.OLrzqt(zuBGHE()));
        AkhnZx().EZpvd();
        if (AhwBna().KWHzl().getValue() == null) {
            copydefault(true);
            AhwBna().EZpvd();
        }
        fJNWhG();
        values().EZpvd().setValue(Boolean.TRUE);
        C25333iuj c25333iuj = this.fIwbmz;
        if (c25333iuj != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            c25333iuj.EZpvd(fragmentActivityRequireActivity);
        }
    }

    @Override // o.InterfaceC19679gLh
    public View copydefault() {
        C25333iuj c25333iuj = this.fIwbmz;
        if (c25333iuj != null) {
            return c25333iuj;
        }
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        C25333iuj c25333iuj2 = new C25333iuj(contextRequireContext, null, true, fetchVPNInfo().fARcdN(), fetchVPNInfo().isConnected(), 2, null);
        this.fIwbmz = c25333iuj2;
        c25333iuj2.setContainerViewMoreVisible(true);
        fARcdN();
        return this.fIwbmz;
    }

    private final void fJNWhG() {
        String strOLrzqt;
        String chainId;
        if (C21847hOn.valueOf()) {
            C21847hOn.KWHzl(false);
            strOLrzqt = "MARKET";
        } else {
            strOLrzqt = DexTrackEventParameter.AEQbTJ.OLrzqt(zuBGHE());
        }
        C22380heK c22380heK = C22380heK.OLrzqt;
        DexMultiTokenInfoBean value = c22380heK.copydefault(zuBGHE()).AYXKKw().AEQbTJ().getValue();
        if (value == null || (chainId = value.getChainId()) == null) {
            chainId = MultiTransferSignData.DEFAULT_INTERVAL;
        }
        InterfaceC9738bbJ interfaceC9738bbJAEQbTJ = c22380heK.copydefault(zuBGHE()).fARcdN().AEQbTJ();
        String strEZpvd = interfaceC9738bbJAEQbTJ != null ? interfaceC9738bbJAEQbTJ.EZpvd(C33129mqd.valueOf(chainId)) : null;
        C22877hne c22877hne = C22877hne.OLrzqt;
        String strZuBGHE = zuBGHE();
        String value2 = BusinessType.LIMIT.getValue();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            strEZpvd = "";
        }
        c22877hne.KWHzl(strZuBGHE, strOLrzqt, value2, strEZpvd);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        AkhnZx().OLrzqt();
        Function0<Unit> function0 = this.DbNXlk;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        AYXKKw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        ViewStub viewStub;
        ViewStub viewStub2;
        hAE hae = (hAE) AwvSrB();
        if (hae == null || (viewStub = hae.EZpvd) == null || viewStub.isInLayout() || this.values != null) {
            return;
        }
        hAE hae2 = (hAE) AwvSrB();
        View viewInflate = (hae2 == null || (viewStub2 = hae2.EZpvd) == null) ? null : viewStub2.inflate();
        hNV hnv = viewInflate instanceof hNV ? (hNV) viewInflate : null;
        this.values = hnv;
        if (hnv != null) {
            hnv.setPaddingRelative(hnv.getPaddingStart(), getResources().getDimensionPixelOffset(C52761wXj.StateListAnimator.finit), hnv.getPaddingEnd(), hnv.getPaddingBottom());
            try {
                getChildFragmentManager().beginTransaction().replace(hnv.OLrzqt().getId(), LimitOrderContentFragment.Companion.copydefault(zuBGHE(), DbNXlk())).commitNowAllowingStateLoss();
            } catch (IllegalStateException e) {
                pUU.copydefault("LimitOrderFragment", "Failed to perform transaction: " + e.getMessage());
            }
        }
        valueOf();
    }

    private final void valueOf() {
        if (this.values != null) {
            C25390ivn.EZpvd(this, isConnected().gEmmrt(), Lifecycle.State.RESUMED, new Application());
        }
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final Object emit(Unit unit, Continuation<? super Unit> continuation) {
            final LimitOrderFragment limitOrderFragment = LimitOrderFragment.this;
            limitOrderFragment.copydefault((Function0<Unit>) new Function0() { // from class: o.hKQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderFragment.Application.KWHzl(limitOrderFragment);
                }
            });
            return Unit.INSTANCE;
        }

        public static final Unit KWHzl(LimitOrderFragment limitOrderFragment) {
            limitOrderFragment.isConnected().KWHzl();
            return Unit.INSTANCE;
        }
    }

    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return copydefault(((Boolean) obj).booleanValue(), continuation);
        }

        public final Object copydefault(boolean z, Continuation<? super Unit> continuation) {
            C25333iuj c25333iuj = LimitOrderFragment.this.fIwbmz;
            if (c25333iuj != null) {
                c25333iuj.setVisibility(z ? 8 : 0);
            }
            LimitOrderFragment.this.AEQbTJ(z);
            return Unit.INSTANCE;
        }
    }

    private final void AYXKKw() {
        C25390ivn.collectOnViewLifecycle$default(this, AhwBna().OLrzqt(), null, new ActionBar(), 2, null);
        AhwBna().KWHzl().observe(getViewLifecycleOwner(), new FragmentManager(new Function1() { // from class: o.hKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderFragment.EZpvd(this.EZpvd, (CurrentChain) obj);
            }
        }));
    }

    public static final Unit EZpvd(LimitOrderFragment limitOrderFragment, CurrentChain currentChain) {
        DefiChainInfo data;
        DefiChainInfo data2;
        String chainName = (currentChain == null || (data2 = currentChain.getData()) == null) ? null : data2.getChainName();
        if (chainName == null) {
            chainName = "";
        }
        limitOrderFragment.valueOf = chainName;
        C22831hml c22831hmlValues = limitOrderFragment.values();
        String chainName2 = (currentChain == null || (data = currentChain.getData()) == null) ? null : data.getChainName();
        c22831hmlValues.copydefault(chainName2 != null ? chainName2 : "");
        limitOrderFragment.gEmmrt();
        limitOrderFragment.copydefault(false);
        rVN.reportFullyDrawn$default((Fragment) limitOrderFragment, true, (String) null, 2, (Object) null);
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        C25333iuj c25333iuj = this.fIwbmz;
        if (c25333iuj != null) {
            c25333iuj.setOnKlineIconClick(new Function0() { // from class: o.hKK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderFragment.values(this.EZpvd);
                }
            });
        }
        C25333iuj c25333iuj2 = this.fIwbmz;
        if (c25333iuj2 != null) {
            c25333iuj2.setOnMoreIconClick(new Function1() { // from class: o.hKM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return LimitOrderFragment.AEQbTJ(this.EZpvd, ((java.lang.Integer) obj).intValue());
                }
            });
        }
    }

    public static final Unit values(LimitOrderFragment limitOrderFragment) {
        DexMultiTokenInfoBean dexMultiTokenInfoBeanCopydefault;
        String chainId;
        String tokenName;
        String tokenSymbol;
        String chainBWLogoUrl;
        String chainLogoUrl;
        String tokenLogoUrl;
        String originContractAddress;
        C22495hgT c22495hgTDbNXlk;
        if (limitOrderFragment.getHost() != null) {
            LimitOrderContentFragment limitOrderContentFragmentDjBIcL = limitOrderFragment.djBIcL();
            if (limitOrderContentFragmentDjBIcL == null || (c22495hgTDbNXlk = limitOrderContentFragmentDjBIcL.DbNXlk()) == null || (dexMultiTokenInfoBeanCopydefault = c22495hgTDbNXlk.QKudOq()) == null) {
                dexMultiTokenInfoBeanCopydefault = C22380heK.OLrzqt.copydefault(limitOrderFragment.zuBGHE()).AYXKKw().copydefault();
            }
            Context context = limitOrderFragment.getContext();
            if (context != null) {
                String strZuBGHE = limitOrderFragment.zuBGHE();
                if (dexMultiTokenInfoBeanCopydefault == null || (chainId = dexMultiTokenInfoBeanCopydefault.getChainId()) == null) {
                    chainId = "1";
                }
                String str = chainId;
                String chainName = dexMultiTokenInfoBeanCopydefault != null ? dexMultiTokenInfoBeanCopydefault.getChainName() : null;
                C25352ivB.openMarketDetailPage$default(context, strZuBGHE, new TokenBase(str, (dexMultiTokenInfoBeanCopydefault == null || (originContractAddress = dexMultiTokenInfoBeanCopydefault.getOriginContractAddress()) == null) ? "" : originContractAddress, (dexMultiTokenInfoBeanCopydefault == null || (tokenLogoUrl = dexMultiTokenInfoBeanCopydefault.getTokenLogoUrl()) == null) ? "" : tokenLogoUrl, (dexMultiTokenInfoBeanCopydefault == null || (chainLogoUrl = dexMultiTokenInfoBeanCopydefault.getChainLogoUrl()) == null) ? "" : chainLogoUrl, (dexMultiTokenInfoBeanCopydefault == null || (chainBWLogoUrl = dexMultiTokenInfoBeanCopydefault.getChainBWLogoUrl()) == null) ? "" : chainBWLogoUrl, (dexMultiTokenInfoBeanCopydefault == null || (tokenSymbol = dexMultiTokenInfoBeanCopydefault.getTokenSymbol()) == null) ? "" : tokenSymbol, (dexMultiTokenInfoBeanCopydefault == null || (tokenName = dexMultiTokenInfoBeanCopydefault.getTokenName()) == null) ? "" : tokenName, -1, 0, 0, 0, null, "view_details", null, "type_limit", chainName == null ? "" : chainName, null, 0, 0, false, null, null, false, true, null, null, null, 0, false, null, null, false, -8442112, null), "trade_swap", null, new int[0], 8, null);
            }
            limitOrderFragment.EZpvd(DexTrackEventParameter.ButtonName.KLINE.getValue());
        }
        C6965aZN c6965aZNKWHzl = limitOrderFragment.KWHzl();
        DexMultiTokenInfoBean value = C22380heK.OLrzqt.copydefault(limitOrderFragment.zuBGHE()).AYXKKw().AEQbTJ().getValue();
        String chainId2 = value != null ? value.getChainId() : null;
        C6965aZN.trackEventPageClick$default(c6965aZNKWHzl, chainId2 == null ? "" : chainId2, C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.K_LINE.getButtonName())), null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(LimitOrderFragment limitOrderFragment, int i) {
        limitOrderFragment.OLrzqt(i);
        return Unit.INSTANCE;
    }

    private final void OLrzqt(int i) {
        C24473ieW c24473ieWAEQbTJ = C24473ieW.Companion.AEQbTJ(zuBGHE(), new SwapBottomParamsBean(false, false, null, false, zuBGHE(), null, null, false, null, null, null, null, false, i, true, "advanced", 8166, null), true, TriggeredFrom.SwapLimit);
        c24473ieWAEQbTJ.KWHzl(new Function1() { // from class: o.hKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return LimitOrderFragment.EZpvd(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        c24473ieWAEQbTJ.show(getChildFragmentManager(), C24473ieW.class.getName());
        EZpvd(DexTrackEventParameter.ButtonName.MORE.getValue());
        C6965aZN c6965aZNKWHzl = KWHzl();
        C22380heK c22380heK = C22380heK.OLrzqt;
        DexMultiTokenInfoBean value = c22380heK.copydefault(zuBGHE()).AYXKKw().AEQbTJ().getValue();
        String chainId = value != null ? value.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        EventPageNameType eventPageNameType = EventPageNameType.HOME_GENERAL;
        C6965aZN.trackEventPageClick$default(c6965aZNKWHzl, chainId, C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, TrackButtonName.GENERAL_INFO_BASE.getButtonName())), eventPageNameType.getPageName(), null, 8, null);
        C6965aZN c6965aZNKWHzl2 = KWHzl();
        DexMultiTokenInfoBean value2 = c22380heK.copydefault(zuBGHE()).AYXKKw().AEQbTJ().getValue();
        String chainId2 = value2 != null ? value2.getChainId() : null;
        C6965aZN.trackPageView$default(c6965aZNKWHzl2, chainId2 == null ? "" : chainId2, eventPageNameType.getPageName(), null, 4, null);
    }

    public static final Unit EZpvd(LimitOrderFragment limitOrderFragment, String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C6965aZN c6965aZNKWHzl = limitOrderFragment.KWHzl();
        DexMultiTokenInfoBean value = C22380heK.OLrzqt.copydefault(limitOrderFragment.zuBGHE()).AYXKKw().AEQbTJ().getValue();
        String chainId = value != null ? value.getChainId() : null;
        C6965aZN.trackEventPageClick$default(c6965aZNKWHzl, chainId == null ? "" : chainId, C56424yEw.gEmmrt(C56390yDp.OLrzqt("button_type", ButtonType.GENERAL.getType()), C56390yDp.OLrzqt(EopTrackEvent.KEY_BUTTON_NAME, str)), EventPageNameType.HOME_TRADE.getPageName(), null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.dexui.main.limitorder.LimitOrderFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refresh$default(LimitOrderFragment limitOrderFragment, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        limitOrderFragment.copydefault((Function0<Unit>) function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(final Function0<Unit> function0) {
        this.DbNXlk = function0;
        LimitOrderContentFragment limitOrderContentFragmentDjBIcL = djBIcL();
        if (limitOrderContentFragmentDjBIcL != null) {
            limitOrderContentFragmentDjBIcL.AYXKKw(new Function0() { // from class: o.hKJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return LimitOrderFragment.EZpvd(function0);
                }
            });
        }
    }

    public static final Unit EZpvd(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public final LimitOrderContentFragment djBIcL() {
        FrameLayout frameLayoutOLrzqt;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        hNV hnv = this.values;
        Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById((hnv == null || (frameLayoutOLrzqt = hnv.OLrzqt()) == null) ? 0 : frameLayoutOLrzqt.getId());
        if (fragmentFindFragmentById instanceof LimitOrderContentFragment) {
            return (LimitOrderContentFragment) fragmentFindFragmentById;
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.fIwbmz = null;
        this.values = null;
        C33050mpD.OLrzqt(this.AYXKKw);
        C22380heK.OLrzqt.copydefault(zuBGHE()).AhwBna().OLrzqt().setValue(LimitParam.Companion.AEQbTJ());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(boolean z) {
        C55173xeu c55173xeu;
        C55173xeu c55173xeu2;
        if (z) {
            hAE hae = (hAE) AwvSrB();
            if (hae != null && (c55173xeu2 = hae.KWHzl) != null) {
                c55173xeu2.setVisibility(0);
                c55173xeu2.setEmptyTypeImage(8);
                c55173xeu2.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
                c55173xeu2.setSubTitle((CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
                c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
                c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.hKE
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        LimitOrderFragment.KWHzl(this.OLrzqt, view);
                    }
                });
            }
            copydefault(false);
            return;
        }
        hAE hae2 = (hAE) AwvSrB();
        if (hae2 == null || (c55173xeu = hae2.KWHzl) == null) {
            return;
        }
        c55173xeu.setVisibility(8);
    }

    public static final void KWHzl(LimitOrderFragment limitOrderFragment, View view) {
        limitOrderFragment.copydefault(true);
        limitOrderFragment.AhwBna().EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(boolean z) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        if (z) {
            hAE hae = (hAE) AwvSrB();
            if (hae == null || (frameLayout2 = hae.AEQbTJ) == null) {
                return;
            }
            C23304hvh.EZpvd(frameLayout2);
            return;
        }
        hAE hae2 = (hAE) AwvSrB();
        if (hae2 == null || (frameLayout = hae2.AEQbTJ) == null) {
            return;
        }
        C57600ylV.AEQbTJ(frameLayout);
    }

    private final void EZpvd(String str) {
        C25295ity.KWHzl("limit", "limit", C25295ity.copydefault(C22372heC.EZpvd(zuBGHE())), str, this.valueOf);
    }
}

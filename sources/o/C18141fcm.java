package o;

import android.view.View;
import androidx.activity.result.ActivityResultCaller;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$adapter$2$1$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$adapter$2$1$2;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$adapter$2$1$4;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$handleButtonClicks$1$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$handleButtonClicks$2$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$handleJudgeForbiddenCheck$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$initFloatingButtons$2$1$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$initFloatingButtons$3$1$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$initView$1;
import com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingViewModel;
import com.okinc.business.defi.wallet.home.onboarding.ui.binders.DefiOnboardingTile;
import com.okinc.business.defi.wallet.home.viewmodel.DefiHomeContainerViewModel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.api.bean.UnsupportedWalletType;
import com.okinc.web3.security.track.Web3SecurityTrackEvent;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C10604brb;
import o.C13754dXa;
import o.C15714eSo;
import o.C52761wXj;
import o.InterfaceC18118fcP;
import o.InterfaceC18127fcY;
import o.InterfaceC43294rma;
import o.InterfaceC9739bbK;
import o.eLN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fcm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18141fcm extends AbstractC18125fcW {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public C16599emv AEQbTJ;
    public final int AYXKKw;
    public TaskDescription AhwBna;
    public final LoaderManager AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public boolean EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm fIwbmz;
    public final View.OnLayoutChangeListener fetchVPNInfo;
    public SimpleExoPlayer gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public final InterfaceC56387yDm values = C56392yDr.copydefault(new Function0() { // from class: o.fcN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C18141fcm.fJNWhG(this.AEQbTJ));
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.fcO
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18141fcm.fARcdN(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fcM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18141fcm.isConnected(this.EZpvd);
        }
    });

    /* JADX INFO: renamed from: o.fcm$StateListAnimator */
    public interface StateListAnimator {
        wYC OLrzqt();
    }

    /* JADX INFO: renamed from: o.fcm$TaskDescription */
    public interface TaskDescription {
        void OLrzqt(boolean z);
    }

    /* JADX INFO: renamed from: o.fcm$TaskStackBuilder */
    public static final /* synthetic */ class TaskStackBuilder implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskStackBuilder(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
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
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public C18141fcm() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DefiOnboardingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$7
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18304ffq.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$10
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
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$11
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$12
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C19629gJl.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.onboarding.ui.DefiOnboardingFragment$special$$inlined$viewModels$default$15
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.fcL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18141fcm.AkhnZx(this.AEQbTJ);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.fcu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18141fcm.AEQbTJ();
            }
        });
        this.AkhnZx = new LoaderManager();
        this.fetchVPNInfo = new View.OnLayoutChangeListener() { // from class: o.fct
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C18141fcm.copydefault(view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        };
        this.AYXKKw = C13754dXa.TaskDescription.iCPUKe;
    }

    public final eLN gEmmrt() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("ChooseCreateWalletFragment");
        if (fragmentFindFragmentByTag instanceof eLN) {
            return (eLN) fragmentFindFragmentByTag;
        }
        return null;
    }

    public static final int fJNWhG(C18141fcm c18141fcm) {
        return c18141fcm.AYXKKw();
    }

    public final int AhwBna() {
        return ((java.lang.Number) this.values.getValue()).intValue();
    }

    public final C18285ffX djBIcL() {
        return (C18285ffX) this.djBIcL.getValue();
    }

    public static final C18285ffX fARcdN(C18141fcm c18141fcm) {
        FragmentActivity fragmentActivityRequireActivity = c18141fcm.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (C18285ffX) new ViewModelProvider(fragmentActivityRequireActivity).get(C18285ffX.class);
    }

    private final C43316rmw getFieldNames() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    public static final C43316rmw isConnected(C18141fcm c18141fcm) {
        C43316rmw c43316rmw = new C43316rmw();
        c43316rmw.register(DefiOnboardingTile.TextTile.class, new C18189fdh(new DefiOnboardingFragment$adapter$2$1$1(c18141fcm)));
        c43316rmw.register(DefiOnboardingTile.ButtonTile.class, new C18183fdb(new DefiOnboardingFragment$adapter$2$1$2(c18141fcm)));
        c43316rmw.register(DefiOnboardingTile.StateListAnimator.class, new C18185fdd());
        c43316rmw.register(DefiOnboardingTile.TaskDescription.class, new C18184fdc(0.0f, c18141fcm.new Activity(), 1, null));
        c43316rmw.register(DefiOnboardingTile.Activity.class, new C18186fde());
        c43316rmw.register(DefiOnboardingTile.Application.class, new C18128fcZ());
        c43316rmw.register(DefiOnboardingTile.TokenGroupTile.class, new C18188fdg(0.0f, new DefiOnboardingFragment$adapter$2$1$4(c18141fcm), 1, null));
        return c43316rmw;
    }

    /* JADX INFO: renamed from: o.fcm$Activity */
    public static final class Activity implements yHO<java.lang.Integer, C18190fdi, C18126fcX, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // o.yHO
        public /* synthetic */ Unit invoke(java.lang.Integer num, C18190fdi c18190fdi, C18126fcX c18126fcX) {
            KWHzl(num.intValue(), c18190fdi.copydefault(), c18126fcX.EZpvd());
            return Unit.INSTANCE;
        }

        public final void KWHzl(int i, java.lang.String str, java.lang.String str2) {
            InterfaceC9773bbs interfaceC9773bbs;
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.util.List listKWHzl = C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
            if (listKWHzl == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)) == null) {
                return;
            }
            FragmentActivity fragmentActivityRequireActivity = C18141fcm.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            interfaceC9773bbs.copydefault(fragmentActivityRequireActivity, java.lang.String.valueOf(i), str, str2, false);
        }
    }

    public final DefiOnboardingViewModel DbNXlk() {
        return (DefiOnboardingViewModel) this.isConnected.getValue();
    }

    private final C18304ffq getNewProxyInstance() {
        return (C18304ffq) this.valueOf.getValue();
    }

    private final C19629gJl uzCIH() {
        return (C19629gJl) this.fIwbmz.getValue();
    }

    private final DefiHomeContainerViewModel hDKMBd() {
        return (DefiHomeContainerViewModel) this.KWHzl.getValue();
    }

    public static final DefiHomeContainerViewModel AkhnZx(C18141fcm c18141fcm) {
        FragmentActivity fragmentActivityRequireActivity = c18141fcm.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return (DefiHomeContainerViewModel) new ViewModelProvider(fragmentActivityRequireActivity).get(DefiHomeContainerViewModel.class);
    }

    public final java.lang.String valueOf() {
        return (java.lang.String) this.DbNXlk.getValue();
    }

    public static final java.lang.String AEQbTJ() {
        C34704nhP c34704nhP = C34704nhP.copydefault;
        java.lang.String str = (java.lang.String) yDV.zsXlph(c34704nhP.KWHzl());
        return str == null ? c34704nhP.AEQbTJ() : str;
    }

    /* JADX INFO: renamed from: o.fcm$LoaderManager */
    public static final class LoaderManager implements Player.EventListener {
        public LoaderManager() {
        }

        @Override // com.google.android.exoplayer2.Player.EventListener
        public void onPlaybackStateChanged(int i) {
            if (i == 3) {
                C18141fcm.this.requireActivity().getWindow().clearFlags(128);
            }
        }
    }

    public static final void copydefault(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iPx2dp$default = C55298xhM.px2dp$default(view.getMeasuredWidth(), (android.content.Context) null, 1, (java.lang.Object) null);
        PlayerView playerView = view instanceof PlayerView ? (PlayerView) view : null;
        if (playerView != null) {
            playerView.setResizeMode(iPx2dp$default > 600 ? 2 : 3);
        }
    }

    @Override // o.AbstractC18125fcW, androidx.fragment.app.Fragment
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        ActivityResultCaller parentFragment = getParentFragment();
        TaskDescription taskDescription = null;
        TaskDescription taskDescription2 = parentFragment instanceof TaskDescription ? (TaskDescription) parentFragment : null;
        if (taskDescription2 == null) {
            pUU.copydefault(getTAG(), "onAttach: parentFragment is not OnOnboardingVideoSoundToggleListener");
        } else {
            taskDescription = taskDescription2;
        }
        this.AhwBna = taskDescription;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        dTU.onWeb3Event$default("Web3Onboarding_Intro_Page_View", null, new Function1() { // from class: o.fcq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18141fcm.copydefault((EventParamsList) obj);
            }
        }, 1, null);
        getNewProxyInstance().OLrzqt("DefiOnboardingFragment");
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        C14494dmX.KWHzl.AEQbTJ(eventParamsList, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.fcm$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C18141fcm AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C18141fcm c18141fcm) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = c18141fcm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C14494dmX.KWHzl.AEQbTJ("import_wallet", Web3SecurityTrackEvent.VALUE_IMPORT);
                C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C18141fcm c18141fcm = this.AEQbTJ;
                instance$default.KWHzl(contextRequireContext, c18141fcm, c18141fcm.new Fragment());
            }
        }
    }

    /* JADX INFO: renamed from: o.fcm$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C18141fcm OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C18141fcm c18141fcm) {
            this.KWHzl = view;
            this.copydefault = j;
            this.OLrzqt = c18141fcm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C14494dmX.KWHzl.AEQbTJ("create_wallet", "create");
                C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                C18141fcm c18141fcm = this.OLrzqt;
                instance$default.KWHzl(contextRequireContext, c18141fcm, c18141fcm.new Dialog());
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        PlayerView playerView;
        RecyclerView recyclerView;
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = C16599emv.EZpvd(view);
        hDKMBd().EZpvd(true);
        isConnected();
        C16599emv c16599emv = this.AEQbTJ;
        if (c16599emv != null && (recyclerView = c16599emv.AYXKKw) != null) {
            recyclerView.setAdapter(getFieldNames());
        }
        values();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiOnboardingFragment$initView$1(this, null), 3, null);
        AbstractC58185ywX abstractC58185ywXEnsureInitialized$default = InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C11607cUn.OLrzqt((AbstractC58185ywX<?>) C58156yvv.EZpvd(abstractC58185ywXEnsureInitialized$default, viewLifecycleOwner), (Function1<? super java.lang.Throwable, Unit>) new Function1() { // from class: o.fcG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18141fcm.EZpvd(this.EZpvd, (java.lang.Throwable) obj);
            }
        }, (Function0<Unit>) new Function0() { // from class: o.fcI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18141fcm.AuCTel(this.copydefault);
            }
        });
        AkhnZx();
        try {
            Result.Application application = Result.Companion;
            fetchVPNInfo();
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C16599emv c16599emv2 = this.AEQbTJ;
        if (c16599emv2 != null && (playerView = c16599emv2.djBIcL) != null) {
            playerView.addOnLayoutChangeListener(this.fetchVPNInfo);
        }
        hDKMBd().valueOf();
    }

    public static final Unit AuCTel(C18141fcm c18141fcm) {
        c18141fcm.dismissLoading();
        c18141fcm.DbNXlk().AYXKKw();
        c18141fcm.EZpvd = true;
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C18141fcm c18141fcm, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        c18141fcm.dismissLoading();
        c18141fcm.DbNXlk().AYXKKw();
        return Unit.INSTANCE;
    }

    public final void fetchVPNInfo() {
        wYC wycOLrzqt;
        PlayerView playerView;
        if (this.gEmmrt == null) {
            this.gEmmrt = new SimpleExoPlayer.Builder(requireContext()).build();
        }
        C16599emv c16599emv = this.AEQbTJ;
        if (c16599emv != null && (playerView = c16599emv.djBIcL) != null) {
            playerView.setPlayer(this.gEmmrt);
        }
        android.net.Uri uriBuildRawResourceUri = RawResourceDataSource.buildRawResourceUri(C33492mxV.OLrzqt() ? C13754dXa.Fragment.isConnected : C13754dXa.Fragment.fJNWhG);
        Intrinsics.checkNotNullExpressionValue(uriBuildRawResourceUri, "");
        MediaItem mediaItemFromUri = MediaItem.fromUri(uriBuildRawResourceUri);
        Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "");
        SimpleExoPlayer simpleExoPlayer = this.gEmmrt;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setMediaItem(mediaItemFromUri);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.gEmmrt;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.setVolume(0.0f);
        }
        SimpleExoPlayer simpleExoPlayer3 = this.gEmmrt;
        if (simpleExoPlayer3 != null) {
            simpleExoPlayer3.setRepeatMode(2);
        }
        SimpleExoPlayer simpleExoPlayer4 = this.gEmmrt;
        if (simpleExoPlayer4 != null) {
            simpleExoPlayer4.removeListener(this.AkhnZx);
        }
        SimpleExoPlayer simpleExoPlayer5 = this.gEmmrt;
        if (simpleExoPlayer5 != null) {
            simpleExoPlayer5.addListener(this.AkhnZx);
        }
        ActivityResultCaller parentFragment = getParentFragment();
        StateListAnimator stateListAnimator = parentFragment instanceof StateListAnimator ? (StateListAnimator) parentFragment : null;
        if (stateListAnimator != null && (wycOLrzqt = stateListAnimator.OLrzqt()) != null) {
            wycOLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.fcJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C18141fcm.OLrzqt(this.OLrzqt, view);
                }
            });
        }
        SimpleExoPlayer simpleExoPlayer6 = this.gEmmrt;
        if (simpleExoPlayer6 != null) {
            simpleExoPlayer6.prepare();
        }
        SimpleExoPlayer simpleExoPlayer7 = this.gEmmrt;
        if (simpleExoPlayer7 != null) {
            simpleExoPlayer7.play();
        }
    }

    public static final void OLrzqt(C18141fcm c18141fcm, android.view.View view) {
        c18141fcm.AuCTel();
    }

    public final void AuCTel() {
        wYC wycOLrzqt;
        SimpleExoPlayer simpleExoPlayer = this.gEmmrt;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.setVolume(Intrinsics.EZpvd(simpleExoPlayer != null ? java.lang.Float.valueOf(simpleExoPlayer.getVolume()) : null, 0.0f) ? 1.0f : 0.0f);
        }
        TaskDescription taskDescription = this.AhwBna;
        if (taskDescription != null) {
            taskDescription.OLrzqt(!Intrinsics.EZpvd(this.gEmmrt != null ? java.lang.Float.valueOf(r3.getVolume()) : null, 0.0f));
        }
        ActivityResultCaller parentFragment = getParentFragment();
        StateListAnimator stateListAnimator = parentFragment instanceof StateListAnimator ? (StateListAnimator) parentFragment : null;
        if (stateListAnimator == null || (wycOLrzqt = stateListAnimator.OLrzqt()) == null) {
            return;
        }
        android.content.Context contextRequireContext = requireContext();
        SimpleExoPlayer simpleExoPlayer2 = this.gEmmrt;
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(contextRequireContext, Intrinsics.EZpvd(simpleExoPlayer2 != null ? java.lang.Float.valueOf(simpleExoPlayer2.getVolume()) : null, 0.0f) ? C13754dXa.Activity.RVsVBY : C13754dXa.Activity.QXDzTk);
        if (drawable != null) {
            drawable.setTint(ContextCompat.getColor(requireContext(), C52761wXj.Activity.QwvEab));
        }
        wycOLrzqt.setImageDrawable(drawable);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull android.content.res.Configuration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "");
        super.onConfigurationChanged(configuration);
        if ((configuration.uiMode & 48) != (getResources().getConfiguration().uiMode & 48)) {
            try {
                Result.Application application = Result.Companion;
                fetchVPNInfo();
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        PlayerView playerView;
        C16599emv c16599emv = this.AEQbTJ;
        if (c16599emv != null && (playerView = c16599emv.djBIcL) != null) {
            playerView.setVisibility(0);
        }
        SimpleExoPlayer simpleExoPlayer = this.gEmmrt;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.play();
        }
        ((xWN) C43251rlk.copydefault(xWN.class)).KWHzl(true);
        ((xWN) C43251rlk.copydefault(xWN.class)).EZpvd(true);
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
        PlayerView playerView;
        SimpleExoPlayer simpleExoPlayer = this.gEmmrt;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.pause();
        }
        C16599emv c16599emv = this.AEQbTJ;
        if (c16599emv == null || (playerView = c16599emv.djBIcL) == null) {
            return;
        }
        playerView.setVisibility(8);
    }

    public final void AEQbTJ(InterfaceC18118fcP interfaceC18118fcP) {
        C52794wYp c52794wYp;
        if (interfaceC18118fcP instanceof InterfaceC18118fcP.Application) {
            isConnected();
            return;
        }
        iwGUEr();
        C16599emv c16599emv = this.AEQbTJ;
        if (c16599emv != null && (c52794wYp = c16599emv.KWHzl) != null) {
            c52794wYp.setVisibility(C14728dqt.KWHzl.OLrzqt() ^ true ? 0 : 8);
        }
        if (interfaceC18118fcP instanceof InterfaceC18118fcP.Activity) {
            C43316rmw fieldNames = getFieldNames();
            fieldNames.setItems(((InterfaceC18118fcP.Activity) interfaceC18118fcP).AEQbTJ());
            fieldNames.notifyDataSetChanged();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void isConnected() {
        C16599emv c16599emv;
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        C16599emv c16599emv2 = this.AEQbTJ;
        if ((c16599emv2 != null && (lottieAnimationView2 = c16599emv2.AEQbTJ) != null && lottieAnimationView2.isAnimating()) || (c16599emv = this.AEQbTJ) == null || (lottieAnimationView = c16599emv.AEQbTJ) == null) {
            return;
        }
        lottieAnimationView.setVisibility(0);
        lottieAnimationView.setFailureListener(new LottieListener() { // from class: o.fcA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(java.lang.Object obj) {
                C18141fcm.djBIcL(this.EZpvd, (java.lang.Throwable) obj);
            }
        });
        lottieAnimationView.setAnimation(DbNXlk().KWHzl());
        lottieAnimationView.playAnimation();
        lottieAnimationView.setRepeatCount(-1);
    }

    public static final void djBIcL(C18141fcm c18141fcm, java.lang.Throwable th) {
        pUU.AEQbTJ(c18141fcm.getTAG(), "Failed to load Lottie animation: " + th.getMessage(), th);
    }

    private final void iwGUEr() {
        LottieAnimationView lottieAnimationView;
        C16599emv c16599emv = this.AEQbTJ;
        if (c16599emv == null || (lottieAnimationView = c16599emv.AEQbTJ) == null) {
            return;
        }
        lottieAnimationView.setVisibility(8);
        lottieAnimationView.pauseAnimation();
        lottieAnimationView.cancelAnimation();
    }

    public final void AkhnZx() {
        uzCIH().copydefault().observe(getViewLifecycleOwner(), new TaskStackBuilder(new Function1() { // from class: o.fcD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18141fcm.EZpvd(this.EZpvd, (AbstractC12782ctV) obj);
            }
        }));
    }

    public static final Unit EZpvd(C18141fcm c18141fcm, AbstractC12782ctV abstractC12782ctV) {
        eLN elnGEmmrt = c18141fcm.gEmmrt();
        if (elnGEmmrt != null) {
            elnGEmmrt.dismissAllowingStateLoss();
        }
        c18141fcm.hDKMBd().values();
        return Unit.INSTANCE;
    }

    public final void values() {
        C52794wYp c52794wYp;
        C52794wYp c52794wYp2;
        final C16599emv c16599emv = this.AEQbTJ;
        if (c16599emv != null) {
            c16599emv.EZpvd.setOverlayColor(ColorUtils.setAlphaComponent(C33070mpX.copydefault(C52761wXj.Activity.invokespecialODCBUN), 128));
            c16599emv.gEmmrt.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: o.fcK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                public final void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
                    C18141fcm.copydefault(this.AEQbTJ, c16599emv, nestedScrollView, i, i2, i3, i4);
                }
            });
        }
        C16599emv c16599emv2 = this.AEQbTJ;
        if (c16599emv2 != null && (c52794wYp2 = c16599emv2.KWHzl) != null) {
            c52794wYp2.setOnClickListener(new PendingIntent(c52794wYp2, 1000L, this));
        }
        C16599emv c16599emv3 = this.AEQbTJ;
        if (c16599emv3 == null || (c52794wYp = c16599emv3.copydefault) == null) {
            return;
        }
        c52794wYp.setOnClickListener(new FragmentManager(c52794wYp, 1000L, this));
    }

    public static final void copydefault(C18141fcm c18141fcm, C16599emv c16599emv, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(nestedScrollView, "");
        if (i2 <= c18141fcm.AhwBna()) {
            CardView cardView = c16599emv.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(cardView, "");
            cardView.setVisibility(8);
        } else {
            CardView cardView2 = c16599emv.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(cardView2, "");
            cardView2.setVisibility(0);
            c16599emv.OLrzqt.setAlpha(((float) (i2 - c18141fcm.AhwBna())) > 60.0f ? 1.0f : (i2 - c18141fcm.AhwBna()) / 60.0f);
        }
    }

    /* JADX INFO: renamed from: o.fcm$Dialog */
    public static final class Dialog implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            copydefault();
            return Unit.INSTANCE;
        }

        public final void copydefault() {
            C18141fcm.this.AEQbTJ(new DefiOnboardingFragment$initFloatingButtons$2$1$1(C18141fcm.this));
        }
    }

    /* JADX INFO: renamed from: o.fcm$Fragment */
    public static final class Fragment implements Function0<Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function0
        public /* synthetic */ Unit invoke() {
            AEQbTJ();
            return Unit.INSTANCE;
        }

        public final void AEQbTJ() {
            C18141fcm.this.AEQbTJ(new DefiOnboardingFragment$initFloatingButtons$3$1$1(C18141fcm.this));
        }
    }

    public final void AEQbTJ(InterfaceC18127fcY interfaceC18127fcY) {
        if (interfaceC18127fcY instanceof InterfaceC18127fcY.StateListAnimator) {
            C14494dmX.KWHzl.AEQbTJ("create_wallet", "create");
            C10604brb instance$default = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            instance$default.KWHzl(contextRequireContext, this, new Function0() { // from class: o.fcF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C18141fcm.ejfBZ(this.KWHzl);
                }
            });
            return;
        }
        if (interfaceC18127fcY instanceof InterfaceC18127fcY.Application) {
            C14494dmX.KWHzl.AEQbTJ("import_wallet", Web3SecurityTrackEvent.VALUE_IMPORT);
            C10604brb instance$default2 = C10604brb.Application.getInstance$default(C10604brb.Companion, null, 1, null);
            android.content.Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
            instance$default2.KWHzl(contextRequireContext2, this, new Function0() { // from class: o.fcH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C18141fcm.fIwbmz(this.OLrzqt);
                }
            });
            return;
        }
        if (interfaceC18127fcY instanceof InterfaceC18127fcY.TaskDescription.C0849TaskDescription) {
            C14494dmX.trackNewWalletMethodButtonClick$default(C14494dmX.KWHzl, "view_networks", null, 2, null);
            fARcdN();
            return;
        }
        if (interfaceC18127fcY instanceof InterfaceC18127fcY.TaskDescription.Application) {
            C14494dmX.trackNewWalletMethodButtonClick$default(C14494dmX.KWHzl, "buy_nft", null, 2, null);
            OLrzqt(valueOf() + "://wallet/nft/featured");
            return;
        }
        if (interfaceC18127fcY instanceof InterfaceC18127fcY.TaskDescription.ActionBar) {
            C14494dmX.trackNewWalletMethodButtonClick$default(C14494dmX.KWHzl, "swap_crypto", null, 2, null);
            djBIcL().OLrzqt().setValue(java.lang.Integer.valueOf(C18170fdO.Companion.EZpvd()));
            OLrzqt(gKZ.EZpvd.AEQbTJ("dex/swap"));
        } else if (interfaceC18127fcY instanceof InterfaceC18127fcY.TaskDescription.StateListAnimator) {
            C14494dmX.trackNewWalletMethodButtonClick$default(C14494dmX.KWHzl, "start_earning", null, 2, null);
            OLrzqt(valueOf() + "://wallet/invest/home");
        }
    }

    public static final Unit ejfBZ(C18141fcm c18141fcm) {
        c18141fcm.AEQbTJ(new DefiOnboardingFragment$handleButtonClicks$1$1(c18141fcm));
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C18141fcm c18141fcm) {
        c18141fcm.AEQbTJ(new DefiOnboardingFragment$handleButtonClicks$2$1(c18141fcm));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(AbstractC43238rlX abstractC43238rlX) {
        Intrinsics.checkNotNullParameter(abstractC43238rlX, "");
        return Unit.INSTANCE;
    }

    public final void OLrzqt(java.lang.String str) {
        InterfaceC43294rma interfaceC43294rma = (InterfaceC43294rma) C43251rlk.copydefault(InterfaceC43294rma.class);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        InterfaceC43294rma.Application.processDeeplink$default(interfaceC43294rma, fragmentActivityRequireActivity, str, null, new Function1() { // from class: o.fcB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18141fcm.AEQbTJ((AbstractC43238rlX) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
        eLN.TaskDescription.newInstance$default(eLN.Companion, new Function0() { // from class: o.fcs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18141fcm.hDKMBd(this.copydefault);
            }
        }, new Function0() { // from class: o.fcz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18141fcm.getNewProxyInstance(this.copydefault);
            }
        }, 0, true, C56402yEa.EZpvd(UnsupportedWalletType.MPCWallet), null, 36, null).show(getChildFragmentManager(), "ChooseCreateWalletFragment");
    }

    public static final Unit hDKMBd(C18141fcm c18141fcm) {
        c18141fcm.OLrzqt(ActionBar.Companion.EZpvd());
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(C18141fcm c18141fcm) {
        c18141fcm.OLrzqt(ActionBar.Companion.AEQbTJ());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(Function0<Unit> function0) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiOnboardingFragment$handleJudgeForbiddenCheck$1(function0, null), 3, null);
    }

    public final void OLrzqt(final int i) {
        EZpvd(new Function1() { // from class: o.fcE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18141fcm.copydefault(this.OLrzqt, i, (Unit) obj);
            }
        });
    }

    public static final Unit copydefault(final C18141fcm c18141fcm, final int i, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        androidx.fragment.app.FragmentManager childFragmentManager = c18141fcm.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        android.content.Context context = c18141fcm.getContext();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("from", ActionBar.AEQbTJ(i, ActionBar.Companion.AEQbTJ()) ? "create" : "create_mpc");
        Unit unit2 = Unit.INSTANCE;
        new C14469dlz(childFragmentManager, context, bundle, null, new Function1() { // from class: o.fcv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18141fcm.copydefault(i, c18141fcm, (java.lang.String) obj);
            }
        }, new Function0() { // from class: o.fcy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C18141fcm.OLrzqt();
            }
        }, null, null, 200, null).EZpvd();
        return unit2;
    }

    public static final Unit copydefault(int i, final C18141fcm c18141fcm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (ActionBar.AEQbTJ(i, ActionBar.Companion.AEQbTJ())) {
            new Function1() { // from class: o.fcC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18141fcm.copydefault(this.copydefault, (AbstractC12782ctV) obj);
                }
            };
            C19629gJl c19629gJlUzCIH = c18141fcm.uzCIH();
            androidx.fragment.app.FragmentManager supportFragmentManager = c18141fcm.requireActivity().getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
            C19629gJl.createHDWallet$default(c19629gJlUzCIH, str, supportFragmentManager, 1, null, 8, null);
        } else {
            eLN elnGEmmrt = c18141fcm.gEmmrt();
            if (elnGEmmrt != null) {
                elnGEmmrt.dismissAllowingStateLoss();
            }
            FragmentActivity activity = c18141fcm.getActivity();
            if (activity != null) {
                C15714eSo.TaskDescription.step$default(C15714eSo.Companion, activity, str, 0, false, true, 12, null);
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C18141fcm c18141fcm, AbstractC12782ctV abstractC12782ctV) {
        eLN elnGEmmrt = c18141fcm.gEmmrt();
        if (elnGEmmrt != null) {
            elnGEmmrt.dismissAllowingStateLoss();
        }
        c18141fcm.hDKMBd().values();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt() {
        return Unit.INSTANCE;
    }

    private final void EZpvd(final Function1<? super Unit, Unit> function1) {
        if (this.EZpvd) {
            function1.invoke(Unit.INSTANCE);
        } else {
            showLoading();
            C33024moe.subscribeOnIO$default(C58156yvv.OLrzqt(InterfaceC9739bbK.StateListAnimator.ensureInitialized$default(C10337bmZ.KWHzl, false, 1, null), this, Lifecycle.Event.ON_DESTROY), new Function1() { // from class: o.fcx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18141fcm.copydefault(this.KWHzl, (java.lang.Throwable) obj);
                }
            }, new Function0() { // from class: o.fcw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C18141fcm.AEQbTJ(this.OLrzqt, function1);
                }
            }, (Function1) null, 4, (java.lang.Object) null);
        }
    }

    public static final Unit copydefault(C18141fcm c18141fcm, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        pUU.copydefault(c18141fcm.getTAG(), "handleEnsureInitData error message :" + th.getMessage());
        c18141fcm.dismissLoading();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C18141fcm c18141fcm, Function1 function1) {
        c18141fcm.EZpvd = true;
        Unit unit = Unit.INSTANCE;
        function1.invoke(unit);
        c18141fcm.dismissLoading();
        return unit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void wlaJM() {
        EZpvd(new Function1() { // from class: o.fcr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18141fcm.OLrzqt(this.KWHzl, (Unit) obj);
            }
        });
    }

    public static final Unit OLrzqt(C18141fcm c18141fcm, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        C14616don.Companion.KWHzl((226 & 1) != 0 ? 1 : 0, (226 & 2) != 0 ? false : true, (226 & 4) != 0 ? null : null, (226 & 8) != 0 ? yDY.AhwBna() : null, (226 & 16) == 0, (226 & 32) != 0 ? null : null, (226 & 64) != 0 ? new java.util.ArrayList() : null, (226 & 128) == 0 ? null : null).show(c18141fcm.getChildFragmentManager(), c18141fcm.getTAG());
        return Unit.INSTANCE;
    }

    public final void fARcdN() {
        java.lang.Object next;
        InterfaceC18118fcP value = DbNXlk().OLrzqt().getValue();
        InterfaceC18118fcP.Activity activity = value instanceof InterfaceC18118fcP.Activity ? (InterfaceC18118fcP.Activity) value : null;
        if (activity == null) {
            return;
        }
        java.util.Iterator<T> it = activity.AEQbTJ().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((DefiOnboardingTile) next) instanceof DefiOnboardingTile.TokenGroupTile) {
                    break;
                }
            }
        }
        DefiOnboardingTile.TokenGroupTile tokenGroupTile = next instanceof DefiOnboardingTile.TokenGroupTile ? (DefiOnboardingTile.TokenGroupTile) next : null;
        if (tokenGroupTile == null) {
            return;
        }
        C18120fcR c18120fcREZpvd = C18120fcR.Companion.EZpvd(tokenGroupTile.KWHzl(), C13754dXa.FragmentManager.RXdAnZ);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c18120fcREZpvd.show(childFragmentManager);
    }

    public final int AYXKKw() {
        java.lang.Object systemService = requireContext().getSystemService("window");
        Intrinsics.copydefault(systemService, "");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return ((displayMetrics.widthPixels / 15) * 14) + C55298xhM.dp2px$default(110.0f, null, 1, null);
    }

    /* JADX INFO: renamed from: o.fcm$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fcm.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.fcm$ActionBar */
    public static final class ActionBar {
        public final int AEQbTJ;
        public static final TaskDescription Companion = new TaskDescription(null);
        public static final int copydefault = AEQbTJ(0);
        public static final int KWHzl = AEQbTJ(1);

        public static int AEQbTJ(int i) {
            return i;
        }

        public static final boolean AEQbTJ(int i, int i2) {
            return i == i2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static java.lang.String EZpvd(int i) {
            return "StartType(value=" + i + ")";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static boolean EZpvd(int i, java.lang.Object obj) {
            return (obj instanceof ActionBar) && i == ((ActionBar) obj).AEQbTJ();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static int KWHzl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final /* synthetic */ int AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            return EZpvd(this.AEQbTJ, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return KWHzl(this.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return EZpvd(this.AEQbTJ);
        }

        /* JADX INFO: renamed from: o.fcm$ActionBar$TaskDescription */
        public static final class TaskDescription {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fcm.ActionBar.TaskDescription.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private TaskDescription() {
            }

            public final int AEQbTJ() {
                return ActionBar.copydefault;
            }

            public final int EZpvd() {
                return ActionBar.KWHzl;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        SimpleExoPlayer simpleExoPlayer = this.gEmmrt;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.removeListener(this.AkhnZx);
        }
        SimpleExoPlayer simpleExoPlayer2 = this.gEmmrt;
        if (simpleExoPlayer2 != null) {
            simpleExoPlayer2.release();
        }
        this.gEmmrt = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        PlayerView playerView;
        PlayerView playerView2;
        wYC wycOLrzqt;
        ActivityResultCaller parentFragment = getParentFragment();
        StateListAnimator stateListAnimator = parentFragment instanceof StateListAnimator ? (StateListAnimator) parentFragment : null;
        if (stateListAnimator != null && (wycOLrzqt = stateListAnimator.OLrzqt()) != null) {
            wycOLrzqt.setOnClickListener(null);
        }
        C16599emv c16599emv = this.AEQbTJ;
        if (c16599emv != null && (playerView2 = c16599emv.djBIcL) != null) {
            playerView2.removeOnLayoutChangeListener(this.fetchVPNInfo);
        }
        C16599emv c16599emv2 = this.AEQbTJ;
        if (c16599emv2 != null && (playerView = c16599emv2.djBIcL) != null) {
            playerView.setPlayer(null);
        }
        this.AEQbTJ = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.AhwBna = null;
    }
}

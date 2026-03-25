package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.dexkline.market.common.marketconfig.domain.MarketConfig;
import com.okinc.dexkline.market.features.position.ui.PositionDetailsParam;
import com.okinc.dexkline.market.features.position.ui.PositionsViewModel;
import com.okinc.network.okg.response.OKServerException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ncK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34448ncK extends AbstractC34482ncs<C36080oOn> {
    public static final Application Companion = new Application(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;

    public C34448ncK() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.ncM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34448ncK.KWHzl(this.copydefault);
            }
        });
    }

    /* JADX INFO: renamed from: o.ncK$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ncK.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C34448ncK AEQbTJ(PositionDetailsParam positionDetailsParam, @NotNull MarketConfig marketConfig) {
            Intrinsics.checkNotNullParameter(marketConfig, "");
            C34448ncK c34448ncK = new C34448ncK();
            android.os.Bundle bundle = new android.os.Bundle();
            C34656ngH.AEQbTJ(bundle, positionDetailsParam != null ? positionDetailsParam.getSource() : null);
            bundle.putParcelable("key.position_details", positionDetailsParam);
            bundle.putParcelable("market_config", marketConfig);
            c34448ncK.setArguments(bundle);
            return c34448ncK;
        }
    }

    /* JADX DEBUG: Possible override for method o.ncs.djBIcL()V */
    public final PositionsViewModel djBIcL() {
        return (PositionsViewModel) this.AhwBna.getValue();
    }

    public final PositionDetailsParam valueOf() {
        return (PositionDetailsParam) this.AYXKKw.getValue();
    }

    public static final PositionDetailsParam KWHzl(C34448ncK c34448ncK) {
        android.os.Bundle arguments = c34448ncK.getArguments();
        if (arguments != null) {
            return (PositionDetailsParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.position_details", PositionDetailsParam.class));
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.mRH
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public C36080oOn KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C36080oOn c36080oOnOLrzqt = C36080oOn.OLrzqt(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c36080oOnOLrzqt, "");
        return c36080oOnOLrzqt;
    }

    @Override // o.mRH, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        djBIcL().ejfBZ();
    }

    @Override // o.mRH, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        djBIcL().fIwbmz();
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.mRH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void copydefault(@NotNull C36080oOn c36080oOn, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c36080oOn, "");
        gEmmrt();
        mUN.collectOnViewLifecycle$default(this, djBIcL().values(), null, new Activity(), 2, null);
        mUN.collectOnViewLifecycle$default(this, djBIcL().copydefault(), null, new TaskDescription(), 2, null);
    }

    /* JADX INFO: renamed from: o.ncK$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34446ncI c34446ncI, Continuation<? super Unit> continuation) {
            C34448ncK.this.copydefault(c34446ncI);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.ncK$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C34474nck c34474nck, Continuation<? super Unit> continuation) {
            C34448ncK.this.KWHzl(c34474nck);
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (djBIcL().isConnected()) {
            PositionsViewModel.loadData$default(djBIcL(), 0L, 1, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        C36080oOn c36080oOn = (C36080oOn) KWHzl();
        if (c36080oOn != null) {
            c36080oOn.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.ncL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C34448ncK.AEQbTJ(this.OLrzqt, view);
                }
            });
        }
    }

    public static final void AEQbTJ(C34448ncK c34448ncK, android.view.View view) {
        PositionsViewModel.loadData$default(c34448ncK.djBIcL(), 0L, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(C34446ncI c34446ncI) {
        C36080oOn c36080oOn = (C36080oOn) KWHzl();
        if (c36080oOn != null) {
            C55113xdn c55113xdn = c36080oOn.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 8;
            c55113xdn.setVisibility(c34446ncI.EZpvd() ? 0 : 8);
            C55173xeu c55173xeu = c36080oOn.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(c34446ncI.AEQbTJ() != null ? 0 : 8);
            FragmentContainerView fragmentContainerView = c36080oOn.KWHzl;
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
            if (c34446ncI.AEQbTJ() == null && !c34446ncI.EZpvd()) {
                i = 0;
            }
            fragmentContainerView.setVisibility(i);
            if (c34446ncI.AEQbTJ() != null) {
                OLrzqt(c34446ncI.AEQbTJ());
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(C34474nck c34474nck) {
        FragmentContainerView fragmentContainerView;
        if (c34474nck.AEQbTJ() || c34474nck.KWHzl() != null) {
            return;
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        C36080oOn c36080oOn = (C36080oOn) KWHzl();
        if (c36080oOn == null || (fragmentContainerView = c36080oOn.KWHzl) == null) {
            return;
        }
        int id = fragmentContainerView.getId();
        java.lang.String strValueOf = C56524yIo.AEQbTJ(C34483nct.class).valueOf();
        if (getChildFragmentManager().findFragmentByTag(strValueOf) != null) {
            return;
        }
        getChildFragmentManager().beginTransaction().replace(id, C34483nct.Companion.AEQbTJ(valueOf()), strValueOf).commitAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(java.lang.Throwable th) {
        C55173xeu c55173xeu;
        if ((th instanceof OKServerException) && ((OKServerException) th).getCode() == 6) {
            C36080oOn c36080oOn = (C36080oOn) KWHzl();
            if (c36080oOn == null || (c55173xeu = c36080oOn.OLrzqt) == null) {
                return;
            }
            c55173xeu.setEmptyTypeImage(6);
            c55173xeu.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.aCSzUz));
            c55173xeu.setSubTitle((java.lang.CharSequence) "");
            c55173xeu.setRetry("");
            return;
        }
        AhwBna();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AhwBna() {
        C55173xeu c55173xeu;
        C36080oOn c36080oOn = (C36080oOn) KWHzl();
        if (c36080oOn == null || (c55173xeu = c36080oOn.OLrzqt) == null) {
            return;
        }
        mUO.setNetworkError$default(c55173xeu, true, null, new Function0() { // from class: o.ncJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C34448ncK.OLrzqt(this.EZpvd);
            }
        }, 2, null);
    }

    public static final Unit OLrzqt(C34448ncK c34448ncK) {
        PositionsViewModel.loadData$default(c34448ncK.djBIcL(), 0L, 1, null);
        return Unit.INSTANCE;
    }
}

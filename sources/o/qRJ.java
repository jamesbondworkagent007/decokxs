package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.quotation.ui.model.ChargeGroupVo;
import com.okinc.market.search.features.navigation.spot.delegate.DefaultNavSpotSearchDelegate$setSpotSearchListeners$1$2;
import com.okinc.market.search.features.navigation.spot.viewmodel.NavSearchSpotGroupViewModel;
import com.okinc.trade.arch.util.Quartet;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.InterfaceC41641que;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qRJ {
    public androidx.fragment.app.Fragment AEQbTJ;
    public java.lang.Integer EZpvd;
    public android.content.Context KWHzl;
    public Function0<? extends NavSearchSpotGroupViewModel> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(Function0<? extends NavSearchSpotGroupViewModel> function0) {
        this.copydefault = function0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault() {
        this.AEQbTJ = null;
        this.KWHzl = null;
        this.copydefault = null;
    }

    public final NavSearchSpotGroupViewModel EZpvd() {
        Function0<? extends NavSearchSpotGroupViewModel> function0 = this.copydefault;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public void copydefault(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = fragment;
        this.KWHzl = fragment.getContext();
        this.copydefault = new Function0() { // from class: o.qRI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qRJ.EZpvd(fragment);
            }
        };
    }

    public <T extends InterfaceC40518qYv> void OLrzqt(@NotNull T t, @NotNull InterfaceC49363unD interfaceC49363unD, @NotNull Function2<? super T, ? super java.lang.Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(t, "");
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        Intrinsics.checkNotNullParameter(function2, "");
        NavSearchSpotGroupViewModel navSearchSpotGroupViewModelEZpvd = EZpvd();
        if (navSearchSpotGroupViewModelEZpvd != null) {
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(interfaceC49363unD, navSearchSpotGroupViewModelEZpvd, new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.navigation.spot.delegate.DefaultNavSpotSearchDelegate$setSpotSearchListeners$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((NavSearchSpotGroupViewModel.Application) obj).copydefault();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((NavSearchSpotGroupViewModel.Application) obj).KWHzl((InterfaceC49371unL<? extends Quartet<String, ? extends List<? extends InterfaceC41641que>, ? extends List<CategoryGroupVo>, ? extends List<ChargeGroupVo>>>) obj2);
                }
            }, null, new DefaultNavSpotSearchDelegate$setSpotSearchListeners$1$2(this, function2, t, null), 2, null);
        }
    }

    public void EZpvd(java.lang.String str) {
        NavSearchSpotGroupViewModel navSearchSpotGroupViewModelEZpvd = EZpvd();
        if (navSearchSpotGroupViewModelEZpvd != null) {
            NavSearchSpotGroupViewModel.loadData$default(navSearchSpotGroupViewModelEZpvd, "search", str, null, 4, null);
        }
    }

    public boolean KWHzl() {
        java.lang.Integer num = this.EZpvd;
        return num != null && num.intValue() == 0;
    }

    public static final NavSearchSpotGroupViewModel EZpvd(final androidx.fragment.app.Fragment fragment) {
        final Activity activity = new Activity(fragment);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.spot.delegate.DefaultNavSpotSearchDelegate$attachSpotSearchContext$lambda$0$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) activity.invoke();
            }
        });
        final Function0 function0 = null;
        return (NavSearchSpotGroupViewModel) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(NavSearchSpotGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.spot.delegate.DefaultNavSpotSearchDelegate$attachSpotSearchContext$lambda$0$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.spot.delegate.DefaultNavSpotSearchDelegate$attachSpotSearchContext$lambda$0$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.spot.delegate.DefaultNavSpotSearchDelegate$attachSpotSearchContext$lambda$0$$inlined$parentViewModels$5
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
                    defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        }).getValue();
    }

    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.AEQbTJ;
            java.lang.Object obj = fragment;
            if (fragment != null) {
                boolean z = fragment instanceof qOD;
                obj = fragment;
                if (!z) {
                    androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
                    while (parentFragment != null && !(parentFragment instanceof qOD)) {
                        parentFragment = parentFragment.getParentFragment();
                    }
                    boolean z2 = parentFragment instanceof qOD;
                    java.lang.Object obj2 = parentFragment;
                    if (!z2) {
                        obj2 = null;
                    }
                    obj = (qOD) obj2;
                }
            }
            boolean z3 = obj instanceof qOD;
            java.lang.Object obj3 = obj;
            if (!z3) {
                obj3 = null;
            }
            qOD qod = (qOD) obj3;
            ViewModelStoreOwner viewModelStoreOwner = qod instanceof ViewModelStoreOwner ? (ViewModelStoreOwner) qod : null;
            if (viewModelStoreOwner != null) {
                return viewModelStoreOwner;
            }
            throw new java.lang.IllegalArgumentException(("host parent fragment must be " + qOD.class.getSimpleName()).toString());
        }
    }
}

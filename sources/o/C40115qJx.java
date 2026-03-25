package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.search.features.navigation.coins.delegate.DefaultNavCoinSearchDelegate$setCoinSearchListeners$1$2;
import com.okinc.market.search.features.navigation.coins.viewmodel.NavSearchCoinGroupViewModel;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import o.InterfaceC41583qtZ;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40115qJx {
    public androidx.fragment.app.Fragment AEQbTJ;
    public Function0<NavSearchCoinGroupViewModel> EZpvd;
    public android.content.Context copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.AEQbTJ = null;
        this.copydefault = null;
        this.EZpvd = null;
    }

    public final NavSearchCoinGroupViewModel OLrzqt() {
        Function0<NavSearchCoinGroupViewModel> function0 = this.EZpvd;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public void copydefault(@NotNull final androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = fragment;
        this.copydefault = fragment.getContext();
        this.EZpvd = new Function0() { // from class: o.qJt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C40115qJx.AEQbTJ(fragment);
            }
        };
    }

    public void OLrzqt(@NotNull InterfaceC49363unD interfaceC49363unD, @NotNull Function1<? super InterfaceC49371unL<? extends Triple<? extends java.util.List<? extends InterfaceC41583qtZ>, ? extends java.util.List<CategoryGroupVo>, java.lang.Long>>, Unit> function1) {
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        Intrinsics.checkNotNullParameter(function1, "");
        NavSearchCoinGroupViewModel navSearchCoinGroupViewModelOLrzqt = OLrzqt();
        if (navSearchCoinGroupViewModelOLrzqt != null) {
            InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(interfaceC49363unD, navSearchCoinGroupViewModelOLrzqt, new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.navigation.coins.delegate.DefaultNavCoinSearchDelegate$setCoinSearchListeners$1$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
                public Object get(Object obj) {
                    return ((NavSearchCoinGroupViewModel.TaskDescription) obj).OLrzqt();
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
                public void set(Object obj, Object obj2) {
                    ((NavSearchCoinGroupViewModel.TaskDescription) obj).OLrzqt((InterfaceC49371unL<? extends Triple<? extends List<? extends InterfaceC41583qtZ>, ? extends List<CategoryGroupVo>, Long>>) obj2);
                }
            }, null, new DefaultNavCoinSearchDelegate$setCoinSearchListeners$1$2(function1, null), 2, null);
        }
    }

    public void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        NavSearchCoinGroupViewModel navSearchCoinGroupViewModelOLrzqt = OLrzqt();
        if (navSearchCoinGroupViewModelOLrzqt != null) {
            navSearchCoinGroupViewModelOLrzqt.KWHzl(str);
        }
    }

    public static final NavSearchCoinGroupViewModel AEQbTJ(final androidx.fragment.app.Fragment fragment) {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.search.features.navigation.coins.delegate.DefaultNavCoinSearchDelegate$attachCoinSearchContext$lambda$0$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return fragment;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.coins.delegate.DefaultNavCoinSearchDelegate$attachCoinSearchContext$lambda$0$$inlined$viewModels$default$2
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
        return (NavSearchCoinGroupViewModel) FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(NavSearchCoinGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.coins.delegate.DefaultNavCoinSearchDelegate$attachCoinSearchContext$lambda$0$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.coins.delegate.DefaultNavCoinSearchDelegate$attachCoinSearchContext$lambda$0$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.coins.delegate.DefaultNavCoinSearchDelegate$attachCoinSearchContext$lambda$0$$inlined$viewModels$default$5
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
}

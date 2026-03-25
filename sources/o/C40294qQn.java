package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.search.features.navigation.selection.ui.viewmodel.SelectionNavRootViewModel;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qQn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40294qQn implements InterfaceC40288qQh {
    public android.content.Context AEQbTJ;
    public androidx.fragment.app.Fragment OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.OLrzqt = null;
        this.AEQbTJ = null;
    }

    public void AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.OLrzqt = fragment;
        this.AEQbTJ = fragment.getContext();
    }

    @Override // o.InterfaceC40288qQh
    public void copydefault(@NotNull android.view.View view, @NotNull InterfaceC41643qug interfaceC41643qug, int i) {
        BizInstrument bizInstrumentCopydefault;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(interfaceC41643qug, "");
        if (interfaceC41643qug instanceof InterfaceC41641que) {
            bizInstrumentCopydefault = ((InterfaceC41641que) interfaceC41643qug).values();
        } else if (interfaceC41643qug instanceof InterfaceC41638qub) {
            bizInstrumentCopydefault = ((InterfaceC41638qub) interfaceC41643qug).values();
        } else if (!(interfaceC41643qug instanceof qWC)) {
            return;
        } else {
            bizInstrumentCopydefault = ((qWC) interfaceC41643qug).copydefault();
        }
        SelectionNavRootViewModel selectionNavRootViewModelAEQbTJ = AEQbTJ();
        if (selectionNavRootViewModelAEQbTJ != null) {
            selectionNavRootViewModelAEQbTJ.EZpvd(bizInstrumentCopydefault);
        }
    }

    private final SelectionNavRootViewModel AEQbTJ() {
        final androidx.fragment.app.Fragment fragment = this.OLrzqt;
        final Function0 function0 = null;
        if (fragment == null) {
            return null;
        }
        final ActionBar actionBar = new ActionBar(fragment);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.selection.ui.delegate.SelectionNavSearchItemClickDelegate$special$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) actionBar.invoke();
            }
        });
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(SelectionNavRootViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.selection.ui.delegate.SelectionNavSearchItemClickDelegate$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.selection.ui.delegate.SelectionNavSearchItemClickDelegate$special$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.selection.ui.delegate.SelectionNavSearchItemClickDelegate$special$$inlined$parentViewModels$5
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
        });
        if (interfaceC56387yDmCreateViewModelLazy != null) {
            return (SelectionNavRootViewModel) interfaceC56387yDmCreateViewModelLazy.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: o.qQn$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.OLrzqt;
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

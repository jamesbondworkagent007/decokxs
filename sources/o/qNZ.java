package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.quotation.ui.model.OptionsCategoryGroupVo;
import com.okinc.market.search.features.navigation.dex.viewmodel.NavSearchDexGroupViewModel;
import com.okinc.market.search.features.navigation.futures.viewmodel.NavSearchFuturesGroupViewModel;
import com.okinc.market.search.features.navigation.options.viewmodel.NavSearchOptionsQuoteGroupViewModel;
import com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$getAllOptionsVos$1;
import com.okinc.market.search.features.navigation.result.viewmodel.NavSearchResultViewModel;
import com.okinc.market.search.features.navigation.spot.viewmodel.NavSearchSpotGroupViewModel;
import com.okinc.trade.arch.util.Quintet;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import o.C40239qOm;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qNZ implements InterfaceC40230qOd {
    public androidx.fragment.app.Fragment KWHzl;
    public android.content.Context copydefault;
    private static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC40230qOd
    public java.lang.Object EZpvd(@NotNull Continuation<? super java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>> continuation) {
        return KWHzl(this, continuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl() {
        this.KWHzl = null;
        this.copydefault = null;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.qNZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final NavSearchResultViewModel OLrzqt() {
        return OLrzqt(this.KWHzl);
    }

    public void KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        this.KWHzl = fragment;
        this.copydefault = fragment.getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KWHzl(@NotNull InterfaceC49363unD interfaceC49363unD) {
        NavSearchSpotGroupViewModel navSearchSpotGroupViewModel;
        NavSearchFuturesGroupViewModel navSearchFuturesGroupViewModel;
        NavSearchOptionsQuoteGroupViewModel navSearchOptionsQuoteGroupViewModel;
        NavSearchDexGroupViewModel navSearchDexGroupViewModel;
        Flow<NavSearchSpotGroupViewModel.Application> flowFlowOf;
        Flow<NavSearchFuturesGroupViewModel.Application> flowFlowOf2;
        Flow<NavSearchOptionsQuoteGroupViewModel.TaskDescription> flowFlowOf3;
        Flow<NavSearchDexGroupViewModel.ActionBar> flowFlowOf4;
        NavSearchOptionsQuoteGroupViewModel navSearchOptionsQuoteGroupViewModel2;
        NavSearchFuturesGroupViewModel navSearchFuturesGroupViewModel2;
        NavSearchSpotGroupViewModel navSearchSpotGroupViewModel2;
        Intrinsics.checkNotNullParameter(interfaceC49363unD, "");
        C40375qTn c40375qTn = C40375qTn.AEQbTJ;
        c40375qTn.copydefault("DefaultNavSearchResultDelegate", "combineSearchResultFlows called with archUi: " + interfaceC49363unD);
        final androidx.fragment.app.Fragment fragment = this.KWHzl;
        final Function0 function0 = null;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        if (fragment != null) {
            final TaskDescription taskDescription = new TaskDescription(fragment);
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStoreOwner invoke() {
                    return (ViewModelStoreOwner) taskDescription.invoke();
                }
            });
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(NavSearchSpotGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$3
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$4
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
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$5
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
            if (interfaceC56387yDmCreateViewModelLazy == null || (navSearchSpotGroupViewModel2 = (NavSearchSpotGroupViewModel) interfaceC56387yDmCreateViewModelLazy.getValue()) == null) {
                C40375qTn.w$default(c40375qTn, "DefaultNavSearchResultDelegate", "Spot viewModel is not available.", null, 4, null);
                navSearchSpotGroupViewModel = null;
            } else {
                navSearchSpotGroupViewModel = navSearchSpotGroupViewModel2;
            }
        }
        final androidx.fragment.app.Fragment fragment2 = this.KWHzl;
        if (fragment2 != null) {
            final Activity activity = new Activity(fragment2);
            final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$7
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
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ = C56524yIo.AEQbTJ(NavSearchFuturesGroupViewModel.class);
            Function0<ViewModelStore> function02 = new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$8
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
            };
            final byte b8 = b7 == true ? 1 : 0;
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy2 = FragmentViewModelLazyKt.createViewModelLazy(fragment2, interfaceC56551yJoAEQbTJ, function02, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$9
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
                    Function0 function03 = b8;
                    if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$10
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
                        defaultViewModelProviderFactory = fragment2.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            });
            if (interfaceC56387yDmCreateViewModelLazy2 == null || (navSearchFuturesGroupViewModel2 = (NavSearchFuturesGroupViewModel) interfaceC56387yDmCreateViewModelLazy2.getValue()) == null) {
                C40375qTn.w$default(c40375qTn, "DefaultNavSearchResultDelegate", "Futures viewModel is not available.", null, 4, null);
                navSearchFuturesGroupViewModel = null;
            } else {
                navSearchFuturesGroupViewModel = navSearchFuturesGroupViewModel2;
            }
        }
        final androidx.fragment.app.Fragment fragment3 = this.KWHzl;
        if (fragment3 != null) {
            final Application application = new Application(fragment3);
            final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$12
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStoreOwner invoke() {
                    return (ViewModelStoreOwner) application.invoke();
                }
            });
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ2 = C56524yIo.AEQbTJ(NavSearchOptionsQuoteGroupViewModel.class);
            Function0<ViewModelStore> function03 = new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$13
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
            };
            final byte b9 = b6 == true ? 1 : 0;
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy3 = FragmentViewModelLazyKt.createViewModelLazy(fragment3, interfaceC56551yJoAEQbTJ2, function03, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$14
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
                    Function0 function04 = b9;
                    if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd3);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$15
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
                        defaultViewModelProviderFactory = fragment3.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            });
            if (interfaceC56387yDmCreateViewModelLazy3 == null || (navSearchOptionsQuoteGroupViewModel2 = (NavSearchOptionsQuoteGroupViewModel) interfaceC56387yDmCreateViewModelLazy3.getValue()) == null) {
                C40375qTn.w$default(c40375qTn, "DefaultNavSearchResultDelegate", "Options viewModel is not available.", null, 4, null);
                navSearchOptionsQuoteGroupViewModel = null;
            } else {
                navSearchOptionsQuoteGroupViewModel = navSearchOptionsQuoteGroupViewModel2;
            }
        }
        final androidx.fragment.app.Fragment fragment4 = this.KWHzl;
        if (fragment4 != null) {
            final ActionBar actionBar = new ActionBar(fragment4);
            final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$17
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
            InterfaceC56551yJo interfaceC56551yJoAEQbTJ3 = C56524yIo.AEQbTJ(NavSearchDexGroupViewModel.class);
            Function0<ViewModelStore> function04 = new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$18
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStore invoke() {
                    ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4).getViewModelStore();
                    Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                    return viewModelStore;
                }
            };
            final byte b10 = b5 == true ? 1 : 0;
            InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy4 = FragmentViewModelLazyKt.createViewModelLazy(fragment4, interfaceC56551yJoAEQbTJ3, function04, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$19
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
                    Function0 function05 = b10;
                    if (function05 != null && (creationExtras = (CreationExtras) function05.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$combineSearchResultFlows$$inlined$parentViewModels$20
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
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                        defaultViewModelProviderFactory = fragment4.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            });
            if (interfaceC56387yDmCreateViewModelLazy4 == null || (navSearchDexGroupViewModel = (NavSearchDexGroupViewModel) interfaceC56387yDmCreateViewModelLazy4.getValue()) == null) {
                C40375qTn.w$default(c40375qTn, "DefaultNavSearchResultDelegate", "DEX viewModel is not available.", null, 4, null);
                navSearchDexGroupViewModel = null;
            }
        }
        int i = 2;
        if (navSearchSpotGroupViewModel == null || (flowFlowOf = interfaceC49363unD.uiStateFlow(navSearchSpotGroupViewModel)) == null) {
            flowFlowOf = FlowKt.flowOf(new NavSearchSpotGroupViewModel.Application(new InterfaceC49371unL.TaskDescription(null, 1, null), b2 == true ? 1 : 0, i, b == true ? 1 : 0));
        }
        if (navSearchFuturesGroupViewModel == null || (flowFlowOf2 = interfaceC49363unD.uiStateFlow(navSearchFuturesGroupViewModel)) == null) {
            flowFlowOf2 = FlowKt.flowOf(new NavSearchFuturesGroupViewModel.Application(new InterfaceC49371unL.TaskDescription(null, 1, null), b4 == true ? 1 : 0, i, b3 == true ? 1 : 0));
        }
        if (navSearchOptionsQuoteGroupViewModel == null || (flowFlowOf3 = interfaceC49363unD.uiStateFlow(navSearchOptionsQuoteGroupViewModel)) == null) {
            flowFlowOf3 = FlowKt.flowOf(new NavSearchOptionsQuoteGroupViewModel.TaskDescription(new InterfaceC49371unL.TaskDescription(null, 1, null), null, 2, null));
        }
        if (navSearchDexGroupViewModel == null || (flowFlowOf4 = interfaceC49363unD.uiStateFlow(navSearchDexGroupViewModel)) == null) {
            flowFlowOf4 = FlowKt.flowOf(new NavSearchDexGroupViewModel.ActionBar(new InterfaceC49371unL.TaskDescription(null, 1, null)));
        }
        NavSearchResultViewModel navSearchResultViewModelOLrzqt = OLrzqt();
        if (navSearchResultViewModelOLrzqt != null) {
            navSearchResultViewModelOLrzqt.EZpvd(flowFlowOf, flowFlowOf2, flowFlowOf3, flowFlowOf4);
        }
    }

    @Override // o.InterfaceC40230qOd
    public void AYXKKw() {
        C40375qTn.AEQbTJ.copydefault("DefaultNavSearchResultDelegate", "showAllSpotList called");
        NavSearchResultViewModel navSearchResultViewModelOLrzqt = OLrzqt();
        if (navSearchResultViewModelOLrzqt != null) {
            navSearchResultViewModelOLrzqt.EZpvd(true);
        }
    }

    @Override // o.InterfaceC40230qOd
    public void KWHzl(C40239qOm.ActionBar.C0923ActionBar c0923ActionBar, C40239qOm.ActionBar.Application application) {
        C40375qTn.AEQbTJ.copydefault("DefaultNavSearchResultDelegate", "updateDerivativesSectionConfig called with futuresTabVo: " + c0923ActionBar + ", optionsTabVo: " + application);
        NavSearchResultViewModel navSearchResultViewModelOLrzqt = OLrzqt();
        if (navSearchResultViewModelOLrzqt != null) {
            navSearchResultViewModelOLrzqt.copydefault(c0923ActionBar, application);
        }
    }

    public java.lang.String copydefault() {
        NavSearchSpotGroupViewModel navSearchSpotGroupViewModel;
        C40375qTn.AEQbTJ.copydefault("DefaultNavSearchResultDelegate", "getCurrentKeyword called");
        final androidx.fragment.app.Fragment fragment = this.KWHzl;
        final Function0 function0 = null;
        if (fragment == null) {
            return null;
        }
        final Fragment fragment2 = new Fragment(fragment);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$getCurrentKeyword$$inlined$parentViewModels$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) fragment2.invoke();
            }
        });
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(NavSearchSpotGroupViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$getCurrentKeyword$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$getCurrentKeyword$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$getCurrentKeyword$$inlined$parentViewModels$5
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
        if (interfaceC56387yDmCreateViewModelLazy == null || (navSearchSpotGroupViewModel = (NavSearchSpotGroupViewModel) interfaceC56387yDmCreateViewModelLazy.getValue()) == null) {
            return null;
        }
        return navSearchSpotGroupViewModel.EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ java.lang.Object KWHzl(qNZ qnz, Continuation<? super java.util.Map<OptionsCategoryGroupVo, ? extends java.util.Map<java.lang.String, ? extends java.util.List<? extends InterfaceC41642quf>>>> continuation) throws java.lang.Throwable {
        DefaultNavSearchResultDelegate$getAllOptionsVos$1 defaultNavSearchResultDelegate$getAllOptionsVos$1;
        Triple triple;
        if (continuation instanceof DefaultNavSearchResultDelegate$getAllOptionsVos$1) {
            defaultNavSearchResultDelegate$getAllOptionsVos$1 = (DefaultNavSearchResultDelegate$getAllOptionsVos$1) continuation;
            int i = defaultNavSearchResultDelegate$getAllOptionsVos$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultNavSearchResultDelegate$getAllOptionsVos$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultNavSearchResultDelegate$getAllOptionsVos$1 = new DefaultNavSearchResultDelegate$getAllOptionsVos$1(qnz, continuation);
            }
        }
        java.lang.Object objCopydefault = defaultNavSearchResultDelegate$getAllOptionsVos$1.result;
        java.lang.Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = defaultNavSearchResultDelegate$getAllOptionsVos$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            C40375qTn.AEQbTJ.copydefault("DefaultNavSearchResultDelegate", "getAllOptionsVos called");
            NavSearchResultViewModel navSearchResultViewModelOLrzqt = qnz.OLrzqt();
            if (navSearchResultViewModelOLrzqt != null) {
                defaultNavSearchResultDelegate$getAllOptionsVos$1.label = 1;
                objCopydefault = navSearchResultViewModelOLrzqt.copydefault(defaultNavSearchResultDelegate$getAllOptionsVos$1);
                if (objCopydefault == objCopydefault2) {
                    return objCopydefault2;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C56391yDq.AEQbTJ(objCopydefault);
        Quintet quintet = (Quintet) objCopydefault;
        if (quintet != null && (triple = (Triple) quintet.getFourth()) != null) {
            return (java.util.Map) triple.getSecond();
        }
        return null;
    }

    public NavSearchResultViewModel OLrzqt(final androidx.fragment.app.Fragment fragment) {
        final Function0 function0 = null;
        if (fragment == null) {
            return null;
        }
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$onGetNavSearchResultViewModel$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$onGetNavSearchResultViewModel$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(fragment, C56524yIo.AEQbTJ(NavSearchResultViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$onGetNavSearchResultViewModel$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$onGetNavSearchResultViewModel$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.navigation.result.delegate.DefaultNavSearchResultDelegate$onGetNavSearchResultViewModel$$inlined$viewModels$default$5
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
            return (NavSearchResultViewModel) interfaceC56387yDmCreateViewModelLazy.getValue();
        }
        return null;
    }

    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
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

    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.KWHzl;
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

    public static final class Application implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
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

    public static final class Fragment implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(androidx.fragment.app.Fragment fragment) {
            this.KWHzl = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            androidx.fragment.app.Fragment fragment = this.KWHzl;
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

    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
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

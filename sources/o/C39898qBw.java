package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.market.quotation.ui.AbsQuotationFragment;
import com.okinc.market.search.features.kline.landscape.sub.LandscapeNavSearchDefaultListFragment$setListener$2;
import com.okinc.market.search.features.kline.landscape.sub.LandscapeNavSearchDefaultListFragment$setListener$3;
import com.okinc.market.search.features.navigation.history.ui.NavSearchHistoryViewModel;
import com.okinc.market.watch.data.UserGroup;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowKt;
import o.C40174qMb;
import o.InterfaceC49361unB;
import o.InterfaceC49371unL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39898qBw extends AbstractC39891qBp {
    public final InterfaceC56387yDm AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm KWHzl;

    public C39898qBw() {
        final ActionBar actionBar = new ActionBar(this);
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.market.search.features.kline.landscape.sub.LandscapeNavSearchDefaultListFragment$special$$inlined$parentViewModels$2
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
        final Function0 function0 = null;
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(NavSearchHistoryViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.market.search.features.kline.landscape.sub.LandscapeNavSearchDefaultListFragment$special$$inlined$parentViewModels$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.market.search.features.kline.landscape.sub.LandscapeNavSearchDefaultListFragment$special$$inlined$parentViewModels$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.market.search.features.kline.landscape.sub.LandscapeNavSearchDefaultListFragment$special$$inlined$parentViewModels$5
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
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.qBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39898qBw.EZpvd();
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C39898qBw.KWHzl(this.OLrzqt);
            }
        });
    }

    public final NavSearchHistoryViewModel valueOf() {
        return (NavSearchHistoryViewModel) this.AYXKKw.getValue();
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment
    public UserGroup AhwBna() {
        return (UserGroup) this.KWHzl.getValue();
    }

    public static final UserGroup EZpvd() {
        return UserGroup.Activity.factoryAllUserGroups$default(UserGroup.Companion, null, 1, null);
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment
    public C40512qYp OLrzqt() {
        return (C40512qYp) this.AEQbTJ.getValue();
    }

    public static final qAY KWHzl(C39898qBw c39898qBw) {
        return new qAY(c39898qBw.fetchVPNInfo());
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        C42820rdd c42820rddIsConnected = isConnected();
        if (c42820rddIsConnected != null) {
            c42820rddIsConnected.getRoot().setContentExcludeViews(c42820rddIsConnected.copydefault);
            C40363qTb c40363qTb = c42820rddIsConnected.copydefault;
            Intrinsics.checkNotNullExpressionValue(c40363qTb, "");
            c40363qTb.setVisibility(8);
        }
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        InterfaceC49361unB.Activity.collectLatestOnLifecycle$default(this, valueOf(), new MutablePropertyReference1Impl() { // from class: com.okinc.market.search.features.kline.landscape.sub.LandscapeNavSearchDefaultListFragment$setListener$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56560yJx
            public Object get(Object obj) {
                return ((NavSearchHistoryViewModel.ActionBar) obj).EZpvd();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, o.InterfaceC56554yJr
            public void set(Object obj, Object obj2) {
                ((NavSearchHistoryViewModel.ActionBar) obj).EZpvd((InterfaceC49371unL<? extends List<C40174qMb>>) obj2);
            }
        }, null, new LandscapeNavSearchDefaultListFragment$setListener$2(this, null), 2, null);
        jSA.KWHzl(this, new LandscapeNavSearchDefaultListFragment$setListener$3(this, null));
    }

    @Override // com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment, com.okinc.market.quotation.ui.AbsQuotationFragment
    public java.lang.Object OLrzqt(@NotNull AbsQuotationFragment.SubscribeType subscribeType, @NotNull Continuation<? super Unit> continuation) throws java.lang.Throwable {
        if (!pWO.KWHzl().EZpvd()) {
            C40375qTn.AEQbTJ.copydefault(getTAG(), "executeSubscribeData");
            java.lang.Object objKWHzl = values().KWHzl(AhwBna().getGroupName(), AkhnZx(), FlowKt.asStateFlow(DbNXlk().EZpvd()), "horizontal_nav_search_page", continuation);
            return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.qBw$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
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
}

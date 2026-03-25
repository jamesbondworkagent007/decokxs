package o;

import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.dex.utils.CDNSourceManager;
import com.okinc.business.dexlogic.main.market.chain.MarketChainBean;
import com.okinc.business.dexui.chain_picker.ChainPickerParams;
import com.okinc.business.market.common.constants.RankingType;
import com.okinc.business.market.common.constants.TimeIntervalType;
import com.okinc.business.market.data.model.watchlist.FavoriteAction;
import com.okinc.business.market.features.favorite_list_signal.ui.FavoriteListSignalViewModel;
import com.okinc.business.market.features.home_favorite_list.domain.HomeFavoriteListFilter;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$adapter$2$1$4$1;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$handleFavoriteStatusResult$1;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$initView$$inlined$filter$1$2$1;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$refreshWatchlist$1;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$updateWatchlistGroups$1;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListViewModel;
import com.okinc.business.market.features.home_favorite_list.ui.HomeFavouriteListParams;
import com.okinc.business.market.features.home_favorite_list.ui.edit.WatchlistEditParams;
import com.okinc.business.market.features.home_token_list.domain.HomeToken;
import com.okinc.business.market.features.watch_list_groups.ui.filter.WatchListFilterParams;
import com.okinc.business.market.features.watchlist.ui.SharedWatchListViewModel;
import com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC22421hez;
import o.C23274hvD;
import o.C28425kaY;
import o.C31197lpV;
import o.C52761wXj;
import o.C52812wZg;
import o.InterfaceC28457kbD;
import o.InterfaceC28532kcZ;
import o.InterfaceC28591kdf;
import o.InterfaceC29291kqq;
import o.xWO;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kaY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28425kaY extends AbstractC28421kaU implements InterfaceC23406hxd, InterfaceC28591kdf, kCF, kCQ, InterfaceC29291kqq {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public final C58216yxB AYXKKw;
    public ActivityResultLauncher<android.content.Intent> AhwBna;
    public boolean AkhnZx;
    public C52812wZg DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC28047kMy ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public C21472hAq fJNWhG;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final Activity gEmmrt;
    public final InterfaceC28588kdc isConnected;
    public kCM values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.dvImUD;
    }

    /* JADX INFO: renamed from: o.kaY$TaskDescription */
    public static final class TaskDescription implements Flow<java.lang.Boolean> {
        public final /* synthetic */ Flow copydefault;

        /* JADX INFO: renamed from: o.kaY$TaskDescription$3, reason: invalid class name */
        public static final class AnonymousClass3<T> implements FlowCollector {
            public final /* synthetic */ FlowCollector copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public AnonymousClass3(FlowCollector flowCollector) {
                this.copydefault = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object emit(java.lang.Object obj, Continuation continuation) throws java.lang.Throwable {
                HomeFavoriteListFragment$initView$$inlined$filter$1$2$1 homeFavoriteListFragment$initView$$inlined$filter$1$2$1;
                if (continuation instanceof HomeFavoriteListFragment$initView$$inlined$filter$1$2$1) {
                    homeFavoriteListFragment$initView$$inlined$filter$1$2$1 = (HomeFavoriteListFragment$initView$$inlined$filter$1$2$1) continuation;
                    int i = homeFavoriteListFragment$initView$$inlined$filter$1$2$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        homeFavoriteListFragment$initView$$inlined$filter$1$2$1.label = i - Integer.MIN_VALUE;
                    } else {
                        homeFavoriteListFragment$initView$$inlined$filter$1$2$1 = new HomeFavoriteListFragment$initView$$inlined$filter$1$2$1(this, continuation);
                    }
                }
                java.lang.Object obj2 = homeFavoriteListFragment$initView$$inlined$filter$1$2$1.result;
                java.lang.Object objCopydefault = C56442yFn.copydefault();
                int i2 = homeFavoriteListFragment$initView$$inlined$filter$1$2$1.label;
                if (i2 == 0) {
                    C56391yDq.AEQbTJ(obj2);
                    FlowCollector flowCollector = this.copydefault;
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        homeFavoriteListFragment$initView$$inlined$filter$1$2$1.label = 1;
                        if (flowCollector.emit(obj, homeFavoriteListFragment$initView$$inlined$filter$1$2$1) == objCopydefault) {
                            return objCopydefault;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C56391yDq.AEQbTJ(obj2);
                }
                return Unit.INSTANCE;
            }
        }

        public TaskDescription(Flow flow) {
            this.copydefault = flow;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation] */
        @Override // kotlinx.coroutines.flow.Flow
        public java.lang.Object collect(FlowCollector<? super java.lang.Boolean> flowCollector, Continuation continuation) {
            java.lang.Object objCollect = this.copydefault.collect(new AnonymousClass3(flowCollector), continuation);
            return objCollect == C56442yFn.copydefault() ? objCollect : Unit.INSTANCE;
        }
    }

    @Override // o.InterfaceC29291kqq
    public void AEQbTJ(int i, @NotNull java.util.List<java.lang.Integer> list) {
        InterfaceC29291kqq.Activity.EZpvd(this, i, list);
    }

    @Override // o.InterfaceC28591kdf
    public void isConnected() {
        InterfaceC28591kdf.Activity.KWHzl(this);
    }

    public C28425kaY() {
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy;
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$2
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(HomeFavoriteListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$5
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
        if (getParentFragment() instanceof hNW) {
            final Function0 function03 = new Function0() { // from class: o.kbg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C28425kaY.iwGUEr(this.KWHzl);
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$6
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
            interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FavoriteListSignalViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$7
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$8
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
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$9
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
        } else {
            final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$10
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
            final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$11
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
            interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(FavoriteListSignalViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$12
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$13
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
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$14
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
        }
        this.fetchVPNInfo = interfaceC56387yDmCreateViewModelLazy;
        final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$15
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$16
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function05.invoke();
            }
        });
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedWatchListViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$17
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$18
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
                Function0 function06 = function02;
                if (function06 != null && (creationExtras = (CreationExtras) function06.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd4);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.home_favorite_list.ui.HomeFavoriteListFragment$special$$inlined$viewModels$default$19
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
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AYXKKw = new C58216yxB();
        this.isConnected = new InterfaceC28588kdc() { // from class: o.kbe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC28588kdc
            public final void EZpvd(InterfaceC28532kcZ interfaceC28532kcZ) {
                C28425kaY.copydefault(this.AEQbTJ, interfaceC28532kcZ);
            }
        };
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.kbh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28425kaY.fARcdN(this.AEQbTJ);
            }
        });
        this.gEmmrt = new Activity();
        this.ejfBZ = new InterfaceC28047kMy() { // from class: o.kbk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC28047kMy
            public final void KWHzl(kMC kmc) {
                C28425kaY.copydefault(this.EZpvd, kmc);
            }
        };
    }

    public final HomeFavoriteListViewModel djBIcL() {
        return (HomeFavoriteListViewModel) this.fIwbmz.getValue();
    }

    public final FavoriteListSignalViewModel gEmmrt() {
        return (FavoriteListSignalViewModel) this.fetchVPNInfo.getValue();
    }

    public static final ViewModelStoreOwner iwGUEr(C28425kaY c28425kaY) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c28425kaY.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    public final HomeFavouriteListParams AYXKKw() {
        HomeFavouriteListParams homeFavouriteListParams;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (homeFavouriteListParams = (HomeFavouriteListParams) arguments.getParcelable("key.home_favourite")) == null) ? (HomeFavouriteListParams) C31200lpY.throwIfDebug$default(new HomeFavouriteListParams(""), null, 2, null) : homeFavouriteListParams;
    }

    public final SharedWatchListViewModel valueOf() {
        return (SharedWatchListViewModel) this.fARcdN.getValue();
    }

    public static final void copydefault(C28425kaY c28425kaY, InterfaceC28532kcZ interfaceC28532kcZ) {
        Intrinsics.checkNotNullParameter(interfaceC28532kcZ, "");
        if (interfaceC28532kcZ instanceof InterfaceC28532kcZ.TaskDescription) {
            if (Intrinsics.EZpvd((java.lang.Object) ((InterfaceC28532kcZ.TaskDescription) interfaceC28532kcZ).copydefault(), (java.lang.Object) "id.watchlist_group")) {
                android.content.Context context = c28425kaY.getContext();
                if (context != null) {
                    C25352ivB.AEQbTJ(context, c28425kaY.AYXKKw().AEQbTJ());
                }
                c28425kaY.EZpvd("list_group_manage");
                return;
            }
            c28425kaY.AkhnZx();
            c28425kaY.EZpvd("list_filter");
            return;
        }
        if (!(interfaceC28532kcZ instanceof InterfaceC28532kcZ.Application)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Possible override for method o.kaU.EZpvd()V */
    public final kMM EZpvd() {
        return (kMM) this.djBIcL.getValue();
    }

    public static final kMM fARcdN(final C28425kaY c28425kaY) {
        kMM kmm = new kMM();
        Function0 function0 = new Function0() { // from class: o.kbv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28425kaY.AuCTel(this.copydefault);
            }
        };
        Function1 function1 = new Function1() { // from class: o.kbu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28425kaY.EZpvd(this.EZpvd, (HomeToken) obj);
            }
        };
        Function2 function2 = new Function2() { // from class: o.kbw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C28425kaY.copydefault(this.KWHzl, (kotlin.Pair) obj, (HomeToken) obj2);
            }
        };
        Function1 function12 = new Function1() { // from class: o.kbs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28425kaY.KWHzl(this.OLrzqt, (HomeToken) obj);
            }
        };
        androidx.fragment.app.FragmentManager childFragmentManager = c28425kaY.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        kmm.register(HomeToken.class, new C28528kcV(function0, function1, function2, function12, "market_watchlist", childFragmentManager));
        kmm.register(C28463kbJ.class, new C28465kbL(new Function0() { // from class: o.kbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28425kaY.fIwbmz(this.OLrzqt);
            }
        }, new Function0() { // from class: o.kbB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28425kaY.fJNWhG(this.KWHzl);
            }
        }));
        kmm.register(C28526kcT.class, new C28524kcR(c28425kaY.AYXKKw().AEQbTJ(), new Function0() { // from class: o.kbb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28425kaY.ejfBZ(this.KWHzl);
            }
        }));
        return kmm;
    }

    public static final android.content.Context AuCTel(C28425kaY c28425kaY) {
        android.content.Context contextRequireContext = c28425kaY.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return contextRequireContext;
    }

    public static final Unit EZpvd(C28425kaY c28425kaY, HomeToken homeToken) {
        Intrinsics.checkNotNullParameter(homeToken, "");
        AbstractC22421hez.Companion.EZpvd(AbstractC22421hez.ComponentName.EZpvd);
        java.lang.String strOLrzqt = c28425kaY.djBIcL().OLrzqt().getValue().OLrzqt();
        java.lang.String strAYXKKw = homeToken.AYXKKw();
        trackPageClick$default(c28425kaY, c28425kaY.djBIcL().OLrzqt().getValue().djBIcL(), C27625jyi.copydefault.OLrzqt().contains(strOLrzqt) ? "all" : c28425kaY.djBIcL().OLrzqt().getValue().copydefault().getChainName(), null, null, null, homeToken.OLrzqt(), strAYXKKw, 28, null);
        c28425kaY.AEQbTJ(homeToken);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C28425kaY c28425kaY, kotlin.Pair pair, HomeToken homeToken) {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(homeToken, "");
        c28425kaY.EZpvd((kotlin.Pair<java.lang.Integer, java.lang.Integer>) pair, homeToken);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C28425kaY c28425kaY, HomeToken homeToken) {
        Intrinsics.checkNotNullParameter(homeToken, "");
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(c28425kaY), null, null, new HomeFavoriteListFragment$adapter$2$1$4$1(c28425kaY, homeToken, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit fIwbmz(C28425kaY c28425kaY) {
        c28425kaY.fIwbmz();
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(C28425kaY c28425kaY) {
        c28425kaY.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C28425kaY c28425kaY) {
        c28425kaY.djBIcL().fetchVPNInfo();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.kaY$Activity */
    public static final class Activity implements kLR {
        public Activity() {
        }

        @Override // o.kLR
        public void AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C23407hxe c23407hxeCopydefault = C23407hxe.Companion.copydefault(new ChainPickerParams(str));
            androidx.fragment.app.FragmentManager childFragmentManager = C28425kaY.this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c23407hxeCopydefault.show(childFragmentManager);
        }

        @Override // o.kLR
        public void copydefault(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C28425kaY.this.djBIcL().AEQbTJ(C33129mqd.AhwBna(str));
            C28425kaY.this.EZpvd("group_custom");
        }
    }

    public static final void copydefault(C28425kaY c28425kaY, kMC kmc) {
        Intrinsics.checkNotNullParameter(kmc, "");
        HomeFavoriteListViewModel homeFavoriteListViewModelDjBIcL = c28425kaY.djBIcL();
        RankingType rankingTypeEZpvd = kmc.EZpvd();
        if (rankingTypeEZpvd == null) {
            rankingTypeEZpvd = RankingType.SEARCH;
        }
        homeFavoriteListViewModelDjBIcL.OLrzqt(rankingTypeEZpvd, kmc.AEQbTJ());
        java.lang.String strOLrzqt = c28425kaY.djBIcL().OLrzqt().getValue().OLrzqt();
        RankingType rankingTypeEZpvd2 = kmc.EZpvd();
        trackPageClick$default(c28425kaY, c28425kaY.djBIcL().OLrzqt().getValue().djBIcL(), C27625jyi.copydefault.OLrzqt().contains(strOLrzqt) ? "all" : c28425kaY.djBIcL().OLrzqt().getValue().copydefault().getChainName(), rankingTypeEZpvd2 != null ? java.lang.Integer.valueOf(rankingTypeEZpvd2.getValue()) : null, java.lang.Boolean.valueOf(kmc.AEQbTJ()), null, null, null, WalletImportError.ERROR_CODE_AA_EXIST, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        C58216yxB c58216yxB = this.AYXKKw;
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        final Function1 function1 = new Function1() { // from class: o.kbq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28425kaY.EZpvd(this.copydefault, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.kbp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C28425kaY.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.kbo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28425kaY.EZpvd((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXKWHzl.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.kbr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C28425kaY.AEQbTJ(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.AEQbTJ(c58216yxB, interfaceC58217yxCAEQbTJ);
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C28425kaY c28425kaY, xXO xxo) {
        c28425kaY.values();
        c28425kaY.valueOf().copydefault();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.fJNWhG = C21472hAq.AEQbTJ(view);
        fARcdN();
        this.values = new kCM();
        StateFlow<InterfaceC28457kbD> stateFlowDjBIcL = djBIcL().djBIcL();
        Lifecycle.State state = Lifecycle.State.RESUMED;
        C25390ivn.AEQbTJ(this, stateFlowDjBIcL, state, new Application());
        C25390ivn.AEQbTJ(this, djBIcL().OLrzqt(), state, new ActionBar());
        C25390ivn.AEQbTJ(this, gEmmrt().EZpvd(), state, new Dialog());
        C25390ivn.AEQbTJ(this, valueOf().KWHzl(), state, new Fragment());
        C25390ivn.collectOnViewLifecycle$default(this, new TaskDescription(djBIcL().KWHzl()), null, new LoaderManager(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.filterNotNull(djBIcL().AYXKKw()), null, new FragmentManager(), 2, null);
        this.AhwBna = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.kbn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C28425kaY.copydefault(this.copydefault, (ActivityResult) obj);
            }
        });
        if (AYXKKw().AEQbTJ()) {
            return;
        }
        AhwBna();
    }

    /* JADX INFO: renamed from: o.kaY$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(InterfaceC28457kbD interfaceC28457kbD, Continuation<? super Unit> continuation) {
            C28425kaY.this.copydefault(interfaceC28457kbD);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kaY$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(HomeFavoriteListFilter homeFavoriteListFilter, Continuation<? super Unit> continuation) {
            C28425kaY.this.AEQbTJ(homeFavoriteListFilter, homeFavoriteListFilter.gEmmrt());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kaY$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return KWHzl(((java.lang.Number) obj).longValue(), continuation);
        }

        public final java.lang.Object KWHzl(long j, Continuation<? super Unit> continuation) {
            if (j != 0) {
                HomeFavoriteListViewModel.loadData$default(C28425kaY.this.djBIcL(), false, false, false, 3, null);
                C28425kaY.this.gEmmrt().copydefault();
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kaY$Fragment */
    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ(((java.lang.Number) obj).longValue(), continuation);
        }

        public final java.lang.Object AEQbTJ(long j, Continuation<? super Unit> continuation) {
            C28425kaY.updateWatchlistGroups$default(C28425kaY.this, false, 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kaY$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return KWHzl(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
            android.widget.FrameLayout frameLayoutEZpvd;
            C21472hAq c21472hAq = C28425kaY.this.fJNWhG;
            if (c21472hAq != null && (frameLayoutEZpvd = c21472hAq.getRoot()) != null) {
                final C28425kaY c28425kaY = C28425kaY.this;
                C56443yFo.KWHzl(frameLayoutEZpvd.post(new java.lang.Runnable() { // from class: o.kby
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        C28425kaY.LoaderManager.copydefault(c28425kaY);
                    }
                }));
            }
            return Unit.INSTANCE;
        }

        public static final void copydefault(C28425kaY c28425kaY) {
            c28425kaY.ejfBZ();
        }
    }

    /* JADX INFO: renamed from: o.kaY$FragmentManager */
    public static final class FragmentManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt(((java.lang.Number) obj).intValue(), continuation);
        }

        public final java.lang.Object OLrzqt(int i, Continuation<? super Unit> continuation) {
            C55328xhq.show$default(C55328xhq.OLrzqt, C56443yFo.AEQbTJ(i), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
            C28425kaY.this.djBIcL().AEQbTJ();
            return Unit.INSTANCE;
        }
    }

    public static final void copydefault(C28425kaY c28425kaY, ActivityResult activityResult) {
        if (activityResult.getResultCode() == -1) {
            c28425kaY.values();
        }
    }

    public static /* synthetic */ void updateWatchlistGroups$default(C28425kaY c28425kaY, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c28425kaY.KWHzl(z);
    }

    public final void KWHzl(boolean z) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeFavoriteListFragment$updateWatchlistGroups$1(this, z, null), 3, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HomeFavoriteListFilter value = djBIcL().OLrzqt().getValue();
        C21847hOn.KWHzl("watch_list", Intrinsics.EZpvd((java.lang.Object) value.OLrzqt(), (java.lang.Object) "-100") ? "-100" : value.copydefault().getChainId(), value.copydefault().getChainName(), value.djBIcL(), "app_web3", "default_trade", djBIcL().AhwBna(), java.lang.Boolean.valueOf(AYXKKw().AEQbTJ()), "watch_list");
        if (djBIcL().djBIcL().getValue() instanceof InterfaceC28457kbD.StateListAnimator) {
            djBIcL().isConnected();
        }
        C29229kph.OLrzqt(AYXKKw().AEQbTJ());
        HomeFavoriteListViewModel.loadData$default(djBIcL(), false, false, false, 3, null);
        KWHzl(false);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        djBIcL().AkhnZx();
        C52812wZg c52812wZg = this.DbNXlk;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C52812wZg c52812wZg = this.DbNXlk;
        if (c52812wZg != null) {
            c52812wZg.KWHzl();
        }
        this.DbNXlk = null;
        this.fJNWhG = null;
        this.values = null;
        super.onDestroyView();
    }

    @Override // o.kCF
    public void OLrzqt(@NotNull TimeIntervalType timeIntervalType, @NotNull MarketChainBean marketChainBean) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        djBIcL().EZpvd(timeIntervalType, marketChainBean);
    }

    @Override // o.InterfaceC23406hxd
    public void KWHzl(@NotNull MarketChainBean marketChainBean) {
        Intrinsics.checkNotNullParameter(marketChainBean, "");
        trackPageClick$default(this, null, marketChainBean.getChainName(), null, null, null, null, null, 125, null);
        djBIcL().EZpvd(marketChainBean);
    }

    @Override // o.InterfaceC28591kdf
    public void OLrzqt(@NotNull TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(timeIntervalType, "");
        djBIcL().EZpvd(timeIntervalType);
        trackPageClick$default(this, timeIntervalType, C27625jyi.copydefault.OLrzqt().contains(djBIcL().OLrzqt().getValue().OLrzqt()) ? "all" : djBIcL().OLrzqt().getValue().copydefault().getChainName(), null, null, null, null, null, 124, null);
    }

    public final void copydefault(InterfaceC28457kbD interfaceC28457kbD) {
        java.util.List<? extends kMU> listAhwBna;
        C21472hAq c21472hAq = this.fJNWhG;
        if (c21472hAq != null) {
            boolean z = interfaceC28457kbD instanceof InterfaceC28457kbD.Activity;
            boolean z2 = false;
            boolean z3 = z || (interfaceC28457kbD instanceof InterfaceC28457kbD.Application);
            if (z3) {
                EZpvd(interfaceC28457kbD);
            }
            boolean z4 = interfaceC28457kbD instanceof InterfaceC28457kbD.StateListAnimator;
            if (!z4 || !((InterfaceC28457kbD.StateListAnimator) interfaceC28457kbD).OLrzqt()) {
                c21472hAq.DbNXlk.AEQbTJ();
            }
            LinearLayoutCompat linearLayoutCompat = c21472hAq.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            boolean z5 = interfaceC28457kbD instanceof InterfaceC28457kbD.TaskDescription;
            linearLayoutCompat.setVisibility(!z5 && !(interfaceC28457kbD instanceof InterfaceC28457kbD.PendingIntent) ? 0 : 8);
            ConstraintLayout constraintLayout = c21472hAq.copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(djBIcL().valueOf() ? 0 : 8);
            android.widget.FrameLayout frameLayout = c21472hAq.valueOf;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(interfaceC28457kbD instanceof InterfaceC28457kbD.ActionBar ? 0 : 8);
            C55173xeu c55173xeu = c21472hAq.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility(z3 ? 0 : 8);
            NestedScrollView nestedScrollView = c21472hAq.djBIcL;
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "");
            nestedScrollView.setVisibility(z3 ? 0 : 8);
            C55173xeu c55173xeu2 = c21472hAq.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(interfaceC28457kbD instanceof InterfaceC28457kbD.PendingIntent ? 0 : 8);
            C55173xeu c55173xeu3 = c21472hAq.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(c55173xeu3, "");
            c55173xeu3.setVisibility(z5 ? 0 : 8);
            if (z4 || z) {
                djBIcL().copydefault();
            }
            if (z4) {
                listAhwBna = CollectionsKt___CollectionsKt.copydefault((java.util.Collection<? extends C28463kbJ>) ((InterfaceC28457kbD.StateListAnimator) interfaceC28457kbD).KWHzl().KWHzl(), C28463kbJ.AEQbTJ);
            } else {
                listAhwBna = yDY.AhwBna();
            }
            if (z4 && ((InterfaceC28457kbD.StateListAnimator) interfaceC28457kbD).KWHzl().EZpvd()) {
                z2 = true;
            }
            if (this.AkhnZx || z2) {
                EZpvd().EZpvd(listAhwBna, new Function0() { // from class: o.kbj
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28425kaY.getFieldNames(this.KWHzl);
                    }
                });
            } else {
                kMM.setData$default(EZpvd(), listAhwBna, null, 2, null);
            }
            int iDpInt$default = C55298xhM.dpInt$default(AYXKKw().AEQbTJ() ? 16.0f : 6.0f, (android.content.Context) null, 1, (java.lang.Object) null);
            ConstraintLayout constraintLayout2 = c21472hAq.copydefault;
            constraintLayout2.setPadding(constraintLayout2.getPaddingLeft(), iDpInt$default, c21472hAq.copydefault.getPaddingRight(), c21472hAq.copydefault.getPaddingBottom());
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final Unit getFieldNames(C28425kaY c28425kaY) {
        c28425kaY.AkhnZx = false;
        return Unit.INSTANCE;
    }

    public final void EZpvd(InterfaceC28457kbD interfaceC28457kbD) {
        C21472hAq c21472hAq = this.fJNWhG;
        if (c21472hAq != null) {
            HomeFavoriteListFilter value = djBIcL().OLrzqt().getValue();
            int iDpInt$default = C55298xhM.dpInt$default(AYXKKw().AEQbTJ() ? 36.0f : 0.0f, (android.content.Context) null, 1, (java.lang.Object) null);
            NestedScrollView nestedScrollView = c21472hAq.djBIcL;
            nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), iDpInt$default, c21472hAq.djBIcL.getPaddingRight(), c21472hAq.djBIcL.getPaddingBottom());
            C55173xeu c55173xeu = c21472hAq.AhwBna;
            c55173xeu.setEmptyTypeImage(7);
            if (interfaceC28457kbD instanceof InterfaceC28457kbD.Application) {
                android.content.Context context = c55173xeu.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                java.lang.String strKWHzl = C33069mpW.KWHzl(context, C23274hvD.Fragment.ICustomTabsCallbackDefault, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("chainName", value.copydefault().getChainName())));
                c55173xeu.setTitle("");
                c55173xeu.setSubTitle((java.lang.CharSequence) strKWHzl);
                c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.hDKMBd));
                c55173xeu.AEQbTJ().setVisibility(8);
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kbl
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C28425kaY.AhwBna(this.OLrzqt, view);
                    }
                });
                return;
            }
            if (interfaceC28457kbD instanceof InterfaceC28457kbD.Activity) {
                c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.STbtMW));
                c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.closeSocket));
                c55173xeu.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
                c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.getSmallIconId));
                C52794wYp c52794wYpAEQbTJ = c55173xeu.AEQbTJ();
                c52794wYpAEQbTJ.setVisibility(0);
                c52794wYpAEQbTJ.setOKDSSize(36);
                c52794wYpAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.onLocationChanged);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setBounds(0, 0, C55298xhM.dp2px$default(12.0f, null, 1, null), C55298xhM.dp2px$default(12.0f, null, 1, null));
                    drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
                } else {
                    drawableKWHzl = null;
                }
                c52794wYpAEQbTJ.setCompoundDrawablesRelative(drawableKWHzl, null, null, null);
                c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.kbm
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        C28425kaY.djBIcL(this.KWHzl, view);
                    }
                });
            }
        }
    }

    public static final void AhwBna(C28425kaY c28425kaY, android.view.View view) {
        c28425kaY.djBIcL().fetchVPNInfo();
    }

    public static final void djBIcL(C28425kaY c28425kaY, android.view.View view) {
        FragmentActivity activity = c28425kaY.getActivity();
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent(c28425kaY.getActivity(), (java.lang.Class<?>) ActivityC29450ktq.class);
            C31200lpY.EZpvd(intent, "default_trade");
            activity.startActivity(intent);
        }
    }

    public final void AEQbTJ(final HomeFavoriteListFilter homeFavoriteListFilter, int i) {
        java.lang.Object next;
        final C21472hAq c21472hAq = this.fJNWhG;
        if (c21472hAq != null) {
            c21472hAq.KWHzl.setQuickPickOptions(homeFavoriteListFilter.AhwBna());
            java.util.Iterator<T> it = homeFavoriteListFilter.AhwBna().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (C33129mqd.AhwBna(((HomeChainFilterUiModel) next).AEQbTJ()) == i) {
                        break;
                    }
                }
            }
            HomeChainFilterUiModel homeChainFilterUiModel = (HomeChainFilterUiModel) next;
            if (homeChainFilterUiModel != null) {
                kLP.setSelection$default(c21472hAq.KWHzl, homeChainFilterUiModel, -20, 0, 4, null);
            } else {
                new Function0() { // from class: o.kaZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return C28425kaY.KWHzl(homeFavoriteListFilter, c21472hAq);
                    }
                };
            }
            c21472hAq.fIwbmz.setData(new kMC(homeFavoriteListFilter.valueOf(), homeFavoriteListFilter.AYXKKw()), false);
            copydefault(HomeFavoriteListFilter.Companion.EZpvd(homeFavoriteListFilter) ? C52761wXj.TaskDescription.dPnHjp : C52761wXj.TaskDescription.GVpNrs);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.kLP.setSelection$default(o.kLP, com.okinc.business.market.widget.home_filter.HomeChainFilterUiModel, int, int, int, java.lang.Object):void */
    public static final Unit KWHzl(HomeFavoriteListFilter homeFavoriteListFilter, C21472hAq c21472hAq) {
        HomeChainFilterUiModel homeChainFilterUiModel = (HomeChainFilterUiModel) CollectionsKt___CollectionsKt.firstOrNull(homeFavoriteListFilter.AhwBna());
        if (homeChainFilterUiModel == null) {
            return null;
        }
        kLP.setSelection$default(c21472hAq.KWHzl, homeChainFilterUiModel, -20, 0, 4, null);
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        C21472hAq c21472hAq = this.fJNWhG;
        if (c21472hAq != null) {
            c21472hAq.AkhnZx.setAdapter(EZpvd());
            c21472hAq.AkhnZx.setItemAnimator(null);
            C55113xdn c55113xdn = c21472hAq.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            C22361hds.OLrzqt(c55113xdn, CDNSourceManager.LottieSource.DEX_MARKET_TOKEN_LIST_LOADING);
            c21472hAq.KWHzl.setCallback(this.gEmmrt);
            c21472hAq.KWHzl.OLrzqt(false);
            c21472hAq.KWHzl.EZpvd(true);
            c21472hAq.KWHzl.OLrzqt(24);
            c21472hAq.fIwbmz.EZpvd(true);
            c21472hAq.fIwbmz.setCallback(this.ejfBZ);
            c21472hAq.OLrzqt.setRetryClickListener(new View.OnClickListener() { // from class: o.kba
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28425kaY.copydefault(this.KWHzl, view);
                }
            });
            c21472hAq.gEmmrt.EZpvd().setTextColor(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
            c21472hAq.gEmmrt.setRetryClickListener(new View.OnClickListener() { // from class: o.kbi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C28425kaY.valueOf(this.copydefault, view);
                }
            });
            C33546myW c33546myW = c21472hAq.DbNXlk;
            c33546myW.OLrzqt(new InterfaceC57903yrG() { // from class: o.kbt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    C28425kaY.AEQbTJ(this.OLrzqt, interfaceC57934yrl);
                }
            });
            c33546myW.djBIcL(AYXKKw().AEQbTJ());
        }
        setWatchlistMenu$default(this, 0, 1, null);
    }

    public static final void copydefault(C28425kaY c28425kaY, android.view.View view) {
        updateWatchlistGroups$default(c28425kaY, false, 1, null);
        HomeFavoriteListViewModel.loadData$default(c28425kaY.djBIcL(), false, false, false, 7, null);
    }

    public static final void valueOf(C28425kaY c28425kaY, android.view.View view) {
        xWO xwo = (xWO) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWO.class));
        if (xwo != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = c28425kaY.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            xWO.ActionBar.showConnectWalletDialog$default(xwo, childFragmentManager, c28425kaY.new PendingIntent(), (java.util.List) null, (java.util.List) null, (InterfaceC54856xXw) null, 28, (java.lang.Object) null);
        }
    }

    /* JADX INFO: renamed from: o.kaY$PendingIntent */
    public static final class PendingIntent implements InterfaceC54859xXz {
        public PendingIntent() {
        }

        public static final Unit copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            return Unit.INSTANCE;
        }

        @Override // o.InterfaceC54859xXz
        public void EZpvd() {
            C32866mlf.onEvent$default("app_swap_create_wallet", (TrackChannel[]) null, new Function1() { // from class: o.kbx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C28425kaY.PendingIntent.copydefault((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            HomeFavoriteListViewModel.loadData$default(C28425kaY.this.djBIcL(), false, false, false, 7, null);
        }
    }

    public static final void AEQbTJ(C28425kaY c28425kaY, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        HomeFavoriteListViewModel.loadData$default(c28425kaY.djBIcL(), false, true, false, 5, null);
        c28425kaY.AkhnZx = true;
    }

    public static /* synthetic */ void setWatchlistMenu$default(C28425kaY c28425kaY, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = C52761wXj.TaskDescription.dPnHjp;
        }
        c28425kaY.copydefault(i);
    }

    public final void copydefault(int i) {
        C21472hAq c21472hAq = this.fJNWhG;
        if (c21472hAq != null) {
            java.util.List listOLrzqt = C56402yEa.OLrzqt();
            listOLrzqt.add(new InterfaceC28532kcZ.TaskDescription("id.watchlist_group", java.lang.Integer.valueOf(C52761wXj.TaskDescription.sCB), null, 4, null));
            listOLrzqt.add(new InterfaceC28532kcZ.TaskDescription("id.watchlist_filter", java.lang.Integer.valueOf(i), null, 4, null));
            c21472hAq.AYXKKw.setData(C56402yEa.fARcdN(listOLrzqt));
            c21472hAq.AYXKKw.setCallback(this.isConnected);
            android.view.View viewKWHzl = c21472hAq.AYXKKw.KWHzl(0);
            if (viewKWHzl != null) {
                viewKWHzl.setContentDescription("web3_dex_watchlist_edit_icon");
            }
        }
    }

    public final void EZpvd(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair, final HomeToken homeToken) {
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        C21979hTk c21979hTkOLrzqt = C21979hTk.Companion.OLrzqt(pair.getSecond().intValue(), !homeToken.DbNXlk(), new Function0() { // from class: o.kbc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28425kaY.AEQbTJ(homeToken, this);
            }
        }, new Function0() { // from class: o.kbf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28425kaY.valueOf(this.AEQbTJ, homeToken);
            }
        }, new Function0() { // from class: o.kbd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28425kaY.hDKMBd(this.OLrzqt);
            }
        });
        Intrinsics.copydefault(childFragmentManager);
        c21979hTkOLrzqt.show(childFragmentManager, C28425kaY.class.getName());
        OLrzqt(pair);
    }

    public static final Unit AEQbTJ(HomeToken homeToken, C28425kaY c28425kaY) {
        C25352ivB.startVibrator$default(0L, 1, null);
        handleFavoriteStatusResult$default(c28425kaY, homeToken.DbNXlk() ? FavoriteAction.RemoveFromWatchList : FavoriteAction.AddToWatchList, C56402yEa.EZpvd(homeToken), null, null, 12, null);
        trackPageClick$default(c28425kaY, null, null, null, null, homeToken.DbNXlk() ? "no" : "yes", null, null, WalletImportError.ERROR_CODE_GET_EOA_ADDRESS_KEY, null);
        c28425kaY.EZpvd("list_token_add");
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C28425kaY c28425kaY, HomeToken homeToken) {
        c28425kaY.djBIcL().OLrzqt(homeToken);
        c28425kaY.EZpvd("list_token_pin_top");
        return Unit.INSTANCE;
    }

    public static final Unit hDKMBd(C28425kaY c28425kaY) {
        c28425kaY.DbNXlk();
        c28425kaY.EZpvd("list_token_manage");
        return Unit.INSTANCE;
    }

    public final void DbNXlk() {
        java.lang.String strOLrzqt = Intrinsics.EZpvd((java.lang.Object) djBIcL().OLrzqt().getValue().OLrzqt(), (java.lang.Object) "-100") ? "chain_id_collection" : djBIcL().OLrzqt().getValue().OLrzqt();
        int iGEmmrt = djBIcL().OLrzqt().getValue().gEmmrt();
        java.util.List<HomeChainFilterUiModel> listAhwBna = djBIcL().OLrzqt().getValue().AhwBna();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listAhwBna, 10));
        java.util.Iterator<T> it = listAhwBna.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(C33129mqd.AhwBna(((HomeChainFilterUiModel) it.next()).AEQbTJ())));
        }
        WatchlistEditParams watchlistEditParams = new WatchlistEditParams(strOLrzqt, iGEmmrt, arrayList);
        android.content.Intent intent = new android.content.Intent(getActivity(), (java.lang.Class<?>) ActivityC28461kbH.class);
        intent.putExtra("key.watchlist_edit", watchlistEditParams);
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.AhwBna;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(intent);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kaY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleFavoriteStatusResult$default(C28425kaY c28425kaY, FavoriteAction favoriteAction, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            list2 = yDY.AhwBna();
        }
        if ((i & 8) != 0) {
            list3 = yDY.AhwBna();
        }
        c28425kaY.OLrzqt(favoriteAction, list, list2, list3);
    }

    public final void OLrzqt(FavoriteAction favoriteAction, java.util.List<HomeToken> list, java.util.List<java.lang.Integer> list2, java.util.List<java.lang.Integer> list3) {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new HomeFavoriteListFragment$handleFavoriteStatusResult$1(this, favoriteAction, list, list2, list3, null), 3, null);
    }

    @Override // o.kCQ
    public void AEQbTJ(@NotNull java.util.List<HomeToken> list, @NotNull kotlin.Pair<? extends java.util.List<java.lang.Integer>, ? extends java.util.List<java.lang.Integer>> pair) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(pair, "");
        OLrzqt(FavoriteAction.UpdateWatchList, list, pair.component1(), pair.component2());
    }

    public final void values() {
        LifecycleCoroutineScope lifecycleScope;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(parentFragment)) != null) {
            C25389ivm.safeLaunch$default(lifecycleScope, null, null, new HomeFavoriteListFragment$refreshWatchlist$1(this, null), 3, null);
        }
        HomeFavoriteListViewModel.loadData$default(djBIcL(), false, false, false, 3, null);
    }

    public final void AEQbTJ(HomeToken homeToken) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "default_trade", new TokenBase(homeToken.OLrzqt(), homeToken.AYXKKw(), homeToken.djBIcL(), "", "", homeToken.values(), "", homeToken.DbNXlk() ? 1 : 0, 0, 0, 0, null, "default_trade", null, null, homeToken.EZpvd(), null, 0, 0, false, null, null, false, false, null, null, null, 0, false, null, null, false, -37120, null), AYXKKw().AEQbTJ() ? "scanner_watchlist" : "watch_list", null, new int[0], 8, null);
        }
    }

    public final void AkhnZx() {
        kCE kceKWHzl = kCE.Companion.KWHzl(new WatchListFilterParams(null, yDY.gEmmrt(TimeIntervalType.FIVE_MIN, TimeIntervalType.ONE_HOUR, TimeIntervalType.FOUR_HOUR, TimeIntervalType.TWENTY_FOUR_HOUR), djBIcL().OLrzqt().getValue(), AYXKKw().AEQbTJ(), 1, null));
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        kceKWHzl.show(childFragmentManager);
    }

    public final void ejfBZ() {
        C21472hAq c21472hAq;
        FragmentActivity activity;
        android.view.View view;
        C55254xgV c55254xgV;
        TabLayout tabLayoutCopydefault;
        TabLayout.Tab tabAt;
        TabLayout.TabView tabView;
        android.view.View viewKWHzl;
        android.view.View view2;
        C55254xgV c55254xgV2;
        TabLayout tabLayoutCopydefault2;
        TabLayout.Tab tabAt2;
        if (this.DbNXlk == null && (c21472hAq = this.fJNWhG) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.fragment.app.Fragment parentFragment = getParentFragment();
            if (parentFragment != null && (view2 = parentFragment.getView()) != null && (c55254xgV2 = (C55254xgV) view2.findViewById(C23274hvD.Application.processStrongAuthMessage)) != null && (tabLayoutCopydefault2 = c55254xgV2.copydefault()) != null && (tabAt2 = tabLayoutCopydefault2.getTabAt(0)) != null) {
                TabLayout.TabView tabView2 = tabAt2.view;
                Intrinsics.checkNotNullExpressionValue(tabView2, "");
                C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(tabView2);
                stateListAnimator.EZpvd(1);
                stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultCallerKtExternalSyntheticLambda1));
                stateListAnimator.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.r8lambdaSjF4PZlnE9fmKbolD64Sz5ghy6c));
                arrayList.add(stateListAnimator);
            }
            android.view.View viewKWHzl2 = c21472hAq.AYXKKw.KWHzl(0);
            if (viewKWHzl2 == null) {
                viewKWHzl2 = c21472hAq.AYXKKw;
                Intrinsics.checkNotNullExpressionValue(viewKWHzl2, "");
            }
            C52812wZg.StateListAnimator stateListAnimator2 = new C52812wZg.StateListAnimator(viewKWHzl2);
            stateListAnimator2.EZpvd(1);
            stateListAnimator2.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultCallerKtExternalSyntheticLambda0));
            stateListAnimator2.OLrzqt(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultCaller));
            arrayList.add(stateListAnimator2);
            androidx.fragment.app.Fragment parentFragment2 = getParentFragment();
            boolean z = (parentFragment2 == null || (view = parentFragment2.getView()) == null || (c55254xgV = (C55254xgV) view.findViewById(C23274hvD.Application.processStrongAuthMessage)) == null || (tabLayoutCopydefault = c55254xgV.copydefault()) == null || (tabAt = tabLayoutCopydefault.getTabAt(0)) == null || (tabView = tabAt.view) == null || tabView.getVisibility() != 0 || (viewKWHzl = c21472hAq.AYXKKw.KWHzl(0)) == null || viewKWHzl.getVisibility() != 0) ? false : true;
            if ((!arrayList.isEmpty() || z) && (activity = getActivity()) != null) {
                C52812wZg c52812wZg = new C52812wZg(activity);
                this.DbNXlk = c52812wZg;
                c52812wZg.EZpvd(arrayList);
                c52812wZg.OLrzqt(3);
                c52812wZg.fARcdN();
                Unit unit = Unit.INSTANCE;
                djBIcL().EZpvd();
            }
        }
    }

    public static /* synthetic */ void trackPageClick$default(C28425kaY c28425kaY, TimeIntervalType timeIntervalType, java.lang.String str, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            timeIntervalType = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            str4 = null;
        }
        c28425kaY.copydefault(timeIntervalType, str, num, bool, str2, str3, str4);
    }

    public final void copydefault(TimeIntervalType timeIntervalType, java.lang.String str, java.lang.Integer num, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        C21847hOn.copydefault(AYXKKw().EZpvd(), (2054 & 2) != 0 ? null : null, (2054 & 4) != 0 ? null : null, (2054 & 8) != 0 ? null : timeIntervalType, (2054 & 16) != 0 ? null : str, (2054 & 32) != 0 ? null : num, (2054 & 64) != 0 ? null : bool, (2054 & 128) != 0 ? null : str2, (2054 & 256) != 0 ? null : str4, (2054 & 512) != 0 ? null : str3, AYXKKw().AEQbTJ(), (2054 & 2048) != 0 ? null : null);
    }

    public final void EZpvd(java.lang.String str) {
        C29229kph.KWHzl(AYXKKw().AEQbTJ(), str);
    }

    public final void OLrzqt(kotlin.Pair<java.lang.Integer, java.lang.Integer> pair) {
        java.lang.Object next;
        hNW hnw;
        android.view.View view;
        android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(android.os.SystemClock.uptimeMillis(), android.os.SystemClock.uptimeMillis(), 3, pair.getFirst().intValue(), pair.getSecond().intValue(), 0);
        C31197lpV c31197lpV = C31197lpV.EZpvd;
        java.util.Iterator it = C59405zgS.EZpvd(getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) C31197lpV.Application.copydefault)).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof hNW) {
                    break;
                }
            }
        }
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
        if (fragment == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            hnw = (hNW) (fragmentActivityRequireActivity instanceof hNW ? fragmentActivityRequireActivity : null);
        } else {
            hnw = (hNW) (fragment instanceof hNW ? fragment : null);
        }
        if (hnw == null || (view = hnw.getView()) == null) {
            return;
        }
        view.dispatchTouchEvent(motionEventObtain);
    }

    private final void fIwbmz() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            android.content.Intent intent = new android.content.Intent(getActivity(), (java.lang.Class<?>) ActivityC29450ktq.class);
            C31200lpY.EZpvd(intent, "default_trade");
            activity.startActivity(intent);
        }
        EZpvd("bottom_token_add");
    }

    public final void fetchVPNInfo() {
        DbNXlk();
        EZpvd("bottom_token_manage");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.AYXKKw.OLrzqt();
        super.onDestroy();
    }

    /* JADX INFO: renamed from: o.kaY$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kaY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28425kaY EZpvd(@NotNull HomeFavouriteListParams homeFavouriteListParams) {
            Intrinsics.checkNotNullParameter(homeFavouriteListParams, "");
            C28425kaY c28425kaY = new C28425kaY();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.home_favourite", homeFavouriteListParams);
            c28425kaY.setArguments(bundle);
            return c28425kaY;
        }
    }

    @Override // o.InterfaceC29291kqq
    public void AEQbTJ(int i) {
        if (AYXKKw().AEQbTJ()) {
            AhwBna();
            djBIcL().gEmmrt();
        }
    }

    public final void AhwBna() {
        HomeFavoriteListViewModel.loadData$default(djBIcL(), false, false, false, 7, null);
    }
}

package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
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
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$10;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$3;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$4;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$5;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$6;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$7;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$8;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$initViewData$9;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$onShareClick$1;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletPnlTokenListDetailViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletSelfAddressCheckerViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletSharePnlTokenViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.dex.api.bean.CoinDetailRedirection;
import com.okinc.business.dex.api.bean.OKDCoinDetailConfig;
import com.okinc.business.dex.api.bean.OKDSourceType;
import com.okinc.business.dex.api.bean.RedirectionType;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eXr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15852eXr extends eXG {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final int AhwBna;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm fJNWhG;
    public int fetchVPNInfo;
    public C16601emx gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public boolean valueOf;
    public RecyclerView.OnScrollListener values;
    public java.lang.String AEQbTJ = "";
    public long djBIcL = Long.MIN_VALUE;
    public java.lang.String AYXKKw = "";
    public int DbNXlk = 1;
    public int AkhnZx = 1;
    public final C59534zip KWHzl = new C59534zip();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AhwBna;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C15852eXr() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$2
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletPnlTokenListDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$5
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletPnlTokenListDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$7
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSharePnlTokenViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$10
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
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$11
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$12
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSelfAddressCheckerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$15
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
        final Function0 function05 = new Function0() { // from class: o.eXA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15852eXr.fARcdN(this.copydefault);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$16
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileAssetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$17
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$18
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiWalletPnlTokenFragment$special$$inlined$viewModels$default$19
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
        this.AhwBna = C13754dXa.TaskDescription.iKEqwx;
    }

    /* JADX INFO: renamed from: o.eXr$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eXr.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C15852eXr copydefault(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2, int i) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            C15852eXr c15852eXr = new C15852eXr();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            bundle.putLong("chain_id", j);
            bundle.putString("chain_name", str2);
            bundle.putInt("type", i);
            c15852eXr.setArguments(bundle);
            return c15852eXr;
        }
    }

    public final WalletPnlTokenListDetailViewModel AEQbTJ() {
        return (WalletPnlTokenListDetailViewModel) this.AuCTel.getValue();
    }

    public final WalletPnlTokenListDetailViewModel KWHzl() {
        return (WalletPnlTokenListDetailViewModel) this.isConnected.getValue();
    }

    public final WalletSharePnlTokenViewModel EZpvd() {
        return (WalletSharePnlTokenViewModel) this.fJNWhG.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletSelfAddressCheckerViewModel DbNXlk() {
        return (WalletSelfAddressCheckerViewModel) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AddressProfileAssetViewModel isConnected() {
        return (AddressProfileAssetViewModel) this.OLrzqt.getValue();
    }

    public static final ViewModelStoreOwner fARcdN(C15852eXr c15852eXr) {
        androidx.fragment.app.Fragment parentFragment = c15852eXr.getParentFragment();
        eVR evr = parentFragment instanceof eVR ? (eVR) parentFragment : null;
        return evr != null ? evr : c15852eXr;
    }

    private final boolean fetchVPNInfo() {
        return isConnected().fJNWhG();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        java.lang.String string2;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "";
        if (arguments == null || (string = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) == null) {
            string = "";
        }
        this.AEQbTJ = string;
        android.os.Bundle arguments2 = getArguments();
        this.djBIcL = arguments2 != null ? arguments2.getLong("chain_id", Long.MIN_VALUE) : Long.MIN_VALUE;
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 != null && (string2 = arguments3.getString("chain_name")) != null) {
            str = string2;
        }
        this.AYXKKw = str;
        android.os.Bundle arguments4 = getArguments();
        this.DbNXlk = arguments4 != null ? arguments4.getInt("type", 1) : 1;
        C32866mlf.onEvent$default("Web3WalletPortfolio_ProfitLossAnalysis_RecentPNL_View", (TrackChannel[]) null, new Function1() { // from class: o.eXC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15852eXr.AEQbTJ(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(C15852eXr c15852eXr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("selected_chain_id", java.lang.String.valueOf(c15852eXr.djBIcL), false);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16601emx c16601emx = this.gEmmrt;
        if (c16601emx == null) {
            Intrinsics.gEmmrt("");
            c16601emx = null;
        }
        RecyclerView recyclerView = c16601emx.djBIcL;
        C16601emx c16601emx2 = this.gEmmrt;
        if (c16601emx2 == null) {
            Intrinsics.gEmmrt("");
            c16601emx2 = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(c16601emx2.djBIcL.getContext()));
        C16601emx c16601emx3 = this.gEmmrt;
        if (c16601emx3 == null) {
            Intrinsics.gEmmrt("");
            c16601emx3 = null;
        }
        c16601emx3.djBIcL.setAdapter(this.KWHzl);
        C16601emx c16601emx4 = this.gEmmrt;
        if (c16601emx4 == null) {
            Intrinsics.gEmmrt("");
            c16601emx4 = null;
        }
        c16601emx4.djBIcL.setNestedScrollingEnabled(true);
        AYXKKw();
        C16601emx c16601emx5 = this.gEmmrt;
        if (c16601emx5 == null) {
            Intrinsics.gEmmrt("");
            c16601emx5 = null;
        }
        c16601emx5.copydefault.djBIcL(false);
        C16601emx c16601emx6 = this.gEmmrt;
        if (c16601emx6 == null) {
            Intrinsics.gEmmrt("");
            c16601emx6 = null;
        }
        c16601emx6.copydefault.AhwBna(true);
        C16601emx c16601emx7 = this.gEmmrt;
        if (c16601emx7 == null) {
            Intrinsics.gEmmrt("");
            c16601emx7 = null;
        }
        c16601emx7.copydefault.OLrzqt(true);
        C16601emx c16601emx8 = this.gEmmrt;
        if (c16601emx8 == null) {
            Intrinsics.gEmmrt("");
            c16601emx8 = null;
        }
        c16601emx8.copydefault.gEmmrt(true);
        C16601emx c16601emx9 = this.gEmmrt;
        if (c16601emx9 == null) {
            Intrinsics.gEmmrt("");
            c16601emx9 = null;
        }
        c16601emx9.copydefault.OLrzqt(new InterfaceC57903yrG() { // from class: o.eXD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57903yrG
            public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                C15852eXr.AEQbTJ(this.EZpvd, interfaceC57934yrl);
            }
        });
        C16601emx c16601emx10 = this.gEmmrt;
        if (c16601emx10 == null) {
            Intrinsics.gEmmrt("");
            c16601emx10 = null;
        }
        c16601emx10.copydefault.KWHzl(new InterfaceC57900yrD() { // from class: o.eXq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C15852eXr.EZpvd(this.copydefault, interfaceC57934yrl);
            }
        });
        AkhnZx();
        fARcdN();
        loadData$default(this, false, 1, null);
    }

    public static final void AEQbTJ(C15852eXr c15852eXr, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c15852eXr.EZpvd(false);
    }

    public static final void EZpvd(C15852eXr c15852eXr, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c15852eXr.ejfBZ();
    }

    public final void AYXKKw() {
        C16601emx c16601emx = this.gEmmrt;
        if (c16601emx == null) {
            Intrinsics.gEmmrt("");
            c16601emx = null;
        }
        AppCompatTextView appCompatTextView = c16601emx.AkhnZx;
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
        AppCompatTextView appCompatTextView2 = c16601emx.fetchVPNInfo;
        appCompatTextView2.setOnClickListener(new Application(appCompatTextView2, 1000L, this));
        AppCompatTextView appCompatTextView3 = c16601emx.values;
        appCompatTextView3.setOnClickListener(new TaskDescription(appCompatTextView3, 1000L, this));
        gEmmrt();
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.values = stateListAnimator;
        c16601emx.djBIcL.addOnScrollListener(stateListAnimator);
    }

    /* JADX INFO: renamed from: o.eXr$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C15852eXr EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C15852eXr c15852eXr) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.EZpvd = c15852eXr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.copydefault(1);
            }
        }
    }

    /* JADX INFO: renamed from: o.eXr$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C15852eXr copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C15852eXr c15852eXr) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c15852eXr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.copydefault(2);
            }
        }
    }

    /* JADX INFO: renamed from: o.eXr$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C15852eXr EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C15852eXr c15852eXr) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c15852eXr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.copydefault(5);
            }
        }
    }

    /* JADX INFO: renamed from: o.eXr$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            C15852eXr.this.OLrzqt(recyclerView);
        }
    }

    public final void OLrzqt(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        C16601emx c16601emx = null;
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition == -1) {
            C16601emx c16601emx2 = this.gEmmrt;
            if (c16601emx2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                c16601emx = c16601emx2;
            }
            c16601emx.AhwBna.setVisibility(8);
            return;
        }
        android.view.View viewFindViewByPosition = linearLayoutManager.findViewByPosition(0);
        boolean z = iFindFirstVisibleItemPosition > 0 || (iFindFirstVisibleItemPosition == 0 && viewFindViewByPosition != null && viewFindViewByPosition.getTop() < 0);
        C16601emx c16601emx3 = this.gEmmrt;
        if (c16601emx3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16601emx = c16601emx3;
        }
        c16601emx.AhwBna.setVisibility(z ? 0 : 8);
    }

    public final void gEmmrt() {
        android.graphics.drawable.Drawable drawable;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        boolean zOLrzqt = C33492mxV.OLrzqt();
        android.graphics.drawable.Drawable drawable2 = ContextCompat.getDrawable(context, this.valueOf ? zOLrzqt ? C13754dXa.Activity.fERRXa : C13754dXa.Activity.fdOvFl : zOLrzqt ? C13754dXa.Activity.aUsmxb : C13754dXa.Activity.dUDNAs);
        android.graphics.drawable.Drawable drawable3 = ContextCompat.getDrawable(context, C13754dXa.Activity.igXuih);
        C16601emx c16601emx = this.gEmmrt;
        if (c16601emx == null) {
            Intrinsics.gEmmrt("");
            c16601emx = null;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = c16601emx.AkhnZx.getCompoundDrawablesRelative();
        Intrinsics.checkNotNullExpressionValue(compoundDrawablesRelative, "");
        int length = compoundDrawablesRelative.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                drawable = null;
                break;
            }
            drawable = compoundDrawablesRelative[i];
            if (drawable != null) {
                break;
            } else {
                i++;
            }
        }
        int intrinsicWidth = drawable != null ? drawable.getIntrinsicWidth() : C55298xhM.dp2px$default(6.0f, null, 1, null);
        int intrinsicHeight = drawable != null ? drawable.getIntrinsicHeight() : C55298xhM.dp2px$default(10.0f, null, 1, null);
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        if (drawable3 != null) {
            drawable3.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        C16601emx c16601emx2 = this.gEmmrt;
        if (c16601emx2 == null) {
            Intrinsics.gEmmrt("");
            c16601emx2 = null;
        }
        int i2 = this.AkhnZx;
        if (i2 == 1) {
            c16601emx2.AkhnZx.setCompoundDrawablesRelative(null, null, drawable2, null);
            c16601emx2.fetchVPNInfo.setCompoundDrawablesRelative(null, null, drawable3, null);
            c16601emx2.values.setCompoundDrawablesRelative(null, null, drawable3, null);
        } else if (i2 == 2) {
            c16601emx2.AkhnZx.setCompoundDrawablesRelative(null, null, drawable3, null);
            c16601emx2.fetchVPNInfo.setCompoundDrawablesRelative(null, null, drawable2, null);
            c16601emx2.values.setCompoundDrawablesRelative(null, null, drawable3, null);
        } else {
            if (i2 != 5) {
                return;
            }
            c16601emx2.AkhnZx.setCompoundDrawablesRelative(null, null, drawable3, null);
            c16601emx2.fetchVPNInfo.setCompoundDrawablesRelative(null, null, drawable3, null);
            c16601emx2.values.setCompoundDrawablesRelative(null, null, drawable2, null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        RecyclerView.OnScrollListener onScrollListener = this.values;
        if (onScrollListener != null) {
            C16601emx c16601emx = this.gEmmrt;
            if (c16601emx == null) {
                Intrinsics.gEmmrt("");
                c16601emx = null;
            }
            c16601emx.djBIcL.removeOnScrollListener(onScrollListener);
        }
        this.values = null;
        super.onDestroyView();
    }

    public static /* synthetic */ void loadData$default(C15852eXr c15852eXr, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        c15852eXr.EZpvd(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(boolean z) {
        if (z) {
            C16601emx c16601emx = this.gEmmrt;
            if (c16601emx == null) {
                Intrinsics.gEmmrt("");
                c16601emx = null;
            }
            c16601emx.KWHzl.setVisibility(0);
            c16601emx.KWHzl.KWHzl(0L);
        }
        this.fetchVPNInfo = 0;
        if (this.DbNXlk == 1) {
            WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModelAEQbTJ = AEQbTJ();
            java.lang.String str = this.AEQbTJ;
            long j = this.djBIcL;
            walletPnlTokenListDetailViewModelAEQbTJ.OLrzqt(str, java.lang.Long.valueOf(j), this.AkhnZx, this.valueOf, this.fetchVPNInfo, 30, false);
            return;
        }
        WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModelAEQbTJ2 = AEQbTJ();
        java.lang.String str2 = this.AEQbTJ;
        long j2 = this.djBIcL;
        walletPnlTokenListDetailViewModelAEQbTJ2.EZpvd(str2, java.lang.Long.valueOf(j2), this.AkhnZx, this.valueOf, this.fetchVPNInfo, 30, false);
    }

    private final void ejfBZ() {
        if (this.DbNXlk == 1) {
            WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModelAEQbTJ = AEQbTJ();
            java.lang.String str = this.AEQbTJ;
            long j = this.djBIcL;
            walletPnlTokenListDetailViewModelAEQbTJ.OLrzqt(str, java.lang.Long.valueOf(j), this.AkhnZx, this.valueOf, this.fetchVPNInfo, 30, true);
            return;
        }
        WalletPnlTokenListDetailViewModel walletPnlTokenListDetailViewModelAEQbTJ2 = AEQbTJ();
        java.lang.String str2 = this.AEQbTJ;
        long j2 = this.djBIcL;
        walletPnlTokenListDetailViewModelAEQbTJ2.EZpvd(str2, java.lang.Long.valueOf(j2), this.AkhnZx, this.valueOf, this.fetchVPNInfo, 30, true);
    }

    private final void AkhnZx() {
        C16601emx c16601emx = this.gEmmrt;
        if (c16601emx == null) {
            Intrinsics.gEmmrt("");
            c16601emx = null;
        }
        c16601emx.KWHzl.setAnimation(C52761wXj.PendingIntent.hDKMBd);
        if (this.DbNXlk == 1) {
            C55173xeu c55173xeu = c16601emx.AEQbTJ;
            ViewGroup.LayoutParams layoutParams = c55173xeu.getLayoutParams();
            layoutParams.height = 0;
            c55173xeu.setLayoutParams(layoutParams);
            c55173xeu.setPadding(0, C55298xhM.dp2px$default(48.0f, null, 1, null), 0, 0);
        }
        C16601emx c16601emx2 = this.gEmmrt;
        if (c16601emx2 == null) {
            Intrinsics.gEmmrt("");
            c16601emx2 = null;
        }
        c16601emx2.EZpvd.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenFragment$initViewData$3(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenFragment$initViewData$4(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenFragment$initViewData$5(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenFragment$initViewData$6(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenFragment$initViewData$7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenFragment$initViewData$8(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenFragment$initViewData$9(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new DefiWalletPnlTokenFragment$initViewData$10(this, null), 3, null);
    }

    public final void AhwBna() {
        C32866mlf.onEvent$default("Web3WalletPortfolio_ProfitLossAnalysis_RecentPNLSort_Click", (TrackChannel[]) null, new Function1() { // from class: o.eXz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15852eXr.KWHzl(this.copydefault, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(C15852eXr c15852eXr, EventParamsList eventParamsList) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("selected_chain_id", java.lang.String.valueOf(c15852eXr.djBIcL), false);
        int i = c15852eXr.AkhnZx;
        if (i == 1) {
            str = "last_active";
        } else if (i == 2) {
            str = "total_profit";
        } else if (i == 5) {
            str = "balance";
        }
        eventParamsList.put("sort_option", str, true);
        eventParamsList.put("sort_order", c15852eXr.valueOf ? "low_to_high" : "high_to_low", true);
        if (c15852eXr.DbNXlk == 1) {
            eventParamsList.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, c15852eXr.AEQbTJ, false);
        } else {
            eventParamsList.put("account_id", c15852eXr.AEQbTJ, false);
        }
        return Unit.INSTANCE;
    }

    public final void copydefault(int i) {
        if (this.AkhnZx != i) {
            this.AkhnZx = i;
            this.valueOf = false;
        } else {
            this.valueOf = !this.valueOf;
        }
        gEmmrt();
        loadData$default(this, false, 1, null);
        AhwBna();
    }

    /* JADX DEBUG: Possible override for method o.eXG.OLrzqt()V */
    public final C15904eZp OLrzqt() {
        return new C15904eZp(this.AkhnZx, this.valueOf);
    }

    private final void fARcdN() {
        this.KWHzl.register(C15904eZp.class, new C15901eZm(new Function0() { // from class: o.eXs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15852eXr.fIwbmz(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.eXy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15852eXr.fJNWhG(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.eXw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15852eXr.ejfBZ(this.copydefault);
            }
        }));
        C59534zip c59534zip = this.KWHzl;
        C15912eZx c15912eZx = new C15912eZx(new Function1() { // from class: o.eXx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15852eXr.OLrzqt(this.EZpvd, (eWR) obj);
            }
        }, new Function1() { // from class: o.eXv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15852eXr.copydefault(this.OLrzqt, (eWR) obj);
            }
        }, new Function2() { // from class: o.eXE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C15852eXr.copydefault(this.OLrzqt, (eWR) obj, (android.view.View) obj2);
            }
        }, fetchVPNInfo());
        c15912eZx.copydefault(this.DbNXlk != 1);
        Unit unit = Unit.INSTANCE;
        c59534zip.register(eWR.class, c15912eZx);
    }

    public static final Unit fIwbmz(C15852eXr c15852eXr) {
        c15852eXr.copydefault(1);
        return Unit.INSTANCE;
    }

    public static final Unit fJNWhG(C15852eXr c15852eXr) {
        c15852eXr.copydefault(2);
        return Unit.INSTANCE;
    }

    public static final Unit ejfBZ(C15852eXr c15852eXr) {
        c15852eXr.copydefault(5);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C15852eXr c15852eXr, eWR ewr) {
        Intrinsics.checkNotNullParameter(ewr, "");
        c15852eXr.OLrzqt(ewr);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C15852eXr c15852eXr, eWR ewr) {
        Intrinsics.checkNotNullParameter(ewr, "");
        OKDCoinDetailConfig oKDCoinDetailConfig = new OKDCoinDetailConfig(OKDSourceType.WALLET_SOURCE, C33129mqd.gEmmrt(ewr.EZpvd()), ewr.AhwBna(), ewr.djBIcL(), null, null, null, new CoinDetailRedirection(RedirectionType.TRADER_DETAIL, c15852eXr.AEQbTJ), WalletImportError.ERROR_CODE_AA_EXIST, null);
        try {
            gKO gko = (gKO) C43251rlk.copydefault(gKO.class);
            FragmentActivity fragmentActivityRequireActivity = c15852eXr.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            gko.OLrzqt(fragmentActivityRequireActivity, oKDCoinDetailConfig);
        } catch (java.lang.Exception e) {
            pUU.copydefault(c15852eXr.getTAG(), "error message = " + e.getMessage());
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C15852eXr c15852eXr, eWR ewr, android.view.View view) {
        Intrinsics.checkNotNullParameter(ewr, "");
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = c15852eXr.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        C52812wZg c52812wZg = new C52812wZg(activity);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(1);
        stateListAnimator.OLrzqt(c15852eXr.getString(C13754dXa.FragmentManager.Size));
        c52812wZg.AEQbTJ(stateListAnimator);
        android.widget.TextView textViewValueOf = c52812wZg.valueOf();
        if (textViewValueOf != null) {
            ViewGroup.LayoutParams layoutParams = textViewValueOf.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            float f = marginLayoutParams != null ? marginLayoutParams.leftMargin : 0;
            ViewGroup.LayoutParams layoutParams2 = textViewValueOf.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            float f2 = marginLayoutParams2 != null ? marginLayoutParams2.rightMargin : 0;
            ViewGroup.LayoutParams layoutParams3 = textViewValueOf.getLayoutParams();
            C55296xhK.OLrzqt(textViewValueOf, java.lang.Float.valueOf(f), java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(f2), java.lang.Float.valueOf((layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null) != null ? r3.bottomMargin : 0));
        }
        c52812wZg.OLrzqt(0);
        c52812wZg.fARcdN();
        C32866mlf.onEvent$default("Web3PNLAnalysis_RecentPNL_RiskWarningIcon_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16601emx c16601emxOLrzqt = C16601emx.OLrzqt(getLayoutInflater(), viewGroup, false);
        this.gEmmrt = c16601emxOLrzqt;
        if (c16601emxOLrzqt == null) {
            Intrinsics.gEmmrt("");
            c16601emxOLrzqt = null;
        }
        ConstraintLayout constraintLayoutEZpvd = c16601emxOLrzqt.getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutEZpvd, "");
        return constraintLayoutEZpvd;
    }

    public final void OLrzqt(eWR ewr) {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiWalletPnlTokenFragment$onShareClick$1(this, ewr, null), 3, null);
    }

    public final void OLrzqt(java.lang.Boolean bool, final eWR ewr) {
        final java.lang.String str = Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) ? "yes" : "no";
        C32866mlf.onEvent$default("AccountProfile_PnLDetails_Share_Click", (TrackChannel[]) null, new Function1() { // from class: o.eXu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15852eXr.KWHzl(this.OLrzqt, ewr, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C15852eXr c15852eXr, eWR ewr, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("chain_name", c15852eXr.AYXKKw, false);
        eventParamsList.put("token_symbol", ewr.djBIcL(), false);
        eventParamsList.put(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, c15852eXr.AEQbTJ, false);
        eventParamsList.put("is_self_sharing", str, false);
        return Unit.INSTANCE;
    }
}

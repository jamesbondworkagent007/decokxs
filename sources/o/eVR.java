package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;
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
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bumptech.glide.Glide;
import com.engagelab.privates.common.constants.MTCommonConstants;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.api.bean.DappSignArgs;
import com.okinc.business.defi.biz.net.bean.SupportPnlChainResponse;
import com.okinc.business.defi.biz.net.bean.WalletPnlAnalysisResponse;
import com.okinc.business.defi.jwt.ui.JwtViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$fetchJwt$1;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$fetchJwt$2$1$1;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$1;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$10;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$11;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$12;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$2;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$3;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$4;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$5;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$6;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$7;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$8;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initListener$9;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initViewData$1$1;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$initViewData$2$4$1;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$onOffNotification$1;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$onPnlChartShareClick$1;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$showAllNetworkInformation$1;
import com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$showSelectedNetworkInformation$1;
import com.okinc.business.defi.wallet.home.addressDetail.ui.ProfileAssetChooseNetworkDialogFragment;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileActivitiesViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetInfoViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletPnlDataViewModel;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.WalletSelfAddressCheckerViewModel;
import com.okinc.business.defi.wallet.mine.search.data.model.TagWrapper;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.robinhood.ticker.TickerView;
import java.math.BigDecimal;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.FlowKt;
import o.C13754dXa;
import o.C15852eXr;
import o.C19595gIe;
import o.C52761wXj;
import o.eSW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class eVR extends AbstractC15830eWw {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public eSW AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final long AkhnZx;
    public boolean AuCTel;
    public boolean AuCTelauCTel;
    public final long AwvSrB;
    public final java.util.HashSet<java.lang.Long> AxsJAY;
    public java.lang.String DTwDnp;
    public boolean DbNXlk;
    public final InterfaceC56387yDm OLrzqt;
    public java.lang.String OcIXYQ;
    public final InterfaceC56387yDm QKVWgx;
    public final InterfaceC56387yDm copydefault;
    public java.lang.String djBIcL;
    public boolean ejfBZ;
    public final InterfaceC56387yDm fARcdN;
    public DialogC55112xdm fJNWhG;
    public AbstractC16600emw fetchVPNInfo;
    public int getFieldNames;
    public final InterfaceC56387yDm getNewProxyInstance;
    public AbstractC32996moC hDKMBd;
    public boolean isConnected;
    public final InterfaceC56387yDm iwGUEr;
    public ProfileAssetChooseNetworkDialogFragment.NetworkData sSMYrx;
    public int uzCIH;
    public java.lang.String valueOf;
    public AbstractC32996moC wlaJM;
    public boolean zLjUOn;
    public java.lang.Integer zsXlph;
    public final java.util.ArrayList<SupportPnlChainResponse> zuBGHE;
    public final int fIwbmz = C13754dXa.TaskDescription.DLGVGj;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.eVV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eVR.AxsJAY(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.eVT
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return eVR.sSMYrx(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm gHZMYf = C56392yDr.copydefault(new Function0() { // from class: o.eWa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Long.valueOf(eVR.OcIXYQ(this.OLrzqt));
        }
    });
    public java.lang.String AubY = "3";
    public long values = Long.MIN_VALUE;

    public static final class Fragment implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    public static final class LoaderManager implements InterfaceC33014moU {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC33014moU
        public void onRefreshCompleted(java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(boolean z) {
        if (this.fetchVPNInfo != null) {
            this.AuCTelauCTel = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fIwbmz;
    }

    public eVR() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$2
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileAssetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$7
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileAssetInfoViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$10
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
        final Function0<androidx.fragment.app.Fragment> function04 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$11
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$12
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(JwtViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$15
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
        final Function0<androidx.fragment.app.Fragment> function05 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$16
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$17
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
        this.QKVWgx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletPnlDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$18
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$19
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$20
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
        final Function0<androidx.fragment.app.Fragment> function06 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$21
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd5 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$22
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function06.invoke();
            }
        });
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSelfAddressCheckerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$23
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd5).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$24
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
                Function0 function07 = function02;
                if (function07 != null && (creationExtras = (CreationExtras) function07.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd5);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$25
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd5);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function07 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$26
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd6 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$27
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function07.invoke();
            }
        });
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileActivitiesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$28
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd6).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$29
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
                Function0 function08 = function02;
                if (function08 != null && (creationExtras = (CreationExtras) function08.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd6);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.DefiWalletProfileAssetDetailFragment$special$$inlined$viewModels$default$30
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd6);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.iwGUEr = C56392yDr.copydefault(new Function0() { // from class: o.eWc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eVR.EZpvd();
            }
        });
        this.getNewProxyInstance = C56392yDr.copydefault(new Function0() { // from class: o.eVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eVR.OLrzqt();
            }
        });
        this.uzCIH = 2;
        this.getFieldNames = 1;
        this.DbNXlk = true;
        this.valueOf = "";
        this.OcIXYQ = "";
        this.DTwDnp = "";
        C10954byG c10954byG = C10954byG.EZpvd;
        C10854bwM c10854bwMIsConnected = c10954byG.valueOf().isConnected();
        this.AkhnZx = c10854bwMIsConnected != null ? c10854bwMIsConnected.fetchVPNInfo() : 0L;
        C10854bwM c10854bwMHDKMBd = c10954byG.valueOf().hDKMBd();
        this.AwvSrB = c10854bwMHDKMBd != null ? c10854bwMHDKMBd.fetchVPNInfo() : 0L;
        this.AxsJAY = new java.util.HashSet<>();
        this.zuBGHE = new java.util.ArrayList<>();
        this.djBIcL = "";
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eVR.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.eVR$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ eVR newInstance$default(ActionBar actionBar, java.lang.String str, java.util.ArrayList arrayList, long j, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                arrayList = null;
            }
            java.util.ArrayList arrayList2 = arrayList;
            if ((i & 4) != 0) {
                j = Long.MIN_VALUE;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                str2 = "3";
            }
            return actionBar.EZpvd(str, arrayList2, j2, str2);
        }

        public final eVR EZpvd(@NotNull java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList, long j, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            eVR evr = new eVR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            bundle.putLongArray("chain_list", arrayList != null ? CollectionsKt___CollectionsKt.AuCTel((java.util.Collection<java.lang.Long>) arrayList) : null);
            bundle.putLong("chain_id", j);
            bundle.putString("periodType", str2);
            evr.setArguments(bundle);
            return evr;
        }
    }

    public static final java.lang.String AxsJAY(eVR evr) {
        android.os.Bundle arguments = evr.getArguments();
        java.lang.String string = arguments != null ? arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS) : null;
        return string == null ? "" : string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String sSMYrx() {
        return (java.lang.String) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<java.lang.Long> gHZMYf() {
        return (java.util.List) this.gEmmrt.getValue();
    }

    public static final java.util.List sSMYrx(eVR evr) {
        long[] longArray;
        java.util.List listOLrzqt;
        android.os.Bundle arguments = evr.getArguments();
        return (arguments == null || (longArray = arguments.getLongArray("chain_list")) == null || (listOLrzqt = yDV.OLrzqt(longArray)) == null) ? yDY.AhwBna() : listOLrzqt;
    }

    public final long AkhnZx() {
        return ((java.lang.Number) this.gHZMYf.getValue()).longValue();
    }

    public static final long OcIXYQ(eVR evr) {
        android.os.Bundle arguments = evr.getArguments();
        if (arguments != null) {
            return arguments.getLong("chain_id", Long.MIN_VALUE);
        }
        return Long.MIN_VALUE;
    }

    public final AddressProfileAssetViewModel DbNXlk() {
        return (AddressProfileAssetViewModel) this.AhwBna.getValue();
    }

    public final AddressProfileAssetInfoViewModel valueOf() {
        return (AddressProfileAssetInfoViewModel) this.AEQbTJ.getValue();
    }

    public final JwtViewModel values() {
        return (JwtViewModel) this.fARcdN.getValue();
    }

    public final WalletPnlDataViewModel fetchVPNInfo() {
        return (WalletPnlDataViewModel) this.QKVWgx.getValue();
    }

    public final WalletSelfAddressCheckerViewModel AhwBna() {
        return (WalletSelfAddressCheckerViewModel) this.OLrzqt.getValue();
    }

    public final AddressProfileActivitiesViewModel djBIcL() {
        return (AddressProfileActivitiesViewModel) this.copydefault.getValue();
    }

    public final java.util.List<InterfaceC9773bbs> isConnected() {
        return (java.util.List) this.iwGUEr.getValue();
    }

    public static final java.util.List EZpvd() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9773bbs.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<InterfaceC9774bbt> AwvSrB() {
        return (java.util.List) this.getNewProxyInstance.getValue();
    }

    public static final java.util.List OLrzqt() {
        return C43251rlk.KWHzl(C56524yIo.AEQbTJ(InterfaceC9774bbt.class));
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ eVR AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, eVR evr) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = evr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                LifecycleOwner viewLifecycleOwner = this.AEQbTJ.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiWalletProfileAssetDetailFragment$initViewData$2$4$1(this.AEQbTJ, null), 3, null);
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ eVR OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, eVR evr) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = evr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if ((this.OLrzqt.zLjUOn || this.OLrzqt.ejfBZ) && this.OLrzqt.DbNXlk().valueOf().size() >= 2) {
                    java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.OqIZjC);
                    for (ProfileAssetChooseNetworkDialogFragment.NetworkData networkData : this.OLrzqt.DbNXlk().valueOf()) {
                        java.lang.String orDefault = this.OLrzqt.DbNXlk().AEQbTJ().getOrDefault(java.lang.Long.valueOf(networkData.getChainId()), "0");
                        Intrinsics.checkNotNullExpressionValue(orDefault, "");
                        networkData.setOriginAsset(orDefault);
                        if (this.OLrzqt.AxsJAY.contains(java.lang.Long.valueOf(networkData.getChainId()))) {
                            networkData.setTagContent(strAYXKKw);
                        } else {
                            networkData.setTagContent("");
                        }
                    }
                    ProfileAssetChooseNetworkDialogFragment profileAssetChooseNetworkDialogFragmentOLrzqt = ProfileAssetChooseNetworkDialogFragment.Companion.OLrzqt(this.OLrzqt.values, this.OLrzqt.DbNXlk().valueOf());
                    profileAssetChooseNetworkDialogFragmentOLrzqt.copydefault(this.OLrzqt.new Application());
                    profileAssetChooseNetworkDialogFragmentOLrzqt.show(this.OLrzqt.getChildFragmentManager(), "ProfileAssetChooseNetworkDialogFragment");
                }
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ eVR OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, eVR evr) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = evr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.getFieldNames();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ eVR OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, eVR evr) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = evr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                LifecycleOwner viewLifecycleOwner = this.OLrzqt.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiWalletProfileAssetDetailFragment$initViewData$1$1(this.OLrzqt, null), 3, null);
            }
        }
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ eVR OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, eVR evr) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = evr;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                eVR evr = this.OLrzqt;
                evr.KWHzl(evr.sSMYrx());
                C19595gIe.StateListAnimator stateListAnimator = C19595gIe.Companion;
                java.lang.String string = this.OLrzqt.getString(C13754dXa.FragmentManager.ActivityResultContractsTakeVideo);
                Intrinsics.checkNotNullExpressionValue(string, "");
                stateListAnimator.AEQbTJ(string, this.OLrzqt.sSMYrx()).KWHzl(this.OLrzqt.getActivity());
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(view, "");
        this.fetchVPNInfo = (AbstractC16600emw) DataBindingUtil.bind(view);
        this.values = AkhnZx();
        android.os.Bundle arguments = getArguments();
        java.lang.String str = "3";
        if (arguments != null && (string = arguments.getString("periodType", "3")) != null) {
            str = string;
        }
        this.AubY = str;
        DTwDnp();
        ejfBZ();
    }

    private final void DTwDnp() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiWalletProfileAssetDetailFragment$initListener$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new DefiWalletProfileAssetDetailFragment$initListener$2(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner3), null, null, new DefiWalletProfileAssetDetailFragment$initListener$3(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner4).launchWhenCreated(new DefiWalletProfileAssetDetailFragment$initListener$4(this, null));
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner5).launchWhenCreated(new DefiWalletProfileAssetDetailFragment$initListener$5(this, null));
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner6).launchWhenCreated(new DefiWalletProfileAssetDetailFragment$initListener$6(this, null));
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner7).launchWhenCreated(new DefiWalletProfileAssetDetailFragment$initListener$7(this, null));
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner8), null, null, new DefiWalletProfileAssetDetailFragment$initListener$8(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner9), null, null, new DefiWalletProfileAssetDetailFragment$initListener$9(this, null), 3, null);
        FlowKt.launchIn(FlowKt.onEach(fetchVPNInfo().OLrzqt(), new DefiWalletProfileAssetDetailFragment$initListener$10(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner10), null, null, new DefiWalletProfileAssetDetailFragment$initListener$11(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner11), null, null, new DefiWalletProfileAssetDetailFragment$initListener$12(this, null), 3, null);
    }

    public final void copydefault(ProfileAssetChooseNetworkDialogFragment.NetworkData networkData) {
        java.lang.String strOLrzqt;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiWalletProfileAssetDetailFragment$showSelectedNetworkInformation$1(this, networkData, null), 3, null);
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null) {
            this.values = networkData.getChainId();
            this.sSMYrx = networkData;
            abstractC16600emw.valueOf.setVisibility(0);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) networkData.getCoinUrl())) {
                strOLrzqt = networkData.getCoinUrl();
            } else {
                strOLrzqt = C9700baY.OLrzqt(java.lang.String.valueOf(C59454zhO.wlaJM(networkData.getSymbol())));
            }
            AEQbTJ(strOLrzqt);
            if (this.AxsJAY.contains(java.lang.Long.valueOf(this.values))) {
                fIwbmz();
                wlaJM();
            } else {
                fARcdN();
            }
            if (DbNXlk().valueOf().size() < 2) {
                abstractC16600emw.valueOf.setClickable(false);
            } else {
                abstractC16600emw.valueOf.setClickable(true);
            }
        }
    }

    public final void copydefault(WalletPnlAnalysisResponse walletPnlAnalysisResponse) {
        if (walletPnlAnalysisResponse == null) {
            pUU.copydefault(getTAG(), "onPnlChartShareClick response is null");
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiWalletProfileAssetDetailFragment$onPnlChartShareClick$1(this, walletPnlAnalysisResponse, null), 3, null);
    }

    public final void KWHzl(boolean z) {
        final java.lang.String str = z ? "yes" : "no";
        C32866mlf.onEvent$default("AccountProfile_TotalPnL_Share_Click", (TrackChannel[]) null, new Function1() { // from class: o.eWl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eVR.KWHzl(this.EZpvd, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(eVR evr, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        ProfileAssetChooseNetworkDialogFragment.NetworkData networkData = evr.sSMYrx;
        java.lang.String chainName = networkData != null ? networkData.getChainName() : null;
        EventParamsList.put$default(eventParamsList, "chain_name", chainName == null ? "" : chainName, false, 4, null);
        EventParamsList.put$default(eventParamsList, WalletSearchRequest.SEARCH_SOURCE_ADDRESS, evr.sSMYrx(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "is_self_sharing", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void setNetworkIcon$default(eVR evr, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        evr.AEQbTJ(str);
    }

    public final void AEQbTJ(java.lang.String str) {
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null) {
            ComponentCallbacks2C5333Nr componentCallbacks2C5333NrKWHzl = Glide.KWHzl(abstractC16600emw.valueOf);
            java.lang.Object objKWHzl = str;
            if (str == null) {
                objKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.createSocket);
            }
            componentCallbacks2C5333NrKWHzl.KWHzl(objKWHzl).KWHzl(C52761wXj.TaskDescription.fERRXa).AEQbTJ(C52761wXj.TaskDescription.fERRXa).copydefault(C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(24, (android.content.Context) null, 1, (java.lang.Object) null)).EZpvd((android.widget.ImageView) abstractC16600emw.valueOf);
        }
    }

    public final void uzCIH() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiWalletProfileAssetDetailFragment$showAllNetworkInformation$1(this, null), 3, null);
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null) {
            abstractC16600emw.valueOf.setVisibility(0);
            this.values = Long.MIN_VALUE;
            this.sSMYrx = null;
            setNetworkIcon$default(this, null, 1, null);
            abstractC16600emw.valueOf.setClickable(true);
            fARcdN();
        }
    }

    public final void ejfBZ() {
        android.widget.ImageView imageView;
        C55113xdn c55113xdn;
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null && (c55113xdn = abstractC16600emw.AuCTel) != null) {
            c55113xdn.setAnimation(C52761wXj.PendingIntent.hDKMBd);
        }
        AbstractC16600emw abstractC16600emw2 = this.fetchVPNInfo;
        if (abstractC16600emw2 != null && (imageView = abstractC16600emw2.getNewProxyInstance) != null) {
            imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
        }
        final AbstractC16600emw abstractC16600emw3 = this.fetchVPNInfo;
        if (abstractC16600emw3 != null) {
            ViewGroup.LayoutParams layoutParams = abstractC16600emw3.valueOf.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = C33570myu.OLrzqt();
                abstractC16600emw3.valueOf.setLayoutParams(layoutParams2);
            }
            setNetworkIcon$default(this, null, 1, null);
            ShapeableImageView shapeableImageView = abstractC16600emw3.valueOf;
            shapeableImageView.setOnClickListener(new FragmentManager(shapeableImageView, 1000L, this));
            AppCompatImageView appCompatImageView = abstractC16600emw3.zuBGHE;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            C14725dqq.copydefault(appCompatImageView, sSMYrx(), C13754dXa.Activity.fJNWhG, new Function1() { // from class: o.eVO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eVR.OLrzqt((C5335Nt) obj);
                }
            }, 32.0f);
            android.widget.FrameLayout frameLayout = abstractC16600emw3.DbNXlk;
            frameLayout.setOnClickListener(new Dialog(frameLayout, 1000L, this));
            valueOf().AEQbTJ(sSMYrx());
            valueOf().KWHzl(sSMYrx());
            AppCompatTextView appCompatTextView = abstractC16600emw3.wlaJM;
            C14079deg c14079deg = C14079deg.EZpvd;
            appCompatTextView.setText(C14079deg.getAddressStr$default(c14079deg, sSMYrx(), false, 2, null));
            abstractC16600emw3.AwvSrB.setText(C14079deg.getAddressStr$default(c14079deg, sSMYrx(), false, 2, null));
            abstractC16600emw3.sSMYrx.setTypeface(ResourcesCompat.getFont(context, C52761wXj.Dialog.EZpvd));
            abstractC16600emw3.sSMYrx.setGravity(C55296xhK.OLrzqt(context) ? 8388613 : 8388611);
            AppCompatImageView appCompatImageView2 = abstractC16600emw3.fJNWhG;
            appCompatImageView2.setOnClickListener(new PendingIntent(appCompatImageView2, 1000L, this));
            abstractC16600emw3.sSMYrx.setCharacterLists(C57862yqS.copydefault());
            AppCompatImageView appCompatImageView3 = abstractC16600emw3.gHZMYf;
            appCompatImageView3.setOnClickListener(new VoiceInteractor(appCompatImageView3, 1000L, this));
            abstractC16600emw3.AuCTelauCTel.EZpvd().copydefault().setAnimation(C52761wXj.PendingIntent.fetchVPNInfo);
            abstractC16600emw3.zsXlph.OLrzqt(new InterfaceC57903yrG() { // from class: o.eVW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57903yrG
                public final void copydefault(InterfaceC57934yrl interfaceC57934yrl) {
                    eVR.OLrzqt(this.OLrzqt, abstractC16600emw3, interfaceC57934yrl);
                }
            });
            abstractC16600emw3.uzCIH.setPeriodType(this.AubY);
            abstractC16600emw3.uzCIH.setOnPeriodTypeClick(new Function0() { // from class: o.eWg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eVR.EZpvd(this.copydefault, abstractC16600emw3);
                }
            });
            abstractC16600emw3.uzCIH.setOnRetryCallBack(new Function0() { // from class: o.eWi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eVR.zuBGHE(this.KWHzl);
                }
            });
            KWHzl(abstractC16600emw3);
        }
        OcIXYQ();
    }

    public static final class Application implements Function1<ProfileAssetChooseNetworkDialogFragment.NetworkData, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(ProfileAssetChooseNetworkDialogFragment.NetworkData networkData) {
            copydefault(networkData);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Class process forced to load method for inline: com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel.loadAddressAssetInformation$default(com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel, java.lang.String, java.util.List, boolean, int, boolean, boolean, int, java.lang.Object):void */
        public final void copydefault(final ProfileAssetChooseNetworkDialogFragment.NetworkData networkData) {
            Intrinsics.checkNotNullParameter(networkData, "");
            C32866mlf.onEvent$default("Web3profile_HomePage_Network_Click", (TrackChannel[]) null, new Function1<EventParamsList, Unit>() { // from class: o.eVR.Application.4
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
                    AEQbTJ(eventParamsList);
                    return Unit.INSTANCE;
                }

                public final void AEQbTJ(EventParamsList eventParamsList) {
                    Intrinsics.checkNotNullParameter(eventParamsList, "");
                    EventParamsList.put$default(eventParamsList, "chain", networkData.getChainName(), false, 4, null);
                }
            }, 1, (java.lang.Object) null);
            eVR.this.zsXlph();
            if (networkData.getChainId() == Long.MIN_VALUE) {
                eVR.this.uzCIH();
                AddressProfileAssetViewModel.loadAddressAssetInformation$default(eVR.this.DbNXlk(), eVR.this.sSMYrx(), eVR.this.gHZMYf(), false, 0, false, false, 60, null);
            } else {
                eVR.this.copydefault(networkData);
                AddressProfileAssetViewModel.loadAddressAssetInformation$default(eVR.this.DbNXlk(), eVR.this.sSMYrx(), C56402yEa.EZpvd(java.lang.Long.valueOf(eVR.this.values)), true, 1, true, false, 32, null);
            }
            eVR.this.zuBGHE();
        }
    }

    public static final Unit OLrzqt(C5335Nt c5335Nt) {
        Intrinsics.checkNotNullParameter(c5335Nt, "");
        c5335Nt.EZpvd((NN<android.graphics.Bitmap>) new C5417Qx(C55298xhM.dp2px$default(8.0f, null, 1, null)));
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(eVR evr, AbstractC16600emw abstractC16600emw, InterfaceC57934yrl interfaceC57934yrl) {
        java.util.List<java.lang.Long> listEZpvd;
        AbstractC32996moC abstractC32996moC;
        AbstractC32996moC abstractC32996moC2;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        long j = evr.values;
        if (j == Long.MIN_VALUE) {
            listEZpvd = evr.gHZMYf();
        } else {
            listEZpvd = C56402yEa.EZpvd(java.lang.Long.valueOf(j));
        }
        AddressProfileAssetViewModel.loadAddressAssetInformation$default(evr.DbNXlk(), evr.sSMYrx(), listEZpvd, false, 0, evr.values != Long.MIN_VALUE, true, 12, null);
        if (evr.AxsJAY.contains(java.lang.Long.valueOf(evr.values))) {
            evr.fIwbmz();
        }
        AbstractC32996moC abstractC32996moC3 = evr.wlaJM;
        if (abstractC32996moC3 != null && abstractC32996moC3.isAdded() && (abstractC32996moC2 = evr.wlaJM) != null) {
            abstractC32996moC2.onRefresh(java.lang.Boolean.valueOf(evr.uzCIH == abstractC16600emw.djBIcL.getCurrentItem()), new Fragment());
        }
        AbstractC32996moC abstractC32996moC4 = evr.hDKMBd;
        if (abstractC32996moC4 == null || !abstractC32996moC4.isAdded() || (abstractC32996moC = evr.hDKMBd) == null) {
            return;
        }
        abstractC32996moC.onRefresh(java.lang.Boolean.valueOf(evr.getFieldNames == C15838eXd.KWHzl.EZpvd("portfolio")), new LoaderManager());
    }

    public static final Unit EZpvd(final eVR evr, final AbstractC16600emw abstractC16600emw) {
        C15890eZb.Companion.copydefault(evr.AubY, new Function1() { // from class: o.eWk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eVR.copydefault(this.OLrzqt, abstractC16600emw, (java.lang.String) obj);
            }
        }).show(evr.getChildFragmentManager(), "ProfilePnlPeriodTypeDialogFragment");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(final eVR evr, AbstractC16600emw abstractC16600emw, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (str.length() > 0) {
            evr.AubY = str;
            abstractC16600emw.uzCIH.setPeriodType(str);
            evr.AuCTel();
            C32866mlf.onEvent$default("Web3WalletPortfolio_ProfitLossAnalysis_Duration_Click", (TrackChannel[]) null, new Function1() { // from class: o.eWd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eVR.KWHzl(this.copydefault, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(eVR evr, EventParamsList eventParamsList) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("selected_chain_id", java.lang.String.valueOf(evr.values), false);
        java.lang.String str2 = evr.AubY;
        switch (str2.hashCode()) {
            case 51:
                str2.equals("3");
                break;
            case 52:
                str = !str2.equals("4") ? "seven_day" : "one_month";
                break;
            case 53:
                if (str2.equals("5")) {
                    str = "three_month";
                    break;
                }
                break;
        }
        eventParamsList.put("duration", str, true);
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(eVR evr) {
        evr.AuCTel();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void OcIXYQ() {
        zsXlph();
        fetchVPNInfo().AYXKKw();
        DbNXlk().EZpvd(sSMYrx());
        AddressProfileAssetViewModel addressProfileAssetViewModelDbNXlk = DbNXlk();
        java.lang.String strSSMYrx = sSMYrx();
        java.util.List<java.lang.Long> listGHZMYf = gHZMYf();
        addressProfileAssetViewModelDbNXlk.EZpvd(strSSMYrx, listGHZMYf != null ? new java.util.ArrayList<>(listGHZMYf) : null);
    }

    public final void iwGUEr() {
        AddressProfileAssetViewModel.loadAddressAssetInformation$default(DbNXlk(), sSMYrx(), gHZMYf(), false, 0, false, false, 60, null);
    }

    public final void fIwbmz() {
        if (this.values == Long.MIN_VALUE) {
            return;
        }
        AuCTel();
        hDKMBd();
    }

    public final void AuCTel() {
        C14706dqX c14706dqX;
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null && (c14706dqX = abstractC16600emw.uzCIH) != null) {
            c14706dqX.setData(null, 1, false);
        }
        fetchVPNInfo().copydefault(this.AubY, sSMYrx(), this.values);
    }

    public final void hDKMBd() {
        WalletPnlDataViewModel.getWalletAddressPnlTokenList$default(fetchVPNInfo(), sSMYrx(), java.lang.Long.valueOf(this.values), 0, false, 0, 0, 60, null);
    }

    public final void zsXlph() {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        if (this.fJNWhG == null) {
            this.fJNWhG = new DialogC55112xdm(context, C13754dXa.LoaderManager.isConnected);
        }
        if (isDetached() || isRemoving()) {
            return;
        }
        try {
            DialogC55112xdm dialogC55112xdm = this.fJNWhG;
            if (dialogC55112xdm != null) {
                dialogC55112xdm.show();
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "error message:" + e.getMessage());
        }
    }

    public final void AYXKKw() {
        DialogC55112xdm dialogC55112xdm = this.fJNWhG;
        if (dialogC55112xdm != null) {
            dialogC55112xdm.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zuBGHE() {
        ActivityResultCaller activityResultCaller = this.wlaJM;
        boolean z = activityResultCaller instanceof InterfaceC54847xXn;
        if (z) {
            InterfaceC54847xXn interfaceC54847xXn = z ? (InterfaceC54847xXn) activityResultCaller : null;
            if (interfaceC54847xXn != null) {
                long j = this.values;
                long j2 = j == Long.MIN_VALUE ? -1L : j;
                if (j == Long.MIN_VALUE) {
                    j = -1;
                }
                interfaceC54847xXn.KWHzl(j2, j, false);
            }
        }
        ActivityResultCaller activityResultCaller2 = this.hDKMBd;
        boolean z2 = activityResultCaller2 instanceof InterfaceC54847xXn;
        if (z2) {
            InterfaceC54847xXn interfaceC54847xXn2 = z2 ? (InterfaceC54847xXn) activityResultCaller2 : null;
            if (interfaceC54847xXn2 != null) {
                long j3 = this.values;
                interfaceC54847xXn2.KWHzl(j3 == Long.MIN_VALUE ? -1L : j3, j3 == Long.MIN_VALUE ? -1L : j3, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EZpvd(boolean z, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DefiWalletProfileAssetDetailFragment$onOffNotification$1 defiWalletProfileAssetDetailFragment$onOffNotification$1;
        final int i;
        final eVR evr;
        int i2;
        Function0<Unit> function0;
        if (continuation instanceof DefiWalletProfileAssetDetailFragment$onOffNotification$1) {
            defiWalletProfileAssetDetailFragment$onOffNotification$1 = (DefiWalletProfileAssetDetailFragment$onOffNotification$1) continuation;
            int i3 = defiWalletProfileAssetDetailFragment$onOffNotification$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                defiWalletProfileAssetDetailFragment$onOffNotification$1.label = i3 - Integer.MIN_VALUE;
            } else {
                defiWalletProfileAssetDetailFragment$onOffNotification$1 = new DefiWalletProfileAssetDetailFragment$onOffNotification$1(this, continuation);
            }
        }
        java.lang.Object obj = defiWalletProfileAssetDetailFragment$onOffNotification$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i4 = defiWalletProfileAssetDetailFragment$onOffNotification$1.label;
        if (i4 == 0) {
            C56391yDq.AEQbTJ(obj);
            i = !this.AuCTelauCTel ? 1 : 0;
            if (z) {
                JwtViewModel jwtViewModelValues = values();
                defiWalletProfileAssetDetailFragment$onOffNotification$1.L$0 = this;
                defiWalletProfileAssetDetailFragment$onOffNotification$1.I$0 = i;
                defiWalletProfileAssetDetailFragment$onOffNotification$1.label = 1;
                java.lang.Object objCopydefault2 = jwtViewModelValues.copydefault(defiWalletProfileAssetDetailFragment$onOffNotification$1);
                if (objCopydefault2 == objCopydefault) {
                    return objCopydefault;
                }
                evr = this;
                obj = objCopydefault2;
                i2 = i;
            } else {
                evr = this;
                function0 = new Function0() { // from class: o.eVU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return eVR.copydefault(this.OLrzqt, i);
                    }
                };
                defiWalletProfileAssetDetailFragment$onOffNotification$1.L$0 = null;
                defiWalletProfileAssetDetailFragment$onOffNotification$1.label = 2;
                if (evr.KWHzl(function0, defiWalletProfileAssetDetailFragment$onOffNotification$1) == objCopydefault) {
                    return objCopydefault;
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C56391yDq.AEQbTJ(obj);
                return Unit.INSTANCE;
            }
            i2 = defiWalletProfileAssetDetailFragment$onOffNotification$1.I$0;
            evr = (eVR) defiWalletProfileAssetDetailFragment$onOffNotification$1.L$0;
            C56391yDq.AEQbTJ(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            evr.valueOf().OLrzqt(evr.sSMYrx(), i2);
            return Unit.INSTANCE;
        }
        i = i2;
        function0 = new Function0() { // from class: o.eVU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return eVR.copydefault(this.OLrzqt, i);
            }
        };
        defiWalletProfileAssetDetailFragment$onOffNotification$1.L$0 = null;
        defiWalletProfileAssetDetailFragment$onOffNotification$1.label = 2;
        if (evr.KWHzl(function0, defiWalletProfileAssetDetailFragment$onOffNotification$1) == objCopydefault) {
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(eVR evr, int i) {
        evr.valueOf().OLrzqt(evr.sSMYrx(), i);
        return Unit.INSTANCE;
    }

    public final void gEmmrt() {
        AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModelValueOf = valueOf();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        addressProfileAssetInfoViewModelValueOf.OLrzqt(fragmentActivityRequireActivity, childFragmentManager, sSMYrx(), this.isConnected);
    }

    public final void OLrzqt(java.util.List<TagWrapper> list) {
        eYE.Companion.AEQbTJ(new java.util.ArrayList(list)).show(getChildFragmentManager(), "javaClass");
    }

    public final void getFieldNames() {
        AddressProfileAssetInfoViewModel addressProfileAssetInfoViewModelValueOf = valueOf();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        addressProfileAssetInfoViewModelValueOf.OLrzqt(fragmentActivityRequireActivity, childFragmentManager, sSMYrx());
    }

    public final void KWHzl(AbstractC16600emw abstractC16600emw) {
        final TaskDescription taskDescription;
        try {
            this.wlaJM = null;
            this.hDKMBd = null;
            if (this.AxsJAY.contains(java.lang.Long.valueOf(this.values))) {
                androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                taskDescription = new TaskDescription(this, childFragmentManager, yDY.copydefault("recent_pnl", MTCommonConstants.Lifecycle.KEY_ACTIVITY));
            } else {
                androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                taskDescription = new TaskDescription(this, childFragmentManager2, null, 2, null);
            }
            abstractC16600emw.djBIcL.setOffscreenPageLimit(taskDescription.OLrzqt().size());
            abstractC16600emw.djBIcL.setAdapter(taskDescription);
            eSW esw = new eSW(abstractC16600emw.AhwBna.AYXKKw(), abstractC16600emw.djBIcL, true, false, new eSW.Activity() { // from class: o.eWe
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.eSW.Activity
                public final void KWHzl(TabLayout.Tab tab, int i) {
                    eVR.AEQbTJ(taskDescription, this, tab, i);
                }
            });
            this.AYXKKw = esw;
            esw.KWHzl();
            abstractC16600emw.AhwBna.copydefault(new Activity(taskDescription, this));
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "attachTabLayout error =" + e.getMessage() + " ");
        }
    }

    public static final void AEQbTJ(TaskDescription taskDescription, eVR evr, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (i < 0 || i >= taskDescription.KWHzl().size()) {
            return;
        }
        tab.setText(evr.getString(taskDescription.KWHzl().get(i).intValue()));
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ eVR OLrzqt;
        public final /* synthetic */ TaskDescription copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity(TaskDescription taskDescription, eVR evr) {
            this.copydefault = taskDescription;
            this.OLrzqt = evr;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String str;
            int position = tab != null ? tab.getPosition() : 0;
            if (position < 0 || position >= this.copydefault.OLrzqt().size()) {
                return;
            }
            java.lang.String str2 = this.copydefault.OLrzqt().get(tab != null ? tab.getPosition() : 0);
            this.OLrzqt.djBIcL = str2;
            int iHashCode = str2.hashCode();
            if (iHashCode == -795192327) {
                str = "wallet";
            } else if (iHashCode == 1121781064) {
                str = "portfolio";
            } else if (iHashCode != 1635687287) {
                return;
            } else {
                str = "collectibles";
            }
            str2.equals(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void KWHzl(java.lang.String str) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        try {
            java.lang.Object systemService = context.getSystemService("clipboard");
            Intrinsics.copydefault(systemService, "");
            ((android.content.ClipboardManager) systemService).setPrimaryClip(android.content.ClipData.newPlainText("", str));
        } catch (java.lang.Exception e) {
            pUU.copydefault(getTAG(), "copyAddressToClipboard error =" + e.getMessage() + " ");
        }
    }

    public final void OLrzqt(java.lang.String str) {
        TickerView tickerView;
        TickerView tickerView2;
        TickerView tickerView3;
        TickerView tickerView4;
        android.content.Context context = getContext();
        if (context == null || str.length() == 0) {
            return;
        }
        int length = str.length();
        float fCopydefault = C56548yJl.copydefault(2.0f - (length * 0.05f), 0.1f);
        int iOLrzqt = C55302xhQ.OLrzqt(context);
        int iCopydefault = C55298xhM.copydefault(48.0f, context);
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        android.text.TextPaint textPaint = new android.text.TextPaint((abstractC16600emw == null || (tickerView4 = abstractC16600emw.sSMYrx) == null) ? null : tickerView4.uzCIH);
        float f = 36.0f;
        textPaint.setTextSize(C55298xhM.gEmmrt(36.0f, context));
        float fMeasureText = textPaint.measureText(str);
        while (fMeasureText > iOLrzqt - iCopydefault && f >= 14.0f) {
            f -= fCopydefault;
            textPaint.setTextSize(C55298xhM.gEmmrt(f, context));
            fMeasureText = textPaint.measureText(str);
        }
        java.lang.Integer num = this.zsXlph;
        if (num == null || num == null || num.intValue() != length) {
            this.zsXlph = java.lang.Integer.valueOf(length);
            this.DbNXlk = true;
        }
        AbstractC16600emw abstractC16600emw2 = this.fetchVPNInfo;
        if (abstractC16600emw2 != null && (tickerView3 = abstractC16600emw2.sSMYrx) != null) {
            tickerView3.setTextSize(C55298xhM.gEmmrt(f, context));
        }
        AbstractC16600emw abstractC16600emw3 = this.fetchVPNInfo;
        if (abstractC16600emw3 != null && (tickerView2 = abstractC16600emw3.sSMYrx) != null) {
            tickerView2.requestLayout();
        }
        AbstractC16600emw abstractC16600emw4 = this.fetchVPNInfo;
        if (abstractC16600emw4 == null || (tickerView = abstractC16600emw4.sSMYrx) == null) {
            return;
        }
        tickerView.setText(str, (this.DbNXlk || StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "*****", false, 2, (java.lang.Object) null)) ? false : true);
    }

    public final void EZpvd(java.util.List<java.lang.Long> list) {
        valueOf().OLrzqt(sSMYrx(), list, this.AxsJAY);
    }

    public final void copydefault(java.util.List<java.lang.Long> list) {
        AbstractC12782ctV abstractC12782ctVOLrzqt = valueOf().OLrzqt();
        java.lang.Boolean boolValueOf = abstractC12782ctVOLrzqt != null ? java.lang.Boolean.valueOf(abstractC12782ctVOLrzqt.QfsBiF()) : null;
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null) {
            boolean z = Intrinsics.EZpvd(boolValueOf, java.lang.Boolean.FALSE) && AEQbTJ(list);
            android.widget.FrameLayout frameLayout = abstractC16600emw.DbNXlk;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "");
            frameLayout.setVisibility(z ? 0 : 8);
            AppCompatImageView appCompatImageView = abstractC16600emw.fJNWhG;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(z ? 0 : 8);
        }
    }

    public final void copydefault(boolean z) {
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null) {
            if (z) {
                abstractC16600emw.fIwbmz.setImageResource(C13754dXa.Activity.call);
                abstractC16600emw.fIwbmz.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.dvKsVJ));
                this.isConnected = true;
            } else {
                abstractC16600emw.fIwbmz.setImageResource(C13754dXa.Activity.run);
                abstractC16600emw.fIwbmz.setImageTintList(C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
                this.isConnected = false;
            }
        }
    }

    public final void EZpvd(java.lang.String str) {
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        this.valueOf = str == null ? "" : str;
        if (str == null || str.length() == 0) {
            if (C33129mqd.OLrzqt((java.lang.CharSequence) this.OcIXYQ)) {
                str = this.OcIXYQ;
            } else {
                str = C33129mqd.OLrzqt((java.lang.CharSequence) sSMYrx()) ? C14079deg.getAddressStr$default(C14079deg.EZpvd, sSMYrx(), false, 2, null) : sSMYrx();
            }
        }
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null && (appCompatTextView2 = abstractC16600emw.AwvSrB) != null) {
            appCompatTextView2.setText(str);
        }
        AbstractC16600emw abstractC16600emw2 = this.fetchVPNInfo;
        if (abstractC16600emw2 == null || (appCompatTextView = abstractC16600emw2.AwvSrB) == null) {
            return;
        }
        appCompatTextView.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object KWHzl(Function0<Unit> function0, Continuation<? super Unit> continuation) throws java.lang.Throwable {
        DefiWalletProfileAssetDetailFragment$fetchJwt$1 defiWalletProfileAssetDetailFragment$fetchJwt$1;
        final Function0<Unit> function02;
        android.content.Context context;
        java.lang.Object objM7386unboximpl;
        final long j;
        final eVR evr;
        if (continuation instanceof DefiWalletProfileAssetDetailFragment$fetchJwt$1) {
            defiWalletProfileAssetDetailFragment$fetchJwt$1 = (DefiWalletProfileAssetDetailFragment$fetchJwt$1) continuation;
            int i = defiWalletProfileAssetDetailFragment$fetchJwt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defiWalletProfileAssetDetailFragment$fetchJwt$1.label = i - Integer.MIN_VALUE;
            } else {
                defiWalletProfileAssetDetailFragment$fetchJwt$1 = new DefiWalletProfileAssetDetailFragment$fetchJwt$1(this, continuation);
            }
        }
        java.lang.Object obj = defiWalletProfileAssetDetailFragment$fetchJwt$1.result;
        java.lang.Object objCopydefault = C56442yFn.copydefault();
        int i2 = defiWalletProfileAssetDetailFragment$fetchJwt$1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            android.content.Context context2 = getContext();
            if (context2 == null) {
                return Unit.INSTANCE;
            }
            long jAxsJAY = AxsJAY();
            JwtViewModel jwtViewModelValues = values();
            defiWalletProfileAssetDetailFragment$fetchJwt$1.L$0 = this;
            defiWalletProfileAssetDetailFragment$fetchJwt$1.L$1 = function0;
            defiWalletProfileAssetDetailFragment$fetchJwt$1.L$2 = context2;
            defiWalletProfileAssetDetailFragment$fetchJwt$1.J$0 = jAxsJAY;
            defiWalletProfileAssetDetailFragment$fetchJwt$1.label = 1;
            java.lang.Object objOLrzqt = jwtViewModelValues.OLrzqt(jAxsJAY, defiWalletProfileAssetDetailFragment$fetchJwt$1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            function02 = function0;
            context = context2;
            objM7386unboximpl = objOLrzqt;
            j = jAxsJAY;
            evr = this;
        } else {
            if (i2 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = defiWalletProfileAssetDetailFragment$fetchJwt$1.J$0;
            context = (android.content.Context) defiWalletProfileAssetDetailFragment$fetchJwt$1.L$2;
            function02 = (Function0) defiWalletProfileAssetDetailFragment$fetchJwt$1.L$1;
            evr = (eVR) defiWalletProfileAssetDetailFragment$fetchJwt$1.L$0;
            C56391yDq.AEQbTJ(obj);
            objM7386unboximpl = ((Result) obj).m7386unboximpl();
        }
        if (Result.m7384isSuccessimpl(objM7386unboximpl)) {
            evr.values().EZpvd().EZpvd(context, (DappSignArgs) objM7386unboximpl, new Function1() { // from class: o.eVX
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return eVR.OLrzqt(this.copydefault, j, function02, (android.os.Bundle) obj2);
                }
            }, null);
        }
        if (Result.m7380exceptionOrNullimpl(objM7386unboximpl) != null) {
            C55326xho.toast$default(evr.getString(C13754dXa.FragmentManager.EmptySuper), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(eVR evr, long j, Function0 function0, android.os.Bundle bundle) {
        LifecycleOwner viewLifecycleOwner = evr.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new DefiWalletProfileAssetDetailFragment$fetchJwt$2$1$1(evr, bundle, j, function0, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void KWHzl(final java.util.List<TagWrapper> list, C19251fxk c19251fxk) {
        android.content.Context context = getContext();
        if (context != null && (!list.isEmpty())) {
            c19251fxk.setTags(C18985fsj.Companion.EZpvd(list, false, context), new Function0() { // from class: o.eWh
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return eVR.EZpvd(this.copydefault, list);
                }
            });
        }
    }

    public static final Unit EZpvd(eVR evr, java.util.List list) {
        evr.OLrzqt((java.util.List<TagWrapper>) list);
        return Unit.INSTANCE;
    }

    public final class TaskDescription extends FragmentStateAdapter {
        public final java.util.List<java.lang.Integer> AEQbTJ;
        public final java.util.List<java.lang.String> EZpvd;
        public final /* synthetic */ eVR OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.Integer> KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<java.lang.String> OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: CONSTRUCTOR 
  (r1v0 o.eVR)
  (r2v0 androidx.fragment.app.FragmentManager)
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.ArrayList:0x000e: INVOKE 
  (wrap:java.lang.String[]:0x000a: FILLED_NEW_ARRAY ("wallet"), ("portfolio"), ("collectibles") A[WRAPPED] elemType: java.lang.String)
 STATIC call: o.yDY.copydefault(java.lang.Object[]):java.util.ArrayList A[MD:<T>:(T[]):java.util.ArrayList<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:1119)) : (r3v0 java.util.ArrayList))
 A[MD:(o.eVR, androidx.fragment.app.FragmentManager, java.util.ArrayList<java.lang.String>):void (m)] (LINE:1117) call: o.eVR.TaskDescription.<init>(o.eVR, androidx.fragment.app.FragmentManager, java.util.ArrayList):void type: THIS */
        public /* synthetic */ TaskDescription(eVR evr, androidx.fragment.app.FragmentManager fragmentManager, java.util.ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(evr, fragmentManager, (i & 2) != 0 ? yDY.copydefault("wallet", "portfolio", "collectibles") : arrayList);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull eVR evr, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.ArrayList<java.lang.String> arrayList) {
            super(fragmentManager, evr.getLifecycle());
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.OLrzqt = evr;
            C15838eXd c15838eXd = C15838eXd.KWHzl;
            this.EZpvd = c15838eXd.OLrzqt(arrayList);
            this.AEQbTJ = c15838eXd.copydefault(arrayList);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.EZpvd.size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [1133=4] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            java.lang.String chainName;
            AbstractC32996moC c15619ePa;
            InterfaceC9774bbt interfaceC9774bbt;
            InterfaceC9773bbs interfaceC9773bbs;
            java.lang.String str = this.EZpvd.get(i);
            switch (str.hashCode()) {
                case -1655966961:
                    if (str.equals(MTCommonConstants.Lifecycle.KEY_ACTIVITY)) {
                        return eXQ.Companion.KWHzl(this.OLrzqt.sSMYrx(), this.OLrzqt.values);
                    }
                    break;
                case 350388810:
                    if (str.equals("recent_pnl")) {
                        C15852eXr.ActionBar actionBar = C15852eXr.Companion;
                        java.lang.String strSSMYrx = this.OLrzqt.sSMYrx();
                        long j = this.OLrzqt.values;
                        ProfileAssetChooseNetworkDialogFragment.NetworkData networkData = this.OLrzqt.sSMYrx;
                        if (networkData == null || (chainName = networkData.getChainName()) == null) {
                            chainName = "";
                        }
                        return actionBar.copydefault(strSSMYrx, j, chainName, 1);
                    }
                    break;
                case 1121781064:
                    if (str.equals("portfolio")) {
                        java.util.List listAwvSrB = this.OLrzqt.AwvSrB();
                        androidx.fragment.app.Fragment fragmentKWHzl = (listAwvSrB == null || (interfaceC9774bbt = (InterfaceC9774bbt) CollectionsKt___CollectionsKt.firstOrNull(listAwvSrB)) == null) ? null : interfaceC9774bbt.KWHzl(this.OLrzqt.sSMYrx(), null);
                        c15619ePa = fragmentKWHzl instanceof AbstractC32996moC ? (AbstractC32996moC) fragmentKWHzl : null;
                        if (c15619ePa == null) {
                            C15619ePa c15619ePa2 = new C15619ePa();
                            pUU.copydefault(this.OLrzqt.getTAG(), "getInvestPlatformListFragment error.");
                            c15619ePa = c15619ePa2;
                        }
                        this.OLrzqt.hDKMBd = c15619ePa;
                        return c15619ePa;
                    }
                    break;
                case 1635687287:
                    if (str.equals("collectibles")) {
                        java.util.List listIsConnected = this.OLrzqt.isConnected();
                        androidx.fragment.app.Fragment fragmentAEQbTJ = (listIsConnected == null || (interfaceC9773bbs = (InterfaceC9773bbs) CollectionsKt___CollectionsKt.AuCTelauCTel(listIsConnected)) == null) ? null : interfaceC9773bbs.AEQbTJ(this.OLrzqt.sSMYrx());
                        c15619ePa = fragmentAEQbTJ instanceof AbstractC32996moC ? (AbstractC32996moC) fragmentAEQbTJ : null;
                        if (c15619ePa == null) {
                            c15619ePa = new C15619ePa();
                            pUU.copydefault(this.OLrzqt.getTAG(), "getNFTAssetEntryFragment error.");
                        }
                        this.OLrzqt.wlaJM = c15619ePa;
                        return c15619ePa;
                    }
                    break;
            }
            return C15840eXf.Companion.OLrzqt(this.OLrzqt.sSMYrx());
        }
    }

    public final java.lang.String EZpvd(java.lang.Integer num) {
        if (num != null && num.intValue() == 10062) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.fromInclusive), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 100)));
        }
        if (num != null && num.intValue() == 10063) {
            return C33069mpW.OLrzqt(C33070mpX.AYXKKw(C13754dXa.FragmentManager.DimenRes), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", 300)));
        }
        return (num != null && num.intValue() == 10066) ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.fromMediaSession) : C33070mpX.AYXKKw(C13754dXa.FragmentManager.skipToQueueItem);
    }

    private final long AxsJAY() {
        java.util.List<InterfaceC9731bbC> listRcXXUw;
        InterfaceC9731bbC interfaceC9731bbC;
        java.util.List<InterfaceC9731bbC> listRcXXUw2;
        AbstractC12782ctV abstractC12782ctVOLrzqt = valueOf().OLrzqt();
        if (abstractC12782ctVOLrzqt != null && abstractC12782ctVOLrzqt.AubY()) {
            return this.AkhnZx;
        }
        AbstractC12782ctV abstractC12782ctVOLrzqt2 = valueOf().OLrzqt();
        java.lang.Object obj = null;
        if (abstractC12782ctVOLrzqt2 != null && (listRcXXUw2 = abstractC12782ctVOLrzqt2.RcXXUw()) != null) {
            java.util.Iterator<T> it = listRcXXUw2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((InterfaceC9731bbC) next).fetchVPNInfo() == this.AkhnZx) {
                    obj = next;
                    break;
                }
            }
            obj = (InterfaceC9731bbC) obj;
        }
        if (obj != null) {
            return this.AkhnZx;
        }
        AbstractC12782ctV abstractC12782ctVOLrzqt3 = valueOf().OLrzqt();
        return (abstractC12782ctVOLrzqt3 == null || (listRcXXUw = abstractC12782ctVOLrzqt3.RcXXUw()) == null || (interfaceC9731bbC = (InterfaceC9731bbC) CollectionsKt___CollectionsKt.AuCTelauCTel(listRcXXUw)) == null) ? this.AkhnZx : interfaceC9731bbC.fetchVPNInfo();
    }

    public final void wlaJM() {
        AbstractC16600emw abstractC16600emw;
        ProfileAssetChooseNetworkDialogFragment.NetworkData networkData;
        final android.content.Context context = getContext();
        if (context == null || (abstractC16600emw = this.fetchVPNInfo) == null) {
            return;
        }
        abstractC16600emw.AEQbTJ.setExpanded(true);
        C14697dqO c14697dqO = abstractC16600emw.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c14697dqO, "");
        c14697dqO.setVisibility(8);
        android.widget.ImageView imageView = abstractC16600emw.ejfBZ;
        Intrinsics.copydefault(imageView);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: o.eWj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eVR.OLrzqt(context, this, view);
            }
        });
        abstractC16600emw.uzCIH.setVisibility(0);
        android.widget.ImageView imageView2 = abstractC16600emw.AubY;
        Intrinsics.copydefault(imageView2);
        imageView2.setVisibility(0);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: o.eWm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eVR.EZpvd(this.copydefault, view);
            }
        });
        final SwitchCompat switchCompat = abstractC16600emw.hDKMBd;
        Intrinsics.copydefault(switchCompat);
        switchCompat.setVisibility(0);
        switchCompat.setOnClickListener(new View.OnClickListener() { // from class: o.eWr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                eVR.KWHzl(this.OLrzqt, view);
            }
        });
        switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.eWq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                eVR.copydefault(this.AEQbTJ, switchCompat, compoundButton, z);
            }
        });
        if (switchCompat.isChecked() && (networkData = this.sSMYrx) != null) {
            Intrinsics.copydefault(networkData);
            C15826eWs.copydefault(switchCompat, networkData.getCoinUrl());
        } else {
            switchCompat.setThumbDrawable(C33070mpX.KWHzl(C13754dXa.Activity.RJOkX));
        }
        fJNWhG();
        KWHzl(abstractC16600emw);
    }

    public static final void OLrzqt(android.content.Context context, eVR evr, android.view.View view) {
        ActivityC15891eZc.Companion.AEQbTJ(context, evr.sSMYrx(), evr.gHZMYf(), evr.values);
    }

    public static final void EZpvd(eVR evr, android.view.View view) {
        evr.getNewProxyInstance();
    }

    public static final void KWHzl(eVR evr, android.view.View view) {
        evr.DbNXlk().fARcdN();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.eWs.AEQbTJ(androidx.appcompat.widget.SwitchCompat, java.lang.String):void */
    public static final void copydefault(eVR evr, SwitchCompat switchCompat, android.widget.CompoundButton compoundButton, boolean z) {
        if (z && evr.sSMYrx != null) {
            Intrinsics.copydefault(switchCompat);
            ProfileAssetChooseNetworkDialogFragment.NetworkData networkData = evr.sSMYrx;
            Intrinsics.copydefault(networkData);
            C15826eWs.copydefault(switchCompat, networkData.getCoinUrl());
            return;
        }
        switchCompat.setThumbDrawable(C33070mpX.KWHzl(C13754dXa.Activity.RJOkX));
    }

    public final void fJNWhG() {
        C32866mlf.onEvent$default("Web3WalletPortfolio_ProfitLossAnalysis_Dashboard_View", (TrackChannel[]) null, new Function1() { // from class: o.eWf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return eVR.AEQbTJ(this.EZpvd, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AEQbTJ(eVR evr, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("selected_chain_id", java.lang.String.valueOf(evr.values), false);
        return Unit.INSTANCE;
    }

    public final void getNewProxyInstance() {
        java.lang.String str = this.djBIcL;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "recent_pnl")) {
            eYV eyv = new eYV();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            eyv.EZpvd(childFragmentManager, "recentPnl", new Function1() { // from class: o.eWb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return eVR.AhwBna(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            return;
        }
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MTCommonConstants.Lifecycle.KEY_ACTIVITY)) {
            eYN eyn = new eYN();
            androidx.fragment.app.FragmentManager childFragmentManager2 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
            ProfileAssetChooseNetworkDialogFragment.NetworkData networkData = this.sSMYrx;
            eyn.KWHzl(childFragmentManager2, "profileActivities", networkData != null && networkData.getChainId() == this.AwvSrB, new Function2() { // from class: o.eVY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return eVR.EZpvd(this.EZpvd, (java.lang.String) obj, ((java.lang.Boolean) obj2).booleanValue());
                }
            });
        }
    }

    public static final Unit AhwBna(eVR evr, boolean z) {
        evr.DbNXlk().EZpvd(z);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(eVR evr, java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        evr.djBIcL().OLrzqt(str);
        evr.DbNXlk().EZpvd(z);
        return Unit.INSTANCE;
    }

    public final void fARcdN() {
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw != null) {
            abstractC16600emw.AEQbTJ.setExpanded(true);
            C14697dqO c14697dqO = abstractC16600emw.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c14697dqO, "");
            c14697dqO.setVisibility(0);
            android.widget.ImageView imageView = abstractC16600emw.ejfBZ;
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            imageView.setVisibility(8);
            abstractC16600emw.uzCIH.setVisibility(8);
            android.widget.ImageView imageView2 = abstractC16600emw.AubY;
            Intrinsics.checkNotNullExpressionValue(imageView2, "");
            imageView2.setVisibility(8);
            SwitchCompat switchCompat = abstractC16600emw.hDKMBd;
            Intrinsics.checkNotNullExpressionValue(switchCompat, "");
            switchCompat.setVisibility(8);
            KWHzl(abstractC16600emw);
        }
    }

    public final void AEQbTJ(eWT ewt, long j) {
        C14697dqO c14697dqO;
        xWV xwv;
        BigDecimal bigDecimalAEQbTJ = ewt.AEQbTJ();
        if (bigDecimalAEQbTJ == null) {
            bigDecimalAEQbTJ = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = bigDecimalAEQbTJ;
        BigDecimal bigDecimalKWHzl = ewt.KWHzl();
        if (bigDecimalKWHzl == null) {
            bigDecimalKWHzl = BigDecimal.ZERO;
        }
        BigDecimal bigDecimalOLrzqt = ewt.OLrzqt();
        if (bigDecimalOLrzqt == null) {
            bigDecimalOLrzqt = BigDecimal.ZERO;
        }
        C14687dqE c14687dqE = C14687dqE.OLrzqt;
        boolean z = !c14687dqE.isConnected();
        boolean z2 = (c14687dqE.AkhnZx() || (xwv = (xWV) C43251rlk.OLrzqt(C56524yIo.AEQbTJ(xWV.class))) == null || !xwv.copydefault()) ? false : true;
        AbstractC16600emw abstractC16600emw = this.fetchVPNInfo;
        if (abstractC16600emw == null || (c14697dqO = abstractC16600emw.EZpvd) == null) {
            return;
        }
        if (j == Long.MIN_VALUE || j >= 0) {
            Intrinsics.copydefault(bigDecimal);
            java.lang.String strConvertToString$default = C54862xYb.convertToString$default(bigDecimal, false, null, null, 7, null);
            Intrinsics.copydefault(bigDecimalKWHzl);
            java.lang.String strConvertToString$default2 = C54862xYb.convertToString$default(bigDecimalKWHzl, false, null, null, 7, null);
            Intrinsics.copydefault(bigDecimalOLrzqt);
            c14697dqO.setData(strConvertToString$default, strConvertToString$default2, z, C54862xYb.convertToString$default(bigDecimalOLrzqt, false, null, null, 7, null), z2);
            return;
        }
        c14697dqO.setData("0", "0", z, "0", z2);
    }

    public final boolean AEQbTJ(java.util.List<java.lang.Long> list) {
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                long jLongValue = ((java.lang.Number) it.next()).longValue();
                if (jLongValue == this.AwvSrB || jLongValue == this.AkhnZx) {
                    return true;
                }
            }
        }
        return false;
    }
}

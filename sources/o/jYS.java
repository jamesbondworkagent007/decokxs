package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.dexlogic.main.market.detail.MarketCoinDetailViewModel;
import com.okinc.business.dexlogic.main.market.detail.TrackingAddressViewModel;
import com.okinc.business.dexui.main.market.base.TokenDetailButtonName;
import com.okinc.business.dexui.main.market.base.TokenDetailClickLayer;
import com.okinc.business.dexui.main.market.detail.fragment.chart.pooltransactions.holders.HolderInfoParams;
import com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType;
import com.okinc.business.market.features.coindetail.ui.chart.ChartDetailFragment;
import com.okinc.business.market.features.data.domain.type.DataTabType;
import com.okinc.business.market.features.filter.ChartDetailSubTabName;
import com.okinc.business.market.features.filter.SharedFilterViewModel;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import com.okinc.business.market.features.holders.domain.model.BubbleMap;
import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import com.okinc.business.market.features.holders.domain.model.HoldersFragmentParams;
import com.okinc.business.market.features.holders.ui.TokenHoldersViewModel;
import com.okinc.business.market.features.holders.ui.detail.HolderDetailsParams;
import com.okinc.business.market.features.overview.ui.OverviewViewModel;
import com.okinc.business.market.features.tag.domain.TagWrapper;
import com.okinc.business.market.features.tag.ui.TagViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C26298jZg;
import o.InterfaceC26302jZk;
import o.jYF;
import o.jYJ;
import o.jYL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jYS extends jYI<hBM> implements InterfaceC26302jZk {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int gEmmrt = 8;
    public final Activity AYXKKw;
    public C22621hin AkhnZx;
    public final InterfaceC56387yDm AuCTel;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC26310jZs djBIcL;
    public final InterfaceC56387yDm fARcdN;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm isConnected;
    public jYK valueOf;
    public final InterfaceC56387yDm values;

    public jYS() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$viewModels$default$2
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
        this.AuCTel = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TokenHoldersViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$viewModels$default$5
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SharedFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$3
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MarketCoinDetailViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$6
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
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(OverviewViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$9
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TrackingAddressViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$10
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$11
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$12
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
        this.fARcdN = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TagViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$13
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$14
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.holders.ui.TokenHoldersFragment$special$$inlined$activityViewModels$default$15
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
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.jYY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return jYS.AhwBna(this.OLrzqt);
            }
        });
        this.AYXKKw = new Activity();
        this.djBIcL = new ActionBar();
    }

    /* JADX DEBUG: Possible override for method o.jYI.AYXKKw()V */
    public final TokenHoldersViewModel AYXKKw() {
        return (TokenHoldersViewModel) this.AuCTel.getValue();
    }

    private final SharedFilterViewModel isConnected() {
        return (SharedFilterViewModel) this.DbNXlk.getValue();
    }

    private final MarketCoinDetailViewModel fetchVPNInfo() {
        return (MarketCoinDetailViewModel) this.fetchVPNInfo.getValue();
    }

    private final OverviewViewModel values() {
        return (OverviewViewModel) this.values.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TrackingAddressViewModel AkhnZx() {
        return (TrackingAddressViewModel) this.fIwbmz.getValue();
    }

    public final TagViewModel djBIcL() {
        return (TagViewModel) this.fARcdN.getValue();
    }

    public final HoldersFragmentParams valueOf() {
        return (HoldersFragmentParams) this.isConnected.getValue();
    }

    public static final HoldersFragmentParams AhwBna(jYS jys) {
        HoldersFragmentParams holdersFragmentParams;
        android.os.Bundle arguments = jys.getArguments();
        return (arguments == null || (holdersFragmentParams = (HoldersFragmentParams) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.holders_fragment_params", HoldersFragmentParams.class))) == null) ? (HoldersFragmentParams) C31200lpY.throwIfDebug$default(new HoldersFragmentParams(null, null, null, null, false, null, null, 127, null), null, 2, null) : holdersFragmentParams;
    }

    public static final class Activity implements InterfaceC26009jOo {
        public Activity() {
        }

        @Override // o.InterfaceC26009jOo
        public boolean EZpvd(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return jYS.this.AkhnZx().KWHzl(str);
        }

        @Override // o.InterfaceC26009jOo
        public java.lang.String OLrzqt(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return jYS.this.AkhnZx().AEQbTJ(str);
        }

        @Override // o.InterfaceC26009jOo
        public java.lang.String AEQbTJ(java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return jYS.this.AkhnZx().OLrzqt(str);
        }
    }

    public static final class ActionBar implements InterfaceC26310jZs {
        public ActionBar() {
        }

        @Override // o.InterfaceC26310jZs
        public void OLrzqt(java.lang.String str, java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            FragmentActivity activity = jYS.this.getActivity();
            C25352ivB.EZpvd(activity instanceof AbstractActivityC33041mov ? (AbstractActivityC33041mov) activity : null, str, str2);
        }

        @Override // o.InterfaceC26310jZs
        public void EZpvd() {
            jYS.this.DbNXlk();
        }
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jYS.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final jYS OLrzqt(@NotNull HoldersFragmentParams holdersFragmentParams) {
            Intrinsics.checkNotNullParameter(holdersFragmentParams, "");
            jYS jys = new jYS();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.holders_fragment_params", holdersFragmentParams);
            jys.setArguments(bundle);
            return jys;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public hBM KWHzl(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hBM hbmEZpvd = hBM.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(hbmEZpvd, "");
        return hbmEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: KWHzl(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.AbstractC21846hOm
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void KWHzl(@NotNull hBM hbm, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(hbm, "");
        HoldersFragmentParams holdersFragmentParamsValueOf = valueOf();
        BubbleMap bubbleMapAEQbTJ = fetchVPNInfo().AEQbTJ();
        java.lang.Boolean value = AYXKKw().copydefault().getValue();
        this.valueOf = new jYK(100, holdersFragmentParamsValueOf, bubbleMapAEQbTJ, value != null ? value.booleanValue() : false, this.AYXKKw, this);
        RecyclerView recyclerView = hbm.djBIcL;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.valueOf);
        AYXKKw().EZpvd(100);
        ejfBZ();
    }

    public static /* synthetic */ void loadData$default(jYS jys, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        jys.copydefault(z);
    }

    private final void copydefault(boolean z) {
        AYXKKw().OLrzqt(valueOf().OLrzqt(), valueOf().AEQbTJ(), z);
        AYXKKw().copydefault(valueOf().AEQbTJ(), valueOf().OLrzqt());
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AYXKKw().KWHzl();
        jYL value = AYXKKw().EZpvd().getValue();
        if ((value instanceof jYL.Activity) && ((jYL.Activity) value).AEQbTJ().length() == 0) {
            AYXKKw().djBIcL();
        } else {
            copydefault(false);
        }
        getChildFragmentManager().findFragmentByTag("tag.holder_details_fragment");
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        AYXKKw().valueOf();
    }

    @Override // o.AbstractC21846hOm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        jYK jyk = this.valueOf;
        if (jyk != null) {
            jyk.gEmmrt();
        }
        this.valueOf = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AYXKKw().valueOf();
        gEmmrt();
    }

    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(jYJ jyj, Continuation<? super Unit> continuation) {
            jYS.this.KWHzl(jyj);
            return Unit.INSTANCE;
        }
    }

    private final void ejfBZ() {
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().OLrzqt(), null, new Application(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AYXKKw().EZpvd(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, fetchVPNInfo().DbNXlk(), null, new Fragment(), 2, null);
        AkhnZx().OLrzqt().observe(getViewLifecycleOwner(), new C26298jZg.Application(new Function1() { // from class: o.jZa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jYS.copydefault(this.copydefault, (java.lang.Long) obj);
            }
        }));
        fetchVPNInfo().AkhnZx().observe(getViewLifecycleOwner(), new C26298jZg.Application(new Function1() { // from class: o.jYZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jYS.OLrzqt(this.KWHzl, (InterfaceC22618hik) obj);
            }
        }));
        AYXKKw().copydefault().observe(getViewLifecycleOwner(), new C26298jZg.Application(new Function1() { // from class: o.jYX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return jYS.AEQbTJ(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(jYL jyl, Continuation<? super Unit> continuation) {
            jYL.Activity activity = jyl instanceof jYL.Activity ? (jYL.Activity) jyl : null;
            if (activity != null) {
                jYS.this.KWHzl(activity);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Fragment<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.lang.Boolean bool, Continuation<? super Unit> continuation) {
            if (bool != null) {
                jYS jys = jYS.this;
                bool.booleanValue();
                jYS.loadData$default(jys, false, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final Unit copydefault(jYS jys, java.lang.Long l) {
        if (jys.AYXKKw().EZpvd().getValue() instanceof jYL.ActionBar) {
            return Unit.INSTANCE;
        }
        if (l != null) {
            l.longValue();
            loadData$default(jys, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(jYS jys, InterfaceC22618hik interfaceC22618hik) {
        if (interfaceC22618hik instanceof C22621hin) {
            if (jys.AYXKKw().OLrzqt().getValue() instanceof jYJ.Application) {
                C22621hin c22621hin = (C22621hin) interfaceC22618hik;
                openHolderDetails$default(jys, c22621hin.EZpvd(), c22621hin.AYXKKw(), c22621hin.OLrzqt(), c22621hin.valueOf(), c22621hin.copydefault(), false, 32, null);
            } else {
                jys.AkhnZx = (C22621hin) interfaceC22618hik;
            }
            jys.fetchVPNInfo().KWHzl((InterfaceC22618hik) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(jYS jys, java.lang.Boolean bool) {
        jYK jyk = jys.valueOf;
        if (jyk != null) {
            Intrinsics.copydefault(bool);
            jyk.OLrzqt(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(jYJ jyj) {
        hBM hbm = (hBM) aX_();
        if (hbm != null) {
            jYL value = AYXKKw().EZpvd().getValue();
            C55113xdn c55113xdn = hbm.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            boolean z = jyj instanceof jYJ.StateListAnimator;
            c55113xdn.setVisibility(z ? 0 : 8);
            C55173xeu c55173xeu = hbm.copydefault;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility((z || !(jyj instanceof jYJ.Activity)) ? 8 : 0);
            RecyclerView recyclerView = hbm.djBIcL;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            boolean z2 = jyj instanceof jYJ.Application;
            recyclerView.setVisibility(z2 ? 0 : 8);
            if (z) {
                return;
            }
            if (jyj instanceof jYJ.Activity) {
                C55173xeu c55173xeu2 = hbm.copydefault;
                c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
                c55173xeu2.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.RbMRq));
                c55173xeu2.setEmptyTypeImage(8);
                c55173xeu2.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
                c55173xeu2.setRetryClickListener(new View.OnClickListener() { // from class: o.jZb
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        jYS.copydefault(this.AEQbTJ, view);
                    }
                });
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            if (!z2) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z3 = value instanceof jYL.Activity;
            if (z3) {
                AYXKKw().djBIcL();
            }
            jYL.Activity activity = z3 ? (jYL.Activity) value : null;
            if (activity != null) {
                KWHzl(activity);
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public static final void copydefault(jYS jys, android.view.View view) {
        loadData$default(jys, false, 1, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(jYL.Activity activity) {
        jYK jyk;
        if (((hBM) aX_()) != null) {
            boolean z = C33129mqd.OLrzqt((java.lang.CharSequence) activity.AEQbTJ()) || activity.KWHzl().copydefault().length() > 0;
            jNY jnyAYXKKw = AYXKKw().AYXKKw();
            if (jnyAYXKKw != null && (jyk = this.valueOf) != null) {
                jyk.copydefault(jnyAYXKKw);
            }
            jYK jyk2 = this.valueOf;
            if (jyk2 != null) {
                jyk2.copydefault(z, new Function0() { // from class: o.jYT
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jYS.gEmmrt(this.KWHzl);
                    }
                });
            }
            jYK jyk3 = this.valueOf;
            if (jyk3 != null) {
                jyk3.EZpvd(activity);
            }
            jYK jyk4 = this.valueOf;
            if (jyk4 != null) {
                kLM.updateList$default(jyk4, activity.copydefault(), false, new Function0() { // from class: o.jYU
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return jYS.AYXKKw(this.AEQbTJ);
                    }
                }, 2, null);
            }
        }
    }

    public static final Unit gEmmrt(jYS jys) {
        jys.AYXKKw().AEQbTJ("", new C26211jWa(0, null, null, 7, null));
        jys.isConnected().AEQbTJ(ChartDetailSubTabName.HOLDERS);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(jYS jys) {
        C22621hin c22621hin = jys.AkhnZx;
        if (c22621hin != null) {
            openHolderDetails$default(jys, c22621hin.EZpvd(), c22621hin.AYXKKw(), c22621hin.OLrzqt(), c22621hin.valueOf(), c22621hin.copydefault(), false, 32, null);
            jys.AkhnZx = null;
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.jYS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openHolderDetails$default(jYS jys, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.util.List list, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            list = yDY.AhwBna();
        }
        java.util.List list2 = list;
        if ((i2 & 32) != 0) {
            z = false;
        }
        jys.OLrzqt(str, str2, str3, i3, list2, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.util.List<TagWrapper> list, boolean z) {
        hBM hbm;
        if (!valueOf().AhwBna() || z || (hbm = (hBM) aX_()) == null) {
            return;
        }
        jNY jnyAYXKKw = AYXKKw().AYXKKw();
        java.lang.String strAEQbTJ = jnyAYXKKw != null ? jnyAYXKKw.AEQbTJ() : null;
        java.lang.String str4 = strAEQbTJ == null ? "" : strAEQbTJ;
        jNY jnyAYXKKw2 = AYXKKw().AYXKKw();
        java.lang.String strGEmmrt = jnyAYXKKw2 != null ? C33129mqd.gEmmrt(java.lang.Float.valueOf(jnyAYXKKw2.copydefault())) : null;
        java.lang.String str5 = strGEmmrt == null ? "" : strGEmmrt;
        jNY jnyAYXKKw3 = AYXKKw().AYXKKw();
        java.lang.String strAEQbTJ2 = jnyAYXKKw3 != null ? jnyAYXKKw3.AEQbTJ() : null;
        java.lang.String str6 = strAEQbTJ2 == null ? "" : strAEQbTJ2;
        jYL value = AYXKKw().EZpvd().getValue();
        jYL.Activity activity = value instanceof jYL.Activity ? (jYL.Activity) value : null;
        boolean z2 = activity != null && activity.EZpvd();
        boolean zKWHzl = AkhnZx().KWHzl(str);
        java.lang.String strAEQbTJ3 = AkhnZx().AEQbTJ(str);
        C26309jZr c26309jZrAEQbTJ = C26309jZr.Companion.AEQbTJ(new HolderDetailsParams(str, str2, str4, str5, str6, null, str3, i, strAEQbTJ3 == null ? "" : strAEQbTJ3, zKWHzl, null, list, z2, null, 9248, null), this.djBIcL);
        hbm.djBIcL.setVisibility(8);
        hbm.OLrzqt.setVisibility(0);
        getChildFragmentManager().beginTransaction().replace(hbm.OLrzqt.getId(), c26309jZrAEQbTJ, "tag.holder_details_fragment").commitAllowingStateLoss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void gEmmrt() {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag;
        if (((hBM) aX_()) == null || (fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag("tag.holder_details_fragment")) == null) {
            return;
        }
        getChildFragmentManager().beginTransaction().remove(fragmentFindFragmentByTag).commit();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void DbNXlk() {
        hBM hbm = (hBM) aX_();
        if (hbm != null) {
            gEmmrt();
            hbm.djBIcL.setVisibility(0);
            hbm.OLrzqt.setVisibility(8);
        }
    }

    @Override // o.InterfaceC26302jZk
    public void OLrzqt(@NotNull HolderDetailModel holderDetailModel) {
        Intrinsics.checkNotNullParameter(holderDetailModel, "");
        OLrzqt(holderDetailModel.valueOf(), holderDetailModel.fIwbmz(), holderDetailModel.EZpvd(), holderDetailModel.fARcdN(), holderDetailModel.ejfBZ(), holderDetailModel.getFieldNames());
        trackPageClick$default(this, TokenDetailButtonName.HOLDERS_DETAIL, null, null, 6, null);
    }

    @Override // o.InterfaceC26302jZk
    public void copydefault(@NotNull java.util.List<TagWrapper> list) {
        Intrinsics.checkNotNullParameter(list, "");
        C21951hSj.Companion.EZpvd(new HolderInfoParams(valueOf().AYXKKw(), "DEXMarket_Token_Holders_AddressLabel_View", list)).show(getChildFragmentManager(), C56524yIo.AEQbTJ(C21951hSj.class).valueOf());
    }

    @Override // o.InterfaceC26302jZk
    public void AEQbTJ(@NotNull InterfaceC26302jZk.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (Intrinsics.EZpvd(activity, InterfaceC26302jZk.Activity.TaskDescription.AEQbTJ)) {
            fetchVPNInfo().KWHzl(new C22622hio(CoinDetailTabType.DATA.ordinal(), DataTabType.HOLDERS_CHANGE.ordinal()));
        } else if (Intrinsics.EZpvd(activity, InterfaceC26302jZk.Activity.ActionBar.AEQbTJ)) {
            C21951hSj.Companion.EZpvd(new HolderInfoParams(valueOf().AYXKKw(), "DEXMarket_Token_Holders_AddressLabel_View", null, 4, null)).show(getChildFragmentManager(), C56524yIo.AEQbTJ(C21951hSj.class).valueOf());
        } else if (activity instanceof InterfaceC26302jZk.Activity.StateListAnimator) {
            C26294jZc.OLrzqt(this, ((InterfaceC26302jZk.Activity.StateListAnimator) activity).OLrzqt());
        } else if (activity instanceof InterfaceC26302jZk.Activity.C0864Activity) {
            AYXKKw().AEQbTJ(((InterfaceC26302jZk.Activity.C0864Activity) activity).KWHzl());
        } else if (Intrinsics.EZpvd(activity, InterfaceC26302jZk.Activity.Application.KWHzl)) {
            jYL value = AYXKKw().EZpvd().getValue();
            jYL.Activity activity2 = value instanceof jYL.Activity ? (jYL.Activity) value : null;
            java.lang.String strAEQbTJ = activity2 != null ? activity2.AEQbTJ() : null;
            C26294jZc.AEQbTJ(this, strAEQbTJ != null ? strAEQbTJ : "");
        } else if (Intrinsics.EZpvd(activity, InterfaceC26302jZk.Activity.PendingIntent.OLrzqt)) {
            jYF value2 = AYXKKw().AEQbTJ().getValue();
            Intrinsics.copydefault(value2, "");
            C26294jZc.AEQbTJ(this, ((jYF.StateListAnimator) value2).copydefault(), AYXKKw().gEmmrt());
        } else {
            if (!Intrinsics.EZpvd(activity, InterfaceC26302jZk.Activity.Dialog.AEQbTJ)) {
                throw new NoWhenBranchMatchedException();
            }
            fetchVPNInfo().KWHzl(new C22622hio(CoinDetailTabType.DATA.ordinal(), DataTabType.HOLDING_7D.ordinal()));
        }
        TokenDetailButtonName tokenDetailButtonNameOLrzqt = TokenDetailButtonName.Companion.OLrzqt(activity);
        if (tokenDetailButtonNameOLrzqt != null) {
            AEQbTJ(tokenDetailButtonNameOLrzqt, activity instanceof InterfaceC26302jZk.Activity.ActionBar ? ChartDetailFragment.Companion.SubChartTabType.HOLDER : null, activity instanceof InterfaceC26302jZk.Activity.C0864Activity ? java.lang.Boolean.valueOf(((InterfaceC26302jZk.Activity.C0864Activity) activity).KWHzl()) : null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: o.jYS */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setTokenFilter$default(jYS jys, C26211jWa c26211jWa, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c26211jWa = new C26211jWa(0, null, null, 7, null);
        }
        if ((i & 2) != 0) {
            list = yDY.AhwBna();
        }
        jys.copydefault(c26211jWa, (java.util.List<java.lang.String>) list, z);
    }

    public final void copydefault(@NotNull C26211jWa c26211jWa, @NotNull java.util.List<java.lang.String> list, boolean z) {
        Intrinsics.checkNotNullParameter(c26211jWa, "");
        Intrinsics.checkNotNullParameter(list, "");
        TokenFilter tokenFilterCopydefault = isConnected().copydefault();
        isConnected().KWHzl(tokenFilterCopydefault.OLrzqt((6143 & 1) != 0 ? tokenFilterCopydefault.AEQbTJ : valueOf().OLrzqt(), (6143 & 2) != 0 ? tokenFilterCopydefault.isConnected : valueOf().AEQbTJ(), (6143 & 4) != 0 ? tokenFilterCopydefault.AkhnZx : null, (6143 & 8) != 0 ? tokenFilterCopydefault.AhwBna : null, (6143 & 16) != 0 ? tokenFilterCopydefault.KWHzl : list, (6143 & 32) != 0 ? tokenFilterCopydefault.AYXKKw : false, (6143 & 64) != 0 ? tokenFilterCopydefault.valueOf : false, (6143 & 128) != 0 ? tokenFilterCopydefault.EZpvd : c26211jWa.copydefault(), (6143 & 256) != 0 ? tokenFilterCopydefault.gEmmrt : false, (6143 & 512) != 0 ? tokenFilterCopydefault.OLrzqt : false, (6143 & 1024) != 0 ? tokenFilterCopydefault.copydefault : null, (6143 & 2048) != 0 ? tokenFilterCopydefault.djBIcL : null, (6143 & 4096) != 0 ? tokenFilterCopydefault.fetchVPNInfo : null), z);
    }

    public static /* synthetic */ void trackPageClick$default(jYS jys, TokenDetailButtonName tokenDetailButtonName, ChartDetailFragment.Companion.SubChartTabType subChartTabType, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            subChartTabType = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        jys.AEQbTJ(tokenDetailButtonName, subChartTabType, bool);
    }

    public final void AEQbTJ(TokenDetailButtonName tokenDetailButtonName, ChartDetailFragment.Companion.SubChartTabType subChartTabType, java.lang.Boolean bool) {
        java.lang.String strEZpvd = valueOf().EZpvd();
        java.lang.String strKWHzl = valueOf().KWHzl();
        java.lang.String strOLrzqt = valueOf().OLrzqt();
        C21847hOn.trackDexMarketTokenPageClick$default(valueOf().AEQbTJ(), valueOf().AYXKKw(), strOLrzqt, strKWHzl, CoinDetailTabType.CHART, strEZpvd, null, null, ChartDetailFragment.Companion.SubChartTabType.HISTORY, null, null, null, null, null, null, tokenDetailButtonName, null, fetchVPNInfo().getNewProxyInstance(), TokenDetailClickLayer.COMPONENTS, bool, subChartTabType, values().djBIcL(), 97984, null);
    }
}

package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetBuySellViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetSelectionActivityViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetSelectionViewModel;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.preset.MemeSelectionActivityResultContract;
import com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.llF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C30969llF extends AbstractC30926lkP<C21573hEj> {
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public PresetUserConfigBean values;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AYXKKw = 8;

    /* JADX INFO: renamed from: o.llF$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    public static final boolean AEQbTJ(boolean z, android.view.View view, android.view.MotionEvent motionEvent) {
        return !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PresetUserConfigBean AhwBna() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.clearRegistrations;
    }

    /* JADX INFO: renamed from: o.llF$StateListAnimator */
    public static final class StateListAnimator implements View.OnLayoutChangeListener {
        public final /* synthetic */ MemeSelectionActivityResultContract.Input KWHzl;
        public final /* synthetic */ C55249xgQ OLrzqt;
        public final /* synthetic */ C21573hEj copydefault;

        public StateListAnimator(MemeSelectionActivityResultContract.Input input, C55249xgQ c55249xgQ, C21573hEj c21573hEj) {
            this.KWHzl = input;
            this.OLrzqt = c55249xgQ;
            this.copydefault = c21573hEj;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(@NotNull android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.checkNotNullParameter(view, "");
            view.removeOnLayoutChangeListener(this);
            int fromTransactionType = this.KWHzl.getFromTransactionType();
            if (fromTransactionType != TransactionType.Buy.getType()) {
                TabLayout.Tab tabAt = this.OLrzqt.getTabAt(fromTransactionType);
                if (tabAt != null) {
                    tabAt.select();
                }
                this.copydefault.KWHzl.setCurrentItem(fromTransactionType, true);
            }
        }
    }

    public C30969llF() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$2
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetBuySellViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$5
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetSelectionActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$activityViewModels$default$3
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
        final Function0 function03 = new Function0() { // from class: o.llE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30969llF.values(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$6
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$7
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$8
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetTabFragment$special$$inlined$viewModels$default$9
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.llM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30969llF.fetchVPNInfo(this.OLrzqt);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.llL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30969llF.isConnected(this.copydefault);
            }
        });
        this.AkhnZx = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.llJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30969llF.DbNXlk(this.EZpvd);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.lkP.valueOf()V */
    public final PresetBuySellViewModel valueOf() {
        return (PresetBuySellViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresetSelectionActivityViewModel djBIcL() {
        return (PresetSelectionActivityViewModel) this.djBIcL.getValue();
    }

    public static final ViewModelStoreOwner values(C30969llF c30969llF) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c30969llF.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    private final PresetSelectionViewModel values() {
        return (PresetSelectionViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: renamed from: o.llF$TaskDescription */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.llF.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C30969llF copydefault(@NotNull MemeSelectionActivityResultContract.Input input, @NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(input, "");
            Intrinsics.checkNotNullParameter(str, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", input);
            bundle.putString("key.preset_type", str);
            C30969llF c30969llF = new C30969llF();
            c30969llF.setArguments(bundle);
            return c30969llF;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MemeSelectionActivityResultContract.Input AYXKKw() {
        return (MemeSelectionActivityResultContract.Input) this.valueOf.getValue();
    }

    public static final MemeSelectionActivityResultContract.Input fetchVPNInfo(C30969llF c30969llF) {
        android.os.Bundle arguments = c30969llF.getArguments();
        if (arguments != null) {
            return (MemeSelectionActivityResultContract.Input) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", MemeSelectionActivityResultContract.Input.class));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String DbNXlk() {
        return (java.lang.String) this.DbNXlk.getValue();
    }

    public static final java.lang.String isConnected(C30969llF c30969llF) {
        android.os.Bundle arguments = c30969llF.getArguments();
        java.lang.String string = arguments != null ? arguments.getString("key.preset_type") : null;
        return string == null ? "" : string;
    }

    private final java.util.List<java.lang.String> isConnected() {
        return (java.util.List) this.AkhnZx.getValue();
    }

    public static final java.util.List DbNXlk(C30969llF c30969llF) {
        return yDY.gEmmrt(c30969llF.getString(C23274hvD.Fragment.rateWithExtras), c30969llF.getString(C23274hvD.Fragment.seekTo));
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C21573hEj AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C21573hEj c21573hEjKWHzl = C21573hEj.KWHzl(view);
        Intrinsics.checkNotNullExpressionValue(c21573hEjKWHzl, "");
        return c21573hEjKWHzl;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7000aZw, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        LinearLayoutCompat linearLayoutCompat;
        MemeQuoteAdapter memeQuoteAdapter;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        PresetSelectionViewModel presetSelectionViewModelValues = values();
        MemeSelectionActivityResultContract.Input inputAYXKKw = AYXKKw();
        java.lang.String chainId = (inputAYXKKw == null || (memeQuoteAdapter = inputAYXKKw.getMemeQuoteAdapter()) == null) ? null : memeQuoteAdapter.getChainId();
        this.values = presetSelectionViewModelValues.KWHzl(chainId != null ? chainId : "", DbNXlk());
        MemeSelectionActivityResultContract.Input inputAYXKKw2 = AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) (inputAYXKKw2 != null ? inputAYXKKw2.getPresetType() : null), (java.lang.Object) DbNXlk())) {
            fetchVPNInfo();
            AkhnZx();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C21573hEj c21573hEj = (C21573hEj) AEQbTJ();
            if (c21573hEj != null && (linearLayoutCompat = c21573hEj.EZpvd) != null) {
                linearLayoutCompat.setVisibility(4);
            }
            djBIcL().OLrzqt().observe(getViewLifecycleOwner(), new Dialog());
        }
    }

    /* JADX INFO: renamed from: o.llF$Dialog */
    public static final class Dialog implements Observer<java.lang.String> {
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public void onChanged(java.lang.String str) {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) C30969llF.this.DbNXlk())) {
                pUU.KWHzl(C30969llF.this.getTAG(), "Lazily initView in onChanged");
                C30969llF.this.showLoadingWithLogo(0L);
                C30969llF.this.fetchVPNInfo();
                C30969llF.this.AkhnZx();
                C30969llF.this.djBIcL().OLrzqt().removeObserver(this);
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C30969llF.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(boolean z) {
        LinearLayoutCompat linearLayoutCompat;
        C21573hEj c21573hEj = (C21573hEj) AEQbTJ();
        if (c21573hEj == null || (linearLayoutCompat = c21573hEj.EZpvd) == null) {
            return;
        }
        linearLayoutCompat.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AkhnZx() {
        valueOf().copydefault().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.llI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30969llF.OLrzqt(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        valueOf().EZpvd().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.llK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30969llF.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        djBIcL().EZpvd().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.llN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30969llF.AEQbTJ(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        djBIcL().KWHzl().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.llO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30969llF.KWHzl(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C25390ivn.EZpvd(this, values().EZpvd(), Lifecycle.State.RESUMED, new Application());
    }

    public static final Unit OLrzqt(C30969llF c30969llF, java.lang.Boolean bool) {
        pUU.KWHzl(c30969llF.getTAG(), "loadingLiveData: showLoading=" + bool);
        if (bool.booleanValue()) {
            c30969llF.showLoadingWithLogo(0L);
        } else {
            c30969llF.dismissLoadingWithLogo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C30969llF c30969llF, java.lang.Boolean bool) {
        if (!bool.booleanValue()) {
            FragmentActivity fragmentActivityRequireActivity = c30969llF.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
            java.lang.String string = c30969llF.getString(C23274hvD.Fragment.sendCommand);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C25352ivB.EZpvd((android.app.Activity) fragmentActivityRequireActivity, string);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C30969llF c30969llF, java.lang.String str) {
        C21573hEj c21573hEj = (C21573hEj) c30969llF.AEQbTJ();
        if (c21573hEj != null && c30969llF.AYXKKw() != null && Intrinsics.EZpvd((java.lang.Object) c30969llF.DbNXlk(), (java.lang.Object) str)) {
            int currentItem = c21573hEj.KWHzl.getCurrentItem();
            MemeSelectionActivityResultContract.Input inputAYXKKw = c30969llF.AYXKKw();
            Intrinsics.copydefault(inputAYXKKw);
            PresetUserConfigBean presetUserConfigBean = c30969llF.values;
            Intrinsics.copydefault(presetUserConfigBean);
            c30969llF.copydefault(currentItem, inputAYXKKw, presetUserConfigBean);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C30969llF c30969llF, java.lang.String str) {
        java.lang.String value;
        PresetSelectionViewModel presetSelectionViewModelValues = c30969llF.values();
        PresetUserConfigBean presetUserConfigBean = c30969llF.values;
        java.lang.String chainId = presetUserConfigBean != null ? presetUserConfigBean.getChainId() : null;
        if (chainId == null) {
            chainId = "";
        }
        MemeSelectionActivityResultContract.Input inputAYXKKw = c30969llF.AYXKKw();
        int fromTransactionType = inputAYXKKw != null ? inputAYXKKw.getFromTransactionType() : TransactionType.Buy.getType();
        MemeSelectionActivityResultContract.Input inputAYXKKw2 = c30969llF.AYXKKw();
        if (inputAYXKKw2 == null || (value = inputAYXKKw2.getMemeTransactionSceneType()) == null) {
            value = MemeTransactionSceneType.Market.getValue();
        }
        c30969llF.OLrzqt(!presetSelectionViewModelValues.EZpvd(str, chainId, fromTransactionType, value));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.llF$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return AEQbTJ(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object AEQbTJ(boolean z, Continuation<? super Unit> continuation) {
            MemeQuoteAdapter memeQuoteAdapter;
            PresetBuySellViewModel presetBuySellViewModelValueOf = C30969llF.this.valueOf();
            MemeSelectionActivityResultContract.Input inputAYXKKw = C30969llF.this.AYXKKw();
            java.lang.String chainId = (inputAYXKKw == null || (memeQuoteAdapter = inputAYXKKw.getMemeQuoteAdapter()) == null) ? null : memeQuoteAdapter.getChainId();
            if (chainId == null) {
                chainId = "";
            }
            PresetUserConfigBean presetUserConfigBeanAhwBna = C30969llF.this.AhwBna();
            java.lang.String presetType = presetUserConfigBeanAhwBna != null ? presetUserConfigBeanAhwBna.getPresetType() : null;
            presetBuySellViewModelValueOf.AEQbTJ(chainId, presetType != null ? presetType : "");
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        PresetUserConfigBean presetUserConfigBean;
        C21573hEj c21573hEj;
        MemeSelectionActivityResultContract.Input inputAYXKKw = AYXKKw();
        if (inputAYXKKw == null || (presetUserConfigBean = this.values) == null || (c21573hEj = (C21573hEj) AEQbTJ()) == null) {
            return;
        }
        C55249xgQ c55249xgQ = c21573hEj.copydefault;
        Intrinsics.copydefault(c55249xgQ);
        C55296xhK.EZpvd((android.view.View) c55249xgQ, 8.0f);
        int fromTransactionType = inputAYXKKw.getFromTransactionType();
        TransactionType transactionType = TransactionType.Buy;
        KWHzl(fromTransactionType == transactionType.getType());
        c21573hEj.KWHzl.setAdapter(new ActionBar(this, inputAYXKKw, presetUserConfigBean));
        new TabLayoutMediator(c21573hEj.copydefault, c21573hEj.KWHzl, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.llD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C30969llF.copydefault(this.KWHzl, tab, i);
            }
        }).attach();
        c21573hEj.copydefault.clearOnTabSelectedListeners();
        c21573hEj.copydefault.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity(c21573hEj, this, inputAYXKKw, presetUserConfigBean));
        ViewPager2 viewPager2 = c21573hEj.KWHzl;
        Intrinsics.checkNotNullExpressionValue(viewPager2, "");
        if (ViewCompat.isLaidOut(viewPager2) && !viewPager2.isLayoutRequested()) {
            int fromTransactionType2 = inputAYXKKw.getFromTransactionType();
            if (fromTransactionType2 != transactionType.getType()) {
                TabLayout.Tab tabAt = c55249xgQ.getTabAt(fromTransactionType2);
                if (tabAt != null) {
                    tabAt.select();
                }
                c21573hEj.KWHzl.setCurrentItem(fromTransactionType2, true);
                return;
            }
            return;
        }
        viewPager2.addOnLayoutChangeListener(new StateListAnimator(inputAYXKKw, c55249xgQ, c21573hEj));
    }

    public static final void copydefault(C30969llF c30969llF, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c30969llF.isConnected().get(i));
    }

    /* JADX INFO: renamed from: o.llF$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ MemeSelectionActivityResultContract.Input AEQbTJ;
        public final /* synthetic */ C30969llF EZpvd;
        public final /* synthetic */ C21573hEj KWHzl;
        public final /* synthetic */ PresetUserConfigBean copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity(C21573hEj c21573hEj, C30969llF c30969llF, MemeSelectionActivityResultContract.Input input, PresetUserConfigBean presetUserConfigBean) {
            this.KWHzl = c21573hEj;
            this.EZpvd = c30969llF;
            this.AEQbTJ = input;
            this.copydefault = presetUserConfigBean;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            this.KWHzl.KWHzl.setCurrentItem(tab.getPosition());
            this.EZpvd.KWHzl(tab.getPosition() == TransactionType.Buy.getType());
            this.EZpvd.copydefault(tab.getPosition(), this.AEQbTJ, this.copydefault);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        C55249xgQ c55249xgQ;
        C21573hEj c21573hEj = (C21573hEj) AEQbTJ();
        if (c21573hEj == null || (c55249xgQ = c21573hEj.copydefault) == null) {
            return;
        }
        if (z) {
            C33512mxp c33512mxp = C33512mxp.AEQbTJ;
            android.content.Context context = c55249xgQ.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            c55249xgQ.KWHzl(C33512mxp.tradeRiseHighlightsFill$default(c33512mxp, context, 0.0f, 2, null));
            c55249xgQ.KWHzl(C25382ivf.copydefault(C23274hvD.StateListAnimator.QVAiDq));
            return;
        }
        C33512mxp c33512mxp2 = C33512mxp.AEQbTJ;
        android.content.Context context2 = c55249xgQ.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        c55249xgQ.KWHzl(C33512mxp.tradeFallHighlightsFill$default(c33512mxp2, context2, 0.0f, 2, null));
        c55249xgQ.KWHzl(C25382ivf.copydefault(C23274hvD.StateListAnimator.OcIXYQ));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(final boolean z) {
        C55249xgQ c55249xgQ;
        TabLayout.TabView tabView;
        C21573hEj c21573hEj = (C21573hEj) AEQbTJ();
        if (c21573hEj == null || (c55249xgQ = c21573hEj.copydefault) == null) {
            return;
        }
        int tabCount = c55249xgQ.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabLayout.Tab tabAt = c55249xgQ.getTabAt(i);
            if (tabAt != null && (tabView = tabAt.view) != null) {
                tabView.setOnTouchListener(new View.OnTouchListener() { // from class: o.llG
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        return C30969llF.AEQbTJ(z, view, motionEvent);
                    }
                });
            }
        }
    }

    public final void copydefault(int i, MemeSelectionActivityResultContract.Input input, PresetUserConfigBean presetUserConfigBean) {
        valueOf().KWHzl().setValue(new Triple<>(java.lang.Integer.valueOf(i), DbNXlk(), valueOf().EZpvd(input.getMemeQuoteAdapter(), presetUserConfigBean.getBuyPreset(), !(input.getFromTransactionType() == i))));
    }

    /* JADX INFO: renamed from: o.llF$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends FragmentStateAdapter {
        public final MemeSelectionActivityResultContract.Input EZpvd;
        public final PresetUserConfigBean copydefault;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull androidx.fragment.app.Fragment fragment, @NotNull MemeSelectionActivityResultContract.Input input, @NotNull PresetUserConfigBean presetUserConfigBean) {
            super(fragment);
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(input, "");
            Intrinsics.checkNotNullParameter(presetUserConfigBean, "");
            this.EZpvd = input;
            this.copydefault = presetUserConfigBean;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return C30930lkT.Companion.copydefault(this.copydefault.getPresetType(), this.EZpvd, (i == 0 ? TransactionType.Buy : TransactionType.Sell).getType());
        }
    }
}

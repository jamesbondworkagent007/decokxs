package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.os.BundleCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dexlogic.bean.MemeTransactionSceneType;
import com.okinc.business.dexlogic.bean.TransactionType;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetSelectionActivityViewModel;
import com.okinc.business.trade.features.home.meme.viewmodel.preset.PresetSelectionViewModel;
import com.okinc.business.trade.features.home.ui.meme.data.BuySellPreset;
import com.okinc.business.trade.features.home.ui.meme.data.DexPresetResultVO;
import com.okinc.business.trade.features.home.ui.meme.data.FeeConfig;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserConfigBean;
import com.okinc.business.trade.features.home.ui.meme.data.PresetUserParams;
import com.okinc.business.trade.features.home.ui.meme.data.SlippageConfigPreset;
import com.okinc.business.trade.features.home.ui.meme.preset.MemeSelectionActivityResultContract;
import com.okinc.business.trade.features.home.ui.meme.preset.adapter.MemeQuoteAdapter;
import com.okinc.business.trade.features.home.ui.uistate.preset.MemePresetSaveUiState;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C31008lls extends AbstractC30927lkQ<C21575hEl> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm DbNXlk;
    public java.lang.String gEmmrt;
    public final InterfaceC56387yDm valueOf;

    /* JADX INFO: renamed from: o.lls$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public static final boolean AEQbTJ(boolean z, android.view.View view, android.view.MotionEvent motionEvent) {
        return !z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.gEmmrt = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21575hEl KWHzl(C31008lls c31008lls) {
        return (C21575hEl) c31008lls.AEQbTJ();
    }

    public C31008lls() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetSelectionFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetSelectionFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetSelectionFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetSelectionFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetSelectionFragment$special$$inlined$viewModels$default$5
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PresetSelectionActivityViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetSelectionFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetSelectionFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.meme.preset.PresetSelectionFragment$special$$inlined$activityViewModels$default$3
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.llw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31008lls.valueOf(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresetSelectionViewModel DbNXlk() {
        return (PresetSelectionViewModel) this.DbNXlk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PresetSelectionActivityViewModel AYXKKw() {
        return (PresetSelectionActivityViewModel) this.AYXKKw.getValue();
    }

    public final MemeSelectionActivityResultContract.Input gEmmrt() {
        return (MemeSelectionActivityResultContract.Input) this.valueOf.getValue();
    }

    public static final MemeSelectionActivityResultContract.Input valueOf(C31008lls c31008lls) {
        android.os.Bundle arguments = c31008lls.getArguments();
        if (arguments != null) {
            return (MemeSelectionActivityResultContract.Input) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "data", MemeSelectionActivityResultContract.Input.class));
        }
        return null;
    }

    public final java.lang.String AhwBna() {
        java.lang.String str = this.gEmmrt;
        if (str != null) {
            return str;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    /* JADX INFO: renamed from: o.lls$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lls.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C31008lls copydefault(@NotNull MemeSelectionActivityResultContract.Input input) {
            Intrinsics.checkNotNullParameter(input, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", input);
            C31008lls c31008lls = new C31008lls();
            c31008lls.setArguments(bundle);
            return c31008lls;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public C21575hEl AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C21575hEl c21575hElAEQbTJ = C21575hEl.AEQbTJ(view);
        Intrinsics.checkNotNullExpressionValue(c21575hElAEQbTJ, "");
        return c21575hElAEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v12, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v14, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v18, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC7000aZw, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        wYF wyf;
        C52794wYp c52794wYpAEQbTJ;
        wYF wyf2;
        C52794wYp c52794wYpCopydefault;
        wYF wyf3;
        C52794wYp c52794wYpAEQbTJ2;
        wYF wyf4;
        C52794wYp c52794wYpCopydefault2;
        wYF wyf5;
        C52794wYp c52794wYpCopydefault3;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        MemeQuoteAdapter memeQuoteAdapter;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        MemeSelectionActivityResultContract.Input inputGEmmrt = gEmmrt();
        java.lang.String chainId = (inputGEmmrt == null || (memeQuoteAdapter = inputGEmmrt.getMemeQuoteAdapter()) == null) ? null : memeQuoteAdapter.getChainId();
        if (chainId == null) {
            chainId = "";
        }
        copydefault(chainId);
        DbNXlk().copydefault(AhwBna());
        C21575hEl c21575hEl = (C21575hEl) AEQbTJ();
        if (c21575hEl != null && (appCompatImageView2 = c21575hEl.copydefault) != null) {
            appCompatImageView2.setOnClickListener(new View.OnClickListener() { // from class: o.llv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    C31008lls.KWHzl(this.OLrzqt, view2);
                }
            });
        }
        C21575hEl c21575hEl2 = (C21575hEl) AEQbTJ();
        if (c21575hEl2 != null && (appCompatImageView = c21575hEl2.gEmmrt) != null) {
            appCompatImageView.setOnClickListener(new Application(appCompatImageView, 1000L, this));
        }
        C21575hEl c21575hEl3 = (C21575hEl) AEQbTJ();
        if (c21575hEl3 != null && (wyf5 = c21575hEl3.EZpvd) != null && (c52794wYpCopydefault3 = wyf5.copydefault()) != null) {
            c52794wYpCopydefault3.setText(getString(C23274hvD.Fragment.fXYAwm));
        }
        C21575hEl c21575hEl4 = (C21575hEl) AEQbTJ();
        if (c21575hEl4 != null && (wyf4 = c21575hEl4.EZpvd) != null && (c52794wYpCopydefault2 = wyf4.copydefault()) != null) {
            c52794wYpCopydefault2.setContentDescription("web3_dex_meme_setting_confirm");
        }
        C21575hEl c21575hEl5 = (C21575hEl) AEQbTJ();
        if (c21575hEl5 != null && (wyf3 = c21575hEl5.EZpvd) != null && (c52794wYpAEQbTJ2 = wyf3.AEQbTJ()) != null) {
            c52794wYpAEQbTJ2.setText(getString(C23274hvD.Fragment.hDKMBd));
            c52794wYpAEQbTJ2.setOKDSType(260);
        }
        C21575hEl c21575hEl6 = (C21575hEl) AEQbTJ();
        if (c21575hEl6 != null && (wyf2 = c21575hEl6.EZpvd) != null && (c52794wYpCopydefault = wyf2.copydefault()) != null) {
            c52794wYpCopydefault.setOnClickListener(new FragmentManager(c52794wYpCopydefault, 1000L, this));
        }
        C21575hEl c21575hEl7 = (C21575hEl) AEQbTJ();
        if (c21575hEl7 != null && (wyf = c21575hEl7.EZpvd) != null && (c52794wYpAEQbTJ = wyf.AEQbTJ()) != null) {
            c52794wYpAEQbTJ.setOnClickListener(new Fragment(c52794wYpAEQbTJ, 1000L, this));
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        C59541ziw.EZpvd(fragmentActivityRequireActivity, viewLifecycleOwner, new InterfaceC59496ziD() { // from class: o.llA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC59496ziD
            public final void OLrzqt(boolean z) {
                C31008lls.KWHzl(this.EZpvd, z);
            }
        });
        DbNXlk().valueOf().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.llB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31008lls.AEQbTJ(this.copydefault, (MemePresetSaveUiState) obj);
            }
        }));
        DbNXlk().AYXKKw().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.llC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31008lls.OLrzqt(this.AEQbTJ, (kotlin.Pair) obj);
            }
        }));
        DbNXlk().AhwBna().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.lly
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31008lls.copydefault(this.EZpvd, (java.lang.Boolean) obj);
            }
        }));
        DbNXlk().copydefault().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.llz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31008lls.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        DbNXlk().gEmmrt().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.llr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31008lls.EZpvd(this.copydefault, (DexPresetResultVO) obj);
            }
        }));
        AYXKKw().KWHzl().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.llu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C31008lls.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
    }

    public static final void KWHzl(C31008lls c31008lls, android.view.View view) {
        FragmentActivity activity = c31008lls.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: renamed from: o.lls$PendingIntent */
    public static final class PendingIntent implements Function1<java.lang.String, Unit> {
        public final /* synthetic */ PresetUserConfigBean EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(PresetUserConfigBean presetUserConfigBean) {
            this.EZpvd = presetUserConfigBean;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(java.lang.String str) {
            copydefault(str);
            return Unit.INSTANCE;
        }

        public final void copydefault(java.lang.String str) {
            C55244xgL c55244xgL;
            ViewPager2 viewPager2;
            AppCompatTextView appCompatTextView;
            Intrinsics.checkNotNullParameter(str, "");
            C21575hEl c21575hElKWHzl = C31008lls.KWHzl(C31008lls.this);
            if (c21575hElKWHzl != null && (appCompatTextView = c21575hElKWHzl.AkhnZx) != null) {
                appCompatTextView.setText(str);
            }
            C21575hEl c21575hElKWHzl2 = C31008lls.KWHzl(C31008lls.this);
            if (c21575hElKWHzl2 != null && (c55244xgL = c21575hElKWHzl2.fetchVPNInfo) != null) {
                C21575hEl c21575hElKWHzl3 = C31008lls.KWHzl(C31008lls.this);
                TabLayout.Tab tabKWHzl = c55244xgL.KWHzl((c21575hElKWHzl3 == null || (viewPager2 = c21575hElKWHzl3.valueOf) == null) ? 0 : viewPager2.getCurrentItem());
                if (tabKWHzl != null) {
                    tabKWHzl.setText(str);
                }
            }
            C31008lls.this.DbNXlk().AEQbTJ(C31008lls.this.AhwBna(), this.EZpvd.getPresetType(), str);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(C31008lls c31008lls, boolean z) {
        wYF wyf;
        C21575hEl c21575hEl = (C21575hEl) c31008lls.AEQbTJ();
        if (c21575hEl == null || (wyf = c21575hEl.EZpvd) == null) {
            return;
        }
        wyf.setVisibility(z ^ true ? 0 : 8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C31008lls c31008lls, MemePresetSaveUiState memePresetSaveUiState) {
        FragmentActivity activity;
        java.lang.String presetType;
        ViewPager2 viewPager2;
        pUU.KWHzl(c31008lls.getTAG(), "presetSaveStateLiveData: showLoading=" + memePresetSaveUiState.isLoading());
        if (memePresetSaveUiState.isLoading()) {
            c31008lls.showLoadingWithLogo(0L);
        } else {
            c31008lls.dismissLoadingWithLogo();
        }
        if (memePresetSaveUiState.isSuccess()) {
            C21575hEl c21575hEl = (C21575hEl) c31008lls.AEQbTJ();
            PresetUserConfigBean presetUserConfigBeanEZpvd = c31008lls.DbNXlk().EZpvd(c31008lls.AhwBna(), (c21575hEl == null || (viewPager2 = c21575hEl.valueOf) == null) ? 0 : viewPager2.getCurrentItem());
            if (presetUserConfigBeanEZpvd != null && (presetType = presetUserConfigBeanEZpvd.getPresetType()) != null) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("result", new MemeSelectionActivityResultContract.Output(presetType));
                FragmentActivity activity2 = c31008lls.getActivity();
                if (activity2 != null) {
                    activity2.setResult(-1, intent);
                }
                FragmentActivity activity3 = c31008lls.getActivity();
                if (activity3 != null) {
                    activity3.finish();
                }
            }
        }
        if (memePresetSaveUiState.isFail() && (activity = c31008lls.getActivity()) != null) {
            java.lang.String string = activity.getString(C23274hvD.Fragment.removeQueueItem);
            Intrinsics.checkNotNullExpressionValue(string, "");
            C25352ivB.EZpvd((android.app.Activity) activity, string);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C31008lls c31008lls, kotlin.Pair pair) {
        C55244xgL c55244xgL;
        ViewPager2 viewPager2;
        AppCompatTextView appCompatTextView;
        C21575hEl c21575hEl = (C21575hEl) c31008lls.AEQbTJ();
        if (c21575hEl != null && (appCompatTextView = c21575hEl.AkhnZx) != null) {
            appCompatTextView.setText((java.lang.CharSequence) pair.getSecond());
        }
        C21575hEl c21575hEl2 = (C21575hEl) c31008lls.AEQbTJ();
        if (c21575hEl2 != null && (c55244xgL = c21575hEl2.fetchVPNInfo) != null) {
            C21575hEl c21575hEl3 = (C21575hEl) c31008lls.AEQbTJ();
            TabLayout.Tab tabKWHzl = c55244xgL.KWHzl((c21575hEl3 == null || (viewPager2 = c21575hEl3.valueOf) == null) ? 0 : viewPager2.getCurrentItem());
            if (tabKWHzl != null) {
                tabKWHzl.setText((java.lang.CharSequence) pair.getSecond());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C31008lls c31008lls, java.lang.Boolean bool) {
        pUU.KWHzl(c31008lls.getTAG(), "showLoadingLiveData: showLoading=" + bool);
        if (bool.booleanValue()) {
            c31008lls.showLoadingWithLogo(0L);
        } else {
            c31008lls.dismissLoadingWithLogo();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.lls$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C31008lls OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C31008lls c31008lls) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.OLrzqt = c31008lls;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            ViewPager2 viewPager2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.OLrzqt.gEmmrt() != null) {
                    PresetSelectionViewModel presetSelectionViewModelDbNXlk = this.OLrzqt.DbNXlk();
                    java.lang.String strAhwBna = this.OLrzqt.AhwBna();
                    C21575hEl c21575hElKWHzl = C31008lls.KWHzl(this.OLrzqt);
                    PresetUserConfigBean presetUserConfigBeanKWHzl = presetSelectionViewModelDbNXlk.KWHzl(strAhwBna, (c21575hElKWHzl == null || (viewPager2 = c21575hElKWHzl.valueOf) == null) ? 0 : viewPager2.getCurrentItem());
                    if (presetUserConfigBeanKWHzl != null) {
                        C31056lmn c31056lmnCopydefault = C31056lmn.Companion.copydefault(presetUserConfigBeanKWHzl.getName(), this.OLrzqt.new PendingIntent(presetUserConfigBeanKWHzl));
                        androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        c31056lmnCopydefault.show(childFragmentManager);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.lls$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C31008lls EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C31008lls c31008lls) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c31008lls;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.EZpvd.DbNXlk().DbNXlk();
            }
        }
    }

    /* JADX INFO: renamed from: o.lls$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C31008lls copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C31008lls c31008lls) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c31008lls;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String value;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                PresetSelectionViewModel presetSelectionViewModelDbNXlk = this.copydefault.DbNXlk();
                java.lang.String strAhwBna = this.copydefault.AhwBna();
                MemeSelectionActivityResultContract.Input inputGEmmrt = this.copydefault.gEmmrt();
                if (inputGEmmrt == null || (value = inputGEmmrt.getMemeTransactionSceneType()) == null) {
                    value = MemeTransactionSceneType.Market.getValue();
                }
                presetSelectionViewModelDbNXlk.EZpvd(strAhwBna, value);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(final C31008lls c31008lls, java.lang.Boolean bool) {
        final C55173xeu c55173xeu;
        LinearLayoutCompat linearLayoutCompat;
        C21575hEl c21575hEl = (C21575hEl) c31008lls.AEQbTJ();
        if (c21575hEl != null && (linearLayoutCompat = c21575hEl.AhwBna) != null) {
            linearLayoutCompat.setVisibility(bool.booleanValue() ? 0 : 8);
        }
        C21575hEl c21575hEl2 = (C21575hEl) c31008lls.AEQbTJ();
        if (c21575hEl2 != null && (c55173xeu = c21575hEl2.KWHzl) != null) {
            c55173xeu.setVisibility(bool.booleanValue() ^ true ? 0 : 8);
            c55173xeu.setEmptyTypeImage(8);
            java.lang.String string = c31008lls.getString(C23274hvD.Fragment.ActivityResultKt);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeu.setTitle(string);
            java.lang.String string2 = c31008lls.getString(C23274hvD.Fragment.UscePu);
            Intrinsics.checkNotNullExpressionValue(string2, "");
            c55173xeu.setSubTitle((java.lang.CharSequence) string2);
            java.lang.String string3 = c31008lls.getString(C23274hvD.Fragment.EZpvd);
            Intrinsics.checkNotNullExpressionValue(string3, "");
            c55173xeu.setRetry(string3);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.llq
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C31008lls.AEQbTJ(c55173xeu, c31008lls, view);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C55173xeu c55173xeu, C31008lls c31008lls, android.view.View view) {
        c55173xeu.setVisibility(8);
        c31008lls.DbNXlk().copydefault(c31008lls.AhwBna());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v5, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r8v7, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C31008lls c31008lls, DexPresetResultVO dexPresetResultVO) {
        java.util.ArrayList<PresetUserConfigBean> dexPresetResultVOList;
        ViewPager2 viewPager2;
        C55244xgL c55244xgL;
        TabLayout.Tab tabKWHzl;
        if (dexPresetResultVO != null && (dexPresetResultVOList = dexPresetResultVO.getDexPresetResultVOList()) != null) {
            java.util.Iterator<PresetUserConfigBean> it = dexPresetResultVOList.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                PresetUserConfigBean next = it.next();
                MemeSelectionActivityResultContract.Input inputGEmmrt = c31008lls.gEmmrt();
                if (Intrinsics.EZpvd((java.lang.Object) (inputGEmmrt != null ? inputGEmmrt.getPresetType() : null), (java.lang.Object) next.getPresetType().toString())) {
                    break;
                }
                i++;
            }
            c31008lls.KWHzl(dexPresetResultVOList);
            if (i != -1) {
                PresetUserConfigBean presetUserConfigBean = dexPresetResultVOList.get(i);
                Intrinsics.checkNotNullExpressionValue(presetUserConfigBean, "");
                c31008lls.AEQbTJ(presetUserConfigBean);
                C21575hEl c21575hEl = (C21575hEl) c31008lls.AEQbTJ();
                if (c21575hEl != null && (c55244xgL = c21575hEl.fetchVPNInfo) != null && (tabKWHzl = c55244xgL.KWHzl(i)) != null) {
                    tabKWHzl.select();
                }
                C21575hEl c21575hEl2 = (C21575hEl) c31008lls.AEQbTJ();
                if (c21575hEl2 != null && (viewPager2 = c21575hEl2.valueOf) != null) {
                    viewPager2.setCurrentItem(i, true);
                }
            }
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c31008lls, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C31008lls c31008lls, java.lang.String str) {
        wYF wyf;
        C52794wYp c52794wYpCopydefault;
        C21575hEl c21575hEl = (C21575hEl) c31008lls.AEQbTJ();
        if (c21575hEl != null && (wyf = c21575hEl.EZpvd) != null && (c52794wYpCopydefault = wyf.copydefault()) != null) {
            Intrinsics.copydefault((java.lang.Object) str);
            c52794wYpCopydefault.setEnabled(!c31008lls.EZpvd(str));
        }
        Intrinsics.copydefault((java.lang.Object) str);
        c31008lls.OLrzqt(!c31008lls.EZpvd(str));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[PHI: r0
  0x0065: PHI (r0v9 java.lang.String) = (r0v6 java.lang.String), (r0v6 java.lang.String), (r0v12 java.lang.String), (r0v12 java.lang.String) binds: [B:23:0x0058, B:25:0x005e, B:14:0x003d, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean EZpvd(java.lang.String str) {
        java.lang.String value;
        java.lang.String limitOrderMax;
        FeeConfig feeConfig;
        java.lang.String limitOrderMin;
        FeeConfig feeConfig2;
        SlippageConfigPreset slippageConfig;
        SlippageConfigPreset slippageConfig2;
        SlippageConfigPreset slippageConfig3;
        SlippageConfigPreset slippageConfig4;
        FeeConfig feeConfig3;
        FeeConfig feeConfig4;
        BuySellPreset buySellPresetOLrzqt = OLrzqt(str);
        MemeSelectionActivityResultContract.Input inputGEmmrt = gEmmrt();
        if (inputGEmmrt == null || (value = inputGEmmrt.getMemeTransactionSceneType()) == null) {
            value = MemeTransactionSceneType.Market.getValue();
        }
        PresetUserParams presetUserParamsOLrzqt = DbNXlk().OLrzqt(AhwBna(), value);
        java.lang.String fixedMax = null;
        if (Intrinsics.EZpvd((java.lang.Object) value, (java.lang.Object) MemeTransactionSceneType.Market.getValue())) {
            limitOrderMax = (buySellPresetOLrzqt == null || (feeConfig4 = buySellPresetOLrzqt.getFeeConfig()) == null) ? null : feeConfig4.getMax();
            limitOrderMin = (buySellPresetOLrzqt == null || (feeConfig3 = buySellPresetOLrzqt.getFeeConfig()) == null) ? null : feeConfig3.getMin();
        } else {
            limitOrderMax = (buySellPresetOLrzqt == null || (feeConfig2 = buySellPresetOLrzqt.getFeeConfig()) == null) ? null : feeConfig2.getLimitOrderMax();
            if (buySellPresetOLrzqt != null && (feeConfig = buySellPresetOLrzqt.getFeeConfig()) != null) {
                limitOrderMin = feeConfig.getLimitOrderMin();
            }
        }
        java.lang.String dynamicMin = (buySellPresetOLrzqt == null || (slippageConfig4 = buySellPresetOLrzqt.getSlippageConfig()) == null) ? null : slippageConfig4.getDynamicMin();
        if (dynamicMin == null) {
            dynamicMin = "";
        }
        java.lang.String dynamicMax = (buySellPresetOLrzqt == null || (slippageConfig3 = buySellPresetOLrzqt.getSlippageConfig()) == null) ? null : slippageConfig3.getDynamicMax();
        if (dynamicMax == null) {
            dynamicMax = "";
        }
        java.lang.String fixedMin = (buySellPresetOLrzqt == null || (slippageConfig2 = buySellPresetOLrzqt.getSlippageConfig()) == null) ? null : slippageConfig2.getFixedMin();
        if (fixedMin == null) {
            fixedMin = "";
        }
        if (buySellPresetOLrzqt != null && (slippageConfig = buySellPresetOLrzqt.getSlippageConfig()) != null) {
            fixedMax = slippageConfig.getFixedMax();
        }
        if (fixedMax == null) {
            fixedMax = "";
        }
        return presetUserParamsOLrzqt.isInvalid(dynamicMin, dynamicMax, fixedMin, fixedMax, limitOrderMax == null ? "" : limitOrderMax, limitOrderMin == null ? "" : limitOrderMin);
    }

    public final BuySellPreset OLrzqt(java.lang.String str) {
        MemeSelectionActivityResultContract.Input inputGEmmrt = gEmmrt();
        if (inputGEmmrt != null && inputGEmmrt.getFromTransactionType() == TransactionType.Buy.getType()) {
            PresetUserConfigBean presetUserConfigBeanKWHzl = DbNXlk().KWHzl(AhwBna(), str);
            if (presetUserConfigBeanKWHzl != null) {
                return presetUserConfigBeanKWHzl.getBuyPreset();
            }
        } else {
            PresetUserConfigBean presetUserConfigBeanKWHzl2 = DbNXlk().KWHzl(AhwBna(), str);
            if (presetUserConfigBeanKWHzl2 != null) {
                return presetUserConfigBeanKWHzl2.getSellPreset();
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(PresetUserConfigBean presetUserConfigBean) {
        MemeQuoteAdapter memeQuoteAdapter;
        C21575hEl c21575hEl = (C21575hEl) AEQbTJ();
        if (c21575hEl != null) {
            AppCompatImageView appCompatImageView = c21575hEl.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            MemeSelectionActivityResultContract.Input inputGEmmrt = gEmmrt();
            C33054mpH.AEQbTJ(appCompatImageView, (inputGEmmrt == null || (memeQuoteAdapter = inputGEmmrt.getMemeQuoteAdapter()) == null) ? null : memeQuoteAdapter.getChainLogoUrl());
            AppCompatTextView appCompatTextView = c21575hEl.AkhnZx;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(0);
            c21575hEl.AkhnZx.setText(presetUserConfigBean.getName());
            AppCompatImageView appCompatImageView2 = c21575hEl.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            appCompatImageView2.setVisibility(presetUserConfigBean.getSupportChangeName() ? 0 : 8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(java.util.List<PresetUserConfigBean> list) {
        MemeSelectionActivityResultContract.Input inputGEmmrt;
        final C21575hEl c21575hEl = (C21575hEl) AEQbTJ();
        if (c21575hEl != null && (inputGEmmrt = gEmmrt()) != null) {
            RecyclerView.Adapter adapter = c21575hEl.valueOf.getAdapter();
            StateListAnimator stateListAnimator = adapter instanceof StateListAnimator ? (StateListAnimator) adapter : null;
            int i = 0;
            if (stateListAnimator != null) {
                stateListAnimator.copydefault(list);
                c21575hEl.valueOf.setOffscreenPageLimit(list.size());
                while (c21575hEl.fetchVPNInfo.AhwBna() > list.size()) {
                    c21575hEl.fetchVPNInfo.AYXKKw().removeTabAt(c21575hEl.fetchVPNInfo.AhwBna() - 1);
                }
                while (c21575hEl.fetchVPNInfo.AhwBna() < list.size()) {
                    C55244xgL c55244xgL = c21575hEl.fetchVPNInfo;
                    c55244xgL.AEQbTJ(c55244xgL.values());
                }
                for (java.lang.Object obj : list) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    PresetUserConfigBean presetUserConfigBean = (PresetUserConfigBean) obj;
                    TabLayout.Tab tabKWHzl = c21575hEl.fetchVPNInfo.KWHzl(i);
                    if (tabKWHzl != null) {
                        tabKWHzl.setText(presetUserConfigBean.getName());
                    }
                    i++;
                }
                return;
            }
            c21575hEl.valueOf.setAdapter(new StateListAnimator(this, inputGEmmrt, list));
            c21575hEl.valueOf.setOffscreenPageLimit(list.size());
            new TabLayoutMediator(c21575hEl.fetchVPNInfo.AYXKKw(), c21575hEl.valueOf, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.llx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i2) {
                    C31008lls.copydefault(c21575hEl, tab, i2);
                }
            }).attach();
            c21575hEl.fetchVPNInfo.KWHzl();
            c21575hEl.fetchVPNInfo.copydefault(new Activity(c21575hEl));
            c21575hEl.valueOf.setUserInputEnabled(false);
            c21575hEl.valueOf.registerOnPageChangeCallback(new TaskDescription(c21575hEl, this));
        }
        if (DbNXlk().djBIcL()) {
            valueOf();
        }
    }

    public static final void copydefault(C21575hEl c21575hEl, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        RecyclerView.Adapter adapter = c21575hEl.valueOf.getAdapter();
        StateListAnimator stateListAnimator = adapter instanceof StateListAnimator ? (StateListAnimator) adapter : null;
        if (stateListAnimator != null) {
            tab.setText(stateListAnimator.KWHzl().get(i).getName());
        }
    }

    /* JADX INFO: renamed from: o.lls$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C21575hEl AEQbTJ;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        public Activity(C21575hEl c21575hEl) {
            this.AEQbTJ = c21575hEl;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            int position = tab.getPosition();
            pUU.KWHzl(C31008lls.this.getTAG(), "onTabSelected: " + position);
            this.AEQbTJ.valueOf.setCurrentItem(position, true);
            RecyclerView.Adapter adapter = this.AEQbTJ.valueOf.getAdapter();
            StateListAnimator stateListAnimator = adapter instanceof StateListAnimator ? (StateListAnimator) adapter : null;
            if (stateListAnimator != null) {
                C31008lls.this.AYXKKw().AEQbTJ(stateListAnimator.KWHzl().get(position).getPresetType());
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            pUU.KWHzl(C31008lls.this.getTAG(), "onTabUnselected: " + (tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null));
        }
    }

    /* JADX INFO: renamed from: o.lls$TaskDescription */
    public static final class TaskDescription extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ C21575hEl AEQbTJ;
        public final /* synthetic */ C31008lls KWHzl;

        public TaskDescription(C21575hEl c21575hEl, C31008lls c31008lls) {
            this.AEQbTJ = c21575hEl;
            this.KWHzl = c31008lls;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            AppCompatImageView appCompatImageView;
            AppCompatTextView appCompatTextView;
            RecyclerView.Adapter adapter = this.AEQbTJ.valueOf.getAdapter();
            StateListAnimator stateListAnimator = adapter instanceof StateListAnimator ? (StateListAnimator) adapter : null;
            if (stateListAnimator != null) {
                C31008lls c31008lls = this.KWHzl;
                C21575hEl c21575hEl = this.AEQbTJ;
                PresetUserConfigBean presetUserConfigBean = stateListAnimator.KWHzl().get(i);
                C21575hEl c21575hElKWHzl = C31008lls.KWHzl(c31008lls);
                if (c21575hElKWHzl != null && (appCompatTextView = c21575hElKWHzl.AkhnZx) != null) {
                    appCompatTextView.setText(presetUserConfigBean.getName());
                }
                C21575hEl c21575hElKWHzl2 = C31008lls.KWHzl(c31008lls);
                if (c21575hElKWHzl2 != null && (appCompatImageView = c21575hElKWHzl2.gEmmrt) != null) {
                    appCompatImageView.setVisibility((presetUserConfigBean.getSupportChangeName() && i == c21575hEl.valueOf.getCurrentItem()) ? 0 : 8);
                }
                c31008lls.AYXKKw().EZpvd().setValue(presetUserConfigBean.getPresetType());
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            pUU.KWHzl(this.KWHzl.getTAG(), "onPageScrollStateChanged: " + i + ", currentItem=" + this.AEQbTJ.valueOf.getCurrentItem());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(final boolean z) {
        C55244xgL c55244xgL;
        TabLayout.TabView tabView;
        C21575hEl c21575hEl = (C21575hEl) AEQbTJ();
        if (c21575hEl == null || (c55244xgL = c21575hEl.fetchVPNInfo) == null) {
            return;
        }
        int iAhwBna = c55244xgL.AhwBna();
        for (int i = 0; i < iAhwBna; i++) {
            TabLayout.Tab tabKWHzl = c55244xgL.KWHzl(i);
            if (tabKWHzl != null && (tabView = tabKWHzl.view) != null) {
                tabView.setOnTouchListener(new View.OnTouchListener() { // from class: o.llt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
                        return C31008lls.AEQbTJ(z, view, motionEvent);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: o.lls$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator extends FragmentStateAdapter {
        public final MemeSelectionActivityResultContract.Input AEQbTJ;
        public java.util.List<PresetUserConfigBean> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<PresetUserConfigBean> KWHzl() {
            return this.OLrzqt;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull androidx.fragment.app.Fragment fragment, @NotNull MemeSelectionActivityResultContract.Input input, @NotNull java.util.List<PresetUserConfigBean> list) {
            super(fragment);
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(input, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = input;
            this.OLrzqt = list;
        }

        public final void copydefault(@NotNull java.util.List<PresetUserConfigBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.size();
        }

        /* JADX DEBUG: Method merged with bridge method: createFragment(I)Landroidx/fragment/app/Fragment; */
        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public C30969llF createFragment(int i) {
            return C30969llF.Companion.copydefault(this.AEQbTJ, this.OLrzqt.get(i).getPresetType());
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return this.OLrzqt.get(i).getId();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public boolean containsItem(long j) {
            java.util.List<PresetUserConfigBean> list = this.OLrzqt;
            if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((PresetUserConfigBean) it.next()).getId() == j) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final void valueOf() {
        C55244xgL c55244xgL;
        TabLayout.Tab tabKWHzl;
        FragmentActivity activity = getActivity();
        C52812wZg.StateListAnimator stateListAnimator = null;
        TabLayout.TabView tabView = (activity == null || (c55244xgL = (C55244xgL) activity.findViewById(C23274hvD.Application.clearAvailableContext)) == null || (tabKWHzl = c55244xgL.KWHzl(0)) == null) ? null : tabKWHzl.view;
        if (tabView != null) {
            stateListAnimator = new C52812wZg.StateListAnimator(tabView);
            stateListAnimator.EZpvd(1);
            stateListAnimator.AEQbTJ(getString(C23274hvD.Fragment.MediaBrowserCompatConnectionCallback));
            stateListAnimator.OLrzqt(getString(C23274hvD.Fragment.sendCustomAction));
        }
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C52812wZg c52812wZg = new C52812wZg(fragmentActivityRequireActivity);
        if (stateListAnimator != null) {
            c52812wZg.AEQbTJ(stateListAnimator);
        }
        c52812wZg.OLrzqt(1);
        c52812wZg.KWHzl(new Function0() { // from class: o.llp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C31008lls.AYXKKw(this.OLrzqt);
            }
        });
        C52794wYp c52794wYpAkhnZx = c52812wZg.AkhnZx();
        if (c52794wYpAkhnZx != null) {
            c52794wYpAkhnZx.setVisibility(8);
        }
        c52812wZg.fARcdN();
    }

    public static final Unit AYXKKw(C31008lls c31008lls) {
        c31008lls.DbNXlk().AEQbTJ(false);
        return Unit.INSTANCE;
    }
}

package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.defi.biz.core.customchain.meta.CustomChainMeta;
import com.okinc.business.defi.wallet.home.fragment.ChooseNetworkContainerFragment$initView$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC16104edd;
import o.C13754dXa;
import o.C16084edJ;
import o.C52761wXj;
import o.eSW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.faJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18006faJ extends AbstractC32996moC implements C16084edJ.ActionBar {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public C16519elU AEQbTJ;
    public java.util.List<? extends androidx.fragment.app.Fragment> EZpvd;
    public final ActivityResultLauncher<android.content.Intent> KWHzl;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.zSsVtY;
    }

    public C18006faJ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkContainerFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkContainerFragment$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C18013faQ.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkContainerFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkContainerFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.fragment.ChooseNetworkContainerFragment$special$$inlined$viewModels$default$5
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
        this.EZpvd = yDY.AhwBna();
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.faK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C18006faJ.KWHzl(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
    }

    public final C18013faQ OLrzqt() {
        return (C18013faQ) this.copydefault.getValue();
    }

    public static final void KWHzl(C18006faJ c18006faJ, ActivityResult activityResult) {
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        TabLayout.Tab tabAt;
        if (activityResult.getResultCode() == -1) {
            android.content.Intent data = activityResult.getData();
            java.lang.String stringExtra = data != null ? data.getStringExtra("chain_id") : null;
            if (stringExtra != null) {
                C16519elU c16519elU = c18006faJ.AEQbTJ;
                if (c16519elU != null && (c55244xgL = c16519elU.OLrzqt) != null && (tabLayoutAYXKKw = c55244xgL.AYXKKw()) != null && (tabAt = tabLayoutAYXKKw.getTabAt(0)) != null) {
                    tabAt.select();
                }
                java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(c18006faJ.EZpvd, 0);
                C18082fbg c18082fbg = objAkhnZx instanceof C18082fbg ? (C18082fbg) objAkhnZx : null;
                if (c18082fbg != null) {
                    c18082fbg.OLrzqt(stringExtra);
                }
            }
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = C16519elU.KWHzl(view);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new ChooseNetworkContainerFragment$initView$1(this, view, null), 3, null);
    }

    public final void KWHzl(C16519elU c16519elU, final android.content.Context context, boolean z) {
        android.os.Bundle arguments = getArguments();
        boolean z2 = arguments != null ? arguments.getBoolean("showTotalAsset") : true;
        android.os.Bundle arguments2 = getArguments();
        long j = arguments2 != null ? arguments2.getLong("chain_id") : Long.MIN_VALUE;
        c16519elU.KWHzl.getTitle().setTextAppearance(C52761wXj.LoaderManager.DGOPHZ);
        c16519elU.KWHzl.getTitle().setTextColor(ContextCompat.getColor(context, C52761wXj.Activity.fdOvFl));
        c16519elU.KWHzl.getTitle().setTextSize(18.0f);
        c16519elU.KWHzl.setAppBarTitle(context.getString(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResultCompanion));
        ViewPager2 viewPager2 = c16519elU.AEQbTJ;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(C18082fbg.Companion.KWHzl(j, z2));
        if (z) {
            C16084edJ.StateListAnimator stateListAnimator = C16084edJ.Companion;
            listOLrzqt.add(stateListAnimator.EZpvd(1));
            listOLrzqt.add(stateListAnimator.EZpvd(2));
        }
        Unit unit = Unit.INSTANCE;
        java.util.List<? extends androidx.fragment.app.Fragment> listFARcdN = C56402yEa.fARcdN(listOLrzqt);
        this.EZpvd = listFARcdN;
        viewPager2.setAdapter(new Activity(childFragmentManager, lifecycle, listFARcdN));
        C55244xgL c55244xgL = c16519elU.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        c55244xgL.setVisibility(z ? 0 : 8);
        c16519elU.AEQbTJ.setUserInputEnabled(z);
        if (z) {
            new eSW(c16519elU.OLrzqt.AYXKKw(), c16519elU.AEQbTJ, new eSW.Activity() { // from class: o.faL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.eSW.Activity
                public final void KWHzl(TabLayout.Tab tab, int i) {
                    C18006faJ.EZpvd(context, tab, i);
                }
            }).KWHzl();
        }
    }

    public static final void EZpvd(android.content.Context context, TabLayout.Tab tab, int i) {
        java.lang.String string = "";
        Intrinsics.checkNotNullParameter(tab, "");
        if (i == 0) {
            string = context.getString(C13754dXa.FragmentManager.isNavigationVisible);
        } else if (i == 1) {
            string = context.getString(C13754dXa.FragmentManager.TransitionRes);
        } else if (i == 2) {
            string = context.getString(C13754dXa.FragmentManager.createIntent);
        }
        tab.setText(string);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }

    /* JADX INFO: renamed from: o.faJ$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity extends FragmentStateAdapter {
        public final java.util.List<androidx.fragment.app.Fragment> AEQbTJ;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Activity(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Lifecycle lifecycle, @NotNull java.util.List<? extends androidx.fragment.app.Fragment> list) {
            super(fragmentManager, lifecycle);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(lifecycle, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.AEQbTJ = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return this.AEQbTJ.get(i);
        }
    }

    /* JADX INFO: renamed from: o.faJ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.faJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C18006faJ OLrzqt(long j, boolean z) {
            C18006faJ c18006faJ = new C18006faJ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("chain_id", j);
            bundle.putBoolean("showTotalAsset", z);
            c18006faJ.setArguments(bundle);
            return c18006faJ;
        }
    }

    @Override // o.C16084edJ.ActionBar
    public void OLrzqt(CustomChainMeta customChainMeta) {
        android.content.Intent intentEZpvd;
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.KWHzl;
        if (customChainMeta == null) {
            ActivityC16104edd.TaskDescription taskDescription = ActivityC16104edd.Companion;
            FragmentActivity activity = getActivity();
            if (activity == null) {
                return;
            } else {
                intentEZpvd = ActivityC16104edd.TaskDescription.getIntent$default(taskDescription, activity, null, null, 6, null);
            }
        } else {
            ActivityC16104edd.TaskDescription taskDescription2 = ActivityC16104edd.Companion;
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                return;
            }
            long jEZpvd = customChainMeta.EZpvd();
            intentEZpvd = taskDescription2.EZpvd(activity2, java.lang.String.valueOf(jEZpvd), customChainMeta.isConnected());
        }
        activityResultLauncher.launch(intentEZpvd);
    }
}

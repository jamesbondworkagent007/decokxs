package o;

import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.okinc.business.defi.biz.net.bean.AddressTokenAsset;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$initViewData$1;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$initViewData$2;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$initViewData$3;
import com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$initViewData$4;
import com.okinc.business.defi.wallet.home.addressDetail.viewmodel.AddressProfileAssetViewModel;
import com.okinc.business.defi.wallet.home.nestedscroll.CoorLayoutSuper;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
import com.okinc.components.track.TrackChannel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC15870eYi;
import o.C13754dXa;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eXf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C15840eXf extends eXH {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final int AYXKKw;
    public final InterfaceC56387yDm OLrzqt;
    public C16590emm djBIcL;
    public java.lang.String EZpvd = "";
    public long AEQbTJ = Long.MIN_VALUE;
    public final C59534zip copydefault = new C59534zip();

    /* JADX INFO: renamed from: o.eXf$ActionBar */
    public static final class ActionBar extends AppBarLayout.Behavior.DragCallback {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback
        public boolean canDrag(AppBarLayout appBarLayout) {
            Intrinsics.checkNotNullParameter(appBarLayout, "");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public C15840eXf() {
        final Function0 function0 = new Function0() { // from class: o.eXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15840eXf.gEmmrt(this.EZpvd);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$special$$inlined$viewModels$default$1
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(AddressProfileAssetViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.defi.wallet.home.addressDetail.ui.DefiHomeAddressAssetListFragment$special$$inlined$viewModels$default$4
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
        this.AYXKKw = C13754dXa.TaskDescription.frkDMe;
    }

    /* JADX INFO: renamed from: o.eXf$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.eXf.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C15840eXf OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C15840eXf c15840eXf = new C15840eXf();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS, str);
            c15840eXf.setArguments(bundle);
            return c15840eXf;
        }
    }

    /* JADX DEBUG: Possible override for method o.eXH.EZpvd()V */
    public final AddressProfileAssetViewModel EZpvd() {
        return (AddressProfileAssetViewModel) this.OLrzqt.getValue();
    }

    public static final ViewModelStoreOwner gEmmrt(C15840eXf c15840eXf) {
        androidx.fragment.app.Fragment parentFragment = c15840eXf.getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        FragmentActivity fragmentActivityRequireActivity = c15840eXf.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String string;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(WalletSearchRequest.SEARCH_SOURCE_ADDRESS)) == null) {
            string = "";
        }
        this.EZpvd = string;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C16590emm c16590emm = this.djBIcL;
        C16590emm c16590emm2 = null;
        if (c16590emm == null) {
            Intrinsics.gEmmrt("");
            c16590emm = null;
        }
        RecyclerView recyclerView = c16590emm.copydefault;
        C16590emm c16590emm3 = this.djBIcL;
        if (c16590emm3 == null) {
            Intrinsics.gEmmrt("");
            c16590emm3 = null;
        }
        recyclerView.setLayoutManager(new SafeLinearLayoutManager(c16590emm3.copydefault.getContext()));
        C16590emm c16590emm4 = this.djBIcL;
        if (c16590emm4 == null) {
            Intrinsics.gEmmrt("");
            c16590emm4 = null;
        }
        c16590emm4.copydefault.setAdapter(this.copydefault);
        C16590emm c16590emm5 = this.djBIcL;
        if (c16590emm5 == null) {
            Intrinsics.gEmmrt("");
            c16590emm5 = null;
        }
        c16590emm5.OLrzqt.djBIcL(false);
        C16590emm c16590emm6 = this.djBIcL;
        if (c16590emm6 == null) {
            Intrinsics.gEmmrt("");
            c16590emm6 = null;
        }
        c16590emm6.OLrzqt.EZpvd(0.0f);
        C16590emm c16590emm7 = this.djBIcL;
        if (c16590emm7 == null) {
            Intrinsics.gEmmrt("");
            c16590emm7 = null;
        }
        c16590emm7.OLrzqt.AhwBna(true);
        C16590emm c16590emm8 = this.djBIcL;
        if (c16590emm8 == null) {
            Intrinsics.gEmmrt("");
            c16590emm8 = null;
        }
        c16590emm8.OLrzqt.OLrzqt(true);
        C16590emm c16590emm9 = this.djBIcL;
        if (c16590emm9 == null) {
            Intrinsics.gEmmrt("");
            c16590emm9 = null;
        }
        c16590emm9.OLrzqt.KWHzl(new InterfaceC57900yrD() { // from class: o.eXg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C15840eXf.OLrzqt(this.OLrzqt, interfaceC57934yrl);
            }
        });
        C16590emm c16590emm10 = this.djBIcL;
        if (c16590emm10 == null) {
            Intrinsics.gEmmrt("");
        } else {
            c16590emm2 = c16590emm10;
        }
        final AppBarLayout appBarLayout = c16590emm2.KWHzl;
        appBarLayout.post(new java.lang.Runnable() { // from class: o.eXh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C15840eXf.OLrzqt(appBarLayout);
            }
        });
        gEmmrt();
        djBIcL();
    }

    public static final void OLrzqt(C15840eXf c15840eXf, InterfaceC57934yrl interfaceC57934yrl) {
        java.util.List<java.lang.Long> listEZpvd;
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        long j = c15840eXf.AEQbTJ;
        if (j == Long.MIN_VALUE) {
            listEZpvd = c15840eXf.EZpvd().OLrzqt();
        } else {
            listEZpvd = C56402yEa.EZpvd(java.lang.Long.valueOf(j));
        }
        c15840eXf.EZpvd().EZpvd(listEZpvd);
    }

    public static final void OLrzqt(AppBarLayout appBarLayout) {
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
        AppBarLayout.Behavior behavior2 = behavior instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) behavior : null;
        if (behavior2 != null) {
            behavior2.setDragCallback(new ActionBar());
        }
    }

    private final void djBIcL() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new DefiHomeAddressAssetListFragment$initViewData$1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new DefiHomeAddressAssetListFragment$initViewData$2(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new DefiHomeAddressAssetListFragment$initViewData$3(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new DefiHomeAddressAssetListFragment$initViewData$4(this, null));
    }

    private final void gEmmrt() {
        this.copydefault.register(java.lang.String.class, new C18228feT());
        this.copydefault.register(AddressTokenAsset.class, new C18230feV(new Function1() { // from class: o.eXi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C15840eXf.EZpvd(this.AEQbTJ, (AddressTokenAsset) obj);
            }
        }, new Function2() { // from class: o.eXk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C15840eXf.copydefault(this.OLrzqt, (AddressTokenAsset) obj, (android.view.View) obj2);
            }
        }));
    }

    public static final Unit EZpvd(C15840eXf c15840eXf, AddressTokenAsset addressTokenAsset) {
        Intrinsics.checkNotNullParameter(addressTokenAsset, "");
        ActivityC15870eYi.Activity activity = ActivityC15870eYi.Companion;
        FragmentActivity activity2 = c15840eXf.getActivity();
        if (activity2 == null) {
            return Unit.INSTANCE;
        }
        activity.copydefault(activity2, c15840eXf.EZpvd, addressTokenAsset);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C15840eXf c15840eXf, AddressTokenAsset addressTokenAsset, android.view.View view) {
        Intrinsics.checkNotNullParameter(addressTokenAsset, "");
        Intrinsics.checkNotNullParameter(view, "");
        FragmentActivity activity = c15840eXf.getActivity();
        if (activity == null) {
            return Unit.INSTANCE;
        }
        C52812wZg c52812wZg = new C52812wZg(activity);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(view);
        stateListAnimator.EZpvd(1);
        stateListAnimator.OLrzqt(c15840eXf.getString(C13754dXa.FragmentManager.Size));
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
        C32866mlf.onEvent$default("Web3Portfolio_Assets_RiskWarningIcon_Click", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C16590emm c16590emmEZpvd = C16590emm.EZpvd(getLayoutInflater(), viewGroup, false);
        this.djBIcL = c16590emmEZpvd;
        if (c16590emmEZpvd == null) {
            Intrinsics.gEmmrt("");
            c16590emmEZpvd = null;
        }
        CoorLayoutSuper root = c16590emmEZpvd.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }
}

package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSelectNetworkFragment$observeNetworkResults$1;
import com.okinc.components.track.TrackChannel;
import com.okinc.uilab.list.OKAnchorSelection;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.C52761wXj;
import o.fRN;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fQv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C17748fQv extends wXX {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public Application AEQbTJ;
    public final InterfaceC56387yDm EZpvd;

    /* JADX INFO: renamed from: o.fQv$Application */
    public interface Application {
        void AEQbTJ(long j);
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public float getHeightScale() {
        return 0.99f;
    }

    public C17748fQv() {
        Function0 function0 = new Function0() { // from class: o.fQw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C17748fQv.KWHzl();
            }
        };
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSelectNetworkFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSelectNetworkFragment$special$$inlined$viewModels$default$2
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
        final Function0 function03 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(fRN.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSelectNetworkFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.defi.wallet.switchComponent.fragments.CurrentWalletSelectNetworkFragment$special$$inlined$viewModels$default$4
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
                Function0 function04 = function03;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fRN OLrzqt() {
        return (fRN) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fRN KWHzl(CreationExtras creationExtras) {
        Intrinsics.checkNotNullParameter(creationExtras, "");
        return new fRN(SavedStateHandleSupport.createSavedStateHandle(creationExtras), ((InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class)).copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.content.Context */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[PHI: r3
  0x002d: PHI (r3v3 o.fQv$Application) = (r3v2 o.fQv$Application), (r3v6 o.fQv$Application) binds: [B:6:0x0015, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAttach(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        super.onAttach(context);
        setDynamicFullScreen(true);
        Application application = null;
        Application application2 = context instanceof Application ? (Application) context : null;
        if (application2 == null) {
            ActivityResultCaller parentFragment = getParentFragment();
            application2 = parentFragment instanceof Application ? (Application) parentFragment : null;
            if (application2 == null) {
                pUU.EZpvd("CurrentWalletSelectNetworkFragment", "CurrentWalletSelectNetworkFragment.OnChainSelectedListener is null, did you implement in your activity or parentFragment?");
            } else {
                application = application2;
            }
        }
        this.AEQbTJ = application;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        BottomSheetBehavior<android.widget.FrameLayout> behavior;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null && (behavior = bottomSheetDialog.getBehavior()) != null) {
            behavior.setSkipCollapsed(true);
        }
        C32866mlf.onEvent$default("Web3SelectNetwork_Sheet_Page_View", (TrackChannel[]) null, (Function1) null, 3, (java.lang.Object) null);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        wxq.gEmmrt();
        wxq.setStyle(2);
        wxq.AEQbTJ().setVisibility(8);
        wxq.EZpvd().setVisibility(0);
        wxq.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.fQx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C17748fQv.copydefault(this.copydefault, view);
            }
        });
        java.lang.String string = context.getString(C13754dXa.FragmentManager.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl);
        Intrinsics.checkNotNullExpressionValue(string, "");
        wxq.setTitle(string);
    }

    public static final void copydefault(C17748fQv c17748fQv, android.view.View view) {
        c17748fQv.dismiss();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        copydefault(copydefault(context, constraintLayout));
    }

    public final OKAnchorSelection copydefault(android.content.Context context, ConstraintLayout constraintLayout) {
        OKAnchorSelection oKAnchorSelection = new OKAnchorSelection(context, null, 2, null);
        oKAnchorSelection.setStyle(OKAnchorSelection.OKAnchorSelectionStyle.SHEET);
        oKAnchorSelection.djBIcL().EZpvd().setHint(context.getString(C13754dXa.FragmentManager.ActionBarDrawerToggleHoneycomb));
        C55173xeu c55173xeuCopydefault = oKAnchorSelection.copydefault();
        if (c55173xeuCopydefault != null) {
            java.lang.String string = context.getString(C13754dXa.FragmentManager.ActivityResultContractsStartActivityForResult);
            Intrinsics.checkNotNullExpressionValue(string, "");
            c55173xeuCopydefault.setTitle(string);
        }
        constraintLayout.addView(oKAnchorSelection, new ConstraintLayout.LayoutParams(-1, -2));
        oKAnchorSelection.EZpvd();
        return oKAnchorSelection;
    }

    public final void copydefault(OKAnchorSelection oKAnchorSelection) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new CurrentWalletSelectNetworkFragment$observeNetworkResults$1(this, oKAnchorSelection, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void EZpvd(OKAnchorSelection oKAnchorSelection, java.util.List<fRN.ActionBar> list, java.util.Map<java.lang.String, ? extends java.util.List<fRN.ActionBar>> map, boolean z) {
        android.content.Context context = getContext();
        if (context == null) {
            return;
        }
        java.util.List<java.lang.String> listAxsJAYaxsJAY = CollectionsKt___CollectionsKt.AxsJAYaxsJAY(map.keySet());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!list.isEmpty()) {
            arrayList.add("★");
        }
        arrayList.addAll(listAxsJAYaxsJAY);
        oKAnchorSelection.setIndexList(arrayList);
        if (!list.isEmpty()) {
            oKAnchorSelection.OLrzqt(new C13784dYd(z, context.getString(C13754dXa.FragmentManager.isNavigationVisible), CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) list)));
        }
        for (java.lang.String str : listAxsJAYaxsJAY) {
            java.util.List<fRN.ActionBar> listAhwBna = map.get(str);
            if (listAhwBna == null) {
                listAhwBna = yDY.AhwBna();
            }
            oKAnchorSelection.OLrzqt(new C13784dYd(z, str, CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) listAhwBna)));
        }
    }

    /* JADX INFO: renamed from: o.fQv$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ fRN.ActionBar EZpvd;
        public final /* synthetic */ C17748fQv KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C17748fQv c17748fQv, fRN.ActionBar actionBar) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c17748fQv;
            this.EZpvd = actionBar;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                Application application = this.KWHzl.AEQbTJ;
                if (application != null) {
                    application.AEQbTJ(this.EZpvd.KWHzl());
                }
                this.KWHzl.dismiss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(final OKAnchorSelection oKAnchorSelection, final java.util.List<fRN.ActionBar> list) {
        oKAnchorSelection.setConvertViewId(C13754dXa.TaskDescription.svY);
        oKAnchorSelection.setConvertViewCallback(new Function2() { // from class: o.fQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C17748fQv.EZpvd(this.OLrzqt, (C55043xcW) obj, obj2);
            }
        });
        oKAnchorSelection.setSearchResultCallback(new Function1() { // from class: o.fQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17748fQv.KWHzl(list, oKAnchorSelection, (java.lang.CharSequence) obj);
            }
        });
    }

    public static final Unit EZpvd(C17748fQv c17748fQv, C55043xcW c55043xcW, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(c55043xcW, "");
        Intrinsics.copydefault(obj, "");
        fRN.ActionBar actionBar = (fRN.ActionBar) obj;
        android.content.Context context = c55043xcW.itemView.getContext();
        c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD, actionBar.OLrzqt());
        c55043xcW.OLrzqt(C13754dXa.ActionBar.setMediaUri, false);
        android.graphics.drawable.Drawable drawable = ContextCompat.getDrawable(context, C52761wXj.TaskDescription.fERRXa);
        android.widget.ImageView imageView = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialaKhcqp);
        if (imageView != null) {
            Glide.KWHzl(imageView).EZpvd(actionBar.AEQbTJ()).AEQbTJ(drawable).EZpvd(drawable).OLrzqt(drawable).EZpvd(imageView);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialsiEkQe);
        if (imageView2 != null) {
            imageView2.setVisibility(actionBar.copydefault() ? 0 : 8);
        }
        android.view.View viewEZpvd = c55043xcW.EZpvd(C13754dXa.ActionBar.DPHOMC);
        if (viewEZpvd != null) {
            viewEZpvd.setVisibility(8);
        }
        android.view.View viewEZpvd2 = c55043xcW.EZpvd(C13754dXa.ActionBar.invokespecialhOMIpD);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) (viewEZpvd2 != null ? viewEZpvd2.getLayoutParams() : null);
        if (marginLayoutParams != null) {
            Intrinsics.copydefault(context);
            marginLayoutParams.topMargin = C55298xhM.copydefault(25.0f, context);
        }
        if (viewEZpvd2 != null) {
            viewEZpvd2.setLayoutParams(marginLayoutParams);
        }
        android.view.View view = c55043xcW.itemView;
        view.setOnClickListener(new Activity(view, 1000L, c17748fQv, actionBar));
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.AEQbTJ = null;
    }

    /* JADX INFO: renamed from: o.fQv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fQv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C17748fQv KWHzl(long j, @NotNull java.util.List<java.lang.Long> list, @NotNull java.util.List<java.lang.Long> list2) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            C17748fQv c17748fQv = new C17748fQv();
            c17748fQv.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("POPULAR_CHAIN_IDS", new java.util.ArrayList(list)), C56390yDp.OLrzqt("SELECTED_CHAIN_ID", java.lang.Long.valueOf(j)), C56390yDp.OLrzqt("SUPPORTED_CHAIN_IDS", new java.util.ArrayList(list2))));
            return c17748fQv;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewModelProvider.Factory KWHzl() {
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder.addInitializer(C56524yIo.AEQbTJ(fRN.class), new Function1() { // from class: o.fQz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17748fQv.KWHzl((CreationExtras) obj);
            }
        });
        return initializerViewModelFactoryBuilder.build();
    }

    public static final Unit KWHzl(java.util.List list, OKAnchorSelection oKAnchorSelection, java.lang.CharSequence charSequence) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            fRN.ActionBar actionBar = (fRN.ActionBar) obj;
            if (charSequence == null || StringsKt__StringsKt.AhwBna((java.lang.CharSequence) actionBar.OLrzqt(), charSequence, true)) {
                arrayList.add(obj);
            }
        }
        oKAnchorSelection.setSearchResultList(CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList));
        return Unit.INSTANCE;
    }
}

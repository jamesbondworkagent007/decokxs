package o;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.center.bean.enums.SelfServiceScenario;
import com.okinc.okex.search.ui.SearchResultComboFragment$initViewModel$2;
import com.okinc.okex.search.ui.SearchResultIntentFragment;
import com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel;
import com.okinc.okex.search.viewmodel.SupportSearchViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C45167skg;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.szW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45857szW extends AbstractC45843szI {
    public static final java.lang.String AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm djBIcL;
    public final int fetchVPNInfo;
    public AbstractC47347toN gEmmrt;
    public boolean isConnected;
    public final InterfaceC56387yDm valueOf;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AYXKKw = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.fetchVPNInfo;
    }

    public C45857szW() {
        final Function0 function0 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SupportSearchViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SearchResultComboFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SearchResultComboFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SearchResultComboFragment$special$$inlined$activityViewModels$default$3
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
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.okex.search.ui.SearchResultComboFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.search.ui.SearchResultComboFragment$special$$inlined$viewModels$default$2
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
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchResultArticlesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SearchResultComboFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SearchResultComboFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SearchResultComboFragment$special$$inlined$viewModels$default$5
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
        this.fetchVPNInfo = C47315tni.ActionBar.RJOkX;
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.szU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C45857szW.EZpvd(this.KWHzl);
            }
        });
        this.isConnected = true;
    }

    public final SupportSearchViewModel gEmmrt() {
        return (SupportSearchViewModel) this.djBIcL.getValue();
    }

    public final SearchResultArticlesViewModel djBIcL() {
        return (SearchResultArticlesViewModel) this.valueOf.getValue();
    }

    /* JADX INFO: renamed from: o.szW$ActionBar */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.szW.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String OLrzqt() {
            return C45857szW.AhwBna;
        }

        public final C45857szW AEQbTJ() {
            return new C45857szW();
        }
    }

    static {
        java.lang.String simpleName = C45857szW.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        AhwBna = simpleName;
    }

    public final java.util.List<C45167skg.Activity> AYXKKw() {
        return (java.util.List) this.AkhnZx.getValue();
    }

    public static final java.util.List EZpvd(C45857szW c45857szW) {
        java.util.List<CategorySlug> listCopydefault = c45857szW.djBIcL().copydefault();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listCopydefault, 10));
        for (CategorySlug categorySlug : listCopydefault) {
            arrayList.add(new C45167skg.Activity(C33070mpX.AYXKKw(categorySlug.getTitleResId()), C44026sAp.Companion.OLrzqt(categorySlug)));
        }
        return arrayList;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.gEmmrt = AbstractC47347toN.KWHzl(view);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
        SearchResultIntentFragment searchResultIntentFragmentOLrzqt = SearchResultIntentFragment.Companion.OLrzqt();
        fragmentTransactionBeginTransaction.add(C47315tni.TaskDescription.finit, searchResultIntentFragmentOLrzqt, searchResultIntentFragmentOLrzqt.getTAG());
        C45167skg c45167skgNewInstance$default = C45167skg.StateListAnimator.newInstance$default(C45167skg.Companion, 0, false, 3, null);
        c45167skgNewInstance$default.OLrzqt(AYXKKw());
        fragmentTransactionBeginTransaction.add(C47315tni.TaskDescription.dxcTrN, c45167skgNewInstance$default, c45167skgNewInstance$default.getTAG());
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        childFragmentManager.setFragmentResultListener("KEY_PAGE_CHANGED", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.sAd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle2) {
                C45857szW.EZpvd(this.KWHzl, str, bundle2);
            }
        });
        AhwBna();
    }

    public static final void EZpvd(C45857szW c45857szW, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        if (!c45857szW.isConnected) {
            AbstractC47347toN abstractC47347toN = c45857szW.gEmmrt;
            if (abstractC47347toN == null) {
                Intrinsics.gEmmrt("");
                abstractC47347toN = null;
            }
            android.view.View root = abstractC47347toN.getRoot();
            C33570myu.AEQbTJ(root.getContext(), root);
            int i = bundle.getInt("KEY_PAGE_CHANGED", -1);
            int i2 = bundle.getInt("KEY_SCROLL_STATE", -1);
            C44760scx.log$default("SupportCenterSearchActivity_PAGE_CHANGED: position=" + i + ", state=" + i2, null, 2, null);
            c45857szW.djBIcL().copydefault(i);
            c45857szW.djBIcL().AkhnZx();
            if (i2 == 0) {
                c45857szW.djBIcL().DbNXlk();
                return;
            }
            return;
        }
        c45857szW.isConnected = false;
    }

    private final void AhwBna() {
        int iIndexOf;
        SearchResultArticlesViewModel searchResultArticlesViewModelDjBIcL = djBIcL();
        searchResultArticlesViewModelDjBIcL.AEQbTJ(gEmmrt().djBIcL());
        CategorySlug categorySlug = CategorySlug.Announcement;
        searchResultArticlesViewModelDjBIcL.EZpvd(categorySlug);
        java.lang.String strAEQbTJ = gEmmrt().AEQbTJ();
        CategorySlug categorySlug2 = CategorySlug.ProductDoc;
        if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) categorySlug2.getValue()) || Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) SelfServiceScenario.PRODUCT_DOCUMENT.getValue())) {
            iIndexOf = djBIcL().copydefault().indexOf(categorySlug2);
        } else if (Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) categorySlug.getValue()) || Intrinsics.EZpvd((java.lang.Object) strAEQbTJ, (java.lang.Object) "announcements_list")) {
            iIndexOf = djBIcL().copydefault().indexOf(categorySlug);
        } else {
            iIndexOf = djBIcL().copydefault().indexOf(CategorySlug.FAQ);
        }
        searchResultArticlesViewModelDjBIcL.copydefault(iIndexOf);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchResultComboFragment$initViewModel$2(this, null), 3, null);
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        java.util.List<androidx.fragment.app.Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : fragments) {
            if (obj instanceof C45167skg) {
                arrayList.add(obj);
            }
        }
        C45167skg c45167skg = (C45167skg) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (c45167skg != null) {
            C45167skg.setSelectedTab$default(c45167skg, djBIcL().AhwBna(), false, 2, null);
        }
    }
}

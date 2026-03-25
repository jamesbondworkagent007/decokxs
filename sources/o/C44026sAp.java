package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.event.SupportCenterEvent;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.ui.SearchResultListFragment$initViewModel$1;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import com.okinc.okex.search.ui.displaymodels.SearchSectionDisplayModel;
import com.okinc.okex.search.viewmodel.SearchResultArticlesViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.ActivityC45850szP;
import o.C44047sBj;
import o.C45426spa;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sAp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44026sAp extends AbstractC45849szO implements C44047sBj.ActionBar {
    public static final Application Companion = new Application(null);
    public static final int gEmmrt = 8;
    public final InterfaceC56387yDm AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public AbstractC47356toW AkhnZx;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final int valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.valueOf;
    }

    public C44026sAp() {
        final Function0 function0 = new Function0() { // from class: o.sAv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44026sAp.AhwBna(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.okex.search.ui.SearchResultListFragment$special$$inlined$viewModels$default$1
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
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchResultArticlesViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.okex.search.ui.SearchResultListFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.okex.search.ui.SearchResultListFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.okex.search.ui.SearchResultListFragment$special$$inlined$viewModels$default$4
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
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.sAA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44026sAp.fetchVPNInfo(this.AEQbTJ);
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.sAC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C44026sAp.values(this.EZpvd);
            }
        });
        this.AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.sAG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C44026sAp.valueOf(this.copydefault));
            }
        });
        this.valueOf = C47315tni.ActionBar.UeEOUB;
    }

    public final SearchResultArticlesViewModel AYXKKw() {
        return (SearchResultArticlesViewModel) this.AhwBna.getValue();
    }

    public static final ViewModelStoreOwner AhwBna(C44026sAp c44026sAp) {
        for (androidx.fragment.app.Fragment parentFragment = c44026sAp.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            if (parentFragment instanceof C45857szW) {
                return parentFragment;
            }
        }
        FragmentActivity fragmentActivityRequireActivity = c44026sAp.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    private final java.lang.String djBIcL() {
        return AYXKKw().gEmmrt();
    }

    public final CategorySlug AhwBna() {
        return (CategorySlug) this.djBIcL.getValue();
    }

    public static final CategorySlug fetchVPNInfo(C44026sAp c44026sAp) {
        android.os.Bundle arguments = c44026sAp.getArguments();
        if (arguments != null) {
            CategorySlug categorySlug = CategorySlug.values()[arguments.getInt("ARG_CATEGORY")];
            if (categorySlug != null) {
                return categorySlug;
            }
        }
        return CategorySlug.Unknown;
    }

    public final C44047sBj valueOf() {
        return (C44047sBj) this.fetchVPNInfo.getValue();
    }

    public static final C44047sBj values(C44026sAp c44026sAp) {
        C44047sBj c44047sBj = new C44047sBj(c44026sAp.AhwBna());
        c44047sBj.OLrzqt(c44026sAp);
        return c44047sBj;
    }

    /* JADX DEBUG: Possible override for method o.szO.EZpvd()V */
    public final boolean EZpvd() {
        return ((java.lang.Boolean) this.AYXKKw.getValue()).booleanValue();
    }

    public static final boolean valueOf(C44026sAp c44026sAp) {
        return c44026sAp.getActivity() instanceof ActivityC44038sBa;
    }

    /* JADX INFO: renamed from: o.sAp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.sAp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C44026sAp OLrzqt(@NotNull CategorySlug categorySlug) {
            Intrinsics.checkNotNullParameter(categorySlug, "");
            C44026sAp c44026sAp = new C44026sAp();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("ARG_CATEGORY", categorySlug.ordinal());
            c44026sAp.setArguments(bundle);
            return c44026sAp;
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AbstractC47356toW abstractC47356toWCopydefault = AbstractC47356toW.copydefault(view);
        this.AkhnZx = abstractC47356toWCopydefault;
        if (abstractC47356toWCopydefault == null) {
            Intrinsics.gEmmrt("");
            abstractC47356toWCopydefault = null;
        }
        C33546myW c33546myW = abstractC47356toWCopydefault.OLrzqt;
        c33546myW.setNoMoreDataEffective(true);
        c33546myW.KWHzl(new InterfaceC57900yrD() { // from class: o.sAw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C44026sAp.EZpvd(this.EZpvd, interfaceC57934yrl);
            }
        });
        RecyclerView recyclerView = abstractC47356toWCopydefault.gEmmrt;
        recyclerView.setAdapter(valueOf());
        recyclerView.addOnScrollListener(new StateListAnimator(abstractC47356toWCopydefault));
        final C45426spa c45426spa = abstractC47356toWCopydefault.KWHzl;
        c45426spa.setChipClickListener(new Function1() { // from class: o.sAz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44026sAp.KWHzl(c45426spa, this, (C45426spa.TaskDescription) obj);
            }
        });
        c45426spa.setModeChangeListener(new Function1() { // from class: o.sAy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44026sAp.KWHzl(c45426spa, this, ((java.lang.Boolean) obj).booleanValue());
            }
        });
        abstractC47356toWCopydefault.AYXKKw.setRetryClickListener(new View.OnClickListener() { // from class: o.sAB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C44026sAp.copydefault(this.copydefault, view2);
            }
        });
        values();
    }

    public static final void EZpvd(C44026sAp c44026sAp, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c44026sAp.AYXKKw().values();
    }

    /* JADX INFO: renamed from: o.sAp$StateListAnimator */
    public static final class StateListAnimator extends RecyclerView.OnScrollListener {
        public final /* synthetic */ AbstractC47356toW OLrzqt;
        public int copydefault;

        public StateListAnimator(AbstractC47356toW abstractC47356toW) {
            this.OLrzqt = abstractC47356toW;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrolled(recyclerView, i, i2);
            this.copydefault += i2;
            if (!this.OLrzqt.KWHzl.gEmmrt() || this.copydefault <= 300) {
                return;
            }
            this.OLrzqt.KWHzl.AhwBna();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onScrollStateChanged(recyclerView, i);
            if (i != 0) {
                if (i == 1) {
                    pUU.OLrzqt("addOnScrollListener: Hiding keyboard");
                    C33570myu.AEQbTJ(this.OLrzqt.gEmmrt.getContext(), this.OLrzqt.gEmmrt);
                    return;
                } else if (i != 2) {
                    return;
                }
            }
            this.copydefault = 0;
        }
    }

    public static final Unit KWHzl(C45426spa c45426spa, C44026sAp c44026sAp, final C45426spa.TaskDescription taskDescription) {
        Intrinsics.checkNotNullParameter(taskDescription, "");
        C45363soQ.onSessionIdEvent$default("SupportCenter_Announcements_Filter_Click", false, new Function1() { // from class: o.sAu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44026sAp.OLrzqt(taskDescription, (EventParamsList) obj);
            }
        }, 1, null);
        C33570myu.AEQbTJ(c45426spa.getContext(), c45426spa);
        c44026sAp.AYXKKw().OLrzqt(c44026sAp.AhwBna(), taskDescription);
        if (c45426spa.gEmmrt()) {
            c45426spa.AhwBna();
        }
        c44026sAp.AYXKKw().AkhnZx();
        c44026sAp.AYXKKw().DbNXlk();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C45426spa.TaskDescription taskDescription, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.Object objEZpvd = taskDescription.EZpvd();
        SearchSectionDisplayModel searchSectionDisplayModel = objEZpvd instanceof SearchSectionDisplayModel ? (SearchSectionDisplayModel) objEZpvd : null;
        java.lang.String slug = searchSectionDisplayModel != null ? searchSectionDisplayModel.getSlug() : null;
        EventParamsList.put$default(eventParamsList, "filter", slug == null ? "" : slug, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(final C45426spa c45426spa, final C44026sAp c44026sAp, boolean z) {
        if (!z) {
            c45426spa.postDelayed(new java.lang.Runnable() { // from class: o.sAH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C44026sAp.KWHzl(this.copydefault, c45426spa);
                }
            }, 100L);
        }
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C44026sAp c44026sAp, C45426spa c45426spa) {
        java.util.Iterator<C45426spa.TaskDescription> it = c44026sAp.AYXKKw().OLrzqt(c44026sAp.AhwBna()).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().OLrzqt()) {
                break;
            } else {
                i++;
            }
        }
        c45426spa.AEQbTJ(i);
    }

    public static final void copydefault(C44026sAp c44026sAp, android.view.View view) {
        c44026sAp.AYXKKw().DbNXlk();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AYXKKw().EZpvd(AhwBna());
    }

    private final void values() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchResultListFragment$initViewModel$1(this, null), 3, null);
    }

    @Override // o.C44047sBj.ActionBar
    public void KWHzl(@NotNull SearchArticleDisplayModel searchArticleDisplayModel, int i) {
        Intrinsics.checkNotNullParameter(searchArticleDisplayModel, "");
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) searchArticleDisplayModel.getUrl())) {
            ActivityC45850szP.ActionBar actionBar = ActivityC45850szP.Companion;
            AbstractC47356toW abstractC47356toW = this.AkhnZx;
            if (abstractC47356toW == null) {
                Intrinsics.gEmmrt("");
                abstractC47356toW = null;
            }
            android.content.Context context = abstractC47356toW.gEmmrt.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            ActivityC45850szP.ActionBar.openPage$default(actionBar, context, BundleKt.bundleOf(C56390yDp.OLrzqt("url", searchArticleDisplayModel.getUrl())), null, 4, null);
            AYXKKw().OLrzqt(searchArticleDisplayModel);
            OLrzqt(searchArticleDisplayModel, i);
        }
    }

    public static /* synthetic */ void showContent$default(C44026sAp c44026sAp, java.lang.String str, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        c44026sAp.AEQbTJ(str, (java.util.List<SearchArticleDisplayModel>) list, z);
    }

    public final void AEQbTJ(java.lang.String str, java.util.List<SearchArticleDisplayModel> list, boolean z) {
        AbstractC47356toW abstractC47356toW = this.AkhnZx;
        if (abstractC47356toW == null) {
            Intrinsics.gEmmrt("");
            abstractC47356toW = null;
        }
        C55173xeu c55173xeu = abstractC47356toW.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        C55173xeu c55173xeu2 = abstractC47356toW.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
        c55173xeu2.setVisibility(8);
        C33546myW c33546myW = abstractC47356toW.OLrzqt;
        Intrinsics.copydefault(c33546myW);
        c33546myW.setVisibility(0);
        c33546myW.copydefault();
        if (z) {
            c33546myW.AYXKKw();
        } else {
            c33546myW.valueOf();
        }
        C45426spa c45426spa = abstractC47356toW.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c45426spa, "");
        c45426spa.setVisibility(AYXKKw().OLrzqt(AhwBna()).isEmpty() ^ true ? 0 : 8);
        valueOf().copydefault(str);
        C44047sBj c44047sBjValueOf = valueOf();
        RecyclerView recyclerView = abstractC47356toW.gEmmrt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        c44047sBjValueOf.copydefault(recyclerView, (java.util.List) list);
        copydefault(str);
    }

    public final void EZpvd(java.lang.String str) {
        AbstractC47356toW abstractC47356toW = this.AkhnZx;
        if (abstractC47356toW == null) {
            Intrinsics.gEmmrt("");
            abstractC47356toW = null;
        }
        C55173xeu c55173xeu = abstractC47356toW.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(0);
        C55173xeu c55173xeu2 = abstractC47356toW.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
        c55173xeu2.setVisibility(8);
        C33546myW c33546myW = abstractC47356toW.OLrzqt;
        Intrinsics.copydefault(c33546myW);
        c33546myW.setVisibility(8);
        c33546myW.valueOf();
        C45426spa c45426spa = abstractC47356toW.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c45426spa, "");
        c45426spa.setVisibility(AYXKKw().OLrzqt(AhwBna()).isEmpty() ^ true ? 0 : 8);
        OLrzqt(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AEQbTJ(java.lang.String str) {
        AbstractC47356toW abstractC47356toW = this.AkhnZx;
        if (abstractC47356toW == null) {
            Intrinsics.gEmmrt("");
            abstractC47356toW = null;
        }
        C55173xeu c55173xeu = abstractC47356toW.valueOf;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(8);
        C55173xeu c55173xeu2 = abstractC47356toW.AYXKKw;
        Intrinsics.copydefault(c55173xeu2);
        c55173xeu2.setVisibility(0);
        if (str == null) {
            str = "";
        }
        c55173xeu2.setSubTitle((java.lang.CharSequence) str);
        C33546myW c33546myW = abstractC47356toW.OLrzqt;
        Intrinsics.copydefault(c33546myW);
        c33546myW.setVisibility(8);
        c33546myW.valueOf();
        C45426spa c45426spa = abstractC47356toW.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c45426spa, "");
        c45426spa.setVisibility(8);
    }

    public final void gEmmrt() {
        AbstractC47356toW abstractC47356toW = this.AkhnZx;
        if (abstractC47356toW == null) {
            Intrinsics.gEmmrt("");
            abstractC47356toW = null;
        }
        abstractC47356toW.OLrzqt.AYXKKw();
    }

    public final void copydefault(final java.lang.String str) {
        if (EZpvd()) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Top_SearchBar_Input", false, new Function1() { // from class: o.sAt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44026sAp.KWHzl(str, this, (EventParamsList) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit KWHzl(java.lang.String str, C44026sAp c44026sAp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "query", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", "success", false, 4, null);
        eventParamsList.put("page", c44026sAp.djBIcL(), true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final java.lang.String str) {
        if (EZpvd()) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Top_SearchBar_Input", false, new Function1() { // from class: o.sAF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44026sAp.EZpvd(str, this, (EventParamsList) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit EZpvd(java.lang.String str, C44026sAp c44026sAp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "query", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", "fail", false, 4, null);
        eventParamsList.put("page", c44026sAp.djBIcL(), true);
        return Unit.INSTANCE;
    }

    public final void OLrzqt(final SearchArticleDisplayModel searchArticleDisplayModel, final int i) {
        if (EZpvd()) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Top_SearchButton_Click", false, new Function1() { // from class: o.sAD
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44026sAp.KWHzl(this.EZpvd, (EventParamsList) obj);
                }
            }, 1, null);
            C45363soQ.onSessionIdEvent$default("SupportCenter_SearchResult_Article_Click", false, new Function1() { // from class: o.sAE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44026sAp.EZpvd(searchArticleDisplayModel, (EventParamsList) obj);
                }
            }, 1, null);
            C45363soQ.onSessionIdEvent$default("SupportCenter_Mid_Article_Click", false, new Function1() { // from class: o.sAJ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44026sAp.AEQbTJ(searchArticleDisplayModel, i, (EventParamsList) obj);
                }
            }, 1, null);
        }
        if (searchArticleDisplayModel.getCategorySlug() == CategorySlug.Announcement) {
            C45363soQ.onSessionIdEvent$default("SupportCenter_Announcements_Article_Click", false, new Function1() { // from class: o.sAx
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44026sAp.OLrzqt(searchArticleDisplayModel, (EventParamsList) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit KWHzl(C44026sAp c44026sAp, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "query", c44026sAp.AYXKKw().EZpvd(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "result", "success", false, 4, null);
        eventParamsList.put("page", c44026sAp.djBIcL(), true);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(SearchArticleDisplayModel searchArticleDisplayModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "category", searchArticleDisplayModel.getCategorySlug().getValue(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "article", searchArticleDisplayModel.getSlug(), false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(SearchArticleDisplayModel searchArticleDisplayModel, int i, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("page", SupportCenterEvent.ArticlePageParam.Search.getValue(), true);
        eventParamsList.put("feature", "search", true);
        EventParamsList.put$default(eventParamsList, "article_title", searchArticleDisplayModel.getTitle(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "article_slug", searchArticleDisplayModel.getSlug(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "position", java.lang.String.valueOf(i + 1), false, 4, null);
        EventParamsList.put$default(eventParamsList, "article_tag", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_topic_name", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_transaction_type", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "page_transaction_status", "", false, 4, null);
        EventParamsList.put$default(eventParamsList, "recommendation_type", "", false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(SearchArticleDisplayModel searchArticleDisplayModel, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "article_slug", searchArticleDisplayModel.getSlug(), false, 4, null);
        EventParamsList.put$default(eventParamsList, "article_section", searchArticleDisplayModel.getSectionSlug(), false, 4, null);
        return Unit.INSTANCE;
    }
}

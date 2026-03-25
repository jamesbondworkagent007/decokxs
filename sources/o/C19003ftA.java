package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.home.navigation.WalletNavigator;
import com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.DeFiAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.NFTAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchHistoryItem;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenAssetHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.TokenSearchHistory;
import com.okinc.business.defi.wallet.mine.search.data.model.WebsiteSearchHistory;
import com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$observeHotTokensAndDApps$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$observeSearchHistoryFlow$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$setupDataLoadTrigger$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$setupSearchHistory$1$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.SearchMainFragment$updateHotContentTabs$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.HistoryFilterType;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.SearchMainViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.dZM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ftA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19003ftA extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int copydefault = 8;
    public C19128fvT AEQbTJ;
    public boolean AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public java.lang.String EZpvd;
    public C16686eoc KWHzl;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.ftF
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19003ftA.EZpvd();
        }
    });
    public final InterfaceC56387yDm djBIcL;
    public java.lang.String gEmmrt;
    public TabLayoutMediator valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.aGOrKO;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    /* JADX INFO: renamed from: o.ftA$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
            this.copydefault = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.copydefault.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C19095fun) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.copydefault.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.ftA$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.AEQbTJ.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((androidx.fragment.app.Fragment) next) instanceof C19095fun) {
                    break;
                }
            }
            androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) next;
            if (fragment != null) {
                return fragment;
            }
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(SearchMainViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.AEQbTJ.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    public C19003ftA() {
        TaskDescription taskDescription = new TaskDescription(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(taskDescription));
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchMainViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new ActionBar(this)));
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
    }

    /* JADX INFO: renamed from: o.ftA$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ftA.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C19003ftA newInstance$default(Application application, boolean z, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return application.AEQbTJ(z, str, str2);
        }

        public final C19003ftA AEQbTJ(boolean z, java.lang.String str, java.lang.String str2) {
            C19003ftA c19003ftA = new C19003ftA();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("arg_show_banner", z);
            if (str != null) {
                bundle.putString("arg_source", str);
            }
            if (str2 != null) {
                bundle.putString("search_bar_transition_name", str2);
            }
            c19003ftA.setArguments(bundle);
            return c19003ftA;
        }
    }

    public static final C19131fvW EZpvd() {
        return new C19131fvW();
    }

    public final C19131fvW OLrzqt() {
        return (C19131fvW) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchMainViewModel AkhnZx() {
        return (SearchMainViewModel) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletSearchHistoryViewModel isConnected() {
        return (WalletSearchHistoryViewModel) this.djBIcL.getValue();
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        isConnected().AEQbTJ(HistoryFilterType.ALL);
        isConnected().copydefault(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            this.AYXKKw = arguments.getBoolean("arg_show_banner", false);
            this.gEmmrt = arguments.getString("arg_source");
            this.EZpvd = arguments.getString("search_bar_transition_name");
        }
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = C16686eoc.EZpvd(view);
        DbNXlk();
        valueOf();
        fetchVPNInfo();
        gEmmrt();
        AYXKKw();
        AhwBna();
    }

    private final void fetchVPNInfo() {
        java.lang.String str = this.EZpvd;
        boolean z = !(str == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SearchMainFragment$setupDataLoadTrigger$1(this, null), 3, null);
        AkhnZx().EZpvd(z);
        pUU.EZpvd(getTAG(), "Data load trigger setup complete (hasTransition=" + z + ")");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void values() {
        pUU.EZpvd(getTAG(), "loadData() called");
        djBIcL();
        AkhnZx().OLrzqt();
        WalletSearchHistoryViewModel.loadHistory$default(isConnected(), false, 1, null);
    }

    /* JADX INFO: renamed from: o.ftA$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C19003ftA EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C19003ftA c19003ftA) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.EZpvd = c19003ftA;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FragmentActivity activity = this.EZpvd.getActivity();
                if (activity == null) {
                    return;
                }
                C33570myu.copydefault((android.app.Activity) activity);
                InterfaceC18922frZ interfaceC18922frZCopydefault = C18976fsa.copydefault(this.EZpvd);
                if (interfaceC18922frZCopydefault != null) {
                    WalletNavigator.Activity.push$default(interfaceC18922frZCopydefault, C19080fuY.Companion.KWHzl(), "tag_history", null, 4, null);
                }
            }
        }
    }

    public final void AYXKKw() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchMainFragment$observeSearchHistoryFlow$1(this, null), 3, null);
    }

    public final void AhwBna() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.ftC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19003ftA.copydefault(this.KWHzl, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.ftD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19003ftA.copydefault(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.ftB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19003ftA.AEQbTJ(this.EZpvd, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.ftH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19003ftA.AEQbTJ(function12, obj);
            }
        });
    }

    public static final void copydefault(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C19003ftA c19003ftA, xXO xxo) {
        c19003ftA.copydefault();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit AEQbTJ(C19003ftA c19003ftA, java.lang.Throwable th) {
        pUU.AEQbTJ(c19003ftA.getTAG(), "Exception while listening to wallet main event", th);
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        pUU.EZpvd(getTAG(), "Wallet changed, resetting and reloading");
        AkhnZx().copydefault();
        AkhnZx().EZpvd(false);
    }

    public final void djBIcL() {
        FragmentContainerView fragmentContainerView;
        C16686eoc c16686eoc = this.KWHzl;
        if (c16686eoc != null && (fragmentContainerView = c16686eoc.DbNXlk) != null) {
            fragmentContainerView.setVisibility(this.AYXKKw ? 0 : 8);
        }
        if (this.AYXKKw) {
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = childFragmentManager.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction.replace(C13754dXa.ActionBar.getHideOffset, C18929frg.class, null, "fragment_banner"), "");
            fragmentTransactionBeginTransaction.commit();
        }
    }

    public final void gEmmrt() {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchMainFragment$observeHotTokensAndDApps$1(this, null), 3, null);
    }

    public final void AEQbTJ() {
        ViewPager2 viewPager2;
        C55254xgV c55254xgV;
        ConstraintLayout constraintLayout;
        C16686eoc c16686eoc = this.KWHzl;
        if (c16686eoc != null && (constraintLayout = c16686eoc.djBIcL) != null) {
            constraintLayout.setVisibility(8);
        }
        C16686eoc c16686eoc2 = this.KWHzl;
        if (c16686eoc2 != null && (c55254xgV = c16686eoc2.OLrzqt) != null) {
            c55254xgV.setVisibility(8);
        }
        C16686eoc c16686eoc3 = this.KWHzl;
        if (c16686eoc3 == null || (viewPager2 = c16686eoc3.KWHzl) == null) {
            return;
        }
        viewPager2.setVisibility(8);
    }

    public final void valueOf() {
        ViewPager2 viewPager2;
        C16686eoc c16686eoc = this.KWHzl;
        if (c16686eoc == null || (viewPager2 = c16686eoc.KWHzl) == null) {
            return;
        }
        C19128fvT c19128fvT = new C19128fvT(this, this.gEmmrt);
        this.AEQbTJ = c19128fvT;
        viewPager2.setAdapter(c19128fvT);
    }

    public final void OLrzqt(boolean z, boolean z2) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SearchMainFragment$updateHotContentTabs$1(z2, z, this, null), 3, null);
        android.view.View view = getView();
        if (view != null) {
            view.post(new java.lang.Runnable() { // from class: o.ftK
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C19003ftA.AYXKKw(this.EZpvd);
                }
            });
        }
    }

    public static final void AYXKKw(C19003ftA c19003ftA) {
        AppBarLayout appBarLayout;
        C16686eoc c16686eoc = c19003ftA.KWHzl;
        if (c16686eoc == null || (appBarLayout = c16686eoc.copydefault) == null) {
            return;
        }
        appBarLayout.requestLayout();
    }

    public final void DbNXlk() {
        AppCompatTextView appCompatTextView;
        RecyclerView recyclerView;
        OLrzqt().register(C18989fsn.class, new C19181fwT(new Function1() { // from class: o.ftE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19003ftA.KWHzl(this.copydefault, (C18989fsn) obj);
            }
        }));
        OLrzqt().register(C18951fsB.class, new C19236fxV());
        C16686eoc c16686eoc = this.KWHzl;
        if (c16686eoc != null && (recyclerView = c16686eoc.AhwBna) != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(8.0f, null, 1, null), C55298xhM.dp2px$default(24.0f, null, 1, null)));
            recyclerView.setAdapter(OLrzqt());
        }
        C16686eoc c16686eoc2 = this.KWHzl;
        if (c16686eoc2 == null || (appCompatTextView = c16686eoc2.isConnected) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new Activity(appCompatTextView, 1000L, this));
    }

    public static final Unit KWHzl(C19003ftA c19003ftA, C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        LifecycleOwner viewLifecycleOwner = c19003ftA.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SearchMainFragment$setupSearchHistory$1$1(c19003ftA, c18989fsn, null), 3, null);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        TabLayoutMediator tabLayoutMediator = this.valueOf;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.valueOf = null;
        this.KWHzl = null;
    }

    public final SearchHistoryItem copydefault(SearchHistoryItem searchHistoryItem) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (searchHistoryItem instanceof TokenSearchHistory) {
            TokenSearchHistory tokenSearchHistory = (TokenSearchHistory) searchHistoryItem;
            return tokenSearchHistory.KWHzl((127 & 1) != 0 ? tokenSearchHistory.symbol : null, (127 & 2) != 0 ? tokenSearchHistory.tokenName : null, (127 & 4) != 0 ? tokenSearchHistory.chainId : 0L, (127 & 8) != 0 ? tokenSearchHistory.contractAddress : null, (127 & 16) != 0 ? tokenSearchHistory.tokenLogoUrl : null, (127 & 32) != 0 ? tokenSearchHistory.chainLogoUrl : null, (127 & 64) != 0 ? tokenSearchHistory.searchedByContract : false, (127 & 128) != 0 ? tokenSearchHistory.timestamp : jCurrentTimeMillis);
        }
        if (searchHistoryItem instanceof TokenAssetHistory) {
            TokenAssetHistory tokenAssetHistory = (TokenAssetHistory) searchHistoryItem;
            return tokenAssetHistory.OLrzqt((127 & 1) != 0 ? tokenAssetHistory.metaId : null, (127 & 2) != 0 ? tokenAssetHistory.symbol : null, (127 & 4) != 0 ? tokenAssetHistory.walletId : null, (127 & 8) != 0 ? tokenAssetHistory.generalChainId : 0L, (127 & 16) != 0 ? tokenAssetHistory.displayName : null, (127 & 32) != 0 ? tokenAssetHistory.iconUrl : null, (127 & 64) != 0 ? tokenAssetHistory.chainLogoUrl : null, (127 & 128) != 0 ? tokenAssetHistory.timestamp : jCurrentTimeMillis);
        }
        if (searchHistoryItem instanceof AddressSearchHistory) {
            return AddressSearchHistory.copy$default((AddressSearchHistory) searchHistoryItem, null, null, false, jCurrentTimeMillis, 7, null);
        }
        if (searchHistoryItem instanceof DAppSearchHistory) {
            DAppSearchHistory dAppSearchHistory = (DAppSearchHistory) searchHistoryItem;
            return dAppSearchHistory.copydefault((15 & 1) != 0 ? dAppSearchHistory.dappId : 0L, (15 & 2) != 0 ? dAppSearchHistory.name : null, (15 & 4) != 0 ? dAppSearchHistory.url : null, (15 & 8) != 0 ? dAppSearchHistory.iconUrl : null, (15 & 16) != 0 ? dAppSearchHistory.timestamp : jCurrentTimeMillis);
        }
        if (searchHistoryItem instanceof WebsiteSearchHistory) {
            return WebsiteSearchHistory.copy$default((WebsiteSearchHistory) searchHistoryItem, null, null, jCurrentTimeMillis, 3, null);
        }
        if (searchHistoryItem instanceof NFTAssetHistory) {
            NFTAssetHistory nFTAssetHistory = (NFTAssetHistory) searchHistoryItem;
            return nFTAssetHistory.copydefault((127 & 1) != 0 ? nFTAssetHistory.project : null, (127 & 2) != 0 ? nFTAssetHistory.platform : null, (127 & 4) != 0 ? nFTAssetHistory.metaId : null, (127 & 8) != 0 ? nFTAssetHistory.walletId : null, (127 & 16) != 0 ? nFTAssetHistory.generalChainId : 0L, (127 & 32) != 0 ? nFTAssetHistory.displayName : null, (127 & 64) != 0 ? nFTAssetHistory.iconUrl : null, (127 & 128) != 0 ? nFTAssetHistory.timestamp : jCurrentTimeMillis);
        }
        if (!(searchHistoryItem instanceof DeFiAssetHistory)) {
            throw new NoWhenBranchMatchedException();
        }
        DeFiAssetHistory deFiAssetHistory = (DeFiAssetHistory) searchHistoryItem;
        return deFiAssetHistory.copydefault((255 & 1) != 0 ? deFiAssetHistory.platformId : 0L, (255 & 2) != 0 ? deFiAssetHistory.platformName : null, (255 & 4) != 0 ? deFiAssetHistory.metaId : null, (255 & 8) != 0 ? deFiAssetHistory.walletId : null, (255 & 16) != 0 ? deFiAssetHistory.generalChainId : 0L, (255 & 32) != 0 ? deFiAssetHistory.displayName : null, (255 & 64) != 0 ? deFiAssetHistory.iconUrl : null, (255 & 128) != 0 ? deFiAssetHistory.chainLogoUrl : null, (255 & 256) != 0 ? deFiAssetHistory.timestamp : jCurrentTimeMillis);
    }
}

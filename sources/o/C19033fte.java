package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.mine.search.data.model.DAppSearchHistory;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import com.okinc.business.defi.wallet.mine.search.ui.view.DAppSearchResultFragment$addDataListener$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.DAppSearchResultFragment$addDataListener$2;
import com.okinc.business.defi.wallet.mine.search.ui.view.DAppSearchResultFragment$addDataListener$3;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.DAppSearchResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.TokenSearchResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchAllResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C12827cuN;
import o.C13754dXa;
import o.dZM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fte, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19033fte extends AbstractC19048ftt {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final java.util.ArrayList<java.lang.Object> AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public C17183exw copydefault;
    public RecyclerView.OnScrollListener djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public java.lang.String OLrzqt = "";
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.fth
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19033fte.AYXKKw(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.hfFNez;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.fte$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
            this.copydefault = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.copydefault.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fte$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
            this.OLrzqt = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.OLrzqt.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(TokenSearchResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.OLrzqt.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.OLrzqt.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fte$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(androidx.fragment.app.Fragment fragment) {
            this.EZpvd = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final ViewModelStoreOwner invoke() {
            java.lang.Object next;
            java.util.Iterator it = C59405zgS.EZpvd(this.EZpvd.getParentFragment(), (Function1<? super androidx.fragment.app.Fragment, ? extends androidx.fragment.app.Fragment>) ((Function1<? super java.lang.Object, ? extends java.lang.Object>) dZM.Activity.Application.EZpvd)).iterator();
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(DAppSearchResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.EZpvd.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fte$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.copydefault = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
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

    public C19033fte() {
        StateListAnimator stateListAnimator = new StateListAnimator(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(stateListAnimator));
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DAppSearchResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new Activity(this)));
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TokenSearchResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new ActionBar(this)));
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
        InterfaceC56387yDm interfaceC56387yDmEZpvd4 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new TaskDescription(this)));
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd4), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd4), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd4));
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.ftk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C19033fte.OLrzqt();
            }
        });
        this.AEQbTJ = new java.util.ArrayList<>();
    }

    /* JADX INFO: renamed from: o.fte$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fte.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19033fte OLrzqt(android.os.Bundle bundle) {
            C19033fte c19033fte = new C19033fte();
            c19033fte.setArguments(bundle);
            return c19033fte;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean DbNXlk() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_title");
        }
        return false;
    }

    private final java.lang.String values() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String AYXKKw(C19033fte c19033fte) {
        android.os.Bundle arguments = c19033fte.getArguments();
        if (arguments != null) {
            return arguments.getString("arg_source");
        }
        return null;
    }

    public final DAppSearchResultViewModel AEQbTJ() {
        return (DAppSearchResultViewModel) this.KWHzl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenSearchResultViewModel AkhnZx() {
        return (TokenSearchResultViewModel) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletSearchAllResultViewModel isConnected() {
        return (WalletSearchAllResultViewModel) this.fetchVPNInfo.getValue();
    }

    private final WalletSearchHistoryViewModel AhwBna() {
        return (WalletSearchHistoryViewModel) this.gEmmrt.getValue();
    }

    public static final C19121fvM OLrzqt() {
        return new C19121fvM();
    }

    public final C19121fvM KWHzl() {
        return (C19121fvM) this.valueOf.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.copydefault = C17183exw.copydefault(view);
        fetchVPNInfo();
        gEmmrt();
    }

    private final void fetchVPNInfo() {
        final C17183exw c17183exw = this.copydefault;
        if (c17183exw != null) {
            android.widget.TextView textView = c17183exw.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(DbNXlk() ? 0 : 8);
            c17183exw.EZpvd.KWHzl(new InterfaceC57900yrD() { // from class: o.fti
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.InterfaceC57900yrD
                public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                    C19033fte.KWHzl(this.KWHzl, interfaceC57934yrl);
                }
            });
            RecyclerView recyclerView = c17183exw.AEQbTJ;
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            KWHzl().register(C18977fsb.class, new C19204fwq(new Function1() { // from class: o.ftj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19033fte.AEQbTJ(this.OLrzqt, (C18977fsb) obj);
                }
            }));
            KWHzl().register(C18983fsh.class, new C19210fww(new Function1() { // from class: o.ftm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19033fte.EZpvd(this.AEQbTJ, (C18983fsh) obj);
                }
            }));
            KWHzl().register(C18951fsB.class, new C19236fxV());
            c17183exw.AEQbTJ.setAdapter(KWHzl());
            c17183exw.AEQbTJ.postDelayed(new java.lang.Runnable() { // from class: o.ftp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C19033fte.AEQbTJ(this.copydefault, c17183exw);
                }
            }, 500L);
        }
    }

    public static final void KWHzl(C19033fte c19033fte, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c19033fte.AEQbTJ().AEQbTJ(c19033fte.OLrzqt);
    }

    public static final Unit AEQbTJ(C19033fte c19033fte, C18977fsb c18977fsb) {
        Intrinsics.checkNotNullParameter(c18977fsb, "");
        c19033fte.EZpvd(c18977fsb);
        c19033fte.AEQbTJ(c18977fsb);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C19033fte c19033fte, C18983fsh c18983fsh) {
        Intrinsics.checkNotNullParameter(c18983fsh, "");
        c19033fte.EZpvd(c18983fsh);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C19033fte c19033fte, C17183exw c17183exw) {
        RecyclerView recyclerView = c17183exw.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        FragmentActivity activity = c19033fte.getActivity();
        if (activity == null) {
            return;
        }
        c19033fte.djBIcL = C17779fRz.OLrzqt(recyclerView, activity);
    }

    private final void gEmmrt() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new DAppSearchResultFragment$addDataListener$1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new DAppSearchResultFragment$addDataListener$2(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new DAppSearchResultFragment$addDataListener$3(this, null));
    }

    public final void EZpvd(C18977fsb c18977fsb) {
        AhwBna().KWHzl(new DAppSearchHistory(c18977fsb.KWHzl().KWHzl(), c18977fsb.KWHzl().EZpvd(), c18977fsb.KWHzl().AYXKKw(), c18977fsb.KWHzl().copydefault(), 0L, 16, (DefaultConstructorMarker) null));
    }

    public final void AEQbTJ(C18977fsb c18977fsb) {
        InterfaceC18922frZ interfaceC18922frZCopydefault;
        EZpvd(c18977fsb);
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null || (interfaceC18922frZCopydefault = C18976fsa.copydefault(this)) == null) {
            return;
        }
        searchItemNavigationHandler.copydefault(activity, interfaceC18922frZCopydefault, c18977fsb.KWHzl().AYXKKw(), C33129mqd.gEmmrt(java.lang.Long.valueOf(c18977fsb.KWHzl().KWHzl())), c18977fsb.KWHzl().EZpvd(), c18977fsb.KWHzl().copydefault());
        OLrzqt(c18977fsb.KWHzl().AYXKKw());
    }

    public final void EZpvd(C18983fsh c18983fsh) {
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        java.lang.String strEZpvd = c18983fsh.EZpvd();
        InterfaceC18922frZ interfaceC18922frZCopydefault = C18976fsa.copydefault(this);
        if (interfaceC18922frZCopydefault == null) {
            return;
        }
        searchItemNavigationHandler.AEQbTJ(activity, strEZpvd, interfaceC18922frZCopydefault);
        copydefault(c18983fsh.EZpvd());
    }

    public final void OLrzqt(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_Click", (TrackChannel[]) null, new Function1() { // from class: o.ftl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19033fte.EZpvd(this.KWHzl, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit EZpvd(C19033fte c19033fte, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c19033fte.OLrzqt, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_DAppUrl", str, false, 4, null);
        java.lang.String strValues = c19033fte.values();
        eventParamsList.put("source_id", strValues != null ? strValues : "", true);
        return Unit.INSTANCE;
    }

    public final void copydefault(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_Click", (TrackChannel[]) null, new Function1() { // from class: o.ftn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19033fte.OLrzqt(this.OLrzqt, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(C19033fte c19033fte, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c19033fte.OLrzqt, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_ExtraInfo", str, false, 4, null);
        java.lang.String strValues = c19033fte.values();
        eventParamsList.put("source_id", strValues != null ? strValues : "", true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C17183exw c17183exw;
        RecyclerView recyclerView;
        super.onDestroyView();
        RecyclerView.OnScrollListener onScrollListener = this.djBIcL;
        if (onScrollListener != null && (c17183exw = this.copydefault) != null && (recyclerView = c17183exw.AEQbTJ) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.djBIcL = null;
        this.copydefault = null;
    }
}

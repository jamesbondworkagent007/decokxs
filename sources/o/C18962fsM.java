package o;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.mine.search.data.model.AddressSearchHistory;
import com.okinc.business.defi.wallet.mine.search.ui.navigation.SearchItemNavigationHandler;
import com.okinc.business.defi.wallet.mine.search.ui.view.AddressSearchResultFragment$addDataListener$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.AddressSearchResultFragment$addDataListener$2;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.TokenSearchResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchAllResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import com.okinc.business.defi.wallet.mine.walletmanage.walletmanageradapter.SafeLinearLayoutManager;
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

/* JADX INFO: renamed from: o.fsM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18962fsM extends AbstractC19046ftr {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AhwBna;
    public C17182exv EZpvd;
    public RecyclerView.OnScrollListener KWHzl;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm valueOf;
    public java.lang.String AEQbTJ = "";
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.fsK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18962fsM.EZpvd(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.fsN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C18962fsM.EZpvd();
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.isInitInProgress;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    /* JADX INFO: renamed from: o.fsM$ActionBar */
    public static final class ActionBar implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(androidx.fragment.app.Fragment fragment) {
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

    /* JADX INFO: renamed from: o.fsM$Activity */
    public static final class Activity implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(androidx.fragment.app.Fragment fragment) {
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.EZpvd.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fsM$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.copydefault.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    public C18962fsM() {
        ActionBar actionBar = new ActionBar(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(actionBar));
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TokenSearchResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new TaskDescription(this)));
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new Activity(this)));
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
    }

    /* JADX INFO: renamed from: o.fsM$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fsM.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C18962fsM KWHzl(android.os.Bundle bundle) {
            C18962fsM c18962fsM = new C18962fsM();
            c18962fsM.setArguments(bundle);
            return c18962fsM;
        }
    }

    private final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.AYXKKw.getValue();
    }

    public static final java.lang.String EZpvd(C18962fsM c18962fsM) {
        android.os.Bundle arguments = c18962fsM.getArguments();
        if (arguments != null) {
            return arguments.getString("arg_source");
        }
        return null;
    }

    public final C19188fwa<java.lang.Object> AEQbTJ() {
        return (C19188fwa) this.copydefault.getValue();
    }

    public static final C19188fwa EZpvd() {
        return new C19188fwa(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.fsM$StateListAnimator */
    public static final class StateListAnimator extends DiffUtil.ItemCallback<java.lang.Object> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof C18997fsv) && (obj2 instanceof C18997fsv)) {
                return Intrinsics.EZpvd((java.lang.Object) ((C18997fsv) obj).KWHzl(), (java.lang.Object) ((C18997fsv) obj2).KWHzl());
            }
            return (obj instanceof C18951fsB) && (obj2 instanceof C18951fsB);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof C18997fsv) && (obj2 instanceof C18997fsv)) {
                return Intrinsics.EZpvd(obj, obj2);
            }
            if ((obj instanceof C18951fsB) && (obj2 instanceof C18951fsB)) {
                return Intrinsics.EZpvd(obj, obj2);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TokenSearchResultViewModel DbNXlk() {
        return (TokenSearchResultViewModel) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletSearchAllResultViewModel AkhnZx() {
        return (WalletSearchAllResultViewModel) this.valueOf.getValue();
    }

    private final WalletSearchHistoryViewModel gEmmrt() {
        return (WalletSearchHistoryViewModel) this.AhwBna.getValue();
    }

    private final boolean isConnected() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("show_title");
        }
        return false;
    }

    public final boolean OLrzqt() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("need_space");
        }
        return false;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.EZpvd = C17182exv.EZpvd(view);
        values();
        valueOf();
    }

    private final void values() {
        final C17182exv c17182exv = this.EZpvd;
        if (c17182exv != null) {
            android.view.View view = c17182exv.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility((isConnected() && OLrzqt()) ? 0 : 8);
            android.widget.TextView textView = c17182exv.copydefault;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(isConnected() ? 0 : 8);
            AEQbTJ().register(C18997fsv.class, new C19180fwS(new Function1() { // from class: o.fsO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C18962fsM.KWHzl(this.OLrzqt, (C18997fsv) obj);
                }
            }));
            AEQbTJ().register(C18951fsB.class, new C19236fxV());
            c17182exv.EZpvd.setLayoutManager(new SafeLinearLayoutManager(c17182exv.EZpvd.getContext()));
            c17182exv.EZpvd.setAdapter(AEQbTJ());
            c17182exv.EZpvd.postDelayed(new java.lang.Runnable() { // from class: o.fsQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C18962fsM.AEQbTJ(this.EZpvd, c17182exv);
                }
            }, 500L);
        }
    }

    public static final Unit KWHzl(C18962fsM c18962fsM, C18997fsv c18997fsv) {
        Intrinsics.checkNotNullParameter(c18997fsv, "");
        c18962fsM.OLrzqt(c18997fsv);
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(C18962fsM c18962fsM, C17182exv c17182exv) {
        RecyclerView recyclerView = c17182exv.EZpvd;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        FragmentActivity activity = c18962fsM.getActivity();
        if (activity == null) {
            return;
        }
        c18962fsM.KWHzl = C17779fRz.OLrzqt(recyclerView, activity);
    }

    private final void valueOf() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new AddressSearchResultFragment$addDataListener$1(this, null));
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new AddressSearchResultFragment$addDataListener$2(this, null));
    }

    public final void OLrzqt(C18997fsv c18997fsv) {
        gEmmrt().KWHzl(new AddressSearchHistory(c18997fsv.KWHzl(), c18997fsv.OLrzqt(), C59449zhJ.gEmmrt(c18997fsv.KWHzl(), this.AEQbTJ, true), 0L, 8, (DefaultConstructorMarker) null));
        SearchItemNavigationHandler searchItemNavigationHandler = SearchItemNavigationHandler.EZpvd;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        searchItemNavigationHandler.EZpvd(activity, c18997fsv.KWHzl(), c18997fsv.OLrzqt());
        EZpvd(c18997fsv.KWHzl());
    }

    public final void EZpvd(final java.lang.String str) {
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_Click", (TrackChannel[]) null, new Function1() { // from class: o.fsL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C18962fsM.KWHzl(this.AEQbTJ, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(C18962fsM c18962fsM, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        java.lang.String strDbNXlk = abstractC12782ctV != null ? abstractC12782ctV.DbNXlk() : null;
        EventParamsList.put$default(eventParamsList, "account_id", strDbNXlk == null ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c18962fsM.AEQbTJ, false, 4, null);
        EventParamsList.put$default(eventParamsList, "clicked_Address", str, false, 4, null);
        java.lang.String strFetchVPNInfo = c18962fsM.fetchVPNInfo();
        eventParamsList.put("source_id", strFetchVPNInfo != null ? strFetchVPNInfo : "", true);
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        C17182exv c17182exv;
        RecyclerView recyclerView;
        super.onDestroyView();
        RecyclerView.OnScrollListener onScrollListener = this.KWHzl;
        if (onScrollListener != null && (c17182exv = this.EZpvd) != null && (recyclerView = c17182exv.EZpvd) != null) {
            recyclerView.removeOnScrollListener(onScrollListener);
        }
        this.KWHzl = null;
        this.EZpvd = null;
    }
}

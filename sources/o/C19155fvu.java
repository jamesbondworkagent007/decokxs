package o;

import android.view.View;
import androidx.core.os.BundleKt;
import androidx.core.widget.TextViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.mine.search.data.model.SearchAddressModel;
import com.okinc.business.defi.wallet.mine.search.ui.uimodel.SearchCompletionUiModel;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchResultContainerFragment$initListener$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchResultContainerFragment$initListener$2;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchResultContainerFragment$initListener$3;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchResultContainerFragment$onAsyncViewCreated$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchResultContainerFragment$searchByInputContent$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchSubPage;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.SearchWalletAssetResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.TokenSearchResultViewModel;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchAllResultViewModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.ktx.MatchPattern;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C12827cuN;
import o.C13754dXa;
import o.C52761wXj;
import o.dZM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fvu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19155fvu extends AbstractC19051ftw {
    public static final Activity Companion = new Activity(null);
    public static final int gEmmrt = 8;
    public Function1<? super SearchCompletionUiModel, Unit> AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm isConnected;
    public C16691eoh valueOf;
    public final InterfaceC56387yDm values;
    public java.lang.String AYXKKw = "";
    public java.lang.String djBIcL = "";
    public final InterfaceC56387yDm fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.fvL
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C19155fvu.gEmmrt(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(@NotNull Function1<? super SearchCompletionUiModel, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        this.AhwBna = function1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C13754dXa.TaskDescription.RuDPQV;
    }

    /* JADX INFO: renamed from: o.fvu$Application */
    public static final class Application implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(androidx.fragment.app.Fragment fragment) {
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.AEQbTJ.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fvu$StateListAnimator */
    public static final class StateListAnimator implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(androidx.fragment.app.Fragment fragment) {
            this.copydefault = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(SearchWalletAssetResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.copydefault.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.copydefault.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    /* JADX INFO: renamed from: o.fvu$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
            this.AEQbTJ = fragment;
        }

        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
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
            pUU.copydefault("FragmentUtil", "No parent fragment matching condition found for " + C56524yIo.AEQbTJ(TokenSearchResultViewModel.class).valueOf() + " in " + C56524yIo.AEQbTJ(this.AEQbTJ.getClass()).valueOf() + ". Falling back to Activity scope. This may cause memory leaks if the fragment is added/removed multiple times.");
            FragmentActivity fragmentActivityRequireActivity = this.AEQbTJ.requireActivity();
            Intrinsics.copydefault(fragmentActivityRequireActivity);
            return fragmentActivityRequireActivity;
        }
    }

    public C19155fvu() {
        TaskDescription taskDescription = new TaskDescription(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(taskDescription));
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TokenSearchResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
        InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new StateListAnimator(this)));
        this.values = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SearchWalletAssetResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd2), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd2));
        InterfaceC56387yDm interfaceC56387yDmEZpvd3 = C56392yDr.EZpvd(lazyThreadSafetyMode, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new Application(this)));
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchAllResultViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd3), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd3));
    }

    private final java.lang.String valueOf() {
        return (java.lang.String) this.fetchVPNInfo.getValue();
    }

    public static final java.lang.String gEmmrt(C19155fvu c19155fvu) {
        android.os.Bundle arguments = c19155fvu.getArguments();
        if (arguments != null) {
            return arguments.getString("arg_source");
        }
        return null;
    }

    public final TokenSearchResultViewModel AhwBna() {
        return (TokenSearchResultViewModel) this.isConnected.getValue();
    }

    /* JADX DEBUG: Possible override for method o.ftw.EZpvd()V */
    public final SearchWalletAssetResultViewModel EZpvd() {
        return (SearchWalletAssetResultViewModel) this.values.getValue();
    }

    public final WalletSearchAllResultViewModel djBIcL() {
        return (WalletSearchAllResultViewModel) this.AkhnZx.getValue();
    }

    @Override // o.AbstractC33042mow
    public void AEQbTJ(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.AEQbTJ(view, bundle);
        if (isAdded()) {
            KWHzl(view);
        } else {
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new WalletSearchResultContainerFragment$onAsyncViewCreated$1(this, view, null));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.djBIcL = "";
        gEmmrt();
    }

    public final void KWHzl(@NotNull android.view.View view) {
        C19254fxn c19254fxn;
        Intrinsics.checkNotNullParameter(view, "");
        C16691eoh c16691eohCopydefault = C16691eoh.copydefault(view);
        this.valueOf = c16691eohCopydefault;
        if (c16691eohCopydefault != null && (c19254fxn = c16691eohCopydefault.KWHzl) != null) {
            c19254fxn.setOnItemClick(new Function1() { // from class: o.fvt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19155fvu.KWHzl(this.KWHzl, (SearchCompletionUiModel) obj);
                }
            });
        }
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.fvw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19155fvu.copydefault(this.EZpvd, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fvD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19155fvu.KWHzl(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fvE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19155fvu.OLrzqt((java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fvK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19155fvu.AEQbTJ(function12, obj);
            }
        });
    }

    public static final Unit KWHzl(C19155fvu c19155fvu, SearchCompletionUiModel searchCompletionUiModel) {
        Intrinsics.checkNotNullParameter(searchCompletionUiModel, "");
        c19155fvu.AhwBna().AEQbTJ(false);
        Function1<? super SearchCompletionUiModel, Unit> function1 = c19155fvu.AhwBna;
        if (function1 != null) {
            function1.invoke(searchCompletionUiModel);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KWHzl(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(C19155fvu c19155fvu, xXO xxo) {
        c19155fvu.EZpvd().copydefault(c19155fvu.AYXKKw);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.Throwable th) {
        Intrinsics.copydefault(th);
        pUU.AEQbTJ("Exception while listening to wallet main event", th);
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new WalletSearchResultContainerFragment$initListener$1(this, null));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSearchResultContainerFragment$initListener$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new WalletSearchResultContainerFragment$initListener$3(this, null), 3, null);
    }

    public final boolean OLrzqt(final C18995fst c18995fst) {
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        C16691eoh c16691eoh;
        ViewPager2 viewPager2;
        ViewPager2 viewPager22;
        C19254fxn c19254fxn;
        ViewPager2 viewPager23;
        C55244xgL c55244xgL2;
        C55173xeu c55173xeu;
        ViewPager2 viewPager24;
        C19254fxn c19254fxn2;
        ViewPager2 viewPager25;
        C55244xgL c55244xgL3;
        C55173xeu c55173xeu2;
        C55173xeu c55173xeu3;
        C55173xeu c55173xeu4;
        ViewPager2 viewPager26;
        C55244xgL c55244xgL4;
        C55173xeu c55173xeu5;
        C55173xeu c55173xeu6;
        C55173xeu c55173xeu7;
        C52794wYp c52794wYpAEQbTJ;
        C55173xeu c55173xeu8;
        C55173xeu c55173xeu9;
        C19254fxn c19254fxn3;
        C55113xdn c55113xdn;
        C55113xdn c55113xdn2;
        final java.lang.String str = ",";
        C32866mlf.onEvent$default("Web3WalletHomepage_SearchInputAndResults_Search_View", (TrackChannel[]) null, new Function1() { // from class: o.fvI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19155fvu.KWHzl(this.OLrzqt, c18995fst, str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C16691eoh c16691eoh2 = this.valueOf;
        if (c16691eoh2 != null && (c55113xdn2 = c16691eoh2.AEQbTJ) != null) {
            c55113xdn2.copydefault();
        }
        C16691eoh c16691eoh3 = this.valueOf;
        if (c16691eoh3 != null && (c55113xdn = c16691eoh3.AEQbTJ) != null) {
            c55113xdn.setVisibility(8);
        }
        final java.util.ArrayList arrayList = new java.util.ArrayList(5);
        if (C33129mqd.KWHzl((java.util.Collection) c18995fst.AEQbTJ().AYXKKw())) {
            arrayList.add(WalletSearchSubPage.TOKEN);
        }
        if (C33129mqd.KWHzl((java.util.Collection) c18995fst.AEQbTJ().OLrzqt()) || c18995fst.AEQbTJ().EZpvd().length() > 0) {
            arrayList.add(WalletSearchSubPage.DAPP);
        }
        if (C33129mqd.KWHzl((java.util.Collection) c18995fst.AEQbTJ().KWHzl())) {
            arrayList.add(WalletSearchSubPage.ADDRESS);
        }
        C19000fsy c19000fsyKWHzl = c18995fst.KWHzl();
        boolean z = C33129mqd.KWHzl((java.util.Collection) c18995fst.AEQbTJ().AYXKKw()) || C33129mqd.KWHzl((java.util.Collection) c18995fst.AEQbTJ().OLrzqt()) || c18995fst.AEQbTJ().EZpvd().length() > 0;
        if (C33129mqd.KWHzl((java.util.Collection) c19000fsyKWHzl.AEQbTJ()) || C33129mqd.KWHzl((java.util.Collection) c19000fsyKWHzl.OLrzqt()) || C33129mqd.KWHzl((java.util.Collection) c19000fsyKWHzl.KWHzl()) || C33129mqd.KWHzl((java.util.Collection) c19000fsyKWHzl.copydefault())) {
            arrayList.add(WalletSearchSubPage.WALLET_ASSET);
        }
        if (arrayList.isEmpty()) {
            C32866mlf.onEvent$default("GlobalSearch_EmptySearchResult_Page_View", (TrackChannel[]) null, new Function1() { // from class: o.fvH
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19155fvu.AEQbTJ(this.OLrzqt, c18995fst, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
            C16691eoh c16691eoh4 = this.valueOf;
            if (c16691eoh4 != null && (c19254fxn3 = c16691eoh4.KWHzl) != null) {
                c19254fxn3.setItems(null);
            }
            SearchCompletionUiModel searchCompletionUiModelCopydefault = c18995fst.AEQbTJ().copydefault();
            java.lang.String text = searchCompletionUiModelCopydefault != null ? searchCompletionUiModelCopydefault.getText() : null;
            if (text == null) {
                text = "";
            }
            if (text.length() > 0) {
                java.lang.String strCopydefault = C33069mpW.copydefault(C13754dXa.FragmentManager.UseExperimental, C56424yEw.gEmmrt(C56390yDp.OLrzqt("token1", c18995fst.AEQbTJ().AhwBna()), C56390yDp.OLrzqt("token2", text)));
                C16691eoh c16691eoh5 = this.valueOf;
                if (c16691eoh5 != null && (c55173xeu9 = c16691eoh5.copydefault) != null) {
                    c55173xeu9.setSubTitle(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(strCopydefault, new java.lang.String[]{strCopydefault}, 0, null, false, new Function1() { // from class: o.fvJ
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C19155fvu.copydefault((java.util.List) obj);
                        }
                    }, 14, null), new java.lang.String[]{c18995fst.AEQbTJ().AhwBna()}, 0, null, false, new Function1() { // from class: o.fvP
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C19155fvu.EZpvd((java.util.List) obj);
                        }
                    }, 14, null), new java.lang.String[]{text}, 0, MatchPattern.LAST_ONLY, false, new Function1() { // from class: o.fvs
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return C19155fvu.gEmmrt((java.util.List) obj);
                        }
                    }, 10, null));
                }
                C16691eoh c16691eoh6 = this.valueOf;
                if (c16691eoh6 != null && (c55173xeu8 = c16691eoh6.copydefault) != null) {
                    c55173xeu8.setRetry(text);
                }
                C16691eoh c16691eoh7 = this.valueOf;
                if (c16691eoh7 != null && (c55173xeu7 = c16691eoh7.copydefault) != null && (c52794wYpAEQbTJ = c55173xeu7.AEQbTJ()) != null) {
                    c52794wYpAEQbTJ.setCompoundDrawablePadding(C55298xhM.dp2px$default(8.0f, null, 1, null));
                    TextViewCompat.setCompoundDrawableTintList(c52794wYpAEQbTJ, C33070mpX.AEQbTJ(C52761wXj.Activity.fdOvFl));
                    C19604gIn.KWHzl(c52794wYpAEQbTJ, 16, C52761wXj.TaskDescription.UJpkuA, 0, 0, 0);
                }
                C16691eoh c16691eoh8 = this.valueOf;
                if (c16691eoh8 != null && (c55173xeu6 = c16691eoh8.copydefault) != null) {
                    c55173xeu6.setRetryClickListener(new View.OnClickListener() { // from class: o.fvy
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(android.view.View view) {
                            C19155fvu.KWHzl(this.AEQbTJ, c18995fst, view);
                        }
                    });
                }
            } else {
                C16691eoh c16691eoh9 = this.valueOf;
                if (c16691eoh9 != null && (c55173xeu4 = c16691eoh9.copydefault) != null) {
                    c55173xeu4.setRetry("");
                }
                C16691eoh c16691eoh10 = this.valueOf;
                if (c16691eoh10 != null && (c55173xeu3 = c16691eoh10.copydefault) != null) {
                    c55173xeu3.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C13754dXa.FragmentManager.MediaSessionCompatMediaSessionImplBase));
                }
            }
            C16691eoh c16691eoh11 = this.valueOf;
            if (c16691eoh11 != null && (c55173xeu5 = c16691eoh11.copydefault) != null) {
                c55173xeu5.setVisibility(0);
            }
            C16691eoh c16691eoh12 = this.valueOf;
            if (c16691eoh12 != null && (c55244xgL4 = c16691eoh12.OLrzqt) != null) {
                c55244xgL4.setVisibility(8);
            }
            C16691eoh c16691eoh13 = this.valueOf;
            if (c16691eoh13 != null && (viewPager26 = c16691eoh13.valueOf) != null) {
                viewPager26.setVisibility(8);
            }
        } else if (arrayList.size() == 1) {
            C16691eoh c16691eoh14 = this.valueOf;
            if (c16691eoh14 != null && (c55173xeu2 = c16691eoh14.copydefault) != null) {
                c55173xeu2.setVisibility(8);
            }
            C16691eoh c16691eoh15 = this.valueOf;
            if (c16691eoh15 != null && (c55244xgL3 = c16691eoh15.OLrzqt) != null) {
                c55244xgL3.setVisibility(8);
            }
            C16691eoh c16691eoh16 = this.valueOf;
            if (c16691eoh16 != null && (viewPager25 = c16691eoh16.valueOf) != null) {
                viewPager25.setVisibility(0);
            }
            C16691eoh c16691eoh17 = this.valueOf;
            if (c16691eoh17 != null && (c19254fxn2 = c16691eoh17.KWHzl) != null) {
                c19254fxn2.setItems(z ? c18995fst.AEQbTJ().AEQbTJ() : null);
            }
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("show_title", java.lang.Boolean.TRUE);
            pairArr[1] = C56390yDp.OLrzqt("need_space", java.lang.Boolean.valueOf((C33129mqd.KWHzl((java.util.Collection) c18995fst.AEQbTJ().AEQbTJ()) && z) ? false : true));
            pairArr[2] = C56390yDp.OLrzqt("arg_source", valueOf());
            C19195fwh c19195fwh = new C19195fwh(this, BundleKt.bundleOf(pairArr));
            c19195fwh.EZpvd(arrayList);
            C16691eoh c16691eoh18 = this.valueOf;
            if (c16691eoh18 != null && (viewPager24 = c16691eoh18.valueOf) != null) {
                viewPager24.setAdapter(c19195fwh);
            }
        } else {
            arrayList.add(0, WalletSearchSubPage.ALL);
            C16691eoh c16691eoh19 = this.valueOf;
            if (c16691eoh19 != null && (c55173xeu = c16691eoh19.copydefault) != null) {
                c55173xeu.setVisibility(8);
            }
            C16691eoh c16691eoh20 = this.valueOf;
            if (c16691eoh20 != null && (c55244xgL2 = c16691eoh20.OLrzqt) != null) {
                c55244xgL2.setVisibility(0);
            }
            C16691eoh c16691eoh21 = this.valueOf;
            if (c16691eoh21 != null && (viewPager23 = c16691eoh21.valueOf) != null) {
                viewPager23.setVisibility(0);
            }
            C16691eoh c16691eoh22 = this.valueOf;
            if (c16691eoh22 != null && (c19254fxn = c16691eoh22.KWHzl) != null) {
                c19254fxn.setItems(z ? c18995fst.AEQbTJ().AEQbTJ() : null);
            }
            C19195fwh c19195fwh2 = new C19195fwh(this, BundleKt.bundleOf(C56390yDp.OLrzqt("arg_source", valueOf())));
            c19195fwh2.EZpvd(arrayList);
            C16691eoh c16691eoh23 = this.valueOf;
            if (c16691eoh23 != null && (viewPager22 = c16691eoh23.valueOf) != null) {
                viewPager22.setAdapter(c19195fwh2);
            }
            C16691eoh c16691eoh24 = this.valueOf;
            if (c16691eoh24 == null || (c55244xgL = c16691eoh24.OLrzqt) == null || (tabLayoutAYXKKw = c55244xgL.AYXKKw()) == null || (c16691eoh = this.valueOf) == null || (viewPager2 = c16691eoh.valueOf) == null) {
                return true;
            }
            new TabLayoutMediator(tabLayoutAYXKKw, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.fvz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C19155fvu.copydefault(arrayList, tab, i);
                }
            }).attach();
        }
        djBIcL().AEQbTJ(c18995fst);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return false;
    }

    public static final Unit KWHzl(C19155fvu c19155fvu, C18995fst c18995fst, java.lang.String str, EventParamsList eventParamsList) {
        java.lang.String strDbNXlk;
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String strJoinToString$default = null;
        AbstractC12782ctV abstractC12782ctV = (AbstractC12782ctV) CollectionsKt___CollectionsKt.firstOrNull(C12827cuN.Application.getInstance$default(C12827cuN.Companion, null, 1, null).copydefault());
        EventParamsList.put$default(eventParamsList, "account_id", (abstractC12782ctV == null || (strDbNXlk = abstractC12782ctV.DbNXlk()) == null) ? "" : strDbNXlk, false, 4, null);
        EventParamsList.put$default(eventParamsList, CrashHianalyticsData.TIME, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / ((long) 1000)), false, 4, null);
        EventParamsList.put$default(eventParamsList, "query", c19155fvu.AYXKKw, false, 4, null);
        java.util.List<C18982fsg> listAYXKKw = c18995fst.AEQbTJ().AYXKKw();
        java.lang.String strJoinToString$default2 = listAYXKKw != null ? CollectionsKt___CollectionsKt.joinToString$default(listAYXKKw, str, null, null, 0, null, new Function1() { // from class: o.fvx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19155fvu.OLrzqt((C18982fsg) obj);
            }
        }, 30, null) : null;
        EventParamsList.put$default(eventParamsList, "view_TokenCA", strJoinToString$default2 == null ? "" : strJoinToString$default2, false, 4, null);
        java.util.List<C18982fsg> listAYXKKw2 = c18995fst.AEQbTJ().AYXKKw();
        java.lang.String strJoinToString$default3 = listAYXKKw2 != null ? CollectionsKt___CollectionsKt.joinToString$default(listAYXKKw2, str, null, null, 0, null, new Function1() { // from class: o.fvA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19155fvu.AYXKKw((C18982fsg) obj);
            }
        }, 30, null) : null;
        EventParamsList.put$default(eventParamsList, "view_TokenChainid", strJoinToString$default3 == null ? "" : strJoinToString$default3, false, 4, null);
        java.util.List<C18982fsg> listAYXKKw3 = c18995fst.AEQbTJ().AYXKKw();
        java.lang.String strJoinToString$default4 = listAYXKKw3 != null ? CollectionsKt___CollectionsKt.joinToString$default(listAYXKKw3, str, null, null, 0, null, new Function1() { // from class: o.fvB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19155fvu.djBIcL((C18982fsg) obj);
            }
        }, 30, null) : null;
        EventParamsList.put$default(eventParamsList, "view_TokenChainid", strJoinToString$default4 == null ? "" : strJoinToString$default4, false, 4, null);
        java.util.List<C18982fsg> listAYXKKw4 = c18995fst.AEQbTJ().AYXKKw();
        java.lang.String strJoinToString$default5 = listAYXKKw4 != null ? CollectionsKt___CollectionsKt.joinToString$default(listAYXKKw4, str, null, null, 0, null, new Function1() { // from class: o.fvC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19155fvu.gEmmrt((C18982fsg) obj);
            }
        }, 30, null) : null;
        EventParamsList.put$default(eventParamsList, "view_quickTrade", strJoinToString$default5 == null ? "" : strJoinToString$default5, false, 4, null);
        java.util.List<C18977fsb> listOLrzqt = c18995fst.AEQbTJ().OLrzqt();
        java.lang.String strJoinToString$default6 = listOLrzqt != null ? CollectionsKt___CollectionsKt.joinToString$default(listOLrzqt, str, null, null, 0, null, new Function1() { // from class: o.fvG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19155fvu.EZpvd((C18977fsb) obj);
            }
        }, 30, null) : null;
        EventParamsList.put$default(eventParamsList, "view_DAppUrl", strJoinToString$default6 == null ? "" : strJoinToString$default6, false, 4, null);
        EventParamsList.put$default(eventParamsList, "view_ExtraInfo", c18995fst.AEQbTJ().EZpvd(), false, 4, null);
        java.util.List<SearchAddressModel> listKWHzl = c18995fst.AEQbTJ().KWHzl();
        if (listKWHzl != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : listKWHzl) {
                if (C33129mqd.OLrzqt((java.lang.CharSequence) ((SearchAddressModel) obj).getAddress())) {
                    arrayList.add(obj);
                }
            }
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, str, null, null, 0, null, new Function1() { // from class: o.fvF
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return C19155fvu.AEQbTJ((SearchAddressModel) obj2);
                }
            }, 30, null);
        }
        EventParamsList.put$default(eventParamsList, "view_Address", strJoinToString$default == null ? "" : strJoinToString$default, false, 4, null);
        java.lang.String strValueOf = c19155fvu.valueOf();
        eventParamsList.put("source_id", strValueOf != null ? strValueOf : "", true);
        return Unit.INSTANCE;
    }

    public static final java.lang.CharSequence OLrzqt(C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        return c18982fsg.copydefault().fetchVPNInfo();
    }

    public static final java.lang.CharSequence AYXKKw(C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        return C33129mqd.gEmmrt(java.lang.Long.valueOf(c18982fsg.copydefault().OLrzqt()));
    }

    public static final java.lang.CharSequence djBIcL(C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        return C33129mqd.gEmmrt(java.lang.Long.valueOf(c18982fsg.copydefault().OLrzqt()));
    }

    public static final java.lang.CharSequence gEmmrt(C18982fsg c18982fsg) {
        Intrinsics.checkNotNullParameter(c18982fsg, "");
        return java.lang.String.valueOf(C11600cUg.OLrzqt(c18982fsg.copydefault().AYXKKw()));
    }

    public static final java.lang.CharSequence EZpvd(C18977fsb c18977fsb) {
        Intrinsics.checkNotNullParameter(c18977fsb, "");
        return c18977fsb.KWHzl().AYXKKw();
    }

    public static final java.lang.CharSequence AEQbTJ(SearchAddressModel searchAddressModel) {
        Intrinsics.checkNotNullParameter(searchAddressModel, "");
        java.lang.String address = searchAddressModel.getAddress();
        return address == null ? "" : address;
    }

    public static final Unit AEQbTJ(C19155fvu c19155fvu, C18995fst c18995fst, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "input_text", c19155fvu.AYXKKw, false, 4, null);
        java.lang.String strValueOf = c19155fvu.valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        eventParamsList.put("source_id", strValueOf, true);
        SearchCompletionUiModel searchCompletionUiModelCopydefault = c18995fst.AEQbTJ().copydefault();
        java.lang.String text = searchCompletionUiModelCopydefault != null ? searchCompletionUiModelCopydefault.getText() : null;
        java.lang.String str = text == null ? "" : text;
        if (str.length() > 0) {
            EventParamsList.put$default(eventParamsList, "corr_query", str, false, 4, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.QwvEab)));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl)));
        return Unit.INSTANCE;
    }

    public static final void KWHzl(C19155fvu c19155fvu, C18995fst c18995fst, android.view.View view) {
        c19155fvu.AhwBna().AEQbTJ(false);
        Function1<? super SearchCompletionUiModel, Unit> function1 = c19155fvu.AhwBna;
        if (function1 != null) {
            SearchCompletionUiModel searchCompletionUiModelCopydefault = c18995fst.AEQbTJ().copydefault();
            Intrinsics.copydefault(searchCompletionUiModelCopydefault);
            function1.invoke(searchCompletionUiModelCopydefault);
        }
    }

    public static final void copydefault(java.util.ArrayList arrayList, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (i < 0 || i >= arrayList.size()) {
            return;
        }
        tab.setText(C33070mpX.AYXKKw(((WalletSearchSubPage) arrayList.get(i)).getTitleResId()));
    }

    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenResumed(new WalletSearchResultContainerFragment$searchByInputContent$1(this, str, null));
    }

    /* JADX INFO: renamed from: o.fvu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fvu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C19155fvu newInstance$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return activity.OLrzqt(str);
        }

        public final C19155fvu OLrzqt(java.lang.String str) {
            C19155fvu c19155fvu = new C19155fvu();
            c19155fvu.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("arg_source", str)));
            return c19155fvu;
        }
    }
}

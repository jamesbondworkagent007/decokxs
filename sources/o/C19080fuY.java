package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3;
import com.okinc.business.defi.wallet.common.FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4;
import com.okinc.business.defi.wallet.home.navigation.WalletNavigator;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryFragment$handleWalletChanged$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryFragment$navigateToItem$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryFragment$observeChipVisibility$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryFragment$observeForAutoPop$1;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchHistoryFragment$performClearHistory$1;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.HistoryFilterType;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C13754dXa;
import o.dZM;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fuY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19080fuY extends AbstractC32998moE {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public C16688eoe AEQbTJ;
    public final InterfaceC56387yDm AYXKKw;
    public C19126fvR AhwBna;
    public boolean OLrzqt;
    public TabLayoutMediator gEmmrt;
    public final int copydefault = C13754dXa.TaskDescription.aCSzUz;
    public java.util.List<HistoryFilterType> KWHzl = new java.util.ArrayList();

    /* JADX INFO: renamed from: o.fuY$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HistoryFilterType.values().length];
            try {
                iArr[HistoryFilterType.ALL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryFilterType.CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[HistoryFilterType.DAPPS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[HistoryFilterType.ADDRESS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[HistoryFilterType.MY_ASSET.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            EZpvd = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.copydefault;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    /* JADX INFO: renamed from: o.fuY$TaskDescription */
    public static final class TaskDescription implements Function0<ViewModelStoreOwner> {
        public final /* synthetic */ androidx.fragment.app.Fragment EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(androidx.fragment.app.Fragment fragment) {
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

    public C19080fuY() {
        InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$1(new TaskDescription(this)));
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(WalletSearchHistoryViewModel.class), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$2(interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$3(null, interfaceC56387yDmEZpvd), new FragmentUtilKt$getParentViewModel$$inlined$viewModels$default$4(this, interfaceC56387yDmEZpvd));
    }

    /* JADX INFO: renamed from: o.fuY$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.fuY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C19080fuY KWHzl() {
            return new C19080fuY();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletSearchHistoryViewModel valueOf() {
        return (WalletSearchHistoryViewModel) this.AYXKKw.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.AEQbTJ = C16688eoe.AEQbTJ(view);
        djBIcL();
        OLrzqt();
        gEmmrt();
        view.post(new java.lang.Runnable() { // from class: o.fvh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C19080fuY.gEmmrt(this.AEQbTJ);
            }
        });
    }

    public static final void gEmmrt(C19080fuY c19080fuY) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c19080fuY, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void djBIcL() {
        WalletSearchHistoryViewModel walletSearchHistoryViewModelValueOf = valueOf();
        HistoryFilterType historyFilterType = HistoryFilterType.ALL;
        walletSearchHistoryViewModelValueOf.AEQbTJ(historyFilterType);
        C16688eoe c16688eoe = this.AEQbTJ;
        if (c16688eoe != null) {
            c16688eoe.AEQbTJ.setBackListener(new View.OnClickListener() { // from class: o.fvj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19080fuY.AEQbTJ(this.copydefault, view);
                }
            });
            c16688eoe.AEQbTJ.setSubDoListener(new View.OnClickListener() { // from class: o.fvi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19080fuY.copydefault(this.OLrzqt, view);
                }
            });
            EZpvd();
            EZpvd(C56402yEa.EZpvd(historyFilterType));
            c16688eoe.OLrzqt.setOffscreenPageLimit(1);
        }
        valueOf().copydefault(true);
    }

    public static final void AEQbTJ(C19080fuY c19080fuY, android.view.View view) {
        InterfaceC18922frZ interfaceC18922frZCopydefault = C18976fsa.copydefault(c19080fuY);
        if (interfaceC18922frZCopydefault != null) {
            WalletNavigator.Activity.pop$default(interfaceC18922frZCopydefault, false, 1, null);
        }
    }

    public static final void copydefault(C19080fuY c19080fuY, android.view.View view) {
        c19080fuY.KWHzl();
    }

    public final void EZpvd() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSearchHistoryFragment$observeChipVisibility$1(this, null), 3, null);
    }

    public final void OLrzqt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSearchHistoryFragment$observeForAutoPop$1(this, null), 3, null);
    }

    private final void gEmmrt() {
        AbstractC58185ywX abstractC58185ywXKWHzl = RxBus.KWHzl(xXO.class, new java.lang.String[0]);
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXKWHzl, "");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        AbstractC58185ywX abstractC58185ywXEZpvd = C58156yvv.EZpvd(abstractC58185ywXKWHzl, viewLifecycleOwner);
        final Function1 function1 = new Function1() { // from class: o.fvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19080fuY.EZpvd(this.AEQbTJ, (xXO) obj);
            }
        };
        InterfaceC58227yxM interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.fvf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19080fuY.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.fvm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19080fuY.EZpvd(this.KWHzl, (java.lang.Throwable) obj);
            }
        };
        abstractC58185ywXEZpvd.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.fvl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C19080fuY.AEQbTJ(function12, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C19080fuY c19080fuY, xXO xxo) {
        c19080fuY.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit EZpvd(C19080fuY c19080fuY, java.lang.Throwable th) {
        pUU.AEQbTJ(c19080fuY.getTAG(), "Exception while listening to wallet main event", th);
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        if (!isAdded() || isDetached()) {
            return;
        }
        WalletSearchHistoryViewModel.loadHistory$default(valueOf(), false, 1, null);
        if (isVisible()) {
            copydefault();
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSearchHistoryFragment$handleWalletChanged$1(this, null), 3, null);
    }

    public final void copydefault() {
        try {
            InterfaceC18922frZ interfaceC18922frZCopydefault = C18976fsa.copydefault(this);
            if (interfaceC18922frZCopydefault == null) {
                pUU.valueOf(getTAG(), "Could not find search container to pop history fragment");
            } else {
                WalletNavigator.Activity.pop$default(interfaceC18922frZCopydefault, false, 1, null);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error popping fragment: " + e.getMessage(), e);
        }
    }

    public final void EZpvd(java.util.List<? extends HistoryFilterType> list) {
        HistoryFilterType historyFilterType;
        C55244xgL c55244xgL;
        if (!isAdded() || isDetached()) {
            pUU.valueOf(getTAG(), "Fragment not in valid state, skipping filter update");
            return;
        }
        C16688eoe c16688eoe = this.AEQbTJ;
        TabLayout tabLayoutAYXKKw = null;
        ViewPager2 viewPager2 = c16688eoe != null ? c16688eoe.OLrzqt : null;
        if (viewPager2 == null) {
            pUU.valueOf(getTAG(), "ViewPager is null, skipping filter update");
            return;
        }
        try {
            int currentItem = viewPager2.getCurrentItem();
            if (currentItem >= this.KWHzl.size() || (historyFilterType = (HistoryFilterType) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, currentItem)) == null) {
                historyFilterType = HistoryFilterType.ALL;
            }
            this.KWHzl.clear();
            this.KWHzl.addAll(list);
            TabLayoutMediator tabLayoutMediator = this.gEmmrt;
            if (tabLayoutMediator != null) {
                tabLayoutMediator.detach();
            }
            this.gEmmrt = null;
            C19126fvR c19126fvR = new C19126fvR(this, this.KWHzl, valueOf(), new Function2() { // from class: o.fvk
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C19080fuY.copydefault(this.OLrzqt, (C18989fsn) obj, (InterfaceC9738bbJ) obj2);
                }
            }, new Function1() { // from class: o.fvn
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C19080fuY.copydefault(this.OLrzqt, (C18989fsn) obj);
                }
            });
            this.AhwBna = c19126fvR;
            viewPager2.setAdapter(c19126fvR);
            C16688eoe c16688eoe2 = this.AEQbTJ;
            if (c16688eoe2 != null && (c55244xgL = c16688eoe2.EZpvd) != null) {
                tabLayoutAYXKKw = c55244xgL.AYXKKw();
            }
            if (tabLayoutAYXKKw == null) {
                pUU.valueOf(getTAG(), "TabLayout is null, skipping mediator setup");
                return;
            }
            TabLayoutMediator tabLayoutMediator2 = new TabLayoutMediator(tabLayoutAYXKKw, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.fve
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C19080fuY.EZpvd(this.AEQbTJ, tab, i);
                }
            });
            tabLayoutMediator2.attach();
            this.gEmmrt = tabLayoutMediator2;
            viewPager2.registerOnPageChangeCallback(new Activity());
            int iIndexOf = this.KWHzl.indexOf(historyFilterType);
            if (iIndexOf >= 0) {
                viewPager2.setCurrentItem(iIndexOf, false);
            } else {
                viewPager2.setCurrentItem(0, false);
            }
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error updating active filters: " + e.getMessage(), e);
        }
    }

    public static final Unit copydefault(C19080fuY c19080fuY, C18989fsn c18989fsn, InterfaceC9738bbJ interfaceC9738bbJ) {
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        Intrinsics.checkNotNullParameter(interfaceC9738bbJ, "");
        c19080fuY.AEQbTJ(c18989fsn);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C19080fuY c19080fuY, C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        c19080fuY.KWHzl(c18989fsn);
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C19080fuY c19080fuY, TabLayout.Tab tab, int i) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(tab, "");
        if (i >= c19080fuY.KWHzl.size()) {
            return;
        }
        int i2 = StateListAnimator.EZpvd[c19080fuY.KWHzl.get(i).ordinal()];
        if (i2 == 1) {
            string = c19080fuY.getString(C13754dXa.FragmentManager.dvKsVJ);
        } else if (i2 == 2) {
            string = c19080fuY.getString(C13754dXa.FragmentManager.gasjUx);
        } else if (i2 == 3) {
            string = c19080fuY.getString(C13754dXa.FragmentManager.invokespecialsiEkQe);
        } else if (i2 == 4) {
            string = c19080fuY.getString(C13754dXa.FragmentManager.flVtFt);
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            string = c19080fuY.getString(C13754dXa.FragmentManager.Rdimen);
        }
        tab.setText(string);
    }

    /* JADX INFO: renamed from: o.fuY$Activity */
    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public Activity() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            HistoryFilterType historyFilterType = (HistoryFilterType) CollectionsKt___CollectionsKt.AkhnZx(C19080fuY.this.KWHzl, i);
            if (historyFilterType != null) {
                C19080fuY.this.valueOf().AEQbTJ(historyFilterType);
            }
        }
    }

    public final void KWHzl(@NotNull C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        this.OLrzqt = true;
        valueOf().EZpvd(c18989fsn);
    }

    public final void AEQbTJ(@NotNull C18989fsn c18989fsn) {
        Intrinsics.checkNotNullParameter(c18989fsn, "");
        if (!isAdded() || isDetached()) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSearchHistoryFragment$navigateToItem$1(this, c18989fsn, null), 3, null);
    }

    public final void KWHzl() {
        if (!isAdded() || isDetached()) {
            return;
        }
        try {
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
            viewOnClickListenerC54939xaY.setTitle(getString(C13754dXa.FragmentManager.XmlRes));
            viewOnClickListenerC54939xaY.EZpvd(getString(C13754dXa.FragmentManager.VisibleForTestingCompanion));
            viewOnClickListenerC54939xaY.EZpvd(C13754dXa.FragmentManager.DXXBbs, new View.OnClickListener() { // from class: o.fvc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19080fuY.KWHzl(viewOnClickListenerC54939xaY, this, view);
                }
            });
            viewOnClickListenerC54939xaY.OLrzqt(C13754dXa.FragmentManager.AxsJAYsNCnLh, new View.OnClickListener() { // from class: o.fvd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C19080fuY.KWHzl(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error showing clear confirmation dialog: " + e.getMessage(), e);
        }
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, C19080fuY c19080fuY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
        c19080fuY.AEQbTJ();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void AEQbTJ() {
        if (!isAdded() || isDetached()) {
            return;
        }
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new WalletSearchHistoryFragment$performClearHistory$1(this, null), 3, null);
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
        try {
            xWN xwn = (xWN) C43251rlk.copydefault(xWN.class);
            xwn.KWHzl(false);
            xwn.EZpvd(false);
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ(getTAG(), "Error toggling UI visibility: " + e.getMessage(), e);
        }
        valueOf().copydefault(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        TabLayoutMediator tabLayoutMediator = this.gEmmrt;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.gEmmrt = null;
        this.AEQbTJ = null;
    }
}

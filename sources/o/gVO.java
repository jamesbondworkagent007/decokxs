package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dex.trade.copytrading.home.data.CopyTradingHomeParams;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingHomeVM;
import com.okinc.business.dex.trade.copytrading.home.viewmodel.CopyTradingStrategiesVM;
import com.okinc.business.dexlogic.bean.track.TrackButtonName;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC20003gXh;
import o.C19965gVx;
import o.C23274hvD;
import o.gWR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gVO extends AbstractC19973gWe<C21521hCl> implements gUO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final java.util.List<kotlin.Pair<java.lang.Integer, C19965gVx>> EZpvd;
    public final InterfaceC56387yDm copydefault;

    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ C21521hCl copydefault(gVO gvo) {
        return (C21521hCl) gvo.fARcdN();
    }

    public gVO() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingStrategiesVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesPagerFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesPagerFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesPagerFragment$special$$inlined$activityViewModels$default$3
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CopyTradingHomeVM.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesPagerFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesPagerFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dex.trade.copytrading.home.ui.CopyTradingStrategiesPagerFragment$special$$inlined$activityViewModels$default$6
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
        int i = C23274hvD.Fragment.zXhzOT;
        C19965gVx.Activity activity = C19965gVx.Companion;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(java.lang.Integer.valueOf(i), activity.KWHzl(false));
        int i2 = C23274hvD.Fragment.sRzUNh;
        this.EZpvd = yDY.gEmmrt(pairOLrzqt, C56390yDp.OLrzqt(java.lang.Integer.valueOf(i2), activity.KWHzl(true)));
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gVO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ gVO newInstance$default(ActionBar actionBar, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            return actionBar.copydefault(i);
        }

        public final gVO copydefault(int i) {
            gVO gvo = new gVO();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("tab", i);
            gvo.setArguments(bundle);
            return gvo;
        }
    }

    public final CopyTradingStrategiesVM AEQbTJ() {
        return (CopyTradingStrategiesVM) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CopyTradingHomeVM valueOf() {
        return (CopyTradingHomeVM) this.copydefault.getValue();
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.hTH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public C21521hCl OLrzqt(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21521hCl c21521hClEZpvd = C21521hCl.EZpvd(layoutInflater, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(c21521hClEZpvd, "");
        return c21521hClEZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(Landroidx/viewbinding/ViewBinding;Landroid/os/Bundle;)V */
    @Override // o.hTH
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(@NotNull C21521hCl c21521hCl, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(c21521hCl, "");
        AEQbTJ(c21521hCl);
        AEQbTJ().KWHzl(true);
        c21521hCl.getRoot().post(new java.lang.Runnable() { // from class: o.gVR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                gVO.AYXKKw(this.OLrzqt);
            }
        });
    }

    public static final void AYXKKw(gVO gvo) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) gvo, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return KWHzl(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object KWHzl(boolean z, Continuation<? super Unit> continuation) {
            android.widget.TextView textView;
            android.widget.TextView textView2;
            if (gVO.copydefault(gVO.this) != null) {
                gVO gvo = gVO.this;
                if (z) {
                    C21521hCl c21521hClCopydefault = gVO.copydefault(gvo);
                    if (c21521hClCopydefault != null) {
                        gvo.OLrzqt(c21521hClCopydefault);
                    }
                    C21521hCl c21521hClCopydefault2 = gVO.copydefault(gvo);
                    if (c21521hClCopydefault2 != null && (textView2 = c21521hClCopydefault2.OLrzqt) != null) {
                        C55418xja.AEQbTJ(textView2);
                    }
                } else {
                    C21521hCl c21521hClCopydefault3 = gVO.copydefault(gvo);
                    if (c21521hClCopydefault3 != null && (textView = c21521hClCopydefault3.OLrzqt) != null) {
                        C55418xja.EZpvd(textView);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        C25390ivn.collectOnViewLifecycle$default(this, valueOf().OLrzqt(), null, new StateListAnimator(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().KWHzl(), null, new Dialog(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, AEQbTJ().OLrzqt(), null, new PendingIntent(), 2, null);
        C22380heK.OLrzqt.copydefault("default_trade").KWHzl().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.gVQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return gVO.copydefault(this.KWHzl, (CopyTradingHomeParams) obj);
            }
        }));
    }

    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC20003gXh abstractC20003gXh, Continuation<? super Unit> continuation) {
            if (abstractC20003gXh instanceof AbstractC20003gXh.TaskDescription) {
                gVO.this.AEQbTJ(((AbstractC20003gXh.TaskDescription) abstractC20003gXh).copydefault());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class PendingIntent<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(gWR gwr, Continuation<? super Unit> continuation) {
            if (gwr instanceof gWR.Activity) {
                CopyTradingStrategiesVM.getActiveStrategies$default(gVO.this.AEQbTJ(), false, 1, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(gVO gvo, CopyTradingHomeParams copyTradingHomeParams) {
        C55244xgL c55244xgL;
        TabLayout tabLayoutAYXKKw;
        TabLayout.Tab tabAt;
        if (!Intrinsics.EZpvd(copyTradingHomeParams, CopyTradingHomeParams.Companion.copydefault()) && copyTradingHomeParams.OLrzqt() != -1) {
            int iEZpvd = C56548yJl.EZpvd(copyTradingHomeParams.OLrzqt(), 0, gvo.EZpvd.size() - 1);
            C21521hCl c21521hCl = (C21521hCl) gvo.fARcdN();
            if (c21521hCl != null && (c55244xgL = c21521hCl.KWHzl) != null && (tabLayoutAYXKKw = c55244xgL.AYXKKw()) != null && (tabAt = tabLayoutAYXKKw.getTabAt(iEZpvd)) != null) {
                tabAt.select();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.gUO
    public void KWHzl() {
        ViewPager2 viewPager2AhwBna;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C19949gVh c19949gVh = parentFragment instanceof C19949gVh ? (C19949gVh) parentFragment : null;
        if (c19949gVh == null || (viewPager2AhwBna = c19949gVh.AhwBna()) == null) {
            return;
        }
        C19965gVx second = this.EZpvd.get(viewPager2AhwBna.getCurrentItem()).getSecond();
        if (second.isAdded() && !second.isDetached() && !second.isRemoving()) {
            second.KWHzl();
        } else {
            pUU.KWHzl(getTAG(), "Existing fragment is not active yet");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(int i) {
        TabLayout.TabView tabView;
        java.lang.String strCopydefault;
        C21521hCl c21521hCl = (C21521hCl) fARcdN();
        if (c21521hCl == null || c21521hCl.KWHzl.AYXKKw().getTabCount() < 1) {
            return;
        }
        TabLayout.Tab tabAt = c21521hCl.KWHzl.AYXKKw().getTabAt(0);
        if (tabAt != null) {
            if (i < 1) {
                strCopydefault = C33070mpX.AYXKKw(C23274hvD.Fragment.zXhzOT);
            } else {
                strCopydefault = C33069mpW.copydefault(C23274hvD.Fragment.GcnicV, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.String.valueOf(i))));
            }
            tabAt.setText(strCopydefault);
        }
        TabLayout.Tab tabAt2 = c21521hCl.KWHzl.AYXKKw().getTabAt(0);
        if (tabAt2 == null || (tabView = tabAt2.view) == null) {
            return;
        }
        tabView.setContentDescription("web3_dex_copytrading_open_tasks_tab");
    }

    public final void AEQbTJ(C21521hCl c21521hCl) {
        ViewPager2 viewPager2AhwBna;
        TabLayout.TabView tabView;
        TabLayout.TabView tabView2;
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C19949gVh c19949gVh = parentFragment instanceof C19949gVh ? (C19949gVh) parentFragment : null;
        if (c19949gVh == null || (viewPager2AhwBna = c19949gVh.AhwBna()) == null) {
            return;
        }
        viewPager2AhwBna.setAdapter(new TaskDescription(this, c19949gVh));
        new TabLayoutMediator(c21521hCl.KWHzl.AYXKKw(), viewPager2AhwBna, true, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.gVS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                gVO.KWHzl(this.OLrzqt, tab, i);
            }
        }).attach();
        C55244xgL c55244xgL = c21521hCl.KWHzl;
        c55244xgL.setStyle(2);
        c55244xgL.setOKDSSize(-20);
        c55244xgL.copydefault(new Activity());
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            TabLayout.Tab tabAt = c21521hCl.KWHzl.AYXKKw().getTabAt(C56548yJl.EZpvd(arguments.getInt("tab", 0), 0, this.EZpvd.size() - 1));
            if (tabAt != null) {
                tabAt.select();
            }
        }
        TabLayout.Tab tabAt2 = c21521hCl.KWHzl.AYXKKw().getTabAt(0);
        if (tabAt2 != null && (tabView2 = tabAt2.view) != null) {
            tabView2.setContentDescription("web3_dex_copytrading_open_tasks_tab");
        }
        TabLayout.Tab tabAt3 = c21521hCl.KWHzl.AYXKKw().getTabAt(1);
        if (tabAt3 == null || (tabView = tabAt3.view) == null) {
            return;
        }
        tabView.setContentDescription("web3_dex_copytrading_past_tasks_tab");
    }

    public static final void KWHzl(gVO gvo, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(C33070mpX.AYXKKw(gvo.EZpvd.get(i).getFirst().intValue()));
    }

    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab == null) {
                return;
            }
            gVO.this.valueOf().AEQbTJ(tab.getPosition() == 0 ? TrackButtonName.ONGOING_TAB.getButtonName() : TrackButtonName.HISTORY_TAB.getButtonName());
        }
    }

    public final void OLrzqt(C21521hCl c21521hCl) {
        ViewPager2 viewPager2AhwBna;
        android.widget.TextView textView = c21521hCl.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        C55418xja.KWHzl(textView, new C55363xiY(false, false, true, 30, 180, false, 15, false, false, 0, null, null, MTAnalysisConstants.MainWhat.ON_ACCOUNT, null));
        C55244xgL c55244xgL = c21521hCl.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55244xgL, "");
        C55418xja.KWHzl(c55244xgL, new C55363xiY(false, true, false, null, null, false, null, false, false, 0, null, null, 4093, null));
        androidx.fragment.app.Fragment parentFragment = getParentFragment();
        C19949gVh c19949gVh = parentFragment instanceof C19949gVh ? (C19949gVh) parentFragment : null;
        if (c19949gVh == null || (viewPager2AhwBna = c19949gVh.AhwBna()) == null) {
            return;
        }
        C55418xja.KWHzl(viewPager2AhwBna, new C55363xiY(false, true, false, null, null, false, null, false, false, 0, null, null, 4093, null));
    }

    public final class TaskDescription extends FragmentStateAdapter {
        public final /* synthetic */ gVO OLrzqt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull gVO gvo, androidx.fragment.app.Fragment fragment) {
            super(fragment);
            Intrinsics.checkNotNullParameter(fragment, "");
            this.OLrzqt = gvo;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.OLrzqt.EZpvd.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return (androidx.fragment.app.Fragment) ((kotlin.Pair) this.OLrzqt.EZpvd.get(i)).getSecond();
        }
    }
}

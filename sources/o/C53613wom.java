package o;

import android.os.Build;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$initListeners$1;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$initListeners$2;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsViewModel;
import com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawType;
import com.okinc.unify_trade.biz.BotVo;
import com.okinc.unify_trade.bot.data.TacticsData;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C52912wba;
import o.C53625woy;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wom, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53613wom extends AbstractC53615woo {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int valueOf = 8;
    public uMS AYXKKw;
    public wYF AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public Function0<Unit> gEmmrt;
    public final InterfaceC56387yDm isConnected;

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C53613wom() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$special$$inlined$viewModels$default$2
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
        this.isConnected = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SmartArbWithdrawProfitsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawProfitsBottomSheet$special$$inlined$viewModels$default$5
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
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wou
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53613wom.fetchVPNInfo(this.EZpvd);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wor
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C53613wom.isConnected(this.EZpvd));
            }
        });
        this.fetchVPNInfo = C56392yDr.copydefault(new Function0() { // from class: o.wot
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53613wom.AkhnZx(this.KWHzl);
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.wos
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53613wom.DbNXlk(this.OLrzqt);
            }
        });
    }

    /* JADX INFO: renamed from: o.wom$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wom.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C53613wom copydefault(@NotNull TacticsData tacticsData, @NotNull Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(tacticsData, "");
            Intrinsics.checkNotNullParameter(function0, "");
            C53613wom c53613wom = new C53613wom();
            c53613wom.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key_tactics_data", tacticsData)));
            c53613wom.gEmmrt = function0;
            return c53613wom;
        }
    }

    /* JADX DEBUG: Possible override for method o.woo.EZpvd()V */
    public final uMS EZpvd() {
        uMS ums = this.AYXKKw;
        Intrinsics.copydefault(ums);
        return ums;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SmartArbWithdrawProfitsViewModel valueOf() {
        return (SmartArbWithdrawProfitsViewModel) this.isConnected.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsData djBIcL() {
        return (TacticsData) this.AkhnZx.getValue();
    }

    public static final TacticsData fetchVPNInfo(C53613wom c53613wom) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53613wom.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("key_tactics_data", TacticsData.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("key_tactics_data");
            parcelable = (TacticsData) (parcelable2 instanceof TacticsData ? parcelable2 : null);
        }
        return (TacticsData) parcelable;
    }

    private final boolean AkhnZx() {
        return ((java.lang.Boolean) this.djBIcL.getValue()).booleanValue();
    }

    public static final boolean isConnected(C53613wom c53613wom) {
        TacticsData tacticsDataDjBIcL = c53613wom.djBIcL();
        return tacticsDataDjBIcL != null && tacticsDataDjBIcL.isSmartArbitrageWithStaking();
    }

    public final java.util.List<SmartArbWithdrawType> AhwBna() {
        return (java.util.List) this.fetchVPNInfo.getValue();
    }

    public static final java.util.List AkhnZx(C53613wom c53613wom) {
        TacticsData tacticsDataDjBIcL;
        BotVo bot;
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        listOLrzqt.add(SmartArbWithdrawType.Arbitrage);
        if (c53613wom.AkhnZx() || ((tacticsDataDjBIcL = c53613wom.djBIcL()) != null && (bot = tacticsDataDjBIcL.getBot()) != null && bot.isAutoStaking())) {
            listOLrzqt.add(SmartArbWithdrawType.Staking);
        }
        return C56402yEa.fARcdN(listOLrzqt);
    }

    public final ActionBar AYXKKw() {
        return (ActionBar) this.DbNXlk.getValue();
    }

    public static final ActionBar DbNXlk(C53613wom c53613wom) {
        return new ActionBar(c53613wom, c53613wom, c53613wom.AhwBna());
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onHeaderCreated(wxq);
        wxq.setStyle(1);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
        textViewAYXKKw.setText(C33070mpX.AYXKKw(C55688xof.Application.setDisplayShowHomeEnabled));
        textViewAYXKKw.setTextAppearance(C52761wXj.LoaderManager.zLjUOn);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setVisibility(0);
        imageViewKWHzl.setOnClickListener(new LoaderManager(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = uMS.EZpvd(android.view.LayoutInflater.from(getContext()), constraintLayout, false);
        constraintLayout.addView(EZpvd().getRoot());
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C53769wrj.AEQbTJ.AEQbTJ();
        DbNXlk();
        gEmmrt();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        valueOf().OLrzqt(SmartArbWithdrawProfitsViewModel.StateListAnimator.TaskDescription.KWHzl);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
            c52794wYpCopydefault.setOnClickListener(new Application(c52794wYpCopydefault, 1000L, this));
        }
        this.AhwBna = wyf;
    }

    private final void DbNXlk() {
        uMS umsEZpvd = EZpvd();
        ViewPager2 viewPager2 = umsEZpvd.KWHzl;
        viewPager2.setAdapter(AYXKKw());
        viewPager2.registerOnPageChangeCallback(new TaskDescription());
        viewPager2.setUserInputEnabled(false);
        C55249xgQ c55249xgQ = umsEZpvd.OLrzqt;
        Intrinsics.copydefault(c55249xgQ);
        c55249xgQ.setVisibility(AhwBna().size() <= 1 ? 8 : 0);
        for (SmartArbWithdrawType smartArbWithdrawType : AhwBna()) {
            TabLayout.Tab tabNewTab = c55249xgQ.newTab();
            tabNewTab.setText(C33070mpX.AYXKKw(smartArbWithdrawType.getLabel()));
            c55249xgQ.addTab(tabNewTab);
        }
        c55249xgQ.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new Activity(umsEZpvd, this));
        c55249xgQ.selectTab(c55249xgQ.getTabAt(yDY.AuCTel(AhwBna())));
    }

    /* JADX INFO: renamed from: o.wom$TaskDescription */
    public static final class TaskDescription extends ViewPager2.OnPageChangeCallback {
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: o.wom$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ C53613wom AEQbTJ;
        public final /* synthetic */ uMS OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity(uMS ums, C53613wom c53613wom) {
            this.OLrzqt = ums;
            this.AEQbTJ = c53613wom;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                int position = tab.getPosition();
                uMS ums = this.OLrzqt;
                C53613wom c53613wom = this.AEQbTJ;
                ums.KWHzl.setCurrentItem(tab.getPosition(), false);
                c53613wom.valueOf().OLrzqt(new SmartArbWithdrawProfitsViewModel.StateListAnimator.C0663StateListAnimator((SmartArbWithdrawType) c53613wom.AhwBna().get(position)));
            }
        }
    }

    /* JADX INFO: renamed from: o.wom$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C53613wom AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53613wom c53613wom) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c53613wom;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.valueOf().OLrzqt(SmartArbWithdrawProfitsViewModel.StateListAnimator.Dialog.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.wom$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C53613wom OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C53613wom c53613wom) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = c53613wom;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.OLrzqt.dismiss();
            }
        }
    }

    private final void gEmmrt() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new SmartArbWithdrawProfitsBottomSheet$initListeners$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new SmartArbWithdrawProfitsBottomSheet$initListeners$2(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wom */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showWithdrawableStakingProfitsDialog$default(C53613wom c53613wom, C52912wba.ActionBar actionBar, C52912wba.ActionBar actionBar2, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function0 = null;
        }
        c53613wom.AEQbTJ(actionBar, actionBar2, (Function0<Unit>) function0);
    }

    public final void AEQbTJ(C52912wba.ActionBar actionBar, C52912wba.ActionBar actionBar2, final Function0<Unit> function0) {
        java.lang.String strCopydefault;
        android.content.Context context = getContext();
        if (context != null) {
            java.lang.String strAddS$default = C33129mqd.addS$default(actionBar.KWHzl(), actionBar2.KWHzl(), null, null, null, 14, null);
            java.lang.String strAddS$default2 = C33129mqd.addS$default(actionBar.AEQbTJ(), actionBar2.AEQbTJ(), null, null, null, 14, null);
            java.lang.String strAddS$default3 = C33129mqd.addS$default(actionBar.valueOf(), actionBar2.valueOf(), null, null, null, 14, null);
            TacticsData tacticsDataDjBIcL = djBIcL();
            o.ActionBar actionBarAEQbTJ = o.TaskDescription.AEQbTJ(tacticsDataDjBIcL != null ? tacticsDataDjBIcL.getInstId() : null);
            java.lang.String strCopydefault2 = actionBar2.copydefault();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strCopydefault2)) {
                strCopydefault2 = actionBarAEQbTJ.copydefault().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(strCopydefault2, "");
            }
            java.lang.String strOLrzqt = actionBar2.OLrzqt();
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
                strOLrzqt = actionBarAEQbTJ.AEQbTJ().toUpperCase(java.util.Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
            }
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strOLrzqt)) {
                strOLrzqt = "USDT";
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.QFTsTN));
            java.lang.String str = strOLrzqt;
            if (AkhnZx()) {
                strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.gCZUJG, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt1", actionBar.EZpvd()), C56390yDp.OLrzqt("ccy1", actionBar.copydefault()), C56390yDp.OLrzqt("amt2", actionBar2.EZpvd()), C56390yDp.OLrzqt("ccy2", strCopydefault2), C56390yDp.OLrzqt("amt3", strAddS$default), C56390yDp.OLrzqt("ccy3", actionBar.OLrzqt()), C56390yDp.OLrzqt("amt4", actionBar.AYXKKw()), C56390yDp.OLrzqt("ccy4", actionBar.copydefault()), C56390yDp.OLrzqt("amt5", actionBar2.AYXKKw()), C56390yDp.OLrzqt("ccy5", strCopydefault2), C56390yDp.OLrzqt("amt6", strAddS$default2), C56390yDp.OLrzqt("ccy6", actionBar.OLrzqt()), C56390yDp.OLrzqt("amt7", actionBar.AhwBna()), C56390yDp.OLrzqt("ccy7", actionBar.copydefault()), C56390yDp.OLrzqt("amt8", actionBar2.AhwBna()), C56390yDp.OLrzqt("ccy8", strCopydefault2), C56390yDp.OLrzqt("amt9", strAddS$default3), C56390yDp.OLrzqt("ccy9", actionBar.OLrzqt())));
            } else {
                strCopydefault = C33069mpW.copydefault(C48033uCm.Fragment.hdpuIA, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt1", C53418wlC.EZpvd(actionBar2.EZpvd())), C56390yDp.OLrzqt("ccy1", strCopydefault2), C56390yDp.OLrzqt("amt2", strAddS$default), C56390yDp.OLrzqt("ccy2", str), C56390yDp.OLrzqt("amt3", C53418wlC.EZpvd(actionBar2.AYXKKw())), C56390yDp.OLrzqt("ccy3", strCopydefault2), C56390yDp.OLrzqt("amt4", strAddS$default2), C56390yDp.OLrzqt("ccy4", str), C56390yDp.OLrzqt("amt5", C53418wlC.EZpvd(actionBar2.AhwBna())), C56390yDp.OLrzqt("ccy5", strCopydefault2), C56390yDp.OLrzqt("amt6", strAddS$default3), C56390yDp.OLrzqt("ccy6", str)));
            }
            viewOnClickListenerC54939xaY.EZpvd(strCopydefault);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.won
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53613wom.valueOf(function0, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void valueOf(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wom */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showWithdrawableArbitrageProfitsDialog$default(C53613wom c53613wom, C52912wba.StateListAnimator stateListAnimator, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c53613wom.AEQbTJ(stateListAnimator, function0);
    }

    public final void AEQbTJ(C52912wba.StateListAnimator stateListAnimator, final Function0<Unit> function0) {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.fiXcQa));
            java.lang.String strEZpvd = stateListAnimator.EZpvd();
            viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C48033uCm.Fragment.gkZNMa, C56424yEw.gEmmrt(C56390yDp.OLrzqt("amt1", stateListAnimator.OLrzqt()), C56390yDp.OLrzqt("ccy1", strEZpvd), C56390yDp.OLrzqt("amt2", stateListAnimator.KWHzl()), C56390yDp.OLrzqt("ccy2", strEZpvd), C56390yDp.OLrzqt("amt3", stateListAnimator.copydefault()), C56390yDp.OLrzqt("ccy3", strEZpvd))));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wov
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C53613wom.copydefault(function0, viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void copydefault(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.wom */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void showEstLiquidationPrice$default(C53613wom c53613wom, android.content.Context context, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c53613wom.copydefault(context, function0);
    }

    public final void copydefault(android.content.Context context, final Function0<Unit> function0) {
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C48033uCm.Fragment.hfdhUn));
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.FQMcgE));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.woA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C53613wom.AEQbTJ(function0, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(Function0 function0, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (function0 != null) {
            function0.invoke();
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        valueOf().copydefault();
        this.gEmmrt = null;
        this.AYXKKw = null;
        this.AhwBna = null;
        super.onDestroyView();
    }

    /* JADX INFO: renamed from: o.wom$ActionBar */
    public final class ActionBar extends FragmentStateAdapter {
        public final java.util.List<SmartArbWithdrawType> AEQbTJ;
        public final /* synthetic */ C53613wom KWHzl;

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: java.util.List<? extends com.okinc.tradingbot.impl.order.strategy.withdraw.smartarbitrage.SmartArbWithdrawType> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ActionBar(@NotNull C53613wom c53613wom, @NotNull androidx.fragment.app.Fragment fragment, java.util.List<? extends SmartArbWithdrawType> list) {
            super(fragment);
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = c53613wom;
            this.AEQbTJ = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.AEQbTJ.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            C53625woy.Activity activity = C53625woy.Companion;
            TacticsData tacticsDataDjBIcL = this.KWHzl.djBIcL();
            if (tacticsDataDjBIcL == null) {
                tacticsDataDjBIcL = new TacticsData(null, null, null, null, null, null, false, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, false, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, 3, null);
            }
            return activity.copydefault(tacticsDataDjBIcL, this.AEQbTJ.get(i));
        }
    }
}

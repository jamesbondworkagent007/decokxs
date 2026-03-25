package o;

import android.view.View;
import androidx.core.os.BundleCompat;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnStakingQueryConfig;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnPresenter;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.EducationTabType;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.bot.data.TacticsVipProfitData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wxO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54066wxO extends AbstractC49945uyC<uOC, AutoEarnPresenter> {
    public C47976uAj<EducationTabType> AYXKKw;
    public TabLayout.OnTabSelectedListener djBIcL;
    public TabLayoutMediator gEmmrt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public static final java.lang.String KWHzl = "is_smartarbi_key";
    public static final java.lang.String OLrzqt = "current_page_id_key";
    public static final java.lang.String valueOf = "vip_mode";
    public static final java.lang.String AhwBna = "vipProfitInfo";
    public static final java.lang.String AEQbTJ = "tacticsVipProfitInfo";

    /* JADX INFO: renamed from: o.wxO$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    public static final boolean AEQbTJ(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.QwvEab;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    /* JADX INFO: renamed from: o.wxO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wxO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final java.lang.String copydefault() {
            return C54066wxO.KWHzl;
        }

        public final java.lang.String KWHzl() {
            return C54066wxO.OLrzqt;
        }

        public final java.lang.String AEQbTJ() {
            return C54066wxO.valueOf;
        }

        public final java.lang.String OLrzqt() {
            return C54066wxO.AhwBna;
        }

        public final java.lang.String EZpvd() {
            return C54066wxO.AEQbTJ;
        }

        public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, AutoVipProfitInfo autoVipProfitInfo, TacticsVipProfitData tacticsVipProfitData, boolean z, int i) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            C54066wxO c54066wxO = new C54066wxO();
            ActionBar actionBar = C54066wxO.Companion;
            c54066wxO.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(actionBar.AEQbTJ(), str), C56390yDp.OLrzqt(actionBar.OLrzqt(), autoVipProfitInfo), C56390yDp.OLrzqt(actionBar.EZpvd(), tacticsVipProfitData), C56390yDp.OLrzqt(actionBar.copydefault(), java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt(actionBar.KWHzl(), java.lang.Integer.valueOf(i))));
            c54066wxO.show(fragmentManager, ActionBar.class.getSimpleName());
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.valueOf().setVisibility(8);
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(0);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        AutoVipProfitInfo autoVipProfitInfo;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AutoEarnPresenter autoEarnPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        autoEarnPresenterOLrzqt.copydefault(arguments != null ? arguments.getBoolean(KWHzl) : false);
        AutoEarnPresenter autoEarnPresenterOLrzqt2 = OLrzqt();
        android.os.Bundle arguments2 = getArguments();
        java.lang.String string = arguments2 != null ? arguments2.getString(valueOf) : null;
        if (string == null) {
            string = "";
        }
        autoEarnPresenterOLrzqt2.OLrzqt(string);
        AutoEarnPresenter autoEarnPresenterOLrzqt3 = OLrzqt();
        android.os.Bundle arguments3 = getArguments();
        if (arguments3 == null || (autoVipProfitInfo = (AutoVipProfitInfo) BundleCompat.getParcelable(arguments3, AhwBna, AutoVipProfitInfo.class)) == null) {
            autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
        }
        autoEarnPresenterOLrzqt3.copydefault(autoVipProfitInfo);
        android.os.Bundle arguments4 = getArguments();
        TacticsVipProfitData tacticsVipProfitData = arguments4 != null ? (TacticsVipProfitData) BundleCompat.getParcelable(arguments4, AEQbTJ, TacticsVipProfitData.class) : null;
        if (tacticsVipProfitData != null) {
            AutoEarnPresenter autoEarnPresenterOLrzqt4 = OLrzqt();
            java.lang.String strKWHzl = tacticsVipProfitData.KWHzl();
            autoEarnPresenterOLrzqt4.OLrzqt(strKWHzl != null ? strKWHzl : "");
            OLrzqt().copydefault(tacticsVipProfitData);
        } else {
            fIwbmz();
        }
        AuCTel();
    }

    private final void fIwbmz() {
        uOC uocValues = values();
        java.lang.String strAYXKKw = OLrzqt().AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "auto_education_single_earn")) {
            uocValues.AEQbTJ.setText(OLrzqt().AhwBna() ? C33070mpX.AYXKKw(C48033uCm.Fragment.FYtjSf) : C33070mpX.AYXKKw(C48033uCm.Fragment.setProfilesSinceInitCount));
        } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "auto_education_single_staking")) {
            uocValues.AEQbTJ.setText(OLrzqt().AhwBna() ? C33070mpX.AYXKKw(C48033uCm.Fragment.UJEglR) : C33070mpX.AYXKKw(C48033uCm.Fragment.hPlhRW));
        } else {
            uocValues.AEQbTJ.setText(OLrzqt().AhwBna() ? C33070mpX.AYXKKw(C48033uCm.Fragment.NRYds) : C33070mpX.AYXKKw(C48033uCm.Fragment.setProfilesSinceInitCount));
        }
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        java.util.List<EducationTabType> listKWHzl = OLrzqt().KWHzl(OLrzqt().AYXKKw());
        Lifecycle lifecycle = getLifecycle();
        Intrinsics.checkNotNullExpressionValue(lifecycle, "");
        C47976uAj<EducationTabType> c47976uAj = new C47976uAj<>(childFragmentManager, listKWHzl, lifecycle, C56390yDp.OLrzqt(OLrzqt().KWHzl(), getArguments()));
        this.AYXKKw = c47976uAj;
        uocValues.KWHzl.setAdapter(c47976uAj);
        uocValues.KWHzl.setUserInputEnabled(false);
        android.view.View childAt = uocValues.KWHzl.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        ViewPager2 viewPager2 = uocValues.KWHzl;
        android.os.Bundle arguments = getArguments();
        viewPager2.setCurrentItem((arguments != null && arguments.getInt(OLrzqt) == 1 && Intrinsics.EZpvd((java.lang.Object) OLrzqt().AYXKKw(), (java.lang.Object) "auto_earn_and_staking")) ? 1 : 0, false);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(uocValues.OLrzqt, uocValues.KWHzl, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.wxU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C54066wxO.AEQbTJ(this.EZpvd, tab, i);
            }
        });
        this.gEmmrt = tabLayoutMediator;
        tabLayoutMediator.attach();
        StateListAnimator stateListAnimator = new StateListAnimator(uocValues);
        this.djBIcL = stateListAnimator;
        uocValues.OLrzqt.addOnTabSelectedListener((TabLayout.BaseOnTabSelectedListener) stateListAnimator);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public static final void AEQbTJ(C54066wxO c54066wxO, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.wxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C54066wxO.AEQbTJ(view);
            }
        });
        tab.setText(EducationTabType.Companion.copydefault(c54066wxO.OLrzqt().KWHzl(c54066wxO.OLrzqt().AYXKKw()).get(i)));
    }

    /* JADX INFO: renamed from: o.wxO$StateListAnimator */
    public static final class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ uOC copydefault;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(uOC uoc) {
            this.copydefault = uoc;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            java.lang.String strAYXKKw;
            java.lang.String strAYXKKw2;
            if (Intrinsics.EZpvd((java.lang.Object) C54066wxO.this.OLrzqt().AYXKKw(), (java.lang.Object) "auto_earn_and_staking")) {
                C54066wxO.this.getBinding();
                uOC uoc = this.copydefault;
                C54066wxO c54066wxO = C54066wxO.this;
                java.lang.Integer numValueOf = tab != null ? java.lang.Integer.valueOf(tab.getPosition()) : null;
                if (numValueOf != null && numValueOf.intValue() == 0) {
                    android.widget.TextView textView = uoc.AEQbTJ;
                    if (c54066wxO.OLrzqt().AhwBna()) {
                        strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.NRYds);
                    } else {
                        strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.setProfilesSinceInitCount);
                    }
                    textView.setText(strAYXKKw2);
                    return;
                }
                android.widget.TextView textView2 = uoc.AEQbTJ;
                if (c54066wxO.OLrzqt().AhwBna()) {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.NRYds);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.hPlhRW);
                }
                textView2.setText(strAYXKKw);
            }
        }
    }

    /* JADX INFO: renamed from: o.wxO$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C54066wxO copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C54066wxO c54066wxO) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c54066wxO;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.dismissAllowingStateLoss();
            }
        }
    }

    private final void AuCTel() {
        getChildFragmentManager().setFragmentResultListener("bot_dialog_dismiss", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.wxV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C54066wxO.copydefault(this.AEQbTJ, str, bundle);
            }
        });
        OLrzqt().EZpvd().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wxS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54066wxO.OLrzqt(this.KWHzl, (StrategyConfigInfo) obj);
            }
        }));
        OLrzqt().copydefault().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wxT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54066wxO.KWHzl(this.copydefault, (AutoEarnStakingQueryConfig) obj);
            }
        }));
    }

    public static final void copydefault(C54066wxO c54066wxO, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c54066wxO.dismissAllowingStateLoss();
    }

    public static final Unit OLrzqt(C54066wxO c54066wxO, StrategyConfigInfo strategyConfigInfo) {
        c54066wxO.OLrzqt().copydefault(new AutoVipProfitInfo((java.util.List) strategyConfigInfo.getAutoEarn(), (java.util.List) strategyConfigInfo.getAutoStaking(), strategyConfigInfo.getVipLevel(), false, false, 24, (DefaultConstructorMarker) null));
        c54066wxO.fIwbmz();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C54066wxO c54066wxO, AutoEarnStakingQueryConfig autoEarnStakingQueryConfig) {
        c54066wxO.OLrzqt().copydefault(new AutoVipProfitInfo((java.util.List) autoEarnStakingQueryConfig.getAutoEarn(), (java.util.List) autoEarnStakingQueryConfig.getAutoStaking(), autoEarnStakingQueryConfig.getVipLevel(), false, false, 24, (DefaultConstructorMarker) null));
        c54066wxO.fIwbmz();
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        uOC uocValues = values();
        TabLayout.OnTabSelectedListener onTabSelectedListener = this.djBIcL;
        if (onTabSelectedListener != null) {
            uocValues.OLrzqt.removeOnTabSelectedListener(onTabSelectedListener);
        }
        this.djBIcL = null;
        TabLayoutMediator tabLayoutMediator = this.gEmmrt;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.gEmmrt = null;
        super.onDestroyView();
    }
}

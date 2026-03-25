package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ViewKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnOrStakingProfitFragment$fetchApi$1;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.AutoEarnOrStakingProfitFragment$fetchApi$2;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.bean.AutoEarnOverView;
import com.okinc.tradingbot.impl.strategy.fragment.auto_earn.presenter.AutoEarnProfitPresenter;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.HomeStrategyFilterCoin;
import com.okinc.unify_trade.bot.data.TacticsData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C54066wxO;
import o.C54140wyj;
import o.C55688xof;
import o.vNB;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.wyb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C54132wyb extends AbstractC54141wyk<uMO, AutoEarnProfitPresenter> {
    public TabLayoutMediator AYXKKw;
    public TabLayout.OnTabSelectedListener AhwBna;
    public TabLayout.OnTabSelectedListener djBIcL;
    public final int gEmmrt = C48033uCm.Activity.zsXlph;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;
    public static final java.lang.String copydefault = "vip_mode";
    public static final java.lang.String OLrzqt = "infoData";
    public static final java.lang.String KWHzl = "simpleEarn";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.gEmmrt;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    /* JADX INFO: renamed from: o.wyb$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wyb.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final java.lang.String copydefault() {
            return C54132wyb.copydefault;
        }

        public final java.lang.String KWHzl() {
            return C54132wyb.OLrzqt;
        }

        public final java.lang.String EZpvd() {
            return C54132wyb.KWHzl;
        }

        public static /* synthetic */ void newInstance$default(TaskDescription taskDescription, androidx.fragment.app.FragmentManager fragmentManager, java.lang.String str, TacticsData tacticsData, boolean z, int i, java.lang.Object obj) {
            if ((i & 8) != 0) {
                z = false;
            }
            taskDescription.copydefault(fragmentManager, str, tacticsData, z);
        }

        public final void copydefault(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.lang.String str, @NotNull TacticsData tacticsData, boolean z) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(tacticsData, "");
            C54132wyb c54132wyb = new C54132wyb();
            TaskDescription taskDescription = C54132wyb.Companion;
            c54132wyb.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(taskDescription.copydefault(), str), C56390yDp.OLrzqt(taskDescription.KWHzl(), tacticsData), C56390yDp.OLrzqt(taskDescription.EZpvd(), java.lang.Boolean.valueOf(z))));
            c54132wyb.show(fragmentManager, TaskDescription.class.getSimpleName());
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(0);
        wxq.AEQbTJ().setVisibility(0);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        uzCIH();
        fIwbmz();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void uzCIH() {
        uMO umo = (uMO) values();
        umo.fJNWhG.setText(C33070mpX.AYXKKw(((AutoEarnProfitPresenter) OLrzqt()).AhwBna() ? C48033uCm.Fragment.ORmwhf : C48033uCm.Fragment.QfZsXX));
        umo.fIwbmz.setText(C33070mpX.AYXKKw(((AutoEarnProfitPresenter) OLrzqt()).AhwBna() ? C48033uCm.Fragment.IKQXqd : C48033uCm.Fragment.iLAtSv));
        fARcdN();
        ActionBar actionBar = new ActionBar();
        this.djBIcL = actionBar;
        umo.AYXKKw.addOnTabSelectedListener((TabLayout.BaseOnTabSelectedListener) actionBar);
    }

    /* JADX INFO: renamed from: o.wyb$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            AutoEarnProfitPresenter.StateListAnimator stateListAnimator;
            java.lang.String strKWHzl = (tab == null || tab.getPosition() != 0) ? "USDT" : ((AutoEarnProfitPresenter) C54132wyb.this.OLrzqt()).KWHzl();
            ((AutoEarnProfitPresenter) C54132wyb.this.OLrzqt()).AEQbTJ(strKWHzl != null ? strKWHzl : "USDT");
            vNB<AutoEarnProfitPresenter.StateListAnimator> value = ((AutoEarnProfitPresenter) C54132wyb.this.OLrzqt()).AYXKKw().getValue();
            vNB.TaskDescription taskDescription = value instanceof vNB.TaskDescription ? (vNB.TaskDescription) value : null;
            if (taskDescription == null || (stateListAnimator = (AutoEarnProfitPresenter.StateListAnimator) taskDescription.AEQbTJ()) == null) {
                return;
            }
            C54132wyb.this.OLrzqt(stateListAnimator);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fIwbmz() {
        ((AutoEarnProfitPresenter) OLrzqt()).AEQbTJ(AutoEarnProfitPresenter.Application.StateListAnimator.AEQbTJ);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new AutoEarnOrStakingProfitFragment$fetchApi$1(this, null), 3, null);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner2), null, null, new AutoEarnOrStakingProfitFragment$fetchApi$2(this, null), 3, null);
    }

    /* JADX INFO: renamed from: o.wyb$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ AutoEarnOverView AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C54132wyb KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C55312xha copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, AutoEarnOverView autoEarnOverView, C54132wyb c54132wyb, C55312xha c55312xha) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = autoEarnOverView;
            this.KWHzl = c54132wyb;
            this.copydefault = c55312xha;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.getCcy(), (java.lang.Object) ((AutoEarnProfitPresenter) this.KWHzl.OLrzqt()).KWHzl())) {
                    androidx.fragment.app.Fragment fragmentFindFragment = ViewKt.findFragment(this.copydefault);
                    C54140wyj.TaskDescription taskDescription = C54140wyj.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager = fragmentFindFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    taskDescription.AEQbTJ(childFragmentManager, this.AEQbTJ);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wyb$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ AutoEarnOverView AEQbTJ;
        public final /* synthetic */ C55312xha EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C54132wyb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, AutoEarnOverView autoEarnOverView, C54132wyb c54132wyb, C55312xha c55312xha) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = autoEarnOverView;
            this.copydefault = c54132wyb;
            this.EZpvd = c55312xha;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.wxO.ActionBar.newInstance$default(o.wxO$ActionBar, androidx.fragment.app.FragmentManager, java.lang.String, com.okinc.unify_trade.biz.AutoVipProfitInfo, com.okinc.unify_trade.bot.data.TacticsVipProfitData, boolean, int, int, java.lang.Object):void */
        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r14v13, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            AutoVipProfitInfo autoVipProfitInfo;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                if (Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ.getCcy(), (java.lang.Object) ((AutoEarnProfitPresenter) this.copydefault.OLrzqt()).KWHzl())) {
                    androidx.fragment.app.Fragment fragmentFindFragment = ViewKt.findFragment(this.EZpvd);
                    if (C33129mqd.AEQbTJ(this.AEQbTJ.getMatchedSimpleEarnAmount(), "0") || C33129mqd.AEQbTJ(this.AEQbTJ.getSimpleEarnAmount(), "0")) {
                        C54140wyj.TaskDescription taskDescription = C54140wyj.Companion;
                        androidx.fragment.app.FragmentManager childFragmentManager = fragmentFindFragment.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        taskDescription.AEQbTJ(childFragmentManager, this.AEQbTJ);
                        return;
                    }
                    C54066wxO.ActionBar actionBar = C54066wxO.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager2 = fragmentFindFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "");
                    TacticsData tacticsDataValueOf = ((AutoEarnProfitPresenter) this.copydefault.OLrzqt()).valueOf();
                    if (tacticsDataValueOf == null || (autoVipProfitInfo = tacticsDataValueOf.getAutoVipProfitInfo()) == null) {
                        autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
                    }
                    actionBar.AEQbTJ(childFragmentManager2, "auto_education_single_earn", (56 & 4) != 0 ? null : autoVipProfitInfo, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.wyb$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C54132wyb AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ uMO KWHzl;
        public final /* synthetic */ AutoEarnProfitPresenter.TaskDescription OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C54132wyb c54132wyb, AutoEarnProfitPresenter.TaskDescription taskDescription, uMO umo) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c54132wyb;
            this.OLrzqt = taskDescription;
            this.KWHzl = umo;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                java.lang.String strKWHzl = ((AutoEarnProfitPresenter) this.AEQbTJ.OLrzqt()).KWHzl();
                if (strKWHzl == null && (strKWHzl = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(this.OLrzqt.copydefault())) == null) {
                    strKWHzl = "";
                }
                java.util.List<HomeStrategyFilterCoin> listCopydefault = ((AutoEarnProfitPresenter) this.AEQbTJ.OLrzqt()).copydefault(this.OLrzqt.copydefault(), C56402yEa.EZpvd(strKWHzl));
                if (listCopydefault == null) {
                    return;
                }
                C51550vpD c51550vpDOLrzqt = C51550vpD.Companion.OLrzqt(listCopydefault, this.AEQbTJ.new Dialog(this.KWHzl));
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                C49662usl.EZpvd(c51550vpDOLrzqt, childFragmentManager, "CoinFilterSearchFragment");
            }
        }
    }

    /* JADX INFO: renamed from: o.wyb$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C55312xha KWHzl;
        public final /* synthetic */ AutoEarnOverView OLrzqt;
        public final /* synthetic */ C54132wyb copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, AutoEarnOverView autoEarnOverView, C54132wyb c54132wyb, C55312xha c55312xha) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = autoEarnOverView;
            this.copydefault = c54132wyb;
            this.KWHzl = c55312xha;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r11v13, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            AutoVipProfitInfo autoVipProfitInfo;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (Intrinsics.EZpvd((java.lang.Object) this.OLrzqt.getCcy(), (java.lang.Object) ((AutoEarnProfitPresenter) this.copydefault.OLrzqt()).KWHzl())) {
                    androidx.fragment.app.Fragment fragmentFindFragment = ViewKt.findFragment(this.KWHzl);
                    C54066wxO.ActionBar actionBar = C54066wxO.Companion;
                    androidx.fragment.app.FragmentManager childFragmentManager = fragmentFindFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    TacticsData tacticsDataValueOf = ((AutoEarnProfitPresenter) this.copydefault.OLrzqt()).valueOf();
                    if (tacticsDataValueOf == null || (autoVipProfitInfo = tacticsDataValueOf.getAutoVipProfitInfo()) == null) {
                        autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
                    }
                    actionBar.AEQbTJ(childFragmentManager, "auto_education_single_staking", (56 & 4) != 0 ? null : autoVipProfitInfo, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v29, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v32, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf(final AutoEarnProfitPresenter.TaskDescription taskDescription) {
        uMO umo = (uMO) values();
        if (taskDescription.KWHzl().size() == 2) {
            ConstraintLayout constraintLayout = umo.copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            C55249xgQ c55249xgQ = umo.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
            c55249xgQ.setVisibility(0);
            ((uMO) values()).getNewProxyInstance.setAdapter(new Fragment(this, taskDescription));
            ((uMO) values()).getNewProxyInstance.setUserInputEnabled(false);
            ((uMO) values()).getNewProxyInstance.setOffscreenPageLimit(2);
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(umo.gEmmrt, ((uMO) values()).getNewProxyInstance, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.wxZ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C54132wyb.AEQbTJ(taskDescription, tab, i);
                }
            });
            tabLayoutMediator.attach();
            this.AYXKKw = tabLayoutMediator;
            ((uMO) values()).getNewProxyInstance.registerOnPageChangeCallback(new LoaderManager(taskDescription));
            ((uMO) values()).getNewProxyInstance.setVisibility(0);
        } else if (taskDescription.KWHzl().size() > 2) {
            ConstraintLayout constraintLayout2 = umo.copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            C55249xgQ c55249xgQ2 = umo.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
            c55249xgQ2.setVisibility(8);
            AppCompatTextView appCompatTextView = umo.KWHzl;
            java.lang.String strKWHzl = ((AutoEarnProfitPresenter) OLrzqt()).KWHzl();
            appCompatTextView.setText(strKWHzl != null ? strKWHzl : "");
            ConstraintLayout constraintLayout3 = ((uMO) values()).copydefault;
            constraintLayout3.setOnClickListener(new FragmentManager(constraintLayout3, 1000L, this, taskDescription, umo));
            AEQbTJ(taskDescription);
        } else {
            ConstraintLayout constraintLayout4 = umo.copydefault;
            Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
            constraintLayout4.setVisibility(8);
            C55249xgQ c55249xgQ3 = umo.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ3, "");
            c55249xgQ3.setVisibility(8);
            AEQbTJ(taskDescription);
        }
        if (!((AutoEarnProfitPresenter) OLrzqt()).AhwBna()) {
            C55249xgQ c55249xgQ4 = umo.AYXKKw;
            TabLayout.Tab tabNewTab = c55249xgQ4.newTab();
            tabNewTab.setIcon(C52761wXj.TaskDescription.Srftgn);
            c55249xgQ4.addTab(tabNewTab);
            TabLayout.Tab tabNewTab2 = c55249xgQ4.newTab();
            tabNewTab2.setIcon(C52761wXj.TaskDescription.zCTncp);
            c55249xgQ4.addTab(tabNewTab2);
        }
        KWHzl(taskDescription);
    }

    /* JADX INFO: renamed from: o.wyb$Fragment */
    public static final class Fragment extends FragmentStateAdapter {
        public final /* synthetic */ AutoEarnProfitPresenter.TaskDescription AEQbTJ;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fragment(C54132wyb c54132wyb, AutoEarnProfitPresenter.TaskDescription taskDescription) {
            super(c54132wyb);
            this.AEQbTJ = taskDescription;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return C54136wyf.Companion.OLrzqt(this.AEQbTJ.KWHzl().get(i).getCcy());
        }
    }

    public static final void AEQbTJ(AutoEarnProfitPresenter.TaskDescription taskDescription, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(taskDescription.KWHzl().get(i).getCcy());
    }

    /* JADX INFO: renamed from: o.wyb$LoaderManager */
    public static final class LoaderManager extends ViewPager2.OnPageChangeCallback {
        public final /* synthetic */ AutoEarnProfitPresenter.TaskDescription copydefault;

        public LoaderManager(AutoEarnProfitPresenter.TaskDescription taskDescription) {
            this.copydefault = taskDescription;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            ((AutoEarnProfitPresenter) C54132wyb.this.OLrzqt()).EZpvd(this.copydefault.KWHzl().get(i).getCcy());
            ((AutoEarnProfitPresenter) C54132wyb.this.OLrzqt()).AEQbTJ(new AutoEarnProfitPresenter.Application.C0671Application(this.copydefault.KWHzl().get(i).getCcy()));
            AutoEarnProfitPresenter.TaskDescription taskDescriptionOLrzqt = ((AutoEarnProfitPresenter) C54132wyb.this.OLrzqt()).OLrzqt();
            if (taskDescriptionOLrzqt != null) {
                C54132wyb.this.KWHzl(taskDescriptionOLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.wyb$Dialog */
    public static final class Dialog implements Function1<HomeStrategyFilterCoin, Unit> {
        public final /* synthetic */ uMO OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(uMO umo) {
            this.OLrzqt = umo;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(HomeStrategyFilterCoin homeStrategyFilterCoin) {
            copydefault(homeStrategyFilterCoin);
            return Unit.INSTANCE;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
        /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: Presenter */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public final void copydefault(HomeStrategyFilterCoin homeStrategyFilterCoin) {
            TabLayout.Tab tabAt;
            Intrinsics.checkNotNullParameter(homeStrategyFilterCoin, "");
            if (!((AutoEarnProfitPresenter) C54132wyb.this.OLrzqt()).AhwBna()) {
                uMO umo = this.OLrzqt;
                C55249xgQ c55249xgQ = umo.AYXKKw;
                C54132wyb c54132wyb = C54132wyb.this;
                if (c55249xgQ.getTabCount() != 0 && (tabAt = umo.AYXKKw.getTabAt(0)) != null) {
                    tabAt.setIcon(C52761wXj.TaskDescription.Srftgn);
                }
                c55249xgQ.selectTab(c55249xgQ.getTabAt(Intrinsics.EZpvd((java.lang.Object) ((AutoEarnProfitPresenter) c54132wyb.OLrzqt()).KWHzl(), (java.lang.Object) "USDT") ? 1 : 0));
            }
            C54132wyb.this.EZpvd(homeStrategyFilterCoin);
            AutoEarnProfitPresenter.TaskDescription taskDescriptionOLrzqt = ((AutoEarnProfitPresenter) C54132wyb.this.OLrzqt()).OLrzqt();
            if (taskDescriptionOLrzqt != null) {
                C54132wyb.this.KWHzl(taskDescriptionOLrzqt);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v18, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(AutoEarnProfitPresenter.TaskDescription taskDescription) {
        java.lang.Object next;
        java.lang.String strAYXKKw;
        java.lang.String strAYXKKw2;
        if (taskDescription.KWHzl().isEmpty()) {
            OKReminder oKReminder = ((uMO) values()).iwGUEr;
            Intrinsics.checkNotNullExpressionValue(oKReminder, "");
            oKReminder.setVisibility(8);
        }
        java.util.Iterator<T> it = taskDescription.KWHzl().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((AutoEarnProfitPresenter) OLrzqt()).KWHzl(), (java.lang.Object) ((AutoEarnOverView) next).getCcy())) {
                    break;
                }
            }
        }
        AutoEarnOverView autoEarnOverView = (AutoEarnOverView) next;
        if (autoEarnOverView != null) {
            if (Intrinsics.EZpvd((java.lang.Object) autoEarnOverView.getStatus(), (java.lang.Object) "vip_dropout")) {
                if (((AutoEarnProfitPresenter) OLrzqt()).AhwBna()) {
                    strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.fDu);
                } else {
                    strAYXKKw2 = C33070mpX.AYXKKw(C48033uCm.Fragment.DjwCMv);
                }
                OKReminder oKReminder2 = ((uMO) values()).iwGUEr;
                oKReminder2.setStyle(2);
                oKReminder2.setMessage((java.lang.CharSequence) (strAYXKKw2 instanceof java.lang.CharSequence ? strAYXKKw2 : null));
                oKReminder2.setCloseIconVisibility(false);
                Intrinsics.copydefault(oKReminder2);
                oKReminder2.setVisibility(0);
                Intrinsics.copydefault(oKReminder2);
                return;
            }
            if (Intrinsics.EZpvd((java.lang.Object) autoEarnOverView.getStatus(), (java.lang.Object) "stopped")) {
                if (((AutoEarnProfitPresenter) OLrzqt()).AhwBna()) {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.fAklCm);
                } else {
                    strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.hwkNQP);
                }
                OKReminder oKReminder3 = ((uMO) values()).iwGUEr;
                oKReminder3.setStyle(2);
                oKReminder3.setMessage((java.lang.CharSequence) (strAYXKKw instanceof java.lang.CharSequence ? strAYXKKw : null));
                oKReminder3.setCloseIconVisibility(false);
                Intrinsics.copydefault(oKReminder3);
                oKReminder3.setVisibility(0);
                Intrinsics.copydefault(oKReminder3);
                return;
            }
            OKReminder oKReminder4 = ((uMO) values()).iwGUEr;
            Intrinsics.checkNotNullExpressionValue(oKReminder4, "");
            oKReminder4.setVisibility(8);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(AutoEarnProfitPresenter.TaskDescription taskDescription) {
        uMO umo = (uMO) values();
        if (((AutoEarnProfitPresenter) OLrzqt()).AhwBna()) {
            android.widget.LinearLayout linearLayout = umo.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            OLrzqt(taskDescription);
        } else {
            android.widget.LinearLayout linearLayout2 = umo.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
            linearLayout2.setVisibility(8);
            copydefault(taskDescription);
        }
        EZpvd(taskDescription);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(AutoEarnProfitPresenter.TaskDescription taskDescription) {
        ((uMO) values()).DbNXlk.setText("--");
        if (taskDescription.KWHzl().isEmpty()) {
            android.widget.LinearLayout linearLayout = ((uMO) values()).AkhnZx;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            android.widget.TextView textView = ((uMO) values()).ejfBZ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            ((uMO) values()).DbNXlk.setText("--");
            C55312xha c55312xhaValueOf = ((uMO) values()).AuCTel.valueOf();
            if (c55312xhaValueOf != null) {
                c55312xhaValueOf.copydefault();
                C55320xhi c55320xhiKWHzl = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl != null) {
                    c55320xhiKWHzl.setText("--");
                }
            }
        }
        for (AutoEarnOverView autoEarnOverView : taskDescription.KWHzl()) {
            if (Intrinsics.EZpvd((java.lang.Object) autoEarnOverView.getCcy(), (java.lang.Object) ((AutoEarnProfitPresenter) OLrzqt()).KWHzl())) {
                if (Intrinsics.EZpvd((java.lang.Object) autoEarnOverView.getStatus(), (java.lang.Object) "earning")) {
                    android.widget.TextView textView2 = ((uMO) values()).ejfBZ;
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setVisibility(0);
                    ((uMO) values()).ejfBZ.setText(C33070mpX.AYXKKw(C55688xof.Application.MediaDescriptionCompat));
                    ((uMO) values()).DbNXlk.setText(C56068xvo.copydefault.EZpvd(xMR.formatPercent$default(xMR.copydefault, autoEarnOverView.getApr(), 0, RoundingMode.DOWN, 2, null)));
                    android.widget.TextView textView3 = ((uMO) values()).DbNXlk;
                    C49962uyT c49962uyT = C49962uyT.AEQbTJ;
                    android.content.Context context = ((uMO) values()).DbNXlk.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textView3.setTextColor(C49962uyT.getDefaultProfitLossColor$default(c49962uyT, context, true, 0.0f, 4, null));
                    C55312xha c55312xhaValueOf2 = ((uMO) values()).AuCTel.valueOf();
                    if (c55312xhaValueOf2 != null) {
                        if (autoEarnOverView.isFullQuota()) {
                            c55312xhaValueOf2.OLrzqt();
                            c55312xhaValueOf2.setOnClickListener(new StateListAnimator(c55312xhaValueOf2, 1000L, autoEarnOverView, this, c55312xhaValueOf2));
                        } else {
                            c55312xhaValueOf2.copydefault();
                        }
                        C55320xhi c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl();
                        if (c55320xhiKWHzl2 != null) {
                            c55320xhiKWHzl2.setText(C56033xvF.fmtBotValueBySymbol$default(autoEarnOverView.getCcy(), autoEarnOverView.getAutoLendAmount(), RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null));
                        }
                    }
                } else {
                    android.widget.LinearLayout linearLayout2 = ((uMO) values()).AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                    android.widget.TextView textView4 = ((uMO) values()).ejfBZ;
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    textView4.setVisibility(8);
                    ((uMO) values()).DbNXlk.setText("--");
                    C55312xha c55312xhaValueOf3 = ((uMO) values()).AuCTel.valueOf();
                    if (c55312xhaValueOf3 != null) {
                        c55312xhaValueOf3.copydefault();
                        C55320xhi c55320xhiKWHzl3 = c55312xhaValueOf3.KWHzl();
                        if (c55320xhiKWHzl3 != null) {
                            c55320xhiKWHzl3.setText("--");
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.lang.String str) {
        uMO umo = (uMO) values();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "BTC")) {
            umo.AhwBna.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPOZOJIj));
            umo.djBIcL.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.QOjuYg));
            umo.EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPRGtXKCRGtXKC));
        } else {
            umo.AhwBna.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPOKBmQNaCIdOM));
            umo.djBIcL.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.QsIRgs));
            umo.EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.RSmiaq));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(AutoEarnProfitPresenter.TaskDescription taskDescription) {
        ((uMO) values()).fetchVPNInfo.setText("--");
        if (taskDescription.KWHzl().isEmpty()) {
            android.widget.LinearLayout linearLayout = ((uMO) values()).AkhnZx;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(8);
            android.widget.TextView textView = ((uMO) values()).ejfBZ;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            ((uMO) values()).DbNXlk.setText("--");
            ((uMO) values()).values.setText("--");
            C55312xha c55312xhaValueOf = ((uMO) values()).fARcdN.valueOf();
            if (c55312xhaValueOf != null) {
                c55312xhaValueOf.copydefault();
                C55320xhi c55320xhiKWHzl = c55312xhaValueOf.KWHzl();
                if (c55320xhiKWHzl != null) {
                    c55320xhiKWHzl.setText("--");
                }
            }
        }
        for (AutoEarnOverView autoEarnOverView : taskDescription.KWHzl()) {
            if (Intrinsics.EZpvd((java.lang.Object) autoEarnOverView.getCcy(), (java.lang.Object) ((AutoEarnProfitPresenter) OLrzqt()).KWHzl())) {
                OLrzqt(autoEarnOverView.getCcy());
                if (Intrinsics.EZpvd((java.lang.Object) autoEarnOverView.getStatus(), (java.lang.Object) "earning")) {
                    ((uMO) values()).ejfBZ.setText(C33070mpX.AYXKKw(C55688xof.Application.getQueueTitle));
                    ((uMO) values()).fetchVPNInfo.setText(C56068xvo.copydefault.EZpvd(xMR.formatPercent$default(xMR.copydefault, autoEarnOverView.getApr(), 0, RoundingMode.DOWN, 2, null)));
                    android.widget.TextView textView2 = ((uMO) values()).fetchVPNInfo;
                    C49962uyT c49962uyT = C49962uyT.AEQbTJ;
                    android.content.Context context = ((uMO) values()).fetchVPNInfo.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    textView2.setTextColor(C49962uyT.getDefaultProfitLossColor$default(c49962uyT, context, true, 0.0f, 4, null));
                    C55312xha c55312xhaValueOf2 = ((uMO) values()).values.valueOf();
                    if (c55312xhaValueOf2 != null) {
                        if ((C33129mqd.AEQbTJ(autoEarnOverView.getMatchedSimpleEarnAmount(), "0") && C33129mqd.AEQbTJ(autoEarnOverView.getMatchedAmount(), "0")) || (C33129mqd.AEQbTJ(autoEarnOverView.getSimpleEarnAmount(), "0") && C33129mqd.AEQbTJ(autoEarnOverView.getAutoLendAmount(), "0"))) {
                            c55312xhaValueOf2.OLrzqt();
                            c55312xhaValueOf2.setOnClickListener(new Activity(c55312xhaValueOf2, 1000L, autoEarnOverView, this, c55312xhaValueOf2));
                        } else {
                            c55312xhaValueOf2.copydefault();
                        }
                        C55320xhi c55320xhiKWHzl2 = c55312xhaValueOf2.KWHzl();
                        if (c55320xhiKWHzl2 != null) {
                            c55320xhiKWHzl2.setText(C56033xvF.fmtBotValueBySymbol$default(autoEarnOverView.getCcy(), C33129mqd.addS$default(autoEarnOverView.getMatchedAmount(), autoEarnOverView.getMatchedSimpleEarnAmount(), null, null, null, 14, null), RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null));
                        }
                    }
                    C55312xha c55312xhaValueOf3 = ((uMO) values()).fARcdN.valueOf();
                    if (c55312xhaValueOf3 != null) {
                        if (autoEarnOverView.isFullQuota() || ((C33129mqd.AEQbTJ(autoEarnOverView.getMatchedSimpleEarnAmount(), "0") && C33129mqd.AEQbTJ(autoEarnOverView.getMatchedAmount(), "0")) || (C33129mqd.AEQbTJ(autoEarnOverView.getSimpleEarnAmount(), "0") && C33129mqd.AEQbTJ(autoEarnOverView.getAutoLendAmount(), "0")))) {
                            c55312xhaValueOf3.OLrzqt();
                            c55312xhaValueOf3.setOnClickListener(new Application(c55312xhaValueOf3, 1000L, autoEarnOverView, this, c55312xhaValueOf3));
                        } else {
                            c55312xhaValueOf3.copydefault();
                        }
                        C55320xhi c55320xhiKWHzl3 = c55312xhaValueOf3.KWHzl();
                        if (c55320xhiKWHzl3 != null) {
                            c55320xhiKWHzl3.setText(C56033xvF.fmtBotValueBySymbol$default(autoEarnOverView.getCcy(), C33129mqd.addS$default(autoEarnOverView.getAutoLendAmount(), autoEarnOverView.getSimpleEarnAmount(), null, null, null, 14, null), RoundingMode.UP, true, null, false, null, null, null, null, null, 2032, null));
                        }
                    }
                } else {
                    android.widget.LinearLayout linearLayout2 = ((uMO) values()).AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "");
                    linearLayout2.setVisibility(8);
                    android.widget.TextView textView3 = ((uMO) values()).ejfBZ;
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    textView3.setVisibility(8);
                    ((uMO) values()).DbNXlk.setText("--");
                    ((uMO) values()).values.setText("--");
                    C55312xha c55312xhaValueOf4 = ((uMO) values()).fARcdN.valueOf();
                    if (c55312xhaValueOf4 != null) {
                        c55312xhaValueOf4.copydefault();
                        C55320xhi c55320xhiKWHzl4 = c55312xhaValueOf4.KWHzl();
                        if (c55320xhiKWHzl4 != null) {
                            c55320xhiKWHzl4.setText("--");
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(HomeStrategyFilterCoin homeStrategyFilterCoin) {
        TabLayout.Tab tabAt;
        uMO umo = (uMO) values();
        ((AutoEarnProfitPresenter) OLrzqt()).EZpvd(homeStrategyFilterCoin.getShowCoinName());
        AutoEarnProfitPresenter autoEarnProfitPresenter = (AutoEarnProfitPresenter) OLrzqt();
        java.lang.String showCoinName = homeStrategyFilterCoin.getShowCoinName();
        if (showCoinName == null) {
            showCoinName = "USDT";
        }
        autoEarnProfitPresenter.AEQbTJ(new AutoEarnProfitPresenter.Application.C0671Application(showCoinName));
        ConstraintLayout constraintLayout = umo.copydefault;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        if (constraintLayout.getVisibility() == 0) {
            umo.KWHzl.setText(homeStrategyFilterCoin.getShowCoinName());
        }
        C55249xgQ c55249xgQ = umo.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
        if (c55249xgQ.getVisibility() != 0 || (tabAt = umo.AYXKKw.getTabAt(0)) == null) {
            return;
        }
        tabAt.setIcon(C52761wXj.TaskDescription.Srftgn);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.uyT.getDefaultProfitLossColor$default(o.uyT, android.content.Context, boolean, float, int, java.lang.Object):int */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v21, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(AutoEarnProfitPresenter.StateListAnimator stateListAnimator) {
        java.lang.String strOLrzqt;
        uMO umo = (uMO) values();
        fARcdN();
        android.widget.TextView textView = umo.getFieldNames;
        if (((AutoEarnProfitPresenter) OLrzqt()).AhwBna()) {
            C55249xgQ c55249xgQ = umo.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
            c55249xgQ.setVisibility(8);
            if (!stateListAnimator.EZpvd().isEmpty()) {
                android.widget.TextView textView2 = umo.getFieldNames;
                C49962uyT c49962uyT = C49962uyT.AEQbTJ;
                android.content.Context context = textView2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                textView2.setTextColor(C49962uyT.getDefaultProfitLossColor$default(c49962uyT, context, true, 0.0f, 4, null));
            }
            strOLrzqt = C33129mqd.OLrzqt((java.lang.Object) "");
            for (java.lang.String strSubstring : stateListAnimator.EZpvd()) {
                if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) C33129mqd.OLrzqt((java.lang.Object) ""))) {
                    strOLrzqt = pTF.KWHzl.AEQbTJ(strSubstring);
                } else {
                    if (C59449zhJ.startsWith$default(strOLrzqt, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
                        strOLrzqt = strOLrzqt.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                    }
                    if (C59449zhJ.startsWith$default(strSubstring, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
                        strSubstring = strSubstring.substring(1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                    }
                    strOLrzqt = pTF.KWHzl.AEQbTJ(((java.lang.Object) strOLrzqt) + " + " + strSubstring);
                }
            }
            if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) C33129mqd.OLrzqt((java.lang.Object) ""))) {
                java.lang.String strKWHzl = ((AutoEarnProfitPresenter) OLrzqt()).KWHzl();
                strOLrzqt = C56033xvF.fmtBotValueBySymbol$default(strKWHzl == null ? "" : strKWHzl, "0", RoundingMode.DOWN, true, null, false, null, null, null, null, DisplaySign.EXCEPT_ZERO, 1008, null);
            }
        } else {
            C55249xgQ c55249xgQ2 = umo.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
            c55249xgQ2.setVisibility(0);
            if (!stateListAnimator.AEQbTJ().isEmpty()) {
                android.widget.TextView textView3 = umo.getFieldNames;
                C49962uyT c49962uyT2 = C49962uyT.AEQbTJ;
                android.content.Context context2 = textView3.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "");
                textView3.setTextColor(C49962uyT.getDefaultProfitLossColor$default(c49962uyT2, context2, true, 0.0f, 4, null));
            }
            strOLrzqt = C33129mqd.OLrzqt((java.lang.Object) "");
            if (C33129mqd.OLrzqt((java.lang.CharSequence) ((AutoEarnProfitPresenter) OLrzqt()).EZpvd()) && Intrinsics.EZpvd((java.lang.Object) ((AutoEarnProfitPresenter) OLrzqt()).EZpvd(), (java.lang.Object) "USDT")) {
                strOLrzqt = stateListAnimator.copydefault();
            } else {
                for (java.lang.String strSubstring2 : stateListAnimator.AEQbTJ()) {
                    if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) C33129mqd.OLrzqt((java.lang.Object) ""))) {
                        strOLrzqt = pTF.KWHzl.AEQbTJ(C33129mqd.gEmmrt(strSubstring2));
                    } else {
                        if (C59449zhJ.startsWith$default(strOLrzqt, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
                            strOLrzqt = strOLrzqt.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strOLrzqt, "");
                        }
                        if (C59449zhJ.startsWith$default(strSubstring2, Marker.ANY_NON_NULL_MARKER, false, 2, null)) {
                            strSubstring2 = strSubstring2.substring(1);
                            Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                        }
                        strOLrzqt = pTF.KWHzl.AEQbTJ(((java.lang.Object) strOLrzqt) + " + " + strSubstring2);
                    }
                }
            }
            if (Intrinsics.EZpvd((java.lang.Object) strOLrzqt, (java.lang.Object) C33129mqd.OLrzqt((java.lang.Object) ""))) {
                java.lang.String strKWHzl2 = ((AutoEarnProfitPresenter) OLrzqt()).KWHzl();
                strOLrzqt = C56033xvF.fmtBotValueBySymbol$default(strKWHzl2 == null ? "" : strKWHzl2, "0", RoundingMode.DOWN, true, null, false, null, null, null, null, DisplaySign.EXCEPT_ZERO, 1008, null);
            }
        }
        textView.setText(strOLrzqt);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fARcdN() {
        uMO umo = (uMO) values();
        if (((AutoEarnProfitPresenter) OLrzqt()).AhwBna()) {
            java.lang.String strKWHzl = ((AutoEarnProfitPresenter) OLrzqt()).KWHzl();
            if (strKWHzl == null) {
                strKWHzl = "";
            }
            OLrzqt(strKWHzl);
            android.widget.TextView textView = umo.valueOf;
            int i = C48033uCm.Fragment.itxZVF;
            java.lang.String strKWHzl2 = ((AutoEarnProfitPresenter) OLrzqt()).KWHzl();
            textView.setText(C33069mpW.copydefault(i, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strKWHzl2 != null ? strKWHzl2 : ""))));
            return;
        }
        umo.EZpvd.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.sZqaRl));
        android.widget.TextView textView2 = umo.valueOf;
        int i2 = C48033uCm.Fragment.HJWChPOKBmQN;
        java.lang.String strKWHzl3 = ((AutoEarnProfitPresenter) OLrzqt()).KWHzl();
        textView2.setText(C33069mpW.copydefault(i2, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strKWHzl3 != null ? strKWHzl3 : ""))));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        TabLayout.OnTabSelectedListener onTabSelectedListener = this.AhwBna;
        if (onTabSelectedListener != null) {
            ((uMO) values()).gEmmrt.removeOnTabSelectedListener(onTabSelectedListener);
        }
        this.AhwBna = null;
        TabLayout.OnTabSelectedListener onTabSelectedListener2 = this.djBIcL;
        if (onTabSelectedListener2 != null) {
            ((uMO) values()).AYXKKw.removeOnTabSelectedListener(onTabSelectedListener2);
        }
        this.djBIcL = null;
        this.AYXKKw = null;
        super.onDestroyView();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(AutoEarnProfitPresenter.TaskDescription taskDescription) {
        java.lang.String strKWHzl = ((AutoEarnProfitPresenter) OLrzqt()).KWHzl();
        if (strKWHzl == null) {
            AutoEarnOverView autoEarnOverView = (AutoEarnOverView) CollectionsKt___CollectionsKt.firstOrNull(taskDescription.KWHzl());
            strKWHzl = autoEarnOverView != null ? autoEarnOverView.getCcy() : null;
            if (strKWHzl == null) {
                strKWHzl = "USDT";
            }
        }
        ((uMO) values()).getNewProxyInstance.setAdapter(new PendingIntent(this, strKWHzl));
        ((uMO) values()).getNewProxyInstance.setUserInputEnabled(false);
        ((uMO) values()).getNewProxyInstance.setVisibility(0);
    }

    /* JADX INFO: renamed from: o.wyb$PendingIntent */
    public static final class PendingIntent extends FragmentStateAdapter {
        public final /* synthetic */ java.lang.String OLrzqt;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PendingIntent(C54132wyb c54132wyb, java.lang.String str) {
            super(c54132wyb);
            this.OLrzqt = str;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return C54136wyf.Companion.OLrzqt(this.OLrzqt);
        }
    }
}

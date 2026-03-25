package o;

import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.market.features.address_tracker_sa.ui.AddressTrackerFragment$reportLeaderBoardView$1;
import com.okinc.core.util.SPUtils;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import o.C23274hvD;
import o.C52761wXj;
import o.jEV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jCg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25677jCg extends AbstractC25684jCn<C21664hHt> {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.jCf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C25677jCg.AYXKKw(this.KWHzl);
        }
    });
    public final TaskDescription KWHzl = new TaskDescription();
    public boolean copydefault;
    public TabLayoutMediator valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C23274hvD.Activity.seuMaA;
    }

    /* JADX INFO: renamed from: o.jCg$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jCg.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C25677jCg copydefault(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C25677jCg c25677jCg = new C25677jCg();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("key.page_from", str);
            bundle.putBoolean("isSingleActivity", z);
            c25677jCg.setArguments(bundle);
            return c25677jCg;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Landroid/view/View;)Landroidx/viewbinding/ViewBinding; */
    @Override // o.AbstractC7000aZw
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C21664hHt AEQbTJ(@NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        C21664hHt c21664hHtEZpvd = C21664hHt.EZpvd(view);
        Intrinsics.checkNotNullExpressionValue(c21664hHtEZpvd, "");
        return c21664hHtEZpvd;
    }

    /* JADX DEBUG: Possible override for method o.jCn.EZpvd()V */
    public final C25679jCi EZpvd() {
        return (C25679jCi) this.AEQbTJ.getValue();
    }

    public static final C25679jCi AYXKKw(C25677jCg c25677jCg) {
        return new C25679jCi("", c25677jCg);
    }

    /* JADX INFO: renamed from: o.jCg$TaskDescription */
    public static final class TaskDescription extends ViewPager2.OnPageChangeCallback {
        public TaskDescription() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            C25677jCg.this.copydefault(i);
            if (i == 0) {
                C25677jCg.this.AYXKKw();
            } else {
                if (i != 1) {
                    return;
                }
                C25677jCg.this.valueOf();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String isConnected() {
        java.lang.String string;
        android.os.Bundle arguments = getArguments();
        return (arguments == null || (string = arguments.getString("key.page_from")) == null) ? "unknown" : string;
    }

    public final int OLrzqt() {
        java.lang.Object objM7377constructorimpl;
        android.content.Intent intent;
        android.content.Intent intent2;
        try {
            Result.Application application = Result.Companion;
            FragmentActivity activity = getActivity();
            int intExtra = (activity == null || (intent2 = activity.getIntent()) == null) ? -1 : intent2.getIntExtra("param_tracker_tab_position", -1);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null && (intent = activity2.getIntent()) != null) {
                intent.removeExtra("param_tracker_tab_position");
            }
            objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(intExtra));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = null;
        }
        java.lang.Integer num = (java.lang.Integer) objM7377constructorimpl;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    @Override // o.AbstractC7000aZw, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        view.post(new java.lang.Runnable() { // from class: o.jCe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C25677jCg.AhwBna(this.EZpvd);
            }
        });
    }

    public static final void AhwBna(C25677jCg c25677jCg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c25677jCg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        ViewPager2 viewPager2;
        super.onResume();
        if (this.copydefault) {
            try {
                Result.Application application = Result.Companion;
                java.lang.Integer numValueOf = java.lang.Integer.valueOf(OLrzqt());
                if (numValueOf.intValue() == -1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    final int iIntValue = numValueOf.intValue();
                    C21664hHt c21664hHt = (C21664hHt) AEQbTJ();
                    if (c21664hHt != null && (viewPager2 = c21664hHt.gEmmrt) != null) {
                        viewPager2.post(new java.lang.Runnable() { // from class: o.jCl
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // java.lang.Runnable
                            public final void run() {
                                C25677jCg.copydefault(this.OLrzqt, iIntValue);
                            }
                        });
                    }
                }
                Result.m7377constructorimpl(Unit.INSTANCE);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(C25677jCg c25677jCg, int i) {
        ViewPager2 viewPager2;
        C21664hHt c21664hHt = (C21664hHt) c25677jCg.AEQbTJ();
        if (c21664hHt == null || (viewPager2 = c21664hHt.gEmmrt) == null) {
            return;
        }
        viewPager2.setCurrentItem(i, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AuCTel() {
        C21664hHt c21664hHt = (C21664hHt) AEQbTJ();
        if (c21664hHt != null) {
            android.os.Bundle arguments = getArguments();
            boolean z = arguments != null ? arguments.getBoolean("isSingleActivity") : false;
            C57597ylS c57597ylS = c21664hHt.copydefault;
            Intrinsics.checkNotNullExpressionValue(c57597ylS, "");
            c57597ylS.setVisibility(z ? 0 : 8);
            android.widget.LinearLayout linearLayout = c21664hHt.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(linearLayout, "");
            linearLayout.setVisibility(z ^ true ? 0 : 8);
            if (!z) {
                c21664hHt.getRoot().setPaddingRelative(0, C33570myu.AEQbTJ(requireContext()), 0, 0);
                android.widget.ImageView imageView = c21664hHt.KWHzl;
                imageView.setOnClickListener(new Activity(imageView, 1000L, this));
            }
            c21664hHt.gEmmrt.setAdapter(EZpvd());
            c21664hHt.copydefault.getTitle().setContentDescription("web3_dex_market_tracker_appbar_title_view");
            c21664hHt.gEmmrt.registerOnPageChangeCallback(this.KWHzl);
            c21664hHt.copydefault.getDoImage().setContentDescription("web3_dex_market_tracker_following_top_bar_btn");
            android.widget.ImageView doImage = c21664hHt.copydefault.getDoImage();
            doImage.setOnClickListener(new FragmentManager(doImage, 1000L, this));
            TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(c21664hHt.EZpvd.copydefault(), c21664hHt.gEmmrt, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.jCj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    C25677jCg.copydefault(this.AEQbTJ, tab, i);
                }
            });
            tabLayoutMediator.attach();
            this.valueOf = tabLayoutMediator;
            int iOLrzqt = OLrzqt();
            if (iOLrzqt < 0) {
                iOLrzqt = fJNWhG();
            }
            if (iOLrzqt < 2) {
                c21664hHt.gEmmrt.setCurrentItem(iOLrzqt, false);
            }
            c21664hHt.EZpvd.copydefault().addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new ActionBar());
            c21664hHt.gEmmrt.registerOnPageChangeCallback(new StateListAnimator());
        }
    }

    public static final void copydefault(C25677jCg c25677jCg, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (i == 0) {
            tab.setText(c25677jCg.getString(C23274hvD.Fragment.QUSxYX));
            tab.setContentDescription("web3_dex_market_tracker_leaderboard_title_view");
        } else {
            tab.setText(c25677jCg.getString(C23274hvD.Fragment.getConnectivityMgr));
            tab.setContentDescription("web3_dex_market_tracker_monitor_title_view");
        }
    }

    /* JADX INFO: renamed from: o.jCg$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
        }

        public ActionBar() {
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.jBN.trackMonitorPageClick$default(o.jBN, com.okinc.business.dexlogic.track.DexTrackEventParameter$MonitorButtonName, java.lang.String, java.lang.String, boolean, int, java.lang.Object):void */
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            if (!C25677jCg.this.copydefault) {
                C25677jCg.this.copydefault = true;
                return;
            }
            if (tab.getPosition() == 0) {
                jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.LEADERBOARD_TAB, null, null, true, 6, null);
            } else if (tab.getPosition() == 1) {
                jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.MONITOR_TAB, null, null, true, 6, null);
                C25677jCg.this.djBIcL();
            }
        }
    }

    /* JADX INFO: renamed from: o.jCg$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C25677jCg AEQbTJ;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C25677jCg c25677jCg) {
            this.OLrzqt = view;
            this.copydefault = j;
            this.AEQbTJ = c25677jCg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.copydefault || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.jCg$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C25677jCg AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C25677jCg c25677jCg) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.AEQbTJ = c25677jCg;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.AhwBna();
            }
        }
    }

    /* JADX INFO: renamed from: o.jCg$StateListAnimator */
    public static final class StateListAnimator extends ViewPager2.OnPageChangeCallback {
        public StateListAnimator() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            if (i == 1) {
                C25677jCg.this.djBIcL();
            }
        }
    }

    public final void AhwBna() {
        jEV.ActionBar actionBar = jEV.Companion;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        actionBar.KWHzl(contextRequireContext);
        if (gEmmrt()) {
            jBN.trackMonitorPageClick$default(jBN.copydefault, DexTrackEventParameter.MonitorButtonName.FOLLOWING_ADDRESS_ICON, null, null, false, 14, null);
        } else {
            jBN.trackLeaderboardPageClick$default(jBN.copydefault, DexTrackEventParameter.LeaderBoardButtonName.FOLLOWING_ADDRESS_ICON, null, null, false, 14, null);
        }
        jBN.copydefault.OLrzqt(isConnected());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(int i) {
        ViewPager2 viewPager2;
        C21664hHt c21664hHt = (C21664hHt) AEQbTJ();
        if (c21664hHt == null || (viewPager2 = c21664hHt.gEmmrt) == null) {
            return;
        }
        viewPager2.setCurrentItem(i, false);
    }

    public final void AYXKKw() {
        C25389ivm.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AddressTrackerFragment$reportLeaderBoardView$1(this, null), 2, null);
    }

    public final void valueOf() {
        jBN.monitorPageView$default(jBN.copydefault, isConnected(), false, 2, null);
    }

    private final int fJNWhG() {
        java.lang.Integer num = SPUtils.getInt("sp_key_tracker_tab_position", 0);
        Intrinsics.checkNotNullExpressionValue(num, "");
        return num.intValue();
    }

    public final void copydefault(int i) {
        SPUtils.put("sp_key_tracker_tab_position", java.lang.Integer.valueOf(i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean gEmmrt() {
        C55254xgV c55254xgV;
        TabLayout tabLayoutCopydefault;
        C21664hHt c21664hHt = (C21664hHt) AEQbTJ();
        return (c21664hHt == null || (c55254xgV = c21664hHt.EZpvd) == null || (tabLayoutCopydefault = c55254xgV.copydefault()) == null || tabLayoutCopydefault.getSelectedTabPosition() != 1) ? false : true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        C55254xgV c55254xgV;
        TabLayout tabLayoutCopydefault;
        TabLayout.Tab tabAt;
        android.view.View customView;
        android.view.View viewFindViewById;
        C55254xgV c55254xgV2;
        C21664hHt c21664hHt = (C21664hHt) AEQbTJ();
        if (c21664hHt != null && (c55254xgV2 = c21664hHt.EZpvd) != null) {
            c55254xgV2.EZpvd(1, true);
        }
        C21664hHt c21664hHt2 = (C21664hHt) AEQbTJ();
        if (c21664hHt2 == null || (c55254xgV = c21664hHt2.EZpvd) == null || (tabLayoutCopydefault = c55254xgV.copydefault()) == null || (tabAt = tabLayoutCopydefault.getTabAt(1)) == null || (customView = tabAt.getCustomView()) == null || (viewFindViewById = customView.findViewById(C52761wXj.FragmentManager.DbNXlk)) == null) {
            return;
        }
        CardView cardView = viewFindViewById instanceof CardView ? (CardView) viewFindViewById : null;
        if (cardView != null) {
            cardView.setCardBackgroundColor(C25382ivf.KWHzl(C52761wXj.ActionBar.DCUTEI));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: VB */
    /* JADX WARN: Multi-variable type inference failed */
    public final void djBIcL() {
        C55254xgV c55254xgV;
        C21664hHt c21664hHt = (C21664hHt) AEQbTJ();
        if (c21664hHt == null || (c55254xgV = c21664hHt.EZpvd) == null) {
            return;
        }
        c55254xgV.EZpvd(1, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        TabLayoutMediator tabLayoutMediator = this.valueOf;
        if (tabLayoutMediator != null) {
            tabLayoutMediator.detach();
        }
        this.valueOf = null;
    }
}

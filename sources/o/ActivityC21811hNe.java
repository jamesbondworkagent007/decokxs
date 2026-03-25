package o;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hNe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class ActivityC21811hNe extends AbstractActivityC33013moT {
    public Application EZpvd;
    public hDG OLrzqt;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.hNj
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ActivityC21811hNe.AEQbTJ(this.copydefault);
        }
    });

    public final java.lang.String OLrzqt() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String AEQbTJ(ActivityC21811hNe activityC21811hNe) {
        java.lang.String stringExtra;
        android.content.Intent intent = activityC21811hNe.getIntent();
        return (intent == null || (stringExtra = intent.getStringExtra("swap_type")) == null) ? "Web3_DEX_SWAP" : stringExtra;
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        C55254xgV c55254xgV;
        TabLayout tabLayoutCopydefault;
        super.onCreate(bundle);
        TabLayout.Tab tabAt = null;
        C32866mlf.onEvent$default("DEXSwap_Swap_FAQ_View", (TrackChannel[]) null, new Function1() { // from class: o.hNn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ActivityC21811hNe.copydefault((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        hDG hdgEZpvd = hDG.EZpvd(getLayoutInflater());
        this.OLrzqt = hdgEZpvd;
        setContentView(hdgEZpvd != null ? hdgEZpvd.getRoot() : null);
        hDG hdg = this.OLrzqt;
        if (hdg != null) {
            hdg.OLrzqt.getTitle().setContentDescription("web3_dex_faq_title");
            hdg.OLrzqt.getTitle().setText(getString(C23274hvD.Fragment.QqiRNA));
            Application application = new Application(this, this);
            this.EZpvd = application;
            hdg.AEQbTJ.setAdapter(application);
            new TabLayoutMediator(hdg.gEmmrt.copydefault(), hdg.AEQbTJ, true, true, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.hNl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
                public final void onConfigureTab(TabLayout.Tab tab, int i) {
                    ActivityC21811hNe.EZpvd(this.AEQbTJ, tab, i);
                }
            }).attach();
            TabLayout tabLayoutCopydefault2 = hdg.gEmmrt.copydefault();
            hDG hdg2 = this.OLrzqt;
            if (hdg2 != null && (c55254xgV = hdg2.gEmmrt) != null && (tabLayoutCopydefault = c55254xgV.copydefault()) != null) {
                tabAt = tabLayoutCopydefault.getTabAt(!Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "Web3_DEX_SWAP") ? 1 : 0);
            }
            tabLayoutCopydefault2.selectTab(tabAt);
            hdg.AEQbTJ.setCurrentItem(!Intrinsics.EZpvd((java.lang.Object) OLrzqt(), (java.lang.Object) "Web3_DEX_SWAP") ? 1 : 0, false);
            getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.hNm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    ActivityC21811hNe.copydefault(this.KWHzl);
                }
            });
            hdg.gEmmrt.AEQbTJ(new ActionBar(hdg));
        }
    }

    public static final Unit copydefault(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ActivityC21811hNe activityC21811hNe, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (i == 0) {
            tab.setContentDescription("web3_dex_faq_tab_swap_bridge");
            tab.setText(activityC21811hNe.getString(C23274hvD.Fragment.createOnBackInvokedCallbacklambda0));
        } else {
            tab.setContentDescription("web3_dex_faq_tab_limit");
            tab.setText(activityC21811hNe.getString(C23274hvD.Fragment.createOnBackInvokedCallback));
        }
    }

    public static final void copydefault(ActivityC21811hNe activityC21811hNe) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC21811hNe, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.hNe$ActionBar */
    public static final class ActionBar implements TabLayout.OnTabSelectedListener {
        public final /* synthetic */ hDG AEQbTJ;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public ActionBar(hDG hdg) {
            this.AEQbTJ = hdg;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            Intrinsics.checkNotNullParameter(tab, "");
            this.AEQbTJ.AEQbTJ.setCurrentItem(tab.getPosition(), true);
        }
    }

    /* JADX INFO: renamed from: o.hNe$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final class Application extends FragmentStateAdapter {
        public final /* synthetic */ ActivityC21811hNe OLrzqt;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return 2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ActivityC21811hNe activityC21811hNe, FragmentActivity fragmentActivity) {
            super(fragmentActivity);
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            this.OLrzqt = activityC21811hNe;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return C21817hNk.Companion.EZpvd(i == 0 ? "Web3_DEX_SWAP" : "Web3_DEX_LIMIT_ORDER");
        }
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33013moT, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

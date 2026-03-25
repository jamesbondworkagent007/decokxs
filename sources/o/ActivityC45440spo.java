package o;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.okex.center.bean.SelfServiceToolBean;
import com.okinc.okex.center.ui.displaymodels.AnnouncementPopupDisplayModel;
import com.okinc.okex.debug.fragments.CommonServiceDBoxFragment;
import com.okinc.okex.debug.fragments.EntrypointsDBoxFragment;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.spo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class ActivityC45440spo extends AbstractActivityC45441spp {
    public AbstractC47329tnw valueOf;
    public static final Activity Companion = new Activity(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.spo$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.spo.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ android.content.Intent createIntent$default(Activity activity, android.content.Context context, boolean z, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return activity.copydefault(context, z);
        }

        public final android.content.Intent copydefault(@NotNull android.content.Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC45440spo.class);
            intent.putExtra("key_show_popup_ane", z);
            return intent;
        }
    }

    @Override // o.AbstractActivityC45441spp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC47329tnw abstractC47329tnwOLrzqt = AbstractC47329tnw.OLrzqt(getLayoutInflater());
        this.valueOf = abstractC47329tnwOLrzqt;
        AbstractC47329tnw abstractC47329tnw = null;
        if (abstractC47329tnwOLrzqt == null) {
            Intrinsics.gEmmrt("");
            abstractC47329tnwOLrzqt = null;
        }
        setContentView(abstractC47329tnwOLrzqt.getRoot());
        AbstractC47329tnw abstractC47329tnw2 = this.valueOf;
        if (abstractC47329tnw2 == null) {
            Intrinsics.gEmmrt("");
            abstractC47329tnw2 = null;
        }
        setSupportActionBar(abstractC47329tnw2.AEQbTJ);
        AbstractC47329tnw abstractC47329tnw3 = this.valueOf;
        if (abstractC47329tnw3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC47329tnw = abstractC47329tnw3;
        }
        abstractC47329tnw.AEQbTJ.setNavigationOnClickListener(new View.OnClickListener() { // from class: o.spm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ActivityC45440spo.EZpvd(this.OLrzqt, view);
            }
        });
        final java.util.List listGEmmrt = yDY.gEmmrt(EntrypointsDBoxFragment.Companion.OLrzqt(), C45450spy.Companion.OLrzqt(), CommonServiceDBoxFragment.Companion.AEQbTJ(), C45424spY.Companion.OLrzqt(), C45485sqg.Companion.EZpvd(), C45491sqm.Companion.OLrzqt());
        abstractC47329tnw.KWHzl.setAdapter(new StateListAnimator(this, listGEmmrt));
        new TabLayoutMediator(abstractC47329tnw.copydefault, abstractC47329tnw.KWHzl, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.spl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                ActivityC45440spo.copydefault(listGEmmrt, tab, i);
            }
        }).attach();
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: o.spq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ActivityC45440spo.KWHzl(this.EZpvd);
            }
        });
        if (getIntent().getBooleanExtra("key_show_popup_ane", false)) {
            try {
                AnnouncementPopupDisplayModel announcementPopupDisplayModel = new AnnouncementPopupDisplayModel("testId", "Test Announcement", "Test Announcement", (SelfServiceToolBean) null, 8, (DefaultConstructorMarker) null);
                androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
                C45065sik.OLrzqt(announcementPopupDisplayModel, supportFragmentManager);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    public static final void EZpvd(ActivityC45440spo activityC45440spo, android.view.View view) {
        activityC45440spo.getOnBackPressedDispatcher().onBackPressed();
    }

    public static final void copydefault(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(((AbstractC45451spz) list.get(i)).OLrzqt());
    }

    public static final void KWHzl(ActivityC45440spo activityC45440spo) {
        rVN.reportFullyDrawn$default((android.app.Activity) activityC45440spo, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.spo$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public static final class StateListAnimator extends FragmentStateAdapter {
        public final java.util.List<androidx.fragment.app.Fragment> EZpvd;

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends androidx.fragment.app.Fragment> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull FragmentActivity fragmentActivity, @NotNull java.util.List<? extends androidx.fragment.app.Fragment> list) {
            super(fragmentActivity);
            Intrinsics.checkNotNullParameter(fragmentActivity, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.EZpvd = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.EZpvd.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return this.EZpvd.get(i);
        }
    }

    @Override // o.AbstractActivityC45441spp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC45441spp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC45441spp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC45441spp, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

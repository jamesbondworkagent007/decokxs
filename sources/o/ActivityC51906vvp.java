package o;

import android.view.View;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.okinc.tradingbot.impl.market_place.presenter.BotLeadPendingPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ActivityC51906vvp extends AbstractActivityC48163uHh<AbstractC48296uMf, BotLeadPendingPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public final boolean OLrzqt = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return this.OLrzqt;
    }

    /* JADX INFO: renamed from: o.vvp$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vvp.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public static /* synthetic */ void startActivity$default(TaskDescription taskDescription, android.content.Context context, int i, int i2, java.lang.Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            taskDescription.KWHzl(context, i);
        }

        public final void KWHzl(@NotNull android.content.Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) ActivityC51906vvp.class);
            intent.putExtra("data", i);
            context.startActivity(intent);
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        EZpvd();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        AbstractC48296uMf abstractC48296uMf = (AbstractC48296uMf) sSMYrx();
        java.util.ArrayList<C51790vtf> arrayListOLrzqt = ((BotLeadPendingPresenter) gHZMYf()).OLrzqt();
        C33544myU c33544myU = abstractC48296uMf.OLrzqt;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c33544myU.setAdapter(new StateListAnimator(this, supportFragmentManager, arrayListOLrzqt));
        if (arrayListOLrzqt.size() > 1) {
            C55249xgQ c55249xgQ = abstractC48296uMf.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ, "");
            c55249xgQ.setVisibility(0);
            android.view.View view = abstractC48296uMf.EZpvd;
            Intrinsics.checkNotNullExpressionValue(view, "");
            view.setVisibility(8);
            abstractC48296uMf.KWHzl.setupWithViewPager(abstractC48296uMf.OLrzqt);
        } else {
            C55249xgQ c55249xgQ2 = abstractC48296uMf.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55249xgQ2, "");
            c55249xgQ2.setVisibility(8);
            android.view.View view2 = abstractC48296uMf.EZpvd;
            Intrinsics.checkNotNullExpressionValue(view2, "");
            view2.setVisibility(0);
            if (arrayListOLrzqt.size() == 1) {
                abstractC48296uMf.copydefault.setSubDoVisible(arrayListOLrzqt.get(0).KWHzl());
            }
        }
        abstractC48296uMf.OLrzqt.setIntercept(false);
        abstractC48296uMf.OLrzqt.addOnPageChangeListener(new Application(abstractC48296uMf, arrayListOLrzqt));
        abstractC48296uMf.copydefault.setSubDoListener(new View.OnClickListener() { // from class: o.vvn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view3) {
                ActivityC51906vvp.AEQbTJ(this.OLrzqt, view3);
            }
        });
        android.os.Bundle extras = getIntent().getExtras();
        if (extras != null) {
            abstractC48296uMf.OLrzqt.setCurrentItem(extras.getInt("data"), false);
        }
    }

    /* JADX INFO: renamed from: o.vvp$Application */
    public static final class Application implements ViewPager.OnPageChangeListener {
        public final /* synthetic */ AbstractC48296uMf KWHzl;
        public final /* synthetic */ java.util.ArrayList<C51790vtf> OLrzqt;

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
        }

        public Application(AbstractC48296uMf abstractC48296uMf, java.util.ArrayList<C51790vtf> arrayList) {
            this.KWHzl = abstractC48296uMf;
            this.OLrzqt = arrayList;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            this.KWHzl.copydefault.setSubDoVisible(this.OLrzqt.get(i).KWHzl());
        }
    }

    public static final void AEQbTJ(ActivityC51906vvp activityC51906vvp, android.view.View view) {
        ActivityC51843vuf.Companion.OLrzqt(activityC51906vvp);
    }

    /* JADX INFO: renamed from: o.vvp$StateListAnimator */
    /* JADX INFO: loaded from: classes16.dex */
    public final class StateListAnimator extends FragmentPagerAdapter {
        public final /* synthetic */ ActivityC51906vvp AEQbTJ;
        public final java.util.ArrayList<C51790vtf> KWHzl;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull ActivityC51906vvp activityC51906vvp, @NotNull androidx.fragment.app.FragmentManager fragmentManager, java.util.ArrayList<C51790vtf> arrayList) {
            super(fragmentManager, 1);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            this.AEQbTJ = activityC51906vvp;
            this.KWHzl = arrayList;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.KWHzl.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            return this.KWHzl.get(i).OLrzqt();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return this.KWHzl.get(i).copydefault();
        }
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

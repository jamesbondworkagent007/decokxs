package o;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import kotlin.jvm.internal.Intrinsics;
import o.C48931uew;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ukW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class ActivityC49223ukW extends AbstractActivityC33041mov {
    public AbstractC48961ufZ EZpvd;

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        AbstractC48961ufZ abstractC48961ufZ = (AbstractC48961ufZ) DataBindingUtil.setContentView(this, C48931uew.Application.copydefault);
        this.EZpvd = abstractC48961ufZ;
        AbstractC48961ufZ abstractC48961ufZ2 = null;
        if (abstractC48961ufZ == null) {
            Intrinsics.gEmmrt("");
            abstractC48961ufZ = null;
        }
        setSupportActionBar(abstractC48961ufZ.AEQbTJ);
        androidx.appcompat.app.ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(true);
        }
        androidx.appcompat.app.ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.setDisplayShowHomeEnabled(false);
        }
        androidx.appcompat.app.ActionBar supportActionBar3 = getSupportActionBar();
        if (supportActionBar3 != null) {
            supportActionBar3.setTitle("Share API Test");
        }
        AbstractC48961ufZ abstractC48961ufZ3 = this.EZpvd;
        if (abstractC48961ufZ3 == null) {
            Intrinsics.gEmmrt("");
            abstractC48961ufZ3 = null;
        }
        ViewPager viewPager = abstractC48961ufZ3.EZpvd;
        androidx.fragment.app.FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        viewPager.setAdapter(new Application(this, supportFragmentManager));
        AbstractC48961ufZ abstractC48961ufZ4 = this.EZpvd;
        if (abstractC48961ufZ4 == null) {
            Intrinsics.gEmmrt("");
            abstractC48961ufZ4 = null;
        }
        TabLayout tabLayout = abstractC48961ufZ4.OLrzqt;
        AbstractC48961ufZ abstractC48961ufZ5 = this.EZpvd;
        if (abstractC48961ufZ5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC48961ufZ2 = abstractC48961ufZ5;
        }
        tabLayout.setupWithViewPager(abstractC48961ufZ2.EZpvd, true);
    }

    /* JADX INFO: renamed from: o.ukW$Application */
    /* JADX INFO: loaded from: classes19.dex */
    public final class Application extends FragmentStatePagerAdapter {
        public final /* synthetic */ ActivityC49223ukW AEQbTJ;

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return 2;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.viewpager.widget.PagerAdapter
        public java.lang.CharSequence getPageTitle(int i) {
            return i == 0 ? "Share Test" : "Footer Test";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull ActivityC49223ukW activityC49223ukW, androidx.fragment.app.FragmentManager fragmentManager) {
            super(fragmentManager, 1);
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            this.AEQbTJ = activityC49223ukW;
        }

        @Override // androidx.fragment.app.FragmentStatePagerAdapter
        public androidx.fragment.app.Fragment getItem(int i) {
            if (i == 0) {
                return C49229ukc.Companion.OLrzqt();
            }
            return C49149ujB.Companion.OLrzqt();
        }
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}

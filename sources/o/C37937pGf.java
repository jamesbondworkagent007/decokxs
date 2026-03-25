package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.pGf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C37937pGf {
    public static boolean KWHzl;
    public RecyclerView.Adapter<?> AEQbTJ;
    public ActionBar AYXKKw;
    public RecyclerView.AdapterDataObserver AhwBna;
    public boolean EZpvd;
    public boolean OLrzqt;
    public Activity copydefault;
    public TabLayout djBIcL;
    public ViewPager2 gEmmrt;
    public TabLayout.OnTabSelectedListener valueOf;

    /* JADX INFO: renamed from: o.pGf$ActionBar */
    public interface ActionBar {
        void KWHzl(@androidx.annotation.NonNull TabLayout.Tab tab, int i);
    }

    public C37937pGf(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull ActionBar actionBar) {
        this(tabLayout, viewPager2, true, actionBar);
    }

    public C37937pGf(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, boolean z, @androidx.annotation.NonNull ActionBar actionBar) {
        this(tabLayout, viewPager2, z, false, actionBar);
    }

    public C37937pGf(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, boolean z, boolean z2, @androidx.annotation.NonNull ActionBar actionBar) {
        this.djBIcL = tabLayout;
        this.gEmmrt = viewPager2;
        this.EZpvd = z;
        KWHzl = z2;
        this.AYXKKw = actionBar;
    }

    public void AEQbTJ() {
        if (this.OLrzqt) {
            throw new java.lang.IllegalStateException("TabLayoutMediator is already attached");
        }
        RecyclerView.Adapter<?> adapter = this.gEmmrt.getAdapter();
        this.AEQbTJ = adapter;
        if (adapter == null) {
            throw new java.lang.IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.OLrzqt = true;
        Activity activity = new Activity(this.djBIcL);
        this.copydefault = activity;
        this.gEmmrt.registerOnPageChangeCallback(activity);
        Application application = new Application(this.gEmmrt, KWHzl);
        this.valueOf = application;
        this.djBIcL.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) application);
        if (this.EZpvd) {
            TaskDescription taskDescription = new TaskDescription();
            this.AhwBna = taskDescription;
            this.AEQbTJ.registerAdapterDataObserver(taskDescription);
        }
        OLrzqt();
        this.djBIcL.setScrollPosition(this.gEmmrt.getCurrentItem(), 0.0f, true);
    }

    public void KWHzl() {
        RecyclerView.Adapter<?> adapter;
        if (this.EZpvd && (adapter = this.AEQbTJ) != null) {
            adapter.unregisterAdapterDataObserver(this.AhwBna);
            this.AhwBna = null;
        }
        this.djBIcL.removeOnTabSelectedListener(this.valueOf);
        this.gEmmrt.unregisterOnPageChangeCallback(this.copydefault);
        this.valueOf = null;
        this.copydefault = null;
        this.AEQbTJ = null;
        this.OLrzqt = false;
    }

    public void OLrzqt() {
        this.djBIcL.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.AEQbTJ;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.djBIcL.newTab();
                this.AYXKKw.KWHzl(tabNewTab, i);
                this.djBIcL.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = java.lang.Math.min(this.gEmmrt.getCurrentItem(), this.djBIcL.getTabCount() - 1);
                if (iMin != this.djBIcL.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.djBIcL;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.pGf$Activity */
    public static class Activity extends ViewPager2.OnPageChangeCallback {
        public final WeakReference<TabLayout> AEQbTJ;
        public int OLrzqt;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void KWHzl() {
            this.OLrzqt = 0;
            this.copydefault = 0;
        }

        public Activity(TabLayout tabLayout) {
            this.AEQbTJ = new WeakReference<>(tabLayout);
            KWHzl();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            if (i == 1) {
                C37937pGf.KWHzl = true;
            } else if (i == 0) {
                C37937pGf.KWHzl = false;
            }
            this.copydefault = this.OLrzqt;
            this.OLrzqt = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.AEQbTJ.get();
            if (tabLayout != null) {
                int i3 = this.OLrzqt;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.copydefault == 1, (i3 == 2 && this.copydefault == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.AEQbTJ.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.OLrzqt;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.copydefault == 0));
        }
    }

    /* JADX INFO: renamed from: o.pGf$Application */
    public static class Application implements TabLayout.OnTabSelectedListener {
        public final ViewPager2 KWHzl;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application(ViewPager2 viewPager2, boolean z) {
            this.KWHzl = viewPager2;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@androidx.annotation.NonNull TabLayout.Tab tab) {
            this.KWHzl.setCurrentItem(tab.getPosition(), C37937pGf.KWHzl);
        }
    }

    /* JADX INFO: renamed from: o.pGf$TaskDescription */
    public class TaskDescription extends RecyclerView.AdapterDataObserver {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            C37937pGf.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            C37937pGf.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, @androidx.annotation.Nullable java.lang.Object obj) {
            C37937pGf.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            C37937pGf.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            C37937pGf.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            C37937pGf.this.OLrzqt();
        }
    }
}

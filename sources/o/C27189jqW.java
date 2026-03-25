package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.jqW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C27189jqW {
    public RecyclerView.Adapter<?> AEQbTJ;
    public final Activity AYXKKw;
    public RecyclerView.AdapterDataObserver AhwBna;
    public TabLayout.OnTabSelectedListener EZpvd;
    public TaskDescription KWHzl;
    public final boolean OLrzqt;
    public boolean copydefault;
    public final boolean djBIcL;
    public final TabLayout gEmmrt;
    public final ViewPager2 valueOf;

    /* JADX INFO: renamed from: o.jqW$Activity */
    public interface Activity {
        void KWHzl(@androidx.annotation.NonNull TabLayout.Tab tab, int i);
    }

    public C27189jqW(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull Activity activity) {
        this(tabLayout, viewPager2, true, activity);
    }

    public C27189jqW(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, boolean z, @androidx.annotation.NonNull Activity activity) {
        this(tabLayout, viewPager2, z, true, activity);
    }

    public C27189jqW(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, boolean z, boolean z2, @androidx.annotation.NonNull Activity activity) {
        this.gEmmrt = tabLayout;
        this.valueOf = viewPager2;
        this.OLrzqt = z;
        this.djBIcL = z2;
        this.AYXKKw = activity;
    }

    public void KWHzl() {
        if (this.copydefault) {
            throw new java.lang.IllegalStateException("InvestTabLayoutMediator is already attached");
        }
        RecyclerView.Adapter<?> adapter = this.valueOf.getAdapter();
        this.AEQbTJ = adapter;
        if (adapter == null) {
            throw new java.lang.IllegalStateException("InvestTabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.copydefault = true;
        TaskDescription taskDescription = new TaskDescription(this.gEmmrt);
        this.KWHzl = taskDescription;
        this.valueOf.registerOnPageChangeCallback(taskDescription);
        Application application = new Application(this.valueOf, this.djBIcL, this.KWHzl);
        this.EZpvd = application;
        this.gEmmrt.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) application);
        if (this.OLrzqt) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            this.AhwBna = stateListAnimator;
            this.AEQbTJ.registerAdapterDataObserver(stateListAnimator);
        }
        OLrzqt();
        this.gEmmrt.setScrollPosition(this.valueOf.getCurrentItem(), 0.0f, true);
    }

    public void copydefault() {
        RecyclerView.Adapter<?> adapter;
        if (this.OLrzqt && (adapter = this.AEQbTJ) != null) {
            adapter.unregisterAdapterDataObserver(this.AhwBna);
            this.AhwBna = null;
        }
        this.gEmmrt.removeOnTabSelectedListener(this.EZpvd);
        this.valueOf.unregisterOnPageChangeCallback(this.KWHzl);
        this.EZpvd = null;
        this.KWHzl = null;
        this.AEQbTJ = null;
        this.copydefault = false;
    }

    public void OLrzqt() {
        this.gEmmrt.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.AEQbTJ;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.gEmmrt.newTab();
                this.AYXKKw.KWHzl(tabNewTab, i);
                tabNewTab.setContentDescription("web3_defi_sub_page_segment_item");
                this.gEmmrt.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = java.lang.Math.min(this.valueOf.getCurrentItem(), this.gEmmrt.getTabCount() - 1);
                if (iMin != this.gEmmrt.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.gEmmrt;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.jqW$TaskDescription */
    public static class TaskDescription extends ViewPager2.OnPageChangeCallback {
        public int AEQbTJ;
        public final WeakReference<TabLayout> EZpvd;
        public int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void OLrzqt() {
            this.OLrzqt = 0;
            this.AEQbTJ = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            this.AEQbTJ = this.OLrzqt;
            this.OLrzqt = i;
        }

        public TaskDescription(TabLayout tabLayout) {
            this.EZpvd = new WeakReference<>(tabLayout);
            OLrzqt();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.EZpvd.get();
            if (tabLayout != null) {
                int i3 = this.OLrzqt;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.AEQbTJ == 1, (i3 == 2 && this.AEQbTJ == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            TabLayout tabLayout = this.EZpvd.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.OLrzqt;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.AEQbTJ == 0));
        }
    }

    /* JADX INFO: renamed from: o.jqW$Application */
    public static class Application implements TabLayout.OnTabSelectedListener {
        public final TaskDescription AEQbTJ;
        public final ViewPager2 EZpvd;
        public final boolean OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Application(ViewPager2 viewPager2, boolean z, TaskDescription taskDescription) {
            this.EZpvd = viewPager2;
            this.OLrzqt = z;
            this.AEQbTJ = taskDescription;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@androidx.annotation.NonNull TabLayout.Tab tab) {
            if (this.AEQbTJ.AEQbTJ == 1) {
                this.EZpvd.setCurrentItem(tab.getPosition(), true);
            } else {
                this.EZpvd.setCurrentItem(tab.getPosition(), this.OLrzqt);
            }
        }
    }

    /* JADX INFO: renamed from: o.jqW$StateListAnimator */
    public class StateListAnimator extends RecyclerView.AdapterDataObserver {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            C27189jqW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            C27189jqW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, @androidx.annotation.Nullable java.lang.Object obj) {
            C27189jqW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            C27189jqW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            C27189jqW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            C27189jqW.this.OLrzqt();
        }
    }
}

package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes5.dex */
public class eSW {
    public TabLayout.OnTabSelectedListener AEQbTJ;
    public final Activity AYXKKw;
    public RecyclerView.AdapterDataObserver AhwBna;
    public final boolean EZpvd;
    public RecyclerView.Adapter<?> KWHzl;
    public Application OLrzqt;
    public boolean copydefault;
    public final TabLayout djBIcL;
    public final boolean gEmmrt;
    public final ViewPager2 valueOf;

    public interface Activity {
        void KWHzl(@androidx.annotation.NonNull TabLayout.Tab tab, int i);
    }

    public eSW(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, @androidx.annotation.NonNull Activity activity) {
        this(tabLayout, viewPager2, true, activity);
    }

    public eSW(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, boolean z, @androidx.annotation.NonNull Activity activity) {
        this(tabLayout, viewPager2, z, true, activity);
    }

    public eSW(@androidx.annotation.NonNull TabLayout tabLayout, @androidx.annotation.NonNull ViewPager2 viewPager2, boolean z, boolean z2, @androidx.annotation.NonNull Activity activity) {
        this.djBIcL = tabLayout;
        this.valueOf = viewPager2;
        this.EZpvd = z;
        this.gEmmrt = z2;
        this.AYXKKw = activity;
    }

    public void KWHzl() {
        if (this.copydefault) {
            throw new java.lang.IllegalStateException("OkTabLayoutMediator is already attached");
        }
        RecyclerView.Adapter<?> adapter = this.valueOf.getAdapter();
        this.KWHzl = adapter;
        if (adapter == null) {
            throw new java.lang.IllegalStateException("OkTabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.copydefault = true;
        Application application = new Application(this.djBIcL);
        this.OLrzqt = application;
        this.valueOf.registerOnPageChangeCallback(application);
        StateListAnimator stateListAnimator = new StateListAnimator(this.valueOf, this.gEmmrt, this.OLrzqt);
        this.AEQbTJ = stateListAnimator;
        this.djBIcL.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) stateListAnimator);
        if (this.EZpvd) {
            TaskDescription taskDescription = new TaskDescription();
            this.AhwBna = taskDescription;
            this.KWHzl.registerAdapterDataObserver(taskDescription);
        }
        OLrzqt();
        this.djBIcL.setScrollPosition(this.valueOf.getCurrentItem(), 0.0f, true);
    }

    public void copydefault() {
        RecyclerView.Adapter<?> adapter;
        if (this.EZpvd && (adapter = this.KWHzl) != null) {
            adapter.unregisterAdapterDataObserver(this.AhwBna);
            this.AhwBna = null;
        }
        this.djBIcL.removeOnTabSelectedListener(this.AEQbTJ);
        this.valueOf.unregisterOnPageChangeCallback(this.OLrzqt);
        this.AEQbTJ = null;
        this.OLrzqt = null;
        this.KWHzl = null;
        this.copydefault = false;
    }

    public void OLrzqt() {
        this.djBIcL.removeAllTabs();
        RecyclerView.Adapter<?> adapter = this.KWHzl;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.Tab tabNewTab = this.djBIcL.newTab();
                this.AYXKKw.KWHzl(tabNewTab, i);
                this.djBIcL.addTab(tabNewTab, false);
            }
            if (itemCount > 0) {
                int iMin = java.lang.Math.min(this.valueOf.getCurrentItem(), this.djBIcL.getTabCount() - 1);
                if (iMin != this.djBIcL.getSelectedTabPosition()) {
                    TabLayout tabLayout = this.djBIcL;
                    tabLayout.selectTab(tabLayout.getTabAt(iMin));
                }
            }
        }
    }

    public static class Application extends ViewPager2.OnPageChangeCallback {
        public int AEQbTJ;
        public final WeakReference<TabLayout> KWHzl;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public void EZpvd() {
            this.AEQbTJ = 0;
            this.copydefault = 0;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            this.copydefault = this.AEQbTJ;
            this.AEQbTJ = i;
        }

        public Application(TabLayout tabLayout) {
            this.KWHzl = new WeakReference<>(tabLayout);
            EZpvd();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            TabLayout tabLayout = this.KWHzl.get();
            if (tabLayout != null) {
                int i3 = this.AEQbTJ;
                tabLayout.setScrollPosition(i, f, i3 != 2 || this.copydefault == 1, (i3 == 2 && this.copydefault == 0) ? false : true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            eSW.copydefault(i);
            TabLayout tabLayout = this.KWHzl.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
                return;
            }
            int i2 = this.AEQbTJ;
            tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.copydefault == 0));
        }
    }

    public static void copydefault(int i) {
        if (i == 0) {
            C32866mlf.onEvent("app_home_coins_click");
            return;
        }
        if (i == 1) {
            C32866mlf.onEvent("app_home_defi_click");
        } else if (i == 3) {
            C32866mlf.onEvent("app_home_nft_click");
        } else {
            if (i != 4) {
                return;
            }
            C32866mlf.onEvent("app_home_approvals_click");
        }
    }

    public static class StateListAnimator implements TabLayout.OnTabSelectedListener {
        public final ViewPager2 AEQbTJ;
        public final Application EZpvd;
        public final boolean OLrzqt;

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public StateListAnimator(ViewPager2 viewPager2, boolean z, Application application) {
            this.AEQbTJ = viewPager2;
            this.OLrzqt = z;
            this.EZpvd = application;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(@androidx.annotation.NonNull TabLayout.Tab tab) {
            if (this.EZpvd.copydefault == 1) {
                this.AEQbTJ.setCurrentItem(tab.getPosition(), true);
            } else {
                this.AEQbTJ.setCurrentItem(tab.getPosition(), this.OLrzqt);
            }
        }
    }

    public class TaskDescription extends RecyclerView.AdapterDataObserver {
        public TaskDescription() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            eSW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            eSW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, @androidx.annotation.Nullable java.lang.Object obj) {
            eSW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            eSW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            eSW.this.OLrzqt();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            eSW.this.OLrzqt();
        }
    }
}

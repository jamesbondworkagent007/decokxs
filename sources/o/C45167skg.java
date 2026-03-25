package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C47315tni;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.skg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45167skg extends AbstractC32998moE {
    public static final java.lang.String AEQbTJ;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public Application AhwBna;
    public AbstractC47358toY KWHzl;
    public final java.util.List<Activity> valueOf = new java.util.ArrayList();
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.ski
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C45167skg.gEmmrt(this.copydefault));
        }
    });
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.skn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Integer.valueOf(C45167skg.djBIcL(this.copydefault));
        }
    });
    public final int AYXKKw = C47315tni.ActionBar.fZBcTu;
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.skl
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C45167skg.isConnected(this.AEQbTJ);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    @Override // o.AbstractC32998moE
    public void onInvisible() {
    }

    @Override // o.AbstractC32998moE
    public void onVisible() {
    }

    public final boolean OLrzqt() {
        return ((java.lang.Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public static final boolean gEmmrt(C45167skg c45167skg) {
        android.os.Bundle arguments = c45167skg.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("KEY_ALLOW_SWIPE", true);
        }
        return true;
    }

    public final int copydefault() {
        return ((java.lang.Number) this.copydefault.getValue()).intValue();
    }

    public static final int djBIcL(C45167skg c45167skg) {
        android.os.Bundle arguments = c45167skg.getArguments();
        if (arguments != null) {
            return arguments.getInt("KEY_PAGE_INDEX", 0);
        }
        return 0;
    }

    /* JADX INFO: renamed from: o.skg$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.skg.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final java.lang.String AEQbTJ() {
            return C45167skg.AEQbTJ;
        }

        public static /* synthetic */ C45167skg newInstance$default(StateListAnimator stateListAnimator, int i, boolean z, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                z = true;
            }
            return stateListAnimator.EZpvd(i, z);
        }

        public final C45167skg EZpvd(int i, boolean z) {
            C45167skg c45167skg = new C45167skg();
            c45167skg.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_PAGE_INDEX", java.lang.Integer.valueOf(i)), C56390yDp.OLrzqt("KEY_ALLOW_SWIPE", java.lang.Boolean.valueOf(z))));
            return c45167skg;
        }
    }

    static {
        java.lang.String simpleName = C45167skg.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        AEQbTJ = simpleName;
    }

    /* JADX INFO: renamed from: o.skg$ActionBar */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public int AEQbTJ;

        public ActionBar() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.AEQbTJ = i;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrollStateChanged(int i) {
            super.onPageScrollStateChanged(i);
            FragmentKt.setFragmentResult(C45167skg.this, "KEY_PAGE_CHANGED", BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_PAGE_CHANGED", java.lang.Integer.valueOf(this.AEQbTJ)), C56390yDp.OLrzqt("KEY_SCROLL_STATE", java.lang.Integer.valueOf(i))));
        }
    }

    public final ActionBar KWHzl() {
        return (ActionBar) this.djBIcL.getValue();
    }

    public static final ActionBar isConnected(C45167skg c45167skg) {
        return c45167skg.new ActionBar();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        this.KWHzl = AbstractC47358toY.copydefault(view);
        this.AhwBna = new Application(this, this);
        AbstractC47358toY abstractC47358toY = this.KWHzl;
        Application application = null;
        if (abstractC47358toY == null) {
            Intrinsics.gEmmrt("");
            abstractC47358toY = null;
        }
        ViewPager2 viewPager2 = abstractC47358toY.KWHzl;
        Application application2 = this.AhwBna;
        if (application2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            application = application2;
        }
        viewPager2.setAdapter(application);
        abstractC47358toY.KWHzl.setUserInputEnabled(OLrzqt());
        abstractC47358toY.KWHzl.registerOnPageChangeCallback(KWHzl());
        if (this.valueOf.size() != 0) {
            abstractC47358toY.KWHzl.setOffscreenPageLimit(this.valueOf.size());
        }
        abstractC47358toY.OLrzqt.KWHzl(false);
        new TabLayoutMediator(abstractC47358toY.OLrzqt.copydefault(), abstractC47358toY.KWHzl, true, OLrzqt(), new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.skh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C45167skg.copydefault(this.AEQbTJ, tab, i);
            }
        }).attach();
        if (copydefault() != 0) {
            abstractC47358toY.KWHzl.postDelayed(new java.lang.Runnable() { // from class: o.skj
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C45167skg.AhwBna(this.KWHzl);
                }
            }, 300L);
        }
        view.post(new java.lang.Runnable() { // from class: o.skk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                C45167skg.valueOf(this.OLrzqt);
            }
        });
    }

    public static final void copydefault(C45167skg c45167skg, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.setText(c45167skg.valueOf.get(i).AEQbTJ());
    }

    public static final void AhwBna(C45167skg c45167skg) {
        setSelectedTab$default(c45167skg, c45167skg.copydefault(), false, 2, null);
    }

    public static final void valueOf(C45167skg c45167skg) {
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c45167skg, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AbstractC47358toY abstractC47358toY = this.KWHzl;
        if (abstractC47358toY == null) {
            Intrinsics.gEmmrt("");
            abstractC47358toY = null;
        }
        abstractC47358toY.KWHzl.unregisterOnPageChangeCallback(KWHzl());
    }

    public final void OLrzqt(@NotNull java.util.List<Activity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.valueOf.clear();
        this.valueOf.addAll(list);
        Application application = this.AhwBna;
        if (application != null) {
            if (application == null) {
                Intrinsics.gEmmrt("");
                application = null;
            }
            application.notifyDataSetChanged();
        }
    }

    public static /* synthetic */ void setSelectedTab$default(C45167skg c45167skg, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c45167skg.KWHzl(i, z);
    }

    public final void KWHzl(int i, boolean z) {
        AbstractC47358toY abstractC47358toY;
        if (i < 0 || i > yDY.AuCTel(this.valueOf) || (abstractC47358toY = this.KWHzl) == null) {
            return;
        }
        if (abstractC47358toY == null) {
            Intrinsics.gEmmrt("");
            abstractC47358toY = null;
        }
        abstractC47358toY.KWHzl.setCurrentItem(i, z);
    }

    /* JADX INFO: renamed from: o.skg$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final androidx.fragment.app.Fragment OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, androidx.fragment.app.Fragment fragment, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                fragment = activity.OLrzqt;
            }
            return activity.EZpvd(str, fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, @NotNull androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            return new Activity(str, fragment);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final androidx.fragment.app.Fragment KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TabInfo(title=" + this.AEQbTJ + ", fragment=" + this.OLrzqt + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            this.AEQbTJ = str;
            this.OLrzqt = fragment;
        }
    }

    /* JADX INFO: renamed from: o.skg$Application */
    public final class Application extends FragmentStateAdapter {
        public final /* synthetic */ C45167skg copydefault;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C45167skg c45167skg, androidx.fragment.app.Fragment fragment) {
            super(fragment);
            Intrinsics.checkNotNullParameter(fragment, "");
            this.copydefault = c45167skg;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.copydefault.valueOf.size();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        public androidx.fragment.app.Fragment createFragment(int i) {
            return ((Activity) this.copydefault.valueOf.get(i)).KWHzl();
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
            Intrinsics.checkNotNullParameter(recyclerView, "");
            super.onAttachedToRecyclerView(recyclerView);
            recyclerView.setHasFixedSize(true);
        }
    }
}

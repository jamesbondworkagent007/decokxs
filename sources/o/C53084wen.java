package o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.okinc.unify_trade.bot.presenter.EmptyPresenter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wen, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C53084wen extends AbstractC49945uyC<uUQ, EmptyPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final int AhwBna = C48033uCm.Activity.bindToGooglePlayService;
    public final float copydefault = 0.98f;
    public final java.util.ArrayList<C53086wep> KWHzl = new java.util.ArrayList<>();
    public boolean AEQbTJ = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AEQbTJ(android.view.View view) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.copydefault;
    }

    public static final /* synthetic */ uUQ copydefault(C53084wen c53084wen) {
        return c53084wen.values();
    }

    /* JADX INFO: renamed from: o.wen$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wen.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        isConnected();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        c52781wYc.setType(2);
    }

    /* JADX INFO: renamed from: o.wen$Activity */
    public static final class Activity implements TabLayout.OnTabSelectedListener {
        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }

        public Activity() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (tab != null) {
                int position = tab.getPosition();
                C53084wen c53084wen = C53084wen.this;
                C53084wen.copydefault(c53084wen).copydefault.setCurrentItem(position, c53084wen.AEQbTJ);
            }
        }
    }

    private final void isConnected() {
        values().OLrzqt.AEQbTJ(new Activity());
        ViewPager2 viewPager2 = values().copydefault;
        viewPager2.registerOnPageChangeCallback(new ActionBar());
        viewPager2.setAdapter(new C47976uAj(this, copydefault(), null, 4, null));
        android.view.View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            recyclerView.setOverScrollMode(2);
        }
        new TabLayoutMediator(values().OLrzqt.copydefault(), values().copydefault, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o.weq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                C53084wen.OLrzqt(this.OLrzqt, tab, i);
            }
        }).attach();
    }

    /* JADX INFO: renamed from: o.wen$ActionBar */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public ActionBar() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            C53084wen.this.AEQbTJ = i2 > 0;
        }
    }

    public static final void OLrzqt(C53084wen c53084wen, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        tab.view.setOnLongClickListener(new View.OnLongClickListener() { // from class: o.weo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(android.view.View view) {
                return C53084wen.AEQbTJ(view);
            }
        });
        tab.setText(c53084wen.copydefault().get(i).OLrzqt());
    }

    private final java.util.List<C53086wep> copydefault() {
        if (this.KWHzl.isEmpty()) {
            java.util.ArrayList<C53086wep> arrayList = this.KWHzl;
            arrayList.add(new C53086wep("order_favorite", C33070mpX.AYXKKw(C55688xof.Application.AlertController2)));
            arrayList.add(new C53086wep("order_limit_price", C33070mpX.AYXKKw(C55688xof.Application.AlertController1)));
            arrayList.add(new C53086wep("start_condition", C33070mpX.AYXKKw(C55688xof.Application.sendMediaButton)));
        }
        return this.KWHzl;
    }
}

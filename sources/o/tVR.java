package o;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tVR {
    public final WeakReference<ViewPager2> AEQbTJ;
    public final Activity EZpvd;
    public final ViewTreeObserver.OnGlobalLayoutListener KWHzl;
    public final StateListAnimator OLrzqt;
    public int copydefault;

    public tVR(@NotNull ViewPager2 viewPager2) {
        RecyclerView.Adapter adapter;
        Intrinsics.checkNotNullParameter(viewPager2, "");
        this.AEQbTJ = new WeakReference<>(viewPager2);
        Activity activity = new Activity();
        this.EZpvd = activity;
        StateListAnimator stateListAnimator = new StateListAnimator();
        this.OLrzqt = stateListAnimator;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.tVY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                tVR.KWHzl(this.OLrzqt);
            }
        };
        this.KWHzl = onGlobalLayoutListener;
        viewPager2.setOffscreenPageLimit(1);
        AEQbTJ();
        viewPager2.registerOnPageChangeCallback(activity);
        android.view.View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.registerAdapterDataObserver(stateListAnimator);
        }
        viewPager2.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public Activity() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            ViewPager2 viewPager2 = (ViewPager2) tVR.this.AEQbTJ.get();
            if (viewPager2 != null) {
                tVR.this.KWHzl(viewPager2, i);
            }
        }
    }

    public static final class StateListAnimator extends RecyclerView.AdapterDataObserver {
        public StateListAnimator() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            super.onChanged();
            tVR.this.AEQbTJ();
        }
    }

    public static final void KWHzl(tVR tvr) {
        ViewPager2 viewPager2 = tvr.AEQbTJ.get();
        if (viewPager2 != null) {
            tvr.KWHzl(viewPager2, viewPager2.getCurrentItem());
        }
    }

    public final void KWHzl() {
        RecyclerView.Adapter adapter;
        ViewPager2 viewPager2 = this.AEQbTJ.get();
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.EZpvd);
            viewPager2.getViewTreeObserver().removeOnGlobalLayoutListener(this.KWHzl);
            android.view.View childAt = viewPager2.getChildAt(0);
            RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
            if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
                adapter.unregisterAdapterDataObserver(this.OLrzqt);
            }
        }
        this.AEQbTJ.clear();
    }

    public final void AEQbTJ() {
        ViewPager2 viewPager2 = this.AEQbTJ.get();
        if (viewPager2 != null) {
            KWHzl(viewPager2, 0);
        }
    }

    public final void KWHzl(final ViewPager2 viewPager2, int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        android.view.View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i)) == null) {
            return;
        }
        final android.view.View view = viewHolderFindViewHolderForAdapterPosition.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.post(new java.lang.Runnable() { // from class: o.tVZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                tVR.OLrzqt(view, this, viewPager2);
            }
        });
    }

    public static final void OLrzqt(android.view.View view, tVR tvr, ViewPager2 viewPager2) {
        if (view.getWidth() <= 0) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight == 0 || measuredHeight == tvr.copydefault || viewPager2.getLayoutParams().height == measuredHeight) {
            return;
        }
        tvr.copydefault = measuredHeight;
        viewPager2.getLayoutParams().height = measuredHeight;
        viewPager2.requestLayout();
    }
}

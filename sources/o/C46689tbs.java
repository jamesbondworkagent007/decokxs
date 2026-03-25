package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tbs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46689tbs {
    public final ViewPager2 EZpvd;
    public final ViewPager2.OnPageChangeCallback OLrzqt;

    /* JADX INFO: renamed from: o.tbs$Activity */
    public static final class Activity extends ViewPager2.OnPageChangeCallback {
        public int copydefault;

        public Activity() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            boolean z = i2 - this.copydefault < 0;
            this.copydefault = i2;
            C46689tbs.this.copydefault(i, f, z);
            pUU.EZpvd("TransformViewPager onPageScrolled", "position: " + i + ", positionOffset:" + f + ", positionOffsetPixels:" + i2);
        }
    }

    public C46689tbs(@NotNull ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "");
        this.EZpvd = viewPager2;
        this.OLrzqt = new Activity();
    }

    public final void KWHzl(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        this.EZpvd.setAdapter(adapter);
        if (!(adapter instanceof mAR)) {
            throw new java.lang.IllegalStateException("You should set adapter that implements `TransformableAdapter`".toString());
        }
        KWHzl();
        this.EZpvd.registerOnPageChangeCallback(this.OLrzqt);
        this.EZpvd.requestLayout();
    }

    public final void KWHzl() {
        this.EZpvd.getLayoutParams().height = EZpvd(this.EZpvd.getCurrentItem());
        pUU.KWHzl("TransformViewPager", "updateCurrentItemHeight:" + this.EZpvd.getLayoutParams().height + "@currentItem:" + this.EZpvd.getCurrentItem());
        this.EZpvd.requestLayout();
    }

    public final void copydefault(int i, float f, boolean z) {
        if (C33129mqd.OLrzqt(java.lang.Float.valueOf(f), java.lang.Float.valueOf(0.0f)) || C33129mqd.OLrzqt(java.lang.Float.valueOf(f), java.lang.Float.valueOf(1.0f))) {
            return;
        }
        if (z) {
            i++;
        }
        float fEZpvd = EZpvd(i, z) - EZpvd(i);
        if (z) {
            f = 1 - f;
        }
        this.EZpvd.getLayoutParams().height = EZpvd(i) + ((int) (fEZpvd * f));
        this.EZpvd.requestLayout();
    }

    public final int EZpvd(int i, boolean z) {
        return EZpvd((!z || i < 1) ? i + 1 : i - 1);
    }

    public final int EZpvd(int i) {
        if (this.EZpvd.getAdapter() == null) {
            return 0;
        }
        java.lang.Object adapter = this.EZpvd.getAdapter();
        Intrinsics.copydefault(adapter, "");
        java.util.List<mAS> listKWHzl = ((mAR) adapter).KWHzl();
        if (listKWHzl.size() <= i) {
            return 0;
        }
        mAS mas = listKWHzl.get(i);
        return (int) ((mas.EZpvd() / mas.AYXKKw()) * OLrzqt(i));
    }

    public final int OLrzqt(int i) {
        java.lang.Object adapter = this.EZpvd.getAdapter();
        mAR mar = adapter instanceof mAR ? (mAR) adapter : null;
        java.util.List<mAS> listKWHzl = mar != null ? mar.KWHzl() : null;
        if ((listKWHzl != null ? listKWHzl.size() : 0) <= i) {
            return 0;
        }
        mAS mas = listKWHzl != null ? listKWHzl.get(i) : null;
        ViewGroup.LayoutParams layoutParams = this.EZpvd.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            if (this.EZpvd.getLayoutParams().width == -1) {
                return C33570myu.djBIcL(this.EZpvd.getContext().getApplicationContext());
            }
            return this.EZpvd.getLayoutParams().width;
        }
        if (mas != null) {
            return (int) mas.AYXKKw();
        }
        return 0;
    }

    public final void EZpvd() {
        this.EZpvd.unregisterOnPageChangeCallback(this.OLrzqt);
    }
}

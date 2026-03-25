package o;

import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uAk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47977uAk {
    public final ViewPager2 EZpvd;
    public final ViewPager2.OnPageChangeCallback KWHzl;
    public final androidx.fragment.app.FragmentManager OLrzqt;

    public C47977uAk(@NotNull ViewPager2 viewPager2, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(viewPager2, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.EZpvd = viewPager2;
        this.OLrzqt = fragmentManager;
        this.KWHzl = new ActionBar();
    }

    /* JADX INFO: renamed from: o.uAk$ActionBar */
    public static final class ActionBar extends ViewPager2.OnPageChangeCallback {
        public int OLrzqt;

        public ActionBar() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i, float f, int i2) {
            boolean z = i2 - this.OLrzqt < 0;
            this.OLrzqt = i2;
            C47977uAk.this.copydefault(i, f, z);
        }
    }

    public final void KWHzl(RecyclerView.Adapter<? extends RecyclerView.ViewHolder> adapter) {
        this.EZpvd.setAdapter(adapter);
        AEQbTJ();
        this.EZpvd.registerOnPageChangeCallback(this.KWHzl);
        this.EZpvd.requestLayout();
    }

    public final void AEQbTJ() {
        this.EZpvd.getLayoutParams().height = EZpvd(this.EZpvd.getCurrentItem());
        pUU.EZpvd("TransformViewPager", "updateCurrentItemHeight:" + this.EZpvd.getLayoutParams().height + "@currentItem:" + this.EZpvd.getCurrentItem());
        this.EZpvd.requestLayout();
    }

    public final void copydefault(int i, float f, boolean z) {
        if (f == 0.0f || f == 1.0f) {
            return;
        }
        if (z) {
            i++;
        }
        float fOLrzqt = OLrzqt(i, z) - EZpvd(i);
        if (z) {
            f = 1 - f;
        }
        this.EZpvd.getLayoutParams().height = EZpvd(i) + ((int) (fOLrzqt * f));
        this.EZpvd.requestLayout();
    }

    public final int OLrzqt(int i, boolean z) {
        return EZpvd((!z || i < 1) ? i + 1 : i - 1);
    }

    public final int EZpvd(int i) {
        RecyclerView.Adapter adapter = this.EZpvd.getAdapter();
        if (adapter == null) {
            return 0;
        }
        ActivityResultCaller activityResultCallerFindFragmentByTag = this.OLrzqt.findFragmentByTag("f" + adapter.getItemId(i));
        mAS masKWHzl = activityResultCallerFindFragmentByTag instanceof mAS ? (mAS) activityResultCallerFindFragmentByTag : null;
        if (masKWHzl == null) {
            masKWHzl = KWHzl();
        }
        return (int) ((masKWHzl.EZpvd() / masKWHzl.AYXKKw()) * EZpvd(masKWHzl));
    }

    public final int EZpvd(mAS mas) {
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

    public final mAS KWHzl() {
        return new StateListAnimator(C33570myu.AEQbTJ(), C33518mxv.EZpvd(C32979mnm.EZpvd.OLrzqt(), 448.0f));
    }

    public final void EZpvd() {
        this.EZpvd.unregisterOnPageChangeCallback(this.KWHzl);
    }

    /* JADX INFO: renamed from: o.uAk$StateListAnimator */
    /* JADX INFO: loaded from: classes19.dex */
    public final class StateListAnimator implements mAS {
        public final float EZpvd;
        public final float copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.mAS
        public float AYXKKw() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.mAS
        public float EZpvd() {
            return this.copydefault;
        }

        public StateListAnimator(float f, float f2) {
            this.EZpvd = f;
            this.copydefault = f2;
        }
    }
}

package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.akD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C7454akD extends RecyclerView.ItemDecoration {
    public int AEQbTJ;
    public final StateListAnimator KWHzl;
    public int OLrzqt;
    public android.view.View copydefault;

    /* JADX INFO: renamed from: o.akD$StateListAnimator */
    /* JADX INFO: loaded from: classes3.dex */
    public interface StateListAnimator {
        boolean AEQbTJ(int i);

        android.view.View EZpvd(int i);

        boolean KWHzl();

        int OLrzqt(int i);
    }

    public C7454akD(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl = stateListAnimator;
        this.AEQbTJ = -1;
    }

    public final android.view.View copydefault(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        if (viewGroup.getChildCount() > 0) {
            return viewGroup.getChildAt(0);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(@NotNull android.graphics.Canvas canvas, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        android.view.View childAt;
        int childAdapterPosition;
        Intrinsics.checkNotNullParameter(canvas, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.onDrawOver(canvas, recyclerView, state);
        if (!this.KWHzl.KWHzl() || (childAt = recyclerView.getChildAt(0)) == null || (childAdapterPosition = recyclerView.getChildAdapterPosition(childAt)) == -1) {
            return;
        }
        int iOLrzqt = this.KWHzl.OLrzqt(childAdapterPosition);
        if (iOLrzqt != this.AEQbTJ) {
            this.AEQbTJ = iOLrzqt;
            android.view.View viewEZpvd = this.KWHzl.EZpvd(childAdapterPosition);
            if (viewEZpvd == null) {
                return;
            }
            this.copydefault = viewEZpvd;
            Intrinsics.copydefault(viewEZpvd);
            EZpvd(recyclerView, viewEZpvd);
        }
        android.view.View view = this.copydefault;
        if (view == null) {
            return;
        }
        android.view.View viewCopydefault = copydefault(recyclerView, view.getBottom(), iOLrzqt);
        if (viewCopydefault != null && this.KWHzl.AEQbTJ(recyclerView.getChildAdapterPosition(viewCopydefault))) {
            EZpvd(canvas, view, viewCopydefault);
        } else {
            EZpvd(canvas, view);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, android.view.View view) {
        canvas.save();
        canvas.translate(0.0f, 0.0f);
        view.draw(canvas);
        canvas.restore();
    }

    public final void EZpvd(android.graphics.Canvas canvas, android.view.View view, android.view.View view2) {
        canvas.save();
        canvas.translate(0.0f, view2.getTop() - view.getHeight());
        view.draw(canvas);
        canvas.restore();
    }

    public final android.view.View copydefault(RecyclerView recyclerView, int i, int i2) {
        android.view.View viewCopydefault;
        int bottom;
        int childCount = recyclerView.getChildCount();
        int i3 = 0;
        while (i3 < childCount) {
            android.view.View childAt = recyclerView.getChildAt(i3);
            boolean zAEQbTJ = this.KWHzl.AEQbTJ(recyclerView.getChildAdapterPosition(childAt));
            if (zAEQbTJ) {
                Intrinsics.copydefault(childAt);
                viewCopydefault = copydefault(childAt);
            } else {
                viewCopydefault = childAt;
            }
            if (viewCopydefault == null) {
                viewCopydefault = childAt;
            }
            int height = (i2 == i3 || !zAEQbTJ) ? 0 : this.OLrzqt - viewCopydefault.getHeight();
            if (zAEQbTJ) {
                bottom = viewCopydefault.getBottom() + childAt.getTop();
            } else {
                bottom = childAt.getBottom();
            }
            if (childAt.getTop() > 0) {
                bottom += height;
            }
            if (bottom > i && childAt.getTop() <= i) {
                return childAt;
            }
            i3++;
        }
        return null;
    }

    public final void EZpvd(android.view.ViewGroup viewGroup, android.view.View view) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), 0);
        int paddingLeft = viewGroup.getPaddingLeft();
        int paddingRight = viewGroup.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int childMeasureSpec = android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, paddingLeft + paddingRight, layoutParams != null ? layoutParams.width : -2);
        int paddingTop = viewGroup.getPaddingTop();
        int paddingBottom = viewGroup.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        view.measure(childMeasureSpec, android.view.ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, paddingTop + paddingBottom, layoutParams2 != null ? layoutParams2.height : -2));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        this.OLrzqt = measuredHeight;
        Unit unit = Unit.INSTANCE;
        view.layout(0, 0, measuredWidth, measuredHeight);
    }
}

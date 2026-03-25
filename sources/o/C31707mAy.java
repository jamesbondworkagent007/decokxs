package o;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.mAy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31707mAy extends RecyclerView.ItemDecoration {
    public android.graphics.drawable.Drawable AEQbTJ;
    public int EZpvd;
    public int KWHzl;
    public android.graphics.drawable.Drawable OLrzqt;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(android.graphics.drawable.Drawable drawable, int i, int i2, android.graphics.drawable.Drawable drawable2, int i3) {
        this.AEQbTJ = drawable;
        this.KWHzl = i;
        this.copydefault = i2;
        this.OLrzqt = drawable2;
        this.EZpvd = i3;
    }

    public C31707mAy() {
        AEQbTJ(new ColorDrawable(0), this.KWHzl, this.copydefault, new ColorDrawable(0), this.EZpvd);
    }

    public C31707mAy(int i, int i2) {
        AEQbTJ(new ColorDrawable(0), i, i2, new ColorDrawable(0), this.EZpvd);
    }

    public C31707mAy(int i, int i2, int i3) {
        AEQbTJ(new ColorDrawable(0), i, i2, new ColorDrawable(0), i3);
    }

    public C31707mAy(android.graphics.drawable.Drawable drawable, int i, int i2, android.graphics.drawable.Drawable drawable2, int i3) {
        AEQbTJ(drawable, i, i2, drawable2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.AEQbTJ == null) {
            return;
        }
        if (this.KWHzl > 0) {
            EZpvd(canvas, recyclerView);
        }
        if (this.copydefault > 0) {
            AEQbTJ(canvas, recyclerView);
        }
        if (this.EZpvd > 0) {
            KWHzl(canvas, recyclerView);
        }
    }

    public final void EZpvd(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            if (i < childCount - ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanCount() || recyclerView.getLayoutManager().canScrollVertically() || !C31706mAx.OLrzqt(recyclerView, childAt)) {
                KWHzl(canvas, childAt, this.AEQbTJ, this.KWHzl);
            }
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, android.view.View view, android.graphics.drawable.Drawable drawable, int i) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int right = view.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        drawable.setBounds(right, view.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, i + right, view.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        drawable.draw(canvas);
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            android.view.View childAt = recyclerView.getChildAt(i);
            if (i < childCount - ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanCount() || recyclerView.getLayoutManager().canScrollHorizontally() || !C31706mAx.OLrzqt(recyclerView, childAt)) {
                OLrzqt(canvas, childAt, this.AEQbTJ, this.copydefault);
            }
        }
    }

    public final void OLrzqt(android.graphics.Canvas canvas, android.view.View view, android.graphics.drawable.Drawable drawable, int i) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        int left = view.getLeft();
        int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int right = view.getRight();
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int bottom = view.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        drawable.setBounds(left - i2, bottom, right + i3, i + bottom);
        drawable.draw(canvas);
    }

    public final void KWHzl(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        if (childCount == 0) {
            return;
        }
        for (int spanCount = childCount - ((GridLayoutManager) recyclerView.getLayoutManager()).getSpanCount(); spanCount < childCount; spanCount++) {
            android.view.View childAt = recyclerView.getChildAt(spanCount);
            if (childAt != null && C31706mAx.OLrzqt(recyclerView, childAt)) {
                if (recyclerView.getLayoutManager().canScrollHorizontally()) {
                    KWHzl(canvas, childAt, this.OLrzqt, this.EZpvd);
                } else if (recyclerView.getLayoutManager().canScrollVertically()) {
                    OLrzqt(canvas, childAt, this.OLrzqt, this.EZpvd);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        if (gridLayoutManager.canScrollHorizontally()) {
            if (C31706mAx.OLrzqt(recyclerView, view)) {
                if (recyclerView.getChildAdapterPosition(view) == gridLayoutManager.getItemCount() - 1) {
                    rect.set(0, 0, this.EZpvd, 0);
                    return;
                } else {
                    rect.set(0, 0, this.EZpvd, this.copydefault);
                    return;
                }
            }
            rect.set(0, 0, this.KWHzl, this.copydefault);
            return;
        }
        if (gridLayoutManager.canScrollVertically()) {
            if (C31706mAx.OLrzqt(recyclerView, view)) {
                if (recyclerView.getChildAdapterPosition(view) == gridLayoutManager.getItemCount() - 1) {
                    rect.set(0, 0, 0, this.EZpvd);
                    return;
                } else {
                    rect.set(0, 0, this.KWHzl, this.EZpvd);
                    return;
                }
            }
            rect.set(0, 0, this.KWHzl, this.copydefault);
        }
    }
}

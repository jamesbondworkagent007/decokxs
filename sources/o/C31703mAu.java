package o;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.mAu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31703mAu extends RecyclerView.ItemDecoration {
    public int AEQbTJ;
    public int KWHzl;
    public android.graphics.drawable.Drawable OLrzqt;
    public android.graphics.drawable.Drawable copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(android.graphics.drawable.Drawable drawable, int i, android.graphics.drawable.Drawable drawable2, int i2) {
        this.OLrzqt = drawable;
        this.AEQbTJ = i;
        this.copydefault = drawable2;
        this.KWHzl = i2;
    }

    public C31703mAu() {
        EZpvd(new ColorDrawable(0), this.AEQbTJ, new ColorDrawable(0), this.KWHzl);
    }

    public C31703mAu(int i, int i2) {
        EZpvd(new ColorDrawable(0), i, new ColorDrawable(0), i2);
    }

    public C31703mAu(@androidx.annotation.ColorInt int i, int i2, @androidx.annotation.ColorInt int i3, int i4) {
        EZpvd(new ColorDrawable(i), i2, new ColorDrawable(i3), i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDraw(canvas, recyclerView, state);
        if (this.OLrzqt == null) {
            return;
        }
        if (recyclerView.getLayoutManager().canScrollHorizontally()) {
            AEQbTJ(canvas, recyclerView);
        } else if (recyclerView.getLayoutManager().canScrollVertically()) {
            copydefault(canvas, recyclerView);
        }
    }

    private void AEQbTJ(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            android.view.View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            boolean z = i == childCount + (-1);
            int iCopydefault = copydefault(recyclerView, z);
            if (iCopydefault > 0) {
                int i2 = iCopydefault + right;
                if (z) {
                    this.copydefault.setBounds(right, paddingTop, i2, height);
                    this.copydefault.draw(canvas);
                } else {
                    this.OLrzqt.setBounds(right, paddingTop, i2, height);
                    this.OLrzqt.draw(canvas);
                }
            }
            i++;
        }
    }

    private void copydefault(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            android.view.View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z = i == childCount + (-1);
            int iCopydefault = copydefault(recyclerView, z);
            if (iCopydefault > 0) {
                int i2 = iCopydefault + bottom;
                if (z) {
                    this.copydefault.setBounds(paddingLeft, bottom, width, i2);
                    this.copydefault.draw(canvas);
                } else {
                    this.OLrzqt.setBounds(paddingLeft, bottom, width, i2);
                    this.OLrzqt.draw(canvas);
                }
            }
            i++;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        boolean zOLrzqt = OLrzqt(recyclerView, view);
        if (!zOLrzqt || this.KWHzl > 0) {
            if (recyclerView.getLayoutManager().canScrollHorizontally()) {
                if (recyclerView.getLayoutDirection() == 1) {
                    rect.left = copydefault(recyclerView, zOLrzqt);
                    return;
                } else {
                    rect.right = copydefault(recyclerView, zOLrzqt);
                    return;
                }
            }
            if (recyclerView.getLayoutManager().canScrollVertically()) {
                rect.bottom = copydefault(recyclerView, zOLrzqt);
            }
        }
    }

    public final int copydefault(RecyclerView recyclerView, boolean z) {
        if (z) {
            return this.KWHzl;
        }
        int i = this.AEQbTJ;
        return i != 0 ? i : recyclerView.getLayoutManager().canScrollHorizontally() ? this.OLrzqt.getIntrinsicWidth() : this.OLrzqt.getIntrinsicHeight();
    }

    private boolean OLrzqt(RecyclerView recyclerView, android.view.View view) {
        return recyclerView.getChildAdapterPosition(view) == recyclerView.getLayoutManager().getItemCount() - 1;
    }
}

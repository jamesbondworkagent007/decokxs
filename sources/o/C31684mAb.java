package o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.mAb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31684mAb extends RecyclerView.ItemDecoration {
    public boolean AEQbTJ;
    public int AYXKKw;
    public int EZpvd;
    public boolean KWHzl;
    public android.graphics.drawable.Drawable OLrzqt;
    public boolean copydefault;

    public C31684mAb(android.content.Context context, android.util.AttributeSet attributeSet) {
        this.copydefault = false;
        this.KWHzl = false;
        this.EZpvd = 0;
        this.AEQbTJ = false;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{android.R.attr.listDivider});
        this.OLrzqt = typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C31684mAb(android.graphics.drawable.Drawable drawable) {
        this.copydefault = false;
        this.KWHzl = false;
        this.EZpvd = 0;
        this.AEQbTJ = false;
        this.OLrzqt = drawable;
    }

    public C31684mAb(android.graphics.drawable.Drawable drawable, boolean z, boolean z2) {
        this(drawable);
        this.copydefault = z;
        this.KWHzl = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.OLrzqt != null && recyclerView.getChildLayoutPosition(view) >= 1) {
            if (copydefault(recyclerView) == 1) {
                rect.bottom = this.OLrzqt.getIntrinsicHeight();
            } else {
                rect.right = this.OLrzqt.getIntrinsicWidth();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDrawOver(android.graphics.Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int intrinsicWidth;
        int width;
        int height;
        int bottom;
        int right;
        int i;
        if (this.OLrzqt == null) {
            super.onDrawOver(canvas, recyclerView, state);
            return;
        }
        int iCopydefault = copydefault(recyclerView);
        int childCount = recyclerView.getChildCount();
        if (iCopydefault == 1) {
            intrinsicWidth = this.OLrzqt.getIntrinsicHeight();
            right = recyclerView.getPaddingLeft() + this.EZpvd;
            height = 0;
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            bottom = 0;
        } else {
            intrinsicWidth = this.OLrzqt.getIntrinsicWidth();
            int paddingTop = recyclerView.getPaddingTop();
            width = 0;
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            bottom = paddingTop;
            right = 0;
        }
        if (this.AEQbTJ) {
            i = this.copydefault ? 1 : 2;
        } else if (this.copydefault) {
            i = 0;
        }
        int i2 = this.AYXKKw;
        if (i2 != 0) {
            if (i2 < 0) {
                this.AYXKKw = 0;
            }
            if (this.AYXKKw > childCount) {
                this.AYXKKw = childCount - 1;
            }
            i = this.AYXKKw;
        }
        while (i < childCount) {
            android.view.View childAt = recyclerView.getChildAt(i);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            if (iCopydefault == 1) {
                int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                height = top + intrinsicWidth;
                bottom = top;
            } else {
                int left = (childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + this.EZpvd;
                width = left + intrinsicWidth;
                right = left;
            }
            this.OLrzqt.setBounds(right, bottom, width, height);
            this.OLrzqt.draw(canvas);
            i++;
        }
        if (!this.KWHzl || childCount <= 0) {
            return;
        }
        android.view.View childAt2 = recyclerView.getChildAt(childCount - 1);
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) childAt2.getLayoutParams();
        if (iCopydefault == 1) {
            bottom = childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
            height = bottom + intrinsicWidth;
        } else {
            right = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
            width = right + intrinsicWidth;
        }
        this.OLrzqt.setBounds(right, bottom, width, height);
        this.OLrzqt.draw(canvas);
    }

    private int copydefault(RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) recyclerView.getLayoutManager()).getOrientation();
        }
        throw new java.lang.IllegalStateException("ListDividerItemDecoration can only be used with a LinearLayoutManager.");
    }
}

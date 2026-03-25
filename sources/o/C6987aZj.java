package o;

import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: o.aZj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class C6987aZj extends RecyclerView.ItemDecoration {
    public int AEQbTJ;
    public android.graphics.drawable.Drawable AYXKKw;
    public int AhwBna;
    public int EZpvd;
    public int KWHzl;
    public android.graphics.drawable.Drawable OLrzqt;
    public android.graphics.drawable.Drawable copydefault;
    public int djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(android.graphics.drawable.Drawable drawable, int i, android.graphics.drawable.Drawable drawable2, int i2, android.graphics.drawable.Drawable drawable3, int i3, int i4, int i5) {
        this.OLrzqt = drawable;
        this.KWHzl = i;
        this.copydefault = drawable2;
        this.EZpvd = i2;
        this.AYXKKw = drawable3;
        this.djBIcL = i3;
        this.AhwBna = i4;
        this.AEQbTJ = i5;
    }

    public C6987aZj() {
        int i = this.KWHzl;
        this.EZpvd = i;
        this.djBIcL = i;
        OLrzqt(new ColorDrawable(0), this.KWHzl, new ColorDrawable(0), this.EZpvd, new ColorDrawable(0), this.djBIcL, 0, 0);
    }

    public C6987aZj(int i, int i2) {
        int i3 = this.KWHzl;
        this.EZpvd = i3;
        this.djBIcL = i3;
        OLrzqt(new ColorDrawable(0), i, new ColorDrawable(0), i, new ColorDrawable(0), i2, 0, 0);
    }

    public C6987aZj(@androidx.annotation.ColorInt int i, int i2, @androidx.annotation.ColorInt int i3, int i4, int i5, int i6) {
        int i7 = this.KWHzl;
        this.EZpvd = i7;
        this.djBIcL = i7;
        OLrzqt(new ColorDrawable(i), i2, new ColorDrawable(i), i2, new ColorDrawable(i3), i4, i5, i6);
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
            KWHzl(canvas, recyclerView);
        }
    }

    public final void AEQbTJ(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            android.view.View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
            boolean z = i == 0;
            boolean z2 = i == childCount + (-1);
            int iEZpvd = EZpvd(recyclerView, z, z2);
            if (iEZpvd > 0) {
                int i2 = iEZpvd + right;
                if (z2) {
                    android.graphics.drawable.Drawable drawable = this.AYXKKw;
                    if (drawable != null) {
                        drawable.setBounds(right, this.AhwBna + paddingTop, i2, height - this.AEQbTJ);
                        this.AYXKKw.draw(canvas);
                    }
                } else if (z) {
                    android.graphics.drawable.Drawable drawable2 = this.copydefault;
                    if (drawable2 != null) {
                        drawable2.setBounds(right, this.AhwBna + paddingTop, i2, height - this.AEQbTJ);
                        this.copydefault.draw(canvas);
                    }
                } else {
                    this.OLrzqt.setBounds(right, this.AhwBna + paddingTop, i2, height - this.AEQbTJ);
                    this.OLrzqt.draw(canvas);
                }
            }
            i++;
        }
    }

    public final void KWHzl(android.graphics.Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        int i = 0;
        while (i < childCount) {
            android.view.View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
            boolean z = i == 0;
            boolean z2 = i == childCount + (-1);
            int iEZpvd = EZpvd(recyclerView, z, z2);
            if (iEZpvd > 0) {
                int i2 = iEZpvd + bottom;
                if (z2) {
                    android.graphics.drawable.Drawable drawable = this.AYXKKw;
                    if (drawable != null) {
                        drawable.setBounds(this.AhwBna + paddingLeft, bottom, width - this.AEQbTJ, i2);
                        this.AYXKKw.draw(canvas);
                    }
                } else if (z) {
                    android.graphics.drawable.Drawable drawable2 = this.copydefault;
                    if (drawable2 != null) {
                        drawable2.setBounds(this.AhwBna + paddingLeft, bottom, width - this.AEQbTJ, i2);
                        this.copydefault.draw(canvas);
                    }
                } else {
                    this.OLrzqt.setBounds(this.AhwBna + paddingLeft, bottom, width - this.AEQbTJ, i2);
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
        if (!zOLrzqt || this.EZpvd > 0) {
            boolean zAEQbTJ = AEQbTJ(recyclerView, view);
            if (!zAEQbTJ || this.djBIcL > 0) {
                if (recyclerView.getLayoutManager().canScrollHorizontally()) {
                    rect.right = EZpvd(recyclerView, zOLrzqt, zAEQbTJ);
                } else if (recyclerView.getLayoutManager().canScrollVertically()) {
                    rect.bottom = EZpvd(recyclerView, zOLrzqt, zAEQbTJ);
                }
            }
        }
    }

    public final int EZpvd(RecyclerView recyclerView, boolean z, boolean z2) {
        if (z) {
            return this.EZpvd;
        }
        if (z2) {
            return this.djBIcL;
        }
        int i = this.KWHzl;
        return i != 0 ? i : recyclerView.getLayoutManager().canScrollHorizontally() ? this.OLrzqt.getIntrinsicWidth() : this.OLrzqt.getIntrinsicHeight();
    }

    public final boolean OLrzqt(RecyclerView recyclerView, android.view.View view) {
        return recyclerView.getChildAdapterPosition(view) == 0;
    }

    public final boolean AEQbTJ(RecyclerView recyclerView, android.view.View view) {
        return recyclerView.getChildAdapterPosition(view) == recyclerView.getLayoutManager().getItemCount() - 1;
    }
}

package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: o.avK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C8042avK extends RecyclerView.ItemDecoration {
    public int AYXKKw;
    public int AEQbTJ = -1;
    public int copydefault = Integer.MAX_VALUE;
    public boolean EZpvd = true;
    public boolean OLrzqt = true;
    public boolean KWHzl = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.EZpvd = z;
    }

    public C8042avK(int i) {
        this.AYXKKw = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        int iKWHzl;
        int iCopydefault;
        int spanIndex;
        int spanCount;
        int orientation;
        int i;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (recyclerView.getAdapter() instanceof AbstractC8041avJ) {
            iKWHzl = ((AbstractC8041avJ) recyclerView.getAdapter()).KWHzl();
            iCopydefault = ((AbstractC8041avJ) recyclerView.getAdapter()).copydefault();
        } else {
            iKWHzl = 0;
            iCopydefault = 0;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            orientation = staggeredGridLayoutManager.getOrientation();
            spanCount = staggeredGridLayoutManager.getSpanCount();
            spanIndex = ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
        } else if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            orientation = gridLayoutManager.getOrientation();
            spanCount = gridLayoutManager.getSpanCount();
            spanIndex = ((GridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
        } else if (layoutManager instanceof LinearLayoutManager) {
            orientation = ((LinearLayoutManager) layoutManager).getOrientation();
            spanIndex = 0;
            spanCount = 1;
        } else {
            spanIndex = 0;
            spanCount = 0;
            orientation = 0;
        }
        if (childAdapterPosition < iKWHzl || childAdapterPosition >= recyclerView.getAdapter().getItemCount() - iCopydefault) {
            if (this.KWHzl) {
                if (orientation == 1) {
                    int i2 = this.EZpvd ? this.AYXKKw : 0;
                    rect.left = i2;
                    rect.right = i2;
                    rect.top = this.OLrzqt ? this.AYXKKw : 0;
                    return;
                }
                int i3 = this.EZpvd ? this.AYXKKw : 0;
                rect.bottom = i3;
                rect.top = i3;
                rect.left = this.OLrzqt ? this.AYXKKw : 0;
                return;
            }
            return;
        }
        if (orientation == 1) {
            float f = spanCount;
            float width = (recyclerView.getWidth() - (this.AYXKKw * ((this.EZpvd ? 1 : -1) + spanCount))) / f;
            float width2 = recyclerView.getWidth() / f;
            i = this.EZpvd ? this.AYXKKw : 0;
            int i4 = this.AYXKKw;
            float f2 = spanIndex;
            int i5 = (int) ((i + ((i4 + width) * f2)) - (f2 * width2));
            rect.left = i5;
            rect.right = (int) ((width2 - i5) - width);
            if (childAdapterPosition - iKWHzl < spanCount && this.OLrzqt) {
                rect.top = i4;
            }
            rect.bottom = i4;
            return;
        }
        float f3 = spanCount;
        float height = (recyclerView.getHeight() - (this.AYXKKw * ((this.EZpvd ? 1 : -1) + spanCount))) / f3;
        float height2 = recyclerView.getHeight() / f3;
        i = this.EZpvd ? this.AYXKKw : 0;
        int i6 = this.AYXKKw;
        float f4 = spanIndex;
        int i7 = (int) ((i + ((i6 + height) * f4)) - (f4 * height2));
        rect.bottom = i7;
        rect.top = (int) ((height2 - i7) - height);
        if (childAdapterPosition - iKWHzl < spanCount && this.OLrzqt) {
            rect.left = i6;
        }
        rect.right = i6;
    }
}

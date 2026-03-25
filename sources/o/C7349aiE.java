package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.immomo.mls.fun.ud.view.recycler.UDCollectionLayout;

/* JADX INFO: renamed from: o.aiE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C7349aiE extends C7347aiC {
    public UDCollectionLayout KWHzl;

    public C7349aiE(int i, UDCollectionLayout uDCollectionLayout) {
        super(uDCollectionLayout);
        this.KWHzl = uDCollectionLayout;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect rect, android.view.View view, RecyclerView recyclerView, RecyclerView.State state) {
        int iGEmmrt = this.KWHzl.gEmmrt();
        int iDjBIcL = this.KWHzl.djBIcL();
        int iAYXKKw = this.KWHzl.AYXKKw();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        GridLayoutManager.LayoutParams layoutParams = (GridLayoutManager.LayoutParams) view.getLayoutParams();
        int spanCount = gridLayoutManager.getSpanCount();
        super.getItemOffsets(rect, view, recyclerView, state);
        int spanGroupIndex = gridLayoutManager.getSpanSizeLookup().getSpanGroupIndex(recyclerView.getChildAdapterPosition(view), spanCount);
        int spanGroupIndex2 = gridLayoutManager.getSpanSizeLookup().getSpanGroupIndex(recyclerView.getAdapter().getItemCount() - 1, spanCount);
        int i = this.KWHzl.EZpvd()[3];
        int i2 = this.KWHzl.EZpvd()[2];
        if (iAYXKKw == 1) {
            rect.bottom = iDjBIcL;
            if (this.copydefault) {
                if (spanGroupIndex == spanGroupIndex2 - 1) {
                    rect.bottom = i;
                }
                if (spanGroupIndex == spanGroupIndex2) {
                    rect.bottom = 0;
                }
            } else if (spanGroupIndex == spanGroupIndex2) {
                rect.bottom = i;
            }
            if (layoutParams.getSpanSize() == spanCount) {
                rect.left = iGEmmrt;
                rect.right = iGEmmrt;
            } else {
                float f = spanCount;
                float f2 = iGEmmrt;
                int spanIndex = (int) (((spanCount - layoutParams.getSpanIndex()) / f) * f2);
                rect.left = spanIndex;
                rect.right = (int) (((f2 * (spanCount + 1)) / f) - spanIndex);
            }
        } else {
            rect.right = iGEmmrt;
            if (this.copydefault) {
                if (spanGroupIndex == spanGroupIndex2 - 1) {
                    rect.right = i2;
                }
                if (spanGroupIndex == spanGroupIndex2) {
                    rect.right = 0;
                }
            } else if (spanGroupIndex == spanGroupIndex2) {
                rect.right = i2;
            }
            if (layoutParams.getSpanSize() == spanCount) {
                rect.top = iDjBIcL;
                rect.bottom = iDjBIcL;
            } else {
                float f3 = spanCount;
                float f4 = iDjBIcL;
                int spanIndex2 = (int) (((spanCount - layoutParams.getSpanIndex()) / f3) * f4);
                rect.top = spanIndex2;
                rect.bottom = (int) (((f4 * (spanCount + 1)) / f3) - spanIndex2);
            }
        }
        C55296xhK.EZpvd(rect, C55296xhK.AEQbTJ(recyclerView));
    }
}

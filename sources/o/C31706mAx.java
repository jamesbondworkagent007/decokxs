package o;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: renamed from: o.mAx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C31706mAx {
    public static boolean OLrzqt(RecyclerView recyclerView, android.view.View view) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            GridLayoutManager.SpanSizeLookup spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            int itemCount = gridLayoutManager.getItemCount();
            if (childAdapterPosition >= itemCount - gridLayoutManager.getSpanCount()) {
                int spanSize = 0;
                int spanSize2 = 0;
                for (int i = 0; i < itemCount; i++) {
                    spanSize += spanSizeLookup.getSpanSize(i);
                    if (i <= childAdapterPosition) {
                        spanSize2 += spanSizeLookup.getSpanSize(i);
                    }
                }
                int spanCount = spanSize % gridLayoutManager.getSpanCount();
                if (spanCount == 0) {
                    spanCount = gridLayoutManager.getSpanCount();
                }
                if (spanSize2 > spanSize - spanCount) {
                    return true;
                }
            }
        } else {
            boolean z = layoutManager instanceof StaggeredGridLayoutManager;
        }
        return false;
    }
}

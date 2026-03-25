package o;

import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.soq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C45389soq extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public final RecyclerView.Adapter<?> EZpvd;
    public final int KWHzl;
    public final int OLrzqt;
    public final int copydefault;
    public final int djBIcL;

    public C45389soq(@NotNull RecyclerView.Adapter<?> adapter, int i, int i2, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(adapter, "");
        this.EZpvd = adapter;
        this.copydefault = i;
        this.KWHzl = i2;
        this.djBIcL = i3;
        this.AEQbTJ = i4;
        this.OLrzqt = i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        Intrinsics.copydefault(adapter, "");
        ConcatAdapter concatAdapter = (ConcatAdapter) adapter;
        RecyclerView.Adapter adapter2 = (RecyclerView.Adapter) concatAdapter.getWrappedAdapterAndPosition(childAdapterPosition).first;
        java.lang.Integer num = (java.lang.Integer) concatAdapter.getWrappedAdapterAndPosition(childAdapterPosition).second;
        if (Intrinsics.EZpvd(adapter2, this.EZpvd)) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            Intrinsics.copydefault(layoutManager, "");
            int spanCount = ((GridLayoutManager) layoutManager).getSpanCount();
            int iIntValue = num.intValue() % spanCount;
            int i = num.intValue() < spanCount ? this.djBIcL : this.OLrzqt;
            int i2 = (num.intValue() / spanCount) + 1 >= ((adapter2.getItemCount() + spanCount) - 1) / spanCount ? this.AEQbTJ : 0;
            if (iIntValue == 0) {
                if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
                    rect.set(this.OLrzqt / 2, i, this.KWHzl, i2);
                    return;
                } else {
                    rect.set(this.copydefault, i, this.OLrzqt / 2, i2);
                    return;
                }
            }
            if (iIntValue != 1) {
                return;
            }
            if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
                rect.set(this.KWHzl, i, this.OLrzqt / 2, i2);
                return;
            } else {
                rect.set(this.OLrzqt / 2, i, this.KWHzl, i2);
                return;
            }
        }
        super.getItemOffsets(rect, view, recyclerView, state);
    }
}

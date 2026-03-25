package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tVn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46470tVn extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;

    public C46470tVn(@androidx.annotation.DimenRes int i) {
        this.AEQbTJ = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.getItemOffsets(rect, view, recyclerView, state);
        int iOLrzqt = C33070mpX.OLrzqt(this.AEQbTJ);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        java.lang.Integer numValueOf = adapter != null ? java.lang.Integer.valueOf(adapter.getItemCount()) : null;
        if (childAdapterPosition != 0) {
            rect.top = iOLrzqt;
        }
        if (numValueOf == null || childAdapterPosition != numValueOf.intValue() - 1) {
            return;
        }
        rect.bottom = iOLrzqt;
    }
}

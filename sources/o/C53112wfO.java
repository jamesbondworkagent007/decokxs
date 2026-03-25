package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53112wfO extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        rect.top = (layoutManager == null || layoutManager.getPosition(view) <= 0) ? 0 : C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null);
    }
}

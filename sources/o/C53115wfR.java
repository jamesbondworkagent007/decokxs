package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53115wfR extends RecyclerView.ItemDecoration {
    public final int EZpvd;
    public int OLrzqt;

    public C53115wfR(int i) {
        this.EZpvd = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (this.OLrzqt > 0) {
            rect.top = C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null);
        }
        this.OLrzqt++;
    }
}

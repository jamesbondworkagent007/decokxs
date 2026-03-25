package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wfM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53110wfM extends RecyclerView.ItemDecoration {
    public final int AEQbTJ;
    public int EZpvd;

    public C53110wfM(int i) {
        this.AEQbTJ = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        rect.top = this.EZpvd > 0 ? C55298xhM.dpInt$default(10, (android.content.Context) null, 1, (java.lang.Object) null) : 0;
        this.EZpvd++;
    }
}

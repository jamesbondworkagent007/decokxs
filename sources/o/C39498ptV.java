package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ptV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C39498ptV extends RecyclerView.ItemDecoration {
    public int copydefault = C55298xhM.dp2px$default(2.0f, null, 1, null);
    public int KWHzl = C55298xhM.dp2px$default(14.0f, null, 1, null);

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (recyclerView.getChildAdapterPosition(view) < 9) {
            rect.set(0, 0, 0, this.KWHzl);
        } else {
            rect.set(0, 0, 0, this.copydefault);
        }
    }
}

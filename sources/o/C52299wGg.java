package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C52300wGh;
import o.C52305wGm;
import o.C52306wGn;
import o.C52313wGu;
import o.wNH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52299wGg extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(view);
        if ((childViewHolder instanceof C52313wGu.StateListAnimator) || (childViewHolder instanceof C52305wGm.Application) || (childViewHolder instanceof C52300wGh.ActionBar)) {
            rect.top = C55298xhM.dp2px$default(24.0f, null, 1, null);
            return;
        }
        if (childViewHolder instanceof wNH.ActionBar) {
            rect.top = C55298xhM.dp2px$default(20.0f, null, 1, null);
        } else if (childViewHolder instanceof C52306wGn.StateListAnimator) {
            rect.top = C55298xhM.dp2px$default(12.0f, null, 1, null);
        } else {
            rect.top = C55298xhM.dp2px$default(0.0f, null, 1, null);
        }
    }
}

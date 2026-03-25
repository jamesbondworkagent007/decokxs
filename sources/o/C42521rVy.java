package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rVy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42521rVy extends RecyclerView.ItemDecoration {
    public final android.content.Context KWHzl;

    public C42521rVy(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.top = this.KWHzl.getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.zuBGHE);
        }
    }
}

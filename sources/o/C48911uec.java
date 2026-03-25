package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48911uec extends RecyclerView.ItemDecoration {
    public boolean copydefault;

    public C48911uec(boolean z) {
        this.copydefault = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        super.getItemOffsets(rect, view, recyclerView, state);
        if (view instanceof android.widget.LinearLayout) {
            OLrzqt(rect, C55298xhM.dp2px$default(16.0f, null, 1, null));
            copydefault(rect, C55298xhM.dp2px$default(16.0f, null, 1, null));
            return;
        }
        if (recyclerView.getChildAdapterPosition(view) % 2 == 0) {
            OLrzqt(rect, C55298xhM.dp2px$default(6.0f, null, 1, null));
            copydefault(rect, C55298xhM.dp2px$default(16.0f, null, 1, null));
        } else {
            OLrzqt(rect, C55298xhM.dp2px$default(16.0f, null, 1, null));
            copydefault(rect, C55298xhM.dp2px$default(6.0f, null, 1, null));
        }
        rect.top = C55298xhM.dp2px$default(12.0f, null, 1, null);
    }

    public final void OLrzqt(@NotNull android.graphics.Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "");
        if (this.copydefault) {
            rect.left = i;
        } else {
            rect.right = i;
        }
    }

    public final void copydefault(@NotNull android.graphics.Rect rect, int i) {
        Intrinsics.checkNotNullParameter(rect, "");
        if (this.copydefault) {
            rect.right = i;
        } else {
            rect.left = i;
        }
    }
}

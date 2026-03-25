package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C40880qgL extends RecyclerView.ItemDecoration {
    public final android.content.Context copydefault;

    public C40880qgL(android.content.Context context) {
        this.copydefault = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        android.content.Context context = this.copydefault;
        if (context != null && C55296xhK.OLrzqt(context)) {
            if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(itemCount), 1)) {
                rect.right = C55298xhM.dp2px$default(24.0f, null, 1, null);
                return;
            }
            if (childLayoutPosition == 0) {
                rect.left = C55298xhM.dp2px$default(4.0f, null, 1, null);
                rect.right = C55298xhM.dp2px$default(24.0f, null, 1, null);
                return;
            } else if (childLayoutPosition == itemCount - 1) {
                rect.left = C55298xhM.dp2px$default(24.0f, null, 1, null);
                rect.right = C55298xhM.dp2px$default(4.0f, null, 1, null);
                return;
            } else {
                rect.left = C55298xhM.dp2px$default(4.0f, null, 1, null);
                rect.right = C55298xhM.dp2px$default(4.0f, null, 1, null);
                return;
            }
        }
        if (!C33129mqd.AEQbTJ(java.lang.Integer.valueOf(itemCount), 1)) {
            rect.left = C55298xhM.dp2px$default(24.0f, null, 1, null);
            return;
        }
        if (childLayoutPosition == 0) {
            rect.left = C55298xhM.dp2px$default(24.0f, null, 1, null);
            rect.right = C55298xhM.dp2px$default(4.0f, null, 1, null);
        } else if (childLayoutPosition == itemCount - 1) {
            rect.left = C55298xhM.dp2px$default(4.0f, null, 1, null);
            rect.right = C55298xhM.dp2px$default(24.0f, null, 1, null);
        } else {
            rect.left = C55298xhM.dp2px$default(4.0f, null, 1, null);
            rect.right = C55298xhM.dp2px$default(4.0f, null, 1, null);
        }
    }
}

package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fbT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18069fbT extends RecyclerView.ItemDecoration {
    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NotNull android.graphics.Rect rect, @NotNull android.view.View view, @NotNull RecyclerView recyclerView, @NotNull RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(rect, "");
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(recyclerView, "");
        Intrinsics.checkNotNullParameter(state, "");
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        C59534zip c59534zip = adapter instanceof C59534zip ? (C59534zip) adapter : null;
        if (c59534zip == null) {
            return;
        }
        java.util.List<?> items = c59534zip.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        java.lang.Object objAkhnZx = CollectionsKt___CollectionsKt.AkhnZx(items, childAdapterPosition);
        if (objAkhnZx == null) {
            return;
        }
        android.content.Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        int iCopydefault = C55298xhM.copydefault(12.0f, context);
        android.content.Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        int iCopydefault2 = C55298xhM.copydefault(16.0f, context2);
        if (objAkhnZx instanceof C18062fbM) {
            rect.top = iCopydefault;
            rect.bottom = iCopydefault;
            java.util.List<?> items2 = c59534zip.getItems();
            Intrinsics.checkNotNullExpressionValue(items2, "");
            java.util.List listAhwBna = CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) items2, childAdapterPosition);
            if ((listAhwBna instanceof java.util.Collection) && listAhwBna.isEmpty()) {
                return;
            }
            java.util.Iterator it = listAhwBna.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof C18062fbM) {
                    int i = rect.top;
                    android.content.Context context3 = view.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "");
                    rect.top = i + C55298xhM.copydefault(8.0f, context3);
                    return;
                }
            }
            return;
        }
        if (objAkhnZx instanceof C18063fbN) {
            int i2 = 0;
            for (int i3 = childAdapterPosition - 1; -1 < i3; i3--) {
                java.lang.Object obj = c59534zip.getItems().get(i3);
                if (obj instanceof C18062fbM) {
                    break;
                }
                if (obj instanceof C18063fbN) {
                    i2++;
                }
            }
            if (i2 % 2 == 0) {
                rect.left = 0;
                rect.right = iCopydefault2 / 2;
            } else {
                rect.left = iCopydefault2 / 2;
                rect.right = 0;
            }
            rect.bottom = iCopydefault2;
        }
    }
}

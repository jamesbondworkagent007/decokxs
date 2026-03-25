package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33064mpR {
    public static final void OLrzqt(@NotNull C59534zip c59534zip, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        Intrinsics.checkNotNullParameter(list, "");
        c59534zip.setItems(list);
        c59534zip.notifyDataSetChanged();
    }

    public static final void AEQbTJ(@NotNull C59534zip c59534zip, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<?> items = c59534zip.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "");
        for (java.lang.Object obj : items) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        arrayList.addAll(list);
        c59534zip.setItems(arrayList);
        c59534zip.notifyDataSetChanged();
    }

    public static final void OLrzqt(@NotNull C43316rmw c43316rmw, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        Intrinsics.checkNotNullParameter(list, "");
        c43316rmw.setItems(list);
        c43316rmw.notifyDataSetChanged();
    }

    public static final void KWHzl(@NotNull C43316rmw c43316rmw, @NotNull java.util.List<? extends java.lang.Object> list) {
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (c43316rmw.getItems() != null) {
            java.util.List<?> items = c43316rmw.getItems();
            Intrinsics.checkNotNullExpressionValue(items, "");
            for (java.lang.Object obj : items) {
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
        }
        arrayList.addAll(list);
        c43316rmw.setItems(arrayList);
        c43316rmw.notifyDataSetChanged();
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ymE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57636ymE {
    public static /* synthetic */ void refreshDataOrEmpty$default(C59534zip c59534zip, android.content.Context context, java.util.List list, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f = -1.0f;
        }
        copydefault(c59534zip, context, (java.util.List<? extends java.lang.Object>) list, str, f);
    }

    public static final void copydefault(@NotNull C59534zip c59534zip, @NotNull android.content.Context context, @NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (list.isEmpty()) {
            list = C56402yEa.EZpvd(new C57637ymF(str, C33052mpF.EZpvd(40.0f, context), f));
        }
        c59534zip.setItems(list);
        c59534zip.notifyDataSetChanged();
    }

    public static /* synthetic */ void refreshDataOrEmpty$default(C43316rmw c43316rmw, android.content.Context context, java.util.List list, java.lang.String str, float f, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            f = -1.0f;
        }
        copydefault(c43316rmw, context, (java.util.List<? extends java.lang.Object>) list, str, f);
    }

    public static final void copydefault(@NotNull C43316rmw c43316rmw, @NotNull android.content.Context context, @NotNull java.util.List<? extends java.lang.Object> list, @NotNull java.lang.String str, float f) {
        Intrinsics.checkNotNullParameter(c43316rmw, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (list.isEmpty()) {
            list = C56402yEa.EZpvd(new C57637ymF(str, C33052mpF.EZpvd(40.0f, context), f));
        }
        c43316rmw.setItems(list);
        c43316rmw.notifyDataSetChanged();
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jxy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27588jxy {
    public static final void AEQbTJ(@NotNull C59534zip c59534zip, @NotNull java.util.List<?> list) {
        Intrinsics.checkNotNullParameter(c59534zip, "");
        Intrinsics.checkNotNullParameter(list, "");
        c59534zip.setItems(list);
        c59534zip.notifyDataSetChanged();
    }
}

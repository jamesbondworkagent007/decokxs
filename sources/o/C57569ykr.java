package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ykr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57569ykr {
    public static final java.lang.String EZpvd(@NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        java.lang.String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() == 0) {
            simpleName = "Anonymous";
        }
        return simpleName + "@" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }
}

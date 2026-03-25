package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56455yG {
    public static final <T> boolean copydefault(@NotNull java.util.List<T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.add(t);
    }

    public static final <T> T copydefault(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (T) C56406yEe.iwGUEr(list);
    }

    public static final <T> T AEQbTJ(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return (T) C56406yEe.getFieldNames(list);
    }

    public static final <T> T EZpvd(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.get(list.size() - 1);
    }

    public static final <T> T OLrzqt(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (!list.isEmpty()) {
            return (T) EZpvd(list);
        }
        return null;
    }

    public static final <T> T OLrzqt(@NotNull java.util.List<T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "");
        T t2 = (T) AEQbTJ(list);
        copydefault(list, t);
        return t2;
    }
}

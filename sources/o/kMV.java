package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kMV {
    public static final <T> void KWHzl(@NotNull java.util.List<T> list, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        T t = list.get(i);
        list.set(i, list.get(i2));
        list.set(i2, t);
    }
}

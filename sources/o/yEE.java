package o;

import java.util.LinkedHashSet;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yEE extends yED {
    public static <T> java.util.Set<T> copydefault() {
        return EmptySet.INSTANCE;
    }

    public static <T> java.util.Set<T> AhwBna(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return yDV.QOLQEE(tArr);
    }

    public static <T> java.util.Set<T> gEmmrt(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.Set) yDV.KWHzl((java.lang.Object[]) tArr, new LinkedHashSet(C56423yEv.copydefault(tArr.length)));
    }

    public static <T> java.util.HashSet<T> djBIcL(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (java.util.HashSet) yDV.KWHzl((java.lang.Object[]) tArr, new java.util.HashSet(C56423yEv.copydefault(tArr.length)));
    }

    public static <T> LinkedHashSet<T> valueOf(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (LinkedHashSet) yDV.KWHzl((java.lang.Object[]) tArr, new LinkedHashSet(C56423yEv.copydefault(tArr.length)));
    }

    public static <T> java.util.Set<T> KWHzl(T t) {
        return t != null ? yED.AEQbTJ(t) : copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Set<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.Set<T> OLrzqt(@NotNull java.util.Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : yED.AEQbTJ(set.iterator().next());
        }
        return copydefault();
    }
}

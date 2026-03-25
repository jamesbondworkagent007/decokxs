package o;

import java.util.Collections;
import java.util.TreeSet;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yED {
    public static <T> java.util.Set<T> AEQbTJ(T t) {
        java.util.Set<T> setSingleton = Collections.singleton(t);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "");
        return setSingleton;
    }

    public static <E> java.util.Set<E> EZpvd() {
        return new SetBuilder();
    }

    public static <E> java.util.Set<E> KWHzl(int i) {
        return new SetBuilder(i);
    }

    public static <E> java.util.Set<E> copydefault(@NotNull java.util.Set<E> set) {
        Intrinsics.checkNotNullParameter(set, "");
        return ((SetBuilder) set).build();
    }

    public static <T> TreeSet<T> AYXKKw(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (TreeSet) yDV.KWHzl((java.lang.Object[]) tArr, new TreeSet());
    }
}

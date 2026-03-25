package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yET {
    public static <T> int copydefault(T t, T t2, @NotNull Function1<? super T, ? extends java.lang.Comparable<?>>... function1Arr) {
        Intrinsics.checkNotNullParameter(function1Arr, "");
        if (function1Arr.length <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return AEQbTJ(t, t2, function1Arr);
    }

    public static final <T> int AEQbTJ(T t, T t2, Function1<? super T, ? extends java.lang.Comparable<?>>[] function1Arr) {
        for (Function1<? super T, ? extends java.lang.Comparable<?>> function1 : function1Arr) {
            int iKWHzl = KWHzl(function1.invoke(t), function1.invoke(t2));
            if (iKWHzl != 0) {
                return iKWHzl;
            }
        }
        return 0;
    }

    public static <T extends java.lang.Comparable<?>> int KWHzl(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    public static <T> java.util.Comparator<T> OLrzqt(@NotNull final Function1<? super T, ? extends java.lang.Comparable<?>>... function1Arr) {
        Intrinsics.checkNotNullParameter(function1Arr, "");
        if (function1Arr.length <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        return new java.util.Comparator() { // from class: o.yEX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.Comparator
            public final int compare(java.lang.Object obj, java.lang.Object obj2) {
                return yET.EZpvd(function1Arr, obj, obj2);
            }
        };
    }

    public static final int EZpvd(Function1[] function1Arr, java.lang.Object obj, java.lang.Object obj2) {
        return AEQbTJ(obj, obj2, function1Arr);
    }

    public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> copydefault() {
        yEW yew = yEW.EZpvd;
        Intrinsics.copydefault(yew, "");
        return yew;
    }

    public static <T extends java.lang.Comparable<? super T>> java.util.Comparator<T> EZpvd() {
        yEZ yez = yEZ.copydefault;
        Intrinsics.copydefault(yez, "");
        return yez;
    }
}

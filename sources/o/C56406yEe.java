package o;

import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yEe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C56406yEe extends C56407yEf {
    public static <T> boolean KWHzl(@NotNull java.util.Collection<? super T> collection, @NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        if (iterable instanceof java.util.Collection) {
            return collection.addAll((java.util.Collection) iterable);
        }
        java.util.Iterator<? extends T> it = iterable.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean AEQbTJ(@NotNull java.util.Collection<? super T> collection, @NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.Iterator<? extends T> it = sequence.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }

    public static <T> boolean KWHzl(@NotNull java.util.Collection<? super T> collection, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        return collection.addAll(yDT.fIwbmz(tArr));
    }

    public static <T> java.util.Collection<T> ORxRYg(@NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable instanceof java.util.Collection ? (java.util.Collection) iterable : CollectionsKt___CollectionsKt.AxsJAYsNCnLh(iterable);
    }

    public static <T> boolean AYXKKw(@NotNull java.util.Collection<? super T> collection, @NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        return collection.removeAll(ORxRYg(iterable));
    }

    public static <T> boolean OLrzqt(@NotNull java.util.Collection<? super T> collection, @NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(sequence, "");
        java.util.List listZuBGHE = C59467zhb.zuBGHE(sequence);
        return (listZuBGHE.isEmpty() ^ true) && collection.removeAll(listZuBGHE);
    }

    public static <T> boolean OLrzqt(@NotNull java.util.Collection<? super T> collection, @NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(tArr, "");
        return ((tArr.length == 0) ^ true) && collection.removeAll(yDT.fIwbmz(tArr));
    }

    public static <T> boolean gEmmrt(@NotNull java.util.Collection<? super T> collection, @NotNull java.lang.Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(iterable, "");
        return collection.retainAll(ORxRYg(iterable));
    }

    public static <T> boolean djBIcL(@NotNull java.lang.Iterable<? extends T> iterable, @NotNull Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AEQbTJ(iterable, function1, true);
    }

    public static <T> boolean valueOf(@NotNull java.lang.Iterable<? extends T> iterable, @NotNull Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return AEQbTJ(iterable, function1, false);
    }

    public static final <T> boolean AEQbTJ(java.lang.Iterable<? extends T> iterable, Function1<? super T, java.lang.Boolean> function1, boolean z) {
        java.util.Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (function1.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static <T> T getNewProxyInstance(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(0);
    }

    public static <T> T uzCIH(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T iwGUEr(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(yDY.AuCTel(list));
    }

    public static <T> T getFieldNames(@NotNull java.util.List<T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(yDY.AuCTel(list));
    }

    public static <T> boolean AEQbTJ(@NotNull java.util.List<T> list, @NotNull Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return OLrzqt(list, function1, true);
    }

    public static final <T> boolean OLrzqt(java.util.List<T> list, Function1<? super T, java.lang.Boolean> function1, boolean z) {
        int i;
        if (!(list instanceof java.util.RandomAccess)) {
            Intrinsics.copydefault(list, "");
            return AEQbTJ(C56532yIw.copydefault(list), function1, z);
        }
        int iAuCTel = yDY.AuCTel(list);
        if (iAuCTel >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                T t = list.get(i2);
                if (function1.invoke(t).booleanValue() != z) {
                    if (i != i2) {
                        list.set(i, t);
                    }
                    i++;
                }
                if (i2 == iAuCTel) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iAuCTel2 = yDY.AuCTel(list);
        if (i > iAuCTel2) {
            return true;
        }
        while (true) {
            list.remove(iAuCTel2);
            if (iAuCTel2 == i) {
                return true;
            }
            iAuCTel2--;
        }
    }
}

package o;

import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yDY extends C56402yEa {
    public static final <T> java.util.Collection<T> djBIcL(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return new yDP(tArr, false);
    }

    public static <T> java.util.List<T> AhwBna() {
        return EmptyList.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.yDR.KWHzl(java.lang.Object[]):java.util.List */
    public static <T> java.util.List<T> gEmmrt(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length > 0 ? yDT.fIwbmz(tArr) : AhwBna();
    }

    public static <T> java.util.List<T> AhwBna(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length == 0 ? new java.util.ArrayList() : new java.util.ArrayList(new yDP(tArr, true));
    }

    public static <T> java.util.ArrayList<T> copydefault(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return tArr.length == 0 ? new java.util.ArrayList<>() : new java.util.ArrayList<>(new yDP(tArr, true));
    }

    public static <T> java.util.List<T> OLrzqt(T t) {
        return t != null ? C56402yEa.EZpvd(t) : AhwBna();
    }

    public static <T> java.util.List<T> valueOf(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return yDV.getFieldNames(tArr);
    }

    public static kotlin.ranges.IntRange valueOf(@NotNull java.util.Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return new kotlin.ranges.IntRange(0, collection.size() - 1);
    }

    public static <T> int AuCTel(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return list.size() - 1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> java.util.List<T> fJNWhG(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : C56402yEa.EZpvd(list.get(0));
        }
        return AhwBna();
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, java.lang.Comparable comparable, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return OLrzqt(list, comparable, i, i2);
    }

    public static final <T extends java.lang.Comparable<? super T>> int OLrzqt(@NotNull java.util.List<? extends T> list, T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iKWHzl = yET.KWHzl(list.get(i4), t);
            if (iKWHzl < 0) {
                i = i4 + 1;
            } else {
                if (iKWHzl <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, java.lang.Object obj, java.util.Comparator comparator, int i, int i2, int i3, java.lang.Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return OLrzqt(list, obj, comparator, i, i2);
    }

    public static <T> int OLrzqt(@NotNull java.util.List<? extends T> list, T t, @NotNull java.util.Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        EZpvd(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iCompare = comparator.compare(list.get(i4), t);
            if (iCompare < 0) {
                i = i4 + 1;
            } else {
                if (iCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static /* synthetic */ int binarySearchBy$default(java.util.List list, java.lang.Comparable comparable, int i, int i2, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return copydefault(list, i, i2, new StateListAnimator(function1, comparable));
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class StateListAnimator<T> implements Function1<T, java.lang.Integer> {
        public final /* synthetic */ Function1<T, K> OLrzqt;

        /* JADX INFO: Incorrect field signature: TK; */
        public final /* synthetic */ java.lang.Comparable copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Incorrect types in method signature: (Lkotlin/jvm/functions/Function1<-TT;+TK;>;TK;)V */
        public StateListAnimator(Function1 function1, java.lang.Comparable comparable) {
            this.OLrzqt = function1;
            this.copydefault = comparable;
        }

        /* JADX DEBUG: Class process forced to load method for inline: o.yEQ.EZpvd(java.lang.Comparable, java.lang.Comparable):int */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Integer invoke(T t) {
            return java.lang.Integer.valueOf(yET.KWHzl((java.lang.Comparable) this.OLrzqt.invoke(t), this.copydefault));
        }
    }

    public static /* synthetic */ int binarySearch$default(java.util.List list, int i, int i2, Function1 function1, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return copydefault(list, i, i2, function1);
    }

    public static <T> int copydefault(@NotNull java.util.List<? extends T> list, int i, int i2, @NotNull Function1<? super T, java.lang.Integer> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        EZpvd(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iIntValue = function1.invoke(list.get(i4)).intValue();
            if (iIntValue < 0) {
                i = i4 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void EZpvd(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new java.lang.IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        }
        if (i2 < 0) {
            throw new java.lang.IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        }
        if (i3 <= i) {
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
    }

    public static void AYXKKw() {
        throw new java.lang.ArithmeticException("Index overflow has happened.");
    }

    public static void djBIcL() {
        throw new java.lang.ArithmeticException("Count overflow has happened.");
    }
}

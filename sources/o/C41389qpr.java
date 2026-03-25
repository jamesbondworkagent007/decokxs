package o;

import java.util.LinkedHashMap;
import java.util.function.ToIntFunction;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qpr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41389qpr {
    public static final int OLrzqt(int i, int i2) {
        return i + i2;
    }

    public static final <T> java.util.List<T> AEQbTJ(@NotNull java.util.stream.Stream<T> stream) {
        Intrinsics.checkNotNullParameter(stream, "");
        return C59471zhf.OLrzqt(stream);
    }

    public static final <T, R> java.util.List<R> EZpvd(@NotNull java.util.List<? extends T> list, @NotNull final Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (list.size() >= 500) {
            java.util.stream.Stream<R> map = list.parallelStream().map(new java.util.function.Function() { // from class: o.qpo
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return C41389qpr.gEmmrt(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "");
            return AEQbTJ((java.util.stream.Stream) map);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function1.invoke(it.next()));
        }
        return arrayList;
    }

    public static final java.lang.Object gEmmrt(Function1 function1, java.lang.Object obj) {
        return function1.invoke(obj);
    }

    public static final <T> java.util.List<T> KWHzl(@NotNull java.util.List<? extends T> list, @NotNull final Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (list.size() >= 500) {
            java.util.stream.Stream<? extends T> streamFilter = list.parallelStream().filter(new java.util.function.Predicate() { // from class: o.qps
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return C41389qpr.djBIcL(function1, obj);
                }
            });
            Intrinsics.checkNotNullExpressionValue(streamFilter, "");
            return AEQbTJ((java.util.stream.Stream) streamFilter);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (T t : list) {
            if (function1.invoke(t).booleanValue()) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public static final boolean djBIcL(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final <T> void copydefault(@NotNull java.util.List<? extends T> list, @NotNull final Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (list.size() >= 500) {
            list.parallelStream().forEach(new java.util.function.Consumer() { // from class: o.qpu
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Consumer
                public final void accept(java.lang.Object obj) {
                    C41389qpr.AYXKKw(function1, obj);
                }
            });
            return;
        }
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            function1.invoke(it.next());
        }
    }

    public static final void AYXKKw(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final int KWHzl(java.lang.Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static /* synthetic */ java.lang.Integer uniqueKey$default(java.util.List list, Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function1 = new Function1() { // from class: o.qpv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return java.lang.Integer.valueOf(C41389qpr.KWHzl(obj2));
                }
            };
        }
        return AEQbTJ(list, function1);
    }

    /* JADX DEBUG: Type inference failed for r1v4. Raw type applied. Possible types: T, ? super T */
    public static final <T> java.lang.Integer AEQbTJ(@NotNull java.util.List<? extends T> list, @NotNull final Function1<? super T, java.lang.Integer> function1) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        if (list.size() >= 500) {
            try {
                Result.Application application = Result.Companion;
                java.util.stream.Stream<? extends T> streamParallelStream = list.parallelStream();
                final Function1 function12 = new Function1() { // from class: o.qpx
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Integer.valueOf(C41389qpr.AhwBna(function1, obj));
                    }
                };
                objM7377constructorimpl = Result.m7377constructorimpl(java.lang.Integer.valueOf(streamParallelStream.mapToInt(new ToIntFunction() { // from class: o.qpw
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.ToIntFunction
                    public final int applyAsInt(java.lang.Object obj) {
                        return C41389qpr.valueOf(function12, obj);
                    }
                }).reduce(new java.util.function.IntBinaryOperator() { // from class: o.qpt
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.util.function.IntBinaryOperator
                    public final int applyAsInt(int i, int i2) {
                        return C41389qpr.OLrzqt(i, i2);
                    }
                }).getAsInt()));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
                objM7377constructorimpl = null;
            }
            return (java.lang.Integer) objM7377constructorimpl;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(function1.invoke(it.next()).intValue()));
        }
        java.util.Iterator<T> it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it2.next();
        while (it2.hasNext()) {
            next = (T) java.lang.Integer.valueOf(next.intValue() + ((java.lang.Number) it2.next()).intValue());
        }
        return next;
    }

    public static final int AhwBna(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Number) function1.invoke(obj)).intValue();
    }

    public static final int valueOf(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Number) function1.invoke(obj)).intValue();
    }

    public static final <K, Y> java.util.Map<K, Y> AEQbTJ(@NotNull java.util.List<? extends java.util.Map<K, ? extends Y>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashMap.putAll((java.util.Map) it.next());
        }
        return linkedHashMap;
    }
}

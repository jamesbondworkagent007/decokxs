package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59405zgS extends C59402zgP {
    public static final java.lang.Object EZpvd(java.lang.Object obj) {
        return obj;
    }

    public static final java.lang.Object OLrzqt(java.lang.Object obj) {
        return obj;
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.zgS$ActionBar */
    public static final class ActionBar<T> implements Sequence<T> {
        public final /* synthetic */ java.util.Iterator AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.sequences.Sequence
        public java.util.Iterator<T> iterator() {
            return this.AEQbTJ;
        }

        public ActionBar(java.util.Iterator it) {
            this.AEQbTJ = it;
        }
    }

    public static <T> Sequence<T> AEQbTJ(@NotNull java.util.Iterator<? extends T> it) {
        Intrinsics.checkNotNullParameter(it, "");
        return fARcdN(new ActionBar(it));
    }

    public static <T> Sequence<T> EZpvd(@NotNull T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return yDV.getNewProxyInstance(tArr);
    }

    public static <T> Sequence<T> OLrzqt() {
        return C59392zgF.OLrzqt;
    }

    public static final <T> Sequence<T> fIwbmz(@NotNull Sequence<? extends Sequence<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return AhwBna(sequence, new Function1() { // from class: o.zgQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59405zgS.fJNWhG((Sequence) obj);
            }
        });
    }

    public static final java.util.Iterator fJNWhG(Sequence sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return sequence.iterator();
    }

    public static final java.util.Iterator OLrzqt(java.lang.Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "");
        return iterable.iterator();
    }

    public static <T> Sequence<T> getNewProxyInstance(@NotNull Sequence<? extends java.lang.Iterable<? extends T>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return AhwBna(sequence, new Function1() { // from class: o.zgT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59405zgS.OLrzqt((java.lang.Iterable) obj);
            }
        });
    }

    public static final <T, R> Sequence<R> AhwBna(Sequence<? extends T> sequence, Function1<? super T, ? extends java.util.Iterator<? extends R>> function1) {
        if (sequence instanceof C59474zhi) {
            return ((C59474zhi) sequence).copydefault(function1);
        }
        return new C59398zgL(sequence, new Function1() { // from class: o.zgU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59405zgS.OLrzqt(obj);
            }
        }, function1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Sequence<T> fARcdN(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return sequence instanceof C59389zgC ? sequence : new C59389zgC(sequence);
    }

    public static <T> Sequence<T> AEQbTJ(@NotNull final Function0<? extends T> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        return fARcdN(new C59397zgK(function0, new Function1() { // from class: o.zgV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C59405zgS.copydefault(function0, obj);
            }
        }));
    }

    public static final java.lang.Object copydefault(Function0 function0, java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        return function0.invoke();
    }

    public static <T> Sequence<T> EZpvd(final T t, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        if (t == null) {
            return C59392zgF.OLrzqt;
        }
        return new C59397zgK(new Function0() { // from class: o.zgX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C59405zgS.EZpvd(t);
            }
        }, function1);
    }

    public static <T> Sequence<T> EZpvd(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59397zgK(function0, function1);
    }
}

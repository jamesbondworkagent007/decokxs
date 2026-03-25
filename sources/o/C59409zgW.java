package o;

import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59409zgW extends C59405zgS {
    public static <R> Sequence<R> KWHzl(@NotNull Sequence<?> sequence, @NotNull final java.lang.Class<R> cls) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(cls, "");
        Sequence<R> sequenceDbNXlk = C59467zhb.DbNXlk(sequence, new Function1() { // from class: o.zgY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(C59409zgW.copydefault(cls, obj));
            }
        });
        Intrinsics.copydefault(sequenceDbNXlk, "");
        return sequenceDbNXlk;
    }

    public static final boolean copydefault(java.lang.Class cls, java.lang.Object obj) {
        return cls.isInstance(obj);
    }

    public static <T extends java.lang.Comparable<? super T>> SortedSet<T> hDKMBd(@NotNull Sequence<? extends T> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "");
        return (SortedSet) C59467zhb.OLrzqt(sequence, new TreeSet());
    }
}

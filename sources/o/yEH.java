package o;

import kotlin.collections.SlidingWindowKt$windowedIterator$1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yEH {
    public static final void KWHzl(int i, int i2) {
        java.lang.String str;
        if (i <= 0 || i2 <= 0) {
            if (i != i2) {
                str = "Both size " + i + " and step " + i2 + " must be greater than zero.";
            } else {
                str = "size " + i + " must be greater than zero.";
            }
            throw new java.lang.IllegalArgumentException(str.toString());
        }
    }

    public static final <T> Sequence<java.util.List<T>> KWHzl(@NotNull Sequence<? extends T> sequence, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(sequence, "");
        KWHzl(i, i2);
        return new ActionBar(sequence, i, i2, z, z2);
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    public static final class ActionBar<T> implements Sequence<java.util.List<? extends T>> {
        public final /* synthetic */ int AEQbTJ;
        public final /* synthetic */ int EZpvd;
        public final /* synthetic */ Sequence KWHzl;
        public final /* synthetic */ boolean OLrzqt;
        public final /* synthetic */ boolean copydefault;

        public ActionBar(Sequence sequence, int i, int i2, boolean z, boolean z2) {
            this.KWHzl = sequence;
            this.AEQbTJ = i;
            this.EZpvd = i2;
            this.copydefault = z;
            this.OLrzqt = z2;
        }

        @Override // kotlin.sequences.Sequence
        public java.util.Iterator<java.util.List<? extends T>> iterator() {
            return yEH.KWHzl(this.KWHzl.iterator(), this.AEQbTJ, this.EZpvd, this.copydefault, this.OLrzqt);
        }
    }

    public static final <T> java.util.Iterator<java.util.List<T>> KWHzl(@NotNull java.util.Iterator<? extends T> it, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(it, "");
        return !it.hasNext() ? C56412yEk.copydefault : C59404zgR.copydefault(new SlidingWindowKt$windowedIterator$1(i, i2, it, z2, z, null));
    }
}

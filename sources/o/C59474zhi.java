package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59474zhi<T, R> implements Sequence<R> {
    public final Sequence<T> AEQbTJ;
    public final Function1<T, R> copydefault;

    /* JADX INFO: renamed from: o.zhi$StateListAnimator */
    public static final class StateListAnimator implements java.util.Iterator<R>, InterfaceC56535yIz {
        public final java.util.Iterator<T> EZpvd;
        public final /* synthetic */ C59474zhi<T, R> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public StateListAnimator(C59474zhi<T, R> c59474zhi) {
            this.copydefault = c59474zhi;
            this.EZpvd = c59474zhi.AEQbTJ.iterator();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) this.copydefault.copydefault.invoke(this.EZpvd.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.EZpvd.hasNext();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends R> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59474zhi(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = sequence;
        this.copydefault = function1;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<R> iterator() {
        return new StateListAnimator(this);
    }

    public final <E> Sequence<E> copydefault(@NotNull Function1<? super R, ? extends java.util.Iterator<? extends E>> function1) {
        Intrinsics.checkNotNullParameter(function1, "");
        return new C59398zgL(this.AEQbTJ, this.copydefault, function1);
    }
}

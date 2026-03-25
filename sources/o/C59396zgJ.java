package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59396zgJ<T> implements Sequence<T>, InterfaceC59394zgH<T> {
    public final Sequence<T> AEQbTJ;
    public final int KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59396zgJ(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        this.AEQbTJ = sequence;
        this.KWHzl = i;
        if (i >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o.InterfaceC59394zgH
    public Sequence<T> KWHzl(int i) {
        int i2 = this.KWHzl + i;
        return i2 < 0 ? new C59396zgJ(this, i) : new C59396zgJ(this.AEQbTJ, i2);
    }

    @Override // o.InterfaceC59394zgH
    public Sequence<T> AEQbTJ(int i) {
        int i2 = this.KWHzl;
        int i3 = i2 + i;
        return i3 < 0 ? new C59472zhg(this, i) : new C59473zhh(this.AEQbTJ, i2, i3);
    }

    /* JADX INFO: renamed from: o.zgJ$StateListAnimator */
    public static final class StateListAnimator implements java.util.Iterator<T>, InterfaceC56535yIz {
        public int KWHzl;
        public final java.util.Iterator<T> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public StateListAnimator(C59396zgJ<T> c59396zgJ) {
            this.copydefault = c59396zgJ.AEQbTJ.iterator();
            this.KWHzl = c59396zgJ.KWHzl;
        }

        private final void KWHzl() {
            while (this.KWHzl > 0 && this.copydefault.hasNext()) {
                this.copydefault.next();
                this.KWHzl--;
            }
        }

        @Override // java.util.Iterator
        public T next() {
            KWHzl();
            return this.copydefault.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            KWHzl();
            return this.copydefault.hasNext();
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new StateListAnimator(this);
    }
}

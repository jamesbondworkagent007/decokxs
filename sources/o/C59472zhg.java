package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59472zhg<T> implements Sequence<T>, InterfaceC59394zgH<T> {
    public final int EZpvd;
    public final Sequence<T> KWHzl;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59472zhg(@NotNull Sequence<? extends T> sequence, int i) {
        Intrinsics.checkNotNullParameter(sequence, "");
        this.KWHzl = sequence;
        this.EZpvd = i;
        if (i >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // o.InterfaceC59394zgH
    public Sequence<T> KWHzl(int i) {
        int i2 = this.EZpvd;
        return i >= i2 ? C59405zgS.OLrzqt() : new C59473zhh(this.KWHzl, i, i2);
    }

    @Override // o.InterfaceC59394zgH
    public Sequence<T> AEQbTJ(int i) {
        return i >= this.EZpvd ? this : new C59472zhg(this.KWHzl, i);
    }

    /* JADX INFO: renamed from: o.zhg$StateListAnimator */
    public static final class StateListAnimator implements java.util.Iterator<T>, InterfaceC56535yIz {
        public final java.util.Iterator<T> AEQbTJ;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public StateListAnimator(C59472zhg<T> c59472zhg) {
            this.copydefault = c59472zhg.EZpvd;
            this.AEQbTJ = c59472zhg.KWHzl.iterator();
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.copydefault;
            if (i == 0) {
                throw new NoSuchElementException();
            }
            this.copydefault = i - 1;
            return this.AEQbTJ.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.copydefault > 0 && this.AEQbTJ.hasNext();
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new StateListAnimator(this);
    }
}

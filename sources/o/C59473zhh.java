package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59473zhh<T> implements Sequence<T>, InterfaceC59394zgH<T> {
    public final int AEQbTJ;
    public final Sequence<T> OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.copydefault - this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59473zhh(@NotNull Sequence<? extends T> sequence, int i, int i2) {
        Intrinsics.checkNotNullParameter(sequence, "");
        this.OLrzqt = sequence;
        this.AEQbTJ = i;
        this.copydefault = i2;
        if (i < 0) {
            throw new java.lang.IllegalArgumentException(("startIndex should be non-negative, but is " + i).toString());
        }
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException(("endIndex should be non-negative, but is " + i2).toString());
        }
        if (i2 >= i) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i2 + " < " + i).toString());
    }

    @Override // o.InterfaceC59394zgH
    public Sequence<T> KWHzl(int i) {
        return i >= KWHzl() ? C59405zgS.OLrzqt() : new C59473zhh(this.OLrzqt, this.AEQbTJ + i, this.copydefault);
    }

    @Override // o.InterfaceC59394zgH
    public Sequence<T> AEQbTJ(int i) {
        if (i >= KWHzl()) {
            return this;
        }
        Sequence<T> sequence = this.OLrzqt;
        int i2 = this.AEQbTJ;
        return new C59473zhh(sequence, i2, i + i2);
    }

    /* JADX INFO: renamed from: o.zhh$Application */
    public static final class Application implements java.util.Iterator<T>, InterfaceC56535yIz {
        public final /* synthetic */ C59473zhh<T> AEQbTJ;
        public final java.util.Iterator<T> EZpvd;
        public int copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Application(C59473zhh<T> c59473zhh) {
            this.AEQbTJ = c59473zhh;
            this.EZpvd = c59473zhh.OLrzqt.iterator();
        }

        private final void KWHzl() {
            while (this.copydefault < this.AEQbTJ.AEQbTJ && this.EZpvd.hasNext()) {
                this.EZpvd.next();
                this.copydefault++;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            KWHzl();
            return this.copydefault < this.AEQbTJ.copydefault && this.EZpvd.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            KWHzl();
            if (this.copydefault >= this.AEQbTJ.copydefault) {
                throw new NoSuchElementException();
            }
            this.copydefault++;
            return this.EZpvd.next();
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new Application(this);
    }
}

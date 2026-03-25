package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59414zgb<T> extends AbstractC59346zfM<T> {
    public final T KWHzl;
    public final int OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC59346zfM
    public T AEQbTJ(int i) {
        if (i == this.OLrzqt) {
            return this.KWHzl;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int KWHzl() {
        return this.OLrzqt;
    }

    @Override // o.AbstractC59346zfM
    public int OLrzqt() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final T copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C59414zgb(@NotNull T t, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(t, "");
        this.KWHzl = t;
        this.OLrzqt = i;
    }

    @Override // o.AbstractC59346zfM
    public void OLrzqt(int i, @NotNull T t) {
        Intrinsics.checkNotNullParameter(t, "");
        throw new java.lang.IllegalStateException();
    }

    /* JADX INFO: renamed from: o.zgb$Application */
    public static final class Application implements java.util.Iterator<T>, InterfaceC56535yIz {
        public final /* synthetic */ C59414zgb<T> AEQbTJ;
        public boolean OLrzqt = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Application(C59414zgb<T> c59414zgb) {
            this.AEQbTJ = c59414zgb;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.OLrzqt) {
                this.OLrzqt = false;
                return this.AEQbTJ.copydefault();
            }
            throw new NoSuchElementException();
        }
    }

    @Override // o.AbstractC59346zfM, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return new Application(this);
    }
}

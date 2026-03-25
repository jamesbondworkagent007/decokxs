package o;

import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59470zhe<T> implements Sequence<T> {
    public final Sequence<T> EZpvd;
    public final Function1<T, java.lang.Boolean> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59470zhe(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = sequence;
        this.OLrzqt = function1;
    }

    /* JADX INFO: renamed from: o.zhe$ActionBar */
    public static final class ActionBar implements java.util.Iterator<T>, InterfaceC56535yIz {
        public T AEQbTJ;
        public int KWHzl = -1;
        public final /* synthetic */ C59470zhe<T> OLrzqt;
        public final java.util.Iterator<T> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public ActionBar(C59470zhe<T> c59470zhe) {
            this.OLrzqt = c59470zhe;
            this.copydefault = c59470zhe.EZpvd.iterator();
        }

        private final void AEQbTJ() {
            if (this.copydefault.hasNext()) {
                T next = this.copydefault.next();
                if (((java.lang.Boolean) this.OLrzqt.OLrzqt.invoke(next)).booleanValue()) {
                    this.KWHzl = 1;
                    this.AEQbTJ = next;
                    return;
                }
            }
            this.KWHzl = 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.KWHzl == -1) {
                AEQbTJ();
            }
            if (this.KWHzl == 0) {
                throw new NoSuchElementException();
            }
            T t = this.AEQbTJ;
            this.AEQbTJ = null;
            this.KWHzl = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.KWHzl == -1) {
                AEQbTJ();
            }
            return this.KWHzl == 1;
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new ActionBar(this);
    }
}

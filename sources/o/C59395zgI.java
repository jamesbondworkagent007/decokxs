package o;

import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59395zgI<T> implements Sequence<T> {
    public final Function1<T, java.lang.Boolean> AEQbTJ;
    public final boolean EZpvd;
    public final Sequence<T> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59395zgI(@NotNull Sequence<? extends T> sequence, boolean z, @NotNull Function1<? super T, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = sequence;
        this.EZpvd = z;
        this.AEQbTJ = function1;
    }

    /* JADX INFO: renamed from: o.zgI$Activity */
    public static final class Activity implements java.util.Iterator<T>, InterfaceC56535yIz {
        public int AEQbTJ = -1;
        public final /* synthetic */ C59395zgI<T> EZpvd;
        public T KWHzl;
        public final java.util.Iterator<T> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Activity(C59395zgI<T> c59395zgI) {
            this.EZpvd = c59395zgI;
            this.OLrzqt = c59395zgI.OLrzqt.iterator();
        }

        public final void copydefault() {
            int i;
            while (true) {
                if (!this.OLrzqt.hasNext()) {
                    i = 0;
                    break;
                }
                T next = this.OLrzqt.next();
                if (((java.lang.Boolean) this.EZpvd.AEQbTJ.invoke(next)).booleanValue() == this.EZpvd.EZpvd) {
                    this.KWHzl = next;
                    i = 1;
                    break;
                }
            }
            this.AEQbTJ = i;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.AEQbTJ == -1) {
                copydefault();
            }
            if (this.AEQbTJ == 0) {
                throw new NoSuchElementException();
            }
            T t = this.KWHzl;
            this.KWHzl = null;
            this.AEQbTJ = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.AEQbTJ == -1) {
                copydefault();
            }
            return this.AEQbTJ == 1;
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new Activity(this);
    }
}

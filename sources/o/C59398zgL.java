package o;

import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59398zgL<T, R, E> implements Sequence<E> {
    public final Sequence<T> AEQbTJ;
    public final Function1<T, R> KWHzl;
    public final Function1<R, java.util.Iterator<E>> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.sequences.Sequence<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends R> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super R, ? extends java.util.Iterator<? extends E>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59398zgL(@NotNull Sequence<? extends T> sequence, @NotNull Function1<? super T, ? extends R> function1, @NotNull Function1<? super R, ? extends java.util.Iterator<? extends E>> function12) {
        Intrinsics.checkNotNullParameter(sequence, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AEQbTJ = sequence;
        this.KWHzl = function1;
        this.OLrzqt = function12;
    }

    /* JADX INFO: renamed from: o.zgL$StateListAnimator */
    public static final class StateListAnimator implements java.util.Iterator<E>, InterfaceC56535yIz {
        public final /* synthetic */ C59398zgL<T, R, E> AEQbTJ;
        public final java.util.Iterator<T> EZpvd;
        public int KWHzl;
        public java.util.Iterator<? extends E> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public StateListAnimator(C59398zgL<T, R, E> c59398zgL) {
            this.AEQbTJ = c59398zgL;
            this.EZpvd = c59398zgL.AEQbTJ.iterator();
        }

        @Override // java.util.Iterator
        public E next() {
            int i = this.KWHzl;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !EZpvd()) {
                throw new NoSuchElementException();
            }
            this.KWHzl = 0;
            java.util.Iterator<? extends E> it = this.OLrzqt;
            Intrinsics.copydefault(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i = this.KWHzl;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return EZpvd();
        }

        public final boolean EZpvd() {
            java.util.Iterator<? extends E> it = this.OLrzqt;
            if (it != null && it.hasNext()) {
                this.KWHzl = 1;
                return true;
            }
            while (this.EZpvd.hasNext()) {
                java.util.Iterator<? extends E> it2 = (java.util.Iterator) this.AEQbTJ.OLrzqt.invoke(this.AEQbTJ.KWHzl.invoke(this.EZpvd.next()));
                if (it2.hasNext()) {
                    this.OLrzqt = it2;
                    this.KWHzl = 1;
                    return true;
                }
            }
            this.KWHzl = 2;
            this.OLrzqt = null;
            return false;
        }
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<E> iterator() {
        return new StateListAnimator(this);
    }
}

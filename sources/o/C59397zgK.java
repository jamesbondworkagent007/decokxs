package o;

import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59397zgK<T> implements Sequence<T> {
    public final Function0<T> EZpvd;
    public final Function1<T, T> KWHzl;

    /* JADX INFO: renamed from: o.zgK$StateListAnimator */
    public static final class StateListAnimator implements java.util.Iterator<T>, InterfaceC56535yIz {
        public final /* synthetic */ C59397zgK<T> AEQbTJ;
        public int EZpvd = -2;
        public T KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public StateListAnimator(C59397zgK<T> c59397zgK) {
            this.AEQbTJ = c59397zgK;
        }

        private final void copydefault() {
            T t;
            if (this.EZpvd == -2) {
                t = (T) this.AEQbTJ.EZpvd.invoke();
            } else {
                Function1 function1 = this.AEQbTJ.KWHzl;
                T t2 = this.KWHzl;
                Intrinsics.copydefault(t2);
                t = (T) function1.invoke(t2);
            }
            this.KWHzl = t;
            this.EZpvd = t == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.EZpvd < 0) {
                copydefault();
            }
            if (this.EZpvd == 0) {
                throw new NoSuchElementException();
            }
            T t = this.KWHzl;
            Intrinsics.copydefault(t, "");
            this.EZpvd = -1;
            return t;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.EZpvd < 0) {
                copydefault();
            }
            return this.EZpvd == 1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function0<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59397zgK(@NotNull Function0<? extends T> function0, @NotNull Function1<? super T, ? extends T> function1) {
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = function0;
        this.KWHzl = function1;
    }

    @Override // kotlin.sequences.Sequence
    public java.util.Iterator<T> iterator() {
        return new StateListAnimator(this);
    }
}

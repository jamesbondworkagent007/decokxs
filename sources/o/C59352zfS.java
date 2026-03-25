package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59352zfS extends AbstractC59346zfM {
    public static final C59352zfS KWHzl = new C59352zfS();

    @Override // o.AbstractC59346zfM
    public int OLrzqt() {
        return 0;
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(I)Ljava/lang/Object; */
    @Override // o.AbstractC59346zfM
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public java.lang.Void AEQbTJ(int i) {
        return null;
    }

    private C59352zfS() {
        super(null);
    }

    /* JADX DEBUG: Method merged with bridge method: OLrzqt(ILjava/lang/Object;)V */
    @Override // o.AbstractC59346zfM
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public void OLrzqt(int i, @NotNull java.lang.Void r2) {
        Intrinsics.checkNotNullParameter(r2, "");
        throw new java.lang.IllegalStateException();
    }

    @Override // o.AbstractC59346zfM, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.zfS$StateListAnimator */
    public static final class StateListAnimator implements java.util.Iterator, InterfaceC56535yIz {
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.util.Iterator
        public void remove() {
            throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public java.lang.Void next() {
            throw new NoSuchElementException();
        }
    }
}

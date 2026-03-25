package o;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yHV<T> implements java.util.Iterator<T>, InterfaceC56535yIz {
    public int AEQbTJ;
    public final T[] KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public yHV(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        this.KWHzl = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.AEQbTJ < this.KWHzl.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.KWHzl;
            int i = this.AEQbTJ;
            this.AEQbTJ = i + 1;
            return tArr[i];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            this.AEQbTJ--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}

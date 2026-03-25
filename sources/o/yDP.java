package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yDP<T> implements java.util.Collection<T>, InterfaceC56535yIz {
    public final boolean OLrzqt;
    public final T[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean add(T t) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean addAll(java.util.Collection<? extends T> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public void clear() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        return (T[]) C56511yIb.EZpvd(this, tArr);
    }

    public yDP(@NotNull T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, "");
        this.copydefault = tArr;
        this.OLrzqt = z;
    }

    @Override // java.util.Collection
    public final int size() {
        return copydefault();
    }

    public int copydefault() {
        return this.copydefault.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.copydefault.length == 0;
    }

    @Override // java.util.Collection
    public boolean contains(java.lang.Object obj) {
        return yDV.valueOf(this.copydefault, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Collection<? extends java.lang.Object> collection2 = collection;
        if (!collection2.isEmpty()) {
            java.util.Iterator<T> it = collection2.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator<T> iterator() {
        return yHX.EZpvd(this.copydefault);
    }

    @Override // java.util.Collection
    public final java.lang.Object[] toArray() {
        return C56402yEa.KWHzl(this.copydefault, this.OLrzqt);
    }
}

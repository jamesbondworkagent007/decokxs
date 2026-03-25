package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IQ<E> extends IU<E> implements java.util.List<E>, yIE {
    public java.util.List<E> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.util.List<E> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IQ(@NotNull java.util.List<E> list) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    @Override // java.util.List
    public final E remove(int i) {
        return KWHzl(i);
    }

    @Override // java.util.List
    public E get(int i) {
        return this.AEQbTJ.get(i);
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        return this.AEQbTJ.indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return this.AEQbTJ.lastIndexOf(obj);
    }

    @Override // java.util.List
    public void add(int i, E e) {
        this.AEQbTJ.add(i, e);
    }

    @Override // java.util.List
    public boolean addAll(int i, @NotNull java.util.Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.AEQbTJ.addAll(i, collection);
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator() {
        return this.AEQbTJ.listIterator();
    }

    @Override // java.util.List
    public java.util.ListIterator<E> listIterator(int i) {
        return this.AEQbTJ.listIterator(i);
    }

    public E KWHzl(int i) {
        return this.AEQbTJ.remove(i);
    }

    @Override // java.util.List
    public E set(int i, E e) {
        return this.AEQbTJ.set(i, e);
    }

    @Override // java.util.List
    public java.util.List<E> subList(int i, int i2) {
        return this.AEQbTJ.subList(i, i2);
    }
}

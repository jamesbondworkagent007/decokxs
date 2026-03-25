package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56752yR<Src, Dest> extends C56590yL<Src, Dest> implements java.util.List<Dest> {
    public final java.util.List<Src> AYXKKw;
    public final Function1<Dest, Src> AhwBna;
    public final Function1<Src, Dest> djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public void add(int i, Dest dest) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public boolean addAll(int i, java.util.Collection<? extends Dest> collection) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public Dest remove(int i) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public void replaceAll(java.util.function.UnaryOperator<Dest> unaryOperator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public Dest set(int i, Dest dest) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.List
    public void sort(java.util.Comparator<? super Dest> comparator) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends Src> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super Src, ? extends Dest> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super Dest, ? extends Src> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56752yR(@NotNull java.util.List<? extends Src> list, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        super(list, function1, function12);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AYXKKw = list;
        this.djBIcL = function1;
        this.AhwBna = function12;
    }

    @Override // java.util.List
    public Dest get(int i) {
        return (Dest) this.djBIcL.invoke(this.AYXKKw.get(i));
    }

    @Override // java.util.List
    public int indexOf(java.lang.Object obj) {
        return this.AYXKKw.indexOf(this.AhwBna.invoke(obj));
    }

    @Override // java.util.List
    public int lastIndexOf(java.lang.Object obj) {
        return this.AYXKKw.lastIndexOf(this.AhwBna.invoke(obj));
    }

    @Override // java.util.List
    public java.util.ListIterator<Dest> listIterator() {
        return C56617yM.AEQbTJ((java.util.ListIterator) this.AYXKKw.listIterator(), (Function1) this.djBIcL);
    }

    @Override // java.util.List
    public java.util.ListIterator<Dest> listIterator(int i) {
        return C56617yM.AEQbTJ((java.util.ListIterator) this.AYXKKw.listIterator(i), (Function1) this.djBIcL);
    }

    @Override // java.util.List
    public java.util.List<Dest> subList(int i, int i2) {
        return C56617yM.copydefault(this.AYXKKw.subList(i, i2), this.djBIcL, this.AhwBna);
    }
}

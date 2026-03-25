package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56968yZ<Src, Dest> extends C56752yR<Src, Dest> implements java.util.List<Dest>, yIE {
    public final Function1<Src, Dest> AkhnZx;
    public final java.util.List<Src> gEmmrt;
    public final Function1<Dest, Src> valueOf;

    @Override // o.C56752yR, java.util.List
    public final Dest remove(int i) {
        return OLrzqt(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super Src, ? extends Dest> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super Dest, ? extends Src> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56968yZ(@NotNull java.util.List<Src> list, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        super(list, function1, function12);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.gEmmrt = list;
        this.AkhnZx = function1;
        this.valueOf = function12;
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean add(Dest dest) {
        return this.gEmmrt.add(this.valueOf.invoke(dest));
    }

    @Override // o.C56752yR, java.util.List
    public void add(int i, Dest dest) {
        this.gEmmrt.add(i, this.valueOf.invoke(dest));
    }

    @Override // o.C56752yR, java.util.List
    public boolean addAll(int i, @NotNull java.util.Collection<? extends Dest> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.gEmmrt.addAll(i, C56617yM.EZpvd(collection, this.valueOf, this.AkhnZx));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean addAll(@NotNull java.util.Collection<? extends Dest> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.gEmmrt.addAll(C56617yM.EZpvd(collection, this.valueOf, this.AkhnZx));
    }

    @Override // o.C56590yL, java.util.Collection
    public void clear() {
        this.gEmmrt.clear();
    }

    @Override // o.C56644yN, java.lang.Iterable
    public java.util.Iterator<Dest> iterator() {
        return C56617yM.OLrzqt(this.gEmmrt.iterator(), this.AkhnZx);
    }

    @Override // o.C56752yR, java.util.List
    public java.util.ListIterator<Dest> listIterator() {
        return C56617yM.copydefault(this.gEmmrt.listIterator(), this.AkhnZx, this.valueOf);
    }

    @Override // o.C56752yR, java.util.List
    public java.util.ListIterator<Dest> listIterator(int i) {
        return C56617yM.copydefault(this.gEmmrt.listIterator(i), this.AkhnZx, this.valueOf);
    }

    public Dest OLrzqt(int i) {
        return (Dest) this.AkhnZx.invoke(this.gEmmrt.remove(i));
    }

    @Override // o.C56752yR, java.util.List
    public java.util.List<Dest> subList(int i, int i2) {
        return C56617yM.OLrzqt((java.util.List) this.gEmmrt.subList(i, i2), (Function1) this.AkhnZx, (Function1) this.valueOf);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // o.C56752yR, java.util.List
    public Dest set(int i, Dest dest) {
        return this.AkhnZx.invoke(this.gEmmrt.set(i, this.valueOf.invoke(dest)));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean retainAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.gEmmrt.retainAll(C56617yM.EZpvd(collection, this.valueOf, this.AkhnZx));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean removeAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.gEmmrt.removeAll(C56617yM.EZpvd(collection, this.valueOf, this.AkhnZx));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.gEmmrt.remove(this.valueOf.invoke(obj));
    }
}

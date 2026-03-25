package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56806yT<Src, Dest> extends C56590yL<Src, Dest> implements java.util.Collection<Dest>, yIC {
    public final Function1<Dest, Src> AYXKKw;
    public final Function1<Src, Dest> djBIcL;
    public final java.util.Collection<Src> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super Src, ? extends Dest> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super Dest, ? extends Src> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56806yT(@NotNull java.util.Collection<Src> collection, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        super(collection, function1, function12);
        Intrinsics.checkNotNullParameter(collection, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.valueOf = collection;
        this.djBIcL = function1;
        this.AYXKKw = function12;
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean add(Dest dest) {
        return this.valueOf.add(this.AYXKKw.invoke(dest));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean addAll(@NotNull java.util.Collection<? extends Dest> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.valueOf.addAll(C56617yM.EZpvd(collection, this.AYXKKw, this.djBIcL));
    }

    @Override // o.C56590yL, java.util.Collection
    public void clear() {
        this.valueOf.clear();
    }

    @Override // o.C56644yN, java.lang.Iterable
    public java.util.Iterator<Dest> iterator() {
        return C56617yM.OLrzqt(this.valueOf.iterator(), this.djBIcL);
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean retainAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.valueOf.retainAll(C56617yM.EZpvd(collection, this.AYXKKw, this.djBIcL));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean removeAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.valueOf.removeAll(C56617yM.EZpvd(collection, this.AYXKKw, this.djBIcL));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.valueOf.remove(this.AYXKKw.invoke(obj));
    }
}

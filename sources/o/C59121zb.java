package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C59121zb<Src, Dest> extends C59227zd<Src, Dest> implements java.util.Set<Dest>, yIF {
    public final java.util.Set<Src> AYXKKw;
    public final Function1<Src, Dest> AhwBna;
    public final Function1<Dest, Src> valueOf;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super Src, ? extends Dest> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super Dest, ? extends Src> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C59121zb(@NotNull java.util.Set<Src> set, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        super(set, function1, function12);
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AYXKKw = set;
        this.AhwBna = function1;
        this.valueOf = function12;
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean add(Dest dest) {
        return this.AYXKKw.add(this.valueOf.invoke(dest));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean addAll(@NotNull java.util.Collection<? extends Dest> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.AYXKKw.addAll(C56617yM.EZpvd(collection, this.valueOf, this.AhwBna));
    }

    @Override // o.C56590yL, java.util.Collection
    public void clear() {
        this.AYXKKw.clear();
    }

    @Override // o.C56644yN, java.lang.Iterable
    public java.util.Iterator<Dest> iterator() {
        return C56617yM.OLrzqt(this.AYXKKw.iterator(), this.AhwBna);
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean retainAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.AYXKKw.retainAll(C56617yM.EZpvd(collection, this.valueOf, this.AhwBna));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean removeAll(@NotNull java.util.Collection<? extends java.lang.Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        return this.AYXKKw.removeAll(C56617yM.EZpvd(collection, this.valueOf, this.AhwBna));
    }

    @Override // o.C56590yL, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        return this.AYXKKw.remove(this.valueOf.invoke(obj));
    }
}

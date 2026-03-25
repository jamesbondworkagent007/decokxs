package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56887yW<Src, Dest> extends C56725yQ<Src, Dest> implements java.util.ListIterator<Dest>, yID {
    public final java.util.ListIterator<Src> AYXKKw;
    public final Function1<Dest, Src> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super Dest, ? extends Src> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56887yW(@NotNull java.util.ListIterator<Src> listIterator, @NotNull Function1<? super Src, ? extends Dest> function1, @NotNull Function1<? super Dest, ? extends Src> function12) {
        super(listIterator, function1);
        Intrinsics.checkNotNullParameter(listIterator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        this.AYXKKw = listIterator;
        this.OLrzqt = function12;
    }

    @Override // o.C56725yQ, java.util.ListIterator
    public void add(Dest dest) {
        this.AYXKKw.add(this.OLrzqt.invoke(dest));
    }

    @Override // o.C56698yP, java.util.Iterator
    public void remove() {
        this.AYXKKw.remove();
    }

    @Override // o.C56725yQ, java.util.ListIterator
    public void set(Dest dest) {
        this.AYXKKw.set(this.OLrzqt.invoke(dest));
    }
}

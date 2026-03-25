package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56725yQ<Src, Dest> extends C56698yP<Src, Dest> implements java.util.ListIterator<Dest> {
    public final Function1<Src, Dest> AEQbTJ;
    public final java.util.ListIterator<Src> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.ListIterator
    public void add(Dest dest) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.ListIterator
    public void set(Dest dest) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.ListIterator<? extends Src> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super Src, ? extends Dest> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56725yQ(@NotNull java.util.ListIterator<? extends Src> listIterator, @NotNull Function1<? super Src, ? extends Dest> function1) {
        super(listIterator, function1);
        Intrinsics.checkNotNullParameter(listIterator, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.KWHzl = listIterator;
        this.AEQbTJ = function1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.KWHzl.hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.KWHzl.nextIndex();
    }

    @Override // java.util.ListIterator
    public Dest previous() {
        return (Dest) this.AEQbTJ.invoke(this.KWHzl.previous());
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.KWHzl.previousIndex();
    }
}

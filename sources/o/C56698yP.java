package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56698yP<Src, Dest> implements java.util.Iterator<Dest>, InterfaceC56535yIz {
    public final java.util.Iterator<Src> EZpvd;
    public final Function1<Src, Dest> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends Src> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super Src, ? extends Dest> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56698yP(@NotNull java.util.Iterator<? extends Src> it, @NotNull Function1<? super Src, ? extends Dest> function1) {
        Intrinsics.checkNotNullParameter(it, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.EZpvd = it;
        this.copydefault = function1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.EZpvd.hasNext();
    }

    @Override // java.util.Iterator
    public Dest next() {
        return (Dest) this.copydefault.invoke(this.EZpvd.next());
    }
}

package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C56644yN<Src, Dest> implements java.lang.Iterable<Dest>, InterfaceC56535yIz {
    public final Function1<Src, Dest> AEQbTJ;
    public final java.lang.Iterable<Src> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Iterable<? extends Src> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super Src, ? extends Dest> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56644yN(@NotNull java.lang.Iterable<? extends Src> iterable, @NotNull Function1<? super Src, ? extends Dest> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = iterable;
        this.AEQbTJ = function1;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<Dest> iterator() {
        return C56617yM.AEQbTJ(this.OLrzqt.iterator(), this.AEQbTJ);
    }
}

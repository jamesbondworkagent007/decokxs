package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C56914yX<Src, Dest> extends C56698yP<Src, Dest> implements java.util.Iterator<Dest>, yIB {
    public final java.util.Iterator<Src> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends Src> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56914yX(@NotNull java.util.Iterator<? extends Src> it, @NotNull Function1<? super Src, ? extends Dest> function1) {
        super(it, function1);
        Intrinsics.checkNotNullParameter(it, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.AEQbTJ = it;
    }

    @Override // o.C56698yP, java.util.Iterator
    public void remove() {
        this.AEQbTJ.remove();
    }
}

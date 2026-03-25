package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class yEA<E> extends yDG<E> implements java.util.RandomAccess {
    public int AEQbTJ;
    public final java.util.List<E> KWHzl;
    public int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.yDG, o.AbstractC56400yDz
    public int getSize() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends E> */
    /* JADX WARN: Multi-variable type inference failed */
    public yEA(@NotNull java.util.List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    public final void KWHzl(int i, int i2) {
        yDG.Companion.copydefault(i, i2, this.KWHzl.size());
        this.copydefault = i;
        this.AEQbTJ = i2 - i;
    }

    @Override // o.yDG, java.util.List
    public E get(int i) {
        yDG.Companion.AEQbTJ(i, this.AEQbTJ);
        return this.KWHzl.get(this.copydefault + i);
    }
}

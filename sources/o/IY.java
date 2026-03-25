package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class IY<E> extends IU<E> implements java.util.Set<E>, yIF {
    public java.util.Set<E> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull java.util.Set<E> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.AEQbTJ = set;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IY(@NotNull java.util.Set<E> set) {
        super(set);
        Intrinsics.checkNotNullParameter(set, "");
        this.AEQbTJ = set;
    }
}

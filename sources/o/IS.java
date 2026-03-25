package o;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class IS<E> extends IO<E> implements java.util.Set<E>, yIF {
    public final java.util.Set<E> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IS(java.lang.Object obj, @NotNull java.util.Set<E> set) {
        super(obj, set);
        Intrinsics.checkNotNullParameter(set, "");
        this.copydefault = set;
    }

    public IS() {
        this(null, new LinkedHashSet());
    }
}

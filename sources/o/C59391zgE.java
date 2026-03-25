package o;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zgE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59391zgE<T, K> extends yDH<T> {
    public final Function1<T, K> EZpvd;
    public final java.util.Iterator<T> OLrzqt;
    public final java.util.HashSet<K> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Iterator<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, ? extends K> */
    /* JADX WARN: Multi-variable type inference failed */
    public C59391zgE(@NotNull java.util.Iterator<? extends T> it, @NotNull Function1<? super T, ? extends K> function1) {
        Intrinsics.checkNotNullParameter(it, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.OLrzqt = it;
        this.EZpvd = function1;
        this.copydefault = new java.util.HashSet<>();
    }

    @Override // o.yDH
    public void copydefault() {
        while (this.OLrzqt.hasNext()) {
            T next = this.OLrzqt.next();
            if (this.copydefault.add(this.EZpvd.invoke(next))) {
                copydefault(next);
                return;
            }
        }
        KWHzl();
    }
}

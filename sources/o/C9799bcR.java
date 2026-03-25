package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bcR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9799bcR extends C9785bcD {
    public final java.util.List<C9861bda> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C9861bda> copydefault() {
        return this.KWHzl;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9799bcR(@NotNull java.util.List<C9861bda> list) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "");
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            z = true;
        } else {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((C9861bda) it.next()).OLrzqt()) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        super(z, true);
        this.KWHzl = list;
    }
}

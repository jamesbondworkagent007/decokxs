package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bcY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9806bcY extends C9785bcD {
    public final InterfaceC9731bbC OLrzqt;
    public final java.util.List<C9861bda> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C9861bda> copydefault() {
        return this.copydefault;
    }

    public boolean equals(java.lang.Object obj) {
        InterfaceC9731bbC interfaceC9731bbC;
        C9806bcY c9806bcY = obj instanceof C9806bcY ? (C9806bcY) obj : null;
        java.lang.Long lValueOf = (c9806bcY == null || (interfaceC9731bbC = c9806bcY.OLrzqt) == null) ? null : java.lang.Long.valueOf(interfaceC9731bbC.AhwBna());
        InterfaceC9731bbC interfaceC9731bbC2 = this.OLrzqt;
        return Intrinsics.EZpvd(lValueOf, interfaceC9731bbC2 != null ? java.lang.Long.valueOf(interfaceC9731bbC2.AhwBna()) : null);
    }

    public int hashCode() {
        InterfaceC9731bbC interfaceC9731bbC = this.OLrzqt;
        if (interfaceC9731bbC != null) {
            return interfaceC9731bbC.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C9806bcY(@NotNull java.util.List<C9861bda> list, InterfaceC9731bbC interfaceC9731bbC) {
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
        this.copydefault = list;
        this.OLrzqt = interfaceC9731bbC;
    }
}

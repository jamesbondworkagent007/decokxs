package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zdi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59262zdi implements InterfaceC59315zei {
    public int gEmmrt;

    public abstract boolean EZpvd(@NotNull InterfaceC56663yNs interfaceC56663yNs);

    @Override // o.InterfaceC59315zei
    /* JADX INFO: renamed from: KWHzl */
    public abstract InterfaceC56663yNs OLrzqt();

    public int hashCode() {
        int iIdentityHashCode;
        int i = this.gEmmrt;
        if (i != 0) {
            return i;
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = OLrzqt();
        if (OLrzqt(interfaceC56663yNsKWHzl)) {
            iIdentityHashCode = yYH.AEQbTJ(interfaceC56663yNsKWHzl).hashCode();
        } else {
            iIdentityHashCode = java.lang.System.identityHashCode(this);
        }
        this.gEmmrt = iIdentityHashCode;
        return iIdentityHashCode;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC59315zei) || obj.hashCode() != hashCode()) {
            return false;
        }
        InterfaceC59315zei interfaceC59315zei = (InterfaceC59315zei) obj;
        if (interfaceC59315zei.copydefault().size() != copydefault().size()) {
            return false;
        }
        InterfaceC56663yNs interfaceC56663yNsKWHzl = OLrzqt();
        InterfaceC56663yNs interfaceC56663yNsKWHzl2 = interfaceC59315zei.OLrzqt();
        if (interfaceC56663yNsKWHzl2 != null && OLrzqt(interfaceC56663yNsKWHzl) && OLrzqt(interfaceC56663yNsKWHzl2)) {
            return EZpvd(interfaceC56663yNsKWHzl2);
        }
        return false;
    }

    public final boolean EZpvd(@NotNull InterfaceC56663yNs interfaceC56663yNs, @NotNull InterfaceC56663yNs interfaceC56663yNs2) {
        Intrinsics.checkNotNullParameter(interfaceC56663yNs, "");
        Intrinsics.checkNotNullParameter(interfaceC56663yNs2, "");
        if (!Intrinsics.EZpvd(interfaceC56663yNs.bR_(), interfaceC56663yNs2.bR_())) {
            return false;
        }
        InterfaceC56665yNu interfaceC56665yNuAYXKKw = interfaceC56663yNs.AuCTel();
        for (InterfaceC56665yNu interfaceC56665yNuAYXKKw2 = interfaceC56663yNs2.AuCTel(); interfaceC56665yNuAYXKKw != null && interfaceC56665yNuAYXKKw2 != null; interfaceC56665yNuAYXKKw2 = interfaceC56665yNuAYXKKw2.AuCTel()) {
            if (interfaceC56665yNuAYXKKw instanceof yNP) {
                return interfaceC56665yNuAYXKKw2 instanceof yNP;
            }
            if (interfaceC56665yNuAYXKKw2 instanceof yNP) {
                return false;
            }
            if (interfaceC56665yNuAYXKKw instanceof yNW) {
                return (interfaceC56665yNuAYXKKw2 instanceof yNW) && Intrinsics.EZpvd(((yNW) interfaceC56665yNuAYXKKw).KWHzl(), ((yNW) interfaceC56665yNuAYXKKw2).KWHzl());
            }
            if ((interfaceC56665yNuAYXKKw2 instanceof yNW) || !Intrinsics.EZpvd(interfaceC56665yNuAYXKKw.bR_(), interfaceC56665yNuAYXKKw2.bR_())) {
                return false;
            }
            interfaceC56665yNuAYXKKw = interfaceC56665yNuAYXKKw.AuCTel();
        }
        return true;
    }

    public final boolean OLrzqt(InterfaceC56663yNs interfaceC56663yNs) {
        return (C59370zfk.KWHzl(interfaceC56663yNs) || yYH.fIwbmz(interfaceC56663yNs)) ? false : true;
    }
}

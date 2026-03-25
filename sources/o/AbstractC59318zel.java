package o;

import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: renamed from: o.zel, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC59318zel implements InterfaceC59317zek {
    public java.lang.String toString() {
        if (AEQbTJ()) {
            return "*";
        }
        if (EZpvd() == Variance.INVARIANT) {
            return OLrzqt().toString();
        }
        return EZpvd() + " " + OLrzqt();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InterfaceC59317zek)) {
            return false;
        }
        InterfaceC59317zek interfaceC59317zek = (InterfaceC59317zek) obj;
        return AEQbTJ() == interfaceC59317zek.AEQbTJ() && EZpvd() == interfaceC59317zek.EZpvd() && OLrzqt().equals(interfaceC59317zek.OLrzqt());
    }

    public int hashCode() {
        int iHashCode = EZpvd().hashCode();
        if (C59322zep.DbNXlk(OLrzqt())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (AEQbTJ() ? 17 : OLrzqt().hashCode());
    }
}

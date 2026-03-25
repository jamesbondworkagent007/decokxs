package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.roQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C43390roQ<T> {
    public final InterfaceC56551yJo<T> AEQbTJ;
    public int EZpvd;
    public final InterfaceC43391roR OLrzqt;

    public C43390roQ(@NotNull InterfaceC56551yJo<T> interfaceC56551yJo, @NotNull InterfaceC43391roR interfaceC43391roR) {
        Intrinsics.checkNotNullParameter(interfaceC56551yJo, "");
        Intrinsics.checkNotNullParameter(interfaceC43391roR, "");
        this.AEQbTJ = interfaceC56551yJo;
        this.OLrzqt = interfaceC43391roR;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C43390roQ c43390roQ = (C43390roQ) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c43390roQ.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, c43390roQ.OLrzqt);
    }

    public int hashCode() {
        if (this.EZpvd == 0) {
            int iHashCode = this.AEQbTJ.hashCode();
            this.EZpvd = iHashCode;
            this.EZpvd = (iHashCode * 31) + this.OLrzqt.hashCode();
        }
        return this.EZpvd;
    }

    public java.lang.String toString() {
        return yHE.OLrzqt(this.AEQbTJ).getSimpleName() + Marker.ANY_NON_NULL_MARKER + this.OLrzqt.getClass().getSimpleName() + "@" + java.lang.Integer.toHexString(hashCode());
    }
}

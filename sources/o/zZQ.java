package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class zZQ {
    public static final int $stable = 8;
    public boolean EZpvd;
    public boolean OLrzqt;
    public java.util.List<C58983zWt> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zZQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zZQ copy$default(zZQ zzq, java.util.List list, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = zzq.copydefault;
        }
        if ((i & 2) != 0) {
            z = zzq.EZpvd;
        }
        if ((i & 4) != 0) {
            z2 = zzq.OLrzqt;
        }
        return zzq.AEQbTJ(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zZQ AEQbTJ(@NotNull java.util.List<C58983zWt> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        return new zZQ(list, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C58983zWt> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zZQ)) {
            return false;
        }
        zZQ zzq = (zZQ) obj;
        return Intrinsics.EZpvd(this.copydefault, zzq.copydefault) && this.EZpvd == zzq.EZpvd && this.OLrzqt == zzq.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.EZpvd)) * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PayPasskeyListState(items=" + this.copydefault + ", allowUnlink=" + this.EZpvd + ", showReminder=" + this.OLrzqt + ")";
    }

    public zZQ(@NotNull java.util.List<C58983zWt> list, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.EZpvd = z;
        this.OLrzqt = z2;
    }
}

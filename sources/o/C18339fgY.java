package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fgY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C18339fgY {
    public final java.lang.String OLrzqt;
    public final java.util.List<C10854bwM> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fgY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C18339fgY copy$default(C18339fgY c18339fgY, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18339fgY.OLrzqt;
        }
        if ((i & 2) != 0) {
            list = c18339fgY.copydefault;
        }
        return c18339fgY.AEQbTJ(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18339fgY AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.List<C10854bwM> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C18339fgY(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C10854bwM> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18339fgY)) {
            return false;
        }
        C18339fgY c18339fgY = (C18339fgY) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c18339fgY.OLrzqt) && Intrinsics.EZpvd(this.copydefault, c18339fgY.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CloudBackupEvmAddressItemData(address=" + this.OLrzqt + ", supportChainList=" + this.copydefault + ")";
    }

    public C18339fgY(@NotNull java.lang.String str, @NotNull java.util.List<C10854bwM> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = str;
        this.copydefault = list;
    }
}

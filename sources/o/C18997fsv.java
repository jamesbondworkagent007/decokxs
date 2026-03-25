package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fsv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18997fsv {
    public final java.util.ArrayList<java.lang.Long> AEQbTJ;
    public final java.lang.String KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.fsv */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C18997fsv copy$default(C18997fsv c18997fsv, java.lang.String str, java.util.ArrayList arrayList, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c18997fsv.KWHzl;
        }
        if ((i & 2) != 0) {
            arrayList = c18997fsv.AEQbTJ;
        }
        return c18997fsv.OLrzqt(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.ArrayList<java.lang.Long> OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C18997fsv OLrzqt(@NotNull java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C18997fsv(str, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18997fsv)) {
            return false;
        }
        C18997fsv c18997fsv = (C18997fsv) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c18997fsv.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c18997fsv.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        java.util.ArrayList<java.lang.Long> arrayList = this.AEQbTJ;
        return (iHashCode * 31) + (arrayList == null ? 0 : arrayList.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "WalletSearchAddressUiModel(address=" + this.KWHzl + ", chainIndexes=" + this.AEQbTJ + ")";
    }

    public C18997fsv(@NotNull java.lang.String str, java.util.ArrayList<java.lang.Long> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = str;
        this.AEQbTJ = arrayList;
    }
}

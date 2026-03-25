package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class zAL {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;
    public java.lang.String KWHzl;
    public java.util.List<java.lang.String> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.zAL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ zAL copy$default(zAL zal, java.lang.String str, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = zal.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = zal.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list = zal.copydefault;
        }
        return zal.AEQbTJ(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAL AEQbTJ(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        return new zAL(str, str2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zAL)) {
            return false;
        }
        zAL zal = (zAL) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) zal.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) zal.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, zal.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.KWHzl;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.AEQbTJ;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.util.List<java.lang.String> list = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CredentialDescriptor(id=" + this.KWHzl + ", credentialType=" + this.AEQbTJ + ", transports=" + this.copydefault + ")";
    }

    public zAL(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list) {
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = list;
    }
}

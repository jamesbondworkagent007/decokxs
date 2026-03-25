package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes25.dex */
public final class zAQ {
    public static final int $stable = 8;
    public java.lang.String AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ zAQ copy$default(zAQ zaq, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = zaq.AEQbTJ;
        }
        return zaq.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final zAQ AEQbTJ(java.lang.String str) {
        return new zAQ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zAQ) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((zAQ) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.AEQbTJ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CrossDeviceFinishResponse(encryptedPasskey=" + this.AEQbTJ + ")";
    }

    public zAQ(java.lang.String str) {
        this.AEQbTJ = str;
    }
}

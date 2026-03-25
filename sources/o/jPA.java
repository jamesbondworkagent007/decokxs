package o;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jPA {
    public final java.lang.Integer AEQbTJ;
    public final int EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ jPA copy$default(jPA jpa, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = jpa.EZpvd;
        }
        if ((i2 & 2) != 0) {
            num = jpa.AEQbTJ;
        }
        return jpa.EZpvd(i, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final jPA EZpvd(@androidx.annotation.DrawableRes int i, java.lang.Integer num) {
        return new jPA(i, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jPA)) {
            return false;
        }
        jPA jpa = (jPA) obj;
        return this.EZpvd == jpa.EZpvd && Intrinsics.EZpvd(this.AEQbTJ, jpa.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Integer.hashCode(this.EZpvd);
        java.lang.Integer num = this.AEQbTJ;
        return (iHashCode * 31) + (num == null ? 0 : num.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SniperIcon(icon=" + this.EZpvd + ", color=" + this.AEQbTJ + ")";
    }

    public jPA(@androidx.annotation.DrawableRes int i, java.lang.Integer num) {
        this.EZpvd = i;
        this.AEQbTJ = num;
    }
}

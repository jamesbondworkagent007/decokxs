package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.prH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39380prH {
    public static final int $stable = 0;

    @SerializedName("show")
    private final java.lang.Boolean show;

    @SerializedName("value")
    private final java.lang.Integer value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39380prH copy$default(C39380prH c39380prH, java.lang.Boolean bool, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            bool = c39380prH.show;
        }
        if ((i & 2) != 0) {
            num = c39380prH.value;
        }
        return c39380prH.AEQbTJ(bool, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39380prH AEQbTJ(java.lang.Boolean bool, java.lang.Integer num) {
        return new C39380prH(bool, num);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39380prH)) {
            return false;
        }
        C39380prH c39380prH = (C39380prH) obj;
        return Intrinsics.EZpvd(this.show, c39380prH.show) && Intrinsics.EZpvd(this.value, c39380prH.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Boolean bool = this.show;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        java.lang.Integer num = this.value;
        return (iHashCode * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Term(show=" + this.show + ", value=" + this.value + ")";
    }

    public C39380prH(java.lang.Boolean bool, java.lang.Integer num) {
        this.show = bool;
        this.value = num;
    }
}

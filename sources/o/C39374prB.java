package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.prB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39374prB {
    public static final int $stable = 0;

    @SerializedName("currencyIcon")
    private final java.lang.String currencyIcon;

    @SerializedName("currencyId")
    private final java.lang.Integer currencyId;

    @SerializedName("currencyName")
    private final java.lang.String currencyName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39374prB copy$default(C39374prB c39374prB, java.lang.String str, java.lang.Integer num, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c39374prB.currencyIcon;
        }
        if ((i & 2) != 0) {
            num = c39374prB.currencyId;
        }
        if ((i & 4) != 0) {
            str2 = c39374prB.currencyName;
        }
        return c39374prB.OLrzqt(str, num, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39374prB OLrzqt(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        return new C39374prB(str, num, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39374prB)) {
            return false;
        }
        C39374prB c39374prB = (C39374prB) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.currencyIcon, (java.lang.Object) c39374prB.currencyIcon) && Intrinsics.EZpvd(this.currencyId, c39374prB.currencyId) && Intrinsics.EZpvd((java.lang.Object) this.currencyName, (java.lang.Object) c39374prB.currencyName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.currencyIcon;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.Integer num = this.currencyId;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        java.lang.String str2 = this.currencyName;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestMatchCurrency(currencyIcon=" + this.currencyIcon + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ")";
    }

    public C39374prB(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        this.currencyIcon = str;
        this.currencyId = num;
        this.currencyName = str2;
    }
}

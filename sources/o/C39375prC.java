package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.prC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39375prC {
    public static final int $stable = 0;

    @SerializedName("currencyIcon")
    private final java.lang.String currencyIcon;

    @SerializedName("currencyId")
    private final java.lang.Integer currencyId;

    @SerializedName("currencyName")
    private final java.lang.String currencyName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39375prC copy$default(C39375prC c39375prC, java.lang.String str, java.lang.Integer num, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c39375prC.currencyIcon;
        }
        if ((i & 2) != 0) {
            num = c39375prC.currencyId;
        }
        if ((i & 4) != 0) {
            str2 = c39375prC.currencyName;
        }
        return c39375prC.AEQbTJ(str, num, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39375prC AEQbTJ(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        return new C39375prC(str, num, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39375prC)) {
            return false;
        }
        C39375prC c39375prC = (C39375prC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.currencyIcon, (java.lang.Object) c39375prC.currencyIcon) && Intrinsics.EZpvd(this.currencyId, c39375prC.currencyId) && Intrinsics.EZpvd((java.lang.Object) this.currencyName, (java.lang.Object) c39375prC.currencyName);
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
        return "InvestCurrency(currencyIcon=" + this.currencyIcon + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ")";
    }

    public C39375prC(java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        this.currencyIcon = str;
        this.currencyId = num;
        this.currencyName = str2;
    }
}

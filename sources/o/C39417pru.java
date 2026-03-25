package o;

import com.google.gson.annotations.SerializedName;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.pru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C39417pru {
    public static final int $stable = 8;

    @SerializedName(OtcExtraKeys.AMOUNT)
    private final java.lang.String amount;

    @SerializedName("categories")
    private final java.util.List<C39412prp> categories;

    @SerializedName("currencyIcon")
    private final java.lang.String currencyIcon;

    @SerializedName("currencyId")
    private final java.lang.Integer currencyId;

    @SerializedName("currencyName")
    private final java.lang.String currencyName;

    @SerializedName("maxRate")
    private final C39373prA maxRate;

    @SerializedName("valuationUSD")
    private final java.lang.String valuationUSD;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: o.pru */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39417pru copy$default(C39417pru c39417pru, java.lang.String str, java.util.List list, java.lang.String str2, java.lang.Integer num, java.lang.String str3, C39373prA c39373prA, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c39417pru.amount;
        }
        if ((i & 2) != 0) {
            list = c39417pru.categories;
        }
        java.util.List list2 = list;
        if ((i & 4) != 0) {
            str2 = c39417pru.currencyIcon;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            num = c39417pru.currencyId;
        }
        java.lang.Integer num2 = num;
        if ((i & 16) != 0) {
            str3 = c39417pru.currencyName;
        }
        java.lang.String str6 = str3;
        if ((i & 32) != 0) {
            c39373prA = c39417pru.maxRate;
        }
        C39373prA c39373prA2 = c39373prA;
        if ((i & 64) != 0) {
            str4 = c39417pru.valuationUSD;
        }
        return c39417pru.EZpvd(str, list2, str5, num2, str6, c39373prA2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39417pru EZpvd(java.lang.String str, java.util.List<C39412prp> list, java.lang.String str2, java.lang.Integer num, java.lang.String str3, C39373prA c39373prA, java.lang.String str4) {
        return new C39417pru(str, list, str2, num, str3, c39373prA, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39412prp> OLrzqt() {
        return this.categories;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39417pru)) {
            return false;
        }
        C39417pru c39417pru = (C39417pru) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.amount, (java.lang.Object) c39417pru.amount) && Intrinsics.EZpvd(this.categories, c39417pru.categories) && Intrinsics.EZpvd((java.lang.Object) this.currencyIcon, (java.lang.Object) c39417pru.currencyIcon) && Intrinsics.EZpvd(this.currencyId, c39417pru.currencyId) && Intrinsics.EZpvd((java.lang.Object) this.currencyName, (java.lang.Object) c39417pru.currencyName) && Intrinsics.EZpvd(this.maxRate, c39417pru.maxRate) && Intrinsics.EZpvd((java.lang.Object) this.valuationUSD, (java.lang.Object) c39417pru.valuationUSD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.amount;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.util.List<C39412prp> list = this.categories;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        java.lang.String str2 = this.currencyIcon;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.Integer num = this.currencyId;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        java.lang.String str3 = this.currencyName;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        C39373prA c39373prA = this.maxRate;
        int iHashCode6 = c39373prA == null ? 0 : c39373prA.hashCode();
        java.lang.String str4 = this.valuationUSD;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EarInfo(amount=" + this.amount + ", categories=" + this.categories + ", currencyIcon=" + this.currencyIcon + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", maxRate=" + this.maxRate + ", valuationUSD=" + this.valuationUSD + ")";
    }

    public C39417pru(java.lang.String str, java.util.List<C39412prp> list, java.lang.String str2, java.lang.Integer num, java.lang.String str3, C39373prA c39373prA, java.lang.String str4) {
        this.amount = str;
        this.categories = list;
        this.currencyIcon = str2;
        this.currencyId = num;
        this.currencyName = str3;
        this.maxRate = c39373prA;
        this.valuationUSD = str4;
    }
}

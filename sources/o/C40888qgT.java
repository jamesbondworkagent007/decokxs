package o;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.qgT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40888qgT {
    public static final int $stable = 0;

    @SerializedName("actual")
    private final java.lang.String actual;

    @SerializedName("calendarId")
    private final java.lang.String calendarId;

    @SerializedName("consensus")
    private final java.lang.String consensus;

    @SerializedName("desc")
    private final java.lang.String desc;

    @SerializedName(RemoteMessageConst.Notification.ICON)
    private final java.lang.String icon;

    @SerializedName("previous")
    private final java.lang.String previous;

    @SerializedName("timeStamp")
    private final java.lang.String timeStamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C40888qgT copy$default(C40888qgT c40888qgT, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c40888qgT.icon;
        }
        if ((i & 2) != 0) {
            str2 = c40888qgT.desc;
        }
        java.lang.String str8 = str2;
        if ((i & 4) != 0) {
            str3 = c40888qgT.timeStamp;
        }
        java.lang.String str9 = str3;
        if ((i & 8) != 0) {
            str4 = c40888qgT.actual;
        }
        java.lang.String str10 = str4;
        if ((i & 16) != 0) {
            str5 = c40888qgT.previous;
        }
        java.lang.String str11 = str5;
        if ((i & 32) != 0) {
            str6 = c40888qgT.consensus;
        }
        java.lang.String str12 = str6;
        if ((i & 64) != 0) {
            str7 = c40888qgT.calendarId;
        }
        return c40888qgT.copydefault(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.previous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.desc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.calendarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.actual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.consensus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40888qgT copydefault(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        return new C40888qgT(str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40888qgT)) {
            return false;
        }
        C40888qgT c40888qgT = (C40888qgT) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.icon, (java.lang.Object) c40888qgT.icon) && Intrinsics.EZpvd((java.lang.Object) this.desc, (java.lang.Object) c40888qgT.desc) && Intrinsics.EZpvd((java.lang.Object) this.timeStamp, (java.lang.Object) c40888qgT.timeStamp) && Intrinsics.EZpvd((java.lang.Object) this.actual, (java.lang.Object) c40888qgT.actual) && Intrinsics.EZpvd((java.lang.Object) this.previous, (java.lang.Object) c40888qgT.previous) && Intrinsics.EZpvd((java.lang.Object) this.consensus, (java.lang.Object) c40888qgT.consensus) && Intrinsics.EZpvd((java.lang.Object) this.calendarId, (java.lang.Object) c40888qgT.calendarId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.desc;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.timeStamp;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.actual;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.previous;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.consensus;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.calendarId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingCalendarEconomicTypePo(icon=" + this.icon + ", desc=" + this.desc + ", timeStamp=" + this.timeStamp + ", actual=" + this.actual + ", previous=" + this.previous + ", consensus=" + this.consensus + ", calendarId=" + this.calendarId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.timeStamp;
    }

    public C40888qgT(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        this.icon = str;
        this.desc = str2;
        this.timeStamp = str3;
        this.actual = str4;
        this.previous = str5;
        this.consensus = str6;
        this.calendarId = str7;
    }
}

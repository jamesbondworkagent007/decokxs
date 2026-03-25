package o;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.qgQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40885qgQ {
    public static final int $stable = 0;

    @SerializedName("ccy")
    private final java.lang.String ccy;

    @SerializedName("desc")
    private final java.lang.String desc;

    @SerializedName(RemoteMessageConst.Notification.ICON)
    private final java.lang.String icon;

    @SerializedName("lockedDivideUnlockedAmount")
    private final java.lang.String lockedDivideUnlockedAmount;

    @SerializedName("lockedDivideUnlockedPercent")
    private final java.lang.String lockedDivideUnlockedPercent;

    @SerializedName("nextUnlockedAmount")
    private final java.lang.String nextUnlockedAmount;

    @SerializedName("nextUnlockedPercent")
    private final java.lang.String nextUnlockedPercent;

    @SerializedName("timeStamp")
    private final java.lang.String timeStamp;

    @SerializedName("unlockedPercent")
    private final java.lang.String unlockedPercent;

    @SerializedName("unlockedVolume")
    private final java.lang.String unlockedVolume;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AYXKKw() {
        return this.timeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.nextUnlockedPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.lockedDivideUnlockedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C40885qgQ EZpvd(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        return new C40885qgQ(str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.lockedDivideUnlockedPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.nextUnlockedAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40885qgQ)) {
            return false;
        }
        C40885qgQ c40885qgQ = (C40885qgQ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.icon, (java.lang.Object) c40885qgQ.icon) && Intrinsics.EZpvd((java.lang.Object) this.desc, (java.lang.Object) c40885qgQ.desc) && Intrinsics.EZpvd((java.lang.Object) this.timeStamp, (java.lang.Object) c40885qgQ.timeStamp) && Intrinsics.EZpvd((java.lang.Object) this.ccy, (java.lang.Object) c40885qgQ.ccy) && Intrinsics.EZpvd((java.lang.Object) this.unlockedVolume, (java.lang.Object) c40885qgQ.unlockedVolume) && Intrinsics.EZpvd((java.lang.Object) this.unlockedPercent, (java.lang.Object) c40885qgQ.unlockedPercent) && Intrinsics.EZpvd((java.lang.Object) this.nextUnlockedAmount, (java.lang.Object) c40885qgQ.nextUnlockedAmount) && Intrinsics.EZpvd((java.lang.Object) this.nextUnlockedPercent, (java.lang.Object) c40885qgQ.nextUnlockedPercent) && Intrinsics.EZpvd((java.lang.Object) this.lockedDivideUnlockedAmount, (java.lang.Object) c40885qgQ.lockedDivideUnlockedAmount) && Intrinsics.EZpvd((java.lang.Object) this.lockedDivideUnlockedPercent, (java.lang.Object) c40885qgQ.lockedDivideUnlockedPercent);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String gEmmrt() {
        return this.unlockedPercent;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.icon;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.desc;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.timeStamp;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.ccy;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.unlockedVolume;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        java.lang.String str6 = this.unlockedPercent;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        java.lang.String str7 = this.nextUnlockedAmount;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        java.lang.String str8 = this.nextUnlockedPercent;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        java.lang.String str9 = this.lockedDivideUnlockedAmount;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        java.lang.String str10 = this.lockedDivideUnlockedPercent;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str10 != null ? str10.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TradingCalendarTokenUnlockTypePo(icon=" + this.icon + ", desc=" + this.desc + ", timeStamp=" + this.timeStamp + ", ccy=" + this.ccy + ", unlockedVolume=" + this.unlockedVolume + ", unlockedPercent=" + this.unlockedPercent + ", nextUnlockedAmount=" + this.nextUnlockedAmount + ", nextUnlockedPercent=" + this.nextUnlockedPercent + ", lockedDivideUnlockedAmount=" + this.lockedDivideUnlockedAmount + ", lockedDivideUnlockedPercent=" + this.lockedDivideUnlockedPercent + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.unlockedVolume;
    }

    public C40885qgQ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10) {
        this.icon = str;
        this.desc = str2;
        this.timeStamp = str3;
        this.ccy = str4;
        this.unlockedVolume = str5;
        this.unlockedPercent = str6;
        this.nextUnlockedAmount = str7;
        this.nextUnlockedPercent = str8;
        this.lockedDivideUnlockedAmount = str9;
        this.lockedDivideUnlockedPercent = str10;
    }
}

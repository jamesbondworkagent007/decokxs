package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.prE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39377prE {
    public static final int $stable = 8;

    @SerializedName("currentTime")
    private final java.lang.Long currentTime;

    @SerializedName("earningMsg")
    private final java.lang.String earningMsg;

    @SerializedName("endTime")
    private final java.lang.Long endTime;

    @SerializedName("investCurrency")
    private final C39375prC investCurrency;

    @SerializedName("investMatchCurrency")
    private final C39374prB investMatchCurrency;

    @SerializedName("labels")
    private final java.util.List<java.lang.Integer> labels;

    @SerializedName("productType")
    private final C39376prD productType;

    @SerializedName("purchaseStatus")
    private final java.lang.Integer purchaseStatus;

    @SerializedName("rate")
    private final C39379prG rate;

    @SerializedName("redirectUrl")
    private final java.lang.String redirectUrl;

    @SerializedName("startTime")
    private final java.lang.Long startTime;

    @SerializedName("subscriptionUrl")
    private final java.lang.String subscriptionUrl;

    @SerializedName("subtitle")
    private final java.util.List<java.lang.String> subtitle;

    @SerializedName(FirebaseAnalytics.Param.TERM)
    private final C39380prH term;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.Integer> AEQbTJ() {
        return this.labels;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.subscriptionUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39376prD KWHzl() {
        return this.productType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39377prE KWHzl(java.lang.Long l, java.lang.String str, java.lang.Long l2, C39375prC c39375prC, C39374prB c39374prB, java.util.List<java.lang.Integer> list, C39376prD c39376prD, java.lang.Integer num, C39379prG c39379prG, java.lang.String str2, java.lang.Long l3, java.util.List<java.lang.String> list2, C39380prH c39380prH, java.lang.String str3) {
        return new C39377prE(l, str, l2, c39375prC, c39374prB, list, c39376prD, num, c39379prG, str2, l3, list2, c39380prH, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39379prG copydefault() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39377prE)) {
            return false;
        }
        C39377prE c39377prE = (C39377prE) obj;
        return Intrinsics.EZpvd(this.currentTime, c39377prE.currentTime) && Intrinsics.EZpvd((java.lang.Object) this.earningMsg, (java.lang.Object) c39377prE.earningMsg) && Intrinsics.EZpvd(this.endTime, c39377prE.endTime) && Intrinsics.EZpvd(this.investCurrency, c39377prE.investCurrency) && Intrinsics.EZpvd(this.investMatchCurrency, c39377prE.investMatchCurrency) && Intrinsics.EZpvd(this.labels, c39377prE.labels) && Intrinsics.EZpvd(this.productType, c39377prE.productType) && Intrinsics.EZpvd(this.purchaseStatus, c39377prE.purchaseStatus) && Intrinsics.EZpvd(this.rate, c39377prE.rate) && Intrinsics.EZpvd((java.lang.Object) this.redirectUrl, (java.lang.Object) c39377prE.redirectUrl) && Intrinsics.EZpvd(this.startTime, c39377prE.startTime) && Intrinsics.EZpvd(this.subtitle, c39377prE.subtitle) && Intrinsics.EZpvd(this.term, c39377prE.term) && Intrinsics.EZpvd((java.lang.Object) this.subscriptionUrl, (java.lang.Object) c39377prE.subscriptionUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Long l = this.currentTime;
        int iHashCode = l == null ? 0 : l.hashCode();
        java.lang.String str = this.earningMsg;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Long l2 = this.endTime;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        C39375prC c39375prC = this.investCurrency;
        int iHashCode4 = c39375prC == null ? 0 : c39375prC.hashCode();
        C39374prB c39374prB = this.investMatchCurrency;
        int iHashCode5 = c39374prB == null ? 0 : c39374prB.hashCode();
        java.util.List<java.lang.Integer> list = this.labels;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        C39376prD c39376prD = this.productType;
        int iHashCode7 = c39376prD == null ? 0 : c39376prD.hashCode();
        java.lang.Integer num = this.purchaseStatus;
        int iHashCode8 = num == null ? 0 : num.hashCode();
        C39379prG c39379prG = this.rate;
        int iHashCode9 = c39379prG == null ? 0 : c39379prG.hashCode();
        java.lang.String str2 = this.redirectUrl;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        java.lang.Long l3 = this.startTime;
        int iHashCode11 = l3 == null ? 0 : l3.hashCode();
        java.util.List<java.lang.String> list2 = this.subtitle;
        int iHashCode12 = list2 == null ? 0 : list2.hashCode();
        C39380prH c39380prH = this.term;
        int iHashCode13 = c39380prH == null ? 0 : c39380prH.hashCode();
        java.lang.String str3 = this.subscriptionUrl;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Product(currentTime=" + this.currentTime + ", earningMsg=" + this.earningMsg + ", endTime=" + this.endTime + ", investCurrency=" + this.investCurrency + ", investMatchCurrency=" + this.investMatchCurrency + ", labels=" + this.labels + ", productType=" + this.productType + ", purchaseStatus=" + this.purchaseStatus + ", rate=" + this.rate + ", redirectUrl=" + this.redirectUrl + ", startTime=" + this.startTime + ", subtitle=" + this.subtitle + ", term=" + this.term + ", subscriptionUrl=" + this.subscriptionUrl + ")";
    }

    public C39377prE(java.lang.Long l, java.lang.String str, java.lang.Long l2, C39375prC c39375prC, C39374prB c39374prB, java.util.List<java.lang.Integer> list, C39376prD c39376prD, java.lang.Integer num, C39379prG c39379prG, java.lang.String str2, java.lang.Long l3, java.util.List<java.lang.String> list2, C39380prH c39380prH, java.lang.String str3) {
        this.currentTime = l;
        this.earningMsg = str;
        this.endTime = l2;
        this.investCurrency = c39375prC;
        this.investMatchCurrency = c39374prB;
        this.labels = list;
        this.productType = c39376prD;
        this.purchaseStatus = num;
        this.rate = c39379prG;
        this.redirectUrl = str2;
        this.startTime = l3;
        this.subtitle = list2;
        this.term = c39380prH;
        this.subscriptionUrl = str3;
    }
}

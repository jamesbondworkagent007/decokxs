package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class KYSPreTxCheckInfo {
    public static final int $stable = 8;
    private List<AssetsDiffInfo> assetsDiffs;
    private final AuthQuantityInfo authQuantityInfo;
    private BlackAddressWarning blackAddressWarning;
    private List<String> causeRiskItem;
    private final Intention contractIntention;
    private List<ExposureInfo> exposures;
    private List<String> riskAddressList;
    private List<String> similarAddressList;
    private List<Integer> solanaFeePay;
    private String strategy;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetsDiffInfo> component1() {
        return this.assetsDiffs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthQuantityInfo component10() {
        return this.authQuantityInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExposureInfo> component2() {
        return this.exposures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.riskAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component4() {
        return this.similarAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.causeRiskItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component7() {
        return this.solanaFeePay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Intention component8() {
        return this.contractIntention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackAddressWarning component9() {
        return this.blackAddressWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KYSPreTxCheckInfo copy(@NotNull List<AssetsDiffInfo> list, @NotNull List<ExposureInfo> list2, @NotNull List<String> list3, @NotNull List<String> list4, String str, List<String> list5, List<Integer> list6, Intention intention, BlackAddressWarning blackAddressWarning, AuthQuantityInfo authQuantityInfo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new KYSPreTxCheckInfo(list, list2, list3, list4, str, list5, list6, intention, blackAddressWarning, authQuantityInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KYSPreTxCheckInfo)) {
            return false;
        }
        KYSPreTxCheckInfo kYSPreTxCheckInfo = (KYSPreTxCheckInfo) obj;
        return Intrinsics.EZpvd(this.assetsDiffs, kYSPreTxCheckInfo.assetsDiffs) && Intrinsics.EZpvd(this.exposures, kYSPreTxCheckInfo.exposures) && Intrinsics.EZpvd(this.riskAddressList, kYSPreTxCheckInfo.riskAddressList) && Intrinsics.EZpvd(this.similarAddressList, kYSPreTxCheckInfo.similarAddressList) && Intrinsics.EZpvd((Object) this.strategy, (Object) kYSPreTxCheckInfo.strategy) && Intrinsics.EZpvd(this.causeRiskItem, kYSPreTxCheckInfo.causeRiskItem) && Intrinsics.EZpvd(this.solanaFeePay, kYSPreTxCheckInfo.solanaFeePay) && Intrinsics.EZpvd(this.contractIntention, kYSPreTxCheckInfo.contractIntention) && Intrinsics.EZpvd(this.blackAddressWarning, kYSPreTxCheckInfo.blackAddressWarning) && Intrinsics.EZpvd(this.authQuantityInfo, kYSPreTxCheckInfo.authQuantityInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AssetsDiffInfo> getAssetsDiffs() {
        return this.assetsDiffs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthQuantityInfo getAuthQuantityInfo() {
        return this.authQuantityInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BlackAddressWarning getBlackAddressWarning() {
        return this.blackAddressWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCauseRiskItem() {
        return this.causeRiskItem;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Intention getContractIntention() {
        return this.contractIntention;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ExposureInfo> getExposures() {
        return this.exposures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getRiskAddressList() {
        return this.riskAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getSimilarAddressList() {
        return this.similarAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getSolanaFeePay() {
        return this.solanaFeePay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategy() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.assetsDiffs.hashCode();
        int iHashCode2 = this.exposures.hashCode();
        int iHashCode3 = this.riskAddressList.hashCode();
        int iHashCode4 = this.similarAddressList.hashCode();
        String str = this.strategy;
        int iHashCode5 = str == null ? 0 : str.hashCode();
        List<String> list = this.causeRiskItem;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        List<Integer> list2 = this.solanaFeePay;
        int iHashCode7 = list2 == null ? 0 : list2.hashCode();
        Intention intention = this.contractIntention;
        int iHashCode8 = intention == null ? 0 : intention.hashCode();
        BlackAddressWarning blackAddressWarning = this.blackAddressWarning;
        int iHashCode9 = blackAddressWarning == null ? 0 : blackAddressWarning.hashCode();
        AuthQuantityInfo authQuantityInfo = this.authQuantityInfo;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (authQuantityInfo != null ? authQuantityInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAssetsDiffs(@NotNull List<AssetsDiffInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.assetsDiffs = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlackAddressWarning(BlackAddressWarning blackAddressWarning) {
        this.blackAddressWarning = blackAddressWarning;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCauseRiskItem(List<String> list) {
        this.causeRiskItem = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExposures(@NotNull List<ExposureInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.exposures = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskAddressList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.riskAddressList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSimilarAddressList(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.similarAddressList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSolanaFeePay(List<Integer> list) {
        this.solanaFeePay = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategy(String str) {
        this.strategy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KYSPreTxCheckInfo(assetsDiffs=" + this.assetsDiffs + ", exposures=" + this.exposures + ", riskAddressList=" + this.riskAddressList + ", similarAddressList=" + this.similarAddressList + ", strategy=" + this.strategy + ", causeRiskItem=" + this.causeRiskItem + ", solanaFeePay=" + this.solanaFeePay + ", contractIntention=" + this.contractIntention + ", blackAddressWarning=" + this.blackAddressWarning + ", authQuantityInfo=" + this.authQuantityInfo + ")";
    }

    public KYSPreTxCheckInfo(@NotNull List<AssetsDiffInfo> list, @NotNull List<ExposureInfo> list2, @NotNull List<String> list3, @NotNull List<String> list4, String str, List<String> list5, List<Integer> list6, Intention intention, BlackAddressWarning blackAddressWarning, AuthQuantityInfo authQuantityInfo) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.assetsDiffs = list;
        this.exposures = list2;
        this.riskAddressList = list3;
        this.similarAddressList = list4;
        this.strategy = str;
        this.causeRiskItem = list5;
        this.solanaFeePay = list6;
        this.contractIntention = intention;
        this.blackAddressWarning = blackAddressWarning;
        this.authQuantityInfo = authQuantityInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001a: CONSTRUCTOR 
  (r13v0 java.util.List)
  (r14v0 java.util.List)
  (r15v0 java.util.List)
  (r16v0 java.util.List)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (r18v0 java.util.List)
  (r19v0 java.util.List)
  (r20v0 com.okinc.business.defi.biz.net.bean.Intention)
  (r21v0 com.okinc.business.defi.biz.net.bean.BlackAddressWarning)
  (r22v0 com.okinc.business.defi.biz.net.bean.AuthQuantityInfo)
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.AssetsDiffInfo>, java.util.List<com.okinc.business.defi.biz.net.bean.ExposureInfo>, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.Integer>, com.okinc.business.defi.biz.net.bean.Intention, com.okinc.business.defi.biz.net.bean.BlackAddressWarning, com.okinc.business.defi.biz.net.bean.AuthQuantityInfo):void (m)] (LINE:70) call: com.okinc.business.defi.biz.net.bean.KYSPreTxCheckInfo.<init>(java.util.List, java.util.List, java.util.List, java.util.List, java.lang.String, java.util.List, java.util.List, com.okinc.business.defi.biz.net.bean.Intention, com.okinc.business.defi.biz.net.bean.BlackAddressWarning, com.okinc.business.defi.biz.net.bean.AuthQuantityInfo):void type: THIS */
    public /* synthetic */ KYSPreTxCheckInfo(List list, List list2, List list3, List list4, String str, List list5, List list6, Intention intention, BlackAddressWarning blackAddressWarning, AuthQuantityInfo authQuantityInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, list4, (i & 16) != 0 ? "" : str, list5, list6, intention, blackAddressWarning, authQuantityInfo);
    }
}

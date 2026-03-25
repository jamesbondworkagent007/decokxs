package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AssetsPnlOverviewBean {
    public static final int $stable = 8;
    private final Boolean cedefiAccountExist;
    private final Boolean pendingCedefiOrderExist;
    private final Long period;
    private final String pnl;
    private final Long pnlLastUpdate;
    private final Long pnlPeriodStartTime;
    private final String pnlRate;
    private final Boolean recentlyMigrated;
    private final Long todayPnlStartTime;
    private final String totalAsset;
    private final List<String> valuationList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AssetsPnlOverviewBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.cedefiAccountExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component11() {
        return this.pendingCedefiOrderExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.pnlPeriodStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.pnlLastUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component7() {
        return this.todayPnlStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.valuationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.recentlyMigrated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetsPnlOverviewBean copy(String str, String str2, String str3, Long l, Long l2, Long l3, Long l4, List<String> list, Boolean bool, Boolean bool2, Boolean bool3) {
        return new AssetsPnlOverviewBean(str, str2, str3, l, l2, l3, l4, list, bool, bool2, bool3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetsPnlOverviewBean)) {
            return false;
        }
        AssetsPnlOverviewBean assetsPnlOverviewBean = (AssetsPnlOverviewBean) obj;
        return Intrinsics.EZpvd((Object) this.totalAsset, (Object) assetsPnlOverviewBean.totalAsset) && Intrinsics.EZpvd((Object) this.pnl, (Object) assetsPnlOverviewBean.pnl) && Intrinsics.EZpvd((Object) this.pnlRate, (Object) assetsPnlOverviewBean.pnlRate) && Intrinsics.EZpvd(this.period, assetsPnlOverviewBean.period) && Intrinsics.EZpvd(this.pnlPeriodStartTime, assetsPnlOverviewBean.pnlPeriodStartTime) && Intrinsics.EZpvd(this.pnlLastUpdate, assetsPnlOverviewBean.pnlLastUpdate) && Intrinsics.EZpvd(this.todayPnlStartTime, assetsPnlOverviewBean.todayPnlStartTime) && Intrinsics.EZpvd(this.valuationList, assetsPnlOverviewBean.valuationList) && Intrinsics.EZpvd(this.recentlyMigrated, assetsPnlOverviewBean.recentlyMigrated) && Intrinsics.EZpvd(this.cedefiAccountExist, assetsPnlOverviewBean.cedefiAccountExist) && Intrinsics.EZpvd(this.pendingCedefiOrderExist, assetsPnlOverviewBean.pendingCedefiOrderExist);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getCedefiAccountExist() {
        return this.cedefiAccountExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getPendingCedefiOrderExist() {
        return this.pendingCedefiOrderExist;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnl() {
        return this.pnl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPnlLastUpdate() {
        return this.pnlLastUpdate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPnlPeriodStartTime() {
        return this.pnlPeriodStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPnlRate() {
        return this.pnlRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getRecentlyMigrated() {
        return this.recentlyMigrated;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getTodayPnlStartTime() {
        return this.todayPnlStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalAsset() {
        return this.totalAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getValuationList() {
        return this.valuationList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.totalAsset;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.pnl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pnlRate;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Long l = this.period;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        Long l2 = this.pnlPeriodStartTime;
        int iHashCode5 = l2 == null ? 0 : l2.hashCode();
        Long l3 = this.pnlLastUpdate;
        int iHashCode6 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.todayPnlStartTime;
        int iHashCode7 = l4 == null ? 0 : l4.hashCode();
        List<String> list = this.valuationList;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        Boolean bool = this.recentlyMigrated;
        int iHashCode9 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.cedefiAccountExist;
        int iHashCode10 = bool2 == null ? 0 : bool2.hashCode();
        Boolean bool3 = this.pendingCedefiOrderExist;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetsPnlOverviewBean(totalAsset=" + this.totalAsset + ", pnl=" + this.pnl + ", pnlRate=" + this.pnlRate + ", period=" + this.period + ", pnlPeriodStartTime=" + this.pnlPeriodStartTime + ", pnlLastUpdate=" + this.pnlLastUpdate + ", todayPnlStartTime=" + this.todayPnlStartTime + ", valuationList=" + this.valuationList + ", recentlyMigrated=" + this.recentlyMigrated + ", cedefiAccountExist=" + this.cedefiAccountExist + ", pendingCedefiOrderExist=" + this.pendingCedefiOrderExist + ")";
    }

    public AssetsPnlOverviewBean(String str, String str2, String str3, Long l, Long l2, Long l3, Long l4, List<String> list, Boolean bool, Boolean bool2, Boolean bool3) {
        this.totalAsset = str;
        this.pnl = str2;
        this.pnlRate = str3;
        this.period = l;
        this.pnlPeriodStartTime = l2;
        this.pnlLastUpdate = l3;
        this.todayPnlStartTime = l4;
        this.valuationList = list;
        this.recentlyMigrated = bool;
        this.cedefiAccountExist = bool2;
        this.pendingCedefiOrderExist = bool3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r23v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0018: ARITH (r23v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r15v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x001f: ARITH (r23v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0027: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002f: ARITH (r23v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r18v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0037: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r19v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003f: ARITH (r23v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r20v0 java.lang.Boolean) : (null java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0046: ARITH (r23v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r23v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0053: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r22v0 java.lang.Boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.List<java.lang.String>, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void (m)] (LINE:12) call: com.okinc.assets.backend.api.model.AssetsPnlOverviewBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.Long, java.util.List, java.lang.Boolean, java.lang.Boolean, java.lang.Boolean):void type: THIS */
    public /* synthetic */ AssetsPnlOverviewBean(String str, String str2, String str3, Long l, Long l2, Long l3, Long l4, List list, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : l4, (i & 128) != 0 ? null : list, (i & 256) == 0 ? bool : null, (i & 512) != 0 ? Boolean.FALSE : bool2, (i & 1024) != 0 ? Boolean.FALSE : bool3);
    }
}

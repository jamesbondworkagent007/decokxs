package com.okinc.unify_trade.bot.data;

import androidx.annotation.ColorInt;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class DcaDetailsData {
    public static final int $stable = 8;
    private final String ccy;
    private final String createTime;
    private final String cycleId;
    private final String cycleIdText;
    private final List<TransDetailsData> detailsData;
    private final Date detailsExpTime;
    private final boolean isDetailsVisible;
    private final boolean isPendingSell;
    private final String profit;
    private final int profitColor;
    private final String profitRatio;
    private final boolean showLoading;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransDetailsData> component10() {
        return this.detailsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component11() {
        return this.detailsExpTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.showLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cycleIdText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.profitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.profitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isPendingSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component9() {
        return this.isDetailsVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DcaDetailsData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @ColorInt int i, boolean z, boolean z2, List<? extends TransDetailsData> list, Date date, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new DcaDetailsData(str, str2, str3, str4, str5, str6, i, z, z2, list, date, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DcaDetailsData)) {
            return false;
        }
        DcaDetailsData dcaDetailsData = (DcaDetailsData) obj;
        return Intrinsics.EZpvd((Object) this.cycleId, (Object) dcaDetailsData.cycleId) && Intrinsics.EZpvd((Object) this.cycleIdText, (Object) dcaDetailsData.cycleIdText) && Intrinsics.EZpvd((Object) this.ccy, (Object) dcaDetailsData.ccy) && Intrinsics.EZpvd((Object) this.createTime, (Object) dcaDetailsData.createTime) && Intrinsics.EZpvd((Object) this.profit, (Object) dcaDetailsData.profit) && Intrinsics.EZpvd((Object) this.profitRatio, (Object) dcaDetailsData.profitRatio) && this.profitColor == dcaDetailsData.profitColor && this.isPendingSell == dcaDetailsData.isPendingSell && this.isDetailsVisible == dcaDetailsData.isDetailsVisible && Intrinsics.EZpvd(this.detailsData, dcaDetailsData.detailsData) && Intrinsics.EZpvd(this.detailsExpTime, dcaDetailsData.detailsExpTime) && this.showLoading == dcaDetailsData.showLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycleId() {
        return this.cycleId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCycleIdText() {
        return this.cycleIdText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TransDetailsData> getDetailsData() {
        return this.detailsData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getDetailsExpTime() {
        return this.detailsExpTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfit() {
        return this.profit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getProfitColor() {
        return this.profitColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProfitRatio() {
        return this.profitRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowLoading() {
        return this.showLoading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.cycleId.hashCode();
        int iHashCode2 = this.cycleIdText.hashCode();
        int iHashCode3 = this.ccy.hashCode();
        int iHashCode4 = this.createTime.hashCode();
        int iHashCode5 = this.profit.hashCode();
        int iHashCode6 = this.profitRatio.hashCode();
        int iHashCode7 = Integer.hashCode(this.profitColor);
        int iHashCode8 = Boolean.hashCode(this.isPendingSell);
        int iHashCode9 = Boolean.hashCode(this.isDetailsVisible);
        List<TransDetailsData> list = this.detailsData;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        Date date = this.detailsExpTime;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (date != null ? date.hashCode() : 0)) * 31) + Boolean.hashCode(this.showLoading);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isDetailsVisible() {
        return this.isDetailsVisible;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPendingSell() {
        return this.isPendingSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DcaDetailsData(cycleId=" + this.cycleId + ", cycleIdText=" + this.cycleIdText + ", ccy=" + this.ccy + ", createTime=" + this.createTime + ", profit=" + this.profit + ", profitRatio=" + this.profitRatio + ", profitColor=" + this.profitColor + ", isPendingSell=" + this.isPendingSell + ", isDetailsVisible=" + this.isDetailsVisible + ", detailsData=" + this.detailsData + ", detailsExpTime=" + this.detailsExpTime + ", showLoading=" + this.showLoading + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r11v0, resolved type: java.util.List<? extends com.okinc.unify_trade.bot.data.TransDetailsData> */
    /* JADX WARN: Multi-variable type inference failed */
    public DcaDetailsData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @ColorInt int i, boolean z, boolean z2, List<? extends TransDetailsData> list, Date date, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.cycleId = str;
        this.cycleIdText = str2;
        this.ccy = str3;
        this.createTime = str4;
        this.profit = str5;
        this.profitRatio = str6;
        this.profitColor = i;
        this.isPendingSell = z;
        this.isDetailsVisible = z2;
        this.detailsData = list;
        this.detailsExpTime = date;
        this.showLoading = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: CONSTRUCTOR 
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (r20v0 java.lang.String)
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 int)
  (r24v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? false : (r25v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r26v0 java.util.List))
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r27v0 java.util.Date))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001c: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r28v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, java.util.List<? extends com.okinc.unify_trade.bot.data.TransDetailsData>, java.util.Date, boolean):void (m)] (LINE:1201) call: com.okinc.unify_trade.bot.data.DcaDetailsData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, java.util.List, java.util.Date, boolean):void type: THIS */
    public /* synthetic */ DcaDetailsData(String str, String str2, String str3, String str4, String str5, String str6, int i, boolean z, boolean z2, List list, Date date, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, i, z, (i2 & 256) != 0 ? false : z2, (i2 & 512) != 0 ? null : list, (i2 & 1024) != 0 ? null : date, (i2 & 2048) != 0 ? false : z3);
    }
}

package com.okinc.kline.features.kline.bottom.marketevents.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class MarketEventReq {
    public static final int $stable = 8;
    private final List<MarketEventsVo> currentList;

    @SerializedName("cursor")
    private final String cursor;

    @SerializedName("displayInstName")
    private final String displayInstName;

    @SerializedName("instId")
    private final String instId;
    private final boolean isWsForceRequest;

    @SerializedName("pageSize")
    private final Integer pageSize;

    @SerializedName("unit")
    private final String unit;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventReq */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarketEventReq copy$default(MarketEventReq marketEventReq, String str, String str2, Integer num, String str3, String str4, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = marketEventReq.instId;
        }
        if ((i & 2) != 0) {
            str2 = marketEventReq.cursor;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            num = marketEventReq.pageSize;
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            str3 = marketEventReq.unit;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = marketEventReq.displayInstName;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            z = marketEventReq.isWsForceRequest;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            list = marketEventReq.currentList;
        }
        return marketEventReq.copy(str, str5, num2, str6, str7, z2, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.displayInstName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component6() {
        return this.isWsForceRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketEventsVo> component7() {
        return this.currentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketEventReq copy(@NotNull String str, String str2, Integer num, String str3, String str4, boolean z, List<? extends MarketEventsVo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        return new MarketEventReq(str, str2, num, str3, str4, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketEventReq)) {
            return false;
        }
        MarketEventReq marketEventReq = (MarketEventReq) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) marketEventReq.instId) && Intrinsics.EZpvd((Object) this.cursor, (Object) marketEventReq.cursor) && Intrinsics.EZpvd(this.pageSize, marketEventReq.pageSize) && Intrinsics.EZpvd((Object) this.unit, (Object) marketEventReq.unit) && Intrinsics.EZpvd((Object) this.displayInstName, (Object) marketEventReq.displayInstName) && this.isWsForceRequest == marketEventReq.isWsForceRequest && Intrinsics.EZpvd(this.currentList, marketEventReq.currentList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<MarketEventsVo> getCurrentList() {
        return this.currentList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCursor() {
        return this.cursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayInstName() {
        return this.displayInstName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.instId.hashCode();
        String str = this.cursor;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.pageSize;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        String str2 = this.unit;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.displayInstName;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        int iHashCode6 = Boolean.hashCode(this.isWsForceRequest);
        List<MarketEventsVo> list = this.currentList;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isWsForceRequest() {
        return this.isWsForceRequest;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketEventReq(instId=" + this.instId + ", cursor=" + this.cursor + ", pageSize=" + this.pageSize + ", unit=" + this.unit + ", displayInstName=" + this.displayInstName + ", isWsForceRequest=" + this.isWsForceRequest + ", currentList=" + this.currentList + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo> */
    /* JADX WARN: Multi-variable type inference failed */
    public MarketEventReq(@NotNull String str, String str2, Integer num, String str3, String str4, boolean z, List<? extends MarketEventsVo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
        this.cursor = str2;
        this.pageSize = num;
        this.unit = str3;
        this.displayInstName = str4;
        this.isWsForceRequest = z;
        this.currentList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0033: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r15v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0008: ARITH (r15v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r10v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r15v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r15v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001d: ARITH (r15v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0024: ARITH (r15v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r14v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.util.List<? extends com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventsVo>):void (m)] (LINE:12) call: com.okinc.kline.features.kline.bottom.marketevents.data.model.MarketEventReq.<init>(java.lang.String, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, boolean, java.util.List):void type: THIS */
    public /* synthetic */ MarketEventReq(String str, String str2, Integer num, String str3, String str4, boolean z, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? false : z, (i & 64) == 0 ? list : null);
    }
}

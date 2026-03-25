package com.okinc.unify_trade.biz.subscribe;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.xVJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DexAssetsResponse {
    private final String balanceTotalUsd;
    private final String balanceTotalValuation;
    private final String coolingOffEndTimestamp;
    private List<DexAssets> data;
    private final String escapeStatus;
    private final String hasEscapedBefore;
    private final String hasReachedEscapeLimit;
    private final String hasUnavailableBalance;
    private final String hasWalletAddress;
    private final Integer pageNumber;
    private final String requireEscape;
    private Integer totalSize;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexAssetsResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final List<DexAssets> jsonConvert(@NotNull String str) {
        return Companion.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.totalSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.coolingOffEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.hasEscapedBefore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.hasReachedEscapeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.pageNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.requireEscape;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.balanceTotalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.balanceTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.escapeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.hasUnavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexAssets> component8() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.hasWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexAssetsResponse copy(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List<DexAssets> list, String str6, String str7, String str8, String str9) {
        return new DexAssetsResponse(num, num2, str, str2, str3, str4, str5, list, str6, str7, str8, str9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexAssetsResponse)) {
            return false;
        }
        DexAssetsResponse dexAssetsResponse = (DexAssetsResponse) obj;
        return Intrinsics.EZpvd(this.totalSize, dexAssetsResponse.totalSize) && Intrinsics.EZpvd(this.pageNumber, dexAssetsResponse.pageNumber) && Intrinsics.EZpvd((Object) this.requireEscape, (Object) dexAssetsResponse.requireEscape) && Intrinsics.EZpvd((Object) this.balanceTotalUsd, (Object) dexAssetsResponse.balanceTotalUsd) && Intrinsics.EZpvd((Object) this.balanceTotalValuation, (Object) dexAssetsResponse.balanceTotalValuation) && Intrinsics.EZpvd((Object) this.escapeStatus, (Object) dexAssetsResponse.escapeStatus) && Intrinsics.EZpvd((Object) this.hasUnavailableBalance, (Object) dexAssetsResponse.hasUnavailableBalance) && Intrinsics.EZpvd(this.data, dexAssetsResponse.data) && Intrinsics.EZpvd((Object) this.hasWalletAddress, (Object) dexAssetsResponse.hasWalletAddress) && Intrinsics.EZpvd((Object) this.coolingOffEndTimestamp, (Object) dexAssetsResponse.coolingOffEndTimestamp) && Intrinsics.EZpvd((Object) this.hasEscapedBefore, (Object) dexAssetsResponse.hasEscapedBefore) && Intrinsics.EZpvd((Object) this.hasReachedEscapeLimit, (Object) dexAssetsResponse.hasReachedEscapeLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceTotalUsd() {
        return this.balanceTotalUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceTotalValuation() {
        return this.balanceTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoolingOffEndTimestamp() {
        return this.coolingOffEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<DexAssets> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEscapeStatus() {
        return this.escapeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHasEscapedBefore() {
        return this.hasEscapedBefore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHasReachedEscapeLimit() {
        return this.hasReachedEscapeLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHasUnavailableBalance() {
        return this.hasUnavailableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHasWalletAddress() {
        return this.hasWalletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRequireEscape() {
        return this.requireEscape;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getTotalSize() {
        return this.totalSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.totalSize;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.pageNumber;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        String str = this.requireEscape;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.balanceTotalUsd;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.balanceTotalValuation;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.escapeStatus;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.hasUnavailableBalance;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        List<DexAssets> list = this.data;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        String str6 = this.hasWalletAddress;
        int iHashCode9 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.coolingOffEndTimestamp;
        int iHashCode10 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.hasEscapedBefore;
        int iHashCode11 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.hasReachedEscapeLimit;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setData(List<DexAssets> list) {
        this.data = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalSize(Integer num) {
        this.totalSize = num;
    }

    public DexAssetsResponse(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List<DexAssets> list, String str6, String str7, String str8, String str9) {
        this.totalSize = num;
        this.pageNumber = num2;
        this.requireEscape = str;
        this.balanceTotalUsd = str2;
        this.balanceTotalValuation = str3;
        this.escapeStatus = str4;
        this.hasUnavailableBalance = str5;
        this.data = list;
        this.hasWalletAddress = str6;
        this.coolingOffEndTimestamp = str7;
        this.hasEscapedBefore = str8;
        this.hasReachedEscapeLimit = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0078: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r14v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0039: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.unify_trade.biz.subscribe.DexAssets>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:10) call: com.okinc.unify_trade.biz.subscribe.DexAssetsResponse.<init>(java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexAssetsResponse(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : str7, (i & 1024) != 0 ? null : str8, (i & 2048) == 0 ? str9 : null);
    }

    public static final class StateListAnimator {

        public static final class ActionBar extends TypeToken<List<? extends DexAssets>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.DexAssetsResponse.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<DexAssets> AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            xVJ xvj = xVJ.KWHzl;
            Type type = new ActionBar().getType();
            Intrinsics.copydefault(type);
            return (List) xvj.OLrzqt(str, type, true);
        }
    }

    public String toString() {
        List<DexAssets> list = this.data;
        return "size:" + (list != null ? Integer.valueOf(list.size()) : null) + ", data:" + this.data;
    }
}

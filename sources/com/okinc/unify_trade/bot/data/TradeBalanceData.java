package com.okinc.unify_trade.bot.data;

import com.okinc.unify_trade.biz.MaxAvailableResp;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class TradeBalanceData {
    public static final int $stable = 8;
    private String closeLongOrigin;
    private String closeShortOrigin;
    private boolean isClose;
    private Pair<String, String> lendValue;
    private String longPosOrigin;
    private MaxAvailableResp origin;
    private String shortPosOrigin;
    private Pair<String, String> showAvaCloseLong;
    private Pair<String, String> showAvaCloseShort;
    private Pair<String, String> showAvailable;
    private Pair<String, String> showCanBuy;
    private Pair<String, String> showCanOpenLong;
    private Pair<String, String> showCanOpenShort;
    private Pair<String, String> showCanSell;
    private Pair<String, String> showCloseLongPos;
    private Pair<String, String> showCloseShort;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component10() {
        return this.showCloseShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MaxAvailableResp component11() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.closeLongOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.longPosOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.closeShortOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.shortPosOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component16() {
        return this.lendValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component2() {
        return this.showAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component3() {
        return this.showCanBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component4() {
        return this.showCanSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component5() {
        return this.showCanOpenLong;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component6() {
        return this.showCanOpenShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component7() {
        return this.showAvaCloseLong;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component8() {
        return this.showCloseLongPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> component9() {
        return this.showAvaCloseShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TradeBalanceData copy(boolean z, Pair<String, String> pair, Pair<String, String> pair2, Pair<String, String> pair3, Pair<String, String> pair4, Pair<String, String> pair5, Pair<String, String> pair6, Pair<String, String> pair7, Pair<String, String> pair8, Pair<String, String> pair9, MaxAvailableResp maxAvailableResp, String str, String str2, String str3, String str4, Pair<String, String> pair10) {
        return new TradeBalanceData(z, pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, maxAvailableResp, str, str2, str3, str4, pair10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TradeBalanceData)) {
            return false;
        }
        TradeBalanceData tradeBalanceData = (TradeBalanceData) obj;
        return this.isClose == tradeBalanceData.isClose && Intrinsics.EZpvd(this.showAvailable, tradeBalanceData.showAvailable) && Intrinsics.EZpvd(this.showCanBuy, tradeBalanceData.showCanBuy) && Intrinsics.EZpvd(this.showCanSell, tradeBalanceData.showCanSell) && Intrinsics.EZpvd(this.showCanOpenLong, tradeBalanceData.showCanOpenLong) && Intrinsics.EZpvd(this.showCanOpenShort, tradeBalanceData.showCanOpenShort) && Intrinsics.EZpvd(this.showAvaCloseLong, tradeBalanceData.showAvaCloseLong) && Intrinsics.EZpvd(this.showCloseLongPos, tradeBalanceData.showCloseLongPos) && Intrinsics.EZpvd(this.showAvaCloseShort, tradeBalanceData.showAvaCloseShort) && Intrinsics.EZpvd(this.showCloseShort, tradeBalanceData.showCloseShort) && Intrinsics.EZpvd(this.origin, tradeBalanceData.origin) && Intrinsics.EZpvd((Object) this.closeLongOrigin, (Object) tradeBalanceData.closeLongOrigin) && Intrinsics.EZpvd((Object) this.longPosOrigin, (Object) tradeBalanceData.longPosOrigin) && Intrinsics.EZpvd((Object) this.closeShortOrigin, (Object) tradeBalanceData.closeShortOrigin) && Intrinsics.EZpvd((Object) this.shortPosOrigin, (Object) tradeBalanceData.shortPosOrigin) && Intrinsics.EZpvd(this.lendValue, tradeBalanceData.lendValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseLongOrigin() {
        return this.closeLongOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCloseShortOrigin() {
        return this.closeShortOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getLendValue() {
        return this.lendValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLongPosOrigin() {
        return this.longPosOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MaxAvailableResp getOrigin() {
        return this.origin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getShortPosOrigin() {
        return this.shortPosOrigin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowAvaCloseLong() {
        return this.showAvaCloseLong;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowAvaCloseShort() {
        return this.showAvaCloseShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowAvailable() {
        return this.showAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowCanBuy() {
        return this.showCanBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowCanOpenLong() {
        return this.showCanOpenLong;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowCanOpenShort() {
        return this.showCanOpenShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowCanSell() {
        return this.showCanSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowCloseLongPos() {
        return this.showCloseLongPos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Pair<String, String> getShowCloseShort() {
        return this.showCloseShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isClose);
        Pair<String, String> pair = this.showAvailable;
        int iHashCode2 = pair == null ? 0 : pair.hashCode();
        Pair<String, String> pair2 = this.showCanBuy;
        int iHashCode3 = pair2 == null ? 0 : pair2.hashCode();
        Pair<String, String> pair3 = this.showCanSell;
        int iHashCode4 = pair3 == null ? 0 : pair3.hashCode();
        Pair<String, String> pair4 = this.showCanOpenLong;
        int iHashCode5 = pair4 == null ? 0 : pair4.hashCode();
        Pair<String, String> pair5 = this.showCanOpenShort;
        int iHashCode6 = pair5 == null ? 0 : pair5.hashCode();
        Pair<String, String> pair6 = this.showAvaCloseLong;
        int iHashCode7 = pair6 == null ? 0 : pair6.hashCode();
        Pair<String, String> pair7 = this.showCloseLongPos;
        int iHashCode8 = pair7 == null ? 0 : pair7.hashCode();
        Pair<String, String> pair8 = this.showAvaCloseShort;
        int iHashCode9 = pair8 == null ? 0 : pair8.hashCode();
        Pair<String, String> pair9 = this.showCloseShort;
        int iHashCode10 = pair9 == null ? 0 : pair9.hashCode();
        MaxAvailableResp maxAvailableResp = this.origin;
        int iHashCode11 = maxAvailableResp == null ? 0 : maxAvailableResp.hashCode();
        String str = this.closeLongOrigin;
        int iHashCode12 = str == null ? 0 : str.hashCode();
        String str2 = this.longPosOrigin;
        int iHashCode13 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.closeShortOrigin;
        int iHashCode14 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.shortPosOrigin;
        int iHashCode15 = str4 == null ? 0 : str4.hashCode();
        Pair<String, String> pair10 = this.lendValue;
        return (((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (pair10 == null ? 0 : pair10.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isClose() {
        return this.isClose;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setClose(boolean z) {
        this.isClose = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseLongOrigin(String str) {
        this.closeLongOrigin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloseShortOrigin(String str) {
        this.closeShortOrigin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLendValue(Pair<String, String> pair) {
        this.lendValue = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLongPosOrigin(String str) {
        this.longPosOrigin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setOrigin(MaxAvailableResp maxAvailableResp) {
        this.origin = maxAvailableResp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShortPosOrigin(String str) {
        this.shortPosOrigin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAvaCloseLong(Pair<String, String> pair) {
        this.showAvaCloseLong = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAvaCloseShort(Pair<String, String> pair) {
        this.showAvaCloseShort = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowAvailable(Pair<String, String> pair) {
        this.showAvailable = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCanBuy(Pair<String, String> pair) {
        this.showCanBuy = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCanOpenLong(Pair<String, String> pair) {
        this.showCanOpenLong = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCanOpenShort(Pair<String, String> pair) {
        this.showCanOpenShort = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCanSell(Pair<String, String> pair) {
        this.showCanSell = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCloseLongPos(Pair<String, String> pair) {
        this.showCloseLongPos = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowCloseShort(Pair<String, String> pair) {
        this.showCloseShort = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TradeBalanceData(isClose=" + this.isClose + ", showAvailable=" + this.showAvailable + ", showCanBuy=" + this.showCanBuy + ", showCanSell=" + this.showCanSell + ", showCanOpenLong=" + this.showCanOpenLong + ", showCanOpenShort=" + this.showCanOpenShort + ", showAvaCloseLong=" + this.showAvaCloseLong + ", showCloseLongPos=" + this.showCloseLongPos + ", showAvaCloseShort=" + this.showAvaCloseShort + ", showCloseShort=" + this.showCloseShort + ", origin=" + this.origin + ", closeLongOrigin=" + this.closeLongOrigin + ", longPosOrigin=" + this.longPosOrigin + ", closeShortOrigin=" + this.closeShortOrigin + ", shortPosOrigin=" + this.shortPosOrigin + ", lendValue=" + this.lendValue + ")";
    }

    public TradeBalanceData(boolean z, Pair<String, String> pair, Pair<String, String> pair2, Pair<String, String> pair3, Pair<String, String> pair4, Pair<String, String> pair5, Pair<String, String> pair6, Pair<String, String> pair7, Pair<String, String> pair8, Pair<String, String> pair9, MaxAvailableResp maxAvailableResp, String str, String str2, String str3, String str4, Pair<String, String> pair10) {
        this.isClose = z;
        this.showAvailable = pair;
        this.showCanBuy = pair2;
        this.showCanSell = pair3;
        this.showCanOpenLong = pair4;
        this.showCanOpenShort = pair5;
        this.showAvaCloseLong = pair6;
        this.showCloseLongPos = pair7;
        this.showAvaCloseShort = pair8;
        this.showCloseShort = pair9;
        this.origin = maxAvailableResp;
        this.closeLongOrigin = str;
        this.longPosOrigin = str2;
        this.closeShortOrigin = str3;
        this.shortPosOrigin = str4;
        this.lendValue = pair10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x009f: CONSTRUCTOR 
  (r18v0 boolean)
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r19v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x000b: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r20v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0013: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r21v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x001b: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r22v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0023: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r23v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x002b: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r24v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0033: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r25v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x003b: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r26v0 kotlin.Pair))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0043: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null kotlin.Pair) : (r27v0 kotlin.Pair))
  (wrap:com.okinc.unify_trade.biz.MaxAvailableResp:?: TERNARY null = ((wrap:int:0x004b: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.unify_trade.biz.MaxAvailableResp) : (r28v0 com.okinc.unify_trade.biz.MaxAvailableResp))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006b: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r32v0 java.lang.String))
  (wrap:kotlin.Pair:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) == (0 int)) ? (r33v0 kotlin.Pair) : (null kotlin.Pair))
 A[MD:(boolean, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, kotlin.Pair<java.lang.String, java.lang.String>, com.okinc.unify_trade.biz.MaxAvailableResp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair<java.lang.String, java.lang.String>):void (m)] (LINE:909) call: com.okinc.unify_trade.bot.data.TradeBalanceData.<init>(boolean, kotlin.Pair, kotlin.Pair, kotlin.Pair, kotlin.Pair, kotlin.Pair, kotlin.Pair, kotlin.Pair, kotlin.Pair, kotlin.Pair, com.okinc.unify_trade.biz.MaxAvailableResp, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.Pair):void type: THIS */
    public /* synthetic */ TradeBalanceData(boolean z, Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, Pair pair6, Pair pair7, Pair pair8, Pair pair9, MaxAvailableResp maxAvailableResp, String str, String str2, String str3, String str4, Pair pair10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : pair, (i & 4) != 0 ? null : pair2, (i & 8) != 0 ? null : pair3, (i & 16) != 0 ? null : pair4, (i & 32) != 0 ? null : pair5, (i & 64) != 0 ? null : pair6, (i & 128) != 0 ? null : pair7, (i & 256) != 0 ? null : pair8, (i & 512) != 0 ? null : pair9, (i & 1024) != 0 ? null : maxAvailableResp, (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : str2, (i & 8192) != 0 ? null : str3, (i & 16384) != 0 ? null : str4, (i & 32768) == 0 ? pair10 : null);
    }
}

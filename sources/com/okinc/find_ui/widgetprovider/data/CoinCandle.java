package com.okinc.find_ui.widgetprovider.data;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class CoinCandle {
    public static final int $stable = 8;
    private final String askPx;
    private final String askSz;
    private final String bidPx;
    private final String bidSz;

    @SerializedName("candles")
    private final List<String> candles;
    private final String displayId;
    private final String high24h;
    private final String instId;
    private final String instType;
    private final String last;
    private final String lastSz;
    private final String low24h;
    private final String open24h;
    private final String sodUtc0;
    private final String sodUtc8;
    private final String ts;
    private final String vol24h;
    private final String volCcy24h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.lastSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.low24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.vol24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.volCcy24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.askSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.bidSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component5() {
        return this.candles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.high24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinCandle copy(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        return new CoinCandle(str, str2, str3, str4, list, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinCandle)) {
            return false;
        }
        CoinCandle coinCandle = (CoinCandle) obj;
        return Intrinsics.EZpvd((Object) this.askPx, (Object) coinCandle.askPx) && Intrinsics.EZpvd((Object) this.askSz, (Object) coinCandle.askSz) && Intrinsics.EZpvd((Object) this.bidPx, (Object) coinCandle.bidPx) && Intrinsics.EZpvd((Object) this.bidSz, (Object) coinCandle.bidSz) && Intrinsics.EZpvd(this.candles, coinCandle.candles) && Intrinsics.EZpvd((Object) this.high24h, (Object) coinCandle.high24h) && Intrinsics.EZpvd((Object) this.instId, (Object) coinCandle.instId) && Intrinsics.EZpvd((Object) this.instType, (Object) coinCandle.instType) && Intrinsics.EZpvd((Object) this.last, (Object) coinCandle.last) && Intrinsics.EZpvd((Object) this.lastSz, (Object) coinCandle.lastSz) && Intrinsics.EZpvd((Object) this.low24h, (Object) coinCandle.low24h) && Intrinsics.EZpvd((Object) this.open24h, (Object) coinCandle.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) coinCandle.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) coinCandle.sodUtc8) && Intrinsics.EZpvd((Object) this.ts, (Object) coinCandle.ts) && Intrinsics.EZpvd((Object) this.vol24h, (Object) coinCandle.vol24h) && Intrinsics.EZpvd((Object) this.volCcy24h, (Object) coinCandle.volCcy24h) && Intrinsics.EZpvd((Object) this.displayId, (Object) coinCandle.displayId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskPx() {
        return this.askPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAskSz() {
        return this.askSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidPx() {
        return this.bidPx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBidSz() {
        return this.bidSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCandles() {
        return this.candles;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHigh24h() {
        return this.high24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLast() {
        return this.last;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLastSz() {
        return this.lastSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLow24h() {
        return this.low24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVol24h() {
        return this.vol24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolCcy24h() {
        return this.volCcy24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.askPx;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.askSz;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.bidPx;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bidSz;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        List<String> list = this.candles;
        int iHashCode5 = list == null ? 0 : list.hashCode();
        String str5 = this.high24h;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.instId;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.instType;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.last;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.lastSz;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.low24h;
        int iHashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.open24h;
        int iHashCode12 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.sodUtc0;
        int iHashCode13 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.sodUtc8;
        int iHashCode14 = str13 == null ? 0 : str13.hashCode();
        String str14 = this.ts;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        String str15 = this.vol24h;
        int iHashCode16 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.volCcy24h;
        int iHashCode17 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.displayId;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + (str17 == null ? 0 : str17.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinCandle(askPx=" + this.askPx + ", askSz=" + this.askSz + ", bidPx=" + this.bidPx + ", bidSz=" + this.bidSz + ", candles=" + this.candles + ", high24h=" + this.high24h + ", instId=" + this.instId + ", instType=" + this.instType + ", last=" + this.last + ", lastSz=" + this.lastSz + ", low24h=" + this.low24h + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", ts=" + this.ts + ", vol24h=" + this.vol24h + ", volCcy24h=" + this.volCcy24h + ", displayId=" + this.displayId + ")";
    }

    public CoinCandle(String str, String str2, String str3, String str4, List<String> list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17) {
        this.askPx = str;
        this.askSz = str2;
        this.bidPx = str3;
        this.bidSz = str4;
        this.candles = list;
        this.high24h = str5;
        this.instId = str6;
        this.instType = str7;
        this.last = str8;
        this.lastSz = str9;
        this.low24h = str10;
        this.open24h = str11;
        this.sodUtc0 = str12;
        this.sodUtc8 = str13;
        this.ts = str14;
        this.vol24h = str15;
        this.volCcy24h = str16;
        this.displayId = str17;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (r21v0 java.lang.String)
  (r22v0 java.lang.String)
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.util.List)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 java.lang.String)
  (r32v0 java.lang.String)
  (r33v0 java.lang.String)
  (r34v0 java.lang.String)
  (r35v0 java.lang.String)
  (r36v0 java.lang.String)
  (r37v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r39v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r38v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.find_ui.widgetprovider.data.CoinCandle.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinCandle(String str, String str2, String str3, String str4, List list, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, list, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, (i & 131072) != 0 ? null : str17);
    }
}

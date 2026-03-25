package com.okinc.okmarket.data;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class SearchResult {
    public static final int FUTURES_TYPE_CURRENT_WEEK = 1;
    public static final int FUTURES_TYPE_NEXT_WEEK = 2;
    public static final int FUTURES_TYPE_QUARTER = 4;
    public static final int FUTURES_TYPE_SWAP = 100;
    public static final String TRADE_FUTURES_TYPE = "FUTURES";
    public static final String TRADE_MARGIN_TYPE = "MARGIN";
    public static final String TRADE_OPTION_TYPE = "OPTION";
    public static final String TRADE_SPOT_TYPE = "SPOT";
    public static final String TRADE_SWAP_TYPE = "SWAP";
    public static final int TYPE_FIAT = 2;
    public static final int TYPE_FUTURES = 1;
    public static final int TYPE_OPTIONS = 3;
    public static final int TYPE_SPOT = 0;
    private long contractId;
    private int futuresType;
    private String instrumentId;
    private boolean isFavorite;
    private boolean isHistory;
    private boolean isMarginOpen;
    private boolean isShowFavorite;
    private double maxMarginLeverage;
    private String quoteSymbol;
    private long recordTimestamp;
    private String symbol;
    private String title;
    private int type;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchResult() {
        this(null, null, null, null, 0L, 0, 0, false, AudioStats.AUDIO_AMPLITUDE_NONE, false, false, false, 0L, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component10() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.isFavorite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isShowFavorite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component13() {
        return this.recordTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.instrumentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.contractId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.futuresType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isMarginOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component9() {
        return this.maxMarginLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchResult copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, int i, int i2, boolean z, double d, boolean z2, boolean z3, boolean z4, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SearchResult(str, str2, str3, str4, j, i, i2, z, d, z2, z3, z4, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchResult)) {
            return false;
        }
        SearchResult searchResult = (SearchResult) obj;
        return Intrinsics.EZpvd((Object) this.symbol, (Object) searchResult.symbol) && Intrinsics.EZpvd((Object) this.title, (Object) searchResult.title) && Intrinsics.EZpvd((Object) this.instrumentId, (Object) searchResult.instrumentId) && Intrinsics.EZpvd((Object) this.quoteSymbol, (Object) searchResult.quoteSymbol) && this.contractId == searchResult.contractId && this.type == searchResult.type && this.futuresType == searchResult.futuresType && this.isMarginOpen == searchResult.isMarginOpen && Double.compare(this.maxMarginLeverage, searchResult.maxMarginLeverage) == 0 && this.isHistory == searchResult.isHistory && this.isFavorite == searchResult.isFavorite && this.isShowFavorite == searchResult.isShowFavorite && this.recordTimestamp == searchResult.recordTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getContractId() {
        return this.contractId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFuturesType() {
        return this.futuresType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstrumentId() {
        return this.instrumentId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getMaxMarginLeverage() {
        return this.maxMarginLeverage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuoteSymbol() {
        return this.quoteSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRecordTimestamp() {
        return this.recordTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.symbol.hashCode() * 31) + this.title.hashCode()) * 31) + this.instrumentId.hashCode()) * 31) + this.quoteSymbol.hashCode()) * 31) + Long.hashCode(this.contractId)) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.futuresType)) * 31) + Boolean.hashCode(this.isMarginOpen)) * 31) + Double.hashCode(this.maxMarginLeverage)) * 31) + Boolean.hashCode(this.isHistory)) * 31) + Boolean.hashCode(this.isFavorite)) * 31) + Boolean.hashCode(this.isShowFavorite)) * 31) + Long.hashCode(this.recordTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isFavorite() {
        return this.isFavorite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isHistory() {
        return this.isHistory;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isMarginOpen() {
        return this.isMarginOpen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowFavorite() {
        return this.isShowFavorite;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractId(long j) {
        this.contractId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFavorite(boolean z) {
        this.isFavorite = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFuturesType(int i) {
        this.futuresType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHistory(boolean z) {
        this.isHistory = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstrumentId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instrumentId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarginOpen(boolean z) {
        this.isMarginOpen = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxMarginLeverage(double d) {
        this.maxMarginLeverage = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuoteSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quoteSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecordTimestamp(long j) {
        this.recordTimestamp = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowFavorite(boolean z) {
        this.isShowFavorite = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(int i) {
        this.type = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchResult(symbol=" + this.symbol + ", title=" + this.title + ", instrumentId=" + this.instrumentId + ", quoteSymbol=" + this.quoteSymbol + ", contractId=" + this.contractId + ", type=" + this.type + ", futuresType=" + this.futuresType + ", isMarginOpen=" + this.isMarginOpen + ", maxMarginLeverage=" + this.maxMarginLeverage + ", isHistory=" + this.isHistory + ", isFavorite=" + this.isFavorite + ", isShowFavorite=" + this.isShowFavorite + ", recordTimestamp=" + this.recordTimestamp + ")";
    }

    public SearchResult(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, long j, int i, int i2, boolean z, double d, boolean z2, boolean z3, boolean z4, long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.symbol = str;
        this.title = str2;
        this.instrumentId = str3;
        this.quoteSymbol = str4;
        this.contractId = j;
        this.type = i;
        this.futuresType = i2;
        this.isMarginOpen = z;
        this.maxMarginLeverage = d;
        this.isHistory = z2;
        this.isFavorite = z3;
        this.isShowFavorite = z4;
        this.recordTimestamp = j2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x008a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r21v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0023: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (1 long) : (r22v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0035: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r26v0 boolean))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0045: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0049: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r27v0 double))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x004e: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0056: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r30v0 boolean) : false)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? true : (r31v0 boolean))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0065: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r32v0 long))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, boolean, double, boolean, boolean, boolean, long):void (m)] (LINE:9) call: com.okinc.okmarket.data.SearchResult.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, int, boolean, double, boolean, boolean, boolean, long):void type: THIS */
    public /* synthetic */ SearchResult(String str, String str2, String str3, String str4, long j, int i, int i2, boolean z, double d, boolean z2, boolean z3, boolean z4, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) == 0 ? str4 : "", (i3 & 16) != 0 ? 1L : j, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? false : z, (i3 & 256) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i3 & 512) != 0 ? false : z2, (i3 & 1024) == 0 ? z3 : false, (i3 & 2048) != 0 ? true : z4, (i3 & 4096) != 0 ? 0L : j2);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okmarket.data.SearchResult.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }
}

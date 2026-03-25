package com.okinc.business.market.features.analysis.futures.sub.calendar.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class CalendarPo {
    public static final int $stable = 8;

    @SerializedName("calendarOneDayDtos")
    private final List<CalendarOneDayPo> calendarOneDayDtos;

    @SerializedName("everyDayCumulativePnlList")
    private final List<EveryDayCumulativePnl> everyDayCumulativePnlList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CalendarPo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalendarPo copy$default(CalendarPo calendarPo, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = calendarPo.calendarOneDayDtos;
        }
        if ((i & 2) != 0) {
            list2 = calendarPo.everyDayCumulativePnlList;
        }
        return calendarPo.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CalendarOneDayPo> component1() {
        return this.calendarOneDayDtos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EveryDayCumulativePnl> component2() {
        return this.everyDayCumulativePnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CalendarPo copy(@NotNull List<CalendarOneDayPo> list, @NotNull List<EveryDayCumulativePnl> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new CalendarPo(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarPo)) {
            return false;
        }
        CalendarPo calendarPo = (CalendarPo) obj;
        return Intrinsics.EZpvd(this.calendarOneDayDtos, calendarPo.calendarOneDayDtos) && Intrinsics.EZpvd(this.everyDayCumulativePnlList, calendarPo.everyDayCumulativePnlList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CalendarOneDayPo> getCalendarOneDayDtos() {
        return this.calendarOneDayDtos;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EveryDayCumulativePnl> getEveryDayCumulativePnlList() {
        return this.everyDayCumulativePnlList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.calendarOneDayDtos.hashCode() * 31) + this.everyDayCumulativePnlList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CalendarPo(calendarOneDayDtos=" + this.calendarOneDayDtos + ", everyDayCumulativePnlList=" + this.everyDayCumulativePnlList + ")";
    }

    public CalendarPo(@NotNull List<CalendarOneDayPo> list, @NotNull List<EveryDayCumulativePnl> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.calendarOneDayDtos = list;
        this.everyDayCumulativePnlList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:10)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:14)) : (r2v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo$CalendarOneDayPo>, java.util.List<com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo$EveryDayCumulativePnl>):void (m)] (LINE:7) call: com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo.<init>(java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ CalendarPo(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class CalendarOneDayPo {
        public static final int $stable = 0;

        @SerializedName("closedPositions")
        private final int closedPositions;

        @SerializedName("cumulativePnl")
        private final String cumulativePnl;

        @SerializedName("dateTime")
        private final long dateTime;

        @SerializedName("loseCount")
        private final int loseCount;

        @SerializedName("pnlOnLoss")
        private final String pnlOnLoss;

        @SerializedName("pnlOnWin")
        private final String pnlOnWin;

        @SerializedName("winCount")
        private final int winCount;

        @SerializedName("winRate")
        private final String winRate;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CalendarOneDayPo() {
            this(0, null, 0L, null, 0, 0, null, null, 255, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component1() {
            return this.closedPositions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.cumulativePnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component3() {
            return this.dateTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component4() {
            return this.winRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component5() {
            return this.winCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component6() {
            return this.loseCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component7() {
            return this.pnlOnWin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component8() {
            return this.pnlOnLoss;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CalendarOneDayPo copy(int i, @NotNull String str, long j, @NotNull String str2, int i2, int i3, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new CalendarOneDayPo(i, str, j, str2, i2, i3, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CalendarOneDayPo)) {
                return false;
            }
            CalendarOneDayPo calendarOneDayPo = (CalendarOneDayPo) obj;
            return this.closedPositions == calendarOneDayPo.closedPositions && Intrinsics.EZpvd((Object) this.cumulativePnl, (Object) calendarOneDayPo.cumulativePnl) && this.dateTime == calendarOneDayPo.dateTime && Intrinsics.EZpvd((Object) this.winRate, (Object) calendarOneDayPo.winRate) && this.winCount == calendarOneDayPo.winCount && this.loseCount == calendarOneDayPo.loseCount && Intrinsics.EZpvd((Object) this.pnlOnWin, (Object) calendarOneDayPo.pnlOnWin) && Intrinsics.EZpvd((Object) this.pnlOnLoss, (Object) calendarOneDayPo.pnlOnLoss);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getClosedPositions() {
            return this.closedPositions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCumulativePnl() {
            return this.cumulativePnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getDateTime() {
            return this.dateTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getLoseCount() {
            return this.loseCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnlOnLoss() {
            return this.pnlOnLoss;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPnlOnWin() {
            return this.pnlOnWin;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getWinCount() {
            return this.winCount;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getWinRate() {
            return this.winRate;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((((((((((Integer.hashCode(this.closedPositions) * 31) + this.cumulativePnl.hashCode()) * 31) + Long.hashCode(this.dateTime)) * 31) + this.winRate.hashCode()) * 31) + Integer.hashCode(this.winCount)) * 31) + Integer.hashCode(this.loseCount)) * 31) + this.pnlOnWin.hashCode()) * 31) + this.pnlOnLoss.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CalendarOneDayPo(closedPositions=" + this.closedPositions + ", cumulativePnl=" + this.cumulativePnl + ", dateTime=" + this.dateTime + ", winRate=" + this.winRate + ", winCount=" + this.winCount + ", loseCount=" + this.loseCount + ", pnlOnWin=" + this.pnlOnWin + ", pnlOnLoss=" + this.pnlOnLoss + ")";
        }

        public CalendarOneDayPo(int i, @NotNull String str, long j, @NotNull String str2, int i2, int i3, @NotNull String str3, @NotNull String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.closedPositions = i;
            this.cumulativePnl = str;
            this.dateTime = j;
            this.winRate = str2;
            this.winCount = i2;
            this.loseCount = i3;
            this.pnlOnWin = str3;
            this.pnlOnLoss = str4;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r11v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0013: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r13v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r16v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002a: ARITH (r20v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r17v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(int, java.lang.String, long, java.lang.String, int, int, java.lang.String, java.lang.String):void (m)] (LINE:18) call: com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo.CalendarOneDayPo.<init>(int, java.lang.String, long, java.lang.String, int, int, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ CalendarOneDayPo(int i, String str, long j, String str2, int i2, int i3, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? "" : str, (i4 & 4) != 0 ? 0L : j, (i4 & 8) != 0 ? "" : str2, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) == 0 ? i3 : 0, (i4 & 64) != 0 ? "" : str3, (i4 & 128) == 0 ? str4 : "");
        }
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class EveryDayCumulativePnl {
        public static final int $stable = 0;

        @SerializedName("cumulativePnl")
        private final String cumulativePnl;

        @SerializedName("dateTime")
        private final long dateTime;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public EveryDayCumulativePnl() {
            this(null, 0L, 3, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EveryDayCumulativePnl copy$default(EveryDayCumulativePnl everyDayCumulativePnl, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = everyDayCumulativePnl.cumulativePnl;
            }
            if ((i & 2) != 0) {
                j = everyDayCumulativePnl.dateTime;
            }
            return everyDayCumulativePnl.copy(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.cumulativePnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long component2() {
            return this.dateTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EveryDayCumulativePnl copy(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return new EveryDayCumulativePnl(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EveryDayCumulativePnl)) {
                return false;
            }
            EveryDayCumulativePnl everyDayCumulativePnl = (EveryDayCumulativePnl) obj;
            return Intrinsics.EZpvd((Object) this.cumulativePnl, (Object) everyDayCumulativePnl.cumulativePnl) && this.dateTime == everyDayCumulativePnl.dateTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCumulativePnl() {
            return this.cumulativePnl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long getDateTime() {
            return this.dateTime;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.cumulativePnl.hashCode() * 31) + Long.hashCode(this.dateTime);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EveryDayCumulativePnl(cumulativePnl=" + this.cumulativePnl + ", dateTime=" + this.dateTime + ")";
        }

        public EveryDayCumulativePnl(@NotNull String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.cumulativePnl = str;
            this.dateTime = j;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r2v0 long))
 A[MD:(java.lang.String, long):void (m)] (LINE:50) call: com.okinc.business.market.features.analysis.futures.sub.calendar.data.model.CalendarPo.EveryDayCumulativePnl.<init>(java.lang.String, long):void type: THIS */
        public /* synthetic */ EveryDayCumulativePnl(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0L : j);
        }
    }
}

package com.okinc.kline.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.oLP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KLineEventBean implements oLP {
    public static final int $stable = 8;
    private String actual;
    private String calendarId;
    private String category;
    private String country;
    private long date;
    private Long endTime;
    private String event;
    private long eventId;
    private String eventKey;
    private String eventName;
    private String forecast;
    private int importance;
    private boolean isAddReminder;
    private int posX;
    private String previous;
    private boolean showTimeLine;
    private Long startTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KLineEventBean() {
        this(null, null, null, 0L, null, null, null, null, 0, null, 0, false, null, 0L, null, null, false, 131071, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.actual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.previous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.posX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.showTimeLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.calendarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component14() {
        return this.eventId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component15() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component16() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.isAddReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.eventName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.eventKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.forecast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.importance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KLineEventBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, int i2, boolean z, @NotNull String str9, long j2, Long l, Long l2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new KLineEventBean(str, str2, str3, j, str4, str5, str6, str7, i, str8, i2, z, str9, j2, l, l2, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KLineEventBean)) {
            return false;
        }
        KLineEventBean kLineEventBean = (KLineEventBean) obj;
        return Intrinsics.EZpvd((Object) this.actual, (Object) kLineEventBean.actual) && Intrinsics.EZpvd((Object) this.category, (Object) kLineEventBean.category) && Intrinsics.EZpvd((Object) this.country, (Object) kLineEventBean.country) && this.date == kLineEventBean.date && Intrinsics.EZpvd((Object) this.event, (Object) kLineEventBean.event) && Intrinsics.EZpvd((Object) this.eventName, (Object) kLineEventBean.eventName) && Intrinsics.EZpvd((Object) this.eventKey, (Object) kLineEventBean.eventKey) && Intrinsics.EZpvd((Object) this.forecast, (Object) kLineEventBean.forecast) && this.importance == kLineEventBean.importance && Intrinsics.EZpvd((Object) this.previous, (Object) kLineEventBean.previous) && this.posX == kLineEventBean.posX && this.showTimeLine == kLineEventBean.showTimeLine && Intrinsics.EZpvd((Object) this.calendarId, (Object) kLineEventBean.calendarId) && this.eventId == kLineEventBean.eventId && Intrinsics.EZpvd(this.startTime, kLineEventBean.startTime) && Intrinsics.EZpvd(this.endTime, kLineEventBean.endTime) && this.isAddReminder == kLineEventBean.isAddReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActual() {
        return this.actual;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalendarId() {
        return this.calendarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountry() {
        return this.country;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDate() {
        return this.date;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEvent() {
        return this.event;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventId() {
        return this.eventId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventKey() {
        return this.eventKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEventName() {
        return this.eventName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getForecast() {
        return this.forecast;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getImportance() {
        return this.importance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPosX() {
        return this.posX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrevious() {
        return this.previous;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getShowTimeLine() {
        return this.showTimeLine;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.actual.hashCode();
        int iHashCode2 = this.category.hashCode();
        int iHashCode3 = this.country.hashCode();
        int iHashCode4 = Long.hashCode(this.date);
        int iHashCode5 = this.event.hashCode();
        int iHashCode6 = this.eventName.hashCode();
        int iHashCode7 = this.eventKey.hashCode();
        int iHashCode8 = this.forecast.hashCode();
        int iHashCode9 = Integer.hashCode(this.importance);
        int iHashCode10 = this.previous.hashCode();
        int iHashCode11 = Integer.hashCode(this.posX);
        int iHashCode12 = Boolean.hashCode(this.showTimeLine);
        int iHashCode13 = this.calendarId.hashCode();
        int iHashCode14 = Long.hashCode(this.eventId);
        Long l = this.startTime;
        int iHashCode15 = l == null ? 0 : l.hashCode();
        Long l2 = this.endTime;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + (l2 != null ? l2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAddReminder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAddReminder() {
        return this.isAddReminder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActual(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actual = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddReminder(boolean z) {
        this.isAddReminder = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalendarId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.calendarId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountry(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.country = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDate(long j) {
        this.date = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEvent(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.event = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventId(long j) {
        this.eventId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eventKey = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.eventName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setForecast(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.forecast = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImportance(int i) {
        this.importance = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPosX(int i) {
        this.posX = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrevious(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.previous = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setShowTimeLine(boolean z) {
        this.showTimeLine = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(Long l) {
        this.startTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KLineEventBean(actual=" + this.actual + ", category=" + this.category + ", country=" + this.country + ", date=" + this.date + ", event=" + this.event + ", eventName=" + this.eventName + ", eventKey=" + this.eventKey + ", forecast=" + this.forecast + ", importance=" + this.importance + ", previous=" + this.previous + ", posX=" + this.posX + ", showTimeLine=" + this.showTimeLine + ", calendarId=" + this.calendarId + ", eventId=" + this.eventId + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", isAddReminder=" + this.isAddReminder + ")";
    }

    public KLineEventBean(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, int i, @NotNull String str8, int i2, boolean z, @NotNull String str9, long j2, Long l, Long l2, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.actual = str;
        this.category = str2;
        this.country = str3;
        this.date = j;
        this.event = str4;
        this.eventName = str5;
        this.eventKey = str6;
        this.forecast = str7;
        this.importance = i;
        this.previous = str8;
        this.posX = i2;
        this.showTimeLine = z;
        this.calendarId = str9;
        this.eventId = j2;
        this.startTime = l;
        this.endTime = l2;
        this.isAddReminder = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00be: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r41v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r41v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r41v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r41v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r25v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r41v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r41v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r41v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r41v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r41v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r31v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004d: ARITH (r41v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0055: ARITH (r41v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r41v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r41v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r35v0 java.lang.String) : (""))
  (wrap:long:?: TERNARY null = ((wrap:int:0x006c: ARITH (r41v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r36v0 long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0077: ARITH (r41v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r38v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0085: ARITH (r41v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r39v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0092: ARITH (r41v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? false : (r40v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, boolean, java.lang.String, long, java.lang.Long, java.lang.Long, boolean):void (m)] (LINE:9) call: com.okinc.kline.data.KLineEventBean.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, boolean, java.lang.String, long, java.lang.Long, java.lang.Long, boolean):void type: THIS */
    public /* synthetic */ KLineEventBean(String str, String str2, String str3, long j, String str4, String str5, String str6, String str7, int i, String str8, int i2, boolean z, String str9, long j2, Long l, Long l2, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? "" : str5, (i3 & 64) != 0 ? "" : str6, (i3 & 128) != 0 ? "" : str7, (i3 & 256) != 0 ? 2 : i, (i3 & 512) != 0 ? "" : str8, (i3 & 1024) != 0 ? 0 : i2, (i3 & 2048) != 0 ? false : z, (i3 & 4096) == 0 ? str9 : "", (i3 & 8192) != 0 ? -1L : j2, (i3 & 16384) != 0 ? -1L : l, (i3 & 32768) != 0 ? -1L : l2, (i3 & 65536) != 0 ? false : z2);
    }
}

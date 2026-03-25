package com.okinc.kline.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class KlineEventCalendarEntity {
    public static final int $stable = 8;
    private String calendarId;
    private long endTime;
    private long eventDate;
    private long eventId;
    private long startTime;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public KlineEventCalendarEntity() {
        this(null, 0L, 0L, 0L, 0L, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.calendarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.eventId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.eventDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component5() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KlineEventCalendarEntity copy(@NotNull String str, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(str, "");
        return new KlineEventCalendarEntity(str, j, j2, j3, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlineEventCalendarEntity)) {
            return false;
        }
        KlineEventCalendarEntity klineEventCalendarEntity = (KlineEventCalendarEntity) obj;
        return Intrinsics.EZpvd((Object) this.calendarId, (Object) klineEventCalendarEntity.calendarId) && this.eventId == klineEventCalendarEntity.eventId && this.eventDate == klineEventCalendarEntity.eventDate && this.startTime == klineEventCalendarEntity.startTime && this.endTime == klineEventCalendarEntity.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalendarId() {
        return this.calendarId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventDate() {
        return this.eventDate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getEventId() {
        return this.eventId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.calendarId.hashCode() * 31) + Long.hashCode(this.eventId)) * 31) + Long.hashCode(this.eventDate)) * 31) + Long.hashCode(this.startTime)) * 31) + Long.hashCode(this.endTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCalendarId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.calendarId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(long j) {
        this.endTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventDate(long j) {
        this.eventDate = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventId(long j) {
        this.eventId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStartTime(long j) {
        this.startTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "KlineEventCalendarEntity(calendarId=" + this.calendarId + ", eventId=" + this.eventId + ", eventDate=" + this.eventDate + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public KlineEventCalendarEntity(@NotNull String str, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(str, "");
        this.calendarId = str;
        this.eventId = j;
        this.eventDate = j2;
        this.startTime = j3;
        this.endTime = j4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 long) : (r12v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r14v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r16v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x0021: ARITH (r20v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r18v0 long) : (0 long))
 A[MD:(java.lang.String, long, long, long, long):void (m)] (LINE:13) call: com.okinc.kline.api.bean.KlineEventCalendarEntity.<init>(java.lang.String, long, long, long, long):void type: THIS */
    public /* synthetic */ KlineEventCalendarEntity(String str, long j, long j2, long j3, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? -1L : j, (i & 4) != 0 ? 0L : j2, (i & 8) != 0 ? 0L : j3, (i & 16) == 0 ? j4 : 0L);
    }
}

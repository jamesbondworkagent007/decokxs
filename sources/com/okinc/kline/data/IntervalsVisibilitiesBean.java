package com.okinc.kline.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class IntervalsVisibilitiesBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<IntervalsVisibilitiesBean> CREATOR = new Creator();
    private boolean days;
    private int daysFrom;
    private int daysTo;
    private boolean hours;
    private int hoursFrom;
    private int hoursTo;
    private boolean minutes;
    private int minutesFrom;
    private int minutesTo;
    private boolean months;
    private int monthsFrom;
    private int monthsTo;
    private boolean ranges;
    private boolean seconds;
    private int secondsFrom;
    private int secondsTo;
    private boolean ticks;
    private boolean weeks;
    private int weeksFrom;
    private int weeksTo;

    public static final class Creator implements Parcelable.Creator<IntervalsVisibilitiesBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntervalsVisibilitiesBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IntervalsVisibilitiesBean(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntervalsVisibilitiesBean[] newArray(int i) {
            return new IntervalsVisibilitiesBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IntervalsVisibilitiesBean() {
        this(false, false, 0, 0, false, 0, 0, false, 0, 0, false, 0, 0, false, 0, 0, false, 0, 0, false, 1048575, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.ticks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.hoursTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component11() {
        return this.days;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.daysFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.daysTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.weeks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component15() {
        return this.weeksFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component16() {
        return this.weeksTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component17() {
        return this.months;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.monthsFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component19() {
        return this.monthsTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.seconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component20() {
        return this.ranges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.secondsFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.secondsTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.minutes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.minutesFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.minutesTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.hours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.hoursFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntervalsVisibilitiesBean copy(boolean z, boolean z2, int i, int i2, boolean z3, int i3, int i4, boolean z4, int i5, int i6, boolean z5, int i7, int i8, boolean z6, int i9, int i10, boolean z7, int i11, int i12, boolean z8) {
        return new IntervalsVisibilitiesBean(z, z2, i, i2, z3, i3, i4, z4, i5, i6, z5, i7, i8, z6, i9, i10, z7, i11, i12, z8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntervalsVisibilitiesBean)) {
            return false;
        }
        IntervalsVisibilitiesBean intervalsVisibilitiesBean = (IntervalsVisibilitiesBean) obj;
        return this.ticks == intervalsVisibilitiesBean.ticks && this.seconds == intervalsVisibilitiesBean.seconds && this.secondsFrom == intervalsVisibilitiesBean.secondsFrom && this.secondsTo == intervalsVisibilitiesBean.secondsTo && this.minutes == intervalsVisibilitiesBean.minutes && this.minutesFrom == intervalsVisibilitiesBean.minutesFrom && this.minutesTo == intervalsVisibilitiesBean.minutesTo && this.hours == intervalsVisibilitiesBean.hours && this.hoursFrom == intervalsVisibilitiesBean.hoursFrom && this.hoursTo == intervalsVisibilitiesBean.hoursTo && this.days == intervalsVisibilitiesBean.days && this.daysFrom == intervalsVisibilitiesBean.daysFrom && this.daysTo == intervalsVisibilitiesBean.daysTo && this.weeks == intervalsVisibilitiesBean.weeks && this.weeksFrom == intervalsVisibilitiesBean.weeksFrom && this.weeksTo == intervalsVisibilitiesBean.weeksTo && this.months == intervalsVisibilitiesBean.months && this.monthsFrom == intervalsVisibilitiesBean.monthsFrom && this.monthsTo == intervalsVisibilitiesBean.monthsTo && this.ranges == intervalsVisibilitiesBean.ranges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getDays() {
        return this.days;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDaysFrom() {
        return this.daysFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDaysTo() {
        return this.daysTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHours() {
        return this.hours;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHoursFrom() {
        return this.hoursFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getHoursTo() {
        return this.hoursTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMinutes() {
        return this.minutes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMinutesFrom() {
        return this.minutesFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMinutesTo() {
        return this.minutesTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getMonths() {
        return this.months;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMonthsFrom() {
        return this.monthsFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getMonthsTo() {
        return this.monthsTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRanges() {
        return this.ranges;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSeconds() {
        return this.seconds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSecondsFrom() {
        return this.secondsFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSecondsTo() {
        return this.secondsTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getTicks() {
        return this.ticks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getWeeks() {
        return this.weeks;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWeeksFrom() {
        return this.weeksFrom;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWeeksTo() {
        return this.weeksTo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((Boolean.hashCode(this.ticks) * 31) + Boolean.hashCode(this.seconds)) * 31) + Integer.hashCode(this.secondsFrom)) * 31) + Integer.hashCode(this.secondsTo)) * 31) + Boolean.hashCode(this.minutes)) * 31) + Integer.hashCode(this.minutesFrom)) * 31) + Integer.hashCode(this.minutesTo)) * 31) + Boolean.hashCode(this.hours)) * 31) + Integer.hashCode(this.hoursFrom)) * 31) + Integer.hashCode(this.hoursTo)) * 31) + Boolean.hashCode(this.days)) * 31) + Integer.hashCode(this.daysFrom)) * 31) + Integer.hashCode(this.daysTo)) * 31) + Boolean.hashCode(this.weeks)) * 31) + Integer.hashCode(this.weeksFrom)) * 31) + Integer.hashCode(this.weeksTo)) * 31) + Boolean.hashCode(this.months)) * 31) + Integer.hashCode(this.monthsFrom)) * 31) + Integer.hashCode(this.monthsTo)) * 31) + Boolean.hashCode(this.ranges);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDays(boolean z) {
        this.days = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDaysFrom(int i) {
        this.daysFrom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDaysTo(int i) {
        this.daysTo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHours(boolean z) {
        this.hours = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoursFrom(int i) {
        this.hoursFrom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHoursTo(int i) {
        this.hoursTo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinutes(boolean z) {
        this.minutes = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinutesFrom(int i) {
        this.minutesFrom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinutesTo(int i) {
        this.minutesTo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMonths(boolean z) {
        this.months = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMonthsFrom(int i) {
        this.monthsFrom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMonthsTo(int i) {
        this.monthsTo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRanges(boolean z) {
        this.ranges = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSeconds(boolean z) {
        this.seconds = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondsFrom(int i) {
        this.secondsFrom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSecondsTo(int i) {
        this.secondsTo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTicks(boolean z) {
        this.ticks = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeeks(boolean z) {
        this.weeks = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeeksFrom(int i) {
        this.weeksFrom = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeeksTo(int i) {
        this.weeksTo = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IntervalsVisibilitiesBean(ticks=" + this.ticks + ", seconds=" + this.seconds + ", secondsFrom=" + this.secondsFrom + ", secondsTo=" + this.secondsTo + ", minutes=" + this.minutes + ", minutesFrom=" + this.minutesFrom + ", minutesTo=" + this.minutesTo + ", hours=" + this.hours + ", hoursFrom=" + this.hoursFrom + ", hoursTo=" + this.hoursTo + ", days=" + this.days + ", daysFrom=" + this.daysFrom + ", daysTo=" + this.daysTo + ", weeks=" + this.weeks + ", weeksFrom=" + this.weeksFrom + ", weeksTo=" + this.weeksTo + ", months=" + this.months + ", monthsFrom=" + this.monthsFrom + ", monthsTo=" + this.monthsTo + ", ranges=" + this.ranges + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.ticks ? 1 : 0);
        parcel.writeInt(this.seconds ? 1 : 0);
        parcel.writeInt(this.secondsFrom);
        parcel.writeInt(this.secondsTo);
        parcel.writeInt(this.minutes ? 1 : 0);
        parcel.writeInt(this.minutesFrom);
        parcel.writeInt(this.minutesTo);
        parcel.writeInt(this.hours ? 1 : 0);
        parcel.writeInt(this.hoursFrom);
        parcel.writeInt(this.hoursTo);
        parcel.writeInt(this.days ? 1 : 0);
        parcel.writeInt(this.daysFrom);
        parcel.writeInt(this.daysTo);
        parcel.writeInt(this.weeks ? 1 : 0);
        parcel.writeInt(this.weeksFrom);
        parcel.writeInt(this.weeksTo);
        parcel.writeInt(this.months ? 1 : 0);
        parcel.writeInt(this.monthsFrom);
        parcel.writeInt(this.monthsTo);
        parcel.writeInt(this.ranges ? 1 : 0);
    }

    public IntervalsVisibilitiesBean(boolean z, boolean z2, int i, int i2, boolean z3, int i3, int i4, boolean z4, int i5, int i6, boolean z5, int i7, int i8, boolean z6, int i9, int i10, boolean z7, int i11, int i12, boolean z8) {
        this.ticks = z;
        this.seconds = z2;
        this.secondsFrom = i;
        this.secondsTo = i2;
        this.minutes = z3;
        this.minutesFrom = i3;
        this.minutesTo = i4;
        this.hours = z4;
        this.hoursFrom = i5;
        this.hoursTo = i6;
        this.days = z5;
        this.daysFrom = i7;
        this.daysTo = i8;
        this.weeks = z6;
        this.weeksFrom = i9;
        this.weeksTo = i10;
        this.months = z7;
        this.monthsFrom = i11;
        this.monthsTo = i12;
        this.ranges = z8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00de: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : (r22v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r23v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0012: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x001a: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (59 int) : (r25v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0024: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r26v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x002c: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0034: ARITH (r42v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r28v0 int) : (59 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003b: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? true : (r29v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0043: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r30v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004b: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (24 int) : (r31v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0054: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? true : (r32v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005c: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r33v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0064: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? (366 int) : (r34v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006d: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? true : (r35v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0075: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r36v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0080: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (52 int) : (r37v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x008b: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? true : (r38v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0096: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r39v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00a1: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (12 int) : (r40v0 int))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x00ac: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? true : (r41v0 boolean))
 A[MD:(boolean, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean):void (m)] (LINE:144) call: com.okinc.kline.data.IntervalsVisibilitiesBean.<init>(boolean, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean, int, int, boolean):void type: THIS */
    public /* synthetic */ IntervalsVisibilitiesBean(boolean z, boolean z2, int i, int i2, boolean z3, int i3, int i4, boolean z4, int i5, int i6, boolean z5, int i7, int i8, boolean z6, int i9, int i10, boolean z7, int i11, int i12, boolean z8, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? true : z, (i13 & 2) != 0 ? true : z2, (i13 & 4) != 0 ? 1 : i, (i13 & 8) != 0 ? 59 : i2, (i13 & 16) != 0 ? true : z3, (i13 & 32) != 0 ? 1 : i3, (i13 & 64) == 0 ? i4 : 59, (i13 & 128) != 0 ? true : z4, (i13 & 256) != 0 ? 1 : i5, (i13 & 512) != 0 ? 24 : i6, (i13 & 1024) != 0 ? true : z5, (i13 & 2048) != 0 ? 1 : i7, (i13 & 4096) != 0 ? 366 : i8, (i13 & 8192) != 0 ? true : z6, (i13 & 16384) != 0 ? 1 : i9, (i13 & 32768) != 0 ? 52 : i10, (i13 & 65536) != 0 ? true : z7, (i13 & 131072) != 0 ? 1 : i11, (i13 & 262144) != 0 ? 12 : i12, (i13 & 524288) != 0 ? true : z8);
    }
}

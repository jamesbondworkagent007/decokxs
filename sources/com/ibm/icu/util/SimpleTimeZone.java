package com.ibm.icu.util;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;
import o.C7019abT;
import o.C7261agW;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleTimeZone extends BasicTimeZone {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int DOM_MODE = 1;
    private static final int DOW_GE_DOM_MODE = 3;
    private static final int DOW_IN_MONTH_MODE = 2;
    private static final int DOW_LE_DOM_MODE = 4;
    public static final int STANDARD_TIME = 1;
    public static final int UTC_TIME = 2;
    public static final int WALL_TIME = 0;
    private static final long serialVersionUID = -7034676239311322769L;
    private static final byte[] staticMonthLength = {Ascii.US, Ascii.GS, Ascii.US, Ascii.RS, Ascii.US, Ascii.RS, Ascii.US, Ascii.US, Ascii.RS, Ascii.US, Ascii.RS, Ascii.US};
    private int dst;
    private transient AnnualTimeZoneRule dstRule;
    private int endDay;
    private int endDayOfWeek;
    private int endMode;
    private int endMonth;
    private int endTime;
    private int endTimeMode;
    private transient C7261agW firstTransition;
    private transient InitialTimeZoneRule initialRule;
    private volatile transient boolean isFrozen;
    private int raw;
    private int startDay;
    private int startDayOfWeek;
    private int startMode;
    private int startMonth;
    private int startTime;
    private int startTimeMode;
    private int startYear;
    private transient AnnualTimeZoneRule stdRule;
    private transient boolean transitionRulesInitialized;
    private boolean useDaylight;
    private STZInfo xinfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Method merged with bridge method: freeze()Ljava/lang/Object; */
    @Override // com.ibm.icu.util.TimeZone
    /* JADX INFO: renamed from: freeze */
    public TimeZone mo6320freeze() {
        this.isFrozen = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.TimeZone
    public int getDSTSavings() {
        return this.dst;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.TimeZone
    public int getRawOffset() {
        return this.raw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.TimeZone
    public boolean isFrozen() {
        return this.isFrozen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.TimeZone
    public boolean observesDaylightTime() {
        return this.useDaylight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.TimeZone
    public boolean useDaylightTime() {
        return this.useDaylight;
    }

    public SimpleTimeZone(int i, String str) {
        super(str);
        this.dst = 3600000;
        this.xinfo = null;
        this.isFrozen = false;
        construct(i, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3600000);
    }

    public SimpleTimeZone(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        super(str);
        this.dst = 3600000;
        this.xinfo = null;
        this.isFrozen = false;
        construct(i, i2, i3, i4, i5, 0, i6, i7, i8, i9, 0, 3600000);
    }

    public SimpleTimeZone(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        super(str);
        this.dst = 3600000;
        this.xinfo = null;
        this.isFrozen = false;
        construct(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12);
    }

    public SimpleTimeZone(int i, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        super(str);
        this.dst = 3600000;
        this.xinfo = null;
        this.isFrozen = false;
        construct(i, i2, i3, i4, i5, 0, i6, i7, i8, i9, 0, i10);
    }

    @Override // com.ibm.icu.util.TimeZone
    public void setID(String str) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        super.setID(str);
        this.transitionRulesInitialized = false;
    }

    @Override // com.ibm.icu.util.TimeZone
    public void setRawOffset(int i) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        this.raw = i;
        this.transitionRulesInitialized = false;
    }

    public void setStartYear(int i) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        getSTZInfo().sy = i;
        this.startYear = i;
        this.transitionRulesInitialized = false;
    }

    public void setStartRule(int i, int i2, int i3, int i4) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        getSTZInfo().setStart(i, i2, i3, i4, -1, false);
        setStartRule(i, i2, i3, i4, 0);
    }

    private void setStartRule(int i, int i2, int i3, int i4, int i5) {
        this.startMonth = i;
        this.startDay = i2;
        this.startDayOfWeek = i3;
        this.startTime = i4;
        this.startTimeMode = i5;
        decodeStartRule();
        this.transitionRulesInitialized = false;
    }

    public void setStartRule(int i, int i2, int i3) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        getSTZInfo().setStart(i, -1, -1, i3, i2, false);
        setStartRule(i, i2, 0, i3, 0);
    }

    public void setStartRule(int i, int i2, int i3, int i4, boolean z) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        getSTZInfo().setStart(i, -1, i3, i4, i2, z);
        if (!z) {
            i2 = -i2;
        }
        setStartRule(i, i2, -i3, i4, 0);
    }

    public void setEndRule(int i, int i2, int i3, int i4) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        getSTZInfo().setEnd(i, i2, i3, i4, -1, false);
        setEndRule(i, i2, i3, i4, 0);
    }

    public void setEndRule(int i, int i2, int i3) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        getSTZInfo().setEnd(i, -1, -1, i3, i2, false);
        setEndRule(i, i2, 0, i3);
    }

    public void setEndRule(int i, int i2, int i3, int i4, boolean z) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        getSTZInfo().setEnd(i, -1, i3, i4, i2, z);
        setEndRule(i, i2, i3, i4, 0, z);
    }

    private void setEndRule(int i, int i2, int i3, int i4, int i5, boolean z) {
        if (!z) {
            i2 = -i2;
        }
        setEndRule(i, i2, -i3, i4, i5);
    }

    private void setEndRule(int i, int i2, int i3, int i4, int i5) {
        this.endMonth = i;
        this.endDay = i2;
        this.endDayOfWeek = i3;
        this.endTime = i4;
        this.endTimeMode = i5;
        decodeEndRule();
        this.transitionRulesInitialized = false;
    }

    public void setDSTSavings(int i) {
        if (isFrozen()) {
            throw new UnsupportedOperationException("Attempt to modify a frozen SimpleTimeZone instance.");
        }
        if (i == 0) {
            throw new IllegalArgumentException();
        }
        this.dst = i;
        this.transitionRulesInitialized = false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        STZInfo sTZInfo = this.xinfo;
        if (sTZInfo != null) {
            sTZInfo.applyTo(this);
        }
    }

    public String toString() {
        return "SimpleTimeZone: " + getID();
    }

    private STZInfo getSTZInfo() {
        if (this.xinfo == null) {
            this.xinfo = new STZInfo();
        }
        return this.xinfo;
    }

    @Override // com.ibm.icu.util.TimeZone
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 < 0 || i3 > 11) {
            throw new IllegalArgumentException();
        }
        return getOffset(i, i2, i3, i4, i5, i6, C7019abT.copydefault(i2, i3));
    }

    @Deprecated
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i3 < 0 || i3 > 11) {
            throw new IllegalArgumentException();
        }
        return getOffset(i, i2, i3, i4, i5, i6, C7019abT.copydefault(i2, i3), C7019abT.AEQbTJ(i2, i3));
    }

    private int getOffset(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if ((i != 1 && i != 0) || i3 < 0 || i3 > 11 || i4 < 1 || i4 > i7 || i5 < 1 || i5 > 7 || i6 < 0 || i6 >= 86400000 || i7 < 28 || i7 > 31 || i8 < 28 || i8 > 31) {
            throw new IllegalArgumentException();
        }
        int i11 = this.raw;
        if (!this.useDaylight || i2 < this.startYear || i != 1) {
            return i11;
        }
        int i12 = this.startMonth;
        int iCompareToRule = 0;
        boolean z = i12 > this.endMonth;
        int iCompareToRule2 = compareToRule(i3, i7, i8, i4, i5, i6, this.startTimeMode == 2 ? -i11 : 0, this.startMode, i12, this.startDayOfWeek, this.startDay, this.startTime);
        if (z != (iCompareToRule2 >= 0)) {
            int i13 = this.endTimeMode;
            if (i13 == 0) {
                i10 = this.dst;
            } else if (i13 == 2) {
                i10 = -this.raw;
            } else {
                i9 = 0;
                iCompareToRule = compareToRule(i3, i7, i8, i4, i5, i6, i9, this.endMode, this.endMonth, this.endDayOfWeek, this.endDay, this.endTime);
            }
            i9 = i10;
            iCompareToRule = compareToRule(i3, i7, i8, i4, i5, i6, i9, this.endMode, this.endMonth, this.endDayOfWeek, this.endDay, this.endTime);
        }
        return ((z || iCompareToRule2 < 0 || iCompareToRule >= 0) && (!z || (iCompareToRule2 < 0 && iCompareToRule >= 0))) ? i11 : i11 + this.dst;
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    @Deprecated
    public void getOffsetFromLocal(long j, int i, int i2, int[] iArr) {
        int dSTSavings;
        boolean z;
        long j2 = j;
        iArr[0] = getRawOffset();
        int[] iArr2 = new int[6];
        C7019abT.KWHzl(j2, iArr2);
        int offset = getOffset(1, iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[5]) - iArr[0];
        iArr[1] = offset;
        if (offset > 0) {
            int i3 = i & 3;
            if (i3 == 1 || (i3 != 3 && (i & 12) != 12)) {
                dSTSavings = getDSTSavings();
                j2 -= (long) dSTSavings;
                z = true;
            }
            z = false;
        } else {
            int i4 = i2 & 3;
            if (i4 == 3 || (i4 != 1 && (i2 & 12) == 4)) {
                dSTSavings = getDSTSavings();
                j2 -= (long) dSTSavings;
                z = true;
            }
            z = false;
        }
        if (z) {
            C7019abT.KWHzl(j2, iArr2);
            iArr[1] = getOffset(1, iArr2[0], iArr2[1], iArr2[2], iArr2[3], iArr2[5]) - iArr[0];
        }
    }

    private int compareToRule(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        int i13;
        int i14 = i6 + i7;
        while (i14 >= 86400000) {
            i14 -= 86400000;
            i4++;
            i5 = (i5 % 7) + 1;
            if (i4 > i2) {
                i++;
                i4 = 1;
            }
        }
        while (i14 < 0) {
            i4--;
            i5 = ((i5 + 5) % 7) + 1;
            if (i4 < 1) {
                i--;
                i4 = i3;
            }
            i14 += 86400000;
        }
        if (i < i9) {
            return -1;
        }
        if (i > i9) {
            return 1;
        }
        if (i11 > i2) {
            i11 = i2;
        }
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    i13 = ((((i10 + 49) - i11) - i5) + i4) % 7;
                    i11 += i13;
                } else {
                    i11 = i8 != 4 ? 0 : i11 - (((((49 - i10) + i11) + i5) - i4) % 7);
                }
            } else if (i11 > 0) {
                i11 = ((i11 - 1) * 7) + 1;
                i13 = ((i10 + 7) - ((i5 - i4) + 1)) % 7;
                i11 += i13;
            } else {
                i11 = (((i11 + 1) * 7) + i2) - (((((i5 + i2) - i4) + 7) - i10) % 7);
            }
        }
        if (i4 < i11) {
            return -1;
        }
        if (i4 > i11) {
            return 1;
        }
        if (i14 < i12) {
            return -1;
        }
        return i14 > i12 ? 1 : 0;
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean inDaylightTime(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(this);
        gregorianCalendar.setTime(date);
        return gregorianCalendar.inDaylightTime();
    }

    private void construct(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.raw = i;
        this.startMonth = i2;
        this.startDay = i3;
        this.startDayOfWeek = i4;
        this.startTime = i5;
        this.startTimeMode = i6;
        this.endMonth = i7;
        this.endDay = i8;
        this.endDayOfWeek = i9;
        this.endTime = i10;
        this.endTimeMode = i11;
        this.dst = i12;
        this.startYear = 0;
        this.startMode = 1;
        this.endMode = 1;
        decodeRules();
        if (i12 == 0) {
            throw new IllegalArgumentException();
        }
    }

    private void decodeRules() {
        decodeStartRule();
        decodeEndRule();
    }

    private void decodeStartRule() {
        int i;
        int i2;
        int i3 = this.startDay;
        boolean z = (i3 == 0 || this.endDay == 0) ? false : true;
        this.useDaylight = z;
        if (z && this.dst == 0) {
            this.dst = 86400000;
        }
        if (i3 != 0) {
            int i4 = this.startMonth;
            if (i4 < 0 || i4 > 11) {
                throw new IllegalArgumentException();
            }
            int i5 = this.startTime;
            if (i5 < 0 || i5 > 86400000 || (i = this.startTimeMode) < 0 || i > 2) {
                throw new IllegalArgumentException();
            }
            int i6 = this.startDayOfWeek;
            if (i6 == 0) {
                this.startMode = 1;
            } else {
                if (i6 > 0) {
                    this.startMode = 2;
                } else {
                    this.startDayOfWeek = -i6;
                    if (i3 > 0) {
                        i2 = 3;
                    } else {
                        this.startDay = -i3;
                        i2 = 4;
                    }
                    this.startMode = i2;
                }
                if (this.startDayOfWeek > 7) {
                    throw new IllegalArgumentException();
                }
            }
            if (this.startMode == 2) {
                int i7 = this.startDay;
                if (i7 < -5 || i7 > 5) {
                    throw new IllegalArgumentException();
                }
                return;
            }
            int i8 = this.startDay;
            if (i8 < 1 || i8 > staticMonthLength[i4]) {
                throw new IllegalArgumentException();
            }
        }
    }

    private void decodeEndRule() {
        int i;
        int i2;
        boolean z = (this.startDay == 0 || this.endDay == 0) ? false : true;
        this.useDaylight = z;
        if (z && this.dst == 0) {
            this.dst = 86400000;
        }
        int i3 = this.endDay;
        if (i3 != 0) {
            int i4 = this.endMonth;
            if (i4 < 0 || i4 > 11) {
                throw new IllegalArgumentException();
            }
            int i5 = this.endTime;
            if (i5 < 0 || i5 > 86400000 || (i = this.endTimeMode) < 0 || i > 2) {
                throw new IllegalArgumentException();
            }
            int i6 = this.endDayOfWeek;
            if (i6 == 0) {
                this.endMode = 1;
            } else {
                if (i6 > 0) {
                    this.endMode = 2;
                } else {
                    this.endDayOfWeek = -i6;
                    if (i3 > 0) {
                        i2 = 3;
                    } else {
                        this.endDay = -i3;
                        i2 = 4;
                    }
                    this.endMode = i2;
                }
                if (this.endDayOfWeek > 7) {
                    throw new IllegalArgumentException();
                }
            }
            if (this.endMode == 2) {
                int i7 = this.endDay;
                if (i7 < -5 || i7 > 5) {
                    throw new IllegalArgumentException();
                }
                return;
            }
            int i8 = this.endDay;
            if (i8 < 1 || i8 > staticMonthLength[i4]) {
                throw new IllegalArgumentException();
            }
        }
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleTimeZone simpleTimeZone = (SimpleTimeZone) obj;
        if (this.raw == simpleTimeZone.raw && this.useDaylight == simpleTimeZone.useDaylight && idEquals(getID(), simpleTimeZone.getID())) {
            if (!this.useDaylight) {
                return true;
            }
            if (this.dst == simpleTimeZone.dst && this.startMode == simpleTimeZone.startMode && this.startMonth == simpleTimeZone.startMonth && this.startDay == simpleTimeZone.startDay && this.startDayOfWeek == simpleTimeZone.startDayOfWeek && this.startTime == simpleTimeZone.startTime && this.startTimeMode == simpleTimeZone.startTimeMode && this.endMode == simpleTimeZone.endMode && this.endMonth == simpleTimeZone.endMonth && this.endDay == simpleTimeZone.endDay && this.endDayOfWeek == simpleTimeZone.endDayOfWeek && this.endTime == simpleTimeZone.endTime && this.endTimeMode == simpleTimeZone.endTimeMode && this.startYear == simpleTimeZone.startYear) {
                return true;
            }
        }
        return false;
    }

    private boolean idEquals(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null || str2 == null) {
            return false;
        }
        return str.equals(str2);
    }

    @Override // com.ibm.icu.util.TimeZone
    public int hashCode() {
        int iHashCode = super.hashCode();
        int i = this.raw;
        boolean z = this.useDaylight;
        int i2 = (iHashCode + i) ^ ((i >>> 8) + (!z ? 1 : 0));
        if (z) {
            return i2;
        }
        int i3 = this.dst;
        int i4 = this.startMode;
        int i5 = this.startMonth;
        int i6 = this.startDay;
        int i7 = this.startDayOfWeek;
        int i8 = this.startTime;
        int i9 = this.startTimeMode;
        int i10 = this.endMode;
        int i11 = this.endMonth;
        int i12 = this.endDay;
        int i13 = this.endDayOfWeek;
        int i14 = this.endTime;
        int i15 = this.endTimeMode;
        int i16 = this.startYear;
        return i2 + ((((((((((((((i3 ^ ((i3 >>> 10) + i4)) ^ ((i4 >>> 11) + i5)) ^ ((i5 >>> 12) + i6)) ^ ((i6 >>> 13) + i7)) ^ ((i7 >>> 14) + i8)) ^ ((i8 >>> 15) + i9)) ^ ((i9 >>> 16) + i10)) ^ ((i10 >>> 17) + i11)) ^ ((i11 >>> 18) + i12)) ^ ((i12 >>> 19) + i13)) ^ ((i13 >>> 20) + i14)) ^ ((i14 >>> 21) + i15)) ^ ((i15 >>> 22) + i16)) ^ (i16 >>> 23));
    }

    @Override // com.ibm.icu.util.TimeZone
    public Object clone() {
        return isFrozen() ? this : mo6319cloneAsThawed();
    }

    @Override // com.ibm.icu.util.TimeZone
    public boolean hasSameRules(TimeZone timeZone) {
        boolean z;
        if (this == timeZone) {
            return true;
        }
        if (!(timeZone instanceof SimpleTimeZone)) {
            return false;
        }
        SimpleTimeZone simpleTimeZone = (SimpleTimeZone) timeZone;
        if (simpleTimeZone != null && this.raw == simpleTimeZone.raw && (z = this.useDaylight) == simpleTimeZone.useDaylight) {
            if (!z) {
                return true;
            }
            if (this.dst == simpleTimeZone.dst && this.startMode == simpleTimeZone.startMode && this.startMonth == simpleTimeZone.startMonth && this.startDay == simpleTimeZone.startDay && this.startDayOfWeek == simpleTimeZone.startDayOfWeek && this.startTime == simpleTimeZone.startTime && this.startTimeMode == simpleTimeZone.startTimeMode && this.endMode == simpleTimeZone.endMode && this.endMonth == simpleTimeZone.endMonth && this.endDay == simpleTimeZone.endDay && this.endDayOfWeek == simpleTimeZone.endDayOfWeek && this.endTime == simpleTimeZone.endTime && this.endTimeMode == simpleTimeZone.endTimeMode && this.startYear == simpleTimeZone.startYear) {
                return true;
            }
        }
        return false;
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public C7261agW getNextTransition(long j, boolean z) {
        if (!this.useDaylight) {
            return null;
        }
        initTransitionRules();
        long jKWHzl = this.firstTransition.KWHzl();
        if (j < jKWHzl || (z && j == jKWHzl)) {
            return this.firstTransition;
        }
        Date nextStart = this.stdRule.getNextStart(j, this.dstRule.getRawOffset(), this.dstRule.getDSTSavings(), z);
        Date nextStart2 = this.dstRule.getNextStart(j, this.stdRule.getRawOffset(), this.stdRule.getDSTSavings(), z);
        if (nextStart != null && (nextStart2 == null || nextStart.before(nextStart2))) {
            return new C7261agW(nextStart.getTime(), this.dstRule, this.stdRule);
        }
        if (nextStart2 == null || !(nextStart == null || nextStart2.before(nextStart))) {
            return null;
        }
        return new C7261agW(nextStart2.getTime(), this.stdRule, this.dstRule);
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public C7261agW getPreviousTransition(long j, boolean z) {
        if (!this.useDaylight) {
            return null;
        }
        initTransitionRules();
        long jKWHzl = this.firstTransition.KWHzl();
        if (j >= jKWHzl && (z || j != jKWHzl)) {
            Date previousStart = this.stdRule.getPreviousStart(j, this.dstRule.getRawOffset(), this.dstRule.getDSTSavings(), z);
            Date previousStart2 = this.dstRule.getPreviousStart(j, this.stdRule.getRawOffset(), this.stdRule.getDSTSavings(), z);
            if (previousStart != null && (previousStart2 == null || previousStart.after(previousStart2))) {
                return new C7261agW(previousStart.getTime(), this.dstRule, this.stdRule);
            }
            if (previousStart2 != null && (previousStart == null || previousStart2.after(previousStart))) {
                return new C7261agW(previousStart2.getTime(), this.stdRule, this.dstRule);
            }
        }
        return null;
    }

    @Override // com.ibm.icu.util.BasicTimeZone
    public TimeZoneRule[] getTimeZoneRules() {
        initTransitionRules();
        boolean z = this.useDaylight;
        TimeZoneRule[] timeZoneRuleArr = new TimeZoneRule[z ? 3 : 1];
        timeZoneRuleArr[0] = this.initialRule;
        if (z) {
            timeZoneRuleArr[1] = this.stdRule;
            timeZoneRuleArr[2] = this.dstRule;
        }
        return timeZoneRuleArr;
    }

    private void initTransitionRules() {
        DateTimeRule dateTimeRule;
        DateTimeRule dateTimeRule2;
        synchronized (this) {
            if (this.transitionRulesInitialized) {
                return;
            }
            if (this.useDaylight) {
                int i = this.startTimeMode;
                int i2 = i == 1 ? 1 : i == 2 ? 2 : 0;
                int i3 = this.startMode;
                if (i3 == 1) {
                    dateTimeRule = new DateTimeRule(this.startMonth, this.startDay, this.startTime, i2);
                } else if (i3 != 2) {
                    if (i3 == 3) {
                        dateTimeRule2 = new DateTimeRule(this.startMonth, this.startDay, this.startDayOfWeek, true, this.startTime, i2);
                    } else if (i3 != 4) {
                        dateTimeRule = null;
                    } else {
                        dateTimeRule2 = new DateTimeRule(this.startMonth, this.startDay, this.startDayOfWeek, false, this.startTime, i2);
                    }
                    dateTimeRule = dateTimeRule2;
                } else {
                    dateTimeRule = new DateTimeRule(this.startMonth, this.startDay, this.startDayOfWeek, this.startTime, i2);
                }
                AnnualTimeZoneRule annualTimeZoneRule = new AnnualTimeZoneRule(getID() + "(DST)", getRawOffset(), getDSTSavings(), dateTimeRule, this.startYear, Integer.MAX_VALUE);
                this.dstRule = annualTimeZoneRule;
                long time = annualTimeZoneRule.getFirstStart(getRawOffset(), 0).getTime();
                int i4 = this.endTimeMode;
                int i5 = i4 == 1 ? 1 : i4 == 2 ? 2 : 0;
                int i6 = this.endMode;
                if (i6 == 1) {
                    dateTimeRule = new DateTimeRule(this.endMonth, this.endDay, this.endTime, i5);
                } else if (i6 == 2) {
                    dateTimeRule = new DateTimeRule(this.endMonth, this.endDay, this.endDayOfWeek, this.endTime, i5);
                } else if (i6 == 3) {
                    dateTimeRule = new DateTimeRule(this.endMonth, this.endDay, this.endDayOfWeek, true, this.endTime, i5);
                } else if (i6 == 4) {
                    dateTimeRule = new DateTimeRule(this.endMonth, this.endDay, this.endDayOfWeek, false, this.endTime, i5);
                }
                AnnualTimeZoneRule annualTimeZoneRule2 = new AnnualTimeZoneRule(getID() + "(STD)", getRawOffset(), 0, dateTimeRule, this.startYear, Integer.MAX_VALUE);
                this.stdRule = annualTimeZoneRule2;
                long time2 = annualTimeZoneRule2.getFirstStart(getRawOffset(), this.dstRule.getDSTSavings()).getTime();
                if (time2 < time) {
                    InitialTimeZoneRule initialTimeZoneRule = new InitialTimeZoneRule(getID() + "(DST)", getRawOffset(), this.dstRule.getDSTSavings());
                    this.initialRule = initialTimeZoneRule;
                    this.firstTransition = new C7261agW(time2, initialTimeZoneRule, this.stdRule);
                } else {
                    InitialTimeZoneRule initialTimeZoneRule2 = new InitialTimeZoneRule(getID() + "(STD)", getRawOffset(), 0);
                    this.initialRule = initialTimeZoneRule2;
                    this.firstTransition = new C7261agW(time, initialTimeZoneRule2, this.dstRule);
                }
            } else {
                this.initialRule = new InitialTimeZoneRule(getID(), getRawOffset(), 0);
            }
            this.transitionRulesInitialized = true;
        }
    }

    /* JADX DEBUG: Method merged with bridge method: cloneAsThawed()Ljava/lang/Object; */
    @Override // com.ibm.icu.util.TimeZone
    /* JADX INFO: renamed from: cloneAsThawed */
    public TimeZone mo6319cloneAsThawed() {
        SimpleTimeZone simpleTimeZone = (SimpleTimeZone) super.mo6319cloneAsThawed();
        simpleTimeZone.isFrozen = false;
        return simpleTimeZone;
    }
}

package com.ibm.icu.util;

import androidx.compose.material3.CalendarModelKt;
import com.flyco.tablayout.BuildConfig;
import com.ibm.icu.util.ULocale;
import java.util.Date;
import java.util.Locale;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public class GregorianCalendar extends Calendar {
    public static final int AD = 1;
    public static final int BC = 0;
    private static final int EPOCH_YEAR = 1970;
    private static final long serialVersionUID = 9199388694351062137L;
    private transient int cutoverJulianDay;
    private long gregorianCutover;
    private transient int gregorianCutoverYear;
    protected transient boolean invertGregorian;
    protected transient boolean isGregorian;
    private static final int[][] MONTH_COUNT = {new int[]{31, 31, 0, 0}, new int[]{28, 29, 31, 31}, new int[]{31, 31, 59, 60}, new int[]{30, 30, 90, 91}, new int[]{31, 31, 120, 121}, new int[]{30, 30, CipherSuite.TLS_DH_DSS_WITH_SEED_CBC_SHA, CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA}, new int[]{31, 31, CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA256}, new int[]{31, 31, BuildConfig.VERSION_CODE, 213}, new int[]{30, 30, 243, 244}, new int[]{31, 31, 273, 274}, new int[]{30, 30, 304, 305}, new int[]{31, 31, 334, 335}};
    private static final int[][] LIMITS = {new int[]{0, 0, 1, 1}, new int[]{1, 1, 5828963, 5838270}, new int[]{0, 0, 11, 11}, new int[]{1, 1, 52, 53}, new int[0], new int[]{1, 1, 28, 31}, new int[]{1, 1, 365, 366}, new int[0], new int[]{-1, -1, 4, 5}, new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[0], new int[]{-5838270, -5838270, 5828964, 5838271}, new int[0], new int[]{-5838269, -5838269, 5828963, 5838270}, new int[0], new int[0], new int[0]};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.Calendar
    public String getType() {
        return "gregorian";
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleGetLimit(int i, int i2) {
        return LIMITS[i][i2];
    }

    public GregorianCalendar() {
        this(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public GregorianCalendar(TimeZone timeZone) {
        this(timeZone, ULocale.getDefault(ULocale.Category.FORMAT));
    }

    public GregorianCalendar(Locale locale) {
        this(TimeZone.forLocaleOrDefault(locale), locale);
    }

    public GregorianCalendar(ULocale uLocale) {
        this(TimeZone.forULocaleOrDefault(uLocale), uLocale);
    }

    public GregorianCalendar(TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
        this.gregorianCutover = -12219292800000L;
        this.cutoverJulianDay = 2299161;
        this.gregorianCutoverYear = 1582;
        setTimeInMillis(System.currentTimeMillis());
    }

    public GregorianCalendar(TimeZone timeZone, ULocale uLocale) {
        super(timeZone, uLocale);
        this.gregorianCutover = -12219292800000L;
        this.cutoverJulianDay = 2299161;
        this.gregorianCutoverYear = 1582;
        setTimeInMillis(System.currentTimeMillis());
    }

    public GregorianCalendar(int i, int i2, int i3) {
        super(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
        this.gregorianCutover = -12219292800000L;
        this.cutoverJulianDay = 2299161;
        this.gregorianCutoverYear = 1582;
        set(0, 1);
        set(1, i);
        set(2, i2);
        set(5, i3);
    }

    public GregorianCalendar(int i, int i2, int i3, int i4, int i5) {
        super(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
        this.gregorianCutover = -12219292800000L;
        this.cutoverJulianDay = 2299161;
        this.gregorianCutoverYear = 1582;
        set(0, 1);
        set(1, i);
        set(2, i2);
        set(5, i3);
        set(11, i4);
        set(12, i5);
    }

    public GregorianCalendar(int i, int i2, int i3, int i4, int i5, int i6) {
        super(TimeZone.getDefault(), ULocale.getDefault(ULocale.Category.FORMAT));
        this.gregorianCutover = -12219292800000L;
        this.cutoverJulianDay = 2299161;
        this.gregorianCutoverYear = 1582;
        set(0, 1);
        set(1, i);
        set(2, i2);
        set(5, i3);
        set(11, i4);
        set(12, i5);
        set(13, i6);
    }

    public void setGregorianChange(Date date) {
        int i;
        long time = date.getTime();
        this.gregorianCutover = time;
        if (time <= -184303902528000000L) {
            i = Integer.MIN_VALUE;
        } else {
            if (time < 183882168921600000L) {
                this.cutoverJulianDay = (int) Calendar.floorDivide(time, CalendarModelKt.MillisecondsIn24Hours);
                GregorianCalendar gregorianCalendar = new GregorianCalendar(getTimeZone());
                gregorianCalendar.setTime(date);
                this.gregorianCutoverYear = gregorianCalendar.get(19);
                return;
            }
            i = Integer.MAX_VALUE;
        }
        this.cutoverJulianDay = i;
        this.gregorianCutoverYear = i;
    }

    public final Date getGregorianChange() {
        return new Date(this.gregorianCutover);
    }

    public boolean isLeapYear(int i) {
        return i < this.gregorianCutoverYear ? i % 4 == 0 : !(i % 4 != 0 || (i % 100 == 0 && i % 400 != 0));
    }

    @Override // com.ibm.icu.util.Calendar
    public boolean isEquivalentTo(Calendar calendar) {
        return super.isEquivalentTo(calendar) && this.gregorianCutover == ((GregorianCalendar) calendar).gregorianCutover;
    }

    @Override // com.ibm.icu.util.Calendar
    public int hashCode() {
        return super.hashCode() ^ ((int) this.gregorianCutover);
    }

    @Override // com.ibm.icu.util.Calendar
    public void roll(int i, int i2) {
        if (i == 3) {
            int i3 = get(3);
            int i4 = get(17);
            int iInternalGet = internalGet(6);
            if (internalGet(2) == 0) {
                if (i3 >= 52) {
                    iInternalGet += handleGetYearLength(i4);
                }
            } else if (i3 == 1) {
                iInternalGet -= handleGetYearLength(i4 - 1);
            }
            int i5 = i3 + i2;
            if (i5 < 1 || i5 > 52) {
                int iHandleGetYearLength = handleGetYearLength(i4);
                int iInternalGet2 = (((iHandleGetYearLength - iInternalGet) + internalGet(7)) - getFirstDayOfWeek()) % 7;
                if (iInternalGet2 < 0) {
                    iInternalGet2 += 7;
                }
                if (6 - iInternalGet2 >= getMinimalDaysInFirstWeek()) {
                    iHandleGetYearLength -= 7;
                }
                int iWeekNumber = weekNumber(iHandleGetYearLength, iInternalGet2 + 1);
                i5 = (((i5 + iWeekNumber) - 1) % iWeekNumber) + 1;
            }
            set(3, i5);
            set(1, i4);
            return;
        }
        super.roll(i, i2);
    }

    @Override // com.ibm.icu.util.Calendar
    public int getActualMinimum(int i) {
        return getMinimum(i);
    }

    @Override // com.ibm.icu.util.Calendar
    public int getActualMaximum(int i) {
        if (i == 1) {
            Calendar calendar = (Calendar) clone();
            calendar.setLenient(true);
            int i2 = calendar.get(0);
            Date time = calendar.getTime();
            int[] iArr = LIMITS[1];
            int i3 = iArr[1];
            int i4 = iArr[2] + 1;
            while (i3 + 1 < i4) {
                int i5 = (i3 + i4) / 2;
                calendar.set(1, i5);
                if (calendar.get(1) == i5 && calendar.get(0) == i2) {
                    i3 = i5;
                } else {
                    calendar.setTime(time);
                    i4 = i5;
                }
            }
            return i3;
        }
        return super.getActualMaximum(i);
    }

    public boolean inDaylightTime() {
        if (!getTimeZone().useDaylightTime()) {
            return false;
        }
        complete();
        return internalGet(16) != 0;
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleGetMonthLength(int i, int i2) {
        if (i2 < 0 || i2 > 11) {
            int[] iArr = new int[1];
            i += Calendar.floorDivide(i2, 12, iArr);
            i2 = iArr[0];
        }
        return MONTH_COUNT[i2][isLeapYear(i) ? 1 : 0];
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleGetYearLength(int i) {
        return isLeapYear(i) ? 366 : 365;
    }

    @Override // com.ibm.icu.util.Calendar
    public void handleComputeFields(int i) {
        int gregorianDayOfMonth;
        int gregorianYear;
        int gregorianDayOfYear;
        int gregorianMonth;
        int i2;
        if (i >= this.cutoverJulianDay) {
            gregorianMonth = getGregorianMonth();
            gregorianDayOfMonth = getGregorianDayOfMonth();
            gregorianDayOfYear = getGregorianDayOfYear();
            gregorianYear = getGregorianYear();
        } else {
            long j = i - 1721424;
            int iFloorDivide = (int) Calendar.floorDivide((j * 4) + 1464, 1461L);
            long j2 = ((long) iFloorDivide) - 1;
            int iFloorDivide2 = (int) (j - ((365 * j2) + Calendar.floorDivide(j2, 4L)));
            boolean z = (iFloorDivide & 3) == 0;
            int i3 = ((((iFloorDivide2 >= (z ? 60 : 59) ? z ? 1 : 2 : 0) + iFloorDivide2) * 12) + 6) / 367;
            gregorianDayOfMonth = (iFloorDivide2 - MONTH_COUNT[i3][z ? (char) 3 : (char) 2]) + 1;
            gregorianYear = iFloorDivide;
            gregorianDayOfYear = iFloorDivide2 + 1;
            gregorianMonth = i3;
        }
        internalSet(2, gregorianMonth);
        internalSet(5, gregorianDayOfMonth);
        internalSet(6, gregorianDayOfYear);
        internalSet(19, gregorianYear);
        if (gregorianYear < 1) {
            gregorianYear = 1 - gregorianYear;
            i2 = 0;
        } else {
            i2 = 1;
        }
        internalSet(0, i2);
        internalSet(1, gregorianYear);
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleGetExtendedYear() {
        if (newerField(19, 1) == 19) {
            return internalGet(19, EPOCH_YEAR);
        }
        if (internalGet(0, 1) == 0) {
            return 1 - internalGet(1, 1);
        }
        return internalGet(1, EPOCH_YEAR);
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleComputeJulianDay(int i) {
        this.invertGregorian = false;
        int iHandleComputeJulianDay = super.handleComputeJulianDay(i);
        if (this.isGregorian == (iHandleComputeJulianDay >= this.cutoverJulianDay)) {
            return iHandleComputeJulianDay;
        }
        this.invertGregorian = true;
        return super.handleComputeJulianDay(i);
    }

    @Override // com.ibm.icu.util.Calendar
    public int handleComputeMonthStart(int i, int i2, boolean z) {
        boolean z2 = true;
        if (i2 < 0 || i2 > 11) {
            int[] iArr = new int[1];
            i += Calendar.floorDivide(i2, 12, iArr);
            i2 = iArr[0];
        }
        boolean z3 = i % 4 == 0;
        int i3 = i - 1;
        int iFloorDivide = (i3 * 365) + Calendar.floorDivide(i3, 4) + 1721423;
        boolean z4 = i >= this.gregorianCutoverYear;
        this.isGregorian = z4;
        if (this.invertGregorian) {
            this.isGregorian = !z4;
        }
        if (this.isGregorian) {
            if (!z3 || (i % 100 == 0 && i % 400 != 0)) {
                z2 = false;
            }
            iFloorDivide += (Calendar.floorDivide(i3, 400) - Calendar.floorDivide(i3, 100)) + 2;
            z3 = z2;
        }
        if (i2 != 0) {
            return iFloorDivide + MONTH_COUNT[i2][z3 ? (char) 3 : (char) 2];
        }
        return iFloorDivide;
    }
}

package com.ibm.icu.util;

import com.ibm.icu.impl.CalType;
import java.util.Date;
import java.util.Locale;
import o.C7022abW;

/* JADX INFO: loaded from: classes3.dex */
public class JapaneseCalendar extends GregorianCalendar {
    public static final int CURRENT_ERA;
    private static final C7022abW ERA_RULES;
    private static final int GREGORIAN_EPOCH = 1970;
    public static final int HEISEI;
    public static final int MEIJI;
    public static final int REIWA;
    public static final int SHOWA;
    public static final int TAISHO;
    private static final long serialVersionUID = -2977189902603704691L;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.ibm.icu.util.GregorianCalendar, com.ibm.icu.util.Calendar
    public String getType() {
        return "japanese";
    }

    @Override // com.ibm.icu.util.Calendar
    @Deprecated
    public boolean haveDefaultCentury() {
        return false;
    }

    public JapaneseCalendar() {
    }

    public JapaneseCalendar(TimeZone timeZone) {
        super(timeZone);
    }

    public JapaneseCalendar(Locale locale) {
        super(locale);
    }

    public JapaneseCalendar(ULocale uLocale) {
        super(uLocale);
    }

    public JapaneseCalendar(TimeZone timeZone, Locale locale) {
        super(timeZone, locale);
    }

    public JapaneseCalendar(TimeZone timeZone, ULocale uLocale) {
        super(timeZone, uLocale);
    }

    public JapaneseCalendar(Date date) {
        this();
        setTime(date);
    }

    public JapaneseCalendar(int i, int i2, int i3, int i4) {
        super(i2, i3, i4);
        set(0, i);
    }

    public JapaneseCalendar(int i, int i2, int i3) {
        super(i, i2, i3);
        set(0, CURRENT_ERA);
    }

    public JapaneseCalendar(int i, int i2, int i3, int i4, int i5, int i6) {
        super(i, i2, i3, i4, i5, i6);
        set(0, CURRENT_ERA);
    }

    static {
        C7022abW c7022abWEZpvd = C7022abW.EZpvd(CalType.JAPANESE, enableTentativeEra());
        ERA_RULES = c7022abWEZpvd;
        MEIJI = 232;
        TAISHO = 233;
        SHOWA = 234;
        HEISEI = 235;
        REIWA = 236;
        CURRENT_ERA = c7022abWEZpvd.OLrzqt();
    }

    @Deprecated
    public static boolean enableTentativeEra() {
        String property = System.getProperty("ICU_ENABLE_TENTATIVE_ERA");
        if (property == null) {
            property = System.getenv("ICU_ENABLE_TENTATIVE_ERA");
        }
        if (property != null) {
            return property.equalsIgnoreCase("true");
        }
        return System.getProperty("jdk.calendar.japanese.supplemental.era") != null;
    }

    @Override // com.ibm.icu.util.GregorianCalendar, com.ibm.icu.util.Calendar
    public int handleGetExtendedYear() {
        if (newerField(19, 1) == 19 && newerField(19, 0) == 19) {
            return internalGet(19, GREGORIAN_EPOCH);
        }
        return (internalGet(1, 1) + ERA_RULES.OLrzqt(internalGet(0, CURRENT_ERA))) - 1;
    }

    @Override // com.ibm.icu.util.Calendar
    public int getDefaultMonthInYear(int i) {
        int[] iArrCopydefault = ERA_RULES.copydefault(internalGet(0, CURRENT_ERA), null);
        if (i == iArrCopydefault[0]) {
            return iArrCopydefault[1] - 1;
        }
        return super.getDefaultMonthInYear(i);
    }

    @Override // com.ibm.icu.util.Calendar
    public int getDefaultDayInMonth(int i, int i2) {
        int[] iArrCopydefault = ERA_RULES.copydefault(internalGet(0, CURRENT_ERA), null);
        if (i == iArrCopydefault[0] && i2 == iArrCopydefault[1] - 1) {
            return iArrCopydefault[2];
        }
        return super.getDefaultDayInMonth(i, i2);
    }

    @Override // com.ibm.icu.util.GregorianCalendar, com.ibm.icu.util.Calendar
    public void handleComputeFields(int i) {
        super.handleComputeFields(i);
        int iInternalGet = internalGet(19);
        C7022abW c7022abW = ERA_RULES;
        int iAEQbTJ = c7022abW.AEQbTJ(iInternalGet, internalGet(2) + 1, internalGet(5));
        internalSet(0, iAEQbTJ);
        internalSet(1, (iInternalGet - c7022abW.OLrzqt(iAEQbTJ)) + 1);
    }

    @Override // com.ibm.icu.util.GregorianCalendar, com.ibm.icu.util.Calendar
    public int handleGetLimit(int i, int i2) {
        if (i == 0) {
            if (i2 == 0 || i2 == 1) {
                return 0;
            }
            return ERA_RULES.copydefault() - 1;
        }
        if (i == 1) {
            if (i2 == 0 || i2 == 1 || i2 == 2) {
                return 1;
            }
            if (i2 == 3) {
                return super.handleGetLimit(i, 3) - ERA_RULES.OLrzqt(CURRENT_ERA);
            }
        }
        return super.handleGetLimit(i, i2);
    }

    @Override // com.ibm.icu.util.GregorianCalendar, com.ibm.icu.util.Calendar
    public int getActualMaximum(int i) {
        if (i == 1) {
            int i2 = get(0);
            C7022abW c7022abW = ERA_RULES;
            if (i2 == c7022abW.copydefault() - 1) {
                return handleGetLimit(1, 3);
            }
            int[] iArrCopydefault = c7022abW.copydefault(i2 + 1, null);
            int i3 = iArrCopydefault[0];
            int i4 = iArrCopydefault[1];
            int i5 = iArrCopydefault[2];
            int iOLrzqt = i3 - c7022abW.OLrzqt(i2);
            return (i4 == 1 && i5 == 1) ? iOLrzqt : iOLrzqt + 1;
        }
        return super.getActualMaximum(i);
    }
}

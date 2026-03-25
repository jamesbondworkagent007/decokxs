package com.ibm.icu.text;

import com.engagelab.privates.push.constants.MTPushConstants;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import java.io.InvalidObjectException;
import java.lang.reflect.Array;
import java.text.Format;
import java.util.EnumMap;
import o.AbstractC7013abN;
import o.AbstractC7078acz;
import o.C7028acB;
import o.C7043acQ;

/* JADX INFO: loaded from: classes22.dex */
public final class RelativeDateTimeFormatter {
    public static final Style[] copydefault = new Style[3];
    public static final Activity EZpvd = new Activity(null);

    public enum AbsoluteUnit {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        DAY,
        WEEK,
        MONTH,
        YEAR,
        NOW,
        QUARTER,
        HOUR,
        MINUTE
    }

    public enum Direction {
        LAST_2,
        LAST,
        THIS,
        NEXT,
        NEXT_2,
        PLAIN
    }

    public enum RelativeDateTimeUnit {
        YEAR,
        QUARTER,
        MONTH,
        WEEK,
        DAY,
        HOUR,
        MINUTE,
        SECOND,
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public enum RelativeUnit {
        SECONDS,
        MINUTES,
        HOURS,
        DAYS,
        WEEKS,
        MONTHS,
        YEARS,
        QUARTERS
    }

    public enum Style {
        LONG,
        SHORT,
        NARROW;

        private static final int INDEX_COUNT = 3;
    }

    public static class Field extends Format.Field {
        public static final Field LITERAL = new Field("literal");
        public static final Field NUMERIC = new Field("numeric");
        private static final long serialVersionUID = -5327685528663492325L;

        private Field(String str) {
            super(str);
        }

        @Override // java.text.AttributedCharacterIterator.Attribute
        public Object readResolve() throws InvalidObjectException {
            String name = getName();
            Field field = LITERAL;
            if (name.equals(field.getName())) {
                return field;
            }
            String name2 = getName();
            Field field2 = NUMERIC;
            if (name2.equals(field2.getName())) {
                return field2;
            }
            throw new InvalidObjectException("An invalid object.");
        }
    }

    public static class StateListAnimator {
        public EnumMap<Style, EnumMap<RelativeUnit, String[][]>> EZpvd;
        public final EnumMap<Style, EnumMap<AbsoluteUnit, EnumMap<Direction, String>>> OLrzqt;
        public final String copydefault;

        public StateListAnimator(EnumMap<Style, EnumMap<AbsoluteUnit, EnumMap<Direction, String>>> enumMap, EnumMap<Style, EnumMap<RelativeUnit, String[][]>> enumMap2, String str) {
            this.OLrzqt = enumMap;
            this.EZpvd = enumMap2;
            this.copydefault = str;
        }
    }

    public static class Activity {
        public final AbstractC7013abN<String, StateListAnimator, ULocale> copydefault;

        private Activity() {
            this.copydefault = new AbstractC7078acz<String, StateListAnimator, ULocale>() { // from class: com.ibm.icu.text.RelativeDateTimeFormatter.Activity.4
                /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
                @Override // o.AbstractC7013abN
                public StateListAnimator copydefault(String str, ULocale uLocale) {
                    return new Application(uLocale).AEQbTJ();
                }
            };
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1149) call: com.ibm.icu.text.RelativeDateTimeFormatter.Activity.<init>():void type: THIS */
        public /* synthetic */ Activity(AnonymousClass2 anonymousClass2) {
            this();
        }
    }

    public static Direction KWHzl(C7043acQ.Application application) {
        if (application.copydefault("-2")) {
            return Direction.LAST_2;
        }
        if (application.copydefault(MultiTransferSignData.DEFAULT_INTERVAL)) {
            return Direction.LAST;
        }
        if (application.copydefault("0")) {
            return Direction.THIS;
        }
        if (application.copydefault("1")) {
            return Direction.NEXT;
        }
        if (application.copydefault("2")) {
            return Direction.NEXT_2;
        }
        return null;
    }

    public static final class RelDateTimeDataSink extends C7043acQ.ActionBar {
        public Style OLrzqt;
        public int copydefault;
        public DateTimeUnit gEmmrt;
        public EnumMap<Style, EnumMap<AbsoluteUnit, EnumMap<Direction, String>>> KWHzl = new EnumMap<>(Style.class);
        public EnumMap<Style, EnumMap<RelativeUnit, String[][]>> EZpvd = new EnumMap<>(Style.class);
        public StringBuilder AEQbTJ = new StringBuilder();

        public enum DateTimeUnit {
            SECOND(RelativeUnit.SECONDS, null),
            MINUTE(RelativeUnit.MINUTES, AbsoluteUnit.MINUTE),
            HOUR(RelativeUnit.HOURS, AbsoluteUnit.HOUR),
            DAY(RelativeUnit.DAYS, AbsoluteUnit.DAY),
            WEEK(RelativeUnit.WEEKS, AbsoluteUnit.WEEK),
            MONTH(RelativeUnit.MONTHS, AbsoluteUnit.MONTH),
            QUARTER(RelativeUnit.QUARTERS, AbsoluteUnit.QUARTER),
            YEAR(RelativeUnit.YEARS, AbsoluteUnit.YEAR),
            SUNDAY(null, AbsoluteUnit.SUNDAY),
            MONDAY(null, AbsoluteUnit.MONDAY),
            TUESDAY(null, AbsoluteUnit.TUESDAY),
            WEDNESDAY(null, AbsoluteUnit.WEDNESDAY),
            THURSDAY(null, AbsoluteUnit.THURSDAY),
            FRIDAY(null, AbsoluteUnit.FRIDAY),
            SATURDAY(null, AbsoluteUnit.SATURDAY);

            AbsoluteUnit absUnit;
            RelativeUnit relUnit;

            DateTimeUnit(RelativeUnit relativeUnit, AbsoluteUnit absoluteUnit) {
                this.relUnit = relativeUnit;
                this.absUnit = absoluteUnit;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final DateTimeUnit orNullFromString(CharSequence charSequence) {
                int length = charSequence.length();
                if (length == 3) {
                    if (MTPushConstants.NotificationTime.KEY_DAYS.contentEquals(charSequence)) {
                        return DAY;
                    }
                    if ("sun".contentEquals(charSequence)) {
                        return SUNDAY;
                    }
                    if ("mon".contentEquals(charSequence)) {
                        return MONDAY;
                    }
                    if ("tue".contentEquals(charSequence)) {
                        return TUESDAY;
                    }
                    if ("wed".contentEquals(charSequence)) {
                        return WEDNESDAY;
                    }
                    if ("thu".contentEquals(charSequence)) {
                        return THURSDAY;
                    }
                    if ("fri".contentEquals(charSequence)) {
                        return FRIDAY;
                    }
                    if ("sat".contentEquals(charSequence)) {
                        return SATURDAY;
                    }
                    return null;
                }
                if (length == 4) {
                    if ("hour".contentEquals(charSequence)) {
                        return HOUR;
                    }
                    if ("week".contentEquals(charSequence)) {
                        return WEEK;
                    }
                    if ("year".contentEquals(charSequence)) {
                        return YEAR;
                    }
                    return null;
                }
                if (length == 5) {
                    if ("month".contentEquals(charSequence)) {
                        return MONTH;
                    }
                    return null;
                }
                if (length == 6) {
                    if ("minute".contentEquals(charSequence)) {
                        return MINUTE;
                    }
                    if ("second".contentEquals(charSequence)) {
                        return SECOND;
                    }
                    return null;
                }
                if (length == 7 && "quarter".contentEquals(charSequence)) {
                    return QUARTER;
                }
                return null;
            }
        }

        public final Style copydefault(C7043acQ.Application application) {
            if (application.KWHzl("-short")) {
                return Style.SHORT;
            }
            if (application.KWHzl("-narrow")) {
                return Style.NARROW;
            }
            return Style.LONG;
        }

        public final Style EZpvd(C7043acQ.TaskDescription taskDescription) {
            String strAEQbTJ = taskDescription.AEQbTJ();
            if (strAEQbTJ.endsWith("-short")) {
                return Style.SHORT;
            }
            if (strAEQbTJ.endsWith("-narrow")) {
                return Style.NARROW;
            }
            return Style.LONG;
        }

        public static int OLrzqt(Style style) {
            int i = AnonymousClass2.KWHzl[style.ordinal()];
            if (i != 1) {
                return i != 2 ? 0 : 7;
            }
            return 6;
        }

        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            AbsoluteUnit absoluteUnit;
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (taskDescription.AhwBna() == 0) {
                    String strDjBIcL = taskDescription.djBIcL();
                    EnumMap<AbsoluteUnit, EnumMap<Direction, String>> enumMap = this.KWHzl.get(this.OLrzqt);
                    if (this.gEmmrt.relUnit != RelativeUnit.SECONDS || !application.copydefault("0")) {
                        Direction directionKWHzl = RelativeDateTimeFormatter.KWHzl(application);
                        if (directionKWHzl != null && (absoluteUnit = this.gEmmrt.absUnit) != null) {
                            if (enumMap == null) {
                                enumMap = new EnumMap<>(AbsoluteUnit.class);
                                this.KWHzl.put(this.OLrzqt, enumMap);
                            }
                            EnumMap<Direction, String> enumMap2 = enumMap.get(absoluteUnit);
                            if (enumMap2 == null) {
                                enumMap2 = new EnumMap<>(Direction.class);
                                enumMap.put(absoluteUnit, enumMap2);
                            }
                            if (enumMap2.get(directionKWHzl) == null) {
                                enumMap2.put(directionKWHzl, taskDescription.djBIcL());
                            }
                        }
                    } else {
                        AbsoluteUnit absoluteUnit2 = AbsoluteUnit.NOW;
                        EnumMap<Direction, String> enumMap3 = enumMap.get(absoluteUnit2);
                        if (enumMap3 == null) {
                            enumMap3 = new EnumMap<>(Direction.class);
                            enumMap.put(absoluteUnit2, enumMap3);
                        }
                        Direction direction = Direction.PLAIN;
                        if (enumMap3.get(direction) == null) {
                            enumMap3.put(direction, strDjBIcL);
                        }
                    }
                }
            }
        }

        public void AEQbTJ(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            if (this.gEmmrt.relUnit == null) {
                return;
            }
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (application.copydefault("past")) {
                    this.copydefault = 0;
                } else if (application.copydefault("future")) {
                    this.copydefault = 1;
                }
                EZpvd(application, taskDescription);
            }
        }

        public void EZpvd(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            EnumMap<RelativeUnit, String[][]> enumMap = this.EZpvd.get(this.OLrzqt);
            if (enumMap == null) {
                enumMap = new EnumMap<>(RelativeUnit.class);
                this.EZpvd.put(this.OLrzqt, enumMap);
            }
            String[][] strArr = enumMap.get(this.gEmmrt.relUnit);
            if (strArr == null) {
                strArr = (String[][]) Array.newInstance((Class<?>) String.class, 2, StandardPlural.COUNT);
                enumMap.put(this.gEmmrt.relUnit, strArr);
            }
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (taskDescription.AhwBna() == 0) {
                    int iIndexFromString = StandardPlural.indexFromString(application.toString());
                    String[] strArr2 = strArr[this.copydefault];
                    if (strArr2[iIndexFromString] == null) {
                        strArr2[iIndexFromString] = C7028acB.OLrzqt(taskDescription.djBIcL(), this.AEQbTJ, 0, 1);
                    }
                }
            }
        }

        public final void OLrzqt(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            AbsoluteUnit absoluteUnit = this.gEmmrt.absUnit;
            if (absoluteUnit == null) {
                return;
            }
            EnumMap<AbsoluteUnit, EnumMap<Direction, String>> enumMap = this.KWHzl.get(this.OLrzqt);
            if (enumMap == null) {
                enumMap = new EnumMap<>(AbsoluteUnit.class);
                this.KWHzl.put(this.OLrzqt, enumMap);
            }
            EnumMap<Direction, String> enumMap2 = enumMap.get(absoluteUnit);
            if (enumMap2 == null) {
                enumMap2 = new EnumMap<>(Direction.class);
                enumMap.put(absoluteUnit, enumMap2);
            }
            Direction direction = Direction.PLAIN;
            if (enumMap2.get(direction) == null) {
                enumMap2.put(direction, taskDescription.toString());
            }
        }

        public void KWHzl(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (application.copydefault("dn") && taskDescription.AhwBna() == 0) {
                    OLrzqt(application, taskDescription);
                }
                if (taskDescription.AhwBna() == 2) {
                    if (application.copydefault("relative")) {
                        copydefault(application, taskDescription);
                    } else if (application.copydefault("relativeTime")) {
                        AEQbTJ(application, taskDescription);
                    }
                }
            }
        }

        public final void AEQbTJ(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            Style styleCopydefault = copydefault(application);
            if (DateTimeUnit.orNullFromString(application.OLrzqt(0, application.length() - OLrzqt(styleCopydefault))) != null) {
                Style styleEZpvd = EZpvd(taskDescription);
                if (styleCopydefault == styleEZpvd) {
                    throw new ICUException("Invalid style fallback from " + styleCopydefault + " to itself");
                }
                if (RelativeDateTimeFormatter.copydefault[styleCopydefault.ordinal()] == null) {
                    RelativeDateTimeFormatter.copydefault[styleCopydefault.ordinal()] = styleEZpvd;
                    return;
                }
                if (RelativeDateTimeFormatter.copydefault[styleCopydefault.ordinal()] == styleEZpvd) {
                    return;
                }
                throw new ICUException("Inconsistent style fallback for style " + styleCopydefault + " to " + styleEZpvd);
            }
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            if (taskDescription.AhwBna() == 3) {
                return;
            }
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                if (taskDescription.AhwBna() == 3) {
                    AEQbTJ(application, taskDescription, z);
                } else {
                    this.OLrzqt = copydefault(application);
                    DateTimeUnit dateTimeUnitOrNullFromString = DateTimeUnit.orNullFromString(application.OLrzqt(0, application.length() - OLrzqt(this.OLrzqt)));
                    this.gEmmrt = dateTimeUnitOrNullFromString;
                    if (dateTimeUnitOrNullFromString != null) {
                        KWHzl(application, taskDescription);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.text.RelativeDateTimeFormatter$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] KWHzl;

        static {
            int[] iArr = new int[Style.values().length];
            KWHzl = iArr;
            try {
                iArr[Style.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                KWHzl[Style.NARROW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[RelativeDateTimeUnit.values().length];
            AEQbTJ = iArr2;
            try {
                iArr2[RelativeDateTimeUnit.YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.QUARTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.WEEK.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.DAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.HOUR.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.MINUTE.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.SECOND.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.SUNDAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.MONDAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.TUESDAY.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.WEDNESDAY.ordinal()] = 12;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.THURSDAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.FRIDAY.ordinal()] = 14;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                AEQbTJ[RelativeDateTimeUnit.SATURDAY.ordinal()] = 15;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static class Application {
        public final ULocale copydefault;

        public Application(ULocale uLocale) {
            this.copydefault = uLocale;
        }

        public final String copydefault(ICUResourceBundle iCUResourceBundle) {
            String strDjBIcL = iCUResourceBundle.djBIcL("calendar/default");
            if (strDjBIcL == null || strDjBIcL.equals("")) {
                strDjBIcL = "gregorian";
            }
            ICUResourceBundle iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt("calendar/" + strDjBIcL + "/DateTimePatterns");
            if (iCUResourceBundleGEmmrt == null && strDjBIcL.equals("gregorian")) {
                iCUResourceBundleGEmmrt = iCUResourceBundle.gEmmrt("calendar/gregorian/DateTimePatterns");
            }
            if (iCUResourceBundleGEmmrt == null || iCUResourceBundleGEmmrt.fARcdN() < 9) {
                return "{1} {0}";
            }
            if (iCUResourceBundleGEmmrt.KWHzl(8).AuCTel() == 8) {
                return iCUResourceBundleGEmmrt.KWHzl(8).copydefault(0);
            }
            return iCUResourceBundleGEmmrt.copydefault(8);
        }

        public StateListAnimator AEQbTJ() {
            Style style;
            RelDateTimeDataSink relDateTimeDataSink = new RelDateTimeDataSink();
            ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b", this.copydefault);
            iCUResourceBundle.copydefault("fields", relDateTimeDataSink);
            for (Style style2 : Style.values()) {
                Style style3 = RelativeDateTimeFormatter.copydefault[style2.ordinal()];
                if (style3 != null && (style = RelativeDateTimeFormatter.copydefault[style3.ordinal()]) != null && RelativeDateTimeFormatter.copydefault[style.ordinal()] != null) {
                    throw new IllegalStateException("Style fallback too deep");
                }
            }
            return new StateListAnimator(relDateTimeDataSink.KWHzl, relDateTimeDataSink.EZpvd, copydefault(iCUResourceBundle));
        }
    }
}

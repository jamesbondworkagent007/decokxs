package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59464zhY extends C59465zhZ {

    /* JADX INFO: renamed from: o.zhY$ActionBar */
    /* JADX INFO: loaded from: classes17.dex */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.NANOSECONDS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.MICROSECONDS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.MILLISECONDS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.SECONDS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.MINUTES.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.HOURS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.DAYS.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            KWHzl = iArr;
        }
    }

    public static final java.lang.String copydefault(@NotNull DurationUnit durationUnit) {
        Intrinsics.checkNotNullParameter(durationUnit, "");
        switch (ActionBar.KWHzl[durationUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return com.ibm.icu.text.DateFormat.MINUTE_SECOND;
            case 4:
                return com.ibm.icu.text.DateFormat.SECOND;
            case 5:
                return com.ibm.icu.text.DateFormat.MINUTE;
            case 6:
                return "h";
            case 7:
                return com.ibm.icu.text.DateFormat.DAY;
            default:
                throw new java.lang.IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [77=7] */
    public static final DurationUnit EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && str.equals("us")) {
                                    return DurationUnit.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return DurationUnit.NANOSECONDS;
                            }
                        } else if (str.equals(com.ibm.icu.text.DateFormat.MINUTE_SECOND)) {
                            return DurationUnit.MILLISECONDS;
                        }
                    } else if (str.equals(com.ibm.icu.text.DateFormat.SECOND)) {
                        return DurationUnit.SECONDS;
                    }
                } else if (str.equals(com.ibm.icu.text.DateFormat.MINUTE)) {
                    return DurationUnit.MINUTES;
                }
            } else if (str.equals("h")) {
                return DurationUnit.HOURS;
            }
        } else if (str.equals(com.ibm.icu.text.DateFormat.DAY)) {
            return DurationUnit.DAYS;
        }
        throw new java.lang.IllegalArgumentException("Unknown duration unit short name: " + str);
    }

    public static final DurationUnit OLrzqt(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return DurationUnit.DAYS;
            }
            throw new java.lang.IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        }
        if (c == 'H') {
            return DurationUnit.HOURS;
        }
        if (c == 'M') {
            return DurationUnit.MINUTES;
        }
        if (c == 'S') {
            return DurationUnit.SECONDS;
        }
        throw new java.lang.IllegalArgumentException("Invalid duration ISO time unit: " + c);
    }
}

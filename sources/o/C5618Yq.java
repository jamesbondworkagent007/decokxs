package o;

import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.Yq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@java.lang.Deprecated
public class C5618Yq {
    public static final TimeZone AEQbTJ = yCN.OLrzqt("UTC");

    public static java.lang.String AEQbTJ(Date date) {
        return EZpvd(date, false, AEQbTJ);
    }

    @java.lang.Deprecated
    public static java.lang.String EZpvd(Date date, boolean z, TimeZone timeZone) {
        return KWHzl(date, z, timeZone, java.util.Locale.US);
    }

    public static java.lang.String KWHzl(Date date, boolean z, TimeZone timeZone, java.util.Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append(java.lang.String.format("%04d-%02d-%02dT%02d:%02d:%02d", java.lang.Integer.valueOf(gregorianCalendar.get(1)), java.lang.Integer.valueOf(gregorianCalendar.get(2) + 1), java.lang.Integer.valueOf(gregorianCalendar.get(5)), java.lang.Integer.valueOf(gregorianCalendar.get(11)), java.lang.Integer.valueOf(gregorianCalendar.get(12)), java.lang.Integer.valueOf(gregorianCalendar.get(13))));
        if (z) {
            sb.append(java.lang.String.format(".%03d", java.lang.Integer.valueOf(gregorianCalendar.get(14))));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / 60000;
            int iAbs = java.lang.Math.abs(i / 60);
            int iAbs2 = java.lang.Math.abs(i % 60);
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Character.valueOf(offset < 0 ? '-' : '+');
            objArr[1] = java.lang.Integer.valueOf(iAbs);
            objArr[2] = java.lang.Integer.valueOf(iAbs2);
            sb.append(java.lang.String.format("%c%02d:%02d", objArr));
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    public static Date OLrzqt(java.lang.String str, ParsePosition parsePosition) throws java.text.ParseException {
        int i;
        int i2;
        int iOLrzqt;
        int iOLrzqt2;
        int length;
        TimeZone timeZone;
        char cCharAt;
        Objects.requireNonNull(str);
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iOLrzqt3 = OLrzqt(str, index, i3);
            if (EZpvd(str, i3, '-')) {
                i3 = index + 5;
            }
            int i4 = i3 + 2;
            int iOLrzqt4 = OLrzqt(str, i3, i4);
            if (EZpvd(str, i4, '-')) {
                i4 = i3 + 3;
            }
            int i5 = i4 + 2;
            int iOLrzqt5 = OLrzqt(str, i4, i5);
            boolean zEZpvd = EZpvd(str, i5, 'T');
            if (!zEZpvd && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iOLrzqt3, iOLrzqt4 - 1, iOLrzqt5);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zEZpvd) {
                int i6 = i4 + 5;
                iOLrzqt = OLrzqt(str, i4 + 3, i6);
                if (EZpvd(str, i6, AbstractJsonLexerKt.COLON)) {
                    i6 = i4 + 6;
                }
                int i7 = i6 + 2;
                int iOLrzqt6 = OLrzqt(str, i6, i7);
                i5 = EZpvd(str, i7, AbstractJsonLexerKt.COLON) ? i6 + 3 : i7;
                if (str.length() <= i5 || (cCharAt = str.charAt(i5)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i2 = 0;
                    iOLrzqt2 = 0;
                } else {
                    int i8 = i5 + 2;
                    iOLrzqt2 = OLrzqt(str, i5, i8);
                    if (iOLrzqt2 > 59 && iOLrzqt2 < 63) {
                        iOLrzqt2 = 59;
                    }
                    if (EZpvd(str, i8, '.')) {
                        int i9 = i5 + 3;
                        int iKWHzl = KWHzl(str, i5 + 4);
                        int iMin = java.lang.Math.min(iKWHzl, i5 + 6);
                        int iOLrzqt7 = OLrzqt(str, i9, iMin);
                        int i10 = iMin - i9;
                        if (i10 == 1) {
                            iOLrzqt7 *= 100;
                        } else if (i10 == 2) {
                            iOLrzqt7 *= 10;
                        }
                        i5 = iKWHzl;
                        i = iOLrzqt6;
                        i2 = iOLrzqt7;
                    } else {
                        i5 = i8;
                        i2 = 0;
                    }
                }
                i = iOLrzqt6;
            } else {
                i = 0;
                i2 = 0;
                iOLrzqt = 0;
                iOLrzqt2 = 0;
            }
            if (str.length() <= i5) {
                throw new java.lang.IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 == 'Z') {
                timeZone = AEQbTJ;
                length = i5 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new java.lang.IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                java.lang.String strSubstring = str.substring(i5);
                length = i5 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = AEQbTJ;
                } else {
                    java.lang.String str2 = "GMT" + strSubstring;
                    TimeZone timeZoneOLrzqt = yCN.OLrzqt(str2);
                    java.lang.String id = timeZoneOLrzqt.getID();
                    if (!id.equals(str2) && !id.replace(":", "").equals(str2)) {
                        throw new java.lang.IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZoneOLrzqt.getID());
                    }
                    timeZone = timeZoneOLrzqt;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iOLrzqt3);
            gregorianCalendar2.set(2, iOLrzqt4 - 1);
            gregorianCalendar2.set(5, iOLrzqt5);
            gregorianCalendar2.set(11, iOLrzqt);
            gregorianCalendar2.set(12, i);
            gregorianCalendar2.set(13, iOLrzqt2);
            gregorianCalendar2.set(14, i2);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (java.lang.Exception e) {
            java.lang.String str3 = '\"' + str + '\"';
            java.lang.String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            java.text.ParseException parseException = new java.text.ParseException("Failed to parse date " + str3 + ": " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static boolean EZpvd(java.lang.String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    public static int OLrzqt(java.lang.String str, int i, int i2) throws java.lang.NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new java.lang.NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = java.lang.Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int iDigit2 = java.lang.Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                throw new java.lang.NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - iDigit2;
            i4++;
        }
        return -i3;
    }

    public static int KWHzl(java.lang.String str, int i) {
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}

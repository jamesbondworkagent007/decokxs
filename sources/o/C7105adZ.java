package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.UnicodeSet;
import okio.Utf8;

/* JADX INFO: renamed from: o.adZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7105adZ {

    /* JADX INFO: renamed from: o.adZ$Activity */
    public interface Activity {
        void OLrzqt(int i);
    }

    /* JADX INFO: renamed from: o.adZ$TaskDescription */
    public interface TaskDescription {
        java.lang.CharSequence copydefault(int i);
    }

    public static int AEQbTJ(long j) {
        return (int) j;
    }

    public static long AEQbTJ(int i, int i2, int i3, int i4) {
        return ((-i2) << 32) | ((long) i) | (((long) i3) << 36) | (((long) i4) << 40);
    }

    public static int EZpvd(long j) {
        return (int) ((j >>> 36) & 15);
    }

    public static int KWHzl(long j) {
        return (int) (j >>> 40);
    }

    public static int OLrzqt(long j) {
        return (int) ((j >>> 32) & 15);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0036 A[PHI: r6
  0x0036: PHI (r6v1 char) = (r6v0 char), (r6v2 char) binds: [B:23:0x0034, B:18:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int copydefault(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        int iCharCount = 0;
        char c = 0;
        int i = 0;
        while (true) {
            char c2 = 1;
            if (iCharCount >= charSequence.length()) {
                if (c != 1 && c != 2) {
                    return i;
                }
                throw new java.lang.IllegalArgumentException("Unterminated quote: \"" + ((java.lang.Object) charSequence) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            }
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, iCharCount);
            if (c != 0) {
                if (c != 1) {
                    c2 = 3;
                    if (c != 2) {
                        if (c != 3) {
                            throw new java.lang.AssertionError();
                        }
                        if (iCodePointAt == 39) {
                        }
                    } else if (iCodePointAt == 39) {
                        c = c2;
                    }
                    i++;
                } else if (iCodePointAt == 39) {
                    i++;
                    c = 0;
                }
                i++;
                c = 2;
            } else if (iCodePointAt != 39) {
                i++;
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int copydefault(java.lang.CharSequence charSequence, java.lang.StringBuilder sb) {
        if (charSequence == null) {
            return 0;
        }
        int length = sb.length();
        int iCharCount = 0;
        char c = 0;
        while (iCharCount < charSequence.length()) {
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, iCharCount);
            if (iCodePointAt == 37) {
                if (c == 0) {
                    sb.append('\'');
                    sb.appendCodePoint(iCodePointAt);
                    c = 2;
                } else {
                    sb.appendCodePoint(iCodePointAt);
                }
            } else if (iCodePointAt == 39) {
                sb.append("''");
            } else if (iCodePointAt != 43 && iCodePointAt != 45 && iCodePointAt != 164 && iCodePointAt != 8240) {
                if (c == 2) {
                    sb.append('\'');
                    sb.appendCodePoint(iCodePointAt);
                    c = 0;
                } else {
                    sb.appendCodePoint(iCodePointAt);
                }
            }
            iCharCount += java.lang.Character.charCount(iCodePointAt);
        }
        if (c == 2) {
            sb.append('\'');
        }
        return sb.length() - length;
    }

    public static java.lang.String OLrzqt(java.lang.CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        copydefault(charSequence, sb);
        return sb.toString();
    }

    public static final NumberFormat.Field AEQbTJ(int i) {
        if (i != -15) {
            switch (i) {
                case -9:
                    return NumberFormat.Field.CURRENCY;
                case -8:
                    return NumberFormat.Field.CURRENCY;
                case -7:
                    return NumberFormat.Field.CURRENCY;
                case -6:
                    return NumberFormat.Field.CURRENCY;
                case -5:
                    return NumberFormat.Field.CURRENCY;
                case -4:
                    return NumberFormat.Field.PERMILLE;
                case -3:
                    return NumberFormat.Field.PERCENT;
                case -2:
                    return NumberFormat.Field.SIGN;
                case -1:
                    return NumberFormat.Field.SIGN;
                default:
                    throw new java.lang.AssertionError();
            }
        }
        return NumberFormat.Field.CURRENCY;
    }

    public static int KWHzl(java.lang.CharSequence charSequence, C7020abU c7020abU, int i, TaskDescription taskDescription, NumberFormat.Field field) {
        int iAEQbTJ;
        int i2 = 0;
        long jEZpvd = 0;
        while (OLrzqt(jEZpvd, charSequence)) {
            jEZpvd = EZpvd(jEZpvd, charSequence);
            int iCopydefault = copydefault(jEZpvd);
            if (iCopydefault == -15) {
                iAEQbTJ = c7020abU.AEQbTJ(i + i2, Utf8.REPLACEMENT_CODE_POINT, NumberFormat.Field.CURRENCY);
            } else if (iCopydefault < 0) {
                iAEQbTJ = c7020abU.copydefault(i + i2, taskDescription.copydefault(iCopydefault), AEQbTJ(iCopydefault));
            } else {
                iAEQbTJ = c7020abU.AEQbTJ(i + i2, iCopydefault, field);
            }
            i2 += iAEQbTJ;
        }
        return i2;
    }

    public static int OLrzqt(java.lang.CharSequence charSequence, boolean z, TaskDescription taskDescription) {
        int iCharCount;
        long jEZpvd = 0;
        int i = 0;
        while (OLrzqt(jEZpvd, charSequence)) {
            jEZpvd = EZpvd(jEZpvd, charSequence);
            int iCopydefault = copydefault(jEZpvd);
            if (iCopydefault == -15) {
                i++;
            } else {
                if (iCopydefault < 0) {
                    java.lang.CharSequence charSequenceCopydefault = taskDescription.copydefault(iCopydefault);
                    if (z) {
                        iCharCount = charSequenceCopydefault.length();
                    } else {
                        iCharCount = java.lang.Character.codePointCount(charSequenceCopydefault, 0, charSequenceCopydefault.length());
                    }
                } else {
                    iCharCount = z ? java.lang.Character.charCount(iCopydefault) : 1;
                }
                i += iCharCount;
            }
        }
        return i;
    }

    public static boolean OLrzqt(java.lang.CharSequence charSequence, int i) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        long jEZpvd = 0;
        while (OLrzqt(jEZpvd, charSequence)) {
            jEZpvd = EZpvd(jEZpvd, charSequence);
            if (copydefault(jEZpvd) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean EZpvd(java.lang.CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return false;
        }
        long jEZpvd = 0;
        while (OLrzqt(jEZpvd, charSequence)) {
            jEZpvd = EZpvd(jEZpvd, charSequence);
            int iCopydefault = copydefault(jEZpvd);
            if (iCopydefault < 0 && AEQbTJ(iCopydefault) == NumberFormat.Field.CURRENCY) {
                return true;
            }
        }
        return false;
    }

    public static boolean EZpvd(java.lang.CharSequence charSequence, UnicodeSet unicodeSet) {
        if (charSequence == null) {
            return true;
        }
        long jEZpvd = 0;
        while (OLrzqt(jEZpvd, charSequence)) {
            jEZpvd = EZpvd(jEZpvd, charSequence);
            int iCopydefault = copydefault(jEZpvd);
            if (iCopydefault >= 0 && !unicodeSet.AEQbTJ(iCopydefault)) {
                return false;
            }
        }
        return true;
    }

    public static void KWHzl(java.lang.CharSequence charSequence, Activity activity) {
        long jEZpvd = 0;
        while (OLrzqt(jEZpvd, charSequence)) {
            jEZpvd = EZpvd(jEZpvd, charSequence);
            activity.OLrzqt(copydefault(jEZpvd));
        }
    }

    public static long EZpvd(long j, java.lang.CharSequence charSequence) {
        int iAEQbTJ = AEQbTJ(j);
        int iEZpvd = EZpvd(j);
        while (iAEQbTJ < charSequence.length()) {
            int iCodePointAt = java.lang.Character.codePointAt(charSequence, iAEQbTJ);
            int iCharCount = java.lang.Character.charCount(iCodePointAt);
            switch (iEZpvd) {
                case 0:
                    if (iCodePointAt == 37) {
                        return AEQbTJ(iAEQbTJ + iCharCount, -3, 0, 0);
                    }
                    if (iCodePointAt == 39) {
                        iAEQbTJ += iCharCount;
                        iEZpvd = 1;
                    } else {
                        if (iCodePointAt == 43) {
                            return AEQbTJ(iAEQbTJ + iCharCount, -2, 0, 0);
                        }
                        if (iCodePointAt == 45) {
                            return AEQbTJ(iAEQbTJ + iCharCount, -1, 0, 0);
                        }
                        if (iCodePointAt != 164) {
                            if (iCodePointAt == 8240) {
                                return AEQbTJ(iAEQbTJ + iCharCount, -4, 0, 0);
                            }
                            return AEQbTJ(iAEQbTJ + iCharCount, 0, 0, iCodePointAt);
                        }
                        iAEQbTJ += iCharCount;
                        iEZpvd = 4;
                    }
                    break;
                    break;
                case 1:
                    if (iCodePointAt == 39) {
                        return AEQbTJ(iAEQbTJ + iCharCount, 0, 0, iCodePointAt);
                    }
                    return AEQbTJ(iAEQbTJ + iCharCount, 0, 2, iCodePointAt);
                case 2:
                    if (iCodePointAt != 39) {
                        return AEQbTJ(iAEQbTJ + iCharCount, 0, 2, iCodePointAt);
                    }
                    iAEQbTJ += iCharCount;
                    iEZpvd = 3;
                    break;
                    break;
                case 3:
                    if (iCodePointAt == 39) {
                        return AEQbTJ(iAEQbTJ + iCharCount, 0, 2, iCodePointAt);
                    }
                    iEZpvd = 0;
                    break;
                case 4:
                    if (iCodePointAt != 164) {
                        return AEQbTJ(iAEQbTJ, -5, 0, 0);
                    }
                    iAEQbTJ += iCharCount;
                    iEZpvd = 5;
                    break;
                    break;
                case 5:
                    if (iCodePointAt != 164) {
                        return AEQbTJ(iAEQbTJ, -6, 0, 0);
                    }
                    iAEQbTJ += iCharCount;
                    iEZpvd = 6;
                    break;
                    break;
                case 6:
                    if (iCodePointAt != 164) {
                        return AEQbTJ(iAEQbTJ, -7, 0, 0);
                    }
                    iAEQbTJ += iCharCount;
                    iEZpvd = 7;
                    break;
                    break;
                case 7:
                    if (iCodePointAt != 164) {
                        return AEQbTJ(iAEQbTJ, -8, 0, 0);
                    }
                    iAEQbTJ += iCharCount;
                    iEZpvd = 8;
                    break;
                    break;
                case 8:
                    if (iCodePointAt != 164) {
                        return AEQbTJ(iAEQbTJ, -9, 0, 0);
                    }
                    iAEQbTJ += iCharCount;
                    iEZpvd = 9;
                    break;
                    break;
                case 9:
                    if (iCodePointAt != 164) {
                        return AEQbTJ(iAEQbTJ, -15, 0, 0);
                    }
                    iAEQbTJ += iCharCount;
                    break;
                    break;
                default:
                    throw new java.lang.AssertionError();
            }
        }
        switch (iEZpvd) {
            case 0:
                return -1L;
            case 1:
            case 2:
                throw new java.lang.IllegalArgumentException("Unterminated quote in pattern affix: \"" + ((java.lang.Object) charSequence) + ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR);
            case 3:
                return -1L;
            case 4:
                return AEQbTJ(iAEQbTJ, -5, 0, 0);
            case 5:
                return AEQbTJ(iAEQbTJ, -6, 0, 0);
            case 6:
                return AEQbTJ(iAEQbTJ, -7, 0, 0);
            case 7:
                return AEQbTJ(iAEQbTJ, -8, 0, 0);
            case 8:
                return AEQbTJ(iAEQbTJ, -9, 0, 0);
            case 9:
                return AEQbTJ(iAEQbTJ, -15, 0, 0);
            default:
                throw new java.lang.AssertionError();
        }
    }

    public static boolean OLrzqt(long j, java.lang.CharSequence charSequence) {
        int iEZpvd = EZpvd(j);
        int iAEQbTJ = AEQbTJ(j);
        if (iEZpvd == 2 && iAEQbTJ == charSequence.length() - 1 && charSequence.charAt(iAEQbTJ) == '\'') {
            return false;
        }
        return iEZpvd != 0 || iAEQbTJ < charSequence.length();
    }

    public static int copydefault(long j) {
        int iOLrzqt = OLrzqt(j);
        return iOLrzqt == 0 ? KWHzl(j) : -iOLrzqt;
    }
}

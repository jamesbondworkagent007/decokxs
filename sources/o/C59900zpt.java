package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.zpt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59900zpt {
    public static java.lang.String EZpvd;
    public static final Pattern AEQbTJ = Pattern.compile("\\p{Print}");
    public static Pattern KWHzl = Pattern.compile("^([x|X][\\p{XDigit}]+)(;?)");
    public static Pattern OLrzqt = Pattern.compile("^0*([x|X][\\p{XDigit}]+)(;?)");
    public static Pattern copydefault = Pattern.compile("^([\\p{Digit}]+)(;?)");

    public static boolean copydefault(char c) {
        return ':' == c || '.' == c || '-' == c || '_' == c;
    }

    public static java.lang.String copydefault(java.lang.String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C59896zpp c59896zppAEQbTJ;
        java.lang.String strKWHzl;
        int length;
        if (str == null) {
            return null;
        }
        int length2 = str.length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        int iOLrzqt = 0;
        while (iOLrzqt < length2) {
            char cCharAt = str.charAt(iOLrzqt);
            if (cCharAt == '&') {
                if ((z || z2) && iOLrzqt < length2 - 1 && str.charAt(iOLrzqt + 1) == '#') {
                    iOLrzqt = OLrzqt(str, z4, z2, z6, sb, iOLrzqt + 2);
                } else {
                    if ((z3 || z) && (c59896zppAEQbTJ = C59898zpr.KWHzl.AEQbTJ(str.substring(iOLrzqt, java.lang.Math.min(10, length2 - iOLrzqt) + iOLrzqt))) != null) {
                        if (z3 && c59896zppAEQbTJ.AYXKKw()) {
                            if (z2) {
                                sb.append((char) c59896zppAEQbTJ.AhwBna());
                            } else {
                                sb.append(c59896zppAEQbTJ.EZpvd());
                            }
                            length = c59896zppAEQbTJ.gEmmrt().length();
                        } else if (z) {
                            if (z5) {
                                strKWHzl = c59896zppAEQbTJ.EZpvd();
                            } else {
                                strKWHzl = c59896zppAEQbTJ.KWHzl(z7 || z4);
                            }
                            sb.append(strKWHzl);
                            length = c59896zppAEQbTJ.gEmmrt().length();
                        } else {
                            sb.append(z5 ? copydefault() : "&amp;");
                        }
                        iOLrzqt += length + 1;
                    } else if (z7) {
                        C59896zpp c59896zppAEQbTJ2 = C59898zpr.KWHzl.AEQbTJ(str.substring(iOLrzqt, java.lang.Math.min(10, length2 - iOLrzqt) + iOLrzqt));
                        if (c59896zppAEQbTJ2 != null) {
                            sb.append(c59896zppAEQbTJ2.copydefault());
                            length = c59896zppAEQbTJ2.gEmmrt().length();
                            iOLrzqt += length + 1;
                        } else if (iOLrzqt < length2 - 1 && str.charAt(iOLrzqt + 1) == '#') {
                            iOLrzqt = KWHzl(str, false, false, false, sb, iOLrzqt + 2);
                        } else {
                            sb.append(z5 ? copydefault() : "&amp;");
                        }
                    } else {
                        sb.append(z5 ? copydefault() : "&amp;");
                    }
                }
            } else {
                C59896zpp c59896zppEZpvd = C59898zpr.KWHzl.EZpvd(cCharAt);
                if (c59896zppEZpvd == null) {
                    sb.append(cCharAt);
                } else if (z7) {
                    if ("apos".equals(c59896zppEZpvd.gEmmrt())) {
                        sb.append(cCharAt);
                    } else {
                        sb.append(z4 ? c59896zppEZpvd.KWHzl() : c59896zppEZpvd.copydefault());
                    }
                } else {
                    sb.append(z5 ? c59896zppEZpvd.EZpvd() : c59896zppEZpvd.KWHzl(z4));
                }
            }
            iOLrzqt++;
        }
        return sb.toString();
    }

    public static java.lang.String copydefault() {
        if (EZpvd == null) {
            EZpvd = C59898zpr.KWHzl.EZpvd(38).EZpvd();
        }
        return EZpvd;
    }

    public static int KWHzl(java.lang.String str, boolean z, boolean z2, boolean z3, java.lang.StringBuilder sb, int i) {
        int i2;
        char[] chars;
        java.lang.String strKWHzl;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iCopydefault = copydefault(str, i, true, sb2);
        if (sb2.length() > 0) {
            try {
                boolean zEquals = sb2.substring(0, 1).equals("x");
                if (zEquals) {
                    i2 = java.lang.Integer.parseInt(sb2.substring(1), 16);
                    chars = java.lang.Character.toChars(i2);
                } else {
                    i2 = java.lang.Integer.parseInt(sb2.toString());
                    chars = java.lang.Character.toChars(i2);
                }
                C59896zpp c59896zppEZpvd = C59898zpr.KWHzl.EZpvd(i2);
                if (chars.length == 1 && chars[0] == 0) {
                    sb.append("&amp;");
                } else if (c59896zppEZpvd != null) {
                    if (c59896zppEZpvd.AYXKKw()) {
                        sb.append(z ? c59896zppEZpvd.KWHzl() : c59896zppEZpvd.copydefault());
                    } else {
                        if (!z && z3) {
                            strKWHzl = zEquals ? c59896zppEZpvd.OLrzqt() : c59896zppEZpvd.EZpvd();
                        } else {
                            strKWHzl = c59896zppEZpvd.KWHzl();
                        }
                        sb.append(strKWHzl);
                    }
                } else if (z2 || AEQbTJ.matcher(new java.lang.String(chars)).find()) {
                    sb.append(java.lang.String.valueOf(chars));
                } else {
                    sb.append("&#");
                    sb.append((java.lang.CharSequence) sb2);
                    sb.append(";");
                }
            } catch (java.lang.NumberFormatException unused) {
                sb.append("&amp;#");
                sb.append((java.lang.CharSequence) sb2);
                sb.append(";");
            }
        } else {
            sb.append("&amp;");
        }
        return iCopydefault;
    }

    public static int OLrzqt(java.lang.String str, boolean z, boolean z2, boolean z3, java.lang.StringBuilder sb, int i) {
        int i2;
        char[] chars;
        java.lang.String strAEQbTJ;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int iCopydefault = copydefault(str, i, true, sb2);
        if (sb2.length() > 0) {
            try {
                boolean zEquals = sb2.substring(0, 1).equals("x");
                if (zEquals) {
                    i2 = java.lang.Integer.parseInt(sb2.substring(1), 16);
                    chars = java.lang.Character.toChars(i2);
                } else {
                    i2 = java.lang.Integer.parseInt(sb2.toString());
                    chars = java.lang.Character.toChars(i2);
                }
                C59896zpp c59896zppEZpvd = C59898zpr.KWHzl.EZpvd(i2);
                if (chars.length == 1 && chars[0] == 0) {
                    sb.append("&amp;");
                } else if (c59896zppEZpvd != null && (!c59896zppEZpvd.AYXKKw() || !z2)) {
                    if (z) {
                        strAEQbTJ = c59896zppEZpvd.KWHzl();
                    } else if (z3) {
                        strAEQbTJ = zEquals ? c59896zppEZpvd.OLrzqt() : c59896zppEZpvd.EZpvd();
                    } else {
                        strAEQbTJ = c59896zppEZpvd.AEQbTJ();
                    }
                    sb.append(strAEQbTJ);
                } else if (z2 || AEQbTJ.matcher(new java.lang.String(chars)).find()) {
                    sb.append(java.lang.String.valueOf(chars));
                } else {
                    sb.append("&#");
                    sb.append((java.lang.CharSequence) sb2);
                    sb.append(";");
                }
            } catch (java.lang.NumberFormatException unused) {
                sb.append("&amp;#");
                sb.append((java.lang.CharSequence) sb2);
                sb.append(";");
            }
        } else {
            sb.append("&amp;");
        }
        return iCopydefault;
    }

    public static int copydefault(java.lang.String str, int i, boolean z, java.lang.StringBuilder sb) {
        Matcher matcher;
        java.lang.CharSequence charSequenceSubSequence = str.subSequence(i, java.lang.Math.min(str.length(), i + 15));
        if (z) {
            matcher = OLrzqt.matcher(charSequenceSubSequence);
        } else {
            matcher = KWHzl.matcher(charSequenceSubSequence);
        }
        if (!matcher.find()) {
            matcher = copydefault.matcher(charSequenceSubSequence);
            if (!matcher.find()) {
                return i;
            }
        }
        int iEnd = i + (matcher.end() - 1);
        sb.append(matcher.group(1));
        return iEnd;
    }

    public static boolean copydefault(java.lang.Object obj) {
        return obj == null || copydefault(obj.toString(), true, false, false, false, false, false, false).replace((char) 160, ' ').trim().length() == 0;
    }
}

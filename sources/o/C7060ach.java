package o;

/* JADX INFO: renamed from: o.ach, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7060ach {
    public static boolean AEQbTJ;
    public static final C7258agT EZpvd;
    public static final boolean KWHzl;
    public static final java.lang.String OLrzqt;
    public static boolean copydefault;
    public static java.lang.String gEmmrt;

    static {
        try {
            gEmmrt = java.lang.System.getProperty("ICUDebug");
        } catch (java.lang.SecurityException unused) {
        }
        java.lang.String str = gEmmrt;
        boolean z = str != null;
        copydefault = z;
        AEQbTJ = z && (str.equals("") || gEmmrt.indexOf("help") != -1);
        if (copydefault) {
            java.lang.System.out.println("\nICUDebug=" + gEmmrt);
        }
        java.lang.String property = java.lang.System.getProperty("java.version", "0");
        OLrzqt = property;
        C7258agT c7258agTEZpvd = EZpvd(property);
        EZpvd = c7258agTEZpvd;
        KWHzl = c7258agTEZpvd.compareTo(C7258agT.OLrzqt("1.4.0")) >= 0;
    }

    public static C7258agT EZpvd(java.lang.String str) {
        int[] iArr = new int[4];
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (cCharAt < '0' || cCharAt > '9') {
                if (!z) {
                    continue;
                } else {
                    if (i2 == 3) {
                        break;
                    }
                    i2++;
                    z = false;
                }
                i++;
            } else {
                if (z) {
                    int i3 = (iArr[i2] * 10) + (cCharAt - '0');
                    iArr[i2] = i3;
                    if (i3 > 255) {
                        iArr[i2] = 0;
                        break;
                    }
                } else {
                    iArr[i2] = cCharAt - '0';
                    z = true;
                }
                i++;
            }
        }
        return C7258agT.AEQbTJ(iArr[0], iArr[1], iArr[2], iArr[3]);
    }

    public static boolean AEQbTJ(java.lang.String str) {
        if (copydefault) {
            z = gEmmrt.indexOf(str) != -1;
            if (AEQbTJ) {
                java.lang.System.out.println("\nICUDebug.enabled(" + str + ") = " + z);
            }
        }
        return z;
    }

    public static java.lang.String copydefault(java.lang.String str) {
        java.lang.String strSubstring;
        java.lang.String str2 = "false";
        if (copydefault) {
            int iIndexOf = gEmmrt.indexOf(str);
            if (iIndexOf != -1) {
                int length = iIndexOf + str.length();
                if (gEmmrt.length() <= length || gEmmrt.charAt(length) != '=') {
                    strSubstring = "true";
                } else {
                    int i = length + 1;
                    int iIndexOf2 = gEmmrt.indexOf(",", i);
                    java.lang.String str3 = gEmmrt;
                    if (iIndexOf2 == -1) {
                        iIndexOf2 = str3.length();
                    }
                    strSubstring = str3.substring(i, iIndexOf2);
                }
                str2 = strSubstring;
            }
            if (AEQbTJ) {
                java.lang.System.out.println("\nICUDebug.value(" + str + ") = " + str2);
            }
        }
        return str2;
    }
}

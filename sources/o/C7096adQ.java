package o;

import java.util.Collections;
import o.C7090adK;

/* JADX INFO: renamed from: o.adQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7096adQ {
    public static final java.util.Map<C7090adK.TaskDescription, java.lang.String[]> KWHzl = new java.util.HashMap();
    public static java.lang.String OLrzqt = "und";
    public java.lang.String AEQbTJ = "";
    public java.lang.String AhwBna = "";
    public java.lang.String djBIcL = "";
    public java.lang.String gEmmrt = "";
    public java.util.List<java.lang.String> copydefault = Collections.emptyList();
    public java.util.List<java.lang.String> valueOf = Collections.emptyList();
    public java.util.List<java.lang.String> EZpvd = Collections.emptyList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String OLrzqt() {
        return this.djBIcL;
    }

    static {
        java.lang.String[][] strArr = {new java.lang.String[]{"art-lojban", "jbo"}, new java.lang.String[]{"cel-gaulish", "xtg"}, new java.lang.String[]{"en-GB-oed", "en-GB-x-oed"}, new java.lang.String[]{"i-ami", "ami"}, new java.lang.String[]{"i-bnn", "bnn"}, new java.lang.String[]{"i-default", "en-x-i-default"}, new java.lang.String[]{"i-enochian", "und-x-i-enochian"}, new java.lang.String[]{"i-hak", "hak"}, new java.lang.String[]{"i-klingon", "tlh"}, new java.lang.String[]{"i-lux", "lb"}, new java.lang.String[]{"i-mingo", "see-x-i-mingo"}, new java.lang.String[]{"i-navajo", "nv"}, new java.lang.String[]{"i-pwn", "pwn"}, new java.lang.String[]{"i-tao", "tao"}, new java.lang.String[]{"i-tay", "tay"}, new java.lang.String[]{"i-tsu", "tsu"}, new java.lang.String[]{"no-bok", "nb"}, new java.lang.String[]{"no-nyn", "nn"}, new java.lang.String[]{"sgn-BE-FR", "sfb"}, new java.lang.String[]{"sgn-BE-NL", "vgt"}, new java.lang.String[]{"sgn-CH-DE", "sgg"}, new java.lang.String[]{"zh-guoyu", "cmn"}, new java.lang.String[]{"zh-hakka", "hak"}, new java.lang.String[]{"zh-min", "nan-x-zh-min"}, new java.lang.String[]{"zh-min-nan", "nan"}, new java.lang.String[]{"zh-xiang", "hsn"}};
        for (int i = 0; i < 26; i++) {
            java.lang.String[] strArr2 = strArr[i];
            KWHzl.put(new C7090adK.TaskDescription(strArr2[0]), strArr2);
        }
    }

    private C7096adQ() {
    }

    public static C7096adQ EZpvd(java.lang.String str, C7099adT c7099adT) {
        boolean z;
        C7104adY c7104adY;
        if (c7099adT == null) {
            c7099adT = new C7099adT();
        } else {
            c7099adT.OLrzqt();
        }
        java.lang.String[] strArr = KWHzl.get(new C7090adK.TaskDescription(str));
        int iIndexOf = 2;
        while (true) {
            z = false;
            if (strArr != null || (iIndexOf = str.indexOf(45, iIndexOf + 1)) == -1) {
                break;
            }
            strArr = KWHzl.get(new C7090adK.TaskDescription(str.substring(0, iIndexOf)));
        }
        if (strArr != null) {
            if (strArr[0].length() == str.length()) {
                c7104adY = new C7104adY(strArr[1], "-");
            } else {
                c7104adY = new C7104adY(strArr[1] + str.substring(iIndexOf), "-");
            }
            z = true;
        } else {
            c7104adY = new C7104adY(str, "-");
        }
        C7096adQ c7096adQ = new C7096adQ();
        if (c7096adQ.KWHzl(c7104adY, c7099adT)) {
            if (c7096adQ.AEQbTJ.length() <= 3) {
                c7096adQ.OLrzqt(c7104adY, c7099adT);
            }
            c7096adQ.AYXKKw(c7104adY, c7099adT);
            c7096adQ.copydefault(c7104adY, c7099adT);
            c7096adQ.djBIcL(c7104adY, c7099adT);
            c7096adQ.AEQbTJ(c7104adY, c7099adT);
        }
        c7096adQ.EZpvd(c7104adY, c7099adT);
        if (z) {
            c7099adT.KWHzl = str.length();
        } else if (!c7104adY.OLrzqt() && !c7099adT.copydefault()) {
            java.lang.String strKWHzl = c7104adY.KWHzl();
            c7099adT.EZpvd = c7104adY.copydefault();
            if (strKWHzl.length() == 0) {
                c7099adT.copydefault = "Empty subtag";
            } else {
                c7099adT.copydefault = "Invalid subtag: " + strKWHzl;
            }
        }
        return c7096adQ;
    }

    public final boolean KWHzl(C7104adY c7104adY, C7099adT c7099adT) {
        if (!c7104adY.OLrzqt() && !c7099adT.copydefault()) {
            java.lang.String strKWHzl = c7104adY.KWHzl();
            if (AhwBna(strKWHzl)) {
                this.AEQbTJ = strKWHzl;
                c7099adT.KWHzl = c7104adY.AEQbTJ();
                c7104adY.valueOf();
                return true;
            }
        }
        return false;
    }

    public final boolean OLrzqt(C7104adY c7104adY, C7099adT c7099adT) {
        boolean z = false;
        if (!c7104adY.OLrzqt() && !c7099adT.copydefault()) {
            while (!c7104adY.OLrzqt()) {
                java.lang.String strKWHzl = c7104adY.KWHzl();
                if (!gEmmrt(strKWHzl)) {
                    break;
                }
                if (this.copydefault.isEmpty()) {
                    this.copydefault = new java.util.ArrayList(3);
                }
                this.copydefault.add(strKWHzl);
                c7099adT.KWHzl = c7104adY.AEQbTJ();
                c7104adY.valueOf();
                z = true;
                if (this.copydefault.size() == 3) {
                    break;
                }
            }
        }
        return z;
    }

    public final boolean AYXKKw(C7104adY c7104adY, C7099adT c7099adT) {
        if (!c7104adY.OLrzqt() && !c7099adT.copydefault()) {
            java.lang.String strKWHzl = c7104adY.KWHzl();
            if (isConnected(strKWHzl)) {
                this.AhwBna = strKWHzl;
                c7099adT.KWHzl = c7104adY.AEQbTJ();
                c7104adY.valueOf();
                return true;
            }
        }
        return false;
    }

    public final boolean copydefault(C7104adY c7104adY, C7099adT c7099adT) {
        if (!c7104adY.OLrzqt() && !c7099adT.copydefault()) {
            java.lang.String strKWHzl = c7104adY.KWHzl();
            if (DbNXlk(strKWHzl)) {
                this.djBIcL = strKWHzl;
                c7099adT.KWHzl = c7104adY.AEQbTJ();
                c7104adY.valueOf();
                return true;
            }
        }
        return false;
    }

    public final boolean djBIcL(C7104adY c7104adY, C7099adT c7099adT) {
        boolean z = false;
        if (!c7104adY.OLrzqt() && !c7099adT.copydefault()) {
            while (!c7104adY.OLrzqt()) {
                java.lang.String strKWHzl = c7104adY.KWHzl();
                if (!fetchVPNInfo(strKWHzl)) {
                    break;
                }
                if (this.valueOf.isEmpty()) {
                    this.valueOf = new java.util.ArrayList(3);
                }
                java.lang.String upperCase = strKWHzl.toUpperCase();
                if (!this.valueOf.contains(upperCase)) {
                    this.valueOf.add(upperCase);
                }
                c7099adT.KWHzl = c7104adY.AEQbTJ();
                c7104adY.valueOf();
                z = true;
            }
        }
        return z;
    }

    public final boolean AEQbTJ(C7104adY c7104adY, C7099adT c7099adT) {
        if (c7104adY.OLrzqt() || c7099adT.copydefault()) {
            return false;
        }
        boolean z = false;
        while (true) {
            if (!c7104adY.OLrzqt()) {
                java.lang.String strKWHzl = c7104adY.KWHzl();
                if (!valueOf(strKWHzl)) {
                    break;
                }
                int iCopydefault = c7104adY.copydefault();
                java.lang.String lowerCase = strKWHzl.toLowerCase();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(lowerCase);
                c7104adY.valueOf();
                while (!c7104adY.OLrzqt()) {
                    java.lang.String strKWHzl2 = c7104adY.KWHzl();
                    if (!djBIcL(strKWHzl2)) {
                        break;
                    }
                    sb.append("-");
                    sb.append(strKWHzl2);
                    c7099adT.KWHzl = c7104adY.AEQbTJ();
                    c7104adY.valueOf();
                }
                if (c7099adT.KWHzl <= iCopydefault) {
                    c7099adT.EZpvd = iCopydefault;
                    c7099adT.copydefault = "Incomplete extension '" + lowerCase + "'";
                    break;
                }
                if (this.EZpvd.size() == 0) {
                    this.EZpvd = new java.util.ArrayList(4);
                }
                java.util.Iterator<java.lang.String> it = this.EZpvd.iterator();
                boolean z2 = false;
                while (true) {
                    boolean z3 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    if (it.next().charAt(0) != sb.charAt(0)) {
                        z3 = false;
                    }
                    z2 |= z3;
                }
                if (!z2) {
                    this.EZpvd.add(sb.toString());
                }
                z = true;
            } else {
                break;
            }
        }
        return z;
    }

    public final boolean EZpvd(C7104adY c7104adY, C7099adT c7099adT) {
        if (!c7104adY.OLrzqt() && !c7099adT.copydefault()) {
            java.lang.String strKWHzl = c7104adY.KWHzl();
            if (values(strKWHzl)) {
                int iCopydefault = c7104adY.copydefault();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(strKWHzl);
                c7104adY.valueOf();
                while (!c7104adY.OLrzqt()) {
                    java.lang.String strKWHzl2 = c7104adY.KWHzl();
                    if (!AkhnZx(strKWHzl2)) {
                        break;
                    }
                    sb.append("-");
                    sb.append(strKWHzl2);
                    c7099adT.KWHzl = c7104adY.AEQbTJ();
                    c7104adY.valueOf();
                }
                if (c7099adT.KWHzl <= iCopydefault) {
                    c7099adT.EZpvd = iCopydefault;
                    c7099adT.copydefault = "Incomplete privateuse";
                } else {
                    this.gEmmrt = sb.toString();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e0 A[PHI: r1
  0x00e0: PHI (r1v5 boolean) = (r1v4 boolean), (r1v9 boolean), (r1v9 boolean) binds: [B:28:0x0075, B:41:0x00a9, B:53:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7096adQ AEQbTJ(C7094adO c7094adO, C7098adS c7098adS) {
        boolean z;
        java.lang.String string;
        C7096adQ c7096adQ = new C7096adQ();
        java.lang.String strKWHzl = c7094adO.KWHzl();
        java.lang.String strEZpvd = c7094adO.EZpvd();
        java.lang.String strOLrzqt = c7094adO.OLrzqt();
        java.lang.String strCopydefault = c7094adO.copydefault();
        if (strKWHzl.length() > 0 && AhwBna(strKWHzl)) {
            if (strKWHzl.equals("iw")) {
                strKWHzl = "he";
            } else if (strKWHzl.equals("ji")) {
                strKWHzl = "yi";
            } else if (strKWHzl.equals("in")) {
                strKWHzl = "id";
            }
            c7096adQ.AEQbTJ = strKWHzl;
        }
        boolean z2 = true;
        if (strEZpvd.length() <= 0 || !isConnected(strEZpvd)) {
            z = false;
        } else {
            c7096adQ.AhwBna = KWHzl(strEZpvd);
            z = true;
        }
        if (strOLrzqt.length() > 0 && DbNXlk(strOLrzqt)) {
            c7096adQ.djBIcL = OLrzqt(strOLrzqt);
            z = true;
        }
        java.util.ArrayList arrayList = null;
        if (strCopydefault.length() > 0) {
            C7104adY c7104adY = new C7104adY(strCopydefault, "_");
            java.util.ArrayList arrayList2 = null;
            while (!c7104adY.OLrzqt()) {
                java.lang.String strKWHzl2 = c7104adY.KWHzl();
                if (!fetchVPNInfo(strKWHzl2)) {
                    break;
                }
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList();
                }
                arrayList2.add(AYXKKw(strKWHzl2));
                c7104adY.valueOf();
            }
            if (arrayList2 != null) {
                c7096adQ.valueOf = arrayList2;
                z = true;
            }
            if (!c7104adY.OLrzqt()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                while (!c7104adY.OLrzqt()) {
                    java.lang.String strKWHzl3 = c7104adY.KWHzl();
                    if (!AkhnZx(strKWHzl3)) {
                        break;
                    }
                    if (sb.length() > 0) {
                        sb.append("-");
                    }
                    sb.append(C7090adK.AEQbTJ(strKWHzl3));
                    c7104adY.valueOf();
                }
                string = sb.length() > 0 ? sb.toString() : null;
            }
        }
        java.lang.String strAEQbTJ = null;
        for (java.lang.Character ch : c7098adS.copydefault()) {
            C7091adL c7091adLAEQbTJ = c7098adS.AEQbTJ(ch);
            if (EZpvd(ch.charValue())) {
                strAEQbTJ = c7091adLAEQbTJ.AEQbTJ();
            } else {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(ch.toString() + "-" + c7091adLAEQbTJ.AEQbTJ());
            }
        }
        if (arrayList != null) {
            c7096adQ.EZpvd = arrayList;
        } else {
            z2 = z;
        }
        if (string != null) {
            strAEQbTJ = strAEQbTJ == null ? "lvariant-" + string : strAEQbTJ + "-lvariant-" + string.replace("_", "-");
        }
        if (strAEQbTJ != null) {
            c7096adQ.gEmmrt = strAEQbTJ;
        }
        if (c7096adQ.AEQbTJ.length() == 0 && (z2 || strAEQbTJ == null)) {
            c7096adQ.AEQbTJ = OLrzqt;
        }
        return c7096adQ;
    }

    public java.util.List<java.lang.String> copydefault() {
        return Collections.unmodifiableList(this.copydefault);
    }

    public java.util.List<java.lang.String> AhwBna() {
        return Collections.unmodifiableList(this.valueOf);
    }

    public java.util.List<java.lang.String> KWHzl() {
        return Collections.unmodifiableList(this.EZpvd);
    }

    public static boolean AhwBna(java.lang.String str) {
        return str.length() >= 2 && str.length() <= 8 && C7090adK.EZpvd(str);
    }

    public static boolean gEmmrt(java.lang.String str) {
        return str.length() == 3 && C7090adK.EZpvd(str);
    }

    public static boolean isConnected(java.lang.String str) {
        return str.length() == 4 && C7090adK.EZpvd(str);
    }

    public static boolean DbNXlk(java.lang.String str) {
        return (str.length() == 2 && C7090adK.EZpvd(str)) || (str.length() == 3 && C7090adK.OLrzqt(str));
    }

    public static boolean fetchVPNInfo(java.lang.String str) {
        int length = str.length();
        if (length < 5 || length > 8) {
            return length == 4 && C7090adK.copydefault(str.charAt(0)) && C7090adK.KWHzl(str.charAt(1)) && C7090adK.KWHzl(str.charAt(2)) && C7090adK.KWHzl(str.charAt(3));
        }
        return C7090adK.KWHzl(str);
    }

    public static boolean valueOf(java.lang.String str) {
        return str.length() == 1 && C7090adK.KWHzl(str) && !C7090adK.copydefault("x", str);
    }

    public static boolean AEQbTJ(char c) {
        return valueOf(java.lang.String.valueOf(c));
    }

    public static boolean djBIcL(java.lang.String str) {
        return str.length() >= 2 && str.length() <= 8 && C7090adK.KWHzl(str);
    }

    public static boolean values(java.lang.String str) {
        return str.length() == 1 && C7090adK.copydefault("x", str);
    }

    public static boolean EZpvd(char c) {
        return C7090adK.copydefault("x", java.lang.String.valueOf(c));
    }

    public static boolean AkhnZx(java.lang.String str) {
        return str.length() >= 1 && str.length() <= 8 && C7090adK.KWHzl(str);
    }

    public static java.lang.String EZpvd(java.lang.String str) {
        return C7090adK.AEQbTJ(str);
    }

    public static java.lang.String KWHzl(java.lang.String str) {
        return C7090adK.copydefault(str);
    }

    public static java.lang.String OLrzqt(java.lang.String str) {
        return C7090adK.valueOf(str);
    }

    public static java.lang.String AYXKKw(java.lang.String str) {
        return C7090adK.AEQbTJ(str);
    }

    public static java.lang.String copydefault(java.lang.String str) {
        java.lang.String strAEQbTJ = C7090adK.AEQbTJ(str);
        while (strAEQbTJ.endsWith("-true")) {
            strAEQbTJ = strAEQbTJ.substring(0, strAEQbTJ.length() - 5);
        }
        while (true) {
            int iIndexOf = strAEQbTJ.indexOf("-true-");
            if (iIndexOf <= 0) {
                break;
            }
            strAEQbTJ = strAEQbTJ.substring(0, iIndexOf) + strAEQbTJ.substring(iIndexOf + 5);
        }
        while (strAEQbTJ.endsWith("-yes")) {
            strAEQbTJ = strAEQbTJ.substring(0, strAEQbTJ.length() - 4);
        }
        while (true) {
            int iIndexOf2 = strAEQbTJ.indexOf("-yes-");
            if (iIndexOf2 <= 0) {
                return strAEQbTJ;
            }
            strAEQbTJ = strAEQbTJ.substring(0, iIndexOf2) + strAEQbTJ.substring(iIndexOf2 + 4);
        }
    }

    public static java.lang.String AEQbTJ(java.lang.String str) {
        return C7090adK.AEQbTJ(str);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.AEQbTJ.length() > 0) {
            sb.append(this.AEQbTJ);
            for (java.lang.String str : this.copydefault) {
                sb.append("-");
                sb.append(str);
            }
            if (this.AhwBna.length() > 0) {
                sb.append("-");
                sb.append(this.AhwBna);
            }
            if (this.djBIcL.length() > 0) {
                sb.append("-");
                sb.append(this.djBIcL);
            }
            for (java.lang.String str2 : this.valueOf) {
                sb.append("-");
                sb.append(str2);
            }
            for (java.lang.String str3 : this.EZpvd) {
                sb.append("-");
                sb.append(str3);
            }
        }
        if (this.gEmmrt.length() > 0) {
            if (sb.length() > 0) {
                sb.append("-");
            }
            sb.append(this.gEmmrt);
        }
        return sb.toString();
    }
}

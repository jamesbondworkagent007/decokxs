package o;

import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: renamed from: o.zpm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C59893zpm {
    public transient C59888zph AEQbTJ;
    public java.lang.String AYXKKw;
    public transient AbstractC59897zpq KWHzl;
    public transient boolean copydefault;
    public boolean djBIcL;
    public C59883zpc ejfBZ;
    public C59836zoZ fARcdN;
    public C59887zpg fIwbmz;
    public C59882zpb fJNWhG;
    public transient int gEmmrt;
    public java.io.BufferedReader values;
    public char[] AkhnZx = new char[1024];
    public transient int AhwBna = -1;
    public transient int DbNXlk = 1;
    public transient int OLrzqt = 1;
    public transient java.lang.StringBuffer isConnected = new java.lang.StringBuffer(512);
    public transient java.util.List<InterfaceC59833zoW> fetchVPNInfo = new java.util.ArrayList();
    public transient java.util.Set<java.lang.String> valueOf = new java.util.HashSet();
    public boolean EZpvd = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Set<java.lang.String> AhwBna() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(char c) {
        if (c != '\n') {
            this.OLrzqt++;
        } else {
            this.DbNXlk++;
            this.OLrzqt = 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<InterfaceC59833zoW> djBIcL() {
        return this.fetchVPNInfo;
    }

    public final void fetchVPNInfo() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C59888zph gEmmrt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean values() {
        int i = this.AhwBna;
        return i >= 0 && this.gEmmrt >= i;
    }

    public C59893zpm(C59887zpg c59887zpg, java.io.Reader reader, C59883zpc c59883zpc) {
        this.values = new java.io.BufferedReader(reader);
        this.fIwbmz = c59887zpg;
        this.fARcdN = c59887zpg.OLrzqt();
        this.fJNWhG = c59887zpg.EZpvd();
        this.ejfBZ = c59883zpc;
    }

    public final void KWHzl(InterfaceC59833zoW interfaceC59833zoW) {
        interfaceC59833zoW.OLrzqt(this.DbNXlk);
        interfaceC59833zoW.AEQbTJ(this.OLrzqt);
        this.fetchVPNInfo.add(interfaceC59833zoW);
        C59887zpg c59887zpg = this.fIwbmz;
        java.util.List<InterfaceC59833zoW> list = this.fetchVPNInfo;
        c59887zpg.OLrzqt(list, list.listIterator(list.size() - 1), this.ejfBZ);
    }

    public final void AEQbTJ(int i) throws java.io.IOException {
        if (this.AhwBna != -1) {
            return;
        }
        int i2 = this.gEmmrt;
        if (i + i2 < 1024) {
            return;
        }
        int i3 = 1024 - i2;
        char[] cArr = this.AkhnZx;
        int i4 = 0;
        java.lang.System.arraycopy(cArr, i2, cArr, 0, i3);
        this.gEmmrt = 0;
        int i5 = 1024 - i3;
        int i6 = i3;
        int i7 = 0;
        do {
            int i8 = this.values.read(this.AkhnZx, i6, i5);
            if (i8 >= 0) {
                i7 += i8;
                i6 += i8;
                i5 -= i8;
            }
            if (i8 < 0) {
                break;
            }
        } while (i5 > 0);
        if (i5 > 0) {
            this.AhwBna = i7 + i3;
        }
        while (true) {
            int i9 = this.AhwBna;
            if (i9 < 0) {
                i9 = 1024;
            }
            if (i4 >= i9) {
                return;
            }
            char[] cArr2 = this.AkhnZx;
            char c = cArr2[i4];
            if (c >= 1 && c <= ' ' && c != '\n' && c != '\r') {
                cArr2[i4] = ' ';
            }
            i4++;
        }
    }

    public final void AkhnZx() throws java.io.IOException {
        EZpvd(1);
    }

    public final void EZpvd(int i) throws java.io.IOException {
        this.gEmmrt += i;
        AEQbTJ(i - 1);
    }

    public final boolean AEQbTJ(java.lang.String str) throws java.io.IOException {
        int length = str.length();
        AEQbTJ(length);
        int i = this.AhwBna;
        if (i >= 0 && this.gEmmrt + length > i) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            if (java.lang.Character.toLowerCase(str.charAt(i2)) != java.lang.Character.toLowerCase(this.AkhnZx[this.gEmmrt + i2])) {
                return false;
            }
        }
        return true;
    }

    public final boolean copydefault(int i) {
        int i2 = this.AhwBna;
        if (i2 < 0 || i < i2) {
            return java.lang.Character.isWhitespace(this.AkhnZx[i]);
        }
        return false;
    }

    public final boolean ejfBZ() {
        return copydefault(this.gEmmrt);
    }

    public final boolean copydefault(int i, char c) {
        int i2 = this.AhwBna;
        return (i2 < 0 || i < i2) && java.lang.Character.toLowerCase(c) == java.lang.Character.toLowerCase(this.AkhnZx[i]);
    }

    public final boolean copydefault(char c) {
        return copydefault(this.gEmmrt, c);
    }

    public final boolean KWHzl(int i) {
        int i2 = this.AhwBna;
        if (i2 < 0 || i < i2) {
            return java.lang.Character.isUnicodeIdentifierStart(this.AkhnZx[i]);
        }
        return false;
    }

    public final boolean fIwbmz() {
        return KWHzl(this.gEmmrt);
    }

    public final boolean DbNXlk() {
        int i = this.AhwBna;
        if (i >= 0 && this.gEmmrt >= i) {
            return false;
        }
        char c = this.AkhnZx[this.gEmmrt];
        return java.lang.Character.isUnicodeIdentifierStart(c) || java.lang.Character.isDigit(c) || C59900zpt.copydefault(c);
    }

    public final void OLrzqt(char c) {
        EZpvd(c);
        this.isConnected.append(c);
    }

    public final void fARcdN() {
        if (values()) {
            return;
        }
        OLrzqt(this.AkhnZx[this.gEmmrt]);
    }

    public final void OLrzqt(int i) throws java.io.IOException {
        AEQbTJ(i);
        int i2 = this.gEmmrt;
        while (!values() && i > 0) {
            OLrzqt(this.AkhnZx[i2]);
            i2++;
            i--;
        }
    }

    public final void fJNWhG() throws java.io.IOException {
        while (!values() && ejfBZ()) {
            fARcdN();
            AkhnZx();
        }
    }

    public final boolean AEQbTJ() {
        if (this.isConnected.length() <= 0) {
            return false;
        }
        KWHzl(new C59881zpa(this.fARcdN.AhwBna() ? AYXKKw() : this.isConnected.toString()));
        java.lang.StringBuffer stringBuffer = this.isConnected;
        stringBuffer.delete(0, stringBuffer.length());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AYXKKw() {
        int iAhwBna;
        C59898zpr c59898zpr = C59898zpr.KWHzl;
        int iAEQbTJ = c59898zpr.AEQbTJ();
        int length = this.isConnected.length();
        int i = -1;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i2 < length) {
            if (this.isConnected.charAt(i2) == '&') {
                z = false;
                z2 = false;
                i = i2;
                i2++;
            } else {
                if (i != -1) {
                    if (this.isConnected.charAt(i2) == ';') {
                        if (z) {
                            try {
                                iAhwBna = java.lang.Integer.parseInt(this.isConnected.substring((z2 ? 3 : 2) + i, i2), z2 ? 16 : 10);
                            } catch (java.lang.NumberFormatException unused) {
                                iAhwBna = -1;
                            }
                            C59896zpp c59896zppEZpvd = c59898zpr.EZpvd(iAhwBna);
                            if (c59896zppEZpvd != null) {
                                iAhwBna = c59896zppEZpvd.AhwBna();
                            } else if (!this.fARcdN.fIwbmz()) {
                                iAhwBna = -1;
                            }
                            if (iAhwBna < 0) {
                                char[] chars = java.lang.Character.toChars(iAhwBna);
                                this.isConnected.replace(i, i2 + 1, new java.lang.String(chars));
                                int length2 = this.isConnected.length();
                                int length3 = i + chars.length;
                                length = length2;
                                i2 = length3;
                            } else {
                                i2++;
                            }
                            i = -1;
                        } else {
                            C59896zpp c59896zppAEQbTJ = c59898zpr.AEQbTJ(this.isConnected.substring(i + 1, i2));
                            if (c59896zppAEQbTJ != null) {
                                iAhwBna = c59896zppAEQbTJ.AhwBna();
                            }
                            if (iAhwBna < 0) {
                            }
                            i = -1;
                        }
                    } else if (i2 == i + 1 && this.isConnected.charAt(i2) == '#') {
                        z = true;
                    } else if (i2 == i + 2 && z && this.isConnected.charAt(i2) == 'x') {
                        z2 = true;
                    } else if (i2 - i > iAEQbTJ) {
                        i = -1;
                    }
                }
                i2++;
            }
        }
        return this.isConnected.toString();
    }

    public void getNewProxyInstance() throws java.io.IOException {
        java.lang.String string;
        this.KWHzl = null;
        this.fetchVPNInfo.clear();
        this.EZpvd = true;
        this.djBIcL = false;
        this.copydefault = false;
        this.valueOf.clear();
        this.gEmmrt = 1024;
        AEQbTJ(0);
        while (true) {
            boolean z = true;
            while (!values()) {
                if (java.lang.Thread.currentThread().isInterrupted()) {
                    fetchVPNInfo();
                    this.fetchVPNInfo.clear();
                    this.valueOf.clear();
                    this.values.close();
                    return;
                }
                java.lang.StringBuffer stringBuffer = this.isConnected;
                stringBuffer.delete(0, stringBuffer.length());
                this.KWHzl = null;
                this.EZpvd = true;
                AEQbTJ(10);
                if (this.djBIcL) {
                    int length = this.AYXKKw.length();
                    if (AEQbTJ("</" + this.AYXKKw) && (copydefault(this.gEmmrt + length + 2) || copydefault(this.gEmmrt + length + 2, '>'))) {
                        uzCIH();
                    } else if (z && AEQbTJ("<!--")) {
                        OLrzqt();
                    } else if (AEQbTJ("/*<![CDATA[*/") || AEQbTJ("<![CDATA[") || AEQbTJ("//<![CDATA[")) {
                        copydefault();
                    } else {
                        boolean zKWHzl = KWHzl();
                        if (z && zKWHzl) {
                            java.util.List<InterfaceC59833zoW> list = this.fetchVPNInfo;
                            InterfaceC59833zoW interfaceC59833zoW = list.get(list.size() - 1);
                            if (interfaceC59833zoW != null && (string = interfaceC59833zoW.toString()) != null && string.trim().length() > 0) {
                                z = false;
                            }
                        }
                    }
                    if (!this.djBIcL) {
                        break;
                    }
                } else if (AEQbTJ("<!doctype")) {
                    if (!this.copydefault) {
                        valueOf();
                        this.copydefault = true;
                    } else {
                        AEQbTJ('<');
                    }
                } else if (AEQbTJ("</") && KWHzl(this.gEmmrt + 2)) {
                    this.copydefault = true;
                    uzCIH();
                } else if (AEQbTJ("/*<![CDATA[*/") || AEQbTJ("<![CDATA[") || AEQbTJ("//<![CDATA[")) {
                    copydefault();
                } else if (AEQbTJ("<!--")) {
                    OLrzqt();
                } else if (AEQbTJ("<") && KWHzl(this.gEmmrt + 1)) {
                    this.copydefault = true;
                    getFieldNames();
                } else if (this.fARcdN.AkhnZx() && (AEQbTJ("<!") || AEQbTJ("<?"))) {
                    AEQbTJ('<');
                    if (copydefault('>')) {
                        AkhnZx();
                    }
                } else if (AEQbTJ("<?xml")) {
                    AEQbTJ('<');
                } else {
                    KWHzl();
                }
            }
            this.values.close();
            return;
        }
    }

    public final boolean copydefault(java.lang.String str) {
        return "html".equalsIgnoreCase(str) || TtmlNode.TAG_HEAD.equalsIgnoreCase(str) || "body".equalsIgnoreCase(str);
    }

    public final void getFieldNames() throws java.io.IOException {
        C59894zpn tagInfo;
        fARcdN();
        AkhnZx();
        if (values()) {
            return;
        }
        java.lang.String strIsConnected = isConnected();
        java.lang.String strOLrzqt = this.fJNWhG.OLrzqt(strIsConnected);
        if (strOLrzqt != null && (((tagInfo = this.fIwbmz.KWHzl().getTagInfo(strOLrzqt)) == null && !this.fARcdN.fARcdN() && this.fARcdN.iwGUEr() && !copydefault(strOLrzqt) && !this.fARcdN.isConnected()) || (tagInfo != null && tagInfo.djBIcL() && !this.fARcdN.ejfBZ() && this.fARcdN.fJNWhG()))) {
            KWHzl();
            return;
        }
        C59895zpo c59895zpo = new C59895zpo(strOLrzqt);
        c59895zpo.AEQbTJ(this.fARcdN.getNewProxyInstance());
        this.KWHzl = c59895zpo;
        if (this.EZpvd) {
            fJNWhG();
            iwGUEr();
            if (strOLrzqt != null) {
                C59882zpb c59882zpb = this.fJNWhG;
                if (c59882zpb != null) {
                    c59895zpo.EZpvd(c59882zpb.EZpvd(strIsConnected, c59895zpo.gEmmrt()));
                }
                KWHzl(this.KWHzl);
            }
            if (copydefault('>')) {
                AkhnZx();
                if (this.fARcdN.AEQbTJ(strOLrzqt)) {
                    this.djBIcL = true;
                    this.AYXKKw = strOLrzqt;
                }
            } else if (AEQbTJ("/>")) {
                EZpvd(2);
                KWHzl(new C59884zpd(strOLrzqt));
            }
            this.KWHzl = null;
            return;
        }
        AEQbTJ();
    }

    public final void uzCIH() throws java.io.IOException {
        C59894zpn tagInfo;
        C59899zps c59899zpsEZpvd;
        OLrzqt(2);
        EZpvd(2);
        this.OLrzqt += 2;
        if (values()) {
            return;
        }
        java.lang.String strIsConnected = isConnected();
        C59882zpb c59882zpb = this.fJNWhG;
        if (c59882zpb != null && c59882zpb.AEQbTJ(strIsConnected) && (c59899zpsEZpvd = this.fJNWhG.EZpvd(strIsConnected)) != null) {
            strIsConnected = c59899zpsEZpvd.AEQbTJ();
        }
        if (strIsConnected != null && (((tagInfo = this.fIwbmz.KWHzl().getTagInfo(strIsConnected)) == null && !this.fARcdN.fARcdN() && this.fARcdN.iwGUEr() && !copydefault(strIsConnected) && !this.fARcdN.isConnected()) || (tagInfo != null && tagInfo.djBIcL() && !this.fARcdN.ejfBZ() && this.fARcdN.fJNWhG()))) {
            KWHzl();
            return;
        }
        this.KWHzl = new C59884zpd(strIsConnected);
        if (this.EZpvd) {
            fJNWhG();
            iwGUEr();
            if (strIsConnected != null) {
                KWHzl(this.KWHzl);
            }
            if (copydefault('>')) {
                AkhnZx();
            }
            if (this.fARcdN.AEQbTJ(strIsConnected)) {
                this.djBIcL = false;
                this.AYXKKw = strIsConnected;
            }
            if (strIsConnected != null && strIsConnected.equalsIgnoreCase("html")) {
                fJNWhG();
            }
            this.KWHzl = null;
            return;
        }
        AEQbTJ();
    }

    public final java.lang.String isConnected() throws java.io.IOException {
        this.EZpvd = true;
        if (!fIwbmz()) {
            this.EZpvd = false;
            return null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        while (!values() && DbNXlk()) {
            fARcdN();
            stringBuffer.append(this.AkhnZx[this.gEmmrt]);
            AkhnZx();
        }
        while (stringBuffer.length() > 0 && C59900zpt.copydefault(stringBuffer.charAt(stringBuffer.length() - 1))) {
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        java.lang.String string = stringBuffer.toString();
        int iIndexOf = string.indexOf(58);
        if (iIndexOf >= 0) {
            java.lang.String strSubstring = string.substring(0, iIndexOf);
            java.lang.String strSubstring2 = string.substring(iIndexOf + 1);
            int iIndexOf2 = strSubstring2.indexOf(58);
            if (iIndexOf2 >= 0) {
                strSubstring2 = strSubstring2.substring(0, iIndexOf2);
            }
            string = strSubstring2;
            if (this.fARcdN.isConnected()) {
                string = strSubstring + ":" + string;
                if (!"xmlns".equalsIgnoreCase(strSubstring)) {
                    this.valueOf.add(strSubstring.toLowerCase());
                }
            }
        }
        return string;
    }

    public final void iwGUEr() throws java.io.IOException {
        java.lang.String strEZpvd;
        while (!values() && this.EZpvd && !copydefault('>') && !AEQbTJ("/>")) {
            if (java.lang.Thread.currentThread().isInterrupted()) {
                fetchVPNInfo();
                return;
            }
            fJNWhG();
            java.lang.String strIsConnected = isConnected();
            if (!this.EZpvd) {
                if (!copydefault('<') && !copydefault('>') && !AEQbTJ("/>")) {
                    fARcdN();
                    AkhnZx();
                }
                if (!copydefault('<')) {
                    this.EZpvd = true;
                }
            } else {
                fJNWhG();
                if (copydefault('=')) {
                    fARcdN();
                    AkhnZx();
                    strEZpvd = EZpvd();
                } else if ("empty".equals(this.fARcdN.AEQbTJ())) {
                    strEZpvd = "";
                } else {
                    strEZpvd = "true".equals(this.fARcdN.AEQbTJ()) ? "true" : strIsConnected;
                }
                if (this.EZpvd) {
                    this.KWHzl.copydefault(strIsConnected, strEZpvd);
                }
            }
        }
    }

    public final java.lang.String EZpvd() throws java.io.IOException {
        fJNWhG();
        if (copydefault('<') || copydefault('>') || AEQbTJ("/>")) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        boolean z = true;
        boolean z2 = false;
        if (copydefault('\'')) {
            fARcdN();
            AkhnZx();
        } else if (copydefault('\"')) {
            fARcdN();
            AkhnZx();
            z2 = true;
            z = false;
        } else {
            z = false;
        }
        boolean zValueOf = this.fARcdN.valueOf();
        boolean zGEmmrt = this.fARcdN.gEmmrt();
        while (!values() && ((z && !copydefault('\'') && ((zGEmmrt || (!copydefault('>') && !copydefault('<'))) && (zValueOf || !ejfBZ()))) || ((z2 && !copydefault('\"') && ((zGEmmrt || (!copydefault('>') && !copydefault('<'))) && (zValueOf || !ejfBZ()))) || (!z && !z2 && !ejfBZ() && !copydefault('>') && !copydefault('<'))))) {
            stringBuffer.append(this.AkhnZx[this.gEmmrt]);
            fARcdN();
            AkhnZx();
        }
        if (copydefault('\'') && z) {
            fARcdN();
            AkhnZx();
        } else if (copydefault('\"') && z2) {
            fARcdN();
            AkhnZx();
        }
        return stringBuffer.toString();
    }

    public final boolean KWHzl() throws java.io.IOException {
        while (!values()) {
            fARcdN();
            AkhnZx();
            if (AEQbTJ("/*<![CDATA[*/") || AEQbTJ("<![CDATA[") || AEQbTJ("//<![CDATA[") || AuCTel()) {
                break;
            }
        }
        return AEQbTJ();
    }

    public final boolean AuCTel() throws java.io.IOException {
        if (AEQbTJ("</") || AEQbTJ("<!") || AEQbTJ("<?")) {
            return true;
        }
        return AEQbTJ("<") && KWHzl(this.gEmmrt + 1);
    }

    public final void AEQbTJ(char c) throws java.io.IOException {
        while (!values()) {
            AkhnZx();
            EZpvd(this.AkhnZx[this.gEmmrt]);
            if (copydefault(c)) {
                return;
            }
        }
    }

    public final void OLrzqt() throws java.io.IOException {
        EZpvd(4);
        while (!values() && !AEQbTJ("-->")) {
            fARcdN();
            AkhnZx();
        }
        if (AEQbTJ("-->")) {
            EZpvd(3);
        }
        if (this.isConnected.length() > 0) {
            if (!this.fARcdN.values()) {
                java.lang.String strOLrzqt = this.fARcdN.OLrzqt();
                java.lang.String strReplaceAll = this.isConnected.toString().replaceAll("--", strOLrzqt + strOLrzqt);
                if (strReplaceAll.length() > 0 && strReplaceAll.charAt(0) == '-') {
                    strReplaceAll = strOLrzqt + strReplaceAll.substring(1);
                }
                int length = strReplaceAll.length();
                if (length > 0) {
                    int i = length - 1;
                    if (strReplaceAll.charAt(i) == '-') {
                        strReplaceAll = strReplaceAll.substring(0, i) + strOLrzqt;
                    }
                }
                KWHzl(new C59835zoY(strReplaceAll));
            }
            java.lang.StringBuffer stringBuffer = this.isConnected;
            stringBuffer.delete(0, stringBuffer.length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void copydefault() throws java.io.IOException {
        boolean z;
        int length;
        if (!this.djBIcL && !this.fARcdN.DbNXlk()) {
            KWHzl();
            return;
        }
        if (AEQbTJ("/*<![CDATA[*/")) {
            EZpvd(13);
        } else {
            if (AEQbTJ("//<![CDATA[")) {
                EZpvd(11);
                z = true;
                length = this.isConnected.length();
                while (!values() && !AEQbTJ("/*]]>*/") && !AEQbTJ("]]>") && !AEQbTJ("//]]>")) {
                    fARcdN();
                    AkhnZx();
                }
                if (!AEQbTJ("/*]]>*/")) {
                    EZpvd(7);
                } else if (AEQbTJ("//]]>")) {
                    EZpvd(5);
                } else if (AEQbTJ("]]>")) {
                    EZpvd(3);
                }
                if (this.isConnected.length() > 0 && (this.djBIcL || !this.fARcdN.DbNXlk())) {
                    if (z) {
                        KWHzl(new C59881zpa("//"));
                    }
                    KWHzl(new C59831zoU(this.isConnected.toString().substring(length)));
                }
                java.lang.StringBuffer stringBuffer = this.isConnected;
                stringBuffer.delete(length, stringBuffer.length());
            }
            EZpvd(9);
        }
        z = false;
        length = this.isConnected.length();
        while (!values()) {
            fARcdN();
            AkhnZx();
        }
        if (!AEQbTJ("/*]]>*/")) {
        }
        if (this.isConnected.length() > 0) {
            if (z) {
            }
            KWHzl(new C59831zoU(this.isConnected.toString().substring(length)));
        }
        java.lang.StringBuffer stringBuffer2 = this.isConnected;
        stringBuffer2.delete(length, stringBuffer2.length());
    }

    public final void valueOf() throws java.io.IOException {
        EZpvd(9);
        fJNWhG();
        java.lang.String strIsConnected = isConnected();
        fJNWhG();
        java.lang.String strIsConnected2 = isConnected();
        fJNWhG();
        java.lang.String strEZpvd = EZpvd();
        fJNWhG();
        java.lang.String strEZpvd2 = EZpvd();
        fJNWhG();
        java.lang.String strEZpvd3 = EZpvd();
        AEQbTJ('<');
        if (strEZpvd3 == null || strEZpvd3.length() == 0) {
            this.AEQbTJ = new C59888zph(strIsConnected, strIsConnected2, strEZpvd, strEZpvd2);
        } else {
            this.AEQbTJ = new C59888zph(strIsConnected, strIsConnected2, strEZpvd, strEZpvd2, strEZpvd3);
        }
    }
}

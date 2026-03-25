package o;

/* JADX INFO: renamed from: o.adH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7087adH implements InterfaceC7085adF {
    public boolean AEQbTJ;
    public java.lang.String EZpvd;
    public java.util.List<java.lang.String> KWHzl = new java.util.ArrayList();
    public java.io.Reader copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd() {
        this.EZpvd = null;
    }

    public C7087adH(java.io.Reader reader) {
        this.copydefault = reader;
        if (copydefault().startsWith("?xml")) {
            EZpvd();
        }
        if (copydefault().startsWith("!--")) {
            EZpvd();
        }
    }

    @Override // o.InterfaceC7085adF
    public boolean AEQbTJ(java.lang.String str) {
        if (!copydefault().equals(str)) {
            return false;
        }
        this.KWHzl.add(str);
        EZpvd();
        return true;
    }

    @Override // o.InterfaceC7085adF
    public boolean AEQbTJ() {
        int size = this.KWHzl.size() - 1;
        java.lang.String str = this.KWHzl.get(size);
        if (!copydefault().equals("/" + str)) {
            return false;
        }
        this.KWHzl.remove(size);
        EZpvd();
        return true;
    }

    @Override // o.InterfaceC7085adF
    public boolean copydefault(java.lang.String str) {
        java.lang.String strKWHzl = KWHzl(str);
        if (strKWHzl != null) {
            return "true".equals(strKWHzl);
        }
        return false;
    }

    @Override // o.InterfaceC7085adF
    public boolean[] EZpvd(java.lang.String str) {
        java.lang.String[] strArrAhwBna = AhwBna(str);
        if (strArrAhwBna == null) {
            return null;
        }
        boolean[] zArr = new boolean[strArrAhwBna.length];
        for (int i = 0; i < strArrAhwBna.length; i++) {
            zArr[i] = "true".equals(strArrAhwBna[i]);
        }
        return zArr;
    }

    @Override // o.InterfaceC7085adF
    public char OLrzqt(java.lang.String str) {
        java.lang.String strKWHzl = KWHzl(str);
        if (strKWHzl != null) {
            return strKWHzl.charAt(0);
        }
        return (char) 65535;
    }

    @Override // o.InterfaceC7085adF
    public byte OLrzqt(java.lang.String str, java.lang.String[] strArr) {
        java.lang.String strKWHzl = KWHzl(str);
        if (strKWHzl == null) {
            return (byte) -1;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (strKWHzl.equals(strArr[i])) {
                return (byte) i;
            }
        }
        return (byte) -1;
    }

    @Override // o.InterfaceC7085adF
    public byte[] copydefault(java.lang.String str, java.lang.String[] strArr) {
        java.lang.String[] strArrAhwBna = AhwBna(str);
        if (strArrAhwBna == null) {
            return null;
        }
        byte[] bArr = new byte[strArrAhwBna.length];
        for (int i = 0; i < strArrAhwBna.length; i++) {
            java.lang.String str2 = strArrAhwBna[i];
            int i2 = 0;
            while (true) {
                if (i2 < strArr.length) {
                    if (strArr[i2].equals(str2)) {
                        bArr[i] = (byte) i2;
                        break;
                    }
                    i2++;
                } else {
                    bArr[i] = -1;
                    break;
                }
            }
        }
        return bArr;
    }

    @Override // o.InterfaceC7085adF
    public java.lang.String KWHzl(java.lang.String str) {
        if (!valueOf(str)) {
            return null;
        }
        java.lang.String strKWHzl = KWHzl();
        if (valueOf("/" + str)) {
            return strKWHzl;
        }
        return null;
    }

    @Override // o.InterfaceC7085adF
    public java.lang.String[] AhwBna(java.lang.String str) {
        if (valueOf(str + "List")) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (true) {
                java.lang.String strKWHzl = KWHzl(str);
                if (strKWHzl == null) {
                    break;
                }
                if ("Null".equals(strKWHzl)) {
                    strKWHzl = null;
                }
                arrayList.add(strKWHzl);
            }
            if (valueOf("/" + str + "List")) {
                return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
            }
        }
        return null;
    }

    @Override // o.InterfaceC7085adF
    public java.lang.String[][] gEmmrt(java.lang.String str) {
        if (!valueOf(str + "Table")) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String[] strArrAhwBna = AhwBna(str);
            if (strArrAhwBna == null) {
                break;
            }
            arrayList.add(strArrAhwBna);
        }
        if (valueOf("/" + str + "Table")) {
            return (java.lang.String[][]) arrayList.toArray(new java.lang.String[arrayList.size()][]);
        }
        return null;
    }

    public final boolean valueOf(java.lang.String str) {
        if (!copydefault().equals(str)) {
            return false;
        }
        EZpvd();
        return true;
    }

    public final java.lang.String copydefault() {
        if (this.EZpvd == null) {
            this.EZpvd = AhwBna();
        }
        return this.EZpvd;
    }

    public final java.lang.String KWHzl() {
        int iOLrzqt;
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        boolean z = false;
        while (true) {
            iOLrzqt = OLrzqt();
            if (iOLrzqt == -1 || iOLrzqt == 60) {
                break;
            }
            if (iOLrzqt == 38) {
                int iOLrzqt2 = OLrzqt();
                if (iOLrzqt2 == 35) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    int iOLrzqt3 = OLrzqt();
                    if (iOLrzqt3 == 120) {
                        iOLrzqt3 = OLrzqt();
                        i = 16;
                    } else {
                        i = 10;
                    }
                    while (iOLrzqt3 != 59 && iOLrzqt3 != -1) {
                        sb2.append((char) iOLrzqt3);
                        iOLrzqt3 = OLrzqt();
                    }
                    try {
                        iOLrzqt = (char) java.lang.Integer.parseInt(sb2.toString(), i);
                    } catch (java.lang.NumberFormatException e) {
                        java.lang.System.err.println("numbuf: " + sb2.toString() + " radix: " + i);
                        throw e;
                    }
                } else {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    while (iOLrzqt2 != 59 && iOLrzqt2 != -1) {
                        sb3.append((char) iOLrzqt2);
                        iOLrzqt2 = OLrzqt();
                    }
                    java.lang.String string = sb3.toString();
                    if (string.equals("lt")) {
                        iOLrzqt = 60;
                    } else if (string.equals("gt")) {
                        iOLrzqt = 62;
                    } else if (string.equals("quot")) {
                        iOLrzqt = 34;
                    } else if (string.equals("apos")) {
                        iOLrzqt = 39;
                    } else if (string.equals("amp")) {
                        iOLrzqt = 38;
                    } else {
                        java.lang.System.err.println("unrecognized character entity: '" + string + "'");
                    }
                }
            }
            if (!C7223afl.values(iOLrzqt)) {
                z = false;
            } else if (!z) {
                iOLrzqt = 32;
                z = true;
            }
            sb.append((char) iOLrzqt);
        }
        this.AEQbTJ = iOLrzqt == 60;
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r0 != 60) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        r5.AEQbTJ = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String AhwBna() {
        while (true) {
            if (this.AEQbTJ) {
                break;
            }
            int iOLrzqt = OLrzqt();
            if (iOLrzqt == 60 || iOLrzqt == -1) {
                break;
            }
            if (!C7223afl.values(iOLrzqt)) {
                java.lang.System.err.println("Unexpected non-whitespace character " + java.lang.Integer.toHexString(iOLrzqt));
                break;
            }
        }
        if (!this.AEQbTJ) {
            return null;
        }
        this.AEQbTJ = false;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        while (true) {
            int iOLrzqt2 = OLrzqt();
            if (iOLrzqt2 == 62 || iOLrzqt2 == -1) {
                break;
            }
            sb.append((char) iOLrzqt2);
        }
        return sb.toString();
    }

    public int OLrzqt() {
        try {
            return this.copydefault.read();
        } catch (java.io.IOException unused) {
            return -1;
        }
    }
}

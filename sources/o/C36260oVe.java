package o;

/* JADX INFO: renamed from: o.oVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C36260oVe extends oUA {
    public boolean AhwBna;
    public java.util.ArrayList<java.lang.Integer> djBIcL;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void copydefault(boolean z) {
        this.AhwBna = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String ejfBZ() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean fARcdN() {
        return this.AhwBna;
    }

    public java.lang.String AuCTel() {
        return this.copydefault.copydefault();
    }

    public int fIwbmz() {
        return this.djBIcL.size();
    }

    public int AEQbTJ(int i) {
        return this.djBIcL.get(i).intValue();
    }

    public void copydefault(int[] iArr) {
        this.djBIcL.clear();
        if (iArr.length > 0) {
            java.lang.String str = this.gEmmrt + "(";
            this.djBIcL.add(new java.lang.Integer(iArr[0]));
            java.lang.String str2 = str + iArr[0];
            for (int i = 1; i < iArr.length; i++) {
                this.djBIcL.add(java.lang.Integer.valueOf(iArr[i]));
                str2 = str2 + "," + iArr[i];
            }
            this.copydefault.copydefault(0, str2 + ")");
            return;
        }
        this.copydefault.copydefault(0, this.gEmmrt);
    }

    public C36260oVe(java.lang.String str) {
        super(str);
        this.djBIcL = new java.util.ArrayList<>();
        this.AhwBna = true;
        int iIndexOf = this.copydefault.KWHzl(0).indexOf(40);
        if (iIndexOf < 0) {
            this.gEmmrt = this.copydefault.KWHzl(0);
            return;
        }
        this.gEmmrt = this.copydefault.KWHzl(0).substring(0, iIndexOf);
        int iIndexOf2 = this.copydefault.KWHzl(0).indexOf(41);
        int i = iIndexOf + 1;
        if (iIndexOf2 <= i) {
            return;
        }
        java.lang.String strSubstring = this.copydefault.KWHzl(0).substring(i, iIndexOf2);
        java.lang.String[] strArrSplit = strSubstring.split(",");
        int length = strArrSplit.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            try {
                iArr[i2] = java.lang.Integer.parseInt(strArrSplit[i2]);
            } catch (java.lang.Exception unused) {
                pUU.copydefault("KlineCrash", "IndicatorNamedObject----> name = " + str + "strParams = " + strSubstring);
            }
        }
        copydefault(iArr);
    }
}

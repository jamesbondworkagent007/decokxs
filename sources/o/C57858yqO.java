package o;

/* JADX INFO: renamed from: o.yqO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57858yqO {
    public final java.util.ArrayList<C57861yqR> AEQbTJ = new java.util.ArrayList<>();
    public final C57859yqP EZpvd;
    public java.util.Set<java.lang.Character> OLrzqt;
    public C57856yqM[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C57856yqM[] AEQbTJ() {
        return this.copydefault;
    }

    public C57858yqO(C57859yqP c57859yqP) {
        this.EZpvd = c57859yqP;
    }

    public void OLrzqt(java.lang.String... strArr) {
        this.copydefault = new C57856yqM[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.copydefault[i] = new C57856yqM(strArr[i]);
        }
        this.OLrzqt = new java.util.HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            this.OLrzqt.addAll(this.copydefault[i2].copydefault());
        }
        java.util.Iterator<C57861yqR> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            it.next().KWHzl(this.copydefault);
        }
    }

    public void OLrzqt(char[] cArr) {
        if (this.copydefault == null) {
            throw new java.lang.IllegalStateException("Need to call #setCharacterLists first.");
        }
        int i = 0;
        while (i < this.AEQbTJ.size()) {
            if (this.AEQbTJ.get(i).AEQbTJ() > 0.0f) {
                i++;
            } else {
                this.AEQbTJ.remove(i);
            }
        }
        int[] iArrCopydefault = C57854yqK.copydefault(OLrzqt(), cArr, this.OLrzqt);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iArrCopydefault.length; i4++) {
            int i5 = iArrCopydefault[i4];
            if (i5 == 0) {
                this.AEQbTJ.get(i2).copydefault(cArr[i3]);
                i2++;
                i3++;
            } else if (i5 == 1) {
                this.AEQbTJ.add(i2, new C57861yqR(this.copydefault, this.EZpvd));
                this.AEQbTJ.get(i2).copydefault(cArr[i3]);
                i2++;
                i3++;
            } else {
                if (i5 != 2) {
                    throw new java.lang.IllegalArgumentException("Unknown action: " + iArrCopydefault[i4]);
                }
                this.AEQbTJ.get(i2).copydefault((char) 0);
                i2++;
            }
        }
    }

    public void EZpvd() {
        int size = this.AEQbTJ.size();
        for (int i = 0; i < size; i++) {
            this.AEQbTJ.get(i).EZpvd();
        }
    }

    public void copydefault(float f) {
        int size = this.AEQbTJ.size();
        for (int i = 0; i < size; i++) {
            this.AEQbTJ.get(i).EZpvd(f);
        }
    }

    public float copydefault() {
        int size = this.AEQbTJ.size();
        float fKWHzl = 0.0f;
        for (int i = 0; i < size; i++) {
            fKWHzl += this.AEQbTJ.get(i).KWHzl();
        }
        return fKWHzl;
    }

    public float KWHzl() {
        int size = this.AEQbTJ.size();
        float fAEQbTJ = 0.0f;
        for (int i = 0; i < size; i++) {
            fAEQbTJ += this.AEQbTJ.get(i).AEQbTJ();
        }
        return fAEQbTJ;
    }

    public char[] OLrzqt() {
        int size = this.AEQbTJ.size();
        char[] cArr = new char[size];
        for (int i = 0; i < size; i++) {
            cArr[i] = this.AEQbTJ.get(i).OLrzqt();
        }
        return cArr;
    }

    public void AEQbTJ(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        int size = this.AEQbTJ.size();
        for (int i = 0; i < size; i++) {
            C57861yqR c57861yqR = this.AEQbTJ.get(i);
            c57861yqR.AEQbTJ(canvas, paint);
            canvas.translate(c57861yqR.AEQbTJ(), 0.0f);
        }
    }
}

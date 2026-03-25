package o;

import o.C57856yqM;

/* JADX INFO: renamed from: o.yqR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C57861yqR {
    public int AEQbTJ;
    public int AYXKKw;
    public float AhwBna;
    public int AkhnZx;
    public float DbNXlk;
    public float EZpvd;
    public float KWHzl;
    public C57856yqM[] OLrzqt;
    public float copydefault;
    public float ejfBZ;
    public final C57859yqP fetchVPNInfo;
    public int gEmmrt;
    public float isConnected;
    public char[] valueOf;
    public float values;
    public char djBIcL = 0;
    public char fJNWhG = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void KWHzl(C57856yqM[] c57856yqMArr) {
        this.OLrzqt = c57856yqMArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public char OLrzqt() {
        return this.djBIcL;
    }

    public C57861yqR(C57856yqM[] c57856yqMArr, C57859yqP c57859yqP) {
        this.OLrzqt = c57856yqMArr;
        this.fetchVPNInfo = c57859yqP;
    }

    public void copydefault(char c) {
        this.fJNWhG = c;
        this.DbNXlk = this.AhwBna;
        float fEZpvd = this.fetchVPNInfo.EZpvd(c);
        this.ejfBZ = fEZpvd;
        this.values = java.lang.Math.max(this.DbNXlk, fEZpvd);
        valueOf();
        this.AYXKKw = this.gEmmrt >= this.AkhnZx ? 1 : -1;
        this.isConnected = this.EZpvd;
        this.EZpvd = 0.0f;
    }

    public float AEQbTJ() {
        copydefault();
        return this.AhwBna;
    }

    public float KWHzl() {
        copydefault();
        return this.values;
    }

    public final void valueOf() {
        this.valueOf = null;
        int i = 0;
        while (true) {
            C57856yqM[] c57856yqMArr = this.OLrzqt;
            if (i >= c57856yqMArr.length) {
                break;
            }
            C57856yqM.Activity activityKWHzl = c57856yqMArr[i].KWHzl(this.djBIcL, this.fJNWhG, this.fetchVPNInfo.copydefault());
            if (activityKWHzl != null) {
                this.valueOf = this.OLrzqt[i].OLrzqt();
                this.AkhnZx = activityKWHzl.copydefault;
                this.gEmmrt = activityKWHzl.AEQbTJ;
            }
            i++;
        }
        if (this.valueOf == null) {
            char c = this.djBIcL;
            char c2 = this.fJNWhG;
            if (c == c2) {
                this.valueOf = new char[]{c};
                this.gEmmrt = 0;
                this.AkhnZx = 0;
            } else {
                this.valueOf = new char[]{c, c2};
                this.AkhnZx = 0;
                this.gEmmrt = 1;
            }
        }
    }

    public void EZpvd() {
        copydefault();
        this.values = this.AhwBna;
    }

    public final void copydefault() {
        float fEZpvd = this.fetchVPNInfo.EZpvd(this.fJNWhG);
        float f = this.AhwBna;
        float f2 = this.ejfBZ;
        if (f != f2 || f2 == fEZpvd) {
            return;
        }
        this.ejfBZ = fEZpvd;
        this.AhwBna = fEZpvd;
        this.values = fEZpvd;
    }

    public void EZpvd(float f) {
        if (f == 1.0f) {
            this.djBIcL = this.fJNWhG;
            this.EZpvd = 0.0f;
            this.isConnected = 0.0f;
        }
        float fAEQbTJ = this.fetchVPNInfo.AEQbTJ();
        float fAbs = ((java.lang.Math.abs(this.gEmmrt - this.AkhnZx) * fAEQbTJ) * f) / fAEQbTJ;
        int i = (int) fAbs;
        float f2 = this.isConnected;
        int i2 = this.AYXKKw;
        this.KWHzl = ((fAbs - i) * fAEQbTJ * i2) + (f2 * (1.0f - f));
        this.AEQbTJ = this.AkhnZx + (i * i2);
        this.copydefault = fAEQbTJ;
        float f3 = this.DbNXlk;
        this.AhwBna = f3 + ((this.ejfBZ - f3) * f);
    }

    public void AEQbTJ(android.graphics.Canvas canvas, android.graphics.Paint paint) {
        if (EZpvd(canvas, paint, this.valueOf, this.AEQbTJ, this.KWHzl)) {
            int i = this.AEQbTJ;
            if (i >= 0) {
                this.djBIcL = this.valueOf[i];
            }
            this.EZpvd = this.KWHzl;
        }
        EZpvd(canvas, paint, this.valueOf, this.AEQbTJ + 1, this.KWHzl - this.copydefault);
        EZpvd(canvas, paint, this.valueOf, this.AEQbTJ - 1, this.KWHzl + this.copydefault);
    }

    public final boolean EZpvd(android.graphics.Canvas canvas, android.graphics.Paint paint, char[] cArr, int i, float f) {
        if (i < 0 || i >= cArr.length) {
            return false;
        }
        canvas.drawText(cArr, i, 1, 0.0f, f, paint);
        return true;
    }
}

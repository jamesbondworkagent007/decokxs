package o;

import androidx.camera.video.AudioStats;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.arK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7832arK implements java.lang.Cloneable {
    public java.lang.String AEQbTJ;
    public double AYXKKw;
    public double AhwBna;
    public java.lang.String DbNXlk;
    public int EZpvd;
    public double KWHzl;
    public boolean OLrzqt;
    public double copydefault;
    public double djBIcL;
    public long gEmmrt;
    public double isConnected;
    public double valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.DbNXlk = null;
        this.EZpvd = 0;
        this.AEQbTJ = null;
        this.KWHzl = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.gEmmrt = 0L;
        this.valueOf = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.copydefault = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.AhwBna = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.djBIcL = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.OLrzqt = false;
    }

    public void KWHzl(java.lang.String str) {
        EZpvd();
        this.DbNXlk = str;
        this.gEmmrt = OLrzqt();
    }

    public void djBIcL() {
        long jOLrzqt = OLrzqt();
        this.AYXKKw = (jOLrzqt - this.gEmmrt) / 1000000.0d;
        this.gEmmrt = jOLrzqt;
    }

    public void KWHzl() {
        long jOLrzqt = OLrzqt();
        this.KWHzl = (jOLrzqt - this.gEmmrt) / 1000000.0d;
        this.gEmmrt = jOLrzqt;
    }

    public void AEQbTJ(C8016auk c8016auk) {
        if (c8016auk != null) {
            this.EZpvd = c8016auk.AYXKKw() + 1;
            if (C7326ahi.EZpvd) {
                this.AEQbTJ = c8016auk.EZpvd();
            }
        }
        long jOLrzqt = OLrzqt();
        this.valueOf = (jOLrzqt - this.gEmmrt) / 1000000.0d;
        this.gEmmrt = jOLrzqt;
    }

    public void valueOf() {
        long jOLrzqt = OLrzqt();
        this.AhwBna = (jOLrzqt - this.gEmmrt) / 1000000.0d;
        this.gEmmrt = jOLrzqt;
    }

    public void copydefault() {
        long jOLrzqt = OLrzqt();
        this.copydefault = (jOLrzqt - this.gEmmrt) / 1000000.0d;
        this.gEmmrt = jOLrzqt;
    }

    public void copydefault(boolean z) {
        this.OLrzqt = z;
        double dOLrzqt = (OLrzqt() - this.gEmmrt) / 1000000.0d;
        this.djBIcL = dOLrzqt;
        this.isConnected = dOLrzqt + this.copydefault + this.AhwBna + this.valueOf + this.KWHzl;
    }

    public void EZpvd(java.io.PrintStream printStream) {
        if (C7326ahi.EZpvd) {
            KWHzl(AEQbTJ(), printStream);
        }
    }

    public java.lang.String AEQbTJ() {
        java.lang.Object[] objArr = new java.lang.Object[11];
        objArr[0] = this.DbNXlk;
        objArr[1] = java.lang.Integer.valueOf(this.EZpvd);
        objArr[2] = java.lang.String.valueOf(this.AEQbTJ);
        objArr[3] = java.lang.Double.valueOf(this.AYXKKw);
        objArr[4] = java.lang.Double.valueOf(this.KWHzl);
        objArr[5] = java.lang.Double.valueOf(this.valueOf);
        objArr[6] = java.lang.Double.valueOf(this.copydefault);
        objArr[7] = java.lang.Double.valueOf(this.AhwBna);
        objArr[8] = java.lang.Double.valueOf(this.djBIcL);
        objArr[9] = java.lang.Double.valueOf(this.isConnected);
        objArr[10] = Globals.OLrzqt() ? "32" : "64";
        return java.lang.String.format("------Lua page executed. \nurl: %s\n\nload file : %d \t type: %s\nglobal prepare cast: %.2f\nprepare env cast: %.2f\nload cast: %.2f\ncompile cast: %.2f\nthread switch cast: %.2f\nexecuted cast: %.2f\ntotal: %.2f\narm: %s\n", objArr);
    }

    public void KWHzl(java.lang.String str, java.io.PrintStream printStream) {
        if (C7326ahi.EZpvd && printStream != null) {
            printStream.print(str);
            printStream.println();
        }
    }

    public static final long OLrzqt() {
        return java.lang.System.nanoTime();
    }
}

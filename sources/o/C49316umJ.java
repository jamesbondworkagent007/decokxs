package o;

import android.graphics.Paint;
import androidx.camera.video.AudioStats;
import androidx.core.view.ViewCompat;

/* JADX INFO: renamed from: o.umJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public class C49316umJ {
    public float djBIcL;
    public float gEmmrt;
    public java.lang.String valueOf;
    public float values;
    public int KWHzl = 50;
    public double copydefault = 20.0d;
    public int OLrzqt = ViewCompat.MEASURED_STATE_MASK;
    public int EZpvd = 0;
    public Paint.Style AYXKKw = Paint.Style.FILL;
    public int isConnected = 0;
    public int AhwBna = -1;
    public C49312umF AEQbTJ = new C49312umF(0.0f, 0.0f, AudioStats.AUDIO_AMPLITUDE_NONE);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C49312umF AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C49316umJ AEQbTJ(int i) {
        this.KWHzl = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int AYXKKw() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float AhwBna() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double AkhnZx() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Paint.Style DbNXlk() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C49316umJ KWHzl(double d) {
        this.copydefault = d;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C49316umJ KWHzl(int i) {
        this.OLrzqt = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C49316umJ OLrzqt(C49312umF c49312umF) {
        this.AEQbTJ = c49312umF;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int djBIcL() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public float valueOf() {
        return this.gEmmrt;
    }

    public C49316umJ(java.lang.String str) {
        this.valueOf = str;
    }

    public C49316umJ AEQbTJ(double d) {
        this.AEQbTJ.AEQbTJ(d);
        return this;
    }
}

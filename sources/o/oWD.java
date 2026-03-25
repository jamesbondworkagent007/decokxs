package o;

import androidx.camera.video.AudioStats;
import com.okinc.kline.library.layout.ChartArea;

/* JADX INFO: loaded from: classes8.dex */
public class oWD extends oWC {
    public final C36246oUr AEQbTJ;
    public double EZpvd;
    public final ChartArea KWHzl;
    public int OLrzqt;
    public double djBIcL;
    public double gEmmrt;

    public oWD(java.lang.String str) {
        super(str);
        C36246oUr c36246oUrCopydefault = C36246oUr.copydefault();
        this.AEQbTJ = c36246oUrCopydefault;
        this.KWHzl = c36246oUrCopydefault.values().get(EZpvd());
        this.gEmmrt = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.djBIcL = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.EZpvd = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.OLrzqt = 0;
    }

    @Override // o.oWC
    public void AEQbTJ(C36305oWw c36305oWw, java.lang.String str, java.lang.String str2) {
        double d;
        if (this.KWHzl == null) {
            return;
        }
        if (!this.isConnected.isEmpty() && this.gEmmrt == this.hDKMBd && this.djBIcL == AkhnZx() && this.EZpvd == DbNXlk() && this.OLrzqt == this.KWHzl.djBIcL()) {
            return;
        }
        this.isConnected.clear();
        int iAEQbTJ = AEQbTJ(10.0d);
        int iDjBIcL = this.KWHzl.djBIcL();
        int i = iAEQbTJ << 2;
        if (i > iDjBIcL) {
            return;
        }
        double dMax = java.lang.Math.max(AkhnZx(), -1000.0d);
        double dDbNXlk = DbNXlk();
        double dCeil = java.lang.Math.ceil(dMax / 10.0d) * 10.0d;
        if (dCeil == AudioStats.AUDIO_AMPLITUDE_NONE) {
            dCeil = 0.0d;
        }
        int iKWHzl = AbstractC36302oWt.KWHzl(24.0f);
        int iKWHzl2 = AbstractC36302oWt.KWHzl(8.0f);
        if (i < iKWHzl) {
            do {
                if (dCeil == 20.0d || dCeil == 50.0d || dCeil == 80.0d) {
                    this.isConnected.add(java.lang.Double.valueOf(dCeil));
                }
                dCeil += 10.0d;
            } while (dCeil <= java.lang.Math.min(dDbNXlk, 80.0d));
        } else {
            do {
                if (iAEQbTJ < iKWHzl2) {
                    if (dCeil == 20.0d || dCeil == 50.0d || dCeil == 80.0d) {
                        this.isConnected.add(java.lang.Double.valueOf(dCeil));
                    }
                    d = 10.0d;
                } else {
                    if (dCeil == AudioStats.AUDIO_AMPLITUDE_NONE || dCeil == 20.0d || dCeil == 50.0d || dCeil == 80.0d || dCeil == 100.0d) {
                        this.isConnected.add(java.lang.Double.valueOf(dCeil));
                    }
                    d = 10.0d;
                }
                dCeil += d;
            } while (dCeil <= java.lang.Math.min(dDbNXlk, 100.0d));
        }
        this.gEmmrt = this.hDKMBd;
        this.djBIcL = AkhnZx();
        this.EZpvd = DbNXlk();
        this.OLrzqt = iDjBIcL;
    }
}

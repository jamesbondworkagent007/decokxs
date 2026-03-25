package o;

import androidx.camera.video.AudioStats;

/* JADX INFO: renamed from: o.aeM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7145aeM {
    public static final java.util.Comparator<C7145aeM> OLrzqt = new java.util.Comparator<C7145aeM>() { // from class: o.aeM.4
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public int compare(C7145aeM c7145aeM, C7145aeM c7145aeM2) {
            return c7145aeM.EZpvd - c7145aeM2.EZpvd;
        }
    };
    public int AEQbTJ;
    public C7167aei AhwBna;
    public int EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String copydefault;
    public java.lang.String gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void AEQbTJ() {
        this.AhwBna = null;
        this.EZpvd = 0;
        this.AEQbTJ = 0;
        this.copydefault = null;
        this.gEmmrt = null;
        this.KWHzl = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.EZpvd > 0 && (this.AEQbTJ & 256) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean copydefault() {
        if (this.AhwBna == null) {
            int i = this.AEQbTJ;
            if ((i & 64) == 0 && (i & 128) == 0) {
                return false;
            }
        }
        return true;
    }

    public C7145aeM() {
        AEQbTJ();
    }

    public void EZpvd(C7145aeM c7145aeM) {
        C7167aei c7167aei = c7145aeM.AhwBna;
        this.AhwBna = c7167aei == null ? null : (C7167aei) c7167aei.OLrzqt();
        this.EZpvd = c7145aeM.EZpvd;
        this.AEQbTJ = c7145aeM.AEQbTJ;
        this.copydefault = c7145aeM.copydefault;
        this.gEmmrt = c7145aeM.gEmmrt;
        this.KWHzl = c7145aeM.KWHzl;
    }

    public void copydefault(C7031acE c7031acE) {
        this.EZpvd = c7031acE.AEQbTJ();
    }

    public void KWHzl() {
        C7167aei c7167aei = this.AhwBna;
        if (c7167aei == null || (this.AEQbTJ & 1) == 0) {
            return;
        }
        c7167aei.gEmmrt();
    }

    public java.lang.Number OLrzqt(int i) {
        int i2 = this.AEQbTJ;
        boolean z = (i2 & 64) != 0;
        boolean z2 = (i2 & 128) != 0;
        boolean z3 = (i & 4096) != 0;
        boolean z4 = (i & 16) != 0;
        if (z) {
            return java.lang.Double.valueOf(Double.NaN);
        }
        if (z2) {
            if ((i2 & 1) != 0) {
                return java.lang.Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return java.lang.Double.valueOf(Double.POSITIVE_INFINITY);
        }
        if (this.AhwBna.valueOf() && this.AhwBna.copydefault() && !z4) {
            return java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        }
        if (this.AhwBna.AkhnZx() && !z3) {
            return java.lang.Long.valueOf(this.AhwBna.EZpvd(false));
        }
        return this.AhwBna.AhwBna();
    }

    public boolean copydefault(C7145aeM c7145aeM) {
        return OLrzqt.compare(this, c7145aeM) > 0;
    }
}

package o;

import androidx.camera.video.AudioStats;

/* JADX INFO: renamed from: o.abM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7012abM {
    public transient double AYXKKw;
    public long AhwBna;
    public double AkhnZx;
    public transient double AuCTel;
    public transient double DbNXlk;
    public transient TaskDescription ejfBZ;
    public transient double fARcdN;
    public transient double fIwbmz;
    public transient double fJNWhG;
    public transient double fetchVPNInfo;
    public transient double getFieldNames;
    public long hDKMBd;
    public double isConnected;
    public transient double values;
    public static final StateListAnimator gEmmrt = new StateListAnimator(AudioStats.AUDIO_AMPLITUDE_NONE);
    public static final StateListAnimator djBIcL = new StateListAnimator(1.5707963267948966d);
    public static final StateListAnimator copydefault = new StateListAnimator(3.141592653589793d);
    public static final StateListAnimator valueOf = new StateListAnimator(4.71238898038469d);
    public static final Activity AEQbTJ = new Activity(AudioStats.AUDIO_AMPLITUDE_NONE);
    public static final Activity EZpvd = new Activity(1.5707963267948966d);
    public static final Activity OLrzqt = new Activity(3.141592653589793d);
    public static final Activity KWHzl = new Activity(4.71238898038469d);

    /* JADX INFO: renamed from: o.abM$ActionBar */
    public interface ActionBar {
        double EZpvd();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public double AEQbTJ() {
        if (this.DbNXlk == Double.MIN_VALUE) {
            this.DbNXlk = (this.hDKMBd + 210866760000000L) / 8.64E7d;
        }
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt() {
        this.DbNXlk = Double.MIN_VALUE;
        this.fetchVPNInfo = Double.MIN_VALUE;
        this.getFieldNames = Double.MIN_VALUE;
        this.values = Double.MIN_VALUE;
        this.fJNWhG = Double.MIN_VALUE;
        this.AuCTel = Double.MIN_VALUE;
        this.AYXKKw = Double.MIN_VALUE;
        this.fIwbmz = Double.MIN_VALUE;
        this.fARcdN = Double.MIN_VALUE;
        this.ejfBZ = null;
    }

    public C7012abM() {
        this(java.lang.System.currentTimeMillis());
    }

    public C7012abM(long j) {
        this.AkhnZx = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.isConnected = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.AhwBna = 0L;
        this.DbNXlk = Double.MIN_VALUE;
        this.fetchVPNInfo = Double.MIN_VALUE;
        this.getFieldNames = Double.MIN_VALUE;
        this.values = Double.MIN_VALUE;
        this.fJNWhG = Double.MIN_VALUE;
        this.AuCTel = Double.MIN_VALUE;
        this.AYXKKw = Double.MIN_VALUE;
        this.fARcdN = Double.MIN_VALUE;
        this.fIwbmz = Double.MIN_VALUE;
        this.ejfBZ = null;
        this.hDKMBd = j;
    }

    public void EZpvd(long j) {
        this.hDKMBd = j;
        OLrzqt();
    }

    public final TaskDescription AEQbTJ(double d, double d2) {
        double dCopydefault = copydefault();
        double dSin = java.lang.Math.sin(dCopydefault);
        double dCos = java.lang.Math.cos(dCopydefault);
        double dSin2 = java.lang.Math.sin(d);
        return new TaskDescription(java.lang.Math.atan2((dSin2 * dCos) - (java.lang.Math.tan(d2) * dSin), java.lang.Math.cos(d)), java.lang.Math.asin((java.lang.Math.sin(d2) * dCos) + (java.lang.Math.cos(d2) * dSin * dSin2)));
    }

    public double djBIcL() {
        if (this.getFieldNames == Double.MIN_VALUE) {
            double[] dArrKWHzl = KWHzl(AEQbTJ());
            this.getFieldNames = dArrKWHzl[0];
            this.values = dArrKWHzl[1];
        }
        return this.getFieldNames;
    }

    public double[] KWHzl(double d) {
        double dEZpvd = EZpvd((EZpvd((d - 2447891.5d) * 0.017202791632524146d) + 4.87650757829735d) - 4.935239984568769d);
        return new double[]{EZpvd(KWHzl(dEZpvd, 0.016713d) + 4.935239984568769d), dEZpvd};
    }

    /* JADX INFO: renamed from: o.abM$StateListAnimator */
    public static class StateListAnimator {
        public double copydefault;

        public StateListAnimator(double d) {
            this.copydefault = d;
        }
    }

    public long AEQbTJ(double d, boolean z) {
        return OLrzqt(new ActionBar() { // from class: o.abM.4
            @Override // o.C7012abM.ActionBar
            public double EZpvd() {
                return C7012abM.this.djBIcL();
            }
        }, d, 365.242191d, 60000L, z);
    }

    public long EZpvd(StateListAnimator stateListAnimator, boolean z) {
        return AEQbTJ(stateListAnimator.copydefault, z);
    }

    public TaskDescription EZpvd() {
        if (this.ejfBZ == null) {
            double dDjBIcL = djBIcL();
            double dAEQbTJ = AEQbTJ() - 2447891.5d;
            double dEZpvd = EZpvd((0.22997150421858628d * dAEQbTJ) + 5.556284436750021d);
            double dEZpvd2 = EZpvd((dEZpvd - (0.001944368345221015d * dAEQbTJ)) - 0.6342598060246725d);
            double dSin = java.lang.Math.sin(((dEZpvd - dDjBIcL) * 2.0d) - dEZpvd2) * 0.022233749341155764d;
            double dSin2 = java.lang.Math.sin(this.values) * 0.003242821750205464d;
            double dSin3 = dEZpvd2 + ((dSin - dSin2) - (java.lang.Math.sin(this.values) * 0.00645771823237902d));
            double dSin4 = (((dEZpvd + dSin) + (java.lang.Math.sin(dSin3) * 0.10975677534091541d)) - dSin2) + (java.lang.Math.sin(dSin3 * 2.0d) * 0.0037350045992678655d);
            this.fJNWhG = dSin4;
            this.fJNWhG += java.lang.Math.sin((dSin4 - dDjBIcL) * 2.0d) * 0.011489502465878671d;
            double dEZpvd3 = EZpvd(5.559050068029439d - (dAEQbTJ * 9.242199067718253E-4d)) - (java.lang.Math.sin(this.values) * 0.0027925268031909274d);
            double dSin5 = java.lang.Math.sin(this.fJNWhG - dEZpvd3);
            this.AuCTel = java.lang.Math.atan2(java.lang.Math.cos(0.08980357792017056d) * dSin5, java.lang.Math.cos(this.fJNWhG - dEZpvd3)) + dEZpvd3;
            this.ejfBZ = AEQbTJ(this.AuCTel, java.lang.Math.asin(dSin5 * java.lang.Math.sin(0.08980357792017056d)));
        }
        return this.ejfBZ;
    }

    public double KWHzl() {
        EZpvd();
        return EZpvd(this.AuCTel - this.getFieldNames);
    }

    /* JADX INFO: renamed from: o.abM$Activity */
    public static class Activity {
        public double AEQbTJ;

        public Activity(double d) {
            this.AEQbTJ = d;
        }
    }

    public long KWHzl(double d, boolean z) {
        return OLrzqt(new ActionBar() { // from class: o.abM.2
            @Override // o.C7012abM.ActionBar
            public double EZpvd() {
                return C7012abM.this.KWHzl();
            }
        }, d, 29.530588853d, 60000L, z);
    }

    public long KWHzl(Activity activity, boolean z) {
        return KWHzl(activity.AEQbTJ, z);
    }

    public final long OLrzqt(ActionBar actionBar, double d, double d2, long j, boolean z) {
        double dEZpvd = actionBar.EZpvd();
        double d3 = 8.64E7d * d2;
        double dEZpvd2 = ((EZpvd(d - dEZpvd) + (z ? AudioStats.AUDIO_AMPLITUDE_NONE : -6.283185307179586d)) * d3) / 6.283185307179586d;
        long j2 = this.hDKMBd;
        EZpvd(((long) dEZpvd2) + j2);
        while (true) {
            double dEZpvd3 = actionBar.EZpvd();
            double dAbs = java.lang.Math.abs(dEZpvd2 / copydefault(dEZpvd3 - dEZpvd)) * copydefault(d - dEZpvd3);
            if (java.lang.Math.abs(dAbs) > java.lang.Math.abs(dEZpvd2)) {
                long j3 = (long) (d3 / 8.0d);
                if (!z) {
                    j3 = -j3;
                }
                EZpvd(j2 + j3);
                return OLrzqt(actionBar, d, d2, j, z);
            }
            EZpvd(this.hDKMBd + ((long) dAbs));
            if (java.lang.Math.abs(dAbs) <= j) {
                return this.hDKMBd;
            }
            dEZpvd2 = dAbs;
            dEZpvd = dEZpvd3;
        }
    }

    public static final double EZpvd(double d, double d2) {
        return d - (d2 * java.lang.Math.floor(d / d2));
    }

    public static final double EZpvd(double d) {
        return EZpvd(d, 6.283185307179586d);
    }

    public static final double copydefault(double d) {
        return EZpvd(d + 3.141592653589793d, 6.283185307179586d) - 3.141592653589793d;
    }

    public final double KWHzl(double d, double d2) {
        double dSin;
        double dCos = d;
        do {
            dSin = (dCos - (java.lang.Math.sin(dCos) * d2)) - d;
            dCos -= dSin / (1.0d - (java.lang.Math.cos(dCos) * d2));
        } while (java.lang.Math.abs(dSin) > 1.0E-5d);
        return java.lang.Math.atan(java.lang.Math.tan(dCos / 2.0d) * java.lang.Math.sqrt((d2 + 1.0d) / (1.0d - d2))) * 2.0d;
    }

    public final double copydefault() {
        if (this.AYXKKw == Double.MIN_VALUE) {
            double dAEQbTJ = (AEQbTJ() - 2451545.0d) / 36525.0d;
            this.AYXKKw = (((23.439292d - (0.013004166666666666d * dAEQbTJ)) - ((1.6666666666666665E-7d * dAEQbTJ) * dAEQbTJ)) + (5.027777777777778E-7d * dAEQbTJ * dAEQbTJ * dAEQbTJ)) * 0.017453292519943295d;
        }
        return this.AYXKKw;
    }

    /* JADX INFO: renamed from: o.abM$TaskDescription */
    public static final class TaskDescription {
        public final double AEQbTJ;
        public final double copydefault;

        public TaskDescription(double d, double d2) {
            this.copydefault = d;
            this.AEQbTJ = d2;
        }

        public java.lang.String toString() {
            return java.lang.Double.toString(this.copydefault * 57.29577951308232d) + "," + (this.AEQbTJ * 57.29577951308232d);
        }
    }
}

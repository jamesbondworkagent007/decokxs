package o;

import androidx.camera.video.AudioStats;
import java.math.RoundingMode;

/* JADX INFO: renamed from: o.uCb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48022uCb {
    public static final C48022uCb copydefault = new C48022uCb();

    private C48022uCb() {
    }

    public static /* synthetic */ kotlin.Pair calculateMinMaxLimits$default(C48022uCb c48022uCb, C48023uCc c48023uCc, float f, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            f = 0.2f;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return c48022uCb.copydefault(c48023uCc, f, z);
    }

    public final kotlin.Pair<java.lang.Float, java.lang.Float> copydefault(C48023uCc c48023uCc, float f, boolean z) {
        float f2;
        float fEZpvd;
        double dAEQbTJ = C33129mqd.AEQbTJ(c48023uCc != null ? c48023uCc.KWHzl() : null);
        double dAEQbTJ2 = C33129mqd.AEQbTJ(c48023uCc != null ? c48023uCc.OLrzqt() : null);
        double d = 0;
        if (java.lang.Double.compare(dAEQbTJ2, d) != 0 || java.lang.Double.compare(dAEQbTJ, d) != 0) {
            double d2 = dAEQbTJ2 - dAEQbTJ;
            if (d2 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                double d3 = d2 * ((double) f);
                double dAbs = java.lang.Math.abs(dAEQbTJ) + d3;
                double dAbs2 = java.lang.Math.abs(dAEQbTJ2) + d3;
                if (z) {
                    f2 = -EZpvd(dAbs);
                    fEZpvd = EZpvd(dAbs2);
                } else {
                    f2 = -((float) dAbs);
                    fEZpvd = (float) dAbs2;
                }
            } else {
                double d4 = 0.05f;
                return C56390yDp.OLrzqt(java.lang.Float.valueOf((float) OLrzqt(java.lang.Math.abs(dAEQbTJ) - (java.lang.Math.abs(dAEQbTJ) * d4))), java.lang.Float.valueOf((float) OLrzqt(java.lang.Math.abs(dAEQbTJ2) + (java.lang.Math.abs(dAEQbTJ2) * d4))));
            }
        } else if (z) {
            f2 = -1.0f;
            fEZpvd = 1.0f;
        } else {
            f2 = -100.0f;
            fEZpvd = 100.0f;
        }
        if (C33129mqd.AhwBna(java.lang.Float.valueOf(f2), 0) && C33129mqd.gEmmrt(java.lang.Float.valueOf(java.lang.Math.abs(f2)), 1000) && !z) {
            f2 = -((float) OLrzqt(C33129mqd.AEQbTJ(java.lang.Float.valueOf(java.lang.Math.abs(f2)))));
        }
        if (C33129mqd.AhwBna(java.lang.Float.valueOf(fEZpvd), 0) && C33129mqd.gEmmrt(java.lang.Float.valueOf(fEZpvd), 1000) && !z) {
            fEZpvd = (float) OLrzqt(C33129mqd.AEQbTJ(java.lang.Float.valueOf(fEZpvd)));
        }
        return C56390yDp.OLrzqt(java.lang.Float.valueOf(f2), java.lang.Float.valueOf(fEZpvd));
    }

    public final float EZpvd(double d) {
        return C33129mqd.djBIcL(java.lang.Double.valueOf((C33129mqd.AEQbTJ(C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(java.lang.Math.abs(d)), java.lang.Float.valueOf(100.0f), null, null, null, 14, null))).setScale(0, RoundingMode.UP)) * (java.lang.Math.signum(d) == java.lang.Math.signum(AudioStats.AUDIO_AMPLITUDE_NONE) ? 1.0d : java.lang.Math.signum(d))) / ((double) 100.0f)));
    }

    public final double OLrzqt(double d) {
        return C33129mqd.AEQbTJ(C33129mqd.EZpvd(java.lang.Double.valueOf(d / 10.0d)).setScale(0, RoundingMode.UP)) * ((double) 10);
    }

    public static /* synthetic */ float roundToNiceNumber$default(C48022uCb c48022uCb, float f, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return c48022uCb.copydefault(f, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float copydefault(float f, boolean z) {
        float f2;
        if (f == 0.0f) {
            return 0.0f;
        }
        int i = f >= 0.0f ? 1 : -1;
        float fAbs = java.lang.Math.abs(f);
        float f3 = 1.0f;
        float f4 = 1.0f;
        while (true) {
            f2 = 10;
            float f5 = f4 * f2;
            if (f5 > fAbs) {
                break;
            }
            f4 = f5;
        }
        while (f4 > fAbs) {
            f4 /= f2;
        }
        float f6 = fAbs / f4;
        if (z) {
            if (f6 > 1.0f) {
                f3 = f6 <= 2.0f ? 2.0f : f6 <= 5.0f ? 5.0f : 10.0f;
            }
        } else if (f6 >= 1.0f && f6 >= 2.0f) {
            if (f6 < 5.0f) {
            }
        }
        return i * f3 * f4;
    }
}

package o;

import androidx.camera.video.AudioStats;
import com.okinc.planet.serializer.PlanetNumericString;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tWb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46485tWb {
    public static final C46485tWb copydefault = new C46485tWb();
    public static final java.lang.String[] KWHzl = {"", "k", com.ibm.icu.text.DateFormat.MINUTE, "b", "t"};
    public static final int OLrzqt = 8;

    private C46485tWb() {
    }

    /* JADX INFO: renamed from: makePretty-HYcmJmU$default, reason: not valid java name */
    public static /* synthetic */ java.lang.String m8769makePrettyHYcmJmU$default(C46485tWb c46485tWb, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        return c46485tWb.AEQbTJ(str, i);
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String plainString = C33129mqd.EZpvd(PlanetNumericString.OLrzqt(str)).abs().toPlainString();
        int i2 = 0;
        while (C33129mqd.copydefault((java.lang.Object) plainString, (java.lang.Object) 1000) && i2 < yDV.zLjUOn(KWHzl)) {
            plainString = C33129mqd.divS$default(plainString, 1000, null, null, null, 14, null);
            i2++;
        }
        java.lang.String plainString2 = C33129mqd.EZpvd(plainString).setScale(i, RoundingMode.HALF_UP).toPlainString();
        java.lang.String str2 = "%s%s";
        if (C33129mqd.gEmmrt(PlanetNumericString.OLrzqt(str), 0)) {
            str2 = "-%s%s";
        }
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        java.lang.String str3 = java.lang.String.format(str2, java.util.Arrays.copyOf(new java.lang.Object[]{plainString2, KWHzl[i2]}, 2));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        return str3;
    }

    public final kotlin.Pair<java.lang.Float, java.lang.Float> KWHzl(C46492tWi c46492tWi, float f, boolean z) {
        double dAbs;
        double dAbs2;
        float f2;
        float fEZpvd;
        double dAEQbTJ = C33129mqd.AEQbTJ(c46492tWi != null ? c46492tWi.OLrzqt() : null);
        double dAEQbTJ2 = C33129mqd.AEQbTJ(c46492tWi != null ? c46492tWi.copydefault() : null);
        double d = 0;
        if (java.lang.Double.compare(dAEQbTJ2, d) != 0 || java.lang.Double.compare(dAEQbTJ, d) != 0) {
            double d2 = dAEQbTJ2 - dAEQbTJ;
            if (d2 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                double d3 = d2 * ((double) f);
                dAbs = java.lang.Math.abs(dAEQbTJ) + d3;
                dAbs2 = java.lang.Math.abs(dAEQbTJ2) + d3;
            } else {
                double dAbs3 = java.lang.Math.abs(dAEQbTJ);
                dAbs2 = dAbs3 + (((double) f) * dAbs3);
                dAbs = 0.0d;
            }
            if (z) {
                f2 = -EZpvd(dAbs);
                fEZpvd = EZpvd(dAbs2);
            } else if (dAEQbTJ >= AudioStats.AUDIO_AMPLITUDE_NONE || d2 != AudioStats.AUDIO_AMPLITUDE_NONE) {
                f2 = -((float) dAbs);
                fEZpvd = (float) dAbs2;
            } else {
                f2 = -((float) dAbs2);
                fEZpvd = (float) dAbs;
            }
        } else if (z) {
            f2 = -1.0f;
            fEZpvd = 1.0f;
        } else {
            f2 = -100.0f;
            fEZpvd = 100.0f;
        }
        if (C33129mqd.AhwBna(java.lang.Float.valueOf(f2), 0) && C33129mqd.gEmmrt(java.lang.Float.valueOf(java.lang.Math.abs(f2)), 1000) && !z) {
            f2 = -((float) KWHzl(C33129mqd.AEQbTJ(java.lang.Float.valueOf(java.lang.Math.abs(f2)))));
        }
        if (C33129mqd.AhwBna(java.lang.Float.valueOf(fEZpvd), 0) && C33129mqd.gEmmrt(java.lang.Float.valueOf(fEZpvd), 1000) && !z) {
            fEZpvd = (float) KWHzl(C33129mqd.AEQbTJ(java.lang.Float.valueOf(fEZpvd)));
        }
        return C56390yDp.OLrzqt(java.lang.Float.valueOf(f2), java.lang.Float.valueOf(fEZpvd));
    }

    public final float EZpvd(double d) {
        return C33129mqd.djBIcL(java.lang.Double.valueOf((C33129mqd.AEQbTJ(C33129mqd.EZpvd(java.lang.Double.valueOf(C33129mqd.mulD$default(java.lang.Double.valueOf(java.lang.Math.abs(d)), java.lang.Float.valueOf(100.0f), null, null, null, 14, null))).setScale(0, RoundingMode.UP)) * (java.lang.Math.signum(d) == C33129mqd.AEQbTJ(java.lang.Float.valueOf(0.0f)) ? C33129mqd.AEQbTJ(java.lang.Float.valueOf(1.0f)) : java.lang.Math.signum(d))) / ((double) 100.0f)));
    }

    public final double KWHzl(double d) {
        return C33129mqd.AEQbTJ(C33129mqd.EZpvd(java.lang.Double.valueOf(d / 10.0d)).setScale(0, RoundingMode.UP)) * ((double) 10);
    }
}

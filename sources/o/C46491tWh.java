package o;

import com.okinc.planet.serializer.PlanetNumericString;

/* JADX INFO: renamed from: o.tWh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C46491tWh {
    public static final java.lang.String OLrzqt(float f) {
        if (java.lang.Math.abs(f) <= 1.0f) {
            return pTB.formatRoundToMax$default(C33129mqd.EZpvd(java.lang.Float.valueOf(f)), 2, null, 2, null);
        }
        return C46485tWb.m8769makePrettyHYcmJmU$default(C46485tWb.copydefault, PlanetNumericString.AEQbTJ(java.lang.String.valueOf(f)), 0, 2, null);
    }
}

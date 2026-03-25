package o;

import androidx.camera.video.AudioStats;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* JADX INFO: renamed from: o.xNj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54573xNj {
    public static final C54573xNj copydefault = new C54573xNj();

    private C54573xNj() {
    }

    public final int AEQbTJ(double d) {
        if (d == AudioStats.AUDIO_AMPLITUDE_NONE || d >= 1000000.0d) {
            return 0;
        }
        if (d >= 100000.0d) {
            return 1;
        }
        if (d >= 10000.0d || d >= 1000.0d || d >= 100.0d) {
            return 2;
        }
        if (d < 10.0d && d < 1.0d) {
            return AEQbTJ(d, 5);
        }
        return 4;
    }

    public final int AEQbTJ(double d, int i) {
        return new BigDecimal(d).round(new MathContext(i, RoundingMode.HALF_UP)).scale();
    }
}

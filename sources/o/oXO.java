package o;

import android.graphics.Color;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* JADX INFO: loaded from: classes8.dex */
public final class oXO {
    public static final oXO AEQbTJ = new oXO();
    public static final int OLrzqt = Color.parseColor("#81BE00");
    public static final int EZpvd = Color.parseColor("#FC46AB");
    public static final int KWHzl = Color.parseColor("#BCFF2F");
    public static final int gEmmrt = Color.parseColor("#FC46AB");
    public static final int copydefault = Color.parseColor("#07FF4D");
    public static final int djBIcL = Color.parseColor("#FC46AB");

    private oXO() {
    }

    public final oXS AEQbTJ(boolean z, boolean z2, boolean z3) {
        if (z3 && z2 && z) {
            int i = KWHzl;
            int i2 = OLrzqt;
            return new oXS(i, i, i2, i2, 0, -1, 127, 127);
        }
        if (z3 && z2 && !z) {
            int i3 = KWHzl;
            return new oXS(i3, i3, i3, i3, copydefault, ViewCompat.MEASURED_STATE_MASK, 0, 0, 192, null);
        }
        if (z3 && !z2 && z) {
            int i4 = EZpvd;
            return new oXS(i4, i4, i4, i4, 0, -1, 0, 0, 192, null);
        }
        if (z3 && !z2 && !z) {
            int i5 = gEmmrt;
            return new oXS(i5, i5, i5, i5, djBIcL, ViewCompat.MEASURED_STATE_MASK, 0, 0, 192, null);
        }
        if (!z3 && z2 && z) {
            int i6 = EZpvd;
            return new oXS(i6, i6, i6, i6, 0, -1, 0, 0, 192, null);
        }
        if (!z3 && z2 && !z) {
            int i7 = gEmmrt;
            return new oXS(i7, i7, i7, i7, djBIcL, ViewCompat.MEASURED_STATE_MASK, 0, 0, 192, null);
        }
        if (!z3 && !z2 && z) {
            int i8 = KWHzl;
            int i9 = OLrzqt;
            return new oXS(i8, i8, i9, i9, 0, -1, 127, 127);
        }
        if (!z3 && !z2 && !z) {
            int i10 = KWHzl;
            return new oXS(i10, i10, i10, i10, copydefault, ViewCompat.MEASURED_STATE_MASK, 0, 0, 192, null);
        }
        int i11 = KWHzl;
        return new oXS(i11, i11, i11, i11, 0, 0, 0, 0, PsExtractor.VIDEO_STREAM_MASK, null);
    }
}

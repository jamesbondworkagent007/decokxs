package o;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;

/* JADX INFO: renamed from: o.ivA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25351ivA {
    public static final C25351ivA KWHzl = new C25351ivA();

    private C25351ivA() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.Integer> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int i = C52761wXj.ActionBar.getPostValueLengthLimit;
        int i2 = C52761wXj.ActionBar.iPSTqm;
        int i3 = C52761wXj.ActionBar.dvImUD;
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        java.lang.Double dValueOf = java.lang.Double.valueOf(AudioStats.AUDIO_AMPLITUDE_NONE);
        return C23313hvq.KWHzl(java.lang.Double.valueOf(dAEQbTJ), dValueOf) ? C56390yDp.OLrzqt("-", java.lang.Integer.valueOf(i3)) : C23313hvq.OLrzqt(java.lang.Double.valueOf(C33129mqd.AEQbTJ(str)), dValueOf) ? C56390yDp.OLrzqt(Marker.ANY_NON_NULL_MARKER, java.lang.Integer.valueOf(i2)) : C56390yDp.OLrzqt("", java.lang.Integer.valueOf(i));
    }
}

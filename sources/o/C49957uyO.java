package o;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49957uyO {
    public static final C49957uyO AEQbTJ = new C49957uyO();

    private C49957uyO() {
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (str2.length() == 0 || C33129mqd.AEQbTJ(str2) == AudioStats.AUDIO_AMPLITUDE_NONE || pTB.AEQbTJ(str).remainder(pTB.AEQbTJ(str2)).doubleValue() == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return null;
        }
        double dDivD$default = C33129mqd.divD$default(str, str2, null, null, null, 14, null);
        return C56390yDp.OLrzqt(str2, C33129mqd.mulS$default(str2, java.lang.Integer.valueOf(dDivD$default < 1.0d ? 1 : (int) java.lang.Math.floor(dDivD$default)), null, null, null, 14, null));
    }

    public final java.lang.String[] OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        kotlin.Pair<java.lang.String, java.lang.String> pairCopydefault = copydefault(str, str2);
        if (pairCopydefault == null) {
            return null;
        }
        return xVK.EZpvd.EZpvd(pairCopydefault);
    }
}

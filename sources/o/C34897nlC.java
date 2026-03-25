package o;

import androidx.camera.video.AudioStats;
import com.okinc.market.ext.CryptoCellTagColor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nlC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C34897nlC {
    public static final CryptoCellTagColor AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
            return CryptoCellTagColor.UP;
        }
        if (dAEQbTJ < AudioStats.AUDIO_AMPLITUDE_NONE) {
            return CryptoCellTagColor.DOWN;
        }
        return CryptoCellTagColor.NATURAL;
    }
}

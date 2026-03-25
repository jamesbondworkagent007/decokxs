package o;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jKt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C25906jKt {
    public static final int EZpvd(@NotNull java.lang.String str, @NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(context, "");
        double dAEQbTJ = C33129mqd.AEQbTJ(str);
        if (dAEQbTJ > AudioStats.AUDIO_AMPLITUDE_NONE) {
            return C33508mxl.copydefault(context);
        }
        if (dAEQbTJ < AudioStats.AUDIO_AMPLITUDE_NONE) {
            return C33508mxl.AEQbTJ(context);
        }
        return C33070mpX.copydefault(C52761wXj.Activity.fdOvFl);
    }
}

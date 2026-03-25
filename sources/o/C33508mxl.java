package o;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33508mxl {
    public static /* synthetic */ int getRiseUpColor$default(android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return OLrzqt(context, f);
    }

    public static final int OLrzqt(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.EZpvd(context, f);
    }

    public static final int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.EZpvd(context, 1.0f);
    }

    public static /* synthetic */ int getFallDownColor$default(android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return KWHzl(context, f);
    }

    public static final int KWHzl(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.copydefault(context, f);
    }

    public static final int AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.copydefault(context, 1.0f);
    }

    public static /* synthetic */ int profitColor$default(android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return AhwBna(context, f);
    }

    public static final int AhwBna(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.AYXKKw(context, f);
    }

    public static /* synthetic */ int lossColor$default(android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return EZpvd(context, f);
    }

    public static final int EZpvd(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.AhwBna(context, f);
    }

    public static /* synthetic */ int profitAlternativeColor$default(android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return valueOf(context, f);
    }

    public static final int valueOf(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.gEmmrt(context, f);
    }

    public static /* synthetic */ int lossAlternativeColor$default(android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return AEQbTJ(context, f);
    }

    public static final int AEQbTJ(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.KWHzl(context, f);
    }

    public static /* synthetic */ int profitContentAlternativeColor$default(android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return gEmmrt(context, f);
    }

    public static final int gEmmrt(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.valueOf(context, f);
    }

    public static /* synthetic */ int lossContentAlternativeColor$default(android.content.Context context, float f, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return copydefault(context, f);
    }

    public static final int copydefault(@NotNull android.content.Context context, @androidx.annotation.FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, to = 1.0d) float f) {
        Intrinsics.checkNotNullParameter(context, "");
        return C33512mxp.AEQbTJ.djBIcL(context, f);
    }
}

package com.amplifyframework.ui.liveness.ui;

import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

/* JADX INFO: loaded from: classes2.dex */
public final class LivenessColorScheme {
    public static final int $stable = 0;
    public static final LivenessColorScheme INSTANCE = new LivenessColorScheme();

    private LivenessColorScheme() {
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final ColorScheme m6084default(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1519742421, i, -1, "com.amplifyframework.ui.liveness.ui.LivenessColorScheme.default (LivenessColorScheme.kt:35)");
        }
        ColorScheme colorSchemeM6083default = m6083default(DarkThemeKt.isSystemInDarkTheme(composer, 0));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return colorSchemeM6083default;
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    private final ColorScheme m6083default(boolean z) {
        if (z) {
            return Defaults.INSTANCE.getDarkColorScheme();
        }
        return Defaults.INSTANCE.getLightColorScheme();
    }

    public static final class Defaults {
        public static final int $stable = 0;
        public static final Defaults INSTANCE = new Defaults();
        private static final ColorScheme darkColorScheme;
        private static final ColorScheme lightColorScheme;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ColorScheme getDarkColorScheme() {
            return darkColorScheme;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ColorScheme getLightColorScheme() {
            return lightColorScheme;
        }

        private Defaults() {
        }

        static {
            long jColor = ColorKt.Color(4278484373L);
            Color.Companion companion = Color.Companion;
            lightColorScheme = ColorSchemeKt.m1618lightColorSchemeG1PFcw$default(jColor, companion.m3186getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, companion.m3186getWhite0d7_KjU(), ColorKt.Color(4279048486L), companion.m3186getWhite0d7_KjU(), ColorKt.Color(4279048486L), 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4287955972L), companion.m3186getWhite0d7_KjU(), ColorKt.Color(4290301689L), ColorKt.Color(4278198886L), 0L, 0L, 0L, 473833468, null);
            darkColorScheme = ColorSchemeKt.m1616darkColorSchemeG1PFcw$default(ColorKt.Color(4286437096L), ColorKt.Color(4279048486L), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4279048486L), companion.m3186getWhite0d7_KjU(), ColorKt.Color(4279048486L), companion.m3186getWhite0d7_KjU(), 0L, 0L, 0L, 0L, 0L, ColorKt.Color(4293889935L), ColorKt.Color(4279048486L), ColorKt.Color(4278465685L), ColorKt.Color(4293324542L), 0L, 0L, 0L, 473833468, null);
        }
    }
}

package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaColorChallengeElementConfig {
    public static final int $stable = 0;
    public final LcaRgbColorConfig color;
    public final float duration;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaColorChallengeElementConfig copy$default(LcaColorChallengeElementConfig lcaColorChallengeElementConfig, LcaRgbColorConfig lcaRgbColorConfig, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            lcaRgbColorConfig = lcaColorChallengeElementConfig.color;
        }
        if ((i & 2) != 0) {
            f = lcaColorChallengeElementConfig.duration;
        }
        return lcaColorChallengeElementConfig.copy(lcaRgbColorConfig, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaRgbColorConfig component1() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaColorChallengeElementConfig copy(@NotNull LcaRgbColorConfig lcaRgbColorConfig, float f) {
        Intrinsics.checkNotNullParameter(lcaRgbColorConfig, "");
        return new LcaColorChallengeElementConfig(lcaRgbColorConfig, f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaColorChallengeElementConfig)) {
            return false;
        }
        LcaColorChallengeElementConfig lcaColorChallengeElementConfig = (LcaColorChallengeElementConfig) obj;
        return Intrinsics.EZpvd(this.color, lcaColorChallengeElementConfig.color) && Float.compare(this.duration, lcaColorChallengeElementConfig.duration) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaRgbColorConfig getColor() {
        return this.color;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.color.hashCode() * 31) + Float.hashCode(this.duration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaColorChallengeElementConfig(color=" + this.color + ", duration=" + this.duration + ")";
    }

    public LcaColorChallengeElementConfig(@NotNull LcaRgbColorConfig lcaRgbColorConfig, float f) {
        Intrinsics.checkNotNullParameter(lcaRgbColorConfig, "");
        this.color = lcaRgbColorConfig;
        this.duration = f;
    }
}

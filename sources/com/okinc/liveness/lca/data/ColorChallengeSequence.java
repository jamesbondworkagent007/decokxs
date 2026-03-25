package com.okinc.liveness.lca.data;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ColorChallengeSequence {
    public static final int $stable = 8;
    private final List<ColorChallengeElement> challengeColors;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.liveness.lca.data.ColorChallengeSequence */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorChallengeSequence copy$default(ColorChallengeSequence colorChallengeSequence, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = colorChallengeSequence.challengeColors;
        }
        return colorChallengeSequence.copy(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorChallengeElement> component1() {
        return this.challengeColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeSequence copy(@NotNull List<ColorChallengeElement> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ColorChallengeSequence(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ColorChallengeSequence) && Intrinsics.EZpvd(this.challengeColors, ((ColorChallengeSequence) obj).challengeColors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorChallengeElement> getChallengeColors() {
        return this.challengeColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.challengeColors.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ColorChallengeSequence(challengeColors=" + this.challengeColors + ")";
    }

    public ColorChallengeSequence(@NotNull List<ColorChallengeElement> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.challengeColors = list;
    }
}

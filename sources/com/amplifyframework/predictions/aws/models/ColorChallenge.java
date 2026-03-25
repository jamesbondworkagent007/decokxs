package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.FaceLivenessSessionChallenge;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class ColorChallenge implements FaceLivenessSessionChallenge {
    private final List<ColorDisplayInformation> challengeColors;
    private final String challengeId;
    private final ColorChallengeType challengeType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.predictions.aws.models.ColorChallenge */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ColorChallenge copy$default(ColorChallenge colorChallenge, String str, ColorChallengeType colorChallengeType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = colorChallenge.challengeId;
        }
        if ((i & 2) != 0) {
            colorChallengeType = colorChallenge.challengeType;
        }
        if ((i & 4) != 0) {
            list = colorChallenge.challengeColors;
        }
        return colorChallenge.copy(str, colorChallengeType, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeType component2() {
        return this.challengeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorDisplayInformation> component3() {
        return this.challengeColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallenge copy(@NotNull String str, @NotNull ColorChallengeType colorChallengeType, @NotNull List<ColorDisplayInformation> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(colorChallengeType, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ColorChallenge(str, colorChallengeType, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorChallenge)) {
            return false;
        }
        ColorChallenge colorChallenge = (ColorChallenge) obj;
        return Intrinsics.EZpvd((Object) this.challengeId, (Object) colorChallenge.challengeId) && this.challengeType == colorChallenge.challengeType && Intrinsics.EZpvd(this.challengeColors, colorChallenge.challengeColors);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ColorDisplayInformation> getChallengeColors() {
        return this.challengeColors;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChallengeId() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeType getChallengeType() {
        return this.challengeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.challengeId.hashCode() * 31) + this.challengeType.hashCode()) * 31) + this.challengeColors.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ColorChallenge(challengeId=" + this.challengeId + ", challengeType=" + this.challengeType + ", challengeColors=" + this.challengeColors + ")";
    }

    public ColorChallenge(@NotNull String str, @NotNull ColorChallengeType colorChallengeType, @NotNull List<ColorDisplayInformation> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(colorChallengeType, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.challengeId = str;
        this.challengeType = colorChallengeType;
        this.challengeColors = list;
    }
}

package com.amplifyframework.predictions.aws.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class ColorChallengeResponse implements ChallengeResponseEvent {
    private final String challengeId;
    private final int colorSequenceIndex;
    private final RgbColor currentColor;
    private final Date currentColorStartTime;
    private final RgbColor previousColor;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ColorChallengeResponse copy$default(ColorChallengeResponse colorChallengeResponse, String str, RgbColor rgbColor, RgbColor rgbColor2, Date date, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = colorChallengeResponse.challengeId;
        }
        if ((i2 & 2) != 0) {
            rgbColor = colorChallengeResponse.currentColor;
        }
        RgbColor rgbColor3 = rgbColor;
        if ((i2 & 4) != 0) {
            rgbColor2 = colorChallengeResponse.previousColor;
        }
        RgbColor rgbColor4 = rgbColor2;
        if ((i2 & 8) != 0) {
            date = colorChallengeResponse.currentColorStartTime;
        }
        Date date2 = date;
        if ((i2 & 16) != 0) {
            i = colorChallengeResponse.colorSequenceIndex;
        }
        return colorChallengeResponse.copy(str, rgbColor3, rgbColor4, date2, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RgbColor component2() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RgbColor component3() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component4() {
        return this.currentColorStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.colorSequenceIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ColorChallengeResponse copy(@NotNull String str, @NotNull RgbColor rgbColor, RgbColor rgbColor2, @NotNull Date date, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rgbColor, "");
        Intrinsics.checkNotNullParameter(date, "");
        return new ColorChallengeResponse(str, rgbColor, rgbColor2, date, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ColorChallengeResponse)) {
            return false;
        }
        ColorChallengeResponse colorChallengeResponse = (ColorChallengeResponse) obj;
        return Intrinsics.EZpvd((Object) this.challengeId, (Object) colorChallengeResponse.challengeId) && Intrinsics.EZpvd(this.currentColor, colorChallengeResponse.currentColor) && Intrinsics.EZpvd(this.previousColor, colorChallengeResponse.previousColor) && Intrinsics.EZpvd(this.currentColorStartTime, colorChallengeResponse.currentColorStartTime) && this.colorSequenceIndex == colorChallengeResponse.colorSequenceIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.predictions.models.ChallengeResponseEvent
    public String getChallengeId() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getColorSequenceIndex() {
        return this.colorSequenceIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RgbColor getCurrentColor() {
        return this.currentColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getCurrentColorStartTime() {
        return this.currentColorStartTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RgbColor getPreviousColor() {
        return this.previousColor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.challengeId.hashCode();
        int iHashCode2 = this.currentColor.hashCode();
        RgbColor rgbColor = this.previousColor;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + (rgbColor == null ? 0 : rgbColor.hashCode())) * 31) + this.currentColorStartTime.hashCode()) * 31) + Integer.hashCode(this.colorSequenceIndex);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ColorChallengeResponse(challengeId=" + this.challengeId + ", currentColor=" + this.currentColor + ", previousColor=" + this.previousColor + ", currentColorStartTime=" + this.currentColorStartTime + ", colorSequenceIndex=" + this.colorSequenceIndex + ")";
    }

    public ColorChallengeResponse(@NotNull String str, @NotNull RgbColor rgbColor, RgbColor rgbColor2, @NotNull Date date, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rgbColor, "");
        Intrinsics.checkNotNullParameter(date, "");
        this.challengeId = str;
        this.currentColor = rgbColor;
        this.previousColor = rgbColor2;
        this.currentColorStartTime = date;
        this.colorSequenceIndex = i;
    }
}

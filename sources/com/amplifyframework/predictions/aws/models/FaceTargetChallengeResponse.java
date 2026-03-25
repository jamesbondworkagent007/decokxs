package com.amplifyframework.predictions.aws.models;

import android.graphics.RectF;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class FaceTargetChallengeResponse implements ChallengeResponseEvent {
    private final String challengeId;
    private final Date faceInTargetEndTimestamp;
    private final Date faceInTargetStartTimestamp;
    private final RectF targetLocation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceTargetChallengeResponse copy$default(FaceTargetChallengeResponse faceTargetChallengeResponse, String str, RectF rectF, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = faceTargetChallengeResponse.challengeId;
        }
        if ((i & 2) != 0) {
            rectF = faceTargetChallengeResponse.targetLocation;
        }
        if ((i & 4) != 0) {
            date = faceTargetChallengeResponse.faceInTargetStartTimestamp;
        }
        if ((i & 8) != 0) {
            date2 = faceTargetChallengeResponse.faceInTargetEndTimestamp;
        }
        return faceTargetChallengeResponse.copy(str, rectF, date, date2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF component2() {
        return this.targetLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component3() {
        return this.faceInTargetStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component4() {
        return this.faceInTargetEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceTargetChallengeResponse copy(@NotNull String str, @NotNull RectF rectF, @NotNull Date date, @NotNull Date date2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(date2, "");
        return new FaceTargetChallengeResponse(str, rectF, date, date2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceTargetChallengeResponse)) {
            return false;
        }
        FaceTargetChallengeResponse faceTargetChallengeResponse = (FaceTargetChallengeResponse) obj;
        return Intrinsics.EZpvd((Object) this.challengeId, (Object) faceTargetChallengeResponse.challengeId) && Intrinsics.EZpvd(this.targetLocation, faceTargetChallengeResponse.targetLocation) && Intrinsics.EZpvd(this.faceInTargetStartTimestamp, faceTargetChallengeResponse.faceInTargetStartTimestamp) && Intrinsics.EZpvd(this.faceInTargetEndTimestamp, faceTargetChallengeResponse.faceInTargetEndTimestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.predictions.models.ChallengeResponseEvent
    public String getChallengeId() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getFaceInTargetEndTimestamp() {
        return this.faceInTargetEndTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getFaceInTargetStartTimestamp() {
        return this.faceInTargetStartTimestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getTargetLocation() {
        return this.targetLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.challengeId.hashCode() * 31) + this.targetLocation.hashCode()) * 31) + this.faceInTargetStartTimestamp.hashCode()) * 31) + this.faceInTargetEndTimestamp.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceTargetChallengeResponse(challengeId=" + this.challengeId + ", targetLocation=" + this.targetLocation + ", faceInTargetStartTimestamp=" + this.faceInTargetStartTimestamp + ", faceInTargetEndTimestamp=" + this.faceInTargetEndTimestamp + ")";
    }

    public FaceTargetChallengeResponse(@NotNull String str, @NotNull RectF rectF, @NotNull Date date, @NotNull Date date2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(date, "");
        Intrinsics.checkNotNullParameter(date2, "");
        this.challengeId = str;
        this.targetLocation = rectF;
        this.faceInTargetStartTimestamp = date;
        this.faceInTargetEndTimestamp = date2;
    }
}

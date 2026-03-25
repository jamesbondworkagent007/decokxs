package com.amplifyframework.predictions.aws.models;

import android.graphics.RectF;
import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.predictions.models.ChallengeResponseEvent;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class InitialFaceDetected implements ChallengeResponseEvent {
    private final String challengeId;
    private final RectF faceLocation;
    private final Date timestamp;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InitialFaceDetected copy$default(InitialFaceDetected initialFaceDetected, String str, RectF rectF, Date date, int i, Object obj) {
        if ((i & 1) != 0) {
            str = initialFaceDetected.challengeId;
        }
        if ((i & 2) != 0) {
            rectF = initialFaceDetected.faceLocation;
        }
        if ((i & 4) != 0) {
            date = initialFaceDetected.timestamp;
        }
        return initialFaceDetected.copy(str, rectF, date);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF component2() {
        return this.faceLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date component3() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InitialFaceDetected copy(@NotNull String str, @NotNull RectF rectF, @NotNull Date date) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(date, "");
        return new InitialFaceDetected(str, rectF, date);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitialFaceDetected)) {
            return false;
        }
        InitialFaceDetected initialFaceDetected = (InitialFaceDetected) obj;
        return Intrinsics.EZpvd((Object) this.challengeId, (Object) initialFaceDetected.challengeId) && Intrinsics.EZpvd(this.faceLocation, initialFaceDetected.faceLocation) && Intrinsics.EZpvd(this.timestamp, initialFaceDetected.timestamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.predictions.models.ChallengeResponseEvent
    public String getChallengeId() {
        return this.challengeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RectF getFaceLocation() {
        return this.faceLocation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Date getTimestamp() {
        return this.timestamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.challengeId.hashCode() * 31) + this.faceLocation.hashCode()) * 31) + this.timestamp.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InitialFaceDetected(challengeId=" + this.challengeId + ", faceLocation=" + this.faceLocation + ", timestamp=" + this.timestamp + ")";
    }

    public InitialFaceDetected(@NotNull String str, @NotNull RectF rectF, @NotNull Date date) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(rectF, "");
        Intrinsics.checkNotNullParameter(date, "");
        this.challengeId = str;
        this.faceLocation = rectF;
        this.timestamp = date;
    }
}

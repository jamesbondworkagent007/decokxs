package com.amplifyframework.predictions.models;

import com.amplifyframework.annotations.InternalAmplifyApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public final class FaceLivenessSessionInformation {
    private final String challengeVersions;
    private final String region;
    private final float videoHeight;
    private final float videoWidth;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FaceLivenessSessionInformation copy$default(FaceLivenessSessionInformation faceLivenessSessionInformation, float f, float f2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = faceLivenessSessionInformation.videoWidth;
        }
        if ((i & 2) != 0) {
            f2 = faceLivenessSessionInformation.videoHeight;
        }
        if ((i & 4) != 0) {
            str = faceLivenessSessionInformation.challengeVersions;
        }
        if ((i & 8) != 0) {
            str2 = faceLivenessSessionInformation.region;
        }
        return faceLivenessSessionInformation.copy(f, f2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component1() {
        return this.videoWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float component2() {
        return this.videoHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.challengeVersions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FaceLivenessSessionInformation copy(float f, float f2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new FaceLivenessSessionInformation(f, f2, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceLivenessSessionInformation)) {
            return false;
        }
        FaceLivenessSessionInformation faceLivenessSessionInformation = (FaceLivenessSessionInformation) obj;
        return Float.compare(this.videoWidth, faceLivenessSessionInformation.videoWidth) == 0 && Float.compare(this.videoHeight, faceLivenessSessionInformation.videoHeight) == 0 && Intrinsics.EZpvd((Object) this.challengeVersions, (Object) faceLivenessSessionInformation.challengeVersions) && Intrinsics.EZpvd((Object) this.region, (Object) faceLivenessSessionInformation.region);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChallengeVersions() {
        return this.challengeVersions;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegion() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getVideoHeight() {
        return this.videoHeight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getVideoWidth() {
        return this.videoWidth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Float.hashCode(this.videoWidth) * 31) + Float.hashCode(this.videoHeight)) * 31) + this.challengeVersions.hashCode()) * 31) + this.region.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FaceLivenessSessionInformation(videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", challengeVersions=" + this.challengeVersions + ", region=" + this.region + ")";
    }

    public FaceLivenessSessionInformation(float f, float f2, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.videoWidth = f;
        this.videoHeight = f2;
        this.challengeVersions = str;
        this.region = str2;
    }
}

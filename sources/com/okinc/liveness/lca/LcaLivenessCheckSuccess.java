package com.okinc.liveness.lca;

import com.okinc.liveness.lca.debugtool.data.LivenessResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckSuccess extends LcaLivenessCheckResult {
    public static final int $stable = 8;
    public final String detectionInfo;
    public final LivenessResponse response;
    public final int splashCount;
    public final int splashInterruptCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckSuccess copy$default(LcaLivenessCheckSuccess lcaLivenessCheckSuccess, LivenessResponse livenessResponse, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            livenessResponse = lcaLivenessCheckSuccess.response;
        }
        if ((i3 & 2) != 0) {
            str = lcaLivenessCheckSuccess.detectionInfo;
        }
        if ((i3 & 4) != 0) {
            i = lcaLivenessCheckSuccess.splashCount;
        }
        if ((i3 & 8) != 0) {
            i2 = lcaLivenessCheckSuccess.splashInterruptCount;
        }
        return lcaLivenessCheckSuccess.copy(livenessResponse, str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessResponse component1() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.splashCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.splashInterruptCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessCheckSuccess copy(LivenessResponse livenessResponse, @NotNull String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LcaLivenessCheckSuccess(livenessResponse, str, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaLivenessCheckSuccess)) {
            return false;
        }
        LcaLivenessCheckSuccess lcaLivenessCheckSuccess = (LcaLivenessCheckSuccess) obj;
        return Intrinsics.EZpvd(this.response, lcaLivenessCheckSuccess.response) && Intrinsics.EZpvd((Object) this.detectionInfo, (Object) lcaLivenessCheckSuccess.detectionInfo) && this.splashCount == lcaLivenessCheckSuccess.splashCount && this.splashInterruptCount == lcaLivenessCheckSuccess.splashInterruptCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetectionInfo() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessResponse getResponse() {
        return this.response;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSplashCount() {
        return this.splashCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSplashInterruptCount() {
        return this.splashInterruptCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        LivenessResponse livenessResponse = this.response;
        return ((((((livenessResponse == null ? 0 : livenessResponse.hashCode()) * 31) + this.detectionInfo.hashCode()) * 31) + Integer.hashCode(this.splashCount)) * 31) + Integer.hashCode(this.splashInterruptCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessCheckSuccess(response=" + this.response + ", detectionInfo=" + this.detectionInfo + ", splashCount=" + this.splashCount + ", splashInterruptCount=" + this.splashInterruptCount + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckSuccess(LivenessResponse livenessResponse, @NotNull String str, int i, int i2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.response = livenessResponse;
        this.detectionInfo = str;
        this.splashCount = i;
        this.splashInterruptCount = i2;
    }
}

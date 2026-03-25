package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckOnCancel extends LcaLivenessCheckResult {
    public static final int $stable = 0;
    public final String detectionInfo;
    public final String processState;
    public final int splashCount;
    public final int splashInterruptCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckOnCancel copy$default(LcaLivenessCheckOnCancel lcaLivenessCheckOnCancel, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = lcaLivenessCheckOnCancel.processState;
        }
        if ((i3 & 2) != 0) {
            str2 = lcaLivenessCheckOnCancel.detectionInfo;
        }
        if ((i3 & 4) != 0) {
            i = lcaLivenessCheckOnCancel.splashCount;
        }
        if ((i3 & 8) != 0) {
            i2 = lcaLivenessCheckOnCancel.splashInterruptCount;
        }
        return lcaLivenessCheckOnCancel.copy(str, str2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.processState;
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
    public final LcaLivenessCheckOnCancel copy(@NotNull String str, @NotNull String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LcaLivenessCheckOnCancel(str, str2, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaLivenessCheckOnCancel)) {
            return false;
        }
        LcaLivenessCheckOnCancel lcaLivenessCheckOnCancel = (LcaLivenessCheckOnCancel) obj;
        return Intrinsics.EZpvd((Object) this.processState, (Object) lcaLivenessCheckOnCancel.processState) && Intrinsics.EZpvd((Object) this.detectionInfo, (Object) lcaLivenessCheckOnCancel.detectionInfo) && this.splashCount == lcaLivenessCheckOnCancel.splashCount && this.splashInterruptCount == lcaLivenessCheckOnCancel.splashInterruptCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetectionInfo() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProcessState() {
        return this.processState;
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
        return (((((this.processState.hashCode() * 31) + this.detectionInfo.hashCode()) * 31) + Integer.hashCode(this.splashCount)) * 31) + Integer.hashCode(this.splashInterruptCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessCheckOnCancel(processState=" + this.processState + ", detectionInfo=" + this.detectionInfo + ", splashCount=" + this.splashCount + ", splashInterruptCount=" + this.splashInterruptCount + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckOnCancel(@NotNull String str, @NotNull String str2, int i, int i2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.processState = str;
        this.detectionInfo = str2;
        this.splashCount = i;
        this.splashInterruptCount = i2;
    }
}

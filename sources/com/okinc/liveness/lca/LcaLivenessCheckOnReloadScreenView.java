package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckOnReloadScreenView extends LcaLivenessCheckResult {
    public static final int $stable = 8;
    public final String detectionInfo;
    public final Throwable errorDetail;
    public final String errorName;
    public final String processState;
    public final int splashCount;
    public final int splashInterruptCount;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckOnReloadScreenView copy$default(LcaLivenessCheckOnReloadScreenView lcaLivenessCheckOnReloadScreenView, String str, String str2, Throwable th, String str3, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = lcaLivenessCheckOnReloadScreenView.processState;
        }
        if ((i3 & 2) != 0) {
            str2 = lcaLivenessCheckOnReloadScreenView.errorName;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            th = lcaLivenessCheckOnReloadScreenView.errorDetail;
        }
        Throwable th2 = th;
        if ((i3 & 8) != 0) {
            str3 = lcaLivenessCheckOnReloadScreenView.detectionInfo;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i = lcaLivenessCheckOnReloadScreenView.splashCount;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = lcaLivenessCheckOnReloadScreenView.splashInterruptCount;
        }
        return lcaLivenessCheckOnReloadScreenView.copy(str, str4, th2, str5, i4, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.processState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.errorName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable component3() {
        return this.errorDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.splashCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.splashInterruptCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessCheckOnReloadScreenView copy(@NotNull String str, @NotNull String str2, Throwable th, @NotNull String str3, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new LcaLivenessCheckOnReloadScreenView(str, str2, th, str3, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaLivenessCheckOnReloadScreenView)) {
            return false;
        }
        LcaLivenessCheckOnReloadScreenView lcaLivenessCheckOnReloadScreenView = (LcaLivenessCheckOnReloadScreenView) obj;
        return Intrinsics.EZpvd((Object) this.processState, (Object) lcaLivenessCheckOnReloadScreenView.processState) && Intrinsics.EZpvd((Object) this.errorName, (Object) lcaLivenessCheckOnReloadScreenView.errorName) && Intrinsics.EZpvd(this.errorDetail, lcaLivenessCheckOnReloadScreenView.errorDetail) && Intrinsics.EZpvd((Object) this.detectionInfo, (Object) lcaLivenessCheckOnReloadScreenView.detectionInfo) && this.splashCount == lcaLivenessCheckOnReloadScreenView.splashCount && this.splashInterruptCount == lcaLivenessCheckOnReloadScreenView.splashInterruptCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetectionInfo() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable getErrorDetail() {
        return this.errorDetail;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorName() {
        return this.errorName;
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
        int iHashCode = this.processState.hashCode();
        int iHashCode2 = this.errorName.hashCode();
        Throwable th = this.errorDetail;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + (th == null ? 0 : th.hashCode())) * 31) + this.detectionInfo.hashCode()) * 31) + Integer.hashCode(this.splashCount)) * 31) + Integer.hashCode(this.splashInterruptCount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessCheckOnReloadScreenView(processState=" + this.processState + ", errorName=" + this.errorName + ", errorDetail=" + this.errorDetail + ", detectionInfo=" + this.detectionInfo + ", splashCount=" + this.splashCount + ", splashInterruptCount=" + this.splashInterruptCount + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckOnReloadScreenView(@NotNull String str, @NotNull String str2, Throwable th, @NotNull String str3, int i, int i2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.processState = str;
        this.errorName = str2;
        this.errorDetail = th;
        this.detectionInfo = str3;
        this.splashCount = i;
        this.splashInterruptCount = i2;
    }
}

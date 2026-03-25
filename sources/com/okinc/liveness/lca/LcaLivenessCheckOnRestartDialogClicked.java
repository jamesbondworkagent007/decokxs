package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckOnRestartDialogClicked extends LcaLivenessCheckResult {
    public static final int $stable = 8;
    public final Throwable errorDetail;
    public final String errorName;
    public final String processState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckOnRestartDialogClicked copy$default(LcaLivenessCheckOnRestartDialogClicked lcaLivenessCheckOnRestartDialogClicked, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaLivenessCheckOnRestartDialogClicked.processState;
        }
        if ((i & 2) != 0) {
            str2 = lcaLivenessCheckOnRestartDialogClicked.errorName;
        }
        if ((i & 4) != 0) {
            th = lcaLivenessCheckOnRestartDialogClicked.errorDetail;
        }
        return lcaLivenessCheckOnRestartDialogClicked.copy(str, str2, th);
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
    public final LcaLivenessCheckOnRestartDialogClicked copy(@NotNull String str, @NotNull String str2, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LcaLivenessCheckOnRestartDialogClicked(str, str2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaLivenessCheckOnRestartDialogClicked)) {
            return false;
        }
        LcaLivenessCheckOnRestartDialogClicked lcaLivenessCheckOnRestartDialogClicked = (LcaLivenessCheckOnRestartDialogClicked) obj;
        return Intrinsics.EZpvd((Object) this.processState, (Object) lcaLivenessCheckOnRestartDialogClicked.processState) && Intrinsics.EZpvd((Object) this.errorName, (Object) lcaLivenessCheckOnRestartDialogClicked.errorName) && Intrinsics.EZpvd(this.errorDetail, lcaLivenessCheckOnRestartDialogClicked.errorDetail);
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
    public int hashCode() {
        int iHashCode = this.processState.hashCode();
        int iHashCode2 = this.errorName.hashCode();
        Throwable th = this.errorDetail;
        return (((iHashCode * 31) + iHashCode2) * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessCheckOnRestartDialogClicked(processState=" + this.processState + ", errorName=" + this.errorName + ", errorDetail=" + this.errorDetail + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckOnRestartDialogClicked(@NotNull String str, @NotNull String str2, Throwable th) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.processState = str;
        this.errorName = str2;
        this.errorDetail = th;
    }
}

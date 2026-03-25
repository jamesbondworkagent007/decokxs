package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckOnReloadScreenClicked extends LcaLivenessCheckResult {
    public static final int $stable = 8;
    public final Throwable errorDetail;
    public final String errorName;
    public final String processState;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckOnReloadScreenClicked copy$default(LcaLivenessCheckOnReloadScreenClicked lcaLivenessCheckOnReloadScreenClicked, String str, String str2, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaLivenessCheckOnReloadScreenClicked.processState;
        }
        if ((i & 2) != 0) {
            str2 = lcaLivenessCheckOnReloadScreenClicked.errorName;
        }
        if ((i & 4) != 0) {
            th = lcaLivenessCheckOnReloadScreenClicked.errorDetail;
        }
        return lcaLivenessCheckOnReloadScreenClicked.copy(str, str2, th);
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
    public final LcaLivenessCheckOnReloadScreenClicked copy(@NotNull String str, @NotNull String str2, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LcaLivenessCheckOnReloadScreenClicked(str, str2, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaLivenessCheckOnReloadScreenClicked)) {
            return false;
        }
        LcaLivenessCheckOnReloadScreenClicked lcaLivenessCheckOnReloadScreenClicked = (LcaLivenessCheckOnReloadScreenClicked) obj;
        return Intrinsics.EZpvd((Object) this.processState, (Object) lcaLivenessCheckOnReloadScreenClicked.processState) && Intrinsics.EZpvd((Object) this.errorName, (Object) lcaLivenessCheckOnReloadScreenClicked.errorName) && Intrinsics.EZpvd(this.errorDetail, lcaLivenessCheckOnReloadScreenClicked.errorDetail);
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
        return "LcaLivenessCheckOnReloadScreenClicked(processState=" + this.processState + ", errorName=" + this.errorName + ", errorDetail=" + this.errorDetail + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckOnReloadScreenClicked(@NotNull String str, @NotNull String str2, Throwable th) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.processState = str;
        this.errorName = str2;
        this.errorDetail = th;
    }
}

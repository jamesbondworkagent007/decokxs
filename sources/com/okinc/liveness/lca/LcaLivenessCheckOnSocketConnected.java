package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckOnSocketConnected extends LcaLivenessCheckResult {
    public static final int $stable = 0;
    public final String detectionInfo;
    public final long duration;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckOnSocketConnected copy$default(LcaLivenessCheckOnSocketConnected lcaLivenessCheckOnSocketConnected, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaLivenessCheckOnSocketConnected.detectionInfo;
        }
        if ((i & 2) != 0) {
            j = lcaLivenessCheckOnSocketConnected.duration;
        }
        return lcaLivenessCheckOnSocketConnected.copy(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessCheckOnSocketConnected copy(@NotNull String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LcaLivenessCheckOnSocketConnected(str, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaLivenessCheckOnSocketConnected)) {
            return false;
        }
        LcaLivenessCheckOnSocketConnected lcaLivenessCheckOnSocketConnected = (LcaLivenessCheckOnSocketConnected) obj;
        return Intrinsics.EZpvd((Object) this.detectionInfo, (Object) lcaLivenessCheckOnSocketConnected.detectionInfo) && this.duration == lcaLivenessCheckOnSocketConnected.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetectionInfo() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getDuration() {
        return this.duration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.detectionInfo.hashCode() * 31) + Long.hashCode(this.duration);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessCheckOnSocketConnected(detectionInfo=" + this.detectionInfo + ", duration=" + this.duration + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckOnSocketConnected(@NotNull String str, long j) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.detectionInfo = str;
        this.duration = j;
    }
}

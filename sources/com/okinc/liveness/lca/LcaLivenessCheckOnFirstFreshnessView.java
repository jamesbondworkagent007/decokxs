package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckOnFirstFreshnessView extends LcaLivenessCheckResult {
    public static final int $stable = 0;
    public final String detectionInfo;
    public final String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckOnFirstFreshnessView copy$default(LcaLivenessCheckOnFirstFreshnessView lcaLivenessCheckOnFirstFreshnessView, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaLivenessCheckOnFirstFreshnessView.tag;
        }
        if ((i & 2) != 0) {
            str2 = lcaLivenessCheckOnFirstFreshnessView.detectionInfo;
        }
        return lcaLivenessCheckOnFirstFreshnessView.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessCheckOnFirstFreshnessView copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LcaLivenessCheckOnFirstFreshnessView(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LcaLivenessCheckOnFirstFreshnessView)) {
            return false;
        }
        LcaLivenessCheckOnFirstFreshnessView lcaLivenessCheckOnFirstFreshnessView = (LcaLivenessCheckOnFirstFreshnessView) obj;
        return Intrinsics.EZpvd((Object) this.tag, (Object) lcaLivenessCheckOnFirstFreshnessView.tag) && Intrinsics.EZpvd((Object) this.detectionInfo, (Object) lcaLivenessCheckOnFirstFreshnessView.detectionInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDetectionInfo() {
        return this.detectionInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.tag.hashCode() * 31) + this.detectionInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessCheckOnFirstFreshnessView(tag=" + this.tag + ", detectionInfo=" + this.detectionInfo + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckOnFirstFreshnessView(@NotNull String str, @NotNull String str2) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.tag = str;
        this.detectionInfo = str2;
    }
}

package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckOnFarSelfieView extends LcaLivenessCheckResult {
    public static final int $stable = 0;
    public final String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckOnFarSelfieView copy$default(LcaLivenessCheckOnFarSelfieView lcaLivenessCheckOnFarSelfieView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaLivenessCheckOnFarSelfieView.tag;
        }
        return lcaLivenessCheckOnFarSelfieView.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessCheckOnFarSelfieView copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LcaLivenessCheckOnFarSelfieView(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LcaLivenessCheckOnFarSelfieView) && Intrinsics.EZpvd((Object) this.tag, (Object) ((LcaLivenessCheckOnFarSelfieView) obj).tag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.tag.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaLivenessCheckOnFarSelfieView(tag=" + this.tag + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckOnFarSelfieView(@NotNull String str) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.tag = str;
    }
}

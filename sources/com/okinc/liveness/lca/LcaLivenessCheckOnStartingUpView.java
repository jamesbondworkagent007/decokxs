package com.okinc.liveness.lca;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class LcaLivenessCheckOnStartingUpView extends LcaLivenessCheckResult {
    public static final int $stable = 0;
    public final String tag;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaLivenessCheckOnStartingUpView copy$default(LcaLivenessCheckOnStartingUpView lcaLivenessCheckOnStartingUpView, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaLivenessCheckOnStartingUpView.tag;
        }
        return lcaLivenessCheckOnStartingUpView.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaLivenessCheckOnStartingUpView copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LcaLivenessCheckOnStartingUpView(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LcaLivenessCheckOnStartingUpView) && Intrinsics.EZpvd((Object) this.tag, (Object) ((LcaLivenessCheckOnStartingUpView) obj).tag);
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
        return "LcaLivenessCheckOnStartingUpView(tag=" + this.tag + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaLivenessCheckOnStartingUpView(@NotNull String str) {
        super(null);
        Intrinsics.checkNotNullParameter(str, "");
        this.tag = str;
    }
}

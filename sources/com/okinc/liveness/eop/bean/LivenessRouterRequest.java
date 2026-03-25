package com.okinc.liveness.eop.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class LivenessRouterRequest {
    public static final int $stable = 0;
    private final String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LivenessRouterRequest copy$default(LivenessRouterRequest livenessRouterRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = livenessRouterRequest.sessionId;
        }
        return livenessRouterRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LivenessRouterRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LivenessRouterRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LivenessRouterRequest) && Intrinsics.EZpvd((Object) this.sessionId, (Object) ((LivenessRouterRequest) obj).sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.sessionId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LivenessRouterRequest(sessionId=" + this.sessionId + ")";
    }

    public LivenessRouterRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sessionId = str;
    }
}

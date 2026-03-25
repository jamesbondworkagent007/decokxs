package com.okinc.liveness.lca.debugtool.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaJwstGetConfigRequest {
    public static final int $stable = 0;
    private final String clientSideIdentifier;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LcaJwstGetConfigRequest copy$default(LcaJwstGetConfigRequest lcaJwstGetConfigRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lcaJwstGetConfigRequest.clientSideIdentifier;
        }
        return lcaJwstGetConfigRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.clientSideIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LcaJwstGetConfigRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new LcaJwstGetConfigRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LcaJwstGetConfigRequest) && Intrinsics.EZpvd((Object) this.clientSideIdentifier, (Object) ((LcaJwstGetConfigRequest) obj).clientSideIdentifier);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getClientSideIdentifier() {
        return this.clientSideIdentifier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.clientSideIdentifier.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LcaJwstGetConfigRequest(clientSideIdentifier=" + this.clientSideIdentifier + ")";
    }

    public LcaJwstGetConfigRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.clientSideIdentifier = str;
    }
}

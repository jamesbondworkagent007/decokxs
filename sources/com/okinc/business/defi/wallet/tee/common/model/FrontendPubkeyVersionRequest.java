package com.okinc.business.defi.wallet.tee.common.model;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class FrontendPubkeyVersionRequest {
    public static final int $stable = 0;
    private final String frontendPubkeyVersionList;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FrontendPubkeyVersionRequest copy$default(FrontendPubkeyVersionRequest frontendPubkeyVersionRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frontendPubkeyVersionRequest.frontendPubkeyVersionList;
        }
        return frontendPubkeyVersionRequest.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.frontendPubkeyVersionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FrontendPubkeyVersionRequest copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new FrontendPubkeyVersionRequest(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FrontendPubkeyVersionRequest) && Intrinsics.EZpvd((Object) this.frontendPubkeyVersionList, (Object) ((FrontendPubkeyVersionRequest) obj).frontendPubkeyVersionList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrontendPubkeyVersionList() {
        return this.frontendPubkeyVersionList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.frontendPubkeyVersionList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FrontendPubkeyVersionRequest(frontendPubkeyVersionList=" + this.frontendPubkeyVersionList + ")";
    }

    public FrontendPubkeyVersionRequest(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.frontendPubkeyVersionList = str;
    }
}

package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RevokeTokenErrorData {
    private final Exception error;
    private final String refreshToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RevokeTokenErrorData copy$default(RevokeTokenErrorData revokeTokenErrorData, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = revokeTokenErrorData.refreshToken;
        }
        if ((i & 2) != 0) {
            exc = revokeTokenErrorData.error;
        }
        return revokeTokenErrorData.copy(str, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.refreshToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception component2() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RevokeTokenErrorData copy(String str, @NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        return new RevokeTokenErrorData(str, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RevokeTokenErrorData)) {
            return false;
        }
        RevokeTokenErrorData revokeTokenErrorData = (RevokeTokenErrorData) obj;
        return Intrinsics.EZpvd((Object) this.refreshToken, (Object) revokeTokenErrorData.refreshToken) && Intrinsics.EZpvd(this.error, revokeTokenErrorData.error);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.refreshToken;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.error.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RevokeTokenErrorData(refreshToken=" + this.refreshToken + ", error=" + this.error + ")";
    }

    public RevokeTokenErrorData(String str, @NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        this.refreshToken = str;
        this.error = exc;
    }
}

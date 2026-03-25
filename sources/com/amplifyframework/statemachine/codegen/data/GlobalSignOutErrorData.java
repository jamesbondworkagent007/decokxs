package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class GlobalSignOutErrorData {
    private final String accessToken;
    private final Exception error;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GlobalSignOutErrorData copy$default(GlobalSignOutErrorData globalSignOutErrorData, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = globalSignOutErrorData.accessToken;
        }
        if ((i & 2) != 0) {
            exc = globalSignOutErrorData.error;
        }
        return globalSignOutErrorData.copy(str, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception component2() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GlobalSignOutErrorData copy(String str, @NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        return new GlobalSignOutErrorData(str, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GlobalSignOutErrorData)) {
            return false;
        }
        GlobalSignOutErrorData globalSignOutErrorData = (GlobalSignOutErrorData) obj;
        return Intrinsics.EZpvd((Object) this.accessToken, (Object) globalSignOutErrorData.accessToken) && Intrinsics.EZpvd(this.error, globalSignOutErrorData.error);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.accessToken;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.error.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GlobalSignOutErrorData(accessToken=" + this.accessToken + ", error=" + this.error + ")";
    }

    public GlobalSignOutErrorData(String str, @NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        this.accessToken = str;
        this.error = exc;
    }
}

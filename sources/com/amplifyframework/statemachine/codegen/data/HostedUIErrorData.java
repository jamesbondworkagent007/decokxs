package com.amplifyframework.statemachine.codegen.data;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HostedUIErrorData {
    private final Exception error;
    private final String url;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HostedUIErrorData copy$default(HostedUIErrorData hostedUIErrorData, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hostedUIErrorData.url;
        }
        if ((i & 2) != 0) {
            exc = hostedUIErrorData.error;
        }
        return hostedUIErrorData.copy(str, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception component2() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostedUIErrorData copy(String str, @NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        return new HostedUIErrorData(str, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostedUIErrorData)) {
            return false;
        }
        HostedUIErrorData hostedUIErrorData = (HostedUIErrorData) obj;
        return Intrinsics.EZpvd((Object) this.url, (Object) hostedUIErrorData.url) && Intrinsics.EZpvd(this.error, hostedUIErrorData.error);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.url;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.error.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HostedUIErrorData(url=" + this.url + ", error=" + this.error + ")";
    }

    public HostedUIErrorData(String str, @NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        this.url = str;
        this.error = exc;
    }
}

package com.okinc.liveness.kycsdk.bean;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class KycSdkException extends Exception {
    public static final int $stable = 8;
    private final Exception _e;
    private final String msg;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ KycSdkException copy$default(KycSdkException kycSdkException, String str, Exception exc, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycSdkException.msg;
        }
        if ((i & 2) != 0) {
            exc = kycSdkException._e;
        }
        return kycSdkException.copy(str, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception component2() {
        return this._e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final KycSdkException copy(@NotNull String str, @NotNull Exception exc) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(exc, "");
        return new KycSdkException(str, exc);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycSdkException)) {
            return false;
        }
        KycSdkException kycSdkException = (KycSdkException) obj;
        return Intrinsics.EZpvd((Object) this.msg, (Object) kycSdkException.msg) && Intrinsics.EZpvd(this._e, kycSdkException._e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception get_e() {
        return this._e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.msg.hashCode() * 31) + this._e.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "KycSdkException(msg=" + this.msg + ", _e=" + this._e + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KycSdkException(@NotNull String str, @NotNull Exception exc) {
        super("KycSdkException :" + str);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(exc, "");
        this.msg = str;
        this._e = exc;
    }

    public final String getTopMessage() {
        String localizedMessage = this._e.getLocalizedMessage();
        return localizedMessage == null ? "no message" : localizedMessage;
    }

    public final String getLineNumber() {
        StackTraceElement[] stackTrace = this._e.getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "");
        return (stackTrace.length == 0) ^ true ? String.valueOf(this._e.getStackTrace()[0].getLineNumber()) : "no line number";
    }
}

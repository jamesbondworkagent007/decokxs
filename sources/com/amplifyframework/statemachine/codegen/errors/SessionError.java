package com.amplifyframework.statemachine.codegen.errors;

import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SessionError extends Exception {
    private final AmplifyCredential amplifyCredential;
    private final Exception exception;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SessionError copy$default(SessionError sessionError, Exception exc, AmplifyCredential amplifyCredential, int i, Object obj) {
        if ((i & 1) != 0) {
            exc = sessionError.exception;
        }
        if ((i & 2) != 0) {
            amplifyCredential = sessionError.amplifyCredential;
        }
        return sessionError.copy(exc, amplifyCredential);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception component1() {
        return this.exception;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmplifyCredential component2() {
        return this.amplifyCredential;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SessionError copy(@NotNull Exception exc, @NotNull AmplifyCredential amplifyCredential) {
        Intrinsics.checkNotNullParameter(exc, "");
        Intrinsics.checkNotNullParameter(amplifyCredential, "");
        return new SessionError(exc, amplifyCredential);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionError)) {
            return false;
        }
        SessionError sessionError = (SessionError) obj;
        return Intrinsics.EZpvd(this.exception, sessionError.exception) && Intrinsics.EZpvd(this.amplifyCredential, sessionError.amplifyCredential);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmplifyCredential getAmplifyCredential() {
        return this.amplifyCredential;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Exception getException() {
        return this.exception;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.exception.hashCode() * 31) + this.amplifyCredential.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "SessionError(exception=" + this.exception + ", amplifyCredential=" + this.amplifyCredential + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionError(@NotNull Exception exc, @NotNull AmplifyCredential amplifyCredential) {
        super(exc.getMessage(), exc.getCause());
        Intrinsics.checkNotNullParameter(exc, "");
        Intrinsics.checkNotNullParameter(amplifyCredential, "");
        this.exception = exc;
        this.amplifyCredential = amplifyCredential;
    }
}

package com.amplifyframework.statemachine.codegen.errors;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CredentialStoreError extends Exception {
    private final Throwable cause;
    private final String message;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CredentialStoreError copy$default(CredentialStoreError credentialStoreError, String str, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            str = credentialStoreError.message;
        }
        if ((i & 2) != 0) {
            th = credentialStoreError.cause;
        }
        return credentialStoreError.copy(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable component2() {
        return this.cause;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CredentialStoreError copy(@NotNull String str, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        return new CredentialStoreError(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialStoreError)) {
            return false;
        }
        CredentialStoreError credentialStoreError = (CredentialStoreError) obj;
        return Intrinsics.EZpvd((Object) this.message, (Object) credentialStoreError.message) && Intrinsics.EZpvd(this.cause, credentialStoreError.cause);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.message.hashCode();
        Throwable th = this.cause;
        return (iHashCode * 31) + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // java.lang.Throwable
    public String toString() {
        return "CredentialStoreError(message=" + this.message + ", cause=" + this.cause + ")";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r2v0 java.lang.Throwable))
 A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:18) call: com.amplifyframework.statemachine.codegen.errors.CredentialStoreError.<init>(java.lang.String, java.lang.Throwable):void type: THIS */
    public /* synthetic */ CredentialStoreError(String str, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : th);
    }

    public CredentialStoreError(@NotNull String str, Throwable th) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
        this.cause = th;
    }
}

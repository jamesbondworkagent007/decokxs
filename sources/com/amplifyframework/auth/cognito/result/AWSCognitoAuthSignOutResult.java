package com.amplifyframework.auth.cognito.result;

import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.result.AuthSignOutResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class AWSCognitoAuthSignOutResult extends AuthSignOutResult {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AWSCognitoAuthSignOutResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean getSignedOutLocally();

    private AWSCognitoAuthSignOutResult() {
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CompleteSignOut extends AWSCognitoAuthSignOutResult {
        public static final CompleteSignOut INSTANCE = new CompleteSignOut();
        private static final boolean signedOutLocally = true;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult
        public boolean getSignedOutLocally() {
            return signedOutLocally;
        }

        private CompleteSignOut() {
            super(null);
        }
    }

    public static final class FailedSignOut extends AWSCognitoAuthSignOutResult {
        private final AuthException exception;
        private final boolean signedOutLocally;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ FailedSignOut copy$default(FailedSignOut failedSignOut, AuthException authException, int i, Object obj) {
            if ((i & 1) != 0) {
                authException = failedSignOut.exception;
            }
            return failedSignOut.copy(authException);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthException component1() {
            return this.exception;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final FailedSignOut copy(@NotNull AuthException authException) {
            Intrinsics.checkNotNullParameter(authException, "");
            return new FailedSignOut(authException);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FailedSignOut) && Intrinsics.EZpvd(this.exception, ((FailedSignOut) obj).exception);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthException getException() {
            return this.exception;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult
        public boolean getSignedOutLocally() {
            return this.signedOutLocally;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.exception.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "FailedSignOut(exception=" + this.exception + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FailedSignOut(@NotNull AuthException authException) {
            super(null);
            Intrinsics.checkNotNullParameter(authException, "");
            this.exception = authException;
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class PartialSignOut extends AWSCognitoAuthSignOutResult {
        private final GlobalSignOutError globalSignOutError;
        private final HostedUIError hostedUIError;
        private final RevokeTokenError revokeTokenError;
        private final boolean signedOutLocally;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PartialSignOut() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PartialSignOut copy$default(PartialSignOut partialSignOut, HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError, int i, Object obj) {
            if ((i & 1) != 0) {
                hostedUIError = partialSignOut.hostedUIError;
            }
            if ((i & 2) != 0) {
                globalSignOutError = partialSignOut.globalSignOutError;
            }
            if ((i & 4) != 0) {
                revokeTokenError = partialSignOut.revokeTokenError;
            }
            return partialSignOut.copy(hostedUIError, globalSignOutError, revokeTokenError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUIError component1() {
            return this.hostedUIError;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GlobalSignOutError component2() {
            return this.globalSignOutError;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RevokeTokenError component3() {
            return this.revokeTokenError;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PartialSignOut copy(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError) {
            return new PartialSignOut(hostedUIError, globalSignOutError, revokeTokenError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PartialSignOut)) {
                return false;
            }
            PartialSignOut partialSignOut = (PartialSignOut) obj;
            return Intrinsics.EZpvd(this.hostedUIError, partialSignOut.hostedUIError) && Intrinsics.EZpvd(this.globalSignOutError, partialSignOut.globalSignOutError) && Intrinsics.EZpvd(this.revokeTokenError, partialSignOut.revokeTokenError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final GlobalSignOutError getGlobalSignOutError() {
            return this.globalSignOutError;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUIError getHostedUIError() {
            return this.hostedUIError;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RevokeTokenError getRevokeTokenError() {
            return this.revokeTokenError;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult
        public boolean getSignedOutLocally() {
            return this.signedOutLocally;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            HostedUIError hostedUIError = this.hostedUIError;
            int iHashCode = hostedUIError == null ? 0 : hostedUIError.hashCode();
            GlobalSignOutError globalSignOutError = this.globalSignOutError;
            int iHashCode2 = globalSignOutError == null ? 0 : globalSignOutError.hashCode();
            RevokeTokenError revokeTokenError = this.revokeTokenError;
            return (((iHashCode * 31) + iHashCode2) * 31) + (revokeTokenError != null ? revokeTokenError.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PartialSignOut(hostedUIError=" + this.hostedUIError + ", globalSignOutError=" + this.globalSignOutError + ", revokeTokenError=" + this.revokeTokenError + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:com.amplifyframework.auth.cognito.result.HostedUIError:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.auth.cognito.result.HostedUIError) : (r2v0 com.amplifyframework.auth.cognito.result.HostedUIError))
  (wrap:com.amplifyframework.auth.cognito.result.GlobalSignOutError:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.auth.cognito.result.GlobalSignOutError) : (r3v0 com.amplifyframework.auth.cognito.result.GlobalSignOutError))
  (wrap:com.amplifyframework.auth.cognito.result.RevokeTokenError:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.auth.cognito.result.RevokeTokenError) : (r4v0 com.amplifyframework.auth.cognito.result.RevokeTokenError))
 A[MD:(com.amplifyframework.auth.cognito.result.HostedUIError, com.amplifyframework.auth.cognito.result.GlobalSignOutError, com.amplifyframework.auth.cognito.result.RevokeTokenError):void (m)] (LINE:65) call: com.amplifyframework.auth.cognito.result.AWSCognitoAuthSignOutResult.PartialSignOut.<init>(com.amplifyframework.auth.cognito.result.HostedUIError, com.amplifyframework.auth.cognito.result.GlobalSignOutError, com.amplifyframework.auth.cognito.result.RevokeTokenError):void type: THIS */
        public /* synthetic */ PartialSignOut(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : hostedUIError, (i & 2) != 0 ? null : globalSignOutError, (i & 4) != 0 ? null : revokeTokenError);
        }

        public PartialSignOut(HostedUIError hostedUIError, GlobalSignOutError globalSignOutError, RevokeTokenError revokeTokenError) {
            super(null);
            this.hostedUIError = hostedUIError;
            this.globalSignOutError = globalSignOutError;
            this.revokeTokenError = revokeTokenError;
            this.signedOutLocally = true;
        }
    }
}

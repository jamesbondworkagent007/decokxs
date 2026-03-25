package com.amplifyframework.auth.cognito;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.AliasExistsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeDeliveryFailureException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.CodeMismatchException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.EnableSoftwareTokenMfaException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ExpiredCodeException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidParameterException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.InvalidPasswordException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.LimitExceededException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.MfaMethodNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.PasswordResetRequiredException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.SoftwareTokenMfaNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyFailedAttemptsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.TooManyRequestsException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserLambdaValidationException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotConfirmedException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UserNotFoundException;
import aws.sdk.kotlin.services.cognitoidentityprovider.model.UsernameExistsException;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.cognito.exceptions.service.CodeExpiredException;
import com.amplifyframework.auth.cognito.exceptions.service.EnableSoftwareTokenMFAException;
import com.amplifyframework.auth.cognito.exceptions.service.FailedAttemptsLimitExceededException;
import com.amplifyframework.auth.cognito.exceptions.service.MFAMethodNotFoundException;
import com.amplifyframework.auth.cognito.exceptions.service.SoftwareTokenMFANotFoundException;
import com.amplifyframework.auth.exceptions.UnknownException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class CognitoAuthExceptionConverter {
    public static final Companion Companion = new Companion(null);
    private static final String defaultRecoveryMessage = "See attached exception for more details.";

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.CognitoAuthExceptionConverter.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AuthException lookup(@NotNull Exception exc, @NotNull String str) {
            AuthException unknownException;
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(str, "");
            if (exc instanceof UserNotFoundException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.UserNotFoundException(exc);
            }
            if (exc instanceof UserNotConfirmedException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.UserNotConfirmedException(exc);
            }
            if (exc instanceof UsernameExistsException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.UsernameExistsException(exc);
            }
            if (exc instanceof AliasExistsException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.AliasExistsException(exc);
            }
            if (exc instanceof InvalidPasswordException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.InvalidPasswordException(exc);
            }
            if (exc instanceof InvalidParameterException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.InvalidParameterException(null, exc, 1, null);
            }
            if (exc instanceof ExpiredCodeException) {
                return new CodeExpiredException(exc);
            }
            if (exc instanceof CodeMismatchException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.CodeMismatchException(exc);
            }
            if (exc instanceof CodeDeliveryFailureException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.CodeDeliveryFailureException(exc);
            }
            if (exc instanceof LimitExceededException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.LimitExceededException(exc);
            }
            if (exc instanceof MfaMethodNotFoundException) {
                return new MFAMethodNotFoundException(exc);
            }
            if (exc instanceof NotAuthorizedException) {
                return new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, null, exc, 3, null);
            }
            if (exc instanceof ResourceNotFoundException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.ResourceNotFoundException(exc);
            }
            if (exc instanceof SoftwareTokenMfaNotFoundException) {
                return new SoftwareTokenMFANotFoundException(exc);
            }
            if (exc instanceof TooManyFailedAttemptsException) {
                return new FailedAttemptsLimitExceededException(exc);
            }
            if (exc instanceof TooManyRequestsException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.TooManyRequestsException(exc);
            }
            if (exc instanceof PasswordResetRequiredException) {
                return new com.amplifyframework.auth.cognito.exceptions.service.PasswordResetRequiredException(exc);
            }
            if (exc instanceof EnableSoftwareTokenMfaException) {
                return new EnableSoftwareTokenMFAException(exc);
            }
            if (exc instanceof UserLambdaValidationException) {
                unknownException = new com.amplifyframework.auth.cognito.exceptions.service.UserLambdaValidationException(exc.getMessage(), exc);
            } else {
                unknownException = new UnknownException(str, exc);
            }
            return unknownException;
        }
    }
}

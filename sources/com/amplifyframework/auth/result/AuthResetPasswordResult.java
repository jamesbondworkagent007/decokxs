package com.amplifyframework.auth.result;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.result.step.AuthNextResetPasswordStep;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthResetPasswordResult {
    private final boolean isPasswordReset;
    private final AuthNextResetPasswordStep nextStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthNextResetPasswordStep getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isPasswordReset() {
        return this.isPasswordReset;
    }

    public AuthResetPasswordResult(boolean z, @NonNull AuthNextResetPasswordStep authNextResetPasswordStep) {
        this.isPasswordReset = z;
        Objects.requireNonNull(authNextResetPasswordStep);
        this.nextStep = authNextResetPasswordStep;
    }

    public int hashCode() {
        boolean zIsPasswordReset = isPasswordReset();
        return ObjectsCompat.hash(Boolean.valueOf(zIsPasswordReset), getNextStep());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthResetPasswordResult.class != obj.getClass()) {
            return false;
        }
        AuthResetPasswordResult authResetPasswordResult = (AuthResetPasswordResult) obj;
        return ObjectsCompat.equals(Boolean.valueOf(isPasswordReset()), Boolean.valueOf(authResetPasswordResult.isPasswordReset())) && ObjectsCompat.equals(getNextStep(), authResetPasswordResult.getNextStep());
    }

    public String toString() {
        return "AuthResetPasswordResult{isPasswordReset=" + isPasswordReset() + ", nextStep=" + getNextStep() + AbstractJsonLexerKt.END_OBJ;
    }
}

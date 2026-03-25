package com.amplifyframework.auth.result;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.result.step.AuthNextSignUpStep;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthSignUpResult {
    private final boolean isSignUpComplete;
    private final AuthNextSignUpStep nextStep;
    private final String userId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthNextSignUpStep getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getUserId() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSignUpComplete() {
        return this.isSignUpComplete;
    }

    public AuthSignUpResult(boolean z, @NonNull AuthNextSignUpStep authNextSignUpStep, @Nullable String str) {
        this.isSignUpComplete = z;
        Objects.requireNonNull(authNextSignUpStep);
        this.nextStep = authNextSignUpStep;
        this.userId = str;
    }

    public int hashCode() {
        boolean zIsSignUpComplete = isSignUpComplete();
        return ObjectsCompat.hash(Boolean.valueOf(zIsSignUpComplete), getNextStep(), getUserId());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthSignUpResult.class != obj.getClass()) {
            return false;
        }
        AuthSignUpResult authSignUpResult = (AuthSignUpResult) obj;
        return ObjectsCompat.equals(Boolean.valueOf(isSignUpComplete()), Boolean.valueOf(authSignUpResult.isSignUpComplete())) && ObjectsCompat.equals(getNextStep(), authSignUpResult.getNextStep()) && ObjectsCompat.equals(getUserId(), authSignUpResult.getUserId());
    }

    public String toString() {
        return "AuthSignUpResult{isSignUpComplete=" + isSignUpComplete() + ", nextStep=" + getNextStep() + ", userId=" + getUserId() + AbstractJsonLexerKt.END_OBJ;
    }
}

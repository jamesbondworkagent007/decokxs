package com.amplifyframework.auth.result;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.result.step.AuthNextSignInStep;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthSignInResult {
    private final boolean isSignedIn;
    private final AuthNextSignInStep nextStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthNextSignInStep getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isSignedIn() {
        return this.isSignedIn;
    }

    public AuthSignInResult(boolean z, @NonNull AuthNextSignInStep authNextSignInStep) {
        this.isSignedIn = z;
        Objects.requireNonNull(authNextSignInStep);
        this.nextStep = authNextSignInStep;
    }

    public int hashCode() {
        boolean zIsSignedIn = isSignedIn();
        return ObjectsCompat.hash(Boolean.valueOf(zIsSignedIn), getNextStep());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthSignInResult.class != obj.getClass()) {
            return false;
        }
        AuthSignInResult authSignInResult = (AuthSignInResult) obj;
        return ObjectsCompat.equals(Boolean.valueOf(isSignedIn()), Boolean.valueOf(authSignInResult.isSignedIn())) && ObjectsCompat.equals(getNextStep(), authSignInResult.getNextStep());
    }

    public String toString() {
        return "AuthSignInResult{isSignedIn=" + isSignedIn() + ", nextStep=" + getNextStep() + AbstractJsonLexerKt.END_OBJ;
    }
}

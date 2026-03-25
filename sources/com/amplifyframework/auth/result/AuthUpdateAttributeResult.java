package com.amplifyframework.auth.result;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.result.step.AuthNextUpdateAttributeStep;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AuthUpdateAttributeResult {
    private final boolean isUpdated;
    private final AuthNextUpdateAttributeStep nextStep;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthNextUpdateAttributeStep getNextStep() {
        return this.nextStep;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean isUpdated() {
        return this.isUpdated;
    }

    public AuthUpdateAttributeResult(boolean z, @NonNull AuthNextUpdateAttributeStep authNextUpdateAttributeStep) {
        this.isUpdated = z;
        Objects.requireNonNull(authNextUpdateAttributeStep);
        this.nextStep = authNextUpdateAttributeStep;
    }

    public int hashCode() {
        boolean zIsUpdated = isUpdated();
        return ObjectsCompat.hash(Boolean.valueOf(zIsUpdated), getNextStep());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUpdateAttributeResult.class != obj.getClass()) {
            return false;
        }
        AuthUpdateAttributeResult authUpdateAttributeResult = (AuthUpdateAttributeResult) obj;
        return ObjectsCompat.equals(Boolean.valueOf(isUpdated()), Boolean.valueOf(authUpdateAttributeResult.isUpdated())) && ObjectsCompat.equals(getNextStep(), authUpdateAttributeResult.getNextStep());
    }

    public String toString() {
        return "AuthUpdateAttributeResult{isUpdated=" + isUpdated() + ", nextStep=" + getNextStep() + AbstractJsonLexerKt.END_OBJ;
    }
}

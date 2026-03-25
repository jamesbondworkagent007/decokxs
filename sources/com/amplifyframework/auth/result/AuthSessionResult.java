package com.amplifyframework.auth.result;

import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.AuthException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthSessionResult<T> {
    private final AuthException error;
    private final Type type;
    private final T value;

    public enum Type {
        SUCCESS,
        FAILURE
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthException getError() {
        return this.error;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Type getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public T getValue() {
        return this.value;
    }

    private AuthSessionResult(T t, AuthException authException, Type type) {
        this.value = t;
        this.error = authException;
        this.type = type;
    }

    public static <T> AuthSessionResult<T> success(T t) {
        return new AuthSessionResult<>(t, null, Type.SUCCESS);
    }

    public static <T> AuthSessionResult<T> failure(AuthException authException) {
        return new AuthSessionResult<>(null, authException, Type.FAILURE);
    }

    public int hashCode() {
        return ObjectsCompat.hash(getValue(), getError(), getType());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AuthSessionResult)) {
            return false;
        }
        AuthSessionResult authSessionResult = (AuthSessionResult) obj;
        return ObjectsCompat.equals(getValue(), authSessionResult.getValue()) && ObjectsCompat.equals(getError(), authSessionResult.getError()) && ObjectsCompat.equals(getType(), authSessionResult.getType());
    }

    public String toString() {
        return "AuthSessionResult{value=" + getValue() + ", error=" + getError() + ", type=" + getType() + AbstractJsonLexerKt.END_OBJ;
    }
}

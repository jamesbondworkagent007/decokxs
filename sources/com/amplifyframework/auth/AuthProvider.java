package com.amplifyframework.auth;

import androidx.core.util.ObjectsCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class AuthProvider {
    private static final String AMAZON = "amazon";
    private static final String APPLE = "apple";
    private static final String FACEBOOK = "facebook";
    private static final String GOOGLE = "google";
    private final String providerKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getProviderKey() {
        return this.providerKey;
    }

    public AuthProvider(String str) {
        this.providerKey = str;
    }

    public static AuthProvider amazon() {
        return new AuthProvider(AMAZON);
    }

    public static AuthProvider facebook() {
        return new AuthProvider(FACEBOOK);
    }

    public static AuthProvider google() {
        return new AuthProvider(GOOGLE);
    }

    public static AuthProvider apple() {
        return new AuthProvider(APPLE);
    }

    public static AuthProvider custom(String str) {
        return new AuthProvider(str);
    }

    public int hashCode() {
        return ObjectsCompat.hash(getProviderKey());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ObjectsCompat.equals(getProviderKey(), ((AuthProvider) obj).getProviderKey());
    }

    public String toString() {
        return "AuthProvider{providerKey=" + this.providerKey + AbstractJsonLexerKt.END_OBJ;
    }
}

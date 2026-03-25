package com.amplifyframework.auth;

import androidx.core.util.ObjectsCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthUserAttribute {
    private AuthUserAttributeKey key;
    private String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthUserAttributeKey getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getValue() {
        return this.value;
    }

    public AuthUserAttribute(AuthUserAttributeKey authUserAttributeKey, String str) {
        this.key = authUserAttributeKey;
        this.value = str;
    }

    public int hashCode() {
        return ObjectsCompat.hash(getKey(), getValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AuthUserAttribute.class != obj.getClass()) {
            return false;
        }
        AuthUserAttribute authUserAttribute = (AuthUserAttribute) obj;
        return ObjectsCompat.equals(getKey(), authUserAttribute.getKey()) && ObjectsCompat.equals(getValue(), authUserAttribute.getValue());
    }

    public String toString() {
        return "AuthUserAttribute {key=" + this.key + ", value=" + this.value + AbstractJsonLexerKt.END_OBJ;
    }
}

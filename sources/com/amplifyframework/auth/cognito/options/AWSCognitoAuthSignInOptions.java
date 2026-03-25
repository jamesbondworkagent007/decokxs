package com.amplifyframework.auth.cognito.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.options.AuthSignInOptions;
import com.amplifyframework.util.Immutable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSCognitoAuthSignInOptions extends AuthSignInOptions {
    private final AuthFlowType authFlowType;
    private final Map<String, String> metadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthFlowType getAuthFlowType() {
        return this.authFlowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    public AWSCognitoAuthSignInOptions(@NonNull Map<String, String> map, AuthFlowType authFlowType) {
        this.metadata = map;
        this.authFlowType = authFlowType;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    public int hashCode() {
        return ObjectsCompat.hash(getMetadata(), getAuthFlowType());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthSignInOptions.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthSignInOptions aWSCognitoAuthSignInOptions = (AWSCognitoAuthSignInOptions) obj;
        return ObjectsCompat.equals(getMetadata(), aWSCognitoAuthSignInOptions.getMetadata()) && ObjectsCompat.equals(getAuthFlowType(), aWSCognitoAuthSignInOptions.getAuthFlowType());
    }

    public String toString() {
        return "AWSCognitoAuthSignInOptions{metadata=" + getMetadata() + ", authFlowType=" + getAuthFlowType() + AbstractJsonLexerKt.END_OBJ;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CognitoBuilder extends AuthSignInOptions.Builder<CognitoBuilder> {
        private AuthFlowType authFlowType;
        private final Map<String, String> metadata = new HashMap();

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthSignInOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthSignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public CognitoBuilder metadata(@NonNull Map<String, String> map) {
            Objects.requireNonNull(map);
            this.metadata.clear();
            this.metadata.putAll(map);
            return getThis();
        }

        public CognitoBuilder authFlowType(@NonNull AuthFlowType authFlowType) {
            this.authFlowType = authFlowType;
            return getThis();
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/auth/options/AuthSignInOptions; */
        @Override // com.amplifyframework.auth.options.AuthSignInOptions.Builder
        public AWSCognitoAuthSignInOptions build() {
            return new AWSCognitoAuthSignInOptions(Immutable.of(this.metadata), this.authFlowType);
        }
    }
}

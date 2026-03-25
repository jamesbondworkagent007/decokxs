package com.amplifyframework.auth.cognito.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.options.AuthWebUISignInOptions;
import com.amplifyframework.util.Immutable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSCognitoAuthWebUISignInOptions extends AuthWebUISignInOptions {
    private final String browserPackage;
    private final String idpIdentifier;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBrowserPackage() {
        return this.browserPackage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getIdpIdentifier() {
        return this.idpIdentifier;
    }

    public AWSCognitoAuthWebUISignInOptions(List<String> list, String str, String str2) {
        super(list);
        this.idpIdentifier = str;
        this.browserPackage = str2;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions
    public int hashCode() {
        return ObjectsCompat.hash(getScopes(), getIdpIdentifier(), getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthWebUISignInOptions.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthWebUISignInOptions aWSCognitoAuthWebUISignInOptions = (AWSCognitoAuthWebUISignInOptions) obj;
        return ObjectsCompat.equals(getScopes(), aWSCognitoAuthWebUISignInOptions.getScopes()) && ObjectsCompat.equals(getIdpIdentifier(), aWSCognitoAuthWebUISignInOptions.getIdpIdentifier()) && ObjectsCompat.equals(getBrowserPackage(), aWSCognitoAuthWebUISignInOptions.getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions
    public String toString() {
        return "AWSCognitoAuthWebUISignInOptions{scopes=" + getScopes() + ", idpIdentifier=" + getIdpIdentifier() + ", browserPackage=" + getBrowserPackage() + AbstractJsonLexerKt.END_OBJ;
    }

    public static final class CognitoBuilder extends AuthWebUISignInOptions.Builder<CognitoBuilder> {
        private String browserPackage;
        private String idpIdentifier;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CognitoBuilder browserPackage(@NonNull String str) {
            this.browserPackage = str;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthWebUISignInOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        public CognitoBuilder idpIdentifier(@NonNull String str) {
            this.idpIdentifier = str;
            return getThis();
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/auth/options/AuthWebUISignInOptions; */
        @Override // com.amplifyframework.auth.options.AuthWebUISignInOptions.Builder
        public AWSCognitoAuthWebUISignInOptions build() {
            return new AWSCognitoAuthWebUISignInOptions(Immutable.of(super.getScopes()), this.idpIdentifier, this.browserPackage);
        }
    }
}

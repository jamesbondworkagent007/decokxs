package com.amplifyframework.auth.cognito.options;

import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;
import com.amplifyframework.auth.options.AuthSignOutOptions;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes21.dex */
public final class AWSCognitoAuthSignOutOptions extends AuthSignOutOptions {
    private final String browserPackage;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getBrowserPackage() {
        return this.browserPackage;
    }

    public AWSCognitoAuthSignOutOptions(boolean z, String str) {
        super(z);
        this.browserPackage = str;
    }

    public static CognitoBuilder builder() {
        return new CognitoBuilder();
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public int hashCode() {
        boolean zIsGlobalSignOut = isGlobalSignOut();
        return ObjectsCompat.hash(Boolean.valueOf(zIsGlobalSignOut), getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AWSCognitoAuthSignOutOptions.class != obj.getClass()) {
            return false;
        }
        AWSCognitoAuthSignOutOptions aWSCognitoAuthSignOutOptions = (AWSCognitoAuthSignOutOptions) obj;
        return ObjectsCompat.equals(Boolean.valueOf(isGlobalSignOut()), Boolean.valueOf(aWSCognitoAuthSignOutOptions.isGlobalSignOut())) && ObjectsCompat.equals(getBrowserPackage(), aWSCognitoAuthSignOutOptions.getBrowserPackage());
    }

    @Override // com.amplifyframework.auth.options.AuthSignOutOptions
    public String toString() {
        return "AWSCognitoAuthSignOutOptions{isGlobalSignOut=" + isGlobalSignOut() + ", browserPackage=" + getBrowserPackage() + AbstractJsonLexerKt.END_OBJ;
    }

    public static final class CognitoBuilder extends AuthSignOutOptions.Builder<CognitoBuilder> {
        private String browserPackage;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CognitoBuilder browserPackage(@NonNull String str) {
            this.browserPackage = str;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthSignOutOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/auth/options/AuthSignOutOptions; */
        @Override // com.amplifyframework.auth.options.AuthSignOutOptions.Builder
        public AWSCognitoAuthSignOutOptions build() {
            return new AWSCognitoAuthSignOutOptions(super.isGlobalSignOut(), this.browserPackage);
        }
    }
}

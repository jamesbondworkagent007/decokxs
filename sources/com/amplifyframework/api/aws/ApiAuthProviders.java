package com.amplifyframework.api.aws;

import androidx.annotation.NonNull;
import com.amplifyframework.api.aws.sigv4.ApiKeyAuthProvider;
import com.amplifyframework.api.aws.sigv4.CognitoUserPoolsAuthProvider;
import com.amplifyframework.api.aws.sigv4.FunctionAuthProvider;
import com.amplifyframework.api.aws.sigv4.OidcAuthProvider;
import com.amplifyframework.auth.CognitoCredentialsProvider;
import java.util.Objects;
import o.InterfaceC52805wZ;

/* JADX INFO: loaded from: classes21.dex */
public final class ApiAuthProviders {
    private final ApiKeyAuthProvider apiKeyAuthProvider;
    private final InterfaceC52805wZ awsCredentialsProvider;
    private final CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider;
    private final FunctionAuthProvider functionAuthProvider;
    private final OidcAuthProvider oidcAuthProvider;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InterfaceC52805wZ getAWSCredentialsProvider() {
        return this.awsCredentialsProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApiKeyAuthProvider getApiKeyAuthProvider() {
        return this.apiKeyAuthProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CognitoUserPoolsAuthProvider getCognitoUserPoolsAuthProvider() {
        return this.cognitoUserPoolsAuthProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FunctionAuthProvider getFunctionAuthProvider() {
        return this.functionAuthProvider;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public OidcAuthProvider getOidcAuthProvider() {
        return this.oidcAuthProvider;
    }

    private ApiAuthProviders(Builder builder) {
        this.apiKeyAuthProvider = builder.getApiKeyAuthProvider();
        this.awsCredentialsProvider = builder.getAWSCredentialsProvider();
        this.oidcAuthProvider = builder.getOidcAuthProvider();
        this.cognitoUserPoolsAuthProvider = builder.getCognitoUserPoolsAuthProvider();
        this.functionAuthProvider = builder.getFunctionAuthProvider();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApiAuthProviders noProviderOverrides() {
        return builder().build();
    }

    public static final class Builder {
        private ApiKeyAuthProvider apiKeyAuthProvider;
        private InterfaceC52805wZ awsCredentialsProvider = new CognitoCredentialsProvider();
        private CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider;
        private FunctionAuthProvider functionAuthProvider;
        private OidcAuthProvider oidcAuthProvider;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public InterfaceC52805wZ getAWSCredentialsProvider() {
            return this.awsCredentialsProvider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ApiKeyAuthProvider getApiKeyAuthProvider() {
            return this.apiKeyAuthProvider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public CognitoUserPoolsAuthProvider getCognitoUserPoolsAuthProvider() {
            return this.cognitoUserPoolsAuthProvider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FunctionAuthProvider getFunctionAuthProvider() {
            return this.functionAuthProvider;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public OidcAuthProvider getOidcAuthProvider() {
            return this.oidcAuthProvider;
        }

        public Builder apiKeyAuthProvider(@NonNull ApiKeyAuthProvider apiKeyAuthProvider) {
            Objects.requireNonNull(apiKeyAuthProvider);
            this.apiKeyAuthProvider = apiKeyAuthProvider;
            return this;
        }

        public Builder awsCredentialsProvider(@NonNull InterfaceC52805wZ interfaceC52805wZ) {
            Objects.requireNonNull(interfaceC52805wZ);
            this.awsCredentialsProvider = interfaceC52805wZ;
            return this;
        }

        public Builder cognitoUserPoolsAuthProvider(@NonNull CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider) {
            Objects.requireNonNull(cognitoUserPoolsAuthProvider);
            this.cognitoUserPoolsAuthProvider = cognitoUserPoolsAuthProvider;
            return this;
        }

        public Builder oidcAuthProvider(@NonNull OidcAuthProvider oidcAuthProvider) {
            Objects.requireNonNull(oidcAuthProvider);
            this.oidcAuthProvider = oidcAuthProvider;
            return this;
        }

        public Builder functionAuthProvider(@NonNull FunctionAuthProvider functionAuthProvider) {
            Objects.requireNonNull(functionAuthProvider);
            this.functionAuthProvider = functionAuthProvider;
            return this;
        }

        public ApiAuthProviders build() {
            return new ApiAuthProviders(this);
        }
    }
}

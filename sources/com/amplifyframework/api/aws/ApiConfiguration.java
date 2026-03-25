package com.amplifyframework.api.aws;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
final class ApiConfiguration {
    private final String apiKey;
    private final AuthorizationType authorizationType;
    private final String endpoint;
    private final EndpointType endpointType;
    private final String region;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getApiKey() {
        return this.apiKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AuthorizationType getAuthorizationType() {
        return this.authorizationType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getEndpoint() {
        return this.endpoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EndpointType getEndpointType() {
        return this.endpointType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getRegion() {
        return this.region;
    }

    private ApiConfiguration(Builder builder) {
        this.endpointType = builder.endpointType;
        this.endpoint = builder.endpoint;
        this.region = builder.region;
        this.authorizationType = builder.authorizationType;
        this.apiKey = builder.apiKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String apiKey;
        private AuthorizationType authorizationType;
        private String endpoint;
        private EndpointType endpointType;
        private String region;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder apiKey(@Nullable String str) {
            this.apiKey = str;
            return this;
        }

        public Builder endpointType(@NonNull EndpointType endpointType) {
            Objects.requireNonNull(endpointType);
            this.endpointType = endpointType;
            return this;
        }

        public Builder endpoint(@NonNull String str) {
            Objects.requireNonNull(str);
            this.endpoint = str;
            return this;
        }

        public Builder region(@NonNull String str) {
            Objects.requireNonNull(str);
            this.region = str;
            return this;
        }

        public Builder authorizationType(@NonNull String str) {
            return authorizationType(AuthorizationType.from(str));
        }

        public Builder authorizationType(@NonNull AuthorizationType authorizationType) {
            Objects.requireNonNull(authorizationType);
            this.authorizationType = authorizationType;
            return this;
        }

        public ApiConfiguration build() {
            Objects.requireNonNull(this.endpoint);
            Objects.requireNonNull(this.region);
            Objects.requireNonNull(this.authorizationType);
            return new ApiConfiguration(this);
        }
    }
}

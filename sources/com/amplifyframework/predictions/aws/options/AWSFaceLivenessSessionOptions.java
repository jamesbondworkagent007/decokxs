package com.amplifyframework.predictions.aws.options;

import com.amplifyframework.annotations.InternalAmplifyApi;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AWSCredentialsProvider;
import com.amplifyframework.predictions.options.FaceLivenessSessionOptions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@InternalAmplifyApi
public class AWSFaceLivenessSessionOptions extends FaceLivenessSessionOptions {
    public static final Companion Companion = new Companion(null);
    private final AWSCredentialsProvider<AWSCredentials> credentialsProvider;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 com.amplifyframework.auth.AWSCredentialsProvider) A[MD:(com.amplifyframework.auth.AWSCredentialsProvider<? extends com.amplifyframework.auth.AWSCredentials>):void (m)] call: com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions.<init>(com.amplifyframework.auth.AWSCredentialsProvider):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AWSFaceLivenessSessionOptions(AWSCredentialsProvider aWSCredentialsProvider, DefaultConstructorMarker defaultConstructorMarker) {
        this(aWSCredentialsProvider);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Builder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final AWSFaceLivenessSessionOptions defaults() {
        return Companion.defaults();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCredentialsProvider<AWSCredentials> getCredentialsProvider() {
        return this.credentialsProvider;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.predictions.aws.options.AWSFaceLivenessSessionOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Builder builder() {
            return new Builder();
        }

        public final AWSFaceLivenessSessionOptions defaults() {
            return builder().build();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.amplifyframework.auth.AWSCredentialsProvider<? extends com.amplifyframework.auth.AWSCredentials> */
    /* JADX WARN: Multi-variable type inference failed */
    private AWSFaceLivenessSessionOptions(AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider) {
        this.credentialsProvider = aWSCredentialsProvider;
    }

    public static final class Builder extends FaceLivenessSessionOptions.Builder<Builder> {
        private AWSCredentialsProvider<? extends AWSCredentials> credentialsProvider;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder credentialsProvider(@NotNull AWSCredentialsProvider<? extends AWSCredentials> aWSCredentialsProvider) {
            Intrinsics.checkNotNullParameter(aWSCredentialsProvider, "");
            this.credentialsProvider = aWSCredentialsProvider;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: com.amplifyframework.auth.AWSCredentialsProvider<? extends com.amplifyframework.auth.AWSCredentials>, com.amplifyframework.auth.AWSCredentialsProvider<com.amplifyframework.auth.AWSCredentials> */
        public final AWSCredentialsProvider<AWSCredentials> getCredentialsProvider() {
            return this.credentialsProvider;
        }

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/predictions/options/FaceLivenessSessionOptions$Builder; */
        @Override // com.amplifyframework.predictions.options.FaceLivenessSessionOptions.Builder
        public Builder getThis() {
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/predictions/options/FaceLivenessSessionOptions; */
        @Override // com.amplifyframework.predictions.options.FaceLivenessSessionOptions.Builder
        public AWSFaceLivenessSessionOptions build() {
            return new AWSFaceLivenessSessionOptions(this.credentialsProvider, null);
        }
    }
}

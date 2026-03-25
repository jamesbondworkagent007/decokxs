package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthResendSignUpCodeOptions;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSCognitoAuthResendSignUpCodeOptions extends AuthResendSignUpCodeOptions {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> metadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.auth.cognito.options.AWSCognitoAuthResendSignUpCodeOptions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthResendSignUpCodeOptions copy$default(AWSCognitoAuthResendSignUpCodeOptions aWSCognitoAuthResendSignUpCodeOptions, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = aWSCognitoAuthResendSignUpCodeOptions.metadata;
        }
        return aWSCognitoAuthResendSignUpCodeOptions.copy(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoAuthResendSignUpCodeOptions copy(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new AWSCognitoAuthResendSignUpCodeOptions(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSCognitoAuthResendSignUpCodeOptions) && Intrinsics.EZpvd(this.metadata, ((AWSCognitoAuthResendSignUpCodeOptions) obj).metadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.metadata.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AWSCognitoAuthResendSignUpCodeOptions(metadata=" + this.metadata + ")";
    }

    public AWSCognitoAuthResendSignUpCodeOptions(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.metadata = map;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.options.AWSCognitoAuthResendSignUpCodeOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthResendSignUpCodeOptions invoke(@NotNull Function1<? super CognitoBuilder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            function1.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CognitoBuilder extends AuthResendSignUpCodeOptions.Builder<CognitoBuilder> {
        private Map<String, String> metadata = C56424yEw.KWHzl();

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthResendSignUpCodeOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthResendSignUpCodeOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder metadata(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.metadata = map;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/auth/options/AuthResendSignUpCodeOptions; */
        @Override // com.amplifyframework.auth.options.AuthResendSignUpCodeOptions.Builder
        public AWSCognitoAuthResendSignUpCodeOptions build() {
            return new AWSCognitoAuthResendSignUpCodeOptions(this.metadata);
        }
    }
}

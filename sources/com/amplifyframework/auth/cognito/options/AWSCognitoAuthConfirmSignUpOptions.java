package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.options.AuthConfirmSignUpOptions;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSCognitoAuthConfirmSignUpOptions extends AuthConfirmSignUpOptions {
    public static final Companion Companion = new Companion(null);
    private final Map<String, String> clientMetadata;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignUpOptions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthConfirmSignUpOptions copy$default(AWSCognitoAuthConfirmSignUpOptions aWSCognitoAuthConfirmSignUpOptions, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = aWSCognitoAuthConfirmSignUpOptions.clientMetadata;
        }
        return aWSCognitoAuthConfirmSignUpOptions.copy(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.clientMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoAuthConfirmSignUpOptions copy(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        return new AWSCognitoAuthConfirmSignUpOptions(map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AWSCognitoAuthConfirmSignUpOptions) && Intrinsics.EZpvd(this.clientMetadata, ((AWSCognitoAuthConfirmSignUpOptions) obj).clientMetadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.clientMetadata.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AWSCognitoAuthConfirmSignUpOptions(clientMetadata=" + this.clientMetadata + ")";
    }

    public AWSCognitoAuthConfirmSignUpOptions(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "");
        this.clientMetadata = map;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignUpOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthConfirmSignUpOptions invoke(@NotNull Function1<? super CognitoBuilder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            function1.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CognitoBuilder extends AuthConfirmSignUpOptions.Builder<CognitoBuilder> {
        private Map<String, String> clientMetadata = C56424yEw.KWHzl();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder clientMetadata(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.clientMetadata = map;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthConfirmSignUpOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthConfirmSignUpOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/auth/options/AuthConfirmSignUpOptions; */
        @Override // com.amplifyframework.auth.options.AuthConfirmSignUpOptions.Builder
        public AWSCognitoAuthConfirmSignUpOptions build() {
            return new AWSCognitoAuthConfirmSignUpOptions(this.clientMetadata);
        }
    }
}

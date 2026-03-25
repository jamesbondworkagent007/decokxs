package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.options.AuthSignUpOptions;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class AWSCognitoAuthSignUpOptions extends AuthSignUpOptions {
    public static final Companion Companion = new Companion(null);
    private final List<AuthUserAttribute> attributes;
    private final Map<String, String> clientMetadata;
    private final Map<String, String> validationData;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private final List<AuthUserAttribute> component1() {
        return this.attributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthSignUpOptions copy$default(AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions, List list, Map map, Map map2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aWSCognitoAuthSignUpOptions.attributes;
        }
        if ((i & 2) != 0) {
            map = aWSCognitoAuthSignUpOptions.validationData;
        }
        if ((i & 4) != 0) {
            map2 = aWSCognitoAuthSignUpOptions.clientMetadata;
        }
        return aWSCognitoAuthSignUpOptions.copy(list, map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component2() {
        return this.validationData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.clientMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoAuthSignUpOptions copy(@NotNull List<AuthUserAttribute> list, @NotNull Map<String, String> map, @NotNull Map<String, String> map2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        return new AWSCognitoAuthSignUpOptions(list, map, map2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthSignUpOptions)) {
            return false;
        }
        AWSCognitoAuthSignUpOptions aWSCognitoAuthSignUpOptions = (AWSCognitoAuthSignUpOptions) obj;
        return Intrinsics.EZpvd(this.attributes, aWSCognitoAuthSignUpOptions.attributes) && Intrinsics.EZpvd(this.validationData, aWSCognitoAuthSignUpOptions.validationData) && Intrinsics.EZpvd(this.clientMetadata, aWSCognitoAuthSignUpOptions.clientMetadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getClientMetadata() {
        return this.clientMetadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getValidationData() {
        return this.validationData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public int hashCode() {
        return (((this.attributes.hashCode() * 31) + this.validationData.hashCode()) * 31) + this.clientMetadata.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.auth.options.AuthSignUpOptions
    public String toString() {
        return "AWSCognitoAuthSignUpOptions(attributes=" + this.attributes + ", validationData=" + this.validationData + ", clientMetadata=" + this.clientMetadata + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSCognitoAuthSignUpOptions(@NotNull List<AuthUserAttribute> list, @NotNull Map<String, String> map, @NotNull Map<String, String> map2) {
        super(list);
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        this.attributes = list;
        this.validationData = map;
        this.clientMetadata = map2;
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.options.AWSCognitoAuthSignUpOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthSignUpOptions invoke(@NotNull Function1<? super CognitoBuilder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            function1.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    /* JADX INFO: loaded from: classes21.dex */
    public static final class CognitoBuilder extends AuthSignUpOptions.Builder<CognitoBuilder> {
        private Map<String, String> validationData = C56424yEw.KWHzl();
        private Map<String, String> clientMetadata = C56424yEw.KWHzl();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder clientMetadata(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.clientMetadata = map;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthSignUpOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder validationData(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.validationData = map;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/auth/options/AuthSignUpOptions; */
        @Override // com.amplifyframework.auth.options.AuthSignUpOptions.Builder
        public AWSCognitoAuthSignUpOptions build() {
            List<AuthUserAttribute> userAttributes = super.getUserAttributes();
            Intrinsics.checkNotNullExpressionValue(userAttributes, "");
            return new AWSCognitoAuthSignUpOptions(userAttributes, this.validationData, this.clientMetadata);
        }
    }
}

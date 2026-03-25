package com.amplifyframework.auth.cognito.options;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.options.AuthConfirmSignInOptions;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56424yEw;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AWSCognitoAuthConfirmSignInOptions extends AuthConfirmSignInOptions {
    public static final Companion Companion = new Companion(null);
    private final String friendlyDeviceName;
    private final Map<String, String> metadata;
    private final List<AuthUserAttribute> userAttributes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final CognitoBuilder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignInOptions */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AWSCognitoAuthConfirmSignInOptions copy$default(AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions, Map map, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = aWSCognitoAuthConfirmSignInOptions.metadata;
        }
        if ((i & 2) != 0) {
            list = aWSCognitoAuthConfirmSignInOptions.userAttributes;
        }
        if ((i & 4) != 0) {
            str = aWSCognitoAuthConfirmSignInOptions.friendlyDeviceName;
        }
        return aWSCognitoAuthConfirmSignInOptions.copy(map, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component1() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AuthUserAttribute> component2() {
        return this.userAttributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.friendlyDeviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoAuthConfirmSignInOptions copy(@NotNull Map<String, String> map, @NotNull List<AuthUserAttribute> list, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AWSCognitoAuthConfirmSignInOptions(map, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoAuthConfirmSignInOptions)) {
            return false;
        }
        AWSCognitoAuthConfirmSignInOptions aWSCognitoAuthConfirmSignInOptions = (AWSCognitoAuthConfirmSignInOptions) obj;
        return Intrinsics.EZpvd(this.metadata, aWSCognitoAuthConfirmSignInOptions.metadata) && Intrinsics.EZpvd(this.userAttributes, aWSCognitoAuthConfirmSignInOptions.userAttributes) && Intrinsics.EZpvd((Object) this.friendlyDeviceName, (Object) aWSCognitoAuthConfirmSignInOptions.friendlyDeviceName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFriendlyDeviceName() {
        return this.friendlyDeviceName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getMetadata() {
        return this.metadata;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<AuthUserAttribute> getUserAttributes() {
        return this.userAttributes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.metadata.hashCode();
        int iHashCode2 = this.userAttributes.hashCode();
        String str = this.friendlyDeviceName;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AWSCognitoAuthConfirmSignInOptions(metadata=" + this.metadata + ", userAttributes=" + this.userAttributes + ", friendlyDeviceName=" + this.friendlyDeviceName + ")";
    }

    public AWSCognitoAuthConfirmSignInOptions(@NotNull Map<String, String> map, @NotNull List<AuthUserAttribute> list, String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.metadata = map;
        this.userAttributes = list;
        this.friendlyDeviceName = str;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.options.AWSCognitoAuthConfirmSignInOptions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CognitoBuilder builder() {
            return new CognitoBuilder();
        }

        public final AWSCognitoAuthConfirmSignInOptions invoke(@NotNull Function1<? super CognitoBuilder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            CognitoBuilder cognitoBuilder = new CognitoBuilder();
            function1.invoke(cognitoBuilder);
            return cognitoBuilder.build();
        }
    }

    public static final class CognitoBuilder extends AuthConfirmSignInOptions.Builder<CognitoBuilder> {
        private String friendlyDeviceName;
        private Map<String, String> metadata = C56424yEw.KWHzl();
        private List<AuthUserAttribute> userAttributes = yDY.AhwBna();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder friendlyDeviceName(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.friendlyDeviceName = str;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: getThis()Lcom/amplifyframework/auth/options/AuthConfirmSignInOptions$Builder; */
        @Override // com.amplifyframework.auth.options.AuthConfirmSignInOptions.Builder
        public CognitoBuilder getThis() {
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder metadata(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            this.metadata = map;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoBuilder userAttributes(@NotNull List<AuthUserAttribute> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.userAttributes = list;
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: build()Lcom/amplifyframework/auth/options/AuthConfirmSignInOptions; */
        @Override // com.amplifyframework.auth.options.AuthConfirmSignInOptions.Builder
        public AWSCognitoAuthConfirmSignInOptions build() {
            return new AWSCognitoAuthConfirmSignInOptions(this.metadata, this.userAttributes, this.friendlyDeviceName);
        }
    }
}

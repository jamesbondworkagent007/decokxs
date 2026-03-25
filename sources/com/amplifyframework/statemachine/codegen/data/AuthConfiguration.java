package com.amplifyframework.statemachine.codegen.data;

import com.amplifyframework.auth.cognito.options.AuthFlowType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthConfiguration {
    public static final Companion Companion = new Companion(null);
    private final AuthFlowType authFlowType;
    private final IdentityPoolConfiguration identityPool;
    private final OauthConfiguration oauth;
    private final UserPoolConfiguration userPool;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AuthConfiguration copy$default(AuthConfiguration authConfiguration, UserPoolConfiguration userPoolConfiguration, IdentityPoolConfiguration identityPoolConfiguration, OauthConfiguration oauthConfiguration, AuthFlowType authFlowType, int i, Object obj) {
        if ((i & 1) != 0) {
            userPoolConfiguration = authConfiguration.userPool;
        }
        if ((i & 2) != 0) {
            identityPoolConfiguration = authConfiguration.identityPool;
        }
        if ((i & 4) != 0) {
            oauthConfiguration = authConfiguration.oauth;
        }
        if ((i & 8) != 0) {
            authFlowType = authConfiguration.authFlowType;
        }
        return authConfiguration.copy(userPoolConfiguration, identityPoolConfiguration, oauthConfiguration, authFlowType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserPoolConfiguration component1() {
        return this.userPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IdentityPoolConfiguration component2() {
        return this.identityPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OauthConfiguration component3() {
        return this.oauth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthFlowType component4() {
        return this.authFlowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthConfiguration copy(UserPoolConfiguration userPoolConfiguration, IdentityPoolConfiguration identityPoolConfiguration, OauthConfiguration oauthConfiguration, @NotNull AuthFlowType authFlowType) {
        Intrinsics.checkNotNullParameter(authFlowType, "");
        return new AuthConfiguration(userPoolConfiguration, identityPoolConfiguration, oauthConfiguration, authFlowType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthConfiguration)) {
            return false;
        }
        AuthConfiguration authConfiguration = (AuthConfiguration) obj;
        return Intrinsics.EZpvd(this.userPool, authConfiguration.userPool) && Intrinsics.EZpvd(this.identityPool, authConfiguration.identityPool) && Intrinsics.EZpvd(this.oauth, authConfiguration.oauth) && this.authFlowType == authConfiguration.authFlowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthFlowType getAuthFlowType() {
        return this.authFlowType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IdentityPoolConfiguration getIdentityPool() {
        return this.identityPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OauthConfiguration getOauth() {
        return this.oauth;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserPoolConfiguration getUserPool() {
        return this.userPool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        UserPoolConfiguration userPoolConfiguration = this.userPool;
        int iHashCode = userPoolConfiguration == null ? 0 : userPoolConfiguration.hashCode();
        IdentityPoolConfiguration identityPoolConfiguration = this.identityPool;
        int iHashCode2 = identityPoolConfiguration == null ? 0 : identityPoolConfiguration.hashCode();
        OauthConfiguration oauthConfiguration = this.oauth;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (oauthConfiguration != null ? oauthConfiguration.hashCode() : 0)) * 31) + this.authFlowType.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AuthConfiguration(userPool=" + this.userPool + ", identityPool=" + this.identityPool + ", oauth=" + this.oauth + ", authFlowType=" + this.authFlowType + ")";
    }

    public AuthConfiguration(UserPoolConfiguration userPoolConfiguration, IdentityPoolConfiguration identityPoolConfiguration, OauthConfiguration oauthConfiguration, @NotNull AuthFlowType authFlowType) {
        Intrinsics.checkNotNullParameter(authFlowType, "");
        this.userPool = userPoolConfiguration;
        this.identityPool = identityPoolConfiguration;
        this.oauth = oauthConfiguration;
        this.authFlowType = authFlowType;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.AuthConfiguration.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ AuthConfiguration fromJson$aws_auth_cognito_release$default(Companion companion, JSONObject jSONObject, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "Default";
            }
            return companion.fromJson$aws_auth_cognito_release(jSONObject, str);
        }

        public final AuthConfiguration fromJson$aws_auth_cognito_release(@NotNull JSONObject jSONObject, @NotNull String str) {
            JSONObject jSONObjectOptJSONObject;
            JSONObject jSONObjectOptJSONObject2;
            JSONObject jSONObjectOptJSONObject3;
            JSONObject jSONObject2;
            JSONObject jSONObject3;
            JSONObject jSONObject4;
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Intrinsics.checkNotNullParameter(str, "");
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("CognitoUserPool");
            String strOptString = null;
            UserPoolConfiguration userPoolConfigurationBuild = (jSONObjectOptJSONObject4 == null || (jSONObject4 = jSONObjectOptJSONObject4.getJSONObject(str)) == null) ? null : UserPoolConfiguration.Companion.fromJson$aws_auth_cognito_release(jSONObject4).build();
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("CredentialsProvider");
            IdentityPoolConfiguration identityPoolConfigurationBuild = (jSONObjectOptJSONObject5 == null || (jSONObject2 = jSONObjectOptJSONObject5.getJSONObject("CognitoIdentity")) == null || (jSONObject3 = jSONObject2.getJSONObject(str)) == null) ? null : IdentityPoolConfiguration.Companion.fromJson$aws_auth_cognito_release(jSONObject3).build();
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("Auth");
            OauthConfiguration oauthConfigurationFromJson = (jSONObjectOptJSONObject6 == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject6.optJSONObject(str)) == null || (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("OAuth")) == null) ? null : OauthConfiguration.Companion.fromJson(jSONObjectOptJSONObject3);
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("Auth");
            if (jSONObjectOptJSONObject7 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject7.optJSONObject(str)) != null) {
                strOptString = jSONObjectOptJSONObject.optString("authenticationFlowType");
            }
            return new AuthConfiguration(userPoolConfigurationBuild, identityPoolConfigurationBuild, oauthConfigurationFromJson, getAuthenticationFlowType(strOptString));
        }

        private final AuthFlowType getAuthenticationFlowType(String str) {
            if (str != null && str.length() != 0) {
                for (AuthFlowType authFlowType : AuthFlowType.values()) {
                    if (Intrinsics.EZpvd((Object) authFlowType.name(), (Object) str)) {
                        return AuthFlowType.valueOf(str);
                    }
                }
            }
            return AuthFlowType.USER_SRP_AUTH;
        }
    }
}

package com.amplifyframework.statemachine.codegen.data;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OauthConfiguration {
    public static final Companion Companion = new Companion(null);
    private final String appClient;
    private final String appSecret;
    private final String domain;
    private final Set<String> scopes;
    private final String signInRedirectURI;
    private final String signOutRedirectURI;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.amplifyframework.statemachine.codegen.data.OauthConfiguration */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OauthConfiguration copy$default(OauthConfiguration oauthConfiguration, String str, String str2, String str3, Set set, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oauthConfiguration.appClient;
        }
        if ((i & 2) != 0) {
            str2 = oauthConfiguration.appSecret;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = oauthConfiguration.domain;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            set = oauthConfiguration.scopes;
        }
        Set set2 = set;
        if ((i & 16) != 0) {
            str4 = oauthConfiguration.signInRedirectURI;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = oauthConfiguration.signOutRedirectURI;
        }
        return oauthConfiguration.copy(str, str6, str7, set2, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.appClient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.appSecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> component4() {
        return this.scopes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.signInRedirectURI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.signOutRedirectURI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OauthConfiguration copy(@NotNull String str, String str2, @NotNull String str3, @NotNull Set<String> set, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new OauthConfiguration(str, str2, str3, set, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OauthConfiguration)) {
            return false;
        }
        OauthConfiguration oauthConfiguration = (OauthConfiguration) obj;
        return Intrinsics.EZpvd((Object) this.appClient, (Object) oauthConfiguration.appClient) && Intrinsics.EZpvd((Object) this.appSecret, (Object) oauthConfiguration.appSecret) && Intrinsics.EZpvd((Object) this.domain, (Object) oauthConfiguration.domain) && Intrinsics.EZpvd(this.scopes, oauthConfiguration.scopes) && Intrinsics.EZpvd((Object) this.signInRedirectURI, (Object) oauthConfiguration.signInRedirectURI) && Intrinsics.EZpvd((Object) this.signOutRedirectURI, (Object) oauthConfiguration.signOutRedirectURI);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppClient() {
        return this.appClient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppSecret() {
        return this.appSecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDomain() {
        return this.domain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> getScopes() {
        return this.scopes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignInRedirectURI() {
        return this.signInRedirectURI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignOutRedirectURI() {
        return this.signOutRedirectURI;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.appClient.hashCode();
        String str = this.appSecret;
        return (((((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.domain.hashCode()) * 31) + this.scopes.hashCode()) * 31) + this.signInRedirectURI.hashCode()) * 31) + this.signOutRedirectURI.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OauthConfiguration(appClient=" + this.appClient + ", appSecret=" + this.appSecret + ", domain=" + this.domain + ", scopes=" + this.scopes + ", signInRedirectURI=" + this.signInRedirectURI + ", signOutRedirectURI=" + this.signOutRedirectURI + ")";
    }

    public OauthConfiguration(@NotNull String str, String str2, @NotNull String str3, @NotNull Set<String> set, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(set, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.appClient = str;
        this.appSecret = str2;
        this.domain = str3;
        this.scopes = set;
        this.signInRedirectURI = str4;
        this.signOutRedirectURI = str5;
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.OauthConfiguration.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OauthConfiguration fromJson(JSONObject jSONObject) {
            LinkedHashSet linkedHashSet;
            if (jSONObject != null) {
                String strOptString = jSONObject.optString("AppClientId");
                String str = (strOptString == null || strOptString.length() == 0) ? null : strOptString;
                String strOptString2 = jSONObject.optString("AppClientSecret", null);
                String str2 = (strOptString2 == null || strOptString2.length() == 0) ? null : strOptString2;
                String strOptString3 = jSONObject.optString("WebDomain");
                String str3 = (strOptString3 == null || strOptString3.length() == 0) ? null : strOptString3;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("Scopes");
                if (jSONArrayOptJSONArray != null) {
                    Intrinsics.copydefault(jSONArrayOptJSONArray);
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    int length = jSONArrayOptJSONArray.length();
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            String strOptString4 = jSONArrayOptJSONArray.optString(i);
                            if (strOptString4 != null) {
                                Intrinsics.copydefault((Object) strOptString4);
                                linkedHashSet2.add(strOptString4);
                            }
                            if (i == length) {
                                break;
                            }
                            i++;
                        }
                    }
                    linkedHashSet = linkedHashSet2;
                } else {
                    linkedHashSet = null;
                }
                String strOptString5 = jSONObject.optString("SignInRedirectURI");
                String str4 = (strOptString5 == null || strOptString5.length() == 0) ? null : strOptString5;
                String strOptString6 = jSONObject.optString("SignOutRedirectURI");
                String str5 = (strOptString6 == null || strOptString6.length() == 0) ? null : strOptString6;
                if (str != null && str3 != null && linkedHashSet != null && str4 != null && str5 != null) {
                    return new OauthConfiguration(str, str2, str3, linkedHashSet, str4, str5);
                }
            }
            return null;
        }
    }
}

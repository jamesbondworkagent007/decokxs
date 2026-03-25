package com.amplifyframework.statemachine.codegen.data;

import com.just.agentweb.DefaultWebClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class UserPoolConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_REGION = "us-east-1";
    private final String appClient;
    private final String appClientSecret;
    private final Builder builder;
    private final String endpoint;
    private final String pinpointAppId;
    private final String poolId;
    private final String region;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Builder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UserPoolConfiguration copy$default(UserPoolConfiguration userPoolConfiguration, Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = userPoolConfiguration.builder;
        }
        return userPoolConfiguration.copy(builder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Builder component1() {
        return this.builder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UserPoolConfiguration copy(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        return new UserPoolConfiguration(builder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserPoolConfiguration) && Intrinsics.EZpvd(this.builder, ((UserPoolConfiguration) obj).builder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppClient() {
        return this.appClient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppClientSecret() {
        return this.appClientSecret;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Builder getBuilder() {
        return this.builder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndpoint() {
        return this.endpoint;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPinpointAppId() {
        return this.pinpointAppId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPoolId() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRegion() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.builder.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UserPoolConfiguration(builder=" + this.builder + ")";
    }

    public UserPoolConfiguration(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        this.builder = builder;
        this.region = builder.getRegion();
        this.endpoint = builder.getEndpoint();
        this.poolId = builder.getPoolId();
        this.appClient = builder.getAppClientId();
        this.appClientSecret = builder.getAppClientSecret();
        this.pinpointAppId = builder.getPinpointAppId();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Builder builder() {
            return new Builder(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder fromJson$aws_auth_cognito_release(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            return new Builder(jSONObject);
        }

        public final UserPoolConfiguration invoke(@NotNull Function1<? super Builder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Builder builder = new Builder(null, 1, 0 == true ? 1 : 0);
            function1.invoke(builder);
            return builder.build();
        }
    }

    public static final class Builder {
        private String appClientId;
        private String appClientSecret;
        private String endpoint;
        private String pinpointAppId;
        private String poolId;
        private String region;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder appClientId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.appClientId = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder appClientSecret(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.appClientSecret = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAppClientId() {
            return this.appClientId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getAppClientSecret() {
            return this.appClientSecret;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getEndpoint() {
            return this.endpoint;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPinpointAppId() {
            return this.pinpointAppId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPoolId() {
            return this.poolId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getRegion() {
            return this.region;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder pinpointAppId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.pinpointAppId = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder poolId(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.poolId = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Builder region(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.region = str;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAppClientId(String str) {
            this.appClientId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setAppClientSecret(String str) {
            this.appClientSecret = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setEndpoint(String str) {
            this.endpoint = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPinpointAppId(String str) {
            this.pinpointAppId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setPoolId(String str) {
            this.poolId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRegion(String str) {
            this.region = str;
        }

        public Builder(JSONObject jSONObject) {
            this.region = UserPoolConfiguration.DEFAULT_REGION;
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(Config.REGION.getKey());
                boolean z = true;
                this.region = Boolean.valueOf(strOptString == null || strOptString.length() == 0).booleanValue() ? null : strOptString;
                String strOptString2 = jSONObject.optString(Config.ENDPOINT.getKey());
                this.endpoint = validateEndpoint((strOptString2 == null || strOptString2.length() == 0) ? null : strOptString2);
                String strOptString3 = jSONObject.optString(Config.POOL_ID.getKey());
                this.poolId = Boolean.valueOf(strOptString3 == null || strOptString3.length() == 0).booleanValue() ? null : strOptString3;
                String strOptString4 = jSONObject.optString(Config.APP_CLIENT_ID.getKey());
                this.appClientId = Boolean.valueOf(strOptString4 == null || strOptString4.length() == 0).booleanValue() ? null : strOptString4;
                String strOptString5 = jSONObject.optString(Config.APP_CLIENT_SECRET.getKey());
                this.appClientSecret = Boolean.valueOf(strOptString5 == null || strOptString5.length() == 0).booleanValue() ? null : strOptString5;
                String strOptString6 = jSONObject.optString(Config.PINPOINT_APP_ID.getKey());
                if (strOptString6 != null && strOptString6.length() != 0) {
                    z = false;
                }
                this.pinpointAppId = Boolean.valueOf(z).booleanValue() ? null : strOptString6;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:org.json.JSONObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null org.json.JSONObject) : (r1v0 org.json.JSONObject))
 A[MD:(org.json.JSONObject):void (m)] (LINE:58) call: com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration.Builder.<init>(org.json.JSONObject):void type: THIS */
        public /* synthetic */ Builder(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jSONObject);
        }

        public final Builder endpoint(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.endpoint = validateEndpoint(str);
            return this;
        }

        public final UserPoolConfiguration build() {
            return new UserPoolConfiguration(this);
        }

        private final String validateEndpoint(String str) throws Exception {
            if (str != null) {
                try {
                    if (!new Regex("^(([a-zA-Z0-9]|[a-zA-Z0-9][a-zA-Z0-9\\-]*[a-zA-Z0-9])\\.)*([A-Za-z0-9]|[A-Za-z0-9][A-Za-z0-9\\-]*[A-Za-z0-9])$").matches(str)) {
                        throw new Exception("Invalid endpoint");
                    }
                } catch (Exception unused) {
                    throw new Exception("Invalid endpoint value " + str + ". Expected fully qualified hostname with no scheme, no path and no query");
                }
            }
            if (str == null) {
                return null;
            }
            return DefaultWebClient.HTTPS_SCHEME + str;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Config {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Config[] $VALUES;
        private final String key;
        public static final Config REGION = new Config("REGION", 0, "Region");
        public static final Config ENDPOINT = new Config("ENDPOINT", 1, "Endpoint");
        public static final Config POOL_ID = new Config("POOL_ID", 2, "PoolId");
        public static final Config APP_CLIENT_ID = new Config("APP_CLIENT_ID", 3, "AppClientId");
        public static final Config APP_CLIENT_SECRET = new Config("APP_CLIENT_SECRET", 4, "AppClientSecret");
        public static final Config PINPOINT_APP_ID = new Config("PINPOINT_APP_ID", 5, "PinpointAppId");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Config[] $values() {
            return new Config[]{REGION, ENDPOINT, POOL_ID, APP_CLIENT_ID, APP_CLIENT_SECRET, PINPOINT_APP_ID};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<Config> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Config valueOf(String str) {
            return (Config) Enum.valueOf(Config.class, str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static Config[] values() {
            return (Config[]) $VALUES.clone();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getKey() {
            return this.key;
        }

        private Config(String str, int i, String str2) {
            this.key = str2;
        }

        static {
            Config[] configArr$values = $values();
            $VALUES = configArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(configArr$values);
        }
    }
}

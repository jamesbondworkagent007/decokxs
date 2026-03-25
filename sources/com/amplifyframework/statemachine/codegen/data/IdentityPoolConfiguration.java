package com.amplifyframework.statemachine.codegen.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class IdentityPoolConfiguration {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_REGION = "us-east-1";
    private final Builder builder;
    private final String poolId;
    private final String region;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Builder builder() {
        return Companion.builder();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ IdentityPoolConfiguration copy$default(IdentityPoolConfiguration identityPoolConfiguration, Builder builder, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = identityPoolConfiguration.builder;
        }
        return identityPoolConfiguration.copy(builder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Builder component1() {
        return this.builder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IdentityPoolConfiguration copy(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        return new IdentityPoolConfiguration(builder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdentityPoolConfiguration) && Intrinsics.EZpvd(this.builder, ((IdentityPoolConfiguration) obj).builder);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Builder getBuilder() {
        return this.builder;
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
        return "IdentityPoolConfiguration(builder=" + this.builder + ")";
    }

    public IdentityPoolConfiguration(@NotNull Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "");
        this.builder = builder;
        this.region = builder.getRegion();
        this.poolId = builder.getPoolId();
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration.Companion.<init>():void type: THIS */
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

        public final IdentityPoolConfiguration invoke(@NotNull Function1<? super Builder, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            Builder builder = new Builder(null, 1, 0 == true ? 1 : 0);
            function1.invoke(builder);
            return builder.build();
        }
    }

    public static final class Builder {
        private String poolId;
        private String region;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
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
        public final void setPoolId(String str) {
            this.poolId = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setRegion(String str) {
            this.region = str;
        }

        public Builder(JSONObject jSONObject) {
            this.region = IdentityPoolConfiguration.DEFAULT_REGION;
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(Config.REGION.getKey());
                boolean z = true;
                this.region = Boolean.valueOf(strOptString == null || strOptString.length() == 0).booleanValue() ? null : strOptString;
                String strOptString2 = jSONObject.optString(Config.POOL_ID.getKey());
                if (strOptString2 != null && strOptString2.length() != 0) {
                    z = false;
                }
                this.poolId = Boolean.valueOf(z).booleanValue() ? null : strOptString2;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:org.json.JSONObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null org.json.JSONObject) : (r1v0 org.json.JSONObject))
 A[MD:(org.json.JSONObject):void (m)] (LINE:53) call: com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration.Builder.<init>(org.json.JSONObject):void type: THIS */
        public /* synthetic */ Builder(JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jSONObject);
        }

        public final IdentityPoolConfiguration build() {
            return new IdentityPoolConfiguration(this);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Config {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ Config[] $VALUES;
        private final String key;
        public static final Config REGION = new Config("REGION", 0, "Region");
        public static final Config POOL_ID = new Config("POOL_ID", 1, "PoolId");

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ Config[] $values() {
            return new Config[]{REGION, POOL_ID};
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

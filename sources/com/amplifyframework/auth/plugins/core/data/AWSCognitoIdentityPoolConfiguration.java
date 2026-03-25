package com.amplifyframework.auth.plugins.core.data;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AWSCognitoIdentityPoolConfiguration {
    private final String poolId;
    private final String region;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AWSCognitoIdentityPoolConfiguration copy$default(AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aWSCognitoIdentityPoolConfiguration.poolId;
        }
        if ((i & 2) != 0) {
            str2 = aWSCognitoIdentityPoolConfiguration.region;
        }
        return aWSCognitoIdentityPoolConfiguration.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.poolId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.region;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoIdentityPoolConfiguration copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new AWSCognitoIdentityPoolConfiguration(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AWSCognitoIdentityPoolConfiguration)) {
            return false;
        }
        AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration = (AWSCognitoIdentityPoolConfiguration) obj;
        return Intrinsics.EZpvd((Object) this.poolId, (Object) aWSCognitoIdentityPoolConfiguration.poolId) && Intrinsics.EZpvd((Object) this.region, (Object) aWSCognitoIdentityPoolConfiguration.region);
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
        return (this.poolId.hashCode() * 31) + this.region.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AWSCognitoIdentityPoolConfiguration(poolId=" + this.poolId + ", region=" + this.region + ")";
    }

    public AWSCognitoIdentityPoolConfiguration(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.poolId = str;
        this.region = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("us-east-1") : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AWSCognitoIdentityPoolConfiguration(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "us-east-1" : str2);
    }
}

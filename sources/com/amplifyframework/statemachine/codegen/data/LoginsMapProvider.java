package com.amplifyframework.statemachine.codegen.data;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56390yDp;
import o.C56423yEv;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LoginsMapProvider {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.LoginsMapProvider.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ LoginsMapProvider(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, String> getLogins();

    public static final class UnAuthLogins extends LoginsMapProvider {
        private final Map<String, String> logins;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public UnAuthLogins() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.data.LoginsMapProvider$UnAuthLogins */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UnAuthLogins copy$default(UnAuthLogins unAuthLogins, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = unAuthLogins.logins;
            }
            return unAuthLogins.copy(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component1() {
            return this.logins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final UnAuthLogins copy(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new UnAuthLogins(map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnAuthLogins) && Intrinsics.EZpvd(this.logins, ((UnAuthLogins) obj).logins);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.LoginsMapProvider
        public Map<String, String> getLogins() {
            return this.logins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.logins.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "UnAuthLogins(logins=" + this.logins + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnAuthLogins(@NotNull Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.logins = map;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0004: INVOKE  STATIC call: o.yEw.KWHzl():java.util.Map A[MD:<K, V>:():java.util.Map<K, V> (m), WRAPPED] (LINE:19)) : (r1v0 java.util.Map))
 A[MD:(java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:19) call: com.amplifyframework.statemachine.codegen.data.LoginsMapProvider.UnAuthLogins.<init>(java.util.Map):void type: THIS */
        public /* synthetic */ UnAuthLogins(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C56424yEw.KWHzl() : map);
        }
    }

    private LoginsMapProvider() {
    }

    public static final class CognitoUserPoolLogins extends LoginsMapProvider {
        private final String idToken;
        private final Map<String, String> logins;
        private final String poolId;
        private final String providerName;
        private final String region;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final String component1() {
            return this.region;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final String component2() {
            return this.poolId;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final String component3() {
            return this.idToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ CognitoUserPoolLogins copy$default(CognitoUserPoolLogins cognitoUserPoolLogins, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cognitoUserPoolLogins.region;
            }
            if ((i & 2) != 0) {
                str2 = cognitoUserPoolLogins.poolId;
            }
            if ((i & 4) != 0) {
                str3 = cognitoUserPoolLogins.idToken;
            }
            return cognitoUserPoolLogins.copy(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CognitoUserPoolLogins copy(String str, String str2, @NotNull String str3) {
            Intrinsics.checkNotNullParameter(str3, "");
            return new CognitoUserPoolLogins(str, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CognitoUserPoolLogins)) {
                return false;
            }
            CognitoUserPoolLogins cognitoUserPoolLogins = (CognitoUserPoolLogins) obj;
            return Intrinsics.EZpvd((Object) this.region, (Object) cognitoUserPoolLogins.region) && Intrinsics.EZpvd((Object) this.poolId, (Object) cognitoUserPoolLogins.poolId) && Intrinsics.EZpvd((Object) this.idToken, (Object) cognitoUserPoolLogins.idToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.LoginsMapProvider
        public Map<String, String> getLogins() {
            return this.logins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getProviderName() {
            return this.providerName;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.region;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.poolId;
            return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.idToken.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CognitoUserPoolLogins(region=" + this.region + ", poolId=" + this.poolId + ", idToken=" + this.idToken + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (r4v0 java.lang.String)
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:21) call: com.amplifyframework.statemachine.codegen.data.LoginsMapProvider.CognitoUserPoolLogins.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ CognitoUserPoolLogins(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CognitoUserPoolLogins(String str, String str2, @NotNull String str3) {
            super(null);
            Intrinsics.checkNotNullParameter(str3, "");
            this.region = str;
            this.poolId = str2;
            this.idToken = str3;
            String str4 = "cognito-idp." + str + ".amazonaws.com/" + str2;
            this.providerName = str4;
            this.logins = C56423yEv.EZpvd(C56390yDp.OLrzqt(str4, str3));
        }
    }

    public static final class AuthProviderLogins extends LoginsMapProvider {
        private final FederatedToken federatedToken;
        private final Map<String, String> logins;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private final FederatedToken component1() {
            return this.federatedToken;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ AuthProviderLogins copy$default(AuthProviderLogins authProviderLogins, FederatedToken federatedToken, int i, Object obj) {
            if ((i & 1) != 0) {
                federatedToken = authProviderLogins.federatedToken;
            }
            return authProviderLogins.copy(federatedToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AuthProviderLogins copy(@NotNull FederatedToken federatedToken) {
            Intrinsics.checkNotNullParameter(federatedToken, "");
            return new AuthProviderLogins(federatedToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AuthProviderLogins) && Intrinsics.EZpvd(this.federatedToken, ((AuthProviderLogins) obj).federatedToken);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.codegen.data.LoginsMapProvider
        public Map<String, String> getLogins() {
            return this.logins;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.federatedToken.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "AuthProviderLogins(federatedToken=" + this.federatedToken + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthProviderLogins(@NotNull FederatedToken federatedToken) {
            super(null);
            Intrinsics.checkNotNullParameter(federatedToken, "");
            this.federatedToken = federatedToken;
            this.logins = C56423yEv.EZpvd(C56390yDp.OLrzqt(federatedToken.getProviderName(), federatedToken.getToken()));
        }
    }
}

package com.amplifyframework.statemachine.codegen.data;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SignInData {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.data.SignInData.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SignInData(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SignInData() {
    }

    public static final class SRPSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.data.SignInData$SRPSignInData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SRPSignInData copy$default(SRPSignInData sRPSignInData, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sRPSignInData.username;
            }
            if ((i & 2) != 0) {
                str2 = sRPSignInData.password;
            }
            if ((i & 4) != 0) {
                map = sRPSignInData.metadata;
            }
            return sRPSignInData.copy(str, str2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.password;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component3() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SRPSignInData copy(String str, String str2, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new SRPSignInData(str, str2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SRPSignInData)) {
                return false;
            }
            SRPSignInData sRPSignInData = (SRPSignInData) obj;
            return Intrinsics.EZpvd((Object) this.username, (Object) sRPSignInData.username) && Intrinsics.EZpvd((Object) this.password, (Object) sRPSignInData.password) && Intrinsics.EZpvd(this.metadata, sRPSignInData.metadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPassword() {
            return this.password;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsername() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.username;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.password;
            return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.metadata.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "SRPSignInData(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SRPSignInData(String str, String str2, @NotNull Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.username = str;
            this.password = str2;
            this.metadata = map;
        }
    }

    public static final class CustomAuthSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String username;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.data.SignInData$CustomAuthSignInData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomAuthSignInData copy$default(CustomAuthSignInData customAuthSignInData, String str, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customAuthSignInData.username;
            }
            if ((i & 2) != 0) {
                map = customAuthSignInData.metadata;
            }
            return customAuthSignInData.copy(str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component2() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomAuthSignInData copy(String str, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new CustomAuthSignInData(str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomAuthSignInData)) {
                return false;
            }
            CustomAuthSignInData customAuthSignInData = (CustomAuthSignInData) obj;
            return Intrinsics.EZpvd((Object) this.username, (Object) customAuthSignInData.username) && Intrinsics.EZpvd(this.metadata, customAuthSignInData.metadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsername() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.username;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.metadata.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CustomAuthSignInData(username=" + this.username + ", metadata=" + this.metadata + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomAuthSignInData(String str, @NotNull Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.username = str;
            this.metadata = map;
        }
    }

    public static final class MigrationAuthSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.data.SignInData$MigrationAuthSignInData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MigrationAuthSignInData copy$default(MigrationAuthSignInData migrationAuthSignInData, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = migrationAuthSignInData.username;
            }
            if ((i & 2) != 0) {
                str2 = migrationAuthSignInData.password;
            }
            if ((i & 4) != 0) {
                map = migrationAuthSignInData.metadata;
            }
            return migrationAuthSignInData.copy(str, str2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.password;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component3() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MigrationAuthSignInData copy(String str, String str2, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new MigrationAuthSignInData(str, str2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MigrationAuthSignInData)) {
                return false;
            }
            MigrationAuthSignInData migrationAuthSignInData = (MigrationAuthSignInData) obj;
            return Intrinsics.EZpvd((Object) this.username, (Object) migrationAuthSignInData.username) && Intrinsics.EZpvd((Object) this.password, (Object) migrationAuthSignInData.password) && Intrinsics.EZpvd(this.metadata, migrationAuthSignInData.metadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPassword() {
            return this.password;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsername() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.username;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.password;
            return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.metadata.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "MigrationAuthSignInData(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MigrationAuthSignInData(String str, String str2, @NotNull Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.username = str;
            this.password = str2;
            this.metadata = map;
        }
    }

    public static final class CustomSRPAuthSignInData extends SignInData {
        private final Map<String, String> metadata;
        private final String password;
        private final String username;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.data.SignInData$CustomSRPAuthSignInData */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CustomSRPAuthSignInData copy$default(CustomSRPAuthSignInData customSRPAuthSignInData, String str, String str2, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                str = customSRPAuthSignInData.username;
            }
            if ((i & 2) != 0) {
                str2 = customSRPAuthSignInData.password;
            }
            if ((i & 4) != 0) {
                map = customSRPAuthSignInData.metadata;
            }
            return customSRPAuthSignInData.copy(str, str2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.password;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> component3() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CustomSRPAuthSignInData copy(String str, String str2, @NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, "");
            return new CustomSRPAuthSignInData(str, str2, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CustomSRPAuthSignInData)) {
                return false;
            }
            CustomSRPAuthSignInData customSRPAuthSignInData = (CustomSRPAuthSignInData) obj;
            return Intrinsics.EZpvd((Object) this.username, (Object) customSRPAuthSignInData.username) && Intrinsics.EZpvd((Object) this.password, (Object) customSRPAuthSignInData.password) && Intrinsics.EZpvd(this.metadata, customSRPAuthSignInData.metadata);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Map<String, String> getMetadata() {
            return this.metadata;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getPassword() {
            return this.password;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsername() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            String str = this.username;
            int iHashCode = str == null ? 0 : str.hashCode();
            String str2 = this.password;
            return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.metadata.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "CustomSRPAuthSignInData(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomSRPAuthSignInData(String str, String str2, @NotNull Map<String, String> map) {
            super(null);
            Intrinsics.checkNotNullParameter(map, "");
            this.username = str;
            this.password = str2;
            this.metadata = map;
        }
    }

    public static final class HostedUISignInData extends SignInData {
        private final HostedUIOptions hostedUIOptions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ HostedUISignInData copy$default(HostedUISignInData hostedUISignInData, HostedUIOptions hostedUIOptions, int i, Object obj) {
            if ((i & 1) != 0) {
                hostedUIOptions = hostedUISignInData.hostedUIOptions;
            }
            return hostedUISignInData.copy(hostedUIOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUIOptions component1() {
            return this.hostedUIOptions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUISignInData copy(@NotNull HostedUIOptions hostedUIOptions) {
            Intrinsics.checkNotNullParameter(hostedUIOptions, "");
            return new HostedUISignInData(hostedUIOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HostedUISignInData) && Intrinsics.EZpvd(this.hostedUIOptions, ((HostedUISignInData) obj).hostedUIOptions);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HostedUIOptions getHostedUIOptions() {
            return this.hostedUIOptions;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.hostedUIOptions.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "HostedUISignInData(hostedUIOptions=" + this.hostedUIOptions + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HostedUISignInData(@NotNull HostedUIOptions hostedUIOptions) {
            super(null);
            Intrinsics.checkNotNullParameter(hostedUIOptions, "");
            this.hostedUIOptions = hostedUIOptions;
        }
    }
}

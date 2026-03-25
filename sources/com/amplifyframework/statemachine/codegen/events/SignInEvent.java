package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInEvent implements StateMachineEvent {
    private final EventType eventType;
    private final Date time;
    private final String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EventType getEventType() {
        return this.eventType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public Date getTime() {
        return this.time;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getType() {
        return this.type;
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.SignInEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EventType() {
        }

        public static final class InitiateSignInWithSRP extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SignInEvent$EventType$InitiateSignInWithSRP */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignInWithSRP copy$default(InitiateSignInWithSRP initiateSignInWithSRP, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSignInWithSRP.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateSignInWithSRP.password;
                }
                if ((i & 4) != 0) {
                    map = initiateSignInWithSRP.metadata;
                }
                return initiateSignInWithSRP.copy(str, str2, map);
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
            public final InitiateSignInWithSRP copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new InitiateSignInWithSRP(str, str2, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithSRP)) {
                    return false;
                }
                InitiateSignInWithSRP initiateSignInWithSRP = (InitiateSignInWithSRP) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) initiateSignInWithSRP.username) && Intrinsics.EZpvd((Object) this.password, (Object) initiateSignInWithSRP.password) && Intrinsics.EZpvd(this.metadata, initiateSignInWithSRP.metadata);
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
                return (((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.metadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitiateSignInWithSRP(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithSRP(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.username = str;
                this.password = str2;
                this.metadata = map;
            }
        }

        public static final class InitiateSignInWithCustom extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SignInEvent$EventType$InitiateSignInWithCustom */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignInWithCustom copy$default(InitiateSignInWithCustom initiateSignInWithCustom, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSignInWithCustom.username;
                }
                if ((i & 2) != 0) {
                    map = initiateSignInWithCustom.metadata;
                }
                return initiateSignInWithCustom.copy(str, map);
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
            public final InitiateSignInWithCustom copy(@NotNull String str, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new InitiateSignInWithCustom(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithCustom)) {
                    return false;
                }
                InitiateSignInWithCustom initiateSignInWithCustom = (InitiateSignInWithCustom) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) initiateSignInWithCustom.username) && Intrinsics.EZpvd(this.metadata, initiateSignInWithCustom.metadata);
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
                return (this.username.hashCode() * 31) + this.metadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitiateSignInWithCustom(username=" + this.username + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithCustom(@NotNull String str, @NotNull Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.username = str;
                this.metadata = map;
            }
        }

        public static final class InitiateCustomSignInWithSRP extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SignInEvent$EventType$InitiateCustomSignInWithSRP */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateCustomSignInWithSRP copy$default(InitiateCustomSignInWithSRP initiateCustomSignInWithSRP, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateCustomSignInWithSRP.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateCustomSignInWithSRP.password;
                }
                if ((i & 4) != 0) {
                    map = initiateCustomSignInWithSRP.metadata;
                }
                return initiateCustomSignInWithSRP.copy(str, str2, map);
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
            public final InitiateCustomSignInWithSRP copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new InitiateCustomSignInWithSRP(str, str2, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateCustomSignInWithSRP)) {
                    return false;
                }
                InitiateCustomSignInWithSRP initiateCustomSignInWithSRP = (InitiateCustomSignInWithSRP) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) initiateCustomSignInWithSRP.username) && Intrinsics.EZpvd((Object) this.password, (Object) initiateCustomSignInWithSRP.password) && Intrinsics.EZpvd(this.metadata, initiateCustomSignInWithSRP.metadata);
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
                return (((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.metadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitiateCustomSignInWithSRP(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateCustomSignInWithSRP(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.username = str;
                this.password = str2;
                this.metadata = map;
            }
        }

        public static final class InitiateMigrateAuth extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SignInEvent$EventType$InitiateMigrateAuth */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateMigrateAuth copy$default(InitiateMigrateAuth initiateMigrateAuth, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateMigrateAuth.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateMigrateAuth.password;
                }
                if ((i & 4) != 0) {
                    map = initiateMigrateAuth.metadata;
                }
                return initiateMigrateAuth.copy(str, str2, map);
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
            public final InitiateMigrateAuth copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new InitiateMigrateAuth(str, str2, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateMigrateAuth)) {
                    return false;
                }
                InitiateMigrateAuth initiateMigrateAuth = (InitiateMigrateAuth) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) initiateMigrateAuth.username) && Intrinsics.EZpvd((Object) this.password, (Object) initiateMigrateAuth.password) && Intrinsics.EZpvd(this.metadata, initiateMigrateAuth.metadata);
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
                return (((this.username.hashCode() * 31) + this.password.hashCode()) * 31) + this.metadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitiateMigrateAuth(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateMigrateAuth(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.username = str;
                this.password = str2;
                this.metadata = map;
            }
        }

        public static final class InitiateHostedUISignIn extends EventType {
            private final SignInData.HostedUISignInData hostedUISignInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ InitiateHostedUISignIn copy$default(InitiateHostedUISignIn initiateHostedUISignIn, SignInData.HostedUISignInData hostedUISignInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    hostedUISignInData = initiateHostedUISignIn.hostedUISignInData;
                }
                return initiateHostedUISignIn.copy(hostedUISignInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInData.HostedUISignInData component1() {
                return this.hostedUISignInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InitiateHostedUISignIn copy(@NotNull SignInData.HostedUISignInData hostedUISignInData) {
                Intrinsics.checkNotNullParameter(hostedUISignInData, "");
                return new InitiateHostedUISignIn(hostedUISignInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateHostedUISignIn) && Intrinsics.EZpvd(this.hostedUISignInData, ((InitiateHostedUISignIn) obj).hostedUISignInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInData.HostedUISignInData getHostedUISignInData() {
                return this.hostedUISignInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.hostedUISignInData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitiateHostedUISignIn(hostedUISignInData=" + this.hostedUISignInData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateHostedUISignIn(@NotNull SignInData.HostedUISignInData hostedUISignInData) {
                super(null);
                Intrinsics.checkNotNullParameter(hostedUISignInData, "");
                this.hostedUISignInData = hostedUISignInData;
            }
        }

        public static final class SignedIn extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public SignedIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignedIn copy$default(SignedIn signedIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = signedIn.id;
                }
                return signedIn.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedIn copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new SignedIn(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignedIn) && Intrinsics.EZpvd((Object) this.id, (Object) ((SignedIn) obj).id);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.id.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignedIn(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignedIn(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:52) call: com.amplifyframework.statemachine.codegen.events.SignInEvent.EventType.SignedIn.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ SignedIn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class InitiateSignInWithDeviceSRP extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SignInEvent$EventType$InitiateSignInWithDeviceSRP */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSignInWithDeviceSRP copy$default(InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSignInWithDeviceSRP.username;
                }
                if ((i & 2) != 0) {
                    map = initiateSignInWithDeviceSRP.metadata;
                }
                return initiateSignInWithDeviceSRP.copy(str, map);
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
            public final InitiateSignInWithDeviceSRP copy(@NotNull String str, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new InitiateSignInWithDeviceSRP(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSignInWithDeviceSRP)) {
                    return false;
                }
                InitiateSignInWithDeviceSRP initiateSignInWithDeviceSRP = (InitiateSignInWithDeviceSRP) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) initiateSignInWithDeviceSRP.username) && Intrinsics.EZpvd(this.metadata, initiateSignInWithDeviceSRP.metadata);
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
                return (this.username.hashCode() * 31) + this.metadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitiateSignInWithDeviceSRP(username=" + this.username + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSignInWithDeviceSRP(@NotNull String str, @NotNull Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.username = str;
                this.metadata = map;
            }
        }

        public static final class ConfirmDevice extends EventType {
            private final DeviceMetadata.Metadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ConfirmDevice copy$default(ConfirmDevice confirmDevice, DeviceMetadata.Metadata metadata, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    metadata = confirmDevice.deviceMetadata;
                }
                if ((i & 2) != 0) {
                    signedInData = confirmDevice.signedInData;
                }
                return confirmDevice.copy(metadata, signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeviceMetadata.Metadata component1() {
                return this.deviceMetadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component2() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConfirmDevice copy(@NotNull DeviceMetadata.Metadata metadata, @NotNull SignedInData signedInData) {
                Intrinsics.checkNotNullParameter(metadata, "");
                Intrinsics.checkNotNullParameter(signedInData, "");
                return new ConfirmDevice(metadata, signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfirmDevice)) {
                    return false;
                }
                ConfirmDevice confirmDevice = (ConfirmDevice) obj;
                return Intrinsics.EZpvd(this.deviceMetadata, confirmDevice.deviceMetadata) && Intrinsics.EZpvd(this.signedInData, confirmDevice.signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeviceMetadata.Metadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.deviceMetadata.hashCode() * 31) + this.signedInData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConfirmDevice(deviceMetadata=" + this.deviceMetadata + ", signedInData=" + this.signedInData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConfirmDevice(@NotNull DeviceMetadata.Metadata metadata, @NotNull SignedInData signedInData) {
                super(null);
                Intrinsics.checkNotNullParameter(metadata, "");
                Intrinsics.checkNotNullParameter(signedInData, "");
                this.deviceMetadata = metadata;
                this.signedInData = signedInData;
            }
        }

        public static final class FinalizeSignIn extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public FinalizeSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = finalizeSignIn.id;
                }
                return finalizeSignIn.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FinalizeSignIn copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new FinalizeSignIn(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinalizeSignIn) && Intrinsics.EZpvd((Object) this.id, (Object) ((FinalizeSignIn) obj).id);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getId() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.id.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FinalizeSignIn(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:62) call: com.amplifyframework.statemachine.codegen.events.SignInEvent.EventType.FinalizeSignIn.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ FinalizeSignIn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class ReceivedChallenge extends EventType {
            private final AuthChallenge challenge;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ReceivedChallenge copy$default(ReceivedChallenge receivedChallenge, AuthChallenge authChallenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    authChallenge = receivedChallenge.challenge;
                }
                return receivedChallenge.copy(authChallenge);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthChallenge component1() {
                return this.challenge;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ReceivedChallenge copy(@NotNull AuthChallenge authChallenge) {
                Intrinsics.checkNotNullParameter(authChallenge, "");
                return new ReceivedChallenge(authChallenge);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReceivedChallenge) && Intrinsics.EZpvd(this.challenge, ((ReceivedChallenge) obj).challenge);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthChallenge getChallenge() {
                return this.challenge;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.challenge.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ReceivedChallenge(challenge=" + this.challenge + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReceivedChallenge(@NotNull AuthChallenge authChallenge) {
                super(null);
                Intrinsics.checkNotNullParameter(authChallenge, "");
                this.challenge = authChallenge;
            }
        }

        public static final class ThrowError extends EventType {
            private final Exception exception;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                return throwError.copy(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception component1() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ThrowError copy(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new ThrowError(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && Intrinsics.EZpvd(this.exception, ((ThrowError) obj).exception);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception getException() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.exception.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ThrowError(exception=" + this.exception + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(@NotNull Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.exception = exc;
            }
        }

        public static final class InitiateTOTPSetup extends EventType {
            private final SignInTOTPSetupData signInTOTPSetupData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ InitiateTOTPSetup copy$default(InitiateTOTPSetup initiateTOTPSetup, SignInTOTPSetupData signInTOTPSetupData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signInTOTPSetupData = initiateTOTPSetup.signInTOTPSetupData;
                }
                return initiateTOTPSetup.copy(signInTOTPSetupData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInTOTPSetupData component1() {
                return this.signInTOTPSetupData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InitiateTOTPSetup copy(@NotNull SignInTOTPSetupData signInTOTPSetupData) {
                Intrinsics.checkNotNullParameter(signInTOTPSetupData, "");
                return new InitiateTOTPSetup(signInTOTPSetupData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitiateTOTPSetup) && Intrinsics.EZpvd(this.signInTOTPSetupData, ((InitiateTOTPSetup) obj).signInTOTPSetupData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInTOTPSetupData getSignInTOTPSetupData() {
                return this.signInTOTPSetupData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.signInTOTPSetupData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitiateTOTPSetup(signInTOTPSetupData=" + this.signInTOTPSetupData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateTOTPSetup(@NotNull SignInTOTPSetupData signInTOTPSetupData) {
                super(null);
                Intrinsics.checkNotNullParameter(signInTOTPSetupData, "");
                this.signInTOTPSetupData = signInTOTPSetupData;
            }
        }
    }

    public SignInEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.SignInEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.SignInEvent$EventType, java.util.Date):void (m)] (LINE:26) call: com.amplifyframework.statemachine.codegen.events.SignInEvent.<init>(com.amplifyframework.statemachine.codegen.events.SignInEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ SignInEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }
}

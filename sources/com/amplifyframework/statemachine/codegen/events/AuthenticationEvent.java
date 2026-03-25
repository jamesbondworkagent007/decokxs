package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthenticationEvent implements StateMachineEvent {
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

    public AuthenticationEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.AuthenticationEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.AuthenticationEvent$EventType, java.util.Date):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.events.AuthenticationEvent.<init>(com.amplifyframework.statemachine.codegen.events.AuthenticationEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ AuthenticationEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.AuthenticationEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EventType() {
        }

        public static final class Configure extends EventType {
            private final AuthConfiguration configuration;
            private final AmplifyCredential storedCredentials;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Configure copy$default(Configure configure, AuthConfiguration authConfiguration, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    authConfiguration = configure.configuration;
                }
                if ((i & 2) != 0) {
                    amplifyCredential = configure.storedCredentials;
                }
                return configure.copy(authConfiguration, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration component1() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component2() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Configure copy(@NotNull AuthConfiguration authConfiguration, @NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new Configure(authConfiguration, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Configure)) {
                    return false;
                }
                Configure configure = (Configure) obj;
                return Intrinsics.EZpvd(this.configuration, configure.configuration) && Intrinsics.EZpvd(this.storedCredentials, configure.storedCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthConfiguration getConfiguration() {
                return this.configuration;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.configuration.hashCode() * 31) + this.storedCredentials.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Configure(configuration=" + this.configuration + ", storedCredentials=" + this.storedCredentials + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Configure(@NotNull AuthConfiguration authConfiguration, @NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(authConfiguration, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.configuration = authConfiguration;
                this.storedCredentials = amplifyCredential;
            }
        }

        /* JADX INFO: loaded from: classes14.dex */
        public static final class Configured extends EventType {
            public static final Configured INSTANCE = new Configured();

            private Configured() {
                super(null);
            }
        }

        public static final class InitializedSignedIn extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ InitializedSignedIn copy$default(InitializedSignedIn initializedSignedIn, SignedInData signedInData, DeviceMetadata deviceMetadata, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = initializedSignedIn.signedInData;
                }
                if ((i & 2) != 0) {
                    deviceMetadata = initializedSignedIn.deviceMetadata;
                }
                return initializedSignedIn.copy(signedInData, deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeviceMetadata component2() {
                return this.deviceMetadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InitializedSignedIn copy(@NotNull SignedInData signedInData, @NotNull DeviceMetadata deviceMetadata) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                Intrinsics.checkNotNullParameter(deviceMetadata, "");
                return new InitializedSignedIn(signedInData, deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitializedSignedIn)) {
                    return false;
                }
                InitializedSignedIn initializedSignedIn = (InitializedSignedIn) obj;
                return Intrinsics.EZpvd(this.signedInData, initializedSignedIn.signedInData) && Intrinsics.EZpvd(this.deviceMetadata, initializedSignedIn.deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.signedInData.hashCode() * 31) + this.deviceMetadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitializedSignedIn(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializedSignedIn(@NotNull SignedInData signedInData, @NotNull DeviceMetadata deviceMetadata) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                Intrinsics.checkNotNullParameter(deviceMetadata, "");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }
        }

        public static final class InitializedSignedOut extends EventType {
            private final SignedOutData signedOutData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ InitializedSignedOut copy$default(InitializedSignedOut initializedSignedOut, SignedOutData signedOutData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedOutData = initializedSignedOut.signedOutData;
                }
                return initializedSignedOut.copy(signedOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedOutData component1() {
                return this.signedOutData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InitializedSignedOut copy(@NotNull SignedOutData signedOutData) {
                Intrinsics.checkNotNullParameter(signedOutData, "");
                return new InitializedSignedOut(signedOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof InitializedSignedOut) && Intrinsics.EZpvd(this.signedOutData, ((InitializedSignedOut) obj).signedOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedOutData getSignedOutData() {
                return this.signedOutData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.signedOutData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InitializedSignedOut(signedOutData=" + this.signedOutData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializedSignedOut(@NotNull SignedOutData signedOutData) {
                super(null);
                Intrinsics.checkNotNullParameter(signedOutData, "");
                this.signedOutData = signedOutData;
            }
        }

        public static final class InitializedFederated extends EventType {
            public static final InitializedFederated INSTANCE = new InitializedFederated();

            private InitializedFederated() {
                super(null);
            }
        }

        public static final class SignInRequested extends EventType {
            private final SignInData signInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignInRequested copy$default(SignInRequested signInRequested, SignInData signInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signInData = signInRequested.signInData;
                }
                return signInRequested.copy(signInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInData component1() {
                return this.signInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInRequested copy(@NotNull SignInData signInData) {
                Intrinsics.checkNotNullParameter(signInData, "");
                return new SignInRequested(signInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignInRequested) && Intrinsics.EZpvd(this.signInData, ((SignInRequested) obj).signInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInData getSignInData() {
                return this.signInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.signInData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignInRequested(signInData=" + this.signInData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignInRequested(@NotNull SignInData signInData) {
                super(null);
                Intrinsics.checkNotNullParameter(signInData, "");
                this.signInData = signInData;
            }
        }

        public static final class SignInCompleted extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignInCompleted copy$default(SignInCompleted signInCompleted, SignedInData signedInData, DeviceMetadata deviceMetadata, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = signInCompleted.signedInData;
                }
                if ((i & 2) != 0) {
                    deviceMetadata = signInCompleted.deviceMetadata;
                }
                return signInCompleted.copy(signedInData, deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeviceMetadata component2() {
                return this.deviceMetadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInCompleted copy(@NotNull SignedInData signedInData, @NotNull DeviceMetadata deviceMetadata) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                Intrinsics.checkNotNullParameter(deviceMetadata, "");
                return new SignInCompleted(signedInData, deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignInCompleted)) {
                    return false;
                }
                SignInCompleted signInCompleted = (SignInCompleted) obj;
                return Intrinsics.EZpvd(this.signedInData, signInCompleted.signedInData) && Intrinsics.EZpvd(this.deviceMetadata, signInCompleted.deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.signedInData.hashCode() * 31) + this.deviceMetadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignInCompleted(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignInCompleted(@NotNull SignedInData signedInData, @NotNull DeviceMetadata deviceMetadata) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                Intrinsics.checkNotNullParameter(deviceMetadata, "");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }
        }

        public static final class SignOutRequested extends EventType {
            private final SignOutData signOutData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignOutRequested copy$default(SignOutRequested signOutRequested, SignOutData signOutData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signOutData = signOutRequested.signOutData;
                }
                return signOutRequested.copy(signOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignOutData component1() {
                return this.signOutData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignOutRequested copy(@NotNull SignOutData signOutData) {
                Intrinsics.checkNotNullParameter(signOutData, "");
                return new SignOutRequested(signOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignOutRequested) && Intrinsics.EZpvd(this.signOutData, ((SignOutRequested) obj).signOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignOutData getSignOutData() {
                return this.signOutData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.signOutData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignOutRequested(signOutData=" + this.signOutData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignOutRequested(@NotNull SignOutData signOutData) {
                super(null);
                Intrinsics.checkNotNullParameter(signOutData, "");
                this.signOutData = signOutData;
            }
        }

        public static final class CancelSignIn extends EventType {
            private final Exception error;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public CancelSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CancelSignIn copy$default(CancelSignIn cancelSignIn, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = cancelSignIn.error;
                }
                return cancelSignIn.copy(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception component1() {
                return this.error;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CancelSignIn copy(Exception exc) {
                return new CancelSignIn(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CancelSignIn) && Intrinsics.EZpvd(this.error, ((CancelSignIn) obj).error);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception getError() {
                return this.error;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                Exception exc = this.error;
                if (exc == null) {
                    return 0;
                }
                return exc.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CancelSignIn(error=" + this.error + ")";
            }

            public CancelSignIn(Exception exc) {
                super(null);
                this.error = exc;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.Exception:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Exception) : (r1v0 java.lang.Exception))
 A[MD:(java.lang.Exception):void (m)] (LINE:43) call: com.amplifyframework.statemachine.codegen.events.AuthenticationEvent.EventType.CancelSignIn.<init>(java.lang.Exception):void type: THIS */
            public /* synthetic */ CancelSignIn(Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : exc);
            }
        }

        public static final class CancelSignOut extends EventType {
            private final DeviceMetadata deviceMetadata;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CancelSignOut copy$default(CancelSignOut cancelSignOut, SignedInData signedInData, DeviceMetadata deviceMetadata, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = cancelSignOut.signedInData;
                }
                if ((i & 2) != 0) {
                    deviceMetadata = cancelSignOut.deviceMetadata;
                }
                return cancelSignOut.copy(signedInData, deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeviceMetadata component2() {
                return this.deviceMetadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CancelSignOut copy(@NotNull SignedInData signedInData, @NotNull DeviceMetadata deviceMetadata) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                Intrinsics.checkNotNullParameter(deviceMetadata, "");
                return new CancelSignOut(signedInData, deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CancelSignOut)) {
                    return false;
                }
                CancelSignOut cancelSignOut = (CancelSignOut) obj;
                return Intrinsics.EZpvd(this.signedInData, cancelSignOut.signedInData) && Intrinsics.EZpvd(this.deviceMetadata, cancelSignOut.deviceMetadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final DeviceMetadata getDeviceMetadata() {
                return this.deviceMetadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.signedInData.hashCode() * 31) + this.deviceMetadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CancelSignOut(signedInData=" + this.signedInData + ", deviceMetadata=" + this.deviceMetadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelSignOut(@NotNull SignedInData signedInData, @NotNull DeviceMetadata deviceMetadata) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                Intrinsics.checkNotNullParameter(deviceMetadata, "");
                this.signedInData = signedInData;
                this.deviceMetadata = deviceMetadata;
            }
        }

        public static final class ClearFederationToIdentityPool extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ClearFederationToIdentityPool() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ClearFederationToIdentityPool copy$default(ClearFederationToIdentityPool clearFederationToIdentityPool, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = clearFederationToIdentityPool.id;
                }
                return clearFederationToIdentityPool.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ClearFederationToIdentityPool copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ClearFederationToIdentityPool(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClearFederationToIdentityPool) && Intrinsics.EZpvd((Object) this.id, (Object) ((ClearFederationToIdentityPool) obj).id);
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
                return "ClearFederationToIdentityPool(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClearFederationToIdentityPool(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:45) call: com.amplifyframework.statemachine.codegen.events.AuthenticationEvent.EventType.ClearFederationToIdentityPool.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ ClearFederationToIdentityPool(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
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
    }
}

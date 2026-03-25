package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class DeviceSRPSignInEvent implements StateMachineEvent {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class RespondDeviceSRPChallenge extends EventType {
            private final Map<String, String> metadata;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent$EventType$RespondDeviceSRPChallenge */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondDeviceSRPChallenge copy$default(RespondDeviceSRPChallenge respondDeviceSRPChallenge, String str, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = respondDeviceSRPChallenge.username;
                }
                if ((i & 2) != 0) {
                    map = respondDeviceSRPChallenge.metadata;
                }
                return respondDeviceSRPChallenge.copy(str, map);
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
            public final RespondDeviceSRPChallenge copy(@NotNull String str, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new RespondDeviceSRPChallenge(str, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondDeviceSRPChallenge)) {
                    return false;
                }
                RespondDeviceSRPChallenge respondDeviceSRPChallenge = (RespondDeviceSRPChallenge) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) respondDeviceSRPChallenge.username) && Intrinsics.EZpvd(this.metadata, respondDeviceSRPChallenge.metadata);
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
                return "RespondDeviceSRPChallenge(username=" + this.username + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondDeviceSRPChallenge(@NotNull String str, @NotNull Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.username = str;
                this.metadata = map;
            }
        }

        private EventType() {
        }

        public static final class RespondDevicePasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent$EventType$RespondDevicePasswordVerifier */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondDevicePasswordVerifier copy$default(RespondDevicePasswordVerifier respondDevicePasswordVerifier, Map map, Map map2, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = respondDevicePasswordVerifier.challengeParameters;
                }
                if ((i & 2) != 0) {
                    map2 = respondDevicePasswordVerifier.metadata;
                }
                return respondDevicePasswordVerifier.copy(map, map2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> component1() {
                return this.challengeParameters;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> component2() {
                return this.metadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RespondDevicePasswordVerifier copy(@NotNull Map<String, String> map, @NotNull Map<String, String> map2) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                return new RespondDevicePasswordVerifier(map, map2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondDevicePasswordVerifier)) {
                    return false;
                }
                RespondDevicePasswordVerifier respondDevicePasswordVerifier = (RespondDevicePasswordVerifier) obj;
                return Intrinsics.EZpvd(this.challengeParameters, respondDevicePasswordVerifier.challengeParameters) && Intrinsics.EZpvd(this.metadata, respondDevicePasswordVerifier.metadata);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> getChallengeParameters() {
                return this.challengeParameters;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.challengeParameters.hashCode() * 31) + this.metadata.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RespondDevicePasswordVerifier(challengeParameters=" + this.challengeParameters + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondDevicePasswordVerifier(@NotNull Map<String, String> map, @NotNull Map<String, String> map2) {
                super(null);
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                this.challengeParameters = map;
                this.metadata = map2;
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
 A[MD:(java.lang.String):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent.EventType.FinalizeSignIn.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ FinalizeSignIn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class ThrowPasswordVerifiedError extends EventType {
            private final Exception exception;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ThrowPasswordVerifiedError copy$default(ThrowPasswordVerifiedError throwPasswordVerifiedError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwPasswordVerifiedError.exception;
                }
                return throwPasswordVerifiedError.copy(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception component1() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ThrowPasswordVerifiedError copy(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new ThrowPasswordVerifiedError(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowPasswordVerifiedError) && Intrinsics.EZpvd(this.exception, ((ThrowPasswordVerifiedError) obj).exception);
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
                return "ThrowPasswordVerifiedError(exception=" + this.exception + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowPasswordVerifiedError(@NotNull Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.exception = exc;
            }
        }

        public static final class ThrowAuthError extends EventType {
            private final Exception exception;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ThrowAuthError copy$default(ThrowAuthError throwAuthError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwAuthError.exception;
                }
                return throwAuthError.copy(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception component1() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ThrowAuthError copy(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new ThrowAuthError(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowAuthError) && Intrinsics.EZpvd(this.exception, ((ThrowAuthError) obj).exception);
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
                return "ThrowAuthError(exception=" + this.exception + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowAuthError(@NotNull Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.exception = exc;
            }
        }
    }

    public DeviceSRPSignInEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent$EventType, java.util.Date):void (m)] (LINE:21) call: com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent.<init>(com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ DeviceSRPSignInEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }
}

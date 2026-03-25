package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import java.util.Date;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SRPEvent implements StateMachineEvent {
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

    public SRPEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.SRPEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.SRPEvent$EventType, java.util.Date):void (m)] (LINE:21) call: com.amplifyframework.statemachine.codegen.events.SRPEvent.<init>(com.amplifyframework.statemachine.codegen.events.SRPEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ SRPEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.SRPEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private EventType() {
        }

        public static final class InitiateSRP extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SRPEvent$EventType$InitiateSRP */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSRP copy$default(InitiateSRP initiateSRP, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSRP.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateSRP.password;
                }
                if ((i & 4) != 0) {
                    map = initiateSRP.metadata;
                }
                return initiateSRP.copy(str, str2, map);
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
            public final InitiateSRP copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new InitiateSRP(str, str2, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSRP)) {
                    return false;
                }
                InitiateSRP initiateSRP = (InitiateSRP) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) initiateSRP.username) && Intrinsics.EZpvd((Object) this.password, (Object) initiateSRP.password) && Intrinsics.EZpvd(this.metadata, initiateSRP.metadata);
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
                return "InitiateSRP(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSRP(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.username = str;
                this.password = str2;
                this.metadata = map;
            }
        }

        public static final class InitiateSRPWithCustom extends EventType {
            private final Map<String, String> metadata;
            private final String password;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SRPEvent$EventType$InitiateSRPWithCustom */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ InitiateSRPWithCustom copy$default(InitiateSRPWithCustom initiateSRPWithCustom, String str, String str2, Map map, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = initiateSRPWithCustom.username;
                }
                if ((i & 2) != 0) {
                    str2 = initiateSRPWithCustom.password;
                }
                if ((i & 4) != 0) {
                    map = initiateSRPWithCustom.metadata;
                }
                return initiateSRPWithCustom.copy(str, str2, map);
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
            public final InitiateSRPWithCustom copy(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                return new InitiateSRPWithCustom(str, str2, map);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitiateSRPWithCustom)) {
                    return false;
                }
                InitiateSRPWithCustom initiateSRPWithCustom = (InitiateSRPWithCustom) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) initiateSRPWithCustom.username) && Intrinsics.EZpvd((Object) this.password, (Object) initiateSRPWithCustom.password) && Intrinsics.EZpvd(this.metadata, initiateSRPWithCustom.metadata);
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
                return "InitiateSRPWithCustom(username=" + this.username + ", password=" + this.password + ", metadata=" + this.metadata + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitiateSRPWithCustom(@NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                Intrinsics.checkNotNullParameter(map, "");
                this.username = str;
                this.password = str2;
                this.metadata = map;
            }
        }

        public static final class RespondPasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;
            private final String session;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SRPEvent$EventType$RespondPasswordVerifier */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RespondPasswordVerifier copy$default(RespondPasswordVerifier respondPasswordVerifier, Map map, Map map2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = respondPasswordVerifier.challengeParameters;
                }
                if ((i & 2) != 0) {
                    map2 = respondPasswordVerifier.metadata;
                }
                if ((i & 4) != 0) {
                    str = respondPasswordVerifier.session;
                }
                return respondPasswordVerifier.copy(map, map2, str);
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
            public final String component3() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RespondPasswordVerifier copy(@NotNull Map<String, String> map, @NotNull Map<String, String> map2, String str) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                return new RespondPasswordVerifier(map, map2, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondPasswordVerifier)) {
                    return false;
                }
                RespondPasswordVerifier respondPasswordVerifier = (RespondPasswordVerifier) obj;
                return Intrinsics.EZpvd(this.challengeParameters, respondPasswordVerifier.challengeParameters) && Intrinsics.EZpvd(this.metadata, respondPasswordVerifier.metadata) && Intrinsics.EZpvd((Object) this.session, (Object) respondPasswordVerifier.session);
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
            public final String getSession() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.challengeParameters.hashCode();
                int iHashCode2 = this.metadata.hashCode();
                String str = this.session;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RespondPasswordVerifier(challengeParameters=" + this.challengeParameters + ", metadata=" + this.metadata + ", session=" + this.session + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondPasswordVerifier(@NotNull Map<String, String> map, @NotNull Map<String, String> map2, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                this.challengeParameters = map;
                this.metadata = map2;
                this.session = str;
            }
        }

        public static final class RetryRespondPasswordVerifier extends EventType {
            private final Map<String, String> challengeParameters;
            private final Map<String, String> metadata;
            private final String session;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SRPEvent$EventType$RetryRespondPasswordVerifier */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RetryRespondPasswordVerifier copy$default(RetryRespondPasswordVerifier retryRespondPasswordVerifier, Map map, Map map2, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    map = retryRespondPasswordVerifier.challengeParameters;
                }
                if ((i & 2) != 0) {
                    map2 = retryRespondPasswordVerifier.metadata;
                }
                if ((i & 4) != 0) {
                    str = retryRespondPasswordVerifier.session;
                }
                return retryRespondPasswordVerifier.copy(map, map2, str);
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
            public final String component3() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RetryRespondPasswordVerifier copy(@NotNull Map<String, String> map, @NotNull Map<String, String> map2, String str) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                return new RetryRespondPasswordVerifier(map, map2, str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RetryRespondPasswordVerifier)) {
                    return false;
                }
                RetryRespondPasswordVerifier retryRespondPasswordVerifier = (RetryRespondPasswordVerifier) obj;
                return Intrinsics.EZpvd(this.challengeParameters, retryRespondPasswordVerifier.challengeParameters) && Intrinsics.EZpvd(this.metadata, retryRespondPasswordVerifier.metadata) && Intrinsics.EZpvd((Object) this.session, (Object) retryRespondPasswordVerifier.session);
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
            public final String getSession() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.challengeParameters.hashCode();
                int iHashCode2 = this.metadata.hashCode();
                String str = this.session;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RetryRespondPasswordVerifier(challengeParameters=" + this.challengeParameters + ", metadata=" + this.metadata + ", session=" + this.session + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetryRespondPasswordVerifier(@NotNull Map<String, String> map, @NotNull Map<String, String> map2, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(map2, "");
                this.challengeParameters = map;
                this.metadata = map2;
                this.session = str;
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

        public static final class CancelSRPSignIn extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public CancelSRPSignIn() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CancelSRPSignIn copy$default(CancelSRPSignIn cancelSRPSignIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cancelSRPSignIn.id;
                }
                return cancelSRPSignIn.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CancelSRPSignIn copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new CancelSRPSignIn(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CancelSRPSignIn) && Intrinsics.EZpvd((Object) this.id, (Object) ((CancelSRPSignIn) obj).id);
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
                return "CancelSRPSignIn(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CancelSRPSignIn(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:47) call: com.amplifyframework.statemachine.codegen.events.SRPEvent.EventType.CancelSRPSignIn.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ CancelSRPSignIn(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class ThrowPasswordVerifierError extends EventType {
            private final Exception exception;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ThrowPasswordVerifierError copy$default(ThrowPasswordVerifierError throwPasswordVerifierError, Exception exc, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwPasswordVerifierError.exception;
                }
                return throwPasswordVerifierError.copy(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception component1() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ThrowPasswordVerifierError copy(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                return new ThrowPasswordVerifierError(exc);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowPasswordVerifierError) && Intrinsics.EZpvd(this.exception, ((ThrowPasswordVerifierError) obj).exception);
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
                return "ThrowPasswordVerifierError(exception=" + this.exception + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowPasswordVerifierError(@NotNull Exception exc) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                this.exception = exc;
            }
        }

        public static final class Reset extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Reset() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Reset copy$default(Reset reset, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = reset.id;
                }
                return reset.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Reset copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Reset(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Reset) && Intrinsics.EZpvd((Object) this.id, (Object) ((Reset) obj).id);
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
                return "Reset(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Reset(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:49) call: com.amplifyframework.statemachine.codegen.events.SRPEvent.EventType.Reset.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ Reset(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }
    }
}

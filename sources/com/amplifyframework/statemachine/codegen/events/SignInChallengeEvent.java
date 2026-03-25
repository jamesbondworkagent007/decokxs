package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInChallengeEvent implements StateMachineEvent {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class WaitForAnswer extends EventType {
            private final AuthChallenge challenge;
            private final boolean hasNewResponse;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ WaitForAnswer copy$default(WaitForAnswer waitForAnswer, AuthChallenge authChallenge, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    authChallenge = waitForAnswer.challenge;
                }
                if ((i & 2) != 0) {
                    z = waitForAnswer.hasNewResponse;
                }
                return waitForAnswer.copy(authChallenge, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthChallenge component1() {
                return this.challenge;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component2() {
                return this.hasNewResponse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WaitForAnswer copy(@NotNull AuthChallenge authChallenge, boolean z) {
                Intrinsics.checkNotNullParameter(authChallenge, "");
                return new WaitForAnswer(authChallenge, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof WaitForAnswer)) {
                    return false;
                }
                WaitForAnswer waitForAnswer = (WaitForAnswer) obj;
                return Intrinsics.EZpvd(this.challenge, waitForAnswer.challenge) && this.hasNewResponse == waitForAnswer.hasNewResponse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthChallenge getChallenge() {
                return this.challenge;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean getHasNewResponse() {
                return this.hasNewResponse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [int] */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3 */
            public int hashCode() {
                int iHashCode = this.challenge.hashCode();
                boolean z = this.hasNewResponse;
                ?? r1 = z;
                if (z) {
                    r1 = 1;
                }
                return (iHashCode * 31) + r1;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WaitForAnswer(challenge=" + this.challenge + ", hasNewResponse=" + this.hasNewResponse + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WaitForAnswer(@NotNull AuthChallenge authChallenge, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(authChallenge, "");
                this.challenge = authChallenge;
                this.hasNewResponse = z;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.data.AuthChallenge)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(com.amplifyframework.statemachine.codegen.data.AuthChallenge, boolean):void (m)] (LINE:25) call: com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent.EventType.WaitForAnswer.<init>(com.amplifyframework.statemachine.codegen.data.AuthChallenge, boolean):void type: THIS */
            public /* synthetic */ WaitForAnswer(AuthChallenge authChallenge, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(authChallenge, (i & 2) != 0 ? false : z);
            }
        }

        private EventType() {
        }

        public static final class VerifyChallengeAnswer extends EventType {
            private final String answer;
            private final Map<String, String> metadata;
            private final List<AuthUserAttribute> userAttributes;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent$EventType$VerifyChallengeAnswer */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VerifyChallengeAnswer copy$default(VerifyChallengeAnswer verifyChallengeAnswer, String str, Map map, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = verifyChallengeAnswer.answer;
                }
                if ((i & 2) != 0) {
                    map = verifyChallengeAnswer.metadata;
                }
                if ((i & 4) != 0) {
                    list = verifyChallengeAnswer.userAttributes;
                }
                return verifyChallengeAnswer.copy(str, map, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.answer;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> component2() {
                return this.metadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<AuthUserAttribute> component3() {
                return this.userAttributes;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final VerifyChallengeAnswer copy(@NotNull String str, @NotNull Map<String, String> map, @NotNull List<AuthUserAttribute> list) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(list, "");
                return new VerifyChallengeAnswer(str, map, list);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof VerifyChallengeAnswer)) {
                    return false;
                }
                VerifyChallengeAnswer verifyChallengeAnswer = (VerifyChallengeAnswer) obj;
                return Intrinsics.EZpvd((Object) this.answer, (Object) verifyChallengeAnswer.answer) && Intrinsics.EZpvd(this.metadata, verifyChallengeAnswer.metadata) && Intrinsics.EZpvd(this.userAttributes, verifyChallengeAnswer.userAttributes);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAnswer() {
                return this.answer;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<AuthUserAttribute> getUserAttributes() {
                return this.userAttributes;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((this.answer.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.userAttributes.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "VerifyChallengeAnswer(answer=" + this.answer + ", metadata=" + this.metadata + ", userAttributes=" + this.userAttributes + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyChallengeAnswer(@NotNull String str, @NotNull Map<String, String> map, @NotNull List<AuthUserAttribute> list) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(list, "");
                this.answer = str;
                this.metadata = map;
                this.userAttributes = list;
            }
        }

        public static final class RetryVerifyChallengeAnswer extends EventType {
            private final String answer;
            private final AuthChallenge authChallenge;
            private final Map<String, String> metadata;
            private final List<AuthUserAttribute> userAttributes;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent$EventType$RetryVerifyChallengeAnswer */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ RetryVerifyChallengeAnswer copy$default(RetryVerifyChallengeAnswer retryVerifyChallengeAnswer, String str, Map map, List list, AuthChallenge authChallenge, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = retryVerifyChallengeAnswer.answer;
                }
                if ((i & 2) != 0) {
                    map = retryVerifyChallengeAnswer.metadata;
                }
                if ((i & 4) != 0) {
                    list = retryVerifyChallengeAnswer.userAttributes;
                }
                if ((i & 8) != 0) {
                    authChallenge = retryVerifyChallengeAnswer.authChallenge;
                }
                return retryVerifyChallengeAnswer.copy(str, map, list, authChallenge);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.answer;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> component2() {
                return this.metadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<AuthUserAttribute> component3() {
                return this.userAttributes;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthChallenge component4() {
                return this.authChallenge;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RetryVerifyChallengeAnswer copy(@NotNull String str, @NotNull Map<String, String> map, @NotNull List<AuthUserAttribute> list, @NotNull AuthChallenge authChallenge) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(authChallenge, "");
                return new RetryVerifyChallengeAnswer(str, map, list, authChallenge);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RetryVerifyChallengeAnswer)) {
                    return false;
                }
                RetryVerifyChallengeAnswer retryVerifyChallengeAnswer = (RetryVerifyChallengeAnswer) obj;
                return Intrinsics.EZpvd((Object) this.answer, (Object) retryVerifyChallengeAnswer.answer) && Intrinsics.EZpvd(this.metadata, retryVerifyChallengeAnswer.metadata) && Intrinsics.EZpvd(this.userAttributes, retryVerifyChallengeAnswer.userAttributes) && Intrinsics.EZpvd(this.authChallenge, retryVerifyChallengeAnswer.authChallenge);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAnswer() {
                return this.answer;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthChallenge getAuthChallenge() {
                return this.authChallenge;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Map<String, String> getMetadata() {
                return this.metadata;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final List<AuthUserAttribute> getUserAttributes() {
                return this.userAttributes;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (((((this.answer.hashCode() * 31) + this.metadata.hashCode()) * 31) + this.userAttributes.hashCode()) * 31) + this.authChallenge.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RetryVerifyChallengeAnswer(answer=" + this.answer + ", metadata=" + this.metadata + ", userAttributes=" + this.userAttributes + ", authChallenge=" + this.authChallenge + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RetryVerifyChallengeAnswer(@NotNull String str, @NotNull Map<String, String> map, @NotNull List<AuthUserAttribute> list, @NotNull AuthChallenge authChallenge) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(list, "");
                Intrinsics.checkNotNullParameter(authChallenge, "");
                this.answer = str;
                this.metadata = map;
                this.userAttributes = list;
                this.authChallenge = authChallenge;
            }
        }

        /* JADX INFO: loaded from: classes14.dex */
        public static final class FinalizeSignIn extends EventType {
            private final String accessToken;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FinalizeSignIn copy$default(FinalizeSignIn finalizeSignIn, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = finalizeSignIn.accessToken;
                }
                return finalizeSignIn.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.accessToken;
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
                return (obj instanceof FinalizeSignIn) && Intrinsics.EZpvd((Object) this.accessToken, (Object) ((FinalizeSignIn) obj).accessToken);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAccessToken() {
                return this.accessToken;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.accessToken.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FinalizeSignIn(accessToken=" + this.accessToken + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinalizeSignIn(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.accessToken = str;
            }
        }

        public static final class Verified extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Verified() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Verified copy$default(Verified verified, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = verified.id;
                }
                return verified.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Verified copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new Verified(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Verified) && Intrinsics.EZpvd((Object) this.id, (Object) ((Verified) obj).id);
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
                return "Verified(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Verified(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:39) call: com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent.EventType.Verified.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ Verified(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class ThrowError extends EventType {
            private final AuthChallenge challenge;
            private final Exception exception;
            private final boolean hasNewResponse;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, Exception exc, AuthChallenge authChallenge, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwError.exception;
                }
                if ((i & 2) != 0) {
                    authChallenge = throwError.challenge;
                }
                if ((i & 4) != 0) {
                    z = throwError.hasNewResponse;
                }
                return throwError.copy(exc, authChallenge, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception component1() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthChallenge component2() {
                return this.challenge;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean component3() {
                return this.hasNewResponse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ThrowError copy(@NotNull Exception exc, @NotNull AuthChallenge authChallenge, boolean z) {
                Intrinsics.checkNotNullParameter(exc, "");
                Intrinsics.checkNotNullParameter(authChallenge, "");
                return new ThrowError(exc, authChallenge, z);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowError)) {
                    return false;
                }
                ThrowError throwError = (ThrowError) obj;
                return Intrinsics.EZpvd(this.exception, throwError.exception) && Intrinsics.EZpvd(this.challenge, throwError.challenge) && this.hasNewResponse == throwError.hasNewResponse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AuthChallenge getChallenge() {
                return this.challenge;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception getException() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final boolean getHasNewResponse() {
                return this.hasNewResponse;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v2 */
            /* JADX WARN: Type inference failed for: r2v3 */
            public int hashCode() {
                int iHashCode = this.exception.hashCode();
                int iHashCode2 = this.challenge.hashCode();
                boolean z = this.hasNewResponse;
                ?? r2 = z;
                if (z) {
                    r2 = 1;
                }
                return (((iHashCode * 31) + iHashCode2) * 31) + r2;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ThrowError(exception=" + this.exception + ", challenge=" + this.challenge + ", hasNewResponse=" + this.hasNewResponse + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Exception)
  (r2v0 com.amplifyframework.statemachine.codegen.data.AuthChallenge)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r3v0 boolean))
 A[MD:(java.lang.Exception, com.amplifyframework.statemachine.codegen.data.AuthChallenge, boolean):void (m)] (LINE:40) call: com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent.EventType.ThrowError.<init>(java.lang.Exception, com.amplifyframework.statemachine.codegen.data.AuthChallenge, boolean):void type: THIS */
            public /* synthetic */ ThrowError(Exception exc, AuthChallenge authChallenge, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(exc, authChallenge, (i & 4) != 0 ? false : z);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(@NotNull Exception exc, @NotNull AuthChallenge authChallenge, boolean z) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                Intrinsics.checkNotNullParameter(authChallenge, "");
                this.exception = exc;
                this.challenge = authChallenge;
                this.hasNewResponse = z;
            }
        }
    }

    public SignInChallengeEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent$EventType, java.util.Date):void (m)] (LINE:23) call: com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent.<init>(com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ SignInChallengeEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }
}

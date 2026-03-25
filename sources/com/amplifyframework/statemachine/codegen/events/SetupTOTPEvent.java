package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SetupTOTPEvent implements StateMachineEvent {
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

    public SetupTOTPEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent$EventType, java.util.Date):void (m)] (LINE:21) call: com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent.<init>(com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ SetupTOTPEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class SetupTOTP extends EventType {
            private final SignInTOTPSetupData totpSetupDetails;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SetupTOTP copy$default(SetupTOTP setupTOTP, SignInTOTPSetupData signInTOTPSetupData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signInTOTPSetupData = setupTOTP.totpSetupDetails;
                }
                return setupTOTP.copy(signInTOTPSetupData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInTOTPSetupData component1() {
                return this.totpSetupDetails;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SetupTOTP copy(@NotNull SignInTOTPSetupData signInTOTPSetupData) {
                Intrinsics.checkNotNullParameter(signInTOTPSetupData, "");
                return new SetupTOTP(signInTOTPSetupData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SetupTOTP) && Intrinsics.EZpvd(this.totpSetupDetails, ((SetupTOTP) obj).totpSetupDetails);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInTOTPSetupData getTotpSetupDetails() {
                return this.totpSetupDetails;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.totpSetupDetails.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SetupTOTP(totpSetupDetails=" + this.totpSetupDetails + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupTOTP(@NotNull SignInTOTPSetupData signInTOTPSetupData) {
                super(null);
                Intrinsics.checkNotNullParameter(signInTOTPSetupData, "");
                this.totpSetupDetails = signInTOTPSetupData;
            }
        }

        private EventType() {
        }

        public static final class WaitForAnswer extends EventType {
            private final SignInTOTPSetupData totpSetupDetails;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ WaitForAnswer copy$default(WaitForAnswer waitForAnswer, SignInTOTPSetupData signInTOTPSetupData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signInTOTPSetupData = waitForAnswer.totpSetupDetails;
                }
                return waitForAnswer.copy(signInTOTPSetupData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInTOTPSetupData component1() {
                return this.totpSetupDetails;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WaitForAnswer copy(@NotNull SignInTOTPSetupData signInTOTPSetupData) {
                Intrinsics.checkNotNullParameter(signInTOTPSetupData, "");
                return new WaitForAnswer(signInTOTPSetupData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WaitForAnswer) && Intrinsics.EZpvd(this.totpSetupDetails, ((WaitForAnswer) obj).totpSetupDetails);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInTOTPSetupData getTotpSetupDetails() {
                return this.totpSetupDetails;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.totpSetupDetails.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "WaitForAnswer(totpSetupDetails=" + this.totpSetupDetails + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WaitForAnswer(@NotNull SignInTOTPSetupData signInTOTPSetupData) {
                super(null);
                Intrinsics.checkNotNullParameter(signInTOTPSetupData, "");
                this.totpSetupDetails = signInTOTPSetupData;
            }
        }

        public static final class ThrowAuthError extends EventType {
            private final Exception exception;
            private final String session;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ThrowAuthError copy$default(ThrowAuthError throwAuthError, Exception exc, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    exc = throwAuthError.exception;
                }
                if ((i & 2) != 0) {
                    str = throwAuthError.username;
                }
                if ((i & 4) != 0) {
                    str2 = throwAuthError.session;
                }
                return throwAuthError.copy(exc, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception component1() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.username;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ThrowAuthError copy(@NotNull Exception exc, @NotNull String str, String str2) {
                Intrinsics.checkNotNullParameter(exc, "");
                Intrinsics.checkNotNullParameter(str, "");
                return new ThrowAuthError(exc, str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ThrowAuthError)) {
                    return false;
                }
                ThrowAuthError throwAuthError = (ThrowAuthError) obj;
                return Intrinsics.EZpvd(this.exception, throwAuthError.exception) && Intrinsics.EZpvd((Object) this.username, (Object) throwAuthError.username) && Intrinsics.EZpvd((Object) this.session, (Object) throwAuthError.session);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Exception getException() {
                return this.exception;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSession() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUsername() {
                return this.username;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.exception.hashCode();
                int iHashCode2 = this.username.hashCode();
                String str = this.session;
                return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ThrowAuthError(exception=" + this.exception + ", username=" + this.username + ", session=" + this.session + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowAuthError(@NotNull Exception exc, @NotNull String str, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(exc, "");
                Intrinsics.checkNotNullParameter(str, "");
                this.exception = exc;
                this.username = str;
                this.session = str2;
            }
        }

        public static final class VerifyChallengeAnswer extends EventType {
            private final String answer;
            private final String friendlyDeviceName;
            private final String session;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ VerifyChallengeAnswer copy$default(VerifyChallengeAnswer verifyChallengeAnswer, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = verifyChallengeAnswer.answer;
                }
                if ((i & 2) != 0) {
                    str2 = verifyChallengeAnswer.username;
                }
                if ((i & 4) != 0) {
                    str3 = verifyChallengeAnswer.session;
                }
                if ((i & 8) != 0) {
                    str4 = verifyChallengeAnswer.friendlyDeviceName;
                }
                return verifyChallengeAnswer.copy(str, str2, str3, str4);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.answer;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.username;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component3() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component4() {
                return this.friendlyDeviceName;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final VerifyChallengeAnswer copy(@NotNull String str, @NotNull String str2, String str3, String str4) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                return new VerifyChallengeAnswer(str, str2, str3, str4);
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
                return Intrinsics.EZpvd((Object) this.answer, (Object) verifyChallengeAnswer.answer) && Intrinsics.EZpvd((Object) this.username, (Object) verifyChallengeAnswer.username) && Intrinsics.EZpvd((Object) this.session, (Object) verifyChallengeAnswer.session) && Intrinsics.EZpvd((Object) this.friendlyDeviceName, (Object) verifyChallengeAnswer.friendlyDeviceName);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getAnswer() {
                return this.answer;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getFriendlyDeviceName() {
                return this.friendlyDeviceName;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSession() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUsername() {
                return this.username;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.answer.hashCode();
                int iHashCode2 = this.username.hashCode();
                String str = this.session;
                int iHashCode3 = str == null ? 0 : str.hashCode();
                String str2 = this.friendlyDeviceName;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "VerifyChallengeAnswer(answer=" + this.answer + ", username=" + this.username + ", session=" + this.session + ", friendlyDeviceName=" + this.friendlyDeviceName + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public VerifyChallengeAnswer(@NotNull String str, @NotNull String str2, String str3, String str4) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(str2, "");
                this.answer = str;
                this.username = str2;
                this.session = str3;
                this.friendlyDeviceName = str4;
            }
        }

        public static final class RespondToAuthChallenge extends EventType {
            private final String session;
            private final String username;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RespondToAuthChallenge copy$default(RespondToAuthChallenge respondToAuthChallenge, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = respondToAuthChallenge.username;
                }
                if ((i & 2) != 0) {
                    str2 = respondToAuthChallenge.session;
                }
                return respondToAuthChallenge.copy(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.username;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RespondToAuthChallenge copy(@NotNull String str, String str2) {
                Intrinsics.checkNotNullParameter(str, "");
                return new RespondToAuthChallenge(str, str2);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RespondToAuthChallenge)) {
                    return false;
                }
                RespondToAuthChallenge respondToAuthChallenge = (RespondToAuthChallenge) obj;
                return Intrinsics.EZpvd((Object) this.username, (Object) respondToAuthChallenge.username) && Intrinsics.EZpvd((Object) this.session, (Object) respondToAuthChallenge.session);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getSession() {
                return this.session;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getUsername() {
                return this.username;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.username.hashCode();
                String str = this.session;
                return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RespondToAuthChallenge(username=" + this.username + ", session=" + this.session + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RespondToAuthChallenge(@NotNull String str, String str2) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.username = str;
                this.session = str2;
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
 A[MD:(java.lang.String):void (m)] (LINE:37) call: com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent.EventType.Verified.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ Verified(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }
    }
}

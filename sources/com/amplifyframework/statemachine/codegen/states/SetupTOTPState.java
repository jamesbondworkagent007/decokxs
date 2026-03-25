package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.SetupTOTPActions;
import com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SetupTOTPState implements State {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.SetupTOTPState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ SetupTOTPState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class NotStarted extends SetupTOTPState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NotStarted() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NotStarted copy$default(NotStarted notStarted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notStarted.id;
            }
            return notStarted.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NotStarted copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NotStarted(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotStarted) && Intrinsics.EZpvd((Object) this.id, (Object) ((NotStarted) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "NotStarted(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotStarted(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:26) call: com.amplifyframework.statemachine.codegen.states.SetupTOTPState.NotStarted.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotStarted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private SetupTOTPState() {
    }

    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return State.DefaultImpls.getType(this);
    }

    public static final class SetupTOTP extends SetupTOTPState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SetupTOTP() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ SetupTOTP copy$default(SetupTOTP setupTOTP, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = setupTOTP.id;
            }
            return setupTOTP.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SetupTOTP copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new SetupTOTP(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetupTOTP) && Intrinsics.EZpvd((Object) this.id, (Object) ((SetupTOTP) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "SetupTOTP(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetupTOTP(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.states.SetupTOTPState.SetupTOTP.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ SetupTOTP(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class WaitingForAnswer extends SetupTOTPState {
        private boolean hasNewResponse;
        private final SignInTOTPSetupData signInTOTPSetupData;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ WaitingForAnswer copy$default(WaitingForAnswer waitingForAnswer, SignInTOTPSetupData signInTOTPSetupData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                signInTOTPSetupData = waitingForAnswer.signInTOTPSetupData;
            }
            if ((i & 2) != 0) {
                z = waitingForAnswer.hasNewResponse;
            }
            return waitingForAnswer.copy(signInTOTPSetupData, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignInTOTPSetupData component1() {
            return this.signInTOTPSetupData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component2() {
            return this.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final WaitingForAnswer copy(@NotNull SignInTOTPSetupData signInTOTPSetupData, boolean z) {
            Intrinsics.checkNotNullParameter(signInTOTPSetupData, "");
            return new WaitingForAnswer(signInTOTPSetupData, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WaitingForAnswer)) {
                return false;
            }
            WaitingForAnswer waitingForAnswer = (WaitingForAnswer) obj;
            return Intrinsics.EZpvd(this.signInTOTPSetupData, waitingForAnswer.signInTOTPSetupData) && this.hasNewResponse == waitingForAnswer.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean getHasNewResponse() {
            return this.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final SignInTOTPSetupData getSignInTOTPSetupData() {
            return this.signInTOTPSetupData;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.signInTOTPSetupData.hashCode();
            boolean z = this.hasNewResponse;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return (iHashCode * 31) + r1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setHasNewResponse(boolean z) {
            this.hasNewResponse = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "WaitingForAnswer(signInTOTPSetupData=" + this.signInTOTPSetupData + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData, boolean):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.states.SetupTOTPState.WaitingForAnswer.<init>(com.amplifyframework.statemachine.codegen.data.SignInTOTPSetupData, boolean):void type: THIS */
        public /* synthetic */ WaitingForAnswer(SignInTOTPSetupData signInTOTPSetupData, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(signInTOTPSetupData, (i & 2) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WaitingForAnswer(@NotNull SignInTOTPSetupData signInTOTPSetupData, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(signInTOTPSetupData, "");
            this.signInTOTPSetupData = signInTOTPSetupData;
            this.hasNewResponse = z;
        }
    }

    public static final class Verifying extends SetupTOTPState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Verifying() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Verifying copy$default(Verifying verifying, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = verifying.id;
            }
            return verifying.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Verifying copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Verifying(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Verifying) && Intrinsics.EZpvd((Object) this.id, (Object) ((Verifying) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Verifying(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Verifying(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:32) call: com.amplifyframework.statemachine.codegen.states.SetupTOTPState.Verifying.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Verifying(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class RespondingToAuthChallenge extends SetupTOTPState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public RespondingToAuthChallenge() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ RespondingToAuthChallenge copy$default(RespondingToAuthChallenge respondingToAuthChallenge, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = respondingToAuthChallenge.id;
            }
            return respondingToAuthChallenge.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final RespondingToAuthChallenge copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new RespondingToAuthChallenge(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RespondingToAuthChallenge) && Intrinsics.EZpvd((Object) this.id, (Object) ((RespondingToAuthChallenge) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "RespondingToAuthChallenge(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RespondingToAuthChallenge(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:33) call: com.amplifyframework.statemachine.codegen.states.SetupTOTPState.RespondingToAuthChallenge.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ RespondingToAuthChallenge(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Success extends SetupTOTPState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Success() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.id;
            }
            return success.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Success(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.EZpvd((Object) this.id, (Object) ((Success) obj).id);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getId() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.id.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Success(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:34) call: com.amplifyframework.statemachine.codegen.states.SetupTOTPState.Success.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Success(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Error extends SetupTOTPState {
        private final Exception exception;
        private boolean hasNewResponse;
        private final String session;
        private final String username;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, Exception exc, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                exc = error.exception;
            }
            if ((i & 2) != 0) {
                str = error.username;
            }
            if ((i & 4) != 0) {
                str2 = error.session;
            }
            if ((i & 8) != 0) {
                z = error.hasNewResponse;
            }
            return error.copy(exc, str, str2, z);
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
        public final boolean component4() {
            return this.hasNewResponse;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@NotNull Exception exc, @NotNull String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(str, "");
            return new Error(exc, str, str2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return Intrinsics.EZpvd(this.exception, error.exception) && Intrinsics.EZpvd((Object) this.username, (Object) error.username) && Intrinsics.EZpvd((Object) this.session, (Object) error.session) && this.hasNewResponse == error.hasNewResponse;
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
        public final String getSession() {
            return this.session;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getUsername() {
            return this.username;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [int] */
        /* JADX WARN: Type inference failed for: r3v2 */
        /* JADX WARN: Type inference failed for: r3v3 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            int iHashCode = this.exception.hashCode();
            int iHashCode2 = this.username.hashCode();
            String str = this.session;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            boolean z = this.hasNewResponse;
            ?? r3 = z;
            if (z) {
                r3 = 1;
            }
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + r3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setHasNewResponse(boolean z) {
            this.hasNewResponse = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(exception=" + this.exception + ", username=" + this.username + ", session=" + this.session + ", hasNewResponse=" + this.hasNewResponse + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Exception)
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(java.lang.Exception, java.lang.String, java.lang.String, boolean):void (m)] (LINE:35) call: com.amplifyframework.statemachine.codegen.states.SetupTOTPState.Error.<init>(java.lang.Exception, java.lang.String, java.lang.String, boolean):void type: THIS */
        public /* synthetic */ Error(Exception exc, String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(exc, str, str2, (i & 8) != 0 ? false : z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull Exception exc, @NotNull String str, String str2, boolean z) {
            super(null);
            Intrinsics.checkNotNullParameter(exc, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.exception = exc;
            this.username = str;
            this.session = str2;
            this.hasNewResponse = z;
        }
    }

    public static final class Resolver implements StateMachineResolver<SetupTOTPState> {
        private final NotStarted defaultState;
        private final SetupTOTPActions setupTOTPActions;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotStarted getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull SetupTOTPActions setupTOTPActions) {
            Intrinsics.checkNotNullParameter(setupTOTPActions, "");
            this.setupTOTPActions = setupTOTPActions;
            this.defaultState = new NotStarted("default");
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<SetupTOTPState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<SetupTOTPState, StateMachineResolver<SetupTOTPState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<SetupTOTPState> resolve(@NotNull SetupTOTPState setupTOTPState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(setupTOTPState, "");
            Intrinsics.checkNotNullParameter(stateMachineEvent, "");
            String str = null;
            byte b = 0;
            byte b2 = 0;
            byte b3 = 0;
            byte b4 = 0;
            byte b5 = 0;
            byte b6 = 0;
            byte b7 = 0;
            byte b8 = 0;
            byte b9 = 0;
            StateResolution<SetupTOTPState> stateResolution = new StateResolution<>(setupTOTPState, null, 2, null);
            SetupTOTPEvent setupTOTPEvent = stateMachineEvent instanceof SetupTOTPEvent ? (SetupTOTPEvent) stateMachineEvent : null;
            SetupTOTPEvent.EventType eventType = setupTOTPEvent != null ? setupTOTPEvent.getEventType() : null;
            int i = 1;
            if (setupTOTPState instanceof NotStarted) {
                if (eventType instanceof SetupTOTPEvent.EventType.SetupTOTP) {
                    return new StateResolution<>(new SetupTOTP(str, i, b9 == true ? 1 : 0), C56402yEa.EZpvd(this.setupTOTPActions.initiateTOTPSetup((SetupTOTPEvent.EventType.SetupTOTP) eventType)));
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError.getException(), throwAuthError.getUsername(), throwAuthError.getSession(), false, 8, null), null, 2, null);
            }
            if (setupTOTPState instanceof SetupTOTP) {
                if (eventType instanceof SetupTOTPEvent.EventType.WaitForAnswer) {
                    return new StateResolution<>(new WaitingForAnswer(((SetupTOTPEvent.EventType.WaitForAnswer) eventType).getTotpSetupDetails(), true), null, 2, null);
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError2 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError2.getException(), throwAuthError2.getUsername(), throwAuthError2.getSession(), false, 8, null), null, 2, null);
            }
            if (setupTOTPState instanceof WaitingForAnswer) {
                if (eventType instanceof SetupTOTPEvent.EventType.VerifyChallengeAnswer) {
                    return new StateResolution<>(new Verifying(b8 == true ? 1 : 0, i, b7 == true ? 1 : 0), C56402yEa.EZpvd(this.setupTOTPActions.verifyChallengeAnswer((SetupTOTPEvent.EventType.VerifyChallengeAnswer) eventType)));
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError3 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError3.getException(), throwAuthError3.getUsername(), throwAuthError3.getSession(), false, 8, null), null, 2, null);
            }
            if (setupTOTPState instanceof Verifying) {
                if (eventType instanceof SetupTOTPEvent.EventType.RespondToAuthChallenge) {
                    return new StateResolution<>(new RespondingToAuthChallenge(b6 == true ? 1 : 0, i, b5 == true ? 1 : 0), C56402yEa.EZpvd(this.setupTOTPActions.respondToAuthChallenge((SetupTOTPEvent.EventType.RespondToAuthChallenge) eventType)));
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError4 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError4.getException(), throwAuthError4.getUsername(), throwAuthError4.getSession(), true), null, 2, null);
            }
            if (setupTOTPState instanceof RespondingToAuthChallenge) {
                if (eventType instanceof SetupTOTPEvent.EventType.Verified) {
                    return new StateResolution<>(new Success(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), null, 2, null);
                }
                if (!(eventType instanceof SetupTOTPEvent.EventType.ThrowAuthError)) {
                    return stateResolution;
                }
                SetupTOTPEvent.EventType.ThrowAuthError throwAuthError5 = (SetupTOTPEvent.EventType.ThrowAuthError) eventType;
                return new StateResolution<>(new Error(throwAuthError5.getException(), throwAuthError5.getUsername(), throwAuthError5.getSession(), false, 8, null), null, 2, null);
            }
            if (!(setupTOTPState instanceof Error)) {
                return stateResolution;
            }
            if (eventType instanceof SetupTOTPEvent.EventType.VerifyChallengeAnswer) {
                return new StateResolution<>(new Verifying(b2 == true ? 1 : 0, i, b == true ? 1 : 0), C56402yEa.EZpvd(this.setupTOTPActions.verifyChallengeAnswer((SetupTOTPEvent.EventType.VerifyChallengeAnswer) eventType)));
            }
            return eventType instanceof SetupTOTPEvent.EventType.WaitForAnswer ? new StateResolution<>(new WaitingForAnswer(((SetupTOTPEvent.EventType.WaitForAnswer) eventType).getTotpSetupDetails(), true), null, 2, null) : stateResolution;
        }
    }
}

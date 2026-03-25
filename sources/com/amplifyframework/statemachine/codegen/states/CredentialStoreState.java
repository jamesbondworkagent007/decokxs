package com.amplifyframework.statemachine.codegen.states;

import com.amplifyframework.statemachine.AnyResolver;
import com.amplifyframework.statemachine.LoggingStateMachineResolver;
import com.amplifyframework.statemachine.State;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.StateMachineResolver;
import com.amplifyframework.statemachine.StateResolution;
import com.amplifyframework.statemachine.codegen.actions.CredentialStoreActions;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56402yEa;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CredentialStoreState implements State {
    private final String type;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.states.CredentialStoreState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ CredentialStoreState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.State
    public String getType() {
        return this.type;
    }

    public static final class NotConfigured extends CredentialStoreState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public NotConfigured() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ NotConfigured copy$default(NotConfigured notConfigured, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = notConfigured.id;
            }
            return notConfigured.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final NotConfigured copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new NotConfigured(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotConfigured) && Intrinsics.EZpvd((Object) this.id, (Object) ((NotConfigured) obj).id);
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
            return "NotConfigured(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotConfigured(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:28) call: com.amplifyframework.statemachine.codegen.states.CredentialStoreState.NotConfigured.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ NotConfigured(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    private CredentialStoreState() {
        this.type = toString();
    }

    public static final class MigratingLegacyStore extends CredentialStoreState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public MigratingLegacyStore() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ MigratingLegacyStore copy$default(MigratingLegacyStore migratingLegacyStore, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = migratingLegacyStore.id;
            }
            return migratingLegacyStore.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final MigratingLegacyStore copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new MigratingLegacyStore(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MigratingLegacyStore) && Intrinsics.EZpvd((Object) this.id, (Object) ((MigratingLegacyStore) obj).id);
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
            return "MigratingLegacyStore(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MigratingLegacyStore(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:29) call: com.amplifyframework.statemachine.codegen.states.CredentialStoreState.MigratingLegacyStore.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ MigratingLegacyStore(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class LoadingStoredCredentials extends CredentialStoreState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoadingStoredCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoadingStoredCredentials copy$default(LoadingStoredCredentials loadingStoredCredentials, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loadingStoredCredentials.id;
            }
            return loadingStoredCredentials.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoadingStoredCredentials copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new LoadingStoredCredentials(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadingStoredCredentials) && Intrinsics.EZpvd((Object) this.id, (Object) ((LoadingStoredCredentials) obj).id);
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
            return "LoadingStoredCredentials(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadingStoredCredentials(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:30) call: com.amplifyframework.statemachine.codegen.states.CredentialStoreState.LoadingStoredCredentials.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ LoadingStoredCredentials(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class StoringCredentials extends CredentialStoreState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StoringCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StoringCredentials copy$default(StoringCredentials storingCredentials, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = storingCredentials.id;
            }
            return storingCredentials.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StoringCredentials copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StoringCredentials(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StoringCredentials) && Intrinsics.EZpvd((Object) this.id, (Object) ((StoringCredentials) obj).id);
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
            return "StoringCredentials(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StoringCredentials(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:31) call: com.amplifyframework.statemachine.codegen.states.CredentialStoreState.StoringCredentials.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ StoringCredentials(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class ClearingCredentials extends CredentialStoreState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ClearingCredentials() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ClearingCredentials copy$default(ClearingCredentials clearingCredentials, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clearingCredentials.id;
            }
            return clearingCredentials.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ClearingCredentials copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ClearingCredentials(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearingCredentials) && Intrinsics.EZpvd((Object) this.id, (Object) ((ClearingCredentials) obj).id);
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
            return "ClearingCredentials(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClearingCredentials(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:32) call: com.amplifyframework.statemachine.codegen.states.CredentialStoreState.ClearingCredentials.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ ClearingCredentials(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Idle extends CredentialStoreState {
        private final String id;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Idle() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Idle copy$default(Idle idle, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = idle.id;
            }
            return idle.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.id;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Idle copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Idle(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Idle) && Intrinsics.EZpvd((Object) this.id, (Object) ((Idle) obj).id);
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
            return "Idle(id=" + this.id + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Idle(@NotNull String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.id = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:33) call: com.amplifyframework.statemachine.codegen.states.CredentialStoreState.Idle.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ Idle(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str);
        }
    }

    public static final class Success extends CredentialStoreState {
        private final AmplifyCredential storedCredentials;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Success copy$default(Success success, AmplifyCredential amplifyCredential, int i, Object obj) {
            if ((i & 1) != 0) {
                amplifyCredential = success.storedCredentials;
            }
            return success.copy(amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential component1() {
            return this.storedCredentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Success copy(@NotNull AmplifyCredential amplifyCredential) {
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            return new Success(amplifyCredential);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.EZpvd(this.storedCredentials, ((Success) obj).storedCredentials);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AmplifyCredential getStoredCredentials() {
            return this.storedCredentials;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.storedCredentials.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Success(storedCredentials=" + this.storedCredentials + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(@NotNull AmplifyCredential amplifyCredential) {
            super(null);
            Intrinsics.checkNotNullParameter(amplifyCredential, "");
            this.storedCredentials = amplifyCredential;
        }
    }

    public static final class Error extends CredentialStoreState {
        private final CredentialStoreError error;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Error copy$default(Error error, CredentialStoreError credentialStoreError, int i, Object obj) {
            if ((i & 1) != 0) {
                credentialStoreError = error.error;
            }
            return error.copy(credentialStoreError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CredentialStoreError component1() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Error copy(@NotNull CredentialStoreError credentialStoreError) {
            Intrinsics.checkNotNullParameter(credentialStoreError, "");
            return new Error(credentialStoreError);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Error) && Intrinsics.EZpvd(this.error, ((Error) obj).error);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final CredentialStoreError getError() {
            return this.error;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public int hashCode() {
            return this.error.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // com.amplifyframework.statemachine.State
        public String toString() {
            return "Error(error=" + this.error + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(@NotNull CredentialStoreError credentialStoreError) {
            super(null);
            Intrinsics.checkNotNullParameter(credentialStoreError, "");
            this.error = credentialStoreError;
        }
    }

    public static final class Resolver implements StateMachineResolver<CredentialStoreState> {
        private final CredentialStoreActions credentialStoreActions;
        private final NotConfigured defaultState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: getDefaultState()Lcom/amplifyframework/statemachine/State; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public NotConfigured getDefaultState() {
            return this.defaultState;
        }

        public Resolver(@NotNull CredentialStoreActions credentialStoreActions) {
            Intrinsics.checkNotNullParameter(credentialStoreActions, "");
            this.credentialStoreActions = credentialStoreActions;
            this.defaultState = new NotConfigured(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public AnyResolver<CredentialStoreState, ?> eraseToAnyResolver() {
            return StateMachineResolver.DefaultImpls.eraseToAnyResolver(this);
        }

        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public LoggingStateMachineResolver<CredentialStoreState, StateMachineResolver<CredentialStoreState>> logging(Logger logger, @NotNull Level level) {
            return StateMachineResolver.DefaultImpls.logging(this, logger, level);
        }

        private final CredentialStoreEvent.EventType asCredentialStoreEvent(StateMachineEvent stateMachineEvent) {
            CredentialStoreEvent credentialStoreEvent = stateMachineEvent instanceof CredentialStoreEvent ? (CredentialStoreEvent) stateMachineEvent : null;
            if (credentialStoreEvent != null) {
                return credentialStoreEvent.getEventType();
            }
            return null;
        }

        /* JADX DEBUG: Method merged with bridge method: resolve(Lcom/amplifyframework/statemachine/State;Lcom/amplifyframework/statemachine/StateMachineEvent;)Lcom/amplifyframework/statemachine/StateResolution; */
        @Override // com.amplifyframework.statemachine.StateMachineResolver
        public StateResolution<CredentialStoreState> resolve(@NotNull CredentialStoreState credentialStoreState, @NotNull StateMachineEvent stateMachineEvent) {
            Intrinsics.checkNotNullParameter(credentialStoreState, "");
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
            byte b10 = 0;
            byte b11 = 0;
            StateResolution<CredentialStoreState> stateResolution = new StateResolution<>(credentialStoreState, null, 2, null);
            CredentialStoreEvent.EventType eventTypeAsCredentialStoreEvent = asCredentialStoreEvent(stateMachineEvent);
            int i = 1;
            if (credentialStoreState instanceof NotConfigured) {
                if ((eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.MigrateLegacyCredentialStore) || (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore)) {
                    return new StateResolution<>(new MigratingLegacyStore(str, i, b11 == true ? 1 : 0), C56402yEa.EZpvd(this.credentialStoreActions.migrateLegacyCredentialStoreAction()));
                }
                return stateResolution;
            }
            if (credentialStoreState instanceof MigratingLegacyStore) {
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore) {
                    return new StateResolution<>(new LoadingStoredCredentials(b10 == true ? 1 : 0, i, b9 == true ? 1 : 0), C56402yEa.EZpvd(this.credentialStoreActions.loadCredentialStoreAction(((CredentialStoreEvent.EventType.LoadCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
                }
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ThrowError) {
                    return new StateResolution<>(new Error(((CredentialStoreEvent.EventType.ThrowError) eventTypeAsCredentialStoreEvent).getError()), C56402yEa.EZpvd(this.credentialStoreActions.moveToIdleStateAction()));
                }
                return stateResolution;
            }
            if ((credentialStoreState instanceof LoadingStoredCredentials) || (credentialStoreState instanceof StoringCredentials) || (credentialStoreState instanceof ClearingCredentials)) {
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.CompletedOperation) {
                    return new StateResolution<>(new Success(((CredentialStoreEvent.EventType.CompletedOperation) eventTypeAsCredentialStoreEvent).getStoredCredentials()), C56402yEa.EZpvd(this.credentialStoreActions.moveToIdleStateAction()));
                }
                return eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ThrowError ? new StateResolution<>(new Error(((CredentialStoreEvent.EventType.ThrowError) eventTypeAsCredentialStoreEvent).getError()), null, 2, null) : stateResolution;
            }
            if (credentialStoreState instanceof Idle) {
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.ClearCredentialStore) {
                    return new StateResolution<>(new ClearingCredentials(b8 == true ? 1 : 0, i, b7 == true ? 1 : 0), C56402yEa.EZpvd(this.credentialStoreActions.clearCredentialStoreAction(((CredentialStoreEvent.EventType.ClearCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
                }
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.LoadCredentialStore) {
                    return new StateResolution<>(new LoadingStoredCredentials(b6 == true ? 1 : 0, i, b5 == true ? 1 : 0), C56402yEa.EZpvd(this.credentialStoreActions.loadCredentialStoreAction(((CredentialStoreEvent.EventType.LoadCredentialStore) eventTypeAsCredentialStoreEvent).getCredentialType())));
                }
                if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.StoreCredentials) {
                    CredentialStoreEvent.EventType.StoreCredentials storeCredentials = (CredentialStoreEvent.EventType.StoreCredentials) eventTypeAsCredentialStoreEvent;
                    return new StateResolution<>(new StoringCredentials(b4 == true ? 1 : 0, i, b3 == true ? 1 : 0), C56402yEa.EZpvd(this.credentialStoreActions.storeCredentialsAction(storeCredentials.getCredentialType(), storeCredentials.getCredentials())));
                }
                return new StateResolution<>(credentialStoreState, null, 2, null);
            }
            if (!(credentialStoreState instanceof Success) && !(credentialStoreState instanceof Error)) {
                throw new NoWhenBranchMatchedException();
            }
            if (eventTypeAsCredentialStoreEvent instanceof CredentialStoreEvent.EventType.MoveToIdleState) {
                return new StateResolution<>(new Idle(b2 == true ? 1 : 0, i, b == true ? 1 : 0), yDY.AhwBna());
            }
            return new StateResolution<>(credentialStoreState, null, 2, null);
        }
    }
}

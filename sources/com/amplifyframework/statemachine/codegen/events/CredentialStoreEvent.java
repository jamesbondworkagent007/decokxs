package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.errors.CredentialStoreError;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CredentialStoreEvent implements StateMachineEvent {
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

    public CredentialStoreEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent$EventType, java.util.Date):void (m)] (LINE:24) call: com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent.<init>(com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ CredentialStoreEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class MigrateLegacyCredentialStore extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public MigrateLegacyCredentialStore() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ MigrateLegacyCredentialStore copy$default(MigrateLegacyCredentialStore migrateLegacyCredentialStore, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = migrateLegacyCredentialStore.id;
                }
                return migrateLegacyCredentialStore.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MigrateLegacyCredentialStore copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new MigrateLegacyCredentialStore(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MigrateLegacyCredentialStore) && Intrinsics.EZpvd((Object) this.id, (Object) ((MigrateLegacyCredentialStore) obj).id);
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
                return "MigrateLegacyCredentialStore(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MigrateLegacyCredentialStore(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent.EventType.MigrateLegacyCredentialStore.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ MigrateLegacyCredentialStore(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        private EventType() {
        }

        public static final class LoadCredentialStore extends EventType {
            private final CredentialType credentialType;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ LoadCredentialStore copy$default(LoadCredentialStore loadCredentialStore, CredentialType credentialType, int i, Object obj) {
                if ((i & 1) != 0) {
                    credentialType = loadCredentialStore.credentialType;
                }
                return loadCredentialStore.copy(credentialType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialType component1() {
                return this.credentialType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoadCredentialStore copy(@NotNull CredentialType credentialType) {
                Intrinsics.checkNotNullParameter(credentialType, "");
                return new LoadCredentialStore(credentialType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadCredentialStore) && Intrinsics.EZpvd(this.credentialType, ((LoadCredentialStore) obj).credentialType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialType getCredentialType() {
                return this.credentialType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.credentialType.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "LoadCredentialStore(credentialType=" + this.credentialType + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LoadCredentialStore(@NotNull CredentialType credentialType) {
                super(null);
                Intrinsics.checkNotNullParameter(credentialType, "");
                this.credentialType = credentialType;
            }
        }

        public static final class StoreCredentials extends EventType {
            private final CredentialType credentialType;
            private final AmplifyCredential credentials;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StoreCredentials copy$default(StoreCredentials storeCredentials, CredentialType credentialType, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    credentialType = storeCredentials.credentialType;
                }
                if ((i & 2) != 0) {
                    amplifyCredential = storeCredentials.credentials;
                }
                return storeCredentials.copy(credentialType, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialType component1() {
                return this.credentialType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component2() {
                return this.credentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StoreCredentials copy(@NotNull CredentialType credentialType, @NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(credentialType, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new StoreCredentials(credentialType, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StoreCredentials)) {
                    return false;
                }
                StoreCredentials storeCredentials = (StoreCredentials) obj;
                return Intrinsics.EZpvd(this.credentialType, storeCredentials.credentialType) && Intrinsics.EZpvd(this.credentials, storeCredentials.credentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialType getCredentialType() {
                return this.credentialType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getCredentials() {
                return this.credentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.credentialType.hashCode() * 31) + this.credentials.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StoreCredentials(credentialType=" + this.credentialType + ", credentials=" + this.credentials + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StoreCredentials(@NotNull CredentialType credentialType, @NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(credentialType, "");
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.credentialType = credentialType;
                this.credentials = amplifyCredential;
            }
        }

        public static final class ClearCredentialStore extends EventType {
            private final CredentialType credentialType;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ClearCredentialStore copy$default(ClearCredentialStore clearCredentialStore, CredentialType credentialType, int i, Object obj) {
                if ((i & 1) != 0) {
                    credentialType = clearCredentialStore.credentialType;
                }
                return clearCredentialStore.copy(credentialType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialType component1() {
                return this.credentialType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ClearCredentialStore copy(@NotNull CredentialType credentialType) {
                Intrinsics.checkNotNullParameter(credentialType, "");
                return new ClearCredentialStore(credentialType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClearCredentialStore) && Intrinsics.EZpvd(this.credentialType, ((ClearCredentialStore) obj).credentialType);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialType getCredentialType() {
                return this.credentialType;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.credentialType.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ClearCredentialStore(credentialType=" + this.credentialType + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ClearCredentialStore(@NotNull CredentialType credentialType) {
                super(null);
                Intrinsics.checkNotNullParameter(credentialType, "");
                this.credentialType = credentialType;
            }
        }

        public static final class CompletedOperation extends EventType {
            private final AmplifyCredential storedCredentials;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CompletedOperation copy$default(CompletedOperation completedOperation, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = completedOperation.storedCredentials;
                }
                return completedOperation.copy(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component1() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CompletedOperation copy(@NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new CompletedOperation(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CompletedOperation) && Intrinsics.EZpvd(this.storedCredentials, ((CompletedOperation) obj).storedCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getStoredCredentials() {
                return this.storedCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.storedCredentials.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CompletedOperation(storedCredentials=" + this.storedCredentials + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CompletedOperation(@NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.storedCredentials = amplifyCredential;
            }
        }

        public static final class MoveToIdleState extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public MoveToIdleState() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ MoveToIdleState copy$default(MoveToIdleState moveToIdleState, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = moveToIdleState.id;
                }
                return moveToIdleState.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final MoveToIdleState copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new MoveToIdleState(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MoveToIdleState) && Intrinsics.EZpvd((Object) this.id, (Object) ((MoveToIdleState) obj).id);
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
                return "MoveToIdleState(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MoveToIdleState(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:35) call: com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent.EventType.MoveToIdleState.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ MoveToIdleState(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str);
            }
        }

        public static final class ThrowError extends EventType {
            private final CredentialStoreError error;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ThrowError copy$default(ThrowError throwError, CredentialStoreError credentialStoreError, int i, Object obj) {
                if ((i & 1) != 0) {
                    credentialStoreError = throwError.error;
                }
                return throwError.copy(credentialStoreError);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialStoreError component1() {
                return this.error;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ThrowError copy(@NotNull CredentialStoreError credentialStoreError) {
                Intrinsics.checkNotNullParameter(credentialStoreError, "");
                return new ThrowError(credentialStoreError);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ThrowError) && Intrinsics.EZpvd(this.error, ((ThrowError) obj).error);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CredentialStoreError getError() {
                return this.error;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.error.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ThrowError(error=" + this.error + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ThrowError(@NotNull CredentialStoreError credentialStoreError) {
                super(null);
                Intrinsics.checkNotNullParameter(credentialStoreError, "");
                this.error = credentialStoreError;
            }
        }
    }
}

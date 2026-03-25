package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthorizationEvent implements StateMachineEvent {
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

    public AuthorizationEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.AuthorizationEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.AuthorizationEvent$EventType, java.util.Date):void (m)] (LINE:24) call: com.amplifyframework.statemachine.codegen.events.AuthorizationEvent.<init>(com.amplifyframework.statemachine.codegen.events.AuthorizationEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ AuthorizationEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.AuthorizationEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class Configure extends EventType {
            public static final Configure INSTANCE = new Configure();

            private Configure() {
                super(null);
            }
        }

        private EventType() {
        }

        /* JADX INFO: loaded from: classes14.dex */
        public static final class FetchAuthSession extends EventType {
            public static final FetchAuthSession INSTANCE = new FetchAuthSession();

            private FetchAuthSession() {
                super(null);
            }
        }

        public static final class FetchUnAuthSession extends EventType {
            public static final FetchUnAuthSession INSTANCE = new FetchUnAuthSession();

            private FetchUnAuthSession() {
                super(null);
            }
        }

        public static final class Fetched extends EventType {
            private final AWSCredentials awsCredentials;
            private final String identityId;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Fetched copy$default(Fetched fetched, String str, AWSCredentials aWSCredentials, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fetched.identityId;
                }
                if ((i & 2) != 0) {
                    aWSCredentials = fetched.awsCredentials;
                }
                return fetched.copy(str, aWSCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.identityId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AWSCredentials component2() {
                return this.awsCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Fetched copy(@NotNull String str, @NotNull AWSCredentials aWSCredentials) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(aWSCredentials, "");
                return new Fetched(str, aWSCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Fetched)) {
                    return false;
                }
                Fetched fetched = (Fetched) obj;
                return Intrinsics.EZpvd((Object) this.identityId, (Object) fetched.identityId) && Intrinsics.EZpvd(this.awsCredentials, fetched.awsCredentials);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AWSCredentials getAwsCredentials() {
                return this.awsCredentials;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getIdentityId() {
                return this.identityId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.identityId.hashCode() * 31) + this.awsCredentials.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Fetched(identityId=" + this.identityId + ", awsCredentials=" + this.awsCredentials + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Fetched(@NotNull String str, @NotNull AWSCredentials aWSCredentials) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(aWSCredentials, "");
                this.identityId = str;
                this.awsCredentials = aWSCredentials;
            }
        }

        public static final class RefreshSession extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RefreshSession copy$default(RefreshSession refreshSession, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = refreshSession.amplifyCredential;
                }
                return refreshSession.copy(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RefreshSession copy(@NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new RefreshSession(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshSession) && Intrinsics.EZpvd(this.amplifyCredential, ((RefreshSession) obj).amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getAmplifyCredential() {
                return this.amplifyCredential;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.amplifyCredential.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RefreshSession(amplifyCredential=" + this.amplifyCredential + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshSession(@NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.amplifyCredential = amplifyCredential;
            }
        }

        public static final class Refreshed extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = refreshed.amplifyCredential;
                }
                return refreshed.copy(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Refreshed copy(@NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new Refreshed(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Refreshed) && Intrinsics.EZpvd(this.amplifyCredential, ((Refreshed) obj).amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getAmplifyCredential() {
                return this.amplifyCredential;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.amplifyCredential.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Refreshed(amplifyCredential=" + this.amplifyCredential + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refreshed(@NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.amplifyCredential = amplifyCredential;
            }
        }

        public static final class CachedCredentialsAvailable extends EventType {
            private final AmplifyCredential amplifyCredential;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ CachedCredentialsAvailable copy$default(CachedCredentialsAvailable cachedCredentialsAvailable, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    amplifyCredential = cachedCredentialsAvailable.amplifyCredential;
                }
                return cachedCredentialsAvailable.copy(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component1() {
                return this.amplifyCredential;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final CachedCredentialsAvailable copy(@NotNull AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                return new CachedCredentialsAvailable(amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CachedCredentialsAvailable) && Intrinsics.EZpvd(this.amplifyCredential, ((CachedCredentialsAvailable) obj).amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getAmplifyCredential() {
                return this.amplifyCredential;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.amplifyCredential.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "CachedCredentialsAvailable(amplifyCredential=" + this.amplifyCredential + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CachedCredentialsAvailable(@NotNull AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(amplifyCredential, "");
                this.amplifyCredential = amplifyCredential;
            }
        }

        public static final class UserDeleted extends EventType {
            private final String id;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public UserDeleted() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UserDeleted copy$default(UserDeleted userDeleted, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = userDeleted.id;
                }
                return userDeleted.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.id;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UserDeleted copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new UserDeleted(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserDeleted) && Intrinsics.EZpvd((Object) this.id, (Object) ((UserDeleted) obj).id);
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
                return "UserDeleted(id=" + this.id + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserDeleted(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.id = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:34) call: com.amplifyframework.statemachine.codegen.events.AuthorizationEvent.EventType.UserDeleted.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ UserDeleted(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
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

        public static final class StartFederationToIdentityPool extends EventType {
            private final AmplifyCredential existingCredential;
            private final String identityId;
            private final FederatedToken token;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StartFederationToIdentityPool copy$default(StartFederationToIdentityPool startFederationToIdentityPool, FederatedToken federatedToken, String str, AmplifyCredential amplifyCredential, int i, Object obj) {
                if ((i & 1) != 0) {
                    federatedToken = startFederationToIdentityPool.token;
                }
                if ((i & 2) != 0) {
                    str = startFederationToIdentityPool.identityId;
                }
                if ((i & 4) != 0) {
                    amplifyCredential = startFederationToIdentityPool.existingCredential;
                }
                return startFederationToIdentityPool.copy(federatedToken, str, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FederatedToken component1() {
                return this.token;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component2() {
                return this.identityId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential component3() {
                return this.existingCredential;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StartFederationToIdentityPool copy(@NotNull FederatedToken federatedToken, String str, AmplifyCredential amplifyCredential) {
                Intrinsics.checkNotNullParameter(federatedToken, "");
                return new StartFederationToIdentityPool(federatedToken, str, amplifyCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StartFederationToIdentityPool)) {
                    return false;
                }
                StartFederationToIdentityPool startFederationToIdentityPool = (StartFederationToIdentityPool) obj;
                return Intrinsics.EZpvd(this.token, startFederationToIdentityPool.token) && Intrinsics.EZpvd((Object) this.identityId, (Object) startFederationToIdentityPool.identityId) && Intrinsics.EZpvd(this.existingCredential, startFederationToIdentityPool.existingCredential);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AmplifyCredential getExistingCredential() {
                return this.existingCredential;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getIdentityId() {
                return this.identityId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FederatedToken getToken() {
                return this.token;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.token.hashCode();
                String str = this.identityId;
                int iHashCode2 = str == null ? 0 : str.hashCode();
                AmplifyCredential amplifyCredential = this.existingCredential;
                return (((iHashCode * 31) + iHashCode2) * 31) + (amplifyCredential != null ? amplifyCredential.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "StartFederationToIdentityPool(token=" + this.token + ", identityId=" + this.identityId + ", existingCredential=" + this.existingCredential + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StartFederationToIdentityPool(@NotNull FederatedToken federatedToken, String str, AmplifyCredential amplifyCredential) {
                super(null);
                Intrinsics.checkNotNullParameter(federatedToken, "");
                this.token = federatedToken;
                this.identityId = str;
                this.existingCredential = amplifyCredential;
            }
        }
    }
}

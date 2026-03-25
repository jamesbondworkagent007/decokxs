package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchAuthSessionEvent implements StateMachineEvent {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class FetchIdentity extends EventType {
            private final LoginsMapProvider logins;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FetchIdentity copy$default(FetchIdentity fetchIdentity, LoginsMapProvider loginsMapProvider, int i, Object obj) {
                if ((i & 1) != 0) {
                    loginsMapProvider = fetchIdentity.logins;
                }
                return fetchIdentity.copy(loginsMapProvider);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoginsMapProvider component1() {
                return this.logins;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FetchIdentity copy(@NotNull LoginsMapProvider loginsMapProvider) {
                Intrinsics.checkNotNullParameter(loginsMapProvider, "");
                return new FetchIdentity(loginsMapProvider);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchIdentity) && Intrinsics.EZpvd(this.logins, ((FetchIdentity) obj).logins);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoginsMapProvider getLogins() {
                return this.logins;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.logins.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FetchIdentity(logins=" + this.logins + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchIdentity(@NotNull LoginsMapProvider loginsMapProvider) {
                super(null);
                Intrinsics.checkNotNullParameter(loginsMapProvider, "");
                this.logins = loginsMapProvider;
            }
        }

        private EventType() {
        }

        public static final class FetchAwsCredentials extends EventType {
            private final String identityId;
            private final LoginsMapProvider logins;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FetchAwsCredentials copy$default(FetchAwsCredentials fetchAwsCredentials, String str, LoginsMapProvider loginsMapProvider, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = fetchAwsCredentials.identityId;
                }
                if ((i & 2) != 0) {
                    loginsMapProvider = fetchAwsCredentials.logins;
                }
                return fetchAwsCredentials.copy(str, loginsMapProvider);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.identityId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoginsMapProvider component2() {
                return this.logins;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FetchAwsCredentials copy(@NotNull String str, @NotNull LoginsMapProvider loginsMapProvider) {
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(loginsMapProvider, "");
                return new FetchAwsCredentials(str, loginsMapProvider);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FetchAwsCredentials)) {
                    return false;
                }
                FetchAwsCredentials fetchAwsCredentials = (FetchAwsCredentials) obj;
                return Intrinsics.EZpvd((Object) this.identityId, (Object) fetchAwsCredentials.identityId) && Intrinsics.EZpvd(this.logins, fetchAwsCredentials.logins);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getIdentityId() {
                return this.identityId;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoginsMapProvider getLogins() {
                return this.logins;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.identityId.hashCode() * 31) + this.logins.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FetchAwsCredentials(identityId=" + this.identityId + ", logins=" + this.logins + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchAwsCredentials(@NotNull String str, @NotNull LoginsMapProvider loginsMapProvider) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                Intrinsics.checkNotNullParameter(loginsMapProvider, "");
                this.identityId = str;
                this.logins = loginsMapProvider;
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
    }

    public FetchAuthSessionEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent$EventType, java.util.Date):void (m)] (LINE:23) call: com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent.<init>(com.amplifyframework.statemachine.codegen.events.FetchAuthSessionEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ FetchAuthSessionEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }
}

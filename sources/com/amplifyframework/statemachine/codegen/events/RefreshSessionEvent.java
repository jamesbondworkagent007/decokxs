package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class RefreshSessionEvent implements StateMachineEvent {
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
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class RefreshUserPoolTokens extends EventType {
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RefreshUserPoolTokens copy$default(RefreshUserPoolTokens refreshUserPoolTokens, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = refreshUserPoolTokens.signedInData;
                }
                return refreshUserPoolTokens.copy(signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RefreshUserPoolTokens copy(@NotNull SignedInData signedInData) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                return new RefreshUserPoolTokens(signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshUserPoolTokens) && Intrinsics.EZpvd(this.signedInData, ((RefreshUserPoolTokens) obj).signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.signedInData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RefreshUserPoolTokens(signedInData=" + this.signedInData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshUserPoolTokens(@NotNull SignedInData signedInData) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                this.signedInData = signedInData;
            }
        }

        private EventType() {
        }

        public static final class RefreshAuthSession extends EventType {
            private final LoginsMapProvider logins;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RefreshAuthSession copy$default(RefreshAuthSession refreshAuthSession, SignedInData signedInData, LoginsMapProvider loginsMapProvider, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = refreshAuthSession.signedInData;
                }
                if ((i & 2) != 0) {
                    loginsMapProvider = refreshAuthSession.logins;
                }
                return refreshAuthSession.copy(signedInData, loginsMapProvider);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoginsMapProvider component2() {
                return this.logins;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RefreshAuthSession copy(@NotNull SignedInData signedInData, @NotNull LoginsMapProvider loginsMapProvider) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                Intrinsics.checkNotNullParameter(loginsMapProvider, "");
                return new RefreshAuthSession(signedInData, loginsMapProvider);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RefreshAuthSession)) {
                    return false;
                }
                RefreshAuthSession refreshAuthSession = (RefreshAuthSession) obj;
                return Intrinsics.EZpvd(this.signedInData, refreshAuthSession.signedInData) && Intrinsics.EZpvd(this.logins, refreshAuthSession.logins);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoginsMapProvider getLogins() {
                return this.logins;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.signedInData.hashCode() * 31) + this.logins.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RefreshAuthSession(signedInData=" + this.signedInData + ", logins=" + this.logins + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshAuthSession(@NotNull SignedInData signedInData, @NotNull LoginsMapProvider loginsMapProvider) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                Intrinsics.checkNotNullParameter(loginsMapProvider, "");
                this.signedInData = signedInData;
                this.logins = loginsMapProvider;
            }
        }

        public static final class RefreshUnAuthSession extends EventType {
            private final LoginsMapProvider logins;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RefreshUnAuthSession copy$default(RefreshUnAuthSession refreshUnAuthSession, LoginsMapProvider loginsMapProvider, int i, Object obj) {
                if ((i & 1) != 0) {
                    loginsMapProvider = refreshUnAuthSession.logins;
                }
                return refreshUnAuthSession.copy(loginsMapProvider);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final LoginsMapProvider component1() {
                return this.logins;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RefreshUnAuthSession copy(@NotNull LoginsMapProvider loginsMapProvider) {
                Intrinsics.checkNotNullParameter(loginsMapProvider, "");
                return new RefreshUnAuthSession(loginsMapProvider);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RefreshUnAuthSession) && Intrinsics.EZpvd(this.logins, ((RefreshUnAuthSession) obj).logins);
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
                return "RefreshUnAuthSession(logins=" + this.logins + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RefreshUnAuthSession(@NotNull LoginsMapProvider loginsMapProvider) {
                super(null);
                Intrinsics.checkNotNullParameter(loginsMapProvider, "");
                this.logins = loginsMapProvider;
            }
        }

        public static final class Refreshed extends EventType {
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Refreshed copy$default(Refreshed refreshed, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = refreshed.signedInData;
                }
                return refreshed.copy(signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Refreshed copy(@NotNull SignedInData signedInData) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                return new Refreshed(signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Refreshed) && Intrinsics.EZpvd(this.signedInData, ((Refreshed) obj).signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.signedInData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "Refreshed(signedInData=" + this.signedInData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refreshed(@NotNull SignedInData signedInData) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                this.signedInData = signedInData;
            }
        }
    }

    public RefreshSessionEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent$EventType, java.util.Date):void (m)] (LINE:23) call: com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent.<init>(com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ RefreshSessionEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }
}

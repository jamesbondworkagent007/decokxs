package com.amplifyframework.statemachine.codegen.events;

import android.net.Uri;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.SignInData;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HostedUIEvent implements StateMachineEvent {
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

    public HostedUIEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.HostedUIEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.HostedUIEvent$EventType, java.util.Date):void (m)] (LINE:24) call: com.amplifyframework.statemachine.codegen.events.HostedUIEvent.<init>(com.amplifyframework.statemachine.codegen.events.HostedUIEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ HostedUIEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.HostedUIEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ShowHostedUI extends EventType {
            private final SignInData.HostedUISignInData hostedUISignInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ShowHostedUI copy$default(ShowHostedUI showHostedUI, SignInData.HostedUISignInData hostedUISignInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    hostedUISignInData = showHostedUI.hostedUISignInData;
                }
                return showHostedUI.copy(hostedUISignInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInData.HostedUISignInData component1() {
                return this.hostedUISignInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ShowHostedUI copy(@NotNull SignInData.HostedUISignInData hostedUISignInData) {
                Intrinsics.checkNotNullParameter(hostedUISignInData, "");
                return new ShowHostedUI(hostedUISignInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowHostedUI) && Intrinsics.EZpvd(this.hostedUISignInData, ((ShowHostedUI) obj).hostedUISignInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignInData.HostedUISignInData getHostedUISignInData() {
                return this.hostedUISignInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.hostedUISignInData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ShowHostedUI(hostedUISignInData=" + this.hostedUISignInData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ShowHostedUI(@NotNull SignInData.HostedUISignInData hostedUISignInData) {
                super(null);
                Intrinsics.checkNotNullParameter(hostedUISignInData, "");
                this.hostedUISignInData = hostedUISignInData;
            }
        }

        private EventType() {
        }

        public static final class FetchToken extends EventType {
            private final Uri uri;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ FetchToken copy$default(FetchToken fetchToken, Uri uri, int i, Object obj) {
                if ((i & 1) != 0) {
                    uri = fetchToken.uri;
                }
                return fetchToken.copy(uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Uri component1() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final FetchToken copy(@NotNull Uri uri) {
                Intrinsics.checkNotNullParameter(uri, "");
                return new FetchToken(uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FetchToken) && Intrinsics.EZpvd(this.uri, ((FetchToken) obj).uri);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Uri getUri() {
                return this.uri;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.uri.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "FetchToken(uri=" + this.uri + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FetchToken(@NotNull Uri uri) {
                super(null);
                Intrinsics.checkNotNullParameter(uri, "");
                this.uri = uri;
            }
        }

        public static final class TokenFetched extends EventType {
            public static final TokenFetched INSTANCE = new TokenFetched();

            private TokenFetched() {
                super(null);
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
    }
}

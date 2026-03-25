package com.amplifyframework.statemachine.codegen.events;

import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData;
import com.amplifyframework.statemachine.codegen.data.HostedUIErrorData;
import com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData;
import com.amplifyframework.statemachine.codegen.data.SignOutData;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.SignedOutData;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignOutEvent implements StateMachineEvent {
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

    public SignOutEvent(@NotNull EventType eventType, Date date) {
        Intrinsics.checkNotNullParameter(eventType, "");
        this.eventType = eventType;
        this.time = date;
        String simpleName = eventType.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "");
        this.type = simpleName;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.events.SignOutEvent$EventType)
  (wrap:java.util.Date:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.Date) : (r2v0 java.util.Date))
 A[MD:(com.amplifyframework.statemachine.codegen.events.SignOutEvent$EventType, java.util.Date):void (m)] (LINE:27) call: com.amplifyframework.statemachine.codegen.events.SignOutEvent.<init>(com.amplifyframework.statemachine.codegen.events.SignOutEvent$EventType, java.util.Date):void type: THIS */
    public /* synthetic */ SignOutEvent(EventType eventType, Date date, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventType, (i & 2) != 0 ? null : date);
    }

    @Override // com.amplifyframework.statemachine.StateMachineEvent
    public String getId() {
        return StateMachineEvent.DefaultImpls.getId(this);
    }

    public static abstract class EventType {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.statemachine.codegen.events.SignOutEvent.EventType.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ EventType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class InvokeHostedUISignOut extends EventType {
            private final SignOutData signOutData;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ InvokeHostedUISignOut copy$default(InvokeHostedUISignOut invokeHostedUISignOut, SignOutData signOutData, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signOutData = invokeHostedUISignOut.signOutData;
                }
                if ((i & 2) != 0) {
                    signedInData = invokeHostedUISignOut.signedInData;
                }
                return invokeHostedUISignOut.copy(signOutData, signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignOutData component1() {
                return this.signOutData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component2() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final InvokeHostedUISignOut copy(@NotNull SignOutData signOutData, @NotNull SignedInData signedInData) {
                Intrinsics.checkNotNullParameter(signOutData, "");
                Intrinsics.checkNotNullParameter(signedInData, "");
                return new InvokeHostedUISignOut(signOutData, signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InvokeHostedUISignOut)) {
                    return false;
                }
                InvokeHostedUISignOut invokeHostedUISignOut = (InvokeHostedUISignOut) obj;
                return Intrinsics.EZpvd(this.signOutData, invokeHostedUISignOut.signOutData) && Intrinsics.EZpvd(this.signedInData, invokeHostedUISignOut.signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignOutData getSignOutData() {
                return this.signOutData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return (this.signOutData.hashCode() * 31) + this.signedInData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "InvokeHostedUISignOut(signOutData=" + this.signOutData + ", signedInData=" + this.signedInData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvokeHostedUISignOut(@NotNull SignOutData signOutData, @NotNull SignedInData signedInData) {
                super(null);
                Intrinsics.checkNotNullParameter(signOutData, "");
                Intrinsics.checkNotNullParameter(signedInData, "");
                this.signOutData = signOutData;
                this.signedInData = signedInData;
            }
        }

        private EventType() {
        }

        public static final class SignOutLocally extends EventType {
            private final GlobalSignOutErrorData globalSignOutErrorData;
            private final HostedUIErrorData hostedUIErrorData;
            private final RevokeTokenErrorData revokeTokenErrorData;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignOutLocally copy$default(SignOutLocally signOutLocally, SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = signOutLocally.signedInData;
                }
                if ((i & 2) != 0) {
                    hostedUIErrorData = signOutLocally.hostedUIErrorData;
                }
                if ((i & 4) != 0) {
                    globalSignOutErrorData = signOutLocally.globalSignOutErrorData;
                }
                if ((i & 8) != 0) {
                    revokeTokenErrorData = signOutLocally.revokeTokenErrorData;
                }
                return signOutLocally.copy(signedInData, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HostedUIErrorData component2() {
                return this.hostedUIErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GlobalSignOutErrorData component3() {
                return this.globalSignOutErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RevokeTokenErrorData component4() {
                return this.revokeTokenErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignOutLocally copy(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
                return new SignOutLocally(signedInData, hostedUIErrorData, globalSignOutErrorData, revokeTokenErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignOutLocally)) {
                    return false;
                }
                SignOutLocally signOutLocally = (SignOutLocally) obj;
                return Intrinsics.EZpvd(this.signedInData, signOutLocally.signedInData) && Intrinsics.EZpvd(this.hostedUIErrorData, signOutLocally.hostedUIErrorData) && Intrinsics.EZpvd(this.globalSignOutErrorData, signOutLocally.globalSignOutErrorData) && Intrinsics.EZpvd(this.revokeTokenErrorData, signOutLocally.revokeTokenErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GlobalSignOutErrorData getGlobalSignOutErrorData() {
                return this.globalSignOutErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HostedUIErrorData getHostedUIErrorData() {
                return this.hostedUIErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RevokeTokenErrorData getRevokeTokenErrorData() {
                return this.revokeTokenErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                SignedInData signedInData = this.signedInData;
                int iHashCode = signedInData == null ? 0 : signedInData.hashCode();
                HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
                int iHashCode2 = hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode();
                GlobalSignOutErrorData globalSignOutErrorData = this.globalSignOutErrorData;
                int iHashCode3 = globalSignOutErrorData == null ? 0 : globalSignOutErrorData.hashCode();
                RevokeTokenErrorData revokeTokenErrorData = this.revokeTokenErrorData;
                return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (revokeTokenErrorData != null ? revokeTokenErrorData.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignOutLocally(signedInData=" + this.signedInData + ", hostedUIErrorData=" + this.hostedUIErrorData + ", globalSignOutErrorData=" + this.globalSignOutErrorData + ", revokeTokenErrorData=" + this.revokeTokenErrorData + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r2v0 com.amplifyframework.statemachine.codegen.data.SignedInData)
  (wrap:com.amplifyframework.statemachine.codegen.data.HostedUIErrorData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.HostedUIErrorData) : (r3v0 com.amplifyframework.statemachine.codegen.data.HostedUIErrorData))
  (wrap:com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData) : (r4v0 com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData))
  (wrap:com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData) : (r5v0 com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData))
 A[MD:(com.amplifyframework.statemachine.codegen.data.SignedInData, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData, com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData, com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData):void (m)] (LINE:34) call: com.amplifyframework.statemachine.codegen.events.SignOutEvent.EventType.SignOutLocally.<init>(com.amplifyframework.statemachine.codegen.data.SignedInData, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData, com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData, com.amplifyframework.statemachine.codegen.data.RevokeTokenErrorData):void type: THIS */
            public /* synthetic */ SignOutLocally(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(signedInData, (i & 2) != 0 ? null : hostedUIErrorData, (i & 4) != 0 ? null : globalSignOutErrorData, (i & 8) != 0 ? null : revokeTokenErrorData);
            }

            public SignOutLocally(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, RevokeTokenErrorData revokeTokenErrorData) {
                super(null);
                this.signedInData = signedInData;
                this.hostedUIErrorData = hostedUIErrorData;
                this.globalSignOutErrorData = globalSignOutErrorData;
                this.revokeTokenErrorData = revokeTokenErrorData;
            }
        }

        public static final class SignOutGlobally extends EventType {
            private final HostedUIErrorData hostedUIErrorData;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignOutGlobally copy$default(SignOutGlobally signOutGlobally, SignedInData signedInData, HostedUIErrorData hostedUIErrorData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = signOutGlobally.signedInData;
                }
                if ((i & 2) != 0) {
                    hostedUIErrorData = signOutGlobally.hostedUIErrorData;
                }
                return signOutGlobally.copy(signedInData, hostedUIErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HostedUIErrorData component2() {
                return this.hostedUIErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignOutGlobally copy(@NotNull SignedInData signedInData, HostedUIErrorData hostedUIErrorData) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                return new SignOutGlobally(signedInData, hostedUIErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignOutGlobally)) {
                    return false;
                }
                SignOutGlobally signOutGlobally = (SignOutGlobally) obj;
                return Intrinsics.EZpvd(this.signedInData, signOutGlobally.signedInData) && Intrinsics.EZpvd(this.hostedUIErrorData, signOutGlobally.hostedUIErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HostedUIErrorData getHostedUIErrorData() {
                return this.hostedUIErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.signedInData.hashCode();
                HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
                return (iHashCode * 31) + (hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode());
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignOutGlobally(signedInData=" + this.signedInData + ", hostedUIErrorData=" + this.hostedUIErrorData + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.amplifyframework.statemachine.codegen.data.SignedInData)
  (wrap:com.amplifyframework.statemachine.codegen.data.HostedUIErrorData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.HostedUIErrorData) : (r2v0 com.amplifyframework.statemachine.codegen.data.HostedUIErrorData))
 A[MD:(com.amplifyframework.statemachine.codegen.data.SignedInData, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData):void (m)] (LINE:41) call: com.amplifyframework.statemachine.codegen.events.SignOutEvent.EventType.SignOutGlobally.<init>(com.amplifyframework.statemachine.codegen.data.SignedInData, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData):void type: THIS */
            public /* synthetic */ SignOutGlobally(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(signedInData, (i & 2) != 0 ? null : hostedUIErrorData);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignOutGlobally(@NotNull SignedInData signedInData, HostedUIErrorData hostedUIErrorData) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                this.signedInData = signedInData;
                this.hostedUIErrorData = hostedUIErrorData;
            }
        }

        public static final class RevokeToken extends EventType {
            private final GlobalSignOutErrorData globalSignOutErrorData;
            private final HostedUIErrorData hostedUIErrorData;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ RevokeToken copy$default(RevokeToken revokeToken, SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = revokeToken.signedInData;
                }
                if ((i & 2) != 0) {
                    hostedUIErrorData = revokeToken.hostedUIErrorData;
                }
                if ((i & 4) != 0) {
                    globalSignOutErrorData = revokeToken.globalSignOutErrorData;
                }
                return revokeToken.copy(signedInData, hostedUIErrorData, globalSignOutErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HostedUIErrorData component2() {
                return this.hostedUIErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GlobalSignOutErrorData component3() {
                return this.globalSignOutErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final RevokeToken copy(@NotNull SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                return new RevokeToken(signedInData, hostedUIErrorData, globalSignOutErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RevokeToken)) {
                    return false;
                }
                RevokeToken revokeToken = (RevokeToken) obj;
                return Intrinsics.EZpvd(this.signedInData, revokeToken.signedInData) && Intrinsics.EZpvd(this.hostedUIErrorData, revokeToken.hostedUIErrorData) && Intrinsics.EZpvd(this.globalSignOutErrorData, revokeToken.globalSignOutErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GlobalSignOutErrorData getGlobalSignOutErrorData() {
                return this.globalSignOutErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HostedUIErrorData getHostedUIErrorData() {
                return this.hostedUIErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.signedInData.hashCode();
                HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
                int iHashCode2 = hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode();
                GlobalSignOutErrorData globalSignOutErrorData = this.globalSignOutErrorData;
                return (((iHashCode * 31) + iHashCode2) * 31) + (globalSignOutErrorData != null ? globalSignOutErrorData.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "RevokeToken(signedInData=" + this.signedInData + ", hostedUIErrorData=" + this.hostedUIErrorData + ", globalSignOutErrorData=" + this.globalSignOutErrorData + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.amplifyframework.statemachine.codegen.data.SignedInData)
  (wrap:com.amplifyframework.statemachine.codegen.data.HostedUIErrorData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.HostedUIErrorData) : (r3v0 com.amplifyframework.statemachine.codegen.data.HostedUIErrorData))
  (wrap:com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData) : (r4v0 com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData))
 A[MD:(com.amplifyframework.statemachine.codegen.data.SignedInData, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData, com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData):void (m)] (LINE:46) call: com.amplifyframework.statemachine.codegen.events.SignOutEvent.EventType.RevokeToken.<init>(com.amplifyframework.statemachine.codegen.data.SignedInData, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData, com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData):void type: THIS */
            public /* synthetic */ RevokeToken(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(signedInData, (i & 2) != 0 ? null : hostedUIErrorData, (i & 4) != 0 ? null : globalSignOutErrorData);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RevokeToken(@NotNull SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                this.signedInData = signedInData;
                this.hostedUIErrorData = hostedUIErrorData;
                this.globalSignOutErrorData = globalSignOutErrorData;
            }
        }

        public static final class SignOutGloballyError extends EventType {
            private final GlobalSignOutErrorData globalSignOutErrorData;
            private final HostedUIErrorData hostedUIErrorData;
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignOutGloballyError copy$default(SignOutGloballyError signOutGloballyError, SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = signOutGloballyError.signedInData;
                }
                if ((i & 2) != 0) {
                    hostedUIErrorData = signOutGloballyError.hostedUIErrorData;
                }
                if ((i & 4) != 0) {
                    globalSignOutErrorData = signOutGloballyError.globalSignOutErrorData;
                }
                return signOutGloballyError.copy(signedInData, hostedUIErrorData, globalSignOutErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HostedUIErrorData component2() {
                return this.hostedUIErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GlobalSignOutErrorData component3() {
                return this.globalSignOutErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignOutGloballyError copy(@NotNull SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                return new SignOutGloballyError(signedInData, hostedUIErrorData, globalSignOutErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SignOutGloballyError)) {
                    return false;
                }
                SignOutGloballyError signOutGloballyError = (SignOutGloballyError) obj;
                return Intrinsics.EZpvd(this.signedInData, signOutGloballyError.signedInData) && Intrinsics.EZpvd(this.hostedUIErrorData, signOutGloballyError.hostedUIErrorData) && Intrinsics.EZpvd(this.globalSignOutErrorData, signOutGloballyError.globalSignOutErrorData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final GlobalSignOutErrorData getGlobalSignOutErrorData() {
                return this.globalSignOutErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final HostedUIErrorData getHostedUIErrorData() {
                return this.hostedUIErrorData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData getSignedInData() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                int iHashCode = this.signedInData.hashCode();
                HostedUIErrorData hostedUIErrorData = this.hostedUIErrorData;
                int iHashCode2 = hostedUIErrorData == null ? 0 : hostedUIErrorData.hashCode();
                GlobalSignOutErrorData globalSignOutErrorData = this.globalSignOutErrorData;
                return (((iHashCode * 31) + iHashCode2) * 31) + (globalSignOutErrorData != null ? globalSignOutErrorData.hashCode() : 0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignOutGloballyError(signedInData=" + this.signedInData + ", hostedUIErrorData=" + this.hostedUIErrorData + ", globalSignOutErrorData=" + this.globalSignOutErrorData + ")";
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r2v0 com.amplifyframework.statemachine.codegen.data.SignedInData)
  (wrap:com.amplifyframework.statemachine.codegen.data.HostedUIErrorData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.HostedUIErrorData) : (r3v0 com.amplifyframework.statemachine.codegen.data.HostedUIErrorData))
  (wrap:com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData) : (r4v0 com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData))
 A[MD:(com.amplifyframework.statemachine.codegen.data.SignedInData, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData, com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData):void (m)] (LINE:52) call: com.amplifyframework.statemachine.codegen.events.SignOutEvent.EventType.SignOutGloballyError.<init>(com.amplifyframework.statemachine.codegen.data.SignedInData, com.amplifyframework.statemachine.codegen.data.HostedUIErrorData, com.amplifyframework.statemachine.codegen.data.GlobalSignOutErrorData):void type: THIS */
            public /* synthetic */ SignOutGloballyError(SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(signedInData, (i & 2) != 0 ? null : hostedUIErrorData, (i & 4) != 0 ? null : globalSignOutErrorData);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignOutGloballyError(@NotNull SignedInData signedInData, HostedUIErrorData hostedUIErrorData, GlobalSignOutErrorData globalSignOutErrorData) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                this.signedInData = signedInData;
                this.hostedUIErrorData = hostedUIErrorData;
                this.globalSignOutErrorData = globalSignOutErrorData;
            }
        }

        public static final class SignedOutSuccess extends EventType {
            private final SignedOutData signedOutData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ SignedOutSuccess copy$default(SignedOutSuccess signedOutSuccess, SignedOutData signedOutData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedOutData = signedOutSuccess.signedOutData;
                }
                return signedOutSuccess.copy(signedOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedOutData component1() {
                return this.signedOutData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedOutSuccess copy(@NotNull SignedOutData signedOutData) {
                Intrinsics.checkNotNullParameter(signedOutData, "");
                return new SignedOutSuccess(signedOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SignedOutSuccess) && Intrinsics.EZpvd(this.signedOutData, ((SignedOutSuccess) obj).signedOutData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedOutData getSignedOutData() {
                return this.signedOutData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.signedOutData.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "SignedOutSuccess(signedOutData=" + this.signedOutData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignedOutSuccess(@NotNull SignedOutData signedOutData) {
                super(null);
                Intrinsics.checkNotNullParameter(signedOutData, "");
                this.signedOutData = signedOutData;
            }
        }

        public static final class UserCancelled extends EventType {
            private final SignedInData signedInData;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ UserCancelled copy$default(UserCancelled userCancelled, SignedInData signedInData, int i, Object obj) {
                if ((i & 1) != 0) {
                    signedInData = userCancelled.signedInData;
                }
                return userCancelled.copy(signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final SignedInData component1() {
                return this.signedInData;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final UserCancelled copy(@NotNull SignedInData signedInData) {
                Intrinsics.checkNotNullParameter(signedInData, "");
                return new UserCancelled(signedInData);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UserCancelled) && Intrinsics.EZpvd(this.signedInData, ((UserCancelled) obj).signedInData);
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
                return "UserCancelled(signedInData=" + this.signedInData + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UserCancelled(@NotNull SignedInData signedInData) {
                super(null);
                Intrinsics.checkNotNullParameter(signedInData, "");
                this.signedInData = signedInData;
            }
        }
    }
}

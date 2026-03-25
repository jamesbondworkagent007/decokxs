package com.reown.android.internal.common.model;

import com.reown.android.internal.common.model.type.EngineEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class ConnectionState implements EngineEvent {
    public final boolean isAvailable;
    public final Reason reason;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ConnectionState copy$default(ConnectionState connectionState, boolean z, Reason reason, int i, Object obj) {
        if ((i & 1) != 0) {
            z = connectionState.isAvailable;
        }
        if ((i & 2) != 0) {
            reason = connectionState.reason;
        }
        return connectionState.copy(z, reason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Reason component2() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ConnectionState copy(boolean z, Reason reason) {
        return new ConnectionState(z, reason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionState)) {
            return false;
        }
        ConnectionState connectionState = (ConnectionState) obj;
        return this.isAvailable == connectionState.isAvailable && Intrinsics.EZpvd(this.reason, connectionState.reason);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Reason getReason() {
        return this.reason;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isAvailable);
        Reason reason = this.reason;
        return (iHashCode * 31) + (reason == null ? 0 : reason.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isAvailable() {
        return this.isAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ConnectionState(isAvailable=" + this.isAvailable + ", reason=" + this.reason + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static abstract class Reason {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.internal.common.model.ConnectionState.Reason.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Reason(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ConnectionClosed extends Reason {
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ConnectionClosed copy$default(ConnectionClosed connectionClosed, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = connectionClosed.message;
                }
                return connectionClosed.copy(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String component1() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConnectionClosed copy(@NotNull String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new ConnectionClosed(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConnectionClosed) && Intrinsics.EZpvd((Object) this.message, (Object) ((ConnectionClosed) obj).message);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final String getMessage() {
                return this.message;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.message.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConnectionClosed(message=" + this.message + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConnectionClosed(@NotNull String str) {
                super(null);
                Intrinsics.checkNotNullParameter(str, "");
                this.message = str;
            }
        }

        public Reason() {
        }

        public static final class ConnectionFailed extends Reason {
            public final Throwable throwable;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ConnectionFailed copy$default(ConnectionFailed connectionFailed, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = connectionFailed.throwable;
                }
                return connectionFailed.copy(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable component1() {
                return this.throwable;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ConnectionFailed copy(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new ConnectionFailed(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ConnectionFailed) && Intrinsics.EZpvd(this.throwable, ((ConnectionFailed) obj).throwable);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.throwable.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConnectionFailed(throwable=" + this.throwable + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ConnectionFailed(@NotNull Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.throwable = th;
            }
        }
    }

    public ConnectionState(boolean z, Reason reason) {
        this.isAvailable = z;
        this.reason = reason;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 boolean)
  (wrap:com.reown.android.internal.common.model.ConnectionState$Reason:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.reown.android.internal.common.model.ConnectionState$Reason) : (r2v0 com.reown.android.internal.common.model.ConnectionState$Reason))
 A[MD:(boolean, com.reown.android.internal.common.model.ConnectionState$Reason):void (m)] (LINE:5) call: com.reown.android.internal.common.model.ConnectionState.<init>(boolean, com.reown.android.internal.common.model.ConnectionState$Reason):void type: THIS */
    public /* synthetic */ ConnectionState(boolean z, Reason reason, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : reason);
    }
}

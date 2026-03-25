package com.reown.android.relay;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class WSSConnectionState {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.relay.WSSConnectionState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ WSSConnectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Connected extends WSSConnectionState {
        public static final Connected INSTANCE = new Connected();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            return this == obj || (obj instanceof Connected);
        }

        public int hashCode() {
            return 873344283;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Connected";
        }

        public Connected() {
            super(null);
        }
    }

    public WSSConnectionState() {
    }

    public static abstract class Disconnected extends WSSConnectionState {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.relay.WSSConnectionState.Disconnected.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Disconnected(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final class ConnectionFailed extends Disconnected {
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

        public Disconnected() {
            super(null);
        }

        public static final class ConnectionClosed extends Disconnected {
            public final String message;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public ConnectionClosed() {
                this(null, 1, 0 == true ? 1 : 0);
            }

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
            public final ConnectionClosed copy(String str) {
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
                String str = this.message;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public String toString() {
                return "ConnectionClosed(message=" + this.message + ")";
            }

            public ConnectionClosed(String str) {
                super(null);
                this.message = str;
            }

            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:10) call: com.reown.android.relay.WSSConnectionState.Disconnected.ConnectionClosed.<init>(java.lang.String):void type: THIS */
            public /* synthetic */ ConnectionClosed(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str);
            }
        }
    }
}

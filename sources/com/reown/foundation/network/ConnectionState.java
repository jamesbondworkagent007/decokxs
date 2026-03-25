package com.reown.foundation.network;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class ConnectionState {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.foundation.network.ConnectionState.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ ConnectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class Open extends ConnectionState {
        public static final Open INSTANCE = new Open();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Open)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -670265800;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Open";
        }

        private Open() {
            super(null);
        }
    }

    private ConnectionState() {
    }

    public static final class Closed extends ConnectionState {
        private final Throwable throwable;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Closed copy$default(Closed closed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = closed.throwable;
            }
            return closed.copy(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Throwable component1() {
            return this.throwable;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Closed copy(@NotNull Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Closed(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Closed) && Intrinsics.EZpvd(this.throwable, ((Closed) obj).throwable);
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
            return "Closed(throwable=" + this.throwable + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Closed(@NotNull Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.throwable = th;
        }
    }

    public static final class Idle extends ConnectionState {
        public static final Idle INSTANCE = new Idle();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Idle)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return -670455870;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "Idle";
        }

        private Idle() {
            super(null);
        }
    }
}

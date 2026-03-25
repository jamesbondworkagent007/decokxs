package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EVM5792Capability {
    public static final int $stable = 0;
    private final EVM5792Atomic atomic;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EVM5792Capability copy$default(EVM5792Capability eVM5792Capability, EVM5792Atomic eVM5792Atomic, int i, Object obj) {
        if ((i & 1) != 0) {
            eVM5792Atomic = eVM5792Capability.atomic;
        }
        return eVM5792Capability.copy(eVM5792Atomic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792Atomic component1() {
        return this.atomic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792Capability copy(@NotNull EVM5792Atomic eVM5792Atomic) {
        Intrinsics.checkNotNullParameter(eVM5792Atomic, "");
        return new EVM5792Capability(eVM5792Atomic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EVM5792Capability) && Intrinsics.EZpvd(this.atomic, ((EVM5792Capability) obj).atomic);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EVM5792Atomic getAtomic() {
        return this.atomic;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.atomic.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EVM5792Capability(atomic=" + this.atomic + ")";
    }

    public EVM5792Capability(@NotNull EVM5792Atomic eVM5792Atomic) {
        Intrinsics.checkNotNullParameter(eVM5792Atomic, "");
        this.atomic = eVM5792Atomic;
    }

    public static final class EVM5792Atomic {
        public static final int $stable = 0;
        public static final StateListAnimator Companion = new StateListAnimator(null);
        public static final String STATUS_READY = "ready";
        public static final String STATUS_SUPPORTED = "supported";
        private final String status;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ EVM5792Atomic copy$default(EVM5792Atomic eVM5792Atomic, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eVM5792Atomic.status;
            }
            return eVM5792Atomic.copy(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EVM5792Atomic copy(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new EVM5792Atomic(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EVM5792Atomic) && Intrinsics.EZpvd((Object) this.status, (Object) ((EVM5792Atomic) obj).status);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getStatus() {
            return this.status;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.status.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "EVM5792Atomic(status=" + this.status + ")";
        }

        public EVM5792Atomic(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.status = str;
        }

        /* JADX INFO: loaded from: classes23.dex */
        public static final class StateListAnimator {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EVM5792Capability.EVM5792Atomic.StateListAnimator.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private StateListAnimator() {
            }
        }
    }
}

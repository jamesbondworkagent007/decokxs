package com.reown.android.pairing.engine.model;

import com.reown.android.internal.common.model.Pairing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public abstract class EngineDO {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.reown.android.pairing.engine.model.EngineDO.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ EngineDO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public EngineDO() {
    }

    public static final class PairingDelete extends EngineDO {
        public final String reason;
        public final String topic;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PairingDelete copy$default(PairingDelete pairingDelete, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pairingDelete.topic;
            }
            if ((i & 2) != 0) {
                str2 = pairingDelete.reason;
            }
            return pairingDelete.copy(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component2() {
            return this.reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PairingDelete copy(@NotNull String str, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new PairingDelete(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PairingDelete)) {
                return false;
            }
            PairingDelete pairingDelete = (PairingDelete) obj;
            return Intrinsics.EZpvd((Object) this.topic, (Object) pairingDelete.topic) && Intrinsics.EZpvd((Object) this.reason, (Object) pairingDelete.reason);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getReason() {
            return this.reason;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getTopic() {
            return this.topic;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.topic.hashCode() * 31) + this.reason.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PairingDelete(topic=" + this.topic + ", reason=" + this.reason + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairingDelete(@NotNull String str, @NotNull String str2) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.topic = str;
            this.reason = str2;
        }
    }

    public static final class PairingExpire extends EngineDO {
        public final Pairing pairing;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PairingExpire copy$default(PairingExpire pairingExpire, Pairing pairing, int i, Object obj) {
            if ((i & 1) != 0) {
                pairing = pairingExpire.pairing;
            }
            return pairingExpire.copy(pairing);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pairing component1() {
            return this.pairing;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PairingExpire copy(@NotNull Pairing pairing) {
            Intrinsics.checkNotNullParameter(pairing, "");
            return new PairingExpire(pairing);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PairingExpire) && Intrinsics.EZpvd(this.pairing, ((PairingExpire) obj).pairing);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Pairing getPairing() {
            return this.pairing;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.pairing.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PairingExpire(pairing=" + this.pairing + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairingExpire(@NotNull Pairing pairing) {
            super(null);
            Intrinsics.checkNotNullParameter(pairing, "");
            this.pairing = pairing;
        }
    }

    public static final class PairingState extends EngineDO {
        public final boolean isPairingState;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ PairingState copy$default(PairingState pairingState, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = pairingState.isPairingState;
            }
            return pairingState.copy(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean component1() {
            return this.isPairingState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final PairingState copy(boolean z) {
            return new PairingState(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PairingState) && this.isPairingState == ((PairingState) obj).isPairingState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return Boolean.hashCode(this.isPairingState);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean isPairingState() {
            return this.isPairingState;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "PairingState(isPairingState=" + this.isPairingState + ")";
        }

        public PairingState(boolean z) {
            super(null);
            this.isPairingState = z;
        }
    }
}

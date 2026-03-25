package com.okinc.wallet.core.sign.aptos;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AptosRawTransaction {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String rawTxn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AptosRawTransaction copy$default(AptosRawTransaction aptosRawTransaction, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aptosRawTransaction.rawTxn;
        }
        return aptosRawTransaction.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.rawTxn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AptosRawTransaction copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AptosRawTransaction(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AptosRawTransaction) && Intrinsics.EZpvd((Object) this.rawTxn, (Object) ((AptosRawTransaction) obj).rawTxn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawTxn() {
        return this.rawTxn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.rawTxn.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AptosRawTransaction(rawTxn=" + this.rawTxn + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.aptos.AptosRawTransaction.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AptosRawTransaction> serializer() {
            return AptosRawTransaction$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AptosRawTransaction(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AptosRawTransaction$$serializer.INSTANCE.getDescriptor());
        }
        this.rawTxn = str;
    }

    public AptosRawTransaction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rawTxn = str;
    }
}

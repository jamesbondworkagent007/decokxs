package com.okinc.business.defi.biz.core.transaction.sign.solana.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SolanaWCSignResult {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String signature;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SolanaWCSignResult copy$default(SolanaWCSignResult solanaWCSignResult, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = solanaWCSignResult.signature;
        }
        return solanaWCSignResult.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SolanaWCSignResult copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SolanaWCSignResult(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SolanaWCSignResult) && Intrinsics.EZpvd((Object) this.signature, (Object) ((SolanaWCSignResult) obj).signature);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignature() {
        return this.signature;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.signature.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SolanaWCSignResult(signature=" + this.signature + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaWCSignResult.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SolanaWCSignResult> serializer() {
            return SolanaWCSignResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SolanaWCSignResult(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, SolanaWCSignResult$$serializer.INSTANCE.getDescriptor());
        }
        this.signature = str;
    }

    public SolanaWCSignResult(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signature = str;
    }
}

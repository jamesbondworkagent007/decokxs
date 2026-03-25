package com.okinc.wallet.core.aa;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class AAGenOriPaymasterTokenV7 {
    private String paymasterData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AAGenOriPaymasterTokenV7 copy$default(AAGenOriPaymasterTokenV7 aAGenOriPaymasterTokenV7, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aAGenOriPaymasterTokenV7.paymasterData;
        }
        return aAGenOriPaymasterTokenV7.copy(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AAGenOriPaymasterTokenV7 copy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new AAGenOriPaymasterTokenV7(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AAGenOriPaymasterTokenV7) && Intrinsics.EZpvd((Object) this.paymasterData, (Object) ((AAGenOriPaymasterTokenV7) obj).paymasterData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterData() {
        return this.paymasterData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.paymasterData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPaymasterData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymasterData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AAGenOriPaymasterTokenV7(paymasterData=" + this.paymasterData + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.aa.AAGenOriPaymasterTokenV7.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AAGenOriPaymasterTokenV7> serializer() {
            return AAGenOriPaymasterTokenV7$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AAGenOriPaymasterTokenV7(int i, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, AAGenOriPaymasterTokenV7$$serializer.INSTANCE.getDescriptor());
        }
        this.paymasterData = str;
    }

    public AAGenOriPaymasterTokenV7(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.paymasterData = str;
    }
}

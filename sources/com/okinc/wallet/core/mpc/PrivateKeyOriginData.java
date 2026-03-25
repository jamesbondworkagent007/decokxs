package com.okinc.wallet.core.mpc;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class PrivateKeyOriginData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final long coinType;
    private final String privateKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PrivateKeyOriginData copy$default(PrivateKeyOriginData privateKeyOriginData, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = privateKeyOriginData.coinType;
        }
        if ((i & 2) != 0) {
            str = privateKeyOriginData.privateKey;
        }
        return privateKeyOriginData.copy(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PrivateKeyOriginData copy(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new PrivateKeyOriginData(j, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivateKeyOriginData)) {
            return false;
        }
        PrivateKeyOriginData privateKeyOriginData = (PrivateKeyOriginData) obj;
        return this.coinType == privateKeyOriginData.coinType && Intrinsics.EZpvd((Object) this.privateKey, (Object) privateKeyOriginData.privateKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinType() {
        return this.coinType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Long.hashCode(this.coinType) * 31) + this.privateKey.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PrivateKeyOriginData(coinType=" + this.coinType + ", privateKey=" + this.privateKey + ")";
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.mpc.PrivateKeyOriginData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PrivateKeyOriginData> serializer() {
            return PrivateKeyOriginData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PrivateKeyOriginData(int i, long j, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, PrivateKeyOriginData$$serializer.INSTANCE.getDescriptor());
        }
        this.coinType = j;
        this.privateKey = str;
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(PrivateKeyOriginData privateKeyOriginData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeLongElement(serialDescriptor, 0, privateKeyOriginData.coinType);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, privateKeyOriginData.privateKey);
    }

    public PrivateKeyOriginData(long j, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinType = j;
        this.privateKey = str;
    }
}

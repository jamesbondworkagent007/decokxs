package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class CeDefiSolGas {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String tradeBaseFee;
    private final String tradePriorityFee;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CeDefiSolGas copy$default(CeDefiSolGas ceDefiSolGas, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ceDefiSolGas.tradeBaseFee;
        }
        if ((i & 2) != 0) {
            str2 = ceDefiSolGas.tradePriorityFee;
        }
        return ceDefiSolGas.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tradeBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tradePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CeDefiSolGas copy(String str, String str2) {
        return new CeDefiSolGas(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CeDefiSolGas)) {
            return false;
        }
        CeDefiSolGas ceDefiSolGas = (CeDefiSolGas) obj;
        return Intrinsics.EZpvd((Object) this.tradeBaseFee, (Object) ceDefiSolGas.tradeBaseFee) && Intrinsics.EZpvd((Object) this.tradePriorityFee, (Object) ceDefiSolGas.tradePriorityFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradeBaseFee() {
        return this.tradeBaseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTradePriorityFee() {
        return this.tradePriorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tradeBaseFee;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tradePriorityFee;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CeDefiSolGas(tradeBaseFee=" + this.tradeBaseFee + ", tradePriorityFee=" + this.tradePriorityFee + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.CeDefiSolGas.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CeDefiSolGas> serializer() {
            return CeDefiSolGas$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CeDefiSolGas(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CeDefiSolGas$$serializer.INSTANCE.getDescriptor());
        }
        this.tradeBaseFee = str;
        this.tradePriorityFee = str2;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(CeDefiSolGas ceDefiSolGas, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, stringSerializer, ceDefiSolGas.tradeBaseFee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, stringSerializer, ceDefiSolGas.tradePriorityFee);
    }

    public CeDefiSolGas(String str, String str2) {
        this.tradeBaseFee = str;
        this.tradePriorityFee = str2;
    }
}

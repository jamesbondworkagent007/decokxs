package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GasToken {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String feeTokenCoinTypeNo;
    private final Integer paymasterName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GasToken copy$default(GasToken gasToken, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = gasToken.paymasterName;
        }
        if ((i & 2) != 0) {
            str = gasToken.feeTokenCoinTypeNo;
        }
        return gasToken.copy(num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.paymasterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasToken copy(Integer num, String str) {
        return new GasToken(num, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GasToken)) {
            return false;
        }
        GasToken gasToken = (GasToken) obj;
        return Intrinsics.EZpvd(this.paymasterName, gasToken.paymasterName) && Intrinsics.EZpvd((Object) this.feeTokenCoinTypeNo, (Object) gasToken.feeTokenCoinTypeNo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTokenCoinTypeNo() {
        return this.feeTokenCoinTypeNo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPaymasterName() {
        return this.paymasterName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.paymasterName;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.feeTokenCoinTypeNo;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GasToken(paymasterName=" + this.paymasterName + ", feeTokenCoinTypeNo=" + this.feeTokenCoinTypeNo + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.GasToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GasToken> serializer() {
            return GasToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GasToken(int i, Integer num, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, GasToken$$serializer.INSTANCE.getDescriptor());
        }
        this.paymasterName = num;
        this.feeTokenCoinTypeNo = str;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GasToken gasToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, gasToken.paymasterName);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, gasToken.feeTokenCoinTypeNo);
    }

    public GasToken(Integer num, String str) {
        this.paymasterName = num;
        this.feeTokenCoinTypeNo = str;
    }
}

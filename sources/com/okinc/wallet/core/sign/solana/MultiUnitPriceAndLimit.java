package com.okinc.wallet.core.sign.solana;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class MultiUnitPriceAndLimit {
    private Integer computeUnitLimit;
    private Integer computeUnitPrice;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MultiUnitPriceAndLimit() {
        this((Integer) null, (Integer) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MultiUnitPriceAndLimit copy$default(MultiUnitPriceAndLimit multiUnitPriceAndLimit, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = multiUnitPriceAndLimit.computeUnitLimit;
        }
        if ((i & 2) != 0) {
            num2 = multiUnitPriceAndLimit.computeUnitPrice;
        }
        return multiUnitPriceAndLimit.copy(num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.computeUnitLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component2() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MultiUnitPriceAndLimit copy(Integer num, Integer num2) {
        return new MultiUnitPriceAndLimit(num, num2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiUnitPriceAndLimit)) {
            return false;
        }
        MultiUnitPriceAndLimit multiUnitPriceAndLimit = (MultiUnitPriceAndLimit) obj;
        return Intrinsics.EZpvd(this.computeUnitLimit, multiUnitPriceAndLimit.computeUnitLimit) && Intrinsics.EZpvd(this.computeUnitPrice, multiUnitPriceAndLimit.computeUnitPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getComputeUnitLimit() {
        return this.computeUnitLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getComputeUnitPrice() {
        return this.computeUnitPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.computeUnitLimit;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.computeUnitPrice;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setComputeUnitLimit(Integer num) {
        this.computeUnitLimit = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setComputeUnitPrice(Integer num) {
        this.computeUnitPrice = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MultiUnitPriceAndLimit(computeUnitLimit=" + this.computeUnitLimit + ", computeUnitPrice=" + this.computeUnitPrice + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.wallet.core.sign.solana.MultiUnitPriceAndLimit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MultiUnitPriceAndLimit> serializer() {
            return MultiUnitPriceAndLimit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MultiUnitPriceAndLimit(int i, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
        this.computeUnitLimit = (i & 1) == 0 ? 0 : num;
        if ((i & 2) == 0) {
            this.computeUnitPrice = 0;
        } else {
            this.computeUnitPrice = num2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWalletCore_wallet_lib(MultiUnitPriceAndLimit multiUnitPriceAndLimit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        Integer num2;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num2 = multiUnitPriceAndLimit.computeUnitLimit) == null || num2.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, multiUnitPriceAndLimit.computeUnitLimit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || (num = multiUnitPriceAndLimit.computeUnitPrice) == null || num.intValue() != 0) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, IntSerializer.INSTANCE, multiUnitPriceAndLimit.computeUnitPrice);
        }
    }

    public MultiUnitPriceAndLimit(Integer num, Integer num2) {
        this.computeUnitLimit = num;
        this.computeUnitPrice = num2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0005: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r2v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r3v0 java.lang.Integer))
 A[MD:(java.lang.Integer, java.lang.Integer):void (m)] (LINE:70) call: com.okinc.wallet.core.sign.solana.MultiUnitPriceAndLimit.<init>(java.lang.Integer, java.lang.Integer):void type: THIS */
    public /* synthetic */ MultiUnitPriceAndLimit(Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
    }
}

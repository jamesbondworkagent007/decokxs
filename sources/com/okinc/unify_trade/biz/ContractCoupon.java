package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class ContractCoupon {
    private float amount;
    private int couponId;
    private long expiryTime;
    private Boolean firstView;
    private final long remainingTime;
    private String unit;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final float getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCouponId() {
        return this.couponId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getExpiryTime() {
        return this.expiryTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getFirstView() {
        return this.firstView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getRemainingTime() {
        return this.remainingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(float f) {
        this.amount = f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCouponId(int i) {
        this.couponId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExpiryTime(long j) {
        this.expiryTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFirstView(Boolean bool) {
        this.firstView = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnit(String str) {
        this.unit = str;
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.ContractCoupon.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractCoupon> serializer() {
            return ContractCoupon$$serializer.INSTANCE;
        }
    }

    public ContractCoupon() {
        this.unit = "";
        this.firstView = Boolean.FALSE;
    }

    public /* synthetic */ ContractCoupon(int i, int i2, float f, String str, long j, long j2, Boolean bool, SerializationConstructorMarker serializationConstructorMarker) {
        this.couponId = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.amount = 0.0f;
        } else {
            this.amount = f;
        }
        if ((i & 4) == 0) {
            this.unit = "";
        } else {
            this.unit = str;
        }
        if ((i & 8) == 0) {
            this.expiryTime = 0L;
        } else {
            this.expiryTime = j;
        }
        if ((i & 16) == 0) {
            this.remainingTime = 0L;
        } else {
            this.remainingTime = j2;
        }
        if ((i & 32) == 0) {
            this.firstView = Boolean.FALSE;
        } else {
            this.firstView = bool;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(ContractCoupon contractCoupon, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || contractCoupon.couponId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, contractCoupon.couponId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || Float.compare(contractCoupon.amount, 0.0f) != 0) {
            compositeEncoder.encodeFloatElement(serialDescriptor, 1, contractCoupon.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contractCoupon.unit, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, contractCoupon.unit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || contractCoupon.expiryTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, contractCoupon.expiryTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || contractCoupon.remainingTime != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 4, contractCoupon.remainingTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd(contractCoupon.firstView, Boolean.FALSE)) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, contractCoupon.firstView);
    }
}

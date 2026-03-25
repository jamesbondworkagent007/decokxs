package com.okinc.okimcore.model.im.group.paidgroup;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class PaidGroupMemberStatus implements Parcelable {
    public static final int $stable = 0;
    private final BillingCyclePaymentStatus billingCyclePaymentStatus;
    private final Long lastPaymentDatetime;
    private final Long nextPaymentDatetime;
    private final PaidGroupBillingStatus paidGroupBillingStatus;
    private final PaymentRequiredStatus paymentRequiredStatus;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PaidGroupMemberStatus> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {PaymentRequiredStatus.Companion.serializer(), null, null, PaidGroupBillingStatus.Companion.serializer(), BillingCyclePaymentStatus.Companion.serializer()};

    public static final class Creator implements Parcelable.Creator<PaidGroupMemberStatus> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaidGroupMemberStatus createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PaidGroupMemberStatus(parcel.readInt() == 0 ? null : PaymentRequiredStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : PaidGroupBillingStatus.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? BillingCyclePaymentStatus.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaidGroupMemberStatus[] newArray(int i) {
            return new PaidGroupMemberStatus[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PaidGroupMemberStatus() {
        this((PaymentRequiredStatus) null, (Long) null, (Long) null, (PaidGroupBillingStatus) null, (BillingCyclePaymentStatus) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PaidGroupMemberStatus copy$default(PaidGroupMemberStatus paidGroupMemberStatus, PaymentRequiredStatus paymentRequiredStatus, Long l, Long l2, PaidGroupBillingStatus paidGroupBillingStatus, BillingCyclePaymentStatus billingCyclePaymentStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            paymentRequiredStatus = paidGroupMemberStatus.paymentRequiredStatus;
        }
        if ((i & 2) != 0) {
            l = paidGroupMemberStatus.lastPaymentDatetime;
        }
        Long l3 = l;
        if ((i & 4) != 0) {
            l2 = paidGroupMemberStatus.nextPaymentDatetime;
        }
        Long l4 = l2;
        if ((i & 8) != 0) {
            paidGroupBillingStatus = paidGroupMemberStatus.paidGroupBillingStatus;
        }
        PaidGroupBillingStatus paidGroupBillingStatus2 = paidGroupBillingStatus;
        if ((i & 16) != 0) {
            billingCyclePaymentStatus = paidGroupMemberStatus.billingCyclePaymentStatus;
        }
        return paidGroupMemberStatus.copy(paymentRequiredStatus, l3, l4, paidGroupBillingStatus2, billingCyclePaymentStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentRequiredStatus component1() {
        return this.paymentRequiredStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.lastPaymentDatetime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.nextPaymentDatetime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupBillingStatus component4() {
        return this.paidGroupBillingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingCyclePaymentStatus component5() {
        return this.billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupMemberStatus copy(PaymentRequiredStatus paymentRequiredStatus, Long l, Long l2, PaidGroupBillingStatus paidGroupBillingStatus, BillingCyclePaymentStatus billingCyclePaymentStatus) {
        return new PaidGroupMemberStatus(paymentRequiredStatus, l, l2, paidGroupBillingStatus, billingCyclePaymentStatus);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaidGroupMemberStatus)) {
            return false;
        }
        PaidGroupMemberStatus paidGroupMemberStatus = (PaidGroupMemberStatus) obj;
        return this.paymentRequiredStatus == paidGroupMemberStatus.paymentRequiredStatus && Intrinsics.EZpvd(this.lastPaymentDatetime, paidGroupMemberStatus.lastPaymentDatetime) && Intrinsics.EZpvd(this.nextPaymentDatetime, paidGroupMemberStatus.nextPaymentDatetime) && this.paidGroupBillingStatus == paidGroupMemberStatus.paidGroupBillingStatus && this.billingCyclePaymentStatus == paidGroupMemberStatus.billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BillingCyclePaymentStatus getBillingCyclePaymentStatus() {
        return this.billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLastPaymentDatetime() {
        return this.lastPaymentDatetime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getNextPaymentDatetime() {
        return this.nextPaymentDatetime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaidGroupBillingStatus getPaidGroupBillingStatus() {
        return this.paidGroupBillingStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PaymentRequiredStatus getPaymentRequiredStatus() {
        return this.paymentRequiredStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        PaymentRequiredStatus paymentRequiredStatus = this.paymentRequiredStatus;
        int iHashCode = paymentRequiredStatus == null ? 0 : paymentRequiredStatus.hashCode();
        Long l = this.lastPaymentDatetime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.nextPaymentDatetime;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        PaidGroupBillingStatus paidGroupBillingStatus = this.paidGroupBillingStatus;
        int iHashCode4 = paidGroupBillingStatus == null ? 0 : paidGroupBillingStatus.hashCode();
        BillingCyclePaymentStatus billingCyclePaymentStatus = this.billingCyclePaymentStatus;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (billingCyclePaymentStatus != null ? billingCyclePaymentStatus.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PaidGroupMemberStatus(paymentRequiredStatus=" + this.paymentRequiredStatus + ", lastPaymentDatetime=" + this.lastPaymentDatetime + ", nextPaymentDatetime=" + this.nextPaymentDatetime + ", paidGroupBillingStatus=" + this.paidGroupBillingStatus + ", billingCyclePaymentStatus=" + this.billingCyclePaymentStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        PaymentRequiredStatus paymentRequiredStatus = this.paymentRequiredStatus;
        if (paymentRequiredStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paymentRequiredStatus.writeToParcel(parcel, i);
        }
        Long l = this.lastPaymentDatetime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.nextPaymentDatetime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        PaidGroupBillingStatus paidGroupBillingStatus = this.paidGroupBillingStatus;
        if (paidGroupBillingStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            paidGroupBillingStatus.writeToParcel(parcel, i);
        }
        BillingCyclePaymentStatus billingCyclePaymentStatus = this.billingCyclePaymentStatus;
        if (billingCyclePaymentStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            billingCyclePaymentStatus.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PaidGroupMemberStatus> serializer() {
            return PaidGroupMemberStatus$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PaidGroupMemberStatus(int i, PaymentRequiredStatus paymentRequiredStatus, Long l, Long l2, PaidGroupBillingStatus paidGroupBillingStatus, BillingCyclePaymentStatus billingCyclePaymentStatus, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.paymentRequiredStatus = null;
        } else {
            this.paymentRequiredStatus = paymentRequiredStatus;
        }
        if ((i & 2) == 0) {
            this.lastPaymentDatetime = null;
        } else {
            this.lastPaymentDatetime = l;
        }
        if ((i & 4) == 0) {
            this.nextPaymentDatetime = null;
        } else {
            this.nextPaymentDatetime = l2;
        }
        if ((i & 8) == 0) {
            this.paidGroupBillingStatus = null;
        } else {
            this.paidGroupBillingStatus = paidGroupBillingStatus;
        }
        if ((i & 16) == 0) {
            this.billingCyclePaymentStatus = null;
        } else {
            this.billingCyclePaymentStatus = billingCyclePaymentStatus;
        }
    }

    public static final /* synthetic */ void write$Self$OKIMCore_okimcore(PaidGroupMemberStatus paidGroupMemberStatus, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || paidGroupMemberStatus.paymentRequiredStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, kSerializerArr[0], paidGroupMemberStatus.paymentRequiredStatus);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || paidGroupMemberStatus.lastPaymentDatetime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, paidGroupMemberStatus.lastPaymentDatetime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || paidGroupMemberStatus.nextPaymentDatetime != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, paidGroupMemberStatus.nextPaymentDatetime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || paidGroupMemberStatus.paidGroupBillingStatus != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], paidGroupMemberStatus.paidGroupBillingStatus);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && paidGroupMemberStatus.billingCyclePaymentStatus == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, kSerializerArr[4], paidGroupMemberStatus.billingCyclePaymentStatus);
    }

    public PaidGroupMemberStatus(PaymentRequiredStatus paymentRequiredStatus, Long l, Long l2, PaidGroupBillingStatus paidGroupBillingStatus, BillingCyclePaymentStatus billingCyclePaymentStatus) {
        this.paymentRequiredStatus = paymentRequiredStatus;
        this.lastPaymentDatetime = l;
        this.nextPaymentDatetime = l2;
        this.paidGroupBillingStatus = paidGroupBillingStatus;
        this.billingCyclePaymentStatus = billingCyclePaymentStatus;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus) : (r5v0 com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0008: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r7v0 java.lang.Long))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus:?: TERNARY null = ((wrap:int:0x0016: ARITH (r10v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus) : (r8v0 com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus))
  (wrap:com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus:?: TERNARY null = ((wrap:int:0x001d: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus) : (r9v0 com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus))
 A[MD:(com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus, java.lang.Long, java.lang.Long, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus, com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus):void (m)] (LINE:11) call: com.okinc.okimcore.model.im.group.paidgroup.PaidGroupMemberStatus.<init>(com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus, java.lang.Long, java.lang.Long, com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus, com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus):void type: THIS */
    public /* synthetic */ PaidGroupMemberStatus(PaymentRequiredStatus paymentRequiredStatus, Long l, Long l2, PaidGroupBillingStatus paidGroupBillingStatus, BillingCyclePaymentStatus billingCyclePaymentStatus, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : paymentRequiredStatus, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : paidGroupBillingStatus, (i & 16) != 0 ? null : billingCyclePaymentStatus);
    }
}

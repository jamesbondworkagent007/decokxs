package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ApproveRiskResponse implements Parcelable {
    public static final int $stable = 0;
    private final Boolean approvalAddressRiskyFlag;
    private final Long approvalAddressRiskyTimeStamp;
    private final Boolean longTimeNoActiveFlag;
    private final Long longTimeNoActiveFlagTimeStamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ApproveRiskResponse> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ApproveRiskResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveRiskResponse createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ApproveRiskResponse(boolValueOf, lValueOf, boolValueOf2, parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveRiskResponse[] newArray(int i) {
            return new ApproveRiskResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ApproveRiskResponse() {
        this((Boolean) null, (Long) null, (Boolean) null, (Long) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ApproveRiskResponse copy$default(ApproveRiskResponse approveRiskResponse, Boolean bool, Long l, Boolean bool2, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = approveRiskResponse.approvalAddressRiskyFlag;
        }
        if ((i & 2) != 0) {
            l = approveRiskResponse.approvalAddressRiskyTimeStamp;
        }
        if ((i & 4) != 0) {
            bool2 = approveRiskResponse.longTimeNoActiveFlag;
        }
        if ((i & 8) != 0) {
            l2 = approveRiskResponse.longTimeNoActiveFlagTimeStamp;
        }
        return approveRiskResponse.copy(bool, l, bool2, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component1() {
        return this.approvalAddressRiskyFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.approvalAddressRiskyTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component3() {
        return this.longTimeNoActiveFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component4() {
        return this.longTimeNoActiveFlagTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveRiskResponse copy(Boolean bool, Long l, Boolean bool2, Long l2) {
        return new ApproveRiskResponse(bool, l, bool2, l2);
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
        if (!(obj instanceof ApproveRiskResponse)) {
            return false;
        }
        ApproveRiskResponse approveRiskResponse = (ApproveRiskResponse) obj;
        return Intrinsics.EZpvd(this.approvalAddressRiskyFlag, approveRiskResponse.approvalAddressRiskyFlag) && Intrinsics.EZpvd(this.approvalAddressRiskyTimeStamp, approveRiskResponse.approvalAddressRiskyTimeStamp) && Intrinsics.EZpvd(this.longTimeNoActiveFlag, approveRiskResponse.longTimeNoActiveFlag) && Intrinsics.EZpvd(this.longTimeNoActiveFlagTimeStamp, approveRiskResponse.longTimeNoActiveFlagTimeStamp);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getApprovalAddressRiskyFlag() {
        return this.approvalAddressRiskyFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getApprovalAddressRiskyTimeStamp() {
        return this.approvalAddressRiskyTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getLongTimeNoActiveFlag() {
        return this.longTimeNoActiveFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getLongTimeNoActiveFlagTimeStamp() {
        return this.longTimeNoActiveFlagTimeStamp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Boolean bool = this.approvalAddressRiskyFlag;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Long l = this.approvalAddressRiskyTimeStamp;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Boolean bool2 = this.longTimeNoActiveFlag;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Long l2 = this.longTimeNoActiveFlagTimeStamp;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveRiskResponse(approvalAddressRiskyFlag=" + this.approvalAddressRiskyFlag + ", approvalAddressRiskyTimeStamp=" + this.approvalAddressRiskyTimeStamp + ", longTimeNoActiveFlag=" + this.longTimeNoActiveFlag + ", longTimeNoActiveFlagTimeStamp=" + this.longTimeNoActiveFlagTimeStamp + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Boolean bool = this.approvalAddressRiskyFlag;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Long l = this.approvalAddressRiskyTimeStamp;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Boolean bool2 = this.longTimeNoActiveFlag;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        Long l2 = this.longTimeNoActiveFlagTimeStamp;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ApproveRiskResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApproveRiskResponse> serializer() {
            return ApproveRiskResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ApproveRiskResponse(int i, Boolean bool, Long l, Boolean bool2, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.approvalAddressRiskyFlag = null;
        } else {
            this.approvalAddressRiskyFlag = bool;
        }
        if ((i & 2) == 0) {
            this.approvalAddressRiskyTimeStamp = null;
        } else {
            this.approvalAddressRiskyTimeStamp = l;
        }
        if ((i & 4) == 0) {
            this.longTimeNoActiveFlag = null;
        } else {
            this.longTimeNoActiveFlag = bool2;
        }
        if ((i & 8) == 0) {
            this.longTimeNoActiveFlagTimeStamp = null;
        } else {
            this.longTimeNoActiveFlagTimeStamp = l2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ApproveRiskResponse approveRiskResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || approveRiskResponse.approvalAddressRiskyFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, BooleanSerializer.INSTANCE, approveRiskResponse.approvalAddressRiskyFlag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || approveRiskResponse.approvalAddressRiskyTimeStamp != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, LongSerializer.INSTANCE, approveRiskResponse.approvalAddressRiskyTimeStamp);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || approveRiskResponse.longTimeNoActiveFlag != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, BooleanSerializer.INSTANCE, approveRiskResponse.longTimeNoActiveFlag);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && approveRiskResponse.longTimeNoActiveFlagTimeStamp == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, approveRiskResponse.longTimeNoActiveFlagTimeStamp);
    }

    public ApproveRiskResponse(Boolean bool, Long l, Boolean bool2, Long l2) {
        this.approvalAddressRiskyFlag = bool;
        this.approvalAddressRiskyTimeStamp = l;
        this.longTimeNoActiveFlag = bool2;
        this.longTimeNoActiveFlagTimeStamp = l2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r2v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r3v0 java.lang.Long))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r4v0 java.lang.Boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r5v0 java.lang.Long))
 A[MD:(java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Long):void (m)] (LINE:398) call: com.okinc.business.defi.biz.net.bean.ApproveRiskResponse.<init>(java.lang.Boolean, java.lang.Long, java.lang.Boolean, java.lang.Long):void type: THIS */
    public /* synthetic */ ApproveRiskResponse(Boolean bool, Long l, Boolean bool2, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : l2);
    }
}

package com.okinc.okpaymentapi.data.remote.model.management;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class EarnOptionRequestParam implements Parcelable {
    public static final int $stable = 0;
    private final Long productTypeId;
    private final Long savingTypeId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EarnOptionRequestParam> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarnOptionRequestParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnOptionRequestParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarnOptionRequestParam(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnOptionRequestParam[] newArray(int i) {
            return new EarnOptionRequestParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarnOptionRequestParam copy$default(EarnOptionRequestParam earnOptionRequestParam, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            l = earnOptionRequestParam.productTypeId;
        }
        if ((i & 2) != 0) {
            l2 = earnOptionRequestParam.savingTypeId;
        }
        return earnOptionRequestParam.copy(l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.productTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.savingTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnOptionRequestParam copy(Long l, Long l2) {
        return new EarnOptionRequestParam(l, l2);
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
        if (!(obj instanceof EarnOptionRequestParam)) {
            return false;
        }
        EarnOptionRequestParam earnOptionRequestParam = (EarnOptionRequestParam) obj;
        return Intrinsics.EZpvd(this.productTypeId, earnOptionRequestParam.productTypeId) && Intrinsics.EZpvd(this.savingTypeId, earnOptionRequestParam.savingTypeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getProductTypeId() {
        return this.productTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getSavingTypeId() {
        return this.savingTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.productTypeId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.savingTypeId;
        return (iHashCode * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnOptionRequestParam(productTypeId=" + this.productTypeId + ", savingTypeId=" + this.savingTypeId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.productTypeId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.savingTypeId;
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

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.EarnOptionRequestParam.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnOptionRequestParam> serializer() {
            return EarnOptionRequestParam$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnOptionRequestParam(int i, Long l, Long l2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EarnOptionRequestParam$$serializer.INSTANCE.getDescriptor());
        }
        this.productTypeId = l;
        this.savingTypeId = l2;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(EarnOptionRequestParam earnOptionRequestParam, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        LongSerializer longSerializer = LongSerializer.INSTANCE;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, longSerializer, earnOptionRequestParam.productTypeId);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, longSerializer, earnOptionRequestParam.savingTypeId);
    }

    public EarnOptionRequestParam(Long l, Long l2) {
        this.productTypeId = l;
        this.savingTypeId = l2;
    }
}

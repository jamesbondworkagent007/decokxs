package com.okinc.business.dexlogic.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class MergeCallData implements Parcelable {
    private final UnsignedSwapData unsingedCallData;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MergeCallData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MergeCallData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MergeCallData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new MergeCallData(parcel.readInt() == 0 ? null : UnsignedSwapData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MergeCallData[] newArray(int i) {
            return new MergeCallData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MergeCallData() {
        this((UnsignedSwapData) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ MergeCallData copy$default(MergeCallData mergeCallData, UnsignedSwapData unsignedSwapData, int i, Object obj) {
        if ((i & 1) != 0) {
            unsignedSwapData = mergeCallData.unsingedCallData;
        }
        return mergeCallData.copy(unsignedSwapData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedSwapData component1() {
        return this.unsingedCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MergeCallData copy(UnsignedSwapData unsignedSwapData) {
        return new MergeCallData(unsignedSwapData);
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
        return (obj instanceof MergeCallData) && Intrinsics.EZpvd(this.unsingedCallData, ((MergeCallData) obj).unsingedCallData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnsignedSwapData getUnsingedCallData() {
        return this.unsingedCallData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        UnsignedSwapData unsignedSwapData = this.unsingedCallData;
        if (unsignedSwapData == null) {
            return 0;
        }
        return unsignedSwapData.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MergeCallData(unsingedCallData=" + this.unsingedCallData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        UnsignedSwapData unsignedSwapData = this.unsingedCallData;
        if (unsignedSwapData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            unsignedSwapData.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.MergeCallData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MergeCallData> serializer() {
            return MergeCallData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MergeCallData(int i, UnsignedSwapData unsignedSwapData, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.unsingedCallData = null;
        } else {
            this.unsingedCallData = unsignedSwapData;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(MergeCallData mergeCallData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) && mergeCallData.unsingedCallData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, UnsignedSwapData$$serializer.INSTANCE, mergeCallData.unsingedCallData);
    }

    public MergeCallData(UnsignedSwapData unsignedSwapData) {
        this.unsingedCallData = unsignedSwapData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.dexlogic.bean.UnsignedSwapData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.UnsignedSwapData) : (r1v0 com.okinc.business.dexlogic.bean.UnsignedSwapData))
 A[MD:(com.okinc.business.dexlogic.bean.UnsignedSwapData):void (m)] (LINE:2460) call: com.okinc.business.dexlogic.bean.MergeCallData.<init>(com.okinc.business.dexlogic.bean.UnsignedSwapData):void type: THIS */
    public /* synthetic */ MergeCallData(UnsignedSwapData unsignedSwapData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : unsignedSwapData);
    }

    public final String getOrderId(boolean z) {
        UnsignedSwapData unsignedSwapData;
        if (z || (unsignedSwapData = this.unsingedCallData) == null) {
            return null;
        }
        return unsignedSwapData.getOrderId();
    }

    public final boolean isTransfer(boolean z) {
        UnsignedSwapData unsignedSwapData;
        if (z || (unsignedSwapData = this.unsingedCallData) == null) {
            return false;
        }
        return unsignedSwapData.isTransfer();
    }
}

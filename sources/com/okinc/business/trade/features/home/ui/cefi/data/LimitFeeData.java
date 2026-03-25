package com.okinc.business.trade.features.home.ui.cefi.data;

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

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class LimitFeeData implements Parcelable {
    public static final int $stable = 0;
    private final MevBasedFeeData mevFeeData;
    private final MevBasedFeeData nonMevFeeData;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LimitFeeData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LimitFeeData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitFeeData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LimitFeeData(parcel.readInt() == 0 ? null : MevBasedFeeData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MevBasedFeeData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LimitFeeData[] newArray(int i) {
            return new LimitFeeData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LimitFeeData() {
        this((MevBasedFeeData) null, (MevBasedFeeData) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LimitFeeData copy$default(LimitFeeData limitFeeData, MevBasedFeeData mevBasedFeeData, MevBasedFeeData mevBasedFeeData2, int i, Object obj) {
        if ((i & 1) != 0) {
            mevBasedFeeData = limitFeeData.mevFeeData;
        }
        if ((i & 2) != 0) {
            mevBasedFeeData2 = limitFeeData.nonMevFeeData;
        }
        return limitFeeData.copy(mevBasedFeeData, mevBasedFeeData2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevBasedFeeData component1() {
        return this.mevFeeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevBasedFeeData component2() {
        return this.nonMevFeeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LimitFeeData copy(MevBasedFeeData mevBasedFeeData, MevBasedFeeData mevBasedFeeData2) {
        return new LimitFeeData(mevBasedFeeData, mevBasedFeeData2);
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
        if (!(obj instanceof LimitFeeData)) {
            return false;
        }
        LimitFeeData limitFeeData = (LimitFeeData) obj;
        return Intrinsics.EZpvd(this.mevFeeData, limitFeeData.mevFeeData) && Intrinsics.EZpvd(this.nonMevFeeData, limitFeeData.nonMevFeeData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevBasedFeeData getMevFeeData() {
        return this.mevFeeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MevBasedFeeData getNonMevFeeData() {
        return this.nonMevFeeData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        MevBasedFeeData mevBasedFeeData = this.mevFeeData;
        int iHashCode = mevBasedFeeData == null ? 0 : mevBasedFeeData.hashCode();
        MevBasedFeeData mevBasedFeeData2 = this.nonMevFeeData;
        return (iHashCode * 31) + (mevBasedFeeData2 != null ? mevBasedFeeData2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LimitFeeData(mevFeeData=" + this.mevFeeData + ", nonMevFeeData=" + this.nonMevFeeData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        MevBasedFeeData mevBasedFeeData = this.mevFeeData;
        if (mevBasedFeeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mevBasedFeeData.writeToParcel(parcel, i);
        }
        MevBasedFeeData mevBasedFeeData2 = this.nonMevFeeData;
        if (mevBasedFeeData2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            mevBasedFeeData2.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LimitFeeData> serializer() {
            return LimitFeeData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LimitFeeData(int i, MevBasedFeeData mevBasedFeeData, MevBasedFeeData mevBasedFeeData2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.mevFeeData = null;
        } else {
            this.mevFeeData = mevBasedFeeData;
        }
        if ((i & 2) == 0) {
            this.nonMevFeeData = null;
        } else {
            this.nonMevFeeData = mevBasedFeeData2;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(LimitFeeData limitFeeData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || limitFeeData.mevFeeData != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, MevBasedFeeData$$serializer.INSTANCE, limitFeeData.mevFeeData);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && limitFeeData.nonMevFeeData == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, MevBasedFeeData$$serializer.INSTANCE, limitFeeData.nonMevFeeData);
    }

    public LimitFeeData(MevBasedFeeData mevBasedFeeData, MevBasedFeeData mevBasedFeeData2) {
        this.mevFeeData = mevBasedFeeData;
        this.nonMevFeeData = mevBasedFeeData2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData) : (r2v0 com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData))
  (wrap:com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData) : (r3v0 com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData))
 A[MD:(com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData, com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData):void (m)] (LINE:432) call: com.okinc.business.trade.features.home.ui.cefi.data.LimitFeeData.<init>(com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData, com.okinc.business.trade.features.home.ui.cefi.data.MevBasedFeeData):void type: THIS */
    public /* synthetic */ LimitFeeData(MevBasedFeeData mevBasedFeeData, MevBasedFeeData mevBasedFeeData2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : mevBasedFeeData, (i & 2) != 0 ? null : mevBasedFeeData2);
    }
}

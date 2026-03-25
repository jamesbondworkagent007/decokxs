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
public final class DexGasStationActivity implements Parcelable {
    public static final int $stable = 0;
    private final String discount;
    private final int isParticipateActivity;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexGasStationActivity> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexGasStationActivity> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexGasStationActivity createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexGasStationActivity(parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexGasStationActivity[] newArray(int i) {
            return new DexGasStationActivity[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexGasStationActivity() {
        this(0, (String) null, 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexGasStationActivity copy$default(DexGasStationActivity dexGasStationActivity, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dexGasStationActivity.isParticipateActivity;
        }
        if ((i2 & 2) != 0) {
            str = dexGasStationActivity.discount;
        }
        return dexGasStationActivity.copy(i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.isParticipateActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.discount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationActivity copy(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new DexGasStationActivity(i, str);
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
        if (!(obj instanceof DexGasStationActivity)) {
            return false;
        }
        DexGasStationActivity dexGasStationActivity = (DexGasStationActivity) obj;
        return this.isParticipateActivity == dexGasStationActivity.isParticipateActivity && Intrinsics.EZpvd((Object) this.discount, (Object) dexGasStationActivity.discount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDiscount() {
        return this.discount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.isParticipateActivity) * 31) + this.discount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isParticipateActivity() {
        return this.isParticipateActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexGasStationActivity(isParticipateActivity=" + this.isParticipateActivity + ", discount=" + this.discount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isParticipateActivity);
        parcel.writeString(this.discount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexGasStationActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexGasStationActivity> serializer() {
            return DexGasStationActivity$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexGasStationActivity(int i, int i2, String str, SerializationConstructorMarker serializationConstructorMarker) {
        this.isParticipateActivity = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.discount = "";
        } else {
            this.discount = str;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexGasStationActivity dexGasStationActivity, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexGasStationActivity.isParticipateActivity != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, dexGasStationActivity.isParticipateActivity);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) dexGasStationActivity.discount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dexGasStationActivity.discount);
    }

    public DexGasStationActivity(int i, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isParticipateActivity = i;
        this.discount = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r1v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
 A[MD:(int, java.lang.String):void (m)] (LINE:862) call: com.okinc.business.dexlogic.bean.DexGasStationActivity.<init>(int, java.lang.String):void type: THIS */
    public /* synthetic */ DexGasStationActivity(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str);
    }
}

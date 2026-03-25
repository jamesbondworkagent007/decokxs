package com.okinc.unify_trade.biz.subscribe;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class DexOrderDetailFeatures implements Parcelable {
    public static final int $stable = 0;
    private final String triggered;
    private final String waiveGasFee;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexOrderDetailFeatures> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexOrderDetailFeatures> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexOrderDetailFeatures createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexOrderDetailFeatures(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexOrderDetailFeatures[] newArray(int i) {
            return new DexOrderDetailFeatures[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexOrderDetailFeatures() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexOrderDetailFeatures copy$default(DexOrderDetailFeatures dexOrderDetailFeatures, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexOrderDetailFeatures.waiveGasFee;
        }
        if ((i & 2) != 0) {
            str2 = dexOrderDetailFeatures.triggered;
        }
        return dexOrderDetailFeatures.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.waiveGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.triggered;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexOrderDetailFeatures copy(String str, String str2) {
        return new DexOrderDetailFeatures(str, str2);
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
        if (!(obj instanceof DexOrderDetailFeatures)) {
            return false;
        }
        DexOrderDetailFeatures dexOrderDetailFeatures = (DexOrderDetailFeatures) obj;
        return Intrinsics.EZpvd((Object) this.waiveGasFee, (Object) dexOrderDetailFeatures.waiveGasFee) && Intrinsics.EZpvd((Object) this.triggered, (Object) dexOrderDetailFeatures.triggered);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTriggered() {
        return this.triggered;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWaiveGasFee() {
        return this.waiveGasFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.waiveGasFee;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.triggered;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexOrderDetailFeatures(waiveGasFee=" + this.waiveGasFee + ", triggered=" + this.triggered + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.waiveGasFee);
        parcel.writeString(this.triggered);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.DexOrderDetailFeatures.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexOrderDetailFeatures> serializer() {
            return DexOrderDetailFeatures$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexOrderDetailFeatures(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.waiveGasFee = null;
        } else {
            this.waiveGasFee = str;
        }
        if ((i & 2) == 0) {
            this.triggered = null;
        } else {
            this.triggered = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(DexOrderDetailFeatures dexOrderDetailFeatures, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || dexOrderDetailFeatures.waiveGasFee != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, dexOrderDetailFeatures.waiveGasFee);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && dexOrderDetailFeatures.triggered == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, dexOrderDetailFeatures.triggered);
    }

    public DexOrderDetailFeatures(String str, String str2) {
        this.waiveGasFee = str;
        this.triggered = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:91) call: com.okinc.unify_trade.biz.subscribe.DexOrderDetailFeatures.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexOrderDetailFeatures(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

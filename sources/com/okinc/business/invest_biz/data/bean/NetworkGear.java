package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class NetworkGear implements Parcelable {
    public static final int $stable = 0;
    private final String calculateGasPrice;
    private final String estimatedTime;
    private final String gasPrice;
    private final String priorityFee;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<NetworkGear> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<NetworkGear> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkGear createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new NetworkGear(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final NetworkGear[] newArray(int i) {
            return new NetworkGear[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public NetworkGear() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ NetworkGear copy$default(NetworkGear networkGear, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkGear.calculateGasPrice;
        }
        if ((i & 2) != 0) {
            str2 = networkGear.estimatedTime;
        }
        if ((i & 4) != 0) {
            str3 = networkGear.gasPrice;
        }
        if ((i & 8) != 0) {
            str4 = networkGear.priorityFee;
        }
        return networkGear.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.calculateGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NetworkGear copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new NetworkGear(str, str2, str3, str4);
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
        if (!(obj instanceof NetworkGear)) {
            return false;
        }
        NetworkGear networkGear = (NetworkGear) obj;
        return Intrinsics.EZpvd((Object) this.calculateGasPrice, (Object) networkGear.calculateGasPrice) && Intrinsics.EZpvd((Object) this.estimatedTime, (Object) networkGear.estimatedTime) && Intrinsics.EZpvd((Object) this.gasPrice, (Object) networkGear.gasPrice) && Intrinsics.EZpvd((Object) this.priorityFee, (Object) networkGear.priorityFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCalculateGasPrice() {
        return this.calculateGasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEstimatedTime() {
        return this.estimatedTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFee() {
        return this.priorityFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.calculateGasPrice.hashCode() * 31) + this.estimatedTime.hashCode()) * 31) + this.gasPrice.hashCode()) * 31) + this.priorityFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "NetworkGear(calculateGasPrice=" + this.calculateGasPrice + ", estimatedTime=" + this.estimatedTime + ", gasPrice=" + this.gasPrice + ", priorityFee=" + this.priorityFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.calculateGasPrice);
        parcel.writeString(this.estimatedTime);
        parcel.writeString(this.gasPrice);
        parcel.writeString(this.priorityFee);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.NetworkGear.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<NetworkGear> serializer() {
            return NetworkGear$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ NetworkGear(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.calculateGasPrice = "";
        } else {
            this.calculateGasPrice = str;
        }
        if ((i & 2) == 0) {
            this.estimatedTime = "";
        } else {
            this.estimatedTime = str2;
        }
        if ((i & 4) == 0) {
            this.gasPrice = "";
        } else {
            this.gasPrice = str3;
        }
        if ((i & 8) == 0) {
            this.priorityFee = "";
        } else {
            this.priorityFee = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(NetworkGear networkGear, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) networkGear.calculateGasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, networkGear.calculateGasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) networkGear.estimatedTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, networkGear.estimatedTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) networkGear.gasPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, networkGear.gasPrice);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) networkGear.priorityFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, networkGear.priorityFee);
    }

    public NetworkGear(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.calculateGasPrice = str;
        this.estimatedTime = str2;
        this.gasPrice = str3;
        this.priorityFee = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:447) call: com.okinc.business.invest_biz.data.bean.NetworkGear.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ NetworkGear(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}

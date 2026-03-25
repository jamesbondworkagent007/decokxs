package com.okinc.business.web3pay.lib.core.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class GasPrice implements Parcelable {
    public static final int $stable = 0;
    private final String baseFee;
    private final String l1GasPrice;
    private final String maxFeePerGas;
    private final String maxPriorityFeePerGas;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GasPrice> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GasPrice> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasPrice createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GasPrice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasPrice[] newArray(int i) {
            return new GasPrice[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GasPrice copy$default(GasPrice gasPrice, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gasPrice.baseFee;
        }
        if ((i & 2) != 0) {
            str2 = gasPrice.maxFeePerGas;
        }
        if ((i & 4) != 0) {
            str3 = gasPrice.maxPriorityFeePerGas;
        }
        if ((i & 8) != 0) {
            str4 = gasPrice.l1GasPrice;
        }
        return gasPrice.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasPrice copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new GasPrice(str, str2, str3, str4);
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
        if (!(obj instanceof GasPrice)) {
            return false;
        }
        GasPrice gasPrice = (GasPrice) obj;
        return Intrinsics.EZpvd((Object) this.baseFee, (Object) gasPrice.baseFee) && Intrinsics.EZpvd((Object) this.maxFeePerGas, (Object) gasPrice.maxFeePerGas) && Intrinsics.EZpvd((Object) this.maxPriorityFeePerGas, (Object) gasPrice.maxPriorityFeePerGas) && Intrinsics.EZpvd((Object) this.l1GasPrice, (Object) gasPrice.l1GasPrice);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseFee() {
        return this.baseFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasPrice() {
        return this.l1GasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFeePerGas() {
        return this.maxFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxPriorityFeePerGas() {
        return this.maxPriorityFeePerGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.baseFee.hashCode() * 31) + this.maxFeePerGas.hashCode()) * 31) + this.maxPriorityFeePerGas.hashCode()) * 31) + this.l1GasPrice.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GasPrice(baseFee=" + this.baseFee + ", maxFeePerGas=" + this.maxFeePerGas + ", maxPriorityFeePerGas=" + this.maxPriorityFeePerGas + ", l1GasPrice=" + this.l1GasPrice + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.baseFee);
        parcel.writeString(this.maxFeePerGas);
        parcel.writeString(this.maxPriorityFeePerGas);
        parcel.writeString(this.l1GasPrice);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.GasPrice.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GasPrice> serializer() {
            return GasPrice$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GasPrice(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, GasPrice$$serializer.INSTANCE.getDescriptor());
        }
        this.baseFee = str;
        this.maxFeePerGas = str2;
        this.maxPriorityFeePerGas = str3;
        this.l1GasPrice = str4;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GasPrice gasPrice, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, gasPrice.baseFee);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gasPrice.maxFeePerGas);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, gasPrice.maxPriorityFeePerGas);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, gasPrice.l1GasPrice);
    }

    public GasPrice(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.baseFee = str;
        this.maxFeePerGas = str2;
        this.maxPriorityFeePerGas = str3;
        this.l1GasPrice = str4;
    }
}

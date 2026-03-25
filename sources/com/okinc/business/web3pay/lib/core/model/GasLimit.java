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
public final class GasLimit implements Parcelable {
    public static final int $stable = 0;
    private final String callGasLimit;
    private final String initGasLimit;
    private final String l1GasLimit;
    private final String paymasterPostOpGasLimit;
    private final String paymasterVerificationGasLimit;
    private final String preVerificationGas;
    private final String verificationGasLimit;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<GasLimit> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<GasLimit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasLimit createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GasLimit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GasLimit[] newArray(int i) {
            return new GasLimit[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GasLimit copy$default(GasLimit gasLimit, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gasLimit.callGasLimit;
        }
        if ((i & 2) != 0) {
            str2 = gasLimit.verificationGasLimit;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = gasLimit.preVerificationGas;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = gasLimit.paymasterVerificationGasLimit;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = gasLimit.paymasterPostOpGasLimit;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = gasLimit.l1GasLimit;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = gasLimit.initGasLimit;
        }
        return gasLimit.copy(str, str8, str9, str10, str11, str12, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.l1GasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.initGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GasLimit copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new GasLimit(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof GasLimit)) {
            return false;
        }
        GasLimit gasLimit = (GasLimit) obj;
        return Intrinsics.EZpvd((Object) this.callGasLimit, (Object) gasLimit.callGasLimit) && Intrinsics.EZpvd((Object) this.verificationGasLimit, (Object) gasLimit.verificationGasLimit) && Intrinsics.EZpvd((Object) this.preVerificationGas, (Object) gasLimit.preVerificationGas) && Intrinsics.EZpvd((Object) this.paymasterVerificationGasLimit, (Object) gasLimit.paymasterVerificationGasLimit) && Intrinsics.EZpvd((Object) this.paymasterPostOpGasLimit, (Object) gasLimit.paymasterPostOpGasLimit) && Intrinsics.EZpvd((Object) this.l1GasLimit, (Object) gasLimit.l1GasLimit) && Intrinsics.EZpvd((Object) this.initGasLimit, (Object) gasLimit.initGasLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCallGasLimit() {
        return this.callGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInitGasLimit() {
        return this.initGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getL1GasLimit() {
        return this.l1GasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterPostOpGasLimit() {
        return this.paymasterPostOpGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPaymasterVerificationGasLimit() {
        return this.paymasterVerificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPreVerificationGas() {
        return this.preVerificationGas;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVerificationGasLimit() {
        return this.verificationGasLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.callGasLimit.hashCode() * 31) + this.verificationGasLimit.hashCode()) * 31) + this.preVerificationGas.hashCode()) * 31) + this.paymasterVerificationGasLimit.hashCode()) * 31) + this.paymasterPostOpGasLimit.hashCode()) * 31) + this.l1GasLimit.hashCode()) * 31) + this.initGasLimit.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GasLimit(callGasLimit=" + this.callGasLimit + ", verificationGasLimit=" + this.verificationGasLimit + ", preVerificationGas=" + this.preVerificationGas + ", paymasterVerificationGasLimit=" + this.paymasterVerificationGasLimit + ", paymasterPostOpGasLimit=" + this.paymasterPostOpGasLimit + ", l1GasLimit=" + this.l1GasLimit + ", initGasLimit=" + this.initGasLimit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.callGasLimit);
        parcel.writeString(this.verificationGasLimit);
        parcel.writeString(this.preVerificationGas);
        parcel.writeString(this.paymasterVerificationGasLimit);
        parcel.writeString(this.paymasterPostOpGasLimit);
        parcel.writeString(this.l1GasLimit);
        parcel.writeString(this.initGasLimit);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.GasLimit.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GasLimit> serializer() {
            return GasLimit$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GasLimit(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i, 127, GasLimit$$serializer.INSTANCE.getDescriptor());
        }
        this.callGasLimit = str;
        this.verificationGasLimit = str2;
        this.preVerificationGas = str3;
        this.paymasterVerificationGasLimit = str4;
        this.paymasterPostOpGasLimit = str5;
        this.l1GasLimit = str6;
        this.initGasLimit = str7;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(GasLimit gasLimit, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, gasLimit.callGasLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, gasLimit.verificationGasLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, gasLimit.preVerificationGas);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, gasLimit.paymasterVerificationGasLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, gasLimit.paymasterPostOpGasLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, gasLimit.l1GasLimit);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, gasLimit.initGasLimit);
    }

    public GasLimit(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.callGasLimit = str;
        this.verificationGasLimit = str2;
        this.preVerificationGas = str3;
        this.paymasterVerificationGasLimit = str4;
        this.paymasterPostOpGasLimit = str5;
        this.l1GasLimit = str6;
        this.initGasLimit = str7;
    }
}

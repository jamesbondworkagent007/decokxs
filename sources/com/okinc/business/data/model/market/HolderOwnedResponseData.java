package com.okinc.business.data.model.market;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class HolderOwnedResponseData implements Parcelable {
    public static final int $stable = 0;
    private final String greaterThan10Amount;
    private final String greaterThan10AmountPercentage;
    private final String nativeTokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<HolderOwnedResponseData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<HolderOwnedResponseData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderOwnedResponseData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HolderOwnedResponseData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HolderOwnedResponseData[] newArray(int i) {
            return new HolderOwnedResponseData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderOwnedResponseData() {
        this((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ HolderOwnedResponseData copy$default(HolderOwnedResponseData holderOwnedResponseData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = holderOwnedResponseData.greaterThan10Amount;
        }
        if ((i & 2) != 0) {
            str2 = holderOwnedResponseData.greaterThan10AmountPercentage;
        }
        if ((i & 4) != 0) {
            str3 = holderOwnedResponseData.nativeTokenSymbol;
        }
        return holderOwnedResponseData.copy(str, str2, str3);
    }

    @SerialName("greaterThan10Amount")
    public static /* synthetic */ void getGreaterThan10Amount$annotations() {
    }

    @SerialName("greaterThan10AmountPercentage")
    public static /* synthetic */ void getGreaterThan10AmountPercentage$annotations() {
    }

    @SerialName("nativeTokenSymbol")
    public static /* synthetic */ void getNativeTokenSymbol$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.greaterThan10Amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.greaterThan10AmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderOwnedResponseData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new HolderOwnedResponseData(str, str2, str3);
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
        if (!(obj instanceof HolderOwnedResponseData)) {
            return false;
        }
        HolderOwnedResponseData holderOwnedResponseData = (HolderOwnedResponseData) obj;
        return Intrinsics.EZpvd((Object) this.greaterThan10Amount, (Object) holderOwnedResponseData.greaterThan10Amount) && Intrinsics.EZpvd((Object) this.greaterThan10AmountPercentage, (Object) holderOwnedResponseData.greaterThan10AmountPercentage) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) holderOwnedResponseData.nativeTokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreaterThan10Amount() {
        return this.greaterThan10Amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGreaterThan10AmountPercentage() {
        return this.greaterThan10AmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.greaterThan10Amount.hashCode() * 31) + this.greaterThan10AmountPercentage.hashCode()) * 31) + this.nativeTokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderOwnedResponseData(greaterThan10Amount=" + this.greaterThan10Amount + ", greaterThan10AmountPercentage=" + this.greaterThan10AmountPercentage + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.greaterThan10Amount);
        parcel.writeString(this.greaterThan10AmountPercentage);
        parcel.writeString(this.nativeTokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.data.model.market.HolderOwnedResponseData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HolderOwnedResponseData> serializer() {
            return HolderOwnedResponseData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HolderOwnedResponseData(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.greaterThan10Amount = "";
        } else {
            this.greaterThan10Amount = str;
        }
        if ((i & 2) == 0) {
            this.greaterThan10AmountPercentage = "";
        } else {
            this.greaterThan10AmountPercentage = str2;
        }
        if ((i & 4) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HolderOwnedResponseData holderOwnedResponseData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holderOwnedResponseData.greaterThan10Amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, holderOwnedResponseData.greaterThan10Amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holderOwnedResponseData.greaterThan10AmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holderOwnedResponseData.greaterThan10AmountPercentage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) && Intrinsics.EZpvd((Object) holderOwnedResponseData.nativeTokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 2, holderOwnedResponseData.nativeTokenSymbol);
    }

    public HolderOwnedResponseData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.greaterThan10Amount = str;
        this.greaterThan10AmountPercentage = str2;
        this.nativeTokenSymbol = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:95) call: com.okinc.business.data.model.market.HolderOwnedResponseData.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HolderOwnedResponseData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
    }
}

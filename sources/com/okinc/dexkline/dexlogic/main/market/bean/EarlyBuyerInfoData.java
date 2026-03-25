package com.okinc.dexkline.dexlogic.main.market.bean;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class EarlyBuyerInfoData implements Parcelable {
    public static final int $stable = 0;
    private final String chainId;
    private final String earlyBuyerHoldAmount;
    private final String tokenContractAddress;
    private final String totalEarlyBuyerAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EarlyBuyerInfoData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarlyBuyerInfoData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyBuyerInfoData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarlyBuyerInfoData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarlyBuyerInfoData[] newArray(int i) {
            return new EarlyBuyerInfoData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarlyBuyerInfoData() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarlyBuyerInfoData copy$default(EarlyBuyerInfoData earlyBuyerInfoData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earlyBuyerInfoData.chainId;
        }
        if ((i & 2) != 0) {
            str2 = earlyBuyerInfoData.earlyBuyerHoldAmount;
        }
        if ((i & 4) != 0) {
            str3 = earlyBuyerInfoData.tokenContractAddress;
        }
        if ((i & 8) != 0) {
            str4 = earlyBuyerInfoData.totalEarlyBuyerAmount;
        }
        return earlyBuyerInfoData.copy(str, str2, str3, str4);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("earlyBuyerHoldAmount")
    public static /* synthetic */ void getEarlyBuyerHoldAmount$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("totalEarlyBuyerAmount")
    public static /* synthetic */ void getTotalEarlyBuyerAmount$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.earlyBuyerHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalEarlyBuyerAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyBuyerInfoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new EarlyBuyerInfoData(str, str2, str3, str4);
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
        if (!(obj instanceof EarlyBuyerInfoData)) {
            return false;
        }
        EarlyBuyerInfoData earlyBuyerInfoData = (EarlyBuyerInfoData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) earlyBuyerInfoData.chainId) && Intrinsics.EZpvd((Object) this.earlyBuyerHoldAmount, (Object) earlyBuyerInfoData.earlyBuyerHoldAmount) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) earlyBuyerInfoData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.totalEarlyBuyerAmount, (Object) earlyBuyerInfoData.totalEarlyBuyerAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEarlyBuyerHoldAmount() {
        return this.earlyBuyerHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalEarlyBuyerAmount() {
        return this.totalEarlyBuyerAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.chainId.hashCode() * 31) + this.earlyBuyerHoldAmount.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.totalEarlyBuyerAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarlyBuyerInfoData(chainId=" + this.chainId + ", earlyBuyerHoldAmount=" + this.earlyBuyerHoldAmount + ", tokenContractAddress=" + this.tokenContractAddress + ", totalEarlyBuyerAmount=" + this.totalEarlyBuyerAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainId);
        parcel.writeString(this.earlyBuyerHoldAmount);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.totalEarlyBuyerAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarlyBuyerInfoData> serializer() {
            return EarlyBuyerInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarlyBuyerInfoData(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.earlyBuyerHoldAmount = "";
        } else {
            this.earlyBuyerHoldAmount = str2;
        }
        if ((i & 4) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
        if ((i & 8) == 0) {
            this.totalEarlyBuyerAmount = "";
        } else {
            this.totalEarlyBuyerAmount = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(EarlyBuyerInfoData earlyBuyerInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) earlyBuyerInfoData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, earlyBuyerInfoData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) earlyBuyerInfoData.earlyBuyerHoldAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, earlyBuyerInfoData.earlyBuyerHoldAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) earlyBuyerInfoData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, earlyBuyerInfoData.tokenContractAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) earlyBuyerInfoData.totalEarlyBuyerAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, earlyBuyerInfoData.totalEarlyBuyerAmount);
    }

    public EarlyBuyerInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.chainId = str;
        this.earlyBuyerHoldAmount = str2;
        this.tokenContractAddress = str3;
        this.totalEarlyBuyerAmount = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:169) call: com.okinc.dexkline.dexlogic.main.market.bean.EarlyBuyerInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EarlyBuyerInfoData(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}

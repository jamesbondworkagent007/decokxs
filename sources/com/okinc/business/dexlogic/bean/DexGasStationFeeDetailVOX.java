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
public final class DexGasStationFeeDetailVOX implements Parcelable {
    public static final int $stable = 0;
    private final String approveTokenAmount;
    private final String gasTokenPriceUSD;
    private final String gasTokenSymbol;
    private final String swapGasFeeAmount;
    private final String totalGasFeeAmount;
    private final String transferApproveTokenGasFeeAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexGasStationFeeDetailVOX> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexGasStationFeeDetailVOX> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexGasStationFeeDetailVOX createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexGasStationFeeDetailVOX(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexGasStationFeeDetailVOX[] newArray(int i) {
            return new DexGasStationFeeDetailVOX[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexGasStationFeeDetailVOX() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ DexGasStationFeeDetailVOX copy$default(DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dexGasStationFeeDetailVOX.approveTokenAmount;
        }
        if ((i & 2) != 0) {
            str2 = dexGasStationFeeDetailVOX.gasTokenPriceUSD;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = dexGasStationFeeDetailVOX.gasTokenSymbol;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = dexGasStationFeeDetailVOX.swapGasFeeAmount;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = dexGasStationFeeDetailVOX.totalGasFeeAmount;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = dexGasStationFeeDetailVOX.transferApproveTokenGasFeeAmount;
        }
        return dexGasStationFeeDetailVOX.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.approveTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.gasTokenPriceUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.gasTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.swapGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.totalGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.transferApproveTokenGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexGasStationFeeDetailVOX copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new DexGasStationFeeDetailVOX(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof DexGasStationFeeDetailVOX)) {
            return false;
        }
        DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX = (DexGasStationFeeDetailVOX) obj;
        return Intrinsics.EZpvd((Object) this.approveTokenAmount, (Object) dexGasStationFeeDetailVOX.approveTokenAmount) && Intrinsics.EZpvd((Object) this.gasTokenPriceUSD, (Object) dexGasStationFeeDetailVOX.gasTokenPriceUSD) && Intrinsics.EZpvd((Object) this.gasTokenSymbol, (Object) dexGasStationFeeDetailVOX.gasTokenSymbol) && Intrinsics.EZpvd((Object) this.swapGasFeeAmount, (Object) dexGasStationFeeDetailVOX.swapGasFeeAmount) && Intrinsics.EZpvd((Object) this.totalGasFeeAmount, (Object) dexGasStationFeeDetailVOX.totalGasFeeAmount) && Intrinsics.EZpvd((Object) this.transferApproveTokenGasFeeAmount, (Object) dexGasStationFeeDetailVOX.transferApproveTokenGasFeeAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApproveTokenAmount() {
        return this.approveTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasTokenPriceUSD() {
        return this.gasTokenPriceUSD;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasTokenSymbol() {
        return this.gasTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSwapGasFeeAmount() {
        return this.swapGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalGasFeeAmount() {
        return this.totalGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTransferApproveTokenGasFeeAmount() {
        return this.transferApproveTokenGasFeeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.approveTokenAmount.hashCode() * 31) + this.gasTokenPriceUSD.hashCode()) * 31) + this.gasTokenSymbol.hashCode()) * 31) + this.swapGasFeeAmount.hashCode()) * 31) + this.totalGasFeeAmount.hashCode()) * 31) + this.transferApproveTokenGasFeeAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexGasStationFeeDetailVOX(approveTokenAmount=" + this.approveTokenAmount + ", gasTokenPriceUSD=" + this.gasTokenPriceUSD + ", gasTokenSymbol=" + this.gasTokenSymbol + ", swapGasFeeAmount=" + this.swapGasFeeAmount + ", totalGasFeeAmount=" + this.totalGasFeeAmount + ", transferApproveTokenGasFeeAmount=" + this.transferApproveTokenGasFeeAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.approveTokenAmount);
        parcel.writeString(this.gasTokenPriceUSD);
        parcel.writeString(this.gasTokenSymbol);
        parcel.writeString(this.swapGasFeeAmount);
        parcel.writeString(this.totalGasFeeAmount);
        parcel.writeString(this.transferApproveTokenGasFeeAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.DexGasStationFeeDetailVOX.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexGasStationFeeDetailVOX> serializer() {
            return DexGasStationFeeDetailVOX$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexGasStationFeeDetailVOX(int i, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.approveTokenAmount = "";
        } else {
            this.approveTokenAmount = str;
        }
        if ((i & 2) == 0) {
            this.gasTokenPriceUSD = "";
        } else {
            this.gasTokenPriceUSD = str2;
        }
        if ((i & 4) == 0) {
            this.gasTokenSymbol = "";
        } else {
            this.gasTokenSymbol = str3;
        }
        if ((i & 8) == 0) {
            this.swapGasFeeAmount = "";
        } else {
            this.swapGasFeeAmount = str4;
        }
        if ((i & 16) == 0) {
            this.totalGasFeeAmount = "";
        } else {
            this.totalGasFeeAmount = str5;
        }
        if ((i & 32) == 0) {
            this.transferApproveTokenGasFeeAmount = "";
        } else {
            this.transferApproveTokenGasFeeAmount = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(DexGasStationFeeDetailVOX dexGasStationFeeDetailVOX, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexGasStationFeeDetailVOX.approveTokenAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexGasStationFeeDetailVOX.approveTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexGasStationFeeDetailVOX.gasTokenPriceUSD, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexGasStationFeeDetailVOX.gasTokenPriceUSD);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexGasStationFeeDetailVOX.gasTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexGasStationFeeDetailVOX.gasTokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexGasStationFeeDetailVOX.swapGasFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexGasStationFeeDetailVOX.swapGasFeeAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexGasStationFeeDetailVOX.totalGasFeeAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexGasStationFeeDetailVOX.totalGasFeeAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) dexGasStationFeeDetailVOX.transferApproveTokenGasFeeAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, dexGasStationFeeDetailVOX.transferApproveTokenGasFeeAmount);
    }

    public DexGasStationFeeDetailVOX(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.approveTokenAmount = str;
        this.gasTokenPriceUSD = str2;
        this.gasTokenSymbol = str3;
        this.swapGasFeeAmount = str4;
        this.totalGasFeeAmount = str5;
        this.transferApproveTokenGasFeeAmount = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.dexlogic.bean.DexGasStationFeeDetailVOX.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ DexGasStationFeeDetailVOX(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6);
    }
}

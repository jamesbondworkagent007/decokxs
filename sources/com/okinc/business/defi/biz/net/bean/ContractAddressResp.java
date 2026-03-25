package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class ContractAddressResp implements Parcelable {
    private String blockChain;
    private String contractAddress;
    private Boolean isNft;
    private String logo;
    private int precision;
    private String riskJumpUrl;
    private int riskType;
    private String symbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<ContractAddressResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<ContractAddressResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractAddressResp createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ContractAddressResp(string, string2, string3, i, string4, boolValueOf, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContractAddressResp[] newArray(int i) {
            return new ContractAddressResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ContractAddressResp() {
        this((String) null, (String) null, (String) null, 0, (String) null, (Boolean) null, 0, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.blockChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.isNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.riskJumpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContractAddressResp copy(@NotNull String str, String str2, @NotNull String str3, int i, String str4, Boolean bool, int i2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ContractAddressResp(str, str2, str3, i, str4, bool, i2, str5);
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
        if (!(obj instanceof ContractAddressResp)) {
            return false;
        }
        ContractAddressResp contractAddressResp = (ContractAddressResp) obj;
        return Intrinsics.EZpvd((Object) this.blockChain, (Object) contractAddressResp.blockChain) && Intrinsics.EZpvd((Object) this.contractAddress, (Object) contractAddressResp.contractAddress) && Intrinsics.EZpvd((Object) this.symbol, (Object) contractAddressResp.symbol) && this.precision == contractAddressResp.precision && Intrinsics.EZpvd((Object) this.logo, (Object) contractAddressResp.logo) && Intrinsics.EZpvd(this.isNft, contractAddressResp.isNft) && this.riskType == contractAddressResp.riskType && Intrinsics.EZpvd((Object) this.riskJumpUrl, (Object) contractAddressResp.riskJumpUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockChain() {
        return this.blockChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskJumpUrl() {
        return this.riskJumpUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getRiskType() {
        return this.riskType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.blockChain.hashCode();
        String str = this.contractAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.symbol.hashCode();
        int iHashCode4 = Integer.hashCode(this.precision);
        String str2 = this.logo;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.isNft;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + Integer.hashCode(this.riskType)) * 31) + this.riskJumpUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isNft() {
        return this.isNft;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlockChain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.blockChain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(String str) {
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNft(Boolean bool) {
        this.isNft = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrecision(int i) {
        this.precision = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskJumpUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.riskJumpUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRiskType(int i) {
        this.riskType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ContractAddressResp(blockChain=" + this.blockChain + ", contractAddress=" + this.contractAddress + ", symbol=" + this.symbol + ", precision=" + this.precision + ", logo=" + this.logo + ", isNft=" + this.isNft + ", riskType=" + this.riskType + ", riskJumpUrl=" + this.riskJumpUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.Parcel, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        ?? BooleanValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.blockChain);
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.symbol);
        parcel.writeInt(this.precision);
        parcel.writeString(this.logo);
        Boolean bool = this.isNft;
        if (bool == null) {
            BooleanValue = 0;
        } else {
            parcel.writeInt(1);
            BooleanValue = bool.booleanValue();
        }
        parcel.writeInt(BooleanValue);
        parcel.writeInt(this.riskType);
        parcel.writeString(this.riskJumpUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.ContractAddressResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ContractAddressResp> serializer() {
            return ContractAddressResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ ContractAddressResp(int i, String str, String str2, String str3, int i2, String str4, Boolean bool, int i3, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.blockChain = "";
        } else {
            this.blockChain = str;
        }
        if ((i & 2) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str3;
        }
        if ((i & 8) == 0) {
            this.precision = 0;
        } else {
            this.precision = i2;
        }
        if ((i & 16) == 0) {
            this.logo = null;
        } else {
            this.logo = str4;
        }
        if ((i & 32) == 0) {
            this.isNft = null;
        } else {
            this.isNft = bool;
        }
        if ((i & 64) == 0) {
            this.riskType = 0;
        } else {
            this.riskType = i3;
        }
        if ((i & 128) == 0) {
            this.riskJumpUrl = "";
        } else {
            this.riskJumpUrl = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(ContractAddressResp contractAddressResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) contractAddressResp.blockChain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, contractAddressResp.blockChain);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) contractAddressResp.contractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, contractAddressResp.contractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) contractAddressResp.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, contractAddressResp.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || contractAddressResp.precision != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, contractAddressResp.precision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || contractAddressResp.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, contractAddressResp.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || contractAddressResp.isNft != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, BooleanSerializer.INSTANCE, contractAddressResp.isNft);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || contractAddressResp.riskType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 6, contractAddressResp.riskType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) contractAddressResp.riskJumpUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, contractAddressResp.riskJumpUrl);
    }

    public ContractAddressResp(@NotNull String str, String str2, @NotNull String str3, int i, String str4, Boolean bool, int i2, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.blockChain = str;
        this.contractAddress = str2;
        this.symbol = str3;
        this.precision = i;
        this.logo = str4;
        this.isNft = bool;
        this.riskType = i2;
        this.riskJumpUrl = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0019: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r14v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0029: ARITH (r19v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.Boolean) : (null java.lang.Boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0030: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r19v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Boolean, int, java.lang.String):void (m)] (LINE:58) call: com.okinc.business.defi.biz.net.bean.ContractAddressResp.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.Boolean, int, java.lang.String):void type: THIS */
    public /* synthetic */ ContractAddressResp(String str, String str2, String str3, int i, String str4, Boolean bool, int i2, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? null : str4, (i3 & 32) == 0 ? bool : null, (i3 & 64) == 0 ? i2 : 0, (i3 & 128) == 0 ? str5 : "");
    }
}

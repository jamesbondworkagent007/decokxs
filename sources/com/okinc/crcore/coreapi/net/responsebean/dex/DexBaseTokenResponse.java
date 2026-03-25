package com.okinc.crcore.coreapi.net.responsebean.dex;

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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DexBaseTokenResponse implements Parcelable {
    public static final int $stable = 0;
    private final String chainIndex;
    private final String chainLogoUrl;
    private final String chainName;
    private final String decimals;
    private final int innerOuterStatus;
    private final String isNativeToken;
    private final String riskLevel;
    private final String tokenContractAddress;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexBaseTokenResponse> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<DexBaseTokenResponse> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexBaseTokenResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexBaseTokenResponse(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexBaseTokenResponse[] newArray(int i) {
            return new DexBaseTokenResponse[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexBaseTokenResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.innerOuterStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexBaseTokenResponse copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new DexBaseTokenResponse(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i);
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
        if (!(obj instanceof DexBaseTokenResponse)) {
            return false;
        }
        DexBaseTokenResponse dexBaseTokenResponse = (DexBaseTokenResponse) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexBaseTokenResponse.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexBaseTokenResponse.chainName) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) dexBaseTokenResponse.chainLogoUrl) && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) dexBaseTokenResponse.isNativeToken) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexBaseTokenResponse.riskLevel) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) dexBaseTokenResponse.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) dexBaseTokenResponse.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) dexBaseTokenResponse.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexBaseTokenResponse.tokenContractAddress) && Intrinsics.EZpvd((Object) this.decimals, (Object) dexBaseTokenResponse.decimals) && this.innerOuterStatus == dexBaseTokenResponse.innerOuterStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDecimals() {
        return this.decimals;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getInnerOuterStatus() {
        return this.innerOuterStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.chainIndex.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainLogoUrl.hashCode()) * 31) + this.isNativeToken.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.decimals.hashCode()) * 31) + Integer.hashCode(this.innerOuterStatus);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexBaseTokenResponse(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogoUrl=" + this.chainLogoUrl + ", isNativeToken=" + this.isNativeToken + ", riskLevel=" + this.riskLevel + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", tokenContractAddress=" + this.tokenContractAddress + ", decimals=" + this.decimals + ", innerOuterStatus=" + this.innerOuterStatus + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogoUrl);
        parcel.writeString(this.isNativeToken);
        parcel.writeString(this.riskLevel);
        parcel.writeString(this.tokenLogoUrl);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.decimals);
        parcel.writeInt(this.innerOuterStatus);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.DexBaseTokenResponse.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexBaseTokenResponse> serializer() {
            return DexBaseTokenResponse$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexBaseTokenResponse(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainIndex = "";
        } else {
            this.chainIndex = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str3;
        }
        if ((i & 8) == 0) {
            this.isNativeToken = "";
        } else {
            this.isNativeToken = str4;
        }
        if ((i & 16) == 0) {
            this.riskLevel = "0";
        } else {
            this.riskLevel = str5;
        }
        if ((i & 32) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str6;
        }
        if ((i & 64) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str7;
        }
        if ((i & 128) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str8;
        }
        if ((i & 256) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str9;
        }
        if ((i & 512) == 0) {
            this.decimals = "";
        } else {
            this.decimals = str10;
        }
        if ((i & 1024) == 0) {
            this.innerOuterStatus = -1;
        } else {
            this.innerOuterStatus = i2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexBaseTokenResponse dexBaseTokenResponse, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexBaseTokenResponse.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexBaseTokenResponse.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexBaseTokenResponse.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.isNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexBaseTokenResponse.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.riskLevel, (Object) "0")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexBaseTokenResponse.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexBaseTokenResponse.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexBaseTokenResponse.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexBaseTokenResponse.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexBaseTokenResponse.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) dexBaseTokenResponse.decimals, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, dexBaseTokenResponse.decimals);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && dexBaseTokenResponse.innerOuterStatus == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 10, dexBaseTokenResponse.innerOuterStatus);
    }

    public DexBaseTokenResponse(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogoUrl = str3;
        this.isNativeToken = str4;
        this.riskLevel = str5;
        this.tokenLogoUrl = str6;
        this.tokenName = str7;
        this.tokenSymbol = str8;
        this.tokenContractAddress = str9;
        this.decimals = str10;
        this.innerOuterStatus = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("0") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r24v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r22v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r23v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:15) call: com.okinc.crcore.coreapi.net.responsebean.dex.DexBaseTokenResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ DexBaseTokenResponse(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "0" : str5, (i2 & 32) != 0 ? "" : str6, (i2 & 64) != 0 ? "" : str7, (i2 & 128) != 0 ? "" : str8, (i2 & 256) != 0 ? "" : str9, (i2 & 512) == 0 ? str10 : "", (i2 & 1024) != 0 ? -1 : i);
    }
}

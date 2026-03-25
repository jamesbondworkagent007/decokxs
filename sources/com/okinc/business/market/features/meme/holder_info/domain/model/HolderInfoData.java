package com.okinc.business.market.features.meme.holder_info.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class HolderInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainId;
    private final String fundingSourceAddress;
    private final String fundingSourceAddressNativeExplorerUrl;
    private final String fundingSourceAddressOkExplorerUrl;
    private final String fundingSourceLogo;
    private final String fundingSourceTime;
    private final String holderAddress;
    private final String holderAddressCreateTime;
    private final String holderAddressOkExplorerUrl;
    private final String nativeTokenHoldAmount;
    private final String nativeTokenSymbol;
    private final String tokenContractAddress;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HolderInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("fundingSourceAddress")
    public static /* synthetic */ void getFundingSourceAddress$annotations() {
    }

    @SerialName("fundingSourceAddressNativeExplorerUrl")
    public static /* synthetic */ void getFundingSourceAddressNativeExplorerUrl$annotations() {
    }

    @SerialName("fundingSourceAddressOkExplorerUrl")
    public static /* synthetic */ void getFundingSourceAddressOkExplorerUrl$annotations() {
    }

    @SerialName("fundingSourceLogo")
    public static /* synthetic */ void getFundingSourceLogo$annotations() {
    }

    @SerialName("fundingSourceTime")
    public static /* synthetic */ void getFundingSourceTime$annotations() {
    }

    @SerialName("holderAddress")
    public static /* synthetic */ void getHolderAddress$annotations() {
    }

    @SerialName("holderAddressCreateTime")
    public static /* synthetic */ void getHolderAddressCreateTime$annotations() {
    }

    @SerialName("holderAddressOkExplorerUrl")
    public static /* synthetic */ void getHolderAddressOkExplorerUrl$annotations() {
    }

    @SerialName("nativeTokenHoldAmount")
    public static /* synthetic */ void getNativeTokenHoldAmount$annotations() {
    }

    @SerialName("nativeTokenSymbol")
    public static /* synthetic */ void getNativeTokenSymbol$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.nativeTokenHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fundingSourceAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fundingSourceAddressNativeExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fundingSourceAddressOkExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fundingSourceLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.fundingSourceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.holderAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.holderAddressCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.holderAddressOkExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HolderInfoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        return new HolderInfoData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HolderInfoData)) {
            return false;
        }
        HolderInfoData holderInfoData = (HolderInfoData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) holderInfoData.chainId) && Intrinsics.EZpvd((Object) this.fundingSourceAddress, (Object) holderInfoData.fundingSourceAddress) && Intrinsics.EZpvd((Object) this.fundingSourceAddressNativeExplorerUrl, (Object) holderInfoData.fundingSourceAddressNativeExplorerUrl) && Intrinsics.EZpvd((Object) this.fundingSourceAddressOkExplorerUrl, (Object) holderInfoData.fundingSourceAddressOkExplorerUrl) && Intrinsics.EZpvd((Object) this.fundingSourceLogo, (Object) holderInfoData.fundingSourceLogo) && Intrinsics.EZpvd((Object) this.fundingSourceTime, (Object) holderInfoData.fundingSourceTime) && Intrinsics.EZpvd((Object) this.holderAddress, (Object) holderInfoData.holderAddress) && Intrinsics.EZpvd((Object) this.holderAddressCreateTime, (Object) holderInfoData.holderAddressCreateTime) && Intrinsics.EZpvd((Object) this.holderAddressOkExplorerUrl, (Object) holderInfoData.holderAddressOkExplorerUrl) && Intrinsics.EZpvd((Object) this.nativeTokenHoldAmount, (Object) holderInfoData.nativeTokenHoldAmount) && Intrinsics.EZpvd((Object) this.nativeTokenSymbol, (Object) holderInfoData.nativeTokenSymbol) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) holderInfoData.tokenContractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingSourceAddress() {
        return this.fundingSourceAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingSourceAddressNativeExplorerUrl() {
        return this.fundingSourceAddressNativeExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingSourceAddressOkExplorerUrl() {
        return this.fundingSourceAddressOkExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingSourceLogo() {
        return this.fundingSourceLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingSourceTime() {
        return this.fundingSourceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderAddress() {
        return this.holderAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderAddressCreateTime() {
        return this.holderAddressCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHolderAddressOkExplorerUrl() {
        return this.holderAddressOkExplorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenHoldAmount() {
        return this.nativeTokenHoldAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNativeTokenSymbol() {
        return this.nativeTokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((this.chainId.hashCode() * 31) + this.fundingSourceAddress.hashCode()) * 31) + this.fundingSourceAddressNativeExplorerUrl.hashCode()) * 31) + this.fundingSourceAddressOkExplorerUrl.hashCode()) * 31) + this.fundingSourceLogo.hashCode()) * 31) + this.fundingSourceTime.hashCode()) * 31) + this.holderAddress.hashCode()) * 31) + this.holderAddressCreateTime.hashCode()) * 31) + this.holderAddressOkExplorerUrl.hashCode()) * 31) + this.nativeTokenHoldAmount.hashCode()) * 31) + this.nativeTokenSymbol.hashCode()) * 31) + this.tokenContractAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HolderInfoData(chainId=" + this.chainId + ", fundingSourceAddress=" + this.fundingSourceAddress + ", fundingSourceAddressNativeExplorerUrl=" + this.fundingSourceAddressNativeExplorerUrl + ", fundingSourceAddressOkExplorerUrl=" + this.fundingSourceAddressOkExplorerUrl + ", fundingSourceLogo=" + this.fundingSourceLogo + ", fundingSourceTime=" + this.fundingSourceTime + ", holderAddress=" + this.holderAddress + ", holderAddressCreateTime=" + this.holderAddressCreateTime + ", holderAddressOkExplorerUrl=" + this.holderAddressOkExplorerUrl + ", nativeTokenHoldAmount=" + this.nativeTokenHoldAmount + ", nativeTokenSymbol=" + this.nativeTokenSymbol + ", tokenContractAddress=" + this.tokenContractAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HolderInfoData> serializer() {
            return HolderInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HolderInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.fundingSourceAddress = "";
        } else {
            this.fundingSourceAddress = str2;
        }
        if ((i & 4) == 0) {
            this.fundingSourceAddressNativeExplorerUrl = "";
        } else {
            this.fundingSourceAddressNativeExplorerUrl = str3;
        }
        if ((i & 8) == 0) {
            this.fundingSourceAddressOkExplorerUrl = "";
        } else {
            this.fundingSourceAddressOkExplorerUrl = str4;
        }
        if ((i & 16) == 0) {
            this.fundingSourceLogo = "";
        } else {
            this.fundingSourceLogo = str5;
        }
        if ((i & 32) == 0) {
            this.fundingSourceTime = "";
        } else {
            this.fundingSourceTime = str6;
        }
        if ((i & 64) == 0) {
            this.holderAddress = "";
        } else {
            this.holderAddress = str7;
        }
        if ((i & 128) == 0) {
            this.holderAddressCreateTime = "";
        } else {
            this.holderAddressCreateTime = str8;
        }
        if ((i & 256) == 0) {
            this.holderAddressOkExplorerUrl = "";
        } else {
            this.holderAddressOkExplorerUrl = str9;
        }
        if ((i & 512) == 0) {
            this.nativeTokenHoldAmount = "";
        } else {
            this.nativeTokenHoldAmount = str10;
        }
        if ((i & 1024) == 0) {
            this.nativeTokenSymbol = "";
        } else {
            this.nativeTokenSymbol = str11;
        }
        if ((i & 2048) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(HolderInfoData holderInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) holderInfoData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, holderInfoData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) holderInfoData.fundingSourceAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, holderInfoData.fundingSourceAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) holderInfoData.fundingSourceAddressNativeExplorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, holderInfoData.fundingSourceAddressNativeExplorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) holderInfoData.fundingSourceAddressOkExplorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, holderInfoData.fundingSourceAddressOkExplorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) holderInfoData.fundingSourceLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, holderInfoData.fundingSourceLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) holderInfoData.fundingSourceTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, holderInfoData.fundingSourceTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) holderInfoData.holderAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, holderInfoData.holderAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) holderInfoData.holderAddressCreateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, holderInfoData.holderAddressCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) holderInfoData.holderAddressOkExplorerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, holderInfoData.holderAddressOkExplorerUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) holderInfoData.nativeTokenHoldAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, holderInfoData.nativeTokenHoldAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) holderInfoData.nativeTokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, holderInfoData.nativeTokenSymbol);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) holderInfoData.tokenContractAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, holderInfoData.tokenContractAddress);
    }

    public HolderInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        this.chainId = str;
        this.fundingSourceAddress = str2;
        this.fundingSourceAddressNativeExplorerUrl = str3;
        this.fundingSourceAddressOkExplorerUrl = str4;
        this.fundingSourceLogo = str5;
        this.fundingSourceTime = str6;
        this.holderAddress = str7;
        this.holderAddressCreateTime = str8;
        this.holderAddressOkExplorerUrl = str9;
        this.nativeTokenHoldAmount = str10;
        this.nativeTokenSymbol = str11;
        this.tokenContractAddress = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.holder_info.domain.model.HolderInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HolderInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }
}

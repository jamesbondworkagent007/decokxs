package com.okinc.business.market.features.meme.token_detail_sheet.domain.model;

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
public final class PumpLiveInfoData {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String tokenContractAddress;
    private final String tokenCreateTime;
    private final String tokenLiveDescription;
    private final String tokenLivePreviewUrl;
    private final String tokenLiveRepliesCount;
    private final String tokenLiveTitle;
    private final String tokenLiveUrl;
    private final String tokenLiveViewerCount;
    private final String tokenLogoUrl;
    private final String tokenName;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PumpLiveInfoData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("tokenCreateTime")
    public static /* synthetic */ void getTokenCreateTime$annotations() {
    }

    @SerialName("tokenLiveDescription")
    public static /* synthetic */ void getTokenLiveDescription$annotations() {
    }

    @SerialName("tokenLivePreviewUrl")
    public static /* synthetic */ void getTokenLivePreviewUrl$annotations() {
    }

    @SerialName("tokenLiveRepliesCount")
    public static /* synthetic */ void getTokenLiveRepliesCount$annotations() {
    }

    @SerialName("tokenLiveTitle")
    public static /* synthetic */ void getTokenLiveTitle$annotations() {
    }

    @SerialName("tokenLiveUrl")
    public static /* synthetic */ void getTokenLiveUrl$annotations() {
    }

    @SerialName("tokenLiveViewerCount")
    public static /* synthetic */ void getTokenLiveViewerCount$annotations() {
    }

    @SerialName("tokenLogoUrl")
    public static /* synthetic */ void getTokenLogoUrl$annotations() {
    }

    @SerialName("tokenName")
    public static /* synthetic */ void getTokenName$annotations() {
    }

    @SerialName("tokenSymbol")
    public static /* synthetic */ void getTokenSymbol$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenLiveDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLivePreviewUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenLiveRepliesCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenLiveTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLiveUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLiveViewerCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PumpLiveInfoData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        return new PumpLiveInfoData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PumpLiveInfoData)) {
            return false;
        }
        PumpLiveInfoData pumpLiveInfoData = (PumpLiveInfoData) obj;
        return Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) pumpLiveInfoData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenCreateTime, (Object) pumpLiveInfoData.tokenCreateTime) && Intrinsics.EZpvd((Object) this.tokenLiveDescription, (Object) pumpLiveInfoData.tokenLiveDescription) && Intrinsics.EZpvd((Object) this.tokenLivePreviewUrl, (Object) pumpLiveInfoData.tokenLivePreviewUrl) && Intrinsics.EZpvd((Object) this.tokenLiveRepliesCount, (Object) pumpLiveInfoData.tokenLiveRepliesCount) && Intrinsics.EZpvd((Object) this.tokenLiveTitle, (Object) pumpLiveInfoData.tokenLiveTitle) && Intrinsics.EZpvd((Object) this.tokenLiveUrl, (Object) pumpLiveInfoData.tokenLiveUrl) && Intrinsics.EZpvd((Object) this.tokenLiveViewerCount, (Object) pumpLiveInfoData.tokenLiveViewerCount) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) pumpLiveInfoData.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) pumpLiveInfoData.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) pumpLiveInfoData.tokenSymbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenCreateTime() {
        return this.tokenCreateTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLiveDescription() {
        return this.tokenLiveDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLivePreviewUrl() {
        return this.tokenLivePreviewUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLiveRepliesCount() {
        return this.tokenLiveRepliesCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLiveTitle() {
        return this.tokenLiveTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLiveUrl() {
        return this.tokenLiveUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLiveViewerCount() {
        return this.tokenLiveViewerCount;
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
        return (((((((((((((((((((this.tokenContractAddress.hashCode() * 31) + this.tokenCreateTime.hashCode()) * 31) + this.tokenLiveDescription.hashCode()) * 31) + this.tokenLivePreviewUrl.hashCode()) * 31) + this.tokenLiveRepliesCount.hashCode()) * 31) + this.tokenLiveTitle.hashCode()) * 31) + this.tokenLiveUrl.hashCode()) * 31) + this.tokenLiveViewerCount.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PumpLiveInfoData(tokenContractAddress=" + this.tokenContractAddress + ", tokenCreateTime=" + this.tokenCreateTime + ", tokenLiveDescription=" + this.tokenLiveDescription + ", tokenLivePreviewUrl=" + this.tokenLivePreviewUrl + ", tokenLiveRepliesCount=" + this.tokenLiveRepliesCount + ", tokenLiveTitle=" + this.tokenLiveTitle + ", tokenLiveUrl=" + this.tokenLiveUrl + ", tokenLiveViewerCount=" + this.tokenLiveViewerCount + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<PumpLiveInfoData> serializer() {
            return PumpLiveInfoData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ PumpLiveInfoData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str;
        }
        if ((i & 2) == 0) {
            this.tokenCreateTime = "";
        } else {
            this.tokenCreateTime = str2;
        }
        if ((i & 4) == 0) {
            this.tokenLiveDescription = "";
        } else {
            this.tokenLiveDescription = str3;
        }
        if ((i & 8) == 0) {
            this.tokenLivePreviewUrl = "";
        } else {
            this.tokenLivePreviewUrl = str4;
        }
        if ((i & 16) == 0) {
            this.tokenLiveRepliesCount = "";
        } else {
            this.tokenLiveRepliesCount = str5;
        }
        if ((i & 32) == 0) {
            this.tokenLiveTitle = "";
        } else {
            this.tokenLiveTitle = str6;
        }
        if ((i & 64) == 0) {
            this.tokenLiveUrl = "";
        } else {
            this.tokenLiveUrl = str7;
        }
        if ((i & 128) == 0) {
            this.tokenLiveViewerCount = "";
        } else {
            this.tokenLiveViewerCount = str8;
        }
        if ((i & 256) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str9;
        }
        if ((i & 512) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str10;
        }
        if ((i & 1024) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(PumpLiveInfoData pumpLiveInfoData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, pumpLiveInfoData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenCreateTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, pumpLiveInfoData.tokenCreateTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenLiveDescription, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, pumpLiveInfoData.tokenLiveDescription);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenLivePreviewUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, pumpLiveInfoData.tokenLivePreviewUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenLiveRepliesCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, pumpLiveInfoData.tokenLiveRepliesCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenLiveTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, pumpLiveInfoData.tokenLiveTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenLiveUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, pumpLiveInfoData.tokenLiveUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenLiveViewerCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, pumpLiveInfoData.tokenLiveViewerCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, pumpLiveInfoData.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, pumpLiveInfoData.tokenName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) pumpLiveInfoData.tokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, pumpLiveInfoData.tokenSymbol);
    }

    public PumpLiveInfoData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        this.tokenContractAddress = str;
        this.tokenCreateTime = str2;
        this.tokenLiveDescription = str3;
        this.tokenLivePreviewUrl = str4;
        this.tokenLiveRepliesCount = str5;
        this.tokenLiveTitle = str6;
        this.tokenLiveUrl = str7;
        this.tokenLiveViewerCount = str8;
        this.tokenLogoUrl = str9;
        this.tokenName = str10;
        this.tokenSymbol = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.token_detail_sheet.domain.model.PumpLiveInfoData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PumpLiveInfoData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "");
    }
}

package com.okinc.crcore.coreapi.net.responsebean.dex;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class BasicInfo {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final String chainLogoUrl;
    private final String chainName;
    private final String devCreateTokenCount;
    private final String devRugPullTokenCount;
    private final String isInternal;
    private final String isMeme;
    private final String isNativeToken;
    private final String isNotSupportTxNativeToken;
    private final String launchedTokenCount;
    private final String tokenContractAddress;
    private final String tokenName;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BasicInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.devCreateTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.devRugPullTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.isInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.isMeme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.isNotSupportTxNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.launchedTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BasicInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        return new BasicInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasicInfo)) {
            return false;
        }
        BasicInfo basicInfo = (BasicInfo) obj;
        return Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) basicInfo.chainLogoUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) basicInfo.chainName) && Intrinsics.EZpvd((Object) this.devCreateTokenCount, (Object) basicInfo.devCreateTokenCount) && Intrinsics.EZpvd((Object) this.devRugPullTokenCount, (Object) basicInfo.devRugPullTokenCount) && Intrinsics.EZpvd((Object) this.isInternal, (Object) basicInfo.isInternal) && Intrinsics.EZpvd((Object) this.isMeme, (Object) basicInfo.isMeme) && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) basicInfo.isNativeToken) && Intrinsics.EZpvd((Object) this.isNotSupportTxNativeToken, (Object) basicInfo.isNotSupportTxNativeToken) && Intrinsics.EZpvd((Object) this.launchedTokenCount, (Object) basicInfo.launchedTokenCount) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) basicInfo.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenName, (Object) basicInfo.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) basicInfo.tokenSymbol);
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
    public final String getDevCreateTokenCount() {
        return this.devCreateTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDevRugPullTokenCount() {
        return this.devRugPullTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLaunchedTokenCount() {
        return this.launchedTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
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
        return (((((((((((((((((((((this.chainLogoUrl.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.devCreateTokenCount.hashCode()) * 31) + this.devRugPullTokenCount.hashCode()) * 31) + this.isInternal.hashCode()) * 31) + this.isMeme.hashCode()) * 31) + this.isNativeToken.hashCode()) * 31) + this.isNotSupportTxNativeToken.hashCode()) * 31) + this.launchedTokenCount.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isInternal() {
        return this.isInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isMeme() {
        return this.isMeme;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isNotSupportTxNativeToken() {
        return this.isNotSupportTxNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BasicInfo(chainLogoUrl=" + this.chainLogoUrl + ", chainName=" + this.chainName + ", devCreateTokenCount=" + this.devCreateTokenCount + ", devRugPullTokenCount=" + this.devRugPullTokenCount + ", isInternal=" + this.isInternal + ", isMeme=" + this.isMeme + ", isNativeToken=" + this.isNativeToken + ", isNotSupportTxNativeToken=" + this.isNotSupportTxNativeToken + ", launchedTokenCount=" + this.launchedTokenCount + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.dex.BasicInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BasicInfo> serializer() {
            return BasicInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BasicInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainLogoUrl = "";
        } else {
            this.chainLogoUrl = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.devCreateTokenCount = "";
        } else {
            this.devCreateTokenCount = str3;
        }
        if ((i & 8) == 0) {
            this.devRugPullTokenCount = "";
        } else {
            this.devRugPullTokenCount = str4;
        }
        if ((i & 16) == 0) {
            this.isInternal = "";
        } else {
            this.isInternal = str5;
        }
        if ((i & 32) == 0) {
            this.isMeme = "";
        } else {
            this.isMeme = str6;
        }
        if ((i & 64) == 0) {
            this.isNativeToken = "";
        } else {
            this.isNativeToken = str7;
        }
        if ((i & 128) == 0) {
            this.isNotSupportTxNativeToken = "";
        } else {
            this.isNotSupportTxNativeToken = str8;
        }
        if ((i & 256) == 0) {
            this.launchedTokenCount = "";
        } else {
            this.launchedTokenCount = str9;
        }
        if ((i & 512) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str10;
        }
        if ((i & 1024) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str11;
        }
        if ((i & 2048) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(BasicInfo basicInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) basicInfo.chainLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, basicInfo.chainLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) basicInfo.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, basicInfo.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) basicInfo.devCreateTokenCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, basicInfo.devCreateTokenCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) basicInfo.devRugPullTokenCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, basicInfo.devRugPullTokenCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) basicInfo.isInternal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, basicInfo.isInternal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) basicInfo.isMeme, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, basicInfo.isMeme);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) basicInfo.isNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, basicInfo.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) basicInfo.isNotSupportTxNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, basicInfo.isNotSupportTxNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) basicInfo.launchedTokenCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, basicInfo.launchedTokenCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) basicInfo.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, basicInfo.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) basicInfo.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, basicInfo.tokenName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) basicInfo.tokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, basicInfo.tokenSymbol);
    }

    public BasicInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12) {
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
        this.chainLogoUrl = str;
        this.chainName = str2;
        this.devCreateTokenCount = str3;
        this.devRugPullTokenCount = str4;
        this.isInternal = str5;
        this.isMeme = str6;
        this.isNativeToken = str7;
        this.isNotSupportTxNativeToken = str8;
        this.launchedTokenCount = str9;
        this.tokenContractAddress = str10;
        this.tokenName = str11;
        this.tokenSymbol = str12;
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:26) call: com.okinc.crcore.coreapi.net.responsebean.dex.BasicInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BasicInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) == 0 ? str12 : "");
    }
}

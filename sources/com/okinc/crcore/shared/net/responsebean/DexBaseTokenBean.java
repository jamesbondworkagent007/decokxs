package com.okinc.crcore.shared.net.responsebean;

import com.okinc.crcore.coreapi.net.responsebean.dex.DexBaseTokenResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class DexBaseTokenBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
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
    public final DexBaseTokenBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i) {
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
        return new DexBaseTokenBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DexBaseTokenBean)) {
            return false;
        }
        DexBaseTokenBean dexBaseTokenBean = (DexBaseTokenBean) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexBaseTokenBean.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexBaseTokenBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) dexBaseTokenBean.chainLogoUrl) && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) dexBaseTokenBean.isNativeToken) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexBaseTokenBean.riskLevel) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) dexBaseTokenBean.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.tokenName, (Object) dexBaseTokenBean.tokenName) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) dexBaseTokenBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) dexBaseTokenBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.decimals, (Object) dexBaseTokenBean.decimals) && this.innerOuterStatus == dexBaseTokenBean.innerOuterStatus;
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
        return "DexBaseTokenBean(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogoUrl=" + this.chainLogoUrl + ", isNativeToken=" + this.isNativeToken + ", riskLevel=" + this.riskLevel + ", tokenLogoUrl=" + this.tokenLogoUrl + ", tokenName=" + this.tokenName + ", tokenSymbol=" + this.tokenSymbol + ", tokenContractAddress=" + this.tokenContractAddress + ", decimals=" + this.decimals + ", innerOuterStatus=" + this.innerOuterStatus + ")";
    }

    public /* synthetic */ DexBaseTokenBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.throwMissingFieldException(i, 2047, DexBaseTokenBean$$serializer.INSTANCE.getDescriptor());
        }
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
        this.innerOuterStatus = i2;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexBaseTokenBean dexBaseTokenBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, dexBaseTokenBean.chainIndex);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, dexBaseTokenBean.chainName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, dexBaseTokenBean.chainLogoUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, dexBaseTokenBean.isNativeToken);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, dexBaseTokenBean.riskLevel);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, dexBaseTokenBean.tokenLogoUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 6, dexBaseTokenBean.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 7, dexBaseTokenBean.tokenSymbol);
        compositeEncoder.encodeStringElement(serialDescriptor, 8, dexBaseTokenBean.tokenContractAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 9, dexBaseTokenBean.decimals);
        compositeEncoder.encodeIntElement(serialDescriptor, 10, dexBaseTokenBean.innerOuterStatus);
    }

    public DexBaseTokenBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, int i) {
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

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.DexBaseTokenBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexBaseTokenBean> serializer() {
            return DexBaseTokenBean$$serializer.INSTANCE;
        }

        public final DexBaseTokenBean KWHzl(@NotNull DexBaseTokenResponse dexBaseTokenResponse) {
            Intrinsics.checkNotNullParameter(dexBaseTokenResponse, "");
            return new DexBaseTokenBean(dexBaseTokenResponse.getChainIndex(), dexBaseTokenResponse.getChainName(), dexBaseTokenResponse.getChainLogoUrl(), dexBaseTokenResponse.isNativeToken(), dexBaseTokenResponse.getRiskLevel(), dexBaseTokenResponse.getTokenLogoUrl(), dexBaseTokenResponse.getTokenName(), dexBaseTokenResponse.getTokenSymbol(), dexBaseTokenResponse.getTokenContractAddress(), dexBaseTokenResponse.getDecimals(), dexBaseTokenResponse.getInnerOuterStatus());
        }
    }
}

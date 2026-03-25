package com.okinc.business.web3pay.lib.features.asset.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class AssetTokenData {
    private final String masterCurrencyId;
    private final String tokenAmount;
    private final int tokenDecimal;
    private final List<TokenDetailInfo> tokenDetails;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenSymbolTicker;
    private final String usdAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, new ArrayListSerializer(TokenDetailInfo$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenDetailInfo> component8() {
        return this.tokenDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AssetTokenData copy(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull List<TokenDetailInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new AssetTokenData(str, i, str2, str3, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetTokenData)) {
            return false;
        }
        AssetTokenData assetTokenData = (AssetTokenData) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbolTicker, (Object) assetTokenData.tokenSymbolTicker) && this.tokenDecimal == assetTokenData.tokenDecimal && Intrinsics.EZpvd((Object) this.tokenName, (Object) assetTokenData.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) assetTokenData.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenAmount, (Object) assetTokenData.tokenAmount) && Intrinsics.EZpvd((Object) this.usdAmount, (Object) assetTokenData.usdAmount) && Intrinsics.EZpvd((Object) this.masterCurrencyId, (Object) assetTokenData.masterCurrencyId) && Intrinsics.EZpvd(this.tokenDetails, assetTokenData.tokenDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMasterCurrencyId() {
        return this.masterCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAmount() {
        return this.tokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTokenDecimal() {
        return this.tokenDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TokenDetailInfo> getTokenDetails() {
        return this.tokenDetails;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbolTicker() {
        return this.tokenSymbolTicker;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdAmount() {
        return this.usdAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenSymbolTicker.hashCode();
        int iHashCode2 = Integer.hashCode(this.tokenDecimal);
        int iHashCode3 = this.tokenName.hashCode();
        int iHashCode4 = this.tokenLogo.hashCode();
        int iHashCode5 = this.tokenAmount.hashCode();
        int iHashCode6 = this.usdAmount.hashCode();
        String str = this.masterCurrencyId;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.tokenDetails.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AssetTokenData(tokenSymbolTicker=" + this.tokenSymbolTicker + ", tokenDecimal=" + this.tokenDecimal + ", tokenName=" + this.tokenName + ", tokenLogo=" + this.tokenLogo + ", tokenAmount=" + this.tokenAmount + ", usdAmount=" + this.usdAmount + ", masterCurrencyId=" + this.masterCurrencyId + ", tokenDetails=" + this.tokenDetails + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.features.asset.model.AssetTokenData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetTokenData> serializer() {
            return AssetTokenData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ AssetTokenData(int i, String str, int i2, String str2, String str3, String str4, String str5, String str6, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i, 255, AssetTokenData$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenSymbolTicker = str;
        this.tokenDecimal = i2;
        this.tokenName = str2;
        this.tokenLogo = str3;
        this.tokenAmount = str4;
        this.usdAmount = str5;
        this.masterCurrencyId = str6;
        this.tokenDetails = list;
    }

    public static final /* synthetic */ void write$Self$OKPayCore_web3pay_lib(AssetTokenData assetTokenData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, assetTokenData.tokenSymbolTicker);
        compositeEncoder.encodeIntElement(serialDescriptor, 1, assetTokenData.tokenDecimal);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, assetTokenData.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, assetTokenData.tokenLogo);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, assetTokenData.tokenAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, assetTokenData.usdAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, assetTokenData.masterCurrencyId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 7, kSerializerArr[7], assetTokenData.tokenDetails);
    }

    public AssetTokenData(@NotNull String str, int i, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, String str6, @NotNull List<TokenDetailInfo> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.tokenSymbolTicker = str;
        this.tokenDecimal = i;
        this.tokenName = str2;
        this.tokenLogo = str3;
        this.tokenAmount = str4;
        this.usdAmount = str5;
        this.masterCurrencyId = str6;
        this.tokenDetails = list;
    }
}

package com.okinc.business.market.data.model;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.common.constants.StringBooleanType;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class HomeFavoriteTokenData {
    public final String chainBWLogoUrl;
    public final String chainId;
    public final String chainLogo;
    public final String change;
    public final String change1H;
    public final String change4H;
    public final String change5M;
    public final String collectionId;
    public final String firstPriceTime;
    public final String holders;
    public final String isNativeToken;
    public final StringBooleanType isRecommendedToken;
    public final String isTxPrice;
    public final String liquidity;
    public final String marketCap;
    public final List<CompactTagData> newTagList;
    public final String price;
    public final String riskControlLevel;
    public final String tokenContractAddress;
    public final String tokenLogoUrl;
    public final String tokenName;
    public final String tokenSymbol;
    public final String txs;
    public final String txs1H;
    public final String txs4H;
    public final String txs5M;
    public final String txsBuy;
    public final String txsBuy1H;
    public final String txsBuy4H;
    public final String txsBuy5M;
    public final String txsSell;
    public final String txsSell1H;
    public final String txsSell4H;
    public final String txsSell5M;
    public final String uniqueTraders;
    public final String uniqueTraders1H;
    public final String uniqueTraders4H;
    public final String uniqueTraders5M;
    public final String volume;
    public final String volume1H;
    public final String volume4H;
    public final String volume5M;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, StringBooleanType.Companion.serializer(), null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeFavoriteTokenData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (StringBooleanType) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, -1, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.collectionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.firstPriceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTelauCTel() {
        return this.txsBuy4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AubY() {
        return this.txsBuy5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AwvSrB() {
        return this.uniqueTraders1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AxsJAY() {
        return this.uniqueTraders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DTwDnp() {
        return this.uniqueTraders5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.chainBWLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeFavoriteTokenData KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull StringBooleanType stringBooleanType, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull List<CompactTagData> list) {
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
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new HomeFavoriteTokenData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, stringBooleanType, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ORxRYg() {
        return this.volume4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OcIXYQ() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QKVWgx() {
        return this.volume1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QOLQEE() {
        return this.volume5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StringBooleanType QUSxYX() {
        return this.isRecommendedToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QbewEr() {
        return this.isTxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QfsBiF() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.change1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.riskControlLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeFavoriteTokenData)) {
            return false;
        }
        HomeFavoriteTokenData homeFavoriteTokenData = (HomeFavoriteTokenData) obj;
        return Intrinsics.EZpvd((Object) this.collectionId, (Object) homeFavoriteTokenData.collectionId) && Intrinsics.EZpvd((Object) this.chainId, (Object) homeFavoriteTokenData.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) homeFavoriteTokenData.tokenContractAddress) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) homeFavoriteTokenData.chainLogo) && Intrinsics.EZpvd((Object) this.chainBWLogoUrl, (Object) homeFavoriteTokenData.chainBWLogoUrl) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) homeFavoriteTokenData.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) homeFavoriteTokenData.tokenName) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) homeFavoriteTokenData.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.riskControlLevel, (Object) homeFavoriteTokenData.riskControlLevel) && Intrinsics.EZpvd((Object) this.volume5M, (Object) homeFavoriteTokenData.volume5M) && Intrinsics.EZpvd((Object) this.volume1H, (Object) homeFavoriteTokenData.volume1H) && Intrinsics.EZpvd((Object) this.volume4H, (Object) homeFavoriteTokenData.volume4H) && Intrinsics.EZpvd((Object) this.volume, (Object) homeFavoriteTokenData.volume) && Intrinsics.EZpvd((Object) this.change5M, (Object) homeFavoriteTokenData.change5M) && Intrinsics.EZpvd((Object) this.change1H, (Object) homeFavoriteTokenData.change1H) && Intrinsics.EZpvd((Object) this.change4H, (Object) homeFavoriteTokenData.change4H) && Intrinsics.EZpvd((Object) this.change, (Object) homeFavoriteTokenData.change) && Intrinsics.EZpvd((Object) this.price, (Object) homeFavoriteTokenData.price) && Intrinsics.EZpvd((Object) this.txs5M, (Object) homeFavoriteTokenData.txs5M) && Intrinsics.EZpvd((Object) this.txs1H, (Object) homeFavoriteTokenData.txs1H) && Intrinsics.EZpvd((Object) this.txs4H, (Object) homeFavoriteTokenData.txs4H) && Intrinsics.EZpvd((Object) this.txs, (Object) homeFavoriteTokenData.txs) && Intrinsics.EZpvd((Object) this.uniqueTraders5M, (Object) homeFavoriteTokenData.uniqueTraders5M) && Intrinsics.EZpvd((Object) this.uniqueTraders1H, (Object) homeFavoriteTokenData.uniqueTraders1H) && Intrinsics.EZpvd((Object) this.uniqueTraders4H, (Object) homeFavoriteTokenData.uniqueTraders4H) && Intrinsics.EZpvd((Object) this.uniqueTraders, (Object) homeFavoriteTokenData.uniqueTraders) && Intrinsics.EZpvd((Object) this.marketCap, (Object) homeFavoriteTokenData.marketCap) && Intrinsics.EZpvd((Object) this.liquidity, (Object) homeFavoriteTokenData.liquidity) && Intrinsics.EZpvd((Object) this.firstPriceTime, (Object) homeFavoriteTokenData.firstPriceTime) && Intrinsics.EZpvd((Object) this.isTxPrice, (Object) homeFavoriteTokenData.isTxPrice) && this.isRecommendedToken == homeFavoriteTokenData.isRecommendedToken && Intrinsics.EZpvd((Object) this.holders, (Object) homeFavoriteTokenData.holders) && Intrinsics.EZpvd((Object) this.txsBuy5M, (Object) homeFavoriteTokenData.txsBuy5M) && Intrinsics.EZpvd((Object) this.txsBuy1H, (Object) homeFavoriteTokenData.txsBuy1H) && Intrinsics.EZpvd((Object) this.txsBuy4H, (Object) homeFavoriteTokenData.txsBuy4H) && Intrinsics.EZpvd((Object) this.txsBuy, (Object) homeFavoriteTokenData.txsBuy) && Intrinsics.EZpvd((Object) this.txsSell5M, (Object) homeFavoriteTokenData.txsSell5M) && Intrinsics.EZpvd((Object) this.txsSell1H, (Object) homeFavoriteTokenData.txsSell1H) && Intrinsics.EZpvd((Object) this.txsSell4H, (Object) homeFavoriteTokenData.txsSell4H) && Intrinsics.EZpvd((Object) this.txsSell, (Object) homeFavoriteTokenData.txsSell) && Intrinsics.EZpvd((Object) this.isNativeToken, (Object) homeFavoriteTokenData.isNativeToken) && Intrinsics.EZpvd(this.newTagList, homeFavoriteTokenData.newTagList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.change4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gHZMYf() {
        return this.uniqueTraders4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.txsBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.txs1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.txs4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.collectionId.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.chainBWLogoUrl.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenLogoUrl.hashCode()) * 31) + this.riskControlLevel.hashCode()) * 31) + this.volume5M.hashCode()) * 31) + this.volume1H.hashCode()) * 31) + this.volume4H.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.change5M.hashCode()) * 31) + this.change1H.hashCode()) * 31) + this.change4H.hashCode()) * 31) + this.change.hashCode()) * 31) + this.price.hashCode()) * 31) + this.txs5M.hashCode()) * 31) + this.txs1H.hashCode()) * 31) + this.txs4H.hashCode()) * 31) + this.txs.hashCode()) * 31) + this.uniqueTraders5M.hashCode()) * 31) + this.uniqueTraders1H.hashCode()) * 31) + this.uniqueTraders4H.hashCode()) * 31) + this.uniqueTraders.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.firstPriceTime.hashCode()) * 31) + this.isTxPrice.hashCode()) * 31) + this.isRecommendedToken.hashCode()) * 31) + this.holders.hashCode()) * 31) + this.txsBuy5M.hashCode()) * 31) + this.txsBuy1H.hashCode()) * 31) + this.txsBuy4H.hashCode()) * 31) + this.txsBuy.hashCode()) * 31) + this.txsSell5M.hashCode()) * 31) + this.txsSell1H.hashCode()) * 31) + this.txsSell4H.hashCode()) * 31) + this.txsSell.hashCode()) * 31) + this.isNativeToken.hashCode()) * 31) + this.newTagList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> isConnected() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.txs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String sSMYrx() {
        return this.txsSell5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeFavoriteTokenData(collectionId=" + this.collectionId + ", chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", chainLogo=" + this.chainLogo + ", chainBWLogoUrl=" + this.chainBWLogoUrl + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenLogoUrl=" + this.tokenLogoUrl + ", riskControlLevel=" + this.riskControlLevel + ", volume5M=" + this.volume5M + ", volume1H=" + this.volume1H + ", volume4H=" + this.volume4H + ", volume=" + this.volume + ", change5M=" + this.change5M + ", change1H=" + this.change1H + ", change4H=" + this.change4H + ", change=" + this.change + ", price=" + this.price + ", txs5M=" + this.txs5M + ", txs1H=" + this.txs1H + ", txs4H=" + this.txs4H + ", txs=" + this.txs + ", uniqueTraders5M=" + this.uniqueTraders5M + ", uniqueTraders1H=" + this.uniqueTraders1H + ", uniqueTraders4H=" + this.uniqueTraders4H + ", uniqueTraders=" + this.uniqueTraders + ", marketCap=" + this.marketCap + ", liquidity=" + this.liquidity + ", firstPriceTime=" + this.firstPriceTime + ", isTxPrice=" + this.isTxPrice + ", isRecommendedToken=" + this.isRecommendedToken + ", holders=" + this.holders + ", txsBuy5M=" + this.txsBuy5M + ", txsBuy1H=" + this.txsBuy1H + ", txsBuy4H=" + this.txsBuy4H + ", txsBuy=" + this.txsBuy + ", txsSell5M=" + this.txsSell5M + ", txsSell1H=" + this.txsSell1H + ", txsSell4H=" + this.txsSell4H + ", txsSell=" + this.txsSell + ", isNativeToken=" + this.isNativeToken + ", newTagList=" + this.newTagList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.txs5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.change5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String wlaJM() {
        return this.txsSell1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.txsBuy1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zsXlph() {
        return this.txsSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zuBGHE() {
        return this.txsSell4H;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.data.model.HomeFavoriteTokenData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HomeFavoriteTokenData> serializer() {
            return HomeFavoriteTokenData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HomeFavoriteTokenData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, StringBooleanType stringBooleanType, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.collectionId = "";
        } else {
            this.collectionId = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
        if ((i & 8) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str4;
        }
        if ((i & 16) == 0) {
            this.chainBWLogoUrl = "";
        } else {
            this.chainBWLogoUrl = str5;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
        if ((i & 64) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str7;
        }
        if ((i & 128) == 0) {
            this.tokenLogoUrl = "";
        } else {
            this.tokenLogoUrl = str8;
        }
        if ((i & 256) == 0) {
            this.riskControlLevel = "";
        } else {
            this.riskControlLevel = str9;
        }
        if ((i & 512) == 0) {
            this.volume5M = "";
        } else {
            this.volume5M = str10;
        }
        if ((i & 1024) == 0) {
            this.volume1H = "";
        } else {
            this.volume1H = str11;
        }
        if ((i & 2048) == 0) {
            this.volume4H = "";
        } else {
            this.volume4H = str12;
        }
        if ((i & 4096) == 0) {
            this.volume = "";
        } else {
            this.volume = str13;
        }
        if ((i & 8192) == 0) {
            this.change5M = "";
        } else {
            this.change5M = str14;
        }
        if ((i & 16384) == 0) {
            this.change1H = "";
        } else {
            this.change1H = str15;
        }
        if ((32768 & i) == 0) {
            this.change4H = "";
        } else {
            this.change4H = str16;
        }
        if ((65536 & i) == 0) {
            this.change = "";
        } else {
            this.change = str17;
        }
        if ((131072 & i) == 0) {
            this.price = "";
        } else {
            this.price = str18;
        }
        if ((262144 & i) == 0) {
            this.txs5M = "";
        } else {
            this.txs5M = str19;
        }
        if ((524288 & i) == 0) {
            this.txs1H = "";
        } else {
            this.txs1H = str20;
        }
        if ((1048576 & i) == 0) {
            this.txs4H = "";
        } else {
            this.txs4H = str21;
        }
        if ((2097152 & i) == 0) {
            this.txs = "";
        } else {
            this.txs = str22;
        }
        if ((4194304 & i) == 0) {
            this.uniqueTraders5M = "";
        } else {
            this.uniqueTraders5M = str23;
        }
        if ((8388608 & i) == 0) {
            this.uniqueTraders1H = "";
        } else {
            this.uniqueTraders1H = str24;
        }
        if ((16777216 & i) == 0) {
            this.uniqueTraders4H = "";
        } else {
            this.uniqueTraders4H = str25;
        }
        if ((33554432 & i) == 0) {
            this.uniqueTraders = "";
        } else {
            this.uniqueTraders = str26;
        }
        if ((67108864 & i) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str27;
        }
        if ((134217728 & i) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str28;
        }
        if ((268435456 & i) == 0) {
            this.firstPriceTime = "";
        } else {
            this.firstPriceTime = str29;
        }
        if ((536870912 & i) == 0) {
            this.isTxPrice = "";
        } else {
            this.isTxPrice = str30;
        }
        this.isRecommendedToken = (1073741824 & i) == 0 ? StringBooleanType.FALSE : stringBooleanType;
        if ((i & Integer.MIN_VALUE) == 0) {
            this.holders = "";
        } else {
            this.holders = str31;
        }
        if ((i2 & 1) == 0) {
            this.txsBuy5M = "";
        } else {
            this.txsBuy5M = str32;
        }
        if ((i2 & 2) == 0) {
            this.txsBuy1H = "";
        } else {
            this.txsBuy1H = str33;
        }
        if ((i2 & 4) == 0) {
            this.txsBuy4H = "";
        } else {
            this.txsBuy4H = str34;
        }
        if ((i2 & 8) == 0) {
            this.txsBuy = "";
        } else {
            this.txsBuy = str35;
        }
        if ((i2 & 16) == 0) {
            this.txsSell5M = "";
        } else {
            this.txsSell5M = str36;
        }
        if ((i2 & 32) == 0) {
            this.txsSell1H = "";
        } else {
            this.txsSell1H = str37;
        }
        if ((i2 & 64) == 0) {
            this.txsSell4H = "";
        } else {
            this.txsSell4H = str38;
        }
        if ((i2 & 128) == 0) {
            this.txsSell = "";
        } else {
            this.txsSell = str39;
        }
        if ((i2 & 256) == 0) {
            this.isNativeToken = "";
        } else {
            this.isNativeToken = str40;
        }
        this.newTagList = (i2 & 512) == 0 ? yDY.AhwBna() : list;
    }

    public static final /* synthetic */ void EZpvd(HomeFavoriteTokenData homeFavoriteTokenData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.collectionId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, homeFavoriteTokenData.collectionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, homeFavoriteTokenData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, homeFavoriteTokenData.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, homeFavoriteTokenData.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.chainBWLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, homeFavoriteTokenData.chainBWLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, homeFavoriteTokenData.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, homeFavoriteTokenData.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.tokenLogoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, homeFavoriteTokenData.tokenLogoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.riskControlLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, homeFavoriteTokenData.riskControlLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.volume5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, homeFavoriteTokenData.volume5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.volume1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, homeFavoriteTokenData.volume1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.volume4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, homeFavoriteTokenData.volume4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, homeFavoriteTokenData.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.change5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, homeFavoriteTokenData.change5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.change1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, homeFavoriteTokenData.change1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.change4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, homeFavoriteTokenData.change4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, homeFavoriteTokenData.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, homeFavoriteTokenData.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txs5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, homeFavoriteTokenData.txs5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txs1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, homeFavoriteTokenData.txs1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txs4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, homeFavoriteTokenData.txs4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, homeFavoriteTokenData.txs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.uniqueTraders5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, homeFavoriteTokenData.uniqueTraders5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.uniqueTraders1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, homeFavoriteTokenData.uniqueTraders1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.uniqueTraders4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, homeFavoriteTokenData.uniqueTraders4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.uniqueTraders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, homeFavoriteTokenData.uniqueTraders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, homeFavoriteTokenData.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, homeFavoriteTokenData.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.firstPriceTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, homeFavoriteTokenData.firstPriceTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.isTxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, homeFavoriteTokenData.isTxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || homeFavoriteTokenData.isRecommendedToken != StringBooleanType.FALSE) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 30, kSerializerArr[30], homeFavoriteTokenData.isRecommendedToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, homeFavoriteTokenData.holders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txsBuy5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, homeFavoriteTokenData.txsBuy5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txsBuy1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, homeFavoriteTokenData.txsBuy1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txsBuy4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, homeFavoriteTokenData.txsBuy4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txsBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, homeFavoriteTokenData.txsBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txsSell5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, homeFavoriteTokenData.txsSell5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txsSell1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, homeFavoriteTokenData.txsSell1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txsSell4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, homeFavoriteTokenData.txsSell4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.txsSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, homeFavoriteTokenData.txsSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) homeFavoriteTokenData.isNativeToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, homeFavoriteTokenData.isNativeToken);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) && Intrinsics.EZpvd(homeFavoriteTokenData.newTagList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 41, kSerializerArr[41], homeFavoriteTokenData.newTagList);
    }

    public HomeFavoriteTokenData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull StringBooleanType stringBooleanType, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull List<CompactTagData> list) {
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
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(stringBooleanType, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.collectionId = str;
        this.chainId = str2;
        this.tokenContractAddress = str3;
        this.chainLogo = str4;
        this.chainBWLogoUrl = str5;
        this.tokenSymbol = str6;
        this.tokenName = str7;
        this.tokenLogoUrl = str8;
        this.riskControlLevel = str9;
        this.volume5M = str10;
        this.volume1H = str11;
        this.volume4H = str12;
        this.volume = str13;
        this.change5M = str14;
        this.change1H = str15;
        this.change4H = str16;
        this.change = str17;
        this.price = str18;
        this.txs5M = str19;
        this.txs1H = str20;
        this.txs4H = str21;
        this.txs = str22;
        this.uniqueTraders5M = str23;
        this.uniqueTraders1H = str24;
        this.uniqueTraders4H = str25;
        this.uniqueTraders = str26;
        this.marketCap = str27;
        this.liquidity = str28;
        this.firstPriceTime = str29;
        this.isTxPrice = str30;
        this.isRecommendedToken = stringBooleanType;
        this.holders = str31;
        this.txsBuy5M = str32;
        this.txsBuy1H = str33;
        this.txsBuy4H = str34;
        this.txsBuy = str35;
        this.txsSell5M = str36;
        this.txsSell1H = str37;
        this.txsSell4H = str38;
        this.txsSell = str39;
        this.isNativeToken = str40;
        this.newTagList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01f6: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r84v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r84v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r84v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r84v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r84v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r84v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r84v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r84v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r84v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r84v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r84v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r84v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r84v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r84v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r84v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r84v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r84v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r84v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r84v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r84v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r84v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r84v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r84v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r84v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r84v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r84v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r84v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r84v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r84v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r84v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:com.okinc.business.market.common.constants.StringBooleanType:?: TERNARY null = ((wrap:int:0x012c: ARITH (r84v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0130: SGET  A[WRAPPED] (LINE:70) com.okinc.business.market.common.constants.StringBooleanType.FALSE com.okinc.business.market.common.constants.StringBooleanType) : (r72v0 com.okinc.business.market.common.constants.StringBooleanType))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r84v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r85v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r85v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r85v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015b: ARITH (r85v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0164: ARITH (r85v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016d: ARITH (r85v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r85v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:0x018a: TERNARY null = ((wrap:int:0x0181: ARITH (r85v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x018c: ARITH (r85v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0195: ARITH (r85v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0199: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:92)) : (r83v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>):void (m)] (LINE:8) call: com.okinc.business.market.data.model.HomeFavoriteTokenData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.okinc.business.market.common.constants.StringBooleanType, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ HomeFavoriteTokenData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, StringBooleanType stringBooleanType, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? StringBooleanType.FALSE : stringBooleanType, (i & Integer.MIN_VALUE) != 0 ? "" : str31, (i2 & 1) != 0 ? "" : str32, (i2 & 2) != 0 ? "" : str33, (i2 & 4) != 0 ? "" : str34, (i2 & 8) != 0 ? "" : str35, (i2 & 16) != 0 ? "" : str36, (i2 & 32) != 0 ? "" : str37, (i2 & 64) != 0 ? "" : str38, (i2 & 128) != 0 ? "" : str39, (i2 & 256) != 0 ? "" : str40, (i2 & 512) != 0 ? yDY.AhwBna() : list);
    }
}

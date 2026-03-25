package com.okinc.business.dexlogic.main.swap.ws.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.business.market.data.model.CompactTagData;
import com.okinc.business.market.data.model.CompactTagData$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class MarketTxWsInfoItemBean {
    public final String chainId;
    public final String change;
    public final String change1H;
    public final String change4H;
    public final String change5M;
    public final String circulatingSupply;
    public final String devCreateTokenCount;
    public final String devHoldingRatio;
    public final String firstPriceTime;
    public final String holders;
    public final String launchedTokenCount;
    public final String liquidity;
    public final String marketCap;
    public final String maxPrice;
    public final String maxSupply;
    public final String minPrice;
    public final List<CompactTagData> newTagList;
    public final String price;
    public final String progress;
    public final String sniperHoldingRatio;
    public final String snipersClear;
    public final String snipersTotal;
    public final String suspiciousRatio;
    public final String tokenContractAddress;
    public final String tokenFee;
    public final String top10HoldAmountPercentage;
    public final String totalEarlyBuyerAmount;
    public final String tradeNum;
    public final String txs;
    public final String txs1H;
    public final String txs4H;
    public final String txs5M;
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
    public static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(CompactTagData$$serializer.INSTANCE), null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketTxWsInfoItemBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, -1, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketTxWsInfoItemBean AEQbTJ(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, String str30, String str31, String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull List<CompactTagData> list, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39) {
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
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        return new MarketTxWsInfoItemBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, list, str36, str37, str38, str39);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.change5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTelauCTel() {
        return this.tokenFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AubY() {
        return this.top10HoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AwvSrB() {
        return this.uniqueTraders1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AxsJAY() {
        return this.txs5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DTwDnp() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.change1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.change4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ORxRYg() {
        return this.volume1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OcIXYQ() {
        return this.volume4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QKVWgx() {
        return this.uniqueTraders5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QOLQEE() {
        return this.uniqueTraders4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String QfsBiF() {
        return this.volume5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.devCreateTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CompactTagData> ejfBZ() {
        return this.newTagList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketTxWsInfoItemBean)) {
            return false;
        }
        MarketTxWsInfoItemBean marketTxWsInfoItemBean = (MarketTxWsInfoItemBean) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) marketTxWsInfoItemBean.chainId) && Intrinsics.EZpvd((Object) this.change, (Object) marketTxWsInfoItemBean.change) && Intrinsics.EZpvd((Object) this.change1H, (Object) marketTxWsInfoItemBean.change1H) && Intrinsics.EZpvd((Object) this.change4H, (Object) marketTxWsInfoItemBean.change4H) && Intrinsics.EZpvd((Object) this.change5M, (Object) marketTxWsInfoItemBean.change5M) && Intrinsics.EZpvd((Object) this.firstPriceTime, (Object) marketTxWsInfoItemBean.firstPriceTime) && Intrinsics.EZpvd((Object) this.progress, (Object) marketTxWsInfoItemBean.progress) && Intrinsics.EZpvd((Object) this.snipersClear, (Object) marketTxWsInfoItemBean.snipersClear) && Intrinsics.EZpvd((Object) this.snipersTotal, (Object) marketTxWsInfoItemBean.snipersTotal) && Intrinsics.EZpvd((Object) this.suspiciousRatio, (Object) marketTxWsInfoItemBean.suspiciousRatio) && Intrinsics.EZpvd((Object) this.txs1H, (Object) marketTxWsInfoItemBean.txs1H) && Intrinsics.EZpvd((Object) this.txs4H, (Object) marketTxWsInfoItemBean.txs4H) && Intrinsics.EZpvd((Object) this.txs5M, (Object) marketTxWsInfoItemBean.txs5M) && Intrinsics.EZpvd((Object) this.uniqueTraders, (Object) marketTxWsInfoItemBean.uniqueTraders) && Intrinsics.EZpvd((Object) this.uniqueTraders1H, (Object) marketTxWsInfoItemBean.uniqueTraders1H) && Intrinsics.EZpvd((Object) this.uniqueTraders4H, (Object) marketTxWsInfoItemBean.uniqueTraders4H) && Intrinsics.EZpvd((Object) this.uniqueTraders5M, (Object) marketTxWsInfoItemBean.uniqueTraders5M) && Intrinsics.EZpvd((Object) this.volume1H, (Object) marketTxWsInfoItemBean.volume1H) && Intrinsics.EZpvd((Object) this.volume4H, (Object) marketTxWsInfoItemBean.volume4H) && Intrinsics.EZpvd((Object) this.volume5M, (Object) marketTxWsInfoItemBean.volume5M) && Intrinsics.EZpvd((Object) this.marketCap, (Object) marketTxWsInfoItemBean.marketCap) && Intrinsics.EZpvd((Object) this.maxPrice, (Object) marketTxWsInfoItemBean.maxPrice) && Intrinsics.EZpvd((Object) this.minPrice, (Object) marketTxWsInfoItemBean.minPrice) && Intrinsics.EZpvd((Object) this.price, (Object) marketTxWsInfoItemBean.price) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) marketTxWsInfoItemBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) marketTxWsInfoItemBean.tradeNum) && Intrinsics.EZpvd((Object) this.txs, (Object) marketTxWsInfoItemBean.txs) && Intrinsics.EZpvd((Object) this.volume, (Object) marketTxWsInfoItemBean.volume) && Intrinsics.EZpvd((Object) this.liquidity, (Object) marketTxWsInfoItemBean.liquidity) && Intrinsics.EZpvd((Object) this.holders, (Object) marketTxWsInfoItemBean.holders) && Intrinsics.EZpvd((Object) this.circulatingSupply, (Object) marketTxWsInfoItemBean.circulatingSupply) && Intrinsics.EZpvd((Object) this.maxSupply, (Object) marketTxWsInfoItemBean.maxSupply) && Intrinsics.EZpvd((Object) this.top10HoldAmountPercentage, (Object) marketTxWsInfoItemBean.top10HoldAmountPercentage) && Intrinsics.EZpvd((Object) this.totalEarlyBuyerAmount, (Object) marketTxWsInfoItemBean.totalEarlyBuyerAmount) && Intrinsics.EZpvd((Object) this.devHoldingRatio, (Object) marketTxWsInfoItemBean.devHoldingRatio) && Intrinsics.EZpvd(this.newTagList, marketTxWsInfoItemBean.newTagList) && Intrinsics.EZpvd((Object) this.launchedTokenCount, (Object) marketTxWsInfoItemBean.launchedTokenCount) && Intrinsics.EZpvd((Object) this.devCreateTokenCount, (Object) marketTxWsInfoItemBean.devCreateTokenCount) && Intrinsics.EZpvd((Object) this.sniperHoldingRatio, (Object) marketTxWsInfoItemBean.sniperHoldingRatio) && Intrinsics.EZpvd((Object) this.tokenFee, (Object) marketTxWsInfoItemBean.tokenFee);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.progress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.launchedTokenCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.firstPriceTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gHZMYf() {
        return this.txs4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.snipersTotal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.suspiciousRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.change.hashCode();
        int iHashCode3 = this.change1H.hashCode();
        int iHashCode4 = this.change4H.hashCode();
        int iHashCode5 = this.change5M.hashCode();
        int iHashCode6 = this.firstPriceTime.hashCode();
        int iHashCode7 = this.progress.hashCode();
        int iHashCode8 = this.snipersClear.hashCode();
        int iHashCode9 = this.snipersTotal.hashCode();
        int iHashCode10 = this.suspiciousRatio.hashCode();
        int iHashCode11 = this.txs1H.hashCode();
        int iHashCode12 = this.txs4H.hashCode();
        int iHashCode13 = this.txs5M.hashCode();
        int iHashCode14 = this.uniqueTraders.hashCode();
        int iHashCode15 = this.uniqueTraders1H.hashCode();
        int iHashCode16 = this.uniqueTraders4H.hashCode();
        int iHashCode17 = this.uniqueTraders5M.hashCode();
        int iHashCode18 = this.volume1H.hashCode();
        int iHashCode19 = this.volume4H.hashCode();
        int iHashCode20 = this.volume5M.hashCode();
        int iHashCode21 = this.marketCap.hashCode();
        int iHashCode22 = this.maxPrice.hashCode();
        int iHashCode23 = this.minPrice.hashCode();
        int iHashCode24 = this.price.hashCode();
        int iHashCode25 = this.tokenContractAddress.hashCode();
        int iHashCode26 = this.tradeNum.hashCode();
        int iHashCode27 = this.txs.hashCode();
        int iHashCode28 = this.volume.hashCode();
        int iHashCode29 = this.liquidity.hashCode();
        String str = this.holders;
        int iHashCode30 = str == null ? 0 : str.hashCode();
        String str2 = this.circulatingSupply;
        int iHashCode31 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxSupply;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.top10HoldAmountPercentage.hashCode()) * 31) + this.totalEarlyBuyerAmount.hashCode()) * 31) + this.devHoldingRatio.hashCode()) * 31) + this.newTagList.hashCode()) * 31) + this.launchedTokenCount.hashCode()) * 31) + this.devCreateTokenCount.hashCode()) * 31) + this.sniperHoldingRatio.hashCode()) * 31) + this.tokenFee.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.holders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.snipersClear;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String sSMYrx() {
        return this.txs1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketTxWsInfoItemBean(chainId=" + this.chainId + ", change=" + this.change + ", change1H=" + this.change1H + ", change4H=" + this.change4H + ", change5M=" + this.change5M + ", firstPriceTime=" + this.firstPriceTime + ", progress=" + this.progress + ", snipersClear=" + this.snipersClear + ", snipersTotal=" + this.snipersTotal + ", suspiciousRatio=" + this.suspiciousRatio + ", txs1H=" + this.txs1H + ", txs4H=" + this.txs4H + ", txs5M=" + this.txs5M + ", uniqueTraders=" + this.uniqueTraders + ", uniqueTraders1H=" + this.uniqueTraders1H + ", uniqueTraders4H=" + this.uniqueTraders4H + ", uniqueTraders5M=" + this.uniqueTraders5M + ", volume1H=" + this.volume1H + ", volume4H=" + this.volume4H + ", volume5M=" + this.volume5M + ", marketCap=" + this.marketCap + ", maxPrice=" + this.maxPrice + ", minPrice=" + this.minPrice + ", price=" + this.price + ", tokenContractAddress=" + this.tokenContractAddress + ", tradeNum=" + this.tradeNum + ", txs=" + this.txs + ", volume=" + this.volume + ", liquidity=" + this.liquidity + ", holders=" + this.holders + ", circulatingSupply=" + this.circulatingSupply + ", maxSupply=" + this.maxSupply + ", top10HoldAmountPercentage=" + this.top10HoldAmountPercentage + ", totalEarlyBuyerAmount=" + this.totalEarlyBuyerAmount + ", devHoldingRatio=" + this.devHoldingRatio + ", newTagList=" + this.newTagList + ", launchedTokenCount=" + this.launchedTokenCount + ", devCreateTokenCount=" + this.devCreateTokenCount + ", sniperHoldingRatio=" + this.sniperHoldingRatio + ", tokenFee=" + this.tokenFee + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.sniperHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.devHoldingRatio;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String wlaJM() {
        return this.totalEarlyBuyerAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.txs;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zsXlph() {
        return this.tradeNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zuBGHE() {
        return this.uniqueTraders;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketTxWsInfoItemBean> serializer() {
            return MarketTxWsInfoItemBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketTxWsInfoItemBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, List list, String str36, String str37, String str38, String str39, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.change = "";
        } else {
            this.change = str2;
        }
        if ((i & 4) == 0) {
            this.change1H = "";
        } else {
            this.change1H = str3;
        }
        if ((i & 8) == 0) {
            this.change4H = "";
        } else {
            this.change4H = str4;
        }
        if ((i & 16) == 0) {
            this.change5M = "";
        } else {
            this.change5M = str5;
        }
        if ((i & 32) == 0) {
            this.firstPriceTime = "";
        } else {
            this.firstPriceTime = str6;
        }
        if ((i & 64) == 0) {
            this.progress = "";
        } else {
            this.progress = str7;
        }
        if ((i & 128) == 0) {
            this.snipersClear = "";
        } else {
            this.snipersClear = str8;
        }
        if ((i & 256) == 0) {
            this.snipersTotal = "";
        } else {
            this.snipersTotal = str9;
        }
        if ((i & 512) == 0) {
            this.suspiciousRatio = "";
        } else {
            this.suspiciousRatio = str10;
        }
        if ((i & 1024) == 0) {
            this.txs1H = "";
        } else {
            this.txs1H = str11;
        }
        if ((i & 2048) == 0) {
            this.txs4H = "";
        } else {
            this.txs4H = str12;
        }
        if ((i & 4096) == 0) {
            this.txs5M = "";
        } else {
            this.txs5M = str13;
        }
        if ((i & 8192) == 0) {
            this.uniqueTraders = "";
        } else {
            this.uniqueTraders = str14;
        }
        if ((i & 16384) == 0) {
            this.uniqueTraders1H = "";
        } else {
            this.uniqueTraders1H = str15;
        }
        if ((32768 & i) == 0) {
            this.uniqueTraders4H = "";
        } else {
            this.uniqueTraders4H = str16;
        }
        if ((65536 & i) == 0) {
            this.uniqueTraders5M = "";
        } else {
            this.uniqueTraders5M = str17;
        }
        if ((131072 & i) == 0) {
            this.volume1H = "";
        } else {
            this.volume1H = str18;
        }
        if ((262144 & i) == 0) {
            this.volume4H = "";
        } else {
            this.volume4H = str19;
        }
        if ((524288 & i) == 0) {
            this.volume5M = "";
        } else {
            this.volume5M = str20;
        }
        if ((1048576 & i) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str21;
        }
        if ((2097152 & i) == 0) {
            this.maxPrice = "";
        } else {
            this.maxPrice = str22;
        }
        if ((4194304 & i) == 0) {
            this.minPrice = "";
        } else {
            this.minPrice = str23;
        }
        if ((8388608 & i) == 0) {
            this.price = "";
        } else {
            this.price = str24;
        }
        if ((16777216 & i) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str25;
        }
        if ((33554432 & i) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str26;
        }
        if ((67108864 & i) == 0) {
            this.txs = "";
        } else {
            this.txs = str27;
        }
        if ((134217728 & i) == 0) {
            this.volume = "";
        } else {
            this.volume = str28;
        }
        if ((268435456 & i) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str29;
        }
        if ((536870912 & i) == 0) {
            this.holders = null;
        } else {
            this.holders = str30;
        }
        if ((1073741824 & i) == 0) {
            this.circulatingSupply = null;
        } else {
            this.circulatingSupply = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.maxSupply = null;
        } else {
            this.maxSupply = str32;
        }
        if ((i2 & 1) == 0) {
            this.top10HoldAmountPercentage = "";
        } else {
            this.top10HoldAmountPercentage = str33;
        }
        if ((i2 & 2) == 0) {
            this.totalEarlyBuyerAmount = "";
        } else {
            this.totalEarlyBuyerAmount = str34;
        }
        if ((i2 & 4) == 0) {
            this.devHoldingRatio = "";
        } else {
            this.devHoldingRatio = str35;
        }
        this.newTagList = (i2 & 8) == 0 ? yDY.AhwBna() : list;
        if ((i2 & 16) == 0) {
            this.launchedTokenCount = "";
        } else {
            this.launchedTokenCount = str36;
        }
        if ((i2 & 32) == 0) {
            this.devCreateTokenCount = "";
        } else {
            this.devCreateTokenCount = str37;
        }
        if ((i2 & 64) == 0) {
            this.sniperHoldingRatio = "";
        } else {
            this.sniperHoldingRatio = str38;
        }
        if ((i2 & 128) == 0) {
            this.tokenFee = "";
        } else {
            this.tokenFee = str39;
        }
    }

    public static final /* synthetic */ void KWHzl(MarketTxWsInfoItemBean marketTxWsInfoItemBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketTxWsInfoItemBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marketTxWsInfoItemBean.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.change1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketTxWsInfoItemBean.change1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.change4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketTxWsInfoItemBean.change4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.change5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketTxWsInfoItemBean.change5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.firstPriceTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, marketTxWsInfoItemBean.firstPriceTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.progress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marketTxWsInfoItemBean.progress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.snipersClear, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, marketTxWsInfoItemBean.snipersClear);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.snipersTotal, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, marketTxWsInfoItemBean.snipersTotal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.suspiciousRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, marketTxWsInfoItemBean.suspiciousRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.txs1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, marketTxWsInfoItemBean.txs1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.txs4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, marketTxWsInfoItemBean.txs4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.txs5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, marketTxWsInfoItemBean.txs5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.uniqueTraders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, marketTxWsInfoItemBean.uniqueTraders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.uniqueTraders1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, marketTxWsInfoItemBean.uniqueTraders1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.uniqueTraders4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, marketTxWsInfoItemBean.uniqueTraders4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.uniqueTraders5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, marketTxWsInfoItemBean.uniqueTraders5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.volume1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, marketTxWsInfoItemBean.volume1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.volume4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, marketTxWsInfoItemBean.volume4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.volume5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, marketTxWsInfoItemBean.volume5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, marketTxWsInfoItemBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.maxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, marketTxWsInfoItemBean.maxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.minPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, marketTxWsInfoItemBean.minPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, marketTxWsInfoItemBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, marketTxWsInfoItemBean.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, marketTxWsInfoItemBean.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.txs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, marketTxWsInfoItemBean.txs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, marketTxWsInfoItemBean.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, marketTxWsInfoItemBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || marketTxWsInfoItemBean.holders != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 29, StringSerializer.INSTANCE, marketTxWsInfoItemBean.holders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || marketTxWsInfoItemBean.circulatingSupply != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 30, StringSerializer.INSTANCE, marketTxWsInfoItemBean.circulatingSupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || marketTxWsInfoItemBean.maxSupply != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 31, StringSerializer.INSTANCE, marketTxWsInfoItemBean.maxSupply);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.top10HoldAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, marketTxWsInfoItemBean.top10HoldAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.totalEarlyBuyerAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, marketTxWsInfoItemBean.totalEarlyBuyerAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.devHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, marketTxWsInfoItemBean.devHoldingRatio);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd(marketTxWsInfoItemBean.newTagList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 35, kSerializerArr[35], marketTxWsInfoItemBean.newTagList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.launchedTokenCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, marketTxWsInfoItemBean.launchedTokenCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.devCreateTokenCount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, marketTxWsInfoItemBean.devCreateTokenCount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.sniperHoldingRatio, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, marketTxWsInfoItemBean.sniperHoldingRatio);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) && Intrinsics.EZpvd((Object) marketTxWsInfoItemBean.tokenFee, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 39, marketTxWsInfoItemBean.tokenFee);
    }

    public MarketTxWsInfoItemBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, String str30, String str31, String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull List<CompactTagData> list, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39) {
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
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        this.chainId = str;
        this.change = str2;
        this.change1H = str3;
        this.change4H = str4;
        this.change5M = str5;
        this.firstPriceTime = str6;
        this.progress = str7;
        this.snipersClear = str8;
        this.snipersTotal = str9;
        this.suspiciousRatio = str10;
        this.txs1H = str11;
        this.txs4H = str12;
        this.txs5M = str13;
        this.uniqueTraders = str14;
        this.uniqueTraders1H = str15;
        this.uniqueTraders4H = str16;
        this.uniqueTraders5M = str17;
        this.volume1H = str18;
        this.volume4H = str19;
        this.volume5M = str20;
        this.marketCap = str21;
        this.maxPrice = str22;
        this.minPrice = str23;
        this.price = str24;
        this.tokenContractAddress = str25;
        this.tradeNum = str26;
        this.txs = str27;
        this.volume = str28;
        this.liquidity = str29;
        this.holders = str30;
        this.circulatingSupply = str31;
        this.maxSupply = str32;
        this.top10HoldAmountPercentage = str33;
        this.totalEarlyBuyerAmount = str34;
        this.devHoldingRatio = str35;
        this.newTagList = list;
        this.launchedTokenCount = str36;
        this.devCreateTokenCount = str37;
        this.sniperHoldingRatio = str38;
        this.tokenFee = str39;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x01dc: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r81v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r41v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r81v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r42v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r81v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r43v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r81v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r44v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r81v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r45v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r81v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r46v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r81v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r47v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r81v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r48v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r81v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r49v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r81v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r50v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r81v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r51v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r81v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r52v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r81v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r53v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r81v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r54v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r81v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r55v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r81v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r56v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r81v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r57v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r81v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r58v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r81v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r59v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r81v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r60v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r81v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r61v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r81v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r62v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r81v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r63v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r81v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r81v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r81v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r81v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r81v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r81v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r81v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012e: ARITH (r81v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0139: ARITH (r81v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) == (0 int)) ? (r72v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r82v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r82v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r82v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x015b: ARITH (r82v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x015f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:87)) : (r76v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0166: ARITH (r82v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016f: ARITH (r82v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0178: ARITH (r82v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0181: ARITH (r82v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.data.model.CompactTagData>, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:15) call: com.okinc.business.dexlogic.main.swap.ws.bean.MarketTxWsInfoItemBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketTxWsInfoItemBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, List list, String str36, String str37, String str38, String str39, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? null : str30, (i & 1073741824) != 0 ? null : str31, (i & Integer.MIN_VALUE) == 0 ? str32 : null, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? yDY.AhwBna() : list, (i2 & 16) != 0 ? "" : str36, (i2 & 32) != 0 ? "" : str37, (i2 & 64) != 0 ? "" : str38, (i2 & 128) != 0 ? "" : str39);
    }
}

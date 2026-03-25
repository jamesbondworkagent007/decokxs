package com.okinc.business.dexlogic.main.swap.ws.bean;

import com.google.api.client.googleapis.media.MediaHttpDownloader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class MarketTradeRealTimeBean {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    public final String chainId;
    public final String change;
    public final String change1H;
    public final String change4H;
    public final String change5M;
    public final String holders;
    public final String inflow;
    public final String inflow1H;
    public final String inflow4H;
    public final String inflow5M;
    public final String liquidity;
    public final String maxPrice;
    public final String minPrice;
    public final String tokenContractAddress;
    public final String top10Holders;
    public final String tradeNum;
    public final String tradeNum1H;
    public final String tradeNum4H;
    public final String tradeNum5M;
    public final String tradeNumBuy;
    public final String tradeNumBuy1H;
    public final String tradeNumBuy4H;
    public final String tradeNumBuy5M;
    public final String tradeNumSell;
    public final String tradeNumSell1H;
    public final String tradeNumSell4H;
    public final String tradeNumSell5M;
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
    public final String uniqueTradersBuy;
    public final String uniqueTradersBuy1H;
    public final String uniqueTradersBuy4H;
    public final String uniqueTradersBuy5M;
    public final String uniqueTradersSell;
    public final String uniqueTradersSell1H;
    public final String uniqueTradersSell4H;
    public final String uniqueTradersSell5M;
    public final String volume;
    public final String volume1H;
    public final String volume4H;
    public final String volume5M;
    public final String volumeBuy;
    public final String volumeBuy1H;
    public final String volumeBuy4H;
    public final String volumeBuy5M;
    public final String volumeSell;
    public final String volumeSell1H;
    public final String volumeSell4H;
    public final String volumeSell5M;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MarketTradeRealTimeBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, Integer.MAX_VALUE, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.change5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.minPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.txsBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.txsSell1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AuCTel() {
        return this.volume;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.txsSell4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.change1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketTradeRealTimeBean KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63) {
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
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        return new MarketTradeRealTimeBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, str45, str46, str47, str48, str49, str50, str51, str52, str53, str54, str55, str56, str57, str58, str59, str60, str61, str62, str63);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.change4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.change;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.inflow;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.txsBuy1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String ejfBZ() {
        return this.volumeBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketTradeRealTimeBean)) {
            return false;
        }
        MarketTradeRealTimeBean marketTradeRealTimeBean = (MarketTradeRealTimeBean) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) marketTradeRealTimeBean.chainId) && Intrinsics.EZpvd((Object) this.change, (Object) marketTradeRealTimeBean.change) && Intrinsics.EZpvd((Object) this.change1H, (Object) marketTradeRealTimeBean.change1H) && Intrinsics.EZpvd((Object) this.change4H, (Object) marketTradeRealTimeBean.change4H) && Intrinsics.EZpvd((Object) this.change5M, (Object) marketTradeRealTimeBean.change5M) && Intrinsics.EZpvd((Object) this.inflow, (Object) marketTradeRealTimeBean.inflow) && Intrinsics.EZpvd((Object) this.inflow1H, (Object) marketTradeRealTimeBean.inflow1H) && Intrinsics.EZpvd((Object) this.inflow4H, (Object) marketTradeRealTimeBean.inflow4H) && Intrinsics.EZpvd((Object) this.inflow5M, (Object) marketTradeRealTimeBean.inflow5M) && Intrinsics.EZpvd((Object) this.maxPrice, (Object) marketTradeRealTimeBean.maxPrice) && Intrinsics.EZpvd((Object) this.minPrice, (Object) marketTradeRealTimeBean.minPrice) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) marketTradeRealTimeBean.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tradeNum, (Object) marketTradeRealTimeBean.tradeNum) && Intrinsics.EZpvd((Object) this.tradeNum1H, (Object) marketTradeRealTimeBean.tradeNum1H) && Intrinsics.EZpvd((Object) this.tradeNum4H, (Object) marketTradeRealTimeBean.tradeNum4H) && Intrinsics.EZpvd((Object) this.tradeNum5M, (Object) marketTradeRealTimeBean.tradeNum5M) && Intrinsics.EZpvd((Object) this.tradeNumBuy, (Object) marketTradeRealTimeBean.tradeNumBuy) && Intrinsics.EZpvd((Object) this.tradeNumBuy1H, (Object) marketTradeRealTimeBean.tradeNumBuy1H) && Intrinsics.EZpvd((Object) this.tradeNumBuy4H, (Object) marketTradeRealTimeBean.tradeNumBuy4H) && Intrinsics.EZpvd((Object) this.tradeNumBuy5M, (Object) marketTradeRealTimeBean.tradeNumBuy5M) && Intrinsics.EZpvd((Object) this.tradeNumSell, (Object) marketTradeRealTimeBean.tradeNumSell) && Intrinsics.EZpvd((Object) this.tradeNumSell1H, (Object) marketTradeRealTimeBean.tradeNumSell1H) && Intrinsics.EZpvd((Object) this.tradeNumSell4H, (Object) marketTradeRealTimeBean.tradeNumSell4H) && Intrinsics.EZpvd((Object) this.tradeNumSell5M, (Object) marketTradeRealTimeBean.tradeNumSell5M) && Intrinsics.EZpvd((Object) this.txs, (Object) marketTradeRealTimeBean.txs) && Intrinsics.EZpvd((Object) this.txs1H, (Object) marketTradeRealTimeBean.txs1H) && Intrinsics.EZpvd((Object) this.txs4H, (Object) marketTradeRealTimeBean.txs4H) && Intrinsics.EZpvd((Object) this.txs5M, (Object) marketTradeRealTimeBean.txs5M) && Intrinsics.EZpvd((Object) this.txsBuy, (Object) marketTradeRealTimeBean.txsBuy) && Intrinsics.EZpvd((Object) this.txsBuy1H, (Object) marketTradeRealTimeBean.txsBuy1H) && Intrinsics.EZpvd((Object) this.txsBuy4H, (Object) marketTradeRealTimeBean.txsBuy4H) && Intrinsics.EZpvd((Object) this.txsBuy5M, (Object) marketTradeRealTimeBean.txsBuy5M) && Intrinsics.EZpvd((Object) this.txsSell, (Object) marketTradeRealTimeBean.txsSell) && Intrinsics.EZpvd((Object) this.txsSell1H, (Object) marketTradeRealTimeBean.txsSell1H) && Intrinsics.EZpvd((Object) this.txsSell4H, (Object) marketTradeRealTimeBean.txsSell4H) && Intrinsics.EZpvd((Object) this.txsSell5M, (Object) marketTradeRealTimeBean.txsSell5M) && Intrinsics.EZpvd((Object) this.uniqueTraders, (Object) marketTradeRealTimeBean.uniqueTraders) && Intrinsics.EZpvd((Object) this.uniqueTraders1H, (Object) marketTradeRealTimeBean.uniqueTraders1H) && Intrinsics.EZpvd((Object) this.uniqueTraders4H, (Object) marketTradeRealTimeBean.uniqueTraders4H) && Intrinsics.EZpvd((Object) this.uniqueTraders5M, (Object) marketTradeRealTimeBean.uniqueTraders5M) && Intrinsics.EZpvd((Object) this.uniqueTradersBuy, (Object) marketTradeRealTimeBean.uniqueTradersBuy) && Intrinsics.EZpvd((Object) this.uniqueTradersBuy1H, (Object) marketTradeRealTimeBean.uniqueTradersBuy1H) && Intrinsics.EZpvd((Object) this.uniqueTradersBuy4H, (Object) marketTradeRealTimeBean.uniqueTradersBuy4H) && Intrinsics.EZpvd((Object) this.uniqueTradersBuy5M, (Object) marketTradeRealTimeBean.uniqueTradersBuy5M) && Intrinsics.EZpvd((Object) this.uniqueTradersSell, (Object) marketTradeRealTimeBean.uniqueTradersSell) && Intrinsics.EZpvd((Object) this.uniqueTradersSell1H, (Object) marketTradeRealTimeBean.uniqueTradersSell1H) && Intrinsics.EZpvd((Object) this.uniqueTradersSell4H, (Object) marketTradeRealTimeBean.uniqueTradersSell4H) && Intrinsics.EZpvd((Object) this.uniqueTradersSell5M, (Object) marketTradeRealTimeBean.uniqueTradersSell5M) && Intrinsics.EZpvd((Object) this.volume, (Object) marketTradeRealTimeBean.volume) && Intrinsics.EZpvd((Object) this.volume1H, (Object) marketTradeRealTimeBean.volume1H) && Intrinsics.EZpvd((Object) this.volume4H, (Object) marketTradeRealTimeBean.volume4H) && Intrinsics.EZpvd((Object) this.volume5M, (Object) marketTradeRealTimeBean.volume5M) && Intrinsics.EZpvd((Object) this.volumeBuy, (Object) marketTradeRealTimeBean.volumeBuy) && Intrinsics.EZpvd((Object) this.volumeBuy1H, (Object) marketTradeRealTimeBean.volumeBuy1H) && Intrinsics.EZpvd((Object) this.volumeBuy4H, (Object) marketTradeRealTimeBean.volumeBuy4H) && Intrinsics.EZpvd((Object) this.volumeBuy5M, (Object) marketTradeRealTimeBean.volumeBuy5M) && Intrinsics.EZpvd((Object) this.volumeSell, (Object) marketTradeRealTimeBean.volumeSell) && Intrinsics.EZpvd((Object) this.volumeSell1H, (Object) marketTradeRealTimeBean.volumeSell1H) && Intrinsics.EZpvd((Object) this.volumeSell4H, (Object) marketTradeRealTimeBean.volumeSell4H) && Intrinsics.EZpvd((Object) this.volumeSell5M, (Object) marketTradeRealTimeBean.volumeSell5M) && Intrinsics.EZpvd((Object) this.liquidity, (Object) marketTradeRealTimeBean.liquidity) && Intrinsics.EZpvd((Object) this.holders, (Object) marketTradeRealTimeBean.holders) && Intrinsics.EZpvd((Object) this.top10Holders, (Object) marketTradeRealTimeBean.top10Holders);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fARcdN() {
        return this.volume5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fIwbmz() {
        return this.volume4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fJNWhG() {
        return this.volume1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String fetchVPNInfo() {
        return this.txsSell5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.txsBuy4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFieldNames() {
        return this.volumeSell1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNewProxyInstance() {
        return this.volumeSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String hDKMBd() {
        return this.volumeBuy5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.chainId.hashCode() * 31) + this.change.hashCode()) * 31) + this.change1H.hashCode()) * 31) + this.change4H.hashCode()) * 31) + this.change5M.hashCode()) * 31) + this.inflow.hashCode()) * 31) + this.inflow1H.hashCode()) * 31) + this.inflow4H.hashCode()) * 31) + this.inflow5M.hashCode()) * 31) + this.maxPrice.hashCode()) * 31) + this.minPrice.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tradeNum.hashCode()) * 31) + this.tradeNum1H.hashCode()) * 31) + this.tradeNum4H.hashCode()) * 31) + this.tradeNum5M.hashCode()) * 31) + this.tradeNumBuy.hashCode()) * 31) + this.tradeNumBuy1H.hashCode()) * 31) + this.tradeNumBuy4H.hashCode()) * 31) + this.tradeNumBuy5M.hashCode()) * 31) + this.tradeNumSell.hashCode()) * 31) + this.tradeNumSell1H.hashCode()) * 31) + this.tradeNumSell4H.hashCode()) * 31) + this.tradeNumSell5M.hashCode()) * 31) + this.txs.hashCode()) * 31) + this.txs1H.hashCode()) * 31) + this.txs4H.hashCode()) * 31) + this.txs5M.hashCode()) * 31) + this.txsBuy.hashCode()) * 31) + this.txsBuy1H.hashCode()) * 31) + this.txsBuy4H.hashCode()) * 31) + this.txsBuy5M.hashCode()) * 31) + this.txsSell.hashCode()) * 31) + this.txsSell1H.hashCode()) * 31) + this.txsSell4H.hashCode()) * 31) + this.txsSell5M.hashCode()) * 31) + this.uniqueTraders.hashCode()) * 31) + this.uniqueTraders1H.hashCode()) * 31) + this.uniqueTraders4H.hashCode()) * 31) + this.uniqueTraders5M.hashCode()) * 31) + this.uniqueTradersBuy.hashCode()) * 31) + this.uniqueTradersBuy1H.hashCode()) * 31) + this.uniqueTradersBuy4H.hashCode()) * 31) + this.uniqueTradersBuy5M.hashCode()) * 31) + this.uniqueTradersSell.hashCode()) * 31) + this.uniqueTradersSell1H.hashCode()) * 31) + this.uniqueTradersSell4H.hashCode()) * 31) + this.uniqueTradersSell5M.hashCode()) * 31) + this.volume.hashCode()) * 31) + this.volume1H.hashCode()) * 31) + this.volume4H.hashCode()) * 31) + this.volume5M.hashCode()) * 31) + this.volumeBuy.hashCode()) * 31) + this.volumeBuy1H.hashCode()) * 31) + this.volumeBuy4H.hashCode()) * 31) + this.volumeBuy5M.hashCode()) * 31) + this.volumeSell.hashCode()) * 31) + this.volumeSell1H.hashCode()) * 31) + this.volumeSell4H.hashCode()) * 31) + this.volumeSell5M.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.holders.hashCode()) * 31) + this.top10Holders.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.txsSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String iwGUEr() {
        return this.volumeBuy1H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MarketTradeRealTimeBean(chainId=" + this.chainId + ", change=" + this.change + ", change1H=" + this.change1H + ", change4H=" + this.change4H + ", change5M=" + this.change5M + ", inflow=" + this.inflow + ", inflow1H=" + this.inflow1H + ", inflow4H=" + this.inflow4H + ", inflow5M=" + this.inflow5M + ", maxPrice=" + this.maxPrice + ", minPrice=" + this.minPrice + ", tokenContractAddress=" + this.tokenContractAddress + ", tradeNum=" + this.tradeNum + ", tradeNum1H=" + this.tradeNum1H + ", tradeNum4H=" + this.tradeNum4H + ", tradeNum5M=" + this.tradeNum5M + ", tradeNumBuy=" + this.tradeNumBuy + ", tradeNumBuy1H=" + this.tradeNumBuy1H + ", tradeNumBuy4H=" + this.tradeNumBuy4H + ", tradeNumBuy5M=" + this.tradeNumBuy5M + ", tradeNumSell=" + this.tradeNumSell + ", tradeNumSell1H=" + this.tradeNumSell1H + ", tradeNumSell4H=" + this.tradeNumSell4H + ", tradeNumSell5M=" + this.tradeNumSell5M + ", txs=" + this.txs + ", txs1H=" + this.txs1H + ", txs4H=" + this.txs4H + ", txs5M=" + this.txs5M + ", txsBuy=" + this.txsBuy + ", txsBuy1H=" + this.txsBuy1H + ", txsBuy4H=" + this.txsBuy4H + ", txsBuy5M=" + this.txsBuy5M + ", txsSell=" + this.txsSell + ", txsSell1H=" + this.txsSell1H + ", txsSell4H=" + this.txsSell4H + ", txsSell5M=" + this.txsSell5M + ", uniqueTraders=" + this.uniqueTraders + ", uniqueTraders1H=" + this.uniqueTraders1H + ", uniqueTraders4H=" + this.uniqueTraders4H + ", uniqueTraders5M=" + this.uniqueTraders5M + ", uniqueTradersBuy=" + this.uniqueTradersBuy + ", uniqueTradersBuy1H=" + this.uniqueTradersBuy1H + ", uniqueTradersBuy4H=" + this.uniqueTradersBuy4H + ", uniqueTradersBuy5M=" + this.uniqueTradersBuy5M + ", uniqueTradersSell=" + this.uniqueTradersSell + ", uniqueTradersSell1H=" + this.uniqueTradersSell1H + ", uniqueTradersSell4H=" + this.uniqueTradersSell4H + ", uniqueTradersSell5M=" + this.uniqueTradersSell5M + ", volume=" + this.volume + ", volume1H=" + this.volume1H + ", volume4H=" + this.volume4H + ", volume5M=" + this.volume5M + ", volumeBuy=" + this.volumeBuy + ", volumeBuy1H=" + this.volumeBuy1H + ", volumeBuy4H=" + this.volumeBuy4H + ", volumeBuy5M=" + this.volumeBuy5M + ", volumeSell=" + this.volumeSell + ", volumeSell1H=" + this.volumeSell1H + ", volumeSell4H=" + this.volumeSell4H + ", volumeSell5M=" + this.volumeSell5M + ", liquidity=" + this.liquidity + ", holders=" + this.holders + ", top10Holders=" + this.top10Holders + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String uzCIH() {
        return this.volumeBuy4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.maxPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.txsBuy5M;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String wlaJM() {
        return this.volumeSell4H;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String zLjUOn() {
        return this.volumeSell5M;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<MarketTradeRealTimeBean> serializer() {
            return MarketTradeRealTimeBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MarketTradeRealTimeBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.inflow = "";
        } else {
            this.inflow = str6;
        }
        if ((i & 64) == 0) {
            this.inflow1H = "";
        } else {
            this.inflow1H = str7;
        }
        if ((i & 128) == 0) {
            this.inflow4H = "";
        } else {
            this.inflow4H = str8;
        }
        if ((i & 256) == 0) {
            this.inflow5M = "";
        } else {
            this.inflow5M = str9;
        }
        if ((i & 512) == 0) {
            this.maxPrice = "";
        } else {
            this.maxPrice = str10;
        }
        if ((i & 1024) == 0) {
            this.minPrice = "";
        } else {
            this.minPrice = str11;
        }
        if ((i & 2048) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str12;
        }
        if ((i & 4096) == 0) {
            this.tradeNum = "";
        } else {
            this.tradeNum = str13;
        }
        if ((i & 8192) == 0) {
            this.tradeNum1H = "";
        } else {
            this.tradeNum1H = str14;
        }
        if ((i & 16384) == 0) {
            this.tradeNum4H = "";
        } else {
            this.tradeNum4H = str15;
        }
        if ((i & 32768) == 0) {
            this.tradeNum5M = "";
        } else {
            this.tradeNum5M = str16;
        }
        if ((i & 65536) == 0) {
            this.tradeNumBuy = "";
        } else {
            this.tradeNumBuy = str17;
        }
        if ((i & 131072) == 0) {
            this.tradeNumBuy1H = "";
        } else {
            this.tradeNumBuy1H = str18;
        }
        if ((i & 262144) == 0) {
            this.tradeNumBuy4H = "";
        } else {
            this.tradeNumBuy4H = str19;
        }
        if ((i & 524288) == 0) {
            this.tradeNumBuy5M = "";
        } else {
            this.tradeNumBuy5M = str20;
        }
        if ((i & 1048576) == 0) {
            this.tradeNumSell = "";
        } else {
            this.tradeNumSell = str21;
        }
        if ((2097152 & i) == 0) {
            this.tradeNumSell1H = "";
        } else {
            this.tradeNumSell1H = str22;
        }
        if ((4194304 & i) == 0) {
            this.tradeNumSell4H = "";
        } else {
            this.tradeNumSell4H = str23;
        }
        if ((8388608 & i) == 0) {
            this.tradeNumSell5M = "";
        } else {
            this.tradeNumSell5M = str24;
        }
        if ((16777216 & i) == 0) {
            this.txs = "";
        } else {
            this.txs = str25;
        }
        if ((33554432 & i) == 0) {
            this.txs1H = "";
        } else {
            this.txs1H = str26;
        }
        if ((67108864 & i) == 0) {
            this.txs4H = "";
        } else {
            this.txs4H = str27;
        }
        if ((134217728 & i) == 0) {
            this.txs5M = "";
        } else {
            this.txs5M = str28;
        }
        if ((268435456 & i) == 0) {
            this.txsBuy = "";
        } else {
            this.txsBuy = str29;
        }
        if ((536870912 & i) == 0) {
            this.txsBuy1H = "";
        } else {
            this.txsBuy1H = str30;
        }
        if ((1073741824 & i) == 0) {
            this.txsBuy4H = "";
        } else {
            this.txsBuy4H = str31;
        }
        if ((i & Integer.MIN_VALUE) == 0) {
            this.txsBuy5M = "";
        } else {
            this.txsBuy5M = str32;
        }
        if ((i2 & 1) == 0) {
            this.txsSell = "";
        } else {
            this.txsSell = str33;
        }
        if ((i2 & 2) == 0) {
            this.txsSell1H = "";
        } else {
            this.txsSell1H = str34;
        }
        if ((i2 & 4) == 0) {
            this.txsSell4H = "";
        } else {
            this.txsSell4H = str35;
        }
        if ((i2 & 8) == 0) {
            this.txsSell5M = "";
        } else {
            this.txsSell5M = str36;
        }
        if ((i2 & 16) == 0) {
            this.uniqueTraders = "";
        } else {
            this.uniqueTraders = str37;
        }
        if ((i2 & 32) == 0) {
            this.uniqueTraders1H = "";
        } else {
            this.uniqueTraders1H = str38;
        }
        if ((i2 & 64) == 0) {
            this.uniqueTraders4H = "";
        } else {
            this.uniqueTraders4H = str39;
        }
        if ((i2 & 128) == 0) {
            this.uniqueTraders5M = "";
        } else {
            this.uniqueTraders5M = str40;
        }
        if ((i2 & 256) == 0) {
            this.uniqueTradersBuy = "";
        } else {
            this.uniqueTradersBuy = str41;
        }
        if ((i2 & 512) == 0) {
            this.uniqueTradersBuy1H = "";
        } else {
            this.uniqueTradersBuy1H = str42;
        }
        if ((i2 & 1024) == 0) {
            this.uniqueTradersBuy4H = "";
        } else {
            this.uniqueTradersBuy4H = str43;
        }
        if ((i2 & 2048) == 0) {
            this.uniqueTradersBuy5M = "";
        } else {
            this.uniqueTradersBuy5M = str44;
        }
        if ((i2 & 4096) == 0) {
            this.uniqueTradersSell = "";
        } else {
            this.uniqueTradersSell = str45;
        }
        if ((i2 & 8192) == 0) {
            this.uniqueTradersSell1H = "";
        } else {
            this.uniqueTradersSell1H = str46;
        }
        if ((i2 & 16384) == 0) {
            this.uniqueTradersSell4H = "";
        } else {
            this.uniqueTradersSell4H = str47;
        }
        if ((i2 & 32768) == 0) {
            this.uniqueTradersSell5M = "";
        } else {
            this.uniqueTradersSell5M = str48;
        }
        if ((i2 & 65536) == 0) {
            this.volume = "";
        } else {
            this.volume = str49;
        }
        if ((i2 & 131072) == 0) {
            this.volume1H = "";
        } else {
            this.volume1H = str50;
        }
        if ((i2 & 262144) == 0) {
            this.volume4H = "";
        } else {
            this.volume4H = str51;
        }
        if ((i2 & 524288) == 0) {
            this.volume5M = "";
        } else {
            this.volume5M = str52;
        }
        if ((i2 & 1048576) == 0) {
            this.volumeBuy = "";
        } else {
            this.volumeBuy = str53;
        }
        if ((2097152 & i2) == 0) {
            this.volumeBuy1H = "";
        } else {
            this.volumeBuy1H = str54;
        }
        if ((4194304 & i2) == 0) {
            this.volumeBuy4H = "";
        } else {
            this.volumeBuy4H = str55;
        }
        if ((8388608 & i2) == 0) {
            this.volumeBuy5M = "";
        } else {
            this.volumeBuy5M = str56;
        }
        if ((16777216 & i2) == 0) {
            this.volumeSell = "";
        } else {
            this.volumeSell = str57;
        }
        if ((33554432 & i2) == 0) {
            this.volumeSell1H = "";
        } else {
            this.volumeSell1H = str58;
        }
        if ((67108864 & i2) == 0) {
            this.volumeSell4H = "";
        } else {
            this.volumeSell4H = str59;
        }
        if ((134217728 & i2) == 0) {
            this.volumeSell5M = "";
        } else {
            this.volumeSell5M = str60;
        }
        if ((268435456 & i2) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str61;
        }
        if ((536870912 & i2) == 0) {
            this.holders = "";
        } else {
            this.holders = str62;
        }
        if ((1073741824 & i2) == 0) {
            this.top10Holders = "";
        } else {
            this.top10Holders = str63;
        }
    }

    public static final /* synthetic */ void OLrzqt(MarketTradeRealTimeBean marketTradeRealTimeBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, marketTradeRealTimeBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.change, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, marketTradeRealTimeBean.change);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.change1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, marketTradeRealTimeBean.change1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.change4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, marketTradeRealTimeBean.change4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.change5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, marketTradeRealTimeBean.change5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.inflow, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, marketTradeRealTimeBean.inflow);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.inflow1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, marketTradeRealTimeBean.inflow1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.inflow4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, marketTradeRealTimeBean.inflow4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.inflow5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, marketTradeRealTimeBean.inflow5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.maxPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, marketTradeRealTimeBean.maxPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.minPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, marketTradeRealTimeBean.minPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, marketTradeRealTimeBean.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNum, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, marketTradeRealTimeBean.tradeNum);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNum1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, marketTradeRealTimeBean.tradeNum1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNum4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, marketTradeRealTimeBean.tradeNum4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNum5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, marketTradeRealTimeBean.tradeNum5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNumBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, marketTradeRealTimeBean.tradeNumBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNumBuy1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, marketTradeRealTimeBean.tradeNumBuy1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNumBuy4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, marketTradeRealTimeBean.tradeNumBuy4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNumBuy5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 19, marketTradeRealTimeBean.tradeNumBuy5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 20) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNumSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 20, marketTradeRealTimeBean.tradeNumSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 21) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNumSell1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 21, marketTradeRealTimeBean.tradeNumSell1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 22) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNumSell4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 22, marketTradeRealTimeBean.tradeNumSell4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 23) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.tradeNumSell5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 23, marketTradeRealTimeBean.tradeNumSell5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 24) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txs, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 24, marketTradeRealTimeBean.txs);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 25) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txs1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 25, marketTradeRealTimeBean.txs1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 26) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txs4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 26, marketTradeRealTimeBean.txs4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 27) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txs5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 27, marketTradeRealTimeBean.txs5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 28) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txsBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 28, marketTradeRealTimeBean.txsBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 29) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txsBuy1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 29, marketTradeRealTimeBean.txsBuy1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 30) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txsBuy4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 30, marketTradeRealTimeBean.txsBuy4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 31) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txsBuy5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 31, marketTradeRealTimeBean.txsBuy5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 32) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txsSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 32, marketTradeRealTimeBean.txsSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 33) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txsSell1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 33, marketTradeRealTimeBean.txsSell1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 34) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txsSell4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 34, marketTradeRealTimeBean.txsSell4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 35) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.txsSell5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 35, marketTradeRealTimeBean.txsSell5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 36) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTraders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 36, marketTradeRealTimeBean.uniqueTraders);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 37) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTraders1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 37, marketTradeRealTimeBean.uniqueTraders1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 38) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTraders4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 38, marketTradeRealTimeBean.uniqueTraders4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 39) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTraders5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 39, marketTradeRealTimeBean.uniqueTraders5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 40) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTradersBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 40, marketTradeRealTimeBean.uniqueTradersBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 41) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTradersBuy1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 41, marketTradeRealTimeBean.uniqueTradersBuy1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 42) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTradersBuy4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 42, marketTradeRealTimeBean.uniqueTradersBuy4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 43) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTradersBuy5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 43, marketTradeRealTimeBean.uniqueTradersBuy5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 44) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTradersSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 44, marketTradeRealTimeBean.uniqueTradersSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 45) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTradersSell1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 45, marketTradeRealTimeBean.uniqueTradersSell1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 46) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTradersSell4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 46, marketTradeRealTimeBean.uniqueTradersSell4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 47) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.uniqueTradersSell5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 47, marketTradeRealTimeBean.uniqueTradersSell5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 48) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volume, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 48, marketTradeRealTimeBean.volume);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 49) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volume1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 49, marketTradeRealTimeBean.volume1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 50) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volume4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 50, marketTradeRealTimeBean.volume4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 51) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volume5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 51, marketTradeRealTimeBean.volume5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 52) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volumeBuy, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 52, marketTradeRealTimeBean.volumeBuy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 53) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volumeBuy1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 53, marketTradeRealTimeBean.volumeBuy1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 54) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volumeBuy4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 54, marketTradeRealTimeBean.volumeBuy4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 55) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volumeBuy5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 55, marketTradeRealTimeBean.volumeBuy5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 56) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volumeSell, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 56, marketTradeRealTimeBean.volumeSell);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 57) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volumeSell1H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 57, marketTradeRealTimeBean.volumeSell1H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 58) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volumeSell4H, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 58, marketTradeRealTimeBean.volumeSell4H);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 59) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.volumeSell5M, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 59, marketTradeRealTimeBean.volumeSell5M);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 60) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 60, marketTradeRealTimeBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 61) || !Intrinsics.EZpvd((Object) marketTradeRealTimeBean.holders, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 61, marketTradeRealTimeBean.holders);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 62) && Intrinsics.EZpvd((Object) marketTradeRealTimeBean.top10Holders, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 62, marketTradeRealTimeBean.top10Holders);
    }

    public MarketTradeRealTimeBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, @NotNull String str16, @NotNull String str17, @NotNull String str18, @NotNull String str19, @NotNull String str20, @NotNull String str21, @NotNull String str22, @NotNull String str23, @NotNull String str24, @NotNull String str25, @NotNull String str26, @NotNull String str27, @NotNull String str28, @NotNull String str29, @NotNull String str30, @NotNull String str31, @NotNull String str32, @NotNull String str33, @NotNull String str34, @NotNull String str35, @NotNull String str36, @NotNull String str37, @NotNull String str38, @NotNull String str39, @NotNull String str40, @NotNull String str41, @NotNull String str42, @NotNull String str43, @NotNull String str44, @NotNull String str45, @NotNull String str46, @NotNull String str47, @NotNull String str48, @NotNull String str49, @NotNull String str50, @NotNull String str51, @NotNull String str52, @NotNull String str53, @NotNull String str54, @NotNull String str55, @NotNull String str56, @NotNull String str57, @NotNull String str58, @NotNull String str59, @NotNull String str60, @NotNull String str61, @NotNull String str62, @NotNull String str63) {
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
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        this.chainId = str;
        this.change = str2;
        this.change1H = str3;
        this.change4H = str4;
        this.change5M = str5;
        this.inflow = str6;
        this.inflow1H = str7;
        this.inflow4H = str8;
        this.inflow5M = str9;
        this.maxPrice = str10;
        this.minPrice = str11;
        this.tokenContractAddress = str12;
        this.tradeNum = str13;
        this.tradeNum1H = str14;
        this.tradeNum4H = str15;
        this.tradeNum5M = str16;
        this.tradeNumBuy = str17;
        this.tradeNumBuy1H = str18;
        this.tradeNumBuy4H = str19;
        this.tradeNumBuy5M = str20;
        this.tradeNumSell = str21;
        this.tradeNumSell1H = str22;
        this.tradeNumSell4H = str23;
        this.tradeNumSell5M = str24;
        this.txs = str25;
        this.txs1H = str26;
        this.txs4H = str27;
        this.txs5M = str28;
        this.txsBuy = str29;
        this.txsBuy1H = str30;
        this.txsBuy4H = str31;
        this.txsBuy5M = str32;
        this.txsSell = str33;
        this.txsSell1H = str34;
        this.txsSell4H = str35;
        this.txsSell5M = str36;
        this.uniqueTraders = str37;
        this.uniqueTraders1H = str38;
        this.uniqueTraders4H = str39;
        this.uniqueTraders5M = str40;
        this.uniqueTradersBuy = str41;
        this.uniqueTradersBuy1H = str42;
        this.uniqueTradersBuy4H = str43;
        this.uniqueTradersBuy5M = str44;
        this.uniqueTradersSell = str45;
        this.uniqueTradersSell1H = str46;
        this.uniqueTradersSell4H = str47;
        this.uniqueTradersSell5M = str48;
        this.volume = str49;
        this.volume1H = str50;
        this.volume4H = str51;
        this.volume5M = str52;
        this.volumeBuy = str53;
        this.volumeBuy1H = str54;
        this.volumeBuy4H = str55;
        this.volumeBuy5M = str56;
        this.volumeSell = str57;
        this.volumeSell1H = str58;
        this.volumeSell4H = str59;
        this.volumeSell5M = str60;
        this.liquidity = str61;
        this.holders = str62;
        this.top10Holders = str63;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x02fb: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0004: ARITH (r127v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r64v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r127v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r65v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r127v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r66v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r127v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r67v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r127v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r68v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r127v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r69v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r127v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r70v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r127v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r71v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r127v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r72v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r127v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r73v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0056: ARITH (r127v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r74v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005e: ARITH (r127v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r75v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0066: ARITH (r127v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r76v0 java.lang.String))
  (wrap:java.lang.String:0x0079: TERNARY null = ((wrap:int:0x0070: ARITH (r127v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r77v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007b: ARITH (r127v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r78v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0087: ARITH (r127v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r79v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0092: ARITH (r127v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r80v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x009d: ARITH (r127v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r81v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a8: ARITH (r127v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r82v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00b3: ARITH (r127v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r83v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00be: ARITH (r127v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r84v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00c9: ARITH (r127v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r85v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00d4: ARITH (r127v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r86v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00df: ARITH (r127v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r87v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00ea: ARITH (r127v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r88v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00f5: ARITH (r127v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r89v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0100: ARITH (r127v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r90v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x010b: ARITH (r127v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r91v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0116: ARITH (r127v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r92v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0121: ARITH (r127v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r93v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x012c: ARITH (r127v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r94v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0137: ARITH (r127v0 int) & (Integer.MIN_VALUE int) A[WRAPPED]) != (0 int)) ? ("") : (r95v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0140: ARITH (r128v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r96v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0149: ARITH (r128v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r97v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0152: ARITH (r128v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r98v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x015b: ARITH (r128v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r99v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0164: ARITH (r128v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r100v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x016d: ARITH (r128v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r101v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0176: ARITH (r128v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r102v0 java.lang.String))
  (wrap:java.lang.String:0x018a: TERNARY null = ((wrap:int:0x0181: ARITH (r128v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r103v0 java.lang.String))
  (wrap:java.lang.String:0x0195: TERNARY null = ((wrap:int:0x018c: ARITH (r128v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r104v0 java.lang.String))
  (wrap:java.lang.String:0x01a0: TERNARY null = ((wrap:int:0x0197: ARITH (r128v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r105v0 java.lang.String))
  (wrap:java.lang.String:0x01ab: TERNARY null = ((wrap:int:0x01a2: ARITH (r128v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r106v0 java.lang.String))
  (wrap:java.lang.String:0x01b6: TERNARY null = ((wrap:int:0x01ad: ARITH (r128v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r107v0 java.lang.String))
  (wrap:java.lang.String:0x01c1: TERNARY null = ((wrap:int:0x01b8: ARITH (r128v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r108v0 java.lang.String))
  (wrap:java.lang.String:0x01cc: TERNARY null = ((wrap:int:0x01c3: ARITH (r128v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r109v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01ce: ARITH (r128v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r110v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01d7: ARITH (r128v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r111v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e0: ARITH (r128v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r112v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01e9: ARITH (r128v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r113v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01f2: ARITH (r128v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r114v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x01fb: ARITH (r128v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? ("") : (r115v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0204: ARITH (r128v0 int) & (1048576 int) A[WRAPPED]) != (0 int)) ? ("") : (r116v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x020f: ARITH (r128v0 int) & (2097152 int) A[WRAPPED]) != (0 int)) ? ("") : (r117v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x021a: ARITH (r128v0 int) & (4194304 int) A[WRAPPED]) != (0 int)) ? ("") : (r118v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0225: ARITH (r128v0 int) & (8388608 int) A[WRAPPED]) != (0 int)) ? ("") : (r119v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0230: ARITH (r128v0 int) & (16777216 int) A[WRAPPED]) != (0 int)) ? ("") : (r120v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x023b: ARITH (r128v0 int) & (wrap:??:SGET  A[WRAPPED] com.google.api.client.googleapis.media.MediaHttpDownloader.MAXIMUM_CHUNK_SIZE int) A[WRAPPED]) != (0 int)) ? ("") : (r121v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0246: ARITH (r128v0 int) & (67108864 int) A[WRAPPED]) != (0 int)) ? ("") : (r122v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0251: ARITH (r128v0 int) & (134217728 int) A[WRAPPED]) != (0 int)) ? ("") : (r123v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x025c: ARITH (r128v0 int) & (268435456 int) A[WRAPPED]) != (0 int)) ? ("") : (r124v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0267: ARITH (r128v0 int) & (536870912 int) A[WRAPPED]) != (0 int)) ? ("") : (r125v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0272: ARITH (r128v0 int) & (1073741824 int) A[WRAPPED]) != (0 int)) ? ("") : (r126v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: com.okinc.business.dexlogic.main.swap.ws.bean.MarketTradeRealTimeBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MarketTradeRealTimeBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, String str57, String str58, String str59, String str60, String str61, String str62, String str63, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) != 0 ? "" : str13, (i & 8192) != 0 ? "" : str14, (i & 16384) != 0 ? "" : str15, (i & 32768) != 0 ? "" : str16, (i & 65536) != 0 ? "" : str17, (i & 131072) != 0 ? "" : str18, (i & 262144) != 0 ? "" : str19, (i & 524288) != 0 ? "" : str20, (i & 1048576) != 0 ? "" : str21, (i & 2097152) != 0 ? "" : str22, (i & 4194304) != 0 ? "" : str23, (i & 8388608) != 0 ? "" : str24, (i & 16777216) != 0 ? "" : str25, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str26, (i & 67108864) != 0 ? "" : str27, (i & 134217728) != 0 ? "" : str28, (i & 268435456) != 0 ? "" : str29, (i & 536870912) != 0 ? "" : str30, (i & 1073741824) != 0 ? "" : str31, (i & Integer.MIN_VALUE) != 0 ? "" : str32, (i2 & 1) != 0 ? "" : str33, (i2 & 2) != 0 ? "" : str34, (i2 & 4) != 0 ? "" : str35, (i2 & 8) != 0 ? "" : str36, (i2 & 16) != 0 ? "" : str37, (i2 & 32) != 0 ? "" : str38, (i2 & 64) != 0 ? "" : str39, (i2 & 128) != 0 ? "" : str40, (i2 & 256) != 0 ? "" : str41, (i2 & 512) != 0 ? "" : str42, (i2 & 1024) != 0 ? "" : str43, (i2 & 2048) != 0 ? "" : str44, (i2 & 4096) != 0 ? "" : str45, (i2 & 8192) != 0 ? "" : str46, (i2 & 16384) != 0 ? "" : str47, (i2 & 32768) != 0 ? "" : str48, (i2 & 65536) != 0 ? "" : str49, (i2 & 131072) != 0 ? "" : str50, (i2 & 262144) != 0 ? "" : str51, (i2 & 524288) != 0 ? "" : str52, (i2 & 1048576) != 0 ? "" : str53, (i2 & 2097152) != 0 ? "" : str54, (i2 & 4194304) != 0 ? "" : str55, (i2 & 8388608) != 0 ? "" : str56, (i2 & 16777216) != 0 ? "" : str57, (i2 & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? "" : str58, (i2 & 67108864) != 0 ? "" : str59, (i2 & 134217728) != 0 ? "" : str60, (i2 & 268435456) != 0 ? "" : str61, (i2 & 536870912) != 0 ? "" : str62, (i2 & 1073741824) != 0 ? "" : str63);
    }
}

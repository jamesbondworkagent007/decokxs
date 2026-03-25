package com.okinc.cruilib.model.listitem.share;

import com.okinc.cruilib.model.listitem.OKCRListItem;
import com.okinc.cruilib.view.listitem.share.OKCRTrend;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class OKCRDexTokenListItem extends OKCRListItem {
    public static final int $stable = 8;
    private final String chainId;
    private final String chainLogo;
    private final String chainName;
    private boolean communityRecognized;
    private final String id;
    private String liquidityToDisplay;
    private Pair<String, ? extends OKCRTrend> priceChange1HToDisplay;
    private Pair<String, ? extends OKCRTrend> priceChange24HToDisplay;
    private Pair<String, ? extends OKCRTrend> priceChange4HToDisplay;
    private String priceToDisplay;
    private final String tokenContractAddress;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<java.lang.String, ? extends com.okinc.cruilib.view.listitem.share.OKCRTrend>, kotlin.Pair<java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend> */
    public final Pair<String, OKCRTrend> component10() {
        return this.priceChange24HToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<java.lang.String, ? extends com.okinc.cruilib.view.listitem.share.OKCRTrend>, kotlin.Pair<java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend> */
    public final Pair<String, OKCRTrend> component11() {
        return this.priceChange4HToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<java.lang.String, ? extends com.okinc.cruilib.view.listitem.share.OKCRTrend>, kotlin.Pair<java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend> */
    public final Pair<String, OKCRTrend> component12() {
        return this.priceChange1HToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.liquidityToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.priceToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKCRDexTokenListItem copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull Pair<String, ? extends OKCRTrend> pair, @NotNull Pair<String, ? extends OKCRTrend> pair2, @NotNull Pair<String, ? extends OKCRTrend> pair3, @NotNull String str10, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new OKCRDexTokenListItem(str, str2, str3, str4, str5, str6, str7, str8, str9, pair, pair2, pair3, str10, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OKCRDexTokenListItem)) {
            return false;
        }
        OKCRDexTokenListItem oKCRDexTokenListItem = (OKCRDexTokenListItem) obj;
        return Intrinsics.EZpvd((Object) this.id, (Object) oKCRDexTokenListItem.id) && Intrinsics.EZpvd((Object) this.chainId, (Object) oKCRDexTokenListItem.chainId) && Intrinsics.EZpvd((Object) this.chainName, (Object) oKCRDexTokenListItem.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) oKCRDexTokenListItem.chainLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) oKCRDexTokenListItem.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenName, (Object) oKCRDexTokenListItem.tokenName) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) oKCRDexTokenListItem.tokenContractAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) oKCRDexTokenListItem.tokenLogo) && Intrinsics.EZpvd((Object) this.priceToDisplay, (Object) oKCRDexTokenListItem.priceToDisplay) && Intrinsics.EZpvd(this.priceChange24HToDisplay, oKCRDexTokenListItem.priceChange24HToDisplay) && Intrinsics.EZpvd(this.priceChange4HToDisplay, oKCRDexTokenListItem.priceChange4HToDisplay) && Intrinsics.EZpvd(this.priceChange1HToDisplay, oKCRDexTokenListItem.priceChange1HToDisplay) && Intrinsics.EZpvd((Object) this.liquidityToDisplay, (Object) oKCRDexTokenListItem.liquidityToDisplay) && this.communityRecognized == oKCRDexTokenListItem.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCommunityRecognized() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.cruilib.model.listitem.OKCRListItem
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidityToDisplay() {
        return this.liquidityToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<java.lang.String, ? extends com.okinc.cruilib.view.listitem.share.OKCRTrend>, kotlin.Pair<java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend> */
    public final Pair<String, OKCRTrend> getPriceChange1HToDisplay() {
        return this.priceChange1HToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<java.lang.String, ? extends com.okinc.cruilib.view.listitem.share.OKCRTrend>, kotlin.Pair<java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend> */
    public final Pair<String, OKCRTrend> getPriceChange24HToDisplay() {
        return this.priceChange24HToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.Pair<java.lang.String, ? extends com.okinc.cruilib.view.listitem.share.OKCRTrend>, kotlin.Pair<java.lang.String, com.okinc.cruilib.view.listitem.share.OKCRTrend> */
    public final Pair<String, OKCRTrend> getPriceChange4HToDisplay() {
        return this.priceChange4HToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceToDisplay() {
        return this.priceToDisplay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
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
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((this.id.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.priceToDisplay.hashCode()) * 31) + this.priceChange24HToDisplay.hashCode()) * 31) + this.priceChange4HToDisplay.hashCode()) * 31) + this.priceChange1HToDisplay.hashCode()) * 31) + this.liquidityToDisplay.hashCode()) * 31) + Boolean.hashCode(this.communityRecognized);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCommunityRecognized(boolean z) {
        this.communityRecognized = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLiquidityToDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.liquidityToDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange1HToDisplay(@NotNull Pair<String, ? extends OKCRTrend> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.priceChange1HToDisplay = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange24HToDisplay(@NotNull Pair<String, ? extends OKCRTrend> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.priceChange24HToDisplay = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceChange4HToDisplay(@NotNull Pair<String, ? extends OKCRTrend> pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        this.priceChange4HToDisplay = pair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriceToDisplay(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priceToDisplay = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OKCRDexTokenListItem(id=" + this.id + ", chainId=" + this.chainId + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenName=" + this.tokenName + ", tokenContractAddress=" + this.tokenContractAddress + ", tokenLogo=" + this.tokenLogo + ", priceToDisplay=" + this.priceToDisplay + ", priceChange24HToDisplay=" + this.priceChange24HToDisplay + ", priceChange4HToDisplay=" + this.priceChange4HToDisplay + ", priceChange1HToDisplay=" + this.priceChange1HToDisplay + ", liquidityToDisplay=" + this.liquidityToDisplay + ", communityRecognized=" + this.communityRecognized + ")";
    }

    public OKCRDexTokenListItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull Pair<String, ? extends OKCRTrend> pair, @NotNull Pair<String, ? extends OKCRTrend> pair2, @NotNull Pair<String, ? extends OKCRTrend> pair3, @NotNull String str10, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(pair2, "");
        Intrinsics.checkNotNullParameter(pair3, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.id = str;
        this.chainId = str2;
        this.chainName = str3;
        this.chainLogo = str4;
        this.tokenSymbol = str5;
        this.tokenName = str6;
        this.tokenContractAddress = str7;
        this.tokenLogo = str8;
        this.priceToDisplay = str9;
        this.priceChange24HToDisplay = pair;
        this.priceChange4HToDisplay = pair2;
        this.priceChange1HToDisplay = pair3;
        this.liquidityToDisplay = str10;
        this.communityRecognized = z;
    }
}

package com.okinc.business.dexlogic.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class MemeTradePnLShareBean {
    public static final int $stable = 8;
    private final String averageCost;
    private final String balance;
    private final String chainId;
    private final String chainLogoUrl;
    private final String currentProfit;
    private final String currentProfitPercentage;
    private final List<Object> kLinesData;
    private final List<String> shareIcon;
    private final ShareLinkVO shareLinkVO;
    private final String tokenLogoUrl;
    private final String tokenSymbol;
    private final String twitterAvatar;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public MemeTradePnLShareBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareLinkVO component11() {
        return this.shareLinkVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component12() {
        return this.shareIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> component8() {
        return this.kLinesData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MemeTradePnLShareBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, List<? extends Object> list, String str8, String str9, ShareLinkVO shareLinkVO, List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new MemeTradePnLShareBean(str, str2, str3, str4, str5, str6, str7, list, str8, str9, shareLinkVO, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MemeTradePnLShareBean)) {
            return false;
        }
        MemeTradePnLShareBean memeTradePnLShareBean = (MemeTradePnLShareBean) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) memeTradePnLShareBean.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenLogoUrl, (Object) memeTradePnLShareBean.tokenLogoUrl) && Intrinsics.EZpvd((Object) this.chainLogoUrl, (Object) memeTradePnLShareBean.chainLogoUrl) && Intrinsics.EZpvd((Object) this.currentProfit, (Object) memeTradePnLShareBean.currentProfit) && Intrinsics.EZpvd((Object) this.currentProfitPercentage, (Object) memeTradePnLShareBean.currentProfitPercentage) && Intrinsics.EZpvd((Object) this.balance, (Object) memeTradePnLShareBean.balance) && Intrinsics.EZpvd((Object) this.averageCost, (Object) memeTradePnLShareBean.averageCost) && Intrinsics.EZpvd(this.kLinesData, memeTradePnLShareBean.kLinesData) && Intrinsics.EZpvd((Object) this.chainId, (Object) memeTradePnLShareBean.chainId) && Intrinsics.EZpvd((Object) this.twitterAvatar, (Object) memeTradePnLShareBean.twitterAvatar) && Intrinsics.EZpvd(this.shareLinkVO, memeTradePnLShareBean.shareLinkVO) && Intrinsics.EZpvd(this.shareIcon, memeTradePnLShareBean.shareIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAverageCost() {
        return this.averageCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogoUrl() {
        return this.chainLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfit() {
        return this.currentProfit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrentProfitPercentage() {
        return this.currentProfitPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Object> getKLinesData() {
        return this.kLinesData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getShareIcon() {
        return this.shareIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ShareLinkVO getShareLinkVO() {
        return this.shareLinkVO;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogoUrl() {
        return this.tokenLogoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTwitterAvatar() {
        return this.twitterAvatar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.tokenSymbol.hashCode();
        int iHashCode2 = this.tokenLogoUrl.hashCode();
        int iHashCode3 = this.chainLogoUrl.hashCode();
        int iHashCode4 = this.currentProfit.hashCode();
        int iHashCode5 = this.currentProfitPercentage.hashCode();
        int iHashCode6 = this.balance.hashCode();
        int iHashCode7 = this.averageCost.hashCode();
        List<Object> list = this.kLinesData;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        String str = this.chainId;
        int iHashCode9 = str == null ? 0 : str.hashCode();
        String str2 = this.twitterAvatar;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        ShareLinkVO shareLinkVO = this.shareLinkVO;
        int iHashCode11 = shareLinkVO == null ? 0 : shareLinkVO.hashCode();
        List<String> list2 = this.shareIcon;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "MemeTradePnLShareBean(tokenSymbol=" + this.tokenSymbol + ", tokenLogoUrl=" + this.tokenLogoUrl + ", chainLogoUrl=" + this.chainLogoUrl + ", currentProfit=" + this.currentProfit + ", currentProfitPercentage=" + this.currentProfitPercentage + ", balance=" + this.balance + ", averageCost=" + this.averageCost + ", kLinesData=" + this.kLinesData + ", chainId=" + this.chainId + ", twitterAvatar=" + this.twitterAvatar + ", shareLinkVO=" + this.shareLinkVO + ", shareIcon=" + this.shareIcon + ")";
    }

    public MemeTradePnLShareBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, List<? extends Object> list, String str8, String str9, ShareLinkVO shareLinkVO, List<String> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.tokenSymbol = str;
        this.tokenLogoUrl = str2;
        this.chainLogoUrl = str3;
        this.currentProfit = str4;
        this.currentProfitPercentage = str5;
        this.balance = str6;
        this.averageCost = str7;
        this.kLinesData = list;
        this.chainId = str8;
        this.twitterAvatar = str9;
        this.shareLinkVO = shareLinkVO;
        this.shareIcon = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
  (wrap:com.okinc.business.dexlogic.bean.ShareLinkVO:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ShareLinkVO) : (r24v0 com.okinc.business.dexlogic.bean.ShareLinkVO))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x005a: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends java.lang.Object>, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ShareLinkVO, java.util.List<java.lang.String>):void (m)] (LINE:31) call: com.okinc.business.dexlogic.bean.MemeTradePnLShareBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, com.okinc.business.dexlogic.bean.ShareLinkVO, java.util.List):void type: THIS */
    public /* synthetic */ MemeTradePnLShareBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, String str8, String str9, ShareLinkVO shareLinkVO, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? null : list, (i & 256) != 0 ? "" : str8, (i & 512) == 0 ? str9 : "", (i & 1024) != 0 ? null : shareLinkVO, (i & 2048) == 0 ? list2 : null);
    }
}

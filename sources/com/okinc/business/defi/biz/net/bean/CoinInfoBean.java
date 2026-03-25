package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class CoinInfoBean {
    public static final int $stable = 8;
    private Long baseCoinId;
    private String chainName;
    private String circulatingSupply;
    private Long coinId;
    private String explorerUrl;
    private String marketCap;
    private String maxSupply;
    private List<CoinInfoSocialMediaBean> socialMedia;
    private String symbol;
    private List<String> technicalDoc;
    private List<String> website;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinInfoBean() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component10() {
        return this.technicalDoc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinInfoSocialMediaBean> component11() {
        return this.socialMedia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component9() {
        return this.website;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfoBean copy(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, List<CoinInfoSocialMediaBean> list3) {
        return new CoinInfoBean(l, l2, str, str2, str3, str4, str5, str6, list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinInfoBean)) {
            return false;
        }
        CoinInfoBean coinInfoBean = (CoinInfoBean) obj;
        return Intrinsics.EZpvd(this.baseCoinId, coinInfoBean.baseCoinId) && Intrinsics.EZpvd(this.coinId, coinInfoBean.coinId) && Intrinsics.EZpvd((Object) this.symbol, (Object) coinInfoBean.symbol) && Intrinsics.EZpvd((Object) this.chainName, (Object) coinInfoBean.chainName) && Intrinsics.EZpvd((Object) this.marketCap, (Object) coinInfoBean.marketCap) && Intrinsics.EZpvd((Object) this.maxSupply, (Object) coinInfoBean.maxSupply) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) coinInfoBean.explorerUrl) && Intrinsics.EZpvd((Object) this.circulatingSupply, (Object) coinInfoBean.circulatingSupply) && Intrinsics.EZpvd(this.website, coinInfoBean.website) && Intrinsics.EZpvd(this.technicalDoc, coinInfoBean.technicalDoc) && Intrinsics.EZpvd(this.socialMedia, coinInfoBean.socialMedia);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBaseCoinId() {
        return this.baseCoinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCirculatingSupply() {
        return this.circulatingSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSupply() {
        return this.maxSupply;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinInfoSocialMediaBean> getSocialMedia() {
        return this.socialMedia;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getTechnicalDoc() {
        return this.technicalDoc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getWebsite() {
        return this.website;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.baseCoinId;
        int iHashCode = l == null ? 0 : l.hashCode();
        Long l2 = this.coinId;
        int iHashCode2 = l2 == null ? 0 : l2.hashCode();
        String str = this.symbol;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.chainName;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.marketCap;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.maxSupply;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.explorerUrl;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.circulatingSupply;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        List<String> list = this.website;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.technicalDoc;
        int iHashCode10 = list2 == null ? 0 : list2.hashCode();
        List<CoinInfoSocialMediaBean> list3 = this.socialMedia;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCoinId(Long l) {
        this.baseCoinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(String str) {
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCirculatingSupply(String str) {
        this.circulatingSupply = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(Long l) {
        this.coinId = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(String str) {
        this.explorerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketCap(String str) {
        this.marketCap = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSupply(String str) {
        this.maxSupply = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSocialMedia(List<CoinInfoSocialMediaBean> list) {
        this.socialMedia = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(String str) {
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTechnicalDoc(List<String> list) {
        this.technicalDoc = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWebsite(List<String> list) {
        this.website = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinInfoBean(baseCoinId=" + this.baseCoinId + ", coinId=" + this.coinId + ", symbol=" + this.symbol + ", chainName=" + this.chainName + ", marketCap=" + this.marketCap + ", maxSupply=" + this.maxSupply + ", explorerUrl=" + this.explorerUrl + ", circulatingSupply=" + this.circulatingSupply + ", website=" + this.website + ", technicalDoc=" + this.technicalDoc + ", socialMedia=" + this.socialMedia + ")";
    }

    public CoinInfoBean(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, List<CoinInfoSocialMediaBean> list3) {
        this.baseCoinId = l;
        this.coinId = l2;
        this.symbol = str;
        this.chainName = str2;
        this.marketCap = str3;
        this.maxSupply = str4;
        this.explorerUrl = str5;
        this.circulatingSupply = str6;
        this.website = list;
        this.technicalDoc = list2;
        this.socialMedia = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006c: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r13v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r14v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0040: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r21v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0048: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0050: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.util.List) : (null java.util.List))
 A[MD:(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<java.lang.String>, java.util.List<com.okinc.business.defi.biz.net.bean.CoinInfoSocialMediaBean>):void (m)] (LINE:599) call: com.okinc.business.defi.biz.net.bean.CoinInfoBean.<init>(java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ CoinInfoBean(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : l2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : list, (i & 512) != 0 ? null : list2, (i & 1024) == 0 ? list3 : null);
    }
}

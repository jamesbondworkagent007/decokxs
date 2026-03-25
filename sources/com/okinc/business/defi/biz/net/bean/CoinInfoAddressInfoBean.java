package com.okinc.business.defi.biz.net.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes14.dex */
public final class CoinInfoAddressInfoBean {
    public static final int $stable = 8;
    private String address;
    private String chainName;
    private String explorerUrl;
    private String imageUrl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinInfoAddressInfoBean() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinInfoAddressInfoBean copy$default(CoinInfoAddressInfoBean coinInfoAddressInfoBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinInfoAddressInfoBean.imageUrl;
        }
        if ((i & 2) != 0) {
            str2 = coinInfoAddressInfoBean.chainName;
        }
        if ((i & 4) != 0) {
            str3 = coinInfoAddressInfoBean.address;
        }
        if ((i & 8) != 0) {
            str4 = coinInfoAddressInfoBean.explorerUrl;
        }
        return coinInfoAddressInfoBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinInfoAddressInfoBean copy(String str, String str2, String str3, String str4) {
        return new CoinInfoAddressInfoBean(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoinInfoAddressInfoBean)) {
            return false;
        }
        CoinInfoAddressInfoBean coinInfoAddressInfoBean = (CoinInfoAddressInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.imageUrl, (Object) coinInfoAddressInfoBean.imageUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) coinInfoAddressInfoBean.chainName) && Intrinsics.EZpvd((Object) this.address, (Object) coinInfoAddressInfoBean.address) && Intrinsics.EZpvd((Object) this.explorerUrl, (Object) coinInfoAddressInfoBean.explorerUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.imageUrl;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.chainName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.address;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.explorerUrl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddress(String str) {
        this.address = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainName(String str) {
        this.chainName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(String str) {
        this.explorerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinInfoAddressInfoBean(imageUrl=" + this.imageUrl + ", chainName=" + this.chainName + ", address=" + this.address + ", explorerUrl=" + this.explorerUrl + ")";
    }

    public CoinInfoAddressInfoBean(String str, String str2, String str3, String str4) {
        this.imageUrl = str;
        this.chainName = str2;
        this.address = str3;
        this.explorerUrl = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:614) call: com.okinc.business.defi.biz.net.bean.CoinInfoAddressInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinInfoAddressInfoBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}

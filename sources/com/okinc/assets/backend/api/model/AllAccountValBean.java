package com.okinc.assets.backend.api.model;

import androidx.core.app.FrameMetricsAggregator;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class AllAccountValBean {
    public static final int $stable = 8;
    private final ArrayList<AccountValBean> accounts;
    private final String btcTotalValuation;
    private final String btcValuation;
    private final String cnyTotalValuation;
    private final Boolean ownAssets;
    private final String totalValuation;
    private final String usdTotalValuation;
    private final String usdtTotalValuation;
    private final String valuationSymbol;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public AllAccountValBean() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AccountValBean> component1() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.btcTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cnyTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.usdTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdtTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.valuationSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.ownAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AllAccountValBean copy(ArrayList<AccountValBean> arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        return new AllAccountValBean(arrayList, str, str2, str3, str4, str5, str6, str7, bool);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AllAccountValBean)) {
            return false;
        }
        AllAccountValBean allAccountValBean = (AllAccountValBean) obj;
        return Intrinsics.EZpvd(this.accounts, allAccountValBean.accounts) && Intrinsics.EZpvd((Object) this.btcValuation, (Object) allAccountValBean.btcValuation) && Intrinsics.EZpvd((Object) this.btcTotalValuation, (Object) allAccountValBean.btcTotalValuation) && Intrinsics.EZpvd((Object) this.cnyTotalValuation, (Object) allAccountValBean.cnyTotalValuation) && Intrinsics.EZpvd((Object) this.usdTotalValuation, (Object) allAccountValBean.usdTotalValuation) && Intrinsics.EZpvd((Object) this.usdtTotalValuation, (Object) allAccountValBean.usdtTotalValuation) && Intrinsics.EZpvd((Object) this.totalValuation, (Object) allAccountValBean.totalValuation) && Intrinsics.EZpvd((Object) this.valuationSymbol, (Object) allAccountValBean.valuationSymbol) && Intrinsics.EZpvd(this.ownAssets, allAccountValBean.ownAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<AccountValBean> getAccounts() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcTotalValuation() {
        return this.btcTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBtcValuation() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCnyTotalValuation() {
        return this.cnyTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getOwnAssets() {
        return this.ownAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalValuation() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdTotalValuation() {
        return this.usdTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUsdtTotalValuation() {
        return this.usdtTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationSymbol() {
        return this.valuationSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<AccountValBean> arrayList = this.accounts;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.btcValuation;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.btcTotalValuation;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cnyTotalValuation;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.usdTotalValuation;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.usdtTotalValuation;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.totalValuation;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.valuationSymbol;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        Boolean bool = this.ownAssets;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (bool != null ? bool.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AllAccountValBean(accounts=" + this.accounts + ", btcValuation=" + this.btcValuation + ", btcTotalValuation=" + this.btcTotalValuation + ", cnyTotalValuation=" + this.cnyTotalValuation + ", usdTotalValuation=" + this.usdTotalValuation + ", usdtTotalValuation=" + this.usdtTotalValuation + ", totalValuation=" + this.totalValuation + ", valuationSymbol=" + this.valuationSymbol + ", ownAssets=" + this.ownAssets + ")";
    }

    public AllAccountValBean(ArrayList<AccountValBean> arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool) {
        this.accounts = arrayList;
        this.btcValuation = str;
        this.btcTotalValuation = str2;
        this.cnyTotalValuation = str3;
        this.usdTotalValuation = str4;
        this.usdtTotalValuation = str5;
        this.totalValuation = str6;
        this.valuationSymbol = str7;
        this.ownAssets = bool;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r11v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.Boolean) : (null java.lang.Boolean))
 A[MD:(java.util.ArrayList<com.okinc.assets.backend.api.model.AccountValBean>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.AllAccountValBean.<init>(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean):void type: THIS */
    public /* synthetic */ AllAccountValBean(ArrayList arrayList, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) == 0 ? bool : null);
    }
}

package com.okinc.assets.backend.api.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class HomeTotalAssetResp {
    public static final int $stable = 8;
    private List<TotalAssetItem> accounts;
    private String btcTotalValuation;
    private String btcValuation;
    private String cnyTotalValuation;
    private String debtValuation;
    private String totalValuation;
    private String usdTotalValuation;
    private String usdtTotalValuation;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HomeTotalAssetResp() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TotalAssetItem> component1() {
        return this.accounts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.debtValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.btcTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cnyTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.usdTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.usdtTotalValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.btcValuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HomeTotalAssetResp copy(List<TotalAssetItem> list, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new HomeTotalAssetResp(list, str, str2, str3, str4, str5, str6, str7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeTotalAssetResp)) {
            return false;
        }
        HomeTotalAssetResp homeTotalAssetResp = (HomeTotalAssetResp) obj;
        return Intrinsics.EZpvd(this.accounts, homeTotalAssetResp.accounts) && Intrinsics.EZpvd((Object) this.debtValuation, (Object) homeTotalAssetResp.debtValuation) && Intrinsics.EZpvd((Object) this.totalValuation, (Object) homeTotalAssetResp.totalValuation) && Intrinsics.EZpvd((Object) this.btcTotalValuation, (Object) homeTotalAssetResp.btcTotalValuation) && Intrinsics.EZpvd((Object) this.cnyTotalValuation, (Object) homeTotalAssetResp.cnyTotalValuation) && Intrinsics.EZpvd((Object) this.usdTotalValuation, (Object) homeTotalAssetResp.usdTotalValuation) && Intrinsics.EZpvd((Object) this.usdtTotalValuation, (Object) homeTotalAssetResp.usdtTotalValuation) && Intrinsics.EZpvd((Object) this.btcValuation, (Object) homeTotalAssetResp.btcValuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TotalAssetItem> getAccounts() {
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
    public final String getDebtValuation() {
        return this.debtValuation;
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
    public int hashCode() {
        List<TotalAssetItem> list = this.accounts;
        int iHashCode = list == null ? 0 : list.hashCode();
        int iHashCode2 = this.debtValuation.hashCode();
        int iHashCode3 = this.totalValuation.hashCode();
        String str = this.btcTotalValuation;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.cnyTotalValuation;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.usdTotalValuation;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.usdtTotalValuation;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.btcValuation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAccounts(List<TotalAssetItem> list) {
        this.accounts = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcTotalValuation(String str) {
        this.btcTotalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBtcValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.btcValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCnyTotalValuation(String str) {
        this.cnyTotalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDebtValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.debtValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTotalValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.totalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdTotalValuation(String str) {
        this.usdTotalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdtTotalValuation(String str) {
        this.usdtTotalValuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HomeTotalAssetResp(accounts=" + this.accounts + ", debtValuation=" + this.debtValuation + ", totalValuation=" + this.totalValuation + ", btcTotalValuation=" + this.btcTotalValuation + ", cnyTotalValuation=" + this.cnyTotalValuation + ", usdTotalValuation=" + this.usdTotalValuation + ", usdtTotalValuation=" + this.usdtTotalValuation + ", btcValuation=" + this.btcValuation + ")";
    }

    public HomeTotalAssetResp(List<TotalAssetItem> list, @NotNull String str, @NotNull String str2, String str3, String str4, String str5, String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.accounts = list;
        this.debtValuation = str;
        this.totalValuation = str2;
        this.btcTotalValuation = str3;
        this.cnyTotalValuation = str4;
        this.usdTotalValuation = str5;
        this.usdtTotalValuation = str6;
        this.btcValuation = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r11v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("0.0") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0.0") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r17v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0037: ARITH (r19v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : ("0.0"))
 A[MD:(java.util.List<com.okinc.assets.backend.api.model.HomeTotalAssetResp$TotalAssetItem>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.assets.backend.api.model.HomeTotalAssetResp.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HomeTotalAssetResp(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? "0.0" : str, (i & 4) != 0 ? "0.0" : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) == 0 ? str6 : null, (i & 128) == 0 ? str7 : "0.0");
    }

    public static final class TotalAssetItem {
        public static final int $stable = 8;
        private String btcValuation;
        private int target;
        private String valuation;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TotalAssetItem() {
            this(null, 0, null, 7, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TotalAssetItem copy$default(TotalAssetItem totalAssetItem, String str, int i, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = totalAssetItem.btcValuation;
            }
            if ((i2 & 2) != 0) {
                i = totalAssetItem.target;
            }
            if ((i2 & 4) != 0) {
                str2 = totalAssetItem.valuation;
            }
            return totalAssetItem.copy(str, i, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component1() {
            return this.btcValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int component2() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String component3() {
            return this.valuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TotalAssetItem copy(@NotNull String str, int i, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            return new TotalAssetItem(str, i, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TotalAssetItem)) {
                return false;
            }
            TotalAssetItem totalAssetItem = (TotalAssetItem) obj;
            return Intrinsics.EZpvd((Object) this.btcValuation, (Object) totalAssetItem.btcValuation) && this.target == totalAssetItem.target && Intrinsics.EZpvd((Object) this.valuation, (Object) totalAssetItem.valuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getBtcValuation() {
            return this.btcValuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int getTarget() {
            return this.target;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getValuation() {
            return this.valuation;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.btcValuation.hashCode() * 31) + Integer.hashCode(this.target)) * 31) + this.valuation.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setBtcValuation(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.btcValuation = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setTarget(int i) {
            this.target = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final void setValuation(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.valuation = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public String toString() {
            return "TotalAssetItem(btcValuation=" + this.btcValuation + ", target=" + this.target + ", valuation=" + this.valuation + ")";
        }

        public TotalAssetItem(@NotNull String str, int i, @NotNull String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            this.btcValuation = str;
            this.target = i;
            this.valuation = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("0.0") : (r2v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r3v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("0.0") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String):void (m)] (LINE:22) call: com.okinc.assets.backend.api.model.HomeTotalAssetResp.TotalAssetItem.<init>(java.lang.String, int, java.lang.String):void type: THIS */
        public /* synthetic */ TotalAssetItem(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "0.0" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "0.0" : str2);
        }
    }
}

package com.okinc.business.defi.wallet.mine.search.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchDAppChainInfo {
    public static final int $stable = 0;
    private final String colorLogo;
    private final String logo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchDAppChainInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchDAppChainInfo copy$default(SearchDAppChainInfo searchDAppChainInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchDAppChainInfo.logo;
        }
        if ((i & 2) != 0) {
            str2 = searchDAppChainInfo.colorLogo;
        }
        return searchDAppChainInfo.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.colorLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchDAppChainInfo copy(String str, String str2) {
        return new SearchDAppChainInfo(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SearchDAppChainInfo)) {
            return false;
        }
        SearchDAppChainInfo searchDAppChainInfo = (SearchDAppChainInfo) obj;
        return Intrinsics.EZpvd((Object) this.logo, (Object) searchDAppChainInfo.logo) && Intrinsics.EZpvd((Object) this.colorLogo, (Object) searchDAppChainInfo.colorLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getColorLogo() {
        return this.colorLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.logo;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.colorLogo;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchDAppChainInfo(logo=" + this.logo + ", colorLogo=" + this.colorLogo + ")";
    }

    public SearchDAppChainInfo(String str, String str2) {
        this.logo = str;
        this.colorLogo = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:106) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppChainInfo.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SearchDAppChainInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}

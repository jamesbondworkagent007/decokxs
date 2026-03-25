package com.okinc.business.defi.biz.net.bean;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class TxHistory {
    public static final int $stable = 8;
    private List<CoinAndAddressHistoryDetail> content;
    private Map<String, String> explorerUrl;
    private Boolean hasViewMore;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TxHistory() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.net.bean.TxHistory */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TxHistory copy$default(TxHistory txHistory, List list, Boolean bool, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            list = txHistory.content;
        }
        if ((i & 2) != 0) {
            bool = txHistory.hasViewMore;
        }
        if ((i & 4) != 0) {
            map = txHistory.explorerUrl;
        }
        return txHistory.copy(list, bool, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAndAddressHistoryDetail> component1() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component2() {
        return this.hasViewMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component3() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxHistory copy(List<CoinAndAddressHistoryDetail> list, Boolean bool, Map<String, String> map) {
        return new TxHistory(list, bool, map);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TxHistory)) {
            return false;
        }
        TxHistory txHistory = (TxHistory) obj;
        return Intrinsics.EZpvd(this.content, txHistory.content) && Intrinsics.EZpvd(this.hasViewMore, txHistory.hasViewMore) && Intrinsics.EZpvd(this.explorerUrl, txHistory.explorerUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinAndAddressHistoryDetail> getContent() {
        return this.content;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getExplorerUrl() {
        return this.explorerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getHasViewMore() {
        return this.hasViewMore;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<CoinAndAddressHistoryDetail> list = this.content;
        int iHashCode = list == null ? 0 : list.hashCode();
        Boolean bool = this.hasViewMore;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        Map<String, String> map = this.explorerUrl;
        return (((iHashCode * 31) + iHashCode2) * 31) + (map != null ? map.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContent(List<CoinAndAddressHistoryDetail> list) {
        this.content = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExplorerUrl(Map<String, String> map) {
        this.explorerUrl = map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasViewMore(Boolean bool) {
        this.hasViewMore = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TxHistory(content=" + this.content + ", hasViewMore=" + this.hasViewMore + ", explorerUrl=" + this.explorerUrl + ")";
    }

    public TxHistory(List<CoinAndAddressHistoryDetail> list, Boolean bool, Map<String, String> map) {
        this.content = list;
        this.hasViewMore = bool;
        this.explorerUrl = map;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x000a: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r3v0 java.lang.Boolean))
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x000c: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.Map) : (r4v0 java.util.Map))
 A[MD:(java.util.List<com.okinc.business.defi.biz.net.bean.CoinAndAddressHistoryDetail>, java.lang.Boolean, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:15) call: com.okinc.business.defi.biz.net.bean.TxHistory.<init>(java.util.List, java.lang.Boolean, java.util.Map):void type: THIS */
    public /* synthetic */ TxHistory(List list, Boolean bool, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? Boolean.TRUE : bool, (i & 4) != 0 ? null : map);
    }
}

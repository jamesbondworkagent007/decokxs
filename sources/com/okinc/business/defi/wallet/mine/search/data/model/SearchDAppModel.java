package com.okinc.business.defi.wallet.mine.search.data.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class SearchDAppModel {
    public static final int $stable = 8;
    private final SearchDAppInfo dappInfo;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SearchDAppModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SearchDAppModel copy$default(SearchDAppModel searchDAppModel, SearchDAppInfo searchDAppInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            searchDAppInfo = searchDAppModel.dappInfo;
        }
        return searchDAppModel.copy(searchDAppInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchDAppInfo component1() {
        return this.dappInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchDAppModel copy(SearchDAppInfo searchDAppInfo) {
        return new SearchDAppModel(searchDAppInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SearchDAppModel) && Intrinsics.EZpvd(this.dappInfo, ((SearchDAppModel) obj).dappInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SearchDAppInfo getDappInfo() {
        return this.dappInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        SearchDAppInfo searchDAppInfo = this.dappInfo;
        if (searchDAppInfo == null) {
            return 0;
        }
        return searchDAppInfo.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SearchDAppModel(dappInfo=" + this.dappInfo + ")";
    }

    public SearchDAppModel(SearchDAppInfo searchDAppInfo) {
        this.dappInfo = searchDAppInfo;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo) : (r1v0 com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo))
 A[MD:(com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo):void (m)] (LINE:91) call: com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppModel.<init>(com.okinc.business.defi.wallet.mine.search.data.model.SearchDAppInfo):void type: THIS */
    public /* synthetic */ SearchDAppModel(SearchDAppInfo searchDAppInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : searchDAppInfo);
    }
}

package com.okinc.business.defi.wallet.mine.search.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletHotSearchResponse {
    public static final int $stable = 8;
    private final List<SearchDAppInfo> discovers;
    private final List<SearchTokenModel> tokens;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.WalletHotSearchResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletHotSearchResponse copy$default(WalletHotSearchResponse walletHotSearchResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletHotSearchResponse.tokens;
        }
        if ((i & 2) != 0) {
            list2 = walletHotSearchResponse.discovers;
        }
        return walletHotSearchResponse.copy(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchTokenModel> component1() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchDAppInfo> component2() {
        return this.discovers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletHotSearchResponse copy(List<SearchTokenModel> list, List<SearchDAppInfo> list2) {
        return new WalletHotSearchResponse(list, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletHotSearchResponse)) {
            return false;
        }
        WalletHotSearchResponse walletHotSearchResponse = (WalletHotSearchResponse) obj;
        return Intrinsics.EZpvd(this.tokens, walletHotSearchResponse.tokens) && Intrinsics.EZpvd(this.discovers, walletHotSearchResponse.discovers);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchDAppInfo> getDiscovers() {
        return this.discovers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchTokenModel> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<SearchTokenModel> list = this.tokens;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<SearchDAppInfo> list2 = this.discovers;
        return (iHashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletHotSearchResponse(tokens=" + this.tokens + ", discovers=" + this.discovers + ")";
    }

    public WalletHotSearchResponse(List<SearchTokenModel> list, List<SearchDAppInfo> list2) {
        this.tokens = list;
        this.discovers = list2;
    }
}

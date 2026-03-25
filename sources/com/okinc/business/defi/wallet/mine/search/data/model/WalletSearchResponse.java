package com.okinc.business.defi.wallet.mine.search.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchResponse {
    public static final int $stable = 8;
    private final List<SearchAddressModel> addresses;
    private final List<SearchDAppModel> discovers;
    private final WalletSearchExtraInfo extraSearchInfo;
    private final List<SearchTokenModel> tokens;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletSearchResponse copy$default(WalletSearchResponse walletSearchResponse, List list, List list2, List list3, WalletSearchExtraInfo walletSearchExtraInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletSearchResponse.tokens;
        }
        if ((i & 2) != 0) {
            list2 = walletSearchResponse.addresses;
        }
        if ((i & 4) != 0) {
            list3 = walletSearchResponse.discovers;
        }
        if ((i & 8) != 0) {
            walletSearchExtraInfo = walletSearchResponse.extraSearchInfo;
        }
        return walletSearchResponse.copy(list, list2, list3, walletSearchExtraInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchTokenModel> component1() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchAddressModel> component2() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchDAppModel> component3() {
        return this.discovers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchExtraInfo component4() {
        return this.extraSearchInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchResponse copy(List<SearchTokenModel> list, List<SearchAddressModel> list2, List<SearchDAppModel> list3, WalletSearchExtraInfo walletSearchExtraInfo) {
        return new WalletSearchResponse(list, list2, list3, walletSearchExtraInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSearchResponse)) {
            return false;
        }
        WalletSearchResponse walletSearchResponse = (WalletSearchResponse) obj;
        return Intrinsics.EZpvd(this.tokens, walletSearchResponse.tokens) && Intrinsics.EZpvd(this.addresses, walletSearchResponse.addresses) && Intrinsics.EZpvd(this.discovers, walletSearchResponse.discovers) && Intrinsics.EZpvd(this.extraSearchInfo, walletSearchResponse.extraSearchInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchAddressModel> getAddresses() {
        return this.addresses;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchDAppModel> getDiscovers() {
        return this.discovers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchExtraInfo getExtraSearchInfo() {
        return this.extraSearchInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SearchTokenModel> getTokens() {
        return this.tokens;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<SearchTokenModel> list = this.tokens;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<SearchAddressModel> list2 = this.addresses;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<SearchDAppModel> list3 = this.discovers;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        WalletSearchExtraInfo walletSearchExtraInfo = this.extraSearchInfo;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (walletSearchExtraInfo != null ? walletSearchExtraInfo.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchResponse(tokens=" + this.tokens + ", addresses=" + this.addresses + ", discovers=" + this.discovers + ", extraSearchInfo=" + this.extraSearchInfo + ")";
    }

    public WalletSearchResponse(List<SearchTokenModel> list, List<SearchAddressModel> list2, List<SearchDAppModel> list3, WalletSearchExtraInfo walletSearchExtraInfo) {
        this.tokens = list;
        this.addresses = list2;
        this.discovers = list3;
        this.extraSearchInfo = walletSearchExtraInfo;
    }
}

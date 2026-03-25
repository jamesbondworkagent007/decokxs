package com.okinc.business.defi.wallet.mine.search.data.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o.C10525bqB;
import o.C10527bqD;
import o.C10528bqE;
import o.C10594brR;

/* JADX INFO: loaded from: classes5.dex */
public final class WalletSearchResultBean {
    public static final int $stable = 8;
    private final List<C10525bqB> coinAssets;
    private final List<C10594brR> customCoinAsset;
    private final List<C10527bqD> defiAssets;
    private final List<C10528bqE> nftAssets;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchResultBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WalletSearchResultBean copy$default(WalletSearchResultBean walletSearchResultBean, List list, List list2, List list3, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            list = walletSearchResultBean.coinAssets;
        }
        if ((i & 2) != 0) {
            list2 = walletSearchResultBean.customCoinAsset;
        }
        if ((i & 4) != 0) {
            list3 = walletSearchResultBean.defiAssets;
        }
        if ((i & 8) != 0) {
            list4 = walletSearchResultBean.nftAssets;
        }
        return walletSearchResultBean.copy(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C10525bqB> component1() {
        return this.coinAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C10594brR> component2() {
        return this.customCoinAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C10527bqD> component3() {
        return this.defiAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C10528bqE> component4() {
        return this.nftAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletSearchResultBean copy(List<C10525bqB> list, List<C10594brR> list2, List<C10527bqD> list3, List<C10528bqE> list4) {
        return new WalletSearchResultBean(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletSearchResultBean)) {
            return false;
        }
        WalletSearchResultBean walletSearchResultBean = (WalletSearchResultBean) obj;
        return Intrinsics.EZpvd(this.coinAssets, walletSearchResultBean.coinAssets) && Intrinsics.EZpvd(this.customCoinAsset, walletSearchResultBean.customCoinAsset) && Intrinsics.EZpvd(this.defiAssets, walletSearchResultBean.defiAssets) && Intrinsics.EZpvd(this.nftAssets, walletSearchResultBean.nftAssets);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C10525bqB> getCoinAssets() {
        return this.coinAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C10594brR> getCustomCoinAsset() {
        return this.customCoinAsset;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C10527bqD> getDefiAssets() {
        return this.defiAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<C10528bqE> getNftAssets() {
        return this.nftAssets;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<C10525bqB> list = this.coinAssets;
        int iHashCode = list == null ? 0 : list.hashCode();
        List<C10594brR> list2 = this.customCoinAsset;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        List<C10527bqD> list3 = this.defiAssets;
        int iHashCode3 = list3 == null ? 0 : list3.hashCode();
        List<C10528bqE> list4 = this.nftAssets;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (list4 != null ? list4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "WalletSearchResultBean(coinAssets=" + this.coinAssets + ", customCoinAsset=" + this.customCoinAsset + ", defiAssets=" + this.defiAssets + ", nftAssets=" + this.nftAssets + ")";
    }

    public WalletSearchResultBean(List<C10525bqB> list, List<C10594brR> list2, List<C10527bqD> list3, List<C10528bqE> list4) {
        this.coinAssets = list;
        this.customCoinAsset = list2;
        this.defiAssets = list3;
        this.nftAssets = list4;
    }
}

package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletTotalAssetEntity;
import com.okinc.business.defi.biz.net.bean.WalletTotalAssetModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bqT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10543bqT {
    public static final WalletTotalAssetEntity copydefault(@NotNull WalletTotalAssetModel walletTotalAssetModel) {
        Intrinsics.checkNotNullParameter(walletTotalAssetModel, "");
        java.lang.String accountId = walletTotalAssetModel.getAccountId();
        java.lang.String str = accountId == null ? "" : accountId;
        java.lang.String tokenAsset = walletTotalAssetModel.getTokenAsset();
        java.lang.String str2 = tokenAsset == null ? "" : tokenAsset;
        java.lang.String tokenAssetFilter = walletTotalAssetModel.getTokenAssetFilter();
        java.lang.String str3 = tokenAssetFilter == null ? "" : tokenAssetFilter;
        java.lang.String nftAsset = walletTotalAssetModel.getNftAsset();
        java.lang.String str4 = nftAsset == null ? "" : nftAsset;
        java.lang.String defiAsset = walletTotalAssetModel.getDefiAsset();
        return new WalletTotalAssetEntity(str, str2, str3, str4, defiAsset == null ? "" : defiAsset, java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
    }
}

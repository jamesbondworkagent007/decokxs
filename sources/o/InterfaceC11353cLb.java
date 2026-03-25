package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletClosedCoinEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPartialEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPnlEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cLb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11353cLb {
    long AEQbTJ(@NotNull WalletClosedCoinEntity walletClosedCoinEntity);

    java.util.List<WalletCoinAssetEntity> AEQbTJ(@NotNull java.lang.String str);

    java.util.List<java.lang.Long> AEQbTJ(@NotNull java.lang.String str, long j, @NotNull java.lang.String str2);

    java.util.List<java.lang.Long> AEQbTJ(@NotNull java.util.List<WalletClosedCoinEntity> list);

    int AYXKKw(@NotNull java.util.List<WalletCoinAssetPnlEntity> list);

    java.util.List<java.lang.Long> AhwBna(@NotNull java.util.List<WalletCoinAssetEntity> list);

    int EZpvd(@NotNull java.lang.String str);

    long EZpvd(@NotNull WalletCoinAssetEntity walletCoinAssetEntity);

    long EZpvd(@NotNull WalletOpenedCoinEntity walletOpenedCoinEntity);

    java.util.List<java.lang.Long> EZpvd(@NotNull java.util.List<WalletClosedCoinEntity> list);

    int KWHzl(@NotNull java.util.List<WalletOpenedCoinEntity> list);

    long KWHzl(@NotNull WalletClosedCoinEntity walletClosedCoinEntity);

    long KWHzl(@NotNull WalletOpenedCoinEntity walletOpenedCoinEntity);

    java.util.List<java.lang.Long> KWHzl();

    int OLrzqt(@NotNull java.lang.String str, long j);

    int OLrzqt(@NotNull java.util.List<WalletClosedCoinEntity> list);

    java.util.List<WalletCoinAssetEntity> copydefault(@NotNull java.lang.String str, long j);

    java.util.List<java.lang.Long> copydefault(@NotNull java.lang.String str, @NotNull java.util.List<WalletCoinAssetEntity> list);

    java.util.List<java.lang.Long> copydefault(@NotNull java.util.List<WalletOpenedCoinEntity> list);

    java.util.List<java.lang.Long> djBIcL(@NotNull java.util.List<WalletCoinAssetEntity> list);

    java.util.List<java.lang.Long> gEmmrt(@NotNull java.util.List<WalletOpenedCoinEntity> list);

    int valueOf(@NotNull java.util.List<WalletCoinAssetPartialEntity> list);

    /* JADX INFO: renamed from: o.cLb$Application */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public static long AEQbTJ(@NotNull InterfaceC11353cLb interfaceC11353cLb, @NotNull WalletOpenedCoinEntity walletOpenedCoinEntity) {
            Intrinsics.checkNotNullParameter(walletOpenedCoinEntity, "");
            interfaceC11353cLb.OLrzqt(C56402yEa.EZpvd(new WalletClosedCoinEntity(walletOpenedCoinEntity.getWalletId(), walletOpenedCoinEntity.getCoinId())));
            return interfaceC11353cLb.KWHzl(walletOpenedCoinEntity);
        }

        public static long KWHzl(@NotNull InterfaceC11353cLb interfaceC11353cLb, @NotNull WalletClosedCoinEntity walletClosedCoinEntity) {
            Intrinsics.checkNotNullParameter(walletClosedCoinEntity, "");
            interfaceC11353cLb.KWHzl(C56402yEa.EZpvd(new WalletOpenedCoinEntity(walletClosedCoinEntity.getWalletId(), walletClosedCoinEntity.getCoinId())));
            return interfaceC11353cLb.AEQbTJ(walletClosedCoinEntity);
        }

        public static java.util.List<java.lang.Long> EZpvd(@NotNull InterfaceC11353cLb interfaceC11353cLb, @NotNull java.lang.String str, @NotNull java.util.List<WalletCoinAssetEntity> list) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            interfaceC11353cLb.EZpvd(str);
            return interfaceC11353cLb.AhwBna(list);
        }

        public static java.util.List<java.lang.Long> EZpvd(@NotNull InterfaceC11353cLb interfaceC11353cLb, @NotNull java.lang.String str, long j, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            java.util.List<WalletCoinAssetEntity> listCopydefault = interfaceC11353cLb.copydefault(str, j);
            for (WalletCoinAssetEntity walletCoinAssetEntity : listCopydefault) {
                walletCoinAssetEntity.setAddress(str2);
                walletCoinAssetEntity.setZeroValues();
            }
            interfaceC11353cLb.OLrzqt(str, j);
            return interfaceC11353cLb.AhwBna(listCopydefault);
        }

        public static java.util.List<java.lang.Long> AEQbTJ(@NotNull InterfaceC11353cLb interfaceC11353cLb, @NotNull java.util.List<WalletOpenedCoinEntity> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (WalletOpenedCoinEntity walletOpenedCoinEntity : list) {
                arrayList.add(new WalletClosedCoinEntity(walletOpenedCoinEntity.getWalletId(), walletOpenedCoinEntity.getCoinId()));
            }
            interfaceC11353cLb.OLrzqt(arrayList);
            return interfaceC11353cLb.gEmmrt(list);
        }

        public static java.util.List<java.lang.Long> copydefault(@NotNull InterfaceC11353cLb interfaceC11353cLb, @NotNull java.util.List<WalletClosedCoinEntity> list) {
            Intrinsics.checkNotNullParameter(list, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
            for (WalletClosedCoinEntity walletClosedCoinEntity : list) {
                arrayList.add(new WalletOpenedCoinEntity(walletClosedCoinEntity.getWalletId(), walletClosedCoinEntity.getCoinId()));
            }
            interfaceC11353cLb.KWHzl(arrayList);
            return interfaceC11353cLb.EZpvd(list);
        }
    }
}

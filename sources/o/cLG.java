package o;

import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressSegWitEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.HardwareInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.MPCWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletRepairEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletSignDataEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface cLG {
    java.util.List<java.lang.Long> AEQbTJ(@NotNull java.util.List<ChainAddressSegWitEntity> list);

    java.util.List<java.lang.Long> AYXKKw(@NotNull java.util.List<WalletRepairEntity> list);

    int AhwBna(@NotNull java.util.List<WalletEntity> list);

    int EZpvd(@NotNull MPCWalletEntity mPCWalletEntity);

    java.util.List<java.lang.Long> EZpvd(@NotNull java.util.List<WalletSignDataEntity> list);

    void EZpvd(RootWalletEntity rootWalletEntity, java.util.List<RootWalletEntity> list, @NotNull WalletEntity walletEntity, java.util.List<WalletEntity> list2, @NotNull java.util.List<ChainAddressEntity> list3, @NotNull java.util.List<CustomChainAddressEntity> list4, java.util.List<ChainAddressSegWitEntity> list5, EOSInfoEntity eOSInfoEntity, java.util.List<MPCWalletEntity> list6, java.util.List<SepInfoEntity> list7, HardwareInfoEntity hardwareInfoEntity, @NotNull java.util.List<WalletSignDataEntity> list8);

    int KWHzl(@NotNull WalletEntity walletEntity);

    long KWHzl(@NotNull EOSInfoEntity eOSInfoEntity);

    java.util.List<java.lang.Long> KWHzl(@NotNull java.util.List<CustomChainAddressEntity> list);

    int OLrzqt(@NotNull RootWalletEntity rootWalletEntity);

    int OLrzqt(@NotNull java.lang.String str);

    java.util.List<java.lang.Long> OLrzqt(@NotNull java.util.List<ChainAddressEntity> list);

    void OLrzqt(RootWalletEntity rootWalletEntity, java.util.List<RootWalletEntity> list, java.util.List<WalletEntity> list2, java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>> map, java.util.List<WalletRepairEntity> list3, java.util.List<ChainAddressEntity> list4);

    void OLrzqt(@NotNull java.lang.String str, java.util.List<RootWalletEntity> list, java.util.List<RootWalletEntity> list2, java.util.List<MPCWalletEntity> list3, java.util.List<WalletEntity> list4, java.util.List<MPCWalletEntity> list5);

    long copydefault(@NotNull HardwareInfoEntity hardwareInfoEntity);

    long copydefault(@NotNull RootWalletEntity rootWalletEntity);

    long copydefault(@NotNull WalletEntity walletEntity);

    java.util.List<java.lang.Long> copydefault(@NotNull java.util.List<MPCWalletEntity> list);

    java.util.List<java.lang.Long> djBIcL(@NotNull java.util.List<SepInfoEntity> list);

    java.util.List<java.lang.Long> valueOf(@NotNull java.util.List<WalletEntity> list);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar {
        public static void copydefault(@NotNull cLG clg, RootWalletEntity rootWalletEntity, java.util.List<RootWalletEntity> list, @NotNull WalletEntity walletEntity, java.util.List<WalletEntity> list2, @NotNull java.util.List<ChainAddressEntity> list3, @NotNull java.util.List<CustomChainAddressEntity> list4, java.util.List<ChainAddressSegWitEntity> list5, EOSInfoEntity eOSInfoEntity, java.util.List<MPCWalletEntity> list6, java.util.List<SepInfoEntity> list7, HardwareInfoEntity hardwareInfoEntity, @NotNull java.util.List<WalletSignDataEntity> list8) {
            Intrinsics.checkNotNullParameter(walletEntity, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            Intrinsics.checkNotNullParameter(list8, "");
            if (rootWalletEntity != null) {
                clg.copydefault(rootWalletEntity);
            }
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    clg.OLrzqt((RootWalletEntity) it.next());
                }
            }
            clg.copydefault(walletEntity);
            if (list2 != null) {
                java.util.Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    clg.KWHzl((WalletEntity) it2.next());
                }
            }
            clg.OLrzqt(list3);
            if (list5 != null && !list5.isEmpty()) {
                clg.AEQbTJ(list5);
            }
            if (eOSInfoEntity != null) {
                clg.KWHzl(eOSInfoEntity);
            }
            if (list6 != null && !list6.isEmpty()) {
                clg.copydefault(list6);
            }
            if (list7 != null && !list7.isEmpty()) {
                clg.djBIcL(list7);
            }
            if (hardwareInfoEntity != null) {
                clg.copydefault(hardwareInfoEntity);
            }
            if (!list4.isEmpty()) {
                clg.KWHzl(list4);
            }
            if (!list8.isEmpty()) {
                clg.EZpvd(list8);
            }
        }

        public static void EZpvd(@NotNull cLG clg, RootWalletEntity rootWalletEntity, java.util.List<RootWalletEntity> list, java.util.List<WalletEntity> list2, java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>> map, java.util.List<WalletRepairEntity> list3, java.util.List<ChainAddressEntity> list4) {
            java.util.Collection<? extends java.util.List<ChainAddressEntity>> collectionValues;
            if (rootWalletEntity != null) {
                clg.copydefault(rootWalletEntity);
            }
            if (list != null) {
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    clg.OLrzqt((RootWalletEntity) it.next());
                }
            }
            if (list2 != null) {
                clg.valueOf(list2);
            }
            if (map != null && (collectionValues = map.values()) != null) {
                java.util.Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    clg.OLrzqt((java.util.List<ChainAddressEntity>) it2.next());
                }
            }
            if (list3 != null) {
                clg.AYXKKw(list3);
            }
            if (list4 != null) {
                clg.OLrzqt(list4);
            }
        }

        public static void EZpvd(@NotNull cLG clg, @NotNull java.lang.String str, java.util.List<RootWalletEntity> list, java.util.List<RootWalletEntity> list2, java.util.List<MPCWalletEntity> list3, java.util.List<WalletEntity> list4, java.util.List<MPCWalletEntity> list5) {
            Intrinsics.checkNotNullParameter(str, "");
            if (list2 != null) {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    clg.copydefault((RootWalletEntity) it.next());
                }
            }
            if (list != null) {
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    clg.OLrzqt((RootWalletEntity) it2.next());
                }
            }
            if (list3 != null) {
                clg.copydefault(list3);
            }
            if (list4 != null) {
                clg.AhwBna(list4);
            }
            if (list5 != null) {
                java.util.Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    clg.EZpvd((MPCWalletEntity) it3.next());
                }
            }
            clg.OLrzqt(str);
        }
    }
}

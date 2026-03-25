package o;

import com.okinc.business.defi.biz.database.wallet.entity.AddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.KVEntity;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity;
import com.okinc.business.defi.biz.database.wallet.entity.SyncItemEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cKn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC11338cKn {
    java.util.List<java.lang.Long> AEQbTJ(@NotNull java.util.List<AddressEntity> list);

    void AEQbTJ(@NotNull java.util.List<RootWalletEntity> list, @NotNull java.util.List<WalletEntity> list2, @NotNull java.util.List<AddressEntity> list3, @NotNull java.util.List<ChainAddressEntity> list4, @NotNull java.util.List<WalletCoinAssetEntity> list5, @NotNull java.util.List<EOSInfoEntity> list6, @NotNull java.util.List<KVEntity> list7, @NotNull java.util.List<C11451cOt> list8, @NotNull java.util.List<SepInfoEntity> list9, @NotNull java.util.List<SyncItemEntity> list10);

    java.util.List<java.lang.Long> AYXKKw(@NotNull java.util.List<SepInfoEntity> list);

    java.util.List<java.lang.Long> AhwBna(@NotNull java.util.List<SyncItemEntity> list);

    java.util.List<java.lang.Long> EZpvd(@NotNull java.util.List<EOSInfoEntity> list);

    java.util.List<java.lang.Long> KWHzl(@NotNull java.util.List<WalletCoinAssetEntity> list);

    java.util.List<java.lang.Long> OLrzqt(@NotNull java.util.List<ChainAddressEntity> list);

    java.util.List<java.lang.Long> copydefault(@NotNull java.util.List<KVEntity> list);

    java.util.List<java.lang.Long> djBIcL(@NotNull java.util.List<WalletEntity> list);

    java.util.List<java.lang.Long> gEmmrt(@NotNull java.util.List<C11451cOt> list);

    java.util.List<java.lang.Long> valueOf(@NotNull java.util.List<RootWalletEntity> list);

    /* JADX INFO: renamed from: o.cKn$ActionBar */
    /* JADX INFO: loaded from: classes14.dex */
    public static final class ActionBar {
        public static void copydefault(@NotNull InterfaceC11338cKn interfaceC11338cKn, @NotNull java.util.List<RootWalletEntity> list, @NotNull java.util.List<WalletEntity> list2, @NotNull java.util.List<AddressEntity> list3, @NotNull java.util.List<ChainAddressEntity> list4, @NotNull java.util.List<WalletCoinAssetEntity> list5, @NotNull java.util.List<EOSInfoEntity> list6, @NotNull java.util.List<KVEntity> list7, @NotNull java.util.List<C11451cOt> list8, @NotNull java.util.List<SepInfoEntity> list9, @NotNull java.util.List<SyncItemEntity> list10) {
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(list2, "");
            Intrinsics.checkNotNullParameter(list3, "");
            Intrinsics.checkNotNullParameter(list4, "");
            Intrinsics.checkNotNullParameter(list5, "");
            Intrinsics.checkNotNullParameter(list6, "");
            Intrinsics.checkNotNullParameter(list7, "");
            Intrinsics.checkNotNullParameter(list8, "");
            Intrinsics.checkNotNullParameter(list9, "");
            Intrinsics.checkNotNullParameter(list10, "");
            interfaceC11338cKn.valueOf(list);
            interfaceC11338cKn.djBIcL(list2);
            interfaceC11338cKn.AEQbTJ(list3);
            interfaceC11338cKn.OLrzqt(list4);
            interfaceC11338cKn.KWHzl(list5);
            interfaceC11338cKn.EZpvd(list6);
            interfaceC11338cKn.copydefault(list7);
            interfaceC11338cKn.gEmmrt(list8);
            interfaceC11338cKn.AYXKKw(list9);
            interfaceC11338cKn.AhwBna(list10);
        }
    }
}

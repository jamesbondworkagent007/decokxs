package o;

import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
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
import com.okinc.business.defi.biz.model.wallet.MpcWalletEncodeInfo;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cQD {
    public final java.lang.String EZpvd = "WalletCreateRepository";
    public final cLG AEQbTJ = WalletDatabase.Companion.OLrzqt(C9678baC.Companion.AEQbTJ()).gasjUx();

    public final AbstractC58260yxt<Unit> copydefault(final RootWalletEntity rootWalletEntity, final java.util.List<RootWalletEntity> list, @NotNull final WalletEntity walletEntity, final java.util.List<WalletEntity> list2, @NotNull final java.util.List<ChainAddressEntity> list3, @NotNull final java.util.List<CustomChainAddressEntity> list4, final java.util.List<ChainAddressSegWitEntity> list5, final EOSInfoEntity eOSInfoEntity, final java.util.List<MPCWalletEntity> list6, final java.util.List<SepInfoEntity> list7, final HardwareInfoEntity hardwareInfoEntity, @NotNull final java.util.List<WalletSignDataEntity> list8) {
        java.lang.String rootId;
        java.lang.String pubKey;
        Intrinsics.checkNotNullParameter(walletEntity, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        Intrinsics.checkNotNullParameter(list8, "");
        java.lang.String str = this.EZpvd;
        if (rootWalletEntity == null || (rootId = rootWalletEntity.getRootId()) == null) {
            rootId = "";
        }
        java.lang.String strValueOf = list != null ? java.lang.Integer.valueOf(list.size()) : "0";
        java.lang.String id = walletEntity.getId();
        java.lang.String strValueOf2 = list2 != null ? java.lang.Integer.valueOf(list2.size()) : "0";
        int size = list3.size();
        int size2 = list4.size();
        java.lang.Object objValueOf = list5 != null ? java.lang.Integer.valueOf(list5.size()) : "0";
        int size3 = list8.size();
        if (eOSInfoEntity == null || (pubKey = eOSInfoEntity.getPubKey()) == null) {
            pubKey = "";
        }
        C10856bwO.copydefault(str, 0, "createWallet  rootWalletId=" + rootId + "  needUpdateRootWalletSize=" + strValueOf + "  walletId=" + id + "  needUpdateWalletSize=" + strValueOf2 + "  chainAddressSize=" + size + "  customChainAddressSize=" + size2 + "  segwitAddressSize=" + objValueOf + "  signDataEntitiesSize=" + size3 + "  eosInfo=" + pubKey + "  hardwareInfo=" + (hardwareInfoEntity != null ? java.lang.Integer.valueOf(hardwareInfoEntity.getHardwareType()) : ""));
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQD.OLrzqt(this.KWHzl, rootWalletEntity, list, walletEntity, list2, list3, list4, list5, eOSInfoEntity, list6, list7, hardwareInfoEntity, list8);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit OLrzqt(cQD cqd, RootWalletEntity rootWalletEntity, java.util.List list, WalletEntity walletEntity, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5, EOSInfoEntity eOSInfoEntity, java.util.List list6, java.util.List list7, HardwareInfoEntity hardwareInfoEntity, java.util.List list8) {
        cqd.AEQbTJ.EZpvd(rootWalletEntity, list, walletEntity, list2, list3, list4, list5, eOSInfoEntity, list6, list7, hardwareInfoEntity, list8);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> OLrzqt(final RootWalletEntity rootWalletEntity, final java.util.List<RootWalletEntity> list, final java.util.List<WalletEntity> list2, final java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>> map, final java.util.List<WalletRepairEntity> list3, final java.util.List<ChainAddressEntity> list4) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQD.EZpvd(this.KWHzl, rootWalletEntity, list, list2, map, list3, list4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit EZpvd(cQD cqd, RootWalletEntity rootWalletEntity, java.util.List list, java.util.List list2, java.util.Map map, java.util.List list3, java.util.List list4) {
        cqd.AEQbTJ.OLrzqt(rootWalletEntity, (java.util.List<RootWalletEntity>) list, (java.util.List<WalletEntity>) list2, (java.util.Map<java.lang.String, ? extends java.util.List<ChainAddressEntity>>) map, (java.util.List<WalletRepairEntity>) list3, (java.util.List<ChainAddressEntity>) list4);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> OLrzqt(final java.lang.String str, final java.util.List<RootWalletEntity> list, final java.util.List<RootWalletEntity> list2, final java.util.List<MPCWalletEntity> list3, final java.util.List<WalletEntity> list4, final java.util.List<MPCWalletEntity> list5) {
        C10856bwO.copydefault("WalletCreateRepository", 0, "mpc update data insert DB");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQD.copydefault(this.copydefault, str, list, list2, list3, list4, list5);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit copydefault(cQD cqd, java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5) {
        cqd.AEQbTJ.OLrzqt(str, (java.util.List<RootWalletEntity>) list, (java.util.List<RootWalletEntity>) list2, (java.util.List<MPCWalletEntity>) list3, (java.util.List<WalletEntity>) list4, (java.util.List<MPCWalletEntity>) list5);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> EZpvd(@NotNull java.lang.String str, @NotNull java.util.List<RootWalletEntity> list, java.util.List<C12786ctZ> list2, java.util.List<MpcWalletEncodeInfo> list3, java.util.List<WalletEntity> list4, java.util.List<MpcWalletEncodeInfo> list5) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        if (list2 != null) {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            java.util.Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C12786ctZ) it.next()).KWHzl());
            }
        } else {
            arrayList = null;
        }
        if (list3 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(list3, 10));
            java.util.Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((MpcWalletEncodeInfo) it2.next()).convertToEntity$OKWallet_wallet_impl());
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        if (list5 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList(C56403yEb.AYXKKw(list5, 10));
            java.util.Iterator<T> it3 = list5.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((MpcWalletEncodeInfo) it3.next()).convertToEntity$OKWallet_wallet_impl());
            }
            arrayList3 = arrayList5;
        } else {
            arrayList3 = null;
        }
        return OLrzqt(str, list, arrayList, arrayList2, list4, arrayList3);
    }
}

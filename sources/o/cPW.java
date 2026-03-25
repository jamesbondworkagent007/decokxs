package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cPW {
    public InterfaceC11338cKn AEQbTJ;

    public cPW(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = WalletDatabase.Companion.OLrzqt(application).fZBcTu();
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        WalletEntity walletEntity;
        java.lang.String str3 = str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<WalletEntity> listEZpvd = new cOD().EZpvd();
        RootWalletEntity rootWalletEntity = null;
        int i = 0;
        int i2 = 0;
        for (java.lang.Object obj : listEZpvd) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            WalletEntity walletEntity2 = (WalletEntity) obj;
            int type = walletEntity2.getType();
            if (type == WalletType.HDWallet.ordinal()) {
                java.lang.String string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                RootWalletEntity rootWalletEntity2 = new RootWalletEntity(string, walletEntity2.getName(), i2, java.lang.System.currentTimeMillis(), 0, 16, null);
                arrayList.add(rootWalletEntity2);
                walletEntity2.setRootWalletId(rootWalletEntity2.getRootId());
                walletEntity2.setName(str3 + " 01");
                i = i2;
            } else if (type == WalletType.KeyWallet.ordinal()) {
                if (rootWalletEntity == null) {
                    java.lang.String string2 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "");
                    walletEntity = walletEntity2;
                    rootWalletEntity = new RootWalletEntity(string2, str, i, java.lang.System.currentTimeMillis(), 0, 16, null);
                } else {
                    walletEntity = walletEntity2;
                }
                walletEntity.setRootWalletId(rootWalletEntity.getRootId());
            }
            if (rootWalletEntity != null && rootWalletEntity.getSortIndex() < i) {
                rootWalletEntity.setSortIndex(i);
            }
            i2++;
            str3 = str2;
        }
        if (rootWalletEntity != null) {
            arrayList.add(rootWalletEntity);
        }
        this.AEQbTJ.AEQbTJ(arrayList, listEZpvd, new C11450cOs().EZpvd(), new C11456cOy().EZpvd(), new C11455cOx().EZpvd(), new C11454cOw().EZpvd(), new C11453cOv().EZpvd(), new C11457cOz().EZpvd(), new cOC().EZpvd(), new cOE().EZpvd());
    }
}

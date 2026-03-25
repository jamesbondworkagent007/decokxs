package o;

import com.okinc.business.defi.biz.database.wallet.entity.RootWalletEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public interface cNP {
    RootWalletEntity AEQbTJ(@NotNull java.lang.String str);

    void AEQbTJ(@NotNull WalletEntity walletEntity);

    int EZpvd(@NotNull RootWalletEntity rootWalletEntity);

    void EZpvd(@NotNull java.lang.String str);

    void EZpvd(@NotNull java.util.List<java.lang.String> list);

    java.util.List<WalletEntity> KWHzl(@NotNull java.lang.String str);

    java.util.List<RootWalletEntity> OLrzqt();

    void OLrzqt(@NotNull java.lang.String str);

    int copydefault(@NotNull WalletEntity walletEntity);

    WalletEntity copydefault(@NotNull java.lang.String str);

    void copydefault(@NotNull java.util.List<java.lang.String> list);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Application {
        public static void AEQbTJ(@NotNull cNP cnp, @NotNull java.util.List<java.lang.String> list) {
            RootWalletEntity rootWalletEntity;
            WalletEntity walletEntity;
            java.lang.Object next;
            Intrinsics.checkNotNullParameter(list, "");
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            java.util.Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                if (!booleanRef.element) {
                    java.util.Iterator<T> it2 = cnp.KWHzl(str).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (((WalletEntity) next).getMain() == C11600cUg.OLrzqt(true)) {
                                break;
                            }
                        }
                    }
                    booleanRef.element = next != null;
                }
                cnp.EZpvd(cnp.AEQbTJ(str));
            }
            if (!booleanRef.element || (rootWalletEntity = (RootWalletEntity) CollectionsKt___CollectionsKt.firstOrNull(cnp.OLrzqt())) == null || (walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(cnp.KWHzl(rootWalletEntity.getRootId()))) == null) {
                return;
            }
            walletEntity.setMain(C11600cUg.OLrzqt(true));
            cnp.AEQbTJ(walletEntity);
        }

        public static void OLrzqt(@NotNull cNP cnp, @NotNull java.lang.String str) {
            java.lang.Object next;
            RootWalletEntity rootWalletEntity;
            WalletEntity walletEntity;
            Intrinsics.checkNotNullParameter(str, "");
            java.util.Iterator<T> it = cnp.KWHzl(str).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((WalletEntity) next).getMain() == C11600cUg.OLrzqt(true)) {
                        break;
                    }
                }
            }
            boolean z = next != null;
            cnp.EZpvd(cnp.AEQbTJ(str));
            if (!z || (rootWalletEntity = (RootWalletEntity) CollectionsKt___CollectionsKt.firstOrNull(cnp.OLrzqt())) == null || (walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(cnp.KWHzl(rootWalletEntity.getRootId()))) == null) {
                return;
            }
            walletEntity.setMain(C11600cUg.OLrzqt(true));
            cnp.AEQbTJ(walletEntity);
        }

        public static void AEQbTJ(@NotNull cNP cnp, @NotNull java.lang.String str) {
            WalletEntity walletEntity;
            Intrinsics.checkNotNullParameter(str, "");
            WalletEntity walletEntityCopydefault = cnp.copydefault(str);
            RootWalletEntity rootWalletEntityAEQbTJ = cnp.AEQbTJ(walletEntityCopydefault.getRootWalletId());
            java.util.List<WalletEntity> listKWHzl = cnp.KWHzl(rootWalletEntityAEQbTJ.getRootId());
            if (listKWHzl.size() == 1 && Intrinsics.EZpvd((java.lang.Object) ((WalletEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)).getId(), (java.lang.Object) str)) {
                cnp.EZpvd(rootWalletEntityAEQbTJ);
            } else {
                cnp.copydefault(walletEntityCopydefault);
            }
            if (walletEntityCopydefault.getMain() == C11600cUg.OLrzqt(true)) {
                java.util.List<WalletEntity> listKWHzl2 = cnp.KWHzl(rootWalletEntityAEQbTJ.getRootId());
                if (listKWHzl2 == null || listKWHzl2.isEmpty()) {
                    RootWalletEntity rootWalletEntity = (RootWalletEntity) CollectionsKt___CollectionsKt.firstOrNull(cnp.OLrzqt());
                    if (rootWalletEntity == null || (walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(cnp.KWHzl(rootWalletEntity.getRootId()))) == null) {
                        return;
                    }
                    walletEntity.setMain(C11600cUg.OLrzqt(true));
                    cnp.AEQbTJ(walletEntity);
                    return;
                }
                WalletEntity walletEntity2 = (WalletEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl2);
                walletEntity2.setMain(C11600cUg.OLrzqt(true));
                cnp.AEQbTJ(walletEntity2);
            }
        }

        public static void KWHzl(@NotNull cNP cnp, @NotNull java.util.List<java.lang.String> list) {
            RootWalletEntity rootWalletEntity;
            WalletEntity walletEntity;
            Intrinsics.checkNotNullParameter(list, "");
            boolean zKWHzl = false;
            for (java.lang.String str : list) {
                WalletEntity walletEntityCopydefault = cnp.copydefault(str);
                if (!zKWHzl) {
                    zKWHzl = C11600cUg.KWHzl(walletEntityCopydefault.getMain());
                }
                RootWalletEntity rootWalletEntityAEQbTJ = cnp.AEQbTJ(walletEntityCopydefault.getRootWalletId());
                java.util.List<WalletEntity> listKWHzl = cnp.KWHzl(rootWalletEntityAEQbTJ.getRootId());
                if (listKWHzl.size() == 1 && Intrinsics.EZpvd((java.lang.Object) ((WalletEntity) CollectionsKt___CollectionsKt.AuCTelauCTel(listKWHzl)).getId(), (java.lang.Object) str)) {
                    cnp.EZpvd(rootWalletEntityAEQbTJ);
                } else {
                    cnp.copydefault(walletEntityCopydefault);
                }
            }
            if (!zKWHzl || (rootWalletEntity = (RootWalletEntity) CollectionsKt___CollectionsKt.firstOrNull(cnp.OLrzqt())) == null || (walletEntity = (WalletEntity) CollectionsKt___CollectionsKt.firstOrNull(cnp.KWHzl(rootWalletEntity.getRootId()))) == null) {
                return;
            }
            walletEntity.setMain(C11600cUg.OLrzqt(true));
            cnp.AEQbTJ(walletEntity);
        }
    }
}

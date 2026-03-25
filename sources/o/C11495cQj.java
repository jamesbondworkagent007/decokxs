package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletClosedCoinEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPartialEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetPnlEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cQj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11495cQj {
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public final InterfaceC11353cLb AEQbTJ;

    /* JADX INFO: renamed from: o.cQj$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cQj.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public static /* synthetic */ C11495cQj getInstance$default(Application application, android.content.Context context, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                context = C9678baC.Companion.AEQbTJ();
            }
            return application.KWHzl(context);
        }

        public final C11495cQj KWHzl(@NotNull android.content.Context context) {
            Intrinsics.checkNotNullParameter(context, "");
            return C13458dMb.EZpvd(context).AuCTelauCTel();
        }
    }

    public C11495cQj(@NotNull InterfaceC11353cLb interfaceC11353cLb) {
        Intrinsics.checkNotNullParameter(interfaceC11353cLb, "");
        this.AEQbTJ = interfaceC11353cLb;
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> AEQbTJ(@NotNull final java.lang.String str, final long j, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.EZpvd(this.AEQbTJ, str, j, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List EZpvd(C11495cQj c11495cQj, java.lang.String str, long j, java.lang.String str2) {
        return c11495cQj.AEQbTJ.AEQbTJ(str, j, str2);
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> KWHzl(@NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.KWHzl(this.OLrzqt, str, str2, str3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List KWHzl(C11495cQj c11495cQj, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.util.List<WalletCoinAssetEntity> listAEQbTJ = c11495cQj.AEQbTJ.AEQbTJ(str);
        for (WalletCoinAssetEntity walletCoinAssetEntity : listAEQbTJ) {
            if (Intrinsics.EZpvd((java.lang.Object) walletCoinAssetEntity.getAddress(), (java.lang.Object) str2)) {
                walletCoinAssetEntity.setAddress(str3);
                walletCoinAssetEntity.setZeroValues();
            }
        }
        return c11495cQj.AEQbTJ.copydefault(str, listAEQbTJ);
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> OLrzqt(@NotNull final java.lang.String str, @NotNull final java.util.List<WalletCoinAssetEntity> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.AEQbTJ(this.copydefault, str, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List AEQbTJ(C11495cQj c11495cQj, java.lang.String str, java.util.List list) {
        return c11495cQj.AEQbTJ.copydefault(str, (java.util.List<WalletCoinAssetEntity>) list);
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> djBIcL(@NotNull final java.util.List<WalletCoinAssetEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.AkhnZx(this.AEQbTJ, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List AkhnZx(C11495cQj c11495cQj, java.util.List list) {
        return c11495cQj.AEQbTJ.AhwBna(list);
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> copydefault(@NotNull final java.util.List<WalletCoinAssetEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.gEmmrt(this.KWHzl, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List gEmmrt(C11495cQj c11495cQj, java.util.List list) {
        return c11495cQj.AEQbTJ.djBIcL(list);
    }

    public final AbstractC58260yxt<java.lang.Long> EZpvd(@NotNull final WalletCoinAssetEntity walletCoinAssetEntity) {
        Intrinsics.checkNotNullParameter(walletCoinAssetEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.EZpvd(this.AEQbTJ, walletCoinAssetEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long EZpvd(C11495cQj c11495cQj, WalletCoinAssetEntity walletCoinAssetEntity) {
        return java.lang.Long.valueOf(c11495cQj.AEQbTJ.EZpvd(walletCoinAssetEntity));
    }

    public final AbstractC58260yxt<java.lang.Integer> EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.AEQbTJ(this.EZpvd, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer AEQbTJ(C11495cQj c11495cQj, java.lang.String str) {
        return java.lang.Integer.valueOf(c11495cQj.AEQbTJ.EZpvd(str));
    }

    public final AbstractC58260yxt<java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.Long, java.util.HashMap<java.lang.String, WalletCoinAssetEntity>>>> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.copydefault(this.KWHzl, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.HashMap copydefault(C11495cQj c11495cQj, java.lang.String str) {
        java.util.HashMap map = new java.util.HashMap();
        for (WalletCoinAssetEntity walletCoinAssetEntity : c11495cQj.AEQbTJ.AEQbTJ(str)) {
            java.lang.Object map2 = map.get(str);
            if (map2 == null) {
                map2 = new java.util.HashMap();
                map.put(str, map2);
            }
            java.util.Map map3 = (java.util.Map) map2;
            java.lang.Long lValueOf = java.lang.Long.valueOf(walletCoinAssetEntity.getCoinId());
            java.lang.Object map4 = map3.get(lValueOf);
            if (map4 == null) {
                map4 = new java.util.HashMap();
                map3.put(lValueOf, map4);
            }
            ((java.util.Map) map4).put(walletCoinAssetEntity.getAddress(), walletCoinAssetEntity);
        }
        return map;
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> AEQbTJ() {
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.KWHzl(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List KWHzl(C11495cQj c11495cQj) {
        return c11495cQj.AEQbTJ.KWHzl();
    }

    public final AbstractC58260yxt<java.lang.Integer> EZpvd(@NotNull final java.util.List<WalletCoinAssetPartialEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.AYXKKw(this.KWHzl, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Integer AYXKKw(C11495cQj c11495cQj, java.util.List list) {
        return java.lang.Integer.valueOf(c11495cQj.AEQbTJ.valueOf(list));
    }

    public final AbstractC58260yxt<java.lang.Integer> AEQbTJ(@NotNull final java.util.List<WalletCoinAssetPnlEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.lang.Integer> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.fetchVPNInfo(this.copydefault, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Integer fetchVPNInfo(C11495cQj c11495cQj, java.util.List list) {
        return java.lang.Integer.valueOf(c11495cQj.AEQbTJ.AYXKKw(list));
    }

    public final AbstractC58260yxt<java.lang.Long> AEQbTJ(@NotNull final WalletOpenedCoinEntity walletOpenedCoinEntity) {
        Intrinsics.checkNotNullParameter(walletOpenedCoinEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.copydefault(this.KWHzl, walletOpenedCoinEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long copydefault(C11495cQj c11495cQj, WalletOpenedCoinEntity walletOpenedCoinEntity) {
        return java.lang.Long.valueOf(c11495cQj.AEQbTJ.EZpvd(walletOpenedCoinEntity));
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> OLrzqt(@NotNull final java.util.List<WalletOpenedCoinEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.valueOf(this.OLrzqt, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List valueOf(C11495cQj c11495cQj, java.util.List list) {
        return c11495cQj.AEQbTJ.copydefault(list);
    }

    public final AbstractC58260yxt<java.lang.Long> copydefault(@NotNull final WalletClosedCoinEntity walletClosedCoinEntity) {
        Intrinsics.checkNotNullParameter(walletClosedCoinEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.copydefault(this.AEQbTJ, walletClosedCoinEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long copydefault(C11495cQj c11495cQj, WalletClosedCoinEntity walletClosedCoinEntity) {
        return java.lang.Long.valueOf(c11495cQj.AEQbTJ.KWHzl(walletClosedCoinEntity));
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> KWHzl(@NotNull final java.util.List<WalletClosedCoinEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11495cQj.AhwBna(this.copydefault, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List AhwBna(C11495cQj c11495cQj, java.util.List list) {
        return c11495cQj.AEQbTJ.AEQbTJ((java.util.List<WalletClosedCoinEntity>) list);
    }
}

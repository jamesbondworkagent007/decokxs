package o;

import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinBalanceEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainCoinMetaEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainMetaStatusEntity;
import com.okinc.business.defi.biz.database.wallet.entity.CustomChainWalletCoinEntity;
import com.okinc.business.defi.biz.database.wallet.repository.CustomChainRepository$deleteCustomChainList$1;
import com.okinc.business.defi.biz.database.wallet.repository.CustomChainRepository$updateCustomChainCustomStatus$1;
import java.util.concurrent.Callable;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxSingleKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cOR {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.cPf
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return cOR.KWHzl();
        }
    });

    public final cIL gEmmrt() {
        return (cIL) this.OLrzqt.getValue();
    }

    public static final cIL KWHzl() {
        return WalletDatabase.Companion.OLrzqt(C9678baC.Companion.AEQbTJ()).aKErDB();
    }

    public final AbstractC58260yxt<Unit> AEQbTJ(@NotNull final CustomChainMetaEntity customChainMetaEntity, @NotNull final java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list) {
        Intrinsics.checkNotNullParameter(customChainMetaEntity, "");
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.KWHzl(this.OLrzqt, list, customChainMetaEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit KWHzl(cOR cor, java.util.List list, CustomChainMetaEntity customChainMetaEntity) {
        cor.gEmmrt().copydefault((java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>>) list, customChainMetaEntity);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> EZpvd(@NotNull final java.util.List<CustomChainMetaEntity> list, @NotNull final java.util.List<CustomChainMetaStatusEntity> list2, @NotNull final java.util.List<java.lang.Long> list3, @NotNull final java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.KWHzl(this.copydefault, list, list2, list3, list4);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final Unit KWHzl(cOR cor, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        cor.gEmmrt().KWHzl(list, list2, list3, list4);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> AEQbTJ(@NotNull final java.util.List<CustomChainMetaEntity> list, @NotNull final java.util.List<Triple<java.lang.String, java.lang.Boolean, ChainAddressEntity>> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.OLrzqt(list, this, list2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final Unit OLrzqt(java.util.List list, cOR cor, java.util.List list2) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            CustomChainCoinMetaEntity nativeToken = ((CustomChainMetaEntity) it.next()).getNativeToken();
            if (nativeToken != null) {
                java.util.Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new CustomChainWalletCoinEntity((java.lang.String) ((Triple) it2.next()).getFirst(), nativeToken.getCoinId(), jCurrentTimeMillis));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            cor.gEmmrt().djBIcL(arrayList);
        }
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> KWHzl(final long j, @NotNull final java.lang.String str, @NotNull final java.lang.String str2, @NotNull final java.lang.String str3, @NotNull final java.lang.String str4, final long j2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.OLrzqt(this.OLrzqt, j, str, str2, str3, str4, j2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit OLrzqt(cOR cor, long j, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j2) {
        cor.gEmmrt().KWHzl(j, str, str2, str3, str4, j2);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> KWHzl(final long j, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<Unit> abstractC58260yxtKWHzl = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.OLrzqt(this.EZpvd, j, str);
            }
        }).KWHzl(yBP.AEQbTJ());
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtKWHzl, "");
        return abstractC58260yxtKWHzl;
    }

    public static final Unit OLrzqt(cOR cor, long j, java.lang.String str) {
        cor.gEmmrt().KWHzl(j, str);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> AEQbTJ(@NotNull final java.util.List<kotlin.Pair<java.lang.Long, java.lang.Long>> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.djBIcL(this.AEQbTJ, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final Unit djBIcL(cOR cor, java.util.List list) {
        cor.gEmmrt().DbNXlk(list);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.util.List<cSW>> valueOf() {
        AbstractC58260yxt<java.util.List<cSW>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.AYXKKw(this.KWHzl);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List AYXKKw(cOR cor) {
        return cor.gEmmrt().KWHzl();
    }

    public final AbstractC58260yxt<java.util.List<cSW>> OLrzqt() {
        return C11607cUn.valueOf(valueOf());
    }

    public final AbstractC58260yxt<java.util.List<CustomChainMetaEntity>> EZpvd() {
        AbstractC58260yxt<java.util.List<CustomChainMetaEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.EZpvd(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List EZpvd(cOR cor) {
        return cor.gEmmrt().copydefault();
    }

    public final AbstractC58260yxt<java.util.List<java.lang.Long>> OLrzqt(@NotNull final java.util.List<CustomChainMetaStatusEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.OLrzqt(this.copydefault, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List OLrzqt(cOR cor, java.util.List list) {
        return cor.gEmmrt().gEmmrt(list);
    }

    public final AbstractC58260yxt<java.util.List<CustomChainMetaStatusEntity>> copydefault() {
        AbstractC58260yxt<java.util.List<CustomChainMetaStatusEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.gEmmrt(this.AEQbTJ);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List gEmmrt(cOR cor) {
        return cor.gEmmrt().OLrzqt();
    }

    public final AbstractC58260yxt<java.lang.Integer> OLrzqt(@NotNull java.util.HashSet<java.lang.Long> hashSet) {
        Intrinsics.checkNotNullParameter(hashSet, "");
        return RxSingleKt.rxSingle$default(null, new CustomChainRepository$updateCustomChainCustomStatus$1(this, hashSet, null), 1, null);
    }

    public final AbstractC58260yxt<Unit> EZpvd(@NotNull java.util.List<CustomChainMetaEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return RxSingleKt.rxSingle$default(null, new CustomChainRepository$deleteCustomChainList$1(this, list, null), 1, null);
    }

    public final AbstractC58260yxt<java.util.List<cSW>> AEQbTJ(final java.lang.Long l, final java.lang.String str) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.AEQbTJ(this.KWHzl, l, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List AEQbTJ(cOR cor, java.lang.Long l, java.lang.String str) {
        return cor.gEmmrt().OLrzqt(l, str);
    }

    public final AbstractC58260yxt<Unit> OLrzqt(final long j, @NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.KWHzl(this.AEQbTJ, j, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit KWHzl(cOR cor, long j, java.lang.String str) {
        cor.gEmmrt().AEQbTJ(j, str);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> KWHzl(@NotNull final CustomChainCoinMetaEntity customChainCoinMetaEntity) {
        Intrinsics.checkNotNullParameter(customChainCoinMetaEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.EZpvd(this.AEQbTJ, customChainCoinMetaEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit EZpvd(cOR cor, CustomChainCoinMetaEntity customChainCoinMetaEntity) {
        cor.gEmmrt().copydefault(customChainCoinMetaEntity);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.lang.Long> KWHzl(@NotNull final CustomChainWalletCoinEntity customChainWalletCoinEntity) {
        Intrinsics.checkNotNullParameter(customChainWalletCoinEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.OLrzqt(this.AEQbTJ, customChainWalletCoinEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Long OLrzqt(cOR cor, CustomChainWalletCoinEntity customChainWalletCoinEntity) {
        return java.lang.Long.valueOf(cor.gEmmrt().OLrzqt(customChainWalletCoinEntity));
    }

    public final AbstractC58260yxt<java.lang.Integer> copydefault(@NotNull final java.lang.String str, final long j) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.AEQbTJ(this.EZpvd, str, j);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.lang.Integer AEQbTJ(cOR cor, java.lang.String str, long j) {
        return java.lang.Integer.valueOf(cor.gEmmrt().KWHzl(str, j));
    }

    public final AbstractC58260yxt<Unit> KWHzl(@NotNull final java.util.List<CustomChainCoinBalanceEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<Unit> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cOR.copydefault(this.OLrzqt, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final Unit copydefault(cOR cor, java.util.List list) {
        cor.gEmmrt().AEQbTJ((java.util.List<CustomChainCoinBalanceEntity>) list);
        return Unit.INSTANCE;
    }
}

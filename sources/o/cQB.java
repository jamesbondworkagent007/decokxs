package o;

import com.okinc.business.defi.biz.database.wallet.WalletDatabase;
import com.okinc.business.defi.biz.database.wallet.entity.WalletClosedCoinEntity;
import com.okinc.business.defi.biz.database.wallet.entity.WalletOpenedCoinEntity;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cQB {
    public final cLB OLrzqt = WalletDatabase.Companion.OLrzqt(C9678baC.Companion.AEQbTJ()).flVtFt();

    public final AbstractC58185ywX<java.util.List<WalletOpenedCoinEntity>> EZpvd() {
        AbstractC58185ywX<java.util.List<WalletOpenedCoinEntity>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.cQz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQB.copydefault(this.OLrzqt);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List copydefault(cQB cqb) {
        return cqb.OLrzqt.copydefault();
    }

    public final AbstractC58185ywX<java.util.List<WalletClosedCoinEntity>> AEQbTJ() {
        AbstractC58185ywX<java.util.List<WalletClosedCoinEntity>> abstractC58185ywXAEQbTJ = AbstractC58185ywX.AEQbTJ(new Callable() { // from class: o.cQA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQB.EZpvd(this.EZpvd);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58185ywXAEQbTJ, "");
        return abstractC58185ywXAEQbTJ;
    }

    public static final java.util.List EZpvd(cQB cqb) {
        return cqb.OLrzqt.EZpvd();
    }

    public final AbstractC58260yxt<java.util.List<WalletClosedCoinEntity>> EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt<java.util.List<WalletClosedCoinEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQB.OLrzqt(this.KWHzl, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List OLrzqt(cQB cqb, java.lang.String str) {
        return cqb.OLrzqt.copydefault(str);
    }
}

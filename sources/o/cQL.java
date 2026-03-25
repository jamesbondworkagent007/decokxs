package o;

import com.okinc.business.defi.biz.constant.WalletType;
import com.okinc.business.defi.biz.database.wallet.dao.PasswordDao;
import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cQL {
    public final PasswordDao AEQbTJ;
    public final cNP EZpvd;
    public final InterfaceC11384cMf KWHzl;

    public cQL(@NotNull cNP cnp, @NotNull PasswordDao passwordDao, @NotNull InterfaceC11384cMf interfaceC11384cMf) {
        Intrinsics.checkNotNullParameter(cnp, "");
        Intrinsics.checkNotNullParameter(passwordDao, "");
        Intrinsics.checkNotNullParameter(interfaceC11384cMf, "");
        this.EZpvd = cnp;
        this.AEQbTJ = passwordDao;
        this.KWHzl = interfaceC11384cMf;
    }

    public final AbstractC58260yxt<Unit> KWHzl(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQL.KWHzl(this.KWHzl, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit KWHzl(cQL cql, java.util.List list) {
        cql.EZpvd.EZpvd((java.util.List<java.lang.String>) list);
        cql.KWHzl();
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> EZpvd(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQL.copydefault(this.AEQbTJ, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit copydefault(cQL cql, java.lang.String str) {
        cql.EZpvd.OLrzqt(str);
        cql.KWHzl();
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> OLrzqt(@NotNull final java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQL.AEQbTJ(this.KWHzl, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit AEQbTJ(cQL cql, java.lang.String str) {
        cql.EZpvd.EZpvd(str);
        cql.KWHzl();
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<Unit> OLrzqt(@NotNull final java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return cQL.EZpvd(this.KWHzl, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit EZpvd(cQL cql, java.util.List list) {
        cql.EZpvd.copydefault((java.util.List<java.lang.String>) list);
        cql.KWHzl();
        return Unit.INSTANCE;
    }

    public final void KWHzl() {
        boolean zEZpvd;
        java.util.List<WalletEntity> listEZpvd = this.KWHzl.EZpvd();
        if (!(listEZpvd instanceof java.util.Collection) || !listEZpvd.isEmpty()) {
            for (WalletEntity walletEntity : listEZpvd) {
                WalletType.Application application = WalletType.Companion;
                if (application.KWHzl(walletEntity.getType()) == WalletType.AAWallet) {
                    zEZpvd = C10333bmV.EZpvd.EZpvd(application.KWHzl(walletEntity.getEoaWalletType()));
                } else {
                    zEZpvd = C10333bmV.EZpvd.EZpvd(application.KWHzl(walletEntity.getType()));
                }
                if (zEZpvd) {
                    return;
                }
            }
        }
        this.AEQbTJ.KWHzl();
    }
}

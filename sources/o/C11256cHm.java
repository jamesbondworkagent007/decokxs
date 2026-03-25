package o;

import com.okinc.business.defi.biz.database.addressbook.WalletAddressBookDatabase;
import com.okinc.business.defi.biz.database.addressbook.entity.SendCoinRecordEntity;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cHm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11256cHm {
    public final cGW AEQbTJ;

    public C11256cHm(@NotNull android.app.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        this.AEQbTJ = WalletAddressBookDatabase.Companion.copydefault(application).EZpvd();
    }

    public AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> OLrzqt(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cHj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11256cHm.OLrzqt(this.KWHzl, str, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List OLrzqt(C11256cHm c11256cHm, java.lang.String str, java.lang.String str2) {
        return c11256cHm.AEQbTJ.EZpvd(str, str2);
    }

    public AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> KWHzl(@NotNull final java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cHq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11256cHm.AEQbTJ(this.KWHzl, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List AEQbTJ(C11256cHm c11256cHm, java.lang.String str) {
        return c11256cHm.AEQbTJ.KWHzl(str);
    }

    public AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> AEQbTJ(@NotNull final java.lang.String str, @NotNull final java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cHp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11256cHm.KWHzl(this.EZpvd, str, str2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List KWHzl(C11256cHm c11256cHm, java.lang.String str, java.lang.String str2) {
        return c11256cHm.AEQbTJ.AEQbTJ(str, str2);
    }

    public AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> copydefault(@NotNull final java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        AbstractC58260yxt<java.util.List<SendCoinRecordEntity>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cHn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11256cHm.EZpvd(this.OLrzqt, str);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List EZpvd(C11256cHm c11256cHm, java.lang.String str) {
        return c11256cHm.AEQbTJ.AEQbTJ(str);
    }

    public AbstractC58260yxt<java.lang.Long> OLrzqt(@NotNull final SendCoinRecordEntity sendCoinRecordEntity) {
        Intrinsics.checkNotNullParameter(sendCoinRecordEntity, "");
        AbstractC58260yxt<java.lang.Long> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cHl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11256cHm.copydefault(this.copydefault, sendCoinRecordEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.lang.Long copydefault(C11256cHm c11256cHm, SendCoinRecordEntity sendCoinRecordEntity) {
        return java.lang.Long.valueOf(c11256cHm.AEQbTJ.AEQbTJ(sendCoinRecordEntity));
    }

    public AbstractC58260yxt<java.util.List<java.lang.Long>> AEQbTJ(@NotNull final java.util.List<SendCoinRecordEntity> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC58260yxt<java.util.List<java.lang.Long>> abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cHo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11256cHm.AEQbTJ(this.copydefault, list);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return abstractC58260yxtCopydefault;
    }

    public static final java.util.List AEQbTJ(C11256cHm c11256cHm, java.util.List list) {
        return c11256cHm.AEQbTJ.AEQbTJ((java.util.List<SendCoinRecordEntity>) list);
    }
}

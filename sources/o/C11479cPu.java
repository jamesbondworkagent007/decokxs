package o;

import com.okinc.business.defi.biz.database.wallet.entity.CustomFeeEntity;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cPu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11479cPu {
    public final cJN OLrzqt;

    public C11479cPu(@NotNull cJN cjn) {
        Intrinsics.checkNotNullParameter(cjn, "");
        this.OLrzqt = cjn;
    }

    public final AbstractC58260yxt<Unit> copydefault(@NotNull final CustomFeeEntity customFeeEntity) {
        Intrinsics.checkNotNullParameter(customFeeEntity, "");
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11479cPu.KWHzl(this.AEQbTJ, customFeeEntity);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit KWHzl(C11479cPu c11479cPu, CustomFeeEntity customFeeEntity) {
        c11479cPu.OLrzqt.AEQbTJ(customFeeEntity);
        return Unit.INSTANCE;
    }

    public final AbstractC58260yxt<java.util.List<CustomFeeEntity>> copydefault(final java.lang.Long l) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11479cPu.copydefault(this.KWHzl, l);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final java.util.List copydefault(C11479cPu c11479cPu, java.lang.Long l) {
        return c11479cPu.OLrzqt.OLrzqt(l);
    }

    public final AbstractC58260yxt<Unit> KWHzl(final java.lang.Long l) {
        AbstractC58260yxt abstractC58260yxtCopydefault = AbstractC58260yxt.copydefault(new Callable() { // from class: o.cPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                return C11479cPu.KWHzl(this.copydefault, l);
            }
        });
        Intrinsics.checkNotNullExpressionValue(abstractC58260yxtCopydefault, "");
        return C11607cUn.valueOf(abstractC58260yxtCopydefault);
    }

    public static final Unit KWHzl(C11479cPu c11479cPu, java.lang.Long l) {
        c11479cPu.OLrzqt.KWHzl(l);
        return Unit.INSTANCE;
    }
}

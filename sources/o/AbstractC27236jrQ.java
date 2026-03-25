package o;

import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeActivity;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jrQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC27236jrQ {
    public final InvestUniv3SubscribeActivity.EditMode copydefault;

    public abstract int AEQbTJ(@NotNull BigDecimal bigDecimal, boolean z);

    public abstract BigDecimal AEQbTJ(int i);

    public abstract C27315jsq AEQbTJ(int i, boolean z);

    public abstract C27315jsq EZpvd(@NotNull C27315jsq c27315jsq);

    public abstract void EZpvd(boolean z);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUniv3SubscribeActivity.EditMode KWHzl() {
        return this.copydefault;
    }

    public abstract void OLrzqt();

    public abstract int copydefault(@NotNull BigDecimal bigDecimal);

    public abstract C27315jsq copydefault(@NotNull C27315jsq c27315jsq);

    public AbstractC27236jrQ(@NotNull InvestUniv3SubscribeActivity.EditMode editMode) {
        Intrinsics.checkNotNullParameter(editMode, "");
        this.copydefault = editMode;
    }

    public static /* synthetic */ int getTickAtPriceWithDirection$default(AbstractC27236jrQ abstractC27236jrQ, BigDecimal bigDecimal, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTickAtPriceWithDirection");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return abstractC27236jrQ.AEQbTJ(bigDecimal, z);
    }
}

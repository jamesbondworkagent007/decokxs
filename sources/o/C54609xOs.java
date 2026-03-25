package o;

import com.okinc.unify_trade.trade.core.config.TradeInit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xOs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54609xOs {
    public final xNW EZpvd(@NotNull TradeInit tradeInit) {
        Intrinsics.checkNotNullParameter(tradeInit, "");
        if (Intrinsics.EZpvd(tradeInit, TradeInit.Activity.AEQbTJ)) {
            return new xNQ();
        }
        if (Intrinsics.EZpvd(tradeInit, TradeInit.ActionBar.AEQbTJ)) {
            return new xNS();
        }
        if (Intrinsics.EZpvd(tradeInit, TradeInit.Application.OLrzqt)) {
            return new xNT();
        }
        if (Intrinsics.EZpvd(tradeInit, TradeInit.TaskDescription.EZpvd)) {
            return new C54591xOa();
        }
        if (Intrinsics.EZpvd(tradeInit, TradeInit.PendingIntent.AEQbTJ)) {
            return new C54592xOb();
        }
        if (Intrinsics.EZpvd(tradeInit, TradeInit.FragmentManager.KWHzl)) {
            return new C54606xOp(false, 1, null);
        }
        if (Intrinsics.EZpvd(tradeInit, TradeInit.LoaderManager.OLrzqt)) {
            return new C54603xOm();
        }
        if (Intrinsics.EZpvd(tradeInit, TradeInit.Fragment.KWHzl)) {
            return new C54593xOc();
        }
        if (Intrinsics.EZpvd(tradeInit, TradeInit.PictureInPictureParams.OLrzqt)) {
            return new C54598xOh();
        }
        if (tradeInit instanceof TradeInit.Dialog) {
            return new C54606xOp(((TradeInit.Dialog) tradeInit).OLrzqt());
        }
        throw new NoWhenBranchMatchedException();
    }
}

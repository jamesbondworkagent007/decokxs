package o;

import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49979uyk extends AbstractC49896uxG {
    @Override // o.AbstractC49896uxG
    public void KWHzl(BizInstrument bizInstrument, @NotNull TradePositionManager.MarginModeType marginModeType) {
        Intrinsics.checkNotNullParameter(marginModeType, "");
        if (marginModeType == TradePositionManager.MarginModeType.CROSSED) {
            C33134mqi.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.getActionBarThemedContext));
        } else {
            super.KWHzl(bizInstrument, marginModeType);
        }
    }
}

package o;

import com.okinc.rxutils.RxBus;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.manager.MarginModeManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uxl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49927uxl extends AbstractC49896uxG {
    @Override // o.AbstractC49896uxG
    public void KWHzl(BizInstrument bizInstrument) {
        RxBus.KWHzl("refresh_best_margin_leverage");
    }

    @Override // o.AbstractC49896uxG
    public boolean EZpvd(@NotNull TradePositionManager.MarginModeType marginModeType) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(marginModeType, "");
        return (marginModeType != TradePositionManager.MarginModeType.CROSSED || !C54794xVo.copydefault.EZpvd() || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || newProxyInstance.gHZMYf()) ? false : true;
    }

    @Override // o.AbstractC49896uxG
    public boolean AEQbTJ(BizInstrument bizInstrument) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        xOW newProxyInstance;
        MarginModeManager marginModeManagerIsConnected;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        java.lang.String currentMarginMode$default = null;
        if (interfaceC54581xNrOLrzqt2 != null && (marginModeManagerIsConnected = interfaceC54581xNrOLrzqt2.isConnected()) != null) {
            currentMarginMode$default = MarginModeManager.getCurrentMarginMode$default(marginModeManagerIsConnected, false, bizInstrument, 1, null);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "cross")) {
            return Intrinsics.EZpvd((java.lang.Object) currentMarginMode$default, (java.lang.Object) "isolated") && (interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt()) != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.DbNXlk();
        }
        C54794xVo c54794xVo = C54794xVo.copydefault;
        return c54794xVo.valueOf() | c54794xVo.AhwBna();
    }
}

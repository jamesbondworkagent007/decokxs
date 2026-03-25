package o;

import com.okinc.rxutils.RxBus;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uyz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C49994uyz extends AbstractC49896uxG {
    @Override // o.AbstractC49896uxG
    public java.util.List<TradeMenuItemBean> OLrzqt(@NotNull java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> list, java.lang.String str, BizInstrument bizInstrument) {
        Intrinsics.checkNotNullParameter(list, "");
        C54794xVo c54794xVo = C54794xVo.copydefault;
        xOV xovCopydefault = c54794xVo.copydefault();
        if (xovCopydefault != null && xovCopydefault.copydefault()) {
            if (!c54794xVo.copydefault(bizInstrument != null ? bizInstrument.getInstId() : null)) {
                java.lang.String second = list.get(0).getSecond();
                Intrinsics.checkNotNullExpressionValue(second, "");
                return C56402yEa.EZpvd(new TradeMenuItemBean(second, true, list.get(0).getFirst(), null, false, null, null, 0, false, null, 0, false, 0, null, null, 32760, null));
            }
        }
        return super.OLrzqt(list, str, bizInstrument);
    }

    @Override // o.AbstractC49896uxG
    public void KWHzl(BizInstrument bizInstrument) {
        if (C54794xVo.copydefault.AYXKKw()) {
            if (Intrinsics.EZpvd((java.lang.Object) (bizInstrument != null ? bizInstrument.getInstType() : null), (java.lang.Object) "SPOT") && copydefault(bizInstrument)) {
                RxBus.KWHzl("refresh_best_margin_leverage");
            }
        }
    }

    public final boolean copydefault(BizInstrument bizInstrument) {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        boolean z = (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.gHZMYf()) ? false : true;
        boolean zKWHzl = C49908uxS.Companion.KWHzl();
        pUU.KWHzl("MarginModelAndLeverageView", (bizInstrument != null ? bizInstrument.getInstId() : null) + " " + (bizInstrument != null ? bizInstrument.getInstType() : null) + " canBorrow = " + z + " " + zKWHzl);
        return z && zKWHzl;
    }
}

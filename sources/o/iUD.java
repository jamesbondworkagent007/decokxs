package o;

import com.okinc.core.util.SPUtils;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC24092iUp;
import o.C25493ixk;

/* JADX INFO: loaded from: classes18.dex */
public final class iUD extends AbstractC24092iUp {
    public final InterfaceC56387yDm EZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0() { // from class: o.iUA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return iUD.copydefault(this.OLrzqt);
        }
    });

    @Override // o.AbstractC24092iUp
    public AbstractC24092iUp.Application AEQbTJ() {
        return (AbstractC24092iUp.Application) this.EZpvd.getValue();
    }

    public static final AbstractC24092iUp.Application copydefault(iUD iud) {
        java.lang.String string = iud.getString(C25493ixk.FragmentManager.Rtjmuc);
        Intrinsics.checkNotNullExpressionValue(string, "");
        java.lang.String string2 = iud.getString(C25493ixk.FragmentManager.aCSzUz);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        java.lang.String string3 = iud.getString(C25493ixk.FragmentManager.zYHWMc);
        Intrinsics.checkNotNullExpressionValue(string3, "");
        java.lang.String string4 = iud.getString(C25493ixk.FragmentManager.aGOrKO);
        Intrinsics.checkNotNullExpressionValue(string4, "");
        return new AbstractC24092iUp.Application("sp_invest_select_coin_reminder_dialog_never_show", string, string2, string3, string4, false, 0, "images/web3_defi/invest_reminder_select_coin.png", false, 0, 0, 1856, null);
    }

    @Override // o.AbstractC24092iUp
    public void copydefault() {
        SPUtils.put("sp_invest_select_coin_reminder_dialog_never_show", java.lang.Boolean.TRUE);
    }
}

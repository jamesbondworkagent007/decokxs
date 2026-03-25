package o;

import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import com.okinc.business.dex.trade.common.reminder.data.ReminderTierType;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.gPy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19804gPy extends AbstractC19793gPn {
    @Override // o.InterfaceC19785gPf
    public ReminderTierType AEQbTJ() {
        return ReminderTierType.TokenAttribute;
    }

    @Override // o.AbstractC19793gPn
    public java.util.List<C19782gPc> KWHzl() {
        ReminderTierType reminderTierType = ReminderTierType.TokenAttribute;
        return yDY.gEmmrt(new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.TokenHoneypot), new Function1() { // from class: o.gPz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19804gPy.AEQbTJ((C19783gPd) obj);
            }
        }, null, 8, null), new C19782gPc(reminderTierType, C56402yEa.EZpvd(TradeReminderType.QuoteSafemoon), new Function1() { // from class: o.gPC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C19804gPy.KWHzl((C19783gPd) obj);
            }
        }, null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeReminderType AEQbTJ(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        DexMultiTokenInfoBean dexMultiTokenInfoBeanOLrzqt = c19783gPd.OLrzqt();
        boolean z = dexMultiTokenInfoBeanOLrzqt != null && dexMultiTokenInfoBeanOLrzqt.isHoneypotToken();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFJNWhG = c19783gPd.fJNWhG();
        boolean z2 = dexMultiTokenInfoBeanFJNWhG != null && dexMultiTokenInfoBeanFJNWhG.isHoneypotToken();
        DexMultiTokenInfoBean dexMultiTokenInfoBeanFJNWhG2 = c19783gPd.fJNWhG();
        boolean z3 = dexMultiTokenInfoBeanFJNWhG2 != null && dexMultiTokenInfoBeanFJNWhG2.isLeverage();
        if (z && !z2 && !z3) {
            if (c19783gPd.fetchVPNInfo() == null && c19783gPd.AkhnZx() == null) {
                return TradeReminderType.TokenHoneypot;
            }
            return TradeReminderType.None;
        }
        return TradeReminderType.None;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TradeReminderType KWHzl(C19783gPd c19783gPd) {
        Intrinsics.checkNotNullParameter(c19783gPd, "");
        TradeReminderType tradeReminderTypeKWHzl = gOL.EZpvd.KWHzl(c19783gPd.fetchVPNInfo(), c19783gPd.OLrzqt(), c19783gPd.fJNWhG());
        return tradeReminderTypeKWHzl == null ? TradeReminderType.None : tradeReminderTypeKWHzl;
    }
}

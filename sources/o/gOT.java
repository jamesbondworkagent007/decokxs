package o;

import com.okinc.business.dex.trade.common.reminder.SaUiReminder;
import com.okinc.business.dex.trade.common.reminder.TradeReminderType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface gOT {

    public static final class Application {
        public static boolean EZpvd(@NotNull gOT got) {
            return false;
        }

        public static long KWHzl(@NotNull gOT got) {
            return Long.MAX_VALUE;
        }
    }

    TradeReminderType AEQbTJ(gLQ glq, java.lang.String str);

    SaUiReminder EZpvd(@NotNull TradeReminderType tradeReminderType, gLQ glq);

    TradeReminderType EZpvd(gLQ glq);

    gLQ KWHzl(java.lang.String str);

    boolean KWHzl();

    long OLrzqt();

    TradeReminderType OLrzqt(gLQ glq);
}

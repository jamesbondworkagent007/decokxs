package o;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import com.okinc.tradingbot.impl.balance.dto.AccountType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uHf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C48161uHf {
    public static final AccountType KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 54) {
            if (iHashCode != 1575) {
                if (iHashCode == 1602 && str.equals("24")) {
                    return AccountType.EARN;
                }
            } else if (str.equals("18")) {
                return AccountType.TRADE;
            }
        } else if (str.equals(OrderDetailListItem.SLIP_OUT)) {
            return AccountType.FUND;
        }
        return AccountType.UNKNOW;
    }
}

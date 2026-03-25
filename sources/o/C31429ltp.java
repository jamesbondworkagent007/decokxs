package o;

import com.okinc.buysell.data.BannerFlowType;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ltp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31429ltp {

    /* JADX INFO: renamed from: o.ltp$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradeType.values().length];
            try {
                iArr[TradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradeType.DEPOSIT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TradeType.WITHDRAW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            copydefault = iArr;
        }
    }

    public static final BannerFlowType EZpvd(@NotNull TradeType tradeType) {
        Intrinsics.checkNotNullParameter(tradeType, "");
        int i = ActionBar.copydefault[tradeType.ordinal()];
        if (i == 1) {
            return BannerFlowType.BUY;
        }
        if (i == 2) {
            return BannerFlowType.SELL;
        }
        if (i == 3) {
            return BannerFlowType.DEPOSIT;
        }
        if (i == 4) {
            return BannerFlowType.WITHDRAW;
        }
        return BannerFlowType.UNKNOWN;
    }
}

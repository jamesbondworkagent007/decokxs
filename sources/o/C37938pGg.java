package o;

import com.okinc.unify_trade.biz.CountDownInfo;
import com.okinc.unify_trade.constants.MarketTypeEnum;
import kotlin.jvm.internal.Intrinsics;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pGg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37938pGg {

    /* JADX INFO: renamed from: o.pGg$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketTypeEnum.values().length];
            try {
                iArr[MarketTypeEnum.CALL_AUCTION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketTypeEnum.PRE_QUOTE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            EZpvd = iArr;
        }
    }

    public static final int OLrzqt(@NotNull CountDownInfo countDownInfo) {
        Intrinsics.checkNotNullParameter(countDownInfo, "");
        int i = ActionBar.EZpvd[countDownInfo.getNextStage().ordinal()];
        return (i == 1 || i == 2) ? C35964oKf.Fragment.hdpuIA : C35964oKf.Fragment.zXhzOT;
    }
}

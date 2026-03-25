package o;

import com.okinc.business.dex.trade.common.reminder.BusinessType;
import com.okinc.business.trade.features.home.ui.autosell.data.AdvancedAutoSellStrategy;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedOrderType;
import com.okinc.business.trade.features.home.ui.cefi.common.AdvancedTradeType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC30503lcQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kQj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28140kQj {

    /* JADX INFO: renamed from: o.kQj$StateListAnimator */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AdvancedTradeType.values().length];
            try {
                iArr[AdvancedTradeType.BUY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[AdvancedTradeType.SELL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[AdvancedOrderType.values().length];
            try {
                iArr2[AdvancedOrderType.MARKET.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[AdvancedOrderType.LIMIT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            AEQbTJ = iArr2;
        }
    }

    public static final BusinessType EZpvd(@NotNull C28139kQi c28139kQi) {
        Intrinsics.checkNotNullParameter(c28139kQi, "");
        int i = StateListAnimator.AEQbTJ[c28139kQi.DbNXlk().ordinal()];
        if (i == 1) {
            int i2 = StateListAnimator.copydefault[c28139kQi.fARcdN().ordinal()];
            if (i2 == 1) {
                return BusinessType.AdvancedModeBuy;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return BusinessType.AdvancedModeSell;
        }
        if (i == 2) {
            int i3 = StateListAnimator.copydefault[c28139kQi.fARcdN().ordinal()];
            if (i3 == 1) {
                return BusinessType.AdvancedModeLimitBuy;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return BusinessType.AdvancedModeLimitSell;
        }
        return BusinessType.Other;
    }

    public static final int copydefault(@NotNull C28139kQi c28139kQi) {
        java.util.List<AdvancedAutoSellStrategy> listKWHzl;
        Intrinsics.checkNotNullParameter(c28139kQi, "");
        AbstractC30503lcQ abstractC30503lcQKWHzl = c28139kQi.KWHzl();
        AbstractC30503lcQ.StateListAnimator stateListAnimator = abstractC30503lcQKWHzl instanceof AbstractC30503lcQ.StateListAnimator ? (AbstractC30503lcQ.StateListAnimator) abstractC30503lcQKWHzl : null;
        if (stateListAnimator == null || (listKWHzl = stateListAnimator.KWHzl()) == null) {
            return 0;
        }
        return listKWHzl.size();
    }
}

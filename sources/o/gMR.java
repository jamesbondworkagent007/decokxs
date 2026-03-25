package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsStrategyType;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastData;
import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMR implements gMJ {
    public final TeeWsToastType copydefault = TeeWsToastType.TradeFailedWithoutRetry;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TeeWsStrategyType.values().length];
            try {
                iArr[TeeWsStrategyType.MarketBuy.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TeeWsStrategyType.MarketSell.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
            int[] iArr2 = new int[OrderStrategyType.values().length];
            try {
                iArr2[OrderStrategyType.CopyTrade.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[OrderStrategyType.Limit.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[OrderStrategyType.Tp.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[OrderStrategyType.Sl.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            KWHzl = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        int i;
        Intrinsics.checkNotNullParameter(gma, "");
        TeeWsToastData teeWsToastDataCopydefault = gma.copydefault();
        OrderStrategyType orderStrategyTypeKWHzl = OrderStrategyType.Companion.KWHzl(teeWsToastDataCopydefault.getOrderType());
        if (orderStrategyTypeKWHzl == null) {
            return null;
        }
        int i2 = StateListAnimator.KWHzl[orderStrategyTypeKWHzl.ordinal()];
        if (i2 == 1) {
            int i3 = StateListAnimator.copydefault[teeWsToastDataCopydefault.getTradeDirection().ordinal()];
            if (i3 == 1) {
                i = C23274hvD.Fragment.ActivityViewModelLazyKtviewModels2;
            } else {
                if (i3 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C23274hvD.Fragment.ActivityViewModelLazyKtviewModels4;
            }
        } else if (i2 == 2) {
            i = C23274hvD.Fragment.OnBackPressedDispatcher;
        } else if (i2 == 3) {
            i = C23274hvD.Fragment.ActivityViewModelLazyKtviewModelsfactoryPromise2;
        } else {
            if (i2 != 4) {
                return null;
            }
            i = C23274hvD.Fragment.ActivityViewModelLazyKtviewModels3;
        }
        return new gML(3, java.lang.Integer.valueOf(i), gma.OLrzqt(), null, null, null, new Function0() { // from class: o.gMO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return gMR.copydefault();
            }
        }, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit copydefault() {
        C23243huZ.OLrzqt(DexTrackEventParameter.TxStatus.FAILURE.getStatus());
        return Unit.INSTANCE;
    }
}

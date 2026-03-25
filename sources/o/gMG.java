package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMG implements gMJ {
    public final TeeWsToastType EZpvd = TeeWsToastType.OrderCreated;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderStrategyType.values().length];
            try {
                iArr[OrderStrategyType.Limit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.EZpvd;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        OrderStrategyType orderStrategyTypeKWHzl = OrderStrategyType.Companion.KWHzl(gma.copydefault().getOrderType());
        if (orderStrategyTypeKWHzl == null || StateListAnimator.copydefault[orderStrategyTypeKWHzl.ordinal()] != 1) {
            return null;
        }
        int i = C23274hvD.Fragment.toBundle;
        return new gML(1, java.lang.Integer.valueOf(i), gma.OLrzqt(), null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.RXzakW), null, null, 104, null);
    }
}

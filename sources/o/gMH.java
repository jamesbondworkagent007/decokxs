package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMH implements gMJ {
    public final TeeWsToastType KWHzl = TeeWsToastType.OrderResumed;

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderStrategyType.values().length];
            try {
                iArr[OrderStrategyType.Limit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[OrderStrategyType.Tp.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[OrderStrategyType.Sl.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            copydefault = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.KWHzl;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        int i;
        Intrinsics.checkNotNullParameter(gma, "");
        OrderStrategyType orderStrategyTypeKWHzl = OrderStrategyType.Companion.KWHzl(gma.copydefault().getOrderType());
        if (orderStrategyTypeKWHzl == null) {
            return null;
        }
        int i2 = StateListAnimator.copydefault[orderStrategyTypeKWHzl.ordinal()];
        if (i2 == 1) {
            i = C23274hvD.Fragment.hasCallback;
        } else if (i2 == 2) {
            i = C23274hvD.Fragment.verifySession;
        } else {
            if (i2 != 3) {
                return null;
            }
            i = C23274hvD.Fragment.MediaSessionCompatApi21;
        }
        return new gML(1, java.lang.Integer.valueOf(i), gma.OLrzqt(), null, java.lang.Integer.valueOf(C52761wXj.TaskDescription.ORWKdN), null, null, 104, null);
    }
}

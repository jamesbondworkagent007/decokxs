package o;

import com.okinc.business.dex.tee.common.ws.data.domain.model.TeeWsToastType;
import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class gMD implements gMJ {
    public final TeeWsToastType AEQbTJ = TeeWsToastType.OrderCreateFailed;

    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[OrderStrategyType.values().length];
            try {
                iArr[OrderStrategyType.Limit.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            AEQbTJ = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.gMJ
    public TeeWsToastType AEQbTJ() {
        return this.AEQbTJ;
    }

    @Override // o.gMJ
    public gML AEQbTJ(@NotNull gMA gma) {
        Intrinsics.checkNotNullParameter(gma, "");
        OrderStrategyType orderStrategyTypeKWHzl = OrderStrategyType.Companion.KWHzl(gma.copydefault().getOrderType());
        if (orderStrategyTypeKWHzl == null || Application.AEQbTJ[orderStrategyTypeKWHzl.ordinal()] != 1) {
            return null;
        }
        int i = C23274hvD.Fragment.setExtraBinder;
        return new gML(3, java.lang.Integer.valueOf(i), gma.OLrzqt(), null, null, null, null, 120, null);
    }
}

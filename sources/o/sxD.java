package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.okex.lite_market_api.bean.DexPriceRequestData;
import com.okinc.okex.lite_market_api.bean.DexPriceTickerData;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sxD {
    public static final StateListAnimator Companion = StateListAnimator.copydefault;

    StateFlow<java.util.Map<java.lang.String, DexPriceTickerData>> EZpvd(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<DexPriceRequestData> list, long j);

    StateFlow<java.util.Map<java.lang.String, DexPriceTickerData>> copydefault(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<DexPriceRequestData> list, long j);

    void copydefault();

    public static final class Application {
        public static /* synthetic */ StateFlow httpThenSubscribeDexPriceData$default(sxD sxd, LifecycleOwner lifecycleOwner, java.util.List list, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: httpThenSubscribeDexPriceData");
            }
            if ((i & 4) != 0) {
                j = 1000;
            }
            return sxd.EZpvd(lifecycleOwner, list, j);
        }

        public static /* synthetic */ StateFlow subscribeDexPriceData$default(sxD sxd, LifecycleOwner lifecycleOwner, java.util.List list, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeDexPriceData");
            }
            if ((i & 4) != 0) {
                j = 1000;
            }
            return sxd.copydefault(lifecycleOwner, list, j);
        }
    }

    public static final class StateListAnimator {
        public static final /* synthetic */ StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }
}

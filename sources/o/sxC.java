package o;

import androidx.lifecycle.LifecycleOwner;
import com.okinc.okex.lite_market_api.bean.FairPriceTickerData;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface sxC {
    public static final ActionBar Companion = ActionBar.AEQbTJ;

    StateFlow<java.util.Map<java.lang.String, FairPriceTickerData>> AEQbTJ(@NotNull LifecycleOwner lifecycleOwner, @NotNull java.util.List<java.lang.String> list, boolean z, java.lang.String str, long j);

    void KWHzl();

    public static final class TaskDescription {
        public static /* synthetic */ StateFlow httpThenSubscribeFairPriceData$default(sxC sxc, LifecycleOwner lifecycleOwner, java.util.List list, boolean z, java.lang.String str, long j, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: httpThenSubscribeFairPriceData");
            }
            if ((i & 4) != 0) {
                z = false;
            }
            boolean z2 = z;
            if ((i & 8) != 0) {
                str = null;
            }
            java.lang.String str2 = str;
            if ((i & 16) != 0) {
                j = 1000;
            }
            return sxc.AEQbTJ(lifecycleOwner, list, z2, str2, j);
        }
    }

    public static final class ActionBar {
        public static final /* synthetic */ ActionBar AEQbTJ = new ActionBar();

        private ActionBar() {
        }
    }
}

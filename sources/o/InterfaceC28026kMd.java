package o;

import com.okinc.business.market.features.filter.domain.PriceRangeFilter;
import com.okinc.business.market.features.filter.domain.TokenFilter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kMd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC28026kMd {
    void KWHzl(@NotNull android.app.Activity activity);

    void setCallback(@NotNull InterfaceC28023kMa interfaceC28023kMa);

    void setData(@NotNull java.util.List<PriceRangeFilter> list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter);

    void setSelectionDismissCallback(@NotNull Function0<Unit> function0);

    /* JADX INFO: renamed from: o.kMd$TaskDescription */
    public static final class TaskDescription {
        public static /* synthetic */ void setData$default(InterfaceC28026kMd interfaceC28026kMd, java.util.List list, PriceRangeFilter priceRangeFilter, TokenFilter tokenFilter, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setData");
            }
            if ((i & 2) != 0) {
                priceRangeFilter = null;
            }
            if ((i & 4) != 0) {
                tokenFilter = null;
            }
            interfaceC28026kMd.setData(list, priceRangeFilter, tokenFilter);
        }
    }
}

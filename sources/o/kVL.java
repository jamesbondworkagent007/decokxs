package o;

import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class kVL {
    public static final kVI OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform == null) {
            java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
            DefiPlatformInfo defiPlatformInfo = defiPlatformInfoList != null ? (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList) : null;
            if (defiPlatformInfo == null) {
                return null;
            }
            selectedDeFiPlatform = defiPlatformInfo;
        }
        return new kVN(selectedDeFiPlatform);
    }
}

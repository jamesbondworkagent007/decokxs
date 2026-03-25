package o;

import com.okinc.business.dex.trade.core.domain.model.DefiPlatformInfo;
import com.okinc.business.dex.trade.core.domain.model.V6BaseQuoteResponse;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class gYQ {
    public static final boolean copydefault(@NotNull DefiPlatformInfo defiPlatformInfo) {
        Intrinsics.checkNotNullParameter(defiPlatformInfo, "");
        java.lang.Integer offlineType = defiPlatformInfo.getOfflineType();
        return offlineType != null && offlineType.intValue() == 1;
    }

    public static final DefiPlatformInfo copydefault(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse, java.lang.String str) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        java.util.List<DefiPlatformInfo> defiPlatformInfoList = v6BaseQuoteResponse.getDefiPlatformInfoList();
        java.lang.Object obj = null;
        if (defiPlatformInfoList == null) {
            return null;
        }
        if (str == null || str.length() == 0) {
            return (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList);
        }
        java.util.Iterator<T> it = defiPlatformInfoList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DefiPlatformInfo) next).getDefiPlatformId(), (java.lang.Object) str)) {
                obj = next;
                break;
            }
        }
        DefiPlatformInfo defiPlatformInfo = (DefiPlatformInfo) obj;
        return defiPlatformInfo == null ? (DefiPlatformInfo) CollectionsKt___CollectionsKt.firstOrNull(defiPlatformInfoList) : defiPlatformInfo;
    }

    public static final boolean OLrzqt(@NotNull V6BaseQuoteResponse v6BaseQuoteResponse) {
        Intrinsics.checkNotNullParameter(v6BaseQuoteResponse, "");
        DefiPlatformInfo selectedDeFiPlatform = v6BaseQuoteResponse.getSelectedDeFiPlatform();
        if (selectedDeFiPlatform == null) {
            return false;
        }
        return copydefault(selectedDeFiPlatform);
    }
}

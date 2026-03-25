package o;

import com.okinc.business.dexlogic.bean.DexQuoteBridgeVO;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.domain.model.PathRouterUi;
import com.okinc.business.domain.model.PathType;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iwJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25413iwJ {
    public static /* synthetic */ java.util.List mapToPathRouterUi$default(C25413iwJ c25413iwJ, java.util.List list, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            str = "";
        }
        return c25413iwJ.copydefault(list, z, str);
    }

    public final java.util.List<PathRouterUi> copydefault(@NotNull java.util.List<PathSelectionRouterItem> list, boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (PathSelectionRouterItem pathSelectionRouterItem : list) {
            DexQuoteBridgeVO bridge = pathSelectionRouterItem.getBridge();
            java.lang.String bridgeLogoUrl = bridge != null ? bridge.getBridgeLogoUrl() : null;
            java.lang.String str2 = bridgeLogoUrl == null ? "" : bridgeLogoUrl;
            DexQuoteBridgeVO bridge2 = pathSelectionRouterItem.getBridge();
            java.lang.String bridgeName = bridge2 != null ? bridge2.getBridgeName() : null;
            java.lang.String str3 = bridgeName == null ? "" : bridgeName;
            java.lang.String receiveAmount = pathSelectionRouterItem.getReceiveAmount();
            PathType pathType = PathType.BRIDGE;
            java.lang.String bestPriceRouterSave = pathSelectionRouterItem.getBestPriceRouterSave();
            java.lang.String estimatedTime = pathSelectionRouterItem.getEstimatedTime();
            java.lang.String showDataWithPrefix$default = C23272hvB.getShowDataWithPrefix$default(C23272hvB.KWHzl, z ? str : pathSelectionRouterItem.getFromSwapFeeUsd(), false, false, RoundingMode.DOWN, false, 18, null);
            DexQuoteBridgeVO bridge3 = pathSelectionRouterItem.getBridge();
            boolean z2 = bridge3 != null && bridge3.isFreeNetWorkFee();
            boolean localSelected = pathSelectionRouterItem.getLocalSelected();
            java.lang.String routerLabel = pathSelectionRouterItem.getRouterLabel();
            DexQuoteBridgeVO bridge4 = pathSelectionRouterItem.getBridge();
            java.lang.String bridgeId = bridge4 != null ? bridge4.getBridgeId() : null;
            java.lang.String str4 = bridgeId == null ? "" : bridgeId;
            DexQuoteBridgeVO bridge5 = pathSelectionRouterItem.getBridge();
            java.util.List<java.lang.String> signatureName = bridge5 != null ? bridge5.getSignatureName() : null;
            if (signatureName == null) {
                signatureName = yDY.AhwBna();
            }
            java.util.List<java.lang.String> list2 = signatureName;
            DexQuoteBridgeVO bridge6 = pathSelectionRouterItem.getBridge();
            boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) (bridge6 != null ? bridge6.isNeedClaim() : null), (java.lang.Object) "1");
            DexQuoteBridgeVO bridge7 = pathSelectionRouterItem.getBridge();
            arrayList.add(new PathRouterUi(str2, str3, receiveAmount, pathType, "", bestPriceRouterSave, estimatedTime, showDataWithPrefix$default, z2, localSelected, routerLabel, str4, list2, zEZpvd, false, bridge7 != null ? bridge7.getBridgeType() : 0, 16384, null));
        }
        return arrayList;
    }
}

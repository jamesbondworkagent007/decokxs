package o;

import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.MessageSettingModeInfo;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.ModeSwitchGroupInfo;
import com.okinc.okcomponents.feature.oknotificationcenter.impl.presentation.systemmessage.model.SwitchItemInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.saV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44626saV {
    @yCM
    public C44626saV() {
    }

    public static /* synthetic */ java.util.List getAllSettingItemInfoList$default(C44626saV c44626saV, MessageSettingModeInfo messageSettingModeInfo, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c44626saV.AEQbTJ(messageSettingModeInfo, z);
    }

    public final java.util.List<SwitchItemInfo> AEQbTJ(@NotNull MessageSettingModeInfo messageSettingModeInfo, boolean z) {
        Intrinsics.checkNotNullParameter(messageSettingModeInfo, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = messageSettingModeInfo.getSwitchDetailInfo().iterator();
        while (it.hasNext()) {
            for (SwitchItemInfo switchItemInfo : ((ModeSwitchGroupInfo) it.next()).getChildSwitchItemList()) {
                java.util.List<SwitchItemInfo> subItems = switchItemInfo.getSubItems();
                if (subItems == null || subItems.isEmpty() || !z) {
                    arrayList.add(switchItemInfo);
                }
            }
        }
        return arrayList;
    }
}

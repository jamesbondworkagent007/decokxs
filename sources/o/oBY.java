package o;

import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import com.okinc.okimcore.model.remote.OfficialTagType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class oBY {
    public static final oBY copydefault = new oBY();
    public static final int EZpvd = 8;

    private oBY() {
    }

    public final void copydefault(@NotNull EventParamsList eventParamsList, @NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.checkNotNullParameter(groupInfo, "");
        EventParamsList.put$default(eventParamsList, "group_type", copydefault(groupInfo), false, 4, null);
    }

    public final void EZpvd(@NotNull EventParamsList eventParamsList, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        Intrinsics.checkNotNullParameter(str, "");
        eventParamsList.put("switch", str, true);
    }

    public final void KWHzl(@NotNull EventParamsList eventParamsList, boolean z) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("switch_state", java.lang.String.valueOf(z), true);
    }

    public final java.lang.String copydefault(@NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        OfficialTagInfo officialTags = groupInfo.getOfficialTags();
        java.util.List<OfficialTagType> supportTagTypes = officialTags != null ? officialTags.getSupportTagTypes() : null;
        if (supportTagTypes != null && !supportTagTypes.isEmpty()) {
            boolean z = supportTagTypes instanceof java.util.Collection;
            if (!z || !supportTagTypes.isEmpty()) {
                java.util.Iterator<T> it = supportTagTypes.iterator();
                while (it.hasNext()) {
                    if (OfficialTagType.CREATOR.valueOf(((OfficialTagType) it.next()).getType()) == OfficialTagType.OfficialGroup) {
                        return "official";
                    }
                }
            }
            if (!z || !supportTagTypes.isEmpty()) {
                java.util.Iterator<T> it2 = supportTagTypes.iterator();
                while (it2.hasNext()) {
                    if (OfficialTagType.CREATOR.valueOf(((OfficialTagType) it2.next()).getType()) == OfficialTagType.AffiliateGroup) {
                        return "affiliate";
                    }
                }
            }
        }
        return "normal";
    }
}

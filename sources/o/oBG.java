package o;

import com.okinc.okimcore.model.other.GroupInfo;
import com.okinc.okimcore.model.other.GroupRole;
import com.okinc.okimcore.model.other.GroupUserSettingInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class oBG {
    public static final oBG copydefault = new oBG();

    private oBG() {
    }

    public final boolean EZpvd(@NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        GroupUserSettingInfo userSettingInfo = groupInfo.getUserSettingInfo();
        return !groupInfo.isAllowSendLink() && (userSettingInfo == null || userSettingInfo.getRole() == GroupRole.Common);
    }

    public final boolean KWHzl(@NotNull GroupInfo groupInfo) {
        Intrinsics.checkNotNullParameter(groupInfo, "");
        return groupInfo.isAllowMentionedRobot();
    }

    public final boolean OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C44528sTf.KWHzl.copydefault(str);
    }
}

package o;

import com.okinc.components.track.bean.EventParamsList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rXW implements rXY {
    public final rXX AEQbTJ;

    @yCM
    public rXW(@NotNull rXX rxx) {
        Intrinsics.checkNotNullParameter(rxx, "");
        this.AEQbTJ = rxx;
    }

    @Override // o.rXY
    public void KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        rXX rxx = this.AEQbTJ;
        EventParamsList eventParamsList = new EventParamsList();
        EventParamsList.put$default(eventParamsList, "message_name", str, false, 4, null);
        Unit unit = Unit.INSTANCE;
        rxx.EZpvd("MessageCenter_Notification_Message_Click", eventParamsList);
    }

    @Override // o.rXY
    public void copydefault(java.lang.String str) {
        rXX rxx = this.AEQbTJ;
        EventParamsList eventParamsList = new EventParamsList();
        if (str == null) {
            str = "ALL";
        }
        EventParamsList.put$default(eventParamsList, "pill_name", str, false, 4, null);
        Unit unit = Unit.INSTANCE;
        rxx.EZpvd("MessageCenter_Notification_Header_Click", eventParamsList);
    }

    @Override // o.rXY
    public void EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        rXX rxx = this.AEQbTJ;
        EventParamsList eventParamsList = new EventParamsList();
        EventParamsList.put$default(eventParamsList, "notification_type", str, false, 4, null);
        Unit unit = Unit.INSTANCE;
        rxx.EZpvd("NotificationSetting_AdvancedSetting_NotificationType_Click", eventParamsList);
    }

    @Override // o.rXY
    public void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        rXX rxx = this.AEQbTJ;
        EventParamsList eventParamsList = new EventParamsList();
        EventParamsList.put$default(eventParamsList, "category_name", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "channel_name", str2, false, 4, null);
        Unit unit = Unit.INSTANCE;
        rxx.EZpvd("NotificationSetting_Channel_Setting_Click", eventParamsList);
    }
}

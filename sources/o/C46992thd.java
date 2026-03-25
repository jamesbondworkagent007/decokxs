package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.okpush.sdk.net.bean.PushBindReqInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.thd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46992thd {
    public static final C46992thd OLrzqt = new C46992thd();

    private C46992thd() {
    }

    public final kotlin.Pair<java.lang.Boolean, java.lang.String> OLrzqt(@NotNull PushBindReqInfo pushBindReqInfo) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(pushBindReqInfo, "");
        java.lang.String strIsLogin = pushBindReqInfo.isLogin();
        if (strIsLogin == null || strIsLogin.length() == 0) {
            str = "login state";
        } else {
            java.lang.String deviceId = pushBindReqInfo.getDeviceId();
            if (deviceId == null || deviceId.length() == 0) {
                str = "deviceId";
            } else {
                java.lang.String deviceToken = pushBindReqInfo.getDeviceToken();
                if (deviceToken == null || deviceToken.length() == 0) {
                    str = "deviceToken";
                } else {
                    java.lang.String tag = pushBindReqInfo.getTag();
                    if (tag == null || tag.length() == 0) {
                        str = "tag";
                    } else {
                        java.lang.String channelId = pushBindReqInfo.getChannelId();
                        if (channelId == null || channelId.length() == 0) {
                            str = RemoteMessageConst.Notification.CHANNEL_ID;
                        } else {
                            java.lang.String deviceType = pushBindReqInfo.getDeviceType();
                            str = (deviceType == null || deviceType.length() == 0) ? "deviceType" : null;
                        }
                    }
                }
            }
        }
        boolean z = str == null;
        if (!z) {
            str = str + " invalid!";
            pUU.KWHzl("PushReqBodyCheck", "isRequestInfoValid: false, cause " + str);
        }
        return new kotlin.Pair<>(java.lang.Boolean.valueOf(z), str);
    }
}

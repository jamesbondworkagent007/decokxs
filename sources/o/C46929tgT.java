package o;

import androidx.core.app.NotificationManagerCompat;
import com.engagelab.privates.common.component.MTCommonReceiver;
import com.engagelab.privates.core.api.MTCorePrivatesApi;
import com.engagelab.privates.core.api.WakeMessage;
import com.engagelab.privates.push.api.CustomMessage;
import com.engagelab.privates.push.api.NotificationMessage;
import com.engagelab.privates.push.api.PlatformTokenMessage;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.google.gson.Gson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okpush.sdk.config.OKPushConfig;
import com.okinc.okpush.sdk.init.PushInitManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tgT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C46929tgT extends MTCommonReceiver {
    public static final ActionBar Companion = new ActionBar(null);

    /* JADX INFO: renamed from: o.tgT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tgT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public void onNotificationStatus(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("UserReceiver", "onNotificationStatus:" + z);
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public void onConnectStatus(@NotNull android.content.Context context, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        pUU.KWHzl("UserReceiver", "onConnectStatus, enable:" + z);
        if (z) {
            pUU.KWHzl("UserReceiver", "onConnectStatus, registrationId:" + MTCorePrivatesApi.getRegistrationId(context));
            C46945tgj.AEQbTJ.AhwBna().OLrzqt("BIND_FROM_JIGUANG_CONNECT");
        }
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public void onNotificationArrived(@NotNull android.content.Context context, NotificationMessage notificationMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        if (notificationMessage == null) {
            return;
        }
        C46993the.copydefault.EZpvd();
        pUU.KWHzl("UserReceiver", "onNotificationArrived:" + notificationMessage);
        C46959tgx.AEQbTJ.OLrzqt(notificationMessage);
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public void onNotificationClicked(@NotNull android.content.Context context, NotificationMessage notificationMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        if (notificationMessage == null) {
            return;
        }
        pUU.KWHzl("UserReceiver", "onNotificationClicked:" + notificationMessage);
        android.os.Bundle extras = notificationMessage.getExtras();
        C46938tgc c46938tgc = C46938tgc.copydefault;
        java.lang.String string = extras != null ? extras.getString("routerUrl") : null;
        c46938tgc.AEQbTJ(new C46941tgf(null, null, string == null ? "" : string, EZpvd(extras), 3, null));
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public void onCustomMessage(@NotNull android.content.Context context, CustomMessage customMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        if (customMessage == null) {
            return;
        }
        pUU.KWHzl("UserReceiver", "onCustomMessage:" + customMessage);
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public void onPlatformToken(@NotNull android.content.Context context, PlatformTokenMessage platformTokenMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        if (platformTokenMessage == null) {
            return;
        }
        copydefault(platformTokenMessage);
        pUU.KWHzl("UserReceiver", "onPlatformToken:" + platformTokenMessage);
    }

    public final void copydefault(final PlatformTokenMessage platformTokenMessage) {
        C32866mlf.EZpvd("jpush_platform_token", new TrackChannel[]{TrackChannel.OKStatistics}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.tgV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C46929tgT.OLrzqt(platformTokenMessage, (EventParamsList) obj);
            }
        });
    }

    public static final Unit OLrzqt(PlatformTokenMessage platformTokenMessage, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "notification_enable", java.lang.String.valueOf(NotificationManagerCompat.from(OKPushConfig.copydefault.copydefault()).areNotificationsEnabled()), false, 4, null);
        java.lang.String deviceToken = PushInitManager.OLrzqt.AEQbTJ().getDeviceToken();
        EventParamsList.put$default(eventParamsList, "pushTokenNull", java.lang.String.valueOf(deviceToken == null || deviceToken.length() == 0), false, 4, null);
        EventParamsList.put$default(eventParamsList, MTPushConstants.PlatformNode.KEY_PLATFORM, java.lang.String.valueOf((int) platformTokenMessage.getPlatform()), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver
    public void onWake(@NotNull android.content.Context context, @NotNull WakeMessage wakeMessage) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(wakeMessage, "");
        pUU.KWHzl("UserReceiver", "onWake:" + wakeMessage);
    }

    public final JSONObject EZpvd(android.os.Bundle bundle) {
        if (bundle != null) {
            java.util.HashMap map = new java.util.HashMap();
            for (java.lang.String str : bundle.keySet()) {
                java.lang.String string = bundle.getString(str);
                if (string == null) {
                    string = "";
                }
                map.put(str, string);
            }
            return new JSONObject(new Gson().toJson(map));
        }
        return new JSONObject("{}");
    }

    @Override // com.engagelab.privates.common.component.MTCommonReceiver, android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        super.onReceive(context, intent);
    }
}

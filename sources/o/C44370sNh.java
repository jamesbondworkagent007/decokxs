package o;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okimcore.model.im.OKConversationType;
import com.okinc.okimcore.model.im.OKMessage;
import com.okinc.okimcore.model.other.GatherConversationType;
import com.okinc.okimcore.model.other.IMReporter;
import com.okinc.okimcore.model.other.IMStrategyConst;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.sNh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44370sNh {
    public static final C44370sNh EZpvd = new C44370sNh();

    private C44370sNh() {
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (copydefault() && C44157sFk.gEmmrt().values()) {
            NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(context);
            Intrinsics.checkNotNullExpressionValue(notificationManagerCompatFrom, "");
            final boolean zAreNotificationsEnabled = notificationManagerCompatFrom.areNotificationsEnabled();
            C32866mlf.EZpvd("okim_push_authorization", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.sNl
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44370sNh.EZpvd(zAreNotificationsEnabled, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(boolean z, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("userId", C44157sFk.copydefault(C44157sFk.gEmmrt()), false);
        eventParamsList.put("osType", "android", true);
        java.lang.String str = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str, "");
        eventParamsList.put("systemVersion", str, false);
        java.lang.String str2 = android.os.Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        eventParamsList.put("manufacturer", str2, false);
        eventParamsList.put("isOpen", java.lang.String.valueOf(z), true);
        return Unit.INSTANCE;
    }

    public final void EZpvd(@NotNull final OKMessage oKMessage, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(oKMessage, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (copydefault()) {
            if (oKMessage.getConversationType() == OKConversationType.SYSTEM) {
                java.lang.String targetId = oKMessage.getTargetId();
                OLrzqt(targetId != null ? targetId : "");
            }
            final java.lang.String strOptString = null;
            if (StringsKt__StringsKt.contains$default((java.lang.CharSequence) str, (java.lang.CharSequence) "c2cOrderId", false, 2, (java.lang.Object) null)) {
                try {
                    strOptString = new JSONObject(str).optString("c2cOrderId");
                } catch (JSONException unused) {
                }
                if (strOptString == null || strOptString.length() == 0) {
                    return;
                }
                C32866mlf.EZpvd("okim_c2c_orderStates_changed", new TrackChannel[]{TrackChannel.All}, (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.sNi
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return C44370sNh.AEQbTJ(oKMessage, strOptString, (EventParamsList) obj);
                    }
                });
            }
        }
    }

    public static final Unit AEQbTJ(OKMessage oKMessage, java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        java.lang.String senderUserId = oKMessage.getSenderUserId();
        if (senderUserId == null) {
            senderUserId = "";
        }
        eventParamsList.put("senderId", senderUserId, false);
        java.lang.String targetId = oKMessage.getTargetId();
        if (targetId == null) {
            targetId = "";
        }
        eventParamsList.put("receiveId", targetId, false);
        java.lang.String objectName = oKMessage.getObjectName();
        if (objectName == null) {
            objectName = "";
        }
        eventParamsList.put("msgType", objectName, false);
        java.lang.String str2 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        eventParamsList.put("systemVersion", str2, false);
        eventParamsList.put("osType", "android", false);
        eventParamsList.put("orderId", str, false);
        eventParamsList.put("isOffLineReceive", "false", true);
        return Unit.INSTANCE;
    }

    public final boolean copydefault() {
        IMReporter iMReporter = (IMReporter) C48787ucK.AEQbTJ.EZpvd(IMStrategyConst.IM_REPORTER, IMReporter.class);
        if (iMReporter != null) {
            return C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(iMReporter.getOpenPushReporter()), (java.lang.Object) 1);
        }
        return true;
    }

    public final void OLrzqt(java.lang.String str) {
        final java.lang.String str2;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) GatherConversationType.SystemDailyDynamics.getTargetId())) {
            str2 = "daily";
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) GatherConversationType.SystemPriceReminder.getTargetId())) {
            str2 = FirebaseAnalytics.Param.PRICE;
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) GatherConversationType.SystemNotice.getTargetId())) {
            str2 = "system";
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) GatherConversationType.SystemTradeNotice.getTargetId())) {
            str2 = ExtJson.BRC20TYPE_TRADE;
        } else {
            str2 = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) GatherConversationType.SocialTradeNews.getTargetId()) ? NotificationCompat.CATEGORY_SOCIAL : "other";
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) str2)) {
            TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
            C32866mlf.EZpvd("okim_system_push_click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.sNg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C44370sNh.EZpvd(str2, (EventParamsList) obj);
                }
            });
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("pushType", str, true);
        java.lang.String strValueOf = C34703nhO.valueOf(C32979mnm.EZpvd.OLrzqt());
        Intrinsics.checkNotNullExpressionValue(strValueOf, "");
        eventParamsList.put("appVersation", strValueOf, false);
        eventParamsList.put("osType", "android", true);
        return Unit.INSTANCE;
    }
}

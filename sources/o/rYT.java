package o;

import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.os.Build;
import androidx.browser.trusted.NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.util.NotificationUtil$$ExternalSyntheticApiModelOutline1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.rXV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@yCR
public final class rYT {
    public final android.content.Context EZpvd;
    public final android.app.NotificationManager KWHzl;
    public android.graphics.Bitmap OLrzqt;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;
    public static final java.util.List<java.lang.String> copydefault = yDY.gEmmrt("com.android.systemui", "android");

    @yCM
    public rYT(@NotNull android.content.Context context, @NotNull android.app.NotificationManager notificationManager) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(notificationManager, "");
        this.EZpvd = context;
        this.KWHzl = notificationManager;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rYT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final android.net.Uri OLrzqt(android.net.Uri uri, int i) {
        if (uri != null) {
            pUU.KWHzl("ShowSystemNotificationUseCase", "Using provided sound URI: " + uri);
            copydefault(uri);
            return uri;
        }
        pUU.KWHzl("ShowSystemNotificationUseCase", "Using system default sound");
        android.net.Uri defaultUri = RingtoneManager.getDefaultUri(i);
        Intrinsics.copydefault(defaultUri);
        return defaultUri;
    }

    public final void copydefault(android.net.Uri uri) {
        if (uri == null || !Intrinsics.EZpvd((java.lang.Object) uri.getScheme(), (java.lang.Object) "content")) {
            return;
        }
        try {
            java.util.Iterator<T> it = copydefault.iterator();
            while (it.hasNext()) {
                this.EZpvd.grantUriPermission((java.lang.String) it.next(), uri, 1);
            }
            pUU.EZpvd("ShowSystemNotificationUseCase", "Granted URI permission to system packages for: " + uri);
        } catch (java.lang.Exception e) {
            pUU.copydefault("ShowSystemNotificationUseCase", "Failed to grant URI permission: " + e.getMessage());
        }
    }

    public final void copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, int i, java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5, boolean z, android.net.Uri uri, @NotNull java.lang.String str6, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        try {
            pUU.KWHzl("ShowSystemNotificationUseCase", "Showing system notification, channelId: " + str + ", channelName: " + str2 + ", notificationId: " + i + ", title: " + str4 + ", content: " + str5 + ", deeplink: " + str6);
            NotificationCompat.Builder autoCancel = new NotificationCompat.Builder(this.EZpvd, str).setWhen(java.lang.System.currentTimeMillis()).setAutoCancel(true);
            Intrinsics.checkNotNullExpressionValue(autoCancel, "");
            if (z3) {
                EZpvd(autoCancel, str4, str5, uri);
            } else if (z2) {
                EZpvd(autoCancel, str4, str5, z);
            } else {
                AEQbTJ(autoCancel, str4, str5);
            }
            AEQbTJ(autoCancel);
            autoCancel.setContentIntent(AEQbTJ(str6));
            if (str3 != null) {
                autoCancel.setGroup(str3);
            }
            android.app.Notification notificationBuild = autoCancel.build();
            Intrinsics.checkNotNullExpressionValue(notificationBuild, "");
            if (Build.VERSION.SDK_INT >= 26 && this.KWHzl.getNotificationChannel(str) == null) {
                if (z3) {
                    OLrzqt(str, str2, uri);
                } else if (z2) {
                    KWHzl(str, str2, notificationBuild.sound);
                } else {
                    OLrzqt(str, str2);
                }
            }
            this.KWHzl.notify(i, notificationBuild);
            if (str3 != null) {
                KWHzl(str, str3, str4, str5, str6);
            }
        } catch (java.lang.Exception e) {
            pUU.copydefault("ShowSystemNotificationUseCase", "channelId: " + str + ", Error showing system notification: " + e.getMessage());
        }
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2, android.net.Uri uri) {
        android.net.Uri uriOLrzqt = OLrzqt(uri, 1);
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
        android.app.NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(str, str2, 4);
        notificationChannelM.enableVibration(true);
        notificationChannelM.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
        notificationChannelM.enableLights(true);
        notificationChannelM.setDescription(C33070mpX.AYXKKw(rXV.TaskDescription.fIwbmz));
        notificationChannelM.setSound(uriOLrzqt, audioAttributesBuild);
        this.KWHzl.createNotificationChannel(notificationChannelM);
        pUU.KWHzl("ShowSystemNotificationUseCase", "Notification channel created: channelId: " + str);
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, android.net.Uri uri) {
        NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
        android.app.NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(str, str2, 3);
        notificationChannelM.enableLights(true);
        notificationChannelM.setLightColor(ContextCompat.getColor(this.EZpvd, rXV.Application.AEQbTJ));
        notificationChannelM.setLockscreenVisibility(1);
        if (uri != null) {
            notificationChannelM.setSound(uri, new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
        }
        this.KWHzl.createNotificationChannel(notificationChannelM);
        pUU.KWHzl("ShowSystemNotificationUseCase", "Notification channel created: channelId: " + str);
    }

    public final void OLrzqt(java.lang.String str, java.lang.String str2) {
        NotificationUtil$$ExternalSyntheticApiModelOutline1.m();
        android.app.NotificationChannel notificationChannelM = NotificationApiHelperForO$$ExternalSyntheticApiModelOutline4.m(str, str2, 3);
        notificationChannelM.setDescription(str2);
        notificationChannelM.enableLights(true);
        notificationChannelM.setLightColor(ContextCompat.getColor(this.EZpvd, rXV.Application.AEQbTJ));
        notificationChannelM.enableVibration(true);
        notificationChannelM.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
        this.KWHzl.createNotificationChannel(notificationChannelM);
        pUU.KWHzl("ShowSystemNotificationUseCase", "Notification channel created: channelId: " + str);
    }

    public final void EZpvd(NotificationCompat.Builder builder, java.lang.String str, java.lang.String str2, android.net.Uri uri) {
        builder.setPriority(2).setContentTitle(str).setContentText(str2).setVibrate(new long[]{0, 500, 1000}).setDefaults(4).setSound(OLrzqt(uri, 1));
    }

    public final void EZpvd(NotificationCompat.Builder builder, java.lang.String str, java.lang.String str2, boolean z) {
        builder.setPriority(0).setContentTitle(str).setContentText(str2).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(str).bigText(str2));
        if (z) {
            builder.setSound(null);
            builder.setDefaults(4);
        } else {
            builder.setSound(RingtoneManager.getDefaultUri(2));
            builder.setDefaults(1);
            builder.setVibrate(new long[]{0, 200, 250, 200});
        }
    }

    public final void AEQbTJ(NotificationCompat.Builder builder, java.lang.String str, java.lang.String str2) {
        builder.setPriority(0).setContentTitle(str).setContentText(str2).setDefaults(-1).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(str).bigText(str2)).setVisibility(1).setCategory("msg");
    }

    public final void AEQbTJ(NotificationCompat.Builder builder) {
        if (this.OLrzqt == null) {
            this.OLrzqt = BitmapFactory.decodeResource(this.EZpvd.getResources(), ((java.lang.Number) C33084mpl.OLrzqt("NOTIFY_SMALL_ICON", -1)).intValue());
        }
        android.graphics.Bitmap bitmap = this.OLrzqt;
        if (bitmap != null) {
            builder.setLargeIcon(bitmap);
        }
        int iIntValue = ((java.lang.Number) C33084mpl.OLrzqt("NOTIFY_SMALL_ICON2", -1)).intValue();
        if (iIntValue != -1) {
            builder.setSmallIcon(iIntValue);
        }
    }

    public final void KWHzl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        try {
            pUU.KWHzl("ShowSystemNotificationUseCase", "Showing group summary notification, channelId: " + str + ", notifyGroupId: " + str2 + ", title: " + str3 + ", content: " + str4 + ", deeplink: " + str5);
            int iHashCode = str2.hashCode();
            NotificationCompat.Builder style = new NotificationCompat.Builder(this.EZpvd, str).setWhen(java.lang.System.currentTimeMillis()).setAutoCancel(true).setPriority(0).setGroup(str2).setGroupSummary(true).setGroupAlertBehavior(2).setContentTitle(str3).setContentText(str4).setStyle(new NotificationCompat.BigTextStyle().setBigContentTitle(str3).bigText(str4));
            Intrinsics.checkNotNullExpressionValue(style, "");
            AEQbTJ(style);
            style.setContentIntent(AEQbTJ(str5));
            this.KWHzl.notify(iHashCode, style.build());
        } catch (java.lang.Exception e) {
            pUU.copydefault("ShowSystemNotificationUseCase", "channelId: " + str + ", Error showing group summary notification: " + e.getMessage());
        }
    }

    public final android.app.PendingIntent AEQbTJ(java.lang.String str) {
        android.net.Uri uri = android.net.Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(uri, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", uri);
        intent.addFlags(872415232);
        return android.app.PendingIntent.getActivity(this.EZpvd, 0, intent, 67108864);
    }
}

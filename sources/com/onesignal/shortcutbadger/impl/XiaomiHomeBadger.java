package com.onesignal.shortcutbadger.impl;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import o.C57893yqx;
import o.InterfaceC57892yqw;

/* JADX INFO: loaded from: classes24.dex */
@Deprecated
public class XiaomiHomeBadger implements InterfaceC57892yqw {
    public ResolveInfo copydefault;

    @Override // o.InterfaceC57892yqw
    public void copydefault(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Object objValueOf;
        try {
            Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = objNewInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                objValueOf = "";
            } else {
                try {
                    objValueOf = Integer.valueOf(i);
                } catch (Exception unused) {
                    declaredField.set(objNewInstance, Integer.valueOf(i));
                }
            }
            declaredField.set(objNewInstance, String.valueOf(objValueOf));
        } catch (Exception unused2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            intent.putExtra("android.intent.extra.update_application_component_name", componentName.getPackageName() + "/" + componentName.getClassName());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i != 0 ? Integer.valueOf(i) : ""));
            if (C57893yqx.OLrzqt(context, intent)) {
                context.sendBroadcast(intent);
            }
        }
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi")) {
            OLrzqt(context, i);
        }
    }

    public final void OLrzqt(Context context, int i) throws ShortcutBadgeException {
        if (this.copydefault == null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            this.copydefault = context.getPackageManager().resolveActivity(intent, 65536);
        }
        if (this.copydefault != null) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(RemoteMessageConst.NOTIFICATION);
            Notification notificationBuild = new Notification.Builder(context).setContentTitle("").setContentText("").setSmallIcon(this.copydefault.getIconResource()).build();
            try {
                Object obj = notificationBuild.getClass().getDeclaredField("extraNotification").get(notificationBuild);
                obj.getClass().getDeclaredMethod("setMessageCount", Integer.TYPE).invoke(obj, Integer.valueOf(i));
                notificationManager.notify(0, notificationBuild);
            } catch (Exception e) {
                throw new ShortcutBadgeException("not able to set badge", e);
            }
        }
    }

    @Override // o.InterfaceC57892yqw
    public List<String> OLrzqt() {
        return Arrays.asList("com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher");
    }
}

package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import o.InterfaceC57892yqw;

/* JADX INFO: loaded from: classes12.dex */
public class VivoHomeBadger implements InterfaceC57892yqw {
    @Override // o.InterfaceC57892yqw
    public void copydefault(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }

    @Override // o.InterfaceC57892yqw
    public List<String> OLrzqt() {
        return Arrays.asList("com.vivo.launcher");
    }
}

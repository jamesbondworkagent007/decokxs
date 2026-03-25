package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import o.C57893yqx;
import o.InterfaceC57892yqw;

/* JADX INFO: loaded from: classes12.dex */
public class NewHtcHomeBadger implements InterfaceC57892yqw {
    @Override // o.InterfaceC57892yqw
    public void copydefault(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        if (C57893yqx.OLrzqt(context, intent) || C57893yqx.OLrzqt(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
        } else {
            throw new ShortcutBadgeException("unable to resolve intent: " + intent2.toString());
        }
    }

    @Override // o.InterfaceC57892yqw
    public List<String> OLrzqt() {
        return Arrays.asList("com.htc.launcher");
    }
}

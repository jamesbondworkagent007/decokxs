package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.ArrayList;
import java.util.List;
import o.C57893yqx;
import o.InterfaceC57892yqw;

/* JADX INFO: loaded from: classes12.dex */
public class DefaultBadger implements InterfaceC57892yqw {
    @Override // o.InterfaceC57892yqw
    public void copydefault(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        if (C57893yqx.OLrzqt(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent.toString());
    }

    @Override // o.InterfaceC57892yqw
    public List<String> OLrzqt() {
        return new ArrayList(0);
    }

    public boolean KWHzl(Context context) {
        return C57893yqx.OLrzqt(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"));
    }
}

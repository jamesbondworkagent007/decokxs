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
public class AdwHomeBadger implements InterfaceC57892yqw {
    @Override // o.InterfaceC57892yqw
    public void copydefault(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i);
        if (C57893yqx.OLrzqt(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent.toString());
    }

    @Override // o.InterfaceC57892yqw
    public List<String> OLrzqt() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}

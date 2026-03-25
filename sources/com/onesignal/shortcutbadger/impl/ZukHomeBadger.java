package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Collections;
import java.util.List;
import o.InterfaceC57892yqw;

/* JADX INFO: loaded from: classes12.dex */
public class ZukHomeBadger implements InterfaceC57892yqw {
    public final Uri copydefault = Uri.parse("content://com.android.badge/badge");

    @Override // o.InterfaceC57892yqw
    public void copydefault(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.copydefault, "setAppBadgeCount", (String) null, bundle);
    }

    @Override // o.InterfaceC57892yqw
    public List<String> OLrzqt() {
        return Collections.singletonList("com.zui.launcher");
    }
}

package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import o.InterfaceC57892yqw;

/* JADX INFO: loaded from: classes12.dex */
public class SonyHomeBadger implements InterfaceC57892yqw {
    public AsyncQueryHandler OLrzqt;
    public final Uri copydefault = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    @Override // o.InterfaceC57892yqw
    public void copydefault(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (AEQbTJ(context)) {
            EZpvd(context, componentName, i);
        } else {
            OLrzqt(context, componentName, i);
        }
    }

    @Override // o.InterfaceC57892yqw
    public List<String> OLrzqt() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    private static void OLrzqt(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i > 0);
        context.sendBroadcast(intent);
    }

    public final void EZpvd(Context context, ComponentName componentName, int i) {
        if (i < 0) {
            return;
        }
        ContentValues contentValuesOLrzqt = OLrzqt(i, componentName);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.OLrzqt == null) {
                this.OLrzqt = new AsyncQueryHandler(context.getApplicationContext().getContentResolver()) { // from class: com.onesignal.shortcutbadger.impl.SonyHomeBadger.2
                };
            }
            EZpvd(contentValuesOLrzqt);
            return;
        }
        OLrzqt(context, contentValuesOLrzqt);
    }

    public final void EZpvd(ContentValues contentValues) {
        this.OLrzqt.startInsert(0, null, this.copydefault, contentValues);
    }

    public final void OLrzqt(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.copydefault, contentValues);
    }

    public final ContentValues OLrzqt(int i, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    public static boolean AEQbTJ(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }
}

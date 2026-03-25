package com.onesignal.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.onesignal.shortcutbadger.ShortcutBadgeException;
import java.util.Arrays;
import java.util.List;
import o.C57844yqA;
import o.InterfaceC57892yqw;

/* JADX INFO: loaded from: classes12.dex */
public class SamsungHomeBadger implements InterfaceC57892yqw {
    public static final String[] KWHzl = {"_id", "class"};
    public DefaultBadger OLrzqt = new DefaultBadger();

    @Override // o.InterfaceC57892yqw
    public void copydefault(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        DefaultBadger defaultBadger = this.OLrzqt;
        if (defaultBadger != null && defaultBadger.KWHzl(context)) {
            this.OLrzqt.copydefault(context, componentName, i);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, KWHzl, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                String className = componentName.getClassName();
                boolean z = false;
                while (cursorQuery.moveToNext()) {
                    contentResolver.update(uri, AEQbTJ(componentName, i, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                    if (className.equals(cursorQuery.getString(cursorQuery.getColumnIndex("class")))) {
                        z = true;
                    }
                }
                if (!z) {
                    contentResolver.insert(uri, AEQbTJ(componentName, i, true));
                }
            }
        } finally {
            C57844yqA.OLrzqt(cursorQuery);
        }
    }

    public final ContentValues AEQbTJ(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    @Override // o.InterfaceC57892yqw
    public List<String> OLrzqt() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }
}

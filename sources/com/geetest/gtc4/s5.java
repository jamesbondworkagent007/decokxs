package com.geetest.gtc4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class s5 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f505a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s5(Context context) {
        this.f505a = context;
    }

    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        Context context = this.f505a;
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().resolveContentProvider("com.meizu.flyme.openidsdk", 0) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f505a != null) {
            try {
                Cursor cursorQuery = this.f505a.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
                try {
                    Objects.requireNonNull(cursorQuery);
                    Cursor cursor = cursorQuery;
                    cursorQuery.moveToFirst();
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex("value"));
                    if (string != null && !string.isEmpty()) {
                        i3Var.f460a.set(string);
                        i3Var.b.countDown();
                        cursorQuery.close();
                        return;
                    }
                    throw new e6("OAID query failed");
                } finally {
                }
            } catch (Exception unused) {
                i3Var.b.countDown();
            }
        }
    }
}

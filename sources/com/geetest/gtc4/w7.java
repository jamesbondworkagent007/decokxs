package com.geetest.gtc4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import java.util.Objects;

/* JADX INFO: loaded from: classes21.dex */
public final class w7 implements x4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f529a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public w7(Context context) {
        this.f529a = context;
    }

    @Override // com.geetest.gtc4.x4
    public final boolean a() {
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return g6.a("persist.sys.identifierid.supported", "0").equals("1");
    }

    @Override // com.geetest.gtc4.x4
    public final void a(i3 i3Var) {
        if (this.f529a != null) {
            try {
                Cursor cursorQuery = this.f529a.getContentResolver().query(Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID"), null, null, null, null);
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

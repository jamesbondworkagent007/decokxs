package o;

import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import o.IntentSender;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class PackageItemInfo implements AssetManager {
    public final android.database.Cursor OLrzqt;

    public PackageItemInfo(@NotNull android.database.Cursor cursor, java.lang.Long l) {
        Intrinsics.checkNotNullParameter(cursor, "");
        this.OLrzqt = cursor;
        if (Build.VERSION.SDK_INT < 28 || l == null || !(cursor instanceof android.database.AbstractWindowedCursor)) {
            return;
        }
        DatabaseErrorHandler.EZpvd((android.database.AbstractWindowedCursor) cursor, l.longValue());
    }

    @Override // o.AssetManager
    public /* synthetic */ IntentSender KWHzl() {
        return IntentSender.Activity.EZpvd(copydefault());
    }

    public java.lang.Object copydefault() {
        return IntentSender.Activity.copydefault(java.lang.Boolean.valueOf(this.OLrzqt.moveToNext()));
    }

    @Override // o.AssetManager
    public java.lang.String KWHzl(int i) {
        if (this.OLrzqt.isNull(i)) {
            return null;
        }
        return this.OLrzqt.getString(i);
    }

    @Override // o.AssetManager
    public java.lang.Long EZpvd(int i) {
        if (this.OLrzqt.isNull(i)) {
            return null;
        }
        return java.lang.Long.valueOf(this.OLrzqt.getLong(i));
    }

    @Override // o.AssetManager
    public java.lang.Boolean OLrzqt(int i) {
        if (this.OLrzqt.isNull(i)) {
            return null;
        }
        return java.lang.Boolean.valueOf(this.OLrzqt.getLong(i) == 1);
    }
}

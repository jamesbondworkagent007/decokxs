package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11448cOq<T> {
    public final java.util.ArrayList<T> KWHzl = new java.util.ArrayList<>();

    public abstract java.lang.String OLrzqt();

    public abstract T copydefault(@NotNull android.database.Cursor cursor);

    public final void KWHzl() {
        android.database.Cursor cursorQuery = cSP.OLrzqt.AEQbTJ().getReadableDatabase().query(false, OLrzqt(), null, null, null, null, null, null, null);
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "");
        if (cursorQuery.moveToFirst()) {
            this.KWHzl.clear();
            do {
                this.KWHzl.add(copydefault(cursorQuery));
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
        }
    }

    public final java.util.List<T> EZpvd() {
        KWHzl();
        return this.KWHzl;
    }
}

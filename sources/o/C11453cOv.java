package o;

import com.okinc.business.defi.biz.database.wallet.entity.KVEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11453cOv extends AbstractC11448cOq<KVEntity> {
    public final java.lang.String AEQbTJ = "keyValues";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public KVEntity copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("_key");
        java.lang.String string = cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex);
        if (string == null) {
            string = "";
        }
        int columnIndex2 = cursor.getColumnIndex("_value");
        java.lang.String string2 = cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2);
        return new KVEntity(string, string2 != null ? string2 : "");
    }
}

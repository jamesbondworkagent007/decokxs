package o;

import com.okinc.business.defi.biz.database.wallet.entity.SyncItemEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cOE extends AbstractC11448cOq<SyncItemEntity> {
    public final java.lang.String OLrzqt = "sync";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public SyncItemEntity copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("id");
        java.lang.Integer numValueOf = cursor.isNull(columnIndex) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex));
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int columnIndex2 = cursor.getColumnIndex("data");
        java.lang.String string = cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2);
        return new SyncItemEntity(iIntValue, string != null ? string : "");
    }
}

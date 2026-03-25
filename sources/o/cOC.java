package o;

import com.okinc.business.defi.biz.database.wallet.entity.SepInfoEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cOC extends AbstractC11448cOq<SepInfoEntity> {
    public final java.lang.String AEQbTJ = "sepInfo";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public SepInfoEntity copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("walletId");
        java.lang.String string = cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex);
        if (string == null) {
            string = "";
        }
        int columnIndex2 = cursor.getColumnIndex("coinId");
        java.lang.Long lValueOf = cursor.isNull(columnIndex2) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex2));
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        int columnIndex3 = cursor.getColumnIndex("state");
        java.lang.String string2 = cursor.isNull(columnIndex3) ? null : cursor.getString(columnIndex3);
        return new SepInfoEntity(string, jLongValue, string2 != null ? string2 : "");
    }
}

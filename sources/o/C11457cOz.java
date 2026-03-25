package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11457cOz extends AbstractC11448cOq<C11451cOt> {
    public final java.lang.String copydefault = "message";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
    public C11451cOt copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("id");
        java.lang.Integer numValueOf = cursor.isNull(columnIndex) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex));
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int columnIndex2 = cursor.getColumnIndex("rowId");
        java.lang.String string = cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2);
        java.lang.String str = string == null ? "" : string;
        int columnIndex3 = cursor.getColumnIndex("timestamp");
        java.lang.Long lValueOf = cursor.isNull(columnIndex3) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex3));
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        int columnIndex4 = cursor.getColumnIndex("read");
        java.lang.Integer numValueOf2 = cursor.isNull(columnIndex4) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex4));
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        int columnIndex5 = cursor.getColumnIndex("msg");
        java.lang.String string2 = cursor.isNull(columnIndex5) ? null : cursor.getString(columnIndex5);
        java.lang.String str2 = string2 == null ? "" : string2;
        int columnIndex6 = cursor.getColumnIndex("walletId");
        java.lang.String string3 = cursor.isNull(columnIndex6) ? null : cursor.getString(columnIndex6);
        return new C11451cOt(string3 == null ? "" : string3, iIntValue, str, jLongValue, iIntValue2, str2);
    }
}

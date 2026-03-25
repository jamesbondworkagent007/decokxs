package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class cOD extends AbstractC11448cOq<WalletEntity> {
    public final java.lang.String AEQbTJ = "wallet";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public WalletEntity copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("id");
        java.lang.String string = cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex);
        java.lang.String str = string == null ? "" : string;
        int columnIndex2 = cursor.getColumnIndex("type");
        java.lang.Integer numValueOf = cursor.isNull(columnIndex2) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex2));
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int columnIndex3 = cursor.getColumnIndex("data");
        java.lang.String string2 = cursor.isNull(columnIndex3) ? null : cursor.getString(columnIndex3);
        java.lang.String str2 = string2 == null ? "" : string2;
        int columnIndex4 = cursor.getColumnIndex("chainId");
        java.lang.Long lValueOf = cursor.isNull(columnIndex4) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex4));
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        int columnIndex5 = cursor.getColumnIndex("language");
        java.lang.String string3 = cursor.isNull(columnIndex5) ? null : cursor.getString(columnIndex5);
        if (string3 == null) {
            string3 = "";
        }
        int columnIndex6 = cursor.getColumnIndex("name");
        java.lang.String string4 = cursor.isNull(columnIndex6) ? null : cursor.getString(columnIndex6);
        java.lang.String str3 = string4 == null ? "" : string4;
        int columnIndex7 = cursor.getColumnIndex("backup");
        java.lang.Integer numValueOf2 = cursor.isNull(columnIndex7) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex7));
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        int columnIndex8 = cursor.getColumnIndex("main");
        java.lang.Integer numValueOf3 = cursor.isNull(columnIndex8) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex8));
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        int columnIndex9 = cursor.getColumnIndex("xpub");
        java.lang.String string5 = cursor.isNull(columnIndex9) ? null : cursor.getString(columnIndex9);
        java.lang.String str4 = string5 == null ? "" : string5;
        int columnIndex10 = cursor.getColumnIndex("xpriv");
        java.lang.String string6 = cursor.isNull(columnIndex10) ? null : cursor.getString(columnIndex10);
        java.lang.String str5 = string6 != null ? string6 : "";
        int columnIndex11 = cursor.getColumnIndex("isSegWit");
        java.lang.Integer numValueOf4 = cursor.isNull(columnIndex11) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex11));
        int iIntValue4 = numValueOf4 != null ? numValueOf4.intValue() : 0;
        int columnIndex12 = cursor.getColumnIndex("fromCreate");
        java.lang.Integer numValueOf5 = cursor.isNull(columnIndex12) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex12));
        int iIntValue5 = numValueOf5 != null ? numValueOf5.intValue() : 0;
        int columnIndex13 = cursor.getColumnIndex("createAt");
        java.lang.Long lValueOf2 = cursor.isNull(columnIndex13) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex13));
        return new WalletEntity(str, iIntValue, str2, jLongValue, string3, str3, 0, iIntValue2, 0, 0, iIntValue3, str4, str5, iIntValue4, iIntValue5, lValueOf2 != null ? lValueOf2.longValue() : 0L, 0, null, 0, 0, null, null, 0, 0, C32979mnm.EZpvd.EZpvd(), 16712512, null);
    }
}

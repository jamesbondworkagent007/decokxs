package o;

import com.okinc.business.defi.biz.database.wallet.entity.EOSInfoEntity;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11454cOw extends AbstractC11448cOq<EOSInfoEntity> {
    public final java.lang.String OLrzqt = "EOSInfo";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
    public EOSInfoEntity copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("walletId");
        java.lang.String string = cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex);
        java.lang.String str = string == null ? "" : string;
        int columnIndex2 = cursor.getColumnIndex("accountName");
        java.lang.String string2 = cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2);
        java.lang.String str2 = string2 == null ? "" : string2;
        int columnIndex3 = cursor.getColumnIndex("state");
        java.lang.Integer numValueOf = cursor.isNull(columnIndex3) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex3));
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        int columnIndex4 = cursor.getColumnIndex("pubKey");
        java.lang.String string3 = cursor.isNull(columnIndex4) ? null : cursor.getString(columnIndex4);
        java.lang.String str3 = string3 == null ? "" : string3;
        int columnIndex5 = cursor.getColumnIndex("activeKey");
        java.lang.String string4 = cursor.isNull(columnIndex5) ? null : cursor.getString(columnIndex5);
        java.lang.String str4 = string4 == null ? "" : string4;
        int columnIndex6 = cursor.getColumnIndex("ownerKey");
        java.lang.String string5 = cursor.isNull(columnIndex6) ? null : cursor.getString(columnIndex6);
        java.lang.String str5 = string5 == null ? "" : string5;
        int columnIndex7 = cursor.getColumnIndex("shouldBeDeleted");
        java.lang.Integer numValueOf2 = cursor.isNull(columnIndex7) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex7));
        return new EOSInfoEntity(str, str2, iIntValue, str3, str4, str5, numValueOf2 != null ? numValueOf2.intValue() : 0);
    }
}

package o;

import com.okinc.business.defi.biz.database.wallet.entity.WalletCoinAssetEntity;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11455cOx extends AbstractC11448cOq<WalletCoinAssetEntity> {
    public final java.lang.String copydefault = "coin";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public WalletCoinAssetEntity copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("walletId");
        java.lang.String string = cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex);
        java.lang.String str = string == null ? "" : string;
        int columnIndex2 = cursor.getColumnIndex("coinId");
        java.lang.Long lValueOf = cursor.isNull(columnIndex2) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex2));
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        int columnIndex3 = cursor.getColumnIndex(OtcExtraKeys.AMOUNT);
        java.lang.String string2 = cursor.isNull(columnIndex3) ? null : cursor.getString(columnIndex3);
        java.lang.String str2 = string2 == null ? "" : string2;
        int columnIndex4 = cursor.getColumnIndex("orderValue");
        java.lang.Integer numValueOf = cursor.isNull(columnIndex4) ? null : java.lang.Integer.valueOf(cursor.getInt(columnIndex4));
        return new WalletCoinAssetEntity(str, jLongValue, str2, null, null, null, numValueOf != null ? numValueOf.intValue() : 0, null, 0, null, null, null, null, null, null, 32696, null);
    }
}

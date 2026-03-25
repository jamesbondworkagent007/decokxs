package o;

import com.okinc.business.defi.biz.database.wallet.entity.AddressEntity;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11450cOs extends AbstractC11448cOq<AddressEntity> {
    public final java.lang.String OLrzqt = WalletSearchRequest.SEARCH_SOURCE_ADDRESS;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public AddressEntity copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("coinId");
        java.lang.Long lValueOf = cursor.isNull(columnIndex) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex));
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        int columnIndex2 = cursor.getColumnIndex(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        java.lang.String string = cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2);
        java.lang.String str = string == null ? "" : string;
        int columnIndex3 = cursor.getColumnIndex(OtcExtraKeys.TRADING_TERMS);
        java.lang.String string2 = cursor.isNull(columnIndex3) ? null : cursor.getString(columnIndex3);
        java.lang.String str2 = string2 == null ? "" : string2;
        int columnIndex4 = cursor.getColumnIndex("createAt");
        java.lang.Long lValueOf2 = cursor.isNull(columnIndex4) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex4));
        return new AddressEntity(str, jLongValue, str2, lValueOf2 != null ? lValueOf2.longValue() : 0L, null, 16, null);
    }
}

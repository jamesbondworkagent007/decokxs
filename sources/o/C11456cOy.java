package o;

import com.okinc.business.defi.biz.database.wallet.entity.ChainAddressEntity;
import com.okinc.business.defi.wallet.mine.search.data.model.WalletSearchRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cOy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11456cOy extends AbstractC11448cOq<ChainAddressEntity> {
    public final java.lang.String EZpvd = "chain_address";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC11448cOq
    public java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Method merged with bridge method: copydefault(Landroid/database/Cursor;)Ljava/lang/Object; */
    @Override // o.AbstractC11448cOq
    /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
    public ChainAddressEntity copydefault(@NotNull android.database.Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "");
        int columnIndex = cursor.getColumnIndex("walletId");
        java.lang.String string = cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex);
        java.lang.String str = string == null ? "" : string;
        int columnIndex2 = cursor.getColumnIndex("chainId");
        java.lang.Long lValueOf = cursor.isNull(columnIndex2) ? null : java.lang.Long.valueOf(cursor.getLong(columnIndex2));
        long jLongValue = lValueOf != null ? lValueOf.longValue() : 0L;
        int columnIndex3 = cursor.getColumnIndex(WalletSearchRequest.SEARCH_SOURCE_ADDRESS);
        java.lang.String string2 = cursor.isNull(columnIndex3) ? null : cursor.getString(columnIndex3);
        return new ChainAddressEntity(str, jLongValue, string2 == null ? "" : string2, 0, null, null, null, null, 248, null);
    }
}

package o;

import androidx.room.migration.AutoMigrationSpec;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31262lqh implements AutoMigrationSpec {
    @Override // androidx.room.migration.AutoMigrationSpec
    public void onPostMigrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        super.onPostMigrate(supportSQLiteDatabase);
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `transaction_order_for_token`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `transaction_order_for_token` (`key` TEXT NOT NULL, `requestChainIndex` TEXT NOT NULL, `requestTokenCoinTypeNo` TEXT NOT NULL, `index` INTEGER NOT NULL, `orderId` TEXT NOT NULL, `orderType` INTEGER NOT NULL, `tokenSymbol` TEXT NOT NULL, `tokenDecimal` INTEGER NOT NULL, `chainIndex` TEXT NOT NULL, `tokenAddress` TEXT, `tokenAmount` TEXT NOT NULL, `currencyAmount` TEXT NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `areaCode` TEXT, `status` INTEGER NOT NULL, `createTime` INTEGER NOT NULL, `receiverType` INTEGER, `subStatus` INTEGER, `convertInfo` TEXT, PRIMARY KEY(`key`, `requestChainIndex`, `requestTokenCoinTypeNo`, `orderId`))");
        supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `transaction_order_for_token_cache`");
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `transaction_order_for_token_cache` (`key` TEXT NOT NULL, `chainIndex` TEXT NOT NULL, `tokenCoinTypeNo` TEXT NOT NULL, `nextCursor` TEXT NOT NULL, PRIMARY KEY(`key`, `chainIndex`, `tokenCoinTypeNo`))");
    }
}

package o;

import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.lqg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31261lqg extends Migration {
    public final AutoMigrationSpec KWHzl;

    public C31261lqg(@androidx.annotation.NonNull AutoMigrationSpec autoMigrationSpec) {
        super(1, 2);
        this.KWHzl = autoMigrationSpec;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `web3pay_recent_contact` ADD COLUMN `contactAvatar` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_order` (`key` TEXT NOT NULL, `index` INTEGER NOT NULL, `orderId` TEXT NOT NULL, `orderType` INTEGER NOT NULL, `tokenSymbol` TEXT NOT NULL, `tokenDecimal` INTEGER NOT NULL, `chainIndex` TEXT NOT NULL, `tokenAddress` TEXT, `tokenAmount` TEXT NOT NULL, `currencyAmount` TEXT NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `areaCode` TEXT, `status` INTEGER NOT NULL, `createTime` INTEGER NOT NULL, `receiverType` INTEGER, `subStatus` INTEGER, `convertInfo` TEXT, PRIMARY KEY(`key`, `orderId`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `transaction_order_cache` (`key` TEXT NOT NULL, `nextCursor` TEXT NOT NULL, PRIMARY KEY(`key`))");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_transaction_order_for_token` (`key` TEXT NOT NULL, `requestChainIndex` TEXT NOT NULL, `requestTokenCoinTypeNo` TEXT NOT NULL, `index` INTEGER NOT NULL, `orderId` TEXT NOT NULL, `orderType` INTEGER NOT NULL, `tokenSymbol` TEXT NOT NULL, `tokenDecimal` INTEGER NOT NULL, `chainIndex` TEXT NOT NULL, `tokenAddress` TEXT, `tokenAmount` TEXT NOT NULL, `currencyAmount` TEXT NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `areaCode` TEXT, `status` INTEGER NOT NULL, `createTime` INTEGER NOT NULL, `receiverType` INTEGER, `subStatus` INTEGER, `convertInfo` TEXT, PRIMARY KEY(`key`, `requestChainIndex`, `requestTokenCoinTypeNo`, `orderId`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_transaction_order_for_token` (`key`,`requestChainIndex`,`requestTokenCoinTypeNo`,`index`,`orderId`,`orderType`,`tokenSymbol`,`tokenDecimal`,`chainIndex`,`tokenAddress`,`tokenAmount`,`currencyAmount`,`from`,`to`,`areaCode`,`status`,`createTime`,`receiverType`) SELECT `key`,`requestChainIndex`,`requestTokenAddress`,`index`,`orderId`,`orderType`,`tokenSymbol`,`tokenDecimal`,`chainIndex`,`tokenAddress`,`tokenAmount`,`currencyAmount`,`from`,`to`,`areaCode`,`status`,`createTime`,`receiverType` FROM `transaction_order_for_token`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transaction_order_for_token`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_transaction_order_for_token` RENAME TO `transaction_order_for_token`");
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_transaction_order_for_token_cache` (`key` TEXT NOT NULL, `chainIndex` TEXT NOT NULL, `tokenCoinTypeNo` TEXT NOT NULL, `nextCursor` TEXT NOT NULL, PRIMARY KEY(`key`, `chainIndex`, `tokenCoinTypeNo`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_transaction_order_for_token_cache` (`key`,`chainIndex`,`tokenCoinTypeNo`,`nextCursor`) SELECT `key`,`chainIndex`,`tokenAddress`,`nextCursor` FROM `transaction_order_for_token_cache`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `transaction_order_for_token_cache`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_transaction_order_for_token_cache` RENAME TO `transaction_order_for_token_cache`");
        this.KWHzl.onPostMigrate(sQLiteConnection);
    }
}

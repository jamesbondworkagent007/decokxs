package o;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.lqe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31259lqe extends Migration {
    public C31259lqe() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transaction_order_for_token` ADD COLUMN `merchantId` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transaction_order_for_token` ADD COLUMN `productCode` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transaction_order` ADD COLUMN `merchantId` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `transaction_order` ADD COLUMN `productCode` TEXT DEFAULT NULL");
    }
}

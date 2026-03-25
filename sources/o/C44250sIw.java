package o;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.sIw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44250sIw extends Migration {
    public C44250sIw() {
        super(29, 30);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `contacts` ADD COLUMN `orbitBackgroundImage` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `contacts` ADD COLUMN `orbitStatus` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `superGroupConfig_showSuperGroupUpgradeStatus` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `superGroupConfig_orbiterPlusExpiryTimestamp` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `superGroupConfig_capacity` INTEGER DEFAULT NULL");
    }
}

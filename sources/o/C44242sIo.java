package o;

import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.sIo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44242sIo extends Migration {
    public final AutoMigrationSpec KWHzl;

    public C44242sIo(@androidx.annotation.NonNull AutoMigrationSpec autoMigrationSpec) {
        super(18, 19);
        this.KWHzl = autoMigrationSpec;
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS `_new_group_setting` (`group_id` TEXT NOT NULL, `group_nick_name` TEXT, `user_nick_name` TEXT, `role` INTEGER NOT NULL, `is_no_disturb` INTEGER NOT NULL, `is_top` INTEGER NOT NULL, PRIMARY KEY(`group_id`))");
        SQLite.execSQL(sQLiteConnection, "INSERT INTO `_new_group_setting` (`group_id`,`group_nick_name`,`user_nick_name`,`role`,`is_no_disturb`,`is_top`) SELECT `group_id`,`group_nick_name`,`user_nick_name`,`role`,`is_no_disturb`,`is_top` FROM `group_setting`");
        SQLite.execSQL(sQLiteConnection, "DROP TABLE `group_setting`");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `_new_group_setting` RENAME TO `group_setting`");
        this.KWHzl.onPostMigrate(sQLiteConnection);
    }
}

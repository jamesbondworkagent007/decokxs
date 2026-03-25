package o;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.sIx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44251sIx extends Migration {
    public C44251sIx() {
        super(34, 35);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `conversation` ADD COLUMN `bizGroupName` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `biz_group_name` TEXT DEFAULT NULL");
    }
}

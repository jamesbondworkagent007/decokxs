package o;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.sIz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44253sIz extends Migration {
    public C44253sIz() {
        super(35, 36);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `message` ADD COLUMN `fileName` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `message` ADD COLUMN `fileExtension` TEXT DEFAULT NULL");
    }
}

package o;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.sIt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44247sIt extends Migration {
    public C44247sIt() {
        super(33, 34);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `conversation_simple_info` ADD COLUMN `isFlagged` INTEGER NOT NULL DEFAULT 0");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `conversation` ADD COLUMN `isFlagged` INTEGER NOT NULL DEFAULT 0");
    }
}

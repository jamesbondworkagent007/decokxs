package o;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.sIv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44249sIv extends Migration {
    public C44249sIv() {
        super(31, 32);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `message` ADD COLUMN `senderAvatar` TEXT DEFAULT NULL");
    }
}

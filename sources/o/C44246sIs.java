package o;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.sIs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44246sIs extends Migration {
    public C44246sIs() {
        super(32, 33);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `contacts` ADD COLUMN `customNote` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `groupVoiceCallConfig` TEXT DEFAULT NULL");
    }
}

package o;

import androidx.room.migration.Migration;
import androidx.sqlite.SQLite;

/* JADX INFO: renamed from: o.sIu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44248sIu extends Migration {
    public C44248sIu() {
        super(26, 27);
    }

    @Override // androidx.room.migration.Migration
    public void migrate(@androidx.annotation.NonNull androidx.sqlite.SQLiteConnection sQLiteConnection) {
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `campaign_activityId` INTEGER DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `campaign_urlSlug` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `campaign_urlSubPath` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `campaign_campaignStartTime` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `campaign_campaignEndTime` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `campaign_registrationStartTime` TEXT DEFAULT NULL");
        SQLite.execSQL(sQLiteConnection, "ALTER TABLE `in_house_im_group` ADD COLUMN `campaign_minAppVersion` TEXT DEFAULT NULL");
    }
}

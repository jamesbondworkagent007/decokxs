package com.okinc.localization.report.db;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43246rlf;
import o.InterfaceC38295pTm;

/* JADX INFO: loaded from: classes9.dex */
public abstract class UsedSourceDataBase extends RoomDatabase {
    public static volatile UsedSourceDataBase OLrzqt;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final ActionBar copydefault = new ActionBar();
    public static final Activity KWHzl = new Activity();

    public abstract InterfaceC38295pTm EZpvd();

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.localization.report.db.UsedSourceDataBase.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final UsedSourceDataBase EZpvd() {
            UsedSourceDataBase usedSourceDataBase = UsedSourceDataBase.OLrzqt;
            if (usedSourceDataBase == null) {
                synchronized (this) {
                    usedSourceDataBase = (UsedSourceDataBase) Room.databaseBuilder(C43246rlf.OLrzqt.valueOf(), UsedSourceDataBase.class, "used_res.db").addMigrations(UsedSourceDataBase.copydefault, UsedSourceDataBase.KWHzl).build();
                    StateListAnimator stateListAnimator = UsedSourceDataBase.Companion;
                    UsedSourceDataBase.OLrzqt = usedSourceDataBase;
                }
            }
            return usedSourceDataBase;
        }
    }

    public static final class ActionBar extends Migration {
        public ActionBar() {
            super(1, 2);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE used_source ADD COLUMN `ph_key_content` TEXT");
            supportSQLiteDatabase.execSQL("ALTER TABLE used_source ADD COLUMN `key_language` TEXT");
        }
    }

    public static final class Activity extends Migration {
        public Activity() {
            super(2, 3);
        }

        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL("ALTER TABLE used_source ADD COLUMN `is_startup_key` INTEGER NOT NULL DEFAULT 0");
        }
    }
}

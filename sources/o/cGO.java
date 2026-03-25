package o;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class cGO extends Migration {
    public static final ActionBar Companion = new ActionBar(null);

    public abstract void KWHzl(@NotNull SupportSQLiteDatabase supportSQLiteDatabase);

    public cGO(int i, int i2) {
        super(i, i2);
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.cGO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(@NotNull SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        java.lang.String path = supportSQLiteDatabase.getPath();
        java.lang.String strDbNXlk = path != null ? yFL.DbNXlk(new java.io.File(path)) : null;
        pUU.KWHzl("OKWMigration", "db name is " + strDbNXlk + ", version is " + supportSQLiteDatabase.getVersion());
        supportSQLiteDatabase.beginTransactionWithListener(new Activity());
        try {
            KWHzl(supportSQLiteDatabase);
            supportSQLiteDatabase.setTransactionSuccessful();
            pUU.KWHzl("OKWMigration", "migrate from " + this.startVersion + " to " + this.endVersion + " successfully");
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final class Activity implements android.database.sqlite.SQLiteTransactionListener {
        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onBegin() {
            pUU.KWHzl("OKWMigration", "begin executing transaction");
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onCommit() {
            pUU.KWHzl("OKWMigration", "transaction will be committed");
        }

        @Override // android.database.sqlite.SQLiteTransactionListener
        public void onRollback() {
            pUU.copydefault("OKWMigration", "transaction will be rolled back");
        }
    }
}

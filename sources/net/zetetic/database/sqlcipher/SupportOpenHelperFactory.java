package net.zetetic.database.sqlcipher;

import androidx.annotation.NonNull;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

/* JADX INFO: loaded from: classes13.dex */
public class SupportOpenHelperFactory implements SupportSQLiteOpenHelper.Factory {
    public final boolean AEQbTJ;
    public final byte[] EZpvd;
    public final SQLiteDatabaseHook KWHzl;
    public final int copydefault;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(bArr, sQLiteDatabaseHook, z, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.EZpvd = bArr;
        this.KWHzl = sQLiteDatabaseHook;
        this.AEQbTJ = z;
        this.copydefault = i;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        int i = this.copydefault;
        if (i == -1) {
            return new SupportHelper(configuration, this.EZpvd, this.KWHzl, this.AEQbTJ);
        }
        return new SupportHelper(configuration, this.EZpvd, this.KWHzl, this.AEQbTJ, i);
    }
}

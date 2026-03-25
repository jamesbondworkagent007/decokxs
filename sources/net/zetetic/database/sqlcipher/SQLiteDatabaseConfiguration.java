package net.zetetic.database.sqlcipher;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteDatabaseConfiguration {
    public static final Pattern OLrzqt = Pattern.compile("[\\w\\.\\-]+@[\\w\\.\\-]+");
    public final String AEQbTJ;
    public final String AYXKKw;
    public int AhwBna;
    public boolean EZpvd;
    public final ArrayList<SQLiteCustomFunction> KWHzl;
    public SQLiteDatabaseHook copydefault;
    public byte[] djBIcL;
    public int gEmmrt;
    public Locale valueOf;

    public SQLiteDatabaseConfiguration(String str, int i) {
        this(str, i, null, null);
    }

    public SQLiteDatabaseConfiguration(String str, int i, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this.KWHzl = new ArrayList<>();
        if (str == null) {
            throw new IllegalArgumentException("path must not be null.");
        }
        this.AYXKKw = str;
        this.AEQbTJ = copydefault(str);
        this.gEmmrt = i;
        this.djBIcL = bArr;
        this.copydefault = sQLiteDatabaseHook;
        this.AhwBna = 25;
        this.valueOf = Locale.getDefault();
    }

    public SQLiteDatabaseConfiguration(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.KWHzl = new ArrayList<>();
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        }
        this.AYXKKw = sQLiteDatabaseConfiguration.AYXKKw;
        this.AEQbTJ = sQLiteDatabaseConfiguration.AEQbTJ;
        copydefault(sQLiteDatabaseConfiguration);
    }

    public void copydefault(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("other must not be null.");
        }
        if (!this.AYXKKw.equals(sQLiteDatabaseConfiguration.AYXKKw)) {
            throw new IllegalArgumentException("other configuration must refer to the same database.");
        }
        this.gEmmrt = sQLiteDatabaseConfiguration.gEmmrt;
        this.AhwBna = sQLiteDatabaseConfiguration.AhwBna;
        this.valueOf = sQLiteDatabaseConfiguration.valueOf;
        this.EZpvd = sQLiteDatabaseConfiguration.EZpvd;
        this.djBIcL = sQLiteDatabaseConfiguration.djBIcL;
        this.copydefault = sQLiteDatabaseConfiguration.copydefault;
        this.KWHzl.clear();
        this.KWHzl.addAll(sQLiteDatabaseConfiguration.KWHzl);
    }

    public boolean OLrzqt() {
        return this.AYXKKw.equalsIgnoreCase(":memory:");
    }

    public static String copydefault(String str) {
        int iIndexOf = str.indexOf(63);
        if (iIndexOf >= 0) {
            str = (String) str.subSequence(0, iIndexOf);
        }
        return str.indexOf(64) == -1 ? str : OLrzqt.matcher(str).replaceAll("XX@YY");
    }
}

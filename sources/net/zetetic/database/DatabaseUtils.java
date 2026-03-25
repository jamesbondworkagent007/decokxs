package net.zetetic.database;

import java.text.Collator;
import java.util.Locale;
import net.zetetic.database.sqlcipher.SQLiteDatabase;
import net.zetetic.database.sqlcipher.SQLiteStatement;

/* JADX INFO: loaded from: classes13.dex */
public class DatabaseUtils {
    public static final char[] KWHzl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static Collator AEQbTJ = null;

    public static int AEQbTJ(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) ? 1 : 3;
    }

    public static int OLrzqt(int i, int i2) {
        return Math.max(i - (i2 / 3), 0);
    }

    public static long KWHzl(SQLiteDatabase sQLiteDatabase, String str, String[] strArr) {
        SQLiteStatement sQLiteStatementCompileStatement = sQLiteDatabase.compileStatement(str);
        try {
            return copydefault(sQLiteStatementCompileStatement, strArr);
        } finally {
            sQLiteStatementCompileStatement.close();
        }
    }

    public static long copydefault(SQLiteStatement sQLiteStatement, String[] strArr) {
        sQLiteStatement.copydefault(strArr);
        return sQLiteStatement.simpleQueryForLong();
    }

    /* JADX INFO: loaded from: classes17.dex */
    @Deprecated
    public static class InsertHelper {
        public final String AhwBna;
        public final SQLiteDatabase EZpvd;
        public String AEQbTJ = null;
        public SQLiteStatement copydefault = null;
        public SQLiteStatement OLrzqt = null;
        public SQLiteStatement KWHzl = null;

        public InsertHelper(SQLiteDatabase sQLiteDatabase, String str) {
            this.EZpvd = sQLiteDatabase;
            this.AhwBna = str;
        }
    }

    public static int EZpvd(String str) {
        String strTrim = str.trim();
        if (strTrim.length() < 3) {
            return 99;
        }
        String upperCase = strTrim.substring(0, 3).toUpperCase(Locale.ROOT);
        if (upperCase.equals("SEL")) {
            return 1;
        }
        if (upperCase.equals("INS") || upperCase.equals("UPD") || upperCase.equals("REP") || upperCase.equals("DEL")) {
            return 2;
        }
        if (upperCase.equals("ATT")) {
            return 3;
        }
        if (upperCase.equals("COM") || upperCase.equals("END")) {
            return 5;
        }
        if (upperCase.equals("ROL")) {
            return 6;
        }
        if (upperCase.equals("BEG")) {
            return 4;
        }
        if (upperCase.equals("PRA")) {
            return 7;
        }
        if (upperCase.equals("CRE") || upperCase.equals("DRO") || upperCase.equals("ALT")) {
            return 8;
        }
        return (upperCase.equals("ANA") || upperCase.equals("DET")) ? 9 : 99;
    }
}

package net.zetetic.database.sqlcipher;

import net.zetetic.database.sqlcipher.SQLiteDatabase;

/* JADX INFO: loaded from: classes13.dex */
public final class SQLiteCustomFunction {
    public final SQLiteDatabase.CustomFunction AEQbTJ;
    public final String name;
    public final int numArgs;

    public SQLiteCustomFunction(String str, int i, SQLiteDatabase.CustomFunction customFunction) {
        if (str == null) {
            throw new IllegalArgumentException("name must not be null.");
        }
        this.name = str;
        this.numArgs = i;
        this.AEQbTJ = customFunction;
    }

    private void dispatchCallback(String[] strArr) {
        this.AEQbTJ.OLrzqt(strArr);
    }
}

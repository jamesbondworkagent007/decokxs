package com.bytedance.applog.aggregation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MetricsSQLiteOpenHelper extends SQLiteOpenHelper {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetricsSQLiteOpenHelper(@NotNull Context context, @NotNull String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.EZpvd((Object) context, "");
        Intrinsics.EZpvd((Object) str, "");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) {
        Intrinsics.EZpvd((Object) sQLiteDatabase, "");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS metrics (_id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT NOT NULL, group_id TEXT NOT NULL, agg_types INTEGER NOT NULL, start_time INTEGER NOT NULL, end_time INTEGER NOT NULL, interval TEXT, params TEXT, count INTEGER NOT NULL, sum REAL NOT NULL, value_array TEXT);");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Intrinsics.EZpvd((Object) sQLiteDatabase, "");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS metrics");
        onCreate(sQLiteDatabase);
    }
}

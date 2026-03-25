package com.reown.android.internal.common.di;

import kotlin.jvm.internal.Intrinsics;
import o.C56524yIo;
import o.C59930zsL;
import o.C60060zuj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class DatabaseConfigKt {
    public static final void deleteDatabase(@NotNull C60060zuj c60060zuj, @NotNull String str) {
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        Intrinsics.checkNotNullParameter(str, "");
        C59930zsL.AEQbTJ(c60060zuj).deleteDatabase(str);
    }

    public static final void deleteDatabases(@NotNull C60060zuj c60060zuj) {
        Intrinsics.checkNotNullParameter(c60060zuj, "");
        String[] strArrDatabaseList = C59930zsL.AEQbTJ(c60060zuj).databaseList();
        Intrinsics.checkNotNullExpressionValue(strArrDatabaseList, "");
        for (String str : strArrDatabaseList) {
            if (((DatabaseConfig) c60060zuj.AEQbTJ(C56524yIo.AEQbTJ(DatabaseConfig.class), null, null)).getDbNames().contains(str)) {
                Intrinsics.copydefault((Object) str);
                deleteDatabase(c60060zuj, str);
            }
        }
    }
}

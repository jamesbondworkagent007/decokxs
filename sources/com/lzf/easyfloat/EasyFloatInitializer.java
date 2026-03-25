package com.lzf.easyfloat;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import o.C8127awq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class EasyFloatInitializer extends ContentProvider {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.ContentProvider
    public int delete(@NotNull Uri uri, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "");
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.ContentProvider
    public String getType(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.ContentProvider
    public Uri insert(@NotNull Uri uri, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.ContentProvider
    public Cursor query(@NotNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Intrinsics.checkNotNullParameter(uri, "");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.ContentProvider
    public int update(@NotNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(uri, "");
        return 0;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        C8127awq c8127awq = C8127awq.copydefault;
        Context context = getContext();
        Intrinsics.copydefault(context);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Application");
        }
        c8127awq.EZpvd((Application) applicationContext);
        return true;
    }
}

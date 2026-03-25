package o;

import android.os.Build;
import android.provider.MediaStore;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sFq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44163sFq {
    public static final C44163sFq OLrzqt = new C44163sFq();

    private C44163sFq() {
    }

    public final java.io.File AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new java.io.File(str);
    }

    public final boolean EZpvd(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return Intrinsics.EZpvd((java.lang.Object) "com.android.externalstorage.documents", (java.lang.Object) uri.getAuthority());
    }

    public final boolean copydefault(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return Intrinsics.EZpvd((java.lang.Object) "com.android.providers.downloads.documents", (java.lang.Object) uri.getAuthority());
    }

    public final boolean KWHzl(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return Intrinsics.EZpvd((java.lang.Object) "com.android.providers.media.documents", (java.lang.Object) uri.getAuthority());
    }

    public final boolean OLrzqt(@NotNull android.net.Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        return Intrinsics.EZpvd((java.lang.Object) "com.google.android.apps.photos.content", (java.lang.Object) uri.getAuthority());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a6 A[PHI: r12
  0x00a6: PHI (r12v8 android.database.Cursor) = (r12v7 android.database.Cursor), (r12v9 android.database.Cursor) binds: [B:31:0x00a4, B:24:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(@NotNull android.content.Context context, @NotNull android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) throws java.lang.Throwable {
        java.lang.IllegalArgumentException e;
        android.database.Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        java.lang.String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        java.lang.String absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        Intrinsics.copydefault((java.lang.Object) absolutePath);
        android.database.Cursor cursor = null;
        if (!C59449zhJ.startsWith$default(path, absolutePath, false, 2, null)) {
            java.lang.String str2 = java.io.File.separator;
            Intrinsics.checkNotNullExpressionValue(str2, "");
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) path, str2, 1, false, 4, (java.lang.Object) null);
            if (iIndexOf$default == -1) {
                path = "";
            } else {
                java.lang.String strSubstring = path.substring(iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                path = absolutePath + strSubstring;
            }
        }
        if (new java.io.File(path).exists()) {
            return path;
        }
        try {
            cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
                        }
                    } catch (java.lang.Throwable th) {
                        cursor = cursorQuery;
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (java.lang.IllegalArgumentException e2) {
                    e = e2;
                    C56529yIt c56529yIt = C56529yIt.KWHzl;
                    Intrinsics.checkNotNullExpressionValue(java.lang.String.format(java.util.Locale.getDefault(), "getDataColumn: _data - [%s]", java.util.Arrays.copyOf(new java.lang.Object[]{e.getMessage()}, 1)), "");
                    if (cursorQuery != null) {
                    }
                }
            }
        } catch (java.lang.IllegalArgumentException e3) {
            e = e3;
            cursorQuery = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [172=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String KWHzl(@NotNull android.content.Context context, @NotNull android.net.Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (!z && Build.VERSION.SDK_INT >= 29) {
            return OLrzqt(context, uri);
        }
        int i = Build.VERSION.SDK_INT;
        if (!android.provider.DocumentsContract.isDocumentUri(context, uri)) {
            if (C59449zhJ.gEmmrt("content", uri.getScheme(), true)) {
                return OLrzqt(uri) ? uri.getLastPathSegment() : copydefault(context, uri, null, null);
            }
            if (C59449zhJ.gEmmrt("file", uri.getScheme(), true)) {
                return uri.getPath();
            }
        } else if (EZpvd(uri)) {
            java.lang.String documentId = android.provider.DocumentsContract.getDocumentId(uri);
            Intrinsics.copydefault((java.lang.Object) documentId);
            java.lang.String[] strArr = (java.lang.String[]) new Regex(":").split(documentId, 0).toArray(new java.lang.String[0]);
            java.lang.String str = strArr[0];
            if (C59449zhJ.gEmmrt("primary", str, true)) {
                if (!z || i < 29) {
                    return android.os.Environment.getExternalStorageDirectory() + "/" + strArr[1];
                }
                return context.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES) + "/" + strArr[1];
            }
            if (C59449zhJ.gEmmrt("home", str, true) && !z) {
                return android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOCUMENTS) + "/" + strArr[1];
            }
        } else if (copydefault(uri)) {
            try {
                java.lang.String documentId2 = android.provider.DocumentsContract.getDocumentId(uri);
                android.net.Uri uri2 = android.net.Uri.parse("content://downloads/public_downloads");
                java.lang.Long lValueOf = java.lang.Long.valueOf(documentId2);
                Intrinsics.checkNotNullExpressionValue(lValueOf, "");
                android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(uri2, lValueOf.longValue());
                Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "");
                return copydefault(context, uriWithAppendedId, null, null);
            } catch (java.lang.Exception unused) {
            }
        } else if (KWHzl(uri)) {
            java.lang.String documentId3 = android.provider.DocumentsContract.getDocumentId(uri);
            Intrinsics.copydefault((java.lang.Object) documentId3);
            java.lang.String[] strArr2 = (java.lang.String[]) new Regex(":").split(documentId3, 0).toArray(new java.lang.String[0]);
            java.lang.String str2 = strArr2[0];
            switch (str2.hashCode()) {
                case 93166550:
                    if (str2.equals(MimeTypes.BASE_TYPE_AUDIO)) {
                        uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    break;
                case 100313435:
                    if (str2.equals(TtmlNode.TAG_IMAGE)) {
                        uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    }
                    break;
                case 112202875:
                    if (str2.equals(MimeTypes.BASE_TYPE_VIDEO)) {
                        uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    }
                    break;
                case 861720859:
                    if (str2.equals("document")) {
                        uri = MediaStore.Files.getContentUri("external");
                    }
                    break;
            }
            return copydefault(context, uri, "_id=?", new java.lang.String[]{strArr2[1]});
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(android.content.Context context, android.net.Uri uri) {
        java.io.File file;
        java.io.File file2;
        java.lang.String string;
        java.io.InputStream inputStreamOpenInputStream;
        if (Intrinsics.EZpvd((java.lang.Object) uri.getScheme(), (java.lang.Object) "file")) {
            file = new java.io.File(uri.getPath());
        } else if (Intrinsics.EZpvd((java.lang.Object) uri.getScheme(), (java.lang.Object) "content")) {
            android.content.ContentResolver contentResolver = context.getContentResolver();
            android.database.Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
            Intrinsics.copydefault(cursorQuery);
            if (cursorQuery.moveToFirst()) {
                try {
                    string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                    inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                } catch (java.io.IOException e) {
                    e = e;
                    file2 = null;
                }
                if (inputStreamOpenInputStream != null) {
                    java.io.File externalCacheDir = context.getExternalCacheDir();
                    Intrinsics.copydefault(externalCacheDir);
                    file2 = new java.io.File(externalCacheDir.getAbsolutePath(), string);
                    if (file2.exists()) {
                        file2.delete();
                    }
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                    android.os.FileUtils.copy(inputStreamOpenInputStream, fileOutputStream);
                    try {
                        fileOutputStream.close();
                        inputStreamOpenInputStream.close();
                    } catch (java.io.IOException e2) {
                        e = e2;
                        android.util.Log.getStackTraceString(e);
                    }
                    file = file2;
                }
                file = null;
            } else {
                file = null;
            }
        }
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }
}

package o;

import android.os.Build;
import android.provider.MediaStore;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.stR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45616stR {
    public static final C45616stR OLrzqt = new C45616stR();

    private C45616stR() {
    }

    public final boolean AEQbTJ(android.net.Uri uri) {
        return Intrinsics.EZpvd((java.lang.Object) "com.android.externalstorage.documents", (java.lang.Object) uri.getAuthority());
    }

    public final boolean OLrzqt(android.net.Uri uri) {
        return Intrinsics.EZpvd((java.lang.Object) "com.android.providers.downloads.documents", (java.lang.Object) uri.getAuthority());
    }

    public final boolean KWHzl(android.net.Uri uri) {
        return Intrinsics.EZpvd((java.lang.Object) "com.android.providers.media.documents", (java.lang.Object) uri.getAuthority());
    }

    public final boolean copydefault(android.net.Uri uri) {
        return Intrinsics.EZpvd((java.lang.Object) "com.google.android.apps.photos.content", (java.lang.Object) uri.getAuthority());
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:26:0x007e */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a0 A[PHI: r12
  0x00a0: PHI (r12v7 android.database.Cursor) = (r12v6 android.database.Cursor), (r12v8 android.database.Cursor) binds: [B:31:0x009e, B:24:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) throws java.lang.Throwable {
        java.lang.IllegalArgumentException e;
        android.database.Cursor cursorQuery;
        java.lang.String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        java.lang.String absolutePath = android.os.Environment.getExternalStorageDirectory().getAbsolutePath();
        Intrinsics.copydefault((java.lang.Object) absolutePath);
        ?? r10 = 0;
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
            try {
                cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, str, strArr, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                            cursorQuery.close();
                            return string;
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
            } catch (java.lang.Throwable th) {
                th = th;
                if (r10 != 0) {
                }
                throw th;
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (java.lang.Throwable th2) {
            r10 = context;
            th = th2;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
    }

    public final java.lang.String AEQbTJ(@NotNull android.content.Context context, @NotNull android.net.Uri uri, boolean z) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(uri, "");
        if (!z && Build.VERSION.SDK_INT >= 29) {
            return KWHzl(context, uri);
        }
        if (android.provider.DocumentsContract.isDocumentUri(context, uri)) {
            return copydefault(context, uri, z);
        }
        if (C59449zhJ.gEmmrt("content", uri.getScheme(), true)) {
            if (copydefault(uri)) {
                return uri.getLastPathSegment();
            }
            return copydefault(context, uri, null, null);
        }
        if (C59449zhJ.gEmmrt("file", uri.getScheme(), true)) {
            return uri.getPath();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(android.content.Context context, android.net.Uri uri) {
        java.io.File file;
        java.lang.String path;
        java.io.File externalCacheDir;
        java.lang.String absolutePath;
        java.lang.String scheme = uri.getScheme();
        if (scheme == null) {
            file = null;
        } else {
            int iHashCode = scheme.hashCode();
            if (iHashCode != 3143036) {
                if (iHashCode == 951530617 && scheme.equals("content")) {
                    android.content.ContentResolver contentResolver = context.getContentResolver();
                    android.database.Cursor cursorQuery = contentResolver.query(uri, null, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToFirst()) {
                        java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndex("_display_name"));
                        try {
                            try {
                                java.io.InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                                if (inputStreamOpenInputStream == null || (externalCacheDir = context.getExternalCacheDir()) == null || (absolutePath = externalCacheDir.getAbsolutePath()) == null) {
                                    file = null;
                                } else {
                                    file = new java.io.File(absolutePath, string);
                                    if (file.exists()) {
                                        file.delete();
                                    }
                                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
                                    android.os.FileUtils.copy(inputStreamOpenInputStream, fileOutputStream);
                                    try {
                                        fileOutputStream.close();
                                        inputStreamOpenInputStream.close();
                                        Unit unit = Unit.INSTANCE;
                                    } catch (java.io.IOException e) {
                                        e = e;
                                        android.util.Log.getStackTraceString(e);
                                    }
                                }
                            } finally {
                                cursorQuery.close();
                            }
                        } catch (java.io.IOException e2) {
                            e = e2;
                            file = null;
                        }
                    }
                }
            } else if (scheme.equals("file") && (path = uri.getPath()) != null) {
                file = new java.io.File(path);
            }
        }
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [247=4] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String copydefault(android.content.Context context, android.net.Uri uri, boolean z) {
        java.lang.Object objM7377constructorimpl;
        if (AEQbTJ(uri)) {
            java.lang.String documentId = android.provider.DocumentsContract.getDocumentId(uri);
            Intrinsics.copydefault((java.lang.Object) documentId);
            java.lang.String[] strArr = (java.lang.String[]) new Regex(":").split(documentId, 0).toArray(new java.lang.String[0]);
            java.lang.String str = strArr[0];
            if (!C59449zhJ.gEmmrt("primary", str, true)) {
                if (!C59449zhJ.gEmmrt("home", str, true) || z) {
                    return null;
                }
                return android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOCUMENTS) + "/" + strArr[1];
            }
            if (!z || Build.VERSION.SDK_INT < 29) {
                return android.os.Environment.getExternalStorageDirectory() + "/" + strArr[1];
            }
            return context.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES) + "/" + strArr[1];
        }
        if (OLrzqt(uri)) {
            try {
                Result.Application application = Result.Companion;
                java.lang.String documentId2 = android.provider.DocumentsContract.getDocumentId(uri);
                android.net.Uri uri2 = android.net.Uri.parse("content://downloads/public_downloads");
                java.lang.Long lValueOf = java.lang.Long.valueOf(documentId2);
                Intrinsics.checkNotNullExpressionValue(lValueOf, "");
                android.net.Uri uriWithAppendedId = android.content.ContentUris.withAppendedId(uri2, lValueOf.longValue());
                Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "");
                objM7377constructorimpl = Result.m7377constructorimpl(copydefault(context, uriWithAppendedId, null, null));
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
            return (java.lang.String) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
        }
        if (!KWHzl(uri)) {
            return null;
        }
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
                if (str2.equals("document") && Build.VERSION.SDK_INT >= 29) {
                    uri = MediaStore.Files.getContentUri("external");
                }
                break;
        }
        return copydefault(context, uri, "_id=?", new java.lang.String[]{strArr2[1]});
    }
}

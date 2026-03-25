package o;

import android.provider.MediaStore;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;

/* JADX INFO: renamed from: o.mzp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C33618mzp {
    public static java.lang.String copydefault(android.content.Context context, android.net.Uri uri) {
        android.net.Uri uri2 = null;
        if (android.provider.DocumentsContract.isDocumentUri(context, uri)) {
            if (AEQbTJ(uri)) {
                java.lang.String[] strArrSplit = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(strArrSplit[0])) {
                    return C33478mxH.KWHzl.copydefault(context) + "/" + strArrSplit[1];
                }
            } else {
                if (copydefault(uri)) {
                    return EZpvd(context, android.content.ContentUris.withAppendedId(android.net.Uri.parse("content://downloads/public_downloads"), java.lang.Long.valueOf(android.provider.DocumentsContract.getDocumentId(uri)).longValue()), null, null);
                }
                if (KWHzl(uri)) {
                    java.lang.String[] strArrSplit2 = android.provider.DocumentsContract.getDocumentId(uri).split(":");
                    java.lang.String str = strArrSplit2[0];
                    if (TtmlNode.TAG_IMAGE.equals(str)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if (MimeTypes.BASE_TYPE_VIDEO.equals(str)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if (MimeTypes.BASE_TYPE_AUDIO.equals(str)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return EZpvd(context, uri2, "_id=?", new java.lang.String[]{strArrSplit2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (EZpvd(uri)) {
                    return uri.getLastPathSegment();
                }
                return EZpvd(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static java.lang.String EZpvd(android.content.Context context, android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) throws java.lang.Throwable {
        java.lang.Throwable th;
        android.database.Cursor cursor = null;
        try {
            android.database.Cursor cursorQuery = context.getContentResolver().query(uri, new java.lang.String[]{"_data"}, str, strArr, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        java.lang.String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                        cursorQuery.close();
                        return string;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                        throw th;
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    public static boolean AEQbTJ(android.net.Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean copydefault(android.net.Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean KWHzl(android.net.Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean EZpvd(android.net.Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }
}

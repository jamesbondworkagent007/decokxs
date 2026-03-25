package o;

import com.immomo.mls.fun.constants.FileInfo;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: renamed from: o.sRc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C44473sRc {
    public static boolean copydefault(android.net.Uri uri) {
        return uri != null && "file".equals(uri.getScheme()) && uri.toString().length() > 7;
    }

    public static boolean OLrzqt(android.net.Uri uri) {
        return uri != null && "content".equals(uri.getScheme());
    }

    public static C44472sRb EZpvd(android.content.Context context, android.net.Uri uri) {
        if (OLrzqt(uri)) {
            return OLrzqt(context, uri);
        }
        if (copydefault(uri)) {
            return EZpvd(uri);
        }
        return null;
    }

    public static C44472sRb EZpvd(android.net.Uri uri) {
        if (copydefault(uri)) {
            java.io.File file = new java.io.File(uri.toString().substring(7));
            if (!file.exists()) {
                return null;
            }
            C44472sRb c44472sRb = new C44472sRb();
            java.lang.String name = file.getName();
            c44472sRb.EZpvd(file.length());
            c44472sRb.EZpvd(name);
            int iLastIndexOf = name.lastIndexOf(JwtUtilsKt.JWT_DELIMITER);
            if (iLastIndexOf > 0) {
                c44472sRb.copydefault(file.getName().substring(iLastIndexOf + 1));
            }
            return c44472sRb;
        }
        C43296rmc.KWHzl("FileUtils", "getDocumentByFile uri is not file");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [99=4] */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0086 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C44472sRb OLrzqt(android.content.Context context, android.net.Uri uri) throws java.lang.Throwable {
        java.lang.Exception e;
        android.database.Cursor cursorQuery;
        C44472sRb c44472sRb;
        ?? r2 = 0;
        if (!OLrzqt(uri)) {
            C43296rmc.KWHzl("FileUtils", "getDocumentByContent uri is not content");
            return null;
        }
        java.lang.String[] strArr = {"_display_name", FileInfo.FileSize, "mime_type"};
        try {
            try {
                c44472sRb = new C44472sRb();
                cursorQuery = context.getContentResolver().query(uri, strArr, null, null, null);
            } catch (java.lang.Exception e2) {
                e = e2;
                cursorQuery = null;
            } catch (java.lang.Throwable th) {
                th = th;
                if (r2 != 0) {
                }
                throw th;
            }
            try {
                if (cursorQuery == null) {
                    C43296rmc.KWHzl("FileUtils", "getFileInfoByContent cursor is null");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                java.lang.String string = cursorQuery.getString(0);
                long j = cursorQuery.getLong(1);
                c44472sRb.EZpvd(string);
                c44472sRb.EZpvd(j);
                if (!android.text.TextUtils.isEmpty(string)) {
                    int iLastIndexOf = string.lastIndexOf(JwtUtilsKt.JWT_DELIMITER);
                    if (iLastIndexOf > 0) {
                        c44472sRb.copydefault(string.substring(iLastIndexOf + 1));
                    }
                    if (cursorQuery.moveToNext()) {
                        C43296rmc.KWHzl("FileUtils", "uri is error,cursor has second value,uri is" + uri);
                    }
                }
                C43296rmc.KWHzl("FileUtils", "getFileInfoByContent getName is empty");
                cursorQuery.close();
                return c44472sRb;
            } catch (java.lang.Exception e3) {
                e = e3;
                C43296rmc.copydefault("FileUtils", "getDocumentByContent is error", e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (java.lang.Throwable th2) {
            r2 = context;
            th = th2;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
    }
}

package o;

import android.graphics.BitmapFactory;
import android.os.Build;
import android.provider.MediaStore;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.exoplayer2.util.MimeTypes;
import com.reown.foundation.util.jwt.JwtUtilsKt;

/* JADX INFO: renamed from: o.ozE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C37720ozE {
    public static boolean KWHzl(android.content.Context context) {
        return Build.VERSION.SDK_INT >= 29 && context.getApplicationInfo().targetSdkVersion >= 29;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:41:0x009b */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:53:0x00b1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:58:0x00bc */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x004b */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean OLrzqt(android.content.Context context, java.io.File file, java.lang.String str) throws java.lang.Throwable {
        ?? r7;
        boolean z = false;
        if (file == null || !file.exists()) {
            pUU.copydefault("LibStorageUtils", "file is not exist");
            return false;
        }
        if (!KWHzl(context)) {
            ?? externalStoragePublicDirectory = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_MOVIES);
            if (externalStoragePublicDirectory != 0 && !externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                pUU.copydefault("LibStorageUtils", "mkdir fail,dir path is " + externalStoragePublicDirectory.getAbsolutePath());
                return false;
            }
            if (externalStoragePublicDirectory == 0) {
                pUU.copydefault("LibStorageUtils", "dirFile is null");
                return false;
            }
            ?? file2 = 0;
            file2 = 0;
            file2 = 0;
            ?? r4 = 0;
            try {
                try {
                    if (android.text.TextUtils.isEmpty(str)) {
                        str = file.getName();
                    }
                    java.lang.String str2 = externalStoragePublicDirectory.getPath() + "/" + str;
                    externalStoragePublicDirectory = new java.io.FileInputStream(file);
                    try {
                        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(str2);
                        try {
                            OLrzqt((java.io.FileInputStream) externalStoragePublicDirectory, fileOutputStream);
                            file2 = new java.io.File(str2);
                            OLrzqt((java.io.File) file2, context);
                            try {
                                externalStoragePublicDirectory.close();
                            } catch (java.io.IOException e) {
                                pUU.AEQbTJ("LibStorageUtils", "copyVideoToPublicDir: ", e);
                            }
                            try {
                                fileOutputStream.close();
                            } catch (java.io.IOException e2) {
                                pUU.AEQbTJ("LibStorageUtils", "copyVideoToPublicDir: ", e2);
                            }
                            z = true;
                        } catch (java.io.FileNotFoundException e3) {
                            e = e3;
                            file2 = fileOutputStream;
                            pUU.AEQbTJ("LibStorageUtils", "copyVideoToPublicDir file not found", e);
                            if (externalStoragePublicDirectory != 0) {
                                try {
                                    externalStoragePublicDirectory.close();
                                } catch (java.io.IOException e4) {
                                    pUU.AEQbTJ("LibStorageUtils", "copyVideoToPublicDir: ", e4);
                                }
                            }
                            if (file2 != 0) {
                                try {
                                    file2.close();
                                } catch (java.io.IOException e5) {
                                    pUU.AEQbTJ("LibStorageUtils", "copyVideoToPublicDir: ", e5);
                                }
                            }
                        } catch (java.lang.Throwable th) {
                            th = th;
                            file2 = fileOutputStream;
                            r7 = file2;
                            r4 = externalStoragePublicDirectory;
                            if (r4 != 0) {
                            }
                            if (r7 == 0) {
                            }
                        }
                    } catch (java.io.FileNotFoundException e6) {
                        e = e6;
                    }
                } catch (java.io.FileNotFoundException e7) {
                    e = e7;
                    externalStoragePublicDirectory = 0;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    r7 = 0;
                    if (r4 != 0) {
                        try {
                            r4.close();
                        } catch (java.io.IOException e8) {
                            pUU.AEQbTJ("LibStorageUtils", "copyVideoToPublicDir: ", e8);
                        }
                    }
                    if (r7 == 0) {
                        try {
                            r7.close();
                            throw th;
                        } catch (java.io.IOException e9) {
                            pUU.AEQbTJ("LibStorageUtils", "copyVideoToPublicDir: ", e9);
                            throw th;
                        }
                    }
                    throw th;
                }
                return z;
            } catch (java.lang.Throwable th3) {
                th = th3;
            }
        } else {
            return AEQbTJ(context, file, str);
        }
    }

    public static void OLrzqt(java.io.File file, android.content.Context context) {
        if (file == null || !file.exists()) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(android.net.Uri.fromFile(file));
        context.sendBroadcast(intent);
    }

    public static boolean AEQbTJ(android.content.Context context, java.io.File file, java.lang.String str) throws java.lang.Throwable {
        boolean z = false;
        if (file.exists() && file.isFile() && context != null) {
            if (android.text.TextUtils.isEmpty(str)) {
                str = file.getName();
            }
            android.net.Uri uriCopydefault = copydefault(context, str);
            java.lang.String path = uriCopydefault != null ? uriCopydefault.getPath() : "";
            try {
                KWHzl(file, context.getContentResolver().openFileDescriptor(uriCopydefault, "w"));
                z = true;
            } catch (java.io.FileNotFoundException unused) {
                pUU.copydefault("LibStorageUtils", "copyVideoToPublicDir uri is not Found, uri is" + uriCopydefault);
            }
            OLrzqt(new java.io.File(path), context);
        } else {
            pUU.copydefault("LibStorageUtils", "file is not Found or context is null ");
        }
        return z;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:43:0x00da */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:60:0x00fd */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:99:0x0057 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0102 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean EZpvd(android.content.Context context, java.io.File file, java.lang.String str) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        if (file.exists() && file.isFile() && context != null) {
            if (!KWHzl(context)) {
                ?? externalStoragePublicDirectory = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_PICTURES);
                if (externalStoragePublicDirectory != 0 && !externalStoragePublicDirectory.exists() && !externalStoragePublicDirectory.mkdirs()) {
                    pUU.copydefault("LibStorageUtils", "mkdir fail,dir path is " + externalStoragePublicDirectory.getAbsolutePath());
                    return false;
                }
                if (externalStoragePublicDirectory == 0) {
                    pUU.copydefault("LibStorageUtils", "dirFile is null");
                    return false;
                }
                java.io.FileOutputStream fileOutputStream2 = null;
                fileOutputStream2 = null;
                fileOutputStream2 = null;
                ?? r9 = 0;
                try {
                    try {
                        if (android.text.TextUtils.isEmpty(str)) {
                            java.lang.String strOLrzqt = OLrzqt(file);
                            int iLastIndexOf = strOLrzqt.lastIndexOf(47);
                            java.lang.String str2 = "Okex_Image_" + java.lang.System.currentTimeMillis();
                            if (iLastIndexOf != -1) {
                                str = str2 + JwtUtilsKt.JWT_DELIMITER + strOLrzqt.substring(iLastIndexOf + 1);
                            } else {
                                str = str2;
                            }
                        }
                        java.lang.String str3 = externalStoragePublicDirectory.getPath() + "/" + str;
                        externalStoragePublicDirectory = new java.io.FileInputStream(file);
                        try {
                            java.io.FileOutputStream fileOutputStream3 = new java.io.FileOutputStream(str3);
                            try {
                                OLrzqt((java.io.FileInputStream) externalStoragePublicDirectory, fileOutputStream3);
                                OLrzqt(new java.io.File(str3), context);
                                try {
                                    externalStoragePublicDirectory.close();
                                } catch (java.io.IOException e) {
                                    pUU.AEQbTJ("LibStorageUtils", "copyImageToPublicDir: ", e);
                                }
                                try {
                                    fileOutputStream3.close();
                                } catch (java.io.IOException e2) {
                                    pUU.AEQbTJ("LibStorageUtils", "copyImageToPublicDir: ", e2);
                                }
                            } catch (java.io.FileNotFoundException e3) {
                                e = e3;
                                fileOutputStream2 = fileOutputStream3;
                                pUU.AEQbTJ("LibStorageUtils", "copyImageToPublicDir file not found", e);
                                if (externalStoragePublicDirectory != 0) {
                                    try {
                                        externalStoragePublicDirectory.close();
                                    } catch (java.io.IOException e4) {
                                        pUU.AEQbTJ("LibStorageUtils", "copyImageToPublicDir: ", e4);
                                    }
                                }
                                if (fileOutputStream2 == null) {
                                    return false;
                                }
                                try {
                                    fileOutputStream2.close();
                                    return false;
                                } catch (java.io.IOException e5) {
                                    pUU.AEQbTJ("LibStorageUtils", "copyImageToPublicDir: ", e5);
                                    return false;
                                }
                            } catch (java.lang.Throwable th) {
                                th = th;
                                fileOutputStream2 = fileOutputStream3;
                                fileOutputStream = fileOutputStream2;
                                r9 = externalStoragePublicDirectory;
                                if (r9 != 0) {
                                }
                                if (fileOutputStream == null) {
                                }
                            }
                        } catch (java.io.FileNotFoundException e6) {
                            e = e6;
                        }
                    } catch (java.io.FileNotFoundException e7) {
                        e = e7;
                        externalStoragePublicDirectory = 0;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                        if (r9 != 0) {
                            try {
                                r9.close();
                            } catch (java.io.IOException e8) {
                                pUU.AEQbTJ("LibStorageUtils", "copyImageToPublicDir: ", e8);
                            }
                        }
                        if (fileOutputStream == null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (java.io.IOException e9) {
                                pUU.AEQbTJ("LibStorageUtils", "copyImageToPublicDir: ", e9);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                }
            } else {
                java.lang.String strOLrzqt2 = OLrzqt(file);
                if (android.text.TextUtils.isEmpty(str)) {
                    int iLastIndexOf2 = strOLrzqt2.lastIndexOf(47);
                    java.lang.String str4 = "Okex_Image_" + java.lang.System.currentTimeMillis();
                    if (iLastIndexOf2 != -1) {
                        str = str4 + JwtUtilsKt.JWT_DELIMITER + strOLrzqt2.substring(iLastIndexOf2 + 1);
                    } else {
                        str = str4;
                    }
                }
                android.net.Uri uriEZpvd = EZpvd(context, str, strOLrzqt2);
                try {
                    KWHzl(file, context.getContentResolver().openFileDescriptor(uriEZpvd, "w"));
                } catch (java.io.FileNotFoundException unused) {
                    pUU.copydefault("LibStorageUtils", "copyImageToPublicDir uri is not Found, uri is" + uriEZpvd);
                    return false;
                }
            }
            return true;
        }
        pUU.copydefault("LibStorageUtils", "file is not Found or context is null ");
        return false;
    }

    public static android.net.Uri EZpvd(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        return context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    public static android.net.Uri copydefault(android.content.Context context, java.lang.String str) {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        contentValues.put("mime_type", MimeTypes.VIDEO_MP4);
        return context.getContentResolver().insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x005c -> B:57:0x005f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void KWHzl(java.io.File file, android.os.ParcelFileDescriptor parcelFileDescriptor) throws java.lang.Throwable {
        java.io.FileOutputStream fileOutputStream;
        java.io.FileOutputStream fileOutputStream2;
        java.io.FileInputStream fileInputStream = null;
        java.io.FileOutputStream fileOutputStream3 = null;
        java.io.FileOutputStream fileOutputStream4 = null;
        fileInputStream = null;
        try {
            try {
                java.io.FileInputStream fileInputStream2 = new java.io.FileInputStream(file);
                try {
                    fileOutputStream2 = new java.io.FileOutputStream(parcelFileDescriptor.getFileDescriptor());
                } catch (java.io.FileNotFoundException unused) {
                } catch (java.lang.Throwable th) {
                    th = th;
                }
                try {
                    OLrzqt(fileInputStream2, fileOutputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (java.io.IOException e) {
                        pUU.AEQbTJ("LibStorageUtils", "writeToPublicDir: ", e);
                    }
                    fileOutputStream2.close();
                } catch (java.io.FileNotFoundException unused2) {
                    fileOutputStream3 = fileOutputStream2;
                    fileOutputStream = fileOutputStream3;
                    fileInputStream = fileInputStream2;
                    try {
                        pUU.copydefault("LibStorageUtils", "writeToPublicDir file is not found file path is " + file.getAbsolutePath());
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException e2) {
                                pUU.AEQbTJ("LibStorageUtils", "writeToPublicDir: ", e2);
                            }
                        }
                        if (fileOutputStream == null) {
                        } else {
                            fileOutputStream.close();
                        }
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (java.io.IOException e3) {
                                pUU.AEQbTJ("LibStorageUtils", "writeToPublicDir: ", e3);
                            }
                        }
                        if (fileOutputStream == null) {
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (java.io.IOException e4) {
                                pUU.AEQbTJ("LibStorageUtils", "writeToPublicDir: ", e4);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    fileOutputStream4 = fileOutputStream2;
                    fileOutputStream = fileOutputStream4;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream == null) {
                    }
                }
            } catch (java.io.FileNotFoundException unused3) {
                fileOutputStream = null;
            } catch (java.lang.Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        } catch (java.io.IOException e5) {
            pUU.AEQbTJ("LibStorageUtils", "writeToPublicDir: ", e5);
        }
    }

    public static void OLrzqt(java.io.FileInputStream fileInputStream, java.io.FileOutputStream fileOutputStream) {
        if (fileInputStream == null || fileOutputStream == null) {
            return;
        }
        try {
            java.nio.channels.FileChannel channel = fileInputStream.getChannel();
            try {
                java.nio.channels.FileChannel channel2 = fileOutputStream.getChannel();
                try {
                    try {
                        channel.transferTo(0L, channel.size(), channel2);
                    } catch (java.io.IOException e) {
                        pUU.AEQbTJ("LibStorageUtils", "copy method error", e);
                    }
                    if (channel2 != null) {
                        channel2.close();
                    }
                    if (channel != null) {
                        channel.close();
                    }
                } finally {
                }
            } finally {
            }
        } catch (java.io.IOException e2) {
            pUU.AEQbTJ("LibStorageUtils", "copy method error", e2);
        }
    }

    public static java.lang.String OLrzqt(java.io.File file) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        return options.outMimeType;
    }

    public static boolean copydefault(android.content.Context context, java.io.File file, java.lang.String str) {
        return EZpvd(context, file, null, str);
    }

    public static boolean EZpvd(android.content.Context context, java.io.File file, java.lang.String str, java.lang.String str2) {
        if (TtmlNode.TAG_IMAGE.equals(str2)) {
            return EZpvd(context, file, str);
        }
        if (MimeTypes.BASE_TYPE_VIDEO.equals(str2)) {
            return OLrzqt(context, file, str);
        }
        pUU.KWHzl("LibStorageUtils", "type is error");
        return false;
    }
}

package com.engagelab.privates.common.utils;

import android.content.Context;
import android.text.TextUtils;
import com.engagelab.privates.common.log.MTCommonLog;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";

    public static final class a implements Comparator<File> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            if (file.lastModified() > file2.lastModified()) {
                return -1;
            }
            return file.lastModified() < file2.lastModified() ? 1 : 0;
        }
    }

    public static final class b implements Comparator<File> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            long jLastModified = file.lastModified() - file2.lastModified();
            if (jLastModified < 0) {
                return -1;
            }
            return jLastModified > 0 ? 1 : 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void createFileIfNeed(File file) {
        if (file == null || file.exists()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            file.createNewFile();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean createHtmlFile(String str, String str2) {
        MTCommonLog.d(TAG, "action:createHtmlFile - filePath:" + str + ", content:" + str2);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return save(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean createImgFile(String str, byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return false;
        }
        return save(str, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void deleteCacheFileMaximum(String str, int i) {
        File[] fileArrListFiles;
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            File file = new File(str);
            if (file.exists() && !file.isFile() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length != 0) {
                MTCommonLog.d(TAG, "cacheFiles.length " + fileArrListFiles.length);
                if (fileArrListFiles.length <= i) {
                    return;
                }
                List listAsList = Arrays.asList(fileArrListFiles);
                Collections.sort(listAsList, new b());
                for (int i2 = 0; i2 < listAsList.size() - i; i2++) {
                    File file2 = (File) listAsList.get(i2);
                    if (file2.exists()) {
                        MTCommonLog.d(TAG, "Delete cacheFile " + file2.getAbsolutePath());
                        deleteDirectory(file2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean deleteDirectory(File file) {
        try {
            if (!file.exists()) {
                return false;
            }
            if (file.isFile()) {
                return file.delete();
            }
            String[] list = file.list();
            if (list != null) {
                for (String str : list) {
                    File file2 = new File(file, str);
                    if (file2.isDirectory()) {
                        deleteDirectory(file2);
                    } else {
                        file2.delete();
                    }
                }
            }
            return file.delete();
        } catch (Exception unused) {
            MTCommonLog.e(TAG, "Delete dir error");
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void deleteOldDir(Context context, String str, int i, File file) {
        File[] fileArrListFiles;
        if (file == null) {
            file = inFiles(context, str);
        }
        if (file != null && file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length > i) {
            Arrays.sort(fileArrListFiles, new a());
            deleteDirectory(fileArrListFiles[fileArrListFiles.length - 1]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getStorageDir(Context context, String str) {
        try {
            File fileInFiles = inFiles(context, str);
            if (fileInFiles == null) {
                MTCommonLog.w(TAG, str + " can't be null");
                return "";
            }
            if (fileInFiles.isFile()) {
                fileInFiles.delete();
            }
            if (!fileInFiles.exists()) {
                fileInFiles.mkdirs();
            }
            return fileInFiles.getAbsolutePath() + File.separator;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static File inFiles(Context context, String str) {
        File filesDir;
        if (context != null && (filesDir = context.getFilesDir()) != null) {
            return new File(filesDir, str);
        }
        MTCommonLog.w(TAG, "can't get file :" + str);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isFileExist(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Throwable th) {
            MTCommonLog.w(TAG, "FileUtils e:" + th);
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object readObject(File file) throws Exception {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (file == null || !file.exists() || file.isDirectory()) {
            return null;
        }
        try {
            objectInputStream = new ObjectInputStream(new FileInputStream(file));
        } catch (Throwable th) {
            th = th;
        }
        try {
            Object object = objectInputStream.readObject();
            Utils.closeQuietly(objectInputStream);
            return object;
        } catch (Throwable th2) {
            th = th2;
            objectInputStream2 = objectInputStream;
            Utils.closeQuietly(objectInputStream2);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean save(String str, String str2) {
        byte[] bytes;
        if (str2 != null) {
            try {
                bytes = str2.getBytes(C.UTF8_NAME);
            } catch (Exception e) {
                MTCommonLog.w(TAG, "getBytes exception:" + e);
                return false;
            }
        } else {
            bytes = null;
        }
        return save(str, bytes);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean saveObject(File file, Object obj) {
        ObjectOutputStream objectOutputStream;
        if (file == null || file.isDirectory()) {
            MTCommonLog.w(TAG, "file should not be null or a directory");
            return false;
        }
        try {
            createFileIfNeed(file);
            objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
        } catch (Throwable th) {
            th = th;
            objectOutputStream = null;
        }
        try {
            objectOutputStream.writeObject(obj);
            Utils.closeQuietly(objectOutputStream);
            return true;
        } catch (Throwable th2) {
            th = th2;
            try {
                MTCommonLog.w(TAG, "save to file exception:" + th + " path = " + file.getAbsolutePath());
                return false;
            } finally {
                Utils.closeQuietly(objectOutputStream);
            }
        }
    }

    private static boolean save(String str, byte[] bArr) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                File file = new File(str);
                createFileIfNeed(file);
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    Utils.closeQuietly(fileOutputStream);
                    return true;
                } catch (Exception e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    MTCommonLog.w(TAG, "save to file exception:" + e + " path = " + str);
                    Utils.closeQuietly(fileOutputStream2);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    Utils.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }
}

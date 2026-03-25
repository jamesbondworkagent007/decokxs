package o;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: o.mya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C33550mya {
    public static java.util.List<java.lang.String> OLrzqt(java.lang.String str, java.lang.String str2) throws java.lang.Throwable {
        ZipFile zipFile;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            return arrayList;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                java.io.File file = new java.io.File(str2);
                if (!file.exists()) {
                    return arrayList;
                }
                zipFile = new ZipFile(file);
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(new java.io.FileInputStream(file));
                    while (true) {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        if (nextEntry == null) {
                            break;
                        }
                        java.lang.String name = nextEntry.getName();
                        if (name == null || !name.contains("__MACOSX/")) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(str);
                            java.lang.String str3 = java.io.File.separator;
                            sb.append(str3);
                            sb.append(name);
                            java.io.File file2 = new java.io.File(sb.toString());
                            if (nextEntry.isDirectory()) {
                                new java.io.File(str + str3 + name).mkdirs();
                            } else {
                                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                                    file2.getParentFile().mkdirs();
                                }
                                byte[] bArr = new byte[1024];
                                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                                java.io.InputStream inputStream = zipFile.getInputStream(nextEntry);
                                while (true) {
                                    int i = inputStream.read(bArr);
                                    if (i == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream.close();
                                inputStream.close();
                                arrayList.add(name);
                            }
                        }
                    }
                    zipInputStream.close();
                    try {
                        zipFile.close();
                    } catch (java.io.IOException e) {
                        e.printStackTrace();
                    }
                    return arrayList;
                } catch (java.lang.Exception e2) {
                    e = e2;
                    zipFile2 = zipFile;
                    pUU.AEQbTJ("tag", e);
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (java.io.IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    return arrayList;
                } catch (java.lang.Throwable th) {
                    th = th;
                }
            } catch (java.lang.Exception e4) {
                e = e4;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            zipFile = zipFile2;
        }
        if (zipFile != null) {
            try {
                zipFile.close();
            } catch (java.io.IOException e5) {
                e5.printStackTrace();
            }
        }
        throw th;
    }
}

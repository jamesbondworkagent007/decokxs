package o;

import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: o.arx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7871arx {
    public static boolean AEQbTJ(java.lang.String str, java.lang.String str2, @androidx.annotation.Nullable InterfaceC33145mqt interfaceC33145mqt) throws java.lang.Throwable {
        ZipFile zipFile;
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        ZipFile zipFile2 = null;
        try {
            try {
                java.io.File file = new java.io.File(str2);
                if (!file.exists()) {
                    return false;
                }
                zipFile = new ZipFile(file);
                try {
                    try {
                        ZipInputStream zipInputStream = new ZipInputStream(new java.io.FileInputStream(file));
                        int i = 0;
                        int i2 = -1;
                        while (true) {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
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
                                        java.io.InputStream inputStream = zipFile.getInputStream(nextEntry);
                                        if (name != null && name.endsWith("_ok_file_count.txt")) {
                                            try {
                                                java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream));
                                                try {
                                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                    while (true) {
                                                        java.lang.String line = bufferedReader.readLine();
                                                        if (line == null) {
                                                            break;
                                                        }
                                                        sb2.append(line);
                                                    }
                                                    i2 = java.lang.Integer.parseInt(sb2.toString().trim());
                                                    bufferedReader.close();
                                                } catch (java.lang.Throwable th) {
                                                    try {
                                                        bufferedReader.close();
                                                    } catch (java.lang.Throwable th2) {
                                                        th.addSuppressed(th2);
                                                    }
                                                    throw th;
                                                }
                                            } catch (java.lang.Exception e) {
                                                e.printStackTrace();
                                                if (interfaceC33145mqt != null) {
                                                    interfaceC33145mqt.EZpvd(1003, e.getMessage());
                                                }
                                            }
                                        } else {
                                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                                            while (true) {
                                                int i3 = inputStream.read(bArr);
                                                if (i3 == -1) {
                                                    break;
                                                }
                                                fileOutputStream.write(bArr, 0, i3);
                                            }
                                            fileOutputStream.close();
                                            i++;
                                            if (interfaceC33145mqt != null) {
                                                interfaceC33145mqt.copydefault(i, i2);
                                            }
                                        }
                                        inputStream.close();
                                    }
                                }
                            } else {
                                zipInputStream.close();
                                if (i2 != i) {
                                    if (interfaceC33145mqt != null) {
                                        interfaceC33145mqt.EZpvd(1001, "decompressFile:  error: expect count: [" + i2 + "], actual count: [" + i + "]");
                                    }
                                } else if (interfaceC33145mqt != null) {
                                    interfaceC33145mqt.copydefault("decompressFile: successfully.");
                                }
                                boolean z = i2 == i;
                                try {
                                    zipFile.close();
                                } catch (java.io.IOException e2) {
                                    e2.printStackTrace();
                                }
                                return z;
                            }
                        }
                    } catch (java.lang.Exception e3) {
                        e = e3;
                        zipFile2 = zipFile;
                    }
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    if (zipFile != null) {
                        try {
                            zipFile.close();
                        } catch (java.io.IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (java.lang.Exception e5) {
                e = e5;
            }
            if (interfaceC33145mqt != null) {
                interfaceC33145mqt.EZpvd(1002, "decompressFile error: " + e.getMessage());
            }
            android.util.Log.getStackTraceString(e);
            if (zipFile2 != null) {
                try {
                    zipFile2.close();
                } catch (java.io.IOException e6) {
                    e6.printStackTrace();
                }
            }
            return false;
        } catch (java.lang.Throwable th4) {
            th = th4;
            zipFile = null;
        }
    }
}

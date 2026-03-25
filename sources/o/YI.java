package o;

import com.getkeepsafe.relinker.MissingLibraryException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o.YG;

/* JADX INFO: loaded from: classes2.dex */
public class YI implements YG.Activity {
    public final java.lang.String[] copydefault(android.content.Context context) {
        android.content.pm.ApplicationInfo applicationInfo = context.getApplicationInfo();
        java.lang.String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            java.lang.String[] strArr2 = new java.lang.String[strArr.length + 1];
            strArr2[0] = applicationInfo.sourceDir;
            java.lang.System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            return strArr2;
        }
        return new java.lang.String[]{applicationInfo.sourceDir};
    }

    public static class StateListAnimator {
        public ZipEntry OLrzqt;
        public ZipFile copydefault;

        public StateListAnimator(ZipFile zipFile, ZipEntry zipEntry) {
            this.copydefault = zipFile;
            this.OLrzqt = zipEntry;
        }
    }

    public final StateListAnimator KWHzl(android.content.Context context, java.lang.String[] strArr, java.lang.String str, YF yf) {
        java.lang.String[] strArrCopydefault = copydefault(context);
        int length = strArrCopydefault.length;
        int i = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i >= length) {
                return null;
            }
            java.lang.String str2 = strArrCopydefault[i];
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new java.io.File(str2), 1);
                    break;
                } catch (java.io.IOException unused) {
                    i2++;
                }
            }
            if (zipFile != null) {
                for (int i3 = 0; i3 < 5; i3++) {
                    for (java.lang.String str3 : strArr) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append("lib");
                        char c = java.io.File.separatorChar;
                        sb.append(c);
                        sb.append(str3);
                        sb.append(c);
                        sb.append(str);
                        java.lang.String string = sb.toString();
                        yf.copydefault("Looking for %s in APK %s...", string, str2);
                        ZipEntry entry = zipFile.getEntry(string);
                        if (entry != null) {
                            return new StateListAnimator(zipFile, entry);
                        }
                    }
                }
                try {
                    zipFile.close();
                } catch (java.io.IOException unused2) {
                }
            }
            i++;
        }
    }

    public final java.lang.String[] KWHzl(android.content.Context context, java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("lib");
        char c = java.io.File.separatorChar;
        sb.append(c);
        sb.append("([^\\");
        sb.append(c);
        sb.append("]*)");
        sb.append(c);
        sb.append(str);
        Pattern patternCompile = Pattern.compile(sb.toString());
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str2 : copydefault(context)) {
            try {
                java.util.Enumeration<? extends ZipEntry> enumerationEntries = new ZipFile(new java.io.File(str2), 1).entries();
                while (enumerationEntries.hasMoreElements()) {
                    Matcher matcher = patternCompile.matcher(enumerationEntries.nextElement().getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (java.io.IOException unused) {
            }
        }
        return (java.lang.String[]) hashSet.toArray(new java.lang.String[hashSet.size()]);
    }

    @Override // o.YG.Activity
    public void EZpvd(android.content.Context context, java.lang.String[] strArr, java.lang.String str, java.io.File file, YF yf) throws java.lang.Throwable {
        java.lang.String[] strArrKWHzl;
        java.io.Closeable closeable;
        java.io.InputStream inputStream;
        java.io.FileOutputStream fileOutputStream;
        StateListAnimator stateListAnimator = null;
        java.io.Closeable closeable2 = null;
        java.io.Closeable closeable3 = null;
        try {
            StateListAnimator stateListAnimatorKWHzl = KWHzl(context, strArr, str, yf);
            try {
                if (stateListAnimatorKWHzl == null) {
                    try {
                        strArrKWHzl = KWHzl(context, str);
                    } catch (java.lang.Exception e) {
                        strArrKWHzl = new java.lang.String[]{e.toString()};
                    }
                    throw new MissingLibraryException(str, strArr, strArrKWHzl);
                }
                for (int i = 0; i < 5; i++) {
                    yf.copydefault("Found %s! Extracting...", str);
                    try {
                        if (file.exists() || file.createNewFile()) {
                            try {
                                inputStream = stateListAnimatorKWHzl.copydefault.getInputStream(stateListAnimatorKWHzl.OLrzqt);
                                try {
                                    fileOutputStream = new java.io.FileOutputStream(file);
                                } catch (java.io.FileNotFoundException unused) {
                                    fileOutputStream = null;
                                } catch (java.io.IOException unused2) {
                                    fileOutputStream = null;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                }
                            } catch (java.io.FileNotFoundException unused3) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (java.io.IOException unused4) {
                                inputStream = null;
                                fileOutputStream = null;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                closeable = null;
                            }
                            try {
                                long jOLrzqt = OLrzqt(inputStream, fileOutputStream);
                                fileOutputStream.getFD().sync();
                                if (jOLrzqt == file.length()) {
                                    KWHzl(inputStream);
                                    KWHzl(fileOutputStream);
                                    file.setReadable(true, false);
                                    file.setExecutable(true, false);
                                    file.setWritable(true);
                                    try {
                                        ZipFile zipFile = stateListAnimatorKWHzl.copydefault;
                                        if (zipFile != null) {
                                            zipFile.close();
                                            return;
                                        }
                                        return;
                                    } catch (java.io.IOException unused5) {
                                        return;
                                    }
                                }
                            } catch (java.io.FileNotFoundException | java.io.IOException unused6) {
                            } catch (java.lang.Throwable th3) {
                                th = th3;
                                closeable2 = fileOutputStream;
                                java.io.Closeable closeable4 = closeable2;
                                closeable3 = inputStream;
                                closeable = closeable4;
                                KWHzl(closeable3);
                                KWHzl(closeable);
                                throw th;
                            }
                            KWHzl(inputStream);
                            KWHzl(fileOutputStream);
                        }
                    } catch (java.io.IOException unused7) {
                    }
                }
                yf.AEQbTJ("FATAL! Couldn't extract the library from the APK!");
                try {
                    ZipFile zipFile2 = stateListAnimatorKWHzl.copydefault;
                    if (zipFile2 != null) {
                        zipFile2.close();
                    }
                } catch (java.io.IOException unused8) {
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
                stateListAnimator = stateListAnimatorKWHzl;
                if (stateListAnimator != null) {
                    try {
                        ZipFile zipFile3 = stateListAnimator.copydefault;
                        if (zipFile3 != null) {
                            zipFile3.close();
                        }
                    } catch (java.io.IOException unused9) {
                    }
                }
                throw th;
            }
        } catch (java.lang.Throwable th5) {
            th = th5;
        }
    }

    public final long OLrzqt(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                outputStream.write(bArr, 0, i);
                j += (long) i;
            } else {
                outputStream.flush();
                return j;
            }
        }
    }

    public final void KWHzl(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}

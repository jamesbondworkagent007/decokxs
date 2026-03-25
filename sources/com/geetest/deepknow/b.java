package com.geetest.deepknow;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes21.dex */
public class b {

    /* JADX INFO: renamed from: com.geetest.deepknow.b$b, reason: collision with other inner class name */
    public static class C0194b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f390a = new b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static b a() {
        return C0194b.f390a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private b() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String a(String str) throws Throwable {
        Process processExec;
        Process process;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream2;
        BufferedOutputStream bufferedOutputStream2 = null;
        BufferedInputStream bufferedInputStream3 = null;
        try {
            processExec = Runtime.getRuntime().exec("sh");
        } catch (Exception unused) {
            processExec = null;
        } catch (Throwable th) {
            th = th;
            processExec = null;
        }
        try {
            bufferedOutputStream = new BufferedOutputStream(processExec.getOutputStream());
            try {
                bufferedInputStream2 = new BufferedInputStream(processExec.getInputStream());
            } catch (Exception unused2) {
                bufferedInputStream2 = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused3) {
            bufferedOutputStream = null;
            bufferedInputStream2 = null;
            if (bufferedOutputStream != null) {
            }
            if (bufferedInputStream2 != null) {
            }
            if (processExec != null) {
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            process = processExec;
            bufferedInputStream = null;
            if (bufferedOutputStream2 != null) {
            }
            if (bufferedInputStream != null) {
            }
            if (process != null) {
            }
        }
        try {
            bufferedOutputStream.write(str.getBytes());
            bufferedOutputStream.write(10);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
            processExec.waitFor();
            String strA = a(bufferedInputStream2);
            try {
                bufferedOutputStream.close();
            } catch (IOException unused4) {
            }
            try {
                bufferedInputStream2.close();
            } catch (IOException unused5) {
            }
            processExec.destroy();
            return strA;
        } catch (Exception unused6) {
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException unused7) {
                }
            }
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException unused8) {
                }
            }
            if (processExec != null) {
                processExec.destroy();
            }
            return null;
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream3 = bufferedInputStream2;
            bufferedInputStream = bufferedInputStream3;
            bufferedOutputStream2 = bufferedOutputStream;
            process = processExec;
            if (bufferedOutputStream2 != null) {
                try {
                    bufferedOutputStream2.close();
                } catch (IOException unused9) {
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException unused10) {
                }
            }
            if (process != null) {
                throw th;
            }
            process.destroy();
            throw th;
        }
    }

    private static String a(BufferedInputStream bufferedInputStream) {
        int i;
        if (bufferedInputStream == null) {
            return "";
        }
        byte[] bArr = new byte[512];
        StringBuilder sb = new StringBuilder();
        do {
            try {
                i = bufferedInputStream.read(bArr);
                if (i > 0) {
                    sb.append(new String(bArr, 0, i));
                }
            } catch (Exception unused) {
            }
        } while (i >= 512);
        return sb.toString();
    }
}

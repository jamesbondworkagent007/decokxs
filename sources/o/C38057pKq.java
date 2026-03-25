package o;

import androidx.camera.video.AudioStats;
import com.okinc.lib.utils.OkUtils;

/* JADX INFO: renamed from: o.pKq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38057pKq {
    public static final java.lang.String EZpvd = "FileIOUtils";
    public static int OLrzqt = 8192;

    /* JADX INFO: renamed from: o.pKq$ActionBar */
    public interface ActionBar {
        void OLrzqt(double d);
    }

    private C38057pKq() {
    }

    public static java.io.FileInputStream EZpvd(java.lang.String str) {
        return copydefault(C38063pKw.OLrzqt(str));
    }

    public static java.io.FileInputStream copydefault(java.io.File file) {
        if (file == null) {
            return null;
        }
        try {
            return new java.io.FileInputStream(file);
        } catch (java.lang.Exception e) {
            OkUtils.AhwBna().copydefault(EZpvd, "getFileInputStream", e);
            return null;
        }
    }

    public static boolean copydefault(java.io.File file, java.lang.String str) {
        return EZpvd(file, str, false);
    }

    public static boolean EZpvd(java.io.File file, java.lang.String str, boolean z) throws java.lang.Throwable {
        java.io.BufferedWriter bufferedWriter;
        if (str == null || !C38063pKw.copydefault(file)) {
            return false;
        }
        java.io.BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new java.io.BufferedWriter(new java.io.FileWriter(file, z));
                try {
                    bufferedWriter.write(str);
                    C38058pKr.copydefault(bufferedWriter);
                    return true;
                } catch (java.io.IOException e) {
                    e = e;
                    bufferedWriter2 = bufferedWriter;
                    OkUtils.AhwBna().copydefault(EZpvd, "writeFileFromString", e);
                    C38058pKr.copydefault(bufferedWriter2);
                    return false;
                } catch (java.lang.Throwable th) {
                    th = th;
                    C38058pKr.copydefault(bufferedWriter);
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
            }
        } catch (java.io.IOException e2) {
            e = e2;
        }
    }

    public static boolean KWHzl(java.io.File file) {
        if (file == null) {
            return false;
        }
        if ((file.exists() && !file.delete()) || !C38063pKw.AEQbTJ(file.getParentFile())) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (java.io.IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static java.lang.String AEQbTJ(java.io.File file) {
        return EZpvd(file, null);
    }

    public static java.lang.String EZpvd(java.io.File file, java.lang.String str) {
        byte[] bArrEZpvd = EZpvd(file);
        if (bArrEZpvd == null) {
            return null;
        }
        if (C38061pKu.OLrzqt(str)) {
            return new java.lang.String(bArrEZpvd);
        }
        try {
            return new java.lang.String(bArrEZpvd, str);
        } catch (java.io.UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static byte[] EZpvd(java.io.File file) {
        return OLrzqt(file, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[Catch: FileNotFoundException -> 0x0093, SYNTHETIC, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0093, blocks: (B:5:0x0008, B:24:0x005b, B:20:0x0053, B:54:0x0092, B:53:0x008f, B:48:0x0085, B:43:0x007c, B:38:0x0072, B:21:0x0056, B:45:0x0080, B:35:0x006d, B:17:0x004e, B:50:0x008a, B:40:0x0077), top: B:62:0x0008, inners: #0, #3, #5, #7, #8, #9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] OLrzqt(java.io.File file, ActionBar actionBar) throws java.lang.Throwable {
        java.lang.Throwable th;
        java.io.ByteArrayOutputStream byteArrayOutputStream;
        java.io.IOException e;
        if (!C38063pKw.DbNXlk(file)) {
            return null;
        }
        try {
            java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file), OLrzqt);
            try {
                byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            } catch (java.io.IOException e2) {
                e = e2;
                byteArrayOutputStream = null;
            } catch (java.lang.Throwable th2) {
                th = th2;
                byteArrayOutputStream = null;
                try {
                    bufferedInputStream.close();
                } catch (java.io.IOException e3) {
                    e3.printStackTrace();
                }
                if (byteArrayOutputStream == null) {
                }
            }
            try {
                try {
                    byte[] bArr = new byte[OLrzqt];
                    if (actionBar != null) {
                        double dAvailable = bufferedInputStream.available();
                        actionBar.OLrzqt(AudioStats.AUDIO_AMPLITUDE_NONE);
                        int i = 0;
                        while (true) {
                            int i2 = bufferedInputStream.read(bArr, 0, OLrzqt);
                            if (i2 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i2);
                            i += i2;
                            actionBar.OLrzqt(((double) i) / dAvailable);
                        }
                    } else {
                        while (true) {
                            int i3 = bufferedInputStream.read(bArr, 0, OLrzqt);
                            if (i3 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i3);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    try {
                        bufferedInputStream.close();
                    } catch (java.io.IOException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.io.IOException e5) {
                        e5.printStackTrace();
                    }
                    return byteArray;
                } catch (java.lang.Throwable th3) {
                    th = th3;
                    bufferedInputStream.close();
                    if (byteArrayOutputStream == null) {
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (java.io.IOException e6) {
                            e6.printStackTrace();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (java.io.IOException e7) {
                e = e7;
                e.printStackTrace();
                try {
                    bufferedInputStream.close();
                } catch (java.io.IOException e8) {
                    e8.printStackTrace();
                }
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.io.IOException e9) {
                        e9.printStackTrace();
                    }
                }
                return null;
            }
        } catch (java.io.FileNotFoundException e10) {
            e10.printStackTrace();
            return null;
        }
    }
}

package o;

import com.bumptech.glide.load.ImageHeaderParser;
import java.util.Objects;

/* JADX INFO: renamed from: o.Oi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5350Oi {
    public static final C5344Oc EZpvd = new C5344Oc();
    public final InterfaceC5351Oj AEQbTJ;
    public final C5344Oc AhwBna;
    public final android.content.ContentResolver KWHzl;
    public final OF OLrzqt;
    public final java.util.List<ImageHeaderParser> copydefault;

    public C5350Oi(java.util.List<ImageHeaderParser> list, InterfaceC5351Oj interfaceC5351Oj, OF of, android.content.ContentResolver contentResolver) {
        this(list, EZpvd, interfaceC5351Oj, of, contentResolver);
    }

    public C5350Oi(java.util.List<ImageHeaderParser> list, C5344Oc c5344Oc, InterfaceC5351Oj interfaceC5351Oj, OF of, android.content.ContentResolver contentResolver) {
        this.AhwBna = c5344Oc;
        this.AEQbTJ = interfaceC5351Oj;
        this.OLrzqt = of;
        this.KWHzl = contentResolver;
        this.copydefault = list;
    }

    public int copydefault(android.net.Uri uri) {
        java.io.InputStream inputStreamOpenInputStream = null;
        try {
            try {
                inputStreamOpenInputStream = this.KWHzl.openInputStream(uri);
                int iCopydefault = NK.copydefault(this.copydefault, inputStreamOpenInputStream, this.OLrzqt);
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return iCopydefault;
            } catch (java.lang.Throwable th) {
                if (inputStreamOpenInputStream != null) {
                    try {
                        inputStreamOpenInputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (java.io.IOException | java.lang.NullPointerException unused3) {
            if (android.util.Log.isLoggable("ThumbStreamOpener", 3)) {
                Objects.toString(uri);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                inputStreamOpenInputStream.close();
                return -1;
            } catch (java.io.IOException unused4) {
                return -1;
            }
        }
    }

    public java.io.InputStream EZpvd(android.net.Uri uri) throws java.lang.Throwable {
        java.lang.String strOLrzqt = OLrzqt(uri);
        if (android.text.TextUtils.isEmpty(strOLrzqt)) {
            return null;
        }
        java.io.File fileOLrzqt = this.AhwBna.OLrzqt(strOLrzqt);
        if (!OLrzqt(fileOLrzqt)) {
            return null;
        }
        android.net.Uri uriFromFile = android.net.Uri.fromFile(fileOLrzqt);
        try {
            return this.KWHzl.openInputStream(uriFromFile);
        } catch (java.lang.NullPointerException e) {
            throw ((java.io.FileNotFoundException) new java.io.FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String OLrzqt(@androidx.annotation.NonNull android.net.Uri uri) throws java.lang.Throwable {
        android.database.Cursor cursorAEQbTJ;
        android.database.Cursor cursor = null;
        try {
            cursorAEQbTJ = this.AEQbTJ.AEQbTJ(uri);
            if (cursorAEQbTJ != null) {
                try {
                    try {
                        if (cursorAEQbTJ.moveToFirst()) {
                            java.lang.String string = cursorAEQbTJ.getString(0);
                            cursorAEQbTJ.close();
                            return string;
                        }
                    } catch (java.lang.Throwable th) {
                        th = th;
                        cursor = cursorAEQbTJ;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (java.lang.SecurityException unused) {
                    if (android.util.Log.isLoggable("ThumbStreamOpener", 3)) {
                        Objects.toString(uri);
                    }
                    if (cursorAEQbTJ != null) {
                        cursorAEQbTJ.close();
                    }
                    return null;
                }
            }
            if (cursorAEQbTJ != null) {
                cursorAEQbTJ.close();
            }
            return null;
        } catch (java.lang.SecurityException unused2) {
            cursorAEQbTJ = null;
        } catch (java.lang.Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
    }

    public final boolean OLrzqt(java.io.File file) {
        return this.AhwBna.AEQbTJ(file) && 0 < this.AhwBna.EZpvd(file);
    }
}

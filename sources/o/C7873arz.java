package o;

import com.immomo.mls.utils.ERROR;
import com.immomo.mls.utils.ScriptLoadException;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import org.luaj.vm2.Globals;

/* JADX INFO: renamed from: o.arz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7873arz {
    public static final java.io.FileFilter copydefault = new java.io.FileFilter() { // from class: o.arz.4
        @Override // java.io.FileFilter
        public boolean accept(java.io.File file) {
            return file.isDirectory() || (file.isFile() && file.getName().endsWith(".lua") && !file.getName().startsWith(JwtUtilsKt.JWT_DELIMITER));
        }
    };
    public static final java.io.FileFilter EZpvd = new java.io.FileFilter() { // from class: o.arz.5
        @Override // java.io.FileFilter
        public boolean accept(java.io.File file) {
            return file.isDirectory();
        }
    };

    public static boolean AEQbTJ(Globals globals) {
        byte[] bArrKWHzl;
        if (C7788aqT.EZpvd()) {
            java.lang.String strCopydefault = C7788aqT.copydefault();
            int iKWHzl = C7788aqT.KWHzl();
            if (strCopydefault != null && !strCopydefault.isEmpty()) {
                C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
                android.content.Context context = c7322ahe != null ? c7322ahe.AEQbTJ : null;
                if (context == null || (bArrKWHzl = KWHzl(context)) == null) {
                    return false;
                }
                return globals.copydefault(bArrKWHzl, strCopydefault, iKWHzl);
            }
        }
        return false;
    }

    public static byte[] copydefault() {
        java.io.File file = new java.io.File(C7864arq.copydefault(), "debug.lua");
        if (file.isFile()) {
            return C7864arq.KWHzl(file);
        }
        return null;
    }

    public static byte[] KWHzl(android.content.Context context) {
        byte[] bArrCopydefault = copydefault();
        if (bArrCopydefault != null) {
            return bArrCopydefault;
        }
        try {
            java.io.InputStream inputStreamOpen = context.getAssets().open("debug.lua");
            byte[] bArrEZpvd = C7866ars.EZpvd(inputStreamOpen, inputStreamOpen.available());
            C7866ars.AEQbTJ((java.io.Closeable) inputStreamOpen);
            return bArrEZpvd;
        } catch (java.io.IOException e) {
            pUU.copydefault("mln", android.util.Log.getStackTraceString(e));
            return null;
        }
    }

    public static C8015auj copydefault(java.io.File file) throws ScriptLoadException {
        if (!file.isFile()) {
            throw new ScriptLoadException(ERROR.READ_FILE_FAILED, null);
        }
        java.lang.String name = file.getName();
        if (name.endsWith(".lua")) {
            name = name.substring(0, name.length() - 4);
        } else if (name.endsWith(".luab")) {
            name = name.substring(0, name.length() - 5);
        }
        return AEQbTJ(name, file, true);
    }

    public static C8015auj KWHzl(C7844arW c7844arW) {
        java.lang.String strEZpvd = c7844arW.EZpvd();
        if (strEZpvd.endsWith(".lua")) {
            strEZpvd = strEZpvd.substring(0, strEZpvd.length() - 4);
        } else if (strEZpvd.endsWith(".luab")) {
            strEZpvd = strEZpvd.substring(0, strEZpvd.length() - 5);
        }
        return new C8015auj(strEZpvd, c7844arW.gEmmrt(), true, true);
    }

    public static C8015auj AEQbTJ(java.lang.String str, java.io.File file, boolean z) {
        return new C8015auj(str, file.getAbsolutePath(), z);
    }
}

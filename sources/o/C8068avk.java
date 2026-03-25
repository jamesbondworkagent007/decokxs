package o;

import com.google.android.play.core.splitinstall.SplitInstallException;
import com.jeppeman.globallydynamic.globalsplitinstall.GlobalSplitInstallException;

/* JADX INFO: renamed from: o.avk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C8068avk {
    public static GlobalSplitInstallException EZpvd(java.lang.Exception exc) {
        if (exc instanceof SplitInstallException) {
            return new GlobalSplitInstallException(((SplitInstallException) exc).getErrorCode(), exc.getMessage(), exc);
        }
        if (exc != null) {
            return new GlobalSplitInstallException(exc);
        }
        return null;
    }
}

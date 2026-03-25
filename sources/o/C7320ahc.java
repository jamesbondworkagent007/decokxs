package o;

import com.immomo.mls.ScriptStateListener;
import com.immomo.mls.log.ErrorType;
import org.luaj.vm2.Globals;
import org.luaj.vm2.exception.InvokeError;

/* JADX INFO: renamed from: o.ahc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7320ahc {
    public static StateListAnimator EZpvd = new StateListAnimator() { // from class: o.ahc.5
        @Override // o.C7320ahc.StateListAnimator
        public boolean KWHzl(boolean z, Globals globals, java.lang.Throwable th) {
            C7328ahk c7328ahk;
            if (z) {
                C6777aVl.EZpvd(th, null, java.lang.Boolean.FALSE);
                C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
                if (c7322ahe != null && (c7328ahk = c7322ahe.copydefault) != null) {
                    c7328ahk.AEQbTJ("2", android.util.Log.getStackTraceString(th), ScriptStateListener.Reason.EXCUTE_FAILED);
                }
            }
            pUU.AEQbTJ("mln", "uncatch exception", th);
            return true;
        }
    };
    public static boolean copydefault = false;

    /* JADX INFO: renamed from: o.ahc$StateListAnimator */
    public interface StateListAnimator {
        boolean KWHzl(boolean z, Globals globals, java.lang.Throwable th);
    }

    public static boolean AEQbTJ(java.lang.Throwable th, Globals globals) {
        if (globals.fIwbmz() == 100) {
            return false;
        }
        if ((th instanceof InvokeError) && ((InvokeError) th).getType() != 0) {
            return true;
        }
        if (copydefault) {
            OLrzqt(th, globals);
        }
        StateListAnimator stateListAnimator = EZpvd;
        if (stateListAnimator != null) {
            return stateListAnimator.KWHzl(true, globals, th);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.io.PrintStream */
    /* JADX WARN: Multi-variable type inference failed */
    public static void OLrzqt(java.lang.Throwable th, Globals globals) {
        java.io.PrintStream printStream;
        java.lang.String strOLrzqt = OLrzqt(th);
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe != null && (printStream = c7322ahe.KWHzl) != 0) {
            if (printStream instanceof InterfaceC7851ard) {
                ((InterfaceC7851ard) printStream).OLrzqt("[LUA_ERROR] " + strOLrzqt);
            } else {
                printStream.print("[LUA_ERROR] " + strOLrzqt);
                printStream.println();
            }
            c7322ahe.KWHzl();
            return;
        }
        C7870arw.AEQbTJ(th, new java.lang.Object[0]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: java.io.PrintStream */
    /* JADX WARN: Multi-variable type inference failed */
    public static void KWHzl(ErrorType errorType, java.lang.Throwable th, Globals globals) {
        java.io.PrintStream printStream;
        java.lang.String message = th != null ? th.getMessage() : "";
        C7322ahe c7322ahe = (C7322ahe) globals.AuCTel();
        if (c7322ahe == null || (printStream = c7322ahe.KWHzl) == 0) {
            return;
        }
        if (printStream instanceof InterfaceC7851ard) {
            ((InterfaceC7851ard) printStream).AEQbTJ(errorType.getErrorPrefix() + message, errorType);
        } else {
            printStream.print(errorType.getErrorPrefix() + message);
            printStream.println();
        }
        c7322ahe.KWHzl();
    }

    public static boolean EZpvd(java.lang.Throwable th, Globals globals) {
        StateListAnimator stateListAnimator = EZpvd;
        if (stateListAnimator != null) {
            return stateListAnimator.KWHzl(false, globals, th);
        }
        return false;
    }

    public static java.lang.String OLrzqt(java.lang.Throwable th) {
        java.lang.Throwable cause = th != null ? th.getCause() : null;
        if (cause != null) {
            th = cause;
        }
        return th != null ? th.getMessage() : "";
    }
}

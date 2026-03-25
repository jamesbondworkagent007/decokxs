package o;

import com.okinc.core.util.SPUtils;
import java.lang.Thread;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aVe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6770aVe implements Thread.UncaughtExceptionHandler {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public Thread.UncaughtExceptionHandler AEQbTJ;

    /* JADX INFO: renamed from: o.aVe$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.aVe.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void copydefault() {
            new C6770aVe().KWHzl();
        }
    }

    public final void KWHzl() {
        pUU.KWHzl("CheckAllCrashHandler", "CheckAllCrashHandler setUncaughtCrash ");
        if (java.lang.Thread.getDefaultUncaughtExceptionHandler() != this) {
            this.AEQbTJ = java.lang.Thread.getDefaultUncaughtExceptionHandler();
            java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [44=4] */
    /* JADX DEBUG: Incorrect finally slice size: {[IGET, CONST] complete}, expected: {[IGET] complete} */
    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull java.lang.Thread thread, @NotNull java.lang.Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Intrinsics.checkNotNullParameter(thread, "");
        Intrinsics.checkNotNullParameter(th, "");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.AEQbTJ;
        pUU.copydefault("CheckAllCrashHandler", "CheckAllCrashHandler DefaultCrashHandler=>" + (uncaughtExceptionHandler2 != null ? uncaughtExceptionHandler2.getClass().getName() : null) + " ");
        pUU.copydefault("CheckAllCrashHandler", "CheckAllCrashHandler ex=>" + th.getClass().getName() + " ");
        try {
            if (!C6769aVd.OLrzqt.valueOf()) {
                SPUtils.put("sp_have_firebase_crash_key", java.lang.Boolean.TRUE, "sp_firebase_file_name");
                C6781aVp.KWHzl(th);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler3 = this.AEQbTJ;
            pUU.copydefault("CheckAllCrashHandler", "delivery next UncaughtExceptionHandler:" + (uncaughtExceptionHandler3 != null ? uncaughtExceptionHandler3.getClass().getName() : null));
            uncaughtExceptionHandler = this.AEQbTJ;
            if (uncaughtExceptionHandler == null) {
                return;
            }
        } catch (java.lang.Throwable th2) {
            try {
                pUU.copydefault("CheckAllCrashHandler", "CrashHandler uncaughtException e:" + th2);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler4 = this.AEQbTJ;
                pUU.copydefault("CheckAllCrashHandler", "delivery next UncaughtExceptionHandler:" + (uncaughtExceptionHandler4 != null ? uncaughtExceptionHandler4.getClass().getName() : null));
                uncaughtExceptionHandler = this.AEQbTJ;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } catch (java.lang.Throwable th3) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler5 = this.AEQbTJ;
                pUU.copydefault("CheckAllCrashHandler", "delivery next UncaughtExceptionHandler:" + (uncaughtExceptionHandler5 != null ? uncaughtExceptionHandler5.getClass().getName() : null));
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler6 = this.AEQbTJ;
                if (uncaughtExceptionHandler6 != null) {
                    uncaughtExceptionHandler6.uncaughtException(thread, th);
                }
                throw th3;
            }
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}

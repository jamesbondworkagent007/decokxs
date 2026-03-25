package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class yMM {
    public final C56933yXs AEQbTJ;
    public final java.lang.String EZpvd;
    public final C56929yXo KWHzl;
    public final boolean OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56933yXs EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.EZpvd;
    }

    public yMM(@NotNull C56933yXs c56933yXs, @NotNull java.lang.String str, boolean z, C56929yXo c56929yXo) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = c56933yXs;
        this.EZpvd = str;
        this.OLrzqt = z;
        this.KWHzl = c56929yXo;
    }

    public final C56935yXu EZpvd(int i) {
        C56935yXu c56935yXuAEQbTJ = C56935yXu.AEQbTJ(this.EZpvd + i);
        Intrinsics.checkNotNullExpressionValue(c56935yXuAEQbTJ, "");
        return c56935yXuAEQbTJ;
    }

    public java.lang.String toString() {
        return this.AEQbTJ + '.' + this.EZpvd + 'N';
    }

    public static final class TaskDescription extends yMM {
        public static final TaskDescription copydefault = new TaskDescription();

        private TaskDescription() {
            super(yMB.AEQbTJ, "Function", false, null);
        }
    }

    public static final class Activity extends yMM {
        public static final Activity copydefault = new Activity();

        private Activity() {
            super(yMB.fetchVPNInfo, "SuspendFunction", false, null);
        }
    }

    public static final class Application extends yMM {
        public static final Application copydefault = new Application();

        private Application() {
            super(yMB.getNewProxyInstance, "KFunction", true, null);
        }
    }

    public static final class ActionBar extends yMM {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
            super(yMB.getNewProxyInstance, "KSuspendFunction", true, null);
        }
    }
}

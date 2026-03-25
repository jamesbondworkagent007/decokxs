package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC27746kBv {

    /* JADX INFO: renamed from: o.kBv$Application */
    public static final class Application implements InterfaceC27746kBv {
        public static final Application KWHzl = new Application();

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.kBv$TaskDescription */
    /* JADX INFO: loaded from: classes15.dex */
    public static final class TaskDescription implements InterfaceC27746kBv {
        public static final TaskDescription AEQbTJ = new TaskDescription();

        private TaskDescription() {
        }
    }

    /* JADX INFO: renamed from: o.kBv$ActionBar */
    public static final class ActionBar implements InterfaceC27746kBv {
        public final kAV KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, kAV kav, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                kav = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(kav);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull kAV kav) {
            Intrinsics.checkNotNullParameter(kav, "");
            return new ActionBar(kav);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final kAV OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.KWHzl, ((ActionBar) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(chart=" + this.KWHzl + ")";
        }

        public ActionBar(@NotNull kAV kav) {
            Intrinsics.checkNotNullParameter(kav, "");
            this.KWHzl = kav;
        }
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58087yuf {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuf.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC58087yuf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC58087yuf() {
    }

    /* JADX INFO: renamed from: o.yuf$LoaderManager */
    public static final class LoaderManager extends AbstractC58087yuf {
        public final InterfaceC58217yxC AEQbTJ;
        public final int EZpvd;
        public final long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ LoaderManager copy$default(LoaderManager loaderManager, InterfaceC58217yxC interfaceC58217yxC, int i, long j, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                interfaceC58217yxC = loaderManager.AEQbTJ;
            }
            if ((i2 & 2) != 0) {
                i = loaderManager.EZpvd;
            }
            if ((i2 & 4) != 0) {
                j = loaderManager.KWHzl;
            }
            return loaderManager.AEQbTJ(interfaceC58217yxC, i, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int AEQbTJ() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final LoaderManager AEQbTJ(@NotNull InterfaceC58217yxC interfaceC58217yxC, int i, long j) {
            Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
            return new LoaderManager(interfaceC58217yxC, i, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC58217yxC copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoaderManager)) {
                return false;
            }
            LoaderManager loaderManager = (LoaderManager) obj;
            return Intrinsics.EZpvd(this.AEQbTJ, loaderManager.AEQbTJ) && this.EZpvd == loaderManager.EZpvd && this.KWHzl == loaderManager.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.AEQbTJ.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd)) * 31) + java.lang.Long.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "WaitingToRetry(timerDisposable=" + this.AEQbTJ + ", retryCount=" + this.EZpvd + ", retryInMillis=" + this.KWHzl + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoaderManager(@NotNull InterfaceC58217yxC interfaceC58217yxC, int i, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC58217yxC, "");
            this.AEQbTJ = interfaceC58217yxC;
            this.EZpvd = i;
            this.KWHzl = j;
        }
    }

    /* JADX INFO: renamed from: o.yuf$TaskDescription */
    public static final class TaskDescription extends AbstractC58087yuf {
        public final int EZpvd;
        public final C58084yuc KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, C58084yuc c58084yuc, int i, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                c58084yuc = taskDescription.KWHzl;
            }
            if ((i2 & 2) != 0) {
                i = taskDescription.EZpvd;
            }
            return taskDescription.KWHzl(c58084yuc, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C58084yuc AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription KWHzl(@NotNull C58084yuc c58084yuc, int i) {
            Intrinsics.checkNotNullParameter(c58084yuc, "");
            return new TaskDescription(c58084yuc, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TaskDescription)) {
                return false;
            }
            TaskDescription taskDescription = (TaskDescription) obj;
            return Intrinsics.EZpvd(this.KWHzl, taskDescription.KWHzl) && this.EZpvd == taskDescription.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.KWHzl.hashCode() * 31) + java.lang.Integer.hashCode(this.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Connecting(session=" + this.KWHzl + ", retryCount=" + this.EZpvd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TaskDescription(@NotNull C58084yuc c58084yuc, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(c58084yuc, "");
            this.KWHzl = c58084yuc;
            this.EZpvd = i;
        }
    }

    /* JADX INFO: renamed from: o.yuf$Application */
    public static final class Application extends AbstractC58087yuf {
        public final C58084yuc EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, C58084yuc c58084yuc, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c58084yuc = application.EZpvd;
            }
            return application.OLrzqt(c58084yuc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C58084yuc KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull C58084yuc c58084yuc) {
            Intrinsics.checkNotNullParameter(c58084yuc, "");
            return new Application(c58084yuc);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.EZpvd, ((Application) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Connected(session=" + this.EZpvd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull C58084yuc c58084yuc) {
            super(null);
            Intrinsics.checkNotNullParameter(c58084yuc, "");
            this.EZpvd = c58084yuc;
        }
    }

    /* JADX INFO: renamed from: o.yuf$StateListAnimator */
    public static final class StateListAnimator extends AbstractC58087yuf {
        public static final StateListAnimator AEQbTJ = new StateListAnimator();

        private StateListAnimator() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.yuf$Activity */
    public static final class Activity extends AbstractC58087yuf {
        public static final Activity copydefault = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.yuf$ActionBar */
    public static final class ActionBar extends AbstractC58087yuf {
        public static final ActionBar EZpvd = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }
}

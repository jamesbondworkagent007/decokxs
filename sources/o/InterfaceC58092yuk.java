package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yuk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC58092yuk {

    /* JADX INFO: renamed from: o.yuk$Application */
    public interface Application {
        InterfaceC58092yuk AEQbTJ();
    }

    InterfaceC58090yui<Activity> AEQbTJ();

    boolean AEQbTJ(@NotNull AbstractC58082yua abstractC58082yua);

    boolean AEQbTJ(@NotNull C58088yug c58088yug);

    void EZpvd();

    /* JADX INFO: renamed from: o.yuk$Activity */
    public static abstract class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yuk.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        /* JADX INFO: renamed from: o.yuk$Activity$TaskDescription */
        public static final class TaskDescription<WEB_SOCKET> extends Activity {
            public final WEB_SOCKET KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yuk$Activity$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Object obj, int i, java.lang.Object obj2) {
                if ((i & 1) != 0) {
                    obj = taskDescription.KWHzl;
                }
                return taskDescription.copydefault(obj);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final WEB_SOCKET AEQbTJ() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription<WEB_SOCKET> copydefault(@NotNull WEB_SOCKET web_socket) {
                Intrinsics.checkNotNullParameter(web_socket, "");
                return new TaskDescription<>(web_socket);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.KWHzl, ((TaskDescription) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnConnectionOpened(webSocket=" + this.KWHzl + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull WEB_SOCKET web_socket) {
                super(null);
                Intrinsics.checkNotNullParameter(web_socket, "");
                this.KWHzl = web_socket;
            }
        }

        /* JADX INFO: renamed from: o.yuk$Activity$Activity, reason: collision with other inner class name */
        public static final class C1015Activity extends Activity {
            public final AbstractC58082yua OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C1015Activity copy$default(C1015Activity c1015Activity, AbstractC58082yua abstractC58082yua, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    abstractC58082yua = c1015Activity.OLrzqt;
                }
                return c1015Activity.KWHzl(abstractC58082yua);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final AbstractC58082yua AEQbTJ() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C1015Activity KWHzl(@NotNull AbstractC58082yua abstractC58082yua) {
                Intrinsics.checkNotNullParameter(abstractC58082yua, "");
                return new C1015Activity(abstractC58082yua);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1015Activity) && Intrinsics.EZpvd(this.OLrzqt, ((C1015Activity) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnMessageReceived(message=" + this.OLrzqt + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1015Activity(@NotNull AbstractC58082yua abstractC58082yua) {
                super(null);
                Intrinsics.checkNotNullParameter(abstractC58082yua, "");
                this.OLrzqt = abstractC58082yua;
            }
        }

        /* JADX INFO: renamed from: o.yuk$Activity$StateListAnimator */
        public static final class StateListAnimator extends Activity {
            public final C58088yug OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, C58088yug c58088yug, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    c58088yug = stateListAnimator.OLrzqt;
                }
                return stateListAnimator.OLrzqt(c58088yug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C58088yug KWHzl() {
                return this.OLrzqt;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final StateListAnimator OLrzqt(@NotNull C58088yug c58088yug) {
                Intrinsics.checkNotNullParameter(c58088yug, "");
                return new StateListAnimator(c58088yug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.OLrzqt, ((StateListAnimator) obj).OLrzqt);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.OLrzqt.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnConnectionClosing(shutdownReason=" + this.OLrzqt + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public StateListAnimator(@NotNull C58088yug c58088yug) {
                super(null);
                Intrinsics.checkNotNullParameter(c58088yug, "");
                this.OLrzqt = c58088yug;
            }
        }

        /* JADX INFO: renamed from: o.yuk$Activity$Application */
        public static final class Application extends Activity {
            public final C58088yug KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ Application copy$default(Application application, C58088yug c58088yug, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    c58088yug = application.KWHzl;
                }
                return application.KWHzl(c58088yug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C58088yug EZpvd() {
                return this.KWHzl;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Application KWHzl(@NotNull C58088yug c58088yug) {
                Intrinsics.checkNotNullParameter(c58088yug, "");
                return new Application(c58088yug);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Application) && Intrinsics.EZpvd(this.KWHzl, ((Application) obj).KWHzl);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.KWHzl.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "OnConnectionClosed(shutdownReason=" + this.KWHzl + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Application(@NotNull C58088yug c58088yug) {
                super(null);
                Intrinsics.checkNotNullParameter(c58088yug, "");
                this.KWHzl = c58088yug;
            }
        }

        /* JADX INFO: renamed from: o.yuk$Activity$ActionBar */
        public static final class ActionBar extends Activity {
            public final java.lang.Throwable KWHzl;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Throwable th, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    th = actionBar.KWHzl;
                }
                return actionBar.EZpvd(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final ActionBar EZpvd(@NotNull java.lang.Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                return new ActionBar(th);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final java.lang.Throwable KWHzl() {
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
                return "OnConnectionFailed(throwable=" + this.KWHzl + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActionBar(@NotNull java.lang.Throwable th) {
                super(null);
                Intrinsics.checkNotNullParameter(th, "");
                this.KWHzl = th;
            }
        }
    }
}

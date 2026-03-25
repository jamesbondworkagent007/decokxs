package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC58028ytZ;
import o.InterfaceC58092yuk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ytY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC58027ytY {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytY.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC58027ytY(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.ytY$StateListAnimator */
    public static abstract class StateListAnimator extends AbstractC58027ytY {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytY.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.ytY$StateListAnimator$Activity */
        public static final class Activity<T extends InterfaceC58028ytZ.StateListAnimator> extends StateListAnimator {
            public final T AEQbTJ;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytY$StateListAnimator$Activity */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Activity copy$default(Activity activity, InterfaceC58028ytZ.StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    stateListAnimator = activity.AEQbTJ;
                }
                return activity.KWHzl(stateListAnimator);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final Activity<T> KWHzl(@NotNull T t) {
                Intrinsics.checkNotNullParameter(t, "");
                return new Activity<>(t);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final T OLrzqt() {
                return this.AEQbTJ;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Activity) && Intrinsics.EZpvd(this.AEQbTJ, ((Activity) obj).AEQbTJ);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.AEQbTJ.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "StateChange(state=" + this.AEQbTJ + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Activity(@NotNull T t) {
                super(null);
                Intrinsics.checkNotNullParameter(t, "");
                this.AEQbTJ = t;
            }
        }

        private StateListAnimator() {
            super(null);
        }

        /* JADX INFO: renamed from: o.ytY$StateListAnimator$TaskDescription */
        public static final class TaskDescription extends StateListAnimator {
            public static final TaskDescription AEQbTJ = new TaskDescription();

            private TaskDescription() {
                super(null);
            }
        }
    }

    private AbstractC58027ytY() {
    }

    /* JADX INFO: renamed from: o.ytY$Application */
    public static abstract class Application extends AbstractC58027ytY {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytY.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: o.ytY$Application$TaskDescription */
        public static final class TaskDescription<T extends InterfaceC58092yuk.Activity> extends Application {
            public final T EZpvd;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytY$Application$TaskDescription */
            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, InterfaceC58092yuk.Activity activity, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    activity = taskDescription.EZpvd;
                }
                return taskDescription.OLrzqt(activity);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final T AEQbTJ() {
                return this.EZpvd;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final TaskDescription<T> OLrzqt(@NotNull T t) {
                Intrinsics.checkNotNullParameter(t, "");
                return new TaskDescription<>(t);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public boolean equals(java.lang.Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.EZpvd, ((TaskDescription) obj).EZpvd);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public int hashCode() {
                return this.EZpvd.hashCode();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "Event(event=" + this.EZpvd + ')';
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public TaskDescription(@NotNull T t) {
                super(null);
                Intrinsics.checkNotNullParameter(t, "");
                this.EZpvd = t;
            }
        }

        private Application() {
            super(null);
        }

        /* JADX INFO: renamed from: o.ytY$Application$ActionBar */
        public static final class ActionBar extends Application {
            public static final ActionBar copydefault = new ActionBar();

            private ActionBar() {
                super(null);
            }
        }
    }

    /* JADX INFO: renamed from: o.ytY$Activity */
    public static final class Activity<T extends AbstractC58087yuf> extends AbstractC58027ytY {
        public final T OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytY$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, AbstractC58087yuf abstractC58087yuf, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC58087yuf = activity.OLrzqt;
            }
            return activity.EZpvd(abstractC58087yuf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity<T> EZpvd(@NotNull T t) {
            Intrinsics.checkNotNullParameter(t, "");
            return new Activity<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T OLrzqt() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.OLrzqt, ((Activity) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OnStateChange(state=" + this.OLrzqt + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull T t) {
            super(null);
            Intrinsics.checkNotNullParameter(t, "");
            this.OLrzqt = t;
        }
    }

    /* JADX INFO: renamed from: o.ytY$TaskDescription */
    public static final class TaskDescription extends AbstractC58027ytY {
        public static final TaskDescription OLrzqt = new TaskDescription();

        private TaskDescription() {
            super(null);
        }
    }
}

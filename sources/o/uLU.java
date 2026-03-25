package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public abstract class uLU<T> {
    public static final StateListAnimator Companion = new StateListAnimator(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uLU.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ uLU(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T KWHzl();

    private uLU() {
    }

    public static final class ActionBar<T> extends uLU<T> {
        public final T EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uLU$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = actionBar.EZpvd;
            }
            return actionBar.copydefault(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.uLU
        public T KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar<T> copydefault(T t) {
            return new ActionBar<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.EZpvd, ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            T t = this.EZpvd;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(data=" + this.EZpvd + ")";
        }

        public ActionBar(T t) {
            super(null);
            this.EZpvd = t;
        }
    }

    public static final class TaskDescription<T> extends uLU<T> {
        public final boolean AEQbTJ;
        public final T EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public TaskDescription() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            this(false, defaultConstructorMarker, 3, defaultConstructorMarker);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uLU$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                z = taskDescription.AEQbTJ;
            }
            if ((i & 2) != 0) {
                obj = taskDescription.EZpvd;
            }
            return taskDescription.OLrzqt(z, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.uLU
        public T KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription<T> OLrzqt(boolean z, T t) {
            return new TaskDescription<>(z, t);
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
            return this.AEQbTJ == taskDescription.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, taskDescription.EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
            T t = this.EZpvd;
            return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Loading(isFirstLoad=" + this.AEQbTJ + ", data=" + this.EZpvd + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
 A[MD:(boolean, T):void (m)] (LINE:23) call: o.uLU.TaskDescription.<init>(boolean, java.lang.Object):void type: THIS */
        public /* synthetic */ TaskDescription(boolean z, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : obj);
        }

        public TaskDescription(boolean z, T t) {
            super(null);
            this.AEQbTJ = z;
            this.EZpvd = t;
        }
    }

    public static final class Activity<T> extends uLU<T> {
        public final java.lang.Throwable EZpvd;
        public final T OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.uLU$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Throwable th, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                th = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                obj = activity.OLrzqt;
            }
            return activity.AEQbTJ(th, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity<T> AEQbTJ(@NotNull java.lang.Throwable th, T t) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Activity<>(th, t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable EZpvd() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.uLU
        public T KWHzl() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.EZpvd.hashCode();
            T t = this.OLrzqt;
            return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(error=" + this.EZpvd + ", data=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Throwable)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
 A[MD:(java.lang.Throwable, T):void (m)] (LINE:32) call: o.uLU.Activity.<init>(java.lang.Throwable, java.lang.Object):void type: THIS */
        public /* synthetic */ Activity(java.lang.Throwable th, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.Throwable th, T t) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.EZpvd = th;
            this.OLrzqt = t;
        }
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.uLU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final <T> uLU<T> AEQbTJ(T t) {
            return new ActionBar(t);
        }

        public static /* synthetic */ uLU loading$default(StateListAnimator stateListAnimator, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                z = false;
            }
            return stateListAnimator.KWHzl(z, obj);
        }

        public final <T> uLU<T> KWHzl(boolean z, T t) {
            return new TaskDescription(z, t);
        }

        public static /* synthetic */ uLU loading$default(StateListAnimator stateListAnimator, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return stateListAnimator.EZpvd(z);
        }

        public final <T> uLU<T> EZpvd(boolean z) {
            return new TaskDescription(z, null);
        }

        public final <T> uLU<T> KWHzl(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new Activity(th, defaultConstructorMarker, 2, defaultConstructorMarker);
        }
    }

    public final T OLrzqt() {
        ActionBar actionBar = this instanceof ActionBar ? (ActionBar) this : null;
        if (actionBar != null) {
            return (T) actionBar.KWHzl();
        }
        return null;
    }
}

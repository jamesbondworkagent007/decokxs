package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tLk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC46197tLk<T> {
    public static final TaskDescription Companion = new TaskDescription(null);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tLk.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC46197tLk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T copydefault();

    private AbstractC46197tLk() {
    }

    /* JADX INFO: renamed from: o.tLk$Application */
    public static final class Application<T> extends AbstractC46197tLk<T> {
        public final T KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tLk$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = application.KWHzl;
            }
            return application.copydefault(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46197tLk
        public T copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application<T> copydefault(T t) {
            return new Application<>(t);
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
            T t = this.KWHzl;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(data=" + this.KWHzl + ")";
        }

        public Application(T t) {
            super(null);
            this.KWHzl = t;
        }
    }

    /* JADX INFO: renamed from: o.tLk$StateListAnimator */
    public static final class StateListAnimator<T> extends AbstractC46197tLk<T> {
        public final boolean AEQbTJ;
        public final T OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX WARN: Illegal instructions before constructor call */
        public StateListAnimator() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            this(false, defaultConstructorMarker, 3, defaultConstructorMarker);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tLk$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                z = stateListAnimator.AEQbTJ;
            }
            if ((i & 2) != 0) {
                obj = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.AEQbTJ(z, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator<T> AEQbTJ(boolean z, T t) {
            return new StateListAnimator<>(z, t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46197tLk
        public T copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StateListAnimator)) {
                return false;
            }
            StateListAnimator stateListAnimator = (StateListAnimator) obj;
            return this.AEQbTJ == stateListAnimator.AEQbTJ && Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
            T t = this.OLrzqt;
            return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Loading(isFirstLoad=" + this.AEQbTJ + ", data=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000a: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0005: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
 A[MD:(boolean, T):void (m)] (LINE:18) call: o.tLk.StateListAnimator.<init>(boolean, java.lang.Object):void type: THIS */
        public /* synthetic */ StateListAnimator(boolean z, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : obj);
        }

        public StateListAnimator(boolean z, T t) {
            super(null);
            this.AEQbTJ = z;
            this.OLrzqt = t;
        }
    }

    /* JADX INFO: renamed from: o.tLk$Activity */
    public static final class Activity<T> extends AbstractC46197tLk<T> {
        public final java.lang.Throwable AEQbTJ;
        public final T OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.tLk$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Throwable th, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                th = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                obj = activity.OLrzqt;
            }
            return activity.copydefault(th, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.AbstractC46197tLk
        public T copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity<T> copydefault(@NotNull java.lang.Throwable th, T t) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Activity<>(th, t);
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
            return Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = this.AEQbTJ.hashCode();
            T t = this.OLrzqt;
            return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(error=" + this.AEQbTJ + ", data=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.Throwable)
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
 A[MD:(java.lang.Throwable, T):void (m)] (LINE:26) call: o.tLk.Activity.<init>(java.lang.Throwable, java.lang.Object):void type: THIS */
        public /* synthetic */ Activity(java.lang.Throwable th, java.lang.Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(th, (i & 2) != 0 ? null : obj);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.lang.Throwable th, T t) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.AEQbTJ = th;
            this.OLrzqt = t;
        }
    }

    /* JADX INFO: renamed from: o.tLk$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tLk.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final <T> AbstractC46197tLk<T> KWHzl(T t) {
            return new Application(t);
        }

        public static /* synthetic */ AbstractC46197tLk loading$default(TaskDescription taskDescription, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                z = false;
            }
            return taskDescription.EZpvd(z, obj);
        }

        public final <T> AbstractC46197tLk<T> EZpvd(boolean z, T t) {
            return new StateListAnimator(z, t);
        }

        public static /* synthetic */ AbstractC46197tLk loading$default(TaskDescription taskDescription, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return taskDescription.OLrzqt(z);
        }

        public final <T> AbstractC46197tLk<T> OLrzqt(boolean z) {
            return new StateListAnimator(z, null);
        }

        public final <T> AbstractC46197tLk<T> OLrzqt(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new Activity(th, defaultConstructorMarker, 2, defaultConstructorMarker);
        }
    }

    public final T OLrzqt() {
        Application application = this instanceof Application ? (Application) this : null;
        if (application != null) {
            return (T) application.copydefault();
        }
        return null;
    }
}

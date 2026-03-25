package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DQ<T> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DQ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DQ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private DQ() {
    }

    public static final class ActionBar<T> extends DQ<T> {
        public final T AEQbTJ;
        public final int OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.DQ$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
            if ((i2 & 1) != 0) {
                i = actionBar.OLrzqt;
            }
            if ((i2 & 2) != 0) {
                obj = actionBar.AEQbTJ;
            }
            return actionBar.AEQbTJ(i, obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar<T> AEQbTJ(int i, T t) {
            return new ActionBar<>(i, t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T copydefault() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionBar)) {
                return false;
            }
            ActionBar actionBar = (ActionBar) obj;
            return this.OLrzqt == actionBar.OLrzqt && Intrinsics.EZpvd(this.AEQbTJ, actionBar.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            int iHashCode = java.lang.Integer.hashCode(this.OLrzqt);
            T t = this.AEQbTJ;
            return (iHashCode * 31) + (t == null ? 0 : t.hashCode());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Response(attempts=" + this.OLrzqt + ", response=" + this.AEQbTJ + ')';
        }

        public ActionBar(int i, T t) {
            super(null);
            this.OLrzqt = i;
            this.AEQbTJ = t;
        }
    }

    public static final class Activity extends DQ {
        public final int KWHzl;
        public final java.lang.Throwable copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, int i, java.lang.Throwable th, int i2, java.lang.Object obj) {
            if ((i2 & 1) != 0) {
                i = activity.KWHzl;
            }
            if ((i2 & 2) != 0) {
                th = activity.copydefault;
            }
            return activity.AEQbTJ(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity AEQbTJ(int i, @NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new Activity(i, th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable copydefault() {
            return this.copydefault;
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
            return this.KWHzl == activity.KWHzl && Intrinsics.EZpvd(this.copydefault, activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (java.lang.Integer.hashCode(this.KWHzl) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Exception(attempts=" + this.KWHzl + ", exception=" + this.copydefault + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(int i, @NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.KWHzl = i;
            this.copydefault = th;
        }
    }
}

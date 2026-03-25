package o;

import com.okinc.network.okg.config.NetworkStringEnum;
import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.rot, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC43419rot<T, E> {
    public static final int $stable = 0;
    public static final Application Companion = new Application(null);
    public static final java.lang.String TAG = "ApiResult";

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rot.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC43419rot(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC43419rot() {
    }

    /* JADX INFO: renamed from: o.rot$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rot.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    /* JADX INFO: renamed from: o.rot$StateListAnimator */
    public static final class StateListAnimator<T> extends AbstractC43419rot {
        public final T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rot$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = stateListAnimator.copydefault;
            }
            return stateListAnimator.OLrzqt(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator<T> OLrzqt(T t) {
            return new StateListAnimator<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.copydefault, ((StateListAnimator) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            T t = this.copydefault;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Ok(value=" + this.copydefault + ")";
        }

        public StateListAnimator(T t) {
            super(null);
            this.copydefault = t;
        }
    }

    /* JADX INFO: renamed from: o.rot$ActionBar */
    public static final class ActionBar<E> extends AbstractC43419rot {
        public final E AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rot$ActionBar */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = actionBar.AEQbTJ;
            }
            return actionBar.EZpvd(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar<E> EZpvd(E e) {
            return new ActionBar<>(e);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final E KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.AEQbTJ, ((ActionBar) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            E e = this.AEQbTJ;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(reason=" + this.AEQbTJ + ")";
        }

        public ActionBar(E e) {
            super(null);
            this.AEQbTJ = e;
        }
    }

    public final boolean EZpvd() {
        return this instanceof StateListAnimator;
    }

    public final boolean OLrzqt() {
        return this instanceof ActionBar;
    }

    public final T AEQbTJ() {
        if (this instanceof StateListAnimator) {
            return (T) ((StateListAnimator) this).KWHzl();
        }
        if (this instanceof ActionBar) {
            ActionBar actionBar = (ActionBar) this;
            if (actionBar.KWHzl() instanceof OKServerException) {
                throw ((java.lang.Throwable) actionBar.KWHzl());
            }
        }
        pUU.KWHzl(TAG, "got network error msg from getOrThrow");
        Function1<NetworkStringEnum, java.lang.String> function1ZsXlph = C43292rmY.OLrzqt.zsXlph();
        throw new java.lang.Exception(function1ZsXlph != null ? function1ZsXlph.invoke(NetworkStringEnum.NETWORK_ERROR) : null);
    }

    public final T copydefault() {
        if (this instanceof StateListAnimator) {
            return (T) ((StateListAnimator) this).KWHzl();
        }
        return null;
    }
}

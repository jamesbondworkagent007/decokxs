package o;

import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public abstract class lMD<T, E> {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lMD.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ lMD(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private lMD() {
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class TaskDescription<T> extends lMD {
        public final T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lMD$TaskDescription */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TaskDescription copy$default(TaskDescription taskDescription, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = taskDescription.copydefault;
            }
            return taskDescription.OLrzqt(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final TaskDescription<T> OLrzqt(T t) {
            return new TaskDescription<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TaskDescription) && Intrinsics.EZpvd(this.copydefault, ((TaskDescription) obj).copydefault);
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
            return "Success(paymentMethod=" + this.copydefault + ")";
        }

        public TaskDescription(T t) {
            super(null);
            this.copydefault = t;
        }
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator<T, E> extends lMD<T, E> {
        public static final int AEQbTJ = OKServerException.$stable;
        public final T OLrzqt;
        public final OKServerException copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.lMD$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.Object obj, OKServerException oKServerException, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = stateListAnimator.OLrzqt;
            }
            if ((i & 2) != 0) {
                oKServerException = stateListAnimator.copydefault;
            }
            return stateListAnimator.KWHzl(obj, oKServerException);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final OKServerException AEQbTJ() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator<T, E> KWHzl(T t, @NotNull OKServerException oKServerException) {
            Intrinsics.checkNotNullParameter(oKServerException, "");
            return new StateListAnimator<>(t, oKServerException);
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
            return Intrinsics.EZpvd(this.OLrzqt, stateListAnimator.OLrzqt) && Intrinsics.EZpvd(this.copydefault, stateListAnimator.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            T t = this.OLrzqt;
            return ((t == null ? 0 : t.hashCode()) * 31) + this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Error(paymentMethod=" + this.OLrzqt + ", exception=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(T t, @NotNull OKServerException oKServerException) {
            super(null);
            Intrinsics.checkNotNullParameter(oKServerException, "");
            this.OLrzqt = t;
            this.copydefault = oKServerException;
        }
    }
}

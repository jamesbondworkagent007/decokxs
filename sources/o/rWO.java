package o;

import com.okinc.network.okg.response.OKServerException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface rWO<T> {

    public static final class Activity<T> implements rWO<T> {
        public final T copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rWO$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.Object obj, int i, java.lang.Object obj2) {
            if ((i & 1) != 0) {
                obj = activity.copydefault;
            }
            return activity.AEQbTJ(obj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity<T> AEQbTJ(T t) {
            return new Activity<>(t);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final T copydefault() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.copydefault, ((Activity) obj).copydefault);
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
            return "CacheResponse(data=" + this.copydefault + ")";
        }

        public Activity(T t) {
            this.copydefault = t;
        }
    }

    public static final class StateListAnimator<T> implements rWO<T> {
        public static final int AEQbTJ = AbstractC43419rot.$stable;
        public final AbstractC43419rot<T, OKServerException> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.rWO$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, AbstractC43419rot abstractC43419rot, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC43419rot = stateListAnimator.OLrzqt;
            }
            return stateListAnimator.EZpvd(abstractC43419rot);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC43419rot<T, OKServerException> AEQbTJ() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator<T> EZpvd(@NotNull AbstractC43419rot<? extends T, OKServerException> abstractC43419rot) {
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            return new StateListAnimator<>(abstractC43419rot);
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
            return "NetworkResponse(data=" + this.OLrzqt + ")";
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: o.rot<? extends T, com.okinc.network.okg.response.OKServerException> */
        /* JADX WARN: Multi-variable type inference failed */
        public StateListAnimator(@NotNull AbstractC43419rot<? extends T, OKServerException> abstractC43419rot) {
            Intrinsics.checkNotNullParameter(abstractC43419rot, "");
            this.OLrzqt = abstractC43419rot;
        }
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC28538kcf {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kcf.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC28538kcf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.kcf$ActionBar */
    public static final class ActionBar extends AbstractC28538kcf {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    private AbstractC28538kcf() {
    }

    /* JADX INFO: renamed from: o.kcf$Activity */
    public static final class Activity extends AbstractC28538kcf {
        public final java.util.List<C28422kaV> KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.kcf$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = activity.KWHzl;
            }
            return activity.copydefault(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<C28422kaV> KWHzl() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.util.List<C28422kaV> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TokenList(tokens=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull java.util.List<C28422kaV> list) {
            super(null);
            Intrinsics.checkNotNullParameter(list, "");
            this.KWHzl = list;
        }
    }

    /* JADX INFO: renamed from: o.kcf$Application */
    public static final class Application extends AbstractC28538kcf {
        public static final Application EZpvd = new Application();

        private Application() {
            super(null);
        }
    }
}

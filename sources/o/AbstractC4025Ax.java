package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4025Ax {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ax.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC4025Ax(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC4025Ax() {
    }

    /* JADX INFO: renamed from: o.Ax$Activity */
    public static final class Activity extends AbstractC4025Ax {
        public static final Activity AEQbTJ = new Activity();

        private Activity() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.Ax$Application */
    public static final class Application extends AbstractC4025Ax {
        public final DL EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, DL dl, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                dl = application.EZpvd;
            }
            return application.AEQbTJ(dl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull DL dl) {
            Intrinsics.checkNotNullParameter(dl, "");
            return new Application(dl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final DL KWHzl() {
            return this.EZpvd;
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
            return "Http(url=" + this.EZpvd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull DL dl) {
            super(null);
            Intrinsics.checkNotNullParameter(dl, "");
            this.EZpvd = dl;
        }
    }
}

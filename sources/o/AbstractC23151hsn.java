package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hsn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC23151hsn {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.hsn.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC23151hsn(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC23151hsn() {
    }

    /* JADX INFO: renamed from: o.hsn$Application */
    public static final class Application extends AbstractC23151hsn {
        public static final Application OLrzqt = new Application();

        private Application() {
            super(null);
        }
    }

    /* JADX INFO: renamed from: o.hsn$ActionBar */
    public static final class ActionBar extends AbstractC23151hsn {
        public final java.lang.Throwable copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = actionBar.copydefault;
            }
            return actionBar.AEQbTJ(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(@NotNull java.lang.Throwable th) {
            Intrinsics.checkNotNullParameter(th, "");
            return new ActionBar(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.Throwable EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.copydefault, ((ActionBar) obj).copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PresetConfigError(error=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull java.lang.Throwable th) {
            super(null);
            Intrinsics.checkNotNullParameter(th, "");
            this.copydefault = th;
        }
    }
}

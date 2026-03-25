package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27123jpJ {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jpJ.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC27123jpJ(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: renamed from: o.jpJ$Application */
    public static final class Application extends AbstractC27123jpJ {
        public final InterfaceC26557jea AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, InterfaceC26557jea interfaceC26557jea, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC26557jea = application.AEQbTJ;
            }
            return application.copydefault(interfaceC26557jea);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC26557jea AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull InterfaceC26557jea interfaceC26557jea) {
            Intrinsics.checkNotNullParameter(interfaceC26557jea, "");
            return new Application(interfaceC26557jea);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.AEQbTJ, ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EligibilityCheckFailed(action=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull InterfaceC26557jea interfaceC26557jea) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC26557jea, "");
            this.AEQbTJ = interfaceC26557jea;
        }
    }

    private AbstractC27123jpJ() {
    }

    /* JADX INFO: renamed from: o.jpJ$ActionBar */
    public static final class ActionBar extends AbstractC27123jpJ {
        public final InterfaceC26561jee AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InterfaceC26561jee interfaceC26561jee, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC26561jee = actionBar.AEQbTJ;
            }
            return actionBar.copydefault(interfaceC26561jee);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC26561jee KWHzl() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar copydefault(@NotNull InterfaceC26561jee interfaceC26561jee) {
            Intrinsics.checkNotNullParameter(interfaceC26561jee, "");
            return new ActionBar(interfaceC26561jee);
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
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TokenInvestAction(action=" + this.AEQbTJ + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InterfaceC26561jee interfaceC26561jee) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC26561jee, "");
            this.AEQbTJ = interfaceC26561jee;
        }
    }
}

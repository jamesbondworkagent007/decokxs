package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class iOY {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iOY.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ iOY(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final class ActionBar extends iOY {
        public final InterfaceC26557jea OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, InterfaceC26557jea interfaceC26557jea, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC26557jea = actionBar.OLrzqt;
            }
            return actionBar.OLrzqt(interfaceC26557jea);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull InterfaceC26557jea interfaceC26557jea) {
            Intrinsics.checkNotNullParameter(interfaceC26557jea, "");
            return new ActionBar(interfaceC26557jea);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd(this.OLrzqt, ((ActionBar) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EligibilityCheckFailed(action=" + this.OLrzqt + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull InterfaceC26557jea interfaceC26557jea) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC26557jea, "");
            this.OLrzqt = interfaceC26557jea;
        }
    }

    private iOY() {
    }

    public static final class StateListAnimator extends iOY {
        public final InterfaceC26561jee KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, InterfaceC26561jee interfaceC26561jee, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                interfaceC26561jee = stateListAnimator.KWHzl;
            }
            return stateListAnimator.KWHzl(interfaceC26561jee);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator KWHzl(@NotNull InterfaceC26561jee interfaceC26561jee) {
            Intrinsics.checkNotNullParameter(interfaceC26561jee, "");
            return new StateListAnimator(interfaceC26561jee);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final InterfaceC26561jee copydefault() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd(this.KWHzl, ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "TokenInvestAction(action=" + this.KWHzl + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull InterfaceC26561jee interfaceC26561jee) {
            super(null);
            Intrinsics.checkNotNullParameter(interfaceC26561jee, "");
            this.KWHzl = interfaceC26561jee;
        }
    }
}

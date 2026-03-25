package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public abstract class NetworkKey {
    public static final Activity EZpvd = new Activity(null);
    public static final java.util.List<NetworkKey> AEQbTJ = yDY.gEmmrt(ActionBar.OLrzqt, Application.OLrzqt);

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkKey.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ NetworkKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract java.lang.String AEQbTJ();

    private NetworkKey() {
    }

    public static final class ActionBar extends NetworkKey {
        public static final ActionBar OLrzqt = new ActionBar();
        public static final java.lang.String copydefault = "PLAIN_TEXT_DOCUMENT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkKey
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "PlainTextDocument";
        }

        private ActionBar() {
            super(null);
        }
    }

    public static final class Application extends NetworkKey {
        public static final Application OLrzqt = new Application();
        public static final java.lang.String copydefault = "SEMI_STRUCTURED_DOCUMENT";

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkKey
        public java.lang.String AEQbTJ() {
            return copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SemiStructuredDocument";
        }

        private Application() {
            super(null);
        }
    }

    public static final class StateListAnimator extends NetworkKey {
        public final java.lang.String KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = stateListAnimator.KWHzl;
            }
            return stateListAnimator.EZpvd(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.NetworkKey
        public java.lang.String AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new StateListAnimator(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) ((StateListAnimator) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.KWHzl = str;
        }

        public java.lang.String toString() {
            return "SdkUnknown(" + AEQbTJ() + ')';
        }
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.NetworkKey.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final NetworkKey KWHzl(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "PLAIN_TEXT_DOCUMENT") ? ActionBar.OLrzqt : Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "SEMI_STRUCTURED_DOCUMENT") ? Application.OLrzqt : new StateListAnimator(str);
        }
    }
}

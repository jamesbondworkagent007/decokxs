package o;

import aws.sdk.kotlin.runtime.config.imds.EndpointMode;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class InputStreamReader {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.InputStreamReader.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ InputStreamReader(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InputStreamReader() {
    }

    public static final class ActionBar extends InputStreamReader {
        public static final ActionBar KWHzl = new ActionBar();

        private ActionBar() {
            super(null);
        }
    }

    public static final class Activity extends InputStreamReader {
        public final C57631ym copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, C57631ym c57631ym, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c57631ym = activity.copydefault;
            }
            return activity.OLrzqt(c57631ym);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C57631ym KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull C57631ym c57631ym) {
            Intrinsics.checkNotNullParameter(c57631ym, "");
            return new Activity(c57631ym);
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
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Custom(endpoint=" + this.copydefault + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Activity(@NotNull C57631ym c57631ym) {
            super(null);
            Intrinsics.checkNotNullParameter(c57631ym, "");
            this.copydefault = c57631ym;
        }
    }

    public static final class StateListAnimator extends InputStreamReader {
        public final EndpointMode EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, EndpointMode endpointMode, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                endpointMode = stateListAnimator.EZpvd;
            }
            return stateListAnimator.AEQbTJ(endpointMode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull EndpointMode endpointMode) {
            Intrinsics.checkNotNullParameter(endpointMode, "");
            return new StateListAnimator(endpointMode);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final EndpointMode copydefault() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StateListAnimator) && this.EZpvd == ((StateListAnimator) obj).EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ModeOverride(mode=" + this.EZpvd + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull EndpointMode endpointMode) {
            super(null);
            Intrinsics.checkNotNullParameter(endpointMode, "");
            this.EZpvd = endpointMode;
        }
    }
}

package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zyi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC60225zyi {
    public static final int $stable = 0;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.zyi.<init>():void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ AbstractC60225zyi(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC60225zyi() {
    }

    /* JADX INFO: renamed from: o.zyi$StateListAnimator */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class StateListAnimator extends AbstractC60225zyi {
        public static final int $stable = 0;
        public final AbstractC60226zyj copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ StateListAnimator copy$default(StateListAnimator stateListAnimator, AbstractC60226zyj abstractC60226zyj, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                abstractC60226zyj = stateListAnimator.copydefault;
            }
            return stateListAnimator.AEQbTJ(abstractC60226zyj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final StateListAnimator AEQbTJ(@NotNull AbstractC60226zyj abstractC60226zyj) {
            Intrinsics.checkNotNullParameter(abstractC60226zyj, "");
            return new StateListAnimator(abstractC60226zyj);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final AbstractC60226zyj copydefault() {
            return this.copydefault;
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
            return this.copydefault.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "NavigateTo(step=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StateListAnimator(@NotNull AbstractC60226zyj abstractC60226zyj) {
            super(null);
            Intrinsics.checkNotNullParameter(abstractC60226zyj, "");
            this.copydefault = abstractC60226zyj;
        }
    }

    /* JADX INFO: renamed from: o.zyi$ActionBar */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class ActionBar extends AbstractC60225zyi {
        public static final int $stable = 8;
        public final C60222zyf copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, C60222zyf c60222zyf, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                c60222zyf = actionBar.copydefault;
            }
            return actionBar.EZpvd(c60222zyf);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C60222zyf EZpvd() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar EZpvd(@NotNull C60222zyf c60222zyf) {
            Intrinsics.checkNotNullParameter(c60222zyf, "");
            return new ActionBar(c60222zyf);
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
            return "StateUpdated(state=" + this.copydefault + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActionBar(@NotNull C60222zyf c60222zyf) {
            super(null);
            Intrinsics.checkNotNullParameter(c60222zyf, "");
            this.copydefault = c60222zyf;
        }
    }

    /* JADX INFO: renamed from: o.zyi$Application */
    /* JADX INFO: loaded from: classes25.dex */
    public static final class Application extends AbstractC60225zyi {
        public static final int $stable = 0;
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            return application.copydefault(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((Application) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "OpenExternalLink(link=" + this.EZpvd + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Application(@NotNull java.lang.String str) {
            super(null);
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}

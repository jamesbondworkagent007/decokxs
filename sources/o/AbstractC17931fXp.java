package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fXp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC17931fXp {
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.fXo
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return AbstractC17931fXp.OLrzqt();
        }
    });

    /* JADX INFO: renamed from: o.fXp$Activity */
    public interface Activity {
        void copydefault();
    }

    public abstract void copydefault(@NotNull StateListAnimator stateListAnimator);

    public final void AEQbTJ(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        copydefault(stateListAnimator);
        java.util.Iterator<T> it = copydefault().iterator();
        while (it.hasNext()) {
            ((Activity) it.next()).copydefault();
        }
    }

    public static final java.util.ArrayList OLrzqt() {
        return new java.util.ArrayList();
    }

    public final java.util.ArrayList<Activity> copydefault() {
        return (java.util.ArrayList) this.OLrzqt.getValue();
    }

    public final void OLrzqt(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        copydefault().add(activity);
    }

    public final void AEQbTJ(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        copydefault().remove(activity);
    }

    /* JADX INFO: renamed from: o.fXp$StateListAnimator */
    public interface StateListAnimator {

        /* JADX INFO: renamed from: o.fXp$StateListAnimator$ActionBar */
        public static final class ActionBar implements StateListAnimator {
            public static final ActionBar KWHzl = new ActionBar();

            private ActionBar() {
            }
        }

        /* JADX INFO: renamed from: o.fXp$StateListAnimator$StateListAnimator, reason: collision with other inner class name */
        public static final class C0846StateListAnimator implements StateListAnimator {
            public final java.lang.String OLrzqt;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static /* synthetic */ C0846StateListAnimator copy$default(C0846StateListAnimator c0846StateListAnimator, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = c0846StateListAnimator.OLrzqt;
                }
                return c0846StateListAnimator.AEQbTJ(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public final C0846StateListAnimator AEQbTJ(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                return new C0846StateListAnimator(str);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public java.lang.String toString() {
                return "WalletKey(walletId=" + this.OLrzqt + ")";
            }

            public C0846StateListAnimator(@NotNull java.lang.String str) {
                Intrinsics.checkNotNullParameter(str, "");
                this.OLrzqt = str;
            }

            public boolean equals(java.lang.Object obj) {
                return (obj instanceof C0846StateListAnimator) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) ((C0846StateListAnimator) obj).OLrzqt);
            }

            public int hashCode() {
                return this.OLrzqt.hashCode();
            }
        }
    }
}

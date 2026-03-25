package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ayf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC8222ayf {

    /* JADX INFO: renamed from: o.ayf$Application */
    public static final class Application implements InterfaceC8222ayf {
        public final java.lang.String AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.AEQbTJ;
            }
            return application.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) ((Application) obj).AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "MainAccount(email=" + this.AEQbTJ + ")";
        }

        public Application(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
        }
    }

    /* JADX INFO: renamed from: o.ayf$ActionBar */
    public static final class ActionBar implements InterfaceC8222ayf {
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = actionBar.EZpvd;
            }
            return actionBar.OLrzqt(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            return new ActionBar(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) ((ActionBar) obj).EZpvd);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.EZpvd.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "SubAccount(email=" + this.EZpvd + ")";
        }

        public ActionBar(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
        }
    }
}

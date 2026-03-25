package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public abstract class tTL {
    public final java.lang.String AYXKKw;
    public final java.util.Map<java.lang.String, Application> gEmmrt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.Map<java.lang.String, Application> copydefault() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String djBIcL() {
        return this.AYXKKw;
    }

    public tTL(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AYXKKw = str;
        this.gEmmrt = C56424yEw.KWHzl();
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Application {
        public final java.lang.String EZpvd;
        public final boolean OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                z = application.OLrzqt;
            }
            return application.OLrzqt(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Application(str, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && this.OLrzqt == application.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + java.lang.Boolean.hashCode(this.OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Param(value=" + this.EZpvd + ", enumerable=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            this.EZpvd = str;
            this.OLrzqt = z;
        }
    }
}

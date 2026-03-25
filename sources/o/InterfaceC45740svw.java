package o;

import com.immomo.mls.fun.lt.SILoading;
import com.okinc.okex.lite.hero.data.model.HeroContent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.svw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC45740svw {

    /* JADX INFO: renamed from: o.svw$Activity */
    public static final class Activity implements InterfaceC45740svw {
        public final HeroContent KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, HeroContent heroContent, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                heroContent = activity.KWHzl;
            }
            return activity.copydefault(heroContent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final HeroContent OLrzqt() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull HeroContent heroContent) {
            Intrinsics.checkNotNullParameter(heroContent, "");
            return new Activity(heroContent);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Activity) && Intrinsics.EZpvd(this.KWHzl, ((Activity) obj).KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.KWHzl.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(content=" + this.KWHzl + ")";
        }

        public Activity(@NotNull HeroContent heroContent) {
            Intrinsics.checkNotNullParameter(heroContent, "");
            this.KWHzl = heroContent;
        }
    }

    /* JADX INFO: renamed from: o.svw$Application */
    public static final class Application implements InterfaceC45740svw {
        public static final Application EZpvd = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return 1267008785;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return SILoading.LUA_CLASS_NAME;
        }

        private Application() {
        }
    }
}

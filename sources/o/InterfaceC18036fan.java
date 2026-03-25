package o;

import com.okinc.business.defi.biz.net.bean.Article;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fan, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public interface InterfaceC18036fan {

    /* JADX INFO: renamed from: o.fan$ActionBar */
    public static final class ActionBar implements InterfaceC18036fan {
        public final boolean KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ ActionBar copy$default(ActionBar actionBar, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = actionBar.KWHzl;
            }
            return actionBar.AEQbTJ(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final ActionBar AEQbTJ(boolean z) {
            return new ActionBar(z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean AEQbTJ() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActionBar) && this.KWHzl == ((ActionBar) obj).KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Placeholder(isImageLoading=" + this.KWHzl + ")";
        }

        public ActionBar(boolean z) {
            this.KWHzl = z;
        }
    }

    /* JADX INFO: renamed from: o.fan$TaskDescription */
    public static final class TaskDescription implements InterfaceC18036fan {
        public final Article KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Article EZpvd() {
            return this.KWHzl;
        }

        public TaskDescription(@NotNull Article article) {
            Intrinsics.checkNotNullParameter(article, "");
            this.KWHzl = article;
        }
    }
}

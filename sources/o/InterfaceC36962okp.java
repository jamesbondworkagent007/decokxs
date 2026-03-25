package o;

import com.okinc.im.imui.sticker.model.StickerPackModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.okp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC36962okp {

    /* JADX INFO: renamed from: o.okp$ActionBar */
    public static final class ActionBar implements InterfaceC36962okp {
        public static final ActionBar OLrzqt = new ActionBar();

        private ActionBar() {
        }
    }

    /* JADX INFO: renamed from: o.okp$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC36962okp {
        public static final StateListAnimator copydefault = new StateListAnimator();

        private StateListAnimator() {
        }
    }

    /* JADX INFO: renamed from: o.okp$Application */
    public static final class Application implements InterfaceC36962okp {
        public final java.util.List<StickerPackModel> OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.okp$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.util.List list, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                list = application.OLrzqt;
            }
            return application.EZpvd(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<StickerPackModel> EZpvd() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application EZpvd(@NotNull java.util.List<StickerPackModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            return new Application(list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Application) && Intrinsics.EZpvd(this.OLrzqt, ((Application) obj).OLrzqt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return this.OLrzqt.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Success(packList=" + this.OLrzqt + ")";
        }

        public Application(@NotNull java.util.List<StickerPackModel> list) {
            Intrinsics.checkNotNullParameter(list, "");
            this.OLrzqt = list;
        }
    }
}

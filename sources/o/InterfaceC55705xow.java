package o;

import com.okinc.core.widget.SortTextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xow, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC55705xow {
    void EZpvd();

    void OLrzqt(SortTextView.SortType sortType);

    void copydefault(@NotNull java.lang.Object obj);

    /* JADX INFO: renamed from: o.xow$Application */
    public static final class Application {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static void EZpvd(@NotNull InterfaceC55705xow interfaceC55705xow, @NotNull java.lang.Object obj) {
            Intrinsics.checkNotNullParameter(obj, "");
        }

        public static /* synthetic */ void refresh$default(InterfaceC55705xow interfaceC55705xow, SortTextView.SortType sortType, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refresh");
            }
            if ((i & 1) != 0) {
                sortType = null;
            }
            interfaceC55705xow.OLrzqt(sortType);
        }
    }
}

package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public interface InterfaceC55114xdo extends InterfaceC33075mpc {
    void cancelToast();

    void destroy();

    void showToast(@androidx.annotation.StringRes int i, int i2);

    /* JADX INFO: renamed from: o.xdo$TaskDescription */
    public static final class TaskDescription {
        public static void OLrzqt(@NotNull InterfaceC55114xdo interfaceC55114xdo) {
        }

        public static /* synthetic */ void showToast$default(InterfaceC55114xdo interfaceC55114xdo, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showToast");
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            interfaceC55114xdo.showToast(i, i2);
        }
    }
}

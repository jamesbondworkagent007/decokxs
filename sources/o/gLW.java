package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public interface gLW {
    void copydefault(@NotNull android.content.Context context, boolean z);

    public static final class ActionBar {
        public static /* synthetic */ void navigateToRenewOrReenableSA$default(gLW glw, android.content.Context context, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateToRenewOrReenableSA");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            glw.copydefault(context, z);
        }
    }
}

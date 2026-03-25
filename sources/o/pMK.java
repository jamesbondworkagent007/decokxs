package o;

import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public interface pMK {
    StateFlow<java.lang.Boolean> AEQbTJ();

    void EZpvd(@NotNull android.content.Context context, boolean z);

    boolean KWHzl();

    void OLrzqt(@NotNull android.content.Context context, boolean z);

    public static final class Application {
        public static /* synthetic */ void login$default(pMK pmk, android.content.Context context, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: login");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            pmk.OLrzqt(context, z);
        }

        public static /* synthetic */ void signUp$default(pMK pmk, android.content.Context context, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUp");
            }
            if ((i & 2) != 0) {
                z = true;
            }
            pmk.EZpvd(context, z);
        }
    }
}

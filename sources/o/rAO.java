package o;

import com.okinc.ok_kyc_core_api.ResultBackStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public interface rAO {
    void KWHzl(int i);

    void copydefault();

    void copydefault(ResultBackStatus resultBackStatus);

    public static final class ActionBar {
        public static void KWHzl(@NotNull rAO rao) {
        }

        public static /* synthetic */ void onStepperClose$default(rAO rao, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onStepperClose");
            }
            if ((i2 & 1) != 0) {
                i = 0;
            }
            rao.KWHzl(i);
        }
    }
}

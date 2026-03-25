package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public interface mTI {
    void OLrzqt(@NotNull C36250oUv c36250oUv, pGY pgy, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z);

    public static final class StateListAnimator {
        public static /* synthetic */ void initChartView$default(mTI mti, C36250oUv c36250oUv, pGY pgy, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initChartView");
            }
            if ((i & 32) != 0) {
                z = false;
            }
            mti.OLrzqt(c36250oUv, pgy, str, str2, str3, z);
        }
    }
}

package o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hSc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC21944hSc {
    void OLrzqt(@NotNull C36250oUv c36250oUv, pGY pgy, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, boolean z);

    /* JADX INFO: renamed from: o.hSc$Activity */
    public static final class Activity {
        public static /* synthetic */ void initChartView$default(InterfaceC21944hSc interfaceC21944hSc, C36250oUv c36250oUv, pGY pgy, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initChartView");
            }
            if ((i & 32) != 0) {
                z = false;
            }
            interfaceC21944hSc.OLrzqt(c36250oUv, pgy, str, str2, str3, z);
        }
    }
}

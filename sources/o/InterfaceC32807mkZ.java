package o;

import com.okinc.components.security.api.RiskLevel;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mkZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC32807mkZ extends InterfaceC43217rlC {
    boolean AEQbTJ(@NotNull java.lang.String str);

    RiskLevel EZpvd(java.util.List<java.lang.String> list);

    void EZpvd();

    void KWHzl(@NotNull android.content.Context context);

    boolean KWHzl();

    boolean KWHzl(java.util.List<java.lang.String> list);

    void OLrzqt(@NotNull android.content.Context context, @NotNull java.lang.String str);

    /* JADX INFO: renamed from: o.mkZ$StateListAnimator */
    public static final class StateListAnimator {
        public static /* synthetic */ void openUI$default(InterfaceC32807mkZ interfaceC32807mkZ, android.content.Context context, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openUI");
            }
            if ((i & 2) != 0) {
                str = "cefi";
            }
            interfaceC32807mkZ.OLrzqt(context, str);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mkZ */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean hasRisk$default(InterfaceC32807mkZ interfaceC32807mkZ, java.util.List list, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasRisk");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return interfaceC32807mkZ.KWHzl((java.util.List<java.lang.String>) list);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mkZ */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RiskLevel checkRiskLevel$default(InterfaceC32807mkZ interfaceC32807mkZ, java.util.List list, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkRiskLevel");
            }
            if ((i & 1) != 0) {
                list = null;
            }
            return interfaceC32807mkZ.EZpvd(list);
        }

        public static /* synthetic */ boolean isSkipDeviceScan$default(InterfaceC32807mkZ interfaceC32807mkZ, java.lang.String str, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isSkipDeviceScan");
            }
            if ((i & 1) != 0) {
                str = "cefi";
            }
            return interfaceC32807mkZ.AEQbTJ(str);
        }
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC52697wV extends InterfaceC5047Cr {
    public static final Activity copydefault = Activity.KWHzl;

    java.lang.String EZpvd();

    java.lang.String KWHzl();

    java.lang.String copydefault();

    java.lang.String djBIcL();

    /* JADX INFO: renamed from: o.wV$Activity */
    public static final class Activity {
        public static final /* synthetic */ Activity KWHzl = new Activity();

        private Activity() {
        }

        /* JADX DEBUG: Failed to insert an additional move for type inference into block B:14:0x0036 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
        /* JADX WARN: Type inference failed for: r12v0, types: [o.yq] */
        /* JADX WARN: Type inference failed for: r12v1, types: [o.yq] */
        /* JADX WARN: Type inference failed for: r12v2 */
        /* JADX WARN: Type inference failed for: r12v4, types: [o.yA] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r5v0, types: [o.yq] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final InterfaceC52697wV copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2, java.lang.String str3, C5173Hn c5173Hn, java.lang.String str4, InterfaceC57843yq interfaceC57843yq) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            if (str4 != null) {
                if (!Intrinsics.EZpvd((java.lang.Object) (interfaceC57843yq != 0 ? (java.lang.String) interfaceC57843yq.OLrzqt(C5046Cq.AEQbTJ.EZpvd()) : null), (java.lang.Object) str4)) {
                    if (interfaceC57843yq != 0) {
                        InterfaceC56293yA interfaceC56293yAOLrzqt = C58108yv.OLrzqt(interfaceC57843yq);
                        interfaceC57843yq = interfaceC56293yAOLrzqt;
                        if (interfaceC56293yAOLrzqt == null) {
                            interfaceC57843yq = C58108yv.AEQbTJ();
                        }
                        C58108yv.AEQbTJ(interfaceC57843yq, C5046Cq.AEQbTJ.EZpvd(), str4);
                    }
                }
            } else if (interfaceC57843yq == 0) {
                interfaceC57843yq = C58108yv.copydefault();
            }
            return new C52670wU(str, str2, str3, c5173Hn, interfaceC57843yq);
        }
    }

    /* JADX INFO: renamed from: o.wV$TaskDescription */
    public static final class TaskDescription {
        public static java.lang.String copydefault(@NotNull InterfaceC52697wV interfaceC52697wV) {
            return (java.lang.String) interfaceC52697wV.OLrzqt().OLrzqt(C5046Cq.AEQbTJ.EZpvd());
        }
    }
}

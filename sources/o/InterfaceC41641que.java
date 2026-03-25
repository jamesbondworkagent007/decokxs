package o;

import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41645qui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.que, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41641que extends InterfaceC41645qui<InterfaceC41641que>, qWP<InterfaceC41641que> {
    InterfaceC41641que AEQbTJ(java.lang.String str);

    java.lang.String AYXKKw();

    java.lang.String AhwBna();

    java.lang.Double AuCTel();

    InterfaceC41641que EZpvd(boolean z);

    java.lang.Double KWHzl();

    InterfaceC41641que OLrzqt(java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str);

    InterfaceC41641que copydefault(boolean z);

    java.lang.Double djBIcL();

    java.lang.Object ejfBZ();

    BigDecimal fIwbmz();

    BigDecimal fJNWhG();

    SpotInstrument values();

    /* JADX INFO: renamed from: o.que$Application */
    public static final class Application {
        public static InterfaceC55797xqi copydefault(@NotNull InterfaceC41641que interfaceC41641que) {
            return InterfaceC41645qui.TaskDescription.AEQbTJ(interfaceC41641que);
        }

        public static BizInstrument AEQbTJ(@NotNull InterfaceC41641que interfaceC41641que) {
            return interfaceC41641que.values();
        }

        public static /* synthetic */ InterfaceC41641que onCopy$default(InterfaceC41641que interfaceC41641que, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCopy");
            }
            if ((i & 1) != 0) {
                d = interfaceC41641que.KWHzl();
            }
            if ((i & 2) != 0) {
                d2 = interfaceC41641que.djBIcL();
            }
            java.lang.Double d4 = d2;
            if ((i & 4) != 0) {
                d3 = interfaceC41641que.AuCTel();
            }
            java.lang.Double d5 = d3;
            if ((i & 8) != 0) {
                bigDecimal = interfaceC41641que.fIwbmz();
            }
            BigDecimal bigDecimal3 = bigDecimal;
            if ((i & 16) != 0) {
                bigDecimal2 = interfaceC41641que.fJNWhG();
            }
            BigDecimal bigDecimal4 = bigDecimal2;
            if ((i & 32) != 0) {
                obj = interfaceC41641que.ejfBZ();
            }
            java.lang.Object obj3 = obj;
            if ((i & 64) != 0) {
                str = interfaceC41641que.AhwBna();
            }
            return interfaceC41641que.OLrzqt(d, d4, d5, bigDecimal3, bigDecimal4, obj3, str);
        }

        public static boolean copydefault(@NotNull InterfaceC41641que interfaceC41641que, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            if (interfaceC40516qYt instanceof InterfaceC41641que) {
                InterfaceC41641que interfaceC41641que2 = (InterfaceC41641que) interfaceC40516qYt;
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC41641que.values().getInstId(), (java.lang.Object) interfaceC41641que2.values().getInstId()) && Intrinsics.EZpvd(interfaceC41641que.ejfBZ(), interfaceC41641que2.ejfBZ()) && Intrinsics.EZpvd((java.lang.Object) interfaceC41641que.AhwBna(), (java.lang.Object) interfaceC41641que2.AhwBna())) {
                    return true;
                }
            }
            return false;
        }

        public static boolean EZpvd(@NotNull InterfaceC41641que interfaceC41641que, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof InterfaceC41641que) && Intrinsics.EZpvd(interfaceC41641que, interfaceC40516qYt);
        }

        public static InterfaceC41641que KWHzl(@NotNull InterfaceC41641que interfaceC41641que, boolean z) {
            return interfaceC41641que.DbNXlk() != z ? interfaceC41641que.EZpvd(z) : interfaceC41641que;
        }

        public static InterfaceC41641que EZpvd(@NotNull InterfaceC41641que interfaceC41641que, java.lang.String str) {
            return !Intrinsics.EZpvd((java.lang.Object) interfaceC41641que.gEmmrt(), (java.lang.Object) str) ? interfaceC41641que.AEQbTJ(str) : interfaceC41641que;
        }
    }
}

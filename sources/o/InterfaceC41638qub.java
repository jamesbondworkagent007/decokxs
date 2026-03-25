package o;

import com.okinc.unify_trade.biz.BizInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41645qui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41638qub extends InterfaceC41645qui<InterfaceC41638qub>, qWP<InterfaceC41638qub> {
    InterfaceC41638qub AEQbTJ(boolean z);

    java.lang.String AYXKKw();

    java.lang.Double AhwBna();

    BigDecimal AuCTel();

    InterfaceC41638qub EZpvd(boolean z);

    java.lang.Double KWHzl();

    InterfaceC41638qub KWHzl(java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str);

    InterfaceC41638qub KWHzl(java.lang.String str);

    java.lang.String OLrzqt();

    java.lang.String copydefault();

    java.lang.String djBIcL();

    java.lang.String ejfBZ();

    BigDecimal fARcdN();

    java.lang.Double fIwbmz();

    java.lang.Object fetchVPNInfo();

    java.lang.String isConnected();

    BizInstrument values();

    /* JADX INFO: renamed from: o.qub$ActionBar */
    public static final class ActionBar {
        public static InterfaceC55797xqi EZpvd(@NotNull InterfaceC41638qub interfaceC41638qub) {
            return InterfaceC41645qui.TaskDescription.AEQbTJ(interfaceC41638qub);
        }

        public static BizInstrument AEQbTJ(@NotNull InterfaceC41638qub interfaceC41638qub) {
            return interfaceC41638qub.values();
        }

        public static /* synthetic */ InterfaceC41638qub onCopy$default(InterfaceC41638qub interfaceC41638qub, java.lang.Double d, java.lang.Double d2, java.lang.Double d3, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, java.lang.String str, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCopy");
            }
            if ((i & 1) != 0) {
                d = interfaceC41638qub.KWHzl();
            }
            if ((i & 2) != 0) {
                d2 = interfaceC41638qub.AhwBna();
            }
            java.lang.Double d4 = d2;
            if ((i & 4) != 0) {
                d3 = interfaceC41638qub.fIwbmz();
            }
            java.lang.Double d5 = d3;
            if ((i & 8) != 0) {
                bigDecimal = interfaceC41638qub.AuCTel();
            }
            BigDecimal bigDecimal3 = bigDecimal;
            if ((i & 16) != 0) {
                bigDecimal2 = interfaceC41638qub.fARcdN();
            }
            BigDecimal bigDecimal4 = bigDecimal2;
            if ((i & 32) != 0) {
                obj = interfaceC41638qub.fetchVPNInfo();
            }
            java.lang.Object obj3 = obj;
            if ((i & 64) != 0) {
                str = interfaceC41638qub.AYXKKw();
            }
            return interfaceC41638qub.KWHzl(d, d4, d5, bigDecimal3, bigDecimal4, obj3, str);
        }

        public static boolean KWHzl(@NotNull InterfaceC41638qub interfaceC41638qub, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            if (interfaceC40516qYt instanceof InterfaceC41638qub) {
                InterfaceC41638qub interfaceC41638qub2 = (InterfaceC41638qub) interfaceC40516qYt;
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC41638qub.values().getInstId(), (java.lang.Object) interfaceC41638qub2.values().getInstId()) && Intrinsics.EZpvd(interfaceC41638qub.fetchVPNInfo(), interfaceC41638qub2.fetchVPNInfo()) && Intrinsics.EZpvd((java.lang.Object) interfaceC41638qub.AYXKKw(), (java.lang.Object) interfaceC41638qub2.AYXKKw())) {
                    return true;
                }
            }
            return false;
        }

        public static boolean EZpvd(@NotNull InterfaceC41638qub interfaceC41638qub, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof InterfaceC41638qub) && Intrinsics.EZpvd(interfaceC41638qub, interfaceC40516qYt);
        }

        public static InterfaceC41638qub KWHzl(@NotNull InterfaceC41638qub interfaceC41638qub, boolean z) {
            return interfaceC41638qub.DbNXlk() != z ? interfaceC41638qub.EZpvd(z) : interfaceC41638qub;
        }

        public static InterfaceC41638qub EZpvd(@NotNull InterfaceC41638qub interfaceC41638qub, java.lang.String str) {
            return !Intrinsics.EZpvd((java.lang.Object) interfaceC41638qub.gEmmrt(), (java.lang.Object) str) ? interfaceC41638qub.KWHzl(str) : interfaceC41638qub;
        }
    }
}

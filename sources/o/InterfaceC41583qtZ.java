package o;

import com.okinc.unify_trade.biz.TradeCoinInfo;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qtZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41583qtZ extends InterfaceC41643qug, qWP<InterfaceC41583qtZ> {
    InterfaceC41583qtZ AEQbTJ(boolean z);

    java.lang.String EZpvd();

    InterfaceC41583qtZ EZpvd(boolean z);

    BigDecimal KWHzl();

    InterfaceC41583qtZ OLrzqt(java.lang.Double d, BigDecimal bigDecimal, java.lang.Object obj);

    java.lang.Double copydefault();

    TradeCoinInfo djBIcL();

    java.lang.Object gEmmrt();

    /* JADX INFO: renamed from: o.qtZ$Activity */
    public static final class Activity {
        public static /* synthetic */ InterfaceC41583qtZ onCopy$default(InterfaceC41583qtZ interfaceC41583qtZ, java.lang.Double d, BigDecimal bigDecimal, java.lang.Object obj, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCopy");
            }
            if ((i & 1) != 0) {
                d = interfaceC41583qtZ.copydefault();
            }
            if ((i & 2) != 0) {
                bigDecimal = interfaceC41583qtZ.KWHzl();
            }
            if ((i & 4) != 0) {
                obj = interfaceC41583qtZ.gEmmrt();
            }
            return interfaceC41583qtZ.OLrzqt(d, bigDecimal, obj);
        }

        public static boolean AEQbTJ(@NotNull InterfaceC41583qtZ interfaceC41583qtZ, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            if (interfaceC40516qYt instanceof InterfaceC41583qtZ) {
                InterfaceC41583qtZ interfaceC41583qtZ2 = (InterfaceC41583qtZ) interfaceC40516qYt;
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC41583qtZ.djBIcL().getSymbol(), (java.lang.Object) interfaceC41583qtZ2.djBIcL().getSymbol()) && Intrinsics.EZpvd(interfaceC41583qtZ.gEmmrt(), interfaceC41583qtZ2.gEmmrt())) {
                    return true;
                }
            }
            return false;
        }

        public static boolean copydefault(@NotNull InterfaceC41583qtZ interfaceC41583qtZ, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof InterfaceC41583qtZ) && Intrinsics.EZpvd(interfaceC41583qtZ, interfaceC40516qYt);
        }

        public static InterfaceC41583qtZ AEQbTJ(@NotNull InterfaceC41583qtZ interfaceC41583qtZ, boolean z) {
            return interfaceC41583qtZ.DbNXlk() != z ? interfaceC41583qtZ.AEQbTJ(z) : interfaceC41583qtZ;
        }
    }
}

package o;

import com.okinc.market.quotation.data.util.TwoKeyMap;
import com.okinc.unify_trade.biz.DexInstrument;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC41645qui;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qus, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC41655qus extends InterfaceC41645qui<InterfaceC41655qus>, qWP<InterfaceC41655qus>, TwoKeyMap.StateListAnimator<java.lang.String, java.lang.String> {
    BigDecimal AYXKKw();

    BigDecimal AhwBna();

    java.lang.String EZpvd();

    InterfaceC41655qus EZpvd(boolean z);

    java.lang.Double KWHzl();

    InterfaceC41655qus KWHzl(java.lang.String str);

    InterfaceC41655qus KWHzl(boolean z);

    java.lang.Boolean OLrzqt();

    InterfaceC41655qus OLrzqt(java.lang.String str);

    DexInstrument copydefault();

    InterfaceC41655qus copydefault(java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj);

    java.lang.Double djBIcL();

    java.lang.Boolean fetchVPNInfo();

    java.lang.Object isConnected();

    BigDecimal values();

    /* JADX INFO: renamed from: o.qus$ActionBar */
    public static final class ActionBar {
        public static InterfaceC55797xqi KWHzl(@NotNull InterfaceC41655qus interfaceC41655qus) {
            return InterfaceC41645qui.TaskDescription.AEQbTJ(interfaceC41655qus);
        }

        public static InterfaceC55797xqi OLrzqt(@NotNull InterfaceC41655qus interfaceC41655qus) {
            return interfaceC41655qus.copydefault();
        }

        public static /* synthetic */ InterfaceC41655qus onCopy$default(InterfaceC41655qus interfaceC41655qus, java.lang.Double d, java.lang.Double d2, BigDecimal bigDecimal, BigDecimal bigDecimal2, java.lang.Object obj, int i, java.lang.Object obj2) {
            if (obj2 != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCopy");
            }
            if ((i & 1) != 0) {
                d = interfaceC41655qus.KWHzl();
            }
            if ((i & 2) != 0) {
                d2 = interfaceC41655qus.djBIcL();
            }
            java.lang.Double d3 = d2;
            if ((i & 4) != 0) {
                bigDecimal = interfaceC41655qus.values();
            }
            BigDecimal bigDecimal3 = bigDecimal;
            if ((i & 8) != 0) {
                bigDecimal2 = interfaceC41655qus.AhwBna();
            }
            BigDecimal bigDecimal4 = bigDecimal2;
            if ((i & 16) != 0) {
                obj = interfaceC41655qus.isConnected();
            }
            return interfaceC41655qus.copydefault(d, d3, bigDecimal3, bigDecimal4, obj);
        }

        public static boolean OLrzqt(@NotNull InterfaceC41655qus interfaceC41655qus, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            if (interfaceC40516qYt instanceof InterfaceC41655qus) {
                InterfaceC41655qus interfaceC41655qus2 = (InterfaceC41655qus) interfaceC40516qYt;
                if (Intrinsics.EZpvd((java.lang.Object) interfaceC41655qus.copydefault().getTokenContractAddress(), (java.lang.Object) interfaceC41655qus2.copydefault().getTokenContractAddress()) && Intrinsics.EZpvd((java.lang.Object) interfaceC41655qus.copydefault().getChainId(), (java.lang.Object) interfaceC41655qus2.copydefault().getChainId()) && Intrinsics.EZpvd(interfaceC41655qus.isConnected(), interfaceC41655qus2.isConnected())) {
                    return true;
                }
            }
            return false;
        }

        public static boolean copydefault(@NotNull InterfaceC41655qus interfaceC41655qus, @NotNull InterfaceC40516qYt interfaceC40516qYt) {
            Intrinsics.checkNotNullParameter(interfaceC40516qYt, "");
            return (interfaceC40516qYt instanceof InterfaceC41655qus) && Intrinsics.EZpvd(interfaceC41655qus, interfaceC40516qYt);
        }

        public static InterfaceC41655qus AEQbTJ(@NotNull InterfaceC41655qus interfaceC41655qus, boolean z) {
            return interfaceC41655qus.DbNXlk() != z ? interfaceC41655qus.KWHzl(z) : interfaceC41655qus;
        }

        public static InterfaceC41655qus EZpvd(@NotNull InterfaceC41655qus interfaceC41655qus, java.lang.String str) {
            return !Intrinsics.EZpvd((java.lang.Object) interfaceC41655qus.gEmmrt(), (java.lang.Object) str) ? interfaceC41655qus.KWHzl(str) : interfaceC41655qus;
        }

        public static java.lang.String copydefault(@NotNull InterfaceC41655qus interfaceC41655qus) {
            return interfaceC41655qus.copydefault().getChainId();
        }

        public static java.lang.String EZpvd(@NotNull InterfaceC41655qus interfaceC41655qus) {
            return interfaceC41655qus.copydefault().getTokenContractAddress();
        }
    }
}

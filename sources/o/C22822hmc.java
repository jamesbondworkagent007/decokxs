package o;

import com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData;
import com.okinc.business.dex.trade.order.domain.model.OrderSubStatus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hmc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22822hmc {
    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [29=13] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void EZpvd(@NotNull java.lang.String str, @NotNull InterfaceC22765hlY interfaceC22765hlY) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC22765hlY, "");
        int iHashCode = str.hashCode();
        if (iHashCode != 48) {
            if (iHashCode != 49) {
                if (iHashCode != 48625) {
                    switch (iHashCode) {
                        case 1444:
                            if (str.equals(MultiTransferSignData.DEFAULT_INTERVAL)) {
                                interfaceC22765hlY.djBIcL();
                                return;
                            }
                            break;
                        case 1445:
                            if (str.equals("-2")) {
                                interfaceC22765hlY.EZpvd();
                                return;
                            }
                            break;
                        case 1446:
                            if (str.equals("-3")) {
                                interfaceC22765hlY.gEmmrt();
                                return;
                            }
                            break;
                        case 1447:
                            if (str.equals("-4")) {
                                interfaceC22765hlY.copydefault();
                                return;
                            }
                            break;
                        default:
                            switch (iHashCode) {
                                case 1567:
                                    if (str.equals("10")) {
                                        interfaceC22765hlY.fetchVPNInfo();
                                        return;
                                    }
                                    break;
                                case 1568:
                                    if (str.equals("11")) {
                                        interfaceC22765hlY.KWHzl();
                                        return;
                                    }
                                    break;
                                case 1569:
                                    if (str.equals("12")) {
                                        interfaceC22765hlY.AYXKKw();
                                        return;
                                    }
                                    break;
                                default:
                                    switch (iHashCode) {
                                        case 49586:
                                            if (str.equals("200")) {
                                                interfaceC22765hlY.OLrzqt();
                                                return;
                                            }
                                            break;
                                        case 49587:
                                            if (str.equals("201")) {
                                                interfaceC22765hlY.AEQbTJ();
                                                return;
                                            }
                                            break;
                                        case 49588:
                                            if (str.equals("202")) {
                                                interfaceC22765hlY.OLrzqt();
                                                return;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else if (str.equals("100")) {
                    interfaceC22765hlY.isConnected();
                    return;
                }
            } else if (str.equals("1")) {
                interfaceC22765hlY.values();
                return;
            }
        } else if (str.equals("0")) {
            interfaceC22765hlY.AhwBna();
            return;
        }
        interfaceC22765hlY.valueOf();
    }

    public static final void copydefault(@NotNull java.lang.String str, @NotNull InterfaceC22761hlU interfaceC22761hlU) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(interfaceC22761hlU, "");
        interfaceC22761hlU.OLrzqt(str);
    }

    public static final boolean copydefault(boolean z, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return z ? OLrzqt(str) : EZpvd(str);
    }

    public static final boolean EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) MultiTransferSignData.DEFAULT_INTERVAL) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "-2");
    }

    public static final boolean OLrzqt(@NotNull java.lang.String str) {
        OrderSubStatus next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.Iterator<OrderSubStatus> it = OrderSubStatus.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) java.lang.String.valueOf(next.getStatus()), (java.lang.Object) str)) {
                break;
            }
        }
        OrderSubStatus orderSubStatus = next;
        return orderSubStatus != null && orderSubStatus.isTerminalState();
    }

    public static final boolean copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "4") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "5");
    }

    public static final boolean AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "200") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "201") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "202");
    }
}

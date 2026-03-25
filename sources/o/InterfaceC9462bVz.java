package o;

import com.okinc.business.defi.api.bean.SolanaSignType;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo;
import com.okinc.business.defi.biz.net.bean.BeforeAndAfterPermission;
import com.okinc.business.defi.biz.net.bean.PermissionDetail;
import com.okinc.business.defi.biz.net.bean.SimulateTransactionResult;
import com.okinc.business.defi.biz.net.bean.TxToastCheckRes;
import com.okinc.localization.util.format.DisplaySign;
import com.okinc.wallet.core.sign.solana.SolUnitLimitAndPrice;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: renamed from: o.bVz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public interface InterfaceC9462bVz {
    java.lang.String AEQbTJ();

    boolean AEQbTJ(java.lang.String str, java.lang.String str2);

    SolanaSignInfo AkhnZx();

    boolean DbNXlk();

    java.lang.String EZpvd(java.lang.String str, java.lang.String str2);

    BigDecimal EZpvd(java.lang.String str);

    java.util.List<SolUnitLimitAndPrice> EZpvd();

    boolean KWHzl();

    java.lang.String OLrzqt(java.lang.String str, java.lang.String str2);

    java.lang.String OLrzqt(boolean z, boolean z2);

    java.util.List<java.lang.String> OLrzqt();

    java.lang.String copydefault(boolean z, boolean z2);

    void copydefault(@NotNull java.util.List<java.lang.String> list);

    boolean copydefault(java.lang.String str, java.lang.String str2);

    boolean copydefault(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes);

    C10854bwM dHguZz();

    /* JADX INFO: renamed from: djBIcL */
    C9592bYW DXXBbs();

    int isConnected();

    java.util.ArrayList<java.lang.String> valueOf();

    java.lang.String values();

    java.lang.String zuBGHE();

    /* JADX INFO: renamed from: o.bVz$Application */
    public static final class Application {
        public static java.util.List<java.lang.String> EZpvd(@NotNull InterfaceC9462bVz interfaceC9462bVz) {
            return interfaceC9462bVz.valueOf();
        }

        public static void EZpvd(@NotNull InterfaceC9462bVz interfaceC9462bVz, @NotNull java.util.List<java.lang.String> list) {
            Intrinsics.checkNotNullParameter(list, "");
            interfaceC9462bVz.valueOf().clear();
            interfaceC9462bVz.valueOf().addAll(list);
        }

        public static void valueOf(@NotNull InterfaceC9462bVz interfaceC9462bVz) {
            SolanaSignInfo solanaSignInfoAkhnZx = interfaceC9462bVz.AkhnZx();
            if (solanaSignInfoAkhnZx == null || !C33129mqd.AEQbTJ(interfaceC9462bVz.EZpvd(solanaSignInfoAkhnZx.getComputeUnitPrice(), (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(interfaceC9462bVz.OLrzqt())), solanaSignInfoAkhnZx.getFeelimit())) {
                return;
            }
            solanaSignInfoAkhnZx.setComputeUnitPrice(interfaceC9462bVz.OLrzqt(solanaSignInfoAkhnZx.getFeelimit(), (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(interfaceC9462bVz.OLrzqt())));
        }

        public static boolean KWHzl(@NotNull InterfaceC9462bVz interfaceC9462bVz, @NotNull AbstractC8564bFB<?, ?> abstractC8564bFB) {
            Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
            if (abstractC8564bFB.OJuSTm().getSolanaSignType() == SolanaSignType.FAST) {
                return true;
            }
            java.lang.String strKWHzl = abstractC8564bFB.DarRvM().KWHzl(java.lang.Long.valueOf(abstractC8564bFB.dHguZz().AhwBna()), abstractC8564bFB.htlTjW());
            java.lang.String feeAmount = abstractC8564bFB.QKudOq().KWHzl().getFeeAmount();
            java.util.List<? extends AbstractC9832bcy> listGEmmrt = yDY.gEmmrt(new C9879bds(interfaceC9462bVz.KWHzl()), new C9878bdr(interfaceC9462bVz.AEQbTJ(strKWHzl, feeAmount)), new C9880bdt(interfaceC9462bVz.copydefault(strKWHzl, feeAmount)));
            abstractC8564bFB.UlJrfe().OLrzqt(listGEmmrt);
            if ((listGEmmrt instanceof java.util.Collection) && listGEmmrt.isEmpty()) {
                return true;
            }
            java.util.Iterator<T> it = listGEmmrt.iterator();
            while (it.hasNext()) {
                if (!((C9785bcD) it.next()).AhwBna()) {
                    return false;
                }
            }
            return true;
        }

        public static /* synthetic */ java.lang.String getRent$default(InterfaceC9462bVz interfaceC9462bVz, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRent");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return interfaceC9462bVz.OLrzqt(z, z2);
        }

        public static java.lang.String EZpvd(@NotNull InterfaceC9462bVz interfaceC9462bVz, boolean z, boolean z2) {
            java.lang.String rent;
            if (z) {
                SolanaSignInfo solanaSignInfoAkhnZx = interfaceC9462bVz.AkhnZx();
                if (solanaSignInfoAkhnZx == null || (rent = solanaSignInfoAkhnZx.getRent()) == null) {
                    return null;
                }
                return C54870xYj.KWHzl(rent, interfaceC9462bVz.dHguZz().valueOf(), interfaceC9462bVz.dHguZz().fZBcTu(), z2 ? interfaceC9462bVz.dHguZz().fJNWhG() : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : null);
            }
            SolanaSignInfo solanaSignInfoAkhnZx2 = interfaceC9462bVz.AkhnZx();
            if (solanaSignInfoAkhnZx2 != null) {
                return solanaSignInfoAkhnZx2.getRent();
            }
            return null;
        }

        public static /* synthetic */ java.lang.String getRentSelf$default(InterfaceC9462bVz interfaceC9462bVz, boolean z, boolean z2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRentSelf");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return interfaceC9462bVz.copydefault(z, z2);
        }

        public static java.lang.String KWHzl(@NotNull InterfaceC9462bVz interfaceC9462bVz, boolean z, boolean z2) {
            java.lang.String solRent;
            if (z) {
                SolanaSignInfo solanaSignInfoAkhnZx = interfaceC9462bVz.AkhnZx();
                if (solanaSignInfoAkhnZx == null || (solRent = solanaSignInfoAkhnZx.getSolRent()) == null) {
                    return null;
                }
                return C54870xYj.KWHzl(solRent, interfaceC9462bVz.dHguZz().valueOf(), interfaceC9462bVz.dHguZz().AkhnZx(), z2 ? interfaceC9462bVz.dHguZz().fJNWhG() : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 8) != 0 ? DisplaySign.AUTO : null, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 16) != 0 ? false : false, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 32) != 0 ? null : java.lang.Boolean.valueOf(interfaceC9462bVz.dHguZz().getNewProxyInstance()), (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 64) != 0 ? false : true, (CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA & 128) != 0 ? RoundingMode.DOWN : RoundingMode.UP);
            }
            SolanaSignInfo solanaSignInfoAkhnZx2 = interfaceC9462bVz.AkhnZx();
            if (solanaSignInfoAkhnZx2 != null) {
                return solanaSignInfoAkhnZx2.getSolRent();
            }
            return null;
        }

        public static BigDecimal copydefault(@NotNull InterfaceC9462bVz interfaceC9462bVz, java.lang.String str) {
            return C54862xYb.KWHzl(C54862xYb.KWHzl(str, getRent$default(interfaceC9462bVz, false, false, 3, null)), getRentSelf$default(interfaceC9462bVz, false, false, 3, null));
        }

        public static boolean copydefault(@NotNull InterfaceC9462bVz interfaceC9462bVz) {
            return interfaceC9462bVz.DbNXlk() || C33129mqd.valueOf(getRent$default(interfaceC9462bVz, false, false, 3, null), "0") || C33129mqd.copydefault(interfaceC9462bVz.zuBGHE(), getRent$default(interfaceC9462bVz, false, false, 3, null));
        }

        public static boolean copydefault(@NotNull InterfaceC9462bVz interfaceC9462bVz, java.lang.String str, java.lang.String str2) {
            if (!interfaceC9462bVz.DbNXlk()) {
                BigDecimal bigDecimalAEQbTJ = C54862xYb.AEQbTJ(C54862xYb.AEQbTJ(str, interfaceC9462bVz.zuBGHE()), str2);
                if (!C33129mqd.valueOf(getRentSelf$default(interfaceC9462bVz, false, false, 3, null), "0") && C33129mqd.AEQbTJ(bigDecimalAEQbTJ, "0") && C33129mqd.gEmmrt(bigDecimalAEQbTJ, getRentSelf$default(interfaceC9462bVz, false, false, 3, null))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean AEQbTJ(@NotNull InterfaceC9462bVz interfaceC9462bVz, java.lang.String str, java.lang.String str2) {
            if (interfaceC9462bVz.DbNXlk()) {
                BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(getRent$default(interfaceC9462bVz, false, false, 3, null), getRentSelf$default(interfaceC9462bVz, false, false, 3, null));
                if (!C33129mqd.valueOf(bigDecimalKWHzl, "0") && !C33129mqd.copydefault(str, C54862xYb.KWHzl(str2, bigDecimalKWHzl))) {
                    return false;
                }
            }
            return true;
        }

        public static java.lang.String KWHzl(@NotNull InterfaceC9462bVz interfaceC9462bVz) {
            java.lang.String fee;
            SolanaSignInfo solanaSignInfoAkhnZx = interfaceC9462bVz.AkhnZx();
            return C54862xYb.convertToBigIntegerString$default((solanaSignInfoAkhnZx == null || (fee = solanaSignInfoAkhnZx.getFee()) == null) ? null : C54862xYb.OLrzqt(fee, OLrzqt(interfaceC9462bVz)), false, (RoundingMode) null, 3, (java.lang.Object) null);
        }

        public static void copydefault(@NotNull InterfaceC9462bVz interfaceC9462bVz, int i) {
            interfaceC9462bVz.DXXBbs().KWHzl(i);
        }

        public static SolanaExtJson AEQbTJ(@NotNull InterfaceC9462bVz interfaceC9462bVz) {
            java.lang.String rentSelf$default = getRentSelf$default(interfaceC9462bVz, false, false, 3, null);
            if (rentSelf$default == null) {
                rentSelf$default = "0";
            }
            return new SolanaExtJson(rentSelf$default, null, null, null, 14, null);
        }

        public static BigDecimal OLrzqt(InterfaceC9462bVz interfaceC9462bVz) {
            BigDecimal bigDecimalCopydefault = C33129mqd.copydefault(interfaceC9462bVz.values());
            BigDecimal bigDecimalCopydefault2 = C33129mqd.copydefault("1");
            return bigDecimalCopydefault.compareTo(bigDecimalCopydefault2) < 0 ? bigDecimalCopydefault2 : bigDecimalCopydefault;
        }

        /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static C9785bcD copydefault(@NotNull InterfaceC9462bVz interfaceC9462bVz, @NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
            java.lang.Object next;
            java.lang.Object next2;
            boolean z;
            java.lang.String strAYXKKw;
            java.lang.String strAYXKKw2;
            boolean zBooleanValue;
            java.lang.String str;
            boolean z2;
            java.lang.String str2;
            C9785bcD c9868bdh;
            java.lang.String unitGasLimit;
            java.lang.Object next3;
            java.lang.String strAYXKKw3;
            java.lang.Object next4;
            java.lang.Object next5;
            Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
            Intrinsics.checkNotNullParameter(txToastCheckRes, "");
            java.util.List<SimulateTransactionResult> simulateTransactionResultList = txToastCheckRes.getSimulateTransactionResultList();
            if (simulateTransactionResultList == null) {
                simulateTransactionResultList = yDY.AhwBna();
            }
            if (simulateTransactionResultList.isEmpty()) {
                java.lang.String msg = txToastCheckRes.getMsg();
                str = msg != null ? msg : "";
                java.lang.Boolean result = txToastCheckRes.getResult();
                if (result != null) {
                    zBooleanValue = result.booleanValue();
                    z = false;
                } else {
                    z = false;
                    zBooleanValue = false;
                }
            } else {
                java.util.Iterator<T> it = simulateTransactionResultList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (Intrinsics.EZpvd(((SimulateTransactionResult) next).getResult(), java.lang.Boolean.TRUE)) {
                        break;
                    }
                }
                boolean z3 = next == null;
                java.util.Iterator<T> it2 = simulateTransactionResultList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.EZpvd(((SimulateTransactionResult) next2).getAddFundsFlag(), java.lang.Boolean.TRUE)) {
                        break;
                    }
                }
                boolean z4 = next2 != null;
                C10856bwO.copydefault("OKWSolanaBaseSignTransaction", 0, "preResult = " + z3 + " : addFundResult = " + z4 + " : simulateResultList.isEmpty() = " + simulateTransactionResultList.isEmpty());
                z = z3 && z4;
                boolean z5 = simulateTransactionResultList.size() == 1;
                SimulateTransactionResult simulateTransactionResult = (SimulateTransactionResult) CollectionsKt___CollectionsKt.firstOrNull(simulateTransactionResultList);
                if (simulateTransactionResult == null || (strAYXKKw = simulateTransactionResult.getMsg()) == null) {
                    strAYXKKw = C33070mpX.AYXKKw(z ? C13754dXa.FragmentManager.getLocalNightMode : C13754dXa.FragmentManager.dismissPopups);
                }
                if (z) {
                    strAYXKKw2 = z5 ? strAYXKKw : C33070mpX.AYXKKw(C13754dXa.FragmentManager.getLocalNightMode);
                    java.lang.String str3 = strAYXKKw2;
                    zBooleanValue = !z3;
                    str = str3;
                } else {
                    if (!z5) {
                        strAYXKKw2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dismissPopups);
                    }
                    java.lang.String str32 = strAYXKKw2;
                    zBooleanValue = !z3;
                    str = str32;
                }
            }
            if ((abstractC8564bFB instanceof C9475bWL) && ((C9475bWL) abstractC8564bFB).djSkpj()) {
                java.util.Iterator<T> it3 = simulateTransactionResultList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        next5 = null;
                        break;
                    }
                    next5 = it3.next();
                    if (Intrinsics.EZpvd(((SimulateTransactionResult) next5).getResult(), java.lang.Boolean.FALSE)) {
                        break;
                    }
                }
                if (next5 != null) {
                    z2 = false;
                }
            } else {
                z2 = true;
            }
            if (z2) {
                str2 = str;
            } else {
                java.util.Iterator<T> it4 = simulateTransactionResultList.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it4.next();
                    if (Intrinsics.EZpvd(((SimulateTransactionResult) next3).getResult(), java.lang.Boolean.FALSE)) {
                        break;
                    }
                }
                SimulateTransactionResult simulateTransactionResult2 = (SimulateTransactionResult) next3;
                if (simulateTransactionResult2 == null || (strAYXKKw3 = simulateTransactionResult2.getMsg()) == null) {
                    strAYXKKw3 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.dismissPopups);
                }
                java.util.Iterator<T> it5 = simulateTransactionResultList.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it5.next();
                    if (Intrinsics.EZpvd(((SimulateTransactionResult) next4).getAddFundsFlag(), java.lang.Boolean.TRUE)) {
                        break;
                    }
                }
                str2 = strAYXKKw3;
                z = next4 != null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(simulateTransactionResultList, 10));
            for (SimulateTransactionResult simulateTransactionResult3 : simulateTransactionResultList) {
                if (!Intrinsics.EZpvd(simulateTransactionResult3.getResult(), java.lang.Boolean.TRUE) || (unitGasLimit = simulateTransactionResult3.getUnitGasLimit()) == null) {
                    unitGasLimit = "0";
                }
                arrayList.add(unitGasLimit);
            }
            interfaceC9462bVz.copydefault(arrayList);
            interfaceC9462bVz.EZpvd();
            if (!zBooleanValue || !z2) {
                if (z) {
                    c9868bdh = new C9784bcC(false, abstractC8564bFB.dHguZz(), str2);
                } else {
                    c9868bdh = new C9868bdh(false, str2, null, null, 12, null);
                }
                C9785bcD c9785bcD = c9868bdh;
                abstractC8564bFB.UlJrfe().AEQbTJ(c9785bcD);
                return c9785bcD;
            }
            abstractC8564bFB.UlJrfe().AEQbTJ(new C9868bdh(true, null, null, null, 12, null));
            return null;
        }

        public static void KWHzl(@NotNull InterfaceC9462bVz interfaceC9462bVz, @NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
            Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
            Intrinsics.checkNotNullParameter(txToastCheckRes, "");
            abstractC8564bFB.UlJrfe().AEQbTJ(new C9877bdq(interfaceC9462bVz.copydefault(abstractC8564bFB, txToastCheckRes)));
        }

        public static boolean OLrzqt(@NotNull InterfaceC9462bVz interfaceC9462bVz, @NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull TxToastCheckRes txToastCheckRes) {
            com.okinc.business.defi.biz.net.bean.Permission after;
            java.util.List<PermissionDetail> detail;
            java.util.List<BeforeAndAfterPermission> list;
            Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
            Intrinsics.checkNotNullParameter(txToastCheckRes, "");
            java.util.Map<java.lang.String, java.util.List<BeforeAndAfterPermission>> permissions = txToastCheckRes.getPermissions();
            java.lang.Integer numValueOf = null;
            BeforeAndAfterPermission beforeAndAfterPermission = (permissions == null || (list = permissions.get(abstractC8564bFB.fERRXa().getAddress())) == null) ? null : (BeforeAndAfterPermission) CollectionsKt___CollectionsKt.firstOrNull(list);
            if (beforeAndAfterPermission != null && (after = beforeAndAfterPermission.getAfter()) != null && (detail = after.getDetail()) != null) {
                numValueOf = java.lang.Integer.valueOf(detail.size());
            }
            return C33129mqd.valueOf(numValueOf, 0);
        }

        public static java.lang.String KWHzl(@NotNull InterfaceC9462bVz interfaceC9462bVz, java.lang.String str, java.lang.String str2) {
            return C54862xYb.convertToString$default(C54862xYb.divB$default(C54862xYb.OLrzqt(str, str2), java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 6.0d)), 0, null, 6, null), false, 0, RoundingMode.UP, 1, null);
        }

        public static java.lang.String EZpvd(@NotNull InterfaceC9462bVz interfaceC9462bVz, java.lang.String str, java.lang.String str2) {
            return C54862xYb.convertToString$default(C54862xYb.divB$default(C54862xYb.OLrzqt(str, java.lang.Double.valueOf(java.lang.Math.pow(10.0d, 6.0d))), str2, 0, null, 6, null), false, 0, RoundingMode.UP, 1, null);
        }
    }
}

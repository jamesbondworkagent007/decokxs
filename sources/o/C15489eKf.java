package o;

import com.okinc.business.defi.biz.net.bean.TxRecord;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eKf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C15489eKf {
    public final TxRecord EZpvd;
    public final InterfaceC56387yDm copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TxRecord AuCTel() {
        return this.EZpvd;
    }

    public boolean ejfBZ() {
        return false;
    }

    public boolean fARcdN() {
        return false;
    }

    public boolean fIwbmz() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fetchVPNInfo() {
        return "";
    }

    public C15489eKf(@NotNull TxRecord txRecord) {
        Intrinsics.checkNotNullParameter(txRecord, "");
        this.EZpvd = txRecord;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.eKl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C15489eKf.OLrzqt(this.KWHzl);
            }
        });
    }

    public final int AEQbTJ() {
        return this.EZpvd.isShowPending() ? 0 : 8;
    }

    public final int valueOf() {
        return C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd.getPendingToastInfo()) ? 0 : 8;
    }

    public final int djBIcL() {
        return ((this.EZpvd.isShowSpeedUp() || this.EZpvd.isShowSpeedupCancel()) && C15487eKd.AEQbTJ.EZpvd(this.EZpvd.getTxType())) ? 0 : 8;
    }

    public final int KWHzl() {
        java.lang.Integer claimableStatus = this.EZpvd.getClaimableStatus();
        return (claimableStatus != null && claimableStatus.intValue() == 2) ? 0 : 8;
    }

    public final java.lang.String AhwBna() {
        if (this.EZpvd.isShowSpeedupCancel()) {
            java.lang.String string = C32979mnm.EZpvd.OLrzqt().getString(C13754dXa.FragmentManager.addContentView);
            Intrinsics.copydefault((java.lang.Object) string);
            return string;
        }
        if (!this.EZpvd.isShowSpeedUp()) {
            return "";
        }
        java.lang.String string2 = C32979mnm.EZpvd.OLrzqt().getString(C13754dXa.FragmentManager.addOnConfigurationChangedListener);
        Intrinsics.copydefault((java.lang.Object) string2);
        return string2;
    }

    public final int OLrzqt() {
        return (this.EZpvd.isShowCancel() && C15487eKd.AEQbTJ.EZpvd(this.EZpvd.getTxType())) ? 0 : 8;
    }

    public final java.lang.String AkhnZx() {
        return (java.lang.String) this.copydefault.getValue();
    }

    public static final java.lang.String OLrzqt(C15489eKf c15489eKf) {
        return pTA.formatSimpleDateTime$default(new Date(c15489eKf.EZpvd.getTxTime()), null, 1, null);
    }

    public final int copydefault() {
        return (this.EZpvd.getTxStatus() < 2 || this.EZpvd.getTxStatus() == 5) ? 0 : 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AYXKKw() {
        int iFJNWhG = fJNWhG();
        int i = 3;
        if (iFJNWhG != 0) {
            if (iFJNWhG == 1) {
                i = 1;
            } else if (iFJNWhG == 2 || iFJNWhG == 3) {
                i = 2;
            } else if (iFJNWhG != 8) {
                if (iFJNWhG != 9) {
                    i = 4;
                }
            }
        }
        if (this.EZpvd.isShowSpeedupCancel() || this.EZpvd.isShowCancel() || this.EZpvd.isShowSpeedUp()) {
            return 0;
        }
        return i;
    }

    public final java.lang.String isConnected() {
        java.lang.String addressStr$default;
        int txType = this.EZpvd.getTxType();
        if (txType == 9) {
            return C32979mnm.EZpvd.OLrzqt().getResources().getString(C13754dXa.FragmentManager.addMenuProvider) + this.EZpvd.getOkexAccount();
        }
        if (txType == 85) {
            java.lang.String strAEQbTJ = C14079deg.EZpvd.AEQbTJ(this.EZpvd.getContractAddress(), true);
            if ((C33129mqd.OLrzqt((java.lang.CharSequence) strAEQbTJ) ? strAEQbTJ : null) != null) {
                java.lang.String str = C32979mnm.EZpvd.OLrzqt().getResources().getString(C13754dXa.FragmentManager.addMenuProvider) + strAEQbTJ;
                if (str != null) {
                    return str;
                }
            }
        } else {
            java.lang.String okexAccount = this.EZpvd.getOkexAccount();
            if (okexAccount == null || okexAccount.length() == 0) {
                addressStr$default = C14079deg.getAddressStr$default(C14079deg.EZpvd, C15487eKd.AEQbTJ.KWHzl(this.EZpvd.getWalletId(), this.EZpvd.getTxType(), this.EZpvd.getMainCoinId(), this.EZpvd.getTo(), false, (32 & 32) != 0), false, 2, null);
            } else {
                addressStr$default = this.EZpvd.getOkexAccount();
            }
            if ((C33129mqd.OLrzqt((java.lang.CharSequence) addressStr$default) ? addressStr$default : null) != null) {
                java.lang.String str2 = C33070mpX.AYXKKw(C13754dXa.FragmentManager.addMenuProvider) + addressStr$default;
                if (str2 != null) {
                    return str2;
                }
            }
        }
        return "";
    }

    public final java.lang.String gEmmrt() {
        return C14079deg.EZpvd.copydefault(this.EZpvd.getPoolId());
    }

    public final java.lang.String EZpvd() {
        int txType = this.EZpvd.getTxType();
        if (txType == 8) {
            return C32979mnm.EZpvd.OLrzqt().getResources().getString(C13754dXa.FragmentManager.initViewTreeOwners) + this.EZpvd.getOkexAccount();
        }
        if (txType == 84) {
            return C14079deg.EZpvd.AEQbTJ(this.EZpvd.getContractAddress(), true);
        }
        return C32979mnm.EZpvd.OLrzqt().getResources().getString(C13754dXa.FragmentManager.initViewTreeOwners) + C14079deg.getAddressStr$default(C14079deg.EZpvd, C15487eKd.AEQbTJ.KWHzl(this.EZpvd.getWalletId(), this.EZpvd.getTxType(), this.EZpvd.getMainCoinId(), this.EZpvd.getFrom(), true, false), false, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
    
        if (r6.EZpvd.getRepeatTxType() != 3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
    
        if (r6.EZpvd.getRepeatTxType() != 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int fJNWhG() {
        java.lang.Integer claimableStatus = this.EZpvd.getClaimableStatus();
        if (claimableStatus != null && claimableStatus.intValue() == 2) {
            return 8;
        }
        java.lang.Integer claimableStatus2 = this.EZpvd.getClaimableStatus();
        if (claimableStatus2 != null && claimableStatus2.intValue() == 3) {
            return 9;
        }
        int i = 1;
        if (this.EZpvd.getTxStatus() == 1) {
            C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(this.EZpvd.getMainCoinId());
            if (c10854bwMKWHzl != null && c10854bwMKWHzl.QkdxfA()) {
                if (!this.EZpvd.isShowPending()) {
                    return 0;
                }
                if (this.EZpvd.getRepeatTxType() == 1) {
                    return 2;
                }
                if (this.EZpvd.getRepeatTxType() != 2) {
                }
                return 3;
            }
            if (this.EZpvd.getRepeatTxType() == 1) {
                return 2;
            }
            if (this.EZpvd.getRepeatTxType() != 2) {
            }
            return 3;
        }
        i = 5;
        if (this.EZpvd.getTxStatus() != 2) {
            if (this.EZpvd.getTxStatus() == 3) {
                return 4;
            }
            if (this.EZpvd.getTxStatus() == 5) {
                return 6;
            }
            if (this.EZpvd.getTxStatus() == 6) {
                return 7;
            }
        }
        return i;
    }

    public final java.lang.String uzCIH() {
        C10854bwM c10854bwMKWHzl = C10954byG.EZpvd.valueOf().KWHzl(this.EZpvd.getMainCoinId());
        return c10854bwMKWHzl == null ? "" : c10854bwMKWHzl.QkdxfA() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.ActivityResultRegistry1) : c10854bwMKWHzl.iRxXKY() ? C33070mpX.AYXKKw(C13754dXa.FragmentManager.register) : C33069mpW.KWHzl(C32979mnm.EZpvd.OLrzqt(), C13754dXa.FragmentManager.init, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("pendingTip", AEQbTJ(this.EZpvd.getTxTime()))));
    }

    public final java.lang.String DbNXlk() {
        java.lang.String tipsType = this.EZpvd.getTipsType();
        return tipsType == null ? "" : tipsType;
    }

    public final java.lang.String AEQbTJ(long j) {
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis() - j;
        long j2 = jCurrentTimeMillis / ((long) 86400000);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (C33129mqd.AEQbTJ(java.lang.Long.valueOf(j2), bigDecimal)) {
            return j2 + com.ibm.icu.text.DateFormat.DAY;
        }
        long j3 = (jCurrentTimeMillis / ((long) 3600000)) % ((long) 24);
        if (C33129mqd.AEQbTJ(java.lang.Long.valueOf(j3), bigDecimal)) {
            return j3 + "h";
        }
        long j4 = 60;
        long j5 = (jCurrentTimeMillis / ((long) 60000)) % j4;
        if (C33129mqd.AEQbTJ(java.lang.Long.valueOf(j5), bigDecimal)) {
            return j5 + com.ibm.icu.text.DateFormat.MINUTE;
        }
        return ((jCurrentTimeMillis / ((long) 1000)) % j4) + com.ibm.icu.text.DateFormat.SECOND;
    }

    public java.lang.String values() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.EZpvd.getContractName())) {
            java.lang.String contractName = this.EZpvd.getContractName();
            return contractName == null ? "" : contractName;
        }
        return C14079deg.EZpvd.AEQbTJ(this.EZpvd.getContractAddress(), true);
    }
}

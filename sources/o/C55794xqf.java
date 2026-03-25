package o;

import com.okinc.unify_trade.biz.LossInsurance;
import com.okinc.unify_trade.biz.TacticsVoucherInfo;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.VoucherStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xqf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55794xqf {
    public static final C55794xqf EZpvd = new C55794xqf();

    private C55794xqf() {
    }

    public final TacticsVoucherInfo OLrzqt(@NotNull LossInsurance lossInsurance) {
        Intrinsics.checkNotNullParameter(lossInsurance, "");
        TacticsVoucherType tacticsVoucherType = TacticsVoucherType.STRATEGY_COMPENSATION;
        java.lang.String voucherStatus = lossInsurance.getVoucherStatus();
        if (voucherStatus == null) {
            voucherStatus = "";
        }
        java.lang.String strKWHzl = KWHzl(voucherStatus);
        java.lang.String str = strKWHzl == null ? "" : strKWHzl;
        java.lang.String voucherValue = lossInsurance.getVoucherValue();
        return new TacticsVoucherInfo((java.lang.String) null, (java.lang.String) null, tacticsVoucherType, str, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, voucherValue == null ? "" : voucherValue, (java.lang.String) null, 1523, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [177=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r2.equals("denied") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:?, code lost:
    
        return com.okinc.unify_trade.biz.VoucherStatus.LossInsuranceVoucherStatus.NO_COMPENSATION.getCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r2.equals("not_applicable") == false) goto L29;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String KWHzl(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1335395429:
                    break;
                case -1309235419:
                    if (str.equals("expired")) {
                        return VoucherStatus.LossInsuranceVoucherStatus.EXPIRED.getCode();
                    }
                    break;
                case -1258492403:
                    if (str.equals("compensated")) {
                        return VoucherStatus.LossInsuranceVoucherStatus.COMPENSATED.getCode();
                    }
                    break;
                case -358554572:
                    if (str.equals("compensating")) {
                        return VoucherStatus.LossInsuranceVoucherStatus.SETTLING.getCode();
                    }
                    break;
                case 3599293:
                    if (str.equals("used")) {
                        return VoucherStatus.LossInsuranceVoucherStatus.IN_USE.getCode();
                    }
                    break;
                case 531647627:
                    break;
            }
        }
        return null;
    }
}

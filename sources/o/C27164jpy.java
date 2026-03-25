package o;

import com.okinc.business.invest_biz.utils.InvestSlippageBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jpy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27164jpy {
    public java.lang.Boolean AEQbTJ;
    public java.lang.String EZpvd;
    public java.lang.String OLrzqt;
    public InvestSlippageBean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault() {
        this.copydefault = null;
    }

    @yCM
    public C27164jpy() {
    }

    public final void AEQbTJ(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.AEQbTJ = java.lang.Boolean.valueOf(z);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.EZpvd == null) {
            this.EZpvd = "1";
        }
        java.lang.String str2 = this.EZpvd;
        Intrinsics.copydefault((java.lang.Object) str2);
        return str2;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:5:0x0018 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Double] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kotlin.Pair<java.lang.String, java.lang.Boolean> AEQbTJ(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Integer num) {
        kotlin.Pair pairOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        if (this.copydefault == null) {
            this.copydefault = new InvestSlippageBean((java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (java.lang.Boolean) null, 15, (DefaultConstructorMarker) null);
        }
        if (str3 == 0) {
            str3 = java.lang.Double.valueOf(0.5d);
        }
        if (C33129mqd.AEQbTJ(str2, str3)) {
            if (str2 == null) {
                str2 = "";
            }
            return C56390yDp.OLrzqt(str2, java.lang.Boolean.TRUE);
        }
        if (num != null && num.intValue() == 2) {
            InvestSlippageBean investSlippageBean = this.copydefault;
            if (investSlippageBean != null) {
                java.lang.Boolean boolIsSafemoonAuto = investSlippageBean.isSafemoonAuto();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (Intrinsics.EZpvd(boolIsSafemoonAuto, bool)) {
                    InvestSlippageBean investSlippageBean2 = this.copydefault;
                    pairOLrzqt = C56390yDp.OLrzqt(investSlippageBean2 != null ? investSlippageBean2.getSafemoonSlippage() : null, bool);
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(str2, java.lang.Boolean.TRUE);
                }
            }
        } else {
            InvestSlippageBean investSlippageBean3 = this.copydefault;
            if (investSlippageBean3 != null) {
                java.lang.Boolean boolIsAuto = investSlippageBean3.isAuto();
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                if (Intrinsics.EZpvd(boolIsAuto, bool2)) {
                    InvestSlippageBean investSlippageBean4 = this.copydefault;
                    pairOLrzqt = C56390yDp.OLrzqt(investSlippageBean4 != null ? investSlippageBean4.getSlippage() : null, bool2);
                } else {
                    pairOLrzqt = C56390yDp.OLrzqt(str2, java.lang.Boolean.TRUE);
                }
            }
        }
        java.lang.String str4 = (java.lang.String) pairOLrzqt.component1();
        return C56390yDp.OLrzqt(str4 != null ? str4 : "", java.lang.Boolean.valueOf(((java.lang.Boolean) pairOLrzqt.component2()).booleanValue()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@NotNull java.lang.String str, java.lang.Integer num) {
        InvestSlippageBean investSlippageBeanCopy$default;
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String str2 = this.OLrzqt;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        java.lang.String strDivS$default = C33129mqd.divS$default(str2, 100, java.lang.Integer.valueOf(C33129mqd.AhwBna("18")), null, null, 12, null);
        if (num != null && num.intValue() == 2) {
            InvestSlippageBean investSlippageBean = this.copydefault;
            investSlippageBeanCopy$default = investSlippageBean != null ? InvestSlippageBean.copy$default(investSlippageBean, null, null, strDivS$default, this.AEQbTJ, 3, null) : null;
        } else {
            InvestSlippageBean investSlippageBean2 = this.copydefault;
            if (investSlippageBean2 != null) {
                investSlippageBeanCopy$default = InvestSlippageBean.copy$default(investSlippageBean2, strDivS$default, this.AEQbTJ, null, null, 12, null);
            }
        }
        this.copydefault = investSlippageBeanCopy$default;
    }
}

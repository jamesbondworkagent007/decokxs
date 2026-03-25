package o;

import com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.iFe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23676iFe {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public static final C23676iFe OLrzqt = new C23676iFe(false, false, null, 0, 15, null);
    public final boolean AEQbTJ;
    public final int AYXKKw;
    public final InvestDetailPagePromptInformation EZpvd;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23676iFe() {
        this(false, false, null, 0, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23676iFe copy$default(C23676iFe c23676iFe, boolean z, boolean z2, InvestDetailPagePromptInformation investDetailPagePromptInformation, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = c23676iFe.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            z2 = c23676iFe.copydefault;
        }
        if ((i2 & 4) != 0) {
            investDetailPagePromptInformation = c23676iFe.EZpvd;
        }
        if ((i2 & 8) != 0) {
            i = c23676iFe.AYXKKw;
        }
        return c23676iFe.copydefault(z, z2, investDetailPagePromptInformation, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestDetailPagePromptInformation EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23676iFe copydefault(boolean z, boolean z2, InvestDetailPagePromptInformation investDetailPagePromptInformation, int i) {
        return new C23676iFe(z, z2, investDetailPagePromptInformation, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23676iFe)) {
            return false;
        }
        C23676iFe c23676iFe = (C23676iFe) obj;
        return this.AEQbTJ == c23676iFe.AEQbTJ && this.copydefault == c23676iFe.copydefault && Intrinsics.EZpvd(this.EZpvd, c23676iFe.EZpvd) && this.AYXKKw == c23676iFe.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.AEQbTJ);
        int iHashCode2 = java.lang.Boolean.hashCode(this.copydefault);
        InvestDetailPagePromptInformation investDetailPagePromptInformation = this.EZpvd;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (investDetailPagePromptInformation == null ? 0 : investDetailPagePromptInformation.hashCode())) * 31) + java.lang.Integer.hashCode(this.AYXKKw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductAvailability(canInvest=" + this.AEQbTJ + ", canRedeemFromApp=" + this.copydefault + ", banner=" + this.EZpvd + ", stakingProgress=" + this.AYXKKw + ")";
    }

    public C23676iFe(boolean z, boolean z2, InvestDetailPagePromptInformation investDetailPagePromptInformation, int i) {
        this.AEQbTJ = z;
        this.copydefault = z2;
        this.EZpvd = investDetailPagePromptInformation;
        this.AYXKKw = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation) : (r4v0 com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r5v0 int))
 A[MD:(boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation, int):void (m)] (LINE:179) call: o.iFe.<init>(boolean, boolean, com.okinc.business.invest_biz.data.bean.InvestDetailPagePromptInformation, int):void type: THIS */
    public /* synthetic */ C23676iFe(boolean z, boolean z2, InvestDetailPagePromptInformation investDetailPagePromptInformation, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? null : investDetailPagePromptInformation, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: o.iFe$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFe.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C23676iFe OLrzqt() {
            return C23676iFe.OLrzqt;
        }
    }
}

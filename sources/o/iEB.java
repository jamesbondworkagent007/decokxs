package o;

import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iEB {
    public final C23668iEx AEQbTJ;
    public final MarketInvestmentAssetDetails KWHzl;
    public final C23670iEz copydefault;
    public static final Activity Companion = new Activity(null);
    public static final int OLrzqt = 8;
    public static final iEB EZpvd = new iEB(null, null, null, 7, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public iEB() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ iEB copy$default(iEB ieb, C23670iEz c23670iEz, C23668iEx c23668iEx, MarketInvestmentAssetDetails marketInvestmentAssetDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c23670iEz = ieb.copydefault;
        }
        if ((i & 2) != 0) {
            c23668iEx = ieb.AEQbTJ;
        }
        if ((i & 4) != 0) {
            marketInvestmentAssetDetails = ieb.KWHzl;
        }
        return ieb.OLrzqt(c23670iEz, c23668iEx, marketInvestmentAssetDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23670iEz AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MarketInvestmentAssetDetails KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEB OLrzqt(@NotNull C23670iEz c23670iEz, @NotNull C23668iEx c23668iEx, @NotNull MarketInvestmentAssetDetails marketInvestmentAssetDetails) {
        Intrinsics.checkNotNullParameter(c23670iEz, "");
        Intrinsics.checkNotNullParameter(c23668iEx, "");
        Intrinsics.checkNotNullParameter(marketInvestmentAssetDetails, "");
        return new iEB(c23670iEz, c23668iEx, marketInvestmentAssetDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23668iEx OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iEB)) {
            return false;
        }
        iEB ieb = (iEB) obj;
        return Intrinsics.EZpvd(this.copydefault, ieb.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, ieb.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, ieb.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.copydefault.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MarketInvestmentProduct(basicInfo=" + this.copydefault + ", displayInfo=" + this.AEQbTJ + ", assetDetails=" + this.KWHzl + ")";
    }

    public iEB(@NotNull C23670iEz c23670iEz, @NotNull C23668iEx c23668iEx, @NotNull MarketInvestmentAssetDetails marketInvestmentAssetDetails) {
        Intrinsics.checkNotNullParameter(c23670iEz, "");
        Intrinsics.checkNotNullParameter(c23668iEx, "");
        Intrinsics.checkNotNullParameter(marketInvestmentAssetDetails, "");
        this.copydefault = c23670iEz;
        this.AEQbTJ = c23668iEx;
        this.KWHzl = marketInvestmentAssetDetails;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:o.iEz:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iEz:0x0006: INVOKE (wrap:o.iEz$StateListAnimator:0x0004: SGET  A[WRAPPED] (LINE:91) o.iEz.Companion o.iEz$StateListAnimator) VIRTUAL call: o.iEz.StateListAnimator.copydefault():o.iEz A[MD:():o.iEz (m), WRAPPED] (LINE:91)) : (r1v0 o.iEz))
  (wrap:o.iEx:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iEx:0x0010: INVOKE (wrap:o.iEx$TaskDescription:0x000e: SGET  A[WRAPPED] (LINE:92) o.iEx.Companion o.iEx$TaskDescription) VIRTUAL call: o.iEx.TaskDescription.EZpvd():o.iEx A[MD:():o.iEx (m), WRAPPED] (LINE:92)) : (r2v0 o.iEx))
  (wrap:com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails:?: TERNARY null = ((wrap:int:0x0014: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails:0x001a: INVOKE 
  (wrap:com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails$TaskDescription:0x0018: SGET  A[WRAPPED] (LINE:93) com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails.Companion com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails$TaskDescription)
 VIRTUAL call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails.TaskDescription.OLrzqt():com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails A[MD:():com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails (m), WRAPPED] (LINE:93)) : (r3v0 com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails))
 A[MD:(o.iEz, o.iEx, com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails):void (m)] (LINE:90) call: o.iEB.<init>(o.iEz, o.iEx, com.okinc.business.invest_biz.data.repository.defi_dashboard.model.MarketInvestmentAssetDetails):void type: THIS */
    public /* synthetic */ iEB(C23670iEz c23670iEz, C23668iEx c23668iEx, MarketInvestmentAssetDetails marketInvestmentAssetDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C23670iEz.Companion.copydefault() : c23670iEz, (i & 2) != 0 ? C23668iEx.Companion.EZpvd() : c23668iEx, (i & 4) != 0 ? MarketInvestmentAssetDetails.Companion.OLrzqt() : marketInvestmentAssetDetails);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEB.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}

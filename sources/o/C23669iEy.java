package o;

import com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iEy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23669iEy {
    public final C23664iEt EZpvd;
    public final iEA KWHzl;
    public final InvestmentAssetDetails copydefault;
    public static final Application Companion = new Application(null);
    public static final int OLrzqt = 8;
    public static final C23669iEy AEQbTJ = new C23669iEy(null, null, null, 7, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23669iEy() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23669iEy copy$default(C23669iEy c23669iEy, C23664iEt c23664iEt, iEA iea, InvestmentAssetDetails investmentAssetDetails, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c23664iEt = c23669iEy.EZpvd;
        }
        if ((i & 2) != 0) {
            iea = c23669iEy.KWHzl;
        }
        if ((i & 4) != 0) {
            investmentAssetDetails = c23669iEy.copydefault;
        }
        return c23669iEy.OLrzqt(c23664iEt, iea, investmentAssetDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestmentAssetDetails AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final iEA EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23664iEt KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23669iEy OLrzqt(@NotNull C23664iEt c23664iEt, @NotNull iEA iea, @NotNull InvestmentAssetDetails investmentAssetDetails) {
        Intrinsics.checkNotNullParameter(c23664iEt, "");
        Intrinsics.checkNotNullParameter(iea, "");
        Intrinsics.checkNotNullParameter(investmentAssetDetails, "");
        return new C23669iEy(c23664iEt, iea, investmentAssetDetails);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23669iEy)) {
            return false;
        }
        C23669iEy c23669iEy = (C23669iEy) obj;
        return Intrinsics.EZpvd(this.EZpvd, c23669iEy.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c23669iEy.KWHzl) && Intrinsics.EZpvd(this.copydefault, c23669iEy.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestmentProduct(basicInfo=" + this.EZpvd + ", displayInfo=" + this.KWHzl + ", assetDetails=" + this.copydefault + ")";
    }

    public C23669iEy(@NotNull C23664iEt c23664iEt, @NotNull iEA iea, @NotNull InvestmentAssetDetails investmentAssetDetails) {
        Intrinsics.checkNotNullParameter(c23664iEt, "");
        Intrinsics.checkNotNullParameter(iea, "");
        Intrinsics.checkNotNullParameter(investmentAssetDetails, "");
        this.EZpvd = c23664iEt;
        this.KWHzl = iea;
        this.copydefault = investmentAssetDetails;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001e: CONSTRUCTOR 
  (wrap:o.iEt:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iEt:0x0006: INVOKE (wrap:o.iEt$Application:0x0004: SGET  A[WRAPPED] (LINE:25) o.iEt.Companion o.iEt$Application) VIRTUAL call: o.iEt.Application.AEQbTJ():o.iEt A[MD:():o.iEt (m), WRAPPED] (LINE:25)) : (r1v0 o.iEt))
  (wrap:o.iEA:?: TERNARY null = ((wrap:int:0x000a: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:o.iEA:0x0010: INVOKE (wrap:o.iEA$Application:0x000e: SGET  A[WRAPPED] (LINE:26) o.iEA.Companion o.iEA$Application) VIRTUAL call: o.iEA.Application.EZpvd():o.iEA A[MD:():o.iEA (m), WRAPPED] (LINE:26)) : (r2v0 o.iEA))
  (wrap:com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails:?: TERNARY null = ((wrap:int:0x0014: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails:0x001a: INVOKE 
  (wrap:com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails$Activity:0x0018: SGET  A[WRAPPED] (LINE:27) com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails.Companion com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails$Activity)
 VIRTUAL call: com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails.Activity.OLrzqt():com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails A[MD:():com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails (m), WRAPPED] (LINE:27)) : (r3v0 com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails))
 A[MD:(o.iEt, o.iEA, com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails):void (m)] (LINE:24) call: o.iEy.<init>(o.iEt, o.iEA, com.okinc.business.invest_biz.data.repository.defi_dashboard.model.InvestmentAssetDetails):void type: THIS */
    public /* synthetic */ C23669iEy(C23664iEt c23664iEt, iEA iea, InvestmentAssetDetails investmentAssetDetails, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C23664iEt.Companion.AEQbTJ() : c23664iEt, (i & 2) != 0 ? iEA.Companion.EZpvd() : iea, (i & 4) != 0 ? InvestmentAssetDetails.Companion.OLrzqt() : investmentAssetDetails);
    }

    /* JADX INFO: renamed from: o.iEy$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iEy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }
}

package o;

import com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25148irJ {
    public java.lang.String EZpvd;
    public TransactionFoldInfoDataBean KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25148irJ() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25148irJ copy$default(C25148irJ c25148irJ, java.lang.String str, TransactionFoldInfoDataBean transactionFoldInfoDataBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c25148irJ.EZpvd;
        }
        if ((i & 2) != 0) {
            transactionFoldInfoDataBean = c25148irJ.KWHzl;
        }
        return c25148irJ.copydefault(str, transactionFoldInfoDataBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionFoldInfoDataBean OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25148irJ copydefault(@NotNull java.lang.String str, @NotNull TransactionFoldInfoDataBean transactionFoldInfoDataBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionFoldInfoDataBean, "");
        return new C25148irJ(str, transactionFoldInfoDataBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25148irJ)) {
            return false;
        }
        C25148irJ c25148irJ = (C25148irJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c25148irJ.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c25148irJ.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TransactionInputDataBean(inputData=" + this.EZpvd + ", foldInfo=" + this.KWHzl + ")";
    }

    public C25148irJ(@NotNull java.lang.String str, @NotNull TransactionFoldInfoDataBean transactionFoldInfoDataBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(transactionFoldInfoDataBean, "");
        this.EZpvd = str;
        this.KWHzl = transactionFoldInfoDataBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean:0x0012: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:kotlin.jvm.functions.Function0:?: CAST (kotlin.jvm.functions.Function0) (null kotlin.jvm.functions.Function0))
  (7 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, boolean, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:16) call: com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean.<init>(java.lang.String, boolean, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r8v0 com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean))
 A[MD:(java.lang.String, com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean):void (m)] (LINE:14) call: o.irJ.<init>(java.lang.String, com.okinc.web3Uilib.bean.TransactionFoldInfoDataBean):void type: THIS */
    public /* synthetic */ C25148irJ(java.lang.String str, TransactionFoldInfoDataBean transactionFoldInfoDataBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? new TransactionFoldInfoDataBean((java.lang.String) null, false, (Function0) null, 7, (DefaultConstructorMarker) null) : transactionFoldInfoDataBean);
    }
}

package o;

import androidx.core.app.FrameMetricsAggregator;
import com.okinc.web3Uilib.bean.TransactionAddressInfoBean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.irE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25143irE {
    public TransactionAddressInfoBean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25143irE() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25143irE copy$default(C25143irE c25143irE, TransactionAddressInfoBean transactionAddressInfoBean, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            transactionAddressInfoBean = c25143irE.EZpvd;
        }
        return c25143irE.KWHzl(transactionAddressInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionAddressInfoBean AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25143irE KWHzl(@NotNull TransactionAddressInfoBean transactionAddressInfoBean) {
        Intrinsics.checkNotNullParameter(transactionAddressInfoBean, "");
        return new C25143irE(transactionAddressInfoBean);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25143irE) && Intrinsics.EZpvd(this.EZpvd, ((C25143irE) obj).EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ToTransactionAddressInfoBean(transactionAddressInfoBean=" + this.EZpvd + ")";
    }

    public C25143irE(@NotNull TransactionAddressInfoBean transactionAddressInfoBean) {
        Intrinsics.checkNotNullParameter(transactionAddressInfoBean, "");
        this.EZpvd = transactionAddressInfoBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:com.okinc.web3Uilib.bean.TransactionAddressInfoBean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:com.okinc.web3Uilib.bean.TransactionAddressInfoBean:0x0013: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:kotlin.jvm.functions.Function0:?: CAST (kotlin.jvm.functions.Function0) (null kotlin.jvm.functions.Function0))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (wrap:kotlin.jvm.functions.Function0:?: CAST (kotlin.jvm.functions.Function0) (null kotlin.jvm.functions.Function0))
  (wrap:int:SGET  A[WRAPPED] androidx.core.app.FrameMetricsAggregator.EVERY_DURATION int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, java.lang.String, boolean, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:29) call: com.okinc.web3Uilib.bean.TransactionAddressInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, kotlin.jvm.functions.Function0, java.lang.String, boolean, kotlin.jvm.functions.Function0, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r13v0 com.okinc.web3Uilib.bean.TransactionAddressInfoBean))
 A[MD:(com.okinc.web3Uilib.bean.TransactionAddressInfoBean):void (m)] (LINE:28) call: o.irE.<init>(com.okinc.web3Uilib.bean.TransactionAddressInfoBean):void type: THIS */
    public /* synthetic */ C25143irE(TransactionAddressInfoBean transactionAddressInfoBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TransactionAddressInfoBean((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, (Function0) null, (java.lang.String) null, false, (Function0) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null) : transactionAddressInfoBean);
    }
}

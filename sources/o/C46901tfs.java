package o;

import com.okinc.market.common.biz_spot.bean.AlertRemindPo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tfs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46901tfs {
    public static final int EZpvd = AlertRemindPo.$stable;
    public final java.lang.String AEQbTJ;
    public final AlertRemindPo OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46901tfs copy$default(C46901tfs c46901tfs, AlertRemindPo alertRemindPo, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            alertRemindPo = c46901tfs.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c46901tfs.AEQbTJ;
        }
        return c46901tfs.OLrzqt(alertRemindPo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AlertRemindPo AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46901tfs OLrzqt(@NotNull AlertRemindPo alertRemindPo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        return new C46901tfs(alertRemindPo, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46901tfs)) {
            return false;
        }
        C46901tfs c46901tfs = (C46901tfs) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c46901tfs.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c46901tfs.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.String str = this.AEQbTJ;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UIState(item=" + this.OLrzqt + ", errorMessage=" + this.AEQbTJ + ")";
    }

    public C46901tfs(@NotNull AlertRemindPo alertRemindPo, java.lang.String str) {
        Intrinsics.checkNotNullParameter(alertRemindPo, "");
        this.OLrzqt = alertRemindPo;
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 com.okinc.market.common.biz_spot.bean.AlertRemindPo)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(com.okinc.market.common.biz_spot.bean.AlertRemindPo, java.lang.String):void (m)] (LINE:1476) call: o.tfs.<init>(com.okinc.market.common.biz_spot.bean.AlertRemindPo, java.lang.String):void type: THIS */
    public /* synthetic */ C46901tfs(AlertRemindPo alertRemindPo, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(alertRemindPo, (i & 2) != 0 ? null : str);
    }
}

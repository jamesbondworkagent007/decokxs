package o;

import com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo;
import com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jtl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC27363jtl implements InterfaceC27436jvE {
    public final java.lang.String AubY;
    public final long ejfBZ;
    public final long fARcdN;
    public final java.lang.String fIwbmz;
    public final java.util.List<DashboardInvestmentInfo> getFieldNames;
    public final UiDashboardTokenItemType getNewProxyInstance;
    public final java.lang.String hDKMBd;
    public final java.lang.String iwGUEr;
    public final java.lang.String uzCIH;
    public final java.lang.String zLjUOn;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long AEQbTJ() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.util.List<DashboardInvestmentInfo> AYXKKw() {
        return this.getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String AkhnZx() {
        return this.iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String DbNXlk() {
        return this.uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String KWHzl() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public long OLrzqt() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String fetchVPNInfo() {
        return this.zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String isConnected() {
        return this.AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UiDashboardTokenItemType valueOf() {
        return this.getNewProxyInstance;
    }

    public AbstractC27363jtl(long j, long j2, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.util.List<DashboardInvestmentInfo> list, @NotNull UiDashboardTokenItemType uiDashboardTokenItemType, @NotNull java.lang.String str5, @NotNull java.lang.String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(uiDashboardTokenItemType, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.fARcdN = j;
        this.ejfBZ = j2;
        this.uzCIH = str;
        this.iwGUEr = str2;
        this.fIwbmz = str3;
        this.hDKMBd = str4;
        this.getFieldNames = list;
        this.getNewProxyInstance = uiDashboardTokenItemType;
        this.AubY = str5;
        this.zLjUOn = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0057: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r30v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r18v0 long))
  (wrap:long:?: TERNARY null = ((wrap:int:0x000c: ARITH (r30v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r20v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r30v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r30v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r30v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r30v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0036: ARITH (r30v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:33)) : (r26v0 java.util.List))
  (r27v0 com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r30v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r30v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
 A[MD:(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.invest_biz.data.bean.response.DashboardInvestmentInfo>, com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType, java.lang.String, java.lang.String):void (m)] (LINE:26) call: o.jtl.<init>(long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder.UiDashboardTokenItemType, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AbstractC27363jtl(long j, long j2, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.util.List list, UiDashboardTokenItemType uiDashboardTokenItemType, java.lang.String str5, java.lang.String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? yDY.AhwBna() : list, uiDashboardTokenItemType, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? "" : str6);
    }
}

package o;

import com.okinc.unify_trade.biz.subscribe.TradePositionData;
import com.okinc.unify_trade.biz.subscribe.TradeUserPositionInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xpl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC55747xpl extends AbstractC55745xpj {
    public java.lang.String AkhnZx;
    public boolean AuCTel;
    public java.lang.String DbNXlk;
    public final java.lang.String fARcdN;
    public final java.lang.String fIwbmz;
    public java.lang.String fJNWhG;
    public java.lang.String fetchVPNInfo;
    public java.lang.String values;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AEQbTJ() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String AhwBna() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String EZpvd() {
        return this.fIwbmz;
    }

    public abstract void EZpvd(@NotNull java.util.List<TradePositionData> list, @NotNull java.lang.String str, java.util.List<TradeUserPositionInfo> list2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.AkhnZx;
    }

    public abstract void KWHzl(@NotNull java.lang.String str, @NotNull java.lang.Exception exc);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String valueOf() {
        return this.values;
    }

    public AbstractC55747xpl(@NotNull java.lang.String str, java.lang.String str2, java.lang.String str3, @NotNull java.lang.String str4, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.DbNXlk = str;
        this.fetchVPNInfo = str2;
        this.AkhnZx = str3;
        this.values = str4;
        this.AuCTel = z;
        this.fJNWhG = "TradePositionListener-" + str + "-" + str2 + "-" + str3;
        this.fARcdN = "TradePositionListener";
        this.fIwbmz = "";
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:22) call: o.xpl.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ AbstractC55747xpl(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? true : z);
    }

    public static /* synthetic */ void onResult$default(AbstractC55747xpl abstractC55747xpl, java.util.List list, java.lang.String str, java.util.List list2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResult");
        }
        if ((i & 2) != 0) {
            str = "WebSocket";
        }
        abstractC55747xpl.EZpvd((java.util.List<TradePositionData>) list, str, (java.util.List<TradeUserPositionInfo>) list2);
    }
}

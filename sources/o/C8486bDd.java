package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bDd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C8486bDd {
    public static final int FEE_CHANGE_TYPE_INIT = 0;
    public static final int FEE_CHANGE_TYPE_NORMAL = 2;
    public static final int FEE_CHANGE_TYPE_REFRESH = 3;
    public static final int FEE_CHANGE_TYPE_RE_INIT = 1;
    public static final int FEE_CHANGE_TYPE_USER = 4;
    private final java.lang.String cost;
    private final java.lang.String feeAmount;
    private int feeChangeType;
    private final C10854bwM feeCoinMeta;
    private final java.lang.String feeUnit;
    private final java.lang.String formatCost;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getCost() {
        return this.cost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFeeAmount() {
        return this.feeAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getFeeChangeType() {
        return this.feeChangeType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C10854bwM getFeeCoinMeta() {
        return this.feeCoinMeta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFeeUnit() {
        return this.feeUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String getFormatCost() {
        return this.formatCost;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeChangeType(int i) {
        this.feeChangeType = i;
    }

    public C8486bDd(@NotNull C10854bwM c10854bwM, @NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, int i) {
        Intrinsics.checkNotNullParameter(c10854bwM, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.feeCoinMeta = c10854bwM;
        this.feeAmount = str;
        this.cost = str2;
        this.formatCost = str3;
        this.feeUnit = str4;
        this.feeChangeType = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r8v0 o.bwM)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r13v0 int))
 A[MD:(o.bwM, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:8) call: o.bDd.<init>(o.bwM, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ C8486bDd(C10854bwM c10854bwM, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10854bwM, str, str2, str3, str4, (i2 & 32) != 0 ? 2 : i);
    }

    /* JADX INFO: renamed from: o.bDd$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.bDd.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public java.lang.String toString() {
        return "BaseFeeItemInfo(feeCoinMeta=" + this.feeCoinMeta.fJNWhG() + ", feeAmount='" + this.feeAmount + "', cost='" + this.cost + "', formatCost='" + this.formatCost + "', feeUnit='" + this.feeUnit + "', feeChangeType=" + this.feeChangeType + ")";
    }
}

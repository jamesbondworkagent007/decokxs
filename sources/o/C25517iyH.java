package o;

import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: o.iyH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C25517iyH implements RxBus.Application {
    public final boolean EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C25517iyH() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C25517iyH copy$default(C25517iyH c25517iyH, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c25517iyH.EZpvd;
        }
        return c25517iyH.KWHzl(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C25517iyH KWHzl(boolean z) {
        return new C25517iyH(z);
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C25517iyH) && this.EZpvd == ((C25517iyH) obj).EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "InvestSubscriptionStageEvent(inputStage=" + this.EZpvd + ")";
    }

    public C25517iyH(boolean z) {
        this.EZpvd = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:5) call: o.iyH.<init>(boolean):void type: THIS */
    public /* synthetic */ C25517iyH(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}

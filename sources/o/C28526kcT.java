package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.kMU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kcT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28526kcT implements kMU {
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C28526kcT() {
        this(false, 1, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C28526kcT copy$default(C28526kcT c28526kcT, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c28526kcT.copydefault;
        }
        return c28526kcT.OLrzqt(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C28526kcT OLrzqt(boolean z) {
        return new C28526kcT(z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28526kcT) && this.copydefault == ((C28526kcT) obj).copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return java.lang.Boolean.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "HomeEmptyListUiModel(withCustomFilter=" + this.copydefault + ")";
    }

    public C28526kcT(boolean z) {
        this.copydefault = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r1v0 boolean))
 A[MD:(boolean):void (m)] (LINE:11) call: o.kcT.<init>(boolean):void type: THIS */
    public /* synthetic */ C28526kcT(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // o.kMU
    public boolean compareContent(@NotNull kMU kmu) {
        return kMU.TaskDescription.AEQbTJ(this, kmu);
    }

    @Override // o.kMU
    public boolean compareId(@NotNull kMU kmu) {
        return kMU.TaskDescription.KWHzl(this, kmu);
    }

    @Override // o.kMU
    public java.lang.Object getChangePayload(@NotNull kMU kmu) {
        return kMU.TaskDescription.EZpvd(this, kmu);
    }
}

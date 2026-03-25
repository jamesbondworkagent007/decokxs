package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yUy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56858yUy {
    public final boolean KWHzl;
    public final NullabilityQualifier copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C56858yUy copy$default(C56858yUy c56858yUy, NullabilityQualifier nullabilityQualifier, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = c56858yUy.copydefault;
        }
        if ((i & 2) != 0) {
            z = c56858yUy.KWHzl;
        }
        return c56858yUy.AEQbTJ(nullabilityQualifier, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56858yUy AEQbTJ(@NotNull NullabilityQualifier nullabilityQualifier, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "");
        return new C56858yUy(nullabilityQualifier, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NullabilityQualifier OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56858yUy)) {
            return false;
        }
        C56858yUy c56858yUy = (C56858yUy) obj;
        return this.copydefault == c56858yUy.copydefault && this.KWHzl == c56858yUy.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.copydefault + ", isForWarningOnly=" + this.KWHzl + ')';
    }

    public C56858yUy(@NotNull NullabilityQualifier nullabilityQualifier, boolean z) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "");
        this.copydefault = nullabilityQualifier;
        this.KWHzl = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r2v0 boolean))
 A[MD:(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier, boolean):void (m)] (LINE:8) call: o.yUy.<init>(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier, boolean):void type: THIS */
    public /* synthetic */ C56858yUy(NullabilityQualifier nullabilityQualifier, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, (i & 2) != 0 ? false : z);
    }
}

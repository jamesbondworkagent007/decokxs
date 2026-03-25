package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: renamed from: o.yUx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56857yUx {
    public final boolean AEQbTJ;
    public final MutabilityQualifier EZpvd;
    public final boolean KWHzl;
    public final NullabilityQualifier djBIcL;
    public static final TaskDescription copydefault = new TaskDescription(null);
    public static final C56857yUx OLrzqt = new C56857yUx(null, null, false, false, 8, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C56857yUx copy$default(C56857yUx c56857yUx, NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            nullabilityQualifier = c56857yUx.djBIcL;
        }
        if ((i & 2) != 0) {
            mutabilityQualifier = c56857yUx.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c56857yUx.KWHzl;
        }
        if ((i & 8) != 0) {
            z2 = c56857yUx.AEQbTJ;
        }
        return c56857yUx.OLrzqt(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final MutabilityQualifier KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NullabilityQualifier OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56857yUx OLrzqt(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        return new C56857yUx(nullabilityQualifier, mutabilityQualifier, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56857yUx)) {
            return false;
        }
        C56857yUx c56857yUx = (C56857yUx) obj;
        return this.djBIcL == c56857yUx.djBIcL && this.EZpvd == c56857yUx.EZpvd && this.KWHzl == c56857yUx.KWHzl && this.AEQbTJ == c56857yUx.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        NullabilityQualifier nullabilityQualifier = this.djBIcL;
        int iHashCode = nullabilityQualifier == null ? 0 : nullabilityQualifier.hashCode();
        MutabilityQualifier mutabilityQualifier = this.EZpvd;
        return (((((iHashCode * 31) + (mutabilityQualifier != null ? mutabilityQualifier.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.KWHzl)) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "JavaTypeQualifiers(nullability=" + this.djBIcL + ", mutability=" + this.EZpvd + ", definitelyNotNull=" + this.KWHzl + ", isNullabilityQualifierForWarning=" + this.AEQbTJ + ')';
    }

    public C56857yUx(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.djBIcL = nullabilityQualifier;
        this.EZpvd = mutabilityQualifier;
        this.KWHzl = z;
        this.AEQbTJ = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier)
  (r2v0 kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier)
  (r3v0 boolean)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r4v0 boolean))
 A[MD:(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier, boolean, boolean):void (m)] (LINE:19) call: o.yUx.<init>(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier, boolean, boolean):void type: THIS */
    public /* synthetic */ C56857yUx(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nullabilityQualifier, mutabilityQualifier, z, (i & 8) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: o.yUx$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.yUx.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C56857yUx EZpvd() {
            return C56857yUx.OLrzqt;
        }
    }
}

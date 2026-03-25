package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yRn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56766yRn {
    public final boolean AEQbTJ;
    public final java.util.Collection<AnnotationQualifierApplicabilityType> EZpvd;
    public final C56858yUy OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yRn */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C56766yRn copy$default(C56766yRn c56766yRn, C56858yUy c56858yUy, java.util.Collection collection, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c56858yUy = c56766yRn.OLrzqt;
        }
        if ((i & 2) != 0) {
            collection = c56766yRn.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c56766yRn.AEQbTJ;
        }
        return c56766yRn.OLrzqt(c56858yUy, collection, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Collection<AnnotationQualifierApplicabilityType> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56766yRn OLrzqt(@NotNull C56858yUy c56858yUy, @NotNull java.util.Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z) {
        Intrinsics.checkNotNullParameter(c56858yUy, "");
        Intrinsics.checkNotNullParameter(collection, "");
        return new C56766yRn(c56858yUy, collection, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56858yUy OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C56766yRn)) {
            return false;
        }
        C56766yRn c56766yRn = (C56766yRn) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c56766yRn.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, c56766yRn.EZpvd) && this.AEQbTJ == c56766yRn.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.OLrzqt + ", qualifierApplicabilityTypes=" + this.EZpvd + ", definitelyNotNull=" + this.AEQbTJ + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56766yRn(@NotNull C56858yUy c56858yUy, @NotNull java.util.Collection<? extends AnnotationQualifierApplicabilityType> collection, boolean z) {
        Intrinsics.checkNotNullParameter(c56858yUy, "");
        Intrinsics.checkNotNullParameter(collection, "");
        this.OLrzqt = c56858yUy;
        this.EZpvd = collection;
        this.AEQbTJ = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000f: CONSTRUCTOR 
  (r1v0 o.yUy)
  (r2v0 java.util.Collection)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:boolean:?: TERNARY null = ((wrap:kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier:0x0004: INVOKE (r1v0 o.yUy) VIRTUAL call: o.yUy.OLrzqt():kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier A[MD:():kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier (m), WRAPPED] (LINE:14)) == (wrap:kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier:0x0008: SGET  A[WRAPPED] kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier)) ? true : false) : (r3v0 boolean))
 A[MD:(o.yUy, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType>, boolean):void (m)] (LINE:11) call: o.yRn.<init>(o.yUy, java.util.Collection, boolean):void type: THIS */
    public /* synthetic */ C56766yRn(C56858yUy c56858yUy, java.util.Collection collection, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c56858yUy, collection, (i & 4) != 0 ? c56858yUy.OLrzqt() == NullabilityQualifier.NOT_NULL : z);
    }
}

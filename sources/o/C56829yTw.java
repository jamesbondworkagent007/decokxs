package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yTw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56829yTw extends C59274zdu {
    public final JavaTypeFlexibility AEQbTJ;
    public final java.util.Set<InterfaceC56691yOt> AhwBna;
    public final TypeUsage EZpvd;
    public final AbstractC59242zdO KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: o.yTw */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C56829yTw copy$default(C56829yTw c56829yTw, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, java.util.Set set, AbstractC59242zdO abstractC59242zdO, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            typeUsage = c56829yTw.EZpvd;
        }
        if ((i & 2) != 0) {
            javaTypeFlexibility = c56829yTw.AEQbTJ;
        }
        JavaTypeFlexibility javaTypeFlexibility2 = javaTypeFlexibility;
        if ((i & 4) != 0) {
            z = c56829yTw.copydefault;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = c56829yTw.OLrzqt;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            set = c56829yTw.AhwBna;
        }
        java.util.Set set2 = set;
        if ((i & 32) != 0) {
            abstractC59242zdO = c56829yTw.KWHzl;
        }
        return c56829yTw.AEQbTJ(typeUsage, javaTypeFlexibility2, z3, z4, set2, abstractC59242zdO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56829yTw AEQbTJ(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, java.util.Set<? extends InterfaceC56691yOt> set, AbstractC59242zdO abstractC59242zdO) {
        Intrinsics.checkNotNullParameter(typeUsage, "");
        Intrinsics.checkNotNullParameter(javaTypeFlexibility, "");
        return new C56829yTw(typeUsage, javaTypeFlexibility, z, z2, set, abstractC59242zdO);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C59274zdu
    public java.util.Set<InterfaceC56691yOt> EZpvd() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JavaTypeFlexibility KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C59274zdu
    public TypeUsage OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.C59274zdu
    public AbstractC59242zdO copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean djBIcL() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.EZpvd + ", flexibility=" + this.AEQbTJ + ", isRaw=" + this.copydefault + ", isForAnnotationParameter=" + this.OLrzqt + ", visitedTypeParameters=" + this.AhwBna + ", defaultType=" + this.KWHzl + ')';
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (r8v0 kotlin.reflect.jvm.internal.impl.types.TypeUsage)
  (wrap:kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility:0x0004: SGET  A[WRAPPED] (LINE:15) kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility.INFLEXIBLE kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility) : (r9v0 kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0007: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
  (wrap:java.util.Set:?: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.Set) : (r12v0 java.util.Set))
  (wrap:o.zdO:?: TERNARY null = ((wrap:int:0x001e: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null o.zdO) : (r13v0 o.zdO))
 A[MD:(kotlin.reflect.jvm.internal.impl.types.TypeUsage, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility, boolean, boolean, java.util.Set<? extends o.yOt>, o.zdO):void (m)] (LINE:13) call: o.yTw.<init>(kotlin.reflect.jvm.internal.impl.types.TypeUsage, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility, boolean, boolean, java.util.Set, o.zdO):void type: THIS */
    public /* synthetic */ C56829yTw(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, java.util.Set set, AbstractC59242zdO abstractC59242zdO, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(typeUsage, (i & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : abstractC59242zdO);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: java.util.Set<? extends o.yOt> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C56829yTw(@NotNull TypeUsage typeUsage, @NotNull JavaTypeFlexibility javaTypeFlexibility, boolean z, boolean z2, java.util.Set<? extends InterfaceC56691yOt> set, AbstractC59242zdO abstractC59242zdO) {
        super(typeUsage, set, abstractC59242zdO);
        Intrinsics.checkNotNullParameter(typeUsage, "");
        Intrinsics.checkNotNullParameter(javaTypeFlexibility, "");
        this.EZpvd = typeUsage;
        this.AEQbTJ = javaTypeFlexibility;
        this.copydefault = z;
        this.OLrzqt = z2;
        this.AhwBna = set;
        this.KWHzl = abstractC59242zdO;
    }

    public final C56829yTw KWHzl(@NotNull JavaTypeFlexibility javaTypeFlexibility) {
        Intrinsics.checkNotNullParameter(javaTypeFlexibility, "");
        return copy$default(this, null, javaTypeFlexibility, false, false, null, null, 61, null);
    }

    public final C56829yTw OLrzqt(boolean z) {
        return copy$default(this, null, null, z, false, null, null, 59, null);
    }

    public C56829yTw AEQbTJ(AbstractC59242zdO abstractC59242zdO) {
        return copy$default(this, null, null, false, false, null, abstractC59242zdO, 31, null);
    }

    /* JADX DEBUG: Method merged with bridge method: AEQbTJ(Lo/yOt;)Lo/zdu; */
    @Override // o.C59274zdu
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public C56829yTw AEQbTJ(@NotNull InterfaceC56691yOt interfaceC56691yOt) {
        Intrinsics.checkNotNullParameter(interfaceC56691yOt, "");
        return copy$default(this, null, null, false, false, EZpvd() != null ? yEJ.OLrzqt(EZpvd(), interfaceC56691yOt) : yED.AEQbTJ(interfaceC56691yOt), null, 47, null);
    }

    @Override // o.C59274zdu
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C56829yTw)) {
            return false;
        }
        C56829yTw c56829yTw = (C56829yTw) obj;
        return Intrinsics.EZpvd(c56829yTw.copydefault(), copydefault()) && c56829yTw.OLrzqt() == OLrzqt() && c56829yTw.AEQbTJ == this.AEQbTJ && c56829yTw.copydefault == this.copydefault && c56829yTw.OLrzqt == this.OLrzqt;
    }

    @Override // o.C59274zdu
    public int hashCode() {
        AbstractC59242zdO abstractC59242zdOCopydefault = copydefault();
        int iHashCode = abstractC59242zdOCopydefault != null ? abstractC59242zdOCopydefault.hashCode() : 0;
        int iHashCode2 = iHashCode + (iHashCode * 31) + OLrzqt().hashCode();
        int iHashCode3 = iHashCode2 + (iHashCode2 * 31) + this.AEQbTJ.hashCode();
        int i = iHashCode3 + (iHashCode3 * 31) + (this.copydefault ? 1 : 0);
        return i + (i * 31) + (this.OLrzqt ? 1 : 0);
    }
}

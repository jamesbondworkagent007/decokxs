package o;

import com.okinc.business.dex.trade.order.domain.model.OrderStrategyType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20069gZt {
    public static final Application Companion = new Application(null);
    public static final int EZpvd = 8;
    public final java.util.List<C20064gZo> AEQbTJ;
    public final java.util.List<C20064gZo> KWHzl;
    public final C19818gQl OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C20069gZt() {
        this(null, null, false, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gZt */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C20069gZt copy$default(C20069gZt c20069gZt, java.util.List list, java.util.List list2, boolean z, C19818gQl c19818gQl, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c20069gZt.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list2 = c20069gZt.KWHzl;
        }
        if ((i & 4) != 0) {
            z = c20069gZt.copydefault;
        }
        if ((i & 8) != 0) {
            c19818gQl = c20069gZt.OLrzqt;
        }
        return c20069gZt.AEQbTJ(list, list2, z, c19818gQl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C20064gZo> AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20069gZt AEQbTJ(@NotNull java.util.List<C20064gZo> list, @NotNull java.util.List<C20064gZo> list2, boolean z, C19818gQl c19818gQl) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new C20069gZt(list, list2, z, c19818gQl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C19818gQl KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C20064gZo> OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20069gZt)) {
            return false;
        }
        C20069gZt c20069gZt = (C20069gZt) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c20069gZt.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c20069gZt.KWHzl) && this.copydefault == c20069gZt.copydefault && Intrinsics.EZpvd(this.OLrzqt, c20069gZt.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        int iHashCode2 = this.KWHzl.hashCode();
        int iHashCode3 = java.lang.Boolean.hashCode(this.copydefault);
        C19818gQl c19818gQl = this.OLrzqt;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (c19818gQl == null ? 0 : c19818gQl.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RightActionGroup(cancelList=" + this.AEQbTJ + ", resumeList=" + this.KWHzl + ", fromAdvanced=" + this.copydefault + ", trackParams=" + this.OLrzqt + ")";
    }

    public C20069gZt(@NotNull java.util.List<C20064gZo> list, @NotNull java.util.List<C20064gZo> list2, boolean z, C19818gQl c19818gQl) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.AEQbTJ = list;
        this.KWHzl = list2;
        this.copydefault = z;
        this.OLrzqt = c19818gQl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0026: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:240)) : (r8v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:241)) : (r9v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r10v0 boolean))
  (wrap:o.gQl:?: TERNARY null = ((wrap:int:0x0015: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:o.gQl:0x0023: CONSTRUCTOR 
  (null java.lang.String)
  (null java.lang.String)
  (null java.lang.String)
  (null java.util.Map)
  (15 int)
  (null kotlin.jvm.internal.DefaultConstructorMarker)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:243) call: o.gQl.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r11v0 o.gQl))
 A[MD:(java.util.List<o.gZo>, java.util.List<o.gZo>, boolean, o.gQl):void (m)] (LINE:239) call: o.gZt.<init>(java.util.List, java.util.List, boolean, o.gQl):void type: THIS */
    public /* synthetic */ C20069gZt(java.util.List list, java.util.List list2, boolean z, C19818gQl c19818gQl, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new C19818gQl(null, null, null, null, 15, null) : c19818gQl);
    }

    public final boolean EZpvd() {
        return (this.AEQbTJ.isEmpty() ^ true) || (this.KWHzl.isEmpty() ^ true);
    }

    /* JADX INFO: renamed from: o.gZt$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.gZt.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C20069gZt AEQbTJ(boolean z, @NotNull java.util.List<? extends java.lang.Object> list, boolean z2, C19818gQl c19818gQl) {
            Intrinsics.checkNotNullParameter(list, "");
            if (!z) {
                return new C20069gZt(yDY.AhwBna(), yDY.AhwBna(), false, null, 12, null);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                C20064gZo c20064gZo = obj instanceof C20064gZo ? (C20064gZo) obj : null;
                if (c20064gZo != null && c20064gZo.djBIcL() != OrderStrategyType.Market) {
                    if (c20064gZo.iwGUEr()) {
                        arrayList.add(c20064gZo);
                    }
                    if (c20064gZo.uzCIH()) {
                        arrayList2.add(c20064gZo);
                    }
                }
            }
            return new C20069gZt(arrayList, arrayList2, z2, c19818gQl);
        }
    }
}

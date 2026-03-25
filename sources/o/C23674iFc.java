package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iFc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23674iFc {
    public final java.util.List<C23625iDh> AEQbTJ;
    public final java.util.List<C23625iDh> EZpvd;
    public final java.util.List<C23625iDh> KWHzl;
    public final java.util.List<C23625iDh> valueOf;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int copydefault = 8;
    public static final C23674iFc OLrzqt = new C23674iFc(null, null, null, null, 15, null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23674iFc() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.iFc */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C23674iFc copy$default(C23674iFc c23674iFc, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c23674iFc.EZpvd;
        }
        if ((i & 2) != 0) {
            list2 = c23674iFc.KWHzl;
        }
        if ((i & 4) != 0) {
            list3 = c23674iFc.valueOf;
        }
        if ((i & 8) != 0) {
            list4 = c23674iFc.AEQbTJ;
        }
        return c23674iFc.EZpvd(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23674iFc EZpvd(@NotNull java.util.List<C23625iDh> list, @NotNull java.util.List<C23625iDh> list2, @NotNull java.util.List<C23625iDh> list3, @NotNull java.util.List<C23625iDh> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        return new C23674iFc(list, list2, list3, list4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23674iFc)) {
            return false;
        }
        C23674iFc c23674iFc = (C23674iFc) obj;
        return Intrinsics.EZpvd(this.EZpvd, c23674iFc.EZpvd) && Intrinsics.EZpvd(this.KWHzl, c23674iFc.KWHzl) && Intrinsics.EZpvd(this.valueOf, c23674iFc.valueOf) && Intrinsics.EZpvd(this.AEQbTJ, c23674iFc.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.valueOf.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductDetailLogo(middleLogos=" + this.EZpvd + ", topLeftLogos=" + this.KWHzl + ", topRightLogos=" + this.valueOf + ", bottomRightLogos=" + this.AEQbTJ + ")";
    }

    public C23674iFc(@NotNull java.util.List<C23625iDh> list, @NotNull java.util.List<C23625iDh> list2, @NotNull java.util.List<C23625iDh> list3, @NotNull java.util.List<C23625iDh> list4) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(list3, "");
        Intrinsics.checkNotNullParameter(list4, "");
        this.EZpvd = list;
        this.KWHzl = list2;
        this.valueOf = list3;
        this.AEQbTJ = list4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0020: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:148)) : (r1v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0008: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:149)) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0010: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0014: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:150)) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x001c: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:151)) : (r4v0 java.util.List))
 A[MD:(java.util.List<o.iDh>, java.util.List<o.iDh>, java.util.List<o.iDh>, java.util.List<o.iDh>):void (m)] (LINE:147) call: o.iFc.<init>(java.util.List, java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C23674iFc(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? yDY.AhwBna() : list2, (i & 4) != 0 ? yDY.AhwBna() : list3, (i & 8) != 0 ? yDY.AhwBna() : list4);
    }

    /* JADX INFO: renamed from: o.iFc$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iFc.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C23674iFc copydefault() {
            return C23674iFc.OLrzqt;
        }
    }
}

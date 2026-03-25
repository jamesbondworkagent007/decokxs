package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37982pHx {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public final java.util.List<java.util.List<java.lang.String>> AEQbTJ;
    public final java.util.List<java.util.List<java.lang.String>> KWHzl;
    public final java.util.List<java.util.List<java.lang.String>> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C37982pHx() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHx */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37982pHx copy$default(C37982pHx c37982pHx, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c37982pHx.AEQbTJ;
        }
        if ((i & 2) != 0) {
            list2 = c37982pHx.KWHzl;
        }
        if ((i & 4) != 0) {
            list3 = c37982pHx.OLrzqt;
        }
        return c37982pHx.OLrzqt(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37982pHx OLrzqt(java.util.List<? extends java.util.List<java.lang.String>> list, java.util.List<? extends java.util.List<java.lang.String>> list2, java.util.List<? extends java.util.List<java.lang.String>> list3) {
        return new C37982pHx(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37982pHx)) {
            return false;
        }
        C37982pHx c37982pHx = (C37982pHx) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c37982pHx.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, c37982pHx.KWHzl) && Intrinsics.EZpvd(this.OLrzqt, c37982pHx.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<java.util.List<java.lang.String>> list = this.AEQbTJ;
        int iHashCode = list == null ? 0 : list.hashCode();
        java.util.List<java.util.List<java.lang.String>> list2 = this.KWHzl;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        java.util.List<java.util.List<java.lang.String>> list3 = this.OLrzqt;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TakerBuySellVolData(cont=" + this.AEQbTJ + ", crypto=" + this.KWHzl + ", usds=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37982pHx(java.util.List<? extends java.util.List<java.lang.String>> list, java.util.List<? extends java.util.List<java.lang.String>> list2, java.util.List<? extends java.util.List<java.lang.String>> list3) {
        this.AEQbTJ = list;
        this.KWHzl = list2;
        this.OLrzqt = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:8) call: o.pHx.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C37982pHx(java.util.List list, java.util.List list2, java.util.List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }

    /* JADX INFO: renamed from: o.pHx$ActionBar */
    public static final class ActionBar {

        /* JADX INFO: renamed from: o.pHx$ActionBar$StateListAnimator */
        public static final class StateListAnimator extends TypeToken<java.util.List<? extends C37982pHx>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHx.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C37982pHx copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                java.util.List list = (java.util.List) new Gson().fromJson(str, new StateListAnimator().getType());
                if (list != null && !list.isEmpty()) {
                    return (C37982pHx) list.get(0);
                }
                pUU.copydefault("JSON PARSE", "TakerBuySellVolData: " + list + " source:" + str);
            } catch (java.lang.Exception e) {
                pUU.copydefault("JSON PARSE", "TakerBuySellVolData-jsonConvertSingle" + e.getMessage());
            }
            return null;
        }
    }
}

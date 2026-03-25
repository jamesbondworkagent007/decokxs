package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37983pHy {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final java.util.List<java.util.List<java.lang.String>> AEQbTJ;
    public final java.util.List<java.util.List<java.lang.String>> OLrzqt;
    public final java.util.List<java.util.List<java.lang.String>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C37983pHy() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHy */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37983pHy copy$default(C37983pHy c37983pHy, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c37983pHy.OLrzqt;
        }
        if ((i & 2) != 0) {
            list2 = c37983pHy.AEQbTJ;
        }
        if ((i & 4) != 0) {
            list3 = c37983pHy.copydefault;
        }
        return c37983pHy.KWHzl(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37983pHy KWHzl(java.util.List<? extends java.util.List<java.lang.String>> list, java.util.List<? extends java.util.List<java.lang.String>> list2, java.util.List<? extends java.util.List<java.lang.String>> list3) {
        return new C37983pHy(list, list2, list3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37983pHy)) {
            return false;
        }
        C37983pHy c37983pHy = (C37983pHy) obj;
        return Intrinsics.EZpvd(this.OLrzqt, c37983pHy.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c37983pHy.AEQbTJ) && Intrinsics.EZpvd(this.copydefault, c37983pHy.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<java.util.List<java.lang.String>> list = this.OLrzqt;
        int iHashCode = list == null ? 0 : list.hashCode();
        java.util.List<java.util.List<java.lang.String>> list2 = this.AEQbTJ;
        int iHashCode2 = list2 == null ? 0 : list2.hashCode();
        java.util.List<java.util.List<java.lang.String>> list3 = this.copydefault;
        return (((iHashCode * 31) + iHashCode2) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OIData(cont=" + this.OLrzqt + ", crypto=" + this.AEQbTJ + ", usds=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37983pHy(java.util.List<? extends java.util.List<java.lang.String>> list, java.util.List<? extends java.util.List<java.lang.String>> list2, java.util.List<? extends java.util.List<java.lang.String>> list3) {
        this.OLrzqt = list;
        this.AEQbTJ = list2;
        this.copydefault = list3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
 A[MD:(java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<? extends java.util.List<java.lang.String>>, java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:8) call: o.pHy.<init>(java.util.List, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ C37983pHy(java.util.List list, java.util.List list2, java.util.List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3);
    }

    /* JADX INFO: renamed from: o.pHy$Application */
    public static final class Application {

        /* JADX INFO: renamed from: o.pHy$Application$Activity */
        public static final class Activity extends TypeToken<java.util.List<? extends C37983pHy>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHy.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C37983pHy EZpvd(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                java.util.List list = (java.util.List) new Gson().fromJson(str, new Activity().getType());
                if (list != null && !list.isEmpty()) {
                    return (C37983pHy) list.get(0);
                }
                pUU.copydefault("JSON PARSE", "OIData: " + list + " source:" + str);
            } catch (java.lang.Exception e) {
                pUU.copydefault("JSON PARSE", "OIData-jsonConvertSingle" + e.getMessage());
            }
            return null;
        }
    }
}

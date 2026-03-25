package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37977pHs {
    public static final Activity Companion = new Activity(null);
    public static final int copydefault = 8;
    public final java.util.List<java.util.List<java.lang.String>> AEQbTJ;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C37977pHs() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHs */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37977pHs copy$default(C37977pHs c37977pHs, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c37977pHs.AEQbTJ;
        }
        return c37977pHs.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37977pHs OLrzqt(java.util.List<? extends java.util.List<java.lang.String>> list) {
        return new C37977pHs(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37977pHs) && Intrinsics.EZpvd(this.AEQbTJ, ((C37977pHs) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<java.util.List<java.lang.String>> list = this.AEQbTJ;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "EliteLSOIRatioData(def=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37977pHs(java.util.List<? extends java.util.List<java.lang.String>> list) {
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:8) call: o.pHs.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C37977pHs(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: o.pHs$Activity */
    public static final class Activity {

        /* JADX INFO: renamed from: o.pHs$Activity$TaskDescription */
        public static final class TaskDescription extends TypeToken<java.util.List<? extends C37977pHs>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHs.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C37977pHs copydefault(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                java.util.List list = (java.util.List) new Gson().fromJson(str, new TaskDescription().getType());
                if (list != null && !list.isEmpty()) {
                    return (C37977pHs) list.get(0);
                }
                pUU.copydefault("JSON PARSE", "EliteLSOIRatioData jsonConvertSingle: " + list + " source:" + str);
            } catch (java.lang.Exception e) {
                pUU.copydefault("JSON PARSE", "EliteLSOIRatioData-jsonConvertSingle" + e.getMessage());
            }
            return null;
        }
    }
}

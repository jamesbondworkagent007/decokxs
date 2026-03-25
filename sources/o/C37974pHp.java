package o;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pHp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C37974pHp {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public final java.util.List<java.util.List<java.lang.String>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C37974pHp() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.pHp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C37974pHp copy$default(C37974pHp c37974pHp, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c37974pHp.copydefault;
        }
        return c37974pHp.KWHzl(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.util.List<java.lang.String>> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C37974pHp KWHzl(java.util.List<? extends java.util.List<java.lang.String>> list) {
        return new C37974pHp(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C37974pHp) && Intrinsics.EZpvd(this.copydefault, ((C37974pHp) obj).copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.util.List<java.util.List<java.lang.String>> list = this.copydefault;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "LSAccountRatioData(def=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C37974pHp(java.util.List<? extends java.util.List<java.lang.String>> list) {
        this.copydefault = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r1v0 java.util.List))
 A[MD:(java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:8) call: o.pHp.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C37974pHp(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX INFO: renamed from: o.pHp$ActionBar */
    public static final class ActionBar {

        /* JADX INFO: renamed from: o.pHp$ActionBar$TaskDescription */
        public static final class TaskDescription extends TypeToken<java.util.List<? extends C37974pHp>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.pHp.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C37974pHp OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                java.util.List list = (java.util.List) new Gson().fromJson(str, new TaskDescription().getType());
                if (list != null && !list.isEmpty()) {
                    return (C37974pHp) list.get(0);
                }
                pUU.copydefault("JSON PARSE", "LSAccountRatioData jsonConvertSingle: " + list + " source:" + str);
            } catch (java.lang.Exception e) {
                pUU.copydefault("JSON PARSE", "LSAccountRatioData-jsonConvertSingle" + e.getMessage());
            }
            return null;
        }
    }
}

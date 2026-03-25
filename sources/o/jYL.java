package o;

import com.okinc.business.market.features.holders.domain.model.HolderDetailModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public interface jYL {

    public static final class ActionBar implements jYL {
        public static final ActionBar copydefault = new ActionBar();

        private ActionBar() {
        }
    }

    public static final class Application implements jYL {
        public static final Application copydefault = new Application();

        private Application() {
        }
    }

    public static final class Activity implements jYL {
        public final java.lang.String AEQbTJ;
        public final C26211jWa EZpvd;
        public final boolean KWHzl;
        public final java.util.List<HolderDetailModel> OLrzqt;
        public final jYC copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
            this(null, null, null, null, false, 31, null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.jYL$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, jYC jyc, java.lang.String str, C26211jWa c26211jWa, java.util.List list, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                jyc = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str = activity.AEQbTJ;
            }
            java.lang.String str2 = str;
            if ((i & 4) != 0) {
                c26211jWa = activity.EZpvd;
            }
            C26211jWa c26211jWa2 = c26211jWa;
            if ((i & 8) != 0) {
                list = activity.OLrzqt;
            }
            java.util.List list2 = list;
            if ((i & 16) != 0) {
                z = activity.KWHzl;
            }
            return activity.copydefault(jyc, str2, c26211jWa2, list2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String AEQbTJ() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final C26211jWa KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final jYC OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.List<HolderDetailModel> copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(jYC jyc, @NotNull java.lang.String str, @NotNull C26211jWa c26211jWa, @NotNull java.util.List<HolderDetailModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c26211jWa, "");
            Intrinsics.checkNotNullParameter(list, "");
            return new Activity(jyc, str, c26211jWa, list, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activity)) {
                return false;
            }
            Activity activity = (Activity) obj;
            return Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && Intrinsics.EZpvd(this.EZpvd, activity.EZpvd) && Intrinsics.EZpvd(this.OLrzqt, activity.OLrzqt) && this.KWHzl == activity.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            jYC jyc = this.copydefault;
            return ((((((((jyc == null ? 0 : jyc.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "Content(header=" + this.copydefault + ", addressFilter=" + this.AEQbTJ + ", filterTag=" + this.EZpvd + ", top100Holders=" + this.OLrzqt + ", shouldShowAvgPriceInfo=" + this.KWHzl + ")";
        }

        public Activity(jYC jyc, @NotNull java.lang.String str, @NotNull C26211jWa c26211jWa, @NotNull java.util.List<HolderDetailModel> list, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(c26211jWa, "");
            Intrinsics.checkNotNullParameter(list, "");
            this.copydefault = jyc;
            this.AEQbTJ = str;
            this.EZpvd = c26211jWa;
            this.OLrzqt = list;
            this.KWHzl = z;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (wrap:o.jYC:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null o.jYC) : (r7v0 o.jYC))
  (wrap:java.lang.String:0x000b: TERNARY null = ((wrap:int:0x0005: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:o.jWa:?: TERNARY null = ((wrap:int:0x000c: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0018: CONSTRUCTOR (0 int), (null java.lang.String), (null java.lang.String), (7 int), (null kotlin.jvm.internal.DefaultConstructorMarker) A[MD:(int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:40) call: o.jWa.<init>(int, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r9v0 o.jWa))
  (wrap:java.util.List:0x0025: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0021: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:41)) : (r10v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0026: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r11v0 boolean))
 A[MD:(o.jYC, java.lang.String, o.jWa, java.util.List<com.okinc.business.market.features.holders.domain.model.HolderDetailModel>, boolean):void (m)] (LINE:37) call: o.jYL.Activity.<init>(o.jYC, java.lang.String, o.jWa, java.util.List, boolean):void type: THIS */
        public /* synthetic */ Activity(jYC jyc, java.lang.String str, C26211jWa c26211jWa, java.util.List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : jyc, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? new C26211jWa(0, null, null, 7, null) : c26211jWa, (i & 8) != 0 ? yDY.AhwBna() : list, (i & 16) != 0 ? false : z);
        }
    }
}

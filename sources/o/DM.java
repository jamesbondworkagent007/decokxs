package o;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.immomo.mls.fun.ud.UDPath;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DM {
    public static final ActionBar KWHzl = new ActionBar(null);
    public static final java.util.Set<DM> OLrzqt;
    public static final DM copydefault;
    public final int AEQbTJ;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int) A[MD:(int):void (m)] call: o.DM.<init>(int):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ DM(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ;
    }

    public DM(int i) {
        this.AEQbTJ = i;
    }

    public static final class Activity extends DM {
        public static final Activity EZpvd = new Activity();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DM
        public java.lang.String toString() {
            return UDPath.LUA_CLASS_NAME;
        }

        private Activity() {
            super(1, null);
        }
    }

    public static final class TaskDescription extends DM {
        public static final TaskDescription EZpvd = new TaskDescription();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DM
        public java.lang.String toString() {
            return "QueryParameters";
        }

        private TaskDescription() {
            super(2, null);
        }
    }

    public static final class Application extends DM {
        public static final Application EZpvd = new Application();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.DM
        public java.lang.String toString() {
            return "Fragment";
        }

        private Application() {
            super(4, null);
        }
    }

    public static final class StateListAnimator extends DM {
        public StateListAnimator(int i) {
            super(i, null);
        }
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof DM) && this.AEQbTJ == ((DM) obj).AEQbTJ;
    }

    public java.lang.String toString() {
        java.util.Set<DM> set = OLrzqt;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : set) {
            if (copydefault((DM) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt___CollectionsKt.joinToString$default(arrayList, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, 0, null, null, 62, null);
    }

    public final boolean copydefault(@NotNull DM dm) {
        Intrinsics.checkNotNullParameter(dm, "");
        return (dm.AEQbTJ & this.AEQbTJ) != 0;
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.DM.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final DM copydefault() {
            return DM.copydefault;
        }
    }

    static {
        int i = 0;
        java.util.Set<DM> setAhwBna = yEE.AhwBna(Activity.EZpvd, TaskDescription.EZpvd, Application.EZpvd);
        OLrzqt = setAhwBna;
        java.util.Iterator<T> it = setAhwBna.iterator();
        while (it.hasNext()) {
            i += ((DM) it.next()).AEQbTJ;
        }
        copydefault = new StateListAnimator(i);
    }
}

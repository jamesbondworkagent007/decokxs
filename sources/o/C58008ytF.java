package o;

import android.app.ActivityManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ytF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C58008ytF {
    public static final Activity Companion = new Activity(null);
    public final java.util.List<java.lang.String> OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C58008ytF() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.ytF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C58008ytF copy$default(C58008ytF c58008ytF, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = c58008ytF.OLrzqt;
        }
        return c58008ytF.OLrzqt(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C58008ytF OLrzqt(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new C58008ytF(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58008ytF) && Intrinsics.EZpvd(this.OLrzqt, ((C58008ytF) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    public C58008ytF(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0001: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0008: INVOKE (wrap:o.ytF$Activity:0x0004: SGET  A[WRAPPED] o.ytF.Companion o.ytF$Activity), false, (1 int), (null java.lang.Object) STATIC call: o.ytF.Activity.getRunningForegroundServices$default(o.ytF$Activity, boolean, int, java.lang.Object):java.util.List A[MD:(o.ytF$Activity, boolean, int, java.lang.Object):java.util.List (m), WRAPPED] (LINE:555)) : (r2v0 java.util.List))
 A[MD:(java.util.List<java.lang.String>):void (m)] (LINE:555) call: o.ytF.<init>(java.util.List):void type: THIS */
    public /* synthetic */ C58008ytF(java.util.List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Activity.getRunningForegroundServices$default(Companion, false, 1, null) : list);
    }

    /* JADX INFO: renamed from: o.ytF$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.ytF.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ java.util.List getRunningForegroundServices$default(Activity activity, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return activity.copydefault(z);
        }

        public final java.util.List<java.lang.String> copydefault(boolean z) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.List<ActivityManager.RunningServiceInfo> listAhwBna = yDY.AhwBna();
            try {
                java.util.List<ActivityManager.RunningServiceInfo> runningServices = C58012ytJ.KWHzl.AEQbTJ().getRunningServices(Integer.MAX_VALUE);
                Intrinsics.checkNotNullExpressionValue(runningServices, "");
                listAhwBna = runningServices;
            } catch (java.lang.Throwable th) {
                C58013ytK.OLrzqt("Matrix.MemoryInfoFactory", th, "", new java.lang.Object[0]);
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : listAhwBna) {
                if (runningServiceInfo.uid == android.os.Process.myUid() && (z || runningServiceInfo.pid == android.os.Process.myPid())) {
                    if (runningServiceInfo.foreground) {
                        arrayList.add(runningServiceInfo.service.getClassName());
                    }
                }
            }
            return arrayList;
        }
    }

    public java.lang.String toString() {
        java.lang.String string = java.util.Arrays.toString(this.OLrzqt.toArray(new java.lang.String[0]));
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}

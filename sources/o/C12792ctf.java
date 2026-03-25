package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ctf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12792ctf {
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:62:0x00c1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [o.ctf$Application] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o.ctf$Application] */
    public final Application KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.util.List<Activity> list) {
        java.lang.String str8 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        int i = 2;
        ?? application = 0;
        application = 0;
        if (str5 == null || str5.length() == 0 || str6 == null || str6.length() == 0 || str7 == null || str7.length() == 0) {
            return new Application(str8, application, i, application);
        }
        if (list == null || list.isEmpty()) {
            return C33129mqd.copydefault(str, str4) ? new Application(str5, application, i, application) : C33129mqd.copydefault(str, str3) ? new Application(str6, application, i, application) : new Application(str7, application, i, application);
        }
        if (C33129mqd.AEQbTJ(str, str4)) {
            return new Application(str5, "<");
        }
        if (C33129mqd.OLrzqt(str, str4)) {
            return new Application(str5, application, i, application);
        }
        if (C33129mqd.AEQbTJ(str, str3)) {
            return new Application(str6, "<");
        }
        if (C33129mqd.OLrzqt(str, str3)) {
            return new Application(str6, application, i, application);
        }
        if (C33129mqd.AEQbTJ(str, str2)) {
            return new Application(str7, "");
        }
        if (C33129mqd.OLrzqt(str, str2)) {
            return new Application(str7, application, i, application);
        }
        if (list != null) {
            java.util.Iterator it = CollectionsKt___CollectionsKt.EZpvd(list, new TaskDescription()).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (i2 < 0) {
                    yDY.AYXKKw();
                }
                Activity activity = (Activity) next;
                if (C33129mqd.gEmmrt(str, activity.KWHzl())) {
                    application = new Application(activity.OLrzqt(), ">");
                    break;
                }
                i2++;
            }
        }
        return application == 0 ? new Application(str7, ">") : application;
    }

    public static /* synthetic */ java.lang.String showCastTime$default(C12792ctf c12792ctf, Application application, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c12792ctf.copydefault(application, z);
    }

    public final java.lang.String copydefault(@NotNull Application application, boolean z) {
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strEZpvd = application.EZpvd();
        if (strEZpvd == null || strEZpvd.length() == 0) {
            return EZpvd(application.copydefault(), z);
        }
        return application.EZpvd() + " " + showCastTime$default(this, application.copydefault(), false, 2, (java.lang.Object) null);
    }

    public static /* synthetic */ java.lang.String showCastTime$default(C12792ctf c12792ctf, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c12792ctf.EZpvd(str, z);
    }

    public final java.lang.String EZpvd(java.lang.String str, boolean z) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (z) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C13754dXa.FragmentManager.run);
            BigDecimal bigDecimalMax = C54862xYb.divB$default(str, "60", 0, null, 6, null).max(new BigDecimal(1));
            Intrinsics.checkNotNullExpressionValue(bigDecimalMax, "");
            return C33069mpW.OLrzqt(strAYXKKw, C56423yEv.EZpvd(C56390yDp.OLrzqt("num", C54862xYb.OLrzqt(bigDecimalMax, false, 0, RoundingMode.DOWN))));
        }
        if (C33129mqd.copydefault(str, "60")) {
            return C54862xYb.OLrzqt(C54862xYb.divB$default(str, "60", 0, null, 6, null), false, 0, RoundingMode.DOWN) + " " + C33070mpX.AYXKKw(C13754dXa.FragmentManager.finishInit);
        }
        return str + " " + C33070mpX.AYXKKw(C13754dXa.FragmentManager.setPageName);
    }

    /* JADX INFO: renamed from: o.ctf$Activity */
    public static final class Activity {
        public final java.lang.String EZpvd;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.EZpvd;
            }
            if ((i & 2) != 0) {
                str2 = activity.copydefault;
            }
            return activity.EZpvd(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(java.lang.String str, java.lang.String str2) {
            return new Activity(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.copydefault;
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.EZpvd;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.copydefault;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EstimateTimeData(fee=" + this.EZpvd + ", time=" + this.copydefault + ")";
        }

        public Activity(java.lang.String str, java.lang.String str2) {
            this.EZpvd = str;
            this.copydefault = str2;
        }
    }

    /* JADX INFO: renamed from: o.ctf$Application */
    public static final class Application {
        public final java.lang.String KWHzl;
        public final java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.OLrzqt;
            }
            if ((i & 2) != 0) {
                str2 = application.KWHzl;
            }
            return application.OLrzqt(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String EZpvd() {
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application OLrzqt(java.lang.String str, java.lang.String str2) {
            return new Application(str, str2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Application)) {
                return false;
            }
            Application application = (Application) obj;
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) application.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) application.KWHzl);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            java.lang.String str = this.OLrzqt;
            int iHashCode = str == null ? 0 : str.hashCode();
            java.lang.String str2 = this.KWHzl;
            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "EstimateTimeResult(time=" + this.OLrzqt + ", sign=" + this.KWHzl + ")";
        }

        public Application(java.lang.String str, java.lang.String str2) {
            this.OLrzqt = str;
            this.KWHzl = str2;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:102) call: o.ctf.Application.<init>(java.lang.String, java.lang.String):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2);
        }
    }

    /* JADX INFO: renamed from: o.ctf$TaskDescription */
    public static final class TaskDescription<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl(pTB.OLrzqt((java.lang.Object) ((Activity) t).KWHzl()), pTB.OLrzqt((java.lang.Object) ((Activity) t2).KWHzl()));
        }
    }
}

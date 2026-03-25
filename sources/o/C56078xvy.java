package o;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xvy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C56078xvy {
    public static final C56078xvy KWHzl = new C56078xvy();

    private C56078xvy() {
    }

    /* JADX INFO: renamed from: o.xvy$Activity */
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final java.lang.String EZpvd;
        public final java.lang.String OLrzqt;
        public final java.lang.String copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.copydefault;
            }
            if ((i & 2) != 0) {
                str2 = activity.EZpvd;
            }
            if ((i & 4) != 0) {
                str3 = activity.OLrzqt;
            }
            if ((i & 8) != 0) {
                str4 = activity.AEQbTJ;
            }
            return activity.OLrzqt(str, str2, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String KWHzl() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String OLrzqt() {
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            return new Activity(str, str2, str3, str4);
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
            return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) activity.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) activity.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "CurrencyInfo(baseCurrency=" + this.copydefault + ", quoteCurrency=" + this.EZpvd + ", marginType=" + this.OLrzqt + ", optionType=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(str4, "");
            this.copydefault = str;
            this.EZpvd = str2;
            this.OLrzqt = str3;
            this.AEQbTJ = str4;
        }
    }

    public static final Activity AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            return null;
        }
        int iHashCode = str2.hashCode();
        if (iHashCode == -1956807563) {
            if (str2.equals("OPTION")) {
                return KWHzl.OLrzqt(str);
            }
            return null;
        }
        if (iHashCode == 2558355) {
            if (str2.equals("SWAP")) {
                return KWHzl.copydefault(str);
            }
            return null;
        }
        if (iHashCode == 214415088 && str2.equals("FUTURES")) {
            return KWHzl.AEQbTJ(str);
        }
        return null;
    }

    public final Activity copydefault(java.lang.String str) {
        java.lang.String str2;
        java.lang.String strEZpvd = StringsKt__StringsKt.EZpvd(str, (java.lang.CharSequence) "-SWAP");
        if (Intrinsics.EZpvd((java.lang.Object) strEZpvd, (java.lang.Object) str)) {
            return null;
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strEZpvd, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() < 2) {
            return null;
        }
        java.lang.String str3 = (java.lang.String) listSplit$default.get(0);
        java.lang.String strEZpvd2 = (java.lang.String) listSplit$default.get(1);
        if (C59449zhJ.endsWith$default(strEZpvd2, "_UM", false, 2, null)) {
            str2 = "UM";
        } else {
            str2 = C59449zhJ.endsWith$default(strEZpvd2, "_CM", false, 2, null) ? "CM" : "";
        }
        if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "UM")) {
            strEZpvd2 = StringsKt__StringsKt.EZpvd(strEZpvd2, (java.lang.CharSequence) ("_" + str2));
        } else if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "CM")) {
            strEZpvd2 = str3;
        }
        return new Activity(str3, strEZpvd2, str2, "");
    }

    public final Activity AEQbTJ(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() < 3) {
            return null;
        }
        return new Activity((java.lang.String) listSplit$default.get(0), (java.lang.String) listSplit$default.get(1), "", "");
    }

    public final Activity OLrzqt(java.lang.String str) {
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) str, new java.lang.String[]{"-"}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() < 5) {
            return null;
        }
        java.lang.String str2 = (java.lang.String) listSplit$default.get(0);
        java.lang.String str3 = (java.lang.String) listSplit$default.get(1);
        java.lang.String str4 = (java.lang.String) listSplit$default.get(4);
        if (yDY.gEmmrt("C", "P").contains(str4)) {
            return new Activity(str2, str3, "", str4);
        }
        return null;
    }

    public static final java.lang.String KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Activity activityAEQbTJ = AEQbTJ(str, str2);
        return (activityAEQbTJ == null || (strKWHzl = activityAEQbTJ.KWHzl()) == null) ? "" : strKWHzl;
    }

    public static final java.lang.String copydefault(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String strOLrzqt;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Activity activityAEQbTJ = AEQbTJ(str, str2);
        return (activityAEQbTJ == null || (strOLrzqt = activityAEQbTJ.OLrzqt()) == null) ? "" : strOLrzqt;
    }
}

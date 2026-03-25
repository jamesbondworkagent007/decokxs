package o;

import com.google.errorprone.annotations.Keep;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.dXK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class dXK {
    public static final dXK OLrzqt = new dXK();

    private dXK() {
    }

    @Keep
    public static final class Activity {
        public final java.lang.String AEQbTJ;
        public final long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, long j, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.AEQbTJ;
            }
            if ((i & 2) != 0) {
                j = activity.copydefault;
            }
            return activity.EZpvd(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity EZpvd(@NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            return new Activity(str, j);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final long OLrzqt() {
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.lang.String copydefault() {
            return this.AEQbTJ;
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
            return Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) activity.AEQbTJ) && this.copydefault == activity.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.AEQbTJ.hashCode() * 31) + java.lang.Long.hashCode(this.copydefault);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "ApproveTimestamp(walletId=" + this.AEQbTJ + ", timestamp=" + this.copydefault + ")";
        }

        public Activity(@NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ = str;
            this.copydefault = j;
        }
    }

    public final java.lang.Long OLrzqt(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = SPUtils.getArrayList("risky_approve_popup_timestamp_map", Activity.class);
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((Activity) next).copydefault(), (java.lang.Object) str)) {
                break;
            }
        }
        Activity activity = (Activity) next;
        if (activity != null) {
            return java.lang.Long.valueOf(activity.OLrzqt());
        }
        return null;
    }

    public final void KWHzl(@NotNull final java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = SPUtils.getArrayList("risky_approve_popup_timestamp_map", Activity.class);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        final Function1 function1 = new Function1() { // from class: o.dXX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(dXK.AhwBna(str, (dXK.Activity) obj));
            }
        };
        arrayList.removeIf(new java.util.function.Predicate() { // from class: o.dXT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return dXK.AhwBna(function1, obj);
            }
        });
        arrayList.add(new Activity(str, j));
        SPUtils.put("risky_approve_popup_timestamp_map", arrayList);
    }

    public static final boolean AhwBna(java.lang.String str, Activity activity) {
        return Intrinsics.EZpvd((java.lang.Object) activity.copydefault(), (java.lang.Object) str);
    }

    public static final boolean AhwBna(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = SPUtils.getArrayList("risky_approve_popup_timestamp_map", Activity.class);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        for (final java.lang.String str : list) {
            final Function1 function1 = new Function1() { // from class: o.dXR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(dXK.KWHzl(str, (dXK.Activity) obj));
                }
            };
            arrayList.removeIf(new java.util.function.Predicate() { // from class: o.dXO
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return dXK.AEQbTJ(function1, obj);
                }
            });
        }
        SPUtils.put("risky_approve_popup_timestamp_map", arrayList);
    }

    public static final boolean AEQbTJ(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean KWHzl(java.lang.String str, Activity activity) {
        return Intrinsics.EZpvd((java.lang.Object) activity.copydefault(), (java.lang.Object) str);
    }

    public final java.lang.Long AEQbTJ(@NotNull java.lang.String str) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = SPUtils.getArrayList("approve_wallet_timestamp_map", Activity.class);
        if (arrayList == null) {
            return null;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((Activity) next).copydefault(), (java.lang.Object) str)) {
                break;
            }
        }
        Activity activity = (Activity) next;
        if (activity != null) {
            return java.lang.Long.valueOf(activity.OLrzqt());
        }
        return null;
    }

    public final void OLrzqt(@NotNull final java.lang.String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.ArrayList arrayList = SPUtils.getArrayList("approve_wallet_timestamp_map", Activity.class);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        final Function1 function1 = new Function1() { // from class: o.dXP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(dXK.valueOf(str, (dXK.Activity) obj));
            }
        };
        arrayList.removeIf(new java.util.function.Predicate() { // from class: o.dXS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return dXK.valueOf(function1, obj);
            }
        });
        arrayList.add(new Activity(str, j));
        SPUtils.put("approve_wallet_timestamp_map", arrayList);
    }

    public static final boolean valueOf(java.lang.String str, Activity activity) {
        return Intrinsics.EZpvd((java.lang.Object) activity.copydefault(), (java.lang.Object) str);
    }

    public static final boolean valueOf(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public final void KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = SPUtils.getArrayList("approve_wallet_timestamp_map", Activity.class);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        for (final java.lang.String str : list) {
            final Function1 function1 = new Function1() { // from class: o.dXM
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(dXK.gEmmrt(str, (dXK.Activity) obj));
                }
            };
            arrayList.removeIf(new java.util.function.Predicate() { // from class: o.dXQ
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.util.function.Predicate
                public final boolean test(java.lang.Object obj) {
                    return dXK.AYXKKw(function1, obj);
                }
            });
        }
        SPUtils.put("approve_wallet_timestamp_map", arrayList);
    }

    public static final boolean AYXKKw(Function1 function1, java.lang.Object obj) {
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final boolean gEmmrt(java.lang.String str, Activity activity) {
        return Intrinsics.EZpvd((java.lang.Object) activity.copydefault(), (java.lang.Object) str);
    }

    public final boolean EZpvd() {
        return !Intrinsics.EZpvd((java.lang.Object) SPUtils.getString("approve_wallet_app_version", ""), (java.lang.Object) C32979mnm.EZpvd.EZpvd());
    }

    public final void AEQbTJ() {
        SPUtils.put("approve_wallet_app_version", C32979mnm.EZpvd.EZpvd());
    }
}

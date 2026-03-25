package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.websocket.connection.OKWsDoh;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xZR {
    public boolean AEQbTJ;
    public java.lang.String AhwBna;
    public java.lang.String valueOf;
    public java.util.List<java.lang.String> EZpvd = yDY.AhwBna();
    public final java.util.ArrayList<StateListAnimator> KWHzl = new java.util.ArrayList<>();
    public final android.os.Handler copydefault = new android.os.Handler(android.os.Looper.getMainLooper());
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.xZN
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xZR.OLrzqt(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.xZU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return xZR.AYXKKw(this.EZpvd);
        }
    });

    public interface StateListAnimator {
        void AEQbTJ(boolean z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.valueOf = str;
        this.AhwBna = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> KWHzl() {
        return this.EZpvd;
    }

    public final C57567ykp EZpvd() {
        return (C57567ykp) this.OLrzqt.getValue();
    }

    public static final C57567ykp OLrzqt(final xZR xzr) {
        java.lang.String str = xzr.valueOf;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        return new C57567ykp(new C57527ykB(str, true, FirebaseAnalytics.Event.LOGIN, new Function0() { // from class: o.xZP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return xZR.copydefault(this.EZpvd);
            }
        }, !xzr.AEQbTJ, OKWsDoh.DEXPRI));
    }

    public static final java.util.List copydefault(xZR xzr) {
        java.util.List<java.lang.String> list = xzr.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C56423yEv.EZpvd(C56390yDp.OLrzqt("token", (java.lang.String) it.next())));
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    public final C57567ykp OLrzqt() {
        return (C57567ykp) this.djBIcL.getValue();
    }

    public static final C57567ykp AYXKKw(xZR xzr) {
        java.lang.String str = xzr.AhwBna;
        if (str == null) {
            Intrinsics.gEmmrt("");
            str = null;
        }
        return new C57567ykp(new C57527ykB(str, false, null, null, !xzr.AEQbTJ, OKWsDoh.DEXPRI, 12, null));
    }

    public static final class Activity implements java.lang.Runnable {
        public final /* synthetic */ kotlin.Pair KWHzl;
        public final /* synthetic */ StateListAnimator copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(kotlin.Pair pair, StateListAnimator stateListAnimator) {
            this.KWHzl = pair;
            this.copydefault = stateListAnimator;
        }

        @Override // java.lang.Runnable
        public final void run() {
            StateListAnimator stateListAnimator;
            kotlin.Pair pair = this.KWHzl;
            if (pair == null || (stateListAnimator = this.copydefault) == null) {
                return;
            }
            stateListAnimator.AEQbTJ(((java.lang.Boolean) pair.getFirst()).booleanValue());
        }
    }

    public static /* synthetic */ C57567ykp getWSConnection$default(xZR xzr, boolean z, boolean z2, boolean z3, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return xzr.copydefault(z, z2, z3);
    }

    public final C57567ykp copydefault(boolean z, boolean z2, boolean z3) {
        this.AEQbTJ = z3;
        if (z) {
            return EZpvd();
        }
        return OLrzqt();
    }

    public final void OLrzqt(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.removeCallbacksAndMessages(null);
        kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.String>> pairEZpvd = EZpvd(list);
        if (pairEZpvd.getFirst().booleanValue()) {
            java.util.List<java.lang.String> second = pairEZpvd.getSecond();
            if (second == null) {
                second = yDY.AhwBna();
            }
            this.EZpvd = second;
            EZpvd().uzCIH();
            BCE.walletWsSetAddresses(this.EZpvd);
        }
        java.util.Iterator<StateListAnimator> it = this.KWHzl.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "");
        while (it.hasNext()) {
            StateListAnimator next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            this.copydefault.postDelayed(new Activity(pairEZpvd, next), 1000L);
        }
    }

    public static final class ActionBar<T> implements java.util.Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return yET.KWHzl((java.lang.String) t, (java.lang.String) t2);
        }
    }

    public final kotlin.Pair<java.lang.Boolean, java.util.List<java.lang.String>> EZpvd(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.isEmpty()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (((java.lang.String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(CollectionsKt___CollectionsKt.OqFWZa(arrayList), new ActionBar());
        if (listEZpvd.isEmpty()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, null);
        }
        if (listEZpvd.size() != this.EZpvd.size()) {
            return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, listEZpvd);
        }
        int i = 0;
        for (java.lang.Object obj2 : listEZpvd) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = ((java.lang.String) obj2).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            java.lang.String lowerCase2 = this.EZpvd.get(i).toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            if (!Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) lowerCase2)) {
                return C56390yDp.OLrzqt(java.lang.Boolean.TRUE, listEZpvd);
            }
            i++;
        }
        return C56390yDp.OLrzqt(java.lang.Boolean.FALSE, null);
    }

    public final void copydefault(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl.add(stateListAnimator);
    }

    public final void EZpvd(@NotNull StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(stateListAnimator, "");
        this.KWHzl.remove(stateListAnimator);
    }
}

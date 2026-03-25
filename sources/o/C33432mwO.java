package o;

import android.view.ViewTreeObserver;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33432mwO {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int EZpvd = 8;
    public volatile boolean AEQbTJ;
    public final java.util.Map<java.lang.String, Application> OLrzqt = new LinkedHashMap();
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.mwM
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C33432mwO.KWHzl(this.OLrzqt);
        }
    });

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
        return this.AEQbTJ;
    }

    /* JADX INFO: renamed from: o.mwO$StateListAnimator */
    public static final class StateListAnimator extends FragmentManager.FragmentLifecycleCallbacks {
        public StateListAnimator() {
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPreAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.content.Context context) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(context, "");
            if (C33432mwO.this.copydefault()) {
                C33432mwO.this.copydefault(C33432mwO.this.OLrzqt(fragment)).copydefault("preAttached", java.lang.System.currentTimeMillis());
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentAttached(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.content.Context context) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(context, "");
            if (C33432mwO.this.copydefault()) {
                C33432mwO.this.copydefault(C33432mwO.this.OLrzqt(fragment)).copydefault("attached", java.lang.System.currentTimeMillis());
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentPreCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            if (C33432mwO.this.copydefault()) {
                C33432mwO.this.copydefault(C33432mwO.this.OLrzqt(fragment)).copydefault("preCreated", java.lang.System.currentTimeMillis());
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            if (C33432mwO.this.copydefault()) {
                C33432mwO.this.copydefault(C33432mwO.this.OLrzqt(fragment)).copydefault("created", java.lang.System.currentTimeMillis());
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentActivityCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            if (C33432mwO.this.copydefault()) {
                C33432mwO.this.copydefault(C33432mwO.this.OLrzqt(fragment)).copydefault("activityCreated", java.lang.System.currentTimeMillis());
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(view, "");
            if (C33432mwO.this.copydefault()) {
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String strOLrzqt = C33432mwO.this.OLrzqt(fragment);
                C33432mwO.this.copydefault(strOLrzqt).copydefault("viewCreated", jCurrentTimeMillis);
                view.getViewTreeObserver().addOnPreDrawListener(new ActionBar(view, C33432mwO.this, strOLrzqt));
            }
        }

        /* JADX INFO: renamed from: o.mwO$StateListAnimator$ActionBar */
        public static final class ActionBar implements ViewTreeObserver.OnPreDrawListener {
            public final /* synthetic */ java.lang.String AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ C33432mwO OLrzqt;

            public ActionBar(android.view.View view, C33432mwO c33432mwO, java.lang.String str) {
                this.EZpvd = view;
                this.OLrzqt = c33432mwO;
                this.AEQbTJ = str;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                this.EZpvd.getViewTreeObserver().removeOnPreDrawListener(this);
                this.OLrzqt.copydefault(this.AEQbTJ).copydefault("draw", java.lang.System.currentTimeMillis());
                return true;
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentStarted(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            if (C33432mwO.this.copydefault()) {
                C33432mwO.this.copydefault(C33432mwO.this.OLrzqt(fragment)).copydefault("started", java.lang.System.currentTimeMillis());
            }
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentResumed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            if (C33432mwO.this.copydefault()) {
                C33432mwO.this.copydefault(C33432mwO.this.OLrzqt(fragment)).copydefault("resumed", java.lang.System.currentTimeMillis());
            }
        }
    }

    public final FragmentManager.FragmentLifecycleCallbacks EZpvd() {
        return (FragmentManager.FragmentLifecycleCallbacks) this.copydefault.getValue();
    }

    public static final StateListAnimator KWHzl(C33432mwO c33432mwO) {
        return c33432mwO.new StateListAnimator();
    }

    /* JADX INFO: renamed from: o.mwO$Application */
    public static final class Application {
        public final java.util.Map<java.lang.String, java.lang.Long> AEQbTJ;
        public final java.lang.String EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mwO$Application */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Application copy$default(Application application, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = application.EZpvd;
            }
            if ((i & 2) != 0) {
                map = application.AEQbTJ;
            }
            return application.AEQbTJ(str, map);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Application AEQbTJ(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.Long> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            return new Application(str, map);
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
            return Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) application.EZpvd) && Intrinsics.EZpvd(this.AEQbTJ, application.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "InnerFragmentLifecycleInfo(fragmentName=" + this.EZpvd + ", lifecycleEvents=" + this.AEQbTJ + ")";
        }

        /* JADX INFO: renamed from: o.mwO$Application$Activity */
        public static final class Activity<T> implements java.util.Comparator {
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return yET.KWHzl((java.lang.Long) ((kotlin.Pair) t).getSecond(), (java.lang.Long) ((kotlin.Pair) t2).getSecond());
            }
        }

        public Application(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.Long> map) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            this.EZpvd = str;
            this.AEQbTJ = map;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (wrap:java.util.Map:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.Map:0x0006: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:182) call: java.util.LinkedHashMap.<init>():void type: CONSTRUCTOR) : (r2v0 java.util.Map))
 A[MD:(java.lang.String, java.util.Map<java.lang.String, java.lang.Long>):void (m)] (LINE:180) call: o.mwO.Application.<init>(java.lang.String, java.util.Map):void type: THIS */
        public /* synthetic */ Application(java.lang.String str, java.util.Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? new LinkedHashMap() : map);
        }

        public final void copydefault(@NotNull java.lang.String str, long j) {
            Intrinsics.checkNotNullParameter(str, "");
            this.AEQbTJ.put(str, java.lang.Long.valueOf(j));
        }

        public final Activity EZpvd() {
            return new Activity(this.EZpvd, C56424yEw.isConnected(this.AEQbTJ), AEQbTJ());
        }

        public final java.util.Map<java.lang.String, java.lang.Long> AEQbTJ() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.List listEZpvd = CollectionsKt___CollectionsKt.EZpvd(C56427yEz.AkhnZx(this.AEQbTJ), new Activity());
            int size = listEZpvd.size();
            for (int i = 1; i < size; i++) {
                kotlin.Pair pair = (kotlin.Pair) listEZpvd.get(i);
                kotlin.Pair pair2 = (kotlin.Pair) listEZpvd.get(i - 1);
                long jLongValue = ((java.lang.Number) pair.getSecond()).longValue();
                long jLongValue2 = ((java.lang.Number) pair2.getSecond()).longValue();
                linkedHashMap.put(pair2.getFirst() + "_to_" + pair.getFirst(), java.lang.Long.valueOf(jLongValue - jLongValue2));
            }
            linkedHashMap.put("total_duration", java.lang.Long.valueOf(listEZpvd.size() > 1 ? ((java.lang.Number) ((kotlin.Pair) CollectionsKt___CollectionsKt.AubY(listEZpvd)).getSecond()).longValue() - ((java.lang.Number) ((kotlin.Pair) CollectionsKt___CollectionsKt.AuCTelauCTel(listEZpvd)).getSecond()).longValue() : 0L));
            return linkedHashMap;
        }
    }

    public final void EZpvd(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (this.AEQbTJ) {
            return;
        }
        this.AEQbTJ = true;
        fragmentManager.registerFragmentLifecycleCallbacks(EZpvd(), true);
    }

    public final void AEQbTJ(@NotNull androidx.fragment.app.FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        if (this.AEQbTJ) {
            this.AEQbTJ = false;
            this.OLrzqt.clear();
            fragmentManager.unregisterFragmentLifecycleCallbacks(EZpvd());
        }
    }

    public final java.lang.String OLrzqt(androidx.fragment.app.Fragment fragment) {
        java.lang.String name = fragment.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        return name;
    }

    /* JADX INFO: renamed from: o.mwO$Activity */
    public static final class Activity {
        public static final Application Companion = new Application(null);
        public static final int EZpvd = 8;
        public final java.util.Map<java.lang.String, java.lang.Long> AEQbTJ;
        public final java.lang.String OLrzqt;
        public final java.util.Map<java.lang.String, java.lang.Long> copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.mwO$Activity */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Activity copy$default(Activity activity, java.lang.String str, java.util.Map map, java.util.Map map2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = activity.OLrzqt;
            }
            if ((i & 2) != 0) {
                map = activity.copydefault;
            }
            if ((i & 4) != 0) {
                map2 = activity.AEQbTJ;
            }
            return activity.copydefault(str, map, map2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final java.util.Map<java.lang.String, java.lang.Long> EZpvd() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Activity copydefault(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.Long> map, @NotNull java.util.Map<java.lang.String, java.lang.Long> map2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            return new Activity(str, map, map2);
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
            return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) activity.OLrzqt) && Intrinsics.EZpvd(this.copydefault, activity.copydefault) && Intrinsics.EZpvd(this.AEQbTJ, activity.AEQbTJ);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public int hashCode() {
            return (((this.OLrzqt.hashCode() * 31) + this.copydefault.hashCode()) * 31) + this.AEQbTJ.hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public java.lang.String toString() {
            return "FragmentLifecycleInfo(fragmentName=" + this.OLrzqt + ", lifecycleEvents=" + this.copydefault + ", lifecycleDurations=" + this.AEQbTJ + ")";
        }

        public Activity(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.Long> map, @NotNull java.util.Map<java.lang.String, java.lang.Long> map2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(map2, "");
            this.OLrzqt = str;
            this.copydefault = map;
            this.AEQbTJ = map2;
        }

        /* JADX INFO: renamed from: o.mwO$Activity$Application */
        public static final class Application {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwO.Activity.Application.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Application() {
            }
        }
    }

    /* JADX INFO: renamed from: o.mwO$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwO.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public final java.util.Map<java.lang.String, Activity> AEQbTJ() {
        java.util.Map<java.lang.String, Application> map = this.OLrzqt;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56423yEv.copydefault(map.size()));
        java.util.Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((Application) entry.getValue()).EZpvd());
        }
        return linkedHashMap;
    }

    public final Application copydefault(java.lang.String str) {
        java.util.Map<java.lang.String, Application> map = this.OLrzqt;
        Application application = map.get(str);
        if (application == null) {
            application = new Application(str, null, 2, 0 == true ? 1 : 0);
            map.put(str, application);
        }
        return application;
    }
}

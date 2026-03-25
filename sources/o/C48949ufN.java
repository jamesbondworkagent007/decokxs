package o;

import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48949ufN {
    public static final java.util.Set<androidx.fragment.app.Fragment> AEQbTJ;
    public static final int EZpvd;
    public static final C48949ufN KWHzl = new C48949ufN();
    public static final java.util.Map<java.lang.String, android.view.View> copydefault;

    private C48949ufN() {
    }

    static {
        C32979mnm.EZpvd.OLrzqt().registerActivityLifecycleCallbacks(new C32981mno() { // from class: o.ufN.4
            @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityDestroyed(activity);
                C48949ufN.KWHzl.copydefault(activity);
            }
        });
        copydefault = new ConcurrentHashMap();
        AEQbTJ = Collections.synchronizedSet(new java.util.HashSet());
        EZpvd = 8;
    }

    public final java.lang.String EZpvd(@NotNull android.app.Activity activity, @NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(view, "");
        java.lang.String strAEQbTJ = AEQbTJ(activity, view);
        copydefault.put(strAEQbTJ, view);
        pUU.EZpvd("LuaViewsHolder", "put->key:" + strAEQbTJ + " items:" + view);
        return strAEQbTJ;
    }

    public final java.lang.String OLrzqt(@NotNull androidx.fragment.app.Fragment fragment, @NotNull android.view.View view) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(view, "");
        java.util.Set<androidx.fragment.app.Fragment> set = AEQbTJ;
        if (!set.contains(fragment)) {
            androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.registerFragmentLifecycleCallbacks(new TaskDescription(), false);
            set.add(fragment);
            pUU.EZpvd("LuaViewsHolder", "put->mRegisteredFragments:" + fragment);
        }
        java.lang.String strAEQbTJ = AEQbTJ(fragment, view);
        copydefault.put(strAEQbTJ, view);
        pUU.EZpvd("LuaViewsHolder", "put->key:" + strAEQbTJ + " items:" + view);
        return strAEQbTJ;
    }

    /* JADX INFO: renamed from: o.ufN$TaskDescription */
    public static final class TaskDescription extends FragmentManager.FragmentLifecycleCallbacks {
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            if (C48949ufN.AEQbTJ.contains(fragment)) {
                C48949ufN.AEQbTJ.remove(fragment);
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                pUU.EZpvd("LuaViewsHolder", "onFragmentDestroyed->remove mRegisteredFragments:" + fragment);
                C48949ufN.KWHzl.KWHzl(fragment);
                return;
            }
            pUU.KWHzl("LuaViewsHolder", "onFragmentDestroyed:" + fragment + ", skip the fragment，not a mRegisteredFragments");
        }
    }

    public final android.view.View EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.view.View view = copydefault.get(str);
        pUU.EZpvd("LuaViewsHolder", "get->key:" + str + " transformer:" + view);
        return view;
    }

    public final java.lang.String AEQbTJ(android.app.Activity activity, android.view.View view) {
        return activity.getClass().getName() + "@" + activity.hashCode() + "#LuaViews@" + view.hashCode();
    }

    public final java.lang.String AEQbTJ(androidx.fragment.app.Fragment fragment, android.view.View view) {
        return fragment.getClass().getName() + "@" + fragment.hashCode() + "#LuaViews@" + view.hashCode();
    }

    public final java.lang.String AEQbTJ(android.app.Activity activity) {
        return activity.getClass().getName() + "@" + activity.hashCode();
    }

    public final java.lang.String EZpvd(androidx.fragment.app.Fragment fragment) {
        return fragment.getClass().getName() + "@" + fragment.hashCode();
    }

    public final void KWHzl(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        java.util.Map<java.lang.String, android.view.View> map = copydefault;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strEZpvd = EZpvd(fragment);
        java.util.Iterator<Map.Entry<java.lang.String, android.view.View>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, android.view.View> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strEZpvd, false, 2, null)) {
                it.remove();
                pUU.EZpvd("LuaViewsHolder", "clearLuaViewsByFragment->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedFragment:" + strEZpvd);
            }
        }
        pUU.KWHzl("LuaViewsHolder", "clearLuaViewsByFragment->remainSize:" + copydefault.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }

    public final void copydefault(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.util.Map<java.lang.String, android.view.View> map = copydefault;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strAEQbTJ = AEQbTJ(activity);
        java.util.Iterator<Map.Entry<java.lang.String, android.view.View>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, android.view.View> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strAEQbTJ, false, 2, null)) {
                it.remove();
                pUU.EZpvd("LuaViewsHolder", "clearLuaViewsByActivity->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedActivity:" + strAEQbTJ);
            }
        }
        pUU.KWHzl("LuaViewsHolder", "clearLuaViewsByActivity->remainSize:" + copydefault.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }
}

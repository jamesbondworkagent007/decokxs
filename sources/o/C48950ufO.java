package o;

import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48950ufO {
    public static final java.util.Map<java.lang.String, java.util.List<InterfaceC48901ueS>> AEQbTJ;
    public static final java.util.Set<androidx.fragment.app.Fragment> EZpvd;
    public static final int KWHzl;
    public static final C48950ufO OLrzqt = new C48950ufO();

    private C48950ufO() {
    }

    static {
        C32979mnm.EZpvd.OLrzqt().registerActivityLifecycleCallbacks(new C32981mno() { // from class: o.ufO.5
            @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityDestroyed(activity);
                C48950ufO.OLrzqt.OLrzqt(activity);
            }
        });
        AEQbTJ = new ConcurrentHashMap();
        EZpvd = Collections.synchronizedSet(new java.util.HashSet());
        KWHzl = 8;
    }

    public final java.lang.String EZpvd(@NotNull android.app.Activity activity, @NotNull java.util.List<? extends InterfaceC48901ueS> list) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.lang.String strAEQbTJ = AEQbTJ(activity, list);
        AEQbTJ.put(strAEQbTJ, list);
        pUU.EZpvd("LuaMenuItemsHolder", "put->key:" + strAEQbTJ + " items:" + list);
        return strAEQbTJ;
    }

    public final java.lang.String KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends InterfaceC48901ueS> list) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        java.util.Set<androidx.fragment.app.Fragment> set = EZpvd;
        if (!set.contains(fragment)) {
            androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.registerFragmentLifecycleCallbacks(new Application(), false);
            set.add(fragment);
            pUU.EZpvd("LuaMenuItemsHolder", "put->mRegisteredFragments:" + fragment);
        }
        java.lang.String strAEQbTJ = AEQbTJ(fragment, list);
        AEQbTJ.put(strAEQbTJ, list);
        pUU.EZpvd("LuaMenuItemsHolder", "put->key:" + strAEQbTJ + " items:" + list);
        return strAEQbTJ;
    }

    /* JADX INFO: renamed from: o.ufO$Application */
    public static final class Application extends FragmentManager.FragmentLifecycleCallbacks {
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            if (C48950ufO.EZpvd.contains(fragment)) {
                C48950ufO.EZpvd.remove(fragment);
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                pUU.EZpvd("LuaMenuItemsHolder", "onFragmentDestroyed->remove mRegisteredFragments:" + fragment);
                C48950ufO.OLrzqt.EZpvd(fragment);
                return;
            }
            pUU.KWHzl("LuaMenuItemsHolder", "onFragmentDestroyed:" + fragment + ", skip the fragment，not a mRegisteredFragments");
        }
    }

    public final java.util.List<InterfaceC48901ueS> KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.util.List<InterfaceC48901ueS> list = AEQbTJ.get(str);
        pUU.EZpvd("LuaMenuItemsHolder", "get->key:" + str + " transformer:" + list);
        return list;
    }

    public final java.lang.String AEQbTJ(android.app.Activity activity, java.util.List<? extends InterfaceC48901ueS> list) {
        return activity.getClass().getName() + "@" + activity.hashCode() + "#LuaMenuItem@" + list.hashCode();
    }

    public final java.lang.String AEQbTJ(androidx.fragment.app.Fragment fragment, java.util.List<? extends InterfaceC48901ueS> list) {
        return fragment.getClass().getName() + "@" + fragment.hashCode() + "#LuaMenuItem@" + list.hashCode();
    }

    public final java.lang.String KWHzl(android.app.Activity activity) {
        return activity.getClass().getName() + "@" + activity.hashCode();
    }

    public final java.lang.String KWHzl(androidx.fragment.app.Fragment fragment) {
        return fragment.getClass().getName() + "@" + fragment.hashCode();
    }

    public final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        java.util.Map<java.lang.String, java.util.List<InterfaceC48901ueS>> map = AEQbTJ;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strKWHzl = KWHzl(fragment);
        java.util.Iterator<Map.Entry<java.lang.String, java.util.List<InterfaceC48901ueS>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, java.util.List<InterfaceC48901ueS>> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strKWHzl, false, 2, null)) {
                it.remove();
                pUU.EZpvd("LuaMenuItemsHolder", "clearLuaMenuItemsByFragment->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedFragment:" + strKWHzl);
            }
        }
        pUU.KWHzl("LuaMenuItemsHolder", "clearLuaMenuItemsByFragment->remainSize:" + AEQbTJ.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }

    public final void OLrzqt(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.util.Map<java.lang.String, java.util.List<InterfaceC48901ueS>> map = AEQbTJ;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strKWHzl = KWHzl(activity);
        java.util.Iterator<Map.Entry<java.lang.String, java.util.List<InterfaceC48901ueS>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, java.util.List<InterfaceC48901ueS>> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strKWHzl, false, 2, null)) {
                it.remove();
                pUU.EZpvd("LuaMenuItemsHolder", "clearLuaMenuItemsByActivity->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedActivity:" + strKWHzl);
            }
        }
        pUU.KWHzl("LuaMenuItemsHolder", "clearLuaMenuItemsByActivity->remainSize:" + AEQbTJ.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }
}

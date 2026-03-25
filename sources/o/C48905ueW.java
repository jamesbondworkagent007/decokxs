package o;

import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ueW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48905ueW {
    public static final int EZpvd;
    public static final C48905ueW KWHzl = new C48905ueW();
    public static final java.util.Set<androidx.fragment.app.Fragment> OLrzqt;
    public static final java.util.Map<java.lang.String, InterfaceC48906ueX> copydefault;

    private C48905ueW() {
    }

    static {
        C32979mnm.EZpvd.OLrzqt().registerActivityLifecycleCallbacks(new C32981mno() { // from class: o.ueW.4
            @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityDestroyed(activity);
                C48905ueW.KWHzl.copydefault(activity);
            }
        });
        copydefault = new ConcurrentHashMap();
        OLrzqt = Collections.synchronizedSet(new java.util.HashSet());
        EZpvd = 8;
    }

    public final java.lang.String AEQbTJ(@NotNull android.app.Activity activity, @NotNull InterfaceC48906ueX interfaceC48906ueX) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(interfaceC48906ueX, "");
        java.lang.String strEZpvd = EZpvd(activity, interfaceC48906ueX);
        copydefault.put(strEZpvd, interfaceC48906ueX);
        pUU.EZpvd("OKShareTransformerHolder", "put->key:" + strEZpvd + " transformer:" + interfaceC48906ueX);
        return strEZpvd;
    }

    public final java.lang.String AEQbTJ(@NotNull androidx.fragment.app.Fragment fragment, @NotNull InterfaceC48906ueX interfaceC48906ueX) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(interfaceC48906ueX, "");
        java.util.Set<androidx.fragment.app.Fragment> set = OLrzqt;
        if (!set.contains(fragment)) {
            androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.registerFragmentLifecycleCallbacks(new Application(), false);
            set.add(fragment);
            pUU.EZpvd("OKShareTransformerHolder", "put->mRegisteredFragments:" + fragment);
        }
        java.lang.String strEZpvd = EZpvd(fragment, interfaceC48906ueX);
        copydefault.put(strEZpvd, interfaceC48906ueX);
        pUU.EZpvd("OKShareTransformerHolder", "put->key:" + strEZpvd + " transformer:" + interfaceC48906ueX);
        return strEZpvd;
    }

    /* JADX INFO: renamed from: o.ueW$Application */
    public static final class Application extends FragmentManager.FragmentLifecycleCallbacks {
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            if (C48905ueW.OLrzqt.contains(fragment)) {
                C48905ueW.OLrzqt.remove(fragment);
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                pUU.EZpvd("OKShareTransformerHolder", "onFragmentDestroyed->remove mRegisteredFragments:" + fragment);
                C48905ueW.KWHzl.EZpvd(fragment);
                return;
            }
            pUU.KWHzl("OKShareTransformerHolder", "onFragmentDestroyed:" + fragment + ", skip the fragment，not a mRegisteredFragments");
        }
    }

    public final InterfaceC48906ueX OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC48906ueX interfaceC48906ueX = copydefault.get(str);
        pUU.EZpvd("OKShareTransformerHolder", "get->key:" + str + " transformer:" + interfaceC48906ueX);
        return interfaceC48906ueX;
    }

    public final java.lang.String EZpvd(android.app.Activity activity, InterfaceC48906ueX interfaceC48906ueX) {
        return activity.getClass().getName() + "@" + activity.hashCode() + "#IShareParamsTransformer@" + interfaceC48906ueX.hashCode();
    }

    public final java.lang.String EZpvd(androidx.fragment.app.Fragment fragment, InterfaceC48906ueX interfaceC48906ueX) {
        return fragment.getClass().getName() + "@" + fragment.hashCode() + "#IShareParamsTransformer@" + interfaceC48906ueX.hashCode();
    }

    public final java.lang.String EZpvd(android.app.Activity activity) {
        return activity.getClass().getName() + "@" + activity.hashCode();
    }

    public final java.lang.String OLrzqt(androidx.fragment.app.Fragment fragment) {
        return fragment.getClass().getName() + "@" + fragment.hashCode();
    }

    public final void EZpvd(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        java.util.Map<java.lang.String, InterfaceC48906ueX> map = copydefault;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strOLrzqt = OLrzqt(fragment);
        java.util.Iterator<Map.Entry<java.lang.String, InterfaceC48906ueX>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, InterfaceC48906ueX> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strOLrzqt, false, 2, null)) {
                it.remove();
                pUU.EZpvd("OKShareTransformerHolder", "clearTransformerByFragment->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedFragment:" + strOLrzqt);
            }
        }
        pUU.KWHzl("OKShareTransformerHolder", "clearTransformerByFragment->remainSize:" + copydefault.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }

    public final void copydefault(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.util.Map<java.lang.String, InterfaceC48906ueX> map = copydefault;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strEZpvd = EZpvd(activity);
        java.util.Iterator<Map.Entry<java.lang.String, InterfaceC48906ueX>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, InterfaceC48906ueX> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strEZpvd, false, 2, null)) {
                it.remove();
                pUU.EZpvd("OKShareTransformerHolder", "clearTransformersByActivity->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedActivity:" + strEZpvd);
            }
        }
        pUU.KWHzl("OKShareTransformerHolder", "clearTransformersByActivity->remainSize:" + copydefault.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }
}

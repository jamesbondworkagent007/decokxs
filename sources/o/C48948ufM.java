package o;

import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ufM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48948ufM {
    public static final int EZpvd;
    public static final java.util.Map<java.lang.String, android.graphics.Bitmap> KWHzl;
    public static final java.util.Set<androidx.fragment.app.Fragment> OLrzqt;
    public static final C48948ufM copydefault = new C48948ufM();

    private C48948ufM() {
    }

    static {
        C32979mnm.EZpvd.OLrzqt().registerActivityLifecycleCallbacks(new C32981mno() { // from class: o.ufM.5
            @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityDestroyed(activity);
                C48948ufM.copydefault.copydefault(activity);
            }
        });
        KWHzl = new ConcurrentHashMap();
        OLrzqt = Collections.synchronizedSet(new java.util.HashSet());
        EZpvd = 8;
    }

    public final java.lang.String AEQbTJ(@NotNull android.app.Activity activity, @NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.lang.String strKWHzl = KWHzl(activity, bitmap);
        KWHzl.put(strKWHzl, bitmap);
        return strKWHzl;
    }

    public final java.lang.String KWHzl(@NotNull androidx.fragment.app.Fragment fragment, @NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.util.Set<androidx.fragment.app.Fragment> set = OLrzqt;
        if (!set.contains(fragment)) {
            androidx.fragment.app.FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
            Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
            parentFragmentManager.registerFragmentLifecycleCallbacks(new StateListAnimator(), false);
            set.add(fragment);
            pUU.EZpvd("OKShare", "put->mRegisteredFragments:" + fragment);
        }
        java.lang.String strEZpvd = EZpvd(fragment, bitmap);
        KWHzl.put(strEZpvd, bitmap);
        return strEZpvd;
    }

    /* JADX INFO: renamed from: o.ufM$StateListAnimator */
    public static final class StateListAnimator extends FragmentManager.FragmentLifecycleCallbacks {
        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentDestroyed(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            super.onFragmentDestroyed(fragmentManager, fragment);
            if (C48948ufM.OLrzqt.contains(fragment)) {
                C48948ufM.OLrzqt.remove(fragment);
                fragmentManager.unregisterFragmentLifecycleCallbacks(this);
                pUU.EZpvd("OKShare", "onFragmentDestroyed->remove mRegisteredFragments:" + fragment);
                C48948ufM.copydefault.copydefault(fragment);
                return;
            }
            pUU.KWHzl("OKShare", "onFragmentDestroyed:" + fragment + ", skip the fragment，not a mRegisteredFragments");
        }
    }

    public final android.graphics.Bitmap KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return KWHzl.get(str);
    }

    public final java.lang.String KWHzl(android.app.Activity activity, android.graphics.Bitmap bitmap) {
        return activity.getClass().getName() + "@" + activity.hashCode() + "#Bitmap@" + bitmap.hashCode();
    }

    public final java.lang.String EZpvd(androidx.fragment.app.Fragment fragment, android.graphics.Bitmap bitmap) {
        return fragment.getClass().getName() + "@" + fragment.hashCode() + "#Bitmap@" + bitmap.hashCode();
    }

    public final java.lang.String EZpvd(android.app.Activity activity) {
        return activity.getClass().getName() + "@" + activity.hashCode();
    }

    public final java.lang.String EZpvd(androidx.fragment.app.Fragment fragment) {
        return fragment.getClass().getName() + "@" + fragment.hashCode();
    }

    public final void copydefault(@NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        java.util.Map<java.lang.String, android.graphics.Bitmap> map = KWHzl;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strEZpvd = EZpvd(fragment);
        java.util.Iterator<Map.Entry<java.lang.String, android.graphics.Bitmap>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, android.graphics.Bitmap> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strEZpvd, false, 2, null)) {
                it.remove();
                pUU.EZpvd("OKShare", "clearBitmapsByFragment->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedFragment:" + strEZpvd);
            }
        }
        pUU.KWHzl("OKShare", "clearBitmapsByFragment->remainSize:" + KWHzl.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }

    public final void copydefault(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.util.Map<java.lang.String, android.graphics.Bitmap> map = KWHzl;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strEZpvd = EZpvd(activity);
        java.util.Iterator<Map.Entry<java.lang.String, android.graphics.Bitmap>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, android.graphics.Bitmap> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strEZpvd, false, 2, null)) {
                it.remove();
                pUU.EZpvd("OKShare", "clearBitmapsByActivity->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedActivity:" + strEZpvd);
            }
        }
        pUU.KWHzl("OKShare", "clearBitmapsByActivity->remainSize:" + KWHzl.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }
}

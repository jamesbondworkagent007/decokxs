package o;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ati, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C7962ati {
    public static final C7962ati AEQbTJ = new C7962ati();
    public static final java.util.Map<java.lang.String, android.graphics.Bitmap> EZpvd;
    public static final java.util.Set<androidx.fragment.app.Fragment> KWHzl;
    public static final int copydefault;

    private C7962ati() {
    }

    static {
        C32979mnm.EZpvd.OLrzqt().registerActivityLifecycleCallbacks(new C32981mno() { // from class: o.ati.2
            @Override // o.C32981mno, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(android.app.Activity activity) {
                Intrinsics.checkNotNullParameter(activity, "");
                super.onActivityDestroyed(activity);
                C7962ati.AEQbTJ.AEQbTJ(activity);
            }
        });
        EZpvd = new ConcurrentHashMap();
        KWHzl = Collections.synchronizedSet(new java.util.HashSet());
        copydefault = 8;
    }

    public final java.lang.String KWHzl(@NotNull android.app.Activity activity, @NotNull android.graphics.Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bitmap, "");
        java.lang.String strOLrzqt = OLrzqt(activity, bitmap);
        EZpvd.put(strOLrzqt, bitmap);
        pUU.EZpvd("GalleryBitmapsHolder", "put->key:" + strOLrzqt + " bitmap:" + bitmap);
        return strOLrzqt;
    }

    public final android.graphics.Bitmap AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        android.graphics.Bitmap bitmap = EZpvd.get(str);
        pUU.EZpvd("GalleryBitmapsHolder", "get->key:" + str + " bitmap:" + bitmap);
        return bitmap;
    }

    public final java.lang.String OLrzqt(android.app.Activity activity, android.graphics.Bitmap bitmap) {
        return activity.getClass().getName() + "@" + activity.hashCode() + "#Bitmap@" + bitmap.hashCode();
    }

    public final java.lang.String OLrzqt(android.app.Activity activity) {
        return activity.getClass().getName() + "@" + activity.hashCode();
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        java.util.Map<java.lang.String, android.graphics.Bitmap> map = EZpvd;
        if (map.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strOLrzqt = OLrzqt(activity);
        java.util.Iterator<Map.Entry<java.lang.String, android.graphics.Bitmap>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<java.lang.String, android.graphics.Bitmap> next = it.next();
            if (C59449zhJ.startsWith$default(next.getKey(), strOLrzqt, false, 2, null)) {
                it.remove();
                pUU.EZpvd("GalleryBitmapsHolder", "clearBitmapsByActivity->removedKey:" + ((java.lang.Object) next.getKey()) + " destroyedActivity:" + strOLrzqt);
            }
        }
        pUU.KWHzl("GalleryBitmapsHolder", "clearBitmapsByActivity->remainSize:" + EZpvd.size() + " costTime:" + (java.lang.System.currentTimeMillis() - jCurrentTimeMillis) + com.ibm.icu.text.DateFormat.MINUTE_SECOND);
    }
}

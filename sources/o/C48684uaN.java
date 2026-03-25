package o;

import com.okinc.productmatrix.api.bean.SceneInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.uaN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48684uaN {
    public static boolean KWHzl;
    public static final C48684uaN EZpvd = new C48684uaN();
    public static final java.util.HashSet<tZN> AEQbTJ = new java.util.HashSet<>();
    public static final java.util.HashSet<java.lang.String> OLrzqt = new java.util.HashSet<>();
    public static final int copydefault = 8;

    private C48684uaN() {
    }

    public final java.lang.String KWHzl(tZN tzn) {
        return tzn.getClass().getName() + "@" + tzn.hashCode();
    }

    public final tZN KWHzl(@NotNull SceneInfo sceneInfo) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(sceneInfo, "");
        java.util.Iterator<T> it = AEQbTJ.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((tZN) next).copydefault(sceneInfo)) {
                break;
            }
        }
        tZN tzn = (tZN) next;
        pUU.KWHzl("ShareDataProviderManager", "getCurrentPredefinedProductPerformer->" + (tzn != null ? EZpvd.KWHzl(tzn) : null) + "  sceneInfo:" + sceneInfo);
        return tzn;
    }

    public final void KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        for (tZN tzn : AEQbTJ) {
            tzn.EZpvd(context);
            java.lang.String strKWHzl = EZpvd.KWHzl(tzn);
            OLrzqt.add(strKWHzl);
            pUU.KWHzl("ShareDataProviderManager", "initRegisteredProviders->" + strKWHzl);
        }
        KWHzl = true;
        pUU.EZpvd("ShareDataProviderManager", "initRegisteredProviders->mFirstInitCompleted");
    }
}

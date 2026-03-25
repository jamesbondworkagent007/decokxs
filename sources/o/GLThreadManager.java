package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class GLThreadManager {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull NativeActivity nativeActivity) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(nativeActivity, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("MaxValue"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("MinValue"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = nativeActivity.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        java.lang.String strKWHzl = nativeActivity.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et, strKWHzl);
        }
        ebEZpvd.AEQbTJ();
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C23995iR {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull V v) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(v, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("S3Bucket"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("S3KeyPrefix"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et, v.AEQbTJ());
        java.lang.String strOLrzqt = v.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
    }
}

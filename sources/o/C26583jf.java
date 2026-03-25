package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C26583jf {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull C7185af c7185af) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(c7185af, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("S3Bucket"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("S3KeyPrefix"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et, c7185af.KWHzl());
        java.lang.String strOLrzqt = c7185af.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strOLrzqt);
        }
        ebEZpvd.AEQbTJ();
    }
}

package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class ParamsUtils {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull Vr2dDisplayProperties vr2dDisplayProperties) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(vr2dDisplayProperties, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ExternalId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("SnsCallerArn"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("SnsRegion"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et2, vr2dDisplayProperties.KWHzl());
        java.lang.String strOLrzqt = vr2dDisplayProperties.OLrzqt();
        if (strOLrzqt != null) {
            ebEZpvd.AEQbTJ(c5101Et, strOLrzqt);
        }
        java.lang.String strAEQbTJ = vr2dDisplayProperties.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
    }
}

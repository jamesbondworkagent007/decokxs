package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class Short {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ClassFormatError classFormatError) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(classFormatError, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ClientId"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ProviderName"));
        C5101Et c5101Et3 = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("ServerSideTokenCheck"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strKWHzl = classFormatError.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strKWHzl);
        }
        java.lang.String strEZpvd = classFormatError.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.Boolean boolAEQbTJ = classFormatError.AEQbTJ();
        if (boolAEQbTJ != null) {
            ebEZpvd.OLrzqt(c5101Et3, boolAEQbTJ.booleanValue());
        }
        ebEZpvd.AEQbTJ();
    }
}

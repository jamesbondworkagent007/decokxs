package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class RequestHolder {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull PackageInstallObserver packageInstallObserver) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(packageInstallObserver, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ProviderAttributeName"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ProviderAttributeValue"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("ProviderName"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strCopydefault = packageInstallObserver.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strCopydefault);
        }
        java.lang.String strEZpvd = packageInstallObserver.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et, strEZpvd);
        }
        java.lang.String strAEQbTJ = packageInstallObserver.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strAEQbTJ);
        }
        ebEZpvd.AEQbTJ();
    }
}

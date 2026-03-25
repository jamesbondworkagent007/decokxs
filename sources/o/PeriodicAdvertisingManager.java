package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class PeriodicAdvertisingManager {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull AccountsException accountsException) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(accountsException, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ApplicationArn"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ApplicationId"));
        C5101Et c5101Et3 = new C5101Et(loaderManager, new EX("ExternalId"));
        C5101Et c5101Et4 = new C5101Et(loaderManager, new EX("RoleArn"));
        C5101Et c5101Et5 = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("UserDataShared"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        activity.EZpvd(c5101Et3);
        activity.EZpvd(c5101Et4);
        activity.EZpvd(c5101Et5);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.String strEZpvd = accountsException.EZpvd();
        if (strEZpvd != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strEZpvd);
        }
        java.lang.String strAEQbTJ = accountsException.AEQbTJ();
        if (strAEQbTJ != null) {
            ebEZpvd.AEQbTJ(c5101Et, strAEQbTJ);
        }
        java.lang.String strCopydefault = accountsException.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et4, strCopydefault);
        }
        java.lang.String strKWHzl = accountsException.KWHzl();
        if (strKWHzl != null) {
            ebEZpvd.AEQbTJ(c5101Et3, strKWHzl);
        }
        if (accountsException.OLrzqt()) {
            ebEZpvd.OLrzqt(c5101Et5, accountsException.OLrzqt());
        }
        ebEZpvd.AEQbTJ();
    }
}

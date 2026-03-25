package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class Marshaler {
    public static final void EZpvd(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull ProgressDialog progressDialog) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(progressDialog, "");
        AbstractC5105Ex.LoaderManager loaderManager = AbstractC5105Ex.LoaderManager.KWHzl;
        C5101Et c5101Et = new C5101Et(loaderManager, new EX("ScopeDescription"));
        C5101Et c5101Et2 = new C5101Et(loaderManager, new EX("ScopeName"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et2, progressDialog.KWHzl());
        ebEZpvd.AEQbTJ(c5101Et, progressDialog.copydefault());
        ebEZpvd.AEQbTJ();
    }
}

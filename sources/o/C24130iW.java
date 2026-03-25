package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C24130iW {
    public static final void AEQbTJ(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull Y y) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(y, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.ActionBar.EZpvd, new EX("MinConfidence"));
        C5101Et c5101Et2 = new C5101Et(AbstractC5105Ex.LoaderManager.KWHzl, new EX("ProjectVersion"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        activity.EZpvd(c5101Et2);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        java.lang.Float fAEQbTJ = y.AEQbTJ();
        if (fAEQbTJ != null) {
            ebEZpvd.copydefault(c5101Et, fAEQbTJ.floatValue());
        }
        java.lang.String strCopydefault = y.copydefault();
        if (strCopydefault != null) {
            ebEZpvd.AEQbTJ(c5101Et2, strCopydefault);
        }
        ebEZpvd.AEQbTJ();
    }
}

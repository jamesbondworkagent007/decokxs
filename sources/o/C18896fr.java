package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C18896fr {
    public static final void copydefault(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull PopupMenu popupMenu) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(popupMenu, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.FragmentManager.AEQbTJ, new EX("MaxDominantColors"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (popupMenu.AEQbTJ() != 0) {
            ebEZpvd.OLrzqt(c5101Et, popupMenu.AEQbTJ());
        }
        ebEZpvd.AEQbTJ();
    }
}

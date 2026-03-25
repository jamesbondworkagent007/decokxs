package o;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC5105Ex;
import o.C5098Eq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class TypeReference {
    public static final void KWHzl(@NotNull InterfaceC5106Ey interfaceC5106Ey, @NotNull WallpaperInfo wallpaperInfo) {
        Intrinsics.checkNotNullParameter(interfaceC5106Ey, "");
        Intrinsics.checkNotNullParameter(wallpaperInfo, "");
        C5101Et c5101Et = new C5101Et(AbstractC5105Ex.TaskDescription.OLrzqt, new EX("Enabled"));
        C5098Eq.TaskDescription taskDescription = C5098Eq.OLrzqt;
        C5098Eq.Activity activity = new C5098Eq.Activity();
        activity.EZpvd(c5101Et);
        EB ebEZpvd = interfaceC5106Ey.EZpvd(activity.KWHzl());
        if (wallpaperInfo.copydefault()) {
            ebEZpvd.OLrzqt(c5101Et, wallpaperInfo.copydefault());
        }
        ebEZpvd.AEQbTJ();
    }
}

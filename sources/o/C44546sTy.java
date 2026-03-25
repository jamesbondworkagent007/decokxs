package o;

import com.okinc.oklive.app.ui.player.ILivePlayer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sTy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C44546sTy {
    public static final void OLrzqt(@NotNull ILivePlayer.ActionBar actionBar) {
        Intrinsics.checkNotNullParameter(actionBar, "");
        boolean zOLrzqt = actionBar.OLrzqt();
        boolean zKWHzl = actionBar.KWHzl();
        boolean zCopydefault = actionBar.copydefault();
        if (!zOLrzqt) {
            actionBar.valueOf();
            return;
        }
        if (!zKWHzl && !zCopydefault) {
            actionBar.djBIcL();
            return;
        }
        if (zKWHzl && !zCopydefault) {
            actionBar.AEQbTJ();
            return;
        }
        if (!zKWHzl && zCopydefault) {
            actionBar.EZpvd();
        } else if (zKWHzl && zCopydefault) {
            actionBar.EZpvd();
        }
    }
}

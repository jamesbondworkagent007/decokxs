package o;

import androidx.core.content.pm.ShortcutManagerCompat;
import com.okinc.core.util.SPUtils;
import com.okinc.debugbox.PandoraInitManager$checkUploadLog$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mKp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C31968mKp {
    public static final C31968mKp KWHzl = new C31968mKp();

    private C31968mKp() {
    }

    public final void AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        if (SPUtils.getBoolean("sp_http_floatwindow_enable", false)) {
            C43292rmY.OLrzqt.gEmmrt(true);
            mJK.showFloatWindow$default(mJK.Companion.EZpvd(), false, 1, null);
        }
        EZpvd(context);
        C54819xWm.KWHzl().AEQbTJ(new StateListAnimator());
    }

    /* JADX INFO: renamed from: o.mKp$StateListAnimator */
    public static final class StateListAnimator implements InterfaceC54816xWj {
        @Override // o.InterfaceC54816xWj
        public void KWHzl() {
        }

        @Override // o.InterfaceC54816xWj
        public void OLrzqt(android.app.Activity activity) {
            pUU.KWHzl("PandoraInitManager", "onAppEnterForegroundIdle");
            C31968mKp.KWHzl.copydefault();
        }
    }

    public final void copydefault() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new PandoraInitManager$checkUploadLog$1(null), 3, null);
    }

    public final void EZpvd() {
        C43282rmO.OLrzqt.EZpvd(new mNR());
    }

    public final void EZpvd(android.content.Context context) {
        if (mOB.AEQbTJ.copydefault() || !SPUtils.contains("id_shortcut_debugger")) {
            return;
        }
        try {
            ShortcutManagerCompat.removeDynamicShortcuts(context, yDY.copydefault("id_shortcut_debugger"));
            SPUtils.remove("id_shortcut_debugger");
            pUU.copydefault("PandoraInitManager", "removeShortcut, success");
        } catch (java.lang.Exception e) {
            pUU.copydefault("PandoraInitManager", "removeShortcut, exception:" + e);
        }
    }
}

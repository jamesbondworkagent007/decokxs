package o;

import com.okinc.business.market.features.floatwindow.DexFloatWindowManager;
import com.okinc.business.market.features.floatwindow.DexFloatWindowTrigger$toggleFloatWindow$1;
import com.okinc.business.market.features.floatwindow.DexFloatWindowTrigger$toggleFloatWindow$2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o.C23274hvD;

/* JADX INFO: renamed from: o.jWw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C26233jWw {
    public static final C26233jWw copydefault = new C26233jWw();

    private C26233jWw() {
    }

    public final boolean copydefault(boolean z) {
        try {
            if (!z) {
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DexFloatWindowTrigger$toggleFloatWindow$2(null), 3, null);
                DexFloatWindowManager.copydefault.fetchVPNInfo();
            } else {
                DexFloatWindowManager dexFloatWindowManager = DexFloatWindowManager.copydefault;
                dexFloatWindowManager.AuCTel();
                DexFloatWindowManager.showFloatWindow$default(dexFloatWindowManager, null, 1, null);
                if (dexFloatWindowManager.getNewProxyInstance()) {
                    C55326xho.toast$default(C23274hvD.Fragment.playFromUri, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new DexFloatWindowTrigger$toggleFloatWindow$1(null), 3, null);
                    C29229kph.KWHzl(false);
                }
            }
            return true;
        } catch (java.lang.Exception e) {
            pUU.AEQbTJ("DexFloatWindowTrigger", "Failed to toggle float window", e);
            return false;
        }
    }

    public final boolean OLrzqt() {
        return DexFloatWindowManager.copydefault.getNewProxyInstance();
    }
}

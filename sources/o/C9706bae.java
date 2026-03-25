package o;

import androidx.fragment.app.FragmentActivity;
import com.okinc.business.deeplink.DexDeeplinkReferralCodeHandler$handleIfNeeded$1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.C9708bag;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9706bae {
    public final xWP AEQbTJ;
    public final C9708bag EZpvd;

    @yCM
    public C9706bae(@NotNull C9708bag c9708bag, @NotNull xWP xwp) {
        Intrinsics.checkNotNullParameter(c9708bag, "");
        Intrinsics.checkNotNullParameter(xwp, "");
        this.EZpvd = c9708bag;
        this.AEQbTJ = xwp;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.bae */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleIfNeeded$default(C9706bae c9706bae, CoroutineScope coroutineScope, FragmentActivity fragmentActivity, java.lang.String str, java.util.Map map, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            map = C56424yEw.KWHzl();
        }
        c9706bae.OLrzqt(coroutineScope, fragmentActivity, str, map);
    }

    public final void OLrzqt(@NotNull CoroutineScope coroutineScope, @NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(coroutineScope, "");
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        C9708bag.TaskDescription taskDescriptionAEQbTJ = this.EZpvd.AEQbTJ(str);
        if (taskDescriptionAEQbTJ == null || taskDescriptionAEQbTJ.copydefault().length() <= 0) {
            return;
        }
        C25389ivm.safeLaunch$default(coroutineScope, null, null, new DexDeeplinkReferralCodeHandler$handleIfNeeded$1(this, fragmentActivity, taskDescriptionAEQbTJ, map, null), 3, null);
    }
}

package o;

import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;
import o.C25493ixk;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.juq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C27421juq implements InterfaceC27423jus {
    public static final C27421juq copydefault = new C27421juq();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27423jus
    public int AEQbTJ() {
        return C25493ixk.StateListAnimator.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27423jus
    public int AYXKKw() {
        return C25493ixk.StateListAnimator.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27423jus
    public int EZpvd() {
        return C52761wXj.TaskDescription.getUriFromString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27423jus
    public int KWHzl() {
        return C52761wXj.TaskDescription.getUriFromString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27423jus
    public int OLrzqt() {
        return C25493ixk.StateListAnimator.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC27423jus
    public int copydefault() {
        return C25493ixk.StateListAnimator.isConnected;
    }

    private C27421juq() {
    }

    @Override // o.InterfaceC27423jus
    public int KWHzl(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return C55366xib.KWHzl(C52761wXj.ActionBar.sVXHln, context);
    }

    @Override // o.InterfaceC27423jus
    public int AEQbTJ(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ColorUtils.setAlphaComponent(KWHzl(context), 51);
    }

    @Override // o.InterfaceC27423jus
    public int EZpvd(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ColorUtils.setAlphaComponent(KWHzl(context), 128);
    }

    @Override // o.InterfaceC27423jus
    public int OLrzqt(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ContextCompat.getColor(context, C25493ixk.TaskDescription.EZpvd);
    }

    @Override // o.InterfaceC27423jus
    public int copydefault(@NotNull android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "");
        return ColorUtils.setAlphaComponent(OLrzqt(context), 128);
    }
}

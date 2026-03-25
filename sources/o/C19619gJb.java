package o;

import androidx.core.graphics.ColorUtils;
import kotlin.jvm.internal.Intrinsics;
import o.C13754dXa;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gJb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C19619gJb implements InterfaceC19621gJd {
    public final java.lang.String AEQbTJ;
    public final android.content.Context KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC19621gJd
    public int EZpvd() {
        return C13754dXa.Activity.DaRZkR;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC19621gJd
    public int KWHzl() {
        return C13754dXa.Activity.OTwTPd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC19621gJd
    public int copydefault() {
        return C13754dXa.Activity.DGgnkA;
    }

    public C19619gJb(@NotNull android.content.Context context, java.lang.String str) {
        Intrinsics.checkNotNullParameter(context, "");
        this.KWHzl = context;
        this.AEQbTJ = str;
    }

    @Override // o.InterfaceC19621gJd
    public int AEQbTJ() {
        if (C33129mqd.AEQbTJ(this.AEQbTJ, 0)) {
            return C33512mxp.tradeRiseDefault$default(C33512mxp.AEQbTJ, this.KWHzl, 0.0f, 2, null);
        }
        if (C33129mqd.OLrzqt((java.lang.Object) this.AEQbTJ, (java.lang.Object) 0)) {
            return this.KWHzl.getColor(C52761wXj.Activity.QwvEab);
        }
        return C33512mxp.tradeFallDefault$default(C33512mxp.AEQbTJ, this.KWHzl, 0.0f, 2, null);
    }

    @Override // o.InterfaceC19621gJd
    public int OLrzqt() {
        return ColorUtils.setAlphaComponent(AEQbTJ(), 128);
    }
}

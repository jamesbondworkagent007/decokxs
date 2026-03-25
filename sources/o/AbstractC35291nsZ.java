package o;

import com.okinc.im.config.serviceprovider.GeneralAction;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC35288nsW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nsZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC35291nsZ implements InterfaceC35288nsW {
    public InterfaceC35289nsX AEQbTJ;
    public C35287nsV OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterfaceC35289nsX EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull C35287nsV c35287nsV, @NotNull InterfaceC35289nsX interfaceC35289nsX) {
        Intrinsics.checkNotNullParameter(c35287nsV, "");
        Intrinsics.checkNotNullParameter(interfaceC35289nsX, "");
        this.OLrzqt = c35287nsV;
        this.AEQbTJ = interfaceC35289nsX;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C35287nsV copydefault() {
        return this.OLrzqt;
    }

    @Override // o.InterfaceC35288nsW
    public java.lang.Integer AEQbTJ() {
        return InterfaceC35288nsW.ActionBar.copydefault(this);
    }

    public void EZpvd(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends GeneralAction> list) {
        InterfaceC35288nsW.ActionBar.AEQbTJ(this, fragment, list);
    }
}

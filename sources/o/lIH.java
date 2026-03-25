package o;

import kotlin.jvm.internal.Intrinsics;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lIH {
    public static final void OLrzqt(@NotNull C54984xbQ c54984xbQ) {
        int iCopydefault;
        Intrinsics.checkNotNullParameter(c54984xbQ, "");
        c54984xbQ.setTextColor(C33070mpX.copydefault(C52761wXj.Activity.fdOvFl));
        C55279xgu c55279xguFARcdN = c54984xbQ.fARcdN();
        if (!c54984xbQ.isEnabled()) {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.UlJrfe);
        } else {
            iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.zuBGHE);
        }
        c55279xguFARcdN.DbNXlk(iCopydefault);
        c55279xguFARcdN.valueOf(c54984xbQ.isSelected() ? 1.5f : 1.0f);
        c55279xguFARcdN.AYXKKw(C33070mpX.copydefault(C52761wXj.Activity.invokespecialODCBUN));
    }
}

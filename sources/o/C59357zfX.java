package o;

import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59353zfT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zfX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59357zfX implements InterfaceC59353zfT {
    public static final C59357zfX AEQbTJ = new C59357zfX();
    public static final java.lang.String KWHzl = "should not have varargs or parameters with default values";

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC59353zfT
    public java.lang.String copydefault() {
        return KWHzl;
    }

    private C59357zfX() {
    }

    @Override // o.InterfaceC59353zfT
    public java.lang.String KWHzl(@NotNull yNG yng) {
        return InterfaceC59353zfT.Activity.EZpvd(this, yng);
    }

    @Override // o.InterfaceC59353zfT
    public boolean EZpvd(@NotNull yNG yng) {
        Intrinsics.checkNotNullParameter(yng, "");
        java.util.List<InterfaceC56695yOx> listFetchVPNInfo = yng.fetchVPNInfo();
        Intrinsics.checkNotNullExpressionValue(listFetchVPNInfo, "");
        if (!(listFetchVPNInfo instanceof java.util.Collection) || !listFetchVPNInfo.isEmpty()) {
            for (InterfaceC56695yOx interfaceC56695yOx : listFetchVPNInfo) {
                Intrinsics.copydefault(interfaceC56695yOx);
                if (yZE.copydefault(interfaceC56695yOx) || interfaceC56695yOx.ejfBZ() != null) {
                    return false;
                }
            }
        }
        return true;
    }
}
